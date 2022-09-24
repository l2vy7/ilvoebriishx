package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.appnext.core.C3148Ad;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p294g.C11710f;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKUtils {

    /* renamed from: a */
    private static final String f52484a = "SDKUtils";

    /* renamed from: b */
    private static String f52485b = null;

    /* renamed from: c */
    private static boolean f52486c = true;

    /* renamed from: d */
    private static String f52487d = null;

    /* renamed from: e */
    private static int f52488e = 0;

    /* renamed from: f */
    private static String f52489f = null;

    /* renamed from: g */
    private static Map<String, String> f52490g = null;

    /* renamed from: h */
    private static String f52491h = "";

    /* renamed from: i */
    private static final AtomicInteger f52492i = new AtomicInteger(1);

    /* renamed from: com.ironsource.sdk.utils.SDKUtils$a */
    static class C11754a implements DialogInterface.OnClickListener {
        C11754a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public static int convertDpToPx(int i) {
        return (int) TypedValue.applyDimension(0, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    public static Handler createMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, C6540C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            String str2 = f52484a;
            Logger.m51949d(str2, "Failed decoding string " + e.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((((float) j) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, C6540C.UTF8_NAME).replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x001e, UnsupportedEncodingException -> 0x0018 }
            r1.reset()     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            r1.update(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            goto L_0x0023
        L_0x0014:
            r3 = move-exception
            goto L_0x001a
        L_0x0016:
            r3 = move-exception
            goto L_0x0020
        L_0x0018:
            r3 = move-exception
            r1 = r0
        L_0x001a:
            r3.printStackTrace()
            goto L_0x0023
        L_0x001e:
            r3 = move-exception
            r1 = r0
        L_0x0020:
            r3.printStackTrace()
        L_0x0023:
            if (r1 == 0) goto L_0x002a
            byte[] r3 = r1.digest()
            return r3
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(C11710f fVar) {
        return fetchDemandSourceId(fVar.f52427d);
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                try {
                    jSONObject.putOpt((String) next.getKey(), encodeString((String) next.getValue()));
                } catch (JSONException e) {
                    String str = f52484a;
                    Logger.m51953i(str, "flatMapToJsonAsStringfailed " + e.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f52492i;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int getActivityUIFlags(boolean z) {
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 14 ? 2 : 0;
        if (i >= 16) {
            i2 |= 1796;
        }
        return (i < 19 || !z) ? i2 : i2 | 4096;
    }

    public static String getAdvertiserId() {
        return f52485b;
    }

    public static String getControllerConfig() {
        return f52489f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f52487d) ? f52487d : "";
    }

    public static int getDebugMode() {
        return f52488e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], C6540C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f52490g;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = SessionDescription.SUPPORTED_SDP_VERSION + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, translateOrientation(C4979h.m22820p(context)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static C11703d.C11708e getProductType(String str) {
        C11703d.C11708e eVar = C11703d.C11708e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C11703d.C11708e eVar2 = C11703d.C11708e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C11703d.C11708e eVar3 = C11703d.C11708e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "5.108";
    }

    public static String getTesterParameters() {
        return f52491h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
            if (next.processName.equalsIgnoreCase(packageName) && next.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static boolean isLimitAdTrackingEnabled() {
        return f52486c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (r4.getCause() != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r0 = f52484a;
        com.ironsource.sdk.utils.Logger.m51953i(r0, r4.getClass().getSimpleName() + ": " + r4.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r4.getMessage() != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = f52484a;
        com.ironsource.sdk.utils.Logger.m51953i(r0, r4.getClass().getSimpleName() + ": " + r4.getMessage());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void loadGoogleAdvertiserInfo(android.content.Context r4) {
        /*
            java.lang.String[] r4 = com.ironsource.environment.C4979h.m22787a((android.content.Context) r4)     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            r0 = 0
            r0 = r4[r0]     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            f52485b = r0     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            r0 = 1
            r4 = r4[r0]     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            f52486c = r4     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            return
        L_0x0017:
            r4 = move-exception
            throw r4
        L_0x0019:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = ": "
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = f52484a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = r4.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ironsource.sdk.utils.Logger.m51953i(r0, r2)
        L_0x0045:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = f52484a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            r2.append(r1)
            java.lang.Throwable r4 = r4.getCause()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.ironsource.sdk.utils.Logger.m51953i(r0, r4)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(android.content.Context):void");
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((((float) j) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        Objects.requireNonNull(str, str2);
        return str;
    }

    public static <T> T requireNonNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void setControllerConfig(String str) {
        f52489f = str;
    }

    public static void setControllerUrl(String str) {
        f52487d = str;
    }

    public static void setDebugMode(int i) {
        f52488e = i;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f52490g = map;
    }

    public static void setTesterParameters(String str) {
        f52491h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new C11754a()).show();
    }

    public static String translateDeviceOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : C3148Ad.ORIENTATION_LANDSCAPE : C3148Ad.ORIENTATION_PORTRAIT;
    }

    public static String translateOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : C3148Ad.ORIENTATION_LANDSCAPE : C3148Ad.ORIENTATION_PORTRAIT;
    }

    public static String translateRequestedOrientation(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 11) {
                    if (i != 12) {
                        switch (i) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return C3148Ad.ORIENTATION_PORTRAIT;
        }
        return C3148Ad.ORIENTATION_LANDSCAPE;
    }
}
