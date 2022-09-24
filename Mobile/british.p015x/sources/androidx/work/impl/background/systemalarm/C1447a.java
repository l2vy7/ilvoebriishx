package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.C1483m;
import androidx.work.impl.WorkDatabase;
import p129p1.C5892i;
import p168w1.C6268g;
import p168w1.C6269h;
import p173x1.C6357c;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: Alarms */
class C1447a {

    /* renamed from: a */
    private static final String f6374a = C1483m.m7773f("Alarms");

    /* renamed from: a */
    public static void m7638a(Context context, C5892i iVar, String str) {
        C6269h g = iVar.mo22867w().mo6921g();
        C6268g c = g.mo23959c(str);
        if (c != null) {
            m7639b(context, str, c.f25919b);
            C1483m.m7771c().mo7013a(f6374a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            g.mo23960d(str);
        }
    }

    /* renamed from: b */
    private static void m7639b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1448b.m7643b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            C1483m.m7771c().mo7013a(f6374a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m7640c(Context context, C5892i iVar, String str, long j) {
        WorkDatabase w = iVar.mo22867w();
        C6269h g = w.mo6921g();
        C6268g c = g.mo23959c(str);
        if (c != null) {
            m7639b(context, str, c.f25919b);
            m7641d(context, str, c.f25919b, j);
            return;
        }
        int b = new C6357c(w).mo24184b();
        g.mo23958b(new C6268g(str, b));
        m7641d(context, str, b, j);
    }

    /* renamed from: d */
    private static void m7641d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i, C1448b.m7643b(context, str), i2 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i2 >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
