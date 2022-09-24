package com.adcolony.sdk;

import com.adcolony.sdk.C2864p;
import com.adcolony.sdk.C2978z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.q */
class C2867q implements C2864p.C2865a {

    /* renamed from: a */
    private BlockingQueue<Runnable> f11634a = new LinkedBlockingQueue();

    /* renamed from: b */
    private ThreadPoolExecutor f11635b = new ThreadPoolExecutor(4, 16, 60, TimeUnit.SECONDS, this.f11634a);

    /* renamed from: c */
    private final ConcurrentLinkedQueue<C2864p> f11636c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private String f11637d;

    /* renamed from: e */
    private C2864p.C2865a f11638e;

    /* renamed from: com.adcolony.sdk.q$a */
    class C2868a implements C2750e0 {
        C2868a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2867q qVar = C2867q.this;
            qVar.mo9922a(new C2864p(c0Var, qVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C2869b implements C2750e0 {
        C2869b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2867q qVar = C2867q.this;
            qVar.mo9922a(new C2864p(c0Var, qVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C2870c implements C2750e0 {
        C2870c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2867q qVar = C2867q.this;
            qVar.mo9922a(new C2864p(c0Var, qVar));
        }
    }

    C2867q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9922a(C2864p pVar) {
        String str = this.f11637d;
        if (str == null || str.equals("")) {
            this.f11636c.add(pVar);
            return;
        }
        try {
            this.f11635b.execute(pVar);
        } catch (RejectedExecutionException unused) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo10088a("execute download for url " + pVar.f11627n).mo10090a(C2978z.f11950j);
            mo9705a(pVar, pVar.mo9912b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9924b() {
        C2684a.m9409c().mo9723j().mo9840K();
        C2684a.m9405a("WebServices.download", (C2750e0) new C2868a());
        C2684a.m9405a("WebServices.get", (C2750e0) new C2869b());
        C2684a.m9405a("WebServices.post", (C2750e0) new C2870c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9923a(String str) {
        this.f11637d = str;
        while (true) {
            C2864p poll = this.f11636c.poll();
            if (poll != null) {
                mo9922a(poll);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9921a(int i) {
        this.f11635b.setCorePoolSize(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9920a() {
        return this.f11635b.getCorePoolSize();
    }

    /* renamed from: a */
    public void mo9705a(C2864p pVar, C2714c0 c0Var, Map<String, List<String>> map) {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "url", pVar.f11627n);
        C2976x.m10325b(b, "success", pVar.f11629p);
        C2976x.m10323b(b, IronSourceConstants.EVENTS_STATUS, pVar.f11631r);
        C2976x.m10313a(b, TtmlNode.TAG_BODY, pVar.f11628o);
        C2976x.m10323b(b, "size", pVar.f11630q);
        if (map != null) {
            JSONObject b2 = C2976x.m10319b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C2976x.m10313a(b2, (String) next.getKey(), substring);
                }
            }
            C2976x.m10315a(b, "headers", b2);
        }
        c0Var.mo9607a(b).mo9612d();
    }
}
