package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C10459c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p132p7.C10919i;
import p204e7.C10518f;
import p215h7.C10581b;
import p219i7.C10605c;
import p219i7.C10606e;
import p219i7.C12783a;
import p219i7.C12784b;
import p223j7.C10634a;
import p227k7.C10652b;
import p227k7.C10653c;
import p227k7.C10655d;
import p230l7.C10731c;
import p230l7.C10732d;
import p230l7.C10736f;
import p261w6.C11086c;

/* renamed from: com.google.firebase.installations.b */
/* compiled from: FirebaseInstallations */
public class C10456b implements C10605c {

    /* renamed from: m */
    private static final Object f48941m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f48942n = new C10457a();

    /* renamed from: a */
    private final C11086c f48943a;

    /* renamed from: b */
    private final C10731c f48944b;

    /* renamed from: c */
    private final C10653c f48945c;

    /* renamed from: d */
    private final C10463f f48946d;

    /* renamed from: e */
    private final C10652b f48947e;

    /* renamed from: f */
    private final C10606e f48948f;

    /* renamed from: g */
    private final Object f48949g;

    /* renamed from: h */
    private final ExecutorService f48950h;

    /* renamed from: i */
    private final ExecutorService f48951i;

    /* renamed from: j */
    private String f48952j;

    /* renamed from: k */
    private Set<C10634a> f48953k;

    /* renamed from: l */
    private final List<C10462e> f48954l;

    /* renamed from: com.google.firebase.installations.b$a */
    /* compiled from: FirebaseInstallations */
    class C10457a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f48955a = new AtomicInteger(1);

        C10457a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f48955a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.b$b */
    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class C10458b {

        /* renamed from: a */
        static final /* synthetic */ int[] f48956a;

        /* renamed from: b */
        static final /* synthetic */ int[] f48957b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                l7.f$b[] r0 = p230l7.C10736f.C10738b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48957b = r0
                r1 = 1
                l7.f$b r2 = p230l7.C10736f.C10738b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f48957b     // Catch:{ NoSuchFieldError -> 0x001d }
                l7.f$b r3 = p230l7.C10736f.C10738b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f48957b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l7.f$b r3 = p230l7.C10736f.C10738b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                l7.d$b[] r2 = p230l7.C10732d.C10734b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f48956a = r2
                l7.d$b r3 = p230l7.C10732d.C10734b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f48956a     // Catch:{ NoSuchFieldError -> 0x0043 }
                l7.d$b r2 = p230l7.C10732d.C10734b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C10456b.C10458b.<clinit>():void");
        }
    }

    C10456b(C11086c cVar, C10581b<C10919i> bVar, C10581b<C10518f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f48942n), cVar, new C10731c(cVar.mo43355h(), bVar, bVar2), new C10653c(cVar), C10463f.m48162c(), new C10652b(cVar), new C10606e());
    }

    /* renamed from: c */
    private Task<String> m48134c() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m48135d(new C10461d(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    private void m48135d(C10462e eVar) {
        synchronized (this.f48949g) {
            this.f48954l.add(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m48145r(boolean r3) {
        /*
            r2 = this;
            k7.d r0 = r2.m48142n()
            boolean r1 = r0.mo42783i()     // Catch:{ c -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo42786l()     // Catch:{ c -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.f r3 = r2.f48946d     // Catch:{ c -> 0x005f }
            boolean r3 = r3.mo41939f(r0)     // Catch:{ c -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            k7.d r3 = r2.m48138g(r0)     // Catch:{ c -> 0x005f }
            goto L_0x0026
        L_0x0022:
            k7.d r3 = r2.m48149v(r0)     // Catch:{ c -> 0x005f }
        L_0x0026:
            r2.m48144q(r3)
            r2.m48153z(r0, r3)
            boolean r0 = r3.mo42785k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo42762d()
            r2.m48152y(r0)
        L_0x0039:
            boolean r0 = r3.mo42783i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.c r3 = new com.google.firebase.installations.c
            com.google.firebase.installations.c$a r0 = com.google.firebase.installations.C10459c.C10460a.BAD_CONFIG
            r3.<init>(r0)
            r2.m48150w(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo42784j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m48150w(r3)
            goto L_0x005e
        L_0x005b:
            r2.m48151x(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m48150w(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C10456b.m48145r(boolean):void");
    }

    /* renamed from: f */
    private final void m48137f(boolean z) {
        C10655d o = m48143o();
        if (z) {
            o = o.mo42789p();
        }
        m48151x(o);
        this.f48951i.execute(new C12784b(this, z));
    }

    /* renamed from: g */
    private C10655d m48138g(C10655d dVar) throws C10459c {
        C10736f e = this.f48944b.mo42902e(mo41929h(), dVar.mo42762d(), mo41932p(), dVar.mo42765f());
        int i = C10458b.f48957b[e.mo42891b().ordinal()];
        if (i == 1) {
            return dVar.mo42788o(e.mo42892c(), e.mo42893d(), this.f48946d.mo41937b());
        } else if (i == 2) {
            return dVar.mo42790q("BAD CONFIG");
        } else {
            if (i == 3) {
                m48152y((String) null);
                return dVar.mo42791r();
            }
            throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
        }
    }

    /* renamed from: j */
    private synchronized String m48139j() {
        return this.f48952j;
    }

    /* renamed from: l */
    public static C10456b m48140l() {
        return m48141m(C11086c.m49562i());
    }

    /* renamed from: m */
    public static C10456b m48141m(C11086c cVar) {
        C4604n.m20089b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (C10456b) cVar.mo43354g(C10605c.class);
    }

    /* renamed from: n */
    private C10655d m48142n() {
        C10655d c;
        synchronized (f48941m) {
            C10455a a = C10455a.m48130a(this.f48943a.mo43355h(), "generatefid.lock");
            try {
                c = this.f48945c.mo42782c();
                if (a != null) {
                    a.mo41928b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo41928b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: o */
    private C10655d m48143o() {
        C10655d c;
        synchronized (f48941m) {
            C10455a a = C10455a.m48130a(this.f48943a.mo43355h(), "generatefid.lock");
            try {
                c = this.f48945c.mo42782c();
                if (c.mo42784j()) {
                    c = this.f48945c.mo42781a(c.mo42793t(m48148u(c)));
                }
                if (a != null) {
                    a.mo41928b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo41928b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: q */
    private void m48144q(C10655d dVar) {
        synchronized (f48941m) {
            C10455a a = C10455a.m48130a(this.f48943a.mo43355h(), "generatefid.lock");
            try {
                this.f48945c.mo42781a(dVar);
                if (a != null) {
                    a.mo41928b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo41928b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m48146s() {
        m48137f(false);
    }

    /* renamed from: t */
    private void m48147t() {
        C4604n.m20095h(mo41930i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4604n.m20095h(mo41932p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4604n.m20095h(mo41929h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4604n.m20089b(C10463f.m48165h(mo41930i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4604n.m20089b(C10463f.m48164g(mo41929h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: u */
    private String m48148u(C10655d dVar) {
        if ((!this.f48943a.mo43357j().equals("CHIME_ANDROID_SDK") && !this.f48943a.mo43361r()) || !dVar.mo42787m()) {
            return this.f48948f.mo42718a();
        }
        String f = this.f48947e.mo42779f();
        return TextUtils.isEmpty(f) ? this.f48948f.mo42718a() : f;
    }

    /* renamed from: v */
    private C10655d m48149v(C10655d dVar) throws C10459c {
        C10732d d = this.f48944b.mo42901d(mo41929h(), dVar.mo42762d(), mo41932p(), mo41930i(), (dVar.mo42762d() == null || dVar.mo42762d().length() != 11) ? null : this.f48947e.mo42780i());
        int i = C10458b.f48956a[d.mo42880e().ordinal()];
        if (i == 1) {
            return dVar.mo42792s(d.mo42878c(), d.mo42879d(), this.f48946d.mo41937b(), d.mo42877b().mo42892c(), d.mo42877b().mo42893d());
        } else if (i == 2) {
            return dVar.mo42790q("BAD CONFIG");
        } else {
            throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
        }
    }

    /* renamed from: w */
    private void m48150w(Exception exc) {
        synchronized (this.f48949g) {
            Iterator<C10462e> it = this.f48954l.iterator();
            while (it.hasNext()) {
                if (it.next().mo41934a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    private void m48151x(C10655d dVar) {
        synchronized (this.f48949g) {
            Iterator<C10462e> it = this.f48954l.iterator();
            while (it.hasNext()) {
                if (it.next().mo41935b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    private synchronized void m48152y(String str) {
        this.f48952j = str;
    }

    /* renamed from: z */
    private synchronized void m48153z(C10655d dVar, C10655d dVar2) {
        if (this.f48953k.size() != 0 && !dVar.mo42762d().equals(dVar2.mo42762d())) {
            for (C10634a a : this.f48953k) {
                a.mo42750a(dVar2.mo42762d());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo41929h() {
        return this.f48943a.mo43358k().mo43367b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo41930i() {
        return this.f48943a.mo43358k().mo43368c();
    }

    /* renamed from: k */
    public Task<String> mo41931k() {
        m48147t();
        String j = m48139j();
        if (j != null) {
            return Tasks.forResult(j);
        }
        Task<String> c = m48134c();
        this.f48950h.execute(new C12783a(this));
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo41932p() {
        return this.f48943a.mo43358k().mo43370e();
    }

    C10456b(ExecutorService executorService, C11086c cVar, C10731c cVar2, C10653c cVar3, C10463f fVar, C10652b bVar, C10606e eVar) {
        this.f48949g = new Object();
        this.f48953k = new HashSet();
        this.f48954l = new ArrayList();
        this.f48943a = cVar;
        this.f48944b = cVar2;
        this.f48945c = cVar3;
        this.f48946d = fVar;
        this.f48947e = bVar;
        this.f48948f = eVar;
        this.f48950h = executorService;
        this.f48951i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f48942n);
    }
}
