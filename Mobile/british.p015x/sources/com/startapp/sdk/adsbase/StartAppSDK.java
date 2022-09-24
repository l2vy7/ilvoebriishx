package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.startapp.C11882e4;
import com.startapp.C5004d4;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: Sta */
public class StartAppSDK {
    public static void addWrapper(Context context, String str, String str2) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        if (startAppSDKInternal.f22284p == null) {
            startAppSDKInternal.f22284p = new TreeMap();
        }
        startAppSDKInternal.f22284p.put(str, str2);
        C5069e d = ComponentLocator.m23305a(context).mo21217d();
        Map<String, String> map = startAppSDKInternal.f22284p;
        Map<Activity, Integer> map2 = C5015nb.f22145a;
        String jSONObject = new JSONObject(map).toString();
        C5069e.C5070a a = d.edit();
        a.mo21101a("sharedPrefsWrappers", jSONObject);
        a.f22385a.putString("sharedPrefsWrappers", jSONObject);
        a.apply();
    }

    public static void enableReturnAds(boolean z) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.mo20979a(z);
    }

    public static SharedPreferences getExtras(Context context) {
        return ComponentLocator.m23305a(context).f22429E.mo46698b();
    }

    public static String getVersion() {
        return "4.10.2";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static void setTestAdsEnabled(boolean z) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.f22268B = z;
    }

    public static void setUserConsent(Context context, String str, long j, boolean z) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            C5069e d = ComponentLocator.m23305a(context).mo21217d();
            String string = d.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", (String) null);
            String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (string != null) {
                if (string.equals(z ? str2 : SessionDescription.SUPPORTED_SDP_VERSION)) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(z ? str2 : SessionDescription.SUPPORTED_SDP_VERSION);
            sb.append("M");
            String sb2 = sb.toString();
            C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
            d4Var.f22126d = "User consent: " + str;
            d4Var.f22127e = sb2;
            d4Var.mo20661a();
            C5069e.C5070a a = d.edit();
            if (!z) {
                str2 = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            a.mo21101a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            a.f22385a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            a.apply();
            C5014n9.f22141d.mo20678a(context, MetaDataRequest.RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.mo20983b(context, MetaDataRequest.RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d) {
        C5069e d2 = ComponentLocator.m23305a(context).mo21217d();
        float f = d2.getFloat("inAppPurchaseAmount", 0.0f);
        C5069e.C5070a a = d2.edit();
        double d3 = (double) f;
        Double.isNaN(d3);
        float f2 = (float) (d3 + d);
        a.mo21101a("inAppPurchaseAmount", Float.valueOf(f2));
        a.f22385a.putFloat("inAppPurchaseAmount", f2);
        a.mo21101a("payingUser", Boolean.TRUE);
        a.f22385a.putBoolean("payingUser", true);
        a.apply();
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.mo20983b(context, MetaDataRequest.RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    public static void init(Context context, String str, boolean z) {
        init(context, (String) null, str, z);
    }

    public static void init(Context context, String str, String str2, boolean z) {
        init(context, str, str2, new SDKAdPreferences(), z);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z) {
        init(context, (String) null, str, sDKAdPreferences, z);
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.mo20978a(context, str, str2, sDKAdPreferences, z);
    }
}
