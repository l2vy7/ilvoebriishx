package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.C3752u;
import com.facebook.appevents.C3406g;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3516l;
import com.facebook.internal.C3522n;
import com.facebook.internal.C3555u;
import com.facebook.internal.C3561x;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p082g3.C5330a;

/* renamed from: com.facebook.appevents.h */
/* compiled from: AppEventsLoggerImpl */
class C3408h {

    /* renamed from: c */
    private static final String f12854c = "com.facebook.appevents.h";

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f12855d;

    /* renamed from: e */
    private static C3406g.C3407a f12856e = C3406g.C3407a.AUTO;

    /* renamed from: f */
    private static final Object f12857f = new Object();

    /* renamed from: g */
    private static String f12858g;

    /* renamed from: h */
    private static boolean f12859h;

    /* renamed from: i */
    private static String f12860i;

    /* renamed from: a */
    private final String f12861a;

    /* renamed from: b */
    private final C3387a f12862b;

    /* renamed from: com.facebook.appevents.h$a */
    /* compiled from: AppEventsLoggerImpl */
    static class C3409a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f12863b;

        /* renamed from: c */
        final /* synthetic */ C3408h f12864c;

        C3409a(Context context, C3408h hVar) {
            this.f12863b = context;
            this.f12864c = hVar;
        }

        public void run() {
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 10; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = this.f12863b.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                this.f12864c.mo11835p("fb_sdk_initialize", (Double) null, bundle);
            }
        }
    }

    /* renamed from: com.facebook.appevents.h$b */
    /* compiled from: AppEventsLoggerImpl */
    static class C3410b implements C3555u.C3557b {
        C3410b() {
        }

        /* renamed from: a */
        public void mo11840a(String str) {
            C3408h.m11414v(str);
        }
    }

    /* renamed from: com.facebook.appevents.h$c */
    /* compiled from: AppEventsLoggerImpl */
    static class C3411c implements Runnable {
        C3411c() {
        }

        public void run() {
            HashSet<String> hashSet = new HashSet<>();
            for (C3387a b : C3397e.m11384l()) {
                hashSet.add(b.mo11808b());
            }
            for (String o : hashSet) {
                C3522n.m11809o(o, true);
            }
        }
    }

    C3408h(Context context, String str, AccessToken accessToken) {
        this(C3481f0.m11648q(context), str, accessToken);
    }

    /* renamed from: a */
    static void m11402a(Application application, String str) {
        if (C3642m.m12296v()) {
            C3390b.m11357d();
            C3425p.m11459g();
            if (str == null) {
                str = C3642m.m12280f();
            }
            C3642m.m12272A(application, str);
            C5330a.m24040x(application, str);
            return;
        }
        throw new C3572j("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: b */
    static void m11403b() {
        if (m11406f() != C3406g.C3407a.EXPLICIT_ONLY) {
            C3397e.m11382j(C3417j.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: d */
    static Executor m11404d() {
        if (f12855d == null) {
            m11410j();
        }
        return f12855d;
    }

    /* renamed from: e */
    static String m11405e(Context context) {
        if (f12858g == null) {
            synchronized (f12857f) {
                if (f12858g == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                    f12858g = string;
                    if (string == null) {
                        f12858g = "XZ" + UUID.randomUUID().toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f12858g).apply();
                    }
                }
            }
        }
        return f12858g;
    }

    /* renamed from: f */
    static C3406g.C3407a m11406f() {
        C3406g.C3407a aVar;
        synchronized (f12857f) {
            aVar = f12856e;
        }
        return aVar;
    }

    /* renamed from: g */
    static String m11407g() {
        C3555u.m11879d(new C3410b());
        return C3642m.m12279e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
    }

    /* renamed from: h */
    static String m11408h() {
        String str;
        synchronized (f12857f) {
            str = f12860i;
        }
        return str;
    }

    /* renamed from: i */
    static void m11409i(Context context, String str) {
        if (C3642m.m12283i()) {
            f12855d.execute(new C3409a(context, new C3408h(context, str, (AccessToken) null)));
        }
    }

    /* renamed from: j */
    private static void m11410j() {
        synchronized (f12857f) {
            if (f12855d == null) {
                f12855d = new ScheduledThreadPoolExecutor(1);
                f12855d.scheduleAtFixedRate(new C3411c(), 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: k */
    private static void m11411k(C3392c cVar, C3387a aVar) {
        C3397e.m11380h(aVar, cVar);
        if (!cVar.mo11812b() && !f12859h) {
            if (cVar.mo11814e().equals("fb_mobile_activate_app")) {
                f12859h = true;
            } else {
                C3561x.m11893g(C3752u.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    /* renamed from: t */
    private static void m11412t(String str) {
        C3561x.m11893g(C3752u.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: u */
    static void m11413u() {
        C3397e.m11386n();
    }

    /* renamed from: v */
    static void m11414v(String str) {
        SharedPreferences sharedPreferences = C3642m.m12279e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            sharedPreferences.edit().putString("install_referrer", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11830c() {
        C3397e.m11382j(C3417j.EXPLICIT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo11831l(String str, double d, Bundle bundle) {
        mo11833n(str, Double.valueOf(d), bundle, false, C5330a.m24033q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo11832m(String str, Bundle bundle) {
        mo11833n(str, (Double) null, bundle, false, C5330a.m24033q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo11833n(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (str != null && !str.isEmpty()) {
            if (C3516l.m11769g("app_events_killswitch", C3642m.m12280f(), false)) {
                C3561x.m11894h(C3752u.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                m11411k(new C3392c(this.f12861a, str, d, bundle, z, C5330a.m24035s(), uuid), this.f12862b);
            } catch (JSONException e) {
                C3561x.m11894h(C3752u.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (C3572j e2) {
                C3561x.m11894h(C3752u.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo11834o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_is_suggested_event", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        bundle.putString("_button_text", str2);
        mo11832m(str, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo11835p(String str, Double d, Bundle bundle) {
        mo11833n(str, d, bundle, true, C5330a.m24033q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo11836q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal == null || currency == null) {
            C3481f0.m11609T(f12854c, "purchaseAmount and currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        mo11833n(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C5330a.m24033q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo11837r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m11412t("purchaseAmount cannot be null");
        } else if (currency == null) {
            m11412t("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            mo11833n("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C5330a.m24033q());
            m11403b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo11838s(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        mo11837r(bigDecimal, currency, bundle, true);
    }

    C3408h(String str, String str2, AccessToken accessToken) {
        C3489g0.m11689k();
        this.f12861a = str;
        accessToken = accessToken == null ? AccessToken.m11205h() : accessToken;
        if (accessToken == null || accessToken.mo11194u() || (str2 != null && !str2.equals(accessToken.mo11181g()))) {
            this.f12862b = new C3387a((String) null, str2 == null ? C3481f0.m11660y(C3642m.m12279e()) : str2);
        } else {
            this.f12862b = new C3387a(accessToken);
        }
        m11410j();
    }
}
