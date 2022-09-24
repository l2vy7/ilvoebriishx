package p072e3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e3.a */
/* compiled from: EventBinding */
public class C5229a {

    /* renamed from: a */
    private final String f22747a;

    /* renamed from: b */
    private final C5231b f22748b;

    /* renamed from: c */
    private final C5230a f22749c;

    /* renamed from: d */
    private final String f22750d;

    /* renamed from: e */
    private final List<C5233c> f22751e;

    /* renamed from: f */
    private final List<C5232b> f22752f;

    /* renamed from: g */
    private final String f22753g;

    /* renamed from: h */
    private final String f22754h;

    /* renamed from: i */
    private final String f22755i;

    /* renamed from: e3.a$a */
    /* compiled from: EventBinding */
    public enum C5230a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: e3.a$b */
    /* compiled from: EventBinding */
    public enum C5231b {
        MANUAL,
        INFERENCE
    }

    public C5229a(String str, C5231b bVar, C5230a aVar, String str2, List<C5233c> list, List<C5232b> list2, String str3, String str4, String str5) {
        this.f22747a = str;
        this.f22748b = bVar;
        this.f22749c = aVar;
        this.f22750d = str2;
        this.f22751e = list;
        this.f22752f = list2;
        this.f22753g = str3;
        this.f22754h = str4;
        this.f22755i = str5;
    }

    /* renamed from: c */
    public static C5229a m23716c(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        C5231b valueOf = C5231b.valueOf(string2.toUpperCase(locale));
        C5230a valueOf2 = C5230a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C5233c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C5232b(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C5229a(string, valueOf, valueOf2, string3, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p072e3.C5229a> m23717f(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            e3.a r3 = m23716c(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e3.C5229a.m23717f(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    public String mo21467a() {
        return this.f22755i;
    }

    /* renamed from: b */
    public String mo21468b() {
        return this.f22747a;
    }

    /* renamed from: d */
    public List<C5232b> mo21469d() {
        return Collections.unmodifiableList(this.f22752f);
    }

    /* renamed from: e */
    public List<C5233c> mo21470e() {
        return Collections.unmodifiableList(this.f22751e);
    }
}
