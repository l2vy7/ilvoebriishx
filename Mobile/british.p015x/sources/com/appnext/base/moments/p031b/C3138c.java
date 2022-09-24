package com.appnext.base.moments.p031b;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.base.moments.p028a.C3127a;
import com.appnext.base.moments.p028a.p029a.C3129b;
import com.appnext.base.moments.p031b.C3136b;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.appnext.base.moments.b.c */
public final class C3138c {
    /* renamed from: a */
    public static void m10612a(String str, String str2, C3136b.C3137a aVar) {
        try {
            C3127a.m10579Q().mo10556S().mo10577a(new C3129b(str, str2, aVar.getType()));
        } catch (Throwable th) {
            C3117a.m10553a("SdkHelper$insert", th);
        }
    }

    /* renamed from: c */
    public static boolean m10614c(Context context) throws Exception {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null || !advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m10615d(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null || advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C3117a.m10553a("SdkHelper$isLimitAdTrackingEnabled", th);
            return true;
        }
    }

    /* renamed from: c */
    public static long m10613c(String str, String str2) {
        long j;
        long j2;
        try {
            if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    int intValue = Integer.valueOf(str).intValue();
                    if ("second".equalsIgnoreCase(str2)) {
                        return (long) intValue;
                    }
                    if ("minute".equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = 60000;
                    } else if ("hour".equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = 3600000;
                    } else if ("day".equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = 86400000;
                    }
                    return j * j2;
                }
            }
            return -1;
        } catch (Throwable th) {
            C3117a.m10553a("SdkHelper$calculateIntervalInMS", th);
            return -1;
        }
    }
}
