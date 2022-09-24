package p098j3;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p072e3.C5237f;

/* renamed from: j3.b */
/* compiled from: PredictionHistoryManager */
final class C5513b {

    /* renamed from: a */
    private static final Map<String, String> f23935a = new HashMap();

    /* renamed from: b */
    private static SharedPreferences f23936b;

    /* renamed from: c */
    private static final AtomicBoolean f23937c = new AtomicBoolean(false);

    /* renamed from: a */
    static void m24582a(String str, String str2) {
        if (!f23937c.get()) {
            m24584c();
        }
        Map<String, String> map = f23935a;
        map.put(str, str2);
        f23936b.edit().putString("SUGGESTED_EVENTS_HISTORY", C3481f0.m11611V(map)).apply();
    }

    /* renamed from: b */
    static String m24583b(View view) {
        JSONObject jSONObject = new JSONObject();
        while (view != null) {
            C5514c.m24588c(view, jSONObject);
            view = C5237f.m23741i(view);
        }
        return C3481f0.m11647p0(jSONObject.toString());
    }

    /* renamed from: c */
    private static void m24584c() {
        AtomicBoolean atomicBoolean = f23937c;
        if (!atomicBoolean.get()) {
            SharedPreferences sharedPreferences = C3642m.m12279e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            f23936b = sharedPreferences;
            f23935a.putAll(C3481f0.m11616a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
            atomicBoolean.set(true);
        }
    }

    /* renamed from: d */
    static String m24585d(String str) {
        Map<String, String> map = f23935a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
