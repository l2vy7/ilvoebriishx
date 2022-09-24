package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.C11796b3;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.startapp.a5 */
/* compiled from: Sta */
public class C11772a5 extends C11796b3 implements View.OnClickListener {

    /* renamed from: A */
    public long f52551A = 0;

    /* renamed from: B */
    public C11868d9 f52552B;

    /* renamed from: C */
    public boolean f52553C = true;

    /* renamed from: D */
    public boolean f52554D = false;

    /* renamed from: E */
    public int f52555E = 0;

    /* renamed from: F */
    public boolean f52556F = false;

    /* renamed from: G */
    public boolean f52557G;

    /* renamed from: H */
    public C12011k7 f52558H;

    /* renamed from: I */
    public Runnable f52559I = new C11773a();

    /* renamed from: J */
    public Runnable f52560J = new C11774b();

    /* renamed from: v */
    public WebView f52561v;

    /* renamed from: w */
    public RelativeLayout f52562w;

    /* renamed from: x */
    public ImageButton f52563x;

    /* renamed from: y */
    public Long f52564y;

    /* renamed from: z */
    public Long f52565z;

    /* renamed from: com.startapp.a5$a */
    /* compiled from: Sta */
    public class C11773a implements Runnable {
        public C11773a() {
        }

        public void run() {
            C11772a5.this.mo45110i();
            C11772a5.this.mo45101b();
        }
    }

    /* renamed from: com.startapp.a5$b */
    /* compiled from: Sta */
    public class C11774b implements Runnable {
        public C11774b() {
        }

        public void run() {
            C11772a5 a5Var = C11772a5.this;
            a5Var.f52553C = true;
            WebView webView = a5Var.f52561v;
            if (webView != null) {
                webView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
    }

    /* renamed from: com.startapp.a5$c */
    /* compiled from: Sta */
    public class C11775c implements View.OnLongClickListener {
        public C11775c(C11772a5 a5Var) {
        }

        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: com.startapp.a5$d */
    /* compiled from: Sta */
    public class C11776d implements View.OnTouchListener {
        public C11776d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C11772a5.this.f52553C = true;
            if (motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.startapp.a5$e */
    /* compiled from: Sta */
    public class C11777e implements Runnable {
        public C11777e() {
        }

        public void run() {
            C11772a5.this.mo45101b();
        }
    }

    /* renamed from: com.startapp.a5$f */
    /* compiled from: Sta */
    public class C11778f implements Runnable {
        public C11778f() {
        }

        public void run() {
            WebView webView = C11772a5.this.f52561v;
            if (webView != null) {
                C12437y.m53778a(webView);
            }
        }
    }

    /* renamed from: com.startapp.a5$g */
    /* compiled from: Sta */
    public class C11779g extends WebViewClient {
        public C11779g() {
        }

        public void onPageFinished(WebView webView, String str) {
            C11772a5.this.mo45097a(webView);
            C11772a5 a5Var = C11772a5.this;
            C5015nb.m22916a(a5Var.f52561v, true, "gClientInterface.setMode", a5Var.f52606h);
            Object[] objArr = {"externalLinks"};
            C5015nb.m22916a(C11772a5.this.f52561v, true, "enableScheme", objArr);
            C11772a5.this.mo45120r();
            String a = C5055a.m23143a(str, (String) null);
            Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
            intent.putExtra("dParam", a);
            if (C11772a5.this.mo45121s()) {
                C5116u5.m23368a(webView.getContext()).mo21244a(intent);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || C5015nb.m22929b(webView.getContext(), str)) {
                return true;
            }
            if (!C11772a5.this.f52553C) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "fake_click";
                d4Var.f22129g = C11772a5.this.mo45145a();
                StringBuilder a = C12458z0.m53804a("jsTag=");
                a.append(C11772a5.this.f52556F);
                d4Var.f22127e = a.toString();
                d4Var.mo20661a();
            }
            C11772a5 a5Var = C11772a5.this;
            if (!a5Var.f52556F || a5Var.f52553C) {
                return a5Var.mo45100a(str, false);
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo45095a(Bundle bundle) {
        C5116u5.m23368a((Context) this.f52600b).mo21243a(this.f52602d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle == null) {
            this.f52557G = true;
            if (this.f52599a.hasExtra("lastLoadTime")) {
                this.f52564y = (Long) this.f52599a.getSerializableExtra("lastLoadTime");
            }
            if (this.f52599a.hasExtra("adCacheTtl")) {
                this.f52565z = (Long) this.f52599a.getSerializableExtra("adCacheTtl");
                return;
            }
            return;
        }
        if (bundle.containsKey("postrollHtml")) {
            mo45147a(bundle.getString("postrollHtml"));
        }
        if (bundle.containsKey("lastLoadTime")) {
            this.f52564y = (Long) bundle.getSerializable("lastLoadTime");
        }
        if (bundle.containsKey("adCacheTtl")) {
            this.f52565z = (Long) bundle.getSerializable("adCacheTtl");
        }
        this.f52554D = bundle.getBoolean("videoCompletedBroadcastSent", false);
        this.f52555E = bundle.getInt("replayNum");
    }

    /* renamed from: a */
    public void mo45097a(WebView webView) {
    }

    /* renamed from: a */
    public void mo45098a(RelativeLayout relativeLayout) {
    }

    /* renamed from: b */
    public void mo45101b() {
        this.f52600b.runOnUiThread(new C11796b3.C11798b());
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.f22282n = false;
        C11868d9 d9Var = this.f52552B;
        if (d9Var != null) {
            d9Var.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        this.f52600b.runOnUiThread(new C11778f());
    }

    /* renamed from: c */
    public boolean mo45106c() {
        mo45110i();
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.f22282n = false;
        this.f52552B.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        return false;
    }

    /* renamed from: d */
    public void mo45107d() {
        if (this.f52602d != null) {
            C5116u5.m23368a((Context) this.f52600b).mo21242a(this.f52602d);
        }
        this.f52602d = null;
        C12011k7 k7Var = this.f52558H;
        if (k7Var != null) {
            k7Var.mo45499a();
            this.f52558H = null;
        }
        WebView webView = this.f52561v;
        Map<Activity, Integer> map = C5015nb.f22145a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView, SystemClock.uptimeMillis() + 1000);
    }

    /* renamed from: e */
    public void mo45108e() {
        C11868d9 d9Var = this.f52552B;
        if (d9Var != null) {
            d9Var.mo45302a();
        }
        WebView webView = this.f52561v;
        if (webView != null) {
            C12437y.m53778a(webView);
        }
    }

    /* renamed from: f */
    public void mo45109f() {
        C5041Ad ad = this.f52610l;
        if (ad instanceof InterstitialAd ? ((InterstitialAd) ad).mo20844d() : false) {
            mo45101b();
            return;
        }
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.f22282n = true;
        if (this.f52552B == null) {
            this.f52552B = new C11868d9(this.f52600b, this.f52607i, mo45115n(), mo45114m());
        }
        WebView webView = this.f52561v;
        if (webView == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f52600b);
            this.f52562w = relativeLayout;
            relativeLayout.setContentDescription("StartApp Ad");
            this.f52562w.setId(1475346432);
            this.f52600b.setContentView(this.f52562w);
            try {
                WebView b = ComponentLocator.m23305a((Context) this.f52600b).mo21236w().mo45309b();
                this.f52561v = b;
                b.setBackgroundColor(-16777216);
                this.f52600b.getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.f52561v.setVerticalScrollBarEnabled(false);
                this.f52561v.setHorizontalScrollBarEnabled(false);
                this.f52561v.getSettings().setJavaScriptEnabled(true);
                WebView webView2 = this.f52561v;
                if (Build.VERSION.SDK_INT >= 17) {
                    webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
                if (this.f52619u) {
                    C12437y.m53779a(this.f52561v, (Paint) null);
                }
                this.f52561v.setOnLongClickListener(new C11775c(this));
                this.f52561v.setLongClickable(false);
                this.f52561v.addJavascriptInterface(mo45113l(), "startappwall");
                mo45119q();
                mo45103b(this.f52561v);
                mo45124v();
                C5015nb.m22921a(this.f52561v, this.f52611m);
                this.f52556F = "true".equals(C5015nb.m22910a(this.f52611m, "@jsTag@", "@jsTag@"));
                this.f52562w.addView(this.f52561v, new RelativeLayout.LayoutParams(-1, -1));
                RelativeLayout relativeLayout2 = this.f52562w;
                AdInformationObject adInformationObject = new AdInformationObject(this.f52600b, AdInformationObject.Size.LARGE, this.f52612n, this.f52613o, this.f52610l.getConsentData());
                this.f52601c = adInformationObject;
                adInformationObject.mo46126a(relativeLayout2);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                mo45101b();
            }
        } else {
            C12437y.m53785b(webView);
            this.f52552B.mo45304b();
        }
        this.f52551A = SystemClock.uptimeMillis();
    }

    /* renamed from: i */
    public void mo45110i() {
        String[] strArr = this.f52603e;
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            C5055a.m23146a((Context) this.f52600b, strArr[0], mo45116o());
        }
    }

    /* renamed from: j */
    public void mo45111j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f52600b);
            ImageButton imageButton = new ImageButton(this.f52600b);
            this.f52563x = imageButton;
            imageButton.setBackgroundColor(0);
            this.f52563x.setOnClickListener(this);
            int a = C11970ib.m52467a((Context) this.f52600b, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f52563x, layoutParams);
            mo45098a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a, a);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f52562w.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: k */
    public long mo45112k() {
        return (SystemClock.uptimeMillis() - this.f52551A) / 1000;
    }

    /* renamed from: l */
    public C11938h5 mo45113l() {
        Activity activity = this.f52600b;
        Runnable runnable = this.f52559I;
        Runnable runnable2 = this.f52560J;
        C11938h5 h5Var = new C11938h5((Context) activity, runnable, mo45116o(), mo45148a(0));
        h5Var.f53037d = runnable;
        h5Var.f53038e = runnable2;
        return h5Var;
    }

    /* renamed from: m */
    public long mo45114m() {
        Long l = this.f52615q;
        if (l != null) {
            return TimeUnit.SECONDS.toMillis(l.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f22407k.mo21203o());
    }

    /* renamed from: n */
    public TrackingParams mo45115n() {
        return new TrackingParams(this.f52614p);
    }

    /* renamed from: o */
    public TrackingParams mo45116o() {
        return new CloseTrackingParams(mo45112k(), this.f52614p);
    }

    public void onClick(View view) {
    }

    /* renamed from: p */
    public boolean mo45118p() {
        return false;
    }

    /* renamed from: q */
    public void mo45119q() {
        this.f52552B.mo45304b();
    }

    /* renamed from: r */
    public void mo45120r() {
        mo45096a((View) this.f52563x);
    }

    /* renamed from: s */
    public boolean mo45121s() {
        return this.f52557G;
    }

    /* renamed from: t */
    public void mo45122t() {
    }

    /* renamed from: u */
    public void mo45123u() {
        if (mo45118p() && !this.f52554D && this.f52555E == 0) {
            this.f52554D = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", mo45145a());
            C5116u5.m23368a((Context) this.f52600b).mo21244a(intent);
            mo45122t();
        }
    }

    /* renamed from: v */
    public void mo45124v() {
        this.f52561v.setWebViewClient(new C11779g());
    }

    /* renamed from: w */
    public void mo45125w() {
        try {
            if (this.f52563x != null) {
                this.f52563x.setImageDrawable(new BitmapDrawable(this.f52600b.getResources(), C11878e1.m52261a("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC")));
                this.f52563x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f52563x.setVisibility(0);
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: b */
    public void mo45103b(WebView webView) {
        this.f52553C = false;
        webView.setOnTouchListener(new C11776d());
    }

    /* renamed from: b */
    public void mo45102b(Bundle bundle) {
        String str = this.f52611m;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        Long l = this.f52564y;
        if (l != null) {
            bundle.putLong("lastLoadTime", l.longValue());
        }
        Long l2 = this.f52565z;
        if (l2 != null) {
            bundle.putLong("adCacheTtl", l2.longValue());
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.f52554D);
        bundle.putInt("replayNum", this.f52555E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[SYNTHETIC, Splitter:B:11:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo45100a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.startapp.d9 r0 = r5.f52552B
            r1 = 0
            r0.mo45303a(r1, r1)
            com.startapp.sdk.adsbase.Ad r0 = r5.f52610l
            android.app.Activity r1 = r5.f52600b
            android.content.Context r1 = com.startapp.C5009h0.m22892a(r1)
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            android.app.Activity r1 = r5.f52600b
        L_0x0013:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r5.f52612n
            boolean r1 = com.startapp.sdk.adsbase.C5055a.m23158a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.C5015nb.f22145a
            boolean r0 = r0 instanceof com.startapp.sdk.ads.splash.SplashAd
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            boolean r1 = r5.mo45105b((java.lang.String) r6)
            if (r1 == 0) goto L_0x0045
            int r1 = com.startapp.sdk.adsbase.C5055a.m23137a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            boolean[] r4 = r5.f52604f     // Catch:{ all -> 0x0040 }
            boolean r4 = r4[r1]     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x003c
            if (r0 != 0) goto L_0x003c
            r5.mo45104b(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x003c:
            r5.mo45099a(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r6 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r6)
            return r3
        L_0x0045:
            boolean[] r1 = r5.f52604f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            r5.mo45104b(r6, r3, r7)
            goto L_0x0054
        L_0x0051:
            r5.mo45099a(r6, r3, r7)
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11772a5.mo45100a(java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    public boolean mo45105b(String str) {
        return !this.f52556F && str.contains("index=");
    }

    /* renamed from: b */
    public final void mo45104b(String str, int i, boolean z) {
        int i2 = i;
        boolean k = MetaData.f22407k.mo21199k();
        Activity activity = this.f52600b;
        String[] strArr = this.f52608j;
        String[] strArr2 = i2 < strArr.length ? new String[]{strArr[i2]} : null;
        String[] strArr3 = this.f52609k;
        String str2 = i2 < strArr3.length ? strArr3[i2] : null;
        TrackingParams o = mo45116o();
        long z2 = AdsCommonMetaData.f22242h.mo20913z();
        long y = AdsCommonMetaData.f22242h.mo20912y();
        boolean a = mo45148a(i2);
        Boolean[] boolArr = this.f52616r;
        C5055a.m23150a(activity, str, strArr2, str2, o, z2, y, a, (boolArr == null || i2 < 0 || i2 >= boolArr.length) ? null : boolArr[i2], z, k ? new C11777e() : null);
    }

    /* renamed from: a */
    public final void mo45099a(String str, int i, boolean z) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", mo45145a());
        C5116u5.m23368a((Context) this.f52600b).mo21244a(intent);
        Context a = C5009h0.m22892a(this.f52600b);
        if (a == null) {
            a = this.f52600b;
        }
        boolean a2 = C5055a.m23158a(a, this.f52612n);
        Activity activity = this.f52600b;
        String[] strArr = this.f52608j;
        boolean z2 = true;
        String[] strArr2 = i < strArr.length ? new String[]{strArr[i]} : null;
        TrackingParams o = mo45116o();
        if (!mo45148a(i) || a2) {
            z2 = false;
        }
        C5055a.m23149a((Context) activity, str, strArr2, o, z2, z);
        if (MetaData.f22407k.mo21199k()) {
            mo45101b();
        }
    }

    /* renamed from: a */
    public void mo45096a(View view) {
        AdInformationView adInformationView;
        if (MetaData.f22407k.mo21175Q()) {
            C12011k7 k7Var = new C12011k7(this.f52561v);
            this.f52558H = k7Var;
            if (k7Var.mo45503c()) {
                try {
                    AdInformationObject adInformationObject = this.f52601c;
                    if (!(adInformationObject == null || (adInformationView = adInformationObject.f54507b) == null)) {
                        this.f52558H.mo45501a(adInformationView, FriendlyObstructionPurpose.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.f52558H.mo45501a(view, FriendlyObstructionPurpose.CLOSE_AD, (String) null);
                    }
                } catch (RuntimeException unused) {
                }
                this.f52558H.mo45500a(this.f52561v);
                this.f52558H.mo45505e();
                this.f52558H.mo45504d();
                this.f52558H.mo45502b();
            }
        }
    }
}
