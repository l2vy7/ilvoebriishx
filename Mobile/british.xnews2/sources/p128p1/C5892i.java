package p128p1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1419b;
import androidx.work.C1429f;
import androidx.work.C1430g;
import androidx.work.C1483m;
import androidx.work.C1486o;
import androidx.work.C1488p;
import androidx.work.C1495r;
import androidx.work.C1498t;
import androidx.work.C1500v;
import androidx.work.C1501w;
import androidx.work.C1503x;
import androidx.work.C1504y;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.C10412b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p135q1.C5937b;
import p140r1.C5977b;
import p172x1.C6352a;
import p172x1.C6359e;
import p172x1.C6363h;
import p172x1.C6364i;
import p172x1.C6366j;
import p177y1.C6400a;
import p177y1.C6401b;

/* renamed from: p1.i */
/* compiled from: WorkManagerImpl */
public class C5892i extends C1503x {

    /* renamed from: j */
    private static final String f24685j = C1483m.m7773f("WorkManagerImpl");

    /* renamed from: k */
    private static C5892i f24686k = null;

    /* renamed from: l */
    private static C5892i f24687l = null;

    /* renamed from: m */
    private static final Object f24688m = new Object();

    /* renamed from: a */
    private Context f24689a;

    /* renamed from: b */
    private C1419b f24690b;

    /* renamed from: c */
    private WorkDatabase f24691c;

    /* renamed from: d */
    private C6400a f24692d;

    /* renamed from: e */
    private List<C5888e> f24693e;

    /* renamed from: f */
    private C5886d f24694f;

    /* renamed from: g */
    private C6359e f24695g;

    /* renamed from: h */
    private boolean f24696h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f24697i;

    public C5892i(Context context, C1419b bVar, C6400a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(C1498t.f6507a));
    }

    /* renamed from: l */
    public static void m25996l(Context context, C1419b bVar) {
        synchronized (f24688m) {
            C5892i iVar = f24686k;
            if (iVar != null) {
                if (f24687l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f24687l == null) {
                    f24687l = new C5892i(applicationContext, bVar, new C6401b(bVar.mo6864l()));
                }
                f24686k = f24687l;
            }
        }
    }

    @Deprecated
    /* renamed from: r */
    public static C5892i m25997r() {
        synchronized (f24688m) {
            C5892i iVar = f24686k;
            if (iVar != null) {
                return iVar;
            }
            C5892i iVar2 = f24687l;
            return iVar2;
        }
    }

    /* renamed from: s */
    public static C5892i m25998s(Context context) {
        C5892i r;
        synchronized (f24688m) {
            r = m25997r();
            if (r == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1419b.C1422c) {
                    m25996l(applicationContext, ((C1419b.C1422c) applicationContext).mo6868a());
                    r = m25998s(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return r;
    }

    /* renamed from: y */
    private void m25999y(Context context, C1419b bVar, C6400a aVar, WorkDatabase workDatabase, List<C5888e> list, C5886d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24689a = applicationContext;
        this.f24690b = bVar;
        this.f24692d = aVar;
        this.f24691c = workDatabase;
        this.f24693e = list;
        this.f24694f = dVar;
        this.f24695g = new C6359e(workDatabase);
        this.f24696h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f24692d.mo24233b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: A */
    public void mo22853A() {
        if (Build.VERSION.SDK_INT >= 23) {
            C5977b.m26342b(mo22862p());
        }
        mo22867w().mo6924j().mo24005v();
        C5889f.m25975b(mo22863q(), mo22867w(), mo22866v());
    }

    /* renamed from: B */
    public void mo22854B(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f24688m) {
            this.f24697i = pendingResult;
            if (this.f24696h) {
                pendingResult.finish();
                this.f24697i = null;
            }
        }
    }

    /* renamed from: C */
    public void mo22855C(String str) {
        mo22856D(str, (WorkerParameters.C1417a) null);
    }

    /* renamed from: D */
    public void mo22856D(String str, WorkerParameters.C1417a aVar) {
        this.f24692d.mo24233b(new C6363h(this, str, aVar));
    }

    /* renamed from: E */
    public void mo22857E(String str) {
        this.f24692d.mo24233b(new C6366j(this, str, true));
    }

    /* renamed from: F */
    public void mo22858F(String str) {
        this.f24692d.mo24233b(new C6366j(this, str, false));
    }

    /* renamed from: b */
    public C1500v mo7040b(List<C1486o> list) {
        if (!list.isEmpty()) {
            return new C5890g(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    /* renamed from: c */
    public C1488p mo7041c(String str) {
        C6352a d = C6352a.m27976d(str, this);
        this.f24692d.mo24233b(d);
        return d.mo24176e();
    }

    /* renamed from: d */
    public C1488p mo7042d(String str) {
        C6352a c = C6352a.m27975c(str, this, true);
        this.f24692d.mo24233b(c);
        return c.mo24176e();
    }

    /* renamed from: f */
    public C1488p mo7044f(List<? extends C1504y> list) {
        if (!list.isEmpty()) {
            return new C5890g(this, list).mo7031a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: g */
    public C1488p mo7045g(String str, C1429f fVar, C1495r rVar) {
        return mo22861o(str, fVar, rVar).mo7031a();
    }

    /* renamed from: i */
    public C1488p mo7047i(String str, C1430g gVar, List<C1486o> list) {
        return new C5890g(this, str, gVar, list).mo7031a();
    }

    /* renamed from: k */
    public C10412b<List<C1501w>> mo7048k(String str) {
        C6364i<List<C1501w>> a = C6364i.m28006a(this, str);
        this.f24692d.mo24234c().execute(a);
        return a.mo24193b();
    }

    /* renamed from: m */
    public C1488p mo22859m(UUID uuid) {
        C6352a b = C6352a.m27974b(uuid, this);
        this.f24692d.mo24233b(b);
        return b.mo24176e();
    }

    /* renamed from: n */
    public List<C5888e> mo22860n(Context context, C1419b bVar, C6400a aVar) {
        return Arrays.asList(new C5888e[]{C5889f.m25974a(context, this), new C5937b(context, bVar, aVar, this)});
    }

    /* renamed from: o */
    public C5890g mo22861o(String str, C1429f fVar, C1495r rVar) {
        C1430g gVar;
        if (fVar == C1429f.KEEP) {
            gVar = C1430g.KEEP;
        } else {
            gVar = C1430g.REPLACE;
        }
        return new C5890g(this, str, gVar, Collections.singletonList(rVar));
    }

    /* renamed from: p */
    public Context mo22862p() {
        return this.f24689a;
    }

    /* renamed from: q */
    public C1419b mo22863q() {
        return this.f24690b;
    }

    /* renamed from: t */
    public C6359e mo22864t() {
        return this.f24695g;
    }

    /* renamed from: u */
    public C5886d mo22865u() {
        return this.f24694f;
    }

    /* renamed from: v */
    public List<C5888e> mo22866v() {
        return this.f24693e;
    }

    /* renamed from: w */
    public WorkDatabase mo22867w() {
        return this.f24691c;
    }

    /* renamed from: x */
    public C6400a mo22868x() {
        return this.f24692d;
    }

    /* renamed from: z */
    public void mo22869z() {
        synchronized (f24688m) {
            this.f24696h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f24697i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f24697i = null;
            }
        }
    }

    public C5892i(Context context, C1419b bVar, C6400a aVar, boolean z) {
        this(context, bVar, aVar, WorkDatabase.m7594a(context.getApplicationContext(), aVar.mo24234c(), z));
    }

    public C5892i(Context context, C1419b bVar, C6400a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C1483m.m7772e(new C1483m.C1484a(bVar.mo6862j()));
        Context context2 = context;
        C1419b bVar2 = bVar;
        C6400a aVar2 = aVar;
        WorkDatabase workDatabase2 = workDatabase;
        List<C5888e> n = mo22860n(applicationContext, bVar, aVar);
        m25999y(context2, bVar2, aVar2, workDatabase2, n, new C5886d(context2, bVar2, aVar2, workDatabase2, n));
    }
}
