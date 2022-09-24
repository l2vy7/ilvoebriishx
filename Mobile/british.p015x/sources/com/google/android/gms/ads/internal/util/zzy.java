package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7728gq;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.xt0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class zzy extends zzx {
    public final int zzk() {
        return 16974374;
    }

    public final CookieManager zzl(Context context) {
        if (zzae.zzu()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            co0.zzh("Failed to obtain CookieManager.", th);
            zzt.zzo().mo18592s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzm(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final eu0 zzn(xt0 xt0, C7728gq gqVar, boolean z) {
        return new cv0(xt0, gqVar, z);
    }
}
