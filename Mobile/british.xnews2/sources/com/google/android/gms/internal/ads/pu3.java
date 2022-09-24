package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class pu3<K, V, V2> {

    /* renamed from: a */
    final LinkedHashMap<K, iv3<V>> f37771a;

    pu3(int i) {
        this.f37771a = ru3.m37251b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final pu3<K, V, V2> mo34193a(K k, iv3<V> iv3) {
        LinkedHashMap<K, iv3<V>> linkedHashMap = this.f37771a;
        cv3.m31155a(k, "key");
        cv3.m31155a(iv3, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(k, iv3);
        return this;
    }
}
