package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class ProgressiveDownloader implements Downloader {
    /* access modifiers changed from: private */
    public final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final PriorityTaskManager priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    @Deprecated
    public ProgressiveDownloader(Uri uri, String str, CacheDataSource.Factory factory) {
        this(uri, str, factory, C6791a.f27485b);
    }

    /* access modifiers changed from: private */
    public void onProgress(long j, long j2, long j3) {
        Downloader.ProgressListener progressListener2 = this.progressListener;
        if (progressListener2 != null) {
            progressListener2.onProgress(j, j2, (j == -1 || j == 0) ? -1.0f : (((float) j2) * 100.0f) / ((float) j));
        }
    }

    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    public void download(Downloader.ProgressListener progressListener2) throws IOException, InterruptedException {
        this.progressListener = progressListener2;
        this.downloadRunnable = new RunnableFutureTask<Void, IOException>() {
            /* access modifiers changed from: protected */
            public void cancelWork() {
                ProgressiveDownloader.this.cacheWriter.cancel();
            }

            /* access modifiers changed from: protected */
            public Void doWork() throws IOException {
                ProgressiveDownloader.this.cacheWriter.cache();
                return null;
            }
        };
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.add(-1000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.isCanceled) {
                    break;
                }
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.proceed(-1000);
                }
                this.executor.execute(this.downloadRunnable);
                this.downloadRunnable.get();
                z = true;
            } catch (ExecutionException e) {
                Throwable th = (Throwable) Assertions.checkNotNull(e.getCause());
                if (!(th instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (!(th instanceof IOException)) {
                        Util.sneakyThrow(th);
                    } else {
                        throw ((IOException) th);
                    }
                }
            } catch (Throwable th2) {
                this.downloadRunnable.blockUntilFinished();
                PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
                if (priorityTaskManager4 != null) {
                    priorityTaskManager4.remove(-1000);
                }
                throw th2;
            }
        }
        this.downloadRunnable.blockUntilFinished();
        PriorityTaskManager priorityTaskManager5 = this.priorityTaskManager;
        if (priorityTaskManager5 != null) {
            priorityTaskManager5.remove(-1000);
        }
    }

    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, (Executor) C6791a.f27485b);
    }

    @Deprecated
    public ProgressiveDownloader(Uri uri, String str, CacheDataSource.Factory factory, Executor executor2) {
        this(new MediaItem.Builder().setUri(uri).setCustomCacheKey(str).build(), factory, executor2);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor2) {
        this.executor = (Executor) Assertions.checkNotNull(executor2);
        Assertions.checkNotNull(mediaItem.playbackProperties);
        DataSpec build = new DataSpec.Builder().setUri(mediaItem.playbackProperties.uri).setKey(mediaItem.playbackProperties.customCacheKey).setFlags(4).build();
        this.dataSpec = build;
        CacheDataSource createDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = createDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(createDataSourceForDownloading, build, (byte[]) null, new C6806p(this));
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }
}
