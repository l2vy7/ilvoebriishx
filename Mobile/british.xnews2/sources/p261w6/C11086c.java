package p261w6;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C7225c;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C0115q;
import p006a5.C6481c;
import p006a5.C6492o;
import p089i0.C5434l;
import p149t.C6077a;
import p200d7.C10506c;
import p237n7.C10842a;
import p267y6.C11114d;
import p267y6.C11120g;
import p267y6.C11126n;
import p267y6.C11138w;

/* renamed from: w6.c */
/* compiled from: FirebaseApp */
public class C11086c {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Object f50028j = new Object();

    /* renamed from: k */
    private static final Executor f50029k = new C11090d();
    @GuardedBy("LOCK")

    /* renamed from: l */
    static final Map<String, C11086c> f50030l = new C6077a();

    /* renamed from: a */
    private final Context f50031a;

    /* renamed from: b */
    private final String f50032b;

    /* renamed from: c */
    private final C11093i f50033c;

    /* renamed from: d */
    private final C11126n f50034d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f50035e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f50036f = new AtomicBoolean();

    /* renamed from: g */
    private final C11138w<C10842a> f50037g;

    /* renamed from: h */
    private final List<C11088b> f50038h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List<Object> f50039i = new CopyOnWriteArrayList();

    /* renamed from: w6.c$b */
    /* compiled from: FirebaseApp */
    public interface C11088b {
        /* renamed from: a */
        void mo43363a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: w6.c$c */
    /* compiled from: FirebaseApp */
    private static class C11089c implements C7225c.C7226a {

        /* renamed from: a */
        private static AtomicReference<C11089c> f50040a = new AtomicReference<>();

        private C11089c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m49579c(Context context) {
            if (C6492o.m28278a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f50040a.get() == null) {
                    C11089c cVar = new C11089c();
                    if (f50040a.compareAndSet((Object) null, cVar)) {
                        C7225c.m29617c(application);
                        C7225c.m29616b().mo29824a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo29837a(boolean z) {
            synchronized (C11086c.f50028j) {
                Iterator it = new ArrayList(C11086c.f50030l.values()).iterator();
                while (it.hasNext()) {
                    C11086c cVar = (C11086c) it.next();
                    if (cVar.f50035e.get()) {
                        cVar.m49569u(z);
                    }
                }
            }
        }
    }

    /* renamed from: w6.c$d */
    /* compiled from: FirebaseApp */
    private static class C11090d implements Executor {

        /* renamed from: b */
        private static final Handler f50041b = new Handler(Looper.getMainLooper());

        private C11090d() {
        }

        public void execute(Runnable runnable) {
            f50041b.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: w6.c$e */
    /* compiled from: FirebaseApp */
    private static class C11091e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C11091e> f50042b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f50043a;

        public C11091e(Context context) {
            this.f50043a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m49582b(Context context) {
            if (f50042b.get() == null) {
                C11091e eVar = new C11091e(context);
                if (f50042b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo43365c() {
            this.f50043a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C11086c.f50028j) {
                for (C11086c c : C11086c.f50030l.values()) {
                    c.m49563m();
                }
            }
            mo43365c();
        }
    }

    protected C11086c(Context context, String str, C11093i iVar) {
        this.f50031a = (Context) C4604n.m20098k(context);
        this.f50032b = C4604n.m20094g(str);
        this.f50033c = (C11093i) C4604n.m20098k(iVar);
        this.f50034d = C11126n.m49664h(f50029k).mo43413d(C11120g.m49652c(context, ComponentDiscoveryService.class).mo43407b()).mo43412c(new FirebaseCommonRegistrar()).mo43411b(C11114d.m49626p(context, Context.class, new Class[0])).mo43411b(C11114d.m49626p(this, C11086c.class, new Class[0])).mo43411b(C11114d.m49626p(iVar, C11093i.class, new Class[0])).mo43414e();
        this.f50037g = new C11138w<>(new C12929b(this, context));
    }

    /* renamed from: f */
    private void m49561f() {
        C4604n.m20102o(!this.f50036f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    public static C11086c m49562i() {
        C11086c cVar;
        synchronized (f50028j) {
            cVar = f50030l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C0115q.m413a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m49563m() {
        if (!C5434l.m24390a(this.f50031a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo43357j());
            C11091e.m49582b(this.f50031a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo43357j());
        this.f50034d.mo43410k(mo43361r());
    }

    /* renamed from: n */
    public static C11086c m49564n(Context context) {
        synchronized (f50028j) {
            if (f50030l.containsKey("[DEFAULT]")) {
                C11086c i = m49562i();
                return i;
            }
            C11093i a = C11093i.m49584a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C11086c o = m49565o(context, a);
            return o;
        }
    }

    /* renamed from: o */
    public static C11086c m49565o(Context context, C11093i iVar) {
        return m49566p(context, iVar, "[DEFAULT]");
    }

    /* renamed from: p */
    public static C11086c m49566p(Context context, C11093i iVar, String str) {
        C11086c cVar;
        C11089c.m49579c(context);
        String t = m49568t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f50028j) {
            Map<String, C11086c> map = f50030l;
            boolean z = !map.containsKey(t);
            C4604n.m20102o(z, "FirebaseApp name " + t + " already exists!");
            C4604n.m20099l(context, "Application context cannot be null.");
            cVar = new C11086c(context, t, iVar);
            map.put(t, cVar);
        }
        cVar.m49563m();
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C10842a m49567s(Context context) {
        return new C10842a(context, mo43359l(), (C10506c) this.f50034d.mo43389a(C10506c.class));
    }

    /* renamed from: t */
    private static String m49568t(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m49569u(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C11088b a : this.f50038h) {
            a.mo43363a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11086c)) {
            return false;
        }
        return this.f50032b.equals(((C11086c) obj).mo43357j());
    }

    /* renamed from: g */
    public <T> T mo43354g(Class<T> cls) {
        m49561f();
        return this.f50034d.mo43389a(cls);
    }

    /* renamed from: h */
    public Context mo43355h() {
        m49561f();
        return this.f50031a;
    }

    public int hashCode() {
        return this.f50032b.hashCode();
    }

    /* renamed from: j */
    public String mo43357j() {
        m49561f();
        return this.f50032b;
    }

    /* renamed from: k */
    public C11093i mo43358k() {
        m49561f();
        return this.f50033c;
    }

    /* renamed from: l */
    public String mo43359l() {
        return C6481c.m28248c(mo43357j().getBytes(Charset.defaultCharset())) + "+" + C6481c.m28248c(mo43358k().mo43368c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: q */
    public boolean mo43360q() {
        m49561f();
        return this.f50037g.get().mo43011b();
    }

    /* renamed from: r */
    public boolean mo43361r() {
        return "[DEFAULT]".equals(mo43357j());
    }

    public String toString() {
        return C7408m.m30030c(this).mo30140a(MediationMetaData.KEY_NAME, this.f50032b).mo30140a("options", this.f50033c).toString();
    }
}
