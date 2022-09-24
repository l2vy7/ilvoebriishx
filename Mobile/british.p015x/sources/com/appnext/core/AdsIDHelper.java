package com.appnext.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import p252t4.C11013c;
import p252t4.C11014d;

public class AdsIDHelper {
    /* renamed from: a */
    protected static String m10637a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return "";
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
            if (advertisingIdInfo != null) {
                if (z) {
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        return "";
                    }
                }
                return advertisingIdInfo.getId();
            }
        } catch (IOException | C11013c | C11014d unused) {
        }
        return "";
    }

    public static boolean isOptOut(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
