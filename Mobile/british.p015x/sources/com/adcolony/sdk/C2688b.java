package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.b */
class C2688b extends Activity {

    /* renamed from: k */
    static final int f10596k = 0;

    /* renamed from: l */
    static final int f10597l = 1;

    /* renamed from: a */
    C2701c f10598a;

    /* renamed from: b */
    String f10599b;

    /* renamed from: c */
    int f10600c = -1;

    /* renamed from: d */
    int f10601d;

    /* renamed from: e */
    boolean f10602e;

    /* renamed from: f */
    boolean f10603f;

    /* renamed from: g */
    boolean f10604g;

    /* renamed from: h */
    boolean f10605h;

    /* renamed from: i */
    boolean f10606i;

    /* renamed from: j */
    boolean f10607j;

    /* renamed from: com.adcolony.sdk.b$a */
    class C2689a implements C2750e0 {
        C2689a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2688b.this.mo9484a(c0Var);
        }
    }

    C2688b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9548a(boolean z) {
        Iterator<Map.Entry<Integer, C2921t0>> it = this.f10598a.mo9593m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C2921t0 t0Var = (C2921t0) it.next().getValue();
            if (!t0Var.mo9992f() && t0Var.mo9988b().isPlaying()) {
                t0Var.mo9993h();
            }
        }
        AdColonyInterstitial f = C2684a.m9409c().mo9719f();
        if (f != null && f.mo9478h() && f.mo9474f().mo9779c() != null && z && this.f10606i) {
            f.mo9474f().mo9776a("pause");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9549b(boolean z) {
        for (Map.Entry<Integer, C2921t0> value : this.f10598a.mo9593m().entrySet()) {
            C2921t0 t0Var = (C2921t0) value.getValue();
            if (!t0Var.mo9992f() && !t0Var.mo9988b().isPlaying() && !C2684a.m9409c().mo9724k().mo9898b()) {
                t0Var.mo9994i();
            }
        }
        AdColonyInterstitial f = C2684a.m9409c().mo9719f();
        if (f != null && f.mo9478h() && f.mo9474f().mo9779c() != null) {
            if ((!z || !this.f10606i) && this.f10607j) {
                f.mo9474f().mo9776a("resume");
            }
        }
    }

    public void onBackPressed() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10598a.mo9563a());
        new C2714c0("AdSession.on_back_button", this.f10598a.mo9591k(), b).mo9612d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo9546a();
        } else {
            ((AdColonyAdViewActivity) this).mo9392c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C2684a.m9411e() || C2684a.m9409c().mo9721h() == null) {
            finish();
            return;
        }
        C2794i c = C2684a.m9409c();
        this.f10604g = false;
        C2701c h = c.mo9721h();
        this.f10598a = h;
        h.mo9575c(false);
        if (C2916s0.m10085f()) {
            this.f10598a.mo9575c(true);
        }
        this.f10599b = this.f10598a.mo9563a();
        this.f10601d = this.f10598a.mo9591k();
        boolean multiWindowEnabled = c.mo9733t().getMultiWindowEnabled();
        this.f10605h = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (c.mo9733t().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f10598a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f10598a);
        }
        setContentView(this.f10598a);
        this.f10598a.mo9587i().add(C2684a.m9401a("AdSession.finish_fullscreen_ad", (C2750e0) new C2689a(), true));
        this.f10598a.mo9589j().add("AdSession.finish_fullscreen_ad");
        mo9547a(this.f10600c);
        if (!this.f10598a.mo9595o()) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10598a.mo9563a());
            C2976x.m10323b(b, "screen_width", this.f10598a.mo9576d());
            C2976x.m10323b(b, "screen_height", this.f10598a.mo9569b());
            new C2714c0("AdSession.on_fullscreen_ad_started", this.f10598a.mo9591k(), b).mo9612d();
            this.f10598a.mo9578d(true);
            return;
        }
        mo9546a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C2684a.m9411e() && this.f10598a != null && !this.f10602e) {
            if ((Build.VERSION.SDK_INT < 24 || !C2916s0.m10085f()) && !this.f10598a.mo9599q()) {
                JSONObject b = C2976x.m10319b();
                C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10598a.mo9563a());
                new C2714c0("AdSession.on_error", this.f10598a.mo9591k(), b).mo9612d();
                this.f10604g = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo9548a(this.f10603f);
        this.f10603f = false;
    }

    public void onResume() {
        super.onResume();
        mo9546a();
        mo9549b(this.f10603f);
        this.f10603f = true;
        this.f10607j = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f10603f) {
            C2684a.m9409c().mo9736w().mo9885b(true);
            mo9549b(this.f10603f);
            this.f10606i = true;
        } else if (!z && this.f10603f) {
            C2684a.m9409c().mo9736w().mo9883a(true);
            mo9548a(this.f10603f);
            this.f10606i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9546a() {
        int i;
        C2794i c = C2684a.m9409c();
        if (this.f10598a == null) {
            this.f10598a = c.mo9721h();
        }
        C2701c cVar = this.f10598a;
        if (cVar != null) {
            cVar.mo9575c(false);
            if (C2916s0.m10085f()) {
                this.f10598a.mo9575c(true);
            }
            int s = c.mo9723j().mo9866s();
            if (this.f10605h) {
                i = c.mo9723j().mo9865r() - C2916s0.m10081e(C2684a.m9407b());
            } else {
                i = c.mo9723j().mo9865r();
            }
            if (s > 0 && i > 0) {
                JSONObject b = C2976x.m10319b();
                JSONObject b2 = C2976x.m10319b();
                float n = c.mo9723j().mo9861n();
                C2976x.m10323b(b2, "width", (int) (((float) s) / n));
                C2976x.m10323b(b2, "height", (int) (((float) i) / n));
                C2976x.m10323b(b2, "app_orientation", C2916s0.m10079d(C2916s0.m10082e()));
                C2976x.m10323b(b2, "x", 0);
                C2976x.m10323b(b2, "y", 0);
                C2976x.m10313a(b2, "ad_session_id", this.f10598a.mo9563a());
                C2976x.m10323b(b, "screen_width", s);
                C2976x.m10323b(b, "screen_height", i);
                C2976x.m10313a(b, "ad_session_id", this.f10598a.mo9563a());
                C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f10598a.mo9573c());
                this.f10598a.setLayoutParams(new FrameLayout.LayoutParams(s, i));
                this.f10598a.mo9571b(s);
                this.f10598a.mo9564a(i);
                new C2714c0("MRAID.on_size_change", this.f10598a.mo9591k(), b2).mo9612d();
                new C2714c0("AdContainer.on_orientation_change", this.f10598a.mo9591k(), b).mo9612d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9484a(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), IronSourceConstants.EVENTS_STATUS);
        if ((e == 5 || e == 0 || e == 6 || e == 1) && !this.f10602e) {
            C2794i c = C2684a.m9409c();
            C2857o k = c.mo9724k();
            c.mo9715d(c0Var);
            if (k.mo9896a() != null) {
                k.mo9896a().dismiss();
                k.mo9897a((AlertDialog) null);
            }
            if (!this.f10604g) {
                finish();
            }
            this.f10602e = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            c.mo9718e(false);
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10598a.mo9563a());
            new C2714c0("AdSession.on_close", this.f10598a.mo9591k(), b).mo9612d();
            c.mo9704a((C2701c) null);
            c.mo9702a((AdColonyInterstitial) null);
            c.mo9699a((AdColonyAdView) null);
            C2684a.m9409c().mo9708b().mo9613a().remove(this.f10598a.mo9563a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9547a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f10600c = i;
    }
}
