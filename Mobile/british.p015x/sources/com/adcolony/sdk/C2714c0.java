package com.adcolony.sdk;

import com.adcolony.sdk.C2978z;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.c0 */
class C2714c0 {

    /* renamed from: a */
    private String f10679a;

    /* renamed from: b */
    private JSONObject f10680b;

    C2714c0(JSONObject jSONObject) {
        try {
            this.f10680b = jSONObject;
            this.f10679a = jSONObject.getString("m_type");
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON Error in ADCMessage constructor: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2714c0 mo9605a() {
        return mo9607a((JSONObject) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONObject mo9608b() {
        return this.f10680b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9611c() {
        return this.f10679a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9612d() {
        C2684a.m9406a(this.f10679a, this.f10680b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2714c0 mo9606a(String str) {
        return mo9607a(C2976x.m10320b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9610b(JSONObject jSONObject) {
        this.f10680b = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2714c0 mo9607a(JSONObject jSONObject) {
        try {
            C2714c0 c0Var = new C2714c0("reply", this.f10680b.getInt("m_origin"), jSONObject);
            c0Var.f10680b.put("m_id", this.f10680b.getInt("m_id"));
            return c0Var;
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON error in ADCMessage's createReply(): ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return new C2714c0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9609b(String str) {
        this.f10679a = str;
    }

    C2714c0(String str, int i) {
        try {
            this.f10679a = str;
            JSONObject jSONObject = new JSONObject();
            this.f10680b = jSONObject;
            jSONObject.put("m_target", i);
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON Error in ADCMessage constructor: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
        }
    }

    C2714c0(String str, int i, String str2) {
        try {
            this.f10679a = str;
            JSONObject b = C2976x.m10320b(str2);
            this.f10680b = b;
            b.put("m_target", i);
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON Error in ADCMessage constructor: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
        }
    }

    C2714c0(String str, int i, JSONObject jSONObject) {
        try {
            this.f10679a = str;
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.f10680b = jSONObject;
            jSONObject.put("m_target", i);
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON Error in ADCMessage constructor: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
        }
    }
}
