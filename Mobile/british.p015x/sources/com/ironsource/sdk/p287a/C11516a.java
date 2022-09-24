package com.ironsource.sdk.p287a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sdk.a.a */
public final class C11516a {

    /* renamed from: a */
    public HashMap<String, Object> f51793a = new HashMap<>();

    /* renamed from: a */
    public final C11516a mo44598a(String str, Object obj) {
        if (obj != null) {
            this.f51793a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
