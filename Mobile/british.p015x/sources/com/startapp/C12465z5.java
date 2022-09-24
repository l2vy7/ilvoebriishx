package com.startapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.startapp.z5 */
/* compiled from: Sta */
public class C12465z5 {

    /* renamed from: a */
    public String f55194a;

    /* renamed from: b */
    public boolean f55195b = true;

    /* renamed from: c */
    public boolean f55196c = true;

    public C12465z5(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    if (obj != null) {
                        this.f55194a = obj.toString();
                        Log.i("StartAppSDK", "appId is " + this.f55194a);
                        if (applicationInfo.metaData.containsKey("com.startapp.sdk.RETURN_ADS_ENABLED")) {
                            this.f55195b = applicationInfo.metaData.getBoolean("com.startapp.sdk.RETURN_ADS_ENABLED");
                            Log.i("StartAppSDK", "returnAds enabled: " + this.f55195b);
                        }
                        if (applicationInfo.metaData.containsKey("com.startapp.sdk.SPLASH_ENABLED")) {
                            this.f55196c = applicationInfo.metaData.getBoolean("com.startapp.sdk.SPLASH_ENABLED");
                            Log.i("StartAppSDK", "splash enabled: " + this.f55196c);
                            return;
                        }
                        return;
                    }
                    Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }
}
