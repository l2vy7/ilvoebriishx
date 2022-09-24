package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.p287a.C11516a;
import com.ironsource.sdk.p287a.C11520d;
import com.ironsource.sdk.p287a.C11521e;
import com.ironsource.sdk.p287a.C11522f;
import com.ironsource.sdk.p294g.C11702c;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p294g.C11709e;
import com.ironsource.sdk.p295h.C11711a;
import com.ironsource.sdk.p295h.C11712b;
import com.ironsource.sdk.p295h.C11716d;
import com.ironsource.sdk.p297j.C11727d;
import com.ironsource.sdk.p297j.C11728e;
import com.ironsource.sdk.p297j.p298a.C11722b;
import com.ironsource.sdk.p297j.p298a.C11723c;
import com.ironsource.sdk.p297j.p298a.C11724d;
import com.ironsource.sdk.p299k.C11732b;
import com.ironsource.sdk.service.C11746a;
import com.ironsource.sdk.service.C11752e;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
public class C11563g implements C11557e, C11593m {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Handler f51961g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public C11593m f51962a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f51963b = C11563g.class.getSimpleName();

    /* renamed from: c */
    private C11703d.C11705b f51964c = C11703d.C11705b.None;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CountDownTimer f51965d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11553b f51966e = new C11553b("NativeCommandExecutor");

    /* renamed from: f */
    private final C11553b f51967f = new C11553b("ControllerCommandsExecutor");

    /* renamed from: com.ironsource.sdk.controller.g$a */
    class C11564a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Context f51968b;

        /* renamed from: c */
        private /* synthetic */ C11555c f51969c;

        /* renamed from: d */
        private /* synthetic */ C11752e f51970d;

        /* renamed from: e */
        private /* synthetic */ C11588j f51971e;

        /* renamed from: com.ironsource.sdk.controller.g$a$a */
        class C11565a extends CountDownTimer {

            /* renamed from: com.ironsource.sdk.controller.g$a$a$a */
            class C11566a implements Runnable {
                C11566a() {
                }

                public final void run() {
                    C11563g.m51467e(C11563g.this, "controller html - download timeout");
                }
            }

            C11565a(long j, long j2) {
                super(200000, 1000);
            }

            public final void onFinish() {
                Logger.m51953i(C11563g.this.f51963b, "Global Controller Timer Finish");
                C11563g.this.m51472j();
                C11563g.f51961g.post(new C11566a());
            }

            public final void onTick(long j) {
                String d = C11563g.this.f51963b;
                Logger.m51953i(d, "Global Controller Timer Tick " + j);
            }
        }

        C11564a(Context context, C11555c cVar, C11752e eVar, C11588j jVar) {
            this.f51968b = context;
            this.f51969c = cVar;
            this.f51970d = eVar;
            this.f51971e = jVar;
        }

        public final void run() {
            try {
                C11563g gVar = C11563g.this;
                C11593m unused = gVar.f51962a = C11563g.m51465c(gVar, this.f51968b, this.f51969c, this.f51970d, this.f51971e);
                CountDownTimer unused2 = C11563g.this.f51965d = new C11565a(200000, 1000).start();
                C11618w wVar = (C11618w) C11563g.this.f51962a;
                C11558f fVar = wVar.f52128G;
                C11520d.m51360a(C11522f.f51820s, (Map<String, Object>) new C11516a().mo44598a("generalmessage", Integer.valueOf(fVar.f51941b)).f51793a);
                fVar.f51940a = System.currentTimeMillis();
                if (wVar.f52128G.mo44699d()) {
                    wVar.mo44782a(1);
                }
                C11563g.this.f51966e.mo44686a();
                C11563g.this.f51966e.mo44688b();
            } catch (Exception e) {
                C11563g.m51467e(C11563g.this, Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$b */
    class C11567b implements Runnable {
        C11567b() {
        }

        public final void run() {
            if (C11563g.this.f51962a != null) {
                C11563g.this.f51962a.destroy();
                C11593m unused = C11563g.this.f51962a = null;
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$c */
    class C11568c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51976b;

        C11568c(String str) {
            this.f51976b = str;
        }

        public final void run() {
            C11563g.m51467e(C11563g.this, this.f51976b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$d */
    class C11569d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51978b;

        C11569d(String str) {
            this.f51978b = str;
        }

        public final void run() {
            C11563g.this.m51472j();
            C11563g.m51467e(C11563g.this, this.f51978b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$e */
    class C11570e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51980b;

        /* renamed from: c */
        private /* synthetic */ String f51981c;

        /* renamed from: d */
        private /* synthetic */ Map f51982d;

        /* renamed from: e */
        private /* synthetic */ C11728e f51983e;

        C11570e(String str, String str2, Map map, C11728e eVar) {
            this.f51980b = str;
            this.f51981c = str2;
            this.f51982d = map;
            this.f51983e = eVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44712a(this.f51980b, this.f51981c, (Map<String, String>) this.f51982d, this.f51983e);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$f */
    class C11571f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Map f51985b;

        /* renamed from: c */
        private /* synthetic */ C11728e f51986c;

        C11571f(Map map, C11728e eVar) {
            this.f51985b = map;
            this.f51986c = eVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44713a((Map<String, String>) this.f51985b, this.f51986c);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$g */
    class C11572g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51988b;

        /* renamed from: c */
        private /* synthetic */ String f51989c;

        /* renamed from: d */
        private /* synthetic */ C11728e f51990d;

        C11572g(String str, String str2, C11728e eVar) {
            this.f51988b = str;
            this.f51989c = str2;
            this.f51990d = eVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44711a(this.f51988b, this.f51989c, this.f51990d);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$h */
    class C11573h implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51992b;

        /* renamed from: c */
        private /* synthetic */ String f51993c;

        /* renamed from: d */
        private /* synthetic */ C11702c f51994d;

        /* renamed from: e */
        private /* synthetic */ C11724d f51995e;

        C11573h(String str, String str2, C11702c cVar, C11724d dVar) {
            this.f51992b = str;
            this.f51993c = str2;
            this.f51994d = cVar;
            this.f51995e = dVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44710a(this.f51992b, this.f51993c, this.f51994d, this.f51995e);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$i */
    class C11574i implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f51997b;

        /* renamed from: c */
        private /* synthetic */ C11724d f51998c;

        C11574i(JSONObject jSONObject, C11724d dVar) {
            this.f51997b = jSONObject;
            this.f51998c = dVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44716a(this.f51997b, this.f51998c);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$j */
    class C11575j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52000b;

        /* renamed from: c */
        private /* synthetic */ String f52001c;

        /* renamed from: d */
        private /* synthetic */ C11702c f52002d;

        /* renamed from: e */
        private /* synthetic */ C11723c f52003e;

        C11575j(String str, String str2, C11702c cVar, C11723c cVar2) {
            this.f52000b = str;
            this.f52001c = str2;
            this.f52002d = cVar;
            this.f52003e = cVar2;
        }

        public final void run() {
            C11563g.this.f51962a.mo44709a(this.f52000b, this.f52001c, this.f52002d, this.f52003e);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$k */
    class C11576k implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52005b;

        /* renamed from: c */
        private /* synthetic */ C11723c f52006c;

        C11576k(String str, C11723c cVar) {
            this.f52005b = str;
            this.f52006c = cVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44707a(this.f52005b, this.f52006c);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$l */
    class C11577l implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11702c f52008b;

        /* renamed from: c */
        private /* synthetic */ Map f52009c;

        /* renamed from: d */
        private /* synthetic */ C11723c f52010d;

        C11577l(C11702c cVar, Map map, C11723c cVar2) {
            this.f52008b = cVar;
            this.f52009c = map;
            this.f52010d = cVar2;
        }

        public final void run() {
            C11516a a = new C11516a().mo44598a("demandsourcename", this.f52008b.f52386a).mo44598a("producttype", C11521e.m51361a(this.f52008b, C11703d.C11708e.Interstitial)).mo44598a("isbiddinginstance", Boolean.valueOf(C11521e.m51362a(this.f52008b)));
            C11746a aVar = C11746a.f52469a;
            C11520d.m51360a(C11522f.f51810i, (Map<String, Object>) a.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(this.f52008b.f52387b))).f51793a);
            C11563g.this.f51962a.mo44705a(this.f52008b, (Map<String, String>) this.f52009c, this.f52010d);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$m */
    class C11578m implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f52012b;

        /* renamed from: c */
        private /* synthetic */ C11723c f52013c;

        C11578m(JSONObject jSONObject, C11723c cVar) {
            this.f52012b = jSONObject;
            this.f52013c = cVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44715a(this.f52012b, this.f52013c);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$n */
    class C11579n implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11702c f52015b;

        /* renamed from: c */
        private /* synthetic */ Map f52016c;

        /* renamed from: d */
        private /* synthetic */ C11723c f52017d;

        C11579n(C11702c cVar, Map map, C11723c cVar2) {
            this.f52015b = cVar;
            this.f52016c = map;
            this.f52017d = cVar2;
        }

        public final void run() {
            C11563g.this.f51962a.mo44718b(this.f52015b, this.f52016c, this.f52017d);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$o */
    class C11580o implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52019b;

        /* renamed from: c */
        private /* synthetic */ String f52020c;

        /* renamed from: d */
        private /* synthetic */ C11702c f52021d;

        /* renamed from: e */
        private /* synthetic */ C11722b f52022e;

        C11580o(String str, String str2, C11702c cVar, C11722b bVar) {
            this.f52019b = str;
            this.f52020c = str2;
            this.f52021d = cVar;
            this.f52022e = bVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44708a(this.f52019b, this.f52020c, this.f52021d, this.f52022e);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$p */
    class C11581p implements Runnable {
        C11581p() {
        }

        public final void run() {
            C11563g.this.f51962a.mo44721d();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$q */
    class C11582q implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11702c f52025b;

        /* renamed from: c */
        private /* synthetic */ Map f52026c;

        /* renamed from: d */
        private /* synthetic */ C11722b f52027d;

        C11582q(C11702c cVar, Map map, C11722b bVar) {
            this.f52025b = cVar;
            this.f52026c = map;
            this.f52027d = bVar;
        }

        public final void run() {
            C11563g.this.f51962a.mo44704a(this.f52025b, (Map<String, String>) this.f52026c, this.f52027d);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$r */
    class C11583r implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f52029b;

        C11583r(JSONObject jSONObject) {
            this.f52029b = jSONObject;
        }

        public final void run() {
            C11563g.this.f51962a.mo44714a(this.f52029b);
        }
    }

    public C11563g(Context context, C11555c cVar, C11752e eVar, C11588j jVar) {
        f51961g.post(new C11564a(context, cVar, eVar, jVar));
    }

    /* renamed from: c */
    static /* synthetic */ C11618w m51465c(C11563g gVar, Context context, C11555c cVar, C11752e eVar, C11588j jVar) {
        C11520d.m51359a(C11522f.f51803b);
        C11618w wVar = new C11618w(context, jVar, cVar, gVar);
        C11712b bVar = new C11712b(context, C11732b.m51882a(wVar.f52127F), new C11711a(), new C11716d(C11732b.m51882a(wVar.f52127F).f52442b));
        wVar.f52137P = new C11615u(context, eVar);
        wVar.f52135N = new C11609q(context);
        wVar.f52136O = new C11611r(context);
        wVar.f52138Q = new C11589k(context);
        C11551a aVar = new C11551a(cVar);
        wVar.f52139R = aVar;
        if (wVar.f52141T == null) {
            wVar.f52141T = new C11618w.C11662p();
        }
        aVar.f51924a = wVar.f52141T;
        wVar.f52140S = new C11591l(C11732b.m51882a(wVar.f52127F).f52442b, bVar);
        return wVar;
    }

    /* renamed from: e */
    static /* synthetic */ void m51467e(C11563g gVar, String str) {
        C11520d.m51360a(C11522f.f51804c, (Map<String, Object>) new C11516a().mo44598a("callfailreason", str).f51793a);
        C11596p pVar = new C11596p(gVar);
        gVar.f51962a = pVar;
        pVar.f52058b = str;
        gVar.f51966e.mo44686a();
        gVar.f51966e.mo44688b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51472j() {
        C11593m mVar = this.f51962a;
        if (mVar != null && (mVar instanceof C11618w)) {
            mVar.destroy();
            this.f51962a = null;
        }
    }

    /* renamed from: k */
    private boolean m51473k() {
        return C11703d.C11705b.Ready.equals(this.f51964c);
    }

    /* renamed from: a */
    public final void mo44693a() {
        this.f51964c = C11703d.C11705b.Loaded;
    }

    /* renamed from: a */
    public final void mo44703a(Context context) {
        if (m51473k()) {
            this.f51962a.mo44703a(context);
        }
    }

    /* renamed from: a */
    public final void mo44704a(C11702c cVar, Map<String, String> map, C11722b bVar) {
        this.f51967f.mo44687a(new C11582q(cVar, map, bVar));
    }

    /* renamed from: a */
    public final void mo44705a(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        this.f51967f.mo44687a(new C11577l(cVar, map, cVar2));
    }

    /* renamed from: a */
    public final void mo44706a(Runnable runnable) {
        this.f51966e.mo44687a(runnable);
    }

    /* renamed from: a */
    public final void mo44694a(String str) {
        C11520d.m51360a(C11522f.f51813l, (Map<String, Object>) new C11516a().mo44598a("callfailreason", str).f51793a);
        C11727d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new C11709e(1001, str));
            IronSourceNetwork.setInitListener((C11727d) null);
        }
        CountDownTimer countDownTimer = this.f51965d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m51472j();
        f51961g.post(new C11568c(str));
    }

    /* renamed from: a */
    public final void mo44707a(String str, C11723c cVar) {
        this.f51967f.mo44687a(new C11576k(str, cVar));
    }

    /* renamed from: a */
    public final void mo44708a(String str, String str2, C11702c cVar, C11722b bVar) {
        this.f51967f.mo44687a(new C11580o(str, str2, cVar, bVar));
    }

    /* renamed from: a */
    public final void mo44709a(String str, String str2, C11702c cVar, C11723c cVar2) {
        this.f51967f.mo44687a(new C11575j(str, str2, cVar, cVar2));
    }

    /* renamed from: a */
    public final void mo44710a(String str, String str2, C11702c cVar, C11724d dVar) {
        this.f51967f.mo44687a(new C11573h(str, str2, cVar, dVar));
    }

    /* renamed from: a */
    public final void mo44711a(String str, String str2, C11728e eVar) {
        this.f51967f.mo44687a(new C11572g(str, str2, eVar));
    }

    /* renamed from: a */
    public final void mo44712a(String str, String str2, Map<String, String> map, C11728e eVar) {
        this.f51967f.mo44687a(new C11570e(str, str2, map, eVar));
    }

    /* renamed from: a */
    public final void mo44713a(Map<String, String> map, C11728e eVar) {
        this.f51967f.mo44687a(new C11571f(map, eVar));
    }

    /* renamed from: a */
    public final void mo44714a(JSONObject jSONObject) {
        this.f51967f.mo44687a(new C11583r(jSONObject));
    }

    /* renamed from: a */
    public final void mo44715a(JSONObject jSONObject, C11723c cVar) {
        this.f51967f.mo44687a(new C11578m(jSONObject, cVar));
    }

    /* renamed from: a */
    public final void mo44716a(JSONObject jSONObject, C11724d dVar) {
        this.f51967f.mo44687a(new C11574i(jSONObject, dVar));
    }

    /* renamed from: b */
    public final void mo44695b() {
        if (C11703d.C11706c.Web.equals(mo44719c())) {
            C11520d.m51359a(C11522f.f51805d);
            C11727d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((C11727d) null);
            }
        }
        this.f51964c = C11703d.C11705b.Ready;
        CountDownTimer countDownTimer = this.f51965d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f51967f.mo44686a();
        this.f51967f.mo44688b();
        this.f51962a.mo44725g();
    }

    /* renamed from: b */
    public final void mo44717b(Context context) {
        if (m51473k()) {
            this.f51962a.mo44717b(context);
        }
    }

    /* renamed from: b */
    public final void mo44718b(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        this.f51967f.mo44687a(new C11579n(cVar, map, cVar2));
    }

    /* renamed from: b */
    public final void mo44696b(String str) {
        C11520d.m51360a(C11522f.f51823v, (Map<String, Object>) new C11516a().mo44598a("generalmessage", str).f51793a);
        CountDownTimer countDownTimer = this.f51965d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        f51961g.post(new C11569d(str));
    }

    /* renamed from: c */
    public final C11703d.C11706c mo44719c() {
        return this.f51962a.mo44719c();
    }

    /* renamed from: c */
    public final boolean mo44720c(String str) {
        if (!m51473k()) {
            return false;
        }
        return this.f51962a.mo44720c(str);
    }

    /* renamed from: d */
    public final void mo44721d() {
        this.f51967f.mo44687a(new C11581p());
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f51965d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f51965d = null;
        f51961g.post(new C11567b());
    }

    /* renamed from: e */
    public final void mo44723e() {
        if (m51473k()) {
            this.f51962a.mo44723e();
        }
    }

    /* renamed from: f */
    public final void mo44724f() {
        if (m51473k()) {
            this.f51962a.mo44724f();
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo44725g() {
    }
}
