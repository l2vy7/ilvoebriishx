package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class vw3 implements kb0 {

    /* renamed from: a */
    protected final gh0 f40574a = new gh0();

    protected vw3() {
    }

    /* renamed from: b */
    public final boolean mo35506b() {
        gi0 zzm = zzm();
        if (!zzm.mo32145o()) {
            int zzg = zzg();
            zzi();
            zzo();
            if (zzm.mo32140j(zzg, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo35507c() {
        gi0 zzm = zzm();
        if (!zzm.mo32145o()) {
            int zzg = zzg();
            zzi();
            zzo();
            if (zzm.mo32141k(zzg, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo35508d() {
        gi0 zzm = zzm();
        return !zzm.mo32145o() && zzm.mo31485e(zzg(), this.f40574a, 0).mo32126b();
    }

    /* renamed from: e */
    public final boolean mo35509e() {
        gi0 zzm = zzm();
        return !zzm.mo32145o() && zzm.mo31485e(zzg(), this.f40574a, 0).f32314f;
    }
}
