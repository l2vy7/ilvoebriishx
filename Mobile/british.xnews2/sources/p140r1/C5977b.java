package p140r1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.C1483m;
import androidx.work.C1494q;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p128p1.C5888e;
import p128p1.C5892i;
import p167w1.C6268g;
import p167w1.C6283p;
import p167w1.C6287q;
import p172x1.C6357c;

/* renamed from: r1.b */
/* compiled from: SystemJobScheduler */
public class C5977b implements C5888e {

    /* renamed from: f */
    private static final String f24925f = C1483m.m7773f("SystemJobScheduler");

    /* renamed from: b */
    private final Context f24926b;

    /* renamed from: c */
    private final JobScheduler f24927c;

    /* renamed from: d */
    private final C5892i f24928d;

    /* renamed from: e */
    private final C5975a f24929e;

    public C5977b(Context context, C5892i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new C5975a(context));
    }

    /* renamed from: b */
    public static void m26342b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m26345g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m26343d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    private static void m26343d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C1483m.m7771c().mo7014b(f24925f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: f */
    private static List<Integer> m26344f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m26345g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            if (str.equals(m26346h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m26345g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C1483m.m7771c().mo7014b(f24925f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m26346h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m26347i(Context context, C5892i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m26345g(context, jobScheduler);
        List<String> a = iVar.mo22867w().mo6921g().mo23957a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                String h = m26346h(next);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m26343d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C1483m.m7771c().mo7013a(f24925f, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase w = iVar.mo22867w();
            w.beginTransaction();
            try {
                C6287q j = w.mo6924j();
                for (String c : a) {
                    j.mo23986c(c, -1);
                }
                w.setTransactionSuccessful();
            } finally {
                w.endTransaction();
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6952a(C6283p... pVarArr) {
        int i;
        List<Integer> f;
        int i2;
        WorkDatabase w = this.f24928d.mo22867w();
        C6357c cVar = new C6357c(w);
        int length = pVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C6283p pVar = pVarArr[i3];
            w.beginTransaction();
            try {
                C6283p n = w.mo6924j().mo23997n(pVar.f25941a);
                if (n == null) {
                    C1483m c = C1483m.m7771c();
                    String str = f24925f;
                    c.mo7017h(str, "Skipping scheduling " + pVar.f25941a + " because it's no longer in the DB", new Throwable[0]);
                    w.setTransactionSuccessful();
                } else if (n.f25942b != C1501w.C1502a.ENQUEUED) {
                    C1483m c2 = C1483m.m7771c();
                    String str2 = f24925f;
                    c2.mo7017h(str2, "Skipping scheduling " + pVar.f25941a + " because it is no longer enqueued", new Throwable[0]);
                    w.setTransactionSuccessful();
                } else {
                    C6268g c3 = w.mo6921g().mo23959c(pVar.f25941a);
                    if (c3 != null) {
                        i = c3.f25919b;
                    } else {
                        i = cVar.mo24185d(this.f24928d.mo22863q().mo6861i(), this.f24928d.mo22863q().mo6859g());
                    }
                    if (c3 == null) {
                        this.f24928d.mo22867w().mo6921g().mo23958b(new C6268g(pVar.f25941a, i));
                    }
                    mo23036j(pVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m26344f(this.f24926b, this.f24927c, pVar.f25941a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = f.get(0).intValue();
                        } else {
                            i2 = cVar.mo24185d(this.f24928d.mo22863q().mo6861i(), this.f24928d.mo22863q().mo6859g());
                        }
                        mo23036j(pVar, i2);
                    }
                    w.setTransactionSuccessful();
                }
                w.endTransaction();
                i3++;
            } catch (Throwable th) {
                w.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean mo6953c() {
        return true;
    }

    /* renamed from: e */
    public void mo6954e(String str) {
        List<Integer> f = m26344f(this.f24926b, this.f24927c, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m26343d(this.f24927c, intValue.intValue());
            }
            this.f24928d.mo22867w().mo6921g().mo23960d(str);
        }
    }

    /* renamed from: j */
    public void mo23036j(C6283p pVar, int i) {
        JobInfo a = this.f24929e.mo23035a(pVar, i);
        C1483m c = C1483m.m7771c();
        String str = f24925f;
        c.mo7013a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f25941a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f24927c.schedule(a) == 0) {
                C1483m.m7771c().mo7017h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f25941a}), new Throwable[0]);
                if (pVar.f25957q && pVar.f25958r == C1494q.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f25957q = false;
                    C1483m.m7771c().mo7013a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f25941a}), new Throwable[0]);
                    mo23036j(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m26345g(this.f24926b, this.f24927c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.f24928d.mo22867w().mo6924j().mo23990g().size()), Integer.valueOf(this.f24928d.mo22863q().mo6860h())});
            C1483m.m7771c().mo7014b(f24925f, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C1483m.m7771c().mo7014b(f24925f, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public C5977b(Context context, C5892i iVar, JobScheduler jobScheduler, C5975a aVar) {
        this.f24926b = context;
        this.f24928d = iVar;
        this.f24927c = jobScheduler;
        this.f24929e = aVar;
    }
}
