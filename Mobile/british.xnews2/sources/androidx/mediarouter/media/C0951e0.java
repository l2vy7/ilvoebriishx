package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import androidx.mediarouter.media.C0928b0;
import androidx.mediarouter.media.C0985m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: androidx.mediarouter.media.e0 */
/* compiled from: RegisteredMediaRouteProviderWatcher */
final class C0951e0 {

    /* renamed from: a */
    private final Context f4422a;

    /* renamed from: b */
    final C0954c f4423b;

    /* renamed from: c */
    private final Handler f4424c;

    /* renamed from: d */
    private final PackageManager f4425d;

    /* renamed from: e */
    private final ArrayList<C0928b0> f4426e = new ArrayList<>();

    /* renamed from: f */
    private boolean f4427f;

    /* renamed from: g */
    private final BroadcastReceiver f4428g = new C0952a();

    /* renamed from: h */
    private final Runnable f4429h = new C0953b();

    /* renamed from: androidx.mediarouter.media.e0$a */
    /* compiled from: RegisteredMediaRouteProviderWatcher */
    class C0952a extends BroadcastReceiver {
        C0952a() {
        }

        public void onReceive(Context context, Intent intent) {
            C0951e0.this.mo4524h();
        }
    }

    /* renamed from: androidx.mediarouter.media.e0$b */
    /* compiled from: RegisteredMediaRouteProviderWatcher */
    class C0953b implements Runnable {
        C0953b() {
        }

        public void run() {
            C0951e0.this.mo4524h();
        }
    }

    /* renamed from: androidx.mediarouter.media.e0$c */
    /* compiled from: RegisteredMediaRouteProviderWatcher */
    public interface C0954c {
        /* renamed from: b */
        void mo4528b(C0928b0 b0Var, C0985m.C0995e eVar);

        /* renamed from: c */
        void mo4529c(C0985m mVar);

        /* renamed from: d */
        void mo4530d(C0985m mVar);
    }

    C0951e0(Context context, C0954c cVar) {
        this.f4422a = context;
        this.f4423b = cVar;
        this.f4424c = new Handler();
        this.f4425d = context.getPackageManager();
    }

    /* renamed from: c */
    private int m4895c(String str, String str2) {
        int size = this.f4426e.size();
        for (int i = 0; i < size; i++) {
            if (this.f4426e.get(i).mo4438H(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m4897f(C0928b0 b0Var, C0985m.C0995e eVar) {
        this.f4423b.mo4528b(b0Var, eVar);
    }

    /* renamed from: g */
    static boolean m4898g(List<ServiceInfo> list, ServiceInfo serviceInfo) {
        if (!(serviceInfo == null || list == null || list.isEmpty())) {
            for (ServiceInfo next : list) {
                if (serviceInfo.packageName.equals(next.packageName) && serviceInfo.name.equals(next.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<ServiceInfo> mo4523d() {
        return (List) this.f4425d.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0).stream().map(C0949d0.f4420a).collect(Collectors.toList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4524h() {
        int i;
        if (this.f4427f) {
            List arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = mo4523d();
            }
            int i2 = 0;
            for (ResolveInfo resolveInfo : this.f4425d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && (!C1003s.m5134m() || !m4898g(arrayList, serviceInfo))) {
                    int c = m4895c(serviceInfo.packageName, serviceInfo.name);
                    if (c < 0) {
                        C0928b0 b0Var = new C0928b0(this.f4422a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        b0Var.mo4447Q(new C0947c0(this, b0Var));
                        b0Var.mo4448S();
                        i = i2 + 1;
                        this.f4426e.add(i2, b0Var);
                        this.f4423b.mo4529c(b0Var);
                    } else if (c >= i2) {
                        C0928b0 b0Var2 = this.f4426e.get(c);
                        b0Var2.mo4448S();
                        b0Var2.mo4446P();
                        i = i2 + 1;
                        Collections.swap(this.f4426e, c, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.f4426e.size()) {
                for (int size = this.f4426e.size() - 1; size >= i2; size--) {
                    C0928b0 b0Var3 = this.f4426e.get(size);
                    this.f4423b.mo4530d(b0Var3);
                    this.f4426e.remove(b0Var3);
                    b0Var3.mo4447Q((C0928b0.C0932b) null);
                    b0Var3.mo4449T();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo4525i() {
        if (!this.f4427f) {
            this.f4427f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.f4422a.registerReceiver(this.f4428g, intentFilter, (String) null, this.f4424c);
            this.f4424c.post(this.f4429h);
        }
    }
}
