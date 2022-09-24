package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.C1483m;
import androidx.work.impl.foreground.C1460a;

public class SystemForegroundService extends LifecycleService implements C1460a.C1462b {

    /* renamed from: g */
    private static final String f6416g = C1483m.m7773f("SystemFgService");

    /* renamed from: h */
    private static SystemForegroundService f6417h = null;

    /* renamed from: c */
    private Handler f6418c;

    /* renamed from: d */
    private boolean f6419d;

    /* renamed from: e */
    C1460a f6420e;

    /* renamed from: f */
    NotificationManager f6421f;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class C1457a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f6422b;

        /* renamed from: c */
        final /* synthetic */ Notification f6423c;

        /* renamed from: d */
        final /* synthetic */ int f6424d;

        C1457a(int i, Notification notification, int i2) {
            this.f6422b = i;
            this.f6423c = notification;
            this.f6424d = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f6422b, this.f6423c, this.f6424d);
            } else {
                SystemForegroundService.this.startForeground(this.f6422b, this.f6423c);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class C1458b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f6426b;

        /* renamed from: c */
        final /* synthetic */ Notification f6427c;

        C1458b(int i, Notification notification) {
            this.f6426b = i;
            this.f6427c = notification;
        }

        public void run() {
            SystemForegroundService.this.f6421f.notify(this.f6426b, this.f6427c);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class C1459c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f6429b;

        C1459c(int i) {
            this.f6429b = i;
        }

        public void run() {
            SystemForegroundService.this.f6421f.cancel(this.f6429b);
        }
    }

    /* renamed from: g */
    private void m7686g() {
        this.f6418c = new Handler(Looper.getMainLooper());
        this.f6421f = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1460a aVar = new C1460a(getApplicationContext());
        this.f6420e = aVar;
        aVar.mo6970m(this);
    }

    /* renamed from: d */
    public void mo6960d(int i, int i2, Notification notification) {
        this.f6418c.post(new C1457a(i, notification, i2));
    }

    /* renamed from: e */
    public void mo6961e(int i, Notification notification) {
        this.f6418c.post(new C1458b(i, notification));
    }

    /* renamed from: f */
    public void mo6962f(int i) {
        this.f6418c.post(new C1459c(i));
    }

    public void onCreate() {
        super.onCreate();
        f6417h = this;
        m7686g();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6420e.mo6968k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f6419d) {
            C1483m.m7771c().mo7015d(f6416g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f6420e.mo6968k();
            m7686g();
            this.f6419d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6420e.mo6969l(intent);
        return 3;
    }

    public void stop() {
        this.f6419d = true;
        C1483m.m7771c().mo7013a(f6416g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f6417h = null;
        stopSelf();
    }
}
