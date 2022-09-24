package p173x1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1431h;
import androidx.work.C1432i;
import androidx.work.C1483m;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import p090i0.C5420a;
import p168w1.C6283p;
import p178y1.C6400a;

/* renamed from: x1.l */
/* compiled from: WorkForegroundRunnable */
public class C6368l implements Runnable {

    /* renamed from: h */
    static final String f26234h = C1483m.m7773f("WorkForegroundRunnable");

    /* renamed from: b */
    final C1476d<Void> f26235b = C1476d.m7752t();

    /* renamed from: c */
    final Context f26236c;

    /* renamed from: d */
    final C6283p f26237d;

    /* renamed from: e */
    final ListenableWorker f26238e;

    /* renamed from: f */
    final C1432i f26239f;

    /* renamed from: g */
    final C6400a f26240g;

    /* renamed from: x1.l$a */
    /* compiled from: WorkForegroundRunnable */
    class C6369a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C1476d f26241b;

        C6369a(C1476d dVar) {
            this.f26241b = dVar;
        }

        public void run() {
            this.f26241b.mo6991r(C6368l.this.f26238e.getForegroundInfoAsync());
        }
    }

    /* renamed from: x1.l$b */
    /* compiled from: WorkForegroundRunnable */
    class C6370b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C1476d f26243b;

        C6370b(C1476d dVar) {
            this.f26243b = dVar;
        }

        public void run() {
            try {
                C1431h hVar = (C1431h) this.f26243b.get();
                if (hVar != null) {
                    C1483m.m7771c().mo7013a(C6368l.f26234h, String.format("Updating notification for %s", new Object[]{C6368l.this.f26237d.f25943c}), new Throwable[0]);
                    C6368l.this.f26238e.setRunInForeground(true);
                    C6368l lVar = C6368l.this;
                    lVar.f26235b.mo6991r(lVar.f26239f.mo6918a(lVar.f26236c, lVar.f26238e.getId(), hVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C6368l.this.f26237d.f25943c}));
            } catch (Throwable th) {
                C6368l.this.f26235b.mo6990q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public C6368l(Context context, C6283p pVar, ListenableWorker listenableWorker, C1432i iVar, C6400a aVar) {
        this.f26236c = context;
        this.f26237d = pVar;
        this.f26238e = listenableWorker;
        this.f26239f = iVar;
        this.f26240g = aVar;
    }

    /* renamed from: a */
    public C10412b<Void> mo24198a() {
        return this.f26235b;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f26237d.f25957q || C5420a.m24369c()) {
            this.f26235b.mo6989p(null);
            return;
        }
        C1476d t = C1476d.m7752t();
        this.f26240g.mo24232a().execute(new C6369a(t));
        t.mo6980a(new C6370b(t), this.f26240g.mo24232a());
    }
}
