package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k22 implements fv2<j22, f22> {

    /* renamed from: a */
    private final String f34129a;

    public k22(String str) {
        this.f34129a = str;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        j22 j22 = (j22) obj;
        int optInt = j22.f33729a.optInt("http_timeout_millis", 60000);
        wi0 a = j22.f33730b;
        if (a.mo35623a() == -2) {
            HashMap hashMap = new HashMap();
            if (j22.f33730b.mo35630h() && !TextUtils.isEmpty(this.f34129a)) {
                hashMap.put("Cookie", this.f34129a);
            }
            String str = "";
            if (j22.f33730b.mo35631i()) {
                JSONObject optJSONObject = j22.f33729a.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            if (j22.f33730b != null && !TextUtils.isEmpty(j22.f33730b.mo35626d())) {
                str = j22.f33730b.mo35626d();
            }
            return new f22(j22.f33730b.mo35627e(), optInt, hashMap, str.getBytes(n33.f35887c), "");
        } else if (a.mo35623a() == 1) {
            if (a.mo35628f() != null) {
                co0.zzg(TextUtils.join(", ", a.mo35628f()));
            }
            throw new wy1(2, "Error building request URL.");
        } else {
            throw new wy1(1);
        }
    }
}
