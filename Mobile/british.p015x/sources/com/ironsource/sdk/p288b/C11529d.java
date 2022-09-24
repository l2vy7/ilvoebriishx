package com.ironsource.sdk.p288b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.d */
public final class C11529d {

    /* renamed from: a */
    HashMap<String, Boolean> f51846a = new C11530a();

    /* renamed from: b */
    int f51847b = 4;

    /* renamed from: c */
    int f51848c = 4;

    /* renamed from: com.ironsource.sdk.b.d$a */
    class C11530a extends HashMap<String, Boolean> {
        C11530a() {
            boolean z = true;
            put("isVisible", Boolean.valueOf(C11529d.this.f51847b == 0));
            put("isWindowVisible", Boolean.valueOf(C11529d.this.f51848c != 0 ? false : z));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    C11529d() {
    }

    /* renamed from: a */
    public final JSONObject mo44619a() {
        return new JSONObject(this.f51846a);
    }
}
