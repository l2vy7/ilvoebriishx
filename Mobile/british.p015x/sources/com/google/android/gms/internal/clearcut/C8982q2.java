package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.q2 */
final class C8982q2<T> implements C8870c3<T> {

    /* renamed from: a */
    private final C8942l2 f44722a;

    /* renamed from: b */
    private final C9011u3<?, ?> f44723b;

    /* renamed from: c */
    private final boolean f44724c;

    /* renamed from: d */
    private final C8994s0<?> f44725d;

    private C8982q2(C9011u3<?, ?> u3Var, C8994s0<?> s0Var, C8942l2 l2Var) {
        this.f44723b = u3Var;
        this.f44724c = s0Var.mo37143g(l2Var);
        this.f44725d = s0Var;
        this.f44722a = l2Var;
    }

    /* renamed from: d */
    static <T> C8982q2<T> m42276d(C9011u3<?, ?> u3Var, C8994s0<?> s0Var, C8942l2 l2Var) {
        return new C8982q2<>(u3Var, s0Var, l2Var);
    }

    /* renamed from: a */
    public final boolean mo36859a(T t, T t2) {
        if (!this.f44723b.mo37181k(t).equals(this.f44723b.mo37181k(t2))) {
            return false;
        }
        if (this.f44724c) {
            return this.f44725d.mo37138b(t).equals(this.f44725d.mo37138b(t2));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo36860b(T t, T t2) {
        C8887e3.m41725i(this.f44723b, t, t2);
        if (this.f44724c) {
            C8887e3.m41723g(this.f44725d, t, t2);
        }
    }

    /* renamed from: c */
    public final T mo36861c() {
        return this.f44722a.mo36894d().mo36909q();
    }

    /* renamed from: e */
    public final boolean mo36862e(T t) {
        return this.f44725d.mo37138b(t).mo37210d();
    }

    /* renamed from: f */
    public final int mo36863f(T t) {
        int hashCode = this.f44723b.mo37181k(t).hashCode();
        return this.f44724c ? (hashCode * 53) + this.f44725d.mo37138b(t).hashCode() : hashCode;
    }

    /* renamed from: g */
    public final void mo36864g(T t, C8977p4 p4Var) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.f44725d.mo37138b(t).mo37211e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            C9043z0 z0Var = (C9043z0) next.getKey();
            if (z0Var.mo36911f() != C8970o4.MESSAGE || z0Var.mo36912g() || z0Var.mo36916v()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            p4Var.mo37076j(z0Var.zzc(), next instanceof C8981q1 ? ((C8981q1) next).mo37117a().mo37146d() : next.getValue());
        }
        C9011u3<?, ?> u3Var = this.f44723b;
        u3Var.mo37175e(u3Var.mo37181k(t), p4Var);
    }

    /* renamed from: h */
    public final int mo36865h(T t) {
        C9011u3<?, ?> u3Var = this.f44723b;
        int l = u3Var.mo37182l(u3Var.mo37181k(t)) + 0;
        return this.f44724c ? l + this.f44725d.mo37138b(t).mo37216m() : l;
    }

    /* renamed from: i */
    public final void mo36866i(T t) {
        this.f44723b.mo37174d(t);
        this.f44725d.mo37142f(t);
    }

    /* renamed from: j */
    public final void mo36867j(T t, byte[] bArr, int i, int i2, C9021w wVar) throws IOException {
        C8891f1 f1Var = (C8891f1) t;
        C9018v3 v3Var = f1Var.zzjp;
        if (v3Var == C9018v3.m42416h()) {
            v3Var = C9018v3.m42417i();
            f1Var.zzjp = v3Var;
        }
        C9018v3 v3Var2 = v3Var;
        while (i < i2) {
            int e = C9014v.m42397e(bArr, i, wVar);
            int i3 = wVar.f44768a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? C9014v.m42395c(i3, bArr, e, i2, v3Var2, wVar) : C9014v.m42393a(i3, bArr, e, i2, wVar);
            } else {
                int i4 = 0;
                C8847a0 a0Var = null;
                while (e < i2) {
                    e = C9014v.m42397e(bArr, e, wVar);
                    int i5 = wVar.f44768a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            e = C9014v.m42405m(bArr, e, wVar);
                            a0Var = (C8847a0) wVar.f44770c;
                        }
                    } else if (i7 == 0) {
                        e = C9014v.m42397e(bArr, e, wVar);
                        i4 = wVar.f44768a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    e = C9014v.m42393a(i5, bArr, e, i2, wVar);
                }
                if (a0Var != null) {
                    v3Var2.mo37195e((i4 << 3) | 2, a0Var);
                }
                i = e;
            }
        }
        if (i != i2) {
            throw C8941l1.m41912d();
        }
    }
}
