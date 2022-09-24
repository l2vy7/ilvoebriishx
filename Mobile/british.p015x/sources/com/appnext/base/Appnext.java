package com.appnext.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.moments.p031b.C3136b;
import com.appnext.base.moments.p031b.C3138c;
import com.appnext.base.p027b.C3125a;
import com.appnext.base.p027b.C3126b;
import com.appnext.core.C3198g;
import com.appnext.core.C3211o;

public class Appnext {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bN */
    private static final Appnext f12192bN = new Appnext();
    /* access modifiers changed from: private */

    /* renamed from: bM */
    public Context f12193bM = null;
    /* access modifiers changed from: private */

    /* renamed from: bO */
    public boolean f12194bO = false;

    private Appnext() {
    }

    /* renamed from: b */
    static /* synthetic */ void m10552b(Appnext appnext) {
        try {
            String b = C3198g.m10787b(appnext.f12193bM, true);
            String d = C3126b.m10572ak().mo10552d("google_ads_id", "");
            if (!TextUtils.isEmpty(b) && !b.equals(d)) {
                C3126b.m10572ak().mo10549al();
                C3126b.m10572ak().mo10553e("google_ads_id", b);
            }
        } catch (Throwable th) {
            C3117a.m10553a("Appnext$checkAdsID", th);
        }
    }

    public static void init(Context context) {
        Appnext appnext = f12192bN;
        if (context != null) {
            try {
                if (!appnext.f12194bO || appnext.f12193bM == null) {
                    appnext.f12194bO = true;
                    C3125a.init(context);
                    appnext.f12193bM = context.getApplicationContext();
                    C3211o.m10825az().mo10821a(new Runnable() {
                        public final void run() {
                            try {
                                C3126b.m10572ak().init(Appnext.this.f12193bM);
                                if (C3138c.m10615d(Appnext.this.f12193bM)) {
                                    boolean unused = Appnext.this.f12194bO = false;
                                    C3126b.m10572ak().mo10551b("lat", true);
                                    return;
                                }
                                C3125a.init(Appnext.this.f12193bM);
                                Appnext.m10552b(Appnext.this);
                            } catch (Throwable unused2) {
                            }
                        }
                    });
                    return;
                }
                appnext.f12193bM = context.getApplicationContext();
            } catch (Throwable th) {
                C3117a.m10553a("Appnext$libInit", th);
            }
        }
    }

    public static void setParam(String str, String str2) {
        try {
            if (C3125a.getContext() != null && str.hashCode() == 951500826) {
                C3138c.m10612a("isAidDisabled", str2, C3136b.C3137a.Boolean);
            }
        } catch (Throwable th) {
            C3117a.m10553a("Appnext$setParam", th);
        }
    }
}
