package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.android.gms.internal.ads.u8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8218u8 extends kp3<C8218u8, C7600d8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8218u8 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private long zzG;
    private long zzH;
    private long zzI;
    private String zzJ = "";
    private long zzK;
    private long zzL = -1;
    private long zzM = -1;
    private C8289w8 zzN;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private tp3<C7970n8> zzaA = kp3.m34063p();
    private int zzaB = 1000;
    private tp3<C7747h8> zzaC = kp3.m34063p();
    private C8041p8 zzaD;
    private String zzaE = "";
    private long zzaF;
    private String zzaG = "";
    private int zzaH = 2;
    private boolean zzaI;
    private String zzaJ = "";
    private long zzaK;
    private C7601d9 zzaL;
    private long zzaM;
    private String zzaN = "";
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private C8113r8 zzaf;
    /* access modifiers changed from: private */
    public tp3<C8113r8> zzag = kp3.m34063p();
    private C8182t8 zzah;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private int zzas;
    private int zzat;
    private int zzau;
    private C7712g9 zzav;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private String zzt = "";
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        C8218u8 u8Var = new C8218u8();
        zzb = u8Var;
        kp3.m34067t(C8218u8.class, u8Var);
    }

    private C8218u8() {
    }

    /* renamed from: A0 */
    static /* synthetic */ void m38173A0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zze |= 2;
        u8Var.zzi = str;
    }

    /* renamed from: B0 */
    static /* synthetic */ void m38174B0(C8218u8 u8Var, long j) {
        u8Var.zze |= 4;
        u8Var.zzj = j;
    }

    /* renamed from: C0 */
    static /* synthetic */ void m38175C0(C8218u8 u8Var, long j) {
        u8Var.zze |= 16;
        u8Var.zzl = j;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m38176D0(C8218u8 u8Var, long j) {
        u8Var.zze |= 32;
        u8Var.zzm = j;
    }

    /* renamed from: E */
    static /* synthetic */ void m38177E(C8218u8 u8Var, long j) {
        u8Var.zze |= 134217728;
        u8Var.zzI = j;
    }

    /* renamed from: E0 */
    static /* synthetic */ void m38178E0(C8218u8 u8Var, long j) {
        u8Var.zze |= 1024;
        u8Var.zzr = j;
    }

    /* renamed from: F */
    static /* synthetic */ void m38179F(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zze |= 268435456;
        u8Var.zzJ = str;
    }

    /* renamed from: F0 */
    static /* synthetic */ void m38180F0(C8218u8 u8Var, long j) {
        u8Var.zze |= 2048;
        u8Var.zzs = j;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m38181G0(C8218u8 u8Var, long j) {
        u8Var.zze |= 8192;
        u8Var.zzu = j;
    }

    /* renamed from: H */
    static /* synthetic */ void m38182H(C8218u8 u8Var, long j) {
        u8Var.zze |= 536870912;
        u8Var.zzK = j;
    }

    /* renamed from: H0 */
    static /* synthetic */ void m38183H0(C8218u8 u8Var, long j) {
        u8Var.zze |= 16384;
        u8Var.zzv = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m38184I(C8218u8 u8Var, long j) {
        u8Var.zze |= 1073741824;
        u8Var.zzL = j;
    }

    /* renamed from: I0 */
    static /* synthetic */ void m38185I0(C8218u8 u8Var, long j) {
        u8Var.zze |= 32768;
        u8Var.zzw = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m38186J(C8218u8 u8Var, long j) {
        u8Var.zze |= Integer.MIN_VALUE;
        u8Var.zzM = j;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m38187J0(C8218u8 u8Var, long j) {
        u8Var.zze |= C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        u8Var.zzx = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m38188K(C8218u8 u8Var, long j) {
        u8Var.zzf |= 2;
        u8Var.zzO = j;
    }

    /* renamed from: K0 */
    static /* synthetic */ void m38189K0(C8218u8 u8Var, long j) {
        u8Var.zze |= 524288;
        u8Var.zzA = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m38190L(C8218u8 u8Var, long j) {
        u8Var.zzf |= 4;
        u8Var.zzP = j;
    }

    /* renamed from: L0 */
    static /* synthetic */ void m38191L0(C8218u8 u8Var, long j) {
        u8Var.zze |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        u8Var.zzB = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m38192M(C8218u8 u8Var, long j) {
        u8Var.zzf |= 8;
        u8Var.zzQ = j;
    }

    /* renamed from: M0 */
    static /* synthetic */ void m38193M0(C8218u8 u8Var, long j) {
        u8Var.zze |= 2097152;
        u8Var.zzC = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m38194N(C8218u8 u8Var, long j) {
        u8Var.zzf |= 16;
        u8Var.zzR = j;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m38195N0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zze |= 4194304;
        u8Var.zzD = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m38196O(C8218u8 u8Var, long j) {
        u8Var.zzf |= 32;
        u8Var.zzS = j;
    }

    /* renamed from: O0 */
    static /* synthetic */ void m38197O0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zze |= 16777216;
        u8Var.zzF = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m38198P(C8218u8 u8Var, long j) {
        u8Var.zzf |= 64;
        u8Var.zzT = j;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m38199P0(C8218u8 u8Var, long j) {
        u8Var.zze |= 33554432;
        u8Var.zzG = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m38200Q(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zzf |= 128;
        u8Var.zzU = str;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m38201Q0(C8218u8 u8Var, long j) {
        u8Var.zze |= 67108864;
        u8Var.zzH = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m38202R(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zzf |= 256;
        u8Var.zzV = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m38203S(C8218u8 u8Var, long j) {
        u8Var.zzf |= 4096;
        u8Var.zzZ = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m38204T(C8218u8 u8Var, long j) {
        u8Var.zzf |= 8192;
        u8Var.zzaa = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m38205U(C8218u8 u8Var, long j) {
        u8Var.zzf |= 16384;
        u8Var.zzab = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m38206V(C8218u8 u8Var, C8113r8 r8Var) {
        r8Var.getClass();
        u8Var.zzaf = r8Var;
        u8Var.zzf |= 262144;
    }

    /* renamed from: W */
    static /* synthetic */ void m38207W(C8218u8 u8Var, C8113r8 r8Var) {
        r8Var.getClass();
        tp3<C8113r8> tp3 = u8Var.zzag;
        if (!tp3.zzc()) {
            u8Var.zzag = kp3.m34064q(tp3);
        }
        u8Var.zzag.add(r8Var);
    }

    /* renamed from: Y */
    static /* synthetic */ void m38209Y(C8218u8 u8Var, C8182t8 t8Var) {
        t8Var.getClass();
        u8Var.zzah = t8Var;
        u8Var.zzf |= 524288;
    }

    /* renamed from: Z */
    static /* synthetic */ void m38210Z(C8218u8 u8Var, long j) {
        u8Var.zzf |= 2097152;
        u8Var.zzaj = j;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m38211a0(C8218u8 u8Var, long j) {
        u8Var.zzf |= 4194304;
        u8Var.zzak = j;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m38212b0(C8218u8 u8Var, long j) {
        u8Var.zzf |= 8388608;
        u8Var.zzal = j;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m38213c0(C8218u8 u8Var, long j) {
        u8Var.zzf |= 67108864;
        u8Var.zzao = j;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m38214d0(C8218u8 u8Var, long j) {
        u8Var.zzf |= 134217728;
        u8Var.zzap = j;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m38215e0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zzf |= 268435456;
        u8Var.zzaq = str;
    }

    /* renamed from: f0 */
    public static C7600d8 m38216f0() {
        return (C7600d8) zzb.mo33147w();
    }

    /* renamed from: g0 */
    static /* synthetic */ void m38217g0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zzg |= 1024;
        u8Var.zzaG = str;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m38218h0(C8218u8 u8Var, boolean z) {
        u8Var.zzg |= 4096;
        u8Var.zzaI = z;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m38219i0(C8218u8 u8Var, long j) {
        u8Var.zzg |= 16384;
        u8Var.zzaK = j;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m38220n0(C8218u8 u8Var, int i) {
        u8Var.zzX = i - 1;
        u8Var.zzf |= 1024;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m38221o0(C8218u8 u8Var, int i) {
        u8Var.zzY = i - 1;
        u8Var.zzf |= 2048;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m38222p0(C8218u8 u8Var, int i) {
        u8Var.zzae = i - 1;
        u8Var.zzf |= 131072;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m38223q0(C8218u8 u8Var, int i) {
        u8Var.zzax = i - 1;
        u8Var.zzg |= 8;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m38224r0(C8218u8 u8Var, int i) {
        u8Var.zzay = i - 1;
        u8Var.zzg |= 16;
    }

    /* renamed from: s0 */
    static /* synthetic */ void m38225s0(C8218u8 u8Var, int i) {
        u8Var.zzaH = 5;
        u8Var.zzg |= 2048;
    }

    /* renamed from: u0 */
    public static C8218u8 m38227u0() {
        return zzb;
    }

    /* renamed from: v0 */
    public static C8218u8 m38228v0(byte[] bArr, wo3 wo3) throws wp3 {
        return (C8218u8) kp3.m34057C(zzb, bArr, wo3);
    }

    /* renamed from: z0 */
    static /* synthetic */ void m38229z0(C8218u8 u8Var, String str) {
        str.getClass();
        u8Var.zze |= 1;
        u8Var.zzh = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            op3 op3 = C7495a9.f29564a;
            return kp3.m34066s(zzb, "\u0001U\u0000\u0003\u0001ĮU\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂI\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈJ\u0019ဂN\u001aဌK\u001bဈ\u0016\u001cဇL\u001dဈ\u0018\u001eဈM\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHÉဉOĭဂPĮဈQ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaF", "zzB", "zzC", "zzaG", "zzaK", "zzaH", C7822j8.f33797a, "zzD", "zzaI", "zzF", "zzaJ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", C8113r8.class, "zzS", "zzT", "zzU", "zzV", "zzX", op3, "zzY", op3, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", op3, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", C8397z8.f42342a, "zzat", C7531b9.f29931a, "zzaq", "zzau", C7674f8.f31663a, "zzav", "zzaw", "zzam", "zzan", "zzax", op3, "zzW", "zzE", "zzay", op3, "zzaz", "zzaA", C7970n8.class, "zzaB", op3, "zzaC", C7747h8.class, "zzaD", "zzaE", "zzaL", "zzaM", "zzaN"});
        } else if (i2 == 3) {
            return new C8218u8();
        } else {
            if (i2 == 4) {
                return new C7600d8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: j0 */
    public final boolean mo35139j0() {
        return this.zzaI;
    }

    /* renamed from: k0 */
    public final boolean mo35140k0() {
        return (this.zze & 4194304) != 0;
    }

    /* renamed from: l0 */
    public final boolean mo35141l0() {
        return (this.zzg & 32768) != 0;
    }

    /* renamed from: m0 */
    public final int mo35142m0() {
        int a = C7858k8.m33870a(this.zzaH);
        if (a == 0) {
            return 3;
        }
        return a;
    }

    /* renamed from: w0 */
    public final C7601d9 mo35143w0() {
        C7601d9 d9Var = this.zzaL;
        return d9Var == null ? C7601d9.m31328H() : d9Var;
    }

    /* renamed from: x0 */
    public final String mo35144x0() {
        return this.zzaG;
    }

    /* renamed from: y0 */
    public final String mo35145y0() {
        return this.zzD;
    }
}
