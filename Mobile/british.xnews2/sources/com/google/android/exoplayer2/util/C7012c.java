package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.NetworkTypeObserver;

/* renamed from: com.google.android.exoplayer2.util.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7012c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ NetworkTypeObserver f27673b;

    /* renamed from: c */
    public final /* synthetic */ NetworkTypeObserver.Listener f27674c;

    public /* synthetic */ C7012c(NetworkTypeObserver networkTypeObserver, NetworkTypeObserver.Listener listener) {
        this.f27673b = networkTypeObserver;
        this.f27674c = listener;
    }

    public final void run() {
        this.f27673b.lambda$register$0(this.f27674c);
    }
}
