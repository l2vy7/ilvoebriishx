package com.appnext.core.crashes;

import android.content.Context;
import com.appnext.core.C3211o;

/* renamed from: com.appnext.core.crashes.b */
public class C3178b {

    /* renamed from: eD */
    private static C3178b f12293eD;
    /* access modifiers changed from: private */

    /* renamed from: aM */
    public Context f12294aM;

    private C3178b(Context context) {
        this.f12294aM = context;
    }

    /* renamed from: p */
    public static C3178b m10711p(Context context) {
        if (f12293eD == null) {
            synchronized (C3178b.class) {
                if (f12293eD == null) {
                    f12293eD = new C3178b(context);
                }
            }
        }
        return f12293eD;
    }

    /* renamed from: m */
    public final void mo10767m(final String str, final String str2) {
        Context context = this.f12294aM;
        if (context == null) {
            try {
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        try {
                            new C3177a(C3178b.this.f12294aM, str, str2).mo10766aE();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else {
            CrashesReportWorkManagerService.m10708a(context, str, str2);
        }
    }
}
