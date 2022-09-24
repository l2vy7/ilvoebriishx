package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9143f4;
import com.google.android.gms.internal.measurement.C9296p4;
import java.util.ArrayList;
import java.util.List;
import p255u5.C11049x;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9948w8 {

    /* renamed from: a */
    C9296p4 f46837a;

    /* renamed from: b */
    List f46838b;

    /* renamed from: c */
    List f46839c;

    /* renamed from: d */
    long f46840d;

    /* renamed from: e */
    final /* synthetic */ C9958x8 f46841e;

    /* synthetic */ C9948w8(C9958x8 x8Var, C11049x xVar) {
        this.f46841e = x8Var;
    }

    /* renamed from: b */
    private static final long m45430b(C9143f4 f4Var) {
        return ((f4Var.mo37553C() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo39255a(long j, C9143f4 f4Var) {
        C4604n.m20098k(f4Var);
        if (this.f46839c == null) {
            this.f46839c = new ArrayList();
        }
        if (this.f46838b == null) {
            this.f46838b = new ArrayList();
        }
        if (this.f46839c.size() > 0 && m45430b((C9143f4) this.f46839c.get(0)) != m45430b(f4Var)) {
            return false;
        }
        long c = this.f46840d + ((long) f4Var.mo37992c());
        this.f46841e.mo39278T();
        if (c >= ((long) Math.max(0, ((Integer) C9903s2.f46694j.mo39174a((Object) null)).intValue()))) {
            return false;
        }
        this.f46840d = c;
        this.f46839c.add(f4Var);
        this.f46838b.add(Long.valueOf(j));
        int size = this.f46839c.size();
        this.f46841e.mo39278T();
        if (size >= Math.max(1, ((Integer) C9903s2.f46696k.mo39174a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
