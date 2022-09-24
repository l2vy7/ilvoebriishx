package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.startapp.zc */
/* compiled from: Sta */
public class C12477zc {

    /* renamed from: a */
    public final Handler f55220a;

    /* renamed from: b */
    public final WeakReference<View> f55221b;

    /* renamed from: c */
    public final BannerOptions f55222c;

    /* renamed from: com.startapp.zc$a */
    /* compiled from: Sta */
    public class C12478a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12479b f55223a;

        public C12478a(C12479b bVar) {
            this.f55223a = bVar;
        }

        public void run() {
            if (this.f55223a.onUpdate(C12477zc.m53814a(C12477zc.this))) {
                C12477zc.this.f55220a.postDelayed(this, 100);
            }
        }
    }

    /* renamed from: com.startapp.zc$b */
    /* compiled from: Sta */
    public interface C12479b {
        boolean onUpdate(boolean z);
    }

    public C12477zc(View view, BannerOptions bannerOptions, C12479b bVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f55220a = handler;
        this.f55221b = new WeakReference<>(view);
        this.f55222c = bannerOptions;
        handler.postDelayed(new C12478a(bVar), 100);
    }

    /* renamed from: a */
    public void mo46867a() {
        this.f55220a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public static boolean m53814a(C12477zc zcVar) {
        return C12435xc.m53767a((View) zcVar.f55221b.get(), zcVar.f55222c, (AtomicReference<JSONObject>) new AtomicReference()) == null;
    }
}
