package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qs */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8097qs extends kp3<C8097qs, C8061ps> implements vq3 {
    private static final qp3<Integer, C7619dr> zzb = new C8026os();
    /* access modifiers changed from: private */
    public static final C8097qs zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private pp3 zzk = kp3.m34060m();
    private C7915ls zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        C8097qs qsVar = new C8097qs();
        zze = qsVar;
        kp3.m34067t(C8097qs.class, qsVar);
    }

    private C8097qs() {
    }

    /* renamed from: E */
    static /* synthetic */ void m36668E(C8097qs qsVar, int i) {
        qsVar.zzo = i - 1;
        qsVar.zzf |= 128;
    }

    /* renamed from: F */
    static /* synthetic */ void m36669F(C8097qs qsVar, int i) {
        qsVar.zzq = i - 1;
        qsVar.zzf |= 512;
    }

    /* renamed from: M */
    public static C8061ps m36670M() {
        return (C8061ps) zze.mo33147w();
    }

    /* renamed from: O */
    public static C8097qs m36672O(byte[] bArr) throws wp3 {
        return (C8097qs) kp3.m34055A(zze, bArr);
    }

    /* renamed from: R */
    static /* synthetic */ void m36673R(C8097qs qsVar, long j) {
        qsVar.zzf |= 1;
        qsVar.zzg = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m36674S(C8097qs qsVar, long j) {
        qsVar.zzf |= 4;
        qsVar.zzi = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m36675T(C8097qs qsVar, long j) {
        qsVar.zzf |= 8;
        qsVar.zzj = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m36676U(C8097qs qsVar, Iterable iterable) {
        pp3 pp3 = qsVar.zzk;
        if (!pp3.zzc()) {
            qsVar.zzk = kp3.m34061n(pp3);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qsVar.zzk.mo33382p(((C7619dr) it.next()).zza());
        }
    }

    /* renamed from: V */
    static /* synthetic */ void m36677V(C8097qs qsVar, C7915ls lsVar) {
        lsVar.getClass();
        qsVar.zzl = lsVar;
        qsVar.zzf |= 16;
    }

    /* renamed from: W */
    static /* synthetic */ void m36678W(C8097qs qsVar, int i) {
        qsVar.zzf |= 256;
        qsVar.zzp = i;
    }

    /* renamed from: X */
    static /* synthetic */ void m36679X(C8097qs qsVar, C8238us usVar) {
        qsVar.zzr = usVar.zza();
        qsVar.zzf |= 1024;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m36680d0(C8097qs qsVar, int i) {
        qsVar.zzh = i - 1;
        qsVar.zzf |= 2;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m36681e0(C8097qs qsVar, int i) {
        qsVar.zzm = i - 1;
        qsVar.zzf |= 32;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m36682f0(C8097qs qsVar, int i) {
        qsVar.zzn = i - 1;
        qsVar.zzf |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            op3 op3 = C8201tr.f39495a;
            return kp3.m34066s(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", op3, "zzi", "zzj", "zzk", C7619dr.m31546d(), "zzl", "zzm", op3, "zzn", op3, "zzo", op3, "zzp", "zzq", op3, "zzr", C8238us.m38432d()});
        } else if (i2 == 3) {
            return new C8097qs();
        } else {
            if (i2 == 4) {
                return new C8061ps((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: H */
    public final int mo34403H() {
        return this.zzp;
    }

    /* renamed from: I */
    public final long mo34404I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final long mo34405J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final long mo34406K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final C7915ls mo34407L() {
        C7915ls lsVar = this.zzl;
        return lsVar == null ? C7915ls.m34538H() : lsVar;
    }

    /* renamed from: P */
    public final C8238us mo34408P() {
        C8238us a = C8238us.m38431a(this.zzr);
        return a == null ? C8238us.UNSPECIFIED : a;
    }

    /* renamed from: Q */
    public final List<C7619dr> mo34409Q() {
        return new rp3(this.zzk, zzb);
    }

    /* renamed from: Y */
    public final int mo34410Y() {
        int a = C8237ur.m38425a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: Z */
    public final int mo34411Z() {
        int a = C8237ur.m38425a(this.zzo);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a0 */
    public final int mo34412a0() {
        int a = C8237ur.m38425a(this.zzq);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b0 */
    public final int mo34413b0() {
        int a = C8237ur.m38425a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c0 */
    public final int mo34414c0() {
        int a = C8237ur.m38425a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
