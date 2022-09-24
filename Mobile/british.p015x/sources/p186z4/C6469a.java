package p186z4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7413n1;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p006a5.C6492o;
import p193c5.C6520c;

/* renamed from: z4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6469a {

    /* renamed from: b */
    private static final Object f26551b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C6469a f26552c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f26553a = new ConcurrentHashMap<>();

    private C6469a() {
    }

    /* renamed from: b */
    public static C6469a m28199b() {
        if (f26552c == null) {
            synchronized (f26551b) {
                if (f26552c == null) {
                    f26552c = new C6469a();
                }
            }
        }
        C6469a aVar = f26552c;
        C4604n.m20098k(aVar);
        return aVar;
    }

    /* renamed from: e */
    private static void m28200e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m28201f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C6520c.m28321a(context).mo24352c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m28202g(serviceConnection)) {
            return m28203h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection putIfAbsent = this.f26553a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m28203h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f26553a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m28202g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C7413n1);
    }

    /* renamed from: h */
    private static final boolean m28203h(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        if (!C6492o.m28289l() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo24298a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m28201f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo24299c(Context context, ServiceConnection serviceConnection) {
        if (!m28202g(serviceConnection) || !this.f26553a.containsKey(serviceConnection)) {
            m28200e(context, serviceConnection);
            return;
        }
        try {
            m28200e(context, this.f26553a.get(serviceConnection));
        } finally {
            this.f26553a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo24300d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return m28201f(context, str, intent, serviceConnection, i, true, executor);
    }
}
