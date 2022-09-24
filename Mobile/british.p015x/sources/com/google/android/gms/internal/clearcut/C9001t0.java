package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.t0 */
final class C9001t0 extends C8994s0<C8891f1.C8895d> {
    C9001t0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo37137a(Map.Entry<?, ?> entry) {
        return ((C8891f1.C8895d) entry.getKey()).f44516b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9022w0<C8891f1.C8895d> mo37138b(Object obj) {
        return ((C8891f1.C8894c) obj).zzjv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo37139c(C8977p4 p4Var, Map.Entry<?, ?> entry) throws IOException {
        C8891f1.C8895d dVar = (C8891f1.C8895d) entry.getKey();
        switch (C9008u0.f44747a[dVar.f44517c.ordinal()]) {
            case 1:
                p4Var.mo37082p(dVar.f44516b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                p4Var.mo37083q(dVar.f44516b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                p4Var.mo37068a(dVar.f44516b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                p4Var.zza(dVar.f44516b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                p4Var.mo37057E(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                p4Var.mo37075i(dVar.f44516b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                p4Var.mo37061I(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                p4Var.mo37055C(dVar.f44516b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                p4Var.mo37066N(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                p4Var.mo37091y(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                p4Var.mo37070c(dVar.f44516b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                p4Var.mo37067O(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                p4Var.mo37072f(dVar.f44516b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                p4Var.mo37057E(dVar.f44516b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                p4Var.mo37060H(dVar.f44516b, (C8847a0) entry.getValue());
                return;
            case 16:
                p4Var.mo37069b(dVar.f44516b, (String) entry.getValue());
                return;
            case 17:
                p4Var.mo37064L(dVar.f44516b, entry.getValue(), C9031x2.m42488a().mo37226b(entry.getValue().getClass()));
                return;
            case 18:
                p4Var.mo37062J(dVar.f44516b, entry.getValue(), C9031x2.m42488a().mo37226b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo37140d(Object obj, C9022w0<C8891f1.C8895d> w0Var) {
        ((C8891f1.C8894c) obj).zzjv = w0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C9022w0<C8891f1.C8895d> mo37141e(Object obj) {
        C9022w0<C8891f1.C8895d> b = mo37138b(obj);
        if (!b.mo37208c()) {
            return b;
        }
        C9022w0<C8891f1.C8895d> w0Var = (C9022w0) b.clone();
        mo37140d(obj, w0Var);
        return w0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo37142f(Object obj) {
        mo37138b(obj).mo37217t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo37143g(C8942l2 l2Var) {
        return l2Var instanceof C8891f1.C8894c;
    }
}
