package com.appnext.core.p035ra.p036a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.C3198g;
import com.appnext.core.p035ra.database.C3229a;
import com.appnext.core.p035ra.database.RecentAppsDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.core.ra.a.d */
public class C3225d extends C3222b {
    public C3225d(Context context, Bundle bundle) {
        super(context, bundle);
    }

    /* renamed from: c */
    private void m10866c(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject.toString());
            C3198g.m10778a(getContext(), "https://global.appnext.com/AdminService.asmx/ra?", (HashMap<String, String>) hashMap, false, 10000);
        } catch (Throwable th) {
            C3117a.m10553a("SendRecentAppsAction$sendToServer", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public final void mo10834aM() {
        try {
            JSONObject jSONObject = new JSONObject();
            List<C3229a> aS = RecentAppsDatabase.getInstance(getContext()).recentAppDao().mo10847aS();
            if (!aS.isEmpty()) {
                String b = C3198g.m10787b(getContext(), true);
                if (!TextUtils.isEmpty(b)) {
                    jSONObject.put("did", b);
                    jSONObject.put("publisher_packagename", getContext().getPackageName());
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = new ArrayList();
                    for (C3229a next : aS) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("package_name", next.f12414eQ);
                        jSONObject2.put("date", next.f12415eR);
                        jSONArray.put(jSONObject2);
                        next.f12416eS = true;
                        arrayList.add(next);
                    }
                    jSONObject.put("apps", jSONArray);
                    m10866c(jSONObject);
                    RecentAppsDatabase.getInstance(getContext()).recentAppDao().mo10849c(arrayList);
                    jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("SendRecentAppsAction$doUniqueAction", th);
            return;
        }
        try {
            RecentAppsDatabase.getInstance(getContext()).recentAppDao().mo10845E(C3222b.m10860aQ().format(new Date()));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aN */
    public final boolean mo10835aN() {
        return true;
    }
}
