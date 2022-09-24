package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l44 implements n54, g24 {

    /* renamed from: b */
    private final Object f34902b;

    /* renamed from: c */
    private m54 f34903c;

    /* renamed from: d */
    private f24 f34904d;

    /* renamed from: e */
    final /* synthetic */ n44 f34905e;

    public l44(n44 n44, Object obj) {
        this.f34905e = n44;
        this.f34903c = n44.mo31765p((c54) null);
        this.f34904d = n44.mo31763n((c54) null);
        this.f34902b = obj;
    }

    /* renamed from: a */
    private final boolean m34345a(int i, c54 c54) {
        c54 c542;
        if (c54 != null) {
            c542 = this.f34905e.mo18991x(this.f34902b, c54);
            if (c542 == null) {
                return false;
            }
        } else {
            c542 = null;
        }
        m54 m54 = this.f34903c;
        if (m54.f35410a != i || !d13.m20317p(m54.f35411b, c542)) {
            this.f34903c = this.f34905e.mo31766q(i, c542, 0);
        }
        f24 f24 = this.f34904d;
        if (f24.f31593a == i && d13.m20317p(f24.f31594b, c542)) {
            return true;
        }
        this.f34904d = this.f34905e.mo31764o(i, c542);
        return true;
    }

    /* renamed from: A */
    public final void mo18015A(int i, c54 c54, u44 u44, z44 z44) {
        if (m34345a(i, c54)) {
            this.f34903c.mo33487g(u44, z44);
        }
    }

    /* renamed from: G */
    public final void mo18021G(int i, c54 c54, u44 u44, z44 z44) {
        if (m34345a(i, c54)) {
            this.f34903c.mo33491k(u44, z44);
        }
    }

    /* renamed from: J */
    public final void mo18024J(int i, c54 c54, u44 u44, z44 z44, IOException iOException, boolean z) {
        if (m34345a(i, c54)) {
            this.f34903c.mo33489i(u44, z44, iOException, z);
        }
    }

    /* renamed from: N */
    public final void mo18028N(int i, c54 c54, z44 z44) {
        if (m34345a(i, c54)) {
            this.f34903c.mo33483c(z44);
        }
    }

    /* renamed from: v */
    public final void mo18065v(int i, c54 c54, u44 u44, z44 z44) {
        if (m34345a(i, c54)) {
            this.f34903c.mo33485e(u44, z44);
        }
    }
}
