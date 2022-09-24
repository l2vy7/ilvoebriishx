package com.google.android.gms.internal.cast;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.cast.o8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8669o8 extends C8705qc<C8669o8, C8653n8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8669o8 zzai;
    private C8843zc<C8764ua> zzA = C8705qc.m41251l();
    private int zzB;
    private int zzC;
    private C8809x8 zzD;
    private int zzE;
    private C8637m8 zzF;
    private C8843zc<C8809x8> zzG = C8705qc.m41251l();
    private C8809x8 zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private C8525fb zzO;
    private C8538g8 zzP;
    private C8777v7 zzQ;
    private C8748t9 zzR;
    private C8734sa zzS;
    private C8825y9 zzT;
    private C8843zc<C8505e8> zzU = C8705qc.m41251l();
    private int zzV;
    private C8540ga zzW;
    private C8843zc<C8572i8> zzX = C8705qc.m41251l();
    private boolean zzY;
    private boolean zzZ;
    private int zzaa;
    private C8823y7 zzab;
    private C8671oa zzac;
    private C8654n9 zzad;
    private C8507ea zzae;
    private C8841za zzaf;
    private C8701q8 zzag;
    private byte zzah = 2;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private C8589j9 zzi;
    private C8639ma zzj;
    private C8556h9 zzk;
    private C8490d9 zzl;
    private C8605k8 zzm;
    private C8607ka zzn;
    private C8472c8 zzo;
    private C8492db zzp;
    private String zzq = "";
    private C8456b9 zzr;
    private C8647n2 zzs;
    private String zzt = "";
    private C8474ca zzu;
    private String zzv = "";
    private C8781vc zzw = C8705qc.m41249j();
    private C8843zc<C8622l9> zzx = C8705qc.m41251l();
    private C8843zc<C8686p9> zzy = C8705qc.m41251l();
    private C8843zc<C8732s8> zzz = C8705qc.m41251l();

    static {
        C8669o8 o8Var = new C8669o8();
        zzai = o8Var;
        C8705qc.m41246g(C8669o8.class, o8Var);
    }

    private C8669o8() {
    }

    /* renamed from: n */
    public static C8653n8 m41176n() {
        return (C8653n8) zzai.mo36673e();
    }

    /* renamed from: o */
    public static C8653n8 m41177o(C8669o8 o8Var) {
        C8673oc e = zzai.mo36673e();
        e.mo36635k(o8Var);
        return (C8653n8) e;
    }

    /* renamed from: q */
    static /* synthetic */ void m41179q(C8669o8 o8Var, long j) {
        o8Var.zzb |= 2;
        o8Var.zzg = j;
    }

    /* renamed from: r */
    static /* synthetic */ void m41180r(C8669o8 o8Var, String str) {
        str.getClass();
        o8Var.zzb |= 16384;
        o8Var.zzt = str;
    }

    /* renamed from: s */
    static /* synthetic */ void m41181s(C8669o8 o8Var, String str) {
        o8Var.zzb |= C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        o8Var.zzv = str;
    }

    /* renamed from: t */
    static /* synthetic */ void m41182t(C8669o8 o8Var, int i) {
        o8Var.zzb |= 268435456;
        o8Var.zzN = i;
    }

    /* renamed from: u */
    static /* synthetic */ void m41183u(C8669o8 o8Var, C8538g8 g8Var) {
        g8Var.getClass();
        o8Var.zzP = g8Var;
        o8Var.zzb |= 1073741824;
    }

    /* renamed from: v */
    static /* synthetic */ void m41184v(C8669o8 o8Var, C8505e8 e8Var) {
        e8Var.getClass();
        C8843zc<C8505e8> zcVar = o8Var.zzU;
        if (!zcVar.zza()) {
            int size = zcVar.size();
            o8Var.zzU = zcVar.mo36467p(size == 0 ? 10 : size + size);
        }
        o8Var.zzU.add(e8Var);
    }

    /* renamed from: w */
    static /* synthetic */ void m41185w(C8669o8 o8Var, C8823y7 y7Var) {
        y7Var.getClass();
        o8Var.zzab = y7Var;
        o8Var.zze |= 256;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzah);
        }
        byte b = 1;
        if (i2 == 2) {
            return C8705qc.m41247h(zzai, "\u00016\u0000\u0002\u000166\u0000\b\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0018ဉ\u0015\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d!ဉ\u001e\"ဉ\u001f#ဌ\u0012$ဉ\u0013%ᐉ &ဉ!'ဉ\"(\u001b)ဌ#*ဉ$+\u001b,ဌ\u0017-ဇ%.ဇ&/ဌ'0ဉ(1င\u00142ဉ)3ဉ*4ဉ+5ဉ,6ဉ-", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C8776v6.m41350d(), "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzu", "zzv", "zzw", "zzx", C8622l9.class, "zzy", C8686p9.class, "zzz", C8732s8.class, "zzA", C8764ua.class, "zzB", C8667o6.m41175d(), "zzF", "zzG", C8809x8.class, "zzH", "zzJ", C8774v4.m41349d(), "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzC", C8570i6.m41000d(), "zzD", "zzR", "zzS", "zzT", "zzU", C8505e8.class, "zzV", C8619l6.m41111d(), "zzW", "zzX", C8572i8.class, "zzI", C8728s4.m41301d(), "zzY", "zzZ", "zzaa", C8617l4.m41110d(), "zzab", "zzE", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new C8669o8();
        } else {
            if (i2 == 4) {
                return new C8653n8((C8715r7) null);
            }
            if (i2 == 5) {
                return zzai;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzah = b;
            return null;
        }
    }

    /* renamed from: m */
    public final C8538g8 mo36627m() {
        C8538g8 g8Var = this.zzP;
        return g8Var == null ? C8538g8.m40928o() : g8Var;
    }
}
