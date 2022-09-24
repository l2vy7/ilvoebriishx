package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.and */
/* compiled from: IMASDK */
public final class and {

    /* renamed from: a */
    private final amu f15408a = new amu();

    /* renamed from: b */
    private final WindowManager f15409b;

    /* renamed from: c */
    private final anc f15410c;

    /* renamed from: d */
    private final anb f15411d;

    /* renamed from: e */
    private boolean f15412e;

    /* renamed from: f */
    private Surface f15413f;

    /* renamed from: g */
    private float f15414g;

    /* renamed from: h */
    private float f15415h;

    /* renamed from: i */
    private float f15416i;

    /* renamed from: j */
    private float f15417j;

    /* renamed from: k */
    private long f15418k;

    /* renamed from: l */
    private long f15419l;

    /* renamed from: m */
    private long f15420m;

    /* renamed from: n */
    private long f15421n;

    /* renamed from: o */
    private long f15422o;

    /* renamed from: p */
    private long f15423p;

    /* renamed from: q */
    private long f15424q;

    public and(Context context) {
        anb anb = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f15409b = (WindowManager) context.getSystemService("window");
        } else {
            this.f15409b = null;
        }
        if (this.f15409b != null) {
            if (amm.f15298a >= 17) {
                aup.m14890u(context);
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    anb = new anb(this, displayManager);
                }
            }
            this.f15411d = anb;
            this.f15410c = anc.m14343a();
        } else {
            this.f15411d = null;
            this.f15410c = null;
        }
        this.f15418k = C6540C.TIME_UNSET;
        this.f15419l = C6540C.TIME_UNSET;
        this.f15414g = -1.0f;
        this.f15417j = 1.0f;
    }

    /* renamed from: l */
    private final void m14347l() {
        this.f15420m = 0;
        this.f15423p = -1;
        this.f15421n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.f15415h) >= r2) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r9.f15408a.mo14021d() >= 30) goto L_0x0066;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14348m() {
        /*
            r9 = this;
            int r0 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            r1 = 30
            if (r0 < r1) goto L_0x006f
            android.view.Surface r0 = r9.f15413f
            if (r0 != 0) goto L_0x000b
            goto L_0x006f
        L_0x000b:
            com.google.ads.interactivemedia.v3.internal.amu r0 = r9.f15408a
            boolean r0 = r0.mo14020c()
            if (r0 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.amu r0 = r9.f15408a
            float r0 = r0.mo14024g()
            goto L_0x001c
        L_0x001a:
            float r0 = r9.f15414g
        L_0x001c:
            float r2 = r9.f15415h
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
            com.google.ads.interactivemedia.v3.internal.amu r1 = r9.f15408a
            boolean r1 = r1.mo14020c()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.ads.interactivemedia.v3.internal.amu r1 = r9.f15408a
            long r5 = r1.mo14022e()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r9.f15415h
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0065
            goto L_0x0066
        L_0x0058:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006a
            com.google.ads.interactivemedia.v3.internal.amu r2 = r9.f15408a
            int r2 = r2.mo14021d()
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
            r9.f15415h = r0
            r9.m14349n(r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.and.m14348m():void");
    }

    /* renamed from: n */
    private final void m14349n(boolean z) {
        Surface surface;
        if (amm.f15298a >= 30 && (surface = this.f15413f) != null) {
            float f = 0.0f;
            if (this.f15412e) {
                float f2 = this.f15415h;
                if (f2 != -1.0f) {
                    f = this.f15417j * f2;
                }
            }
            if (z || this.f15416i != f) {
                this.f15416i = f;
                m14351p(surface, f);
            }
        }
    }

    /* renamed from: o */
    private final void m14350o() {
        Surface surface;
        if (amm.f15298a >= 30 && (surface = this.f15413f) != null && this.f15416i != 0.0f) {
            this.f15416i = 0.0f;
            m14351p(surface, 0.0f);
        }
    }

    /* renamed from: p */
    private static void m14351p(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            ali.m14023b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m14352q() {
        WindowManager windowManager = this.f15409b;
        aup.m14890u(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f15418k = j;
            this.f15419l = (j * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f15418k = C6540C.TIME_UNSET;
        this.f15419l = C6540C.TIME_UNSET;
    }

    @TargetApi(17)
    /* renamed from: a */
    public final void mo14076a() {
        if (this.f15409b != null) {
            anc anc = this.f15410c;
            aup.m14890u(anc);
            anc.mo14072b();
            anb anb = this.f15411d;
            if (anb != null) {
                anb.mo14067a();
            }
            m14352q();
        }
    }

    /* renamed from: b */
    public final void mo14077b() {
        this.f15412e = true;
        m14347l();
        m14349n(false);
    }

    /* renamed from: c */
    public final void mo14078c(Surface surface) {
        if (true == (surface instanceof ams)) {
            surface = null;
        }
        if (this.f15413f != surface) {
            m14350o();
            this.f15413f = surface;
            m14349n(true);
        }
    }

    /* renamed from: d */
    public final void mo14079d() {
        m14347l();
    }

    /* renamed from: e */
    public final void mo14080e(float f) {
        this.f15417j = f;
        m14347l();
        m14349n(false);
    }

    /* renamed from: f */
    public final void mo14081f(float f) {
        this.f15414g = f;
        this.f15408a.mo14018a();
        m14348m();
    }

    /* renamed from: g */
    public final void mo14082g(long j) {
        long j2 = this.f15421n;
        if (j2 != -1) {
            this.f15423p = j2;
            this.f15424q = this.f15422o;
        }
        this.f15420m++;
        this.f15408a.mo14019b(j * 1000);
        m14348m();
    }

    /* renamed from: h */
    public final void mo14083h() {
        this.f15412e = false;
        m14350o();
    }

    @TargetApi(17)
    /* renamed from: i */
    public final void mo14084i() {
        if (this.f15409b != null) {
            anb anb = this.f15411d;
            if (anb != null) {
                anb.mo14068b();
            }
            anc anc = this.f15410c;
            aup.m14890u(anc);
            anc.mo14073c();
        }
    }

    /* renamed from: j */
    public final long mo14085j(long j) {
        long j2;
        if (this.f15423p != -1 && this.f15408a.mo14020c()) {
            long f = this.f15424q + ((long) (((float) (this.f15408a.mo14023f() * (this.f15420m - this.f15423p))) / this.f15417j));
            if (Math.abs(j - f) <= 20000000) {
                j = f;
            } else {
                m14347l();
            }
        }
        this.f15421n = this.f15420m;
        this.f15422o = j;
        anc anc = this.f15410c;
        if (anc == null || this.f15418k == C6540C.TIME_UNSET) {
            return j;
        }
        long j3 = anc.f15403a;
        if (j3 == C6540C.TIME_UNSET) {
            return j;
        }
        long j4 = this.f15418k;
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
        return j5 - this.f15419l;
    }
}
