package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.environment.p059c.C4962a;
import com.ironsource.environment.p059c.C4966b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.j */
public class C4983j {
    /* renamed from: a */
    public static JSONObject m22836a(ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4962a aVar = C4962a.C4964a.f22023a;
        aVar.mo20580a(applicationContext);
        JSONObject jSONObject2 = new JSONObject(C4966b.m22757a(aVar.f22018a));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (jSONObject2.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22837a(Context context, String str, String str2, String str3) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }

    /* renamed from: b */
    public static String m22838b(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
