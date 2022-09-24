package com.startapp;

import android.app.Activity;
import com.google.android.exoplayer2.C6540C;
import java.net.URLDecoder;
import java.util.Map;

/* renamed from: com.startapp.t0 */
/* compiled from: Sta */
public abstract class C12336t0 implements C11902f6 {
    private static final String LOG_TAG = "t0";
    public C12337a openListener;

    /* renamed from: com.startapp.t0$a */
    /* compiled from: Sta */
    public interface C12337a {
        boolean onClickEvent(String str);
    }

    public C12336t0(C12337a aVar) {
        this.openListener = aVar;
    }

    public void applyOrientationProperties(Activity activity, C12047m6 m6Var) {
        try {
            int i = 0;
            int i2 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i3 = m6Var.f53277b;
            if (i3 == 0) {
                i = 1;
            } else if (i3 != 1) {
                i = m6Var.f53276a ? -1 : i2;
            }
            int i4 = C12437y.f55146a;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    public abstract void close();

    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    public boolean open(String str) {
        try {
            String trim = URLDecoder.decode(str, C6540C.UTF8_NAME).trim();
            if (trim.startsWith("sms")) {
                return openSMS(trim);
            }
            if (trim.startsWith("tel")) {
                return openTel(trim);
            }
            return this.openListener.onClickEvent(trim);
        } catch (Exception unused) {
            return this.openListener.onClickEvent(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    public void resize() {
    }

    public void setExpandProperties(Map<String, String> map) {
    }

    public abstract void setOrientationProperties(Map<String, String> map);

    public void setResizeProperties(Map<String, String> map) {
    }

    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    public abstract void useCustomClose(String str);
}
