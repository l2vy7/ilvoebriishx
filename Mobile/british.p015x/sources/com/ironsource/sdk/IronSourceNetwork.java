package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p297j.C11727d;
import com.ironsource.sdk.p297j.C11728e;
import com.ironsource.sdk.service.C11752e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class IronSourceNetwork {

    /* renamed from: a */
    private static C11692e f51787a;

    /* renamed from: b */
    private static C11727d f51788b;

    /* renamed from: c */
    private static JSONObject f51789c;

    /* renamed from: a */
    private static synchronized void m51352a() {
        synchronized (IronSourceNetwork.class) {
            if (f51787a == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void applyConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            C11692e eVar = f51787a;
            if (eVar != null) {
                if (jSONObject != null) {
                    eVar.mo44950a(jSONObject);
                }
            }
        }
    }

    public static C11727d getInitListener() {
        return f51788b;
    }

    public static synchronized void getOfferWallCredits(C11728e eVar) {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44940a(eVar);
        }
    }

    public static synchronized JSONObject getRawToken(Context context) {
        JSONObject b;
        synchronized (IronSourceNetwork.class) {
            b = C11752e.m51930a().mo45063b(context);
        }
        return b;
    }

    public static synchronized String getToken(Context context) {
        String a;
        synchronized (IronSourceNetwork.class) {
            a = C11752e.m51930a().mo45058a(context);
        }
        return a;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initOfferWall(Map<String, String> map, C11728e eVar) {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44949a(map, eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initSDK(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.lang.Class<com.ironsource.sdk.IronSourceNetwork> r0 = com.ironsource.sdk.IronSourceNetwork.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0012
            java.lang.String r6 = "IronSourceNetwork"
            java.lang.String r7 = "applicationKey is NULL"
            com.ironsource.sdk.utils.Logger.m51951e(r6, r7)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)
            return
        L_0x0012:
            com.ironsource.sdk.e r1 = f51787a     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00bc
            com.ironsource.sdk.utils.SDKUtils.setInitSDKParams(r9)     // Catch:{ all -> 0x00be }
            org.json.JSONObject r1 = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "events"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0099 }
            if (r1 == 0) goto L_0x00b1
            com.ironsource.a.a$a r2 = new com.ironsource.a.a$a     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "endpoint"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0099 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "GET"
            r2.f21931c = r3     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "enabled"
            boolean r1 = r1.optBoolean(r3)     // Catch:{ Exception -> 0x0099 }
            r2.f21930b = r1     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.a.c r1 = new com.ironsource.sdk.a.c     // Catch:{ Exception -> 0x0099 }
            r1.<init>()     // Catch:{ Exception -> 0x0099 }
            r2.f21932d = r1     // Catch:{ Exception -> 0x0099 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0099 }
            r1.<init>()     // Catch:{ Exception -> 0x0099 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ Exception -> 0x0099 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r1.add(r3)     // Catch:{ Exception -> 0x0099 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ Exception -> 0x0099 }
            java.lang.String r4 = "charset"
            java.lang.String r5 = "utf-8"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r1.add(r3)     // Catch:{ Exception -> 0x0099 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r2.f21934f     // Catch:{ Exception -> 0x0099 }
            r3.addAll(r1)     // Catch:{ Exception -> 0x0099 }
            r1 = 0
            r2.f21933e = r1     // Catch:{ Exception -> 0x0099 }
            com.ironsource.a.a r3 = new com.ironsource.a.a     // Catch:{ Exception -> 0x0099 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0099 }
            boolean r2 = r3.f21924b     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x00b1
            com.ironsource.sdk.a.b$a r2 = new com.ironsource.sdk.a.b$a     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            if (r9 == 0) goto L_0x008a
            java.lang.String r4 = "sessionid"
            boolean r4 = r9.containsKey(r4)     // Catch:{ Exception -> 0x0099 }
            if (r4 == 0) goto L_0x008a
            java.lang.String r4 = "sessionid"
            java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0099 }
            r2.f51795a = r9     // Catch:{ Exception -> 0x0099 }
        L_0x008a:
            r2.f51797c = r6     // Catch:{ Exception -> 0x0099 }
            r2.f51798d = r8     // Catch:{ Exception -> 0x0099 }
            r2.f51796b = r7     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.a.b r9 = new com.ironsource.sdk.a.b     // Catch:{ Exception -> 0x0099 }
            r9.<init>(r2, r1)     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.p287a.C11520d.m51358a((com.ironsource.p054a.C4922a) r3, (com.ironsource.sdk.p287a.C11517b) r9)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00b1
        L_0x0099:
            r9 = move-exception
            java.lang.String r1 = "IronSourceNetwork"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "Failed to init event tracker: "
            r2.<init>(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00be }
            r2.append(r9)     // Catch:{ all -> 0x00be }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00be }
            com.ironsource.sdk.utils.Logger.m51951e(r1, r9)     // Catch:{ all -> 0x00be }
        L_0x00b1:
            com.ironsource.sdk.e r6 = com.ironsource.sdk.p290d.C11675b.m51711a((java.lang.String) r7, (java.lang.String) r8, (android.content.Context) r6)     // Catch:{ all -> 0x00be }
            f51787a = r6     // Catch:{ all -> 0x00be }
            org.json.JSONObject r6 = f51789c     // Catch:{ all -> 0x00be }
            applyConsentInfo(r6)     // Catch:{ all -> 0x00be }
        L_0x00bc:
            monitor-exit(r0)
            return
        L_0x00be:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.IronSourceNetwork.initSDK(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static synchronized boolean isAdAvailableForInstance(C11524b bVar) {
        synchronized (IronSourceNetwork.class) {
            C11692e eVar = f51787a;
            if (eVar == null) {
                return false;
            }
            boolean a = eVar.mo44951a(bVar);
            return a;
        }
    }

    public static synchronized void loadAd(Activity activity, C11524b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44933a(activity, bVar, map);
        }
    }

    public static synchronized void onPause(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            C11692e eVar = f51787a;
            if (eVar != null) {
                eVar.mo44953b(activity);
            }
        }
    }

    public static synchronized void onResume(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            C11692e eVar = f51787a;
            if (eVar != null) {
                eVar.mo44959c(activity);
            }
        }
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            C11692e eVar = f51787a;
            if (eVar != null) {
                eVar.mo44932a(activity);
            }
        }
    }

    public static synchronized void requestToDestroyBanner() {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44931a();
        }
    }

    public static synchronized void setInitListener(C11727d dVar) {
        synchronized (IronSourceNetwork.class) {
            f51788b = dVar;
        }
    }

    public static synchronized void showAd(C11524b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44935a(bVar, map);
        }
    }

    public static synchronized void showOfferWall(Activity activity, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            m51352a();
            f51787a.mo44934a(activity, map);
        }
    }

    public static synchronized void updateConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            f51789c = jSONObject;
            applyConsentInfo(jSONObject);
        }
    }

    public static synchronized void updateMetadata(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            C11752e a = C11752e.m51930a();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a.mo45061a("metadata_" + next, jSONObject.opt(next));
            }
        }
    }
}
