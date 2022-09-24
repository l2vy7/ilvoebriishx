package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.appnext.base.p022a.p023a.C3119a;
import com.appnext.base.p026b.C3126b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appnext.core.r */
public final class C3218r {
    /* access modifiers changed from: private */

    /* renamed from: eq */
    public static final long f12394eq = TimeUnit.DAYS.toMillis(30);

    /* renamed from: er */
    private static C3218r f12395er;
    /* access modifiers changed from: private */

    /* renamed from: es */
    public String f12396es = "";

    private C3218r() {
    }

    /* renamed from: aC */
    public static C3218r m10844aC() {
        if (f12395er == null) {
            synchronized (C3119a.class) {
                if (f12395er == null) {
                    f12395er = new C3218r();
                }
            }
        }
        return f12395er;
    }

    /* renamed from: n */
    public final String mo10830n(final Context context) {
        try {
            if (!TextUtils.isEmpty(this.f12396es)) {
                return this.f12396es;
            }
            this.f12396es = C3126b.m10572ak().mo10552d("userAgent", "");
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        long a = C3126b.m10572ak().mo10548a("userAgentStoreDate", 0);
                        if (TextUtils.isEmpty(C3218r.this.f12396es) || System.currentTimeMillis() - C3218r.f12394eq < a) {
                            C3218r.m10843a(C3218r.this, context);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            return this.f12396es;
        } catch (Throwable unused) {
            return this.f12396es;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10843a(C3218r rVar, Context context) {
        if (context != null) {
            try {
                C3126b.m10572ak().mo10553e("userAgent", WebSettings.getDefaultUserAgent(context.getApplicationContext()));
                C3126b.m10572ak().mo10550b("userAgentStoreDate", System.currentTimeMillis());
            } catch (Throwable unused) {
            }
        }
    }
}
