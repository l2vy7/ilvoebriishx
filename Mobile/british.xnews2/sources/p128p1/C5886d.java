package p128p1;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0600b;
import androidx.work.C1419b;
import androidx.work.C1431h;
import androidx.work.C1483m;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1460a;
import com.google.common.util.concurrent.C10412b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p128p1.C5893j;
import p162v1.C6226a;
import p172x1.C6367k;
import p177y1.C6400a;

/* renamed from: p1.d */
/* compiled from: Processor */
public class C5886d implements C5884b, C6226a {

    /* renamed from: m */
    private static final String f24657m = C1483m.m7773f("Processor");

    /* renamed from: b */
    private PowerManager.WakeLock f24658b;

    /* renamed from: c */
    private Context f24659c;

    /* renamed from: d */
    private C1419b f24660d;

    /* renamed from: e */
    private C6400a f24661e;

    /* renamed from: f */
    private WorkDatabase f24662f;

    /* renamed from: g */
    private Map<String, C5893j> f24663g = new HashMap();

    /* renamed from: h */
    private Map<String, C5893j> f24664h = new HashMap();

    /* renamed from: i */
    private List<C5888e> f24665i;

    /* renamed from: j */
    private Set<String> f24666j;

    /* renamed from: k */
    private final List<C5884b> f24667k;

    /* renamed from: l */
    private final Object f24668l;

    /* renamed from: p1.d$a */
    /* compiled from: Processor */
    private static class C5887a implements Runnable {

        /* renamed from: b */
        private C5884b f24669b;

        /* renamed from: c */
        private String f24670c;

        /* renamed from: d */
        private C10412b<Boolean> f24671d;

        C5887a(C5884b bVar, String str, C10412b<Boolean> bVar2) {
            this.f24669b = bVar;
            this.f24670c = str;
            this.f24671d = bVar2;
        }

        public void run() {
            boolean z;
            try {
                z = this.f24671d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f24669b.mo6932d(this.f24670c, z);
        }
    }

    public C5886d(Context context, C1419b bVar, C6400a aVar, WorkDatabase workDatabase, List<C5888e> list) {
        this.f24659c = context;
        this.f24660d = bVar;
        this.f24661e = aVar;
        this.f24662f = workDatabase;
        this.f24665i = list;
        this.f24666j = new HashSet();
        this.f24667k = new ArrayList();
        this.f24658b = null;
        this.f24668l = new Object();
    }

    /* renamed from: e */
    private static boolean m25956e(String str, C5893j jVar) {
        if (jVar != null) {
            jVar.mo22871d();
            C1483m.m7771c().mo7013a(f24657m, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C1483m.m7771c().mo7013a(f24657m, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: m */
    private void m25957m() {
        synchronized (this.f24668l) {
            if (!(!this.f24663g.isEmpty())) {
                try {
                    this.f24659c.startService(C1460a.m7692e(this.f24659c));
                } catch (Throwable th) {
                    C1483m.m7771c().mo7014b(f24657m, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f24658b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f24658b = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo22831a(String str, C1431h hVar) {
        synchronized (this.f24668l) {
            C1483m.m7771c().mo7015d(f24657m, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C5893j remove = this.f24664h.remove(str);
            if (remove != null) {
                if (this.f24658b == null) {
                    PowerManager.WakeLock b = C6367k.m28012b(this.f24659c, "ProcessorForegroundLck");
                    this.f24658b = b;
                    b.acquire();
                }
                this.f24663g.put(str, remove);
                C0600b.m3301m(this.f24659c, C1460a.m7691c(this.f24659c, str, hVar));
            }
        }
    }

    /* renamed from: b */
    public void mo22832b(String str) {
        synchronized (this.f24668l) {
            this.f24663g.remove(str);
            m25957m();
        }
    }

    /* renamed from: c */
    public void mo22833c(C5884b bVar) {
        synchronized (this.f24668l) {
            this.f24667k.add(bVar);
        }
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        synchronized (this.f24668l) {
            this.f24664h.remove(str);
            C1483m.m7771c().mo7013a(f24657m, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C5884b d : this.f24667k) {
                d.mo6932d(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo22834f(String str) {
        boolean contains;
        synchronized (this.f24668l) {
            contains = this.f24666j.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean mo22835g(String str) {
        boolean z;
        synchronized (this.f24668l) {
            if (!this.f24664h.containsKey(str)) {
                if (!this.f24663g.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo22836h(String str) {
        boolean containsKey;
        synchronized (this.f24668l) {
            containsKey = this.f24663g.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void mo22837i(C5884b bVar) {
        synchronized (this.f24668l) {
            this.f24667k.remove(bVar);
        }
    }

    /* renamed from: j */
    public boolean mo22838j(String str) {
        return mo22839k(str, (WorkerParameters.C1417a) null);
    }

    /* renamed from: k */
    public boolean mo22839k(String str, WorkerParameters.C1417a aVar) {
        synchronized (this.f24668l) {
            if (mo22835g(str)) {
                C1483m.m7771c().mo7013a(f24657m, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C5893j a = new C5893j.C5896c(this.f24659c, this.f24660d, this.f24661e, this, this.f24662f, str).mo22879c(this.f24665i).mo22878b(aVar).mo22877a();
            C10412b<Boolean> b = a.mo22870b();
            b.mo6980a(new C5887a(this, str, b), this.f24661e.mo24232a());
            this.f24664h.put(str, a);
            this.f24661e.mo24234c().execute(a);
            C1483m.m7771c().mo7013a(f24657m, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo22840l(String str) {
        boolean e;
        synchronized (this.f24668l) {
            boolean z = true;
            C1483m.m7771c().mo7013a(f24657m, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f24666j.add(str);
            C5893j remove = this.f24663g.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f24664h.remove(str);
            }
            e = m25956e(str, remove);
            if (z) {
                m25957m();
            }
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo22841n(String str) {
        boolean e;
        synchronized (this.f24668l) {
            C1483m.m7771c().mo7013a(f24657m, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e = m25956e(str, this.f24663g.remove(str));
        }
        return e;
    }

    /* renamed from: o */
    public boolean mo22842o(String str) {
        boolean e;
        synchronized (this.f24668l) {
            C1483m.m7771c().mo7013a(f24657m, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e = m25956e(str, this.f24664h.remove(str));
        }
        return e;
    }
}
