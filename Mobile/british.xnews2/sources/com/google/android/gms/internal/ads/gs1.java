package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gs1 implements uu3<C8059pq> {

    /* renamed from: a */
    private final iv3<bs2> f32447a;

    public gs1(iv3<bs2> iv3) {
        this.f32447a = iv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        C8059pq pqVar;
        if (((da1) this.f32447a).mo31191a().f30098o.f38265a == 3) {
            pqVar = C8059pq.REWARDED_INTERSTITIAL;
        } else {
            pqVar = C8059pq.REWARD_BASED_VIDEO_AD;
        }
        cv3.m31156b(pqVar);
        return pqVar;
    }
}
