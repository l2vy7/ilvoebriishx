package p172x1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p090i1.C5436b;
import p167w1.C6264d;

/* renamed from: x1.c */
/* compiled from: IdGenerator */
public class C6357c {

    /* renamed from: a */
    private final WorkDatabase f26212a;

    public C6357c(WorkDatabase workDatabase) {
        this.f26212a = workDatabase;
    }

    /* renamed from: a */
    public static void m27993a(Context context, C5436b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.mo21901z();
            try {
                bVar.mo21894P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                bVar.mo21894P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                bVar.mo21893O();
            } finally {
                bVar.mo21896a0();
            }
        }
    }

    /* renamed from: c */
    private int m27994c(String str) {
        this.f26212a.beginTransaction();
        try {
            Long b = this.f26212a.mo6920f().mo23953b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m27995e(str, i);
            this.f26212a.setTransactionSuccessful();
            return intValue;
        } finally {
            this.f26212a.endTransaction();
        }
    }

    /* renamed from: e */
    private void m27995e(String str, int i) {
        this.f26212a.mo6920f().mo23952a(new C6264d(str, (long) i));
    }

    /* renamed from: b */
    public int mo24184b() {
        int c;
        synchronized (C6357c.class) {
            c = m27994c("next_alarm_manager_id");
        }
        return c;
    }

    /* renamed from: d */
    public int mo24185d(int i, int i2) {
        synchronized (C6357c.class) {
            int c = m27994c("next_job_scheduler_id");
            if (c >= i) {
                if (c <= i2) {
                    i = c;
                }
            }
            m27995e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
