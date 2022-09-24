package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C1483m;
import androidx.work.impl.background.systemalarm.C1451e;
import java.util.Collections;
import java.util.List;
import p128p1.C5884b;
import p145s1.C6015c;
import p145s1.C6016d;
import p167w1.C6283p;
import p172x1.C6367k;
import p172x1.C6375o;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: DelayMetCommandHandler */
public class C1450d implements C6015c, C5884b, C6375o.C6377b {

    /* renamed from: k */
    private static final String f6384k = C1483m.m7773f("DelayMetCommandHandler");

    /* renamed from: b */
    private final Context f6385b;

    /* renamed from: c */
    private final int f6386c;

    /* renamed from: d */
    private final String f6387d;

    /* renamed from: e */
    private final C1451e f6388e;

    /* renamed from: f */
    private final C6016d f6389f;

    /* renamed from: g */
    private final Object f6390g = new Object();

    /* renamed from: h */
    private int f6391h = 0;

    /* renamed from: i */
    private PowerManager.WakeLock f6392i;

    /* renamed from: j */
    private boolean f6393j = false;

    C1450d(Context context, int i, String str, C1451e eVar) {
        this.f6385b = context;
        this.f6386c = i;
        this.f6388e = eVar;
        this.f6387d = str;
        this.f6389f = new C6016d(context, eVar.mo6943f(), this);
    }

    /* renamed from: c */
    private void m7659c() {
        synchronized (this.f6390g) {
            this.f6389f.mo23147e();
            this.f6388e.mo6945h().mo24206c(this.f6387d);
            PowerManager.WakeLock wakeLock = this.f6392i;
            if (wakeLock != null && wakeLock.isHeld()) {
                C1483m.m7771c().mo7013a(f6384k, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f6392i, this.f6387d}), new Throwable[0]);
                this.f6392i.release();
            }
        }
    }

    /* renamed from: g */
    private void m7660g() {
        synchronized (this.f6390g) {
            if (this.f6391h < 2) {
                this.f6391h = 2;
                C1483m c = C1483m.m7771c();
                String str = f6384k;
                c.mo7013a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f6387d}), new Throwable[0]);
                Intent g = C1448b.m7647g(this.f6385b, this.f6387d);
                C1451e eVar = this.f6388e;
                eVar.mo6947k(new C1451e.C1453b(eVar, g, this.f6386c));
                if (this.f6388e.mo6942e().mo22835g(this.f6387d)) {
                    C1483m.m7771c().mo7013a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f6387d}), new Throwable[0]);
                    Intent f = C1448b.m7646f(this.f6385b, this.f6387d);
                    C1451e eVar2 = this.f6388e;
                    eVar2.mo6947k(new C1451e.C1453b(eVar2, f, this.f6386c));
                } else {
                    C1483m.m7771c().mo7013a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f6387d}), new Throwable[0]);
                }
            } else {
                C1483m.m7771c().mo7013a(f6384k, String.format("Already stopped work for %s", new Object[]{this.f6387d}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo6936a(String str) {
        C1483m.m7771c().mo7013a(f6384k, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m7660g();
    }

    /* renamed from: b */
    public void mo6937b(List<String> list) {
        m7660g();
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        C1483m.m7771c().mo7013a(f6384k, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m7659c();
        if (z) {
            Intent f = C1448b.m7646f(this.f6385b, this.f6387d);
            C1451e eVar = this.f6388e;
            eVar.mo6947k(new C1451e.C1453b(eVar, f, this.f6386c));
        }
        if (this.f6393j) {
            Intent a = C1448b.m7642a(this.f6385b);
            C1451e eVar2 = this.f6388e;
            eVar2.mo6947k(new C1451e.C1453b(eVar2, a, this.f6386c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6938e() {
        this.f6392i = C6367k.m28012b(this.f6385b, String.format("%s (%s)", new Object[]{this.f6387d, Integer.valueOf(this.f6386c)}));
        C1483m c = C1483m.m7771c();
        String str = f6384k;
        c.mo7013a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f6392i, this.f6387d}), new Throwable[0]);
        this.f6392i.acquire();
        C6283p n = this.f6388e.mo6944g().mo22867w().mo6924j().mo23997n(this.f6387d);
        if (n == null) {
            m7660g();
            return;
        }
        boolean b = n.mo23970b();
        this.f6393j = b;
        if (!b) {
            C1483m.m7771c().mo7013a(str, String.format("No constraints for %s", new Object[]{this.f6387d}), new Throwable[0]);
            mo6939f(Collections.singletonList(this.f6387d));
            return;
        }
        this.f6389f.mo23146d(Collections.singletonList(n));
    }

    /* renamed from: f */
    public void mo6939f(List<String> list) {
        if (list.contains(this.f6387d)) {
            synchronized (this.f6390g) {
                if (this.f6391h == 0) {
                    this.f6391h = 1;
                    C1483m.m7771c().mo7013a(f6384k, String.format("onAllConstraintsMet for %s", new Object[]{this.f6387d}), new Throwable[0]);
                    if (this.f6388e.mo6942e().mo22838j(this.f6387d)) {
                        this.f6388e.mo6945h().mo24205b(this.f6387d, 600000, this);
                    } else {
                        m7659c();
                    }
                } else {
                    C1483m.m7771c().mo7013a(f6384k, String.format("Already started work for %s", new Object[]{this.f6387d}), new Throwable[0]);
                }
            }
        }
    }
}
