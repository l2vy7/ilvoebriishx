package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.h */
/* compiled from: Sta */
public class C5007h {

    /* renamed from: com.startapp.h$a */
    /* compiled from: Sta */
    public class C5008a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdDisplayListener f22134a;

        /* renamed from: b */
        public final /* synthetic */ C5041Ad f22135b;

        public C5008a(AdDisplayListener adDisplayListener, C5041Ad ad, Context context) {
            this.f22134a = adDisplayListener;
            this.f22135b = ad;
        }

        public void run() {
            try {
                this.f22134a.adNotDisplayed(this.f22135b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f22134a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m22891a(Context context, AdDisplayListener adDisplayListener, C5041Ad ad) {
        C5008a aVar = null;
        C12339t2.m53496a("adNotDisplayed", adDisplayListener != null, (String) null, ad.getErrorMessage());
        if (adDisplayListener != null) {
            aVar = new C5008a(adDisplayListener, ad, context);
        }
        C5055a.m23152a((Runnable) aVar);
    }
}
