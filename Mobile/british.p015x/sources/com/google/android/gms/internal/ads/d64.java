package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d64 implements b54, yb4, z84, f94, p64 {
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static final Map<String, String> f20216M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final C8281w f20217N;

    /* renamed from: A */
    private boolean f20218A;

    /* renamed from: B */
    private boolean f20219B;

    /* renamed from: C */
    private int f20220C;

    /* renamed from: D */
    private long f20221D;

    /* renamed from: E */
    private long f20222E;

    /* renamed from: F */
    private long f20223F;

    /* renamed from: G */
    private boolean f20224G;

    /* renamed from: H */
    private int f20225H;

    /* renamed from: I */
    private boolean f20226I;

    /* renamed from: J */
    private boolean f20227J;

    /* renamed from: K */
    private final u84 f20228K;

    /* renamed from: L */
    private final o84 f20229L;

    /* renamed from: b */
    private final Uri f20230b;

    /* renamed from: c */
    private final yd1 f20231c;

    /* renamed from: d */
    private final l24 f20232d;

    /* renamed from: e */
    private final m54 f20233e;

    /* renamed from: f */
    private final f24 f20234f;

    /* renamed from: g */
    private final z54 f20235g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f20236h;

    /* renamed from: i */
    private final i94 f20237i = new i94("ProgressiveMediaPeriod");

    /* renamed from: j */
    private final u54 f20238j;

    /* renamed from: k */
    private final rx1 f20239k;

    /* renamed from: l */
    private final Runnable f20240l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Runnable f20241m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Handler f20242n;

    /* renamed from: o */
    private a54 f20243o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public zzzd f20244p;

    /* renamed from: q */
    private q64[] f20245q;

    /* renamed from: r */
    private b64[] f20246r;

    /* renamed from: s */
    private boolean f20247s;

    /* renamed from: t */
    private boolean f20248t;

    /* renamed from: u */
    private boolean f20249u;

    /* renamed from: v */
    private c64 f20250v;

    /* renamed from: w */
    private wc4 f20251w;

    /* renamed from: x */
    private long f20252x;

    /* renamed from: y */
    private boolean f20253y;

    /* renamed from: z */
    private int f20254z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        f20216M = Collections.unmodifiableMap(hashMap);
        ge4 ge4 = new ge4();
        ge4.mo32081h("icy");
        ge4.mo32093s(MimeTypes.APPLICATION_ICY);
        f20217N = ge4.mo32099y();
    }

    public d64(Uri uri, yd1 yd1, u54 u54, l24 l24, f24 f24, u84 u84, m54 m54, z54 z54, o84 o84, String str, int i, byte[] bArr) {
        this.f20230b = uri;
        this.f20231c = yd1;
        this.f20232d = l24;
        this.f20234f = f24;
        this.f20228K = u84;
        this.f20233e = m54;
        this.f20235g = z54;
        this.f20229L = o84;
        this.f20236h = (long) i;
        this.f20238j = u54;
        this.f20239k = new rx1(ov1.f36608a);
        this.f20240l = new w54(this);
        this.f20241m = new v54(this);
        this.f20242n = d13.m20307f0((Handler.Callback) null);
        this.f20246r = new b64[0];
        this.f20245q = new q64[0];
        this.f20223F = C6540C.TIME_UNSET;
        this.f20221D = -1;
        this.f20252x = C6540C.TIME_UNSET;
        this.f20254z = 1;
    }

    /* renamed from: A */
    private final void m20334A(int i) {
        m20351x();
        c64 c64 = this.f20250v;
        boolean[] zArr = c64.f30261d;
        if (!zArr[i]) {
            C8281w b = c64.f30258a.mo30958b(i).mo30944b(0);
            this.f20233e.mo33484d(C7773hx.m32959a(b.f40619l), b, 0, (Object) null, this.f20222E);
            zArr[i] = true;
        }
    }

    /* renamed from: B */
    private final void m20335B(int i) {
        m20351x();
        boolean[] zArr = this.f20250v.f30259b;
        if (this.f20224G && zArr[i] && !this.f20245q[i].mo34248J(false)) {
            this.f20223F = 0;
            this.f20224G = false;
            this.f20219B = true;
            this.f20222E = 0;
            this.f20225H = 0;
            for (q64 E : this.f20245q) {
                E.mo34243E(false);
            }
            a54 a54 = this.f20243o;
            Objects.requireNonNull(a54);
            a54.mo32848f(this);
        }
    }

    /* renamed from: C */
    private final void m20336C() {
        y54 y54 = new y54(this, this.f20230b, this.f20231c, this.f20238j, this, this.f20239k);
        if (this.f20248t) {
            nu1.m20747f(m20337D());
            long j = this.f20252x;
            if (j == C6540C.TIME_UNSET || this.f20223F <= j) {
                wc4 wc4 = this.f20251w;
                Objects.requireNonNull(wc4);
                y54.m39775g(y54, wc4.mo30269b(this.f20223F).f39824a.f41132b, this.f20223F);
                for (q64 F : this.f20245q) {
                    F.mo34244F(this.f20223F);
                }
                this.f20223F = C6540C.TIME_UNSET;
            } else {
                this.f20226I = true;
                this.f20223F = C6540C.TIME_UNSET;
                return;
            }
        }
        this.f20225H = m20348u();
        long a = this.f20237i.mo32575a(y54, this, u84.m38240a(this.f20254z));
        ci1 e = y54.f41709k;
        this.f20233e.mo33492l(new u44(y54.f41699a, e, e.f30390a, Collections.emptyMap(), a, 0, 0), 1, -1, (C8281w) null, 0, (Object) null, y54.f41708j, this.f20252x);
    }

    /* renamed from: D */
    private final boolean m20337D() {
        return this.f20223F != C6540C.TIME_UNSET;
    }

    /* renamed from: E */
    private final boolean m20338E() {
        return this.f20219B || m20337D();
    }

    /* renamed from: u */
    private final int m20348u() {
        int i = 0;
        for (q64 u : this.f20245q) {
            i += u.mo34252u();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final long m20349v() {
        long j = Long.MIN_VALUE;
        for (q64 w : this.f20245q) {
            j = Math.max(j, w.mo34254w());
        }
        return j;
    }

    /* renamed from: w */
    private final ad4 m20350w(b64 b64) {
        int length = this.f20245q.length;
        for (int i = 0; i < length; i++) {
            if (b64.equals(this.f20246r[i])) {
                return this.f20245q[i];
            }
        }
        o84 o84 = this.f20229L;
        Looper looper = this.f20242n.getLooper();
        l24 l24 = this.f20232d;
        f24 f24 = this.f20234f;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(l24);
        q64 q64 = new q64(o84, looper, l24, f24, (byte[]) null);
        q64.mo34245G(this);
        int i2 = length + 1;
        b64[] b64Arr = (b64[]) Arrays.copyOf(this.f20246r, i2);
        b64Arr[length] = b64;
        this.f20246r = (b64[]) d13.m20326y(b64Arr);
        q64[] q64Arr = (q64[]) Arrays.copyOf(this.f20245q, i2);
        q64Arr[length] = q64;
        this.f20245q = (q64[]) d13.m20326y(q64Arr);
        return q64;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: x */
    private final void m20351x() {
        nu1.m20747f(this.f20248t);
        Objects.requireNonNull(this.f20250v);
        Objects.requireNonNull(this.f20251w);
    }

    /* renamed from: y */
    private final void m20352y(y54 y54) {
        if (this.f20221D == -1) {
            this.f20221D = y54.f41710l;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m20353z() {
        zzdd zzdd;
        if (!this.f20227J && !this.f20248t && this.f20247s && this.f20251w != null) {
            q64[] q64Arr = this.f20245q;
            int length = q64Arr.length;
            int i = 0;
            while (i < length) {
                if (q64Arr[i].mo34255x() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f20239k.mo34631c();
            int length2 = this.f20245q.length;
            ck0[] ck0Arr = new ck0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C8281w x = this.f20245q[i2].mo34255x();
                Objects.requireNonNull(x);
                String str = x.f40619l;
                boolean g = C7773hx.m32965g(str);
                boolean z = g || C7773hx.m32966h(str);
                zArr[i2] = z;
                this.f20249u = z | this.f20249u;
                zzzd zzzd = this.f20244p;
                if (zzzd != null) {
                    if (g || this.f20246r[i2].f29915b) {
                        zzdd zzdd2 = x.f40617j;
                        if (zzdd2 == null) {
                            zzdd = new zzdd(zzzd);
                        } else {
                            zzdd = zzdd2.mo36275d(zzzd);
                        }
                        ge4 b = x.mo35521b();
                        b.mo32087m(zzdd);
                        x = b.mo32099y();
                    }
                    if (g && x.f40613f == -1 && x.f40614g == -1 && zzzd.f43089b != -1) {
                        ge4 b2 = x.mo35521b();
                        b2.mo32074d0(zzzd.f43089b);
                        x = b2.mo32099y();
                    }
                }
                ck0Arr[i2] = new ck0(x.mo35522c(this.f20232d.mo32325a(x)));
            }
            this.f20250v = new c64(new cm0(ck0Arr), zArr);
            this.f20248t = true;
            a54 a54 = this.f20243o;
            Objects.requireNonNull(a54);
            a54.mo30309d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo18196F(int i, mw3 mw3, s51 s51, int i2) {
        if (m20338E()) {
            return -3;
        }
        m20334A(i);
        int v = this.f20245q[i].mo34253v(mw3, s51, i2, this.f20226I);
        if (v == -3) {
            m20335B(i);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final int mo18197G(int i, long j) {
        if (m20338E()) {
            return 0;
        }
        m20334A(i);
        q64 q64 = this.f20245q[i];
        int t = q64.mo34251t(j, this.f20226I);
        q64.mo34246H(t);
        if (t != 0) {
            return t;
        }
        m20335B(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final ad4 mo18198L() {
        return m20350w(new b64(0, true));
    }

    /* renamed from: a */
    public final long mo18199a(long j) {
        m20351x();
        boolean[] zArr = this.f20250v.f30259b;
        if (true != this.f20251w.zzh()) {
            j = 0;
        }
        this.f20219B = false;
        this.f20222E = j;
        if (m20337D()) {
            this.f20223F = j;
            return j;
        }
        if (this.f20254z != 7) {
            int length = this.f20245q.length;
            int i = 0;
            while (i < length) {
                if (this.f20245q[i].mo34249K(j, false) || (!zArr[i] && this.f20249u)) {
                    i++;
                }
            }
            return j;
        }
        this.f20224G = false;
        this.f20223F = j;
        this.f20226I = false;
        if (this.f20237i.mo32581l()) {
            for (q64 z : this.f20245q) {
                z.mo34257z();
            }
            this.f20237i.mo32576g();
        } else {
            this.f20237i.mo32577h();
            for (q64 E : this.f20245q) {
                E.mo34243E(false);
            }
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        if (this.f20226I || this.f20237i.mo32580k() || this.f20224G) {
            return false;
        }
        if (this.f20248t && this.f20220C == 0) {
            return false;
        }
        boolean e = this.f20239k.mo34633e();
        if (this.f20237i.mo32581l()) {
            return e;
        }
        m20336C();
        return true;
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo18202d(d94 d94, long j, long j2) {
        wc4 wc4;
        if (this.f20252x == C6540C.TIME_UNSET && (wc4 = this.f20251w) != null) {
            boolean zzh = wc4.zzh();
            long v = m20349v();
            long j3 = v == Long.MIN_VALUE ? 0 : v + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
            this.f20252x = j3;
            this.f20235g.mo32565f(j3, zzh, this.f20253y);
        }
        y54 y54 = (y54) d94;
        q94 f = y54.f41701c;
        u44 u44 = new u44(y54.f41699a, y54.f41709k, f.mo34288j(), f.mo34289k(), j, j2, f.zzc());
        long unused = y54.f41699a;
        this.f20233e.mo33488h(u44, 1, -1, (C8281w) null, 0, (Object) null, y54.f41708j, this.f20252x);
        m20352y(y54);
        this.f20226I = true;
        a54 a54 = this.f20243o;
        Objects.requireNonNull(a54);
        a54.mo32848f(this);
    }

    /* renamed from: e */
    public final long mo18203e(e74[] e74Arr, boolean[] zArr, r64[] r64Arr, boolean[] zArr2, long j) {
        e74 e74;
        m20351x();
        c64 c64 = this.f20250v;
        cm0 cm0 = c64.f30258a;
        boolean[] zArr3 = c64.f30260c;
        int i = this.f20220C;
        int i2 = 0;
        for (int i3 = 0; i3 < e74Arr.length; i3++) {
            a64 a64 = r64Arr[i3];
            if (a64 != null && (e74Arr[i3] == null || !zArr[i3])) {
                int c = a64.f29543a;
                nu1.m20747f(zArr3[c]);
                this.f20220C--;
                zArr3[c] = false;
                r64Arr[i3] = null;
            }
        }
        boolean z = !this.f20218A ? j != 0 : i == 0;
        for (int i4 = 0; i4 < e74Arr.length; i4++) {
            if (r64Arr[i4] == null && (e74 = e74Arr[i4]) != null) {
                nu1.m20747f(e74.mo31495b() == 1);
                nu1.m20747f(e74.mo31494a(0) == 0);
                int a = cm0.mo30957a(e74.mo31497d());
                nu1.m20747f(!zArr3[a]);
                this.f20220C++;
                zArr3[a] = true;
                r64Arr[i4] = new a64(this, a);
                zArr2[i4] = true;
                if (!z) {
                    q64 q64 = this.f20245q[a];
                    z = !q64.mo34249K(j, true) && q64.mo34250s() != 0;
                }
            }
        }
        if (this.f20220C == 0) {
            this.f20224G = false;
            this.f20219B = false;
            if (this.f20237i.mo32581l()) {
                q64[] q64Arr = this.f20245q;
                int length = q64Arr.length;
                while (i2 < length) {
                    q64Arr[i2].mo34257z();
                    i2++;
                }
                this.f20237i.mo32576g();
            } else {
                for (q64 E : this.f20245q) {
                    E.mo34243E(false);
                }
            }
        } else if (z) {
            j = mo18199a(j);
            while (i2 < r64Arr.length) {
                if (r64Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f20218A = true;
        return j;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo18204f(d94 d94, long j, long j2, boolean z) {
        y54 y54 = (y54) d94;
        q94 f = y54.f41701c;
        u44 u44 = new u44(y54.f41699a, y54.f41709k, f.mo34288j(), f.mo34289k(), j, j2, f.zzc());
        long unused = y54.f41699a;
        this.f20233e.mo33486f(u44, 1, -1, (C8281w) null, 0, (Object) null, y54.f41708j, this.f20252x);
        if (!z) {
            m20352y(y54);
            for (q64 E : this.f20245q) {
                E.mo34243E(false);
            }
            if (this.f20220C > 0) {
                a54 a54 = this.f20243o;
                Objects.requireNonNull(a54);
                a54.mo32848f(this);
            }
        }
    }

    /* renamed from: g */
    public final long mo18205g(long j, kx3 kx3) {
        long j2 = j;
        kx3 kx32 = kx3;
        m20351x();
        if (!this.f20251w.zzh()) {
            return 0;
        }
        uc4 b = this.f20251w.mo30269b(j2);
        long j3 = b.f39824a.f41131a;
        long j4 = b.f39825b.f41131a;
        long j5 = kx32.f34734a;
        if (j5 == 0 && kx32.f34735b == 0) {
            return j2;
        }
        long j6 = j;
        long a0 = d13.m20297a0(j6, j5, Long.MIN_VALUE);
        long T = d13.m20289T(j6, kx32.f34735b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = a0 <= j3 && j3 <= T;
        if (a0 > j4 || j4 > T) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j4 : a0;
            }
        } else if (Math.abs(j3 - j2) > Math.abs(j4 - j2)) {
            return j4;
        }
        return j3;
    }

    /* renamed from: h */
    public final void mo18206h(C8281w wVar) {
        this.f20242n.post(this.f20240l);
    }

    /* renamed from: i */
    public final void mo18207i(long j, boolean z) {
        m20351x();
        if (!m20337D()) {
            boolean[] zArr = this.f20250v.f30260c;
            int length = this.f20245q.length;
            for (int i = 0; i < length; i++) {
                this.f20245q[i].mo34256y(j, false, zArr[i]);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.b94 mo18208j(com.google.android.gms.internal.ads.d94 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.y54 r1 = (com.google.android.gms.internal.ads.y54) r1
            r0.m20352y(r1)
            com.google.android.gms.internal.ads.q94 r2 = r1.f41701c
            com.google.android.gms.internal.ads.u44 r15 = new com.google.android.gms.internal.ads.u44
            long r4 = r1.f41699a
            com.google.android.gms.internal.ads.ci1 r6 = r1.f41709k
            android.net.Uri r7 = r2.mo34288j()
            java.util.Map r8 = r2.mo34289k()
            long r13 = r2.zzc()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.z44 r2 = new com.google.android.gms.internal.ads.z44
            long r3 = r1.f41708j
            long r22 = com.google.android.gms.internal.ads.xy3.m39692d(r3)
            long r3 = r0.f20252x
            long r24 = com.google.android.gms.internal.ads.xy3.m39692d(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.y84 r3 = new com.google.android.gms.internal.ads.y84
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.f41736c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C7811iy
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.gn1
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.h94
            if (r4 != 0) goto L_0x008d
        L_0x006a:
            if (r2 == 0) goto L_0x007f
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ze1
            if (r4 == 0) goto L_0x007a
            r4 = r2
            com.google.android.gms.internal.ads.ze1 r4 = (com.google.android.gms.internal.ads.ze1) r4
            int r4 = r4.f42444b
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x006a
        L_0x007f:
            int r2 = r3.f41737d
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008e
        L_0x008d:
            r2 = r5
        L_0x008e:
            r4 = 1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.b94 r2 = com.google.android.gms.internal.ads.i94.f33155g
            goto L_0x00e8
        L_0x0096:
            int r7 = r26.m20348u()
            int r8 = r0.f20225H
            r9 = 0
            if (r7 <= r8) goto L_0x00a1
            r8 = 1
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            long r10 = r0.f20221D
            r12 = -1
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x00e2
            com.google.android.gms.internal.ads.wc4 r10 = r0.f20251w
            if (r10 == 0) goto L_0x00b7
            long r10 = r10.zze()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00b7
            goto L_0x00e2
        L_0x00b7:
            boolean r5 = r0.f20248t
            if (r5 == 0) goto L_0x00c6
            boolean r5 = r26.m20338E()
            if (r5 != 0) goto L_0x00c6
            r0.f20224G = r4
            com.google.android.gms.internal.ads.b94 r2 = com.google.android.gms.internal.ads.i94.f33154f
            goto L_0x00e8
        L_0x00c6:
            boolean r5 = r0.f20248t
            r0.f20219B = r5
            r5 = 0
            r0.f20222E = r5
            r0.f20225H = r9
            com.google.android.gms.internal.ads.q64[] r7 = r0.f20245q
            int r10 = r7.length
            r11 = 0
        L_0x00d4:
            if (r11 >= r10) goto L_0x00de
            r12 = r7[r11]
            r12.mo34243E(r9)
            int r11 = r11 + 1
            goto L_0x00d4
        L_0x00de:
            com.google.android.gms.internal.ads.y54.m39775g(r1, r5, r5)
            goto L_0x00e4
        L_0x00e2:
            r0.f20225H = r7
        L_0x00e4:
            com.google.android.gms.internal.ads.b94 r2 = com.google.android.gms.internal.ads.i94.m33127b(r8, r2)
        L_0x00e8:
            boolean r3 = r2.mo30641c()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.m54 r3 = r0.f20233e
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f41708j
            long r12 = r0.f20252x
            r4 = r15
            r14 = r32
            r15 = r16
            r3.mo33490j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x0108
            long unused = r1.f41699a
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d64.mo18208j(com.google.android.gms.internal.ads.d94, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.b94");
    }

    /* renamed from: k */
    public final void mo18209k(a54 a54, long j) {
        this.f20243o = a54;
        this.f20239k.mo34633e();
        m20336C();
    }

    /* renamed from: l */
    public final void mo18210l(wc4 wc4) {
        this.f20242n.post(new x54(this, wc4));
    }

    /* renamed from: m */
    public final ad4 mo18211m(int i, int i2) {
        return m20350w(new b64(i, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo18212o() {
        if (!this.f20227J) {
            a54 a54 = this.f20243o;
            Objects.requireNonNull(a54);
            a54.mo32848f(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo18213p(wc4 wc4) {
        wc4 wc42;
        if (this.f20244p == null) {
            wc42 = wc4;
        } else {
            wc42 = new vc4(C6540C.TIME_UNSET, 0);
        }
        this.f20251w = wc42;
        this.f20252x = wc4.zze();
        boolean z = false;
        int i = 1;
        if (this.f20221D == -1 && wc4.zze() == C6540C.TIME_UNSET) {
            z = true;
        }
        this.f20253y = z;
        if (true == z) {
            i = 7;
        }
        this.f20254z = i;
        this.f20235g.mo32565f(this.f20252x, wc4.zzh(), this.f20253y);
        if (!this.f20248t) {
            m20353z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo18214q() throws IOException {
        this.f20237i.mo32578i(u84.m38240a(this.f20254z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo18215r(int i) throws IOException {
        this.f20245q[i].mo34240B();
        mo18214q();
    }

    /* renamed from: s */
    public final void mo18216s() {
        if (this.f20248t) {
            for (q64 C : this.f20245q) {
                C.mo34241C();
            }
        }
        this.f20237i.mo32579j(this);
        this.f20242n.removeCallbacksAndMessages((Object) null);
        this.f20243o = null;
        this.f20227J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo18217t(int i) {
        return !m20338E() && this.f20245q[i].mo34248J(this.f20226I);
    }

    public final void zzB() {
        this.f20247s = true;
        this.f20242n.post(this.f20240l);
    }

    public final void zzI() {
        for (q64 D : this.f20245q) {
            D.mo34242D();
        }
        this.f20238j.zze();
    }

    public final long zzb() {
        long j;
        m20351x();
        boolean[] zArr = this.f20250v.f30259b;
        if (this.f20226I) {
            return Long.MIN_VALUE;
        }
        if (m20337D()) {
            return this.f20223F;
        }
        if (this.f20249u) {
            int length = this.f20245q.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f20245q[i].mo34247I()) {
                    j = Math.min(j, this.f20245q[i].mo34254w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m20349v();
        }
        return j == Long.MIN_VALUE ? this.f20222E : j;
    }

    public final long zzc() {
        if (this.f20220C == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    public final long zzd() {
        if (!this.f20219B) {
            return C6540C.TIME_UNSET;
        }
        if (!this.f20226I && m20348u() <= this.f20225H) {
            return C6540C.TIME_UNSET;
        }
        this.f20219B = false;
        return this.f20222E;
    }

    public final cm0 zzf() {
        m20351x();
        return this.f20250v.f30258a;
    }

    public final void zzj() throws IOException {
        mo18214q();
        if (this.f20226I && !this.f20248t) {
            throw C7811iy.m33482a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final boolean zzo() {
        return this.f20237i.mo32581l() && this.f20239k.mo34632d();
    }
}
