package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* renamed from: com.startapp.t2 */
/* compiled from: Sta */
public class C12339t2 {
    /* renamed from: a */
    public static void m53496a(String str, boolean z, String str2, String str3) {
        try {
            AdCallbacksConfig a = MetaData.f22407k.analytics.mo46307a();
            if (a != null) {
                if ((a.mo46281a() || z) && a.mo46282a(str)) {
                    C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                    d4Var.f22126d = "adCallback";
                    d4Var.f22131i = str;
                    d4Var.f22129g = str2;
                    d4Var.f22127e = str3;
                    d4Var.mo20661a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
