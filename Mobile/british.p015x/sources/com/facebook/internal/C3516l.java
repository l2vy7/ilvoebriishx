package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
/* compiled from: FetchedAppGateKeepersManager */
public final class C3516l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f13156a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<C3519c> f13157b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private static final Map<String, JSONObject> f13158c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Long f13159d;

    /* renamed from: com.facebook.internal.l$a */
    /* compiled from: FetchedAppGateKeepersManager */
    static class C3517a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13160b;

        /* renamed from: c */
        final /* synthetic */ Context f13161c;

        /* renamed from: d */
        final /* synthetic */ String f13162d;

        C3517a(String str, Context context, String str2) {
            this.f13160b = str;
            this.f13161c = context;
            this.f13162d = str2;
        }

        public void run() {
            JSONObject a = C3516l.m11768f(this.f13160b);
            if (a != null) {
                JSONObject unused = C3516l.m11773k(this.f13160b, a);
                this.f13161c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f13162d, a.toString()).apply();
                Long unused2 = C3516l.f13159d = Long.valueOf(System.currentTimeMillis());
            }
            C3516l.m11774l();
            C3516l.f13156a.set(false);
        }
    }

    /* renamed from: com.facebook.internal.l$b */
    /* compiled from: FetchedAppGateKeepersManager */
    static class C3518b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3519c f13163b;

        C3518b(C3519c cVar) {
            this.f13163b = cVar;
        }

        public void run() {
            this.f13163b.mo11991a();
        }
    }

    /* renamed from: com.facebook.internal.l$c */
    /* compiled from: FetchedAppGateKeepersManager */
    public interface C3519c {
        /* renamed from: a */
        void mo11991a();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static JSONObject m11768f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        bundle.putString("sdk_version", C3642m.m12293s());
        bundle.putString("fields", "gatekeepers");
        GraphRequest J = GraphRequest.m11252J((AccessToken) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (GraphRequest.C3360f) null);
        J.mo11247b0(true);
        J.mo11246a0(bundle);
        return J.mo11250g().mo12381h();
    }

    /* renamed from: g */
    public static boolean m11769g(String str, String str2, boolean z) {
        m11771i();
        if (str2 != null) {
            Map<String, JSONObject> map = f13158c;
            if (map.containsKey(str2)) {
                return map.get(str2).optBoolean(str, z);
            }
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m11770h(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* renamed from: i */
    static void m11771i() {
        m11772j((C3519c) null);
    }

    /* renamed from: j */
    static synchronized void m11772j(C3519c cVar) {
        synchronized (C3516l.class) {
            if (cVar != null) {
                f13157b.add(cVar);
            }
            if (m11770h(f13159d)) {
                m11774l();
                return;
            }
            Context e = C3642m.m12279e();
            String f = C3642m.m12280f();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{f});
            if (e != null) {
                JSONObject jSONObject = null;
                String string = e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                if (!C3481f0.m11604O(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        C3481f0.m11608S("FacebookSDK", e2);
                    }
                    if (jSONObject != null) {
                        m11773k(f, jSONObject);
                    }
                }
                Executor n = C3642m.m12288n();
                if (n != null) {
                    if (f13156a.compareAndSet(false, true)) {
                        n.execute(new C3517a(f, e, format));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static synchronized JSONObject m11773k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C3516l.class) {
            Map<String, JSONObject> map = f13158c;
            if (map.containsKey(str)) {
                jSONObject2 = map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e) {
                        C3481f0.m11608S("FacebookSDK", e);
                    }
                }
            }
            f13158c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m11774l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<C3519c> concurrentLinkedQueue = f13157b;
            if (!concurrentLinkedQueue.isEmpty()) {
                C3519c poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new C3518b(poll));
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    static JSONObject m11775m(String str, boolean z) {
        if (!z) {
            Map<String, JSONObject> map = f13158c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject f = m11768f(str);
        if (f == null) {
            return null;
        }
        Context e = C3642m.m12279e();
        e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), f.toString()).apply();
        return m11773k(str, f);
    }
}
