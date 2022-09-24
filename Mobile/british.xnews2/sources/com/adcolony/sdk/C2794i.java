package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.C2838l;
import com.adcolony.sdk.C2864p;
import com.adcolony.sdk.C2912s;
import com.adcolony.sdk.C2978z;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.i */
class C2794i implements C2864p.C2865a {

    /* renamed from: W */
    static final String f11378W = "026ae9c9824b3e483fa6c71fa88f57ae27816141";

    /* renamed from: X */
    static final String f11379X = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5";

    /* renamed from: Y */
    static String f11380Y = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: Z */
    private static volatile String f11381Z = "";

    /* renamed from: A */
    private String f11382A = "";

    /* renamed from: B */
    private boolean f11383B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f11384C;

    /* renamed from: D */
    private boolean f11385D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f11386E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f11387F;

    /* renamed from: G */
    private boolean f11388G;

    /* renamed from: H */
    private boolean f11389H;

    /* renamed from: I */
    private boolean f11390I;

    /* renamed from: J */
    private boolean f11391J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f11392K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f11393L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f11394M;

    /* renamed from: N */
    private int f11395N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f11396O = 1;

    /* renamed from: P */
    private final int f11397P = 120;

    /* renamed from: Q */
    private Application.ActivityLifecycleCallbacks f11398Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Partner f11399R = null;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public JSONObject f11400S = new JSONObject();

    /* renamed from: T */
    private long f11401T = 500;

    /* renamed from: U */
    private long f11402U = 500;

    /* renamed from: V */
    private boolean f11403V;

    /* renamed from: a */
    private C2827j f11404a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2746d0 f11405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2867q f11406c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2855n0 f11407d;

    /* renamed from: e */
    private C2715d f11408e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2857o f11409f;

    /* renamed from: g */
    private C2932u f11410g;

    /* renamed from: h */
    private C2871q0 f11411h;

    /* renamed from: i */
    private C2863o0 f11412i;

    /* renamed from: j */
    private C2690b0 f11413j;

    /* renamed from: k */
    private C2849n f11414k;

    /* renamed from: l */
    private C2786g0 f11415l;

    /* renamed from: m */
    private C2701c f11416m;

    /* renamed from: n */
    private AdColonyAdView f11417n;

    /* renamed from: o */
    private AdColonyInterstitial f11418o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdColonyRewardListener f11419p;

    /* renamed from: q */
    private HashMap<String, AdColonyCustomMessageListener> f11420q = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AdColonyAppOptions f11421r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C2714c0 f11422s;

    /* renamed from: t */
    private JSONObject f11423t;

    /* renamed from: u */
    private HashMap<String, AdColonyZone> f11424u = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HashMap<Integer, C2951u0> f11425v = new HashMap<>();

    /* renamed from: w */
    private String f11426w;

    /* renamed from: x */
    private String f11427x;

    /* renamed from: y */
    private String f11428y;

    /* renamed from: z */
    private String f11429z;

    /* renamed from: com.adcolony.sdk.i$a */
    class C2795a implements C2750e0 {
        C2795a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10323b(b, "crc32", C2916s0.m10053a(C2976x.m10337i(c0Var.mo9608b(), "data")));
            c0Var.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$b */
    class C2796b implements C2750e0 {
        C2796b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            int e = C2976x.m10332e(c0Var.mo9608b(), "number");
            JSONObject b = C2976x.m10319b();
            C2976x.m10314a(b, "uuids", C2916s0.m10058a(e));
            c0Var.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$c */
    class C2797c implements C2750e0 {

        /* renamed from: com.adcolony.sdk.i$c$a */
        class C2798a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f11433a;

            /* renamed from: b */
            final /* synthetic */ C2714c0 f11434b;

            C2798a(Context context, C2714c0 c0Var) {
                this.f11433a = context;
                this.f11434b = c0Var;
            }

            public void run() {
                C2794i.this.mo9707a(this.f11433a, this.f11434b);
            }
        }

        C2797c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            Context b = C2684a.m9407b();
            if (b != null) {
                try {
                    C2916s0.f11754b.execute(new C2798a(b, c0Var));
                } catch (RejectedExecutionException e) {
                    C2978z.C2979a aVar = new C2978z.C2979a();
                    aVar.mo10088a("ADCController.configure queryAdvertisingId failed with error: " + e.toString()).mo10090a(C2978z.f11950j);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$d */
    class C2799d implements C2750e0 {
        C2799d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2846m0 a = C2794i.this.mo9728o().mo9551a();
            C2794i.this.mo9723j().mo9848b(C2976x.m10337i(c0Var.mo9608b(), MediationMetaData.KEY_VERSION));
            if (a != null) {
                a.mo9826e(C2794i.this.mo9723j().mo9857j());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$e */
    class C2800e implements C2750e0 {
        C2800e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            JSONObject unused = C2794i.this.f11400S = C2976x.m10335g(c0Var.mo9608b(), "signals");
        }
    }

    /* renamed from: com.adcolony.sdk.i$f */
    class C2801f implements C2750e0 {

        /* renamed from: com.adcolony.sdk.i$f$a */
        class C2802a implements ADCFunction.Consumer<C2838l.C2840b> {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11439a;

            C2802a(C2714c0 c0Var) {
                this.f11439a = c0Var;
            }

            /* renamed from: a */
            public void accept(C2838l.C2840b bVar) {
                JSONObject b = C2976x.m10319b();
                if (bVar != null) {
                    C2976x.m10315a(b, "odt", bVar.mo9802c());
                }
                this.f11439a.mo9607a(b).mo9612d();
            }
        }

        C2801f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2794i.this.mo9695F()) {
                C2823i0.m9743d().mo9762a((ADCFunction.Consumer<C2838l.C2840b>) new C2802a(c0Var), C2794i.this.mo9717e());
                return;
            }
            C2838l.C2840b c = C2823i0.m9743d().mo9767c();
            JSONObject b = C2976x.m10319b();
            if (c != null) {
                C2976x.m10315a(b, "odt", c.mo9802c());
            }
            c0Var.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$g */
    class C2803g implements C2750e0 {
        C2803g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2823i0.m9743d().mo9760a();
        }
    }

    /* renamed from: com.adcolony.sdk.i$h */
    class C2804h implements Runnable {
        C2804h() {
        }

        public void run() {
            Context b = C2684a.m9407b();
            if (!C2794i.this.f11394M && b != null) {
                try {
                    Omid.activate(b.getApplicationContext());
                    boolean unused = C2794i.this.f11394M = true;
                } catch (IllegalArgumentException unused2) {
                    new C2978z.C2979a().mo10088a("IllegalArgumentException when activating Omid").mo10090a(C2978z.f11950j);
                    boolean unused3 = C2794i.this.f11394M = false;
                }
            }
            if (C2794i.this.f11394M && C2794i.this.f11399R == null) {
                try {
                    Partner unused4 = C2794i.this.f11399R = Partner.createPartner("AdColony", "4.5.0");
                } catch (IllegalArgumentException unused5) {
                    new C2978z.C2979a().mo10088a("IllegalArgumentException when creating Omid Partner").mo10090a(C2978z.f11950j);
                    boolean unused6 = C2794i.this.f11394M = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$i */
    class C2805i implements Runnable {
        C2805i() {
        }

        public void run() {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "url", C2794i.f11380Y);
            C2976x.m10313a(b, "content_type", "application/json");
            C2976x.m10313a(b, "content", C2916s0.m10059a(C2794i.this.mo9723j().mo9843a((long) SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS)).toString());
            C2794i.this.f11406c.mo9922a(new C2864p(new C2714c0("WebServices.post", 0, b), C2794i.this));
        }
    }

    /* renamed from: com.adcolony.sdk.i$j */
    class C2806j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11444a;

        /* renamed from: b */
        final /* synthetic */ boolean f11445b;

        /* renamed from: c */
        final /* synthetic */ C2714c0 f11446c;

        C2806j(Context context, boolean z, C2714c0 c0Var) {
            this.f11444a = context;
            this.f11445b = z;
            this.f11446c = c0Var;
        }

        public void run() {
            C2951u0 u0Var = new C2951u0(this.f11444a.getApplicationContext(), C2794i.this.f11405b.mo9652d(), this.f11445b);
            u0Var.mo10031a(true, this.f11446c);
            C2794i.this.f11425v.put(Integer.valueOf(u0Var.mo9663d()), u0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$k */
    class C2807k implements C2912s.C2915c {
        C2807k() {
        }

        /* renamed from: a */
        public void mo9745a() {
            C2823i0.m9743d().mo9768e();
        }
    }

    /* renamed from: com.adcolony.sdk.i$l */
    class C2808l implements Runnable {

        /* renamed from: com.adcolony.sdk.i$l$a */
        class C2809a implements Runnable {
            C2809a() {
            }

            public void run() {
                if (C2684a.m9409c().mo9736w().mo9891e()) {
                    C2794i.this.m9624I();
                }
            }
        }

        C2808l() {
        }

        public void run() {
            new Handler().postDelayed(new C2809a(), (long) (C2794i.this.f11396O * 1000));
        }
    }

    /* renamed from: com.adcolony.sdk.i$m */
    class C2810m implements Runnable {
        C2810m() {
        }

        public void run() {
            boolean unused = C2794i.this.m9625J();
        }
    }

    /* renamed from: com.adcolony.sdk.i$n */
    class C2811n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2951u0 f11452a;

        C2811n(C2951u0 u0Var) {
            this.f11452a = u0Var;
        }

        public void run() {
            C2951u0 u0Var = this.f11452a;
            if (u0Var != null && u0Var.mo10053y()) {
                this.f11452a.loadUrl("about:blank");
                this.f11452a.clearCache(true);
                this.f11452a.removeAllViews();
                this.f11452a.mo10030a(true);
                this.f11452a.destroy();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$o */
    class C2812o implements ADCFunction.Consumer<C2788h0> {
        C2812o() {
        }

        /* renamed from: a */
        public void accept(C2788h0 h0Var) {
            C2823i0.m9743d().mo9764a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$p */
    class C2813p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2714c0 f11455a;

        C2813p(C2714c0 c0Var) {
            this.f11455a = c0Var;
        }

        public void run() {
            C2794i.this.f11419p.onReward(new AdColonyReward(this.f11455a));
        }
    }

    /* renamed from: com.adcolony.sdk.i$q */
    class C2814q implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Set<Integer> f11457a = new HashSet();

        C2814q() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C2794i.this.f11407d.mo9891e()) {
                C2794i.this.f11407d.mo9887c(true);
            }
            C2684a.m9403a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C2684a.f10586d = false;
            C2794i.this.f11407d.mo9888d(false);
            C2794i.this.f11407d.mo9890e(true);
        }

        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f11457a.add(Integer.valueOf(activity.hashCode()));
            C2684a.f10586d = true;
            C2684a.m9403a(activity);
            C2846m0 a = C2794i.this.mo9728o().mo9551a();
            Context b = C2684a.m9407b();
            if (b == null || !C2794i.this.f11407d.mo9889d() || !(b instanceof C2688b) || ((C2688b) b).f10602e) {
                C2684a.m9403a(activity);
                if (C2794i.this.f11422s != null) {
                    C2794i.this.f11422s.mo9607a(C2794i.this.f11422s.mo9608b()).mo9612d();
                    C2714c0 unused = C2794i.this.f11422s = null;
                }
                boolean unused2 = C2794i.this.f11384C = false;
                C2794i.this.f11407d.mo9888d(true);
                C2794i.this.f11407d.mo9890e(true);
                C2794i.this.f11407d.mo9893g(false);
                if (C2794i.this.f11387F && !C2794i.this.f11407d.mo9891e()) {
                    C2794i.this.f11407d.mo9887c(true);
                }
                C2794i.this.f11409f.mo9899c();
                if (a == null || (scheduledExecutorService = a.f11544b) == null || scheduledExecutorService.isShutdown() || a.f11544b.isTerminated()) {
                    AdColony.m9326a((Context) activity, C2684a.m9409c().f11421r);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C2794i.this.f11407d.mo9892f(true);
        }

        public void onActivityStopped(Activity activity) {
            this.f11457a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f11457a.isEmpty()) {
                C2794i.this.f11407d.mo9892f(false);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$r */
    class C2815r implements C2750e0 {
        C2815r() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2794i.this.m9647c(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$s */
    class C2816s implements C2750e0 {
        C2816s() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2794i.this.m9631a(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$t */
    class C2817t implements C2750e0 {
        C2817t() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2846m0 a = C2794i.this.mo9728o().mo9551a();
            boolean unused = C2794i.this.f11386E = true;
            if (C2794i.this.f11392K) {
                JSONObject b = C2976x.m10319b();
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10313a(b2, "app_version", C2916s0.m10075c());
                C2976x.m10315a(b, "app_bundle_info", b2);
                new C2714c0("AdColony.on_update", 1, b).mo9612d();
                boolean unused2 = C2794i.this.f11392K = false;
            }
            if (C2794i.this.f11393L) {
                new C2714c0("AdColony.on_install", 1).mo9612d();
            }
            if (a != null) {
                a.mo9827f(C2976x.m10337i(c0Var.mo9608b(), "app_session_id"));
            }
            if (AdColonyEventTracker.m9364a()) {
                AdColonyEventTracker.m9366b();
            }
            int a2 = C2976x.m10299a(c0Var.mo9608b(), "concurrent_requests", 4);
            if (a2 != C2794i.this.f11406c.mo9920a()) {
                C2794i.this.f11406c.mo9921a(a2);
            }
            C2794i.this.m9626K();
        }
    }

    /* renamed from: com.adcolony.sdk.i$u */
    class C2818u implements C2750e0 {
        C2818u() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2794i.this.m9641b(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$v */
    class C2819v implements C2750e0 {
        C2819v() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2794i.this.m9654e(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$w */
    class C2820w implements C2750e0 {
        C2820w() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2794i.this.m9657f(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$x */
    class C2821x implements C2750e0 {
        C2821x() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2794i.this.m9639a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.i$y */
    class C2822y implements C2750e0 {
        C2822y() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "sha1", C2916s0.m10072b(C2976x.m10337i(c0Var.mo9608b(), "data")));
            c0Var.mo9607a(b).mo9612d();
        }
    }

    C2794i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m9624I() {
        new Thread(new C2805i()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public boolean m9625J() {
        this.f11405b.mo9645a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m9626K() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, SessionDescription.ATTR_TYPE, "AdColony.on_configuration_completed");
        JSONArray jSONArray = new JSONArray();
        for (String put : mo9691B().keySet()) {
            jSONArray.put(put);
        }
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10314a(b2, "zone_ids", jSONArray);
        C2976x.m10315a(b, "message", b2);
        new C2714c0("CustomMessage.controller_send", 0, b).mo9612d();
    }

    /* renamed from: L */
    private void m9627L() {
        Application application;
        Context b = C2684a.m9407b();
        if (b != null && this.f11398Q == null && Build.VERSION.SDK_INT > 14) {
            this.f11398Q = new C2814q();
            if (b instanceof Application) {
                application = (Application) b;
            } else {
                application = ((Activity) b).getApplication();
            }
            application.registerActivityLifecycleCallbacks(this.f11398Q);
        }
    }

    /* renamed from: M */
    private void m9628M() {
        if (C2684a.m9409c().mo9736w().mo9891e()) {
            int i = this.f11395N + 1;
            this.f11395N = i;
            this.f11396O = Math.min(this.f11396O * i, 120);
            C2916s0.m10063a((Runnable) new C2808l());
            return;
        }
        new C2978z.C2979a().mo10088a("Max launch server download attempts hit, or AdColony is no longer").mo10088a(" active.").mo10090a(C2978z.f11948h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public HashMap<Integer, C2951u0> mo9690A() {
        return this.f11425v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public HashMap<String, AdColonyZone> mo9691B() {
        return this.f11424u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo9692C() {
        return this.f11421r != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo9693D() {
        return this.f11384C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo9694E() {
        return this.f11385D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo9695F() {
        return this.f11403V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo9696G() {
        return this.f11386E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo9697H() {
        return this.f11383B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo9731r() {
        return this.f11426w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Partner mo9732s() {
        return this.f11399R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public AdColonyAppOptions mo9733t() {
        if (this.f11421r == null) {
            this.f11421r = new AdColonyAppOptions();
        }
        return this.f11421r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo9734u() {
        return f11381Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public AdColonyRewardListener mo9735v() {
        return this.f11419p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C2855n0 mo9736w() {
        if (this.f11407d == null) {
            C2855n0 n0Var = new C2855n0();
            this.f11407d = n0Var;
            n0Var.mo9886c();
        }
        return this.f11407d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public long mo9737x() {
        return this.f11401T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C2863o0 mo9738y() {
        if (this.f11412i == null) {
            C2863o0 o0Var = new C2863o0();
            this.f11412i = o0Var;
            o0Var.mo9909e();
        }
        return this.f11412i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C2871q0 mo9739z() {
        if (this.f11411h == null) {
            C2871q0 q0Var = new C2871q0();
            this.f11411h = q0Var;
            q0Var.mo9925a();
        }
        return this.f11411h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AdColonyAdView mo9720g() {
        return this.f11417n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2701c mo9721h() {
        return this.f11416m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public HashMap<String, AdColonyCustomMessageListener> mo9722i() {
        return this.f11420q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2849n mo9723j() {
        if (this.f11414k == null) {
            C2849n nVar = new C2849n();
            this.f11414k = nVar;
            nVar.mo9838I();
        }
        return this.f11414k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C2857o mo9724k() {
        if (this.f11409f == null) {
            this.f11409f = new C2857o();
        }
        return this.f11409f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2867q mo9725l() {
        if (this.f11406c == null) {
            this.f11406c = new C2867q();
        }
        return this.f11406c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C2932u mo9726m() {
        if (this.f11410g == null) {
            C2932u uVar = new C2932u();
            this.f11410g = uVar;
            uVar.mo10014b();
        }
        return this.f11410g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public JSONObject mo9727n() {
        return this.f11423t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2690b0 mo9728o() {
        if (this.f11413j == null) {
            C2690b0 b0Var = new C2690b0();
            this.f11413j = b0Var;
            b0Var.mo9557b();
        }
        return this.f11413j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C2746d0 mo9729p() {
        if (this.f11405b == null) {
            C2746d0 d0Var = new C2746d0();
            this.f11405b = d0Var;
            d0Var.mo9645a();
        }
        return this.f11405b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C2786g0 mo9730q() {
        if (this.f11415l == null) {
            this.f11415l = new C2786g0();
        }
        return this.f11415l;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m9654e(C2714c0 c0Var) {
        if (this.f11419p == null) {
            return false;
        }
        C2916s0.m10063a((Runnable) new C2813p(c0Var));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9657f(C2714c0 c0Var) {
        AdColonyZone adColonyZone;
        if (!this.f11385D) {
            String i = C2976x.m10337i(c0Var.mo9608b(), "zone_id");
            if (this.f11424u.containsKey(i)) {
                adColonyZone = this.f11424u.get(i);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(i);
                this.f11424u.put(i, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo9519a(c0Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m9647c(C2714c0 c0Var) {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        try {
            int e = c0Var.mo9608b().has(TtmlNode.ATTR_ID) ? C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID) : 0;
            if (e <= 0) {
                e = this.f11405b.mo9652d();
            }
            mo9706a(e);
            C2916s0.m10063a((Runnable) new C2806j(b, C2976x.m10329c(c0Var.mo9608b(), "is_display_module"), c0Var));
            return true;
        } catch (RuntimeException e2) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a(e2.toString() + ": during WebView initialization.").mo10088a(" Disabling AdColony.").mo10090a(C2978z.f11949i);
            AdColony.disable();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9711b(boolean z) {
        this.f11385D = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9714d() {
        return this.f11382A;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9641b(C2714c0 c0Var) {
        JSONObject b = this.f11421r.mo9413b();
        C2976x.m10313a(b, "app_id", this.f11421r.mo9412a());
        C2976x.m10314a(b, "zone_ids", this.f11421r.mo9416d());
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10315a(b2, "options", b);
        c0Var.mo9607a(b2).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9715d(C2714c0 c0Var) {
        this.f11422s = c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9718e(boolean z) {
        this.f11383B = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9716d(boolean z) {
        this.f11387F = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo9717e() {
        return this.f11402U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Context mo9698a() {
        return C2684a.m9407b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9701a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            r4 = this;
            r4.f11385D = r6
            r4.f11421r = r5
            com.adcolony.sdk.d0 r0 = new com.adcolony.sdk.d0
            r0.<init>()
            r4.f11405b = r0
            com.adcolony.sdk.j r0 = new com.adcolony.sdk.j
            r0.<init>()
            r4.f11404a = r0
            com.adcolony.sdk.n r0 = new com.adcolony.sdk.n
            r0.<init>()
            r4.f11414k = r0
            r0.mo9838I()
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r4.f11406c = r0
            r0.mo9924b()
            com.adcolony.sdk.n0 r0 = new com.adcolony.sdk.n0
            r0.<init>()
            r4.f11407d = r0
            r0.mo9886c()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r4.f11408e = r0
            r0.mo9626e()
            com.adcolony.sdk.o r0 = new com.adcolony.sdk.o
            r0.<init>()
            r4.f11409f = r0
            com.adcolony.sdk.u r0 = new com.adcolony.sdk.u
            r0.<init>()
            r4.f11410g = r0
            r0.mo10014b()
            com.adcolony.sdk.b0 r0 = new com.adcolony.sdk.b0
            r0.<init>()
            r4.f11413j = r0
            r0.mo9557b()
            com.adcolony.sdk.o0 r0 = new com.adcolony.sdk.o0
            r0.<init>()
            r4.f11412i = r0
            r0.mo9909e()
            com.adcolony.sdk.q0 r0 = new com.adcolony.sdk.q0
            r0.<init>()
            r4.f11411h = r0
            r0.mo9925a()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r4.f11415l = r0
            java.lang.String r0 = r0.mo9664a()
            r4.f11426w = r0
            android.content.Context r0 = com.adcolony.sdk.C2684a.m9407b()
            com.adcolony.sdk.AdColony.m9326a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r5)
            r5 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0131
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.o0 r2 = r4.f11412i
            java.lang.String r2 = r2.mo9905a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f11389H = r6
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.o0 r3 = r4.f11412i
            java.lang.String r3 = r3.mo9905a()
            r1.append(r3)
            java.lang.String r3 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f11390I = r6
            boolean r1 = r4.f11389H
            if (r1 == 0) goto L_0x00f8
            if (r6 == 0) goto L_0x00f8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.o0 r1 = r4.f11412i
            java.lang.String r1 = r1.mo9905a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            org.json.JSONObject r6 = com.adcolony.sdk.C2976x.m10328c(r6)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r6 = com.adcolony.sdk.C2976x.m10337i(r6, r1)
            com.adcolony.sdk.n r1 = r4.f11414k
            java.lang.String r1 = r1.mo9833D()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x00f8
            r6 = 1
            goto L_0x00f9
        L_0x00f8:
            r6 = 0
        L_0x00f9:
            r4.f11388G = r6
            com.adcolony.sdk.s r6 = com.adcolony.sdk.C2912s.m10038b()
            com.adcolony.sdk.i$k r1 = new com.adcolony.sdk.i$k
            r1.<init>()
            r6.mo9972a((com.adcolony.sdk.C2912s.C2915c) r1)
            boolean r6 = r4.f11389H
            if (r6 == 0) goto L_0x0129
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.o0 r1 = r4.f11412i
            java.lang.String r1 = r1.mo9905a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            org.json.JSONObject r6 = com.adcolony.sdk.C2976x.m10328c(r6)
            r4.f11423t = r6
            r4.m9643b((org.json.JSONObject) r6)
        L_0x0129:
            boolean r6 = r4.f11388G
            r4.m9638a((boolean) r6)
            r4.m9627L()
        L_0x0131:
            com.adcolony.sdk.i$r r6 = new com.adcolony.sdk.i$r
            r6.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$s r6 = new com.adcolony.sdk.i$s
            r6.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$t r6 = new com.adcolony.sdk.i$t
            r6.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$u r6 = new com.adcolony.sdk.i$u
            r6.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$v r6 = new com.adcolony.sdk.i$v
            r6.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$w r6 = new com.adcolony.sdk.i$w
            r6.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$x r6 = new com.adcolony.sdk.i$x
            r6.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$y r6 = new com.adcolony.sdk.i$y
            r6.<init>()
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$a r6 = new com.adcolony.sdk.i$a
            r6.<init>()
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$b r6 = new com.adcolony.sdk.i$b
            r6.<init>()
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$c r6 = new com.adcolony.sdk.i$c
            r6.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$d r6 = new com.adcolony.sdk.i$d
            r6.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$e r6 = new com.adcolony.sdk.i$e
            r6.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$f r6 = new com.adcolony.sdk.i$f
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.i$g r6 = new com.adcolony.sdk.i$g
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.C2684a.m9405a((java.lang.String) r1, (com.adcolony.sdk.C2750e0) r6)
            com.adcolony.sdk.o0 r6 = r4.f11412i
            int r6 = com.adcolony.sdk.C2916s0.m10052a((com.adcolony.sdk.C2863o0) r6)
            if (r6 != r0) goto L_0x01d1
            r1 = 1
            goto L_0x01d2
        L_0x01d1:
            r1 = 0
        L_0x01d2:
            r4.f11392K = r1
            r1 = 2
            if (r6 != r1) goto L_0x01d8
            r5 = 1
        L_0x01d8:
            r4.f11393L = r5
            com.adcolony.sdk.i$h r5 = new com.adcolony.sdk.i$h
            r5.<init>()
            com.adcolony.sdk.C2916s0.m10063a((java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2794i.mo9701a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AdColonyInterstitial mo9719f() {
        return this.f11418o;
    }

    /* renamed from: b */
    private void m9643b(JSONObject jSONObject) {
        if (!C2951u0.f11859O) {
            JSONObject g = C2976x.m10335g(jSONObject, "logging");
            C2690b0.f10618n = C2976x.m10299a(g, "send_level", 1);
            C2690b0.f10609e = C2976x.m10329c(g, "log_private");
            C2690b0.f10617m = C2976x.m10299a(g, "print_level", 3);
            this.f11413j.mo9559b(C2976x.m10318b(g, "modules"));
        }
        JSONObject g2 = C2976x.m10335g(jSONObject, TtmlNode.TAG_METADATA);
        mo9723j().mo9845a(g2);
        mo9736w().mo9882a(C2976x.m10332e(g2, "session_timeout"));
        this.f11382A = C2976x.m10337i(C2976x.m10335g(jSONObject, "controller"), MediationMetaData.KEY_VERSION);
        this.f11401T = C2976x.m10300a(g2, "signals_timeout", this.f11401T);
        this.f11402U = C2976x.m10300a(g2, "calculate_odt_timeout", this.f11402U);
        this.f11403V = C2976x.m10316a(g2, "async_odt_query", this.f11403V);
        C2912s.m10038b().mo9974a(g2.optJSONObject("odt_config"), (ADCFunction.Consumer<C2788h0>) new C2812o());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        new java.io.File(r3.f11412i.mo9905a() + f11378W).delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9649c(org.json.JSONObject r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            org.json.JSONObject r1 = com.adcolony.sdk.C2976x.m10335g(r4, r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C2976x.m10337i(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r3.f11427x = r2     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C2976x.m10337i(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r3.f11428y = r1     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C2976x.m10337i(r4, r1)     // Catch:{ Exception -> 0x0037 }
            r3.f11429z = r1     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "pie"
            java.lang.String r1 = com.adcolony.sdk.C2976x.m10337i(r4, r1)     // Catch:{ Exception -> 0x0037 }
            f11381Z = r1     // Catch:{ Exception -> 0x0037 }
            boolean r1 = com.adcolony.sdk.AdColonyEventTracker.m9364a()     // Catch:{ Exception -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            com.adcolony.sdk.AdColonyEventTracker.m9366b()     // Catch:{ Exception -> 0x0037 }
        L_0x0033:
            r3.m9643b((org.json.JSONObject) r4)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0058
        L_0x0037:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0057 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            com.adcolony.sdk.o0 r2 = r3.f11412i     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = r2.mo9905a()     // Catch:{ Exception -> 0x0057 }
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0057 }
            r4.delete()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            java.lang.String r4 = r3.f11429z
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x009f
            boolean r4 = com.adcolony.sdk.C2951u0.f11859O
            if (r4 != 0) goto L_0x009f
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            r1.<init>()     // Catch:{ Exception -> 0x0085 }
            com.adcolony.sdk.o0 r2 = r3.f11412i     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.mo9905a()     // Catch:{ Exception -> 0x0085 }
            r1.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0085 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0085 }
            r4.delete()     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            com.adcolony.sdk.z$a r4 = new com.adcolony.sdk.z$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.z$a r4 = r4.mo10088a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.z$a r4 = r4.mo10088a((java.lang.String) r1)
            com.adcolony.sdk.z r1 = com.adcolony.sdk.C2978z.f11948h
            r4.mo10090a((com.adcolony.sdk.C2978z) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x009f:
            java.lang.String r4 = r3.f11427x
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b1
            java.lang.String r4 = r3.f11429z
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00cc
        L_0x00b1:
            boolean r4 = com.adcolony.sdk.C2951u0.f11859O
            if (r4 != 0) goto L_0x00cc
            com.adcolony.sdk.z$a r4 = new com.adcolony.sdk.z$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.z$a r4 = r4.mo10088a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.z$a r4 = r4.mo10088a((java.lang.String) r1)
            com.adcolony.sdk.z r1 = com.adcolony.sdk.C2978z.f11950j
            r4.mo10090a((com.adcolony.sdk.C2978z) r1)
            return r0
        L_0x00cc:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2794i.m9649c(org.json.JSONObject):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9709b(AdColonyAppOptions adColonyAppOptions) {
        this.f11421r = adColonyAppOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2715d mo9708b() {
        if (this.f11408e == null) {
            C2715d dVar = new C2715d();
            this.f11408e = dVar;
            dVar.mo9626e();
        }
        return this.f11408e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9710b(String str) {
        this.f11426w = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9713c(boolean z) {
        this.f11384C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo9712c() {
        return this.f11400S;
    }

    /* renamed from: a */
    private boolean m9638a(boolean z) {
        return m9639a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9639a(boolean z, boolean z2) {
        if (!C2684a.m9410d()) {
            return false;
        }
        this.f11391J = z2;
        this.f11388G = z;
        if (z && !z2 && !m9625J()) {
            return false;
        }
        m9624I();
        return true;
    }

    /* renamed from: a */
    private boolean m9637a(JSONObject jSONObject) {
        if (!this.f11388G) {
            return true;
        }
        JSONObject jSONObject2 = this.f11423t;
        if (jSONObject2 != null && C2976x.m10337i(C2976x.m10335g(jSONObject2, "controller"), "sha1").equals(C2976x.m10337i(C2976x.m10335g(jSONObject, "controller"), "sha1"))) {
            return false;
        }
        new C2978z.C2979a().mo10088a("Controller sha1 does not match, downloading new controller.").mo10090a(C2978z.f11948h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9631a(C2714c0 c0Var) {
        mo9706a(C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID));
    }

    /* renamed from: a */
    public void mo9705a(C2864p pVar, C2714c0 c0Var, Map<String, List<String>> map) {
        if (pVar.f11627n.equals(f11380Y)) {
            if (pVar.f11629p) {
                JSONObject a = C2976x.m10305a(pVar.f11628o, "Parsing launch response");
                C2976x.m10313a(a, "sdkVersion", mo9723j().mo9833D());
                C2976x.m10338j(a, this.f11412i.mo9905a() + f11378W);
                if (m9649c(a)) {
                    if (m9637a(a)) {
                        JSONObject b = C2976x.m10319b();
                        C2976x.m10313a(b, "url", this.f11427x);
                        C2976x.m10313a(b, "filepath", this.f11412i.mo9905a() + f11379X);
                        this.f11406c.mo9922a(new C2864p(new C2714c0("WebServices.download", 0, b), this));
                    }
                    this.f11423t = a;
                } else if (!this.f11388G) {
                    new C2978z.C2979a().mo10088a("Incomplete or disabled launch server response. ").mo10088a("Disabling AdColony until next launch.").mo10090a(C2978z.f11949i);
                    mo9711b(true);
                }
            } else {
                m9628M();
            }
        } else if (!pVar.f11627n.equals(this.f11427x)) {
        } else {
            if (!m9636a(this.f11428y) && !C2951u0.f11859O) {
                new C2978z.C2979a().mo10088a("Downloaded controller sha1 does not match, retrying.").mo10090a(C2978z.f11947g);
                m9628M();
            } else if (!this.f11388G && !this.f11391J) {
                C2916s0.m10063a((Runnable) new C2810m());
            }
        }
    }

    /* renamed from: a */
    private boolean m9636a(String str) {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        File file = new File(b.getFilesDir().getAbsolutePath() + "/adc3/" + f11379X);
        if (file.exists()) {
            return C2916s0.m10065a(str, file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9707a(Context context, C2714c0 c0Var) {
        boolean z;
        if (context == null) {
            return false;
        }
        String str = "";
        AdvertisingIdClient.Info info = null;
        C2846m0 a = mo9728o().mo9551a();
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (NoClassDefFoundError unused) {
            new C2978z.C2979a().mo10088a("Google Play Services ads dependencies are missing. Collecting ").mo10088a("Android ID instead of Advertising ID.").mo10090a(C2978z.f11947g);
            return false;
        } catch (NoSuchMethodError unused2) {
            new C2978z.C2979a().mo10088a("Google Play Services is out of date, please update to GPS 4.0+. ").mo10088a("Collecting Android ID instead of Advertising ID.").mo10090a(C2978z.f11947g);
        } catch (Exception e) {
            e.printStackTrace();
            if (!Build.MANUFACTURER.equals("Amazon")) {
                new C2978z.C2979a().mo10088a("Advertising ID is not available. Collecting Android ID instead of").mo10088a(" Advertising ID.").mo10090a(C2978z.f11947g);
                return false;
            }
            str = mo9723j().mo9850c();
            z = mo9723j().mo9851d();
        }
        z = false;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && info == null) {
            return false;
        }
        if (!str2.equals("Amazon")) {
            str = info.getId();
            z = info.isLimitAdTrackingEnabled();
        }
        mo9723j().mo9844a(str);
        if (a != null) {
            a.f11547e.put("advertisingId", mo9723j().mo9847b());
        }
        mo9723j().mo9849b(z);
        mo9723j().mo9846a(true);
        if (c0Var != null) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "advertiser_id", mo9723j().mo9847b());
            C2976x.m10325b(b, "limit_ad_tracking", mo9723j().mo9869v());
            c0Var.mo9607a(b).mo9612d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9700a(AdColonyAppOptions adColonyAppOptions) {
        synchronized (this.f11408e.mo9613a()) {
            for (Map.Entry<String, AdColonyInterstitial> value : this.f11408e.mo9613a().entrySet()) {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) value.getValue();
                AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
                adColonyInterstitial.mo9463a(true);
                if (listener != null) {
                    listener.onExpiring(adColonyInterstitial);
                }
            }
            this.f11408e.mo9613a().clear();
        }
        this.f11386E = false;
        AdColony.m9326a(C2684a.m9407b(), adColonyAppOptions);
        mo9706a(1);
        this.f11424u.clear();
        this.f11421r = adColonyAppOptions;
        this.f11405b.mo9645a();
        m9639a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9706a(int i) {
        C2784f0 a = this.f11405b.mo9643a(i);
        C2951u0 remove = this.f11425v.remove(Integer.valueOf(i));
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (remove != null && remove.mo10054z()) {
            z = true;
        }
        C2811n nVar = new C2811n(remove);
        if (z) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            new Handler().postDelayed(nVar, 1000);
        } else {
            nVar.run();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9703a(AdColonyRewardListener adColonyRewardListener) {
        this.f11419p = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9704a(C2701c cVar) {
        this.f11416m = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9699a(AdColonyAdView adColonyAdView) {
        this.f11417n = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9702a(AdColonyInterstitial adColonyInterstitial) {
        this.f11418o = adColonyInterstitial;
    }
}
