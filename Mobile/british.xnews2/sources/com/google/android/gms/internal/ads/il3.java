package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class il3 extends kp3<il3, hl3> implements vq3 {
    /* access modifiers changed from: private */
    public static final il3 zzb;
    private String zze = "";
    private tp3<gk3> zzf = kp3.m34063p();

    static {
        il3 il3 = new il3();
        zzb = il3;
        kp3.m34067t(il3.class, il3);
    }

    private il3() {
    }

    /* renamed from: F */
    public static il3 m33245F() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", gk3.class});
        } else if (i2 == 3) {
            return new il3();
        } else {
            if (i2 == 4) {
                return new hl3((gl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final List<gk3> mo32646H() {
        return this.zzf;
    }
}
