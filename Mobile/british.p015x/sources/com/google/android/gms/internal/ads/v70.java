package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v70 implements e70<Object> {

    /* renamed from: a */
    private final u70 f40331a;

    public v70(u70 u70) {
        this.f40331a = u70;
    }

    /* renamed from: b */
    public static void m38737b(xt0 xt0, u70 u70) {
        xt0.mo18726O("/reward", new v70(u70));
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzces zzces = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get(SessionDescription.ATTR_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    zzces = new zzces(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                co0.zzk("Unable to parse reward amount.", e);
            }
            this.f40331a.mo18913C(zzces);
        } else if ("video_start".equals(str)) {
            this.f40331a.zzc();
        } else if ("video_complete".equals(str)) {
            this.f40331a.zzb();
        }
    }
}
