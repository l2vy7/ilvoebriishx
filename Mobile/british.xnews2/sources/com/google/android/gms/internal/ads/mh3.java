package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mh3 extends kp3<mh3, lh3> implements vq3 {
    /* access modifiers changed from: private */
    public static final mh3 zzb;
    private ph3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        mh3 mh3 = new mh3();
        zzb = mh3;
        kp3.m34067t(mh3.class, mh3);
    }

    private mh3() {
    }

    /* renamed from: F */
    public static lh3 m34796F() {
        return (lh3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static mh3 m34798I(eo3 eo3, wo3 wo3) throws wp3 {
        return (mh3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: K */
    static /* synthetic */ void m34799K(mh3 mh3, ph3 ph3) {
        ph3.getClass();
        mh3.zze = ph3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new mh3();
        } else {
            if (i2 == 4) {
                return new lh3((kh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33546E() {
        return this.zzf;
    }

    /* renamed from: J */
    public final ph3 mo33547J() {
        ph3 ph3 = this.zze;
        return ph3 == null ? ph3.m36078I() : ph3;
    }
}
