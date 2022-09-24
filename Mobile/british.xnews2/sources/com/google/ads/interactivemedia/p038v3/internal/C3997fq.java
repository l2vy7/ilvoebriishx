package com.google.ads.interactivemedia.p038v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import p251t4.C11013c;
import p251t4.C11014d;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fq */
/* compiled from: IMASDK */
public final class C3997fq {
    public final String deviceId;
    public final String idType;
    public final boolean isLimitedAdTracking;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3997fq(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            com.google.ads.interactivemedia.v3.internal.fp r0 = new com.google.ads.interactivemedia.v3.internal.fp
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r2)
            com.google.ads.interactivemedia.v3.internal.fp r0 = r3.getInfoFromPlayServices(r4)     // Catch:{ Exception | NoClassDefFoundError -> 0x0012 }
            java.lang.String r1 = "adid"
            goto L_0x0020
        L_0x0012:
            com.google.ads.interactivemedia.v3.internal.fp r0 = r3.getInfoFromContentResolver(r4)     // Catch:{ SettingNotFoundException -> 0x0019 }
            java.lang.String r1 = "afai"
            goto L_0x0020
        L_0x0019:
            java.lang.String r4 = "IMASDK"
            java.lang.String r2 = "Failed to get advertising ID."
            android.util.Log.w(r4, r2)
        L_0x0020:
            r3.idType = r1
            java.lang.String r4 = r0.f17076a
            r3.deviceId = r4
            boolean r4 = r0.f17077b
            r3.isLimitedAdTracking = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C3997fq.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public C3996fp getInfoFromContentResolver(Context context) throws Settings.SettingNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Secure.getString(contentResolver, "advertising_id");
        boolean z = true;
        if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
            z = false;
        }
        return new C3996fp(string, z);
    }

    /* access modifiers changed from: protected */
    public C3996fp getInfoFromPlayServices(Context context) throws IOException, C11013c, C11014d {
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        return new C3996fp(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
    }
}
