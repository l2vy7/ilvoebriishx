package p119n3;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p107l3.C5673c;

/* renamed from: n3.a */
/* compiled from: ErrorReportData */
public final class C5852a {

    /* renamed from: a */
    private String f24601a;

    /* renamed from: b */
    private String f24602b;

    /* renamed from: c */
    private Long f24603c;

    public C5852a(String str) {
        this.f24603c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f24602b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f24603c);
        stringBuffer.append(".json");
        this.f24601a = stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo22758a() {
        C5673c.m25026a(this.f24601a);
    }

    /* renamed from: b */
    public int mo22759b(C5852a aVar) {
        Long l = this.f24603c;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f24603c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: c */
    public JSONObject mo22760c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f24603c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f24602b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo22761d() {
        return (this.f24602b == null || this.f24603c == null) ? false : true;
    }

    /* renamed from: e */
    public void mo22762e() {
        if (mo22761d()) {
            C5673c.m25034i(this.f24601a, toString());
        }
    }

    public String toString() {
        JSONObject c = mo22760c();
        if (c == null) {
            return null;
        }
        return c.toString();
    }

    public C5852a(File file) {
        String name = file.getName();
        this.f24601a = name;
        JSONObject g = C5673c.m25032g(name, true);
        if (g != null) {
            this.f24603c = Long.valueOf(g.optLong("timestamp", 0));
            this.f24602b = g.optString("error_message", (String) null);
        }
    }
}
