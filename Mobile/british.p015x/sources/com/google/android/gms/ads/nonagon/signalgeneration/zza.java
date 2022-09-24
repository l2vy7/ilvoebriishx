package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zza extends LinkedHashMap<String, Pair<Long, String>> {

    /* renamed from: b */
    final /* synthetic */ zzb f28065b;

    zza(zzb zzb) {
        this.f28065b = zzb;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        return size() > this.f28065b.f28078a;
    }
}
