package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.browser.trusted.d */
/* compiled from: TrustedWebActivityServiceConnection */
public final class C0447d {

    /* renamed from: androidx.browser.trusted.d$a */
    /* compiled from: TrustedWebActivityServiceConnection */
    static class C0448a {

        /* renamed from: a */
        public final Parcelable[] f1768a;

        C0448a(Parcelable[] parcelableArr) {
            this.f1768a = parcelableArr;
        }

        /* renamed from: a */
        public Bundle mo2400a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f1768a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.d$b */
    /* compiled from: TrustedWebActivityServiceConnection */
    static class C0449b {

        /* renamed from: a */
        public final String f1769a;

        /* renamed from: b */
        public final int f1770b;

        C0449b(String str, int i) {
            this.f1769a = str;
            this.f1770b = i;
        }

        /* renamed from: a */
        public static C0449b m2374a(Bundle bundle) {
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new C0449b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$c */
    /* compiled from: TrustedWebActivityServiceConnection */
    static class C0450c {

        /* renamed from: a */
        public final String f1771a;

        C0450c(String str) {
            this.f1771a = str;
        }

        /* renamed from: a */
        public static C0450c m2375a(Bundle bundle) {
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C0450c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$d */
    /* compiled from: TrustedWebActivityServiceConnection */
    static class C0451d {

        /* renamed from: a */
        public final String f1772a;

        /* renamed from: b */
        public final int f1773b;

        /* renamed from: c */
        public final Notification f1774c;

        /* renamed from: d */
        public final String f1775d;

        C0451d(String str, int i, Notification notification, String str2) {
            this.f1772a = str;
            this.f1773b = i;
            this.f1774c = notification;
            this.f1775d = str2;
        }

        /* renamed from: a */
        public static C0451d m2376a(Bundle bundle) {
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            C0447d.m2372a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C0451d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$e */
    /* compiled from: TrustedWebActivityServiceConnection */
    static class C0452e {

        /* renamed from: a */
        public final boolean f1776a;

        C0452e(boolean z) {
            this.f1776a = z;
        }

        /* renamed from: a */
        public Bundle mo2401a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f1776a);
            return bundle;
        }
    }

    /* renamed from: a */
    static void m2372a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain " + str);
        }
    }
}
