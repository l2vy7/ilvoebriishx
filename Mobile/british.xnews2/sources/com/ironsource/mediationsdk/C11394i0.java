package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p285c.C11361b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.i0 */
final class C11394i0 {

    /* renamed from: b */
    private static C11394i0 f51221b;

    /* renamed from: a */
    JSONObject f51222a = new JSONObject();

    /* renamed from: com.ironsource.mediationsdk.i0$a */
    class C11395a implements Runnable {
        C11395a() {
        }

        public final void run() {
            try {
                C11394i0 i0Var = C11394i0.this;
                i0Var.mo44296e(C11394i0.m50978h());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private C11394i0() {
    }

    /* renamed from: a */
    public static synchronized C11394i0 m50972a() {
        C11394i0 i0Var;
        synchronized (C11394i0.class) {
            if (f51221b == null) {
                f51221b = new C11394i0();
            }
            i0Var = f51221b;
        }
        return i0Var;
    }

    /* renamed from: d */
    private synchronized void m50975d(String str, Object obj) {
        try {
            this.f51222a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    static JSONObject m50976f() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = C4979h.m22810k();
        int l = C4979h.m22812l();
        float o = C4979h.m22818o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C11369d.m50788a().f51059g;
                concurrentHashMap.putAll(C11361b.m50766a().mo44212d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = C11232E.m50103a().f50388P;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String C = C4979h.m22782C(applicationContext);
                if (!TextUtils.isEmpty(C)) {
                    jSONObject.put("asid", C);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) C4979h.m22814m(applicationContext));
                jSONObject.put("root", C4979h.m22809j());
                jSONObject.put("bat", C4979h.m22831w(applicationContext));
                jSONObject.put("diskFS", C4979h.m22821p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", C11499n.m51312a().mo44568b(2));
                jSONObject.put("sDepRV", C11499n.m51312a().mo44568b(1));
                jSONObject.put("UA", C4979h.m22824r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    static JSONObject m50977g() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = C4979h.m22798e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String z = C4979h.m22834z(applicationContext);
                if (z != null) {
                    jSONObject.put("auid", z);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", C11232E.m50103a().f50417j);
                jSONObject.put("mCar", C4979h.m22808j(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", C4961c.m22745c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", C11232E.m50103a().f50419k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m50978h() {
        /*
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            if (r2 == 0) goto L_0x0072
            r3 = 0
            java.lang.String[] r4 = com.ironsource.environment.C4979h.m22787a((android.content.Context) r2)     // Catch:{ Exception -> 0x0030 }
            r5 = r4[r3]     // Catch:{ Exception -> 0x0030 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0030 }
            if (r5 != 0) goto L_0x0021
            r5 = r4[r3]     // Catch:{ Exception -> 0x0030 }
            goto L_0x0022
        L_0x0021:
            r5 = r0
        L_0x0022:
            r6 = 1
            r4 = r4[r6]     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x002e }
            boolean r3 = r4.booleanValue()     // Catch:{ Exception -> 0x002e }
            goto L_0x0049
        L_0x002e:
            r4 = move-exception
            goto L_0x0032
        L_0x0030:
            r4 = move-exception
            r5 = r0
        L_0x0032:
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "got the following error "
            r7.<init>(r8)
            java.lang.String r4 = r4.getMessage()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.error(r4)
        L_0x0049:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0052
            java.lang.String r0 = "GAID"
            goto L_0x005e
        L_0x0052:
            java.lang.String r5 = com.ironsource.environment.C4979h.m22833y(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x005e
            java.lang.String r0 = "UUID"
        L_0x005e:
            java.lang.String r2 = "advId"
            r1.put(r2, r5)     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "advType"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "isLAT"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11394i0.m50978h():org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo44296e(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m50975d(next, jSONObject.opt(next));
        }
    }
}
