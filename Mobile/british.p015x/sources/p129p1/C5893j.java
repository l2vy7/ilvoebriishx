package p129p1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1419b;
import androidx.work.C1427e;
import androidx.work.C1480k;
import androidx.work.C1483m;
import androidx.work.C1501w;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p163v1.C6226a;
import p168w1.C6261b;
import p168w1.C6283p;
import p168w1.C6287q;
import p168w1.C6299t;
import p173x1.C6358d;
import p173x1.C6368l;
import p173x1.C6371m;
import p173x1.C6373n;
import p178y1.C6400a;

/* renamed from: p1.j */
/* compiled from: WorkerWrapper */
public class C5893j implements Runnable {

    /* renamed from: u */
    static final String f24698u = C1483m.m7773f("WorkerWrapper");

    /* renamed from: b */
    Context f24699b;

    /* renamed from: c */
    private String f24700c;

    /* renamed from: d */
    private List<C5888e> f24701d;

    /* renamed from: e */
    private WorkerParameters.C1417a f24702e;

    /* renamed from: f */
    C6283p f24703f;

    /* renamed from: g */
    ListenableWorker f24704g;

    /* renamed from: h */
    C6400a f24705h;

    /* renamed from: i */
    ListenableWorker.C1412a f24706i = ListenableWorker.C1412a.m7511a();

    /* renamed from: j */
    private C1419b f24707j;

    /* renamed from: k */
    private C6226a f24708k;

    /* renamed from: l */
    private WorkDatabase f24709l;

    /* renamed from: m */
    private C6287q f24710m;

    /* renamed from: n */
    private C6261b f24711n;

    /* renamed from: o */
    private C6299t f24712o;

    /* renamed from: p */
    private List<String> f24713p;

    /* renamed from: q */
    private String f24714q;

    /* renamed from: r */
    C1476d<Boolean> f24715r = C1476d.m7752t();

    /* renamed from: s */
    C10412b<ListenableWorker.C1412a> f24716s = null;

    /* renamed from: t */
    private volatile boolean f24717t;

    /* renamed from: p1.j$a */
    /* compiled from: WorkerWrapper */
    class C5894a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C10412b f24718b;

        /* renamed from: c */
        final /* synthetic */ C1476d f24719c;

        C5894a(C10412b bVar, C1476d dVar) {
            this.f24718b = bVar;
            this.f24719c = dVar;
        }

        public void run() {
            try {
                this.f24718b.get();
                C1483m.m7771c().mo7013a(C5893j.f24698u, String.format("Starting work for %s", new Object[]{C5893j.this.f24703f.f25943c}), new Throwable[0]);
                C5893j jVar = C5893j.this;
                jVar.f24716s = jVar.f24704g.startWork();
                this.f24719c.mo6991r(C5893j.this.f24716s);
            } catch (Throwable th) {
                this.f24719c.mo6990q(th);
            }
        }
    }

    /* renamed from: p1.j$b */
    /* compiled from: WorkerWrapper */
    class C5895b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C1476d f24721b;

        /* renamed from: c */
        final /* synthetic */ String f24722c;

        C5895b(C1476d dVar, String str) {
            this.f24721b = dVar;
            this.f24722c = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.C1412a aVar = (ListenableWorker.C1412a) this.f24721b.get();
                if (aVar == null) {
                    C1483m.m7771c().mo7014b(C5893j.f24698u, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C5893j.this.f24703f.f25943c}), new Throwable[0]);
                } else {
                    C1483m.m7771c().mo7013a(C5893j.f24698u, String.format("%s returned a %s result.", new Object[]{C5893j.this.f24703f.f25943c, aVar}), new Throwable[0]);
                    C5893j.this.f24706i = aVar;
                }
            } catch (CancellationException e) {
                C1483m.m7771c().mo7015d(C5893j.f24698u, String.format("%s was cancelled", new Object[]{this.f24722c}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C1483m.m7771c().mo7014b(C5893j.f24698u, String.format("%s failed because it threw an exception/error", new Object[]{this.f24722c}), e2);
            } catch (Throwable th) {
                C5893j.this.mo22872f();
                throw th;
            }
            C5893j.this.mo22872f();
        }
    }

    /* renamed from: p1.j$c */
    /* compiled from: WorkerWrapper */
    public static class C5896c {

        /* renamed from: a */
        Context f24724a;

        /* renamed from: b */
        ListenableWorker f24725b;

        /* renamed from: c */
        C6226a f24726c;

        /* renamed from: d */
        C6400a f24727d;

        /* renamed from: e */
        C1419b f24728e;

        /* renamed from: f */
        WorkDatabase f24729f;

        /* renamed from: g */
        String f24730g;

        /* renamed from: h */
        List<C5888e> f24731h;

        /* renamed from: i */
        WorkerParameters.C1417a f24732i = new WorkerParameters.C1417a();

        public C5896c(Context context, C1419b bVar, C6400a aVar, C6226a aVar2, WorkDatabase workDatabase, String str) {
            this.f24724a = context.getApplicationContext();
            this.f24727d = aVar;
            this.f24726c = aVar2;
            this.f24728e = bVar;
            this.f24729f = workDatabase;
            this.f24730g = str;
        }

        /* renamed from: a */
        public C5893j mo22877a() {
            return new C5893j(this);
        }

        /* renamed from: b */
        public C5896c mo22878b(WorkerParameters.C1417a aVar) {
            if (aVar != null) {
                this.f24732i = aVar;
            }
            return this;
        }

        /* renamed from: c */
        public C5896c mo22879c(List<C5888e> list) {
            this.f24731h = list;
            return this;
        }
    }

    C5893j(C5896c cVar) {
        this.f24699b = cVar.f24724a;
        this.f24705h = cVar.f24727d;
        this.f24708k = cVar.f24726c;
        this.f24700c = cVar.f24730g;
        this.f24701d = cVar.f24731h;
        this.f24702e = cVar.f24732i;
        this.f24704g = cVar.f24725b;
        this.f24707j = cVar.f24728e;
        WorkDatabase workDatabase = cVar.f24729f;
        this.f24709l = workDatabase;
        this.f24710m = workDatabase.mo6924j();
        this.f24711n = this.f24709l.mo6919b();
        this.f24712o = this.f24709l.mo6925k();
    }

    /* renamed from: a */
    private String m26024a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f24700c);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m26025c(ListenableWorker.C1412a aVar) {
        if (aVar instanceof ListenableWorker.C1412a.C1415c) {
            C1483m.m7771c().mo7015d(f24698u, String.format("Worker result SUCCESS for %s", new Object[]{this.f24714q}), new Throwable[0]);
            if (this.f24703f.mo23972d()) {
                m26028h();
            } else {
                m26032m();
            }
        } else if (aVar instanceof ListenableWorker.C1412a.C1414b) {
            C1483m.m7771c().mo7015d(f24698u, String.format("Worker result RETRY for %s", new Object[]{this.f24714q}), new Throwable[0]);
            m26027g();
        } else {
            C1483m.m7771c().mo7015d(f24698u, String.format("Worker result FAILURE for %s", new Object[]{this.f24714q}), new Throwable[0]);
            if (this.f24703f.mo23972d()) {
                m26028h();
            } else {
                mo22873l();
            }
        }
    }

    /* renamed from: e */
    private void m26026e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f24710m.mo23996m(str2) != C1501w.C1502a.CANCELLED) {
                this.f24710m.mo23985b(C1501w.C1502a.FAILED, str2);
            }
            linkedList.addAll(this.f24711n.mo23945a(str2));
        }
    }

    /* renamed from: g */
    private void m26027g() {
        this.f24709l.beginTransaction();
        try {
            this.f24710m.mo23985b(C1501w.C1502a.ENQUEUED, this.f24700c);
            this.f24710m.mo24003t(this.f24700c, System.currentTimeMillis());
            this.f24710m.mo23986c(this.f24700c, -1);
            this.f24709l.setTransactionSuccessful();
        } finally {
            this.f24709l.endTransaction();
            m26029i(true);
        }
    }

    /* renamed from: h */
    private void m26028h() {
        this.f24709l.beginTransaction();
        try {
            this.f24710m.mo24003t(this.f24700c, System.currentTimeMillis());
            this.f24710m.mo23985b(C1501w.C1502a.ENQUEUED, this.f24700c);
            this.f24710m.mo23998o(this.f24700c);
            this.f24710m.mo23986c(this.f24700c, -1);
            this.f24709l.setTransactionSuccessful();
        } finally {
            this.f24709l.endTransaction();
            m26029i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    private void m26029i(boolean z) {
        ListenableWorker listenableWorker;
        this.f24709l.beginTransaction();
        try {
            if (!this.f24709l.mo6924j().mo23994k()) {
                C6358d.m27998a(this.f24699b, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f24710m.mo23985b(C1501w.C1502a.ENQUEUED, this.f24700c);
                this.f24710m.mo23986c(this.f24700c, -1);
            }
            if (!(this.f24703f == null || (listenableWorker = this.f24704g) == null || !listenableWorker.isRunInForeground())) {
                this.f24708k.mo22832b(this.f24700c);
            }
            this.f24709l.setTransactionSuccessful();
            this.f24709l.endTransaction();
            this.f24715r.mo6989p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f24709l.endTransaction();
            throw th;
        }
    }

    /* renamed from: j */
    private void m26030j() {
        C1501w.C1502a m = this.f24710m.mo23996m(this.f24700c);
        if (m == C1501w.C1502a.RUNNING) {
            C1483m.m7771c().mo7013a(f24698u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f24700c}), new Throwable[0]);
            m26029i(true);
            return;
        }
        C1483m.m7771c().mo7013a(f24698u, String.format("Status for %s is %s; not doing any work", new Object[]{this.f24700c, m}), new Throwable[0]);
        m26029i(false);
    }

    /* renamed from: k */
    private void m26031k() {
        C1427e b;
        if (!m26033n()) {
            this.f24709l.beginTransaction();
            try {
                C6283p n = this.f24710m.mo23997n(this.f24700c);
                this.f24703f = n;
                if (n == null) {
                    C1483m.m7771c().mo7014b(f24698u, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f24700c}), new Throwable[0]);
                    m26029i(false);
                    this.f24709l.setTransactionSuccessful();
                } else if (n.f25942b != C1501w.C1502a.ENQUEUED) {
                    m26030j();
                    this.f24709l.setTransactionSuccessful();
                    C1483m.m7771c().mo7013a(f24698u, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f24703f.f25943c}), new Throwable[0]);
                    this.f24709l.endTransaction();
                } else {
                    if (n.mo23972d() || this.f24703f.mo23971c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C6283p pVar = this.f24703f;
                        if (!(pVar.f25954n == 0) && currentTimeMillis < pVar.mo23969a()) {
                            C1483m.m7771c().mo7013a(f24698u, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f24703f.f25943c}), new Throwable[0]);
                            m26029i(true);
                            this.f24709l.setTransactionSuccessful();
                            this.f24709l.endTransaction();
                            return;
                        }
                    }
                    this.f24709l.setTransactionSuccessful();
                    this.f24709l.endTransaction();
                    if (this.f24703f.mo23972d()) {
                        b = this.f24703f.f25945e;
                    } else {
                        C1480k b2 = this.f24707j.mo6858f().mo7012b(this.f24703f.f25944d);
                        if (b2 == null) {
                            C1483m.m7771c().mo7014b(f24698u, String.format("Could not create Input Merger %s", new Object[]{this.f24703f.f25944d}), new Throwable[0]);
                            mo22873l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f24703f.f25945e);
                        arrayList.addAll(this.f24710m.mo24001r(this.f24700c));
                        b = b2.mo6804b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f24700c), b, this.f24713p, this.f24702e, this.f24703f.f25951k, this.f24707j.mo6857e(), this.f24705h, this.f24707j.mo6865m(), new C6373n(this.f24709l, this.f24705h), new C6371m(this.f24709l, this.f24708k, this.f24705h));
                    if (this.f24704g == null) {
                        this.f24704g = this.f24707j.mo6865m().mo7058b(this.f24699b, this.f24703f.f25943c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f24704g;
                    if (listenableWorker == null) {
                        C1483m.m7771c().mo7014b(f24698u, String.format("Could not create Worker %s", new Object[]{this.f24703f.f25943c}), new Throwable[0]);
                        mo22873l();
                    } else if (listenableWorker.isUsed()) {
                        C1483m.m7771c().mo7014b(f24698u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f24703f.f25943c}), new Throwable[0]);
                        mo22873l();
                    } else {
                        this.f24704g.setUsed();
                        if (!m26034o()) {
                            m26030j();
                        } else if (!m26033n()) {
                            C1476d t = C1476d.m7752t();
                            C6368l lVar = new C6368l(this.f24699b, this.f24703f, this.f24704g, workerParameters.mo6844b(), this.f24705h);
                            this.f24705h.mo24232a().execute(lVar);
                            C10412b<Void> a = lVar.mo24198a();
                            a.mo6980a(new C5894a(a, t), this.f24705h.mo24232a());
                            t.mo6980a(new C5895b(t, this.f24714q), this.f24705h.mo24234c());
                        }
                    }
                }
            } finally {
                this.f24709l.endTransaction();
            }
        }
    }

    /* renamed from: m */
    private void m26032m() {
        this.f24709l.beginTransaction();
        try {
            this.f24710m.mo23985b(C1501w.C1502a.SUCCEEDED, this.f24700c);
            this.f24710m.mo23991h(this.f24700c, ((ListenableWorker.C1412a.C1415c) this.f24706i).mo6834e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f24711n.mo23945a(this.f24700c)) {
                if (this.f24710m.mo23996m(next) == C1501w.C1502a.BLOCKED && this.f24711n.mo23946b(next)) {
                    C1483m.m7771c().mo7015d(f24698u, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f24710m.mo23985b(C1501w.C1502a.ENQUEUED, next);
                    this.f24710m.mo24003t(next, currentTimeMillis);
                }
            }
            this.f24709l.setTransactionSuccessful();
        } finally {
            this.f24709l.endTransaction();
            m26029i(false);
        }
    }

    /* renamed from: n */
    private boolean m26033n() {
        if (!this.f24717t) {
            return false;
        }
        C1483m.m7771c().mo7013a(f24698u, String.format("Work interrupted for %s", new Object[]{this.f24714q}), new Throwable[0]);
        C1501w.C1502a m = this.f24710m.mo23996m(this.f24700c);
        if (m == null) {
            m26029i(false);
        } else {
            m26029i(!m.mo7038d());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m26034o() {
        this.f24709l.beginTransaction();
        try {
            boolean z = true;
            if (this.f24710m.mo23996m(this.f24700c) == C1501w.C1502a.ENQUEUED) {
                this.f24710m.mo23985b(C1501w.C1502a.RUNNING, this.f24700c);
                this.f24710m.mo24002s(this.f24700c);
            } else {
                z = false;
            }
            this.f24709l.setTransactionSuccessful();
            return z;
        } finally {
            this.f24709l.endTransaction();
        }
    }

    /* renamed from: b */
    public C10412b<Boolean> mo22870b() {
        return this.f24715r;
    }

    /* renamed from: d */
    public void mo22871d() {
        boolean z;
        this.f24717t = true;
        m26033n();
        C10412b<ListenableWorker.C1412a> bVar = this.f24716s;
        if (bVar != null) {
            z = bVar.isDone();
            this.f24716s.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f24704g;
        if (listenableWorker == null || z) {
            C1483m.m7771c().mo7013a(f24698u, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f24703f}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo22872f() {
        if (!m26033n()) {
            this.f24709l.beginTransaction();
            try {
                C1501w.C1502a m = this.f24710m.mo23996m(this.f24700c);
                this.f24709l.mo6923i().mo23965a(this.f24700c);
                if (m == null) {
                    m26029i(false);
                } else if (m == C1501w.C1502a.RUNNING) {
                    m26025c(this.f24706i);
                } else if (!m.mo7038d()) {
                    m26027g();
                }
                this.f24709l.setTransactionSuccessful();
            } finally {
                this.f24709l.endTransaction();
            }
        }
        List<C5888e> list = this.f24701d;
        if (list != null) {
            for (C5888e e : list) {
                e.mo6954e(this.f24700c);
            }
            C5889f.m25975b(this.f24707j, this.f24709l, this.f24701d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo22873l() {
        this.f24709l.beginTransaction();
        try {
            m26026e(this.f24700c);
            this.f24710m.mo23991h(this.f24700c, ((ListenableWorker.C1412a.C1413a) this.f24706i).mo6827e());
            this.f24709l.setTransactionSuccessful();
        } finally {
            this.f24709l.endTransaction();
            m26029i(false);
        }
    }

    public void run() {
        List<String> a = this.f24712o.mo24007a(this.f24700c);
        this.f24713p = a;
        this.f24714q = m26024a(a);
        m26031k();
    }
}
