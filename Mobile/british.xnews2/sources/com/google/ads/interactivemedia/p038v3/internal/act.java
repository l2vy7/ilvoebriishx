package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.act */
/* compiled from: IMASDK */
public final class act {

    /* renamed from: a */
    public static final act f14200a = new act(new long[0]);

    /* renamed from: b */
    public final int f14201b;

    /* renamed from: c */
    public final long[] f14202c;

    /* renamed from: d */
    public final acs[] f14203d;

    /* renamed from: e */
    public final long f14204e = 0;

    private act(long[] jArr) {
        aup.m14885p(true);
        this.f14202c = jArr;
        int length = jArr.length;
        this.f14201b = length;
        acs[] acsArr = new acs[length];
        for (int i = 0; i < this.f14201b; i++) {
            acsArr[i] = new acs();
        }
        this.f14203d = acsArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && act.class == obj.getClass()) {
            act act = (act) obj;
            return amm.m14233c((Object) null, (Object) null) && this.f14201b == act.f14201b && Arrays.equals(this.f14202c, act.f14202c) && Arrays.equals(this.f14203d, act.f14203d);
        }
    }

    public final int hashCode() {
        return (((((this.f14201b * 29791) + ((int) C6540C.TIME_UNSET)) * 31) + Arrays.hashCode(this.f14202c)) * 31) + Arrays.hashCode(this.f14203d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append((Object) null);
        sb.append(", adResumePositionUs=");
        sb.append(0);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f14203d.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f14202c[i]);
            sb.append(", ads=[");
            int[] iArr = this.f14203d[i].f14198c;
            sb.append("])");
            if (i < this.f14203d.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
