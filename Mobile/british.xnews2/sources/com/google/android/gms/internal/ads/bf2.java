package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bf2 implements zi2<yi2<Bundle>> {

    /* renamed from: a */
    private final bo2 f29994a;

    bf2(bo2 bo2) {
        this.f29994a = bo2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo30669a(Bundle bundle) {
        bundle.putString("key_schema", this.f29994a.mo18173a());
    }

    public final mb3<yi2<Bundle>> zzb() {
        bo2 bo2 = this.f29994a;
        af2 af2 = null;
        if (!(bo2 == null || bo2.mo18173a() == null || this.f29994a.mo18173a().isEmpty())) {
            af2 = new af2(this);
        }
        return bb3.m30649i(af2);
    }
}
