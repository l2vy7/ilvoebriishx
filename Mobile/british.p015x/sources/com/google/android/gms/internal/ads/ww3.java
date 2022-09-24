package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ww3 implements n54, g24 {

    /* renamed from: b */
    private final yw3 f40946b;

    /* renamed from: c */
    private m54 f40947c;

    /* renamed from: d */
    private f24 f40948d;

    /* renamed from: e */
    final /* synthetic */ ax3 f40949e;

    public ww3(ax3 ax3, yw3 yw3) {
        this.f40949e = ax3;
        this.f40947c = ax3.f29813e;
        this.f40948d = ax3.f29814f;
        this.f40946b = yw3;
    }

    /* renamed from: a */
    private final boolean m39283a(int i, c54 c54) {
        c54 c542 = null;
        if (c54 != null) {
            yw3 yw3 = this.f40946b;
            int i2 = 0;
            while (true) {
                if (i2 >= yw3.f42018c.size()) {
                    break;
                } else if (yw3.f42018c.get(i2).f34477d == c54.f34477d) {
                    c542 = c54.mo30857c(Pair.create(yw3.f42017b, c54.f34474a));
                    break;
                } else {
                    i2++;
                }
            }
            if (c542 == null) {
                return false;
            }
        }
        int i3 = i + this.f40946b.f42019d;
        m54 m54 = this.f40947c;
        if (m54.f35410a != i3 || !d13.m20317p(m54.f35411b, c542)) {
            this.f40947c = this.f40949e.f29813e.mo33481a(i3, c542, 0);
        }
        f24 f24 = this.f40948d;
        if (f24.f31593a == i3 && d13.m20317p(f24.f31594b, c542)) {
            return true;
        }
        this.f40948d = this.f40949e.f29814f.mo31714a(i3, c542);
        return true;
    }

    /* renamed from: A */
    public final void mo18015A(int i, c54 c54, u44 u44, z44 z44) {
        if (m39283a(i, c54)) {
            this.f40947c.mo33487g(u44, z44);
        }
    }

    /* renamed from: G */
    public final void mo18021G(int i, c54 c54, u44 u44, z44 z44) {
        if (m39283a(i, c54)) {
            this.f40947c.mo33491k(u44, z44);
        }
    }

    /* renamed from: J */
    public final void mo18024J(int i, c54 c54, u44 u44, z44 z44, IOException iOException, boolean z) {
        if (m39283a(i, c54)) {
            this.f40947c.mo33489i(u44, z44, iOException, z);
        }
    }

    /* renamed from: N */
    public final void mo18028N(int i, c54 c54, z44 z44) {
        if (m39283a(i, c54)) {
            this.f40947c.mo33483c(z44);
        }
    }

    /* renamed from: v */
    public final void mo18065v(int i, c54 c54, u44 u44, z44 z44) {
        if (m39283a(i, c54)) {
            this.f40947c.mo33485e(u44, z44);
        }
    }
}
