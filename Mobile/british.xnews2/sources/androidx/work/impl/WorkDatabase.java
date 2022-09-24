package androidx.work.impl;

import android.content.Context;
import androidx.room.C1198h;
import androidx.room.C1199i;
import androidx.work.impl.C1436a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p090i1.C5436b;
import p090i1.C5437c;
import p095j1.C5499c;
import p128p1.C5891h;
import p167w1.C6261b;
import p167w1.C6265e;
import p167w1.C6269h;
import p167w1.C6274k;
import p167w1.C6278n;
import p167w1.C6287q;
import p167w1.C6299t;

public abstract class WorkDatabase extends C1199i {

    /* renamed from: a */
    private static final long f6345a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C1433a implements C5437c.C5441c {

        /* renamed from: a */
        final /* synthetic */ Context f6346a;

        C1433a(Context context) {
            this.f6346a = context;
        }

        /* renamed from: a */
        public C5437c mo5959a(C5437c.C5439b bVar) {
            C5437c.C5439b.C5440a a = C5437c.C5439b.m24415a(this.f6346a);
            a.mo21905c(bVar.f23794b).mo21904b(bVar.f23795c).mo21906d(true);
            return new C5499c().mo5959a(a.mo21903a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C1434b extends C1199i.C1201b {
        C1434b() {
        }

        /* renamed from: c */
        public void mo5927c(C5436b bVar) {
            super.mo5927c(bVar);
            bVar.mo21901z();
            try {
                bVar.mo21890G(WorkDatabase.m7597e());
                bVar.mo21893O();
            } finally {
                bVar.mo21896a0();
            }
        }
    }

    /* renamed from: a */
    public static WorkDatabase m7594a(Context context, Executor executor, boolean z) {
        C1199i.C1200a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C1198h.m6593c(context, cls).mo5920c();
        } else {
            aVar = C1198h.m6591a(context, cls, C5891h.m25993d());
            aVar.mo5923f(new C1433a(context));
        }
        return aVar.mo5924g(executor).mo5918a(m7595c()).mo5919b(C1436a.f6355a).mo5919b(new C1436a.C1444h(context, 2, 3)).mo5919b(C1436a.f6356b).mo5919b(C1436a.f6357c).mo5919b(new C1436a.C1444h(context, 5, 6)).mo5919b(C1436a.f6358d).mo5919b(C1436a.f6359e).mo5919b(C1436a.f6360f).mo5919b(new C1436a.C1445i(context)).mo5919b(new C1436a.C1444h(context, 10, 11)).mo5919b(C1436a.f6361g).mo5922e().mo5921d();
    }

    /* renamed from: c */
    static C1199i.C1201b m7595c() {
        return new C1434b();
    }

    /* renamed from: d */
    static long m7596d() {
        return System.currentTimeMillis() - f6345a;
    }

    /* renamed from: e */
    static String m7597e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m7596d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: b */
    public abstract C6261b mo6919b();

    /* renamed from: f */
    public abstract C6265e mo6920f();

    /* renamed from: g */
    public abstract C6269h mo6921g();

    /* renamed from: h */
    public abstract C6274k mo6922h();

    /* renamed from: i */
    public abstract C6278n mo6923i();

    /* renamed from: j */
    public abstract C6287q mo6924j();

    /* renamed from: k */
    public abstract C6299t mo6925k();
}
