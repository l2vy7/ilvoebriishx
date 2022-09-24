package p072e3;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e3.c */
/* compiled from: PathComponent */
public final class C5233c {

    /* renamed from: a */
    public final String f22767a;

    /* renamed from: b */
    public final int f22768b;

    /* renamed from: c */
    public final int f22769c;

    /* renamed from: d */
    public final String f22770d;

    /* renamed from: e */
    public final String f22771e;

    /* renamed from: f */
    public final String f22772f;

    /* renamed from: g */
    public final String f22773g;

    /* renamed from: h */
    public final int f22774h;

    /* renamed from: e3.c$a */
    /* compiled from: PathComponent */
    public enum C5234a {
        ID(1),
        f22776d(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: b */
        private final int f22781b;

        private C5234a(int i) {
            this.f22781b = i;
        }

        /* renamed from: d */
        public int mo21471d() {
            return this.f22781b;
        }
    }

    C5233c(JSONObject jSONObject) throws JSONException {
        this.f22767a = jSONObject.getString("class_name");
        this.f22768b = jSONObject.optInt("index", -1);
        this.f22769c = jSONObject.optInt(TtmlNode.ATTR_ID);
        this.f22770d = jSONObject.optString("text");
        this.f22771e = jSONObject.optString("tag");
        this.f22772f = jSONObject.optString("description");
        this.f22773g = jSONObject.optString("hint");
        this.f22774h = jSONObject.optInt("match_bitmask");
    }
}
