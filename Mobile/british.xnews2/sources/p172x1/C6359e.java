package p172x1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p090i1.C5436b;
import p167w1.C6264d;

/* renamed from: x1.e */
/* compiled from: PreferenceUtils */
public class C6359e {

    /* renamed from: a */
    private final WorkDatabase f26214a;

    public C6359e(WorkDatabase workDatabase) {
        this.f26214a = workDatabase;
    }

    /* renamed from: b */
    public static void m27999b(Context context, C5436b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            bVar.mo21901z();
            try {
                bVar.mo21894P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                bVar.mo21894P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                bVar.mo21893O();
            } finally {
                bVar.mo21896a0();
            }
        }
    }

    /* renamed from: a */
    public boolean mo24186a() {
        Long b = this.f26214a.mo6920f().mo23953b("reschedule_needed");
        return b != null && b.longValue() == 1;
    }

    /* renamed from: c */
    public void mo24187c(boolean z) {
        this.f26214a.mo6920f().mo23952a(new C6264d("reschedule_needed", z));
    }
}
