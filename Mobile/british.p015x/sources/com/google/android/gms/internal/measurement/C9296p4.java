package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9296p4 extends C9330r8 implements C9424x9 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C9296p4 zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    /* access modifiers changed from: private */
    public C9438y8 zzH = C9330r8.m43563v();
    private String zzI = "";
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM = "";
    private long zzN;
    private long zzO;
    private String zzP = "";
    private String zzQ = "";
    private int zzR;
    private String zzS = "";
    private C9358t4 zzT;
    private C9408w8 zzU = C9330r8.m43560s();
    private long zzV;
    private long zzW;
    private String zzX = "";
    private String zzY = "";
    private int zzZ;
    private boolean zzaa;
    private String zzab = "";
    private boolean zzac;
    private C9234l4 zzad;
    private String zzae = "";
    private int zzf;
    private int zzg;
    private int zzh;
    /* access modifiers changed from: private */
    public C9438y8 zzi = C9330r8.m43563v();
    private C9438y8 zzj = C9330r8.m43563v();
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        C9296p4 p4Var = new C9296p4();
        zze = p4Var;
        C9330r8.m43558o(C9296p4.class, p4Var);
    }

    private C9296p4() {
    }

    /* renamed from: B0 */
    static /* synthetic */ void m43362B0(C9296p4 p4Var, Iterable iterable) {
        p4Var.m43403c1();
        C9083b7.m42674i(iterable, p4Var.zzi);
    }

    /* renamed from: D0 */
    static /* synthetic */ void m43364D0(C9296p4 p4Var, int i) {
        p4Var.m43403c1();
        p4Var.zzi.remove(i);
    }

    /* renamed from: E0 */
    static /* synthetic */ void m43365E0(C9296p4 p4Var, int i, C9449z4 z4Var) {
        z4Var.getClass();
        p4Var.m43405d1();
        p4Var.zzj.set(i, z4Var);
    }

    /* renamed from: F0 */
    static /* synthetic */ void m43366F0(C9296p4 p4Var, C9449z4 z4Var) {
        z4Var.getClass();
        p4Var.m43405d1();
        p4Var.zzj.add(z4Var);
    }

    /* renamed from: G0 */
    static /* synthetic */ void m43367G0(C9296p4 p4Var, Iterable iterable) {
        p4Var.m43405d1();
        C9083b7.m42674i(iterable, p4Var.zzj);
    }

    /* renamed from: H0 */
    static /* synthetic */ void m43368H0(C9296p4 p4Var, int i) {
        p4Var.m43405d1();
        p4Var.zzj.remove(i);
    }

    /* renamed from: H1 */
    public static C9280o4 m43369H1() {
        return (C9280o4) zze.mo37996p();
    }

    /* renamed from: I0 */
    static /* synthetic */ void m43370I0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 2;
        p4Var.zzk = j;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m43372J0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 4;
        p4Var.zzl = j;
    }

    /* renamed from: K0 */
    static /* synthetic */ void m43373K0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 8;
        p4Var.zzm = j;
    }

    /* renamed from: L0 */
    static /* synthetic */ void m43374L0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 16;
        p4Var.zzn = j;
    }

    /* renamed from: M0 */
    static /* synthetic */ void m43375M0(C9296p4 p4Var) {
        p4Var.zzf &= -17;
        p4Var.zzn = 0;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m43376N0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 32;
        p4Var.zzo = j;
    }

    /* renamed from: O0 */
    static /* synthetic */ void m43377O0(C9296p4 p4Var) {
        p4Var.zzf &= -33;
        p4Var.zzo = 0;
    }

    /* renamed from: P */
    static /* synthetic */ void m43378P(C9296p4 p4Var, long j) {
        p4Var.zzf |= 1073741824;
        p4Var.zzO = j;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m43379P0(C9296p4 p4Var, String str) {
        p4Var.zzf |= 64;
        p4Var.zzp = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    /* renamed from: Q */
    static /* synthetic */ void m43380Q(C9296p4 p4Var) {
        p4Var.zzf &= Integer.MAX_VALUE;
        p4Var.zzP = zze.zzP;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m43381Q0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 128;
        p4Var.zzq = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m43382R(C9296p4 p4Var, int i) {
        p4Var.zzg |= 2;
        p4Var.zzR = i;
    }

    /* renamed from: R0 */
    static /* synthetic */ void m43383R0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 256;
        p4Var.zzr = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m43384S(C9296p4 p4Var, int i, C9143f4 f4Var) {
        f4Var.getClass();
        p4Var.m43403c1();
        p4Var.zzi.set(i, f4Var);
    }

    /* renamed from: S0 */
    static /* synthetic */ void m43385S0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 512;
        p4Var.zzs = str;
    }

    /* renamed from: T */
    static /* synthetic */ void m43386T(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzg |= 4;
        p4Var.zzS = str;
    }

    /* renamed from: T0 */
    static /* synthetic */ void m43387T0(C9296p4 p4Var, int i) {
        p4Var.zzf |= 1024;
        p4Var.zzt = i;
    }

    /* renamed from: U */
    static /* synthetic */ void m43388U(C9296p4 p4Var, C9358t4 t4Var) {
        t4Var.getClass();
        p4Var.zzT = t4Var;
        p4Var.zzg |= 8;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m43389U0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 2048;
        p4Var.zzu = str;
    }

    /* renamed from: V */
    static /* synthetic */ void m43390V(C9296p4 p4Var, Iterable iterable) {
        C9408w8 w8Var = p4Var.zzU;
        if (!w8Var.zzc()) {
            int size = w8Var.size();
            p4Var.zzU = w8Var.mo38028k(size == 0 ? 10 : size + size);
        }
        C9083b7.m42674i(iterable, p4Var.zzU);
    }

    /* renamed from: V0 */
    static /* synthetic */ void m43391V0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 4096;
        p4Var.zzv = str;
    }

    /* renamed from: W */
    static /* synthetic */ void m43392W(C9296p4 p4Var, C9143f4 f4Var) {
        f4Var.getClass();
        p4Var.m43403c1();
        p4Var.zzi.add(f4Var);
    }

    /* renamed from: W0 */
    static /* synthetic */ void m43393W0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 8192;
        p4Var.zzw = str;
    }

    /* renamed from: X */
    static /* synthetic */ void m43394X(C9296p4 p4Var, long j) {
        p4Var.zzg |= 16;
        p4Var.zzV = j;
    }

    /* renamed from: X0 */
    static /* synthetic */ void m43395X0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 16384;
        p4Var.zzx = j;
    }

    /* renamed from: Y */
    static /* synthetic */ void m43396Y(C9296p4 p4Var, long j) {
        p4Var.zzg |= 32;
        p4Var.zzW = j;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m43397Y0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 32768;
        p4Var.zzy = 55005;
    }

    /* renamed from: Z */
    static /* synthetic */ void m43398Z(C9296p4 p4Var, String str) {
        p4Var.zzg |= 128;
        p4Var.zzY = str;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m43399Z0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        p4Var.zzz = str;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m43400a1(C9296p4 p4Var) {
        p4Var.zzf &= -65537;
        p4Var.zzz = zze.zzz;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m43401b0(C9296p4 p4Var, boolean z) {
        p4Var.zzf |= 131072;
        p4Var.zzA = z;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m43402c0(C9296p4 p4Var) {
        p4Var.zzf &= -131073;
        p4Var.zzA = false;
    }

    /* renamed from: c1 */
    private final void m43403c1() {
        C9438y8 y8Var = this.zzi;
        if (!y8Var.zzc()) {
            this.zzi = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ void m43404d0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 262144;
        p4Var.zzB = str;
    }

    /* renamed from: d1 */
    private final void m43405d1() {
        C9438y8 y8Var = this.zzj;
        if (!y8Var.zzc()) {
            this.zzj = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: e0 */
    static /* synthetic */ void m43406e0(C9296p4 p4Var) {
        p4Var.zzf &= -262145;
        p4Var.zzB = zze.zzB;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m43407f0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 524288;
        p4Var.zzC = j;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m43408g0(C9296p4 p4Var, int i) {
        p4Var.zzf |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        p4Var.zzD = i;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m43409h0(C9296p4 p4Var, String str) {
        p4Var.zzf |= 2097152;
        p4Var.zzE = str;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m43410i0(C9296p4 p4Var) {
        p4Var.zzf &= -2097153;
        p4Var.zzE = zze.zzE;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m43411j0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 4194304;
        p4Var.zzF = str;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m43412k0(C9296p4 p4Var, boolean z) {
        p4Var.zzf |= 8388608;
        p4Var.zzG = z;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m43413l0(C9296p4 p4Var, Iterable iterable) {
        C9438y8 y8Var = p4Var.zzH;
        if (!y8Var.zzc()) {
            p4Var.zzH = C9330r8.m43564w(y8Var);
        }
        C9083b7.m42674i(iterable, p4Var.zzH);
    }

    /* renamed from: n0 */
    static /* synthetic */ void m43415n0(C9296p4 p4Var, String str) {
        str.getClass();
        p4Var.zzf |= 16777216;
        p4Var.zzI = str;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m43416o0(C9296p4 p4Var, int i) {
        p4Var.zzf |= 33554432;
        p4Var.zzJ = i;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m43417p0(C9296p4 p4Var, int i) {
        p4Var.zzf |= 1;
        p4Var.zzh = 1;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m43418q0(C9296p4 p4Var) {
        p4Var.zzf &= -268435457;
        p4Var.zzM = zze.zzM;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m43419r0(C9296p4 p4Var, long j) {
        p4Var.zzf |= 536870912;
        p4Var.zzN = j;
    }

    /* renamed from: A */
    public final String mo37864A() {
        return this.zzw;
    }

    /* renamed from: A0 */
    public final boolean mo37865A0() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: A1 */
    public final long mo37866A1() {
        return this.zzx;
    }

    /* renamed from: B */
    public final String mo37867B() {
        return this.zzY;
    }

    /* renamed from: B1 */
    public final long mo37868B1() {
        return this.zzo;
    }

    /* renamed from: C */
    public final String mo37869C() {
        return this.zzr;
    }

    /* renamed from: C1 */
    public final long mo37870C1() {
        return this.zzn;
    }

    /* renamed from: D */
    public final String mo37871D() {
        return this.zzP;
    }

    /* renamed from: D1 */
    public final long mo37872D1() {
        return this.zzl;
    }

    /* renamed from: E1 */
    public final long mo37873E1() {
        return this.zzk;
    }

    /* renamed from: F */
    public final String mo37874F() {
        return this.zzI;
    }

    /* renamed from: F1 */
    public final long mo37875F1() {
        return this.zzy;
    }

    /* renamed from: G */
    public final String mo37876G() {
        return this.zzF;
    }

    /* renamed from: G1 */
    public final C9143f4 mo37877G1(int i) {
        return (C9143f4) this.zzi.get(i);
    }

    /* renamed from: H */
    public final String mo37878H() {
        return this.zzE;
    }

    /* renamed from: I */
    public final String mo37879I() {
        return this.zzq;
    }

    /* renamed from: J */
    public final String mo37880J() {
        return this.zzp;
    }

    /* renamed from: J1 */
    public final C9449z4 mo37881J1(int i) {
        return (C9449z4) this.zzj.get(i);
    }

    /* renamed from: K */
    public final String mo37882K() {
        return this.zzz;
    }

    /* renamed from: K1 */
    public final String mo37883K1() {
        return this.zzS;
    }

    /* renamed from: L */
    public final String mo37884L() {
        return this.zzs;
    }

    /* renamed from: L1 */
    public final String mo37885L1() {
        return this.zzv;
    }

    /* renamed from: M */
    public final List mo37886M() {
        return this.zzH;
    }

    /* renamed from: M1 */
    public final String mo37887M1() {
        return this.zzB;
    }

    /* renamed from: N */
    public final List mo37888N() {
        return this.zzi;
    }

    /* renamed from: O */
    public final List mo37889O() {
        return this.zzj;
    }

    /* renamed from: a0 */
    public final int mo37890a0() {
        return this.zzJ;
    }

    /* renamed from: b1 */
    public final int mo37891b1() {
        return this.zzD;
    }

    /* renamed from: e1 */
    public final boolean mo37892e1() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: f1 */
    public final boolean mo37893f1() {
        return (this.zzf & 16384) != 0;
    }

    /* renamed from: g1 */
    public final boolean mo37894g1() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: h1 */
    public final boolean mo37895h1() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: i1 */
    public final boolean mo37896i1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo37897j1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo37898k1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo37899l1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo37900m1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo37901n1() {
        return (this.zzf & 1024) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo37902o1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo37903p1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: q1 */
    public final int mo37904q1() {
        return this.zzi.size();
    }

    /* renamed from: r1 */
    public final int mo37905r1() {
        return this.zzh;
    }

    /* renamed from: s0 */
    public final boolean mo37906s0() {
        return this.zzA;
    }

    /* renamed from: s1 */
    public final int mo37907s1() {
        return this.zzR;
    }

    /* renamed from: t0 */
    public final boolean mo37908t0() {
        return this.zzG;
    }

    /* renamed from: t1 */
    public final int mo37909t1() {
        return this.zzt;
    }

    /* renamed from: u0 */
    public final boolean mo37910u0() {
        return (this.zzf & 1073741824) != 0;
    }

    /* renamed from: u1 */
    public final int mo37911u1() {
        return this.zzj.size();
    }

    /* renamed from: v0 */
    public final boolean mo37912v0() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: v1 */
    public final long mo37913v1() {
        return this.zzO;
    }

    /* renamed from: w0 */
    public final boolean mo37914w0() {
        return (this.zzf & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    /* renamed from: w1 */
    public final long mo37915w1() {
        return this.zzN;
    }

    /* renamed from: x0 */
    public final boolean mo37916x0() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: x1 */
    public final long mo37917x1() {
        return this.zzC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zze, "\u00012\u0000\u0002\u0001?2\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-", new Object[]{"zzf", "zzg", "zzh", "zzi", C9143f4.class, "zzj", C9449z4.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C9081b4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C9419x3.f45511a, "zzaa", "zzab", "zzac", "zzad", "zzae"});
        } else if (i2 == 3) {
            return new C9296p4();
        } else {
            if (i2 == 4) {
                return new C9280o4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: y0 */
    public final boolean mo37918y0() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: y1 */
    public final long mo37919y1() {
        return this.zzV;
    }

    /* renamed from: z */
    public final String mo37920z() {
        return this.zzu;
    }

    /* renamed from: z0 */
    public final boolean mo37921z0() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: z1 */
    public final long mo37922z1() {
        return this.zzm;
    }
}
