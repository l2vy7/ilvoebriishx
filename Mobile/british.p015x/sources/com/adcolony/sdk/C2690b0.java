package com.adcolony.sdk;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.b0 */
class C2690b0 {

    /* renamed from: e */
    static boolean f10609e = false;

    /* renamed from: f */
    private static final int f10610f = 4000;

    /* renamed from: g */
    private static final int f10611g = 4;

    /* renamed from: h */
    static final int f10612h = 3;

    /* renamed from: i */
    static final int f10613i = 2;

    /* renamed from: j */
    static final int f10614j = 1;

    /* renamed from: k */
    static final int f10615k = 0;

    /* renamed from: l */
    static final int f10616l = -1;

    /* renamed from: m */
    static int f10617m = 3;

    /* renamed from: n */
    static int f10618n = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public JSONObject f10619a = C2976x.m10319b();

    /* renamed from: b */
    private ExecutorService f10620b = null;

    /* renamed from: c */
    private final Queue<Runnable> f10621c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    C2846m0 f10622d;

    /* renamed from: com.adcolony.sdk.b0$a */
    class C2691a implements C2750e0 {
        C2691a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 0, C2976x.m10337i(c0Var.mo9608b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$b */
    class C2692b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10624a;

        /* renamed from: b */
        final /* synthetic */ String f10625b;

        /* renamed from: c */
        final /* synthetic */ int f10626c;

        /* renamed from: d */
        final /* synthetic */ boolean f10627d;

        C2692b(int i, String str, int i2, boolean z) {
            this.f10624a = i;
            this.f10625b = str;
            this.f10626c = i2;
            this.f10627d = z;
        }

        public void run() {
            C2690b0.this.m9438a(this.f10624a, this.f10625b, this.f10626c);
            int i = 0;
            while (i <= this.f10625b.length() / C2690b0.f10610f) {
                int i2 = i * C2690b0.f10610f;
                i++;
                int min = Math.min(i * C2690b0.f10610f, this.f10625b.length());
                if (this.f10626c == 3) {
                    C2690b0 b0Var = C2690b0.this;
                    if (b0Var.mo9556a(C2976x.m10335g(b0Var.f10619a, Integer.toString(this.f10624a)), 3, this.f10627d)) {
                        Log.d("AdColony [TRACE]", this.f10625b.substring(i2, min));
                    }
                }
                if (this.f10626c == 2) {
                    C2690b0 b0Var2 = C2690b0.this;
                    if (b0Var2.mo9556a(C2976x.m10335g(b0Var2.f10619a, Integer.toString(this.f10624a)), 2, this.f10627d)) {
                        Log.i("AdColony [INFO]", this.f10625b.substring(i2, min));
                    }
                }
                if (this.f10626c == 1) {
                    C2690b0 b0Var3 = C2690b0.this;
                    if (b0Var3.mo9556a(C2976x.m10335g(b0Var3.f10619a, Integer.toString(this.f10624a)), 1, this.f10627d)) {
                        Log.w("AdColony [WARNING]", this.f10625b.substring(i2, min));
                    }
                }
                if (this.f10626c == 0) {
                    C2690b0 b0Var4 = C2690b0.this;
                    if (b0Var4.mo9556a(C2976x.m10335g(b0Var4.f10619a, Integer.toString(this.f10624a)), 0, this.f10627d)) {
                        Log.e("AdColony [ERROR]", this.f10625b.substring(i2, min));
                    }
                }
                if (this.f10626c == -1 && C2690b0.f10617m >= -1) {
                    Log.e("AdColony [FATAL]", this.f10625b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.b0$c */
    class C2693c implements C2750e0 {
        C2693c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.f10617m = C2976x.m10332e(c0Var.mo9608b(), "level");
        }
    }

    /* renamed from: com.adcolony.sdk.b0$d */
    class C2694d implements C2750e0 {
        C2694d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 3, C2976x.m10337i(c0Var.mo9608b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$e */
    class C2695e implements C2750e0 {
        C2695e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 3, C2976x.m10337i(c0Var.mo9608b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$f */
    class C2696f implements C2750e0 {
        C2696f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 2, C2976x.m10337i(c0Var.mo9608b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$g */
    class C2697g implements C2750e0 {
        C2697g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 2, C2976x.m10337i(c0Var.mo9608b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$h */
    class C2698h implements C2750e0 {
        C2698h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 1, C2976x.m10337i(c0Var.mo9608b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$i */
    class C2699i implements C2750e0 {
        C2699i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 1, C2976x.m10337i(c0Var.mo9608b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.b0$j */
    class C2700j implements C2750e0 {
        C2700j() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2690b0.this.mo9558b(C2976x.m10332e(c0Var.mo9608b(), "module"), 0, C2976x.m10337i(c0Var.mo9608b(), "message"), false);
        }
    }

    C2690b0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9558b(int i, int i2, String str, boolean z) {
        if (!m9440a(m9436a(i, i2, str, z))) {
            synchronized (this.f10621c) {
                this.f10621c.add(m9436a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9560c() {
        ExecutorService executorService = this.f10620b;
        if (executorService == null || executorService.isShutdown() || this.f10620b.isTerminated()) {
            this.f10620b = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f10621c) {
            while (!this.f10621c.isEmpty()) {
                m9440a(this.f10621c.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9553a(int i, String str, boolean z) {
        mo9558b(0, i, str, z);
    }

    /* renamed from: a */
    private Runnable m9436a(int i, int i2, String str, boolean z) {
        return new C2692b(i, str, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9556a(JSONObject jSONObject, int i, boolean z) {
        int e = C2976x.m10332e(jSONObject, "print_level");
        boolean c = C2976x.m10329c(jSONObject, "log_private");
        if (jSONObject.length() == 0) {
            e = f10617m;
            c = f10609e;
        }
        return (!z || c) && e != 4 && e >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9557b() {
        C2684a.m9405a("Log.set_log_level", (C2750e0) new C2693c());
        C2684a.m9405a("Log.public.trace", (C2750e0) new C2694d());
        C2684a.m9405a("Log.private.trace", (C2750e0) new C2695e());
        C2684a.m9405a("Log.public.info", (C2750e0) new C2696f());
        C2684a.m9405a("Log.private.info", (C2750e0) new C2697g());
        C2684a.m9405a("Log.public.warning", (C2750e0) new C2698h());
        C2684a.m9405a("Log.private.warning", (C2750e0) new C2699i());
        C2684a.m9405a("Log.public.error", (C2750e0) new C2700j());
        C2684a.m9405a("Log.private.error", (C2750e0) new C2691a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9555a(JSONObject jSONObject, int i) {
        int e = C2976x.m10332e(jSONObject, "send_level");
        if (jSONObject.length() == 0) {
            e = f10618n;
        }
        return e >= i && e != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9554a(HashMap<String, Object> hashMap) {
        try {
            C2846m0 m0Var = new C2846m0(new C2977y(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f10622d = m0Var;
            m0Var.mo9817a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9559b(JSONArray jSONArray) {
        this.f10619a = mo9552a(jSONArray);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9438a(int i, String str, int i2) {
        if (this.f10622d != null) {
            if (i2 == 3 && mo9555a(C2976x.m10335g(this.f10619a, Integer.toString(i)), 3)) {
                this.f10622d.mo9820a(str);
            } else if (i2 == 2 && mo9555a(C2976x.m10335g(this.f10619a, Integer.toString(i)), 2)) {
                this.f10622d.mo9824c(str);
            } else if (i2 == 1 && mo9555a(C2976x.m10335g(this.f10619a, Integer.toString(i)), 1)) {
                this.f10622d.mo9825d(str);
            } else if (i2 == 0 && mo9555a(C2976x.m10335g(this.f10619a, Integer.toString(i)), 0)) {
                this.f10622d.mo9823b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo9552a(JSONArray jSONArray) {
        JSONObject b = C2976x.m10319b();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject b2 = C2976x.m10321b(jSONArray, i);
            C2976x.m10315a(b, Integer.toString(C2976x.m10332e(b2, TtmlNode.ATTR_ID)), b2);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m9440a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f10620b;
            if (executorService == null || executorService.isShutdown() || this.f10620b.isTerminated()) {
                return false;
            }
            this.f10620b.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2846m0 mo9551a() {
        return this.f10622d;
    }
}
