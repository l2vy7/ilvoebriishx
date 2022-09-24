package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C2978z;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import org.json.JSONObject;

public class AdColonyAdView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2701c f10508a = C2684a.m9409c().mo9708b().mo9625d().get(this.f10511d);

    /* renamed from: b */
    private AdColonyAdViewListener f10509b;

    /* renamed from: c */
    private AdColonyAdSize f10510c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f10511d;

    /* renamed from: e */
    private String f10512e;

    /* renamed from: f */
    private String f10513f;

    /* renamed from: g */
    private String f10514g;

    /* renamed from: h */
    private ImageView f10515h;

    /* renamed from: i */
    private C2829j0 f10516i;

    /* renamed from: j */
    private C2714c0 f10517j;

    /* renamed from: k */
    private boolean f10518k;

    /* renamed from: l */
    private boolean f10519l;

    /* renamed from: m */
    private boolean f10520m;

    /* renamed from: n */
    private boolean f10521n;

    /* renamed from: o */
    private boolean f10522o;

    /* renamed from: p */
    private int f10523p;

    /* renamed from: q */
    private int f10524q;

    /* renamed from: r */
    private int f10525r;

    /* renamed from: s */
    private int f10526s;

    /* renamed from: t */
    private int f10527t;

    /* renamed from: com.adcolony.sdk.AdColonyAdView$a */
    class C2681a implements Runnable {
        C2681a() {
        }

        public void run() {
            Context b = C2684a.m9407b();
            if (b instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) b).mo9391b();
            }
            C2715d b2 = C2684a.m9409c().mo9708b();
            b2.mo9621b().remove(AdColonyAdView.this.f10511d);
            b2.mo9615a(AdColonyAdView.this.f10508a);
            JSONObject b3 = C2976x.m10319b();
            C2976x.m10313a(b3, TtmlNode.ATTR_ID, AdColonyAdView.this.f10511d);
            new C2714c0("AdSession.on_ad_view_destroyed", 1, b3).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$b */
    class C2682b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f10529a;

        C2682b(Context context) {
            this.f10529a = context;
        }

        public void onClick(View view) {
            Context context = this.f10529a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).mo9391b();
            }
        }
    }

    AdColonyAdView(Context context, C2714c0 c0Var, AdColonyAdViewListener adColonyAdViewListener) {
        super(context);
        this.f10509b = adColonyAdViewListener;
        this.f10512e = adColonyAdViewListener.mo9405c();
        JSONObject b = c0Var.mo9608b();
        this.f10511d = C2976x.m10337i(b, TtmlNode.ATTR_ID);
        this.f10513f = C2976x.m10337i(b, "close_button_filepath");
        this.f10518k = C2976x.m10329c(b, "trusted_demand_source");
        this.f10522o = C2976x.m10329c(b, "close_button_snap_to_webview");
        this.f10526s = C2976x.m10332e(b, "close_button_width");
        this.f10527t = C2976x.m10332e(b, "close_button_height");
        this.f10510c = adColonyAdViewListener.mo9400a();
        setLayoutParams(new FrameLayout.LayoutParams(this.f10508a.mo9576d(), this.f10508a.mo9569b()));
        setBackgroundColor(0);
        addView(this.f10508a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9367c() {
        return this.f10519l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9368d() {
        if (this.f10516i != null) {
            getWebView().mo10038h();
        }
    }

    public boolean destroy() {
        if (this.f10519l) {
            new C2978z.C2979a().mo10088a("Ignoring duplicate call to destroy().").mo10090a(C2978z.f11947g);
            return false;
        }
        this.f10519l = true;
        C2829j0 j0Var = this.f10516i;
        if (!(j0Var == null || j0Var.mo9779c() == null)) {
            this.f10516i.mo9778b();
        }
        C2916s0.m10063a((Runnable) new C2681a());
        return true;
    }

    public AdColonyAdSize getAdSize() {
        return this.f10510c;
    }

    /* access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f10514g;
    }

    /* access modifiers changed from: package-private */
    public C2701c getContainer() {
        return this.f10508a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f10509b;
    }

    /* access modifiers changed from: package-private */
    public C2829j0 getOmidManager() {
        return this.f10516i;
    }

    /* access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f10523p;
    }

    /* access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f10518k;
    }

    /* access modifiers changed from: package-private */
    public boolean getUserInteraction() {
        return this.f10521n;
    }

    /* access modifiers changed from: package-private */
    public C2951u0 getWebView() {
        C2701c cVar = this.f10508a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo9594n().get(2);
    }

    public String getZoneId() {
        return this.f10512e;
    }

    /* access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f10514g = str;
    }

    /* access modifiers changed from: package-private */
    public void setExpandMessage(C2714c0 c0Var) {
        this.f10517j = c0Var;
    }

    /* access modifiers changed from: package-private */
    public void setExpandedHeight(int i) {
        this.f10525r = (int) (((float) i) * C2684a.m9409c().mo9723j().mo9861n());
    }

    /* access modifiers changed from: package-private */
    public void setExpandedWidth(int i) {
        this.f10524q = (int) (((float) i) * C2684a.m9409c().mo9723j().mo9861n());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f10509b = adColonyAdViewListener;
    }

    /* access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z) {
        this.f10520m = this.f10518k && z;
    }

    /* access modifiers changed from: package-private */
    public void setOmidManager(C2829j0 j0Var) {
        this.f10516i = j0Var;
    }

    /* access modifiers changed from: package-private */
    public void setOrientation(int i) {
        this.f10523p = i;
    }

    /* access modifiers changed from: package-private */
    public void setUserInteraction(boolean z) {
        this.f10521n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9365a() {
        if (this.f10518k || this.f10521n) {
            float n = C2684a.m9409c().mo9723j().mo9861n();
            this.f10508a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) this.f10510c.getWidth()) * n), (int) (((float) this.f10510c.getHeight()) * n)));
            C2951u0 webView = getWebView();
            if (webView != null) {
                C2714c0 c0Var = new C2714c0("WebView.set_bounds", 0);
                JSONObject b = C2976x.m10319b();
                C2976x.m10323b(b, "x", webView.mo10048r());
                C2976x.m10323b(b, "y", webView.mo10049s());
                C2976x.m10323b(b, "width", webView.mo10047q());
                C2976x.m10323b(b, "height", webView.mo10046p());
                c0Var.mo9610b(b);
                webView.mo10027a(c0Var);
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10313a(b2, "ad_session_id", this.f10511d);
                new C2714c0("MRAID.on_close", this.f10508a.mo9591k(), b2).mo9612d();
            }
            ImageView imageView = this.f10515h;
            if (imageView != null) {
                this.f10508a.removeView(imageView);
                this.f10508a.mo9565a((View) this.f10515h);
            }
            addView(this.f10508a);
            AdColonyAdViewListener adColonyAdViewListener = this.f10509b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9366b() {
        if (this.f10518k || this.f10521n) {
            C2849n j = C2684a.m9409c().mo9723j();
            int s = j.mo9866s();
            int r = j.mo9865r();
            int i = this.f10524q;
            if (i <= 0) {
                i = s;
            }
            int i2 = this.f10525r;
            if (i2 <= 0) {
                i2 = r;
            }
            int i3 = (s - i) / 2;
            int i4 = (r - i2) / 2;
            this.f10508a.setLayoutParams(new FrameLayout.LayoutParams(s, r));
            C2951u0 webView = getWebView();
            if (webView != null) {
                C2714c0 c0Var = new C2714c0("WebView.set_bounds", 0);
                JSONObject b = C2976x.m10319b();
                C2976x.m10323b(b, "x", i3);
                C2976x.m10323b(b, "y", i4);
                C2976x.m10323b(b, "width", i);
                C2976x.m10323b(b, "height", i2);
                c0Var.mo9610b(b);
                webView.mo10027a(c0Var);
                float n = j.mo9861n();
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10323b(b2, "app_orientation", C2916s0.m10079d(C2916s0.m10082e()));
                C2976x.m10323b(b2, "width", (int) (((float) i) / n));
                C2976x.m10323b(b2, "height", (int) (((float) i2) / n));
                C2976x.m10323b(b2, "x", C2916s0.m10051a((View) webView));
                C2976x.m10323b(b2, "y", C2916s0.m10067b((View) webView));
                C2976x.m10313a(b2, "ad_session_id", this.f10511d);
                new C2714c0("MRAID.on_size_change", this.f10508a.mo9591k(), b2).mo9612d();
            }
            ImageView imageView = this.f10515h;
            if (imageView != null) {
                this.f10508a.removeView(imageView);
            }
            Context b3 = C2684a.m9407b();
            if (!(b3 == null || this.f10520m || webView == null)) {
                float n2 = C2684a.m9409c().mo9723j().mo9861n();
                int i5 = (int) (((float) this.f10526s) * n2);
                int i6 = (int) (((float) this.f10527t) * n2);
                if (this.f10522o) {
                    s = webView.mo10043n() + webView.mo10042m();
                }
                int o = this.f10522o ? webView.mo10044o() : 0;
                ImageView imageView2 = new ImageView(b3.getApplicationContext());
                this.f10515h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f10513f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
                layoutParams.setMargins(s - i5, o, 0, 0);
                this.f10515h.setOnClickListener(new C2682b(b3));
                this.f10508a.addView(this.f10515h, layoutParams);
                this.f10508a.mo9566a((View) this.f10515h, FriendlyObstructionPurpose.CLOSE_AD);
            }
            if (this.f10517j != null) {
                JSONObject b4 = C2976x.m10319b();
                C2976x.m10325b(b4, "success", true);
                this.f10517j.mo9607a(b4).mo9612d();
                this.f10517j = null;
            }
            return true;
        }
        if (this.f10517j != null) {
            JSONObject b5 = C2976x.m10319b();
            C2976x.m10325b(b5, "success", false);
            this.f10517j.mo9607a(b5).mo9612d();
            this.f10517j = null;
        }
        return false;
    }
}
