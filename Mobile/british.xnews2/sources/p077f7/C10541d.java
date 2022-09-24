package p077f7;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p189b5.C6509b;

/* renamed from: f7.d */
public final class C10541d {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    private static C10541d f49079e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f49080a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f49081b;
    @GuardedBy("this")

    /* renamed from: c */
    private C10543f f49082c = new C10543f(this);
    @GuardedBy("this")

    /* renamed from: d */
    private int f49083d = 1;

    private C10541d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f49081b = scheduledExecutorService;
        this.f49080a = context.getApplicationContext();
    }

    /* renamed from: c */
    private final synchronized <T> Task<T> m48278c(C10550m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f49082c.mo42663e(mVar)) {
            C10543f fVar = new C10543f(this);
            this.f49082c = fVar;
            fVar.mo42663e(mVar);
        }
        return mVar.f49098b.getTask();
    }

    /* renamed from: f */
    public static synchronized C10541d m48280f(Context context) {
        C10541d dVar;
        synchronized (C10541d.class) {
            if (f49079e == null) {
                f49079e = new C10541d(context, Executors.newSingleThreadScheduledExecutor(new C6509b("MessengerIpcClient")));
            }
            dVar = f49079e;
        }
        return dVar;
    }

    /* renamed from: g */
    private final synchronized int m48281g() {
        int i;
        i = this.f49083d;
        this.f49083d = i + 1;
        return i;
    }

    /* renamed from: b */
    public final Task<Void> mo42657b(int i, Bundle bundle) {
        return m48278c(new C10549l(m48281g(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> mo42658d(int i, Bundle bundle) {
        return m48278c(new C10552o(m48281g(), 1, bundle));
    }
}
