package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.C5055a;

/* renamed from: com.startapp.n0 */
/* compiled from: Sta */
public class C12064n0 {

    /* renamed from: com.startapp.n0$a */
    /* compiled from: Sta */
    public class C12065a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f53313a;

        /* renamed from: b */
        public final /* synthetic */ View f53314b;

        public C12065a(BannerListener bannerListener, View view, Context context) {
            this.f53313a = bannerListener;
            this.f53314b = view;
        }

        public void run() {
            try {
                this.f53313a.onReceiveAd(this.f53314b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f53313a, th);
            }
        }
    }

    /* renamed from: com.startapp.n0$b */
    /* compiled from: Sta */
    public class C12066b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f53315a;

        /* renamed from: b */
        public final /* synthetic */ View f53316b;

        public C12066b(BannerListener bannerListener, View view, Context context) {
            this.f53315a = bannerListener;
            this.f53316b = view;
        }

        public void run() {
            try {
                this.f53315a.onFailedToReceiveAd(this.f53316b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f53315a, th);
            }
        }
    }

    /* renamed from: com.startapp.n0$c */
    /* compiled from: Sta */
    public class C12067c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f53317a;

        /* renamed from: b */
        public final /* synthetic */ View f53318b;

        public C12067c(BannerListener bannerListener, View view, Context context) {
            this.f53317a = bannerListener;
            this.f53318b = view;
        }

        public void run() {
            try {
                this.f53317a.onClick(this.f53318b);
            } catch (Throwable th) {
                C5015nb.m22918a((Object) this.f53317a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m52613a(Context context, BannerListener bannerListener, View view, String str) {
        C12067c cVar = null;
        C12339t2.m53496a("onClicked", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            cVar = new C12067c(bannerListener, view, context);
        }
        C5055a.m23152a((Runnable) cVar);
    }

    /* renamed from: b */
    public static void m52614b(Context context, BannerListener bannerListener, View view, String str) {
        C12066b bVar = null;
        C12339t2.m53496a("onLoadFailed", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            bVar = new C12066b(bannerListener, view, context);
        }
        C5055a.m23152a((Runnable) bVar);
    }

    /* renamed from: c */
    public static void m52615c(Context context, BannerListener bannerListener, View view, String str) {
        C12065a aVar = null;
        C12339t2.m53496a("onLoad", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            aVar = new C12065a(bannerListener, view, context);
        }
        C5055a.m23152a((Runnable) aVar);
    }
}
