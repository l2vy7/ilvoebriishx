package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kg3 extends kp3<kg3, jg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final kg3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;
    private qg3 zzg;

    static {
        kg3 kg3 = new kg3();
        zzb = kg3;
        kp3.m34067t(kg3.class, kg3);
    }

    private kg3() {
    }

    /* renamed from: F */
    public static jg3 m33939F() {
        return (jg3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static kg3 m33941I(eo3 eo3, wo3 wo3) throws wp3 {
        return (kg3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: N */
    static /* synthetic */ void m33944N(kg3 kg3, qg3 qg3) {
        qg3.getClass();
        kg3.zzg = qg3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new kg3();
        } else {
            if (i2 == 4) {
                return new jg3((ig3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33083E() {
        return this.zze;
    }

    /* renamed from: J */
    public final qg3 mo33084J() {
        qg3 qg3 = this.zzg;
        return qg3 == null ? qg3.m36467I() : qg3;
    }

    /* renamed from: K */
    public final eo3 mo33085K() {
        return this.zzf;
    }
}
