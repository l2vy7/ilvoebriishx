package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C12336t0;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* renamed from: com.startapp.i6 */
/* compiled from: Sta */
public class C11958i6 extends C11772a5 {

    /* renamed from: K */
    public MraidState f53088K = MraidState.LOADING;

    /* renamed from: L */
    public C11962d f53089L;

    /* renamed from: M */
    public C12029l6 f53090M;

    /* renamed from: N */
    public C12047m6 f53091N;

    /* renamed from: O */
    public TextView f53092O;

    /* renamed from: P */
    public ImageView f53093P;

    /* renamed from: Q */
    public boolean f53094Q = false;

    /* renamed from: R */
    public boolean f53095R = false;

    /* renamed from: S */
    public Handler f53096S = null;

    /* renamed from: com.startapp.i6$a */
    /* compiled from: Sta */
    public class C11959a implements C12336t0.C12337a {
        public C11959a() {
        }

        public boolean onClickEvent(String str) {
            return C11958i6.this.mo45100a(str, true);
        }
    }

    /* renamed from: com.startapp.i6$b */
    /* compiled from: Sta */
    public class C11960b extends WebChromeClient {
        public C11960b(C11958i6 i6Var) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                    C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                    d4Var.f22126d = "MraidMode.ConsoleError";
                    d4Var.f22127e = consoleMessage.message();
                    d4Var.mo20661a();
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: com.startapp.i6$c */
    /* compiled from: Sta */
    public class C11961c extends C12127p6 {
        public C11961c(C11902f6 f6Var) {
            super(f6Var);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (C11958i6.this.f53088K == MraidState.LOADING) {
                C5015nb.m22916a(webView, true, "mraid.setPlacementType", IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                C11958i6 i6Var = C11958i6.this;
                C12010k6.m52531a(i6Var.f52600b, webView, i6Var.f53090M);
                C11958i6.this.mo45439y();
                C11958i6.this.mo45111j();
                C11958i6 i6Var2 = C11958i6.this;
                if (!i6Var2.f53094Q) {
                    i6Var2.mo45125w();
                }
                C11958i6 i6Var3 = C11958i6.this;
                MraidState mraidState = MraidState.DEFAULT;
                i6Var3.f53088K = mraidState;
                C11939h6.m52394a(mraidState, webView);
                C5015nb.m22916a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                C11958i6 i6Var4 = C11958i6.this;
                if (i6Var4.f53095R) {
                    i6Var4.f53089L.fireViewableChangeEvent();
                }
                C11958i6 i6Var5 = C11958i6.this;
                Handler handler = i6Var5.f53096S;
                if (handler != null) {
                    handler.post(new C11988j6(i6Var5));
                }
                C11958i6 i6Var6 = C11958i6.this;
                i6Var6.mo45096a((View) i6Var6.f52563x);
            }
        }
    }

    /* renamed from: com.startapp.i6$d */
    /* compiled from: Sta */
    public class C11962d extends C12336t0 {
        public C11962d(C12336t0.C12337a aVar) {
            super(aVar);
        }

        public void close() {
            C11958i6 i6Var = C11958i6.this;
            MraidState mraidState = MraidState.HIDDEN;
            i6Var.f53088K = mraidState;
            C11939h6.m52394a(mraidState, i6Var.f52561v);
            C11958i6.this.f52559I.run();
        }

        public void fireViewableChangeEvent() {
            C11958i6 i6Var = C11958i6.this;
            C5015nb.m22916a(i6Var.f52561v, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(i6Var.f53095R));
        }

        public boolean isFeatureSupported(String str) {
            return C11958i6.this.f53090M.f53250b.contains(str);
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            C12047m6 m6Var = C11958i6.this.f53091N;
            if (m6Var.f53276a != parseBoolean || m6Var.f53277b != C12047m6.m52593a(str)) {
                C12047m6 m6Var2 = C11958i6.this.f53091N;
                m6Var2.f53276a = parseBoolean;
                m6Var2.f53277b = C12047m6.m52593a(str);
                C11958i6 i6Var = C11958i6.this;
                applyOrientationProperties(i6Var.f52600b, i6Var.f53091N);
            }
        }

        public void useCustomClose(String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            C11958i6 i6Var = C11958i6.this;
            if (i6Var.f53094Q != parseBoolean) {
                boolean unused = i6Var.f53094Q = parseBoolean;
                if (parseBoolean) {
                    C11958i6 i6Var2 = C11958i6.this;
                    i6Var2.getClass();
                    try {
                        ImageButton imageButton = i6Var2.f52563x;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                        }
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                } else {
                    C11958i6.this.mo45125w();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo45105b(String str) {
        return false;
    }

    /* renamed from: c */
    public boolean mo45106c() {
        if (!mo45438x()) {
            return true;
        }
        super.mo45106c();
        return false;
    }

    /* renamed from: e */
    public void mo45108e() {
        this.f53095R = false;
        if (this.f53088K == MraidState.DEFAULT) {
            this.f53089L.fireViewableChangeEvent();
        }
        super.mo45108e();
    }

    /* renamed from: f */
    public void mo45109f() {
        super.mo45109f();
        if (this.f53096S == null && mo45118p()) {
            this.f53096S = new Handler();
        }
        this.f53095R = true;
        if (this.f53088K == MraidState.DEFAULT) {
            this.f53089L.fireViewableChangeEvent();
        }
    }

    /* renamed from: k */
    public long mo45112k() {
        return (SystemClock.uptimeMillis() - this.f52551A) / 1000;
    }

    public void onClick(View view) {
        if (mo45438x()) {
            this.f53089L.close();
        }
    }

    /* renamed from: p */
    public boolean mo45118p() {
        return this.f52617s > 0;
    }

    /* renamed from: v */
    public void mo45124v() {
        this.f52561v.setWebViewClient(new C11961c(this.f53089L));
        this.f52561v.setWebChromeClient(new C11960b(this));
    }

    /* renamed from: x */
    public final boolean mo45438x() {
        return (SystemClock.uptimeMillis() - this.f52551A) / 1000 >= ((long) this.f52617s);
    }

    /* renamed from: y */
    public void mo45439y() {
        Activity activity = this.f52600b;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            C11939h6.m52396b(activity, i, i2, this.f52561v);
            C11939h6.m52391a(activity, i, i2, this.f52561v);
            C11939h6.m52390a(activity, 0, 0, i, i2, this.f52561v);
            C11939h6.m52395b(activity, 0, 0, i, i2, this.f52561v);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: a */
    public void mo45095a(Bundle bundle) {
        super.mo45095a(bundle);
        if (this.f53090M == null) {
            this.f53090M = new C12029l6(this.f52600b);
        }
        if (this.f53091N == null) {
            this.f53091N = new C12047m6(true, 2);
        }
        if (this.f53089L == null) {
            this.f53089L = new C11962d(new C11959a());
        }
    }

    /* renamed from: a */
    public void mo45146a(Configuration configuration) {
        mo45439y();
    }

    /* renamed from: a */
    public boolean mo45100a(String str, boolean z) {
        MraidState mraidState = MraidState.HIDDEN;
        this.f53088K = mraidState;
        C11939h6.m52394a(mraidState, this.f52561v);
        try {
            return super.mo45100a(str, z);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo45098a(RelativeLayout relativeLayout) {
        if (mo45118p() && !this.f52618t) {
            int a = C11970ib.m52467a((Context) this.f52600b, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(this.f52600b);
            this.f53093P = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a2 = C11970ib.m52467a((Context) this.f52600b, 32);
            gradientDrawable.setSize(a2, a2);
            imageView.setImageDrawable(gradientDrawable);
            this.f53093P.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f53093P, layoutParams);
            TextView textView = new TextView(this.f52600b);
            this.f53092O = textView;
            textView.setTextColor(-1);
            this.f53092O.setGravity(17);
            relativeLayout.addView(this.f53092O, layoutParams);
        }
    }
}
