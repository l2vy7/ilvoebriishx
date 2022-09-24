package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C1483m;
import java.util.ArrayList;
import java.util.List;
import p128p1.C5884b;
import p128p1.C5886d;
import p128p1.C5892i;
import p172x1.C6361g;
import p172x1.C6367k;
import p172x1.C6375o;
import p177y1.C6400a;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* compiled from: SystemAlarmDispatcher */
public class C1451e implements C5884b {

    /* renamed from: l */
    static final String f6394l = C1483m.m7773f("SystemAlarmDispatcher");

    /* renamed from: b */
    final Context f6395b;

    /* renamed from: c */
    private final C6400a f6396c;

    /* renamed from: d */
    private final C6375o f6397d;

    /* renamed from: e */
    private final C5886d f6398e;

    /* renamed from: f */
    private final C5892i f6399f;

    /* renamed from: g */
    final C1448b f6400g;

    /* renamed from: h */
    private final Handler f6401h;

    /* renamed from: i */
    final List<Intent> f6402i;

    /* renamed from: j */
    Intent f6403j;

    /* renamed from: k */
    private C1454c f6404k;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* compiled from: SystemAlarmDispatcher */
    class C1452a implements Runnable {
        C1452a() {
        }

        public void run() {
            C1455d dVar;
            C1451e eVar;
            synchronized (C1451e.this.f6402i) {
                C1451e eVar2 = C1451e.this;
                eVar2.f6403j = eVar2.f6402i.get(0);
            }
            Intent intent = C1451e.this.f6403j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1451e.this.f6403j.getIntExtra("KEY_START_ID", 0);
                C1483m c = C1483m.m7771c();
                String str = C1451e.f6394l;
                c.mo7013a(str, String.format("Processing command %s, %s", new Object[]{C1451e.this.f6403j, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = C6367k.m28012b(C1451e.this.f6395b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C1483m.m7771c().mo7013a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    C1451e eVar3 = C1451e.this;
                    eVar3.f6400g.mo6934p(eVar3.f6403j, intExtra, eVar3);
                    C1483m.m7771c().mo7013a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = C1451e.this;
                    dVar = new C1455d(eVar);
                } catch (Throwable th) {
                    C1483m.m7771c().mo7013a(C1451e.f6394l, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    C1451e eVar4 = C1451e.this;
                    eVar4.mo6947k(new C1455d(eVar4));
                    throw th;
                }
                eVar.mo6947k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* compiled from: SystemAlarmDispatcher */
    static class C1453b implements Runnable {

        /* renamed from: b */
        private final C1451e f6406b;

        /* renamed from: c */
        private final Intent f6407c;

        /* renamed from: d */
        private final int f6408d;

        C1453b(C1451e eVar, Intent intent, int i) {
            this.f6406b = eVar;
            this.f6407c = intent;
            this.f6408d = i;
        }

        public void run() {
            this.f6406b.mo6940a(this.f6407c, this.f6408d);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* compiled from: SystemAlarmDispatcher */
    interface C1454c {
        /* renamed from: b */
        void mo6931b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* compiled from: SystemAlarmDispatcher */
    static class C1455d implements Runnable {

        /* renamed from: b */
        private final C1451e f6409b;

        C1455d(C1451e eVar) {
            this.f6409b = eVar;
        }

        public void run() {
            this.f6409b.mo6941c();
        }
    }

    C1451e(Context context) {
        this(context, (C5886d) null, (C5892i) null);
    }

    /* renamed from: b */
    private void m7666b() {
        if (this.f6401h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m7667i(String str) {
        m7666b();
        synchronized (this.f6402i) {
            for (Intent action : this.f6402i) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m7668l() {
        m7666b();
        PowerManager.WakeLock b = C6367k.m28012b(this.f6395b, "ProcessCommand");
        try {
            b.acquire();
            this.f6399f.mo22868x().mo24233b(new C1452a());
        } finally {
            b.release();
        }
    }

    /* renamed from: a */
    public boolean mo6940a(Intent intent, int i) {
        C1483m c = C1483m.m7771c();
        String str = f6394l;
        boolean z = false;
        c.mo7013a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m7666b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C1483m.m7771c().mo7017h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m7667i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f6402i) {
                if (!this.f6402i.isEmpty()) {
                    z = true;
                }
                this.f6402i.add(intent);
                if (!z) {
                    m7668l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6941c() {
        C1483m c = C1483m.m7771c();
        String str = f6394l;
        c.mo7013a(str, "Checking if commands are complete.", new Throwable[0]);
        m7666b();
        synchronized (this.f6402i) {
            if (this.f6403j != null) {
                C1483m.m7771c().mo7013a(str, String.format("Removing command %s", new Object[]{this.f6403j}), new Throwable[0]);
                if (this.f6402i.remove(0).equals(this.f6403j)) {
                    this.f6403j = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C6361g c2 = this.f6396c.mo24234c();
            if (!this.f6400g.mo6933o() && this.f6402i.isEmpty() && !c2.mo24188a()) {
                C1483m.m7771c().mo7013a(str, "No more commands & intents.", new Throwable[0]);
                C1454c cVar = this.f6404k;
                if (cVar != null) {
                    cVar.mo6931b();
                }
            } else if (!this.f6402i.isEmpty()) {
                m7668l();
            }
        }
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        mo6947k(new C1453b(this, C1448b.m7644c(this.f6395b, str, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5886d mo6942e() {
        return this.f6398e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6400a mo6943f() {
        return this.f6396c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5892i mo6944g() {
        return this.f6399f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C6375o mo6945h() {
        return this.f6397d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6946j() {
        C1483m.m7771c().mo7013a(f6394l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f6398e.mo22837i(this);
        this.f6397d.mo24204a();
        this.f6404k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6947k(Runnable runnable) {
        this.f6401h.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6948m(C1454c cVar) {
        if (this.f6404k != null) {
            C1483m.m7771c().mo7014b(f6394l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f6404k = cVar;
        }
    }

    C1451e(Context context, C5886d dVar, C5892i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6395b = applicationContext;
        this.f6400g = new C1448b(applicationContext);
        this.f6397d = new C6375o();
        iVar = iVar == null ? C5892i.m25998s(context) : iVar;
        this.f6399f = iVar;
        dVar = dVar == null ? iVar.mo22865u() : dVar;
        this.f6398e = dVar;
        this.f6396c = iVar.mo22868x();
        dVar.mo22833c(this);
        this.f6402i = new ArrayList();
        this.f6403j = null;
        this.f6401h = new Handler(Looper.getMainLooper());
    }
}
