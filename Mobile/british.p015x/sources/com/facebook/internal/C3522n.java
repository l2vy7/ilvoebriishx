package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.facebook.internal.C3520m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p072e3.C5236e;
import p083g3.C5341d;
import p083g3.C5343e;
import p083g3.C5345g;

/* renamed from: com.facebook.internal.n */
/* compiled from: FetchedAppSettingsManager */
public final class C3522n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f13186a = "n";

    /* renamed from: b */
    private static final String[] f13187b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C3520m> f13188c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicReference<C3526d> f13189d = new AtomicReference<>(C3526d.NOT_LOADED);

    /* renamed from: e */
    private static final ConcurrentLinkedQueue<C3527e> f13190e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f13191f = false;

    /* renamed from: g */
    private static boolean f13192g = false;

    /* renamed from: h */
    private static JSONArray f13193h = null;

    /* renamed from: com.facebook.internal.n$a */
    /* compiled from: FetchedAppSettingsManager */
    static class C3523a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f13194b;

        /* renamed from: c */
        final /* synthetic */ String f13195c;

        /* renamed from: d */
        final /* synthetic */ String f13196d;

        C3523a(Context context, String str, String str2) {
            this.f13194b = context;
            this.f13195c = str;
            this.f13196d = str2;
        }

        public void run() {
            JSONObject jSONObject;
            SharedPreferences sharedPreferences = this.f13194b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
            C3520m mVar = null;
            String string = sharedPreferences.getString(this.f13195c, (String) null);
            if (!C3481f0.m11604O(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    C3481f0.m11608S("FacebookSDK", e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    mVar = C3522n.m11806l(this.f13196d, jSONObject);
                }
            }
            JSONObject b = C3522n.m11803i(this.f13196d);
            if (b != null) {
                C3520m unused = C3522n.m11806l(this.f13196d, b);
                sharedPreferences.edit().putString(this.f13195c, b.toString()).apply();
            }
            if (mVar != null) {
                String j = mVar.mo12005j();
                if (!C3522n.f13191f && j != null && j.length() > 0) {
                    boolean unused2 = C3522n.f13191f = true;
                    Log.w(C3522n.f13186a, j);
                }
            }
            C3516l.m11775m(this.f13196d, true);
            C5341d.m24052d();
            C5345g.m24065h();
            C3522n.f13189d.set(C3522n.f13188c.containsKey(this.f13196d) ? C3526d.SUCCESS : C3526d.ERROR);
            C3522n.m11808n();
        }
    }

    /* renamed from: com.facebook.internal.n$b */
    /* compiled from: FetchedAppSettingsManager */
    static class C3524b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3527e f13197b;

        C3524b(C3527e eVar) {
            this.f13197b = eVar;
        }

        public void run() {
            this.f13197b.mo12015a();
        }
    }

    /* renamed from: com.facebook.internal.n$c */
    /* compiled from: FetchedAppSettingsManager */
    static class C3525c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3527e f13198b;

        /* renamed from: c */
        final /* synthetic */ C3520m f13199c;

        C3525c(C3527e eVar, C3520m mVar) {
            this.f13198b = eVar;
            this.f13199c = mVar;
        }

        public void run() {
            this.f13198b.mo12016b(this.f13199c);
        }
    }

    /* renamed from: com.facebook.internal.n$d */
    /* compiled from: FetchedAppSettingsManager */
    enum C3526d {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.n$e */
    /* compiled from: FetchedAppSettingsManager */
    public interface C3527e {
        /* renamed from: a */
        void mo12015a();

        /* renamed from: b */
        void mo12016b(C3520m mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static JSONObject m11803i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f13187b))));
        GraphRequest J = GraphRequest.m11252J((AccessToken) null, str, (GraphRequest.C3360f) null);
        J.mo11247b0(true);
        J.mo11246a0(bundle);
        return J.mo11250g().mo12381h();
    }

    /* renamed from: j */
    public static C3520m m11804j(String str) {
        if (str != null) {
            return f13188c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public static void m11805k() {
        Context e = C3642m.m12279e();
        String f = C3642m.m12280f();
        if (C3481f0.m11604O(f)) {
            f13189d.set(C3526d.ERROR);
            m11808n();
        } else if (f13188c.containsKey(f)) {
            f13189d.set(C3526d.SUCCESS);
            m11808n();
        } else {
            AtomicReference<C3526d> atomicReference = f13189d;
            C3526d dVar = C3526d.NOT_LOADED;
            C3526d dVar2 = C3526d.LOADING;
            if (!(atomicReference.compareAndSet(dVar, dVar2) || atomicReference.compareAndSet(C3526d.ERROR, dVar2))) {
                m11808n();
            } else {
                C3642m.m12288n().execute(new C3523a(e, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{f}), f));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static C3520m m11806l(String str, JSONObject jSONObject) {
        C3490h hVar;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            hVar = C3490h.m11691c();
        } else {
            hVar = C3490h.m11690b(optJSONArray);
        }
        C3490h hVar2 = hVar;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f13193h = optJSONArray2;
        if (optJSONArray2 != null && C3558v.m11885b()) {
            C5236e.m23731b(optJSONArray2.toString());
        }
        C3520m mVar = r2;
        C3520m mVar2 = new C3520m(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", C5343e.m24055a()), C3477d0.m11584i(jSONObject2.optLong("seamless_login")), m11807m(jSONObject2.optJSONObject("android_dialog_configs")), z, hVar2, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"));
        C3520m mVar3 = mVar;
        f13188c.put(str, mVar3);
        return mVar3;
    }

    /* renamed from: m */
    private static Map<String, Map<String, C3520m.C3521a>> m11807m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C3520m.C3521a c = C3520m.C3521a.m11791c(optJSONArray.optJSONObject(i));
                if (c != null) {
                    String a = c.mo12010a();
                    Map map = (Map) hashMap.get(a);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a, map);
                    }
                    map.put(c.mo12011b(), c);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m11808n() {
        /*
            java.lang.Class<com.facebook.internal.n> r0 = com.facebook.internal.C3522n.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.n$d> r1 = f13189d     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$d r1 = (com.facebook.internal.C3522n.C3526d) r1     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$d r2 = com.facebook.internal.C3522n.C3526d.NOT_LOADED     // Catch:{ all -> 0x006d }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x006b
            com.facebook.internal.n$d r2 = com.facebook.internal.C3522n.C3526d.LOADING     // Catch:{ all -> 0x006d }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x001c
            goto L_0x006b
        L_0x001c:
            java.lang.String r2 = com.facebook.C3642m.m12280f()     // Catch:{ all -> 0x006d }
            java.util.Map<java.lang.String, com.facebook.internal.m> r3 = f13188c     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x006d }
            com.facebook.internal.m r2 = (com.facebook.internal.C3520m) r2     // Catch:{ all -> 0x006d }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x006d }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x006d }
            r3.<init>(r4)     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$d r4 = com.facebook.internal.C3522n.C3526d.ERROR     // Catch:{ all -> 0x006d }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0052
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f13190e     // Catch:{ all -> 0x006d }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0050
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$e r1 = (com.facebook.internal.C3522n.C3527e) r1     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$b r2 = new com.facebook.internal.n$b     // Catch:{ all -> 0x006d }
            r2.<init>(r1)     // Catch:{ all -> 0x006d }
            r3.post(r2)     // Catch:{ all -> 0x006d }
            goto L_0x0039
        L_0x0050:
            monitor-exit(r0)
            return
        L_0x0052:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f13190e     // Catch:{ all -> 0x006d }
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0069
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$e r1 = (com.facebook.internal.C3522n.C3527e) r1     // Catch:{ all -> 0x006d }
            com.facebook.internal.n$c r4 = new com.facebook.internal.n$c     // Catch:{ all -> 0x006d }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x006d }
            r3.post(r4)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x0069:
            monitor-exit(r0)
            return
        L_0x006b:
            monitor-exit(r0)
            return
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0071
        L_0x0070:
            throw r1
        L_0x0071:
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3522n.m11808n():void");
    }

    /* renamed from: o */
    public static C3520m m11809o(String str, boolean z) {
        if (!z) {
            Map<String, C3520m> map = f13188c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject i = m11803i(str);
        if (i == null) {
            return null;
        }
        C3520m l = m11806l(str, i);
        if (str.equals(C3642m.m12280f())) {
            f13189d.set(C3526d.SUCCESS);
            m11808n();
        }
        return l;
    }
}
