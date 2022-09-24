package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1483m;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p129p1.C5892i;
import p168w1.C6268g;
import p168w1.C6269h;
import p168w1.C6274k;
import p168w1.C6283p;
import p168w1.C6287q;
import p168w1.C6299t;

public class DiagnosticsWorker extends Worker {

    /* renamed from: a */
    private static final String f6489a = C1483m.m7773f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static String m7762a(C6283p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f25941a, pVar.f25943c, num, pVar.f25942b.name(), str, str2});
    }

    /* renamed from: c */
    private static String m7763c(C6274k kVar, C6299t tVar, C6269h hVar, List<C6283p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (C6283p next : list) {
            Integer num = null;
            C6268g c = hVar.mo23959c(next.f25941a);
            if (c != null) {
                num = Integer.valueOf(c.f25919b);
            }
            sb.append(m7762a(next, TextUtils.join(",", kVar.mo23963b(next.f25941a)), num, TextUtils.join(",", tVar.mo24007a(next.f25941a))));
        }
        return sb.toString();
    }

    public ListenableWorker.C1412a doWork() {
        WorkDatabase w = C5892i.m25998s(getApplicationContext()).mo22867w();
        C6287q j = w.mo6924j();
        C6274k h = w.mo6922h();
        C6299t k = w.mo6925k();
        C6269h g = w.mo6921g();
        List<C6283p> e = j.mo23988e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<C6283p> j2 = j.mo23993j();
        List<C6283p> u = j.mo24004u(200);
        if (e != null && !e.isEmpty()) {
            C1483m c = C1483m.m7771c();
            String str = f6489a;
            c.mo7015d(str, "Recently completed work:\n\n", new Throwable[0]);
            C1483m.m7771c().mo7015d(str, m7763c(h, k, g, e), new Throwable[0]);
        }
        if (j2 != null && !j2.isEmpty()) {
            C1483m c2 = C1483m.m7771c();
            String str2 = f6489a;
            c2.mo7015d(str2, "Running work:\n\n", new Throwable[0]);
            C1483m.m7771c().mo7015d(str2, m7763c(h, k, g, j2), new Throwable[0]);
        }
        if (u != null && !u.isEmpty()) {
            C1483m c3 = C1483m.m7771c();
            String str3 = f6489a;
            c3.mo7015d(str3, "Enqueued work:\n\n", new Throwable[0]);
            C1483m.m7771c().mo7015d(str3, m7763c(h, k, g, u), new Throwable[0]);
        }
        return ListenableWorker.C1412a.m7513c();
    }
}
