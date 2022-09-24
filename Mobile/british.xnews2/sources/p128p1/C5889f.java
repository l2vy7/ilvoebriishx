package p128p1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1419b;
import androidx.work.C1483m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1456f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import p140r1.C5977b;
import p167w1.C6283p;
import p167w1.C6287q;
import p172x1.C6358d;

/* renamed from: p1.f */
/* compiled from: Schedulers */
public class C5889f {

    /* renamed from: a */
    private static final String f24672a = C1483m.m7773f("Schedulers");

    /* renamed from: a */
    static C5888e m25974a(Context context, C5892i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C5977b bVar = new C5977b(context, iVar);
            C6358d.m27998a(context, SystemJobService.class, true);
            C1483m.m7771c().mo7013a(f24672a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C5888e c = m25976c(context);
        if (c != null) {
            return c;
        }
        C1456f fVar = new C1456f(context);
        C6358d.m27998a(context, SystemAlarmService.class, true);
        C1483m.m7771c().mo7013a(f24672a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: b */
    public static void m25975b(C1419b bVar, WorkDatabase workDatabase, List<C5888e> list) {
        if (list != null && list.size() != 0) {
            C6287q j = workDatabase.mo6924j();
            workDatabase.beginTransaction();
            try {
                List<C6283p> f = j.mo23989f(bVar.mo6860h());
                List<C6283p> u = j.mo24004u(200);
                if (f != null && f.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C6283p pVar : f) {
                        j.mo23986c(pVar.f25941a, currentTimeMillis);
                    }
                }
                workDatabase.setTransactionSuccessful();
                if (f != null && f.size() > 0) {
                    C6283p[] pVarArr = (C6283p[]) f.toArray(new C6283p[f.size()]);
                    for (C5888e next : list) {
                        if (next.mo6953c()) {
                            next.mo6952a(pVarArr);
                        }
                    }
                }
                if (u != null && u.size() > 0) {
                    C6283p[] pVarArr2 = (C6283p[]) u.toArray(new C6283p[u.size()]);
                    for (C5888e next2 : list) {
                        if (!next2.mo6953c()) {
                            next2.mo6952a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    /* renamed from: c */
    private static C5888e m25976c(Context context) {
        try {
            C5888e eVar = (C5888e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C1483m.m7771c().mo7013a(f24672a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            C1483m.m7771c().mo7013a(f24672a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
