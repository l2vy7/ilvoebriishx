package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r51 {

    /* renamed from: c */
    public static final r51 f38540c = new r51((Object) null, new ff0[0], 0, C6540C.TIME_UNSET, 0);

    /* renamed from: d */
    private static final ff0 f38541d = new ff0(0).mo31847b(0);

    /* renamed from: e */
    public static final wx3<r51> f38542e = C7486a.f29478a;

    /* renamed from: a */
    public final long f38543a = 0;

    /* renamed from: b */
    private final ff0[] f38544b;

    private r51(Object obj, ff0[] ff0Arr, long j, long j2, int i) {
        this.f38544b = ff0Arr;
    }

    /* renamed from: a */
    public final ff0 mo34501a(int i) {
        return i < 0 ? f38541d : this.f38544b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r51.class == obj.getClass()) {
            return d13.m20317p((Object) null, (Object) null) && Arrays.equals(this.f38544b, ((r51) obj).f38544b);
        }
    }

    public final int hashCode() {
        return (((int) C6540C.TIME_UNSET) * 961) + Arrays.hashCode(this.f38544b);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }
}
