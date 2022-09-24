package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6865a implements HlsPlaylistTracker.Factory {

    /* renamed from: a */
    public static final /* synthetic */ C6865a f27552a = new C6865a();

    private /* synthetic */ C6865a() {
    }

    public final HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
    }
}
