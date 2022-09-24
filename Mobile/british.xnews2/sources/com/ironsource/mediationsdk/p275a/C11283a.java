package com.ironsource.mediationsdk.p275a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.a */
abstract class C11283a {

    /* renamed from: a */
    private final String f50649a = "eventId";

    /* renamed from: b */
    private final String f50650b = "timestamp";

    /* renamed from: c */
    private final String f50651c = "InterstitialEvents";

    /* renamed from: d */
    private final String f50652d = "events";

    /* renamed from: e */
    private final String f50653e = "events";

    /* renamed from: f */
    JSONObject f50654f;

    /* renamed from: g */
    int f50655g;

    /* renamed from: h */
    String f50656h;

    C11283a() {
    }

    /* renamed from: c */
    static JSONObject m50392c(C11308a aVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(aVar.mo44041c()) ? new JSONObject(aVar.mo44041c()) : new JSONObject();
            jSONObject.put("eventId", aVar.mo44037a());
            jSONObject.put("timestamp", aVar.mo44040b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43966a() {
        return TextUtils.isEmpty(this.f50656h) ? mo43968b() : this.f50656h;
    }

    /* renamed from: a */
    public abstract String mo43967a(ArrayList<C11308a> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo43968b();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo43969b(JSONArray jSONArray) {
        try {
            if (this.f50654f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f50654f.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f50655g == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public abstract String mo43970c();
}
