package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6868j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27559b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27560c;

    /* renamed from: d */
    public final /* synthetic */ LoadEventInfo f27561d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f27562e;

    /* renamed from: f */
    public final /* synthetic */ IOException f27563f;

    /* renamed from: g */
    public final /* synthetic */ boolean f27564g;

    public /* synthetic */ C6868j(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f27559b = eventDispatcher;
        this.f27560c = mediaSourceEventListener;
        this.f27561d = loadEventInfo;
        this.f27562e = mediaLoadData;
        this.f27563f = iOException;
        this.f27564g = z;
    }

    public final void run() {
        this.f27559b.lambda$loadError$3(this.f27560c, this.f27561d, this.f27562e, this.f27563f, this.f27564g);
    }
}
