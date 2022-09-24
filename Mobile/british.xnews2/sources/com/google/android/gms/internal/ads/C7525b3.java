package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;

/* renamed from: com.google.android.gms.internal.ads.b3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7525b3 {

    /* renamed from: a */
    private final ad4 f29878a;

    /* renamed from: b */
    private long f29879b;

    /* renamed from: c */
    private boolean f29880c;

    /* renamed from: d */
    private int f29881d;

    /* renamed from: e */
    private long f29882e;

    /* renamed from: f */
    private boolean f29883f;

    /* renamed from: g */
    private boolean f29884g;

    /* renamed from: h */
    private boolean f29885h;

    /* renamed from: i */
    private boolean f29886i;

    /* renamed from: j */
    private boolean f29887j;

    /* renamed from: k */
    private long f29888k;

    /* renamed from: l */
    private long f29889l;

    /* renamed from: m */
    private boolean f29890m;

    public C7525b3(ad4 ad4) {
        this.f29878a = ad4;
    }

    /* renamed from: e */
    private final void m30590e(int i) {
        long j = this.f29889l;
        if (j != C6540C.TIME_UNSET) {
            boolean z = this.f29890m;
            long j2 = this.f29879b;
            long j3 = this.f29888k;
            this.f29878a.mo30358e(j, z ? 1 : 0, (int) (j2 - j3), i, (zc4) null);
        }
    }

    /* renamed from: a */
    public final void mo30610a(long j, int i, boolean z) {
        if (this.f29887j && this.f29884g) {
            this.f29890m = this.f29880c;
            this.f29887j = false;
        } else if (this.f29885h || this.f29884g) {
            if (z && this.f29886i) {
                m30590e(i + ((int) (j - this.f29879b)));
            }
            this.f29888k = this.f29879b;
            this.f29889l = this.f29882e;
            this.f29890m = this.f29880c;
            this.f29886i = true;
        }
    }

    /* renamed from: b */
    public final void mo30611b(byte[] bArr, int i, int i2) {
        if (this.f29883f) {
            int i3 = this.f29881d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f29884g = (bArr[i4] & C12425x3.f55111d) != 0;
                this.f29883f = false;
                return;
            }
            this.f29881d = i3 + (i2 - i);
        }
    }

    /* renamed from: c */
    public final void mo30612c() {
        this.f29883f = false;
        this.f29884g = false;
        this.f29885h = false;
        this.f29886i = false;
        this.f29887j = false;
    }

    /* renamed from: d */
    public final void mo30613d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f29884g = false;
        this.f29885h = false;
        this.f29882e = j2;
        this.f29881d = 0;
        this.f29879b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f29886i && !this.f29887j) {
                if (z) {
                    m30590e(i);
                }
                this.f29886i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f29885h = !this.f29887j;
                this.f29887j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f29880c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f29883f = z2;
    }
}
