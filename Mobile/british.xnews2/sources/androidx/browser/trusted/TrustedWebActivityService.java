package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.C0447d;
import java.util.Locale;
import p001a0.C0038l;
import p009b.C1511b;
import p138r.C5944b;

public abstract class TrustedWebActivityService extends Service {

    /* renamed from: b */
    private NotificationManager f1763b;

    /* renamed from: c */
    int f1764c = -1;

    /* renamed from: d */
    private final C1511b.C1512a f1765d = new C0443a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    class C0443a extends C1511b.C1512a {
        C0443a() {
        }

        /* renamed from: x */
        private void m2360x() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1764c == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.mo2382c().load();
                TrustedWebActivityService.this.getPackageManager();
            }
            if (TrustedWebActivityService.this.f1764c != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        /* renamed from: E4 */
        public Bundle mo2393E4(Bundle bundle) {
            m2360x();
            C0447d.C0451d a = C0447d.C0451d.m2376a(bundle);
            return new C0447d.C0452e(TrustedWebActivityService.this.mo2389j(a.f1772a, a.f1773b, a.f1774c, a.f1775d)).mo2401a();
        }

        /* renamed from: F2 */
        public Bundle mo2394F2(String str, Bundle bundle, IBinder iBinder) {
            m2360x();
            return TrustedWebActivityService.this.mo2385f(str, bundle, C0446c.m2371a(iBinder));
        }

        /* renamed from: G3 */
        public int mo2395G3() {
            m2360x();
            return TrustedWebActivityService.this.mo2388i();
        }

        /* renamed from: P3 */
        public Bundle mo2396P3() {
            m2360x();
            return TrustedWebActivityService.this.mo2387h();
        }

        /* renamed from: W3 */
        public Bundle mo2397W3(Bundle bundle) {
            m2360x();
            return new C0447d.C0452e(TrustedWebActivityService.this.mo2383d(C0447d.C0450c.m2375a(bundle).f1771a)).mo2401a();
        }

        /* renamed from: i1 */
        public Bundle mo2398i1() {
            m2360x();
            return new C0447d.C0448a(TrustedWebActivityService.this.mo2386g()).mo2400a();
        }

        /* renamed from: x4 */
        public void mo2399x4(Bundle bundle) {
            m2360x();
            C0447d.C0449b a = C0447d.C0449b.m2374a(bundle);
            TrustedWebActivityService.this.mo2384e(a.f1769a, a.f1770b);
        }
    }

    /* renamed from: a */
    private static String m2350a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    private void m2351b() {
        if (this.f1763b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    /* renamed from: c */
    public abstract C5944b mo2382c();

    /* renamed from: d */
    public boolean mo2383d(String str) {
        m2351b();
        if (!C0038l.m149d(this).mo103a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return C0445b.m2370b(this.f1763b, m2350a(str));
    }

    /* renamed from: e */
    public void mo2384e(String str, int i) {
        m2351b();
        this.f1763b.cancel(str, i);
    }

    /* renamed from: f */
    public Bundle mo2385f(String str, Bundle bundle, C0446c cVar) {
        return null;
    }

    /* renamed from: g */
    public Parcelable[] mo2386g() {
        m2351b();
        if (Build.VERSION.SDK_INT >= 23) {
            return C0444a.m2368a(this.f1763b);
        }
        throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
    }

    /* renamed from: h */
    public Bundle mo2387h() {
        int i = mo2388i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    /* renamed from: i */
    public int mo2388i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public boolean mo2389j(String str, int i, Notification notification, String str2) {
        m2351b();
        if (!C0038l.m149d(this).mo103a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String a = m2350a(str2);
            notification = C0445b.m2369a(this, this.f1763b, notification, a, str2);
            if (!C0445b.m2370b(this.f1763b, a)) {
                return false;
            }
        }
        this.f1763b.notify(str, i, notification);
        return true;
    }

    public final IBinder onBind(Intent intent) {
        return this.f1765d;
    }

    public void onCreate() {
        super.onCreate();
        this.f1763b = (NotificationManager) getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.f1764c = -1;
        return super.onUnbind(intent);
    }
}
