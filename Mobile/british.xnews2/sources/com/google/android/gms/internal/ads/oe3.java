package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oe3 {

    /* renamed from: c */
    public static final oe3 f36450c = new oe3(0, 0, 1, 1, (qn2) null);

    /* renamed from: d */
    public static final wx3<oe3> f36451d = pw1.f37777a;

    /* renamed from: a */
    public final int f36452a = 1;

    /* renamed from: b */
    private AudioAttributes f36453b;

    /* synthetic */ oe3(int i, int i2, int i3, int i4, qn2 qn2) {
    }

    /* renamed from: a */
    public final AudioAttributes mo33889a() {
        if (this.f36453b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (d13.f20195a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f36453b = usage.build();
        }
        return this.f36453b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oe3.class != obj.getClass()) {
            return false;
        }
        oe3 oe3 = (oe3) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
