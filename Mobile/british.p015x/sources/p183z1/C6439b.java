package p183z1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p003a2.C0051a;
import p202e4.C10508a;

/* renamed from: z1.b */
/* compiled from: InstallReferrerClientImpl */
class C6439b extends C6436a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f26481a = 0;

    /* renamed from: b */
    private final Context f26482b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10508a f26483c;

    /* renamed from: d */
    private ServiceConnection f26484d;

    /* renamed from: z1.b$b */
    /* compiled from: InstallReferrerClientImpl */
    private final class C6441b implements ServiceConnection {

        /* renamed from: b */
        private final C6442c f26485b;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0051a.m211a("InstallReferrerClient", "Install Referrer service connected.");
            C10508a unused = C6439b.this.f26483c = C10508a.C10509a.m48240x(iBinder);
            int unused2 = C6439b.this.f26481a = 2;
            this.f26485b.mo12075a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0051a.m212b("InstallReferrerClient", "Install Referrer service disconnected.");
            C10508a unused = C6439b.this.f26483c = null;
            int unused2 = C6439b.this.f26481a = 0;
            this.f26485b.mo12076b();
        }

        private C6441b(C6442c cVar) {
            if (cVar != null) {
                this.f26485b = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public C6439b(Context context) {
        this.f26482b = context.getApplicationContext();
    }

    /* renamed from: f */
    private boolean m28125f() {
        try {
            if (this.f26482b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C6443d mo24258a() throws RemoteException {
        if (mo24261g()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f26482b.getPackageName());
            try {
                return new C6443d(this.f26483c.mo42646N2(bundle));
            } catch (RemoteException e) {
                C0051a.m212b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f26481a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    /* renamed from: c */
    public void mo24259c(C6442c cVar) {
        ServiceInfo serviceInfo;
        if (mo24261g()) {
            C0051a.m211a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.mo12075a(0);
            return;
        }
        int i = this.f26481a;
        if (i == 1) {
            C0051a.m212b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.mo12075a(3);
        } else if (i == 3) {
            C0051a.m212b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.mo12075a(3);
        } else {
            C0051a.m211a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f26484d = new C6441b(cVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f26482b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f26481a = 0;
                C0051a.m211a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                cVar.mo12075a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !m28125f()) {
                C0051a.m212b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f26481a = 0;
                cVar.mo12075a(2);
                return;
            }
            if (this.f26482b.bindService(new Intent(intent), this.f26484d, 1)) {
                C0051a.m211a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            C0051a.m212b("InstallReferrerClient", "Connection to service is blocked.");
            this.f26481a = 0;
            cVar.mo12075a(1);
        }
    }

    /* renamed from: g */
    public boolean mo24261g() {
        return (this.f26481a != 2 || this.f26483c == null || this.f26484d == null) ? false : true;
    }
}
