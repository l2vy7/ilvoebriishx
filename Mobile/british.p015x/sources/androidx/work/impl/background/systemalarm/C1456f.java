package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.C1483m;
import p129p1.C5888e;
import p168w1.C6283p;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: SystemAlarmScheduler */
public class C1456f implements C5888e {

    /* renamed from: c */
    private static final String f6410c = C1483m.m7773f("SystemAlarmScheduler");

    /* renamed from: b */
    private final Context f6411b;

    public C1456f(Context context) {
        this.f6411b = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m7680b(C6283p pVar) {
        C1483m.m7771c().mo7013a(f6410c, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f25941a}), new Throwable[0]);
        this.f6411b.startService(C1448b.m7646f(this.f6411b, pVar.f25941a));
    }

    /* renamed from: a */
    public void mo6952a(C6283p... pVarArr) {
        for (C6283p b : pVarArr) {
            m7680b(b);
        }
    }

    /* renamed from: c */
    public boolean mo6953c() {
        return true;
    }

    /* renamed from: e */
    public void mo6954e(String str) {
        this.f6411b.startService(C1448b.m7647g(this.f6411b, str));
    }
}
