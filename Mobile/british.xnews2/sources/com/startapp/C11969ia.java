package com.startapp;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.ia */
/* compiled from: Sta */
public class C11969ia {

    /* renamed from: b */
    public static final C11969ia f53115b = new C11969ia(new JSONObject());

    /* renamed from: a */
    public final JSONObject f53116a;

    public C11969ia() {
        this(new JSONObject());
    }

    /* renamed from: a */
    public final void mo45454a(int i, Object obj) {
        try {
            this.f53116a.put(String.valueOf(i), obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final String mo45455b(int i) {
        Object opt = this.f53116a.opt(String.valueOf(i));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public C11969ia(JSONObject jSONObject) {
        this.f53116a = jSONObject;
    }

    /* renamed from: a */
    public final int mo45453a(int i) {
        Object opt = this.f53116a.opt(String.valueOf(i));
        if (opt instanceof Number) {
            return ((Number) opt).intValue();
        }
        return 0;
    }
}
