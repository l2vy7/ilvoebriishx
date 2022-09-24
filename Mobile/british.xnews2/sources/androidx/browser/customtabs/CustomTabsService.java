package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.NoSuchElementException;
import p000a.C0000a;
import p000a.C0003b;
import p149t.C6090g;

public abstract class CustomTabsService extends Service {

    /* renamed from: b */
    final C6090g<IBinder, IBinder.DeathRecipient> f1752b = new C6090g<>();

    /* renamed from: c */
    private C0003b.C0004a f1753c = new C0438a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    class C0438a extends C0003b.C0004a {
        C0438a() {
        }

        /* renamed from: m6 */
        private PendingIntent m2325m6(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* access modifiers changed from: private */
        /* renamed from: n6 */
        public /* synthetic */ void m2326n6(C0441b bVar) {
            CustomTabsService.this.mo2359a(bVar);
        }

        /* renamed from: o6 */
        private boolean m2327o6(C0000a aVar, PendingIntent pendingIntent) {
            C0441b bVar = new C0441b(aVar, pendingIntent);
            try {
                C0440a aVar2 = new C0440a(this, bVar);
                synchronized (CustomTabsService.this.f1752b) {
                    aVar.asBinder().linkToDeath(aVar2, 0);
                    CustomTabsService.this.f1752b.put(aVar.asBinder(), aVar2);
                }
                return CustomTabsService.this.mo2362d(bVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: F0 */
        public boolean mo10F0(C0000a aVar, Uri uri) {
            return CustomTabsService.this.mo2365g(new C0441b(aVar, (PendingIntent) null), uri);
        }

        /* renamed from: a5 */
        public int mo11a5(C0000a aVar, String str, Bundle bundle) {
            return CustomTabsService.this.mo2363e(new C0441b(aVar, m2325m6(bundle)), str, bundle);
        }

        /* renamed from: c3 */
        public boolean mo12c3(long j) {
            return CustomTabsService.this.mo2368j(j);
        }

        /* renamed from: c6 */
        public boolean mo13c6(C0000a aVar, Bundle bundle) {
            return CustomTabsService.this.mo2366h(new C0441b(aVar, m2325m6(bundle)), bundle);
        }

        /* renamed from: g6 */
        public boolean mo14g6(C0000a aVar, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2367i(new C0441b(aVar, m2325m6(bundle)), i, uri, bundle);
        }

        /* renamed from: m3 */
        public boolean mo15m3(C0000a aVar, Bundle bundle) {
            return m2327o6(aVar, m2325m6(bundle));
        }

        /* renamed from: o2 */
        public Bundle mo16o2(String str, Bundle bundle) {
            return CustomTabsService.this.mo2360b(str, bundle);
        }

        /* renamed from: s4 */
        public boolean mo17s4(C0000a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo2361c(new C0441b(aVar, m2325m6(bundle)), uri, bundle, list);
        }

        /* renamed from: u5 */
        public boolean mo18u5(C0000a aVar, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2365g(new C0441b(aVar, m2325m6(bundle)), uri);
        }

        /* renamed from: v2 */
        public boolean mo19v2(C0000a aVar) {
            return m2327o6(aVar, (PendingIntent) null);
        }

        /* renamed from: y5 */
        public boolean mo20y5(C0000a aVar, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.mo2364f(new C0441b(aVar, m2325m6(bundle)), uri, i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2359a(C0441b bVar) {
        try {
            synchronized (this.f1752b) {
                IBinder a = bVar.mo2372a();
                if (a == null) {
                    return false;
                }
                a.unlinkToDeath(this.f1752b.get(a), 0);
                this.f1752b.remove(a);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Bundle mo2360b(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo2361c(C0441b bVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo2362d(C0441b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo2363e(C0441b bVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo2364f(C0441b bVar, Uri uri, int i, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo2365g(C0441b bVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo2366h(C0441b bVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo2367i(C0441b bVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo2368j(long j);

    public IBinder onBind(Intent intent) {
        return this.f1753c;
    }
}
