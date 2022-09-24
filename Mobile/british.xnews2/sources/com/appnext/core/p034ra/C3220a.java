package com.appnext.core.p034ra;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.base.p026b.C3126b;
import com.appnext.core.C3198g;
import com.appnext.core.p034ra.services.C3235a;
import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.appnext.core.ra.a */
public class C3220a {

    /* renamed from: eK */
    private static final String f12398eK = ("https://cdn.appnext.com/tools/sdk/confign/sdk_core/" + C3198g.m10786av() + "/sdk_config.json");

    /* renamed from: eL */
    private static volatile C3220a f12399eL;

    /* renamed from: aM */
    private Context f12400aM;

    /* renamed from: eM */
    private JSONObject f12401eM;

    private C3220a(Context context) {
        try {
            this.f12400aM = context;
            String d = C3126b.m10572ak().mo10552d("config_store", (String) null);
            if (!TextUtils.isEmpty(d)) {
                this.f12401eM = new JSONObject(d);
            }
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$RAConfigManager", th);
        }
    }

    /* renamed from: aI */
    private synchronized long m10847aI() {
        return m10851c("send_rc_int", PsExtractor.VIDEO_STREAM_MASK);
    }

    /* renamed from: aJ */
    private synchronized long m10848aJ() {
        return m10851c("config_int", 14400);
    }

    /* renamed from: aK */
    private JSONObject m10849aK() {
        try {
            String aL = m10850aL();
            if (TextUtils.isEmpty(aL)) {
                return null;
            }
            if (!TextUtils.isEmpty(aL)) {
                C3126b.m10572ak().mo10553e("config_store", aL);
            }
            JSONObject jSONObject = new JSONObject(aL);
            this.f12401eM = jSONObject;
            return jSONObject;
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$downloadConfigFileAndStore", th);
            return null;
        }
    }

    /* renamed from: aL */
    private String m10850aL() {
        try {
            return C3198g.m10776a(this.f12400aM, f12398eK, (HashMap<String, String>) null);
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$downloadConfigFile", th);
            return null;
        }
    }

    /* renamed from: c */
    private long m10851c(String str, int i) {
        try {
            if (this.f12401eM != null) {
                return m10852d(str, i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$getLongValue", th);
        }
        return (long) i;
    }

    /* renamed from: d */
    private long m10852d(String str, int i) {
        try {
            JSONObject jSONObject = this.f12401eM;
            if (jSONObject != null && jSONObject.has(str)) {
                return this.f12401eM.getLong(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return (long) i;
    }

    /* renamed from: n */
    private String m10853n(String str, String str2) {
        try {
            JSONObject jSONObject = this.f12401eM;
            if (!(jSONObject == null || jSONObject == null)) {
                return m10854o(str, str2);
            }
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$getStringValue", th);
        }
        return str2;
    }

    /* renamed from: o */
    private String m10854o(String str, String str2) {
        try {
            JSONObject jSONObject = this.f12401eM;
            if (jSONObject != null && jSONObject.has(str)) {
                return this.f12401eM.getString(str);
            }
        } catch (Throwable th) {
            C3117a.m10553a("RAConfigManager$getStringValueFromLocalJson", th);
        }
        return str2;
    }

    /* renamed from: r */
    public static C3220a m10855r(Context context) {
        if (f12399eL == null) {
            synchronized (C3220a.class) {
                if (f12399eL == null) {
                    f12399eL = new C3220a(context);
                }
            }
        }
        return f12399eL;
    }

    /* renamed from: aG */
    public final boolean mo10832aG() {
        if (this.f12401eM == null) {
            m10849aK();
        }
        String n = m10853n("rc_send", "on");
        return n != null && n.equalsIgnoreCase("on");
    }

    /* renamed from: aH */
    public final void mo10833aH() {
        try {
            m10849aK();
            C3235a.m10897s(this.f12400aM).mo10851b(m10848aJ());
            if (mo10832aG()) {
                C3235a.m10897s(this.f12400aM).mo10852c(m10847aI());
            } else {
                C3235a.m10897s(this.f12400aM).mo10850aW();
            }
        } catch (Throwable th) {
            C3117a.m10553a("RRAConfigManager$downloadConfigFileFromServer", th);
        }
    }
}
