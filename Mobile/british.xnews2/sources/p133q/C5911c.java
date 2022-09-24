package p133q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p000a.C0000a;
import p000a.C0003b;

/* renamed from: q.c */
/* compiled from: CustomTabsClient */
public class C5911c {

    /* renamed from: a */
    private final C0003b f24764a;

    /* renamed from: b */
    private final ComponentName f24765b;

    /* renamed from: c */
    private final Context f24766c;

    /* renamed from: q.c$a */
    /* compiled from: CustomTabsClient */
    class C5912a extends C0000a.C0001a {

        /* renamed from: b */
        private Handler f24767b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        final /* synthetic */ C5910b f24768c;

        /* renamed from: q.c$a$a */
        /* compiled from: CustomTabsClient */
        class C5913a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f24770b;

            /* renamed from: c */
            final /* synthetic */ Bundle f24771c;

            C5913a(int i, Bundle bundle) {
                this.f24770b = i;
                this.f24771c = bundle;
            }

            public void run() {
                C5912a.this.f24768c.mo2379d(this.f24770b, this.f24771c);
            }
        }

        /* renamed from: q.c$a$b */
        /* compiled from: CustomTabsClient */
        class C5914b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f24773b;

            /* renamed from: c */
            final /* synthetic */ Bundle f24774c;

            C5914b(String str, Bundle bundle) {
                this.f24773b = str;
                this.f24774c = bundle;
            }

            public void run() {
                C5912a.this.f24768c.mo2376a(this.f24773b, this.f24774c);
            }
        }

        /* renamed from: q.c$a$c */
        /* compiled from: CustomTabsClient */
        class C5915c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Bundle f24776b;

            C5915c(Bundle bundle) {
                this.f24776b = bundle;
            }

            public void run() {
                C5912a.this.f24768c.mo2378c(this.f24776b);
            }
        }

        /* renamed from: q.c$a$d */
        /* compiled from: CustomTabsClient */
        class C5916d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f24778b;

            /* renamed from: c */
            final /* synthetic */ Bundle f24779c;

            C5916d(String str, Bundle bundle) {
                this.f24778b = str;
                this.f24779c = bundle;
            }

            public void run() {
                C5912a.this.f24768c.mo2380e(this.f24778b, this.f24779c);
            }
        }

        /* renamed from: q.c$a$e */
        /* compiled from: CustomTabsClient */
        class C5917e implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f24781b;

            /* renamed from: c */
            final /* synthetic */ Uri f24782c;

            /* renamed from: d */
            final /* synthetic */ boolean f24783d;

            /* renamed from: e */
            final /* synthetic */ Bundle f24784e;

            C5917e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f24781b = i;
                this.f24782c = uri;
                this.f24783d = z;
                this.f24784e = bundle;
            }

            public void run() {
                C5912a.this.f24768c.mo2381f(this.f24781b, this.f24782c, this.f24783d, this.f24784e);
            }
        }

        C5912a(C5910b bVar) {
            this.f24768c = bVar;
        }

        /* renamed from: E5 */
        public void mo1E5(Bundle bundle) throws RemoteException {
            if (this.f24768c != null) {
                this.f24767b.post(new C5915c(bundle));
            }
        }

        /* renamed from: M5 */
        public void mo2M5(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f24768c != null) {
                this.f24767b.post(new C5917e(i, uri, z, bundle));
            }
        }

        /* renamed from: S4 */
        public void mo3S4(int i, Bundle bundle) {
            if (this.f24768c != null) {
                this.f24767b.post(new C5913a(i, bundle));
            }
        }

        /* renamed from: l2 */
        public Bundle mo4l2(String str, Bundle bundle) throws RemoteException {
            C5910b bVar = this.f24768c;
            if (bVar == null) {
                return null;
            }
            return bVar.mo2377b(str, bundle);
        }

        /* renamed from: n4 */
        public void mo5n4(String str, Bundle bundle) throws RemoteException {
            if (this.f24768c != null) {
                this.f24767b.post(new C5914b(str, bundle));
            }
        }

        /* renamed from: x5 */
        public void mo6x5(String str, Bundle bundle) throws RemoteException {
            if (this.f24768c != null) {
                this.f24767b.post(new C5916d(str, bundle));
            }
        }
    }

    C5911c(C0003b bVar, ComponentName componentName, Context context) {
        this.f24764a = bVar;
        this.f24765b = componentName;
        this.f24766c = context;
    }

    /* renamed from: a */
    public static boolean m26081a(Context context, String str, C5920e eVar) {
        eVar.mo22913b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    /* renamed from: b */
    private C0000a.C0001a m26082b(C5910b bVar) {
        return new C5912a(bVar);
    }

    /* renamed from: d */
    private C5922f m26083d(C5910b bVar, PendingIntent pendingIntent) {
        boolean z;
        C0000a.C0001a b = m26082b(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z = this.f24764a.mo15m3(b, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z = this.f24764a.mo19v2(b);
        }
        if (!z) {
            return null;
        }
        return new C5922f(this.f24764a, b, this.f24765b, pendingIntent);
    }

    /* renamed from: c */
    public C5922f mo22901c(C5910b bVar) {
        return m26083d(bVar, (PendingIntent) null);
    }

    /* renamed from: e */
    public boolean mo22902e(long j) {
        try {
            return this.f24764a.mo12c3(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
