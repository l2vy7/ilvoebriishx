package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b0 */
/* compiled from: UserSettingsManager */
final class C3433b0 {

    /* renamed from: a */
    private static final String f12922a = "com.facebook.b0";

    /* renamed from: b */
    private static AtomicBoolean f12923b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f12924c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C3435b f12925d = new C3435b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C3435b f12926e = new C3435b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C3435b f12927f = new C3435b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C3435b f12928g = new C3435b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static SharedPreferences f12929h;

    /* renamed from: com.facebook.b0$a */
    /* compiled from: UserSettingsManager */
    static class C3434a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f12930b;

        C3434a(long j) {
            this.f12930b = j;
        }

        public void run() {
            C3520m o;
            if (C3433b0.f12927f.mo11871a() && (o = C3522n.m11809o(C3642m.m12280f(), false)) != null && o.mo11997b()) {
                C3459b h = C3459b.m11543h(C3642m.m12279e());
                if (((h == null || h.mo11917b() == null) ? null : h.mo11917b()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", h.mo11917b());
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest J = GraphRequest.m11252J((AccessToken) null, C3642m.m12280f(), (GraphRequest.C3360f) null);
                    J.mo11247b0(true);
                    J.mo11246a0(bundle);
                    JSONObject h2 = J.mo11250g().mo12381h();
                    if (h2 != null) {
                        C3433b0.f12928g.f12932b = Boolean.valueOf(h2.optBoolean("auto_event_setup_enabled", false));
                        C3433b0.f12928g.f12934d = this.f12930b;
                        C3433b0.m11500r(C3433b0.f12928g);
                    }
                }
            }
            C3433b0.f12924c.set(false);
        }
    }

    /* renamed from: com.facebook.b0$b */
    /* compiled from: UserSettingsManager */
    private static class C3435b {

        /* renamed from: a */
        String f12931a;

        /* renamed from: b */
        Boolean f12932b;

        /* renamed from: c */
        boolean f12933c;

        /* renamed from: d */
        long f12934d;

        C3435b(boolean z, String str) {
            this.f12933c = z;
            this.f12931a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11871a() {
            Boolean bool = this.f12932b;
            return bool == null ? this.f12933c : bool.booleanValue();
        }
    }

    /* renamed from: e */
    public static boolean m11487e() {
        m11492j();
        return f12927f.mo11871a();
    }

    /* renamed from: f */
    public static boolean m11488f() {
        m11492j();
        return f12925d.mo11871a();
    }

    /* renamed from: g */
    public static boolean m11489g() {
        m11492j();
        return f12926e.mo11871a();
    }

    /* renamed from: h */
    public static boolean m11490h() {
        m11492j();
        return f12928g.mo11871a();
    }

    /* renamed from: i */
    private static void m11491i() {
        m11498p(f12928g);
        long currentTimeMillis = System.currentTimeMillis();
        C3435b bVar = f12928g;
        if (bVar.f12932b == null || currentTimeMillis - bVar.f12934d >= 604800000) {
            bVar.f12932b = null;
            bVar.f12934d = 0;
            if (f12924c.compareAndSet(false, true)) {
                C3642m.m12288n().execute(new C3434a(currentTimeMillis));
            }
        }
    }

    /* renamed from: j */
    public static void m11492j() {
        if (C3642m.m12296v() && f12923b.compareAndSet(false, true)) {
            f12929h = C3642m.m12279e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            m11493k(f12926e, f12927f, f12925d);
            m11491i();
            m11497o();
            m11496n();
        }
    }

    /* renamed from: k */
    private static void m11493k(C3435b... bVarArr) {
        for (C3435b bVar : bVarArr) {
            if (bVar == f12928g) {
                m11491i();
            } else if (bVar.f12932b == null) {
                m11498p(bVar);
                if (bVar.f12932b == null) {
                    m11494l(bVar);
                }
            } else {
                m11500r(bVar);
            }
        }
    }

    /* renamed from: l */
    private static void m11494l(C3435b bVar) {
        Bundle bundle;
        m11499q();
        try {
            Context e = C3642m.m12279e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(bVar.f12931a)) {
                bVar.f12932b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.f12931a, bVar.f12933c));
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C3481f0.m11608S(f12922a, e2);
        }
    }

    /* renamed from: m */
    static void m11495m() {
        Bundle bundle;
        try {
            Context e = C3642m.m12279e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                C3420m mVar = new C3420m(e);
                Bundle bundle2 = new Bundle();
                if (!C3481f0.m11598I()) {
                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w(f12922a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                mVar.mo11845f("fb_auto_applink", bundle2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: n */
    private static void m11496n() {
        int i;
        if (f12923b.get() && C3642m.m12296v()) {
            Context e = C3642m.m12279e();
            int i2 = 0;
            int i3 = ((f12925d.mo11871a() ? 1 : 0) << false) | 0 | ((f12926e.mo11871a() ? 1 : 0) << true) | ((f12927f.mo11871a() ? 1 : 0) << true);
            int i4 = f12929h.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i4 != i3) {
                f12929h.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                try {
                    ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = {true, true, true};
                        int i5 = 0;
                        int i6 = 0;
                        i = 0;
                        while (i5 < 3) {
                            try {
                                i |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                i6 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                i5++;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        i2 = i6;
                        C3420m mVar = new C3420m(e);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        mVar.mo11848i("fb_sdk_settings_changed", bundle);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                i = 0;
                C3420m mVar2 = new C3420m(e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                mVar2.mo11848i("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    /* renamed from: o */
    private static void m11497o() {
        Bundle bundle;
        try {
            Context e = C3642m.m12279e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f12922a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f12922a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!m11487e()) {
                    Log.w(f12922a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: p */
    private static void m11498p(C3435b bVar) {
        m11499q();
        try {
            String string = f12929h.getString(bVar.f12931a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                bVar.f12932b = Boolean.valueOf(jSONObject.getBoolean("value"));
                bVar.f12934d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e) {
            C3481f0.m11608S(f12922a, e);
        }
    }

    /* renamed from: q */
    private static void m11499q() {
        if (!f12923b.get()) {
            throw new C3649n("The UserSettingManager has not been initialized successfully");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m11500r(C3435b bVar) {
        m11499q();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", bVar.f12932b);
            jSONObject.put("last_timestamp", bVar.f12934d);
            f12929h.edit().putString(bVar.f12931a, jSONObject.toString()).commit();
            m11496n();
        } catch (Exception e) {
            C3481f0.m11608S(f12922a, e);
        }
    }
}
