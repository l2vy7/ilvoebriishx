package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(28)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzac extends zzaa {
    /* renamed from: b */
    static final /* synthetic */ WindowInsets m19814b(Activity activity, View view, WindowInsets windowInsets) {
        if (zzt.zzo().mo18583h().zzl() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg h = zzt.zzo().mo18583h();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                h.zzA(str);
            } else {
                zzt.zzo().mo18583h().zzA(str);
            }
        }
        m19815c(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    private static final void m19815c(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    public final void zzr(Activity activity) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36984T0)).booleanValue() && zzt.zzo().mo18583h().zzl() == null && !activity.isInMultiWindowMode()) {
            m19815c(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzab(this, activity));
        }
    }
}
