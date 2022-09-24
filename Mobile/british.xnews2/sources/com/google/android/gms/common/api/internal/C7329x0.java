package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.C7342l;
import com.google.android.gms.common.api.Status;
import p220j4.C10608b;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7329x0 implements C7342l<Status> {

    /* renamed from: a */
    final /* synthetic */ C7305s f29182a;

    /* renamed from: b */
    final /* synthetic */ boolean f29183b;

    /* renamed from: c */
    final /* synthetic */ C7206f f29184c;

    /* renamed from: d */
    final /* synthetic */ C7217a1 f29185d;

    C7329x0(C7217a1 a1Var, C7305s sVar, boolean z, C7206f fVar) {
        this.f29185d = a1Var;
        this.f29182a = sVar;
        this.f29183b = z;
        this.f29184c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29606a(C7341k kVar) {
        Status status = (Status) kVar;
        C10608b.m48359b(this.f29185d.f28942f).mo42729i();
        if (status.mo29735G0() && this.f29185d.mo29814s()) {
            C7217a1 a1Var = this.f29185d;
            a1Var.mo29771g();
            a1Var.mo29770f();
        }
        this.f29182a.mo29791i(status);
        if (this.f29183b) {
            this.f29184c.mo29771g();
        }
    }
}
