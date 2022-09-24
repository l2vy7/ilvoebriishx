package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ot1 {

    /* renamed from: a */
    private final Map<String, Map<String, JSONObject>> f20613a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f20614b;

    /* renamed from: c */
    private final Executor f20615c;

    /* renamed from: d */
    private boolean f20616d;

    /* renamed from: e */
    private JSONObject f20617e;

    public ot1(Executor executor) {
        this.f20615c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final synchronized void mo18611f() {
        Map map;
        this.f20616d = true;
        in0 zzg = zzt.zzo().mo18583h().zzg();
        if (zzg != null) {
            JSONObject f = zzg.mo32724f();
            if (f != null) {
                this.f20614b = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36850C2)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.f20617e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f20613a.containsKey(optString2)) {
                                    map = this.f20613a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f20613a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    @CheckForNull
    /* renamed from: a */
    public final JSONObject mo18606a() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36850C2)).booleanValue()) {
            return null;
        }
        return this.f20614b;
    }

    @CheckForNull
    /* renamed from: b */
    public final JSONObject mo18607b(String str, String str2) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36842B2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f20616d) {
            mo18611f();
        }
        Map map = this.f20613a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = qt1.m36735a(this.f20617e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    /* renamed from: c */
    public final void mo18608c() {
        zzt.zzo().mo18583h().zzo(new lt1(this));
        this.f20615c.execute(new nt1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo18610e() {
        this.f20615c.execute(new kt1(this));
    }
}
