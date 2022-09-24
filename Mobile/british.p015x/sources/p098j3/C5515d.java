package p098j3;

import android.app.Activity;
import com.facebook.C3642m;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p083g3.C5330a;
import p088h3.C5410b;

/* renamed from: j3.d */
/* compiled from: SuggestedEventsManager */
public final class C5515d {

    /* renamed from: a */
    private static final AtomicBoolean f23939a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Set<String> f23940b = new HashSet();

    /* renamed from: c */
    private static final Set<String> f23941c = new HashSet();

    /* renamed from: a */
    public static synchronized void m24589a() {
        synchronized (C5515d.class) {
            AtomicBoolean atomicBoolean = f23939a;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                m24590b();
            }
        }
    }

    /* renamed from: b */
    private static void m24590b() {
        String m;
        File k;
        try {
            C3520m o = C3522n.m11809o(C3642m.m12280f(), false);
            if (o != null && (m = o.mo12008m()) != null) {
                JSONObject jSONObject = new JSONObject(m);
                if (jSONObject.has("production_events")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        f23940b.add(jSONArray.getString(i));
                    }
                }
                if (jSONObject.has("eligible_for_prediction_events")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        f23941c.add(jSONArray2.getString(i2));
                    }
                }
                if ((!f23940b.isEmpty() || !f23941c.isEmpty()) && (k = C5410b.m24345k("SUGGEST_EVENT")) != null) {
                    C5512a.m24571d(k);
                    Activity p = C5330a.m24032p();
                    if (p != null) {
                        m24593e(p);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    static boolean m24591c(String str) {
        return f23941c.contains(str);
    }

    /* renamed from: d */
    static boolean m24592d(String str) {
        return f23940b.contains(str);
    }

    /* renamed from: e */
    public static void m24593e(Activity activity) {
        try {
            if (!f23939a.get() || !C5512a.m24573f() || (f23940b.isEmpty() && f23941c.isEmpty())) {
                C5516e.m24601h(activity);
            } else {
                C5516e.m24599f(activity);
            }
        } catch (Exception unused) {
        }
    }
}
