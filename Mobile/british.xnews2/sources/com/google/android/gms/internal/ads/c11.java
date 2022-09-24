package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c11 {

    /* renamed from: a */
    private final Map<String, f11> f30200a;

    /* renamed from: b */
    private final Map<String, e11> f30201b;

    c11(Map<String, f11> map, Map<String, e11> map2) {
        this.f30200a = map;
        this.f30201b = map2;
    }

    /* renamed from: a */
    public final void mo30841a(ur2 ur2) throws Exception {
        for (sr2 next : ur2.f39937b.f39520c) {
            if (this.f30200a.containsKey(next.f39037a)) {
                this.f30200a.get(next.f39037a).mo31708a(next.f39038b);
            } else if (this.f30201b.containsKey(next.f39037a)) {
                e11 e11 = this.f30201b.get(next.f39037a);
                JSONObject jSONObject = next.f39038b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    String optString = jSONObject.optString(next2);
                    if (optString != null) {
                        hashMap.put(next2, optString);
                    }
                }
                e11.mo31442a(hashMap);
            }
        }
    }
}
