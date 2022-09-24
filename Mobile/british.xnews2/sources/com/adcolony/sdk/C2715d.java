package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.C2978z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.d */
class C2715d {

    /* renamed from: a */
    private HashMap<String, C2701c> f10681a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ConcurrentHashMap<String, AdColonyInterstitial> f10682b;

    /* renamed from: c */
    private HashMap<String, AdColonyAdViewListener> f10683c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HashMap<String, AdColonyAdView> f10684d;

    /* renamed from: com.adcolony.sdk.d$a */
    class C2716a implements C2750e0 {
        C2716a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2715d.this.mo9620a(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C2717b implements C2750e0 {
        C2717b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2715d.this.mo9627e(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C2718c implements C2750e0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C2719a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10688a;

            C2719a(C2714c0 c0Var) {
                this.f10688a = c0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C2715d.this.f10682b.get(C2976x.m10337i(this.f10688a.mo9608b(), TtmlNode.ATTR_ID));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C2718c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2719a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C2720d implements C2750e0 {

        /* renamed from: com.adcolony.sdk.d$d$a */
        class C2721a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10691a;

            C2721a(C2714c0 c0Var) {
                this.f10691a = c0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C2715d.this.f10682b.get(C2976x.m10337i(this.f10691a.mo9608b(), TtmlNode.ATTR_ID));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C2720d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2721a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C2722e implements C2750e0 {
        C2722e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2715d.this.mo9629i(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C2723f implements C2750e0 {
        C2723f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2715d.this.mo9628h(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C2724g implements C2750e0 {
        C2724g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2715d.this.m9537g(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C2725h implements C2750e0 {
        C2725h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C2726i implements C2750e0 {

        /* renamed from: com.adcolony.sdk.d$i$a */
        class C2727a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10698a;

            C2727a(C2714c0 c0Var) {
                this.f10698a = c0Var;
            }

            public void run() {
                C2714c0 c0Var = this.f10698a;
                c0Var.mo9607a(c0Var.mo9608b()).mo9612d();
            }
        }

        C2726i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2727a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C2728j implements C2750e0 {
        C2728j() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2823i0.m9743d().mo9763a(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C2729k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f10701a;

        /* renamed from: b */
        final /* synthetic */ C2714c0 f10702b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f10703c;

        /* renamed from: d */
        final /* synthetic */ String f10704d;

        C2729k(Context context, C2714c0 c0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f10701a = context;
            this.f10702b = c0Var;
            this.f10703c = adColonyAdViewListener;
            this.f10704d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView = new AdColonyAdView(this.f10701a, this.f10702b, this.f10703c);
            C2715d.this.f10684d.put(this.f10704d, adColonyAdView);
            adColonyAdView.setOmidManager(this.f10703c.mo9404b());
            adColonyAdView.mo9368d();
            this.f10703c.mo9402a((C2829j0) null);
            this.f10703c.onRequestFilled(adColonyAdView);
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C2730l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f10706a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f10707b;

        C2730l(AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f10706a = adColonyInterstitial;
            this.f10707b = adColonyInterstitialListener;
        }

        public void run() {
            this.f10706a.mo9463a(true);
            this.f10707b.onExpiring(this.f10706a);
            C2857o k = C2684a.m9409c().mo9724k();
            if (k.mo9896a() != null) {
                k.mo9896a().dismiss();
                k.mo9897a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C2731m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f10709a;

        /* renamed from: b */
        final /* synthetic */ C2714c0 f10710b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f10711c;

        C2731m(AdColonyInterstitial adColonyInterstitial, C2714c0 c0Var, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f10709a = adColonyInterstitial;
            this.f10710b = c0Var;
            this.f10711c = adColonyInterstitialListener;
        }

        public void run() {
            if (this.f10709a.mo9474f() == null) {
                this.f10709a.mo9462a(C2976x.m10335g(this.f10710b.mo9608b(), "iab"));
            }
            this.f10709a.mo9461a(C2976x.m10337i(this.f10710b.mo9608b(), "ad_id"));
            this.f10709a.mo9469c(C2976x.m10337i(this.f10710b.mo9608b(), "creative_id"));
            C2829j0 f = this.f10709a.mo9474f();
            if (!(f == null || f.mo9780d() == 2)) {
                try {
                    f.mo9773a();
                } catch (IllegalArgumentException unused) {
                    new C2978z.C2979a().mo10088a("IllegalArgumentException when creating omid session").mo10090a(C2978z.f11950j);
                }
            }
            this.f10711c.onRequestFilled(this.f10709a);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C2732n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f10713a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f10714b;

        C2732n(AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f10713a = adColonyInterstitial;
            this.f10714b = adColonyInterstitialListener;
        }

        public void run() {
            AdColonyZone adColonyZone = C2684a.m9409c().mo9691B().get(this.f10713a.getZoneID());
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(this.f10713a.getZoneID());
                adColonyZone.mo9522c(6);
            }
            this.f10714b.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C2733o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f10716a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f10717b;

        C2733o(AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f10716a = adColonyInterstitialListener;
            this.f10717b = adColonyInterstitial;
        }

        public void run() {
            C2684a.m9409c().mo9718e(false);
            this.f10716a.onClosed(this.f10717b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C2734p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10719a;

        /* renamed from: b */
        final /* synthetic */ C2951u0 f10720b;

        /* renamed from: c */
        final /* synthetic */ C2701c f10721c;

        C2734p(String str, C2951u0 u0Var, C2701c cVar) {
            this.f10719a = str;
            this.f10720b = u0Var;
            this.f10721c = cVar;
        }

        public void run() {
            C2829j0 j0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = C2715d.this.mo9613a().get(this.f10719a);
                AdColonyAdView adColonyAdView = C2715d.this.mo9621b().get(this.f10719a);
                if (adColonyInterstitial == null) {
                    j0Var = null;
                } else {
                    j0Var = adColonyInterstitial.mo9474f();
                }
                if (j0Var == null && adColonyAdView != null) {
                    j0Var = adColonyAdView.getOmidManager();
                }
                if (j0Var == null) {
                    i = -1;
                } else {
                    i = j0Var.mo9780d();
                }
                if (j0Var != null && i == 2) {
                    j0Var.mo9774a((WebView) this.f10720b);
                    j0Var.mo9775a(this.f10721c);
                }
            } catch (IllegalArgumentException unused) {
                new C2978z.C2979a().mo10088a("IllegalArgumentException when creating omid session").mo10090a(C2978z.f11950j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C2735q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2701c f10723a;

        C2735q(C2701c cVar) {
            this.f10723a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f10723a.mo9587i().size(); i++) {
                C2684a.m9408b(this.f10723a.mo9589j().get(i), this.f10723a.mo9587i().get(i));
            }
            this.f10723a.mo9589j().clear();
            this.f10723a.mo9587i().clear();
            this.f10723a.removeAllViews();
            C2701c cVar = this.f10723a;
            cVar.f10662z = null;
            cVar.f10661y = null;
            for (C2951u0 next : cVar.mo9594n().values()) {
                if (!next.mo10053y()) {
                    int c = next.mo9662c();
                    if (c <= 0) {
                        c = next.mo9663d();
                    }
                    C2684a.m9409c().mo9706a(c);
                    next.loadUrl("about:blank");
                    next.clearCache(true);
                    next.removeAllViews();
                    next.mo10030a(true);
                }
            }
            for (C2921t0 next2 : this.f10723a.mo9593m().values()) {
                next2.mo9995j();
                next2.mo9996k();
            }
            this.f10723a.mo9593m().clear();
            this.f10723a.mo9592l().clear();
            this.f10723a.mo9594n().clear();
            this.f10723a.mo9585h().clear();
            this.f10723a.mo9579e().clear();
            this.f10723a.mo9581f().clear();
            this.f10723a.mo9583g().clear();
            this.f10723a.f10649m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C2736r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f10725a;

        C2736r(AdColonyAdViewListener adColonyAdViewListener) {
            this.f10725a = adColonyAdViewListener;
        }

        public void run() {
            String c = this.f10725a.mo9405c();
            AdColonyZone adColonyZone = C2684a.m9409c().mo9691B().get(c);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(c);
                adColonyZone.mo9522c(6);
            }
            this.f10725a.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C2737s implements C2750e0 {

        /* renamed from: com.adcolony.sdk.d$s$a */
        class C2738a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10728a;

            C2738a(C2714c0 c0Var) {
                this.f10728a = c0Var;
            }

            public void run() {
                C2715d.this.mo9624c(this.f10728a);
            }
        }

        C2737s() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2738a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C2739t implements C2750e0 {

        /* renamed from: com.adcolony.sdk.d$t$a */
        class C2740a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10731a;

            C2740a(C2714c0 c0Var) {
                this.f10731a = c0Var;
            }

            public void run() {
                boolean unused = C2715d.this.m9532d(this.f10731a);
            }
        }

        C2739t() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2740a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C2741u implements C2750e0 {
        C2741u() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2715d.this.m9539k(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C2742v implements C2750e0 {
        C2742v() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2715d.this.m9538j(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C2743w implements C2750e0 {
        C2743w() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2715d.this.m9535f(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C2744x implements C2750e0 {
        C2744x() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2715d.this.m9540l(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$y */
    class C2745y implements C2750e0 {
        C2745y() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2715d.this.mo9622b(c0Var);
        }
    }

    C2715d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m9537g(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, i);
        Context b2 = C2684a.m9407b();
        if (b2 == null) {
            C2976x.m10325b(b, "has_audio", false);
            c0Var.mo9607a(b).mo9612d();
            return false;
        }
        boolean b3 = C2916s0.m10074b(C2916s0.m10054a(b2));
        double a = C2916s0.m10048a(C2916s0.m10054a(b2));
        C2976x.m10325b(b, "has_audio", b3);
        C2976x.m10312a(b, "volume", a);
        c0Var.mo9607a(b).mo9612d();
        return b3;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m9538j(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String c = c0Var.mo9611c();
        String i = C2976x.m10337i(b, "ad_session_id");
        int e = C2976x.m10332e(b, "view_id");
        C2701c cVar = this.f10681a.get(i);
        if (cVar == null) {
            mo9619a(c, i);
            return false;
        }
        View view = cVar.mo9579e().get(Integer.valueOf(e));
        if (view == null) {
            mo9619a(c, "" + e);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m9539k(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String c = c0Var.mo9611c();
        String i = C2976x.m10337i(b, "ad_session_id");
        int e = C2976x.m10332e(b, "view_id");
        C2701c cVar = this.f10681a.get(i);
        if (cVar == null) {
            mo9619a(c, i);
            return false;
        }
        View view = cVar.mo9579e().get(Integer.valueOf(e));
        if (view == null) {
            mo9619a(c, "" + e);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m9540l(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, TtmlNode.ATTR_ID);
        AdColonyInterstitial adColonyInterstitial = this.f10682b.get(i);
        AdColonyAdView adColonyAdView = this.f10684d.get(i);
        int a = C2976x.m10299a(b, AdUnitActivity.EXTRA_ORIENTATION, -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C2976x.m10313a(C2976x.m10319b(), TtmlNode.ATTR_ID, i);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo9458a(a);
                adColonyInterstitial.mo9481j();
            }
            return true;
        }
        mo9619a(c0Var.mo9611c(), i);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9628h(C2714c0 c0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String i = C2976x.m10337i(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        AdColonyInterstitial remove = this.f10682b.remove(i);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        } else if (!C2684a.m9410d()) {
            return false;
        } else {
            C2916s0.m10063a((Runnable) new C2732n(remove, adColonyInterstitialListener));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9629i(C2714c0 c0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String i = C2976x.m10337i(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        AdColonyInterstitial adColonyInterstitial = this.f10682b.get(i);
        if (adColonyInterstitial == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = adColonyInterstitial.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        } else if (!C2684a.m9410d()) {
            return false;
        } else {
            C2916s0.m10063a((Runnable) new C2731m(adColonyInterstitial, c0Var, adColonyInterstitialListener));
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m9532d(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "ad_session_id");
        C2701c cVar = this.f10681a.get(i);
        if (cVar == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        }
        mo9615a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m9535f(C2714c0 c0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        JSONObject b = c0Var.mo9608b();
        int e = C2976x.m10332e(b, IronSourceConstants.EVENTS_STATUS);
        if (e == 5 || e == 1 || e == 0 || e == 6) {
            return false;
        }
        String i = C2976x.m10337i(b, TtmlNode.ATTR_ID);
        AdColonyInterstitial remove = this.f10682b.remove(i);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        }
        C2916s0.m10063a((Runnable) new C2733o(adColonyInterstitialListener, remove));
        remove.mo9460a((C2701c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9624c(C2714c0 c0Var) {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        JSONObject b2 = c0Var.mo9608b();
        String i = C2976x.m10337i(b2, "ad_session_id");
        C2701c cVar = new C2701c(b.getApplicationContext(), i);
        cVar.mo9590j(c0Var);
        this.f10681a.put(i, cVar);
        if (C2976x.m10332e(b2, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f10682b.get(i);
            if (adColonyInterstitial == null) {
                mo9619a(c0Var.mo9611c(), i);
                return false;
            }
            adColonyInterstitial.mo9460a(cVar);
        } else {
            cVar.mo9572b(false);
        }
        JSONObject b3 = C2976x.m10319b();
        C2976x.m10325b(b3, "success", true);
        c0Var.mo9607a(b3).mo9612d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9626e() {
        this.f10681a = new HashMap<>();
        this.f10682b = new ConcurrentHashMap<>();
        this.f10683c = new HashMap<>();
        this.f10684d = new HashMap<>();
        C2684a.m9405a("AdContainer.create", (C2750e0) new C2737s());
        C2684a.m9405a("AdContainer.destroy", (C2750e0) new C2739t());
        C2684a.m9405a("AdContainer.move_view_to_index", (C2750e0) new C2741u());
        C2684a.m9405a("AdContainer.move_view_to_front", (C2750e0) new C2742v());
        C2684a.m9405a("AdSession.finish_fullscreen_ad", (C2750e0) new C2743w());
        C2684a.m9405a("AdSession.start_fullscreen_ad", (C2750e0) new C2744x());
        C2684a.m9405a("AdSession.ad_view_available", (C2750e0) new C2745y());
        C2684a.m9405a("AdSession.ad_view_unavailable", (C2750e0) new C2716a());
        C2684a.m9405a("AdSession.expiring", (C2750e0) new C2717b());
        C2684a.m9405a("AdSession.audio_stopped", (C2750e0) new C2718c());
        C2684a.m9405a("AdSession.audio_started", (C2750e0) new C2720d());
        C2684a.m9405a("AdSession.interstitial_available", (C2750e0) new C2722e());
        C2684a.m9405a("AdSession.interstitial_unavailable", (C2750e0) new C2723f());
        C2684a.m9405a("AdSession.has_audio", (C2750e0) new C2724g());
        C2684a.m9405a("WebView.prepare", (C2750e0) new C2725h());
        C2684a.m9405a("AdSession.expanded", (C2750e0) new C2726i());
        C2684a.m9405a("AdColony.odt_event", (C2750e0) new C2728j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9620a(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        AdColonyAdViewListener remove = this.f10683c.remove(i);
        if (remove == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        }
        C2916s0.m10063a((Runnable) new C2736r(remove));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9622b(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        AdColonyAdViewListener remove = this.f10683c.remove(i);
        if (remove == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        }
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        C2916s0.m10063a((Runnable) new C2729k(b, c0Var, remove, i));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public HashMap<String, C2701c> mo9625d() {
        return this.f10681a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9617a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        JSONObject jSONObject;
        String a = C2916s0.m10055a();
        JSONObject b = C2976x.m10319b();
        float n = C2684a.m9409c().mo9723j().mo9861n();
        C2976x.m10313a(b, "zone_id", str);
        C2976x.m10323b(b, SessionDescription.ATTR_TYPE, 1);
        C2976x.m10323b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * n));
        C2976x.m10323b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * n));
        C2976x.m10323b(b, "width", adColonyAdSize.getWidth());
        C2976x.m10323b(b, "height", adColonyAdSize.getHeight());
        C2976x.m10313a(b, TtmlNode.ATTR_ID, a);
        adColonyAdViewListener.mo9403a(str);
        adColonyAdViewListener.mo9401a(adColonyAdSize);
        if (!(adColonyAdOptions == null || (jSONObject = adColonyAdOptions.f10505d) == null)) {
            C2976x.m10315a(b, "options", jSONObject);
        }
        this.f10683c.put(a, adColonyAdViewListener);
        new C2714c0("AdSession.on_request", 1, b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public HashMap<String, AdColonyAdView> mo9621b() {
        return this.f10684d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, AdColonyAdViewListener> mo9623c() {
        return this.f10683c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9618a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        String a = C2916s0.m10055a();
        C2794i c = C2684a.m9409c();
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "zone_id", str);
        C2976x.m10325b(b, "fullscreen", true);
        C2976x.m10323b(b, "width", c.mo9723j().mo9866s());
        C2976x.m10323b(b, "height", c.mo9723j().mo9865r());
        C2976x.m10323b(b, SessionDescription.ATTR_TYPE, 0);
        C2976x.m10313a(b, TtmlNode.ATTR_ID, a);
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        this.f10682b.put(a, adColonyInterstitial);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f10505d == null)) {
            adColonyInterstitial.mo9459a(adColonyAdOptions);
            C2976x.m10315a(b, "options", adColonyAdOptions.f10505d);
        }
        new C2714c0("AdSession.on_request", 1, b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9627e(C2714c0 c0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, TtmlNode.ATTR_ID);
        if (C2976x.m10332e(b, SessionDescription.ATTR_TYPE) != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f10682b.remove(i);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9619a(c0Var.mo9611c(), i);
            return false;
        } else if (!C2684a.m9410d()) {
            return false;
        } else {
            C2916s0.m10063a((Runnable) new C2730l(remove, adColonyInterstitialListener));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9614a(Context context, JSONObject jSONObject, String str) {
        C2714c0 c0Var = new C2714c0("AdSession.finish_fullscreen_ad", 0);
        C2976x.m10323b(jSONObject, IronSourceConstants.EVENTS_STATUS, 1);
        new C2978z.C2979a().mo10088a(str).mo10090a(C2978z.f11949i);
        ((C2688b) context).mo9484a(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9616a(C2951u0 u0Var, String str, C2701c cVar) {
        C2916s0.m10063a((Runnable) new C2734p(str, u0Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9615a(C2701c cVar) {
        C2916s0.m10063a((Runnable) new C2735q(cVar));
        AdColonyAdView adColonyAdView = this.f10684d.get(cVar.mo9563a());
        if (adColonyAdView == null || adColonyAdView.mo9367c()) {
            this.f10681a.remove(cVar.mo9563a());
            cVar.f10661y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9619a(String str, String str2) {
        new C2978z.C2979a().mo10088a("Message '").mo10088a(str).mo10088a("' sent with invalid id: ").mo10088a(str2).mo10090a(C2978z.f11949i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo9613a() {
        return this.f10682b;
    }
}
