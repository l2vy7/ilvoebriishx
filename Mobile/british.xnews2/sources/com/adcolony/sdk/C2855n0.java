package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C2916s0;
import com.adcolony.sdk.C2978z;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.n0 */
class C2855n0 implements Runnable {

    /* renamed from: a */
    private final int f11572a = 17;

    /* renamed from: b */
    private final int f11573b = DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS;

    /* renamed from: c */
    private final int f11574c = 1000;

    /* renamed from: d */
    private long f11575d = 1800000;

    /* renamed from: e */
    private int f11576e;

    /* renamed from: f */
    private long f11577f;

    /* renamed from: g */
    private long f11578g;

    /* renamed from: h */
    private long f11579h;

    /* renamed from: i */
    private long f11580i;

    /* renamed from: j */
    private long f11581j;

    /* renamed from: k */
    private long f11582k;

    /* renamed from: l */
    private long f11583l;

    /* renamed from: m */
    private long f11584m;

    /* renamed from: n */
    private boolean f11585n = true;

    /* renamed from: o */
    private boolean f11586o;

    /* renamed from: p */
    private boolean f11587p = true;

    /* renamed from: q */
    private boolean f11588q = false;

    /* renamed from: r */
    private boolean f11589r = false;

    /* renamed from: s */
    private boolean f11590s;

    /* renamed from: t */
    private boolean f11591t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f11592u;

    /* renamed from: v */
    private boolean f11593v;

    /* renamed from: com.adcolony.sdk.n0$a */
    class C2856a implements C2750e0 {
        C2856a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2855n0.this.f11592u = true;
        }
    }

    C2855n0() {
    }

    /* renamed from: f */
    private void m9896f() {
        mo9883a(false);
    }

    /* renamed from: g */
    private void m9897g() {
        mo9885b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9885b(boolean z) {
        C2794i c = C2684a.m9409c();
        ArrayList<C2784f0> b = c.mo9729p().mo9649b();
        synchronized (b) {
            Iterator<C2784f0> it = b.iterator();
            while (it.hasNext()) {
                C2784f0 next = it.next();
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10325b(b2, "from_window_focus", z);
                if (this.f11589r && this.f11588q) {
                    C2976x.m10325b(b2, "app_in_foreground", true);
                    this.f11589r = false;
                }
                new C2714c0("SessionInfo.on_resume", next.mo9663d(), b2).mo9612d();
            }
        }
        c.mo9728o().mo9560c();
        this.f11587p = false;
    }

    /* renamed from: c */
    public void mo9886c() {
        C2684a.m9405a("SessionInfo.stopped", (C2750e0) new C2856a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9888d(boolean z) {
        this.f11585n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9890e(boolean z) {
        this.f11586o = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9894h() {
        C2846m0 a = C2684a.m9409c().mo9728o().mo9551a();
        this.f11590s = false;
        this.f11585n = false;
        if (a != null) {
            a.mo9821b();
        }
        JSONObject b = C2976x.m10319b();
        double d = (double) this.f11577f;
        Double.isNaN(d);
        C2976x.m10312a(b, "session_length", d / 1000.0d);
        new C2714c0("SessionInfo.on_stop", 1, b).mo9612d();
        C2684a.m9413g();
        AdColony.f10472a.shutdown();
    }

    public void run() {
        long j;
        while (true) {
            this.f11580i = System.currentTimeMillis();
            C2684a.m9413g();
            if (this.f11578g > this.f11575d) {
                break;
            }
            if (!this.f11585n) {
                if (this.f11586o && !this.f11587p) {
                    this.f11586o = false;
                    m9896f();
                }
                long j2 = this.f11578g;
                if (this.f11584m == 0) {
                    j = 0;
                } else {
                    j = System.currentTimeMillis() - this.f11584m;
                }
                this.f11578g = j2 + j;
                this.f11584m = System.currentTimeMillis();
            } else {
                if (this.f11586o && this.f11587p) {
                    this.f11586o = false;
                    m9897g();
                }
                this.f11578g = 0;
                this.f11584m = 0;
            }
            this.f11579h = 17;
            m9894a(17);
            long currentTimeMillis = System.currentTimeMillis() - this.f11580i;
            this.f11581j = currentTimeMillis;
            if (currentTimeMillis > 0 && currentTimeMillis < 6000) {
                this.f11577f += currentTimeMillis;
            }
            C2794i c = C2684a.m9409c();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - this.f11583l > 15000) {
                this.f11583l = currentTimeMillis2;
            }
            if (C2684a.m9410d() && currentTimeMillis2 - this.f11582k > 1000) {
                this.f11582k = currentTimeMillis2;
                String a = c.mo9730q().mo9664a();
                if (!a.equals(c.mo9731r())) {
                    c.mo9710b(a);
                    JSONObject b = C2976x.m10319b();
                    C2976x.m10313a(b, "network_type", c.mo9731r());
                    new C2714c0("Network.on_status_change", 1, b).mo9612d();
                }
            }
        }
        new C2978z.C2979a().mo10088a("AdColony session ending, releasing Context.").mo10090a(C2978z.f11945e);
        C2684a.m9409c().mo9713c(true);
        C2684a.m9403a((Context) null);
        this.f11591t = true;
        this.f11593v = true;
        mo9894h();
        C2916s0.C2918b bVar = new C2916s0.C2918b(10.0d);
        while (!this.f11592u && !bVar.mo9980a() && this.f11593v) {
            C2684a.m9413g();
            m9894a(100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9883a(boolean z) {
        ArrayList<C2784f0> b = C2684a.m9409c().mo9729p().mo9649b();
        synchronized (b) {
            Iterator<C2784f0> it = b.iterator();
            while (it.hasNext()) {
                C2784f0 next = it.next();
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10325b(b2, "from_window_focus", z);
                if (this.f11589r && !this.f11588q) {
                    C2976x.m10325b(b2, "app_in_foreground", false);
                    this.f11589r = false;
                }
                new C2714c0("SessionInfo.on_pause", next.mo9663d(), b2).mo9612d();
            }
        }
        this.f11587p = true;
        C2684a.m9413g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9887c(boolean z) {
        C2794i c = C2684a.m9409c();
        if (!this.f11590s) {
            if (this.f11591t) {
                c.mo9713c(false);
                this.f11591t = false;
            }
            this.f11576e = 0;
            this.f11577f = 0;
            this.f11578g = 0;
            this.f11590s = true;
            this.f11585n = true;
            this.f11592u = false;
            new Thread(this).start();
            if (z) {
                JSONObject b = C2976x.m10319b();
                C2976x.m10313a(b, TtmlNode.ATTR_ID, C2916s0.m10055a());
                new C2714c0("SessionInfo.on_start", 1, b).mo9612d();
                C2951u0 u0Var = (C2951u0) C2684a.m9409c().mo9729p().mo9651c().get(1);
                if (u0Var != null) {
                    u0Var.mo10026D();
                }
            }
            if (AdColony.f10472a.isShutdown()) {
                AdColony.f10472a = Executors.newSingleThreadExecutor();
            }
            c.mo9728o().mo9560c();
            C2912s.m10038b().mo9975c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9889d() {
        return this.f11585n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9891e() {
        return this.f11590s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9892f(boolean z) {
        if (this.f11588q != z) {
            this.f11588q = z;
            this.f11589r = true;
            if (!z) {
                m9896f();
            } else if (!this.f11587p) {
                this.f11587p = true;
                this.f11586o = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9893g(boolean z) {
        this.f11593v = z;
    }

    /* renamed from: a */
    private void m9894a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9884b() {
        this.f11576e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9882a(int i) {
        this.f11575d = i <= 0 ? this.f11575d : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9881a() {
        return this.f11576e;
    }
}
