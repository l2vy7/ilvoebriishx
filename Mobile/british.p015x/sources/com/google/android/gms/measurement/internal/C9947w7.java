package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C9947w7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9977z7 f46833b;

    /* renamed from: c */
    public final /* synthetic */ int f46834c;

    /* renamed from: d */
    public final /* synthetic */ C4667d3 f46835d;

    /* renamed from: e */
    public final /* synthetic */ Intent f46836e;

    public /* synthetic */ C9947w7(C9977z7 z7Var, int i, C4667d3 d3Var, Intent intent) {
        this.f46833b = z7Var;
        this.f46834c = i;
        this.f46835d = d3Var;
        this.f46836e = intent;
    }

    public final void run() {
        this.f46833b.mo39332c(this.f46834c, this.f46835d, this.f46836e);
    }
}
