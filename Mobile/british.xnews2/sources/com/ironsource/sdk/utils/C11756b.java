package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.p293g.C11710f;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.utils.b */
public class C11756b {

    /* renamed from: b */
    private static C11756b f52500b;

    /* renamed from: a */
    public SharedPreferences f52501a;

    private C11756b(Context context) {
        this.f52501a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C11756b m51963a() {
        C11756b bVar;
        synchronized (C11756b.class) {
            bVar = f52500b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C11756b m51964a(Context context) {
        C11756b bVar;
        synchronized (C11756b.class) {
            if (f52500b == null) {
                f52500b = new C11756b(context);
            }
            bVar = f52500b;
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m51965b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    /* renamed from: c */
    private String m51966c() {
        return this.f52501a.getString(MediationMetaData.KEY_VERSION, "-1");
    }

    /* renamed from: a */
    public final void mo45070a(String str) {
        if (!m51966c().equalsIgnoreCase(str)) {
            SharedPreferences.Editor edit = this.f52501a.edit();
            edit.putString(MediationMetaData.KEY_VERSION, str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo45071a(String str, String str2, String str3) {
        String string = this.f52501a.getString("ssaUserData", (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f52501a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            return edit.commit();
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final List<String> mo45072b() {
        String string = this.f52501a.getString("search_keys", (String) null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C11710f fVar = new C11710f(string);
            if (fVar.mo45019a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.mo45016a((JSONArray) fVar.mo45021c("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
