package com.ironsource.environment.p061e;

import com.ironsource.environment.C4983j;
import com.ironsource.environment.p059c.C4966b;
import java.util.ArrayList;
import org.json.JSONObject;
import p304e8.C12691c;

/* renamed from: com.ironsource.environment.e.b */
public final class C4976b {

    /* renamed from: a */
    private final ArrayList<String> f22046a = new ArrayList<>(new C4975a().f22045a);

    /* renamed from: b */
    private final C4983j f22047b = new C4983j();

    /* renamed from: a */
    public final JSONObject mo20588a() {
        JSONObject a = C4983j.m22836a(this.f22046a);
        C12691c.m53983b(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        JSONObject a2 = C4966b.m22758a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}
