package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class un3 implements Comparator<eo3> {
    un3() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        eo3 eo3 = (eo3) obj;
        eo3 eo32 = (eo3) obj2;
        xn3 I = eo3.iterator();
        xn3 I2 = eo32.iterator();
        while (I.hasNext() && I2.hasNext()) {
            int a = tn3.m37926a(I.zza() & 255, I2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return tn3.m37926a(eo3.mo30457q(), eo32.mo30457q());
    }
}
