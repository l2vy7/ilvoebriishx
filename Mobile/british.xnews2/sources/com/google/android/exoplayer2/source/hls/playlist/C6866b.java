package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6866b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DefaultHlsPlaylistTracker.MediaPlaylistBundle f27553b;

    /* renamed from: c */
    public final /* synthetic */ Uri f27554c;

    public /* synthetic */ C6866b(DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle, Uri uri) {
        this.f27553b = mediaPlaylistBundle;
        this.f27554c = uri;
    }

    public final void run() {
        this.f27553b.lambda$loadPlaylistInternal$0(this.f27554c);
    }
}
