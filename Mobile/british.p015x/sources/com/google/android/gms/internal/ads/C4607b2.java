package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.b2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class C4607b2 {

    /* renamed from: a */
    private final C8175t1 f20114a = new C8175t1();

    /* renamed from: b */
    private ad4 f20115b;

    /* renamed from: c */
    private yb4 f20116c;

    /* renamed from: d */
    private C8248v1 f20117d;

    /* renamed from: e */
    private long f20118e;

    /* renamed from: f */
    private long f20119f;

    /* renamed from: g */
    private long f20120g;

    /* renamed from: h */
    private int f20121h;

    /* renamed from: i */
    private int f20122i;

    /* renamed from: j */
    private C8318x1 f20123j = new C8318x1();

    /* renamed from: k */
    private long f20124k;

    /* renamed from: l */
    private boolean f20125l;

    /* renamed from: m */
    private boolean f20126m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo18108a(uq2 uq2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18109b(boolean z) {
        int i;
        if (z) {
            this.f20123j = new C8318x1();
            this.f20119f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f20121h = i;
        this.f20118e = -1;
        this.f20120g = 0;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public abstract boolean mo18110c(uq2 uq2, long j, C8318x1 x1Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo18111d(wb4 wb4, tc4 tc4) throws IOException {
        wb4 wb42 = wb4;
        nu1.m20743b(this.f20115b);
        int i = d13.f20195a;
        int i2 = this.f20121h;
        if (i2 == 0) {
            while (this.f20114a.mo34848e(wb42)) {
                this.f20124k = wb4.zze() - this.f20119f;
                if (mo18110c(this.f20114a.mo34844a(), this.f20119f, this.f20123j)) {
                    this.f20119f = wb4.zze();
                } else {
                    C8281w wVar = this.f20123j.f40980a;
                    this.f20122i = wVar.f40633z;
                    if (!this.f20126m) {
                        this.f20115b.mo30354a(wVar);
                        this.f20126m = true;
                    }
                    C8248v1 v1Var = this.f20123j.f40981b;
                    if (v1Var != null) {
                        this.f20117d = v1Var;
                    } else if (wb4.zzc() == -1) {
                        this.f20117d = new C7489a2((C8390z1) null);
                    } else {
                        C8211u1 b = this.f20114a.mo34845b();
                        this.f20117d = new C7999o1(this, this.f20119f, wb4.zzc(), (long) (b.f39711d + b.f39712e), b.f39709b, (b.f39708a & 4) != 0);
                    }
                    this.f20121h = 2;
                    this.f20114a.mo34847d();
                    return 0;
                }
            }
            this.f20121h = 3;
            return -1;
        } else if (i2 == 1) {
            ((qb4) wb42).mo34305k((int) this.f20119f, false);
            this.f20121h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long a = this.f20117d.mo30290a(wb42);
            if (a >= 0) {
                tc4.f39386a = a;
                return 1;
            }
            if (a < -1) {
                mo18115h(-(a + 2));
            }
            if (!this.f20125l) {
                wc4 zze = this.f20117d.zze();
                nu1.m20743b(zze);
                this.f20116c.mo18210l(zze);
                this.f20125l = true;
            }
            if (this.f20124k > 0 || this.f20114a.mo34848e(wb42)) {
                this.f20124k = 0;
                uq2 a2 = this.f20114a.mo34844a();
                long a3 = mo18108a(a2);
                if (a3 >= 0) {
                    long j = this.f20120g;
                    if (j + a3 >= this.f20118e) {
                        long e = mo18112e(j);
                        yc4.m39857b(this.f20115b, a2, a2.mo35242l());
                        this.f20115b.mo30358e(e, 1, a2.mo35242l(), 0, (zc4) null);
                        this.f20118e = -1;
                    }
                }
                this.f20120g += a3;
                return 0;
            }
            this.f20121h = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo18112e(long j) {
        return (j * 1000000) / ((long) this.f20122i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18113f(long j) {
        return (((long) this.f20122i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo18114g(yb4 yb4, ad4 ad4) {
        this.f20116c = yb4;
        this.f20115b = ad4;
        mo18109b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18115h(long j) {
        this.f20120g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo18116i(long j, long j2) {
        this.f20114a.mo34846c();
        if (j == 0) {
            mo18109b(!this.f20125l);
        } else if (this.f20121h != 0) {
            long f = mo18113f(j2);
            this.f20118e = f;
            C8248v1 v1Var = this.f20117d;
            int i = d13.f20195a;
            v1Var.mo30291b(f);
            this.f20121h = 2;
        }
    }
}
