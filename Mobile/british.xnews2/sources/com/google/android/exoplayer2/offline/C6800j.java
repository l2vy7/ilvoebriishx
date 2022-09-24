package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.offline.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6800j implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ DownloadManager f27495b;

    public /* synthetic */ C6800j(DownloadManager downloadManager) {
        this.f27495b = downloadManager;
    }

    public final boolean handleMessage(Message message) {
        return this.f27495b.handleMainMessage(message);
    }
}
