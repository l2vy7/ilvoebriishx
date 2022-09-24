package p136q1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1419b;
import androidx.work.C1483m;
import androidx.work.C1501w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p129p1.C5884b;
import p129p1.C5888e;
import p129p1.C5892i;
import p146s1.C6015c;
import p146s1.C6016d;
import p168w1.C6283p;
import p173x1.C6360f;
import p178y1.C6400a;

/* renamed from: q1.b */
/* compiled from: GreedyScheduler */
public class C5937b implements C5888e, C6015c, C5884b {

    /* renamed from: j */
    private static final String f24852j = C1483m.m7773f("GreedyScheduler");

    /* renamed from: b */
    private final Context f24853b;

    /* renamed from: c */
    private final C5892i f24854c;

    /* renamed from: d */
    private final C6016d f24855d;

    /* renamed from: e */
    private final Set<C6283p> f24856e = new HashSet();

    /* renamed from: f */
    private C5935a f24857f;

    /* renamed from: g */
    private boolean f24858g;

    /* renamed from: h */
    private final Object f24859h;

    /* renamed from: i */
    Boolean f24860i;

    public C5937b(Context context, C1419b bVar, C6400a aVar, C5892i iVar) {
        this.f24853b = context;
        this.f24854c = iVar;
        this.f24855d = new C6016d(context, aVar, this);
        this.f24857f = new C5935a(this, bVar.mo6863k());
        this.f24859h = new Object();
    }

    /* renamed from: g */
    private void m26227g() {
        this.f24860i = Boolean.valueOf(C6360f.m28003b(this.f24853b, this.f24854c.mo22863q()));
    }

    /* renamed from: h */
    private void m26228h() {
        if (!this.f24858g) {
            this.f24854c.mo22865u().mo22833c(this);
            this.f24858g = true;
        }
    }

    /* renamed from: i */
    private void m26229i(String str) {
        synchronized (this.f24859h) {
            Iterator<C6283p> it = this.f24856e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6283p next = it.next();
                if (next.f25941a.equals(str)) {
                    C1483m.m7771c().mo7013a(f24852j, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f24856e.remove(next);
                    this.f24855d.mo23146d(this.f24856e);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6952a(C6283p... pVarArr) {
        if (this.f24860i == null) {
            m26227g();
        }
        if (!this.f24860i.booleanValue()) {
            C1483m.m7771c().mo7015d(f24852j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m26228h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C6283p pVar : pVarArr) {
            long a = pVar.mo23969a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f25942b == C1501w.C1502a.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C5935a aVar = this.f24857f;
                    if (aVar != null) {
                        aVar.mo22971a(pVar);
                    }
                } else if (pVar.mo23970b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && pVar.f25950j.mo6877h()) {
                        C1483m.m7771c().mo7013a(f24852j, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i < 24 || !pVar.f25950j.mo6873e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f25941a);
                    } else {
                        C1483m.m7771c().mo7013a(f24852j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    C1483m.m7771c().mo7013a(f24852j, String.format("Starting work for %s", new Object[]{pVar.f25941a}), new Throwable[0]);
                    this.f24854c.mo22855C(pVar.f25941a);
                }
            }
        }
        synchronized (this.f24859h) {
            if (!hashSet.isEmpty()) {
                C1483m.m7771c().mo7013a(f24852j, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f24856e.addAll(hashSet);
                this.f24855d.mo23146d(this.f24856e);
            }
        }
    }

    /* renamed from: b */
    public void mo6937b(List<String> list) {
        for (String next : list) {
            C1483m.m7771c().mo7013a(f24852j, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f24854c.mo22858F(next);
        }
    }

    /* renamed from: c */
    public boolean mo6953c() {
        return false;
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        m26229i(str);
    }

    /* renamed from: e */
    public void mo6954e(String str) {
        if (this.f24860i == null) {
            m26227g();
        }
        if (!this.f24860i.booleanValue()) {
            C1483m.m7771c().mo7015d(f24852j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m26228h();
        C1483m.m7771c().mo7013a(f24852j, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C5935a aVar = this.f24857f;
        if (aVar != null) {
            aVar.mo22972b(str);
        }
        this.f24854c.mo22858F(str);
    }

    /* renamed from: f */
    public void mo6939f(List<String> list) {
        for (String next : list) {
            C1483m.m7771c().mo7013a(f24852j, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f24854c.mo22855C(next);
        }
    }
}
