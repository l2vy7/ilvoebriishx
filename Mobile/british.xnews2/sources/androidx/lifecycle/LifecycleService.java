package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements C0775g {

    /* renamed from: b */
    private final C0787p f3798b = new C0787p(this);

    /* renamed from: a */
    public C0769d mo639a() {
        return this.f3798b.mo4016a();
    }

    public IBinder onBind(Intent intent) {
        this.f3798b.mo4017b();
        return null;
    }

    public void onCreate() {
        this.f3798b.mo4018c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3798b.mo4019d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3798b.mo4020e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
