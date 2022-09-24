package p065d3;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p065d3.C5188f;
import p082g3.C5337b;

/* renamed from: d3.b */
/* compiled from: CodelessManager */
public final class C5172b {

    /* renamed from: a */
    private static final C5188f f22616a = new C5188f();

    /* renamed from: b */
    private static SensorManager f22617b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C5182e f22618c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f22619d;

    /* renamed from: e */
    private static final AtomicBoolean f22620e = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Boolean f22621f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile Boolean f22622g;

    /* renamed from: d3.b$a */
    /* compiled from: CodelessManager */
    static class C5173a implements C5188f.C5189a {

        /* renamed from: a */
        final /* synthetic */ C3520m f22623a;

        /* renamed from: b */
        final /* synthetic */ String f22624b;

        C5173a(C3520m mVar, String str) {
            this.f22623a = mVar;
            this.f22624b = str;
        }

        /* renamed from: a */
        public void mo21353a() {
            C3520m mVar = this.f22623a;
            boolean z = true;
            boolean z2 = mVar != null && mVar.mo11997b();
            if (!C3642m.m12287m()) {
                z = false;
            }
            if (z2 && z) {
                C5172b.m23501g(this.f22624b);
            }
        }
    }

    /* renamed from: d3.b$b */
    /* compiled from: CodelessManager */
    static class C5174b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f22625b;

        C5174b(String str) {
            this.f22625b = str;
        }

        public void run() {
            boolean z = true;
            GraphRequest L = GraphRequest.m11254L((AccessToken) null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{this.f22625b}), (JSONObject) null, (GraphRequest.C3360f) null);
            Bundle y = L.mo11258y();
            if (y == null) {
                y = new Bundle();
            }
            C3459b h = C3459b.m11543h(C3642m.m12279e());
            JSONArray jSONArray = new JSONArray();
            String str = Build.MODEL;
            if (str == null) {
                str = "";
            }
            jSONArray.put(str);
            if (h == null || h.mo11917b() == null) {
                jSONArray.put("");
            } else {
                jSONArray.put(h.mo11917b());
            }
            String str2 = SessionDescription.SUPPORTED_SDP_VERSION;
            jSONArray.put(str2);
            if (C5337b.m24046e()) {
                str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
            jSONArray.put(str2);
            Locale v = C3481f0.m11657v();
            jSONArray.put(v.getLanguage() + "_" + v.getCountry());
            String jSONArray2 = jSONArray.toString();
            y.putString("device_session_id", C5172b.m23504j());
            y.putString("extinfo", jSONArray2);
            L.mo11246a0(y);
            JSONObject h2 = L.mo11250g().mo12381h();
            if (h2 == null || !h2.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            Boolean unused = C5172b.f22621f = Boolean.valueOf(z);
            if (!C5172b.f22621f.booleanValue()) {
                String unused2 = C5172b.f22619d = null;
            } else if (C5172b.f22618c != null) {
                C5172b.f22618c.mo21368j();
            }
            Boolean unused3 = C5172b.f22622g = Boolean.FALSE;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f22621f = bool;
        f22622g = bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m23501g(String str) {
        if (!f22622g.booleanValue()) {
            f22622g = Boolean.TRUE;
            C3642m.m12288n().execute(new C5174b(str));
        }
    }

    /* renamed from: h */
    public static void m23502h() {
        f22620e.set(false);
    }

    /* renamed from: i */
    public static void m23503i() {
        f22620e.set(true);
    }

    /* renamed from: j */
    static String m23504j() {
        if (f22619d == null) {
            f22619d = UUID.randomUUID().toString();
        }
        return f22619d;
    }

    /* renamed from: k */
    static boolean m23505k() {
        return f22621f.booleanValue();
    }

    /* renamed from: l */
    public static void m23506l(Activity activity) {
        C5175c.m23513e().mo21356d(activity);
    }

    /* renamed from: m */
    public static void m23507m(Activity activity) {
        if (f22620e.get()) {
            C5175c.m23513e().mo21357h(activity);
            C5182e eVar = f22618c;
            if (eVar != null) {
                eVar.mo21369l();
            }
            SensorManager sensorManager = f22617b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(f22616a);
            }
        }
    }

    /* renamed from: n */
    public static void m23508n(Activity activity) {
        if (f22620e.get()) {
            C5175c.m23513e().mo21355c(activity);
            Context applicationContext = activity.getApplicationContext();
            String f = C3642m.m12280f();
            C3520m j = C3522n.m11804j(f);
            if (j != null && j.mo11997b()) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                f22617b = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    f22618c = new C5182e(activity);
                    C5188f fVar = f22616a;
                    fVar.mo21375a(new C5173a(j, f));
                    f22617b.registerListener(fVar, defaultSensor, 2);
                    if (j.mo11997b()) {
                        f22618c.mo21368j();
                    }
                }
            }
        }
    }

    /* renamed from: o */
    static void m23509o(Boolean bool) {
        f22621f = bool;
    }
}
