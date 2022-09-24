package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;

/* renamed from: com.google.android.exoplayer2.offline.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6793c implements MetadataOutput {

    /* renamed from: b */
    public static final /* synthetic */ C6793c f27486b = new C6793c();

    private /* synthetic */ C6793c() {
    }

    public final void onMetadata(Metadata metadata) {
        DownloadHelper.lambda$getRendererCapabilities$1(metadata);
    }
}
