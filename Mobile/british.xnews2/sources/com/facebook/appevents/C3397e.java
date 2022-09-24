package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.C3752u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3406g;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.facebook.internal.C3561x;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p176y0.C6396a;

/* renamed from: com.facebook.appevents.e */
/* compiled from: AppEventQueue */
class C3397e {

    /* renamed from: a */
    private static final String f12835a = "com.facebook.appevents.e";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C3396d f12836b = new C3396d();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ScheduledExecutorService f12837c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ScheduledFuture f12838d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Runnable f12839e = new C3398a();

    /* renamed from: com.facebook.appevents.e$a */
    /* compiled from: AppEventQueue */
    static class C3398a implements Runnable {
        C3398a() {
        }

        public void run() {
            ScheduledFuture unused = C3397e.f12838d = null;
            if (C3406g.m11395d() != C3406g.C3407a.EXPLICIT_ONLY) {
                C3397e.m11383k(C3417j.TIMER);
            }
        }
    }

    /* renamed from: com.facebook.appevents.e$b */
    /* compiled from: AppEventQueue */
    static class C3399b implements Runnable {
        C3399b() {
        }

        public void run() {
            C3404f.m11390b(C3397e.f12836b);
            C3396d unused = C3397e.f12836b = new C3396d();
        }
    }

    /* renamed from: com.facebook.appevents.e$c */
    /* compiled from: AppEventQueue */
    static class C3400c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3417j f12840b;

        C3400c(C3417j jVar) {
            this.f12840b = jVar;
        }

        public void run() {
            C3397e.m11383k(this.f12840b);
        }
    }

    /* renamed from: com.facebook.appevents.e$d */
    /* compiled from: AppEventQueue */
    static class C3401d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3387a f12841b;

        /* renamed from: c */
        final /* synthetic */ C3392c f12842c;

        C3401d(C3387a aVar, C3392c cVar) {
            this.f12841b = aVar;
            this.f12842c = cVar;
        }

        public void run() {
            C3397e.f12836b.mo11817a(this.f12841b, this.f12842c);
            if (C3406g.m11395d() != C3406g.C3407a.EXPLICIT_ONLY && C3397e.f12836b.mo11820d() > 100) {
                C3397e.m11383k(C3417j.EVENT_THRESHOLD);
            } else if (C3397e.f12838d == null) {
                ScheduledFuture unused = C3397e.f12838d = C3397e.f12837c.schedule(C3397e.f12839e, 15, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.facebook.appevents.e$e */
    /* compiled from: AppEventQueue */
    static class C3402e implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ C3387a f12843a;

        /* renamed from: b */
        final /* synthetic */ GraphRequest f12844b;

        /* renamed from: c */
        final /* synthetic */ C3424o f12845c;

        /* renamed from: d */
        final /* synthetic */ C3419l f12846d;

        C3402e(C3387a aVar, GraphRequest graphRequest, C3424o oVar, C3419l lVar) {
            this.f12843a = aVar;
            this.f12844b = graphRequest;
            this.f12845c = oVar;
            this.f12846d = lVar;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            C3397e.m11385m(this.f12843a, this.f12844b, rVar, this.f12845c, this.f12846d);
        }
    }

    /* renamed from: com.facebook.appevents.e$f */
    /* compiled from: AppEventQueue */
    static class C3403f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3387a f12847b;

        /* renamed from: c */
        final /* synthetic */ C3424o f12848c;

        C3403f(C3387a aVar, C3424o oVar) {
            this.f12847b = aVar;
            this.f12848c = oVar;
        }

        public void run() {
            C3404f.m11389a(this.f12847b, this.f12848c);
        }
    }

    /* renamed from: h */
    public static void m11380h(C3387a aVar, C3392c cVar) {
        f12837c.execute(new C3401d(aVar, cVar));
    }

    /* renamed from: i */
    private static GraphRequest m11381i(C3387a aVar, C3424o oVar, boolean z, C3419l lVar) {
        String b = aVar.mo11808b();
        boolean z2 = false;
        C3520m o = C3522n.m11809o(b, false);
        GraphRequest L = GraphRequest.m11254L((AccessToken) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (GraphRequest.C3360f) null);
        Bundle y = L.mo11258y();
        if (y == null) {
            y = new Bundle();
        }
        y.putString("access_token", aVar.mo11807a());
        String d = C3420m.m11432d();
        if (d != null) {
            y.putString("device_token", d);
        }
        String g = C3408h.m11407g();
        if (g != null) {
            y.putString("install_referrer", g);
        }
        L.mo11246a0(y);
        if (o != null) {
            z2 = o.mo12009n();
        }
        int e = oVar.mo11860e(L, C3642m.m12279e(), z2, z);
        if (e == 0) {
            return null;
        }
        lVar.f12877a += e;
        L.mo11243W(new C3402e(aVar, L, oVar, lVar));
        return L;
    }

    /* renamed from: j */
    public static void m11382j(C3417j jVar) {
        f12837c.execute(new C3400c(jVar));
    }

    /* renamed from: k */
    static void m11383k(C3417j jVar) {
        f12836b.mo11818b(C3404f.m11391c());
        try {
            C3419l o = m11387o(jVar, f12836b);
            if (o != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", o.f12877a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", o.f12878b);
                C6396a.m28074b(C3642m.m12279e()).mo24228d(intent);
            }
        } catch (Exception e) {
            Log.w(f12835a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    /* renamed from: l */
    public static Set<C3387a> m11384l() {
        return f12836b.mo11821f();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m11385m(C3387a aVar, GraphRequest graphRequest, C3655r rVar, C3424o oVar, C3419l lVar) {
        String str;
        String str2;
        FacebookRequestError g = rVar.mo12380g();
        C3418k kVar = C3418k.SUCCESS;
        boolean z = true;
        if (g == null) {
            str = "Success";
        } else if (g.mo11225d() == -1) {
            kVar = C3418k.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{rVar.toString(), g.toString()});
            kVar = C3418k.SERVER_ERROR;
        }
        if (C3642m.m12298x(C3752u.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) graphRequest.mo11240A()).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            C3561x.m11894h(C3752u.APP_EVENTS, f12835a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo11254t().toString(), str, str2);
        }
        if (g == null) {
            z = false;
        }
        oVar.mo11857b(z);
        C3418k kVar2 = C3418k.NO_CONNECTIVITY;
        if (kVar == kVar2) {
            C3642m.m12288n().execute(new C3403f(aVar, oVar));
        }
        if (kVar != C3418k.SUCCESS && lVar.f12878b != kVar2) {
            lVar.f12878b = kVar;
        }
    }

    /* renamed from: n */
    public static void m11386n() {
        f12837c.execute(new C3399b());
    }

    /* renamed from: o */
    private static C3419l m11387o(C3417j jVar, C3396d dVar) {
        C3419l lVar = new C3419l();
        boolean q = C3642m.m12291q(C3642m.m12279e());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (C3387a next : dVar.mo11821f()) {
            GraphRequest i = m11381i(next, dVar.mo11819c(next), q, lVar);
            if (i != null) {
                arrayList.add(i);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C3561x.m11894h(C3752u.APP_EVENTS, f12835a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f12877a), jVar.toString());
        for (GraphRequest g : arrayList) {
            g.mo11250g();
        }
        return lVar;
    }
}
