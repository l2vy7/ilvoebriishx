package p082g3;

import android.content.Context;
import com.facebook.C3752u;
import com.facebook.appevents.C3406g;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3561x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g3.c */
/* compiled from: AppEventsLoggerUtility */
public class C5338c {

    /* renamed from: a */
    private static final Map<C5340b, String> f23537a = new C5339a();

    /* renamed from: g3.c$a */
    /* compiled from: AppEventsLoggerUtility */
    static class C5339a extends HashMap<C5340b, String> {
        C5339a() {
            put(C5340b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C5340b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* renamed from: g3.c$b */
    /* compiled from: AppEventsLoggerUtility */
    public enum C5340b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m24048a(C5340b bVar, C3459b bVar2, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f23537a.get(bVar));
        String e = C3406g.m11396e();
        if (e != null) {
            jSONObject.put("app_user_id", e);
        }
        C3481f0.m11641m0(jSONObject, bVar2, str, z);
        try {
            C3481f0.m11643n0(jSONObject, context);
        } catch (Exception e2) {
            C3561x.m11894h(C3752u.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
