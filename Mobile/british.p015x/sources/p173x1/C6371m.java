package p173x1;

import android.content.Context;
import androidx.work.C1431h;
import androidx.work.C1432i;
import androidx.work.C1483m;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1460a;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.UUID;
import p163v1.C6226a;
import p168w1.C6287q;
import p178y1.C6400a;

/* renamed from: x1.m */
/* compiled from: WorkForegroundUpdater */
public class C6371m implements C1432i {

    /* renamed from: d */
    private static final String f26245d = C1483m.m7773f("WMFgUpdater");

    /* renamed from: a */
    private final C6400a f26246a;

    /* renamed from: b */
    final C6226a f26247b;

    /* renamed from: c */
    final C6287q f26248c;

    /* renamed from: x1.m$a */
    /* compiled from: WorkForegroundUpdater */
    class C6372a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C1476d f26249b;

        /* renamed from: c */
        final /* synthetic */ UUID f26250c;

        /* renamed from: d */
        final /* synthetic */ C1431h f26251d;

        /* renamed from: e */
        final /* synthetic */ Context f26252e;

        C6372a(C1476d dVar, UUID uuid, C1431h hVar, Context context) {
            this.f26249b = dVar;
            this.f26250c = uuid;
            this.f26251d = hVar;
            this.f26252e = context;
        }

        public void run() {
            try {
                if (!this.f26249b.isCancelled()) {
                    String uuid = this.f26250c.toString();
                    C1501w.C1502a m = C6371m.this.f26248c.mo23996m(uuid);
                    if (m == null || m.mo7038d()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C6371m.this.f26247b.mo22831a(uuid, this.f26251d);
                    this.f26252e.startService(C1460a.m7690a(this.f26252e, uuid, this.f26251d));
                }
                this.f26249b.mo6989p(null);
            } catch (Throwable th) {
                this.f26249b.mo6990q(th);
            }
        }
    }

    public C6371m(WorkDatabase workDatabase, C6226a aVar, C6400a aVar2) {
        this.f26247b = aVar;
        this.f26246a = aVar2;
        this.f26248c = workDatabase.mo6924j();
    }

    /* renamed from: a */
    public C10412b<Void> mo6918a(Context context, UUID uuid, C1431h hVar) {
        C1476d t = C1476d.m7752t();
        this.f26246a.mo24233b(new C6372a(t, uuid, hVar, context));
        return t;
    }
}
