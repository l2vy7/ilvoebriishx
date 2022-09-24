package p172x1;

import android.content.Context;
import androidx.work.C1427e;
import androidx.work.C1483m;
import androidx.work.C1497s;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.UUID;
import p167w1.C6277m;
import p167w1.C6283p;
import p177y1.C6400a;

/* renamed from: x1.n */
/* compiled from: WorkProgressUpdater */
public class C6373n implements C1497s {

    /* renamed from: c */
    static final String f26254c = C1483m.m7773f("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f26255a;

    /* renamed from: b */
    final C6400a f26256b;

    /* renamed from: x1.n$a */
    /* compiled from: WorkProgressUpdater */
    class C6374a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ UUID f26257b;

        /* renamed from: c */
        final /* synthetic */ C1427e f26258c;

        /* renamed from: d */
        final /* synthetic */ C1476d f26259d;

        C6374a(UUID uuid, C1427e eVar, C1476d dVar) {
            this.f26257b = uuid;
            this.f26258c = eVar;
            this.f26259d = dVar;
        }

        public void run() {
            String uuid = this.f26257b.toString();
            C1483m c = C1483m.m7771c();
            String str = C6373n.f26254c;
            c.mo7013a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f26257b, this.f26258c}), new Throwable[0]);
            C6373n.this.f26255a.beginTransaction();
            try {
                C6283p n = C6373n.this.f26255a.mo6924j().mo23997n(uuid);
                if (n != null) {
                    if (n.f25942b == C1501w.C1502a.RUNNING) {
                        C6373n.this.f26255a.mo6923i().mo23966b(new C6277m(uuid, this.f26258c));
                    } else {
                        C1483m.m7771c().mo7017h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f26259d.mo6989p(null);
                    C6373n.this.f26255a.setTransactionSuccessful();
                    C6373n.this.f26255a.endTransaction();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C6373n.this.f26255a.endTransaction();
                throw th;
            }
        }
    }

    public C6373n(WorkDatabase workDatabase, C6400a aVar) {
        this.f26255a = workDatabase;
        this.f26256b = aVar;
    }

    /* renamed from: a */
    public C10412b<Void> mo7028a(Context context, UUID uuid, C1427e eVar) {
        C1476d t = C1476d.m7752t();
        this.f26256b.mo24233b(new C6374a(uuid, eVar, t));
        return t;
    }
}
