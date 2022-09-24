package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import com.google.android.exoplayer2.C6540C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ia4 {

    /* renamed from: a */
    private final w94 f33171a = new w94();

    /* renamed from: b */
    private final da4 f33172b;

    /* renamed from: c */
    private final ha4 f33173c;

    /* renamed from: d */
    private boolean f33174d;

    /* renamed from: e */
    private Surface f33175e;

    /* renamed from: f */
    private float f33176f;

    /* renamed from: g */
    private float f33177g;

    /* renamed from: h */
    private float f33178h;

    /* renamed from: i */
    private float f33179i;

    /* renamed from: j */
    private int f33180j;

    /* renamed from: k */
    private long f33181k;

    /* renamed from: l */
    private long f33182l;

    /* renamed from: m */
    private long f33183m;

    /* renamed from: n */
    private long f33184n;

    /* renamed from: o */
    private long f33185o;

    /* renamed from: p */
    private long f33186p;

    /* renamed from: q */
    private long f33187q;

    public ia4(Context context) {
        da4 da4;
        ha4 ha4 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            da4 = d13.f20195a >= 17 ? ga4.m32386b(applicationContext) : null;
            if (da4 == null) {
                da4 = fa4.m32098b(applicationContext);
            }
        } else {
            da4 = null;
        }
        this.f33172b = da4;
        this.f33173c = da4 != null ? ha4.m32845a() : ha4;
        this.f33181k = C6540C.TIME_UNSET;
        this.f33182l = C6540C.TIME_UNSET;
        this.f33176f = -1.0f;
        this.f33179i = 1.0f;
        this.f33180j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m33141b(ia4 ia4, Display display) {
        if (display != null) {
            double refreshRate = (double) display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            ia4.f33181k = j;
            ia4.f33182l = (j * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        ia4.f33181k = C6540C.TIME_UNSET;
        ia4.f33182l = C6540C.TIME_UNSET;
    }

    /* renamed from: m */
    private final void m33142m() {
        Surface surface;
        if (d13.f20195a >= 30 && (surface = this.f33175e) != null && this.f33180j != Integer.MIN_VALUE && this.f33178h != 0.0f) {
            this.f33178h = 0.0f;
            ca4.m30938a(surface, 0.0f);
        }
    }

    /* renamed from: n */
    private final void m33143n() {
        this.f33183m = 0;
        this.f33186p = -1;
        this.f33184n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.f33177g) >= r2) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r9.f33171a.mo35599b() >= 30) goto L_0x0066;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m33144o() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.d13.f20195a
            r1 = 30
            if (r0 < r1) goto L_0x006f
            android.view.Surface r0 = r9.f33175e
            if (r0 != 0) goto L_0x000b
            goto L_0x006f
        L_0x000b:
            com.google.android.gms.internal.ads.w94 r0 = r9.f33171a
            boolean r0 = r0.mo35604g()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.w94 r0 = r9.f33171a
            float r0 = r0.mo35598a()
            goto L_0x001c
        L_0x001a:
            float r0 = r9.f33176f
        L_0x001c:
            float r2 = r9.f33177g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.w94 r1 = r9.f33171a
            boolean r1 = r1.mo35604g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.w94 r1 = r9.f33171a
            long r5 = r1.mo35601d()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r9.f33177g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0065
            goto L_0x0066
        L_0x0058:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006a
            com.google.android.gms.internal.ads.w94 r2 = r9.f33171a
            int r2 = r2.mo35599b()
            if (r2 < r1) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            return
        L_0x006a:
            r9.f33177g = r0
            r9.m33145p(r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ia4.m33144o():void");
    }

    /* renamed from: p */
    private final void m33145p(boolean z) {
        Surface surface;
        if (d13.f20195a >= 30 && (surface = this.f33175e) != null && this.f33180j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f33174d) {
                float f2 = this.f33177g;
                if (f2 != -1.0f) {
                    f = this.f33179i * f2;
                }
            }
            if (z || this.f33178h != f) {
                this.f33178h = f;
                ca4.m30938a(surface, f);
            }
        }
    }

    /* renamed from: a */
    public final long mo32583a(long j) {
        long j2;
        if (this.f33186p != -1 && this.f33171a.mo35604g()) {
            long c = this.f33187q + ((long) (((float) (this.f33171a.mo35600c() * (this.f33183m - this.f33186p))) / this.f33179i));
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                m33143n();
            }
        }
        this.f33184n = this.f33183m;
        this.f33185o = j;
        ha4 ha4 = this.f33173c;
        if (ha4 == null || this.f33181k == C6540C.TIME_UNSET) {
            return j;
        }
        long j3 = ha4.f32693b;
        if (j3 == C6540C.TIME_UNSET) {
            return j;
        }
        long j4 = this.f33181k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            long j6 = j5;
            j5 = j4 + j5;
            j2 = j6;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f33182l;
    }

    /* renamed from: c */
    public final void mo32584c() {
        da4 da4 = this.f33172b;
        if (da4 != null) {
            da4.zza();
            ha4 ha4 = this.f33173c;
            Objects.requireNonNull(ha4);
            ha4.mo32377c();
        }
    }

    /* renamed from: d */
    public final void mo32585d() {
        if (this.f33172b != null) {
            ha4 ha4 = this.f33173c;
            Objects.requireNonNull(ha4);
            ha4.mo32376b();
            this.f33172b.mo31192a(new ba4(this));
        }
    }

    /* renamed from: e */
    public final void mo32586e(float f) {
        this.f33176f = f;
        this.f33171a.mo35603f();
        m33144o();
    }

    /* renamed from: f */
    public final void mo32587f(long j) {
        long j2 = this.f33184n;
        if (j2 != -1) {
            this.f33186p = j2;
            this.f33187q = this.f33185o;
        }
        this.f33183m++;
        this.f33171a.mo35602e(j * 1000);
        m33144o();
    }

    /* renamed from: g */
    public final void mo32588g(float f) {
        this.f33179i = f;
        m33143n();
        m33145p(false);
    }

    /* renamed from: h */
    public final void mo32589h() {
        m33143n();
    }

    /* renamed from: i */
    public final void mo32590i() {
        this.f33174d = true;
        m33143n();
        m33145p(false);
    }

    /* renamed from: j */
    public final void mo32591j() {
        this.f33174d = false;
        m33142m();
    }

    /* renamed from: k */
    public final void mo32592k(Surface surface) {
        if (true == (surface instanceof zzuq)) {
            surface = null;
        }
        if (this.f33175e != surface) {
            m33142m();
            this.f33175e = surface;
            m33145p(true);
        }
    }

    /* renamed from: l */
    public final void mo32593l(int i) {
        if (this.f33180j != i) {
            this.f33180j = i;
            m33145p(true);
        }
    }
}
