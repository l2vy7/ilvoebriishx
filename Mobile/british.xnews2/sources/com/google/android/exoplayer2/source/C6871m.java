package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.m */
/* compiled from: MediaSourceFactory */
public final /* synthetic */ class C6871m {
    @Deprecated
    /* renamed from: a */
    public static MediaSource m28652a(MediaSourceFactory mediaSourceFactory, Uri uri) {
        return mediaSourceFactory.createMediaSource(MediaItem.fromUri(uri));
    }

    @Deprecated
    /* renamed from: b */
    public static MediaSourceFactory m28653b(MediaSourceFactory mediaSourceFactory, List list) {
        return mediaSourceFactory;
    }
}
