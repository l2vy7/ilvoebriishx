package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gi2 implements yi2<Bundle> {

    /* renamed from: a */
    private final String f32344a;

    public gi2(String str) {
        this.f32344a = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f32344a)) {
            bundle.putString("query_info", this.f32344a);
        }
    }
}
