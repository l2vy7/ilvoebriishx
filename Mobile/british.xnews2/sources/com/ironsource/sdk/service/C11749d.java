package com.ironsource.sdk.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.p286a.C11516a;
import com.ironsource.sdk.p286a.C11520d;
import com.ironsource.sdk.p286a.C11522f;
import com.ironsource.sdk.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.d */
public class C11749d {

    /* renamed from: a */
    private static final String f52473a = "d";

    /* renamed from: b */
    private static final ArrayList<String> f52474b = new C11750a();

    /* renamed from: com.ironsource.sdk.service.d$a */
    static class C11750a extends ArrayList<String> {
        C11750a() {
            add("com.google.market");
            add("com.android.vending");
        }
    }

    /* renamed from: com.ironsource.sdk.service.d$b */
    static class C11751b extends JSONObject {

        /* renamed from: a */
        private /* synthetic */ boolean f52475a;

        C11751b(boolean z) {
            this.f52475a = z;
            put("isInstalled", this.f52475a);
        }
    }

    /* renamed from: a */
    private static JSONObject m51927a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b = m51929b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, new C11751b(b.contains(next.trim().toLowerCase())));
            }
        } catch (Exception e) {
            C11520d.m51360a(C11522f.f51814m, (Map<String, Object>) new C11516a().mo44598a("callfailreason", e.getMessage()).mo44598a("generalmessage", arrayList.toString()).f51793a);
            Logger.m51949d(f52473a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m51928a(Context context) {
        JSONObject a = m51927a(context, f52474b);
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ArrayList<String> m51929b(Context context) {
        List<ApplicationInfo> q = C4979h.m22822q(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo next : q) {
            if (next != null) {
                arrayList.add(next.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
