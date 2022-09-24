package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import p000a.C0000a;
import p134q.C5910b;

/* renamed from: androidx.browser.customtabs.b */
/* compiled from: CustomTabsSessionToken */
public class C0441b {

    /* renamed from: a */
    final C0000a f1759a;

    /* renamed from: b */
    private final PendingIntent f1760b;

    /* renamed from: c */
    private final C5910b f1761c;

    /* renamed from: androidx.browser.customtabs.b$a */
    /* compiled from: CustomTabsSessionToken */
    class C0442a extends C5910b {
        C0442a() {
        }

        /* renamed from: a */
        public void mo2376a(String str, Bundle bundle) {
            try {
                C0441b.this.f1759a.mo5n4(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: b */
        public Bundle mo2377b(String str, Bundle bundle) {
            try {
                return C0441b.this.f1759a.mo4l2(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        /* renamed from: c */
        public void mo2378c(Bundle bundle) {
            try {
                C0441b.this.f1759a.mo1E5(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: d */
        public void mo2379d(int i, Bundle bundle) {
            try {
                C0441b.this.f1759a.mo3S4(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: e */
        public void mo2380e(String str, Bundle bundle) {
            try {
                C0441b.this.f1759a.mo6x5(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: f */
        public void mo2381f(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0441b.this.f1759a.mo2M5(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    C0441b(C0000a aVar, PendingIntent pendingIntent) {
        C0442a aVar2;
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f1759a = aVar;
        this.f1760b = pendingIntent;
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new C0442a();
        }
        this.f1761c = aVar2;
    }

    /* renamed from: b */
    private IBinder m2341b() {
        C0000a aVar = this.f1759a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo2372a() {
        C0000a aVar = this.f1759a;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PendingIntent mo2373c() {
        return this.f1760b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0441b)) {
            return false;
        }
        C0441b bVar = (C0441b) obj;
        PendingIntent c = bVar.mo2373c();
        PendingIntent pendingIntent = this.f1760b;
        boolean z = true;
        boolean z2 = pendingIntent == null;
        if (c != null) {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(c);
        }
        return m2341b().equals(bVar.m2341b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f1760b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return m2341b().hashCode();
    }
}
