package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.appnext.core.p */
public class C3212p {

    /* renamed from: ek */
    private static volatile C3212p f12384ek;

    /* renamed from: aA */
    public static C3212p m10827aA() {
        if (f12384ek == null) {
            synchronized (C3212p.class) {
                if (f12384ek == null) {
                    f12384ek = new C3212p();
                }
            }
        }
        return f12384ek;
    }

    /* renamed from: m */
    public static String m10828m(Context context) {
        String d = System.currentTimeMillis() < C3209m.m10816l(context).mo10816a("translateServerResponseAcceptedTime", 0) + 604800000 ? C3209m.m10816l(context).mo10819d("translateServerResponses", (String) null) : "";
        if (TextUtils.isEmpty(d)) {
            try {
                d = C3198g.m10776a(context, "https://cdn.appnext.com/tools/sdk/langs/2.4.4/langs.json", (HashMap<String, String>) null);
                if (!TextUtils.isEmpty(d)) {
                    C3209m.m10816l(context).mo10820e("translateServerResponses", d);
                    C3209m.m10816l(context).mo10818b("translateServerResponseAcceptedTime", System.currentTimeMillis());
                }
            } catch (Throwable unused) {
            }
        }
        return d;
    }
}
