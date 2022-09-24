package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.h0 */
class C2788h0 {

    /* renamed from: c */
    private static final String f11338c = "version";

    /* renamed from: d */
    private static final String f11339d = "streams";

    /* renamed from: a */
    private final int f11340a;

    /* renamed from: b */
    private final List<C2789a> f11341b = new ArrayList();

    /* renamed from: com.adcolony.sdk.h0$a */
    static class C2789a {

        /* renamed from: j */
        private static final String f11342j = "stream";

        /* renamed from: k */
        private static final String f11343k = "table_name";

        /* renamed from: l */
        private static final String f11344l = "max_rows";

        /* renamed from: m */
        private static final String f11345m = "event_types";

        /* renamed from: n */
        private static final String f11346n = "request_types";

        /* renamed from: o */
        private static final String f11347o = "columns";

        /* renamed from: p */
        private static final String f11348p = "indexes";

        /* renamed from: q */
        private static final String f11349q = "ttl";

        /* renamed from: r */
        private static final String f11350r = "queries";

        /* renamed from: s */
        private static final int f11351s = 10000;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f11352a;

        /* renamed from: b */
        private final String f11353b;

        /* renamed from: c */
        private final int f11354c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String[] f11355d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String[] f11356e;

        /* renamed from: f */
        private final List<C2790b> f11357f = new ArrayList();

        /* renamed from: g */
        private final List<C2792c> f11358g = new ArrayList();

        /* renamed from: h */
        private final C2793d f11359h;

        /* renamed from: i */
        private final Map<String, String> f11360i = new HashMap();

        C2789a(JSONObject jSONObject) throws JSONException {
            this.f11352a = jSONObject.getString(f11342j);
            this.f11353b = jSONObject.getString(f11343k);
            this.f11354c = jSONObject.optInt(f11344l, 10000);
            JSONArray optJSONArray = jSONObject.optJSONArray(f11345m);
            this.f11355d = optJSONArray != null ? C2976x.m10317a(optJSONArray) : new String[0];
            JSONArray optJSONArray2 = jSONObject.optJSONArray(f11346n);
            this.f11356e = optJSONArray2 != null ? C2976x.m10317a(optJSONArray2) : new String[0];
            for (JSONObject bVar : C2976x.m10326b(jSONObject.getJSONArray(f11347o))) {
                this.f11357f.add(new C2790b(bVar));
            }
            for (JSONObject cVar : C2976x.m10326b(jSONObject.getJSONArray(f11348p))) {
                this.f11358g.add(new C2792c(cVar, this.f11353b));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(f11349q);
            this.f11359h = optJSONObject != null ? new C2793d(optJSONObject) : null;
            JSONObject jSONObject2 = jSONObject.getJSONObject(f11350r);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f11360i.put(next, jSONObject2.getString(next));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo9677d() {
            return this.f11354c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo9678e() {
            return this.f11352a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, String> mo9679f() {
            return this.f11360i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String[] mo9680g() {
            return this.f11356e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public String mo9681h() {
            return this.f11353b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C2793d mo9682i() {
            return this.f11359h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C2790b> mo9674a() {
            return this.f11357f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String[] mo9675b() {
            return this.f11355d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public List<C2792c> mo9676c() {
            return this.f11358g;
        }
    }

    /* renamed from: com.adcolony.sdk.h0$b */
    static class C2790b {

        /* renamed from: d */
        private static final String f11361d = "name";

        /* renamed from: e */
        private static final String f11362e = "type";

        /* renamed from: f */
        private static final String f11363f = "default";

        /* renamed from: a */
        private final String f11364a;

        /* renamed from: b */
        private final String f11365b;

        /* renamed from: c */
        private final Object f11366c;

        /* renamed from: com.adcolony.sdk.h0$b$a */
        static class C2791a {

            /* renamed from: a */
            static final String f11367a = "TEXT";

            /* renamed from: b */
            static final String f11368b = "INTEGER";

            /* renamed from: c */
            static final String f11369c = "REAL";

            C2791a() {
            }
        }

        C2790b(JSONObject jSONObject) throws JSONException {
            this.f11364a = jSONObject.getString("name");
            this.f11365b = jSONObject.getString("type");
            this.f11366c = !jSONObject.isNull("default") ? jSONObject.get("default") : null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo9683a() {
            return this.f11366c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9684b() {
            return this.f11364a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo9685c() {
            return this.f11365b;
        }
    }

    /* renamed from: com.adcolony.sdk.h0$c */
    static class C2792c {

        /* renamed from: c */
        private static final String f11370c = "name";

        /* renamed from: d */
        private static final String f11371d = "columns";

        /* renamed from: a */
        private final String f11372a;

        /* renamed from: b */
        private final String[] f11373b;

        C2792c(JSONObject jSONObject, String str) throws JSONException {
            this.f11372a = str + "_" + jSONObject.getString("name");
            this.f11373b = C2976x.m10317a(jSONObject.getJSONArray(f11371d));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String[] mo9686a() {
            return this.f11373b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9687b() {
            return this.f11372a;
        }
    }

    /* renamed from: com.adcolony.sdk.h0$d */
    static class C2793d {

        /* renamed from: c */
        private static final String f11374c = "seconds";

        /* renamed from: d */
        private static final String f11375d = "column";

        /* renamed from: a */
        private final long f11376a;

        /* renamed from: b */
        private final String f11377b;

        C2793d(JSONObject jSONObject) throws JSONException {
            this.f11376a = jSONObject.getLong(f11374c);
            this.f11377b = jSONObject.getString(f11375d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9688a() {
            return this.f11377b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo9689b() {
            return this.f11376a;
        }
    }

    C2788h0(JSONObject jSONObject) throws JSONException {
        this.f11340a = jSONObject.getInt("version");
        for (JSONObject aVar : C2976x.m10326b(jSONObject.getJSONArray(f11339d))) {
            this.f11341b.add(new C2789a(aVar));
        }
    }

    /* renamed from: a */
    static C2788h0 m9600a(JSONObject jSONObject) {
        try {
            return new C2788h0(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9672b() {
        return this.f11340a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C2789a> mo9671a() {
        return this.f11341b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2789a mo9673b(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C2789a next : this.f11341b) {
            int i = 0;
            for (String equals : next.f11355d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b = next.f11356e;
            int length = b.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2789a mo9670a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C2789a next : this.f11341b) {
            if (str.equals(next.f11352a)) {
                return next;
            }
        }
        return null;
    }
}
