package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C1483m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1451e;
import java.util.HashMap;
import java.util.Map;
import p128p1.C5884b;
import p167w1.C6283p;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: CommandHandler */
public class C1448b implements C5884b {

    /* renamed from: e */
    private static final String f6375e = C1483m.m7773f("CommandHandler");

    /* renamed from: b */
    private final Context f6376b;

    /* renamed from: c */
    private final Map<String, C5884b> f6377c = new HashMap();

    /* renamed from: d */
    private final Object f6378d = new Object();

    C1448b(Context context) {
        this.f6376b = context;
    }

    /* renamed from: a */
    static Intent m7642a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m7643b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m7644c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    static Intent m7645e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m7646f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m7647g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m7648h(Intent intent, int i, C1451e eVar) {
        C1483m.m7771c().mo7013a(f6375e, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1449c(this.f6376b, i, eVar).mo6935a();
    }

    /* renamed from: i */
    private void m7649i(Intent intent, int i, C1451e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f6378d) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C1483m c = C1483m.m7771c();
            String str = f6375e;
            c.mo7013a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f6377c.containsKey(string)) {
                C1450d dVar = new C1450d(this.f6376b, i, string, eVar);
                this.f6377c.put(string, dVar);
                dVar.mo6938e();
            } else {
                C1483m.m7771c().mo7013a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: j */
    private void m7650j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C1483m.m7771c().mo7013a(f6375e, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo6932d(string, z);
    }

    /* renamed from: k */
    private void m7651k(Intent intent, int i, C1451e eVar) {
        C1483m.m7771c().mo7013a(f6375e, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo6944g().mo22853A();
    }

    /* renamed from: l */
    private void m7652l(Intent intent, int i, C1451e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1483m c = C1483m.m7771c();
        String str = f6375e;
        c.mo7013a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase w = eVar.mo6944g().mo22867w();
        w.beginTransaction();
        try {
            C6283p n = w.mo6924j().mo23997n(string);
            if (n == null) {
                C1483m c2 = C1483m.m7771c();
                c2.mo7017h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (n.f25942b.mo7038d()) {
                C1483m c3 = C1483m.m7771c();
                c3.mo7017h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                w.endTransaction();
            } else {
                long a = n.mo23969a();
                if (!n.mo23970b()) {
                    C1483m.m7771c().mo7013a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1447a.m7640c(this.f6376b, eVar.mo6944g(), string, a);
                } else {
                    C1483m.m7771c().mo7013a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1447a.m7640c(this.f6376b, eVar.mo6944g(), string, a);
                    eVar.mo6947k(new C1451e.C1453b(eVar, m7642a(this.f6376b), i));
                }
                w.setTransactionSuccessful();
                w.endTransaction();
            }
        } finally {
            w.endTransaction();
        }
    }

    /* renamed from: m */
    private void m7653m(Intent intent, C1451e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1483m.m7771c().mo7013a(f6375e, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo6944g().mo22858F(string);
        C1447a.m7638a(this.f6376b, eVar.mo6944g(), string);
        eVar.mo6932d(string, false);
    }

    /* renamed from: n */
    private static boolean m7654n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        synchronized (this.f6378d) {
            C5884b remove = this.f6377c.remove(str);
            if (remove != null) {
                remove.mo6932d(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo6933o() {
        boolean z;
        synchronized (this.f6378d) {
            z = !this.f6377c.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6934p(Intent intent, int i, C1451e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m7648h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m7651k(intent, i, eVar);
        } else if (!m7654n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C1483m.m7771c().mo7014b(f6375e, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m7652l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m7649i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m7653m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m7650j(intent, i);
        } else {
            C1483m.m7771c().mo7017h(f6375e, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
