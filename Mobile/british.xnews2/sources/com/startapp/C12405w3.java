package com.startapp;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import java.util.HashMap;

/* renamed from: com.startapp.w3 */
/* compiled from: Sta */
public class C12405w3 extends C11796b3 implements View.OnClickListener {

    /* renamed from: B */
    public static boolean f55022B = false;

    /* renamed from: A */
    public String f55023A;

    /* renamed from: v */
    public RelativeLayout f55024v;

    /* renamed from: w */
    public NavigationBarLayout f55025w;

    /* renamed from: x */
    public WebView f55026x;

    /* renamed from: y */
    public AnimatingProgressBar f55027y;

    /* renamed from: z */
    public FrameLayout f55028z;

    /* renamed from: com.startapp.w3$a */
    /* compiled from: Sta */
    public class C12406a extends WebChromeClient {
        public C12406a() {
        }

        public void onProgressChanged(WebView webView, int i) {
            C12405w3.this.f55027y.setProgress(i);
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (str != null && !str.equals("")) {
                C12405w3.this.f55025w.f54710f.setText(str);
            }
        }
    }

    /* renamed from: com.startapp.w3$b */
    /* compiled from: Sta */
    public static class C12407b extends WebViewClient {

        /* renamed from: a */
        public Context f55030a;

        /* renamed from: b */
        public C12405w3 f55031b;

        /* renamed from: c */
        public NavigationBarLayout f55032c;

        /* renamed from: d */
        public AnimatingProgressBar f55033d;

        /* renamed from: e */
        public int f55034e = 0;

        /* renamed from: f */
        public boolean f55035f = false;

        public C12407b(Context context, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, C12405w3 w3Var) {
            this.f55030a = context;
            this.f55033d = animatingProgressBar;
            this.f55032c = navigationBarLayout;
            this.f55031b = w3Var;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!C12405w3.f55022B) {
                this.f55032c.mo46455a(webView);
                int i = this.f55034e - 1;
                this.f55034e = i;
                if (i == 0) {
                    this.f55035f = false;
                    this.f55033d.mo46450a();
                    if (this.f55033d.isShown()) {
                        this.f55033d.setVisibility(8);
                    }
                    this.f55032c.mo46455a(webView);
                }
                super.onPageFinished(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!C12405w3.f55022B) {
                if (this.f55035f) {
                    this.f55034e = 1;
                    this.f55033d.mo46450a();
                    this.f55032c.mo46455a(webView);
                } else {
                    this.f55034e = Math.max(this.f55034e, 1);
                }
                this.f55033d.setVisibility(0);
                this.f55032c.f54711g.setText(str);
                this.f55032c.mo46455a(webView);
                super.onPageStarted(webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            this.f55033d.mo46450a();
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView != null && str != null && !C5015nb.m22929b(webView.getContext(), str) && !C12405w3.f55022B) {
                if (!this.f55035f) {
                    this.f55035f = true;
                    this.f55033d.mo46450a();
                    this.f55034e = 0;
                }
                this.f55034e++;
                if (C5055a.m23166c(str) && !C5055a.m23165b(str)) {
                    return false;
                }
                this.f55034e = 1;
                C5055a.m23164b(this.f55030a, str, (String) null);
                C12405w3 w3Var = this.f55031b;
                if (w3Var != null) {
                    w3Var.mo46699i();
                }
            }
            return true;
        }
    }

    public C12405w3(String str) {
        this.f55023A = str;
    }

    /* renamed from: a */
    public void mo45095a(Bundle bundle) {
        Bundle bundle2 = bundle;
        C5116u5.m23368a((Context) this.f52600b).mo21243a(this.f52602d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        f55022B = false;
        this.f55024v = new RelativeLayout(this.f52600b);
        String str = this.f55023A;
        if (this.f55025w == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f52600b);
            this.f55025w = navigationBarLayout;
            navigationBarLayout.setDescendantFocusability(262144);
            navigationBarLayout.setBackgroundColor(Color.parseColor("#e9e9e9"));
            navigationBarLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, C11970ib.m52467a(navigationBarLayout.getContext(), 60)));
            navigationBarLayout.setId(IronSourceConstants.IS_CHECK_READY_TRUE);
            HashMap hashMap = new HashMap();
            hashMap.put("BACK", new C12466z6((Bitmap) null, 14, 22, "back_.png"));
            hashMap.put("BACK_DARK", new C12466z6((Bitmap) null, 14, 22, "back_dark.png"));
            hashMap.put("FORWARD", new C12466z6((Bitmap) null, 14, 22, "forward_.png"));
            hashMap.put("FORWARD_DARK", new C12466z6((Bitmap) null, 14, 22, "forward_dark.png"));
            hashMap.put("X", new C12466z6((Bitmap) null, 23, 23, "x_dark.png"));
            hashMap.put("BROWSER", new C12466z6((Bitmap) null, 28, 28, "browser_icon_dark.png"));
            navigationBarLayout.f54713i = hashMap;
            NavigationBarLayout navigationBarLayout2 = this.f55025w;
            navigationBarLayout2.getClass();
            Typeface typeface = Typeface.DEFAULT;
            Typeface typeface2 = typeface;
            navigationBarLayout2.f54710f = C11970ib.m52470a(navigationBarLayout2.getContext(), navigationBarLayout2.f54710f, typeface2, 1, 16.46f, NavigationBarLayout.f54703j, IronSourceConstants.IS_CHECK_READY_FALSE);
            navigationBarLayout2.f54711g = C11970ib.m52470a(navigationBarLayout2.getContext(), navigationBarLayout2.f54710f, typeface2, 1, 12.12f, NavigationBarLayout.f54704k, 2107);
            navigationBarLayout2.f54710f.setText("Loading...");
            RelativeLayout relativeLayout = new RelativeLayout(navigationBarLayout2.getContext());
            navigationBarLayout2.f54705a = relativeLayout;
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            navigationBarLayout2.f54705a.addView(navigationBarLayout2.f54710f, C11970ib.m52469a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
            RelativeLayout relativeLayout2 = navigationBarLayout2.f54705a;
            TextView textView = navigationBarLayout2.f54711g;
            RelativeLayout.LayoutParams a = C11970ib.m52469a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]);
            a.addRule(3, IronSourceConstants.IS_CHECK_READY_FALSE);
            relativeLayout2.addView(textView, a);
            for (C12466z6 next : navigationBarLayout2.f54713i.values()) {
                Bitmap a2 = C11812c1.m52082a(navigationBarLayout2.getContext(), next.f55200d);
                if (a2 != null) {
                    next.f55197a = Bitmap.createScaledBitmap(a2, C11970ib.m52467a(navigationBarLayout2.getContext(), next.f55198b), C11970ib.m52467a(navigationBarLayout2.getContext(), next.f55199c), true);
                }
            }
            navigationBarLayout2.f54706b = C11970ib.m52468a(navigationBarLayout2.getContext(), navigationBarLayout2.f54706b, navigationBarLayout2.f54713i.get("X").f55197a, IronSourceConstants.IS_CHECK_CAPPED_TRUE);
            navigationBarLayout2.f54708d = C11970ib.m52468a(navigationBarLayout2.getContext(), navigationBarLayout2.f54708d, navigationBarLayout2.f54713i.get("BROWSER").f55197a, 2104);
            navigationBarLayout2.f54709e = C11970ib.m52468a(navigationBarLayout2.getContext(), navigationBarLayout2.f54709e, navigationBarLayout2.f54713i.get("BACK").f55197a, 2105);
            navigationBarLayout2.f54707c = C11970ib.m52468a(navigationBarLayout2.getContext(), navigationBarLayout2.f54707c, navigationBarLayout2.f54713i.get("FORWARD").f55197a, 2106);
            int a3 = C11970ib.m52467a(navigationBarLayout2.getContext(), 10);
            navigationBarLayout2.f54707c.setPadding(a3, a3, a3, a3);
            navigationBarLayout2.f54707c.setEnabled(false);
            navigationBarLayout2.f54709e.setPadding(a3, a3, a3, a3);
            navigationBarLayout2.addView(navigationBarLayout2.f54706b, C11970ib.m52469a(navigationBarLayout2.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
            ImageView imageView = navigationBarLayout2.f54708d;
            RelativeLayout.LayoutParams a4 = C11970ib.m52469a(navigationBarLayout2.getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
            a4.addRule(0, IronSourceConstants.IS_CHECK_CAPPED_TRUE);
            navigationBarLayout2.addView(imageView, a4);
            RelativeLayout relativeLayout3 = navigationBarLayout2.f54705a;
            RelativeLayout.LayoutParams a5 = C11970ib.m52469a(navigationBarLayout2.getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
            a5.addRule(0, 2104);
            navigationBarLayout2.addView(relativeLayout3, a5);
            this.f55025w.setButtonsListener(this);
        }
        this.f55024v.addView(this.f55025w);
        this.f55027y = new AnimatingProgressBar(this.f52600b, (AttributeSet) null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f55027y.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f55027y.setBackgroundColor(-1);
        this.f55027y.setId(2108);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C11970ib.m52467a((Context) this.f52600b, 4));
        layoutParams.addRule(3, IronSourceConstants.IS_CHECK_READY_TRUE);
        this.f55024v.addView(this.f55027y, layoutParams);
        this.f55028z = new FrameLayout(this.f52600b);
        if (this.f55026x == null) {
            try {
                mo46700j();
                this.f55026x.loadUrl(str);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                this.f55025w.mo46454a();
                C5055a.m23164b((Context) this.f52600b, str, (String) null);
                this.f52600b.finish();
            }
        }
        this.f55028z.addView(this.f55026x);
        this.f55028z.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f55024v.addView(this.f55028z, layoutParams2);
        if (bundle2 != null) {
            this.f55026x.restoreState(bundle2);
        }
        this.f52600b.setContentView(this.f55024v, new RelativeLayout.LayoutParams(-2, -2));
    }

    /* renamed from: b */
    public void mo45102b(Bundle bundle) {
        this.f55026x.saveState(bundle);
    }

    /* renamed from: e */
    public void mo45108e() {
    }

    /* renamed from: f */
    public void mo45109f() {
    }

    /* renamed from: i */
    public void mo46699i() {
        try {
            f55022B = true;
            this.f55026x.stopLoading();
            this.f55026x.removeAllViews();
            this.f55026x.postInvalidate();
            C12437y.m53778a(this.f55026x);
            this.f55026x.destroy();
            this.f55026x = null;
        } catch (Exception unused) {
        }
        this.f55025w.mo46454a();
        this.f52600b.finish();
    }

    /* renamed from: j */
    public final void mo46700j() {
        WebView b = ComponentLocator.m23305a((Context) this.f52600b).mo21236w().mo45309b();
        this.f55026x = b;
        b.getSettings().setJavaScriptEnabled(true);
        this.f55026x.getSettings().setUseWideViewPort(true);
        this.f55026x.getSettings().setLoadWithOverviewMode(true);
        this.f55026x.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f55026x.getSettings().setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f55026x.getSettings().setDisplayZoomControls(false);
        }
        this.f55026x.setWebViewClient(new C12407b(this.f52600b, this.f55025w, this.f55027y, this));
        this.f55026x.setWebChromeClient(new C12406a());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case IronSourceConstants.IS_CHECK_CAPPED_TRUE:
                mo46699i();
                return;
            case 2104:
                WebView webView = this.f55026x;
                if (webView != null) {
                    C5055a.m23164b((Context) this.f52600b, webView.getUrl(), (String) null);
                    mo46699i();
                    return;
                }
                return;
            case 2105:
                WebView webView2 = this.f55026x;
                if (webView2 != null && webView2.canGoBack()) {
                    this.f55027y.mo46450a();
                    this.f55026x.goBack();
                    return;
                }
                return;
            case 2106:
                WebView webView3 = this.f55026x;
                if (webView3 != null && webView3.canGoForward()) {
                    this.f55027y.mo46450a();
                    this.f55026x.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo45149a(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        WebView webView = this.f55026x;
        if (webView == null || !webView.canGoBack()) {
            mo46699i();
            return true;
        }
        this.f55027y.mo46450a();
        this.f55026x.goBack();
        return true;
    }
}
