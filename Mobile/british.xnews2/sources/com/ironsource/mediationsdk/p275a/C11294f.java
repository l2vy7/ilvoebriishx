package com.ironsource.mediationsdk.p275a;

import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.f */
final class C11294f extends C11283a {

    /* renamed from: i */
    private final String f50726i = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    C11294f(int i) {
        this.f50655g = i;
    }

    /* renamed from: a */
    public final String mo43967a(ArrayList<C11308a> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f50654f = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C11308a> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject c = C11283a.m50392c(it.next());
                if (c != null) {
                    jSONArray.put(c);
                }
            }
        }
        return mo43969b(jSONArray);
    }

    /* renamed from: b */
    public final String mo43968b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    /* renamed from: c */
    public final String mo43970c() {
        return "outcome";
    }
}
