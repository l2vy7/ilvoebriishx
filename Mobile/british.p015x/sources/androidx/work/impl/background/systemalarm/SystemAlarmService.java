package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.C1483m;
import androidx.work.impl.background.systemalarm.C1451e;
import p173x1.C6367k;

public class SystemAlarmService extends LifecycleService implements C1451e.C1454c {

    /* renamed from: e */
    private static final String f6371e = C1483m.m7773f("SystemAlarmService");

    /* renamed from: c */
    private C1451e f6372c;

    /* renamed from: d */
    private boolean f6373d;

    /* renamed from: g */
    private void m7636g() {
        C1451e eVar = new C1451e(this);
        this.f6372c = eVar;
        eVar.mo6948m(this);
    }

    /* renamed from: b */
    public void mo6931b() {
        this.f6373d = true;
        C1483m.m7771c().mo7013a(f6371e, "All commands completed in dispatcher", new Throwable[0]);
        C6367k.m28011a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m7636g();
        this.f6373d = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6373d = true;
        this.f6372c.mo6946j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f6373d) {
            C1483m.m7771c().mo7015d(f6371e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f6372c.mo6946j();
            m7636g();
            this.f6373d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6372c.mo6940a(intent, i2);
        return 3;
    }
}
