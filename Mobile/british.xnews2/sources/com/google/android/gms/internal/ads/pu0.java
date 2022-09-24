package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pu0 implements e70<xt0> {

    /* renamed from: a */
    final /* synthetic */ ru0 f37768a;

    pu0(ru0 ru0) {
        this.f37768a = ru0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f37768a) {
                        if (this.f37768a.f20708G != parseInt) {
                            this.f37768a.f20708G = parseInt;
                            this.f37768a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    co0.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
