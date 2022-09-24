package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t70 implements e70<Object> {

    /* renamed from: a */
    private final Object f20842a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private final Map<String, s70> f20843b = new HashMap();

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = map.get(TtmlNode.ATTR_ID);
        String str6 = map.get("fail");
        String str7 = map.get("fail_reason");
        String str8 = map.get("fail_stack");
        String str9 = map.get(IronSourceConstants.EVENTS_RESULT);
        if (true == TextUtils.isEmpty(str8)) {
            str7 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str8)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str8);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f20842a) {
            s70 remove = this.f20843b.remove(str5);
            if (remove == null) {
                String valueOf2 = String.valueOf(str5);
                if (valueOf2.length() != 0) {
                    str4 = "Received result for unexpected method invocation: ".concat(valueOf2);
                } else {
                    str4 = new String("Received result for unexpected method invocation: ");
                }
                co0.zzj(str4);
            } else if (!TextUtils.isEmpty(str6)) {
                String valueOf3 = String.valueOf(str7);
                String valueOf4 = String.valueOf(str);
                if (valueOf4.length() != 0) {
                    str3 = valueOf3.concat(valueOf4);
                } else {
                    str3 = new String(valueOf3);
                }
                remove.zza(str3);
            } else if (str9 == null) {
                remove.mo31196a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str9);
                    if (zze.zzc()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        if (valueOf5.length() != 0) {
                            str2 = "Result GMSG: ".concat(valueOf5);
                        } else {
                            str2 = new String("Result GMSG: ");
                        }
                        zze.zza(str2);
                    }
                    remove.mo31196a(jSONObject);
                } catch (JSONException e) {
                    remove.zza(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final <EngineT extends ga0> mb3<JSONObject> mo18855b(EngineT enginet, String str, JSONObject jSONObject) {
        uo0 uo0 = new uo0();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        mo18856c(uuid, new r70(this, uo0));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TtmlNode.ATTR_ID, uuid);
            jSONObject2.put("args", jSONObject);
            enginet.mo18317E0(str, jSONObject2);
        } catch (Exception e) {
            uo0.zze(e);
        }
        return uo0;
    }

    /* renamed from: c */
    public final void mo18856c(String str, s70 s70) {
        synchronized (this.f20842a) {
            this.f20843b.put(str, s70);
        }
    }
}
