package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jh3 extends kp3<jh3, ih3> implements vq3 {
    /* access modifiers changed from: private */
    public static final jh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ph3 zzf;
    /* access modifiers changed from: private */
    public eo3 zzg = eo3.f31444c;

    static {
        jh3 jh3 = new jh3();
        zzb = jh3;
        kp3.m34067t(jh3.class, jh3);
    }

    private jh3() {
    }

    /* renamed from: F */
    public static ih3 m33611F() {
        return (ih3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static jh3 m33613I(eo3 eo3, wo3 wo3) throws wp3 {
        return (jh3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: M */
    static /* synthetic */ void m33615M(jh3 jh3, ph3 ph3) {
        ph3.getClass();
        jh3.zzf = ph3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new jh3();
        } else {
            if (i2 == 4) {
                return new ih3((hh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo32891E() {
        return this.zze;
    }

    /* renamed from: J */
    public final ph3 mo32892J() {
        ph3 ph3 = this.zzf;
        return ph3 == null ? ph3.m36078I() : ph3;
    }

    /* renamed from: K */
    public final eo3 mo32893K() {
        return this.zzg;
    }
}
