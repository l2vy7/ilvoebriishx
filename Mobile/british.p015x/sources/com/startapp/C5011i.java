package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: com.startapp.i */
/* compiled from: Sta */
public class C5011i {

    /* renamed from: com.startapp.i$a */
    /* compiled from: Sta */
    public class C5012a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f22137a;

        /* renamed from: b */
        public final /* synthetic */ C5041Ad f22138b;

        public C5012a(AdEventListener adEventListener, C5041Ad ad, Context context) {
            this.f22137a = adEventListener;
            this.f22138b = ad;
        }

        public void run() {
            try {
                this.f22137a.onReceiveAd(this.f22138b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f22137a, th);
            }
        }
    }

    /* renamed from: com.startapp.i$b */
    /* compiled from: Sta */
    public class C5013b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f22139a;

        /* renamed from: b */
        public final /* synthetic */ C5041Ad f22140b;

        public C5013b(AdEventListener adEventListener, C5041Ad ad, Context context) {
            this.f22139a = adEventListener;
            this.f22140b = ad;
        }

        public void run() {
            try {
                this.f22139a.onFailedToReceiveAd(this.f22140b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f22139a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m22894a(Context context, AdEventListener adEventListener, C5041Ad ad, boolean z) {
        C5013b bVar = null;
        if (!z) {
            C12339t2.m53496a("onLoadFailed", adEventListener != null, (String) null, ad != null ? ad.getErrorMessage() : null);
        }
        if (adEventListener != null) {
            bVar = new C5013b(adEventListener, ad, context);
        }
        C5055a.m23152a((Runnable) bVar);
    }

    /* renamed from: b */
    public static void m22895b(Context context, AdEventListener adEventListener, C5041Ad ad, boolean z) {
        C5012a aVar = null;
        if (!z) {
            C12339t2.m53496a("onLoad", adEventListener != null, (String) null, (String) null);
        }
        if (adEventListener != null) {
            aVar = new C5012a(adEventListener, ad, context);
        }
        C5055a.m23152a((Runnable) aVar);
    }
}
