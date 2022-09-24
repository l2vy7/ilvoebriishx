package p173x1;

import androidx.work.C1483m;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import p129p1.C5886d;
import p129p1.C5892i;
import p168w1.C6287q;

/* renamed from: x1.j */
/* compiled from: StopWorkRunnable */
public class C6366j implements Runnable {

    /* renamed from: e */
    private static final String f26228e = C1483m.m7773f("StopWorkRunnable");

    /* renamed from: b */
    private final C5892i f26229b;

    /* renamed from: c */
    private final String f26230c;

    /* renamed from: d */
    private final boolean f26231d;

    public C6366j(C5892i iVar, String str, boolean z) {
        this.f26229b = iVar;
        this.f26230c = str;
        this.f26231d = z;
    }

    public void run() {
        boolean z;
        WorkDatabase w = this.f26229b.mo22867w();
        C5886d u = this.f26229b.mo22865u();
        C6287q j = w.mo6924j();
        w.beginTransaction();
        try {
            boolean h = u.mo22836h(this.f26230c);
            if (this.f26231d) {
                z = this.f26229b.mo22865u().mo22841n(this.f26230c);
            } else {
                if (!h && j.mo23996m(this.f26230c) == C1501w.C1502a.RUNNING) {
                    j.mo23985b(C1501w.C1502a.ENQUEUED, this.f26230c);
                }
                z = this.f26229b.mo22865u().mo22842o(this.f26230c);
            }
            C1483m.m7771c().mo7013a(f26228e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f26230c, Boolean.valueOf(z)}), new Throwable[0]);
            w.setTransactionSuccessful();
        } finally {
            w.endTransaction();
        }
    }
}
