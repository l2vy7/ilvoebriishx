package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.ListenerSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.util.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7011b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CopyOnWriteArraySet f27670b;

    /* renamed from: c */
    public final /* synthetic */ int f27671c;

    /* renamed from: d */
    public final /* synthetic */ ListenerSet.Event f27672d;

    public /* synthetic */ C7011b(CopyOnWriteArraySet copyOnWriteArraySet, int i, ListenerSet.Event event) {
        this.f27670b = copyOnWriteArraySet;
        this.f27671c = i;
        this.f27672d = event;
    }

    public final void run() {
        ListenerSet.lambda$queueEvent$0(this.f27670b, this.f27671c, this.f27672d);
    }
}
