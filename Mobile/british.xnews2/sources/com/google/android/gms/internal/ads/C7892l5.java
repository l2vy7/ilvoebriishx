package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.l5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7892l5 {

    /* renamed from: a */
    private final Executor f34906a;

    public C7892l5(Handler handler) {
        this.f34906a = new C7819j5(this, handler);
    }

    /* renamed from: a */
    public final void mo33280a(C8215u5<?> u5Var, C7635e6 e6Var) {
        u5Var.zzm("post-error");
        C7492a6 a = C7492a6.m30245a(e6Var);
        Executor executor = this.f34906a;
        ((C7819j5) executor).f33773b.post(new C7855k5(u5Var, a, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo33281b(C8215u5<?> u5Var, C7492a6<?> a6Var, Runnable runnable) {
        u5Var.zzq();
        u5Var.zzm("post-response");
        Executor executor = this.f34906a;
        ((C7819j5) executor).f33773b.post(new C7855k5(u5Var, a6Var, runnable));
    }
}
