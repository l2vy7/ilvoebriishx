package com.ironsource.mediationsdk.p275a;

import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.e */
final class C11293e extends C11283a {

    /* renamed from: i */
    private final String f50722i = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: j */
    private final String f50723j = "super.dwh.mediation_events";

    /* renamed from: k */
    private final String f50724k = "table";

    /* renamed from: l */
    private final String f50725l = "data";

    C11293e(int i) {
        this.f50655g = i;
    }

    /* renamed from: a */
    public final String mo43967a(ArrayList<C11308a> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f50654f = jSONObject;
        try {
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
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", mo43969b(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo43968b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    /* renamed from: c */
    public final String mo43970c() {
        return "ironbeast";
    }
}
