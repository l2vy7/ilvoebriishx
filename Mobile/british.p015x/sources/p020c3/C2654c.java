package p020c3;

import com.facebook.appevents.C3425p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c3.c */
/* compiled from: MetadataRule */
final class C2654c {

    /* renamed from: d */
    private static List<C2654c> f10456d = new ArrayList();

    /* renamed from: a */
    private String f10457a;

    /* renamed from: b */
    private List<String> f10458b;

    /* renamed from: c */
    private String f10459c;

    private C2654c(String str, List<String> list, String str2) {
        this.f10457a = str;
        this.f10458b = list;
        this.f10459c = str2;
    }

    /* renamed from: a */
    private static void m9295a(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2.has("k") && jSONObject2.has("v") && !jSONObject2.getString("k").isEmpty()) {
                        if (!jSONObject2.getString("v").isEmpty()) {
                            f10456d.add(new C2654c(next, Arrays.asList(jSONObject2.getString("k").split(",")), jSONObject2.getString("v")));
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: d */
    static List<C2654c> m9296d() {
        return new ArrayList(f10456d);
    }

    /* renamed from: f */
    private static void m9297f() {
        Map<String, String> e = C3425p.m11457e();
        if (!e.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C2654c c : f10456d) {
                hashSet.add(c.mo9332c());
            }
            ArrayList arrayList = new ArrayList();
            for (String next : e.keySet()) {
                if (!hashSet.contains(next)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                C3425p.m11461i(arrayList);
            }
        }
    }

    /* renamed from: g */
    static void m9298g(String str) {
        try {
            f10456d.clear();
            m9295a(new JSONObject(str));
            m9297f();
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<String> mo9331b() {
        return new ArrayList(this.f10458b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9332c() {
        return this.f10457a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9333e() {
        return this.f10459c;
    }
}
