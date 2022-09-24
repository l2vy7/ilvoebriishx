package p135q1;

import androidx.work.C1483m;
import androidx.work.C1499u;
import java.util.HashMap;
import java.util.Map;
import p167w1.C6283p;

/* renamed from: q1.a */
/* compiled from: DelayedWorkTracker */
public class C5935a {

    /* renamed from: d */
    static final String f24846d = C1483m.m7773f("DelayedWorkTracker");

    /* renamed from: a */
    final C5937b f24847a;

    /* renamed from: b */
    private final C1499u f24848b;

    /* renamed from: c */
    private final Map<String, Runnable> f24849c = new HashMap();

    /* renamed from: q1.a$a */
    /* compiled from: DelayedWorkTracker */
    class C5936a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C6283p f24850b;

        C5936a(C6283p pVar) {
            this.f24850b = pVar;
        }

        public void run() {
            C1483m.m7771c().mo7013a(C5935a.f24846d, String.format("Scheduling work %s", new Object[]{this.f24850b.f25941a}), new Throwable[0]);
            C5935a.this.f24847a.mo6952a(this.f24850b);
        }
    }

    public C5935a(C5937b bVar, C1499u uVar) {
        this.f24847a = bVar;
        this.f24848b = uVar;
    }

    /* renamed from: a */
    public void mo22971a(C6283p pVar) {
        Runnable remove = this.f24849c.remove(pVar.f25941a);
        if (remove != null) {
            this.f24848b.mo7030b(remove);
        }
        C5936a aVar = new C5936a(pVar);
        this.f24849c.put(pVar.f25941a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f24848b.mo7029a(pVar.mo23969a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo22972b(String str) {
        Runnable remove = this.f24849c.remove(str);
        if (remove != null) {
            this.f24848b.mo7030b(remove);
        }
    }
}
