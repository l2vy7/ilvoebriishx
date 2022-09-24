package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y82 implements t42<rs2, q62> {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, u42<rs2, q62>> f41732a = new HashMap();

    /* renamed from: b */
    private final it1 f41733b;

    public y82(it1 it1) {
        this.f41733b = it1;
    }

    /* renamed from: a */
    public final u42<rs2, q62> mo32361a(String str, JSONObject jSONObject) throws gs2 {
        u42<rs2, q62> u42;
        synchronized (this) {
            u42 = this.f41732a.get(str);
            if (u42 == null) {
                u42 = new u42<>(this.f41733b.mo32764b(str, jSONObject), new q62(), str);
                this.f41732a.put(str, u42);
            }
        }
        return u42;
    }
}
