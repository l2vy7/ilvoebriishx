package p065d3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.C3752u;
import com.facebook.GraphRequest;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3561x;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p082g3.C5337b;

/* renamed from: d3.e */
/* compiled from: ViewIndexer */
public class C5182e {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f22649e = "d3.e";

    /* renamed from: f */
    private static C5182e f22650f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f22651a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Activity> f22652b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Timer f22653c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f22654d = null;

    /* renamed from: d3.e$a */
    /* compiled from: ViewIndexer */
    class C5183a extends TimerTask {
        C5183a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0080 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                d3.e r0 = p065d3.C5182e.this     // Catch:{ Exception -> 0x0093 }
                java.lang.ref.WeakReference r0 = r0.f22652b     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0093 }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0093 }
                if (r0 != 0) goto L_0x000f
                return
            L_0x000f:
                java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x0093 }
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x0093 }
                android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0093 }
                android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0093 }
                android.view.View r0 = r0.getRootView()     // Catch:{ Exception -> 0x0093 }
                boolean r2 = p065d3.C5172b.m23505k()     // Catch:{ Exception -> 0x0093 }
                if (r2 != 0) goto L_0x002a
                return
            L_0x002a:
                boolean r2 = com.facebook.internal.C3558v.m11885b()     // Catch:{ Exception -> 0x0093 }
                if (r2 == 0) goto L_0x0034
                p071e3.C5236e.m23730a()     // Catch:{ Exception -> 0x0093 }
                return
            L_0x0034:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0093 }
                d3.e$e r3 = new d3.e$e     // Catch:{ Exception -> 0x0093 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0093 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0093 }
                d3.e r3 = p065d3.C5182e.this     // Catch:{ Exception -> 0x0093 }
                android.os.Handler r3 = r3.f22651a     // Catch:{ Exception -> 0x0093 }
                r3.post(r2)     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = ""
                r4 = 1
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0055 }
                java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0055 }
                r3 = r2
                goto L_0x005f
            L_0x0055:
                r2 = move-exception
                java.lang.String r4 = p065d3.C5182e.f22649e     // Catch:{ Exception -> 0x0093 }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x0093 }
            L_0x005f:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0093 }
                r2.<init>()     // Catch:{ Exception -> 0x0093 }
                java.lang.String r4 = "screenname"
                r2.put(r4, r1)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r1 = "screenshot"
                r2.put(r1, r3)     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0080 }
                r1.<init>()     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONObject r0 = p071e3.C5237f.m23736d(r0)     // Catch:{ JSONException -> 0x0080 }
                r1.put(r0)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r0 = "view"
                r2.put(r0, r1)     // Catch:{ JSONException -> 0x0080 }
                goto L_0x0089
            L_0x0080:
                java.lang.String r0 = p065d3.C5182e.f22649e     // Catch:{ Exception -> 0x0093 }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0093 }
            L_0x0089:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0093 }
                d3.e r1 = p065d3.C5182e.this     // Catch:{ Exception -> 0x0093 }
                r1.m23543k(r0)     // Catch:{ Exception -> 0x0093 }
                goto L_0x009d
            L_0x0093:
                r0 = move-exception
                java.lang.String r1 = p065d3.C5182e.f22649e
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065d3.C5182e.C5183a.run():void");
        }
    }

    /* renamed from: d3.e$b */
    /* compiled from: ViewIndexer */
    class C5184b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TimerTask f22656b;

        C5184b(TimerTask timerTask) {
            this.f22656b = timerTask;
        }

        public void run() {
            try {
                if (C5182e.this.f22653c != null) {
                    C5182e.this.f22653c.cancel();
                }
                String unused = C5182e.this.f22654d = null;
                Timer unused2 = C5182e.this.f22653c = new Timer();
                C5182e.this.f22653c.scheduleAtFixedRate(this.f22656b, 0, 1000);
            } catch (Exception e) {
                Log.e(C5182e.f22649e, "Error scheduling indexing job", e);
            }
        }
    }

    /* renamed from: d3.e$c */
    /* compiled from: ViewIndexer */
    class C5185c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f22658b;

        C5185c(String str) {
            this.f22658b = str;
        }

        public void run() {
            GraphRequest i;
            String W = C3481f0.m11612W(this.f22658b);
            AccessToken h = AccessToken.m11205h();
            if ((W == null || !W.equals(C5182e.this.f22654d)) && (i = C5182e.m23542i(this.f22658b, h, C3642m.m12280f(), "app_indexing")) != null) {
                C3655r g = i.mo11250g();
                try {
                    JSONObject h2 = g.mo12381h();
                    if (h2 != null) {
                        if ("true".equals(h2.optString("success"))) {
                            C3561x.m11893g(C3752u.APP_EVENTS, C5182e.f22649e, "Successfully send UI component tree to server");
                            String unused = C5182e.this.f22654d = W;
                        }
                        if (h2.has("is_app_indexing_enabled")) {
                            C5172b.m23509o(Boolean.valueOf(h2.getBoolean("is_app_indexing_enabled")));
                            return;
                        }
                        return;
                    }
                    String c = C5182e.f22649e;
                    Log.e(c, "Error sending UI component tree to Facebook: " + g.mo12380g());
                } catch (JSONException e) {
                    Log.e(C5182e.f22649e, "Error decoding server response.", e);
                }
            }
        }
    }

    /* renamed from: d3.e$d */
    /* compiled from: ViewIndexer */
    static class C5186d implements GraphRequest.C3360f {
        C5186d() {
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5182e.f22649e, "App index sent to FB!");
        }
    }

    /* renamed from: d3.e$e */
    /* compiled from: ViewIndexer */
    private static class C5187e implements Callable<String> {

        /* renamed from: a */
        private WeakReference<View> f22660a;

        C5187e(View view) {
            this.f22660a = new WeakReference<>(view);
        }

        /* renamed from: b */
        public String call() {
            View view = (View) this.f22660a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public C5182e(Activity activity) {
        this.f22652b = new WeakReference<>(activity);
        f22650f = this;
    }

    /* renamed from: i */
    public static GraphRequest m23542i(String str, AccessToken accessToken, String str2, String str3) {
        if (str == null) {
            return null;
        }
        GraphRequest L = GraphRequest.m11254L(accessToken, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (GraphRequest.C3360f) null);
        Bundle y = L.mo11258y();
        if (y == null) {
            y = new Bundle();
        }
        y.putString("tree", str);
        y.putString("app_version", C5337b.m24045d());
        y.putString("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        y.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            y.putString("device_session_id", C5172b.m23504j());
        }
        L.mo11246a0(y);
        L.mo11243W(new C5186d());
        return L;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m23543k(String str) {
        C3642m.m12288n().execute(new C5185c(str));
    }

    /* renamed from: j */
    public void mo21368j() {
        C3642m.m12288n().execute(new C5184b(new C5183a()));
    }

    /* renamed from: l */
    public void mo21369l() {
        Timer timer;
        if (((Activity) this.f22652b.get()) != null && (timer = this.f22653c) != null) {
            try {
                timer.cancel();
                this.f22653c = null;
            } catch (Exception e) {
                Log.e(f22649e, "Error unscheduling indexing job", e);
            }
        }
    }
}
