package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.AdsConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.cd */
/* compiled from: Sta */
public class C11832cd {

    /* renamed from: a */
    public final C11873dd f52697a;

    /* renamed from: b */
    public final Queue<WeakReference<WebView>> f52698b = new LinkedList();

    /* renamed from: com.startapp.cd$a */
    /* compiled from: Sta */
    public class C11833a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ Handler f52699a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f52700b;

        /* renamed from: c */
        public final /* synthetic */ WebView f52701c;

        /* renamed from: d */
        public final /* synthetic */ C5015nb.C5016a f52702d;

        /* renamed from: e */
        public final /* synthetic */ AtomicLong f52703e;

        /* renamed from: f */
        public final /* synthetic */ int f52704f;

        /* renamed from: com.startapp.cd$a$a */
        /* compiled from: Sta */
        public class C11834a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ long f52706a;

            public C11834a(long j) {
                this.f52706a = j;
            }

            public void run() {
                if (C11833a.this.f52700b.compareAndSet(false, true)) {
                    C11833a aVar = C11833a.this;
                    C11832cd.this.mo45223a(aVar.f52701c);
                    C11833a aVar2 = C11833a.this;
                    aVar2.f52702d.mo20681a(false, aVar2.f52703e.get(), this.f52706a, true);
                }
            }
        }

        /* renamed from: com.startapp.cd$a$b */
        /* compiled from: Sta */
        public class C11835b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f52708a;

            public C11835b(String str) {
                this.f52708a = str;
            }

            public void run() {
                if (C11833a.this.f52700b.compareAndSet(false, true)) {
                    C11833a aVar = C11833a.this;
                    C11832cd.this.mo45223a(aVar.f52701c);
                    C11833a.this.f52702d.mo20680a(3, String.valueOf(this.f52708a));
                }
            }
        }

        public C11833a(Handler handler, AtomicBoolean atomicBoolean, WebView webView, C5015nb.C5016a aVar, AtomicLong atomicLong, int i) {
            this.f52699a = handler;
            this.f52700b = atomicBoolean;
            this.f52701c = webView;
            this.f52702d = aVar;
            this.f52703e = atomicLong;
            this.f52704f = i;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long a = C5015nb.m22900a();
            this.f52699a.removeCallbacksAndMessages((Object) null);
            this.f52699a.postDelayed(new C11834a(a), (long) this.f52704f);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f52699a.removeCallbacksAndMessages((Object) null);
            this.f52699a.post(new C11835b(str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || C5015nb.m22929b(webView.getContext(), str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.startapp.cd$b */
    /* compiled from: Sta */
    public class C11836b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f52710a;

        /* renamed from: b */
        public final /* synthetic */ WebView f52711b;

        /* renamed from: c */
        public final /* synthetic */ C5015nb.C5016a f52712c;

        public C11836b(AtomicBoolean atomicBoolean, WebView webView, C5015nb.C5016a aVar) {
            this.f52710a = atomicBoolean;
            this.f52711b = webView;
            this.f52712c = aVar;
        }

        public void run() {
            if (this.f52710a.compareAndSet(false, true)) {
                C11832cd.this.mo45223a(this.f52711b);
                this.f52712c.mo20680a(2, "Unknown error");
            }
        }
    }

    /* renamed from: com.startapp.cd$c */
    /* compiled from: Sta */
    public class C11837c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f52714a;

        /* renamed from: b */
        public final /* synthetic */ WebView f52715b;

        /* renamed from: c */
        public final /* synthetic */ C5015nb.C5016a f52716c;

        /* renamed from: d */
        public final /* synthetic */ AtomicLong f52717d;

        public C11837c(AtomicBoolean atomicBoolean, WebView webView, C5015nb.C5016a aVar, AtomicLong atomicLong) {
            this.f52714a = atomicBoolean;
            this.f52715b = webView;
            this.f52716c = aVar;
            this.f52717d = atomicLong;
        }

        public void run() {
            if (this.f52714a.compareAndSet(false, true)) {
                C11832cd.this.mo45223a(this.f52715b);
                this.f52716c.mo20681a(false, this.f52717d.get(), C5015nb.m22900a(), false);
            }
        }
    }

    public C11832cd(Context context, C11873dd ddVar) {
        this.f52697a = ddVar;
    }

    /* renamed from: a */
    public void mo45223a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.f52698b.size() < 3) {
            this.f52698b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void mo45224a(String str, C5015nb.C5016a aVar) {
        int i;
        String str2 = str;
        C5015nb.C5016a aVar2 = aVar;
        if ("true".equals(C5015nb.m22910a(str2, "@doNotRender@", "@doNotRender@"))) {
            aVar.mo20681a(true, 0, 0, false);
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f52698b.size() <= 0) {
                    break;
                }
                WeakReference poll = this.f52698b.poll();
                if (poll != null) {
                    webView = (WebView) poll.get();
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                aVar2.mo20680a(1, "WebView instantiation Error");
                return;
            }
        }
        if (webView == null) {
            webView = this.f52697a.mo45309b();
        }
        WebView webView2 = webView;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Handler handler = new Handler(Looper.getMainLooper());
        AtomicLong atomicLong = new AtomicLong();
        if (AdsConstants.f54495f.booleanValue()) {
            webView2.getSettings().setBlockNetworkImage(false);
            webView2.getSettings().setLoadsImagesAutomatically(true);
            webView2.getSettings().setJavaScriptEnabled(true);
            i = 25000;
        } else {
            i = 0;
        }
        webView2.setWebChromeClient(new WebChromeClient());
        C11833a aVar3 = r1;
        AtomicLong atomicLong2 = atomicLong;
        C11833a aVar4 = new C11833a(handler, atomicBoolean, webView2, aVar, atomicLong, i);
        webView2.setWebViewClient(aVar3);
        atomicLong2.set(C5015nb.m22900a());
        if (!C5015nb.m22921a(webView2, str2)) {
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new C11836b(atomicBoolean, webView2, aVar2));
            return;
        }
        handler.postDelayed(new C11837c(atomicBoolean, webView2, aVar, atomicLong2), 25000);
    }
}
