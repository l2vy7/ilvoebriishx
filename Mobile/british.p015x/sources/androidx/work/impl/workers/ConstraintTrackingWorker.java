package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1483m;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.Collections;
import java.util.List;
import p129p1.C5892i;
import p146s1.C6015c;
import p146s1.C6016d;
import p168w1.C6283p;
import p178y1.C6400a;

public class ConstraintTrackingWorker extends ListenableWorker implements C6015c {

    /* renamed from: g */
    private static final String f6480g = C1483m.m7773f("ConstraintTrkngWrkr");

    /* renamed from: b */
    private WorkerParameters f6481b;

    /* renamed from: c */
    final Object f6482c = new Object();

    /* renamed from: d */
    volatile boolean f6483d = false;

    /* renamed from: e */
    C1476d<ListenableWorker.C1412a> f6484e = C1476d.m7752t();

    /* renamed from: f */
    private ListenableWorker f6485f;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C1477a implements Runnable {
        C1477a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo7007e();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C1478b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C10412b f6487b;

        C1478b(C10412b bVar) {
            this.f6487b = bVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f6482c) {
                if (ConstraintTrackingWorker.this.f6483d) {
                    ConstraintTrackingWorker.this.mo7006d();
                } else {
                    ConstraintTrackingWorker.this.f6484e.mo6991r(this.f6487b);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6481b = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo7004a() {
        return C5892i.m25998s(getApplicationContext()).mo22867w();
    }

    /* renamed from: b */
    public void mo6937b(List<String> list) {
        C1483m.m7771c().mo7013a(f6480g, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f6482c) {
            this.f6483d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7005c() {
        this.f6484e.mo6989p(ListenableWorker.C1412a.m7511a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7006d() {
        this.f6484e.mo6989p(ListenableWorker.C1412a.m7512b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7007e() {
        String j = getInputData().mo6903j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(j)) {
            C1483m.m7771c().mo7014b(f6480g, "No worker to delegate to.", new Throwable[0]);
            mo7005c();
            return;
        }
        ListenableWorker b = getWorkerFactory().mo7058b(getApplicationContext(), j, this.f6481b);
        this.f6485f = b;
        if (b == null) {
            C1483m.m7771c().mo7013a(f6480g, "No worker to delegate to.", new Throwable[0]);
            mo7005c();
            return;
        }
        C6283p n = mo7004a().mo6924j().mo23997n(getId().toString());
        if (n == null) {
            mo7005c();
            return;
        }
        C6016d dVar = new C6016d(getApplicationContext(), getTaskExecutor(), this);
        dVar.mo23146d(Collections.singletonList(n));
        if (dVar.mo23145c(getId().toString())) {
            C1483m.m7771c().mo7013a(f6480g, String.format("Constraints met for delegate %s", new Object[]{j}), new Throwable[0]);
            try {
                C10412b<ListenableWorker.C1412a> startWork = this.f6485f.startWork();
                startWork.mo6980a(new C1478b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                C1483m c = C1483m.m7771c();
                String str = f6480g;
                c.mo7013a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{j}), th);
                synchronized (this.f6482c) {
                    if (this.f6483d) {
                        C1483m.m7771c().mo7013a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo7006d();
                    } else {
                        mo7005c();
                    }
                }
            }
        } else {
            C1483m.m7771c().mo7013a(f6480g, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{j}), new Throwable[0]);
            mo7006d();
        }
    }

    /* renamed from: f */
    public void mo6939f(List<String> list) {
    }

    public C6400a getTaskExecutor() {
        return C5892i.m25998s(getApplicationContext()).mo22868x();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f6485f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f6485f;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f6485f.stop();
        }
    }

    public C10412b<ListenableWorker.C1412a> startWork() {
        getBackgroundExecutor().execute(new C1477a());
        return this.f6484e;
    }
}
