package com.google.android.exoplayer2.offline;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.offline.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6798h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DownloadHelper f27492b;

    /* renamed from: c */
    public final /* synthetic */ IOException f27493c;

    public /* synthetic */ C6798h(DownloadHelper downloadHelper, IOException iOException) {
        this.f27492b = downloadHelper;
        this.f27493c = iOException;
    }

    public final void run() {
        this.f27492b.lambda$onMediaPreparationFailed$5(this.f27493c);
    }
}
