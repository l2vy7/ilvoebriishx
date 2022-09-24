package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class jp1 implements ha3 {

    /* renamed from: a */
    public final /* synthetic */ mb3 f33964a;

    public /* synthetic */ jp1(mb3 mb3) {
        this.f33964a = mb3;
    }

    public final mb3 zza(Object obj) {
        mb3 mb3 = this.f33964a;
        xt0 xt0 = (xt0) obj;
        if (xt0 != null && xt0.zzs() != null) {
            return mb3;
        }
        throw new l82(1, "Retrieve video view in html5 ad response failed.");
    }
}
