package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.vn0;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class zzz extends zzy {
    /* renamed from: a */
    static final boolean m28856a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zzo(Activity activity, Configuration configuration) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37196r3)).booleanValue()) {
            return false;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37213t3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C8241uv.m38463b();
        int s = vn0.m38860s(activity, configuration.screenHeightDp);
        int s2 = vn0.m38860s(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzy = zzt.zzy((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzy.heightPixels;
        int i2 = zzy.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) C8311wv.m39277c().mo18570b(p00.f37178p3)).intValue();
        if (!m28856a(i, s + dimensionPixelSize, round) || !m28856a(i2, s2, round)) {
            return true;
        }
        return false;
    }
}
