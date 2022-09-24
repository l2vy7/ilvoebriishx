package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class lm0 {

    /* renamed from: a */
    static lm0 f35135a;

    /* renamed from: d */
    public static synchronized lm0 m34501d(Context context) {
        synchronized (lm0.class) {
            lm0 lm0 = f35135a;
            if (lm0 != null) {
                return lm0;
            }
            Context applicationContext = context.getApplicationContext();
            p00.m35913c(applicationContext);
            zzg h = zzt.zzo().mo18583h();
            h.zzp(applicationContext);
            pl0 pl0 = new pl0((ol0) null);
            pl0.mo34148b(applicationContext);
            pl0.mo34149c(zzt.zzA());
            pl0.mo34147a(h);
            pl0.mo34150d(zzt.zzn());
            lm0 e = pl0.mo34151e();
            f35135a = e;
            e.mo33356a().mo32644a();
            f35135a.mo33357b().mo33554c();
            pm0 c = f35135a.mo33358c();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37139l0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) C8311wv.m39277c().mo18570b(p00.f37157n0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String c2 : hashMap.keySet()) {
                        c.mo34155c(c2);
                    }
                    c.mo34156d(new nm0(c, hashMap));
                } catch (JSONException e2) {
                    co0.zzf("Failed to parse listening list", e2);
                }
            }
            lm0 lm02 = f35135a;
            return lm02;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract il0 mo33356a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract ml0 mo33357b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract pm0 mo33358c();
}
