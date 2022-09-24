package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g60 implements e70<xt0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                co0.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                co0.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzt.zzA().elapsedRealtime() + (Long.parseLong(str4) - zzt.zzA().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    xt0.zzo().mo18176c(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    co0.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                co0.zzj("No value given for CSI experiment.");
            } else {
                xt0.zzo().mo18174a().mo18243d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(MediationMetaData.KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                co0.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                co0.zzj("No name given for CSI extra.");
            } else {
                xt0.zzo().mo18174a().mo18243d(str6, str7);
            }
        }
    }
}
