package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class al3 extends kp3<al3, zk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final al3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private dl3 zzf;

    static {
        al3 al3 = new al3();
        zzb = al3;
        kp3.m34067t(al3.class, al3);
    }

    private al3() {
    }

    /* renamed from: F */
    public static zk3 m30385F() {
        return (zk3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static al3 m30387I(eo3 eo3, wo3 wo3) throws wp3 {
        return (al3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: L */
    static /* synthetic */ void m30389L(al3 al3, dl3 dl3) {
        dl3.getClass();
        al3.zzf = dl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new al3();
        } else {
            if (i2 == 4) {
                return new zk3((yk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo30418E() {
        return this.zze;
    }

    /* renamed from: J */
    public final dl3 mo30419J() {
        dl3 dl3 = this.zzf;
        return dl3 == null ? dl3.m31467H() : dl3;
    }
}
