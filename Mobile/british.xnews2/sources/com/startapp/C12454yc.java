package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.startapp.yc */
/* compiled from: Sta */
public class C12454yc implements Runnable {

    /* renamed from: a */
    public NotDisplayedReason f55174a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;

    /* renamed from: b */
    public JSONObject f55175b;

    /* renamed from: c */
    public C12455a f55176c;

    /* renamed from: d */
    public final Handler f55177d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final WeakReference<View> f55178e;

    /* renamed from: f */
    public final C11868d9 f55179f;

    /* renamed from: g */
    public final BannerOptions f55180g;

    /* renamed from: h */
    public boolean f55181h = true;

    /* renamed from: com.startapp.yc$a */
    /* compiled from: Sta */
    public interface C12455a {
    }

    public C12454yc(View view, C11868d9 d9Var, BannerOptions bannerOptions) {
        this.f55178e = new WeakReference<>(view);
        this.f55179f = d9Var;
        this.f55180g = bannerOptions;
    }

    /* renamed from: a */
    public void mo46839a() {
        NotDisplayedReason notDisplayedReason;
        try {
            C11868d9 d9Var = this.f55179f;
            if (!(d9Var == null || (notDisplayedReason = this.f55174a) == null)) {
                d9Var.mo45303a(notDisplayedReason.toString(), this.f55175b);
            }
            this.f55177d.removeCallbacksAndMessages((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo46840b() {
        C11868d9 d9Var = this.f55179f;
        return (d9Var == null || d9Var.f52867i.get() || this.f55178e.get() == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.C5038e) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.mo46840b()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x007b }
            r0.<init>()     // Catch:{ all -> 0x007b }
            java.lang.ref.WeakReference<android.view.View> r1 = r5.f55178e     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.banner.BannerOptions r2 = r5.f55180g     // Catch:{ all -> 0x007b }
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r1 = com.startapp.C12435xc.m53767a((android.view.View) r1, (com.startapp.sdk.ads.banner.BannerOptions) r2, (java.util.concurrent.atomic.AtomicReference<org.json.JSONObject>) r0)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0033
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r2 = r5.f55174a     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            int r2 = r2.mo21018a()     // Catch:{ all -> 0x007b }
            int r3 = r1.mo21018a()     // Catch:{ all -> 0x007b }
            if (r2 > r3) goto L_0x0033
        L_0x0029:
            r5.f55174a = r1     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007b }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x007b }
            r5.f55175b = r0     // Catch:{ all -> 0x007b }
        L_0x0033:
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x004a
            boolean r3 = r5.f55181h     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x004a
            r5.f55181h = r0     // Catch:{ all -> 0x007b }
            com.startapp.d9 r0 = r5.f55179f     // Catch:{ all -> 0x007b }
            r0.mo45304b()     // Catch:{ all -> 0x007b }
            com.startapp.yc$a r0 = r5.f55176c     // Catch:{ all -> 0x007b }
            goto L_0x006f
        L_0x004a:
            if (r1 != 0) goto L_0x006f
            boolean r0 = r5.f55181h     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x006f
            r5.f55181h = r2     // Catch:{ all -> 0x007b }
            com.startapp.d9 r0 = r5.f55179f     // Catch:{ all -> 0x007b }
            r0.mo45302a()     // Catch:{ all -> 0x007b }
            com.startapp.yc$a r0 = r5.f55176c     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006f
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.C5038e) r0     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r1 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r3 = r1.f22210j     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x006f
            boolean r4 = r1.f22205e     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x006f
            r3.adHidden(r1)     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r0 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            boolean unused = r0.f22205e = r2     // Catch:{ all -> 0x007b }
        L_0x006f:
            android.os.Handler r0 = r5.f55177d     // Catch:{ all -> 0x007b }
            r1 = 100
            r0.postDelayed(r5, r1)     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x0077:
            r5.mo46839a()     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x007b:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r0 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r5.f55174a = r0
            r5.mo46839a()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12454yc.run():void");
    }

    public C12454yc(WeakReference<View> weakReference, C11868d9 d9Var, BannerOptions bannerOptions) {
        this.f55178e = weakReference;
        this.f55179f = d9Var;
        this.f55180g = bannerOptions;
    }
}
