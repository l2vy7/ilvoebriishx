package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kw3 implements Handler.Callback, a54, x74, zw3, sh3, cx3 {

    /* renamed from: A */
    private boolean f34502A;

    /* renamed from: B */
    private int f34503B = 0;

    /* renamed from: C */
    private boolean f34504C = false;

    /* renamed from: D */
    private boolean f34505D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f34506E;

    /* renamed from: F */
    private boolean f34507F;

    /* renamed from: G */
    private int f34508G;

    /* renamed from: H */
    private jw3 f34509H;

    /* renamed from: I */
    private long f34510I;

    /* renamed from: J */
    private int f34511J;

    /* renamed from: K */
    private boolean f34512K;

    /* renamed from: L */
    private vk3 f34513L;

    /* renamed from: M */
    private final rv3 f34514M;

    /* renamed from: N */
    private final qf3 f34515N;

    /* renamed from: b */
    private final hx3[] f34516b;

    /* renamed from: c */
    private final Set<hx3> f34517c;

    /* renamed from: d */
    private final ix3[] f34518d;

    /* renamed from: e */
    private final y74 f34519e;

    /* renamed from: f */
    private final z74 f34520f;

    /* renamed from: g */
    private final nw3 f34521g;

    /* renamed from: h */
    private final i84 f34522h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final y42 f34523i;

    /* renamed from: j */
    private final HandlerThread f34524j;

    /* renamed from: k */
    private final Looper f34525k;

    /* renamed from: l */
    private final gh0 f34526l;

    /* renamed from: m */
    private final gf0 f34527m;

    /* renamed from: n */
    private final long f34528n;

    /* renamed from: o */
    private final ti3 f34529o;

    /* renamed from: p */
    private final ArrayList<hw3> f34530p;

    /* renamed from: q */
    private final ov1 f34531q;

    /* renamed from: r */
    private final sw3 f34532r;

    /* renamed from: s */
    private final ax3 f34533s;

    /* renamed from: t */
    private kx3 f34534t;

    /* renamed from: u */
    private bx3 f34535u;

    /* renamed from: v */
    private iw3 f34536v;

    /* renamed from: w */
    private boolean f34537w;

    /* renamed from: x */
    private boolean f34538x;

    /* renamed from: y */
    private boolean f34539y;

    /* renamed from: z */
    private boolean f34540z;

    public kw3(hx3[] hx3Arr, y74 y74, z74 z74, nw3 nw3, i84 i84, int i, boolean z, a04 a04, kx3 kx3, qf3 qf3, long j, boolean z2, Looper looper, ov1 ov1, rv3 rv3, byte[] bArr) {
        hx3[] hx3Arr2 = hx3Arr;
        i84 i842 = i84;
        a04 a042 = a04;
        ov1 ov12 = ov1;
        this.f34514M = rv3;
        this.f34516b = hx3Arr2;
        this.f34519e = y74;
        this.f34520f = z74;
        this.f34521g = nw3;
        this.f34522h = i842;
        this.f34534t = kx3;
        this.f34515N = qf3;
        this.f34538x = false;
        this.f34531q = ov12;
        this.f34528n = nw3.zza();
        nw3.zze();
        bx3 h = bx3.m30859h(z74);
        this.f34535u = h;
        this.f34536v = new iw3(h);
        this.f34518d = new ix3[2];
        for (int i2 = 0; i2 < 2; i2++) {
            hx3Arr2[i2].mo32472a(i2);
            this.f34518d[i2] = hx3Arr2[i2].zzj();
        }
        this.f34529o = new ti3(this, ov12);
        this.f34530p = new ArrayList<>();
        this.f34517c = Collections.newSetFromMap(new IdentityHashMap());
        this.f34526l = new gh0();
        this.f34527m = new gf0();
        y74.mo35885d(this, i842);
        this.f34512K = true;
        Handler handler = new Handler(looper);
        this.f34532r = new sw3(a042, handler);
        this.f34533s = new ax3(this, a042, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f34524j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f34525k = looper2;
        this.f34523i = ov12.mo34015a(looper2, this);
    }

    /* renamed from: A */
    private final void m34138A(gi0 gi0, c54 c54, gi0 gi02, c54 c542, long j) {
        if (gi0.mo32145o() || !m34147J(gi0, c54)) {
            float f = this.f34529o.zzc().f32590a;
            h20 h20 = this.f34535u.f30164n;
            if (f != h20.f32590a) {
                this.f34529o.mo34017r(h20);
                return;
            }
            return;
        }
        gi0.mo31485e(gi0.mo32144n(c54.f34474a, this.f34527m).f32286c, this.f34526l, 0);
        qf3 qf3 = this.f34515N;
        C7831jh jhVar = this.f34526l.f32317i;
        int i = d13.f20195a;
        qf3.mo34340d(jhVar);
        if (j != C6540C.TIME_UNSET) {
            this.f34515N.mo34341e(m34156a0(gi0, c54.f34474a, j));
            return;
        }
        if (!d13.m20317p(!gi02.mo32145o() ? gi02.mo31485e(gi02.mo32144n(c542.f34474a, this.f34527m).f32286c, this.f34526l, 0).f32309a : null, this.f34526l.f32309a)) {
            this.f34515N.mo34341e(C6540C.TIME_UNSET);
        }
    }

    /* renamed from: B */
    private final void m34139B(cm0 cm0, z74 z74) {
        this.f34521g.mo33773a(this.f34516b, cm0, z74.f42341e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34140C() throws com.google.android.gms.internal.ads.vk3 {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.sw3 r0 = r11.f34532r
            com.google.android.gms.internal.ads.pw3 r0 = r0.mo34811g()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f37784d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.b54 r1 = r0.f37781a
            long r4 = r1.zzd()
            r6 = r4
            goto L_0x001b
        L_0x001a:
            r6 = r2
        L_0x001b:
            r10 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            r11.m34176q(r6)
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            long r0 = r0.f30169s
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.c54 r1 = r0.f30152b
            long r4 = r0.f30153c
            r8 = 1
            r9 = 5
            r0 = r11
            r2 = r6
            com.google.android.gms.internal.ads.bx3 r0 = r0.m34167h0(r1, r2, r4, r6, r8, r9)
            r11.f34535u = r0
            goto L_0x00cd
        L_0x003d:
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34812h()
            if (r0 == r2) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            long r1 = r1.mo34960a(r2)
            r11.f34510I = r1
            long r3 = r0.mo34198e()
            long r1 = r1 - r3
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            long r3 = r0.f30169s
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r0 = r11.f34530p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            boolean r0 = r0.mo33183b()
            if (r0 == 0) goto L_0x006c
            goto L_0x00c9
        L_0x006c:
            boolean r0 = r11.f34512K
            if (r0 == 0) goto L_0x0075
            r5 = -1
            long r3 = r3 + r5
            r11.f34512K = r10
        L_0x0075:
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.gi0 r5 = r0.f30151a
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            java.lang.Object r0 = r0.f34474a
            int r0 = r5.mo32133a(r0)
            int r5 = r11.f34511J
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r6 = r11.f34530p
            int r6 = r6.size()
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
            if (r5 <= 0) goto L_0x009b
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r7 = r11.f34530p
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.hw3 r7 = (com.google.android.gms.internal.ads.hw3) r7
            goto L_0x009c
        L_0x009b:
            r7 = r6
        L_0x009c:
            if (r7 == 0) goto L_0x00b7
            if (r0 < 0) goto L_0x00a8
            if (r0 != 0) goto L_0x00b7
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b7
        L_0x00a8:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x009b
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r7 = r11.f34530p
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.hw3 r7 = (com.google.android.gms.internal.ads.hw3) r7
            goto L_0x009c
        L_0x00b7:
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r0 = r11.f34530p
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x00c7
            java.util.ArrayList<com.google.android.gms.internal.ads.hw3> r0 = r11.f34530p
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.hw3 r0 = (com.google.android.gms.internal.ads.hw3) r0
        L_0x00c7:
            r11.f34511J = r5
        L_0x00c9:
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            r0.f30169s = r1
        L_0x00cd:
            com.google.android.gms.internal.ads.sw3 r0 = r11.f34532r
            com.google.android.gms.internal.ads.pw3 r0 = r0.mo34810f()
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u
            long r2 = r0.mo34196c()
            r1.f30167q = r2
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            long r1 = r11.m34157b0()
            r0.f30168r = r1
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            boolean r1 = r0.f30162l
            if (r1 == 0) goto L_0x0145
            int r1 = r0.f30155e
            r2 = 3
            if (r1 != r2) goto L_0x0145
            com.google.android.gms.internal.ads.gi0 r1 = r0.f30151a
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            boolean r0 = r11.m34147J(r1, r0)
            if (r0 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.h20 r1 = r0.f30164n
            float r1 = r1.f32590a
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0145
            com.google.android.gms.internal.ads.qf3 r1 = r11.f34515N
            com.google.android.gms.internal.ads.gi0 r2 = r0.f30151a
            com.google.android.gms.internal.ads.c54 r3 = r0.f30152b
            java.lang.Object r3 = r3.f34474a
            long r4 = r0.f30169s
            long r2 = r11.m34156a0(r2, r3, r4)
            long r4 = r11.m34157b0()
            float r0 = r1.mo34337a(r2, r4)
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o
            com.google.android.gms.internal.ads.h20 r1 = r1.zzc()
            float r1 = r1.f32590a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u
            com.google.android.gms.internal.ads.h20 r2 = r2.f30164n
            com.google.android.gms.internal.ads.h20 r3 = new com.google.android.gms.internal.ads.h20
            float r2 = r2.f32591b
            r3.<init>(r0, r2)
            r1.mo34017r(r3)
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.h20 r0 = r0.f30164n
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o
            com.google.android.gms.internal.ads.h20 r1 = r1.zzc()
            float r1 = r1.f32590a
            r11.m34171l(r0, r1, r10, r10)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw3.m34140C():void");
    }

    /* renamed from: D */
    private final synchronized void m34141D(n43<Boolean> n43, long j) {
        long j2 = 500;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        while (!Boolean.valueOf(((bw3) n43).f30123b.f34537w).booleanValue() && j2 > 0) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
            j2 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: E */
    private final boolean m34142E() {
        pw3 f = this.f34532r.mo34810f();
        if (f == null || f.mo34197d() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private static boolean m34143F(hx3 hx3) {
        return hx3.mo32481l() != 0;
    }

    /* renamed from: G */
    private final boolean m34144G() {
        pw3 g = this.f34532r.mo34811g();
        long j = g.f37786f.f38305e;
        if (g.f37784d) {
            return j == C6540C.TIME_UNSET || this.f34535u.f30169s < j || !m34146I();
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m34145H(bx3 bx3, gf0 gf0) {
        c54 c54 = bx3.f30152b;
        gi0 gi0 = bx3.f30151a;
        return gi0.mo32145o() || gi0.mo32144n(c54.f34474a, gf0).f32289f;
    }

    /* renamed from: I */
    private final boolean m34146I() {
        bx3 bx3 = this.f34535u;
        return bx3.f30162l && bx3.f30163m == 0;
    }

    /* renamed from: J */
    private final boolean m34147J(gi0 gi0, c54 c54) {
        if (!c54.mo33183b() && !gi0.mo32145o()) {
            gi0.mo31485e(gi0.mo32144n(c54.f34474a, this.f34527m).f32286c, this.f34526l, 0);
            if (this.f34526l.mo32126b()) {
                gh0 gh0 = this.f34526l;
                if (!gh0.f32315g || gh0.f32312d == C6540C.TIME_UNSET) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    private static final void m34148K(ex3 ex3) throws vk3 {
        ex3.mo31689j();
        try {
            ex3.mo31682c().mo31428j(ex3.mo31680a(), ex3.mo31686g());
        } finally {
            ex3.mo31687h(true);
        }
    }

    /* renamed from: L */
    private static final void m34149L(hx3 hx3) throws vk3 {
        if (hx3.mo32481l() == 2) {
            hx3.zzE();
        }
    }

    /* renamed from: M */
    private static final void m34150M(hx3 hx3, long j) {
        hx3.zzA();
        if (hx3 instanceof z64) {
            z64 z64 = (z64) hx3;
            throw null;
        }
    }

    /* renamed from: N */
    private static C8281w[] m34151N(e74 e74) {
        int b = e74 != null ? e74.mo31495b() : 0;
        C8281w[] wVarArr = new C8281w[b];
        for (int i = 0; i < b; i++) {
            wVarArr[i] = e74.mo31496c(i);
        }
        return wVarArr;
    }

    /* renamed from: R */
    static Object m34153R(gh0 gh0, gf0 gf0, int i, boolean z, Object obj, gi0 gi0, gi0 gi02) {
        int a = gi0.mo32133a(obj);
        int b = gi0.mo31950b();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (true) {
            if (i2 >= b || i4 != -1) {
                break;
            }
            i3 = gi0.mo32139i(i3, gf0, gh0, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = gi02.mo32133a(gi0.mo32135f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return gi02.mo32135f(i4);
    }

    /* renamed from: Z */
    static final /* synthetic */ void m34155Z(ex3 ex3) {
        try {
            m34148K(ex3);
        } catch (vk3 e) {
            fc2.m20475a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a0 */
    private final long m34156a0(gi0 gi0, Object obj, long j) {
        gi0.mo31485e(gi0.mo32144n(obj, this.f34527m).f32286c, this.f34526l, 0);
        gh0 gh0 = this.f34526l;
        if (gh0.f32312d != C6540C.TIME_UNSET && gh0.mo32126b()) {
            gh0 gh02 = this.f34526l;
            if (gh02.f32315g) {
                return xy3.m39691c(d13.m20292W(gh02.f32313e) - this.f34526l.f32312d) - j;
            }
        }
        return C6540C.TIME_UNSET;
    }

    /* renamed from: b0 */
    private final long m34157b0() {
        return m34159c0(this.f34535u.f30167q);
    }

    /* renamed from: c */
    private final void m34158c(hx3 hx3) throws vk3 {
        if (m34143F(hx3)) {
            this.f34529o.mo34961b(hx3);
            m34149L(hx3);
            hx3.zzm();
            this.f34508G--;
        }
    }

    /* renamed from: c0 */
    private final long m34159c0(long j) {
        pw3 f = this.f34532r.mo34810f();
        if (f == null) {
            return 0;
        }
        return Math.max(0, j - (this.f34510I - f.mo34198e()));
    }

    /* renamed from: d0 */
    private final long m34160d0(c54 c54, long j, boolean z) throws vk3 {
        return m34162e0(c54, j, this.f34532r.mo34811g() != this.f34532r.mo34812h(), z);
    }

    /* renamed from: e */
    private final void m34161e() throws vk3 {
        m34164g(new boolean[2]);
    }

    /* renamed from: e0 */
    private final long m34162e0(c54 c54, long j, boolean z, boolean z2) throws vk3 {
        m34184y();
        this.f34540z = false;
        if (z2 || this.f34535u.f30155e == 3) {
            m34181v(2);
        }
        pw3 g = this.f34532r.mo34811g();
        pw3 pw3 = g;
        while (pw3 != null && !c54.equals(pw3.f37786f.f38301a)) {
            pw3 = pw3.mo34201h();
        }
        if (z || g != pw3 || (pw3 != null && pw3.mo34198e() + j < 0)) {
            hx3[] hx3Arr = this.f34516b;
            for (int i = 0; i < 2; i++) {
                m34158c(hx3Arr[i]);
            }
            if (pw3 != null) {
                while (this.f34532r.mo34811g() != pw3) {
                    this.f34532r.mo34808d();
                }
                this.f34532r.mo34820p(pw3);
                pw3.mo34209p(0);
                m34161e();
            }
        }
        if (pw3 != null) {
            this.f34532r.mo34820p(pw3);
            if (!pw3.f37784d) {
                pw3.f37786f = pw3.f37786f.mo34422b(j);
            } else if (pw3.f37785e) {
                j = pw3.f37781a.mo18199a(j);
                pw3.f37781a.mo18207i(j - this.f34528n, false);
            }
            m34176q(j);
            m34172m();
        } else {
            this.f34532r.mo34816l();
            m34176q(j);
        }
        m34168i(false);
        this.f34523i.mo35880p(2);
        return j;
    }

    /* renamed from: f0 */
    private final Pair<c54, Long> m34163f0(gi0 gi0) {
        long j = 0;
        if (gi0.mo32145o()) {
            return Pair.create(bx3.m30860i(), 0L);
        }
        gi0 gi02 = gi0;
        Pair<Object, Long> l = gi02.mo32142l(this.f34526l, this.f34527m, gi0.mo32136g(this.f34504C), C6540C.TIME_UNSET);
        c54 k = this.f34532r.mo34815k(gi0, l.first, 0);
        long longValue = ((Long) l.second).longValue();
        if (k.mo33183b()) {
            gi0.mo32144n(k.f34474a, this.f34527m);
            if (k.f34476c == this.f34527m.mo32104d(k.f34475b)) {
                this.f34527m.mo32109h();
            }
        } else {
            j = longValue;
        }
        return Pair.create(k, Long.valueOf(j));
    }

    /* renamed from: g */
    private final void m34164g(boolean[] zArr) throws vk3 {
        pw3 h = this.f34532r.mo34812h();
        z74 i = h.mo34202i();
        for (int i2 = 0; i2 < 2; i2++) {
            if (!i.mo36021b(i2) && this.f34517c.remove(this.f34516b[i2])) {
                this.f34516b[i2].mo32475d();
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i.mo36021b(i3)) {
                boolean z = zArr[i3];
                hx3 hx3 = this.f34516b[i3];
                if (!m34143F(hx3)) {
                    pw3 h2 = this.f34532r.mo34812h();
                    boolean z2 = h2 == this.f34532r.mo34811g();
                    z74 i4 = h2.mo34202i();
                    jx3 jx3 = i4.f42338b[i3];
                    C8281w[] N = m34151N(i4.f42341e[i3]);
                    boolean z3 = m34146I() && this.f34535u.f30155e == 3;
                    boolean z4 = !z && z3;
                    this.f34508G++;
                    this.f34517c.add(hx3);
                    hx3.mo32480k(jx3, N, h2.f37783c[i3], this.f34510I, z4, z2, h2.mo34199f(), h2.mo34198e());
                    hx3.mo31428j(11, new dw3(this));
                    this.f34529o.mo34962c(hx3);
                    if (z3) {
                        hx3.mo32477f();
                    }
                }
            }
        }
        h.f37787g = true;
    }

    /* renamed from: g0 */
    private static Pair<Object, Long> m34165g0(gi0 gi0, jw3 jw3, boolean z, int i, boolean z2, gh0 gh0, gf0 gf0) {
        gi0 gi02 = gi0;
        jw3 jw32 = jw3;
        gf0 gf02 = gf0;
        gi0 gi03 = jw32.f34066a;
        if (gi0.mo32145o()) {
            return null;
        }
        gi0 gi04 = true == gi03.mo32145o() ? gi02 : gi03;
        try {
            Pair<Object, Long> l = gi04.mo32142l(gh0, gf0, jw32.f34067b, jw32.f34068c);
            if (gi0.equals(gi04)) {
                return l;
            }
            if (gi0.mo32133a(l.first) == -1) {
                gh0 gh02 = gh0;
                Object R = m34153R(gh0, gf0, i, z2, l.first, gi04, gi0);
                if (R != null) {
                    return gi0.mo32142l(gh0, gf0, gi0.mo32144n(R, gf02).f32286c, C6540C.TIME_UNSET);
                }
                return null;
            } else if (!gi04.mo32144n(l.first, gf02).f32289f || gi04.mo31485e(gf02.f32286c, gh0, 0).f32321m != gi04.mo32133a(l.first)) {
                return l;
            } else {
                return gi0.mo32142l(gh0, gf0, gi0.mo32144n(l.first, gf02).f32286c, jw32.f34068c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: h */
    private final void m34166h(IOException iOException, int i) {
        vk3 c = vk3.m38832c(iOException, i);
        pw3 g = this.f34532r.mo34811g();
        if (g != null) {
            c = c.mo35436a(g.f37786f.f38301a);
        }
        fc2.m20475a("ExoPlayerImplInternal", "Playback error", c);
        m34183x(false, false);
        this.f34535u = this.f34535u.mo30818e(c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.bx3 m34167h0(com.google.android.gms.internal.ads.c54 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            boolean r1 = r0.f34512K
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0021
            com.google.android.gms.internal.ads.bx3 r1 = r0.f34535u
            long r7 = r1.f30169s
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0021
            com.google.android.gms.internal.ads.bx3 r1 = r0.f34535u
            com.google.android.gms.internal.ads.c54 r1 = r1.f30152b
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            r0.f34512K = r1
            r16.m34175p()
            com.google.android.gms.internal.ads.bx3 r1 = r0.f34535u
            com.google.android.gms.internal.ads.cm0 r7 = r1.f30158h
            com.google.android.gms.internal.ads.z74 r8 = r1.f30159i
            java.util.List<com.google.android.gms.internal.ads.zzdd> r1 = r1.f30160j
            com.google.android.gms.internal.ads.ax3 r9 = r0.f34533s
            boolean r9 = r9.mo30561i()
            if (r9 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.sw3 r1 = r0.f34532r
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34811g()
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.cm0 r7 = com.google.android.gms.internal.ads.cm0.f30416d
            goto L_0x0046
        L_0x0042:
            com.google.android.gms.internal.ads.cm0 r7 = r1.mo34200g()
        L_0x0046:
            if (r1 != 0) goto L_0x004b
            com.google.android.gms.internal.ads.z74 r8 = r0.f34520f
            goto L_0x004f
        L_0x004b:
            com.google.android.gms.internal.ads.z74 r8 = r1.mo34202i()
        L_0x004f:
            com.google.android.gms.internal.ads.e74[] r9 = r8.f42341e
            com.google.android.gms.internal.ads.m63 r10 = new com.google.android.gms.internal.ads.m63
            r10.<init>()
            int r11 = r9.length
            r12 = 0
            r13 = 0
        L_0x0059:
            if (r12 >= r11) goto L_0x0079
            r14 = r9[r12]
            if (r14 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.w r14 = r14.mo31496c(r3)
            com.google.android.gms.internal.ads.zzdd r14 = r14.f40617j
            if (r14 != 0) goto L_0x0072
            com.google.android.gms.internal.ads.zzdd r14 = new com.google.android.gms.internal.ads.zzdd
            com.google.android.gms.internal.ads.zzdc[] r15 = new com.google.android.gms.internal.ads.zzdc[r3]
            r14.<init>((com.google.android.gms.internal.ads.zzdc[]) r15)
            r10.mo33496f(r14)
            goto L_0x0076
        L_0x0072:
            r10.mo33496f(r14)
            r13 = 1
        L_0x0076:
            int r12 = r12 + 1
            goto L_0x0059
        L_0x0079:
            if (r13 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.p63 r3 = r10.mo33497g()
            goto L_0x0084
        L_0x0080:
            com.google.android.gms.internal.ads.p63 r3 = com.google.android.gms.internal.ads.p63.m20814A()
        L_0x0084:
            if (r1 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.qw3 r4 = r1.f37786f
            long r9 = r4.f38303c
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.qw3 r4 = r4.mo34421a(r5)
            r1.f37786f = r4
        L_0x0094:
            r13 = r3
            goto L_0x00ad
        L_0x0096:
            com.google.android.gms.internal.ads.bx3 r3 = r0.f34535u
            com.google.android.gms.internal.ads.c54 r3 = r3.f30152b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.cm0 r1 = com.google.android.gms.internal.ads.cm0.f30416d
            com.google.android.gms.internal.ads.z74 r3 = r0.f34520f
            com.google.android.gms.internal.ads.p63 r4 = com.google.android.gms.internal.ads.p63.m20814A()
            r11 = r1
            r12 = r3
            r13 = r4
            goto L_0x00af
        L_0x00ac:
            r13 = r1
        L_0x00ad:
            r11 = r7
            r12 = r8
        L_0x00af:
            if (r24 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.iw3 r1 = r0.f34536v
            r3 = r25
            r1.mo32782d(r3)
        L_0x00b8:
            com.google.android.gms.internal.ads.bx3 r1 = r0.f34535u
            long r9 = r16.m34157b0()
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            com.google.android.gms.internal.ads.bx3 r1 = r1.mo30815b(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw3.m34167h0(com.google.android.gms.internal.ads.c54, long, long, long, boolean, int):com.google.android.gms.internal.ads.bx3");
    }

    /* renamed from: i */
    private final void m34168i(boolean z) {
        c54 c54;
        long j;
        pw3 f = this.f34532r.mo34810f();
        if (f == null) {
            c54 = this.f34535u.f30152b;
        } else {
            c54 = f.f37786f.f38301a;
        }
        boolean z2 = !this.f34535u.f30161k.equals(c54);
        if (z2) {
            this.f34535u = this.f34535u.mo30814a(c54);
        }
        bx3 bx3 = this.f34535u;
        if (f == null) {
            j = bx3.f30169s;
        } else {
            j = f.mo34196c();
        }
        bx3.f30167q = j;
        this.f34535u.f30168r = m34157b0();
        if ((z2 || z) && f != null && f.f37784d) {
            m34139B(f.mo34200g(), f.mo34202i());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b5  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34169j(com.google.android.gms.internal.ads.gi0 r29, boolean r30) throws com.google.android.gms.internal.ads.vk3 {
        /*
            r28 = this;
            r11 = r28
            r12 = r29
            com.google.android.gms.internal.ads.bx3 r0 = r11.f34535u
            com.google.android.gms.internal.ads.jw3 r8 = r11.f34509H
            com.google.android.gms.internal.ads.sw3 r9 = r11.f34532r
            int r4 = r11.f34503B
            boolean r10 = r11.f34504C
            com.google.android.gms.internal.ads.gh0 r13 = r11.f34526l
            com.google.android.gms.internal.ads.gf0 r14 = r11.f34527m
            boolean r1 = r29.mo32145o()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.c54 r0 = com.google.android.gms.internal.ads.bx3.m30860i()
            r8 = r0
            r15 = r11
            r13 = r16
            r2 = 0
            r5 = 1
            r7 = 0
            r9 = -1
            r10 = 0
            goto L_0x01dc
        L_0x002e:
            com.google.android.gms.internal.ads.c54 r1 = r0.f30152b
            java.lang.Object r15 = r1.f34474a
            boolean r19 = m34145H(r0, r14)
            com.google.android.gms.internal.ads.c54 r2 = r0.f30152b
            boolean r2 = r2.mo33183b()
            if (r2 != 0) goto L_0x0044
            if (r19 == 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            long r5 = r0.f30169s
            goto L_0x0046
        L_0x0044:
            long r5 = r0.f30153c
        L_0x0046:
            r23 = r5
            if (r8 == 0) goto L_0x009f
            r5 = 1
            r6 = r1
            r1 = r29
            r2 = r8
            r11 = 1
            r3 = r5
            r7 = -1
            r5 = r10
            r11 = r6
            r6 = r13
            r21 = r9
            r9 = -1
            r7 = r14
            android.util.Pair r1 = m34165g0(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x006a
            int r1 = r12.mo32136g(r10)
            r5 = r1
            r1 = r23
            r3 = 1
            r4 = 0
            r6 = 0
            goto L_0x0092
        L_0x006a:
            long r2 = r8.f34068c
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x007c
            java.lang.Object r1 = r1.first
            com.google.android.gms.internal.ads.gf0 r1 = r12.mo32144n(r1, r14)
            int r5 = r1.f32286c
            r1 = r23
            r3 = 0
            goto L_0x0088
        L_0x007c:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 1
            r5 = -1
        L_0x0088:
            int r4 = r0.f30155e
            r6 = 4
            if (r4 != r6) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            r6 = r3
            r3 = 0
        L_0x0092:
            r10 = r4
            r4 = r5
            r22 = r6
            r7 = 0
        L_0x0098:
            r27 = r15
            r15 = r3
            r3 = r27
            goto L_0x013c
        L_0x009f:
            r11 = r1
            r21 = r9
            r9 = -1
            com.google.android.gms.internal.ads.gi0 r1 = r0.f30151a
            boolean r1 = r1.mo32145o()
            if (r1 == 0) goto L_0x00bb
            int r1 = r12.mo32136g(r10)
        L_0x00af:
            r4 = r1
            r3 = r15
            r1 = r23
            r7 = 0
        L_0x00b5:
            r10 = 0
            r15 = 0
            r22 = 0
            goto L_0x013c
        L_0x00bb:
            int r1 = r12.mo32133a(r15)
            if (r1 != r9) goto L_0x00e6
            com.google.android.gms.internal.ads.gi0 r6 = r0.f30151a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r29
            java.lang.Object r1 = m34153R(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00d6
            int r1 = r12.mo32136g(r10)
            r3 = 1
            goto L_0x00dd
        L_0x00d6:
            com.google.android.gms.internal.ads.gf0 r1 = r12.mo32144n(r1, r14)
            int r1 = r1.f32286c
            r3 = 0
        L_0x00dd:
            r4 = r1
            r1 = r23
            r7 = 0
            r10 = 0
            r22 = 0
            goto L_0x0098
        L_0x00e6:
            int r1 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            com.google.android.gms.internal.ads.gf0 r1 = r12.mo32144n(r15, r14)
            int r1 = r1.f32286c
            goto L_0x00af
        L_0x00f1:
            if (r19 == 0) goto L_0x0134
            com.google.android.gms.internal.ads.gi0 r1 = r0.f30151a
            java.lang.Object r2 = r11.f34474a
            r1.mo32144n(r2, r14)
            com.google.android.gms.internal.ads.gi0 r1 = r0.f30151a
            int r2 = r14.f32286c
            r7 = 0
            com.google.android.gms.internal.ads.gh0 r1 = r1.mo31485e(r2, r13, r7)
            int r1 = r1.f32321m
            com.google.android.gms.internal.ads.gi0 r2 = r0.f30151a
            java.lang.Object r3 = r11.f34474a
            int r2 = r2.mo32133a(r3)
            if (r1 != r2) goto L_0x012b
            com.google.android.gms.internal.ads.gf0 r1 = r12.mo32144n(r15, r14)
            int r4 = r1.f32286c
            r1 = r29
            r2 = r13
            r3 = r14
            r5 = r23
            android.util.Pair r1 = r1.mo32142l(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x012d
        L_0x012b:
            r1 = r23
        L_0x012d:
            r3 = r15
            r4 = -1
            r10 = 0
            r15 = 0
            r22 = 1
            goto L_0x013c
        L_0x0134:
            r7 = 0
            r3 = r15
            r1 = r23
            r4 = -1
            goto L_0x00b5
        L_0x013c:
            if (r4 == r9) goto L_0x0159
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r29
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo32142l(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4 = r1
            r1 = r16
            goto L_0x015a
        L_0x0159:
            r4 = r1
        L_0x015a:
            r6 = r21
            com.google.android.gms.internal.ads.c54 r6 = r6.mo34815k(r12, r3, r4)
            int r13 = r6.f34478e
            if (r13 == r9) goto L_0x016f
            int r13 = r11.f34478e
            if (r13 == r9) goto L_0x016d
            int r7 = r6.f34475b
            if (r7 < r13) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r7 = 0
            goto L_0x0170
        L_0x016f:
            r7 = 1
        L_0x0170:
            java.lang.Object r8 = r11.f34474a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0188
            boolean r13 = r11.mo33183b()
            if (r13 != 0) goto L_0x0188
            boolean r13 = r6.mo33183b()
            if (r13 != 0) goto L_0x0188
            if (r7 == 0) goto L_0x0188
            r7 = 1
            goto L_0x0189
        L_0x0188:
            r7 = 0
        L_0x0189:
            r12.mo32144n(r3, r14)
            if (r8 == 0) goto L_0x01aa
            if (r19 != 0) goto L_0x01aa
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01aa
            boolean r3 = r6.mo33183b()
            if (r3 == 0) goto L_0x019f
            int r3 = r6.f34475b
            r14.mo32113k(r3)
        L_0x019f:
            boolean r3 = r11.mo33183b()
            if (r3 == 0) goto L_0x01aa
            int r3 = r11.f34475b
            r14.mo32113k(r3)
        L_0x01aa:
            r3 = 1
            if (r3 == r7) goto L_0x01ae
            goto L_0x01af
        L_0x01ae:
            r6 = r11
        L_0x01af:
            boolean r7 = r6.mo33183b()
            if (r7 == 0) goto L_0x01d2
            boolean r4 = r6.equals(r11)
            if (r4 == 0) goto L_0x01be
            long r4 = r0.f30169s
            goto L_0x01d2
        L_0x01be:
            java.lang.Object r0 = r6.f34474a
            r12.mo32144n(r0, r14)
            int r0 = r6.f34476c
            int r4 = r6.f34475b
            int r4 = r14.mo32104d(r4)
            if (r0 != r4) goto L_0x01d0
            r14.mo32109h()
        L_0x01d0:
            r4 = 0
        L_0x01d2:
            r13 = r1
            r8 = r6
            r2 = r10
            r3 = r15
            r7 = r22
            r15 = r28
            r10 = r4
            r5 = 1
        L_0x01dc:
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01f2
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            long r0 = r0.f30169s
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01ef
            goto L_0x01f2
        L_0x01ef:
            r19 = 0
            goto L_0x01f4
        L_0x01f2:
            r19 = 1
        L_0x01f4:
            r20 = 3
            if (r3 == 0) goto L_0x0211
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u     // Catch:{ all -> 0x0209 }
            int r0 = r0.f30155e     // Catch:{ all -> 0x0209 }
            if (r0 == r5) goto L_0x0203
            r3 = 4
            r15.m34181v(r3)     // Catch:{ all -> 0x0209 }
            goto L_0x0204
        L_0x0203:
            r3 = 4
        L_0x0204:
            r4 = 0
            r15.m34174o(r4, r4, r4, r5)     // Catch:{ all -> 0x0209 }
            goto L_0x0213
        L_0x0209:
            r0 = move-exception
            r25 = r13
        L_0x020c:
            r9 = 1
            r13 = 0
            r14 = 0
            goto L_0x032c
        L_0x0211:
            r3 = 4
            r4 = 0
        L_0x0213:
            if (r19 != 0) goto L_0x027e
            com.google.android.gms.internal.ads.sw3 r1 = r15.f34532r     // Catch:{ all -> 0x0209 }
            long r3 = r15.f34510I     // Catch:{ all -> 0x0209 }
            com.google.android.gms.internal.ads.pw3 r0 = r1.mo34812h()     // Catch:{ all -> 0x0209 }
            r21 = -9223372036854775808
            if (r0 != 0) goto L_0x0226
            r25 = r13
            r5 = 0
            goto L_0x026e
        L_0x0226:
            long r23 = r0.mo34198e()     // Catch:{ all -> 0x0209 }
            boolean r2 = r0.f37784d     // Catch:{ all -> 0x0209 }
            if (r2 != 0) goto L_0x0233
            r25 = r13
            r5 = r23
            goto L_0x026e
        L_0x0233:
            r5 = r23
            r2 = 0
        L_0x0236:
            com.google.android.gms.internal.ads.hx3[] r9 = r15.f34516b     // Catch:{ all -> 0x0209 }
            r25 = r13
            r13 = 2
            if (r2 >= r13) goto L_0x026e
            r9 = r9[r2]     // Catch:{ all -> 0x026c }
            boolean r9 = m34143F(r9)     // Catch:{ all -> 0x026c }
            if (r9 == 0) goto L_0x0267
            com.google.android.gms.internal.ads.hx3[] r9 = r15.f34516b     // Catch:{ all -> 0x026c }
            r9 = r9[r2]     // Catch:{ all -> 0x026c }
            com.google.android.gms.internal.ads.r64 r9 = r9.zzl()     // Catch:{ all -> 0x026c }
            com.google.android.gms.internal.ads.r64[] r13 = r0.f37783c     // Catch:{ all -> 0x026c }
            r13 = r13[r2]     // Catch:{ all -> 0x026c }
            if (r9 == r13) goto L_0x0254
            goto L_0x0267
        L_0x0254:
            com.google.android.gms.internal.ads.hx3[] r9 = r15.f34516b     // Catch:{ all -> 0x026c }
            r9 = r9[r2]     // Catch:{ all -> 0x026c }
            long r13 = r9.zzf()     // Catch:{ all -> 0x026c }
            int r9 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0263
            r5 = r21
            goto L_0x026e
        L_0x0263:
            long r5 = java.lang.Math.max(r13, r5)     // Catch:{ all -> 0x026c }
        L_0x0267:
            int r2 = r2 + 1
            r13 = r25
            goto L_0x0236
        L_0x026c:
            r0 = move-exception
            goto L_0x020c
        L_0x026e:
            r2 = r29
            r9 = 4
            r13 = 0
            r9 = 1
            r14 = 0
            boolean r0 = r1.mo34822r(r2, r3, r5)     // Catch:{ all -> 0x032b }
            if (r0 != 0) goto L_0x02b2
            r15.m34179t(r13)     // Catch:{ all -> 0x032b }
            goto L_0x02b2
        L_0x027e:
            r25 = r13
            r9 = 1
            r13 = 0
            r14 = 0
            boolean r0 = r29.mo32145o()     // Catch:{ all -> 0x032b }
            if (r0 != 0) goto L_0x02b2
            com.google.android.gms.internal.ads.sw3 r0 = r15.f34532r     // Catch:{ all -> 0x032b }
            com.google.android.gms.internal.ads.pw3 r0 = r0.mo34811g()     // Catch:{ all -> 0x032b }
        L_0x028f:
            if (r0 == 0) goto L_0x02ad
            com.google.android.gms.internal.ads.qw3 r1 = r0.f37786f     // Catch:{ all -> 0x032b }
            com.google.android.gms.internal.ads.c54 r1 = r1.f38301a     // Catch:{ all -> 0x032b }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x032b }
            if (r1 == 0) goto L_0x02a8
            com.google.android.gms.internal.ads.sw3 r1 = r15.f34532r     // Catch:{ all -> 0x032b }
            com.google.android.gms.internal.ads.qw3 r3 = r0.f37786f     // Catch:{ all -> 0x032b }
            com.google.android.gms.internal.ads.qw3 r1 = r1.mo34814j(r12, r3)     // Catch:{ all -> 0x032b }
            r0.f37786f = r1     // Catch:{ all -> 0x032b }
            r0.mo34210q()     // Catch:{ all -> 0x032b }
        L_0x02a8:
            com.google.android.gms.internal.ads.pw3 r0 = r0.mo34201h()     // Catch:{ all -> 0x032b }
            goto L_0x028f
        L_0x02ad:
            long r0 = r15.m34160d0(r8, r10, r2)     // Catch:{ all -> 0x032b }
            r10 = r0
        L_0x02b2:
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            com.google.android.gms.internal.ads.gi0 r4 = r0.f30151a
            com.google.android.gms.internal.ads.c54 r5 = r0.f30152b
            if (r9 == r7) goto L_0x02bd
            r6 = r16
            goto L_0x02be
        L_0x02bd:
            r6 = r10
        L_0x02be:
            r1 = r28
            r2 = r29
            r3 = r8
            r1.m34138A(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x02d0
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            long r0 = r0.f30153c
            int r2 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x030d
        L_0x02d0:
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            com.google.android.gms.internal.ads.c54 r1 = r0.f30152b
            java.lang.Object r1 = r1.f34474a
            com.google.android.gms.internal.ads.gi0 r0 = r0.f30151a
            if (r19 == 0) goto L_0x02ed
            if (r30 == 0) goto L_0x02ed
            boolean r2 = r0.mo32145o()
            if (r2 != 0) goto L_0x02ed
            com.google.android.gms.internal.ads.gf0 r2 = r15.f34527m
            com.google.android.gms.internal.ads.gf0 r0 = r0.mo32144n(r1, r2)
            boolean r0 = r0.f32289f
            if (r0 != 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r9 = 0
        L_0x02ee:
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            long r5 = r0.f30154d
            int r0 = r12.mo32133a(r1)
            r1 = -1
            if (r0 != r1) goto L_0x02fc
            r18 = 4
            goto L_0x02fe
        L_0x02fc:
            r18 = 3
        L_0x02fe:
            r1 = r28
            r2 = r8
            r3 = r10
            r7 = r5
            r5 = r25
            r10 = r18
            com.google.android.gms.internal.ads.bx3 r0 = r1.m34167h0(r2, r3, r5, r7, r9, r10)
            r15.f34535u = r0
        L_0x030d:
            r28.m34175p()
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            com.google.android.gms.internal.ads.gi0 r0 = r0.f30151a
            r15.m34177r(r12, r0)
            com.google.android.gms.internal.ads.bx3 r0 = r15.f34535u
            com.google.android.gms.internal.ads.bx3 r0 = r0.mo30820g(r12)
            r15.f34535u = r0
            boolean r0 = r29.mo32145o()
            if (r0 != 0) goto L_0x0327
            r15.f34509H = r14
        L_0x0327:
            r15.m34168i(r13)
            return
        L_0x032b:
            r0 = move-exception
        L_0x032c:
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            com.google.android.gms.internal.ads.gi0 r4 = r1.f30151a
            com.google.android.gms.internal.ads.c54 r5 = r1.f30152b
            if (r9 == r7) goto L_0x0337
            r6 = r16
            goto L_0x0338
        L_0x0337:
            r6 = r10
        L_0x0338:
            r1 = r28
            r2 = r29
            r3 = r8
            r1.m34138A(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x034a
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            long r1 = r1.f30153c
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0387
        L_0x034a:
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            com.google.android.gms.internal.ads.c54 r2 = r1.f30152b
            java.lang.Object r2 = r2.f34474a
            com.google.android.gms.internal.ads.gi0 r1 = r1.f30151a
            if (r19 == 0) goto L_0x0367
            if (r30 == 0) goto L_0x0367
            boolean r3 = r1.mo32145o()
            if (r3 != 0) goto L_0x0367
            com.google.android.gms.internal.ads.gf0 r3 = r15.f34527m
            com.google.android.gms.internal.ads.gf0 r1 = r1.mo32144n(r2, r3)
            boolean r1 = r1.f32289f
            if (r1 != 0) goto L_0x0367
            goto L_0x0368
        L_0x0367:
            r9 = 0
        L_0x0368:
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            long r5 = r1.f30154d
            int r1 = r12.mo32133a(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0376
            r18 = 4
            goto L_0x0378
        L_0x0376:
            r18 = 3
        L_0x0378:
            r1 = r28
            r2 = r8
            r3 = r10
            r7 = r5
            r5 = r25
            r10 = r18
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)
            r15.f34535u = r1
        L_0x0387:
            r28.m34175p()
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            com.google.android.gms.internal.ads.gi0 r1 = r1.f30151a
            r15.m34177r(r12, r1)
            com.google.android.gms.internal.ads.bx3 r1 = r15.f34535u
            com.google.android.gms.internal.ads.bx3 r1 = r1.mo30820g(r12)
            r15.f34535u = r1
            boolean r1 = r29.mo32145o()
            if (r1 != 0) goto L_0x03a1
            r15.f34509H = r14
        L_0x03a1:
            r15.m34168i(r13)
            goto L_0x03a6
        L_0x03a5:
            throw r0
        L_0x03a6:
            goto L_0x03a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw3.m34169j(com.google.android.gms.internal.ads.gi0, boolean):void");
    }

    /* renamed from: k */
    private final void m34170k(h20 h20, boolean z) throws vk3 {
        m34171l(h20, h20.f32590a, true, z);
    }

    /* renamed from: l */
    private final void m34171l(h20 h20, float f, boolean z, boolean z2) throws vk3 {
        int i;
        kw3 kw3 = this;
        h20 h202 = h20;
        if (z) {
            if (z2) {
                kw3.f34536v.mo32779a(1);
            }
            bx3 bx3 = kw3.f34535u;
            gi0 gi0 = bx3.f30151a;
            c54 c54 = bx3.f30152b;
            bx3 bx32 = r1;
            bx3 bx33 = bx32;
            bx3 bx34 = bx3;
            gi0 gi02 = gi0;
            c54 c542 = c54;
            bx3 bx35 = new bx3(gi02, c542, bx3.f30153c, bx3.f30154d, bx3.f30155e, bx3.f30156f, bx3.f30157g, bx3.f30158h, bx3.f30159i, bx3.f30160j, bx3.f30161k, bx34.f30162l, bx34.f30163m, h20, bx34.f30167q, bx34.f30168r, bx34.f30169s, bx34.f30165o, bx34.f30166p);
            kw3 = this;
            kw3.f34535u = bx32;
        }
        h20 h203 = h20;
        float f2 = h203.f32590a;
        pw3 g = kw3.f34532r.mo34811g();
        while (true) {
            i = 0;
            if (g == null) {
                break;
            }
            e74[] e74Arr = g.mo34202i().f42341e;
            int length = e74Arr.length;
            while (i < length) {
                e74 e74 = e74Arr[i];
                i++;
            }
            g = g.mo34201h();
        }
        hx3[] hx3Arr = kw3.f34516b;
        while (i < 2) {
            hx3 hx3 = hx3Arr[i];
            if (hx3 != null) {
                hx3.mo32474c(f, h203.f32590a);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* renamed from: m */
    private final void m34172m() {
        boolean z;
        long j;
        long j2;
        if (!m34142E()) {
            z = false;
        } else {
            pw3 f = this.f34532r.mo34810f();
            long c0 = m34159c0(f.mo34197d());
            if (f == this.f34532r.mo34811g()) {
                j2 = this.f34510I;
                j = f.mo34198e();
            } else {
                j2 = this.f34510I - f.mo34198e();
                j = f.f37786f.f38302b;
            }
            z = this.f34521g.mo33775c(j2 - j, c0, this.f34529o.zzc().f32590a);
        }
        this.f34502A = z;
        if (z) {
            this.f34532r.mo34810f().mo34204k(this.f34510I);
        }
        m34185z();
    }

    /* renamed from: n */
    private final void m34173n() {
        this.f34536v.mo32781c(this.f34535u);
        if (this.f34536v.f33544a) {
            rv3 rv3 = this.f34514M;
            rv3.f38789a.mo30522F(this.f34536v);
            this.f34536v = new iw3(this.f34535u);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34174o(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r30 = this;
            r1 = r30
            com.google.android.gms.internal.ads.y42 r0 = r1.f34523i
            r2 = 2
            r0.mo35878l(r2)
            r3 = 0
            r1.f34513L = r3
            r4 = 0
            r1.f34540z = r4
            com.google.android.gms.internal.ads.ti3 r0 = r1.f34529o
            r0.mo34965f()
            r5 = 0
            r1.f34510I = r5
            com.google.android.gms.internal.ads.hx3[] r5 = r1.f34516b
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r2) goto L_0x002f
            r0 = r5[r6]
            r1.m34158c(r0)     // Catch:{ vk3 -> 0x0026, RuntimeException -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r0 = move-exception
            goto L_0x0027
        L_0x0026:
            r0 = move-exception
        L_0x0027:
            java.lang.String r8 = "Disable failed."
            com.google.android.gms.internal.ads.fc2.m20475a(r7, r8, r0)
        L_0x002c:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x002f:
            if (r31 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.hx3[] r5 = r1.f34516b
            r6 = 0
        L_0x0034:
            if (r6 >= r2) goto L_0x004e
            r0 = r5[r6]
            java.util.Set<com.google.android.gms.internal.ads.hx3> r8 = r1.f34517c
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x004b
            r0.mo32475d()     // Catch:{ RuntimeException -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.google.android.gms.internal.ads.fc2.m20475a(r7, r0, r8)
        L_0x004b:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x004e:
            r1.f34508G = r4
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            com.google.android.gms.internal.ads.c54 r2 = r0.f30152b
            long r5 = r0.f30169s
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            boolean r0 = r0.mo33183b()
            if (r0 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            com.google.android.gms.internal.ads.gf0 r7 = r1.f34527m
            boolean r0 = m34145H(r0, r7)
            if (r0 == 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            long r7 = r0.f30169s
            goto L_0x0074
        L_0x0070:
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            long r7 = r0.f30153c
        L_0x0074:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r32 == 0) goto L_0x00a8
            r1.f34509H = r3
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            com.google.android.gms.internal.ads.gi0 r0 = r0.f30151a
            android.util.Pair r0 = r1.m34163f0(r0)
            java.lang.Object r2 = r0.first
            com.google.android.gms.internal.ads.c54 r2 = (com.google.android.gms.internal.ads.c54) r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            com.google.android.gms.internal.ads.c54 r0 = r0.f30152b
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a2
            r0 = 1
            r18 = r2
            r26 = r5
            r8 = r9
            goto L_0x00ae
        L_0x00a2:
            r18 = r2
            r26 = r5
            r8 = r9
            goto L_0x00ad
        L_0x00a8:
            r18 = r2
            r26 = r5
            r8 = r7
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            com.google.android.gms.internal.ads.sw3 r2 = r1.f34532r
            r2.mo34816l()
            r1.f34502A = r4
            com.google.android.gms.internal.ads.bx3 r2 = new com.google.android.gms.internal.ads.bx3
            com.google.android.gms.internal.ads.bx3 r4 = r1.f34535u
            com.google.android.gms.internal.ads.gi0 r6 = r4.f30151a
            int r12 = r4.f30155e
            if (r34 == 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            com.google.android.gms.internal.ads.vk3 r3 = r4.f30156f
        L_0x00c2:
            r13 = r3
            if (r0 == 0) goto L_0x00c8
            com.google.android.gms.internal.ads.cm0 r3 = com.google.android.gms.internal.ads.cm0.f30416d
            goto L_0x00ca
        L_0x00c8:
            com.google.android.gms.internal.ads.cm0 r3 = r4.f30158h
        L_0x00ca:
            r15 = r3
            if (r0 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.z74 r3 = r1.f34520f
            goto L_0x00d2
        L_0x00d0:
            com.google.android.gms.internal.ads.z74 r3 = r4.f30159i
        L_0x00d2:
            r16 = r3
            if (r0 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.p63 r0 = com.google.android.gms.internal.ads.p63.m20814A()
            goto L_0x00dd
        L_0x00db:
            java.util.List<com.google.android.gms.internal.ads.zzdd> r0 = r4.f30160j
        L_0x00dd:
            r17 = r0
            com.google.android.gms.internal.ads.bx3 r0 = r1.f34535u
            r14 = 0
            boolean r3 = r0.f30162l
            r19 = r3
            int r3 = r0.f30163m
            r20 = r3
            com.google.android.gms.internal.ads.h20 r0 = r0.f30164n
            r21 = r0
            r24 = 0
            boolean r0 = r1.f34507F
            r28 = r0
            r29 = 0
            r5 = r2
            r7 = r18
            r10 = r26
            r22 = r26
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29)
            r1.f34535u = r2
            if (r33 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.ax3 r0 = r1.f34533s
            r0.mo30559g()
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw3.m34174o(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: p */
    private final void m34175p() {
        pw3 g = this.f34532r.mo34811g();
        boolean z = false;
        if (g != null && g.f37786f.f38308h && this.f34538x) {
            z = true;
        }
        this.f34539y = z;
    }

    /* renamed from: q */
    private final void m34176q(long j) throws vk3 {
        pw3 g = this.f34532r.mo34811g();
        if (g != null) {
            j += g.mo34198e();
        }
        this.f34510I = j;
        this.f34529o.mo34963d(j);
        hx3[] hx3Arr = this.f34516b;
        for (int i = 0; i < 2; i++) {
            hx3 hx3 = hx3Arr[i];
            if (m34143F(hx3)) {
                hx3.mo32479h(this.f34510I);
            }
        }
        for (pw3 g2 = this.f34532r.mo34811g(); g2 != null; g2 = g2.mo34201h()) {
            for (e74 e74 : g2.mo34202i().f42341e) {
            }
        }
    }

    /* renamed from: r */
    private final void m34177r(gi0 gi0, gi0 gi02) {
        if (!gi0.mo32145o() || !gi02.mo32145o()) {
            int size = this.f34530p.size() - 1;
            if (size < 0) {
                Collections.sort(this.f34530p);
                return;
            }
            Object obj = this.f34530p.get(size).f32867b;
            xy3.m39691c(C6540C.TIME_UNSET);
            throw null;
        }
    }

    /* renamed from: s */
    private final void m34178s(long j, long j2) {
        this.f34523i.mo35878l(2);
        this.f34523i.mo35872a(2, j + j2);
    }

    /* renamed from: t */
    private final void m34179t(boolean z) throws vk3 {
        c54 c54 = this.f34532r.mo34811g().f37786f.f38301a;
        long e0 = m34162e0(c54, this.f34535u.f30169s, true, false);
        if (e0 != this.f34535u.f30169s) {
            bx3 bx3 = this.f34535u;
            this.f34535u = m34167h0(c54, e0, bx3.f30153c, bx3.f30154d, z, 5);
        }
    }

    /* renamed from: u */
    private final void m34180u(boolean z, int i, boolean z2, int i2) throws vk3 {
        this.f34536v.mo32779a(z2 ? 1 : 0);
        this.f34536v.mo32780b(i2);
        this.f34535u = this.f34535u.mo30817d(z, i);
        this.f34540z = false;
        for (pw3 g = this.f34532r.mo34811g(); g != null; g = g.mo34201h()) {
            for (e74 e74 : g.mo34202i().f42341e) {
            }
        }
        if (!m34146I()) {
            m34184y();
            m34140C();
            return;
        }
        int i3 = this.f34535u.f30155e;
        if (i3 == 3) {
            m34182w();
            this.f34523i.mo35880p(2);
        } else if (i3 == 2) {
            this.f34523i.mo35880p(2);
        }
    }

    /* renamed from: v */
    private final void m34181v(int i) {
        bx3 bx3 = this.f34535u;
        if (bx3.f30155e != i) {
            this.f34535u = bx3.mo30819f(i);
        }
    }

    /* renamed from: w */
    private final void m34182w() throws vk3 {
        this.f34540z = false;
        this.f34529o.mo34964e();
        hx3[] hx3Arr = this.f34516b;
        for (int i = 0; i < 2; i++) {
            hx3 hx3 = hx3Arr[i];
            if (m34143F(hx3)) {
                hx3.mo32477f();
            }
        }
    }

    /* renamed from: x */
    private final void m34183x(boolean z, boolean z2) {
        m34174o(z || !this.f34505D, false, true, false);
        this.f34536v.mo32779a(z2 ? 1 : 0);
        this.f34521g.zzd();
        m34181v(1);
    }

    /* renamed from: y */
    private final void m34184y() throws vk3 {
        this.f34529o.mo34965f();
        hx3[] hx3Arr = this.f34516b;
        for (int i = 0; i < 2; i++) {
            hx3 hx3 = hx3Arr[i];
            if (m34143F(hx3)) {
                m34149L(hx3);
            }
        }
    }

    /* renamed from: z */
    private final void m34185z() {
        pw3 f = this.f34532r.mo34810f();
        boolean z = this.f34502A || (f != null && f.f37781a.zzo());
        bx3 bx3 = this.f34535u;
        if (z != bx3.f30157g) {
            this.f34535u = new bx3(bx3.f30151a, bx3.f30152b, bx3.f30153c, bx3.f30154d, bx3.f30155e, bx3.f30156f, z, bx3.f30158h, bx3.f30159i, bx3.f30160j, bx3.f30161k, bx3.f30162l, bx3.f30163m, bx3.f30164n, bx3.f30167q, bx3.f30168r, bx3.f30169s, bx3.f30165o, bx3.f30166p);
        }
    }

    /* renamed from: O */
    public final Looper mo33194O() {
        return this.f34525k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ Boolean mo33195Q() {
        return Boolean.valueOf(this.f34537w);
    }

    /* renamed from: T */
    public final void mo33196T() {
        this.f34523i.mo35879m(0).zza();
    }

    /* renamed from: U */
    public final void mo33197U(gi0 gi0, int i, long j) {
        this.f34523i.mo35875e(3, new jw3(gi0, i, j)).zza();
    }

    /* renamed from: V */
    public final void mo33198V(boolean z, int i) {
        this.f34523i.mo35876f(1, z ? 1 : 0, i).zza();
    }

    /* renamed from: W */
    public final void mo33199W() {
        this.f34523i.mo35879m(6).zza();
    }

    /* renamed from: X */
    public final synchronized boolean mo33200X() {
        if (!this.f34537w) {
            if (this.f34524j.isAlive()) {
                this.f34523i.mo35880p(7);
                m34141D(new bw3(this), 500);
                return this.f34537w;
            }
        }
        return true;
    }

    /* renamed from: Y */
    public final void mo33201Y(List<yw3> list, int i, long j, u64 u64) {
        this.f34523i.mo35875e(17, new fw3(list, u64, i, j, (ew3) null, (byte[]) null)).zza();
    }

    /* renamed from: a */
    public final void mo33202a(h20 h20) {
        this.f34523i.mo35875e(16, h20).zza();
    }

    /* renamed from: b */
    public final synchronized void mo31050b(ex3 ex3) {
        if (!this.f34537w) {
            if (this.f34524j.isAlive()) {
                this.f34523i.mo35875e(14, ex3).zza();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ex3.mo31687h(false);
    }

    /* renamed from: d */
    public final void mo30309d(b54 b54) {
        this.f34523i.mo35875e(8, b54).zza();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32848f(t64 t64) {
        this.f34523i.mo35875e(9, (b54) t64).zza();
    }

    /* JADX WARNING: type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.i84, com.google.android.gms.internal.ads.mt1] */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0866, code lost:
        if (m34144G() != false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x08f5, code lost:
        if (r2 == false) goto L_0x08f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0450 A[Catch:{ all -> 0x04ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0453 A[Catch:{ all -> 0x04ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0815 A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0930 A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x097c A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0996 A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x09ad A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x09c7 A[Catch:{ all -> 0x037f, all -> 0x01b4, vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0818 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r49) {
        /*
            r48 = this;
            r11 = r48
            r1 = r49
            r13 = 0
            r14 = 1
            int r2 = r1.what     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = -1
            r15 = 0
            r10 = 3
            r9 = 4
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            switch(r2) {
                case 0: goto L_0x0a41;
                case 1: goto L_0x0a32;
                case 2: goto L_0x0505;
                case 3: goto L_0x03a7;
                case 4: goto L_0x0392;
                case 5: goto L_0x038a;
                case 6: goto L_0x0383;
                case 7: goto L_0x0365;
                case 8: goto L_0x030c;
                case 9: goto L_0x02f4;
                case 10: goto L_0x01ed;
                case 11: goto L_0x01d5;
                case 12: goto L_0x01b8;
                case 13: goto L_0x017a;
                case 14: goto L_0x014f;
                case 15: goto L_0x0121;
                case 16: goto L_0x0118;
                case 17: goto L_0x00da;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00a0;
                case 20: goto L_0x0088;
                case 21: goto L_0x0074;
                case 22: goto L_0x0069;
                case 23: goto L_0x0043;
                case 24: goto L_0x001c;
                case 25: goto L_0x0017;
                default: goto L_0x0015;
            }     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0015:
            r1 = 0
            return r1
        L_0x0017:
            r11.m34179t(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x001c:
            int r1 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != r14) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r2 = r11.f34507F     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == r2) goto L_0x0ad2
            r11.f34507F = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = r2.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x003b
            if (r3 == r9) goto L_0x003b
            if (r3 != r14) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo35880p(r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x003b:
            com.google.android.gms.internal.ads.bx3 r1 = r2.mo30816c(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0043:
            int r1 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            r11.f34538x = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34175p()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r11.f34539y     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0ad2
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == r2) goto L_0x0ad2
            r11.m34179t(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34168i(r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0069:
            com.google.android.gms.internal.ads.ax3 r1 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r1.mo30556b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0074:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.u64 r1 = (com.google.android.gms.internal.ads.u64) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r2 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.mo32779a(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r2 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r2.mo30566n(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0088:
            int r2 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = r1.arg2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.u64 r1 = (com.google.android.gms.internal.ads.u64) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r4 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4.mo32779a(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r4 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r4.mo30564l(r2, r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x00a0:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gw3 r1 = (com.google.android.gms.internal.ads.gw3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r2 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.mo32779a(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r2 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f32490a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r2.mo30563k(r13, r13, r13, r15)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x00b6:
            java.lang.Object r2 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.fw3 r2 = (com.google.android.gms.internal.ads.fw3) r2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r4 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4.mo32779a(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r4 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != r3) goto L_0x00c9
            int r1 = r4.mo30555a()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x00c9:
            java.util.List r3 = r2.f31904a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.u64 r2 = r2.f31907d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r4.mo30562j(r1, r3, r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x00da:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.fw3 r1 = (com.google.android.gms.internal.ads.fw3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r2 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.mo32779a(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r2 = r1.f31905b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == r3) goto L_0x0105
            com.google.android.gms.internal.ads.jw3 r2 = new com.google.android.gms.internal.ads.jw3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.fx3 r3 = new com.google.android.gms.internal.ads.fx3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.util.List r4 = r1.f31904a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.u64 r5 = r1.f31907d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3.<init>(r4, r5, r15)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r4 = r1.f31905b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r5 = r1.f31906c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.<init>(r3, r4, r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34509H = r2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0105:
            com.google.android.gms.internal.ads.ax3 r2 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.util.List r3 = r1.f31904a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.u64 r1 = r1.f31907d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r2.mo30565m(r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34169j(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0118:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r1 = (com.google.android.gms.internal.ads.h20) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34170k(r1, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0121:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ex3 r1 = (com.google.android.gms.internal.ads.ex3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            android.os.Looper r2 = r1.mo31681b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Thread r3 = r2.getThread()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r3.isAlive()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 != 0) goto L_0x013f
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo31687h(r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x013f:
            com.google.android.gms.internal.ads.ov1 r3 = r11.f34531q     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.y42 r2 = r3.mo34015a(r2, r15)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.cw3 r3 = new com.google.android.gms.internal.ads.cw3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3.<init>(r11, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.mo35874d(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x014f:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ex3 r1 = (com.google.android.gms.internal.ads.ex3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            android.os.Looper r2 = r1.mo31681b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            android.os.Looper r3 = r11.f34525k     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != r3) goto L_0x016d
            m34148K(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == r10) goto L_0x0166
            if (r1 != r7) goto L_0x0ad2
        L_0x0166:
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo35880p(r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x016d:
            com.google.android.gms.internal.ads.y42 r2 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 15
            com.google.android.gms.internal.ads.x32 r1 = r2.mo35875e(r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.zza()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x017a:
            int r2 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0180
            r2 = 1
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r11.f34505D     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == r2) goto L_0x01a8
            r11.f34505D = r2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != 0) goto L_0x01a8
            com.google.android.gms.internal.ads.hx3[] r2 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 0
        L_0x0190:
            if (r3 >= r7) goto L_0x01a8
            r4 = r2[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r5 = m34143F(r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 != 0) goto L_0x01a5
            java.util.Set<com.google.android.gms.internal.ads.hx3> r5 = r11.f34517c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r5 = r5.remove(r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 == 0) goto L_0x01a5
            r4.mo32475d()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x01a5:
            int r3 = r3 + 1
            goto L_0x0190
        L_0x01a8:
            if (r1 == 0) goto L_0x0ad2
            monitor-enter(r48)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.set(r14)     // Catch:{ all -> 0x01b4 }
            r48.notifyAll()     // Catch:{ all -> 0x01b4 }
            monitor-exit(r48)     // Catch:{ all -> 0x01b4 }
            goto L_0x0ad2
        L_0x01b4:
            r0 = move-exception
            r1 = r0
            monitor-exit(r48)     // Catch:{ all -> 0x01b4 }
            throw r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x01b8:
            int r1 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x01be
            r1 = 1
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            r11.f34504C = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r3 = r3.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r2.mo34824t(r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x01d0
            r11.m34179t(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x01d0:
            r11.m34168i(r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x01d5:
            int r1 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34503B = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r3 = r3.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r2.mo34823s(r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x01e8
            r11.m34179t(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x01e8:
            r11.m34168i(r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x01ed:
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r1 = r1.zzc()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            float r1 = r1.f32590a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r3 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r3 = r3.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4 = 1
        L_0x0202:
            if (r2 == 0) goto L_0x0ad2
            boolean r5 = r2.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 == 0) goto L_0x0ad2
            com.google.android.gms.internal.ads.bx3 r5 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r5 = r5.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r5 = r2.mo34203j(r1, r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r6 = r2.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x0239
            com.google.android.gms.internal.ads.e74[] r8 = r6.f42341e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r8 = r8.length     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.e74[] r10 = r5.f42341e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r10 = r10.length     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r8 == r10) goto L_0x021f
            goto L_0x0239
        L_0x021f:
            r8 = 0
        L_0x0220:
            com.google.android.gms.internal.ads.e74[] r10 = r5.f42341e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r10 = r10.length     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r8 >= r10) goto L_0x022e
            boolean r10 = r5.mo36020a(r6, r8)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r10 == 0) goto L_0x0239
            int r8 = r8 + 1
            goto L_0x0220
        L_0x022e:
            if (r2 != r3) goto L_0x0232
            r5 = 0
            goto L_0x0233
        L_0x0232:
            r5 = 1
        L_0x0233:
            r4 = r4 & r5
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0202
        L_0x0239:
            if (r4 == 0) goto L_0x02bf
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r10 = r1.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r19 = r1.mo34820p(r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean[] r8 = new boolean[r7]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r1 = r1.f30169s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r15 = r10
            r16 = r5
            r17 = r1
            r20 = r8
            long r5 = r15.mo34195b(r16, r17, r19, r20)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r2 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == r9) goto L_0x0266
            long r1 = r1.f30169s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0266
            r15 = 1
            goto L_0x0267
        L_0x0266:
            r15 = 0
        L_0x0267:
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r2 = r1.f30152b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r3 = r1.f30153c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r16 = r8
            long r7 = r1.f30154d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r17 = 5
            r1 = r48
            r19 = r3
            r3 = r5
            r12 = r5
            r5 = r19
            r14 = 2
            r9 = r15
            r22 = r10
            r10 = r17
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r15 == 0) goto L_0x028c
            r11.m34176q(r12)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x028c:
            boolean[] r1 = new boolean[r14]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 0
        L_0x028f:
            com.google.android.gms.internal.ads.hx3[] r3 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 >= r14) goto L_0x02bb
            r3 = r3[r2]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r4 = m34143F(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1[r2] = r4     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r22
            com.google.android.gms.internal.ads.r64[] r6 = r5.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = r6[r2]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 == 0) goto L_0x02b6
            com.google.android.gms.internal.ads.r64 r4 = r3.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == r4) goto L_0x02ad
            r11.m34158c(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x02b6
        L_0x02ad:
            boolean r4 = r16[r2]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 == 0) goto L_0x02b6
            long r6 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3.mo32479h(r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x02b6:
            int r2 = r2 + 1
            r22 = r5
            goto L_0x028f
        L_0x02bb:
            r11.m34164g(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x02dc
        L_0x02bf:
            r14 = 2
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo34820p(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r2.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x02dc
            com.google.android.gms.internal.ads.qw3 r1 = r2.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r3 = r1.f38302b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r6 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r8 = r2.mo34198e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r6 = r6 - r8
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1 = 0
            r2.mo34194a(r5, r3, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x02dc:
            r1 = 1
            r11.m34168i(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r12 = 4
            if (r1 == r12) goto L_0x0ad2
            r48.m34172m()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34140C()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo35880p(r14)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x02f4:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.b54 r1 = (com.google.android.gms.internal.ads.b54) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r2.mo34819o(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0ad2
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r2 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo34818n(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34172m()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x030c:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.b54 r1 = (com.google.android.gms.internal.ads.b54) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r2.mo34819o(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0ad2
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34810f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ti3 r2 = r11.f34529o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r2 = r2.zzc()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            float r2 = r2.f32590a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r3 = r3.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo34205l(r2, r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.cm0 r2 = r1.mo34200g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r3 = r1.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34139B(r2, r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != r2) goto L_0x0360
            com.google.android.gms.internal.ads.qw3 r2 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r2 = r2.f38302b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34176q(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34161e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r3 = r2.f30152b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r7 = r1.f38302b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r5 = r2.f30153c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r9 = 0
            r10 = 5
            r1 = r48
            r2 = r3
            r3 = r7
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0360:
            r48.m34172m()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0365:
            r1 = 0
            r2 = 1
            r11.m34174o(r2, r1, r2, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.nw3 r1 = r11.f34521g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.zzc()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34181v(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            android.os.HandlerThread r1 = r11.f34524j     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.quit()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            monitor-enter(r48)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34537w = r2     // Catch:{ all -> 0x037f }
            r48.notifyAll()     // Catch:{ all -> 0x037f }
            monitor-exit(r48)     // Catch:{ all -> 0x037f }
            return r2
        L_0x037f:
            r0 = move-exception
            r1 = r0
            monitor-exit(r48)     // Catch:{ all -> 0x037f }
            throw r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0383:
            r1 = 0
            r2 = 1
            r11.m34183x(r1, r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.kx3 r1 = (com.google.android.gms.internal.ads.kx3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34534t = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0392:
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r1 = (com.google.android.gms.internal.ads.h20) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ti3 r2 = r11.f34529o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.mo34017r(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ti3 r1 = r11.f34529o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r1 = r1.zzc()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 1
            r11.m34170k(r1, r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x03a7:
            r12 = 4
            r14 = 2
            java.lang.Object r1 = r1.obj     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.jw3 r1 = (com.google.android.gms.internal.ads.jw3) r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.iw3 r2 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 1
            r2.mo32779a(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r2 = r2.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4 = 1
            int r5 = r11.f34503B     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = r11.f34504C     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gh0 r7 = r11.f34526l     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gf0 r8 = r11.f34527m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = r1
            android.util.Pair r2 = m34165g0(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 0
            if (r2 != 0) goto L_0x03f0
            com.google.android.gms.internal.ads.bx3 r5 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r5 = r5.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            android.util.Pair r5 = r11.m34163f0(r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Object r6 = r5.first     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r6 = (com.google.android.gms.internal.ads.c54) r6     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Object r5 = r5.second     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r7 = r5.longValue()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r5 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r5 = r5.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r5 = r5.mo32145o()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r9 = 1
            r5 = r5 ^ r9
            r9 = r5
            r14 = r16
            r46 = r7
            r8 = r6
        L_0x03ed:
            r5 = r46
            goto L_0x0446
        L_0x03f0:
            java.lang.Object r5 = r2.first     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Object r6 = r2.second     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r7 = r6.longValue()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r14 = r1.f34068c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0403
            r14 = r16
            goto L_0x0404
        L_0x0403:
            r14 = r7
        L_0x0404:
            com.google.android.gms.internal.ads.sw3 r6 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r9 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r9 = r9.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r5 = r6.mo34815k(r9, r5, r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = r5.mo33183b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x0434
            com.google.android.gms.internal.ads.bx3 r6 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r6 = r6.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.Object r7 = r5.f34474a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gf0 r8 = r11.f34527m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6.mo32144n(r7, r8)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gf0 r6 = r11.f34527m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r7 = r5.f34475b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = r6.mo32104d(r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r7 = r5.f34476c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 != r7) goto L_0x0430
            com.google.android.gms.internal.ads.gf0 r6 = r11.f34527m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6.mo32109h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0430:
            r8 = r5
            r9 = 1
            r5 = r3
            goto L_0x0446
        L_0x0434:
            r19 = r14
            long r13 = r1.f34068c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x043e
            r6 = 1
            goto L_0x043f
        L_0x043e:
            r6 = 0
        L_0x043f:
            r9 = r6
            r14 = r19
            r46 = r7
            r8 = r5
            goto L_0x03ed
        L_0x0446:
            com.google.android.gms.internal.ads.bx3 r7 = r11.f34535u     // Catch:{ all -> 0x04ee }
            com.google.android.gms.internal.ads.gi0 r7 = r7.f30151a     // Catch:{ all -> 0x04ee }
            boolean r7 = r7.mo32145o()     // Catch:{ all -> 0x04ee }
            if (r7 == 0) goto L_0x0453
            r11.f34509H = r1     // Catch:{ all -> 0x04ee }
            goto L_0x0463
        L_0x0453:
            if (r2 != 0) goto L_0x0466
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ all -> 0x04ee }
            int r1 = r1.f30155e     // Catch:{ all -> 0x04ee }
            r2 = 1
            if (r1 == r2) goto L_0x045f
            r11.m34181v(r12)     // Catch:{ all -> 0x04ee }
        L_0x045f:
            r1 = 0
            r11.m34174o(r1, r2, r1, r2)     // Catch:{ all -> 0x04ee }
        L_0x0463:
            r12 = r5
            goto L_0x04d9
        L_0x0466:
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ all -> 0x04ee }
            com.google.android.gms.internal.ads.c54 r1 = r1.f30152b     // Catch:{ all -> 0x04ee }
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x04b4
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ all -> 0x04ee }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34811g()     // Catch:{ all -> 0x04ee }
            if (r1 == 0) goto L_0x0489
            boolean r2 = r1.f37784d     // Catch:{ all -> 0x04ee }
            if (r2 == 0) goto L_0x0489
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0489
            com.google.android.gms.internal.ads.b54 r1 = r1.f37781a     // Catch:{ all -> 0x04ee }
            com.google.android.gms.internal.ads.kx3 r2 = r11.f34534t     // Catch:{ all -> 0x04ee }
            long r1 = r1.mo18205g(r5, r2)     // Catch:{ all -> 0x04ee }
            goto L_0x048a
        L_0x0489:
            r1 = r5
        L_0x048a:
            long r3 = com.google.android.gms.internal.ads.xy3.m39692d(r1)     // Catch:{ all -> 0x04ee }
            com.google.android.gms.internal.ads.bx3 r7 = r11.f34535u     // Catch:{ all -> 0x04ee }
            long r12 = r7.f30169s     // Catch:{ all -> 0x04ee }
            long r12 = com.google.android.gms.internal.ads.xy3.m39692d(r12)     // Catch:{ all -> 0x04ee }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x04b5
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ all -> 0x04ee }
            int r4 = r3.f30155e     // Catch:{ all -> 0x04ee }
            r7 = 2
            if (r4 == r7) goto L_0x04a3
            if (r4 != r10) goto L_0x04b5
        L_0x04a3:
            long r12 = r3.f30169s     // Catch:{ all -> 0x04ee }
            r10 = 2
            r1 = r48
            r2 = r8
            r3 = r12
            r5 = r14
            r7 = r12
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x04b0:
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x04b4:
            r1 = r5
        L_0x04b5:
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ all -> 0x04ee }
            int r3 = r3.f30155e     // Catch:{ all -> 0x04ee }
            r4 = 4
            if (r3 != r4) goto L_0x04be
            r3 = 1
            goto L_0x04bf
        L_0x04be:
            r3 = 0
        L_0x04bf:
            long r12 = r11.m34160d0(r8, r1, r3)     // Catch:{ all -> 0x04ee }
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x04c9
            r1 = 1
            goto L_0x04ca
        L_0x04c9:
            r1 = 0
        L_0x04ca:
            r9 = r9 | r1
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ all -> 0x04e5 }
            com.google.android.gms.internal.ads.gi0 r4 = r1.f30151a     // Catch:{ all -> 0x04e5 }
            com.google.android.gms.internal.ads.c54 r5 = r1.f30152b     // Catch:{ all -> 0x04e5 }
            r1 = r48
            r2 = r4
            r3 = r8
            r6 = r14
            r1.m34138A(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x04e5 }
        L_0x04d9:
            r10 = 2
            r1 = r48
            r2 = r8
            r3 = r12
            r5 = r14
            r7 = r12
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x04b0
        L_0x04e5:
            r0 = move-exception
            r1 = r0
            r46 = r12
            r12 = r1
            r13 = r9
            r9 = r46
            goto L_0x04f3
        L_0x04ee:
            r0 = move-exception
            r1 = r0
            r12 = r1
            r13 = r9
            r9 = r5
        L_0x04f3:
            r16 = 2
            r1 = r48
            r2 = r8
            r3 = r9
            r5 = r14
            r7 = r9
            r9 = r13
            r10 = r16
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            throw r12     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0505:
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r1.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.mo32145o()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x077f
            com.google.android.gms.internal.ads.ax3 r1 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.mo30561i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x051d
            goto L_0x077f
        L_0x051d:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r2 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo34818n(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.mo34821q()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0572
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r2 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r4 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r1.mo34813i(r2, r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0572
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ix3[] r3 = r11.f34518d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.y74 r4 = r11.f34519e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.nw3 r5 = r11.f34521g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.o84 r25 = r5.zzh()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r5 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r6 = r11.f34520f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r22 = r2
            r23 = r3
            r24 = r4
            r26 = r5
            r27 = r1
            r28 = r6
            com.google.android.gms.internal.ads.pw3 r2 = r22.mo34825u(r23, r24, r25, r26, r27, r28)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.b54 r3 = r2.f37781a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r4 = r1.f38302b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3.mo18209k(r11, r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != r2) goto L_0x056e
            long r1 = r2.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.m34176q(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x056e:
            r1 = 0
            r11.m34168i(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0572:
            boolean r1 = r11.f34502A     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0580
            boolean r1 = r48.m34142E()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34502A = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34185z()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0583
        L_0x0580:
            r48.m34172m()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0583:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x058d
            goto L_0x0694
        L_0x058d:
            com.google.android.gms.internal.ads.pw3 r2 = r1.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0650
            boolean r2 = r11.f34539y     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0599
            goto L_0x0650
        L_0x0599:
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r2.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0694
            r3 = 0
        L_0x05a4:
            com.google.android.gms.internal.ads.hx3[] r4 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = 2
            if (r3 >= r5) goto L_0x05c9
            r4 = r4[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64[] r5 = r2.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r5[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64 r6 = r4.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 != r5) goto L_0x0694
            if (r5 == 0) goto L_0x05c6
            boolean r4 = r4.mo32473b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 != 0) goto L_0x05c6
            r2.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r2.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.f38306f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0694
        L_0x05c6:
            int r3 = r3 + 1
            goto L_0x05a4
        L_0x05c9:
            com.google.android.gms.internal.ads.pw3 r2 = r1.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r2 = r2.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != 0) goto L_0x05df
            long r2 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r4 = r1.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r4 = r4.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0694
        L_0x05df:
            com.google.android.gms.internal.ads.z74 r1 = r1.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34809e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r3 = r2.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r4 = r2.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 == 0) goto L_0x0613
            com.google.android.gms.internal.ads.b54 r4 = r2.f37781a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r4 = r4.zzd()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0613
            long r1 = r2.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.hx3[] r3 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4 = 0
        L_0x0602:
            r5 = 2
            if (r4 >= r5) goto L_0x0694
            r5 = r3[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64 r6 = r5.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x0610
            m34150M(r5, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0610:
            int r4 = r4 + 1
            goto L_0x0602
        L_0x0613:
            r4 = 0
        L_0x0614:
            r5 = 2
            if (r4 >= r5) goto L_0x0694
            boolean r5 = r1.mo36021b(r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = r3.mo36021b(r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 == 0) goto L_0x064d
            com.google.android.gms.internal.ads.hx3[] r5 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r5[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r5 = r5.mo32482q()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 != 0) goto L_0x064d
            com.google.android.gms.internal.ads.ix3[] r5 = r11.f34518d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r5[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5.zzb()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.jx3[] r5 = r1.f42338b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r5[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.jx3[] r9 = r3.f42338b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r9 = r9[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x0642
            boolean r5 = r9.equals(r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 != 0) goto L_0x064d
        L_0x0642:
            com.google.android.gms.internal.ads.hx3[] r5 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r5 = r5[r4]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r13 = r2.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            m34150M(r5, r13)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x064d:
            int r4 = r4 + 1
            goto L_0x0614
        L_0x0650:
            com.google.android.gms.internal.ads.qw3 r2 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r2 = r2.f38309i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != 0) goto L_0x065a
            boolean r2 = r11.f34539y     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0694
        L_0x065a:
            r2 = 0
        L_0x065b:
            com.google.android.gms.internal.ads.hx3[] r3 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4 = 2
            if (r2 >= r4) goto L_0x0694
            r3 = r3[r2]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64[] r4 = r1.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r4 = r4[r2]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 == 0) goto L_0x0691
            com.google.android.gms.internal.ads.r64 r5 = r3.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r5 != r4) goto L_0x0691
            boolean r4 = r3.mo32473b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r4 == 0) goto L_0x0691
            com.google.android.gms.internal.ads.qw3 r4 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r4 = r4.f38305e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x068c
            r19 = -9223372036854775808
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 == 0) goto L_0x068c
            long r4 = r1.mo34198e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r6 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r13 = r6.f38305e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r4 = r4 + r13
            goto L_0x068e
        L_0x068c:
            r4 = r16
        L_0x068e:
            m34150M(r3, r4)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0691:
            int r2 = r2 + 1
            goto L_0x065b
        L_0x0694:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x0706
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == r1) goto L_0x0706
            boolean r1 = r1.f37787g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x06a9
            goto L_0x0706
        L_0x06a9:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34812h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r2 = r1.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 0
            r4 = 0
        L_0x06b5:
            com.google.android.gms.internal.ads.hx3[] r5 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = 2
            if (r3 >= r6) goto L_0x0701
            r5 = r5[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = m34143F(r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.r64 r6 = r5.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64[] r9 = r1.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r9 = r9[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r12 = r2.mo36021b(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r12 == 0) goto L_0x06d3
            if (r6 != r9) goto L_0x06d3
            goto L_0x06fe
        L_0x06d3:
            boolean r6 = r5.mo32482q()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 != 0) goto L_0x06f3
            com.google.android.gms.internal.ads.e74[] r6 = r2.f42341e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = r6[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.w[] r23 = m34151N(r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64[] r6 = r1.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r24 = r6[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r25 = r1.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r27 = r1.mo34198e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r22 = r5
            r22.mo32476e(r23, r24, r25, r27)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x06fe
        L_0x06f3:
            boolean r6 = r5.zzL()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x06fd
            r11.m34158c(r5)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x06fe
        L_0x06fd:
            r4 = 1
        L_0x06fe:
            int r3 = r3 + 1
            goto L_0x06b5
        L_0x0701:
            if (r4 != 0) goto L_0x0706
            r48.m34161e()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0706:
            r1 = 0
        L_0x0707:
            boolean r2 = r48.m34146I()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x077f
            boolean r2 = r11.f34539y     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != 0) goto L_0x077f
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x077f
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x077f
            long r3 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r5 = r2.mo34199f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x077f
            boolean r2 = r2.f37787g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x077f
            if (r1 == 0) goto L_0x0732
            r48.m34173n()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0732:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r12 = r1.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r14 = r1.mo34808d()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r14.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r2 = r1.f38301a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r5 = r1.f38302b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r3 = r1.f38303c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r9 = 1
            r19 = 0
            r1 = r48
            r22 = r3
            r3 = r5
            r24 = r5
            r5 = r22
            r29 = r7
            r7 = r24
            r13 = 3
            r10 = r19
            com.google.android.gms.internal.ads.bx3 r1 = r1.m34167h0(r2, r3, r5, r7, r9, r10)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r4 = r1.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r14.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r3 = r1.f38301a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r1 = r12.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r5 = r1.f38301a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r48
            r2 = r4
            r1.m34138A(r2, r3, r4, r5, r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34175p()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34140C()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = r29
            r1 = 1
            r10 = 3
            goto L_0x0707
        L_0x077f:
            r29 = r7
            r13 = 3
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 1
            if (r1 == r2) goto L_0x0a2a
            r2 = 4
            if (r1 != r2) goto L_0x078e
            goto L_0x0a2a
        L_0x078e:
            com.google.android.gms.internal.ads.sw3 r1 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r1 = r1.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 10
            if (r1 != 0) goto L_0x079f
            r4 = r29
            r11.m34178s(r4, r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x079f:
            r4 = r29
            java.lang.String r6 = "doSomeWork"
            com.google.android.gms.internal.ads.bz2.m30876a(r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34140C()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = r1.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x081c
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r9 = r9 * r7
            com.google.android.gms.internal.ads.b54 r6 = r1.f37781a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r12 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r7 = r12.f30169s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r2 = r11.f34528n     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r7 = r7 - r2
            r2 = 0
            r6.mo18207i(r7, r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 1
            r3 = 1
            r6 = 0
        L_0x07c5:
            com.google.android.gms.internal.ads.hx3[] r7 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r8 = 2
            if (r6 >= r8) goto L_0x0823
            r7 = r7[r6]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r12 = m34143F(r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r12 != 0) goto L_0x07d3
            goto L_0x0818
        L_0x07d3:
            long r13 = r11.f34510I     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7.mo32478g(r13, r9)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x07e2
            boolean r3 = r7.zzL()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x07e2
            r3 = 1
            goto L_0x07e3
        L_0x07e2:
            r3 = 0
        L_0x07e3:
            com.google.android.gms.internal.ads.r64[] r13 = r1.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r13 = r13[r6]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64 r14 = r7.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r13 != r14) goto L_0x07f6
            boolean r24 = r7.mo32473b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r24 == 0) goto L_0x07f6
            r24 = 1
            goto L_0x07f8
        L_0x07f6:
            r24 = 0
        L_0x07f8:
            if (r13 != r14) goto L_0x080b
            if (r24 != 0) goto L_0x080b
            boolean r13 = r7.mo32483u()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r13 != 0) goto L_0x080b
            boolean r13 = r7.zzL()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r13 == 0) goto L_0x0809
            goto L_0x080b
        L_0x0809:
            r13 = 0
            goto L_0x080c
        L_0x080b:
            r13 = 1
        L_0x080c:
            if (r2 == 0) goto L_0x0812
            if (r13 == 0) goto L_0x0812
            r2 = 1
            goto L_0x0813
        L_0x0812:
            r2 = 0
        L_0x0813:
            if (r13 != 0) goto L_0x0818
            r7.zzp()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0818:
            int r6 = r6 + 1
            r13 = 3
            goto L_0x07c5
        L_0x081c:
            com.google.android.gms.internal.ads.b54 r2 = r1.f37781a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2.zzj()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 1
            r3 = 1
        L_0x0823:
            com.google.android.gms.internal.ads.qw3 r6 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r6 = r6.f38305e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0857
            boolean r3 = r1.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0857
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x0839
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r9 = r3.f30169s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0857
        L_0x0839:
            boolean r3 = r11.f34539y     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0848
            r3 = 0
            r11.f34539y = r3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r6 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = r6.f30163m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = 5
            r11.m34180u(r3, r6, r3, r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0848:
            com.google.android.gms.internal.ads.qw3 r3 = r1.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r3.f38309i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0857
            r3 = 4
            r11.m34181v(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r48.m34184y()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0929
        L_0x0857:
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r6 = r3.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = 2
            if (r6 != r7) goto L_0x08e3
            int r7 = r11.f34508G     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r7 != 0) goto L_0x086b
            boolean r3 = r48.m34144G()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x08e3
        L_0x0868:
            r2 = 3
            goto L_0x08d4
        L_0x086b:
            if (r2 != 0) goto L_0x086f
            goto L_0x08e3
        L_0x086f:
            boolean r7 = r3.f30157g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r7 == 0) goto L_0x0868
            com.google.android.gms.internal.ads.gi0 r3 = r3.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.sw3 r7 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r7 = r7.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.qw3 r7 = r7.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r7 = r7.f38301a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r11.m34147J(r3, r7)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x088b
            com.google.android.gms.internal.ads.qf3 r3 = r11.f34515N     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r16 = r3.mo34338b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x088b:
            r29 = r16
            com.google.android.gms.internal.ads.sw3 r3 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r3 = r3.mo34810f()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r7 = r3.mo34211r()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r7 == 0) goto L_0x08a1
            com.google.android.gms.internal.ads.qw3 r7 = r3.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r7 = r7.f38309i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r7 == 0) goto L_0x08a1
            r7 = 1
            goto L_0x08a2
        L_0x08a1:
            r7 = 0
        L_0x08a2:
            com.google.android.gms.internal.ads.qw3 r8 = r3.f37786f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r8 = r8.f38301a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r8 = r8.mo33183b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r8 == 0) goto L_0x08b2
            boolean r3 = r3.f37784d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 != 0) goto L_0x08b2
            r3 = 1
            goto L_0x08b3
        L_0x08b2:
            r3 = 0
        L_0x08b3:
            if (r7 != 0) goto L_0x0868
            if (r3 != 0) goto L_0x0868
            com.google.android.gms.internal.ads.nw3 r3 = r11.f34521g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r25 = r48.m34157b0()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ti3 r7 = r11.f34529o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.h20 r7 = r7.zzc()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            float r7 = r7.f32590a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r8 = r11.f34540z     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r24 = r3
            r27 = r7
            r28 = r8
            boolean r3 = r24.mo33774b(r25, r27, r28, r29)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x08e3
            goto L_0x0868
        L_0x08d4:
            r11.m34181v(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34513L = r15     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r2 = r48.m34146I()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0929
            r48.m34182w()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0929
        L_0x08e3:
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = r3.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = 3
            if (r3 != r7) goto L_0x0929
            int r3 = r11.f34508G     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 != 0) goto L_0x08f5
            boolean r2 = r48.m34144G()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 != 0) goto L_0x0929
            goto L_0x08f7
        L_0x08f5:
            if (r2 != 0) goto L_0x0929
        L_0x08f7:
            boolean r2 = r48.m34146I()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34540z = r2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            r11.m34181v(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r11.f34540z     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == 0) goto L_0x0926
            com.google.android.gms.internal.ads.sw3 r3 = r11.f34532r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.pw3 r3 = r3.mo34811g()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x090b:
            if (r3 == 0) goto L_0x0921
            com.google.android.gms.internal.ads.z74 r6 = r3.mo34202i()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.e74[] r6 = r6.f42341e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r7 = r6.length     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r8 = 0
        L_0x0915:
            if (r8 >= r7) goto L_0x091c
            r9 = r6[r8]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r8 = r8 + 1
            goto L_0x0915
        L_0x091c:
            com.google.android.gms.internal.ads.pw3 r3 = r3.mo34201h()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x090b
        L_0x0921:
            com.google.android.gms.internal.ads.qf3 r3 = r11.f34515N     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3.mo34339c()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0926:
            r48.m34184y()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0929:
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r3 = r3.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            if (r3 != r2) goto L_0x0974
            r3 = 0
        L_0x0931:
            com.google.android.gms.internal.ads.hx3[] r6 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 >= r2) goto L_0x0956
            r6 = r6[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = m34143F(r6)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 == 0) goto L_0x0952
            com.google.android.gms.internal.ads.hx3[] r6 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = r6[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64 r6 = r6.zzl()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.r64[] r7 = r1.f37783c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r7 = r7[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r6 != r7) goto L_0x0952
            com.google.android.gms.internal.ads.hx3[] r6 = r11.f34516b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6 = r6[r3]     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r6.zzp()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0952:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x0931
        L_0x0956:
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r1.f30157g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 != 0) goto L_0x0974
            long r6 = r1.f30168r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0974
            boolean r1 = r48.m34142E()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 != 0) goto L_0x096c
            goto L_0x0974
        L_0x096c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            throw r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0974:
            boolean r1 = r11.f34507F     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r3 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r6 = r3.f30165o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == r6) goto L_0x0982
            com.google.android.gms.internal.ads.bx3 r1 = r3.mo30816c(r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0982:
            boolean r1 = r48.m34146I()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x098f
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 3
            if (r1 == r3) goto L_0x0996
        L_0x098f:
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r1 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            if (r1 != r2) goto L_0x09ad
        L_0x0996:
            boolean r1 = r11.f34507F     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x09a2
            boolean r1 = r11.f34506E     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r1 == 0) goto L_0x09a2
            r1 = 1
            r18 = 0
            goto L_0x09aa
        L_0x09a2:
            r1 = 10
            r11.m34178s(r4, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1 = 1
            r18 = 1
        L_0x09aa:
            r2 = r18 ^ 1
            goto L_0x09c1
        L_0x09ad:
            int r2 = r11.f34508G     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x09ba
            r2 = 4
            if (r1 == r2) goto L_0x09ba
            r1 = 1000(0x3e8, double:4.94E-321)
            r11.m34178s(r4, r1)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x09c0
        L_0x09ba:
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            r1.mo35878l(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x09c0:
            r2 = 0
        L_0x09c1:
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r3 = r1.f30166p     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r3 == r2) goto L_0x0a22
            com.google.android.gms.internal.ads.bx3 r3 = new com.google.android.gms.internal.ads.bx3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r4 = r1.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.c54 r5 = r1.f30152b     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r6 = r1.f30153c     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            long r8 = r1.f30154d     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            int r10 = r1.f30155e     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.vk3 r12 = r1.f30156f     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r13 = r1.f30157g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.cm0 r14 = r1.f30158h     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.z74 r15 = r1.f30159i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r16 = r2
            java.util.List<com.google.android.gms.internal.ads.zzdd> r2 = r1.f30160j     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r17 = r2
            com.google.android.gms.internal.ads.c54 r2 = r1.f30161k     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r19 = r2
            boolean r2 = r1.f30162l     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r20 = r2
            int r2 = r1.f30163m     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r36 = r2
            com.google.android.gms.internal.ads.h20 r2 = r1.f30164n     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r31 = r14
            r32 = r15
            long r14 = r1.f30167q     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r38 = r14
            long r14 = r1.f30168r     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r40 = r14
            long r14 = r1.f30169s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.f30165o     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r26 = r8
            r28 = r10
            r29 = r12
            r30 = r13
            r33 = r17
            r34 = r19
            r35 = r20
            r37 = r2
            r42 = r14
            r44 = r1
            r45 = r16
            r21.<init>(r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r11.f34535u = r3     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
        L_0x0a22:
            r1 = 0
            r11.f34506E = r1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0a2a:
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            r1.mo35878l(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0a32:
            int r2 = r1.arg1     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            if (r2 == 0) goto L_0x0a38
            r2 = 1
            goto L_0x0a39
        L_0x0a38:
            r2 = 0
        L_0x0a39:
            int r1 = r1.arg2     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 1
            r11.m34180u(r2, r1, r3, r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0a41:
            r2 = 4
            com.google.android.gms.internal.ads.iw3 r1 = r11.f34536v     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 1
            r1.mo32779a(r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1 = 0
            r11.m34174o(r1, r1, r1, r3)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.nw3 r1 = r11.f34521g     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.zzb()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.bx3 r1 = r11.f34535u     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.gi0 r1 = r1.f30151a     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            boolean r1 = r1.mo32145o()     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r3 = 1
            if (r3 == r1) goto L_0x0a5e
            r9 = 2
            goto L_0x0a5f
        L_0x0a5e:
            r9 = 4
        L_0x0a5f:
            r11.m34181v(r9)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.ax3 r1 = r11.f34533s     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.i84 r2 = r11.f34522h     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r1.mo30558f(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            com.google.android.gms.internal.ads.y42 r1 = r11.f34523i     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            r2 = 2
            r1.mo35880p(r2)     // Catch:{ vk3 -> 0x0ad4, d24 -> 0x0acb, iy -> 0x0ab4, ze1 -> 0x0aac, g44 -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a71 }
            goto L_0x0ad2
        L_0x0a71:
            r0 = move-exception
            r1 = r0
            boolean r2 = r1 instanceof java.lang.IllegalStateException
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r2 != 0) goto L_0x0a81
            boolean r2 = r1 instanceof java.lang.IllegalArgumentException
            if (r2 == 0) goto L_0x0a7e
            goto L_0x0a81
        L_0x0a7e:
            r12 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0a83
        L_0x0a81:
            r12 = 1004(0x3ec, float:1.407E-42)
        L_0x0a83:
            com.google.android.gms.internal.ads.vk3 r1 = com.google.android.gms.internal.ads.vk3.m38833d(r1, r12)
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.android.gms.internal.ads.fc2.m20475a(r2, r3, r1)
            r2 = 0
            r3 = 1
            r11.m34183x(r3, r2)
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u
            com.google.android.gms.internal.ads.bx3 r1 = r2.mo30818e(r1)
            r11.f34535u = r1
            goto L_0x0ad2
        L_0x0a9c:
            r0 = move-exception
            r1 = r0
            r2 = 2000(0x7d0, float:2.803E-42)
            r11.m34166h(r1, r2)
            goto L_0x0ad2
        L_0x0aa4:
            r0 = move-exception
            r1 = r0
            r2 = 1002(0x3ea, float:1.404E-42)
            r11.m34166h(r1, r2)
            goto L_0x0ad2
        L_0x0aac:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f42444b
            r11.m34166h(r1, r2)
            goto L_0x0ad2
        L_0x0ab4:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f33553c
            r3 = 1
            if (r2 != r3) goto L_0x0ac5
            boolean r2 = r1.f33552b
            if (r3 == r2) goto L_0x0ac2
            r12 = 3003(0xbbb, float:4.208E-42)
            goto L_0x0ac7
        L_0x0ac2:
            r12 = 3001(0xbb9, float:4.205E-42)
            goto L_0x0ac7
        L_0x0ac5:
            r12 = 1000(0x3e8, float:1.401E-42)
        L_0x0ac7:
            r11.m34166h(r1, r12)
            goto L_0x0ad2
        L_0x0acb:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f30620b
            r11.m34166h(r1, r2)
        L_0x0ad2:
            r3 = 1
            goto L_0x0b21
        L_0x0ad4:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f40451e
            r3 = 1
            if (r2 != r3) goto L_0x0aeb
            com.google.android.gms.internal.ads.sw3 r2 = r11.f34532r
            com.google.android.gms.internal.ads.pw3 r2 = r2.mo34812h()
            if (r2 == 0) goto L_0x0aeb
            com.google.android.gms.internal.ads.qw3 r2 = r2.f37786f
            com.google.android.gms.internal.ads.c54 r2 = r2.f38301a
            com.google.android.gms.internal.ads.vk3 r1 = r1.mo35436a(r2)
        L_0x0aeb:
            boolean r2 = r1.f40457k
            if (r2 == 0) goto L_0x0b08
            com.google.android.gms.internal.ads.vk3 r2 = r11.f34513L
            if (r2 != 0) goto L_0x0b08
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Recoverable renderer error"
            com.google.android.gms.internal.ads.fc2.m20476b(r2, r3, r1)
            r11.f34513L = r1
            com.google.android.gms.internal.ads.y42 r2 = r11.f34523i
            r3 = 25
            com.google.android.gms.internal.ads.x32 r1 = r2.mo35875e(r3, r1)
            r2.mo35877g(r1)
            goto L_0x0ad2
        L_0x0b08:
            com.google.android.gms.internal.ads.vk3 r2 = r11.f34513L
            if (r2 == 0) goto L_0x0b0d
            r1 = r2
        L_0x0b0d:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.android.gms.internal.ads.fc2.m20475a(r2, r3, r1)
            r2 = 0
            r3 = 1
            r11.m34183x(r3, r2)
            com.google.android.gms.internal.ads.bx3 r2 = r11.f34535u
            com.google.android.gms.internal.ads.bx3 r1 = r2.mo30818e(r1)
            r11.f34535u = r1
        L_0x0b21:
            r48.m34173n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw3.handleMessage(android.os.Message):boolean");
    }

    public final void zzh() {
        this.f34523i.mo35880p(22);
    }

    public final void zzj() {
        this.f34523i.mo35880p(10);
    }
}
