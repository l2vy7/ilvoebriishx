package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final /* synthetic */ class C9740c8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9750d8 f46202b;

    public /* synthetic */ C9740c8(C9750d8 d8Var) {
        this.f46202b = d8Var;
    }

    public final void run() {
        C9750d8 d8Var = this.f46202b;
        C9760e8 e8Var = d8Var.f46222d;
        long j = d8Var.f46220b;
        long j2 = d8Var.f46221c;
        e8Var.f46242b.mo19272b();
        e8Var.f46242b.f21269a.mo19276j().mo19281p().mo38856a("Application going to the background");
        e8Var.f46242b.f21269a.mo19365F().f21341q.mo39051a(true);
        Bundle bundle = new Bundle();
        if (!e8Var.f46242b.f21269a.mo19392z().mo19339D()) {
            e8Var.f46242b.f46391e.mo38964b(j2);
            e8Var.f46242b.f46391e.mo38966d(false, false, j2);
        }
        e8Var.f46242b.f21269a.mo19367I().mo38957v(TtmlNode.TEXT_EMPHASIS_AUTO, "_ab", j, bundle);
    }
}
