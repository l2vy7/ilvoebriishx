package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.sdk.C2838l;
import com.adcolony.sdk.C2916s0;
import com.adcolony.sdk.C2978z;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.C6540C;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

public class AdColony {

    /* renamed from: a */
    static ExecutorService f10472a = Executors.newSingleThreadExecutor();

    /* renamed from: com.adcolony.sdk.AdColony$a */
    static class C2668a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10473a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f10474b;

        C2668a(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f10473a = str;
            this.f10474b = adColonyInterstitialListener;
        }

        public void run() {
            AdColonyZone adColonyZone = C2684a.m9409c().mo9691B().get(this.f10473a);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(this.f10473a);
            }
            this.f10474b.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$b */
    static class C2669b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10475a;

        /* renamed from: b */
        final /* synthetic */ AdColonyAdViewListener f10476b;

        C2669b(String str, AdColonyAdViewListener adColonyAdViewListener) {
            this.f10475a = str;
            this.f10476b = adColonyAdViewListener;
        }

        public void run() {
            AdColonyZone adColonyZone;
            if (!C2684a.m9411e()) {
                adColonyZone = null;
            } else {
                adColonyZone = C2684a.m9409c().mo9691B().get(this.f10475a);
            }
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(this.f10475a);
            }
            this.f10476b.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$c */
    static class C2670c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f10477a;

        C2670c(AdColonyInterstitial adColonyInterstitial) {
            this.f10477a = adColonyInterstitial;
        }

        public void run() {
            AdColonyInterstitialListener listener = this.f10477a.getListener();
            this.f10477a.mo9463a(true);
            if (listener != null) {
                listener.onExpiring(this.f10477a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$d */
    static class C2671d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2794i f10478a;

        C2671d(C2794i iVar) {
            this.f10478a = iVar;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            Iterator<C2784f0> it = this.f10478a.mo9729p().mo9649b().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2784f0 f0Var = (C2784f0) it2.next();
                this.f10478a.mo9706a(f0Var.mo9663d());
                if (f0Var instanceof C2951u0) {
                    C2951u0 u0Var = (C2951u0) f0Var;
                    if (!u0Var.mo10053y()) {
                        u0Var.loadUrl("about:blank");
                        u0Var.clearCache(true);
                        u0Var.removeAllViews();
                        u0Var.mo10030a(true);
                    }
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$e */
    static class C2672e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2794i f10479a;

        /* renamed from: b */
        final /* synthetic */ C2855n0 f10480b;

        /* renamed from: c */
        final /* synthetic */ AdColonySignalsListener f10481c;

        /* renamed from: com.adcolony.sdk.AdColony$e$a */
        class C2673a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f10482a;

            C2673a(String str) {
                this.f10482a = str;
            }

            public void run() {
                if (!this.f10482a.isEmpty()) {
                    C2672e.this.f10481c.onSuccess(this.f10482a);
                } else {
                    C2672e.this.f10481c.onFailure();
                }
            }
        }

        C2672e(C2794i iVar, C2855n0 n0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f10479a = iVar;
            this.f10480b = n0Var;
            this.f10481c = adColonySignalsListener;
        }

        public void run() {
            C2794i iVar = this.f10479a;
            C2916s0.m10063a((Runnable) new C2673a(AdColony.m9330b(iVar, this.f10480b, iVar.mo9737x())));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$f */
    static class C2674f implements Callable<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C2794i f10484a;

        /* renamed from: b */
        final /* synthetic */ long f10485b;

        C2674f(C2794i iVar, long j) {
            this.f10484a = iVar;
            this.f10485b = j;
        }

        /* renamed from: b */
        public JSONObject call() {
            return this.f10484a.mo9723j().mo9843a(this.f10485b);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$g */
    static class C2675g implements Callable<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C2794i f10486a;

        /* renamed from: b */
        final /* synthetic */ long f10487b;

        C2675g(C2794i iVar, long j) {
            this.f10486a = iVar;
            this.f10487b = j;
        }

        /* renamed from: b */
        public JSONObject call() {
            return this.f10486a.mo9695F() ? AdColony.m9331b(this.f10487b) : AdColony.m9334d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$h */
    static class C2676h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ double f10488a;

        /* renamed from: b */
        final /* synthetic */ String f10489b;

        /* renamed from: c */
        final /* synthetic */ String f10490c;

        /* renamed from: d */
        final /* synthetic */ String f10491d;

        C2676h(double d, String str, String str2, String str3) {
            this.f10488a = d;
            this.f10489b = str;
            this.f10490c = str2;
            this.f10491d = str3;
        }

        public void run() {
            AdColony.m9333c();
            JSONObject b = C2976x.m10319b();
            double d = this.f10488a;
            if (d >= 0.0d) {
                C2976x.m10312a(b, InAppPurchaseMetaData.KEY_PRICE, d);
            }
            String str = this.f10489b;
            if (str != null && str.length() <= 3) {
                C2976x.m10313a(b, "currency_code", this.f10489b);
            }
            C2976x.m10313a(b, "product_id", this.f10490c);
            C2976x.m10313a(b, "transaction_id", this.f10491d);
            new C2714c0("AdColony.on_iap_report", 1, b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$i */
    static class C2677i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f10492a;

        /* renamed from: b */
        final /* synthetic */ String f10493b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdSize f10494c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdOptions f10495d;

        C2677i(AdColonyAdViewListener adColonyAdViewListener, String str, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
            this.f10492a = adColonyAdViewListener;
            this.f10493b = str;
            this.f10494c = adColonyAdSize;
            this.f10495d = adColonyAdOptions;
        }

        public void run() {
            C2794i c = C2684a.m9409c();
            if (c.mo9693D() || c.mo9694E()) {
                AdColony.m9336f();
                AdColony.m9328a(this.f10492a, this.f10493b);
            }
            if (!AdColony.m9333c() && C2684a.m9410d()) {
                AdColony.m9328a(this.f10492a, this.f10493b);
            }
            c.mo9708b().mo9617a(this.f10493b, this.f10492a, this.f10494c, this.f10495d);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$j */
    static class C2678j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAppOptions f10496a;

        C2678j(AdColonyAppOptions adColonyAppOptions) {
            this.f10496a = adColonyAppOptions;
        }

        public void run() {
            AdColony.m9333c();
            JSONObject b = C2976x.m10319b();
            C2976x.m10315a(b, "options", this.f10496a.mo9413b());
            new C2714c0("Options.set_options", 1, b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$k */
    static class C2679k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f10497a;

        /* renamed from: b */
        final /* synthetic */ String f10498b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdOptions f10499c;

        /* renamed from: com.adcolony.sdk.AdColony$k$a */
        class C2680a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AdColonyZone f10500a;

            C2680a(AdColonyZone adColonyZone) {
                this.f10500a = adColonyZone;
            }

            public void run() {
                C2679k.this.f10497a.onRequestNotFilled(this.f10500a);
            }
        }

        C2679k(AdColonyInterstitialListener adColonyInterstitialListener, String str, AdColonyAdOptions adColonyAdOptions) {
            this.f10497a = adColonyInterstitialListener;
            this.f10498b = str;
            this.f10499c = adColonyAdOptions;
        }

        public void run() {
            C2794i c = C2684a.m9409c();
            if (c.mo9693D() || c.mo9694E()) {
                AdColony.m9336f();
                AdColony.m9329a(this.f10497a, this.f10498b);
            } else if (AdColony.m9333c() || !C2684a.m9410d()) {
                AdColonyZone adColonyZone = c.mo9691B().get(this.f10498b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f10498b);
                }
                if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                    C2916s0.m10063a((Runnable) new C2680a(adColonyZone));
                } else {
                    c.mo9708b().mo9618a(this.f10498b, this.f10497a, this.f10499c);
                }
            } else {
                AdColony.m9329a(this.f10497a, this.f10498b);
            }
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").mo10088a("has not yet been configured.").mo10090a(C2978z.f11947g);
            return false;
        } else if (!C2916s0.m10083e(str)) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.addCustomMessageListener.").mo10090a(C2978z.f11947g);
            return false;
        } else {
            C2684a.m9409c().mo9722i().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* renamed from: c */
    static boolean m9333c() {
        C2916s0.C2918b bVar = new C2916s0.C2918b(15.0d);
        C2794i c = C2684a.m9409c();
        while (!c.mo9696G() && !bVar.mo9980a()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
        }
        return c.mo9696G();
    }

    public static boolean clearCustomMessageListeners() {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").mo10088a(" has not yet been configured.").mo10090a(C2978z.f11947g);
            return false;
        }
        C2684a.m9409c().mo9722i().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10090a(C2978z.f11947g);
            adColonySignalsListener.onFailure();
            return;
        }
        C2794i c = C2684a.m9409c();
        try {
            f10472a.execute(new C2672e(c, c.mo9736w(), adColonySignalsListener));
        } catch (RejectedExecutionException unused) {
            adColonySignalsListener.onFailure();
        }
    }

    public static boolean configure(Activity activity, String str, String... strArr) {
        return m9327a(activity, (AdColonyAppOptions) null, str, strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static JSONObject m9334d() {
        return m9331b(-1);
    }

    public static boolean disable() {
        if (!C2684a.m9412f()) {
            return false;
        }
        Context b = C2684a.m9407b();
        if (b != null && (b instanceof C2688b)) {
            ((Activity) b).finish();
        }
        C2794i c = C2684a.m9409c();
        for (AdColonyInterstitial cVar : c.mo9708b().mo9613a().values()) {
            C2916s0.m10063a((Runnable) new C2670c(cVar));
        }
        C2916s0.m10063a((Runnable) new C2671d(c));
        C2684a.m9409c().mo9711b(true);
        return true;
    }

    /* renamed from: e */
    private static boolean m9335e() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        return C2916s0.m10074b(C2916s0.m10054a(b));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m9336f() {
        new C2978z.C2979a().mo10088a("The AdColony API is not available while AdColony is disabled.").mo10090a(C2978z.f11949i);
    }

    public static AdColonyAppOptions getAppOptions() {
        if (!C2684a.m9412f()) {
            return null;
        }
        return C2684a.m9409c().mo9733t();
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (!C2684a.m9412f()) {
            return null;
        }
        return C2684a.m9409c().mo9722i().get(str);
    }

    public static AdColonyRewardListener getRewardListener() {
        if (!C2684a.m9412f()) {
            return null;
        }
        return C2684a.m9409c().mo9735v();
    }

    public static String getSDKVersion() {
        if (!C2684a.m9412f()) {
            return "";
        }
        return C2684a.m9409c().mo9723j().mo9833D();
    }

    public static AdColonyZone getZone(String str) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").mo10088a("configured.").mo10090a(C2978z.f11947g);
            return null;
        }
        HashMap<String, AdColonyZone> B = C2684a.m9409c().mo9691B();
        if (B.containsKey(str)) {
            return B.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        C2684a.m9409c().mo9691B().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, (String) null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").mo10088a(" has not yet been configured.").mo10090a(C2978z.f11947g);
            return false;
        }
        C2684a.m9409c().mo9722i().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").mo10088a("not yet been configured.").mo10090a(C2978z.f11947g);
            return false;
        }
        C2684a.m9409c().mo9703a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, (AdColonyAdOptions) null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, (AdColonyAdOptions) null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").mo10088a(" been configured.").mo10090a(C2978z.f11947g);
            return false;
        }
        C2684a.m9409c().mo9709b(adColonyAppOptions);
        Context b = C2684a.m9407b();
        if (b != null) {
            adColonyAppOptions.mo9414b(b);
        }
        try {
            f10472a.execute(new C2678j(adColonyAppOptions));
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.setRewardListener() as AdColony has not").mo10088a(" yet been configured.").mo10090a(C2978z.f11947g);
            return false;
        }
        C2684a.m9409c().mo9703a(adColonyRewardListener);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m9330b(C2794i iVar, C2855n0 n0Var, long j) {
        JSONObject jSONObject;
        if (j > 0) {
            C2836k0 k0Var = new C2836k0();
            k0Var.mo9797a(new C2674f(iVar, j));
            k0Var.mo9797a(new C2675g(iVar, j));
            List a = k0Var.mo9795a();
            jSONObject = a.isEmpty() ? C2976x.m10319b() : C2976x.m10307a((JSONObject[]) a.toArray(new JSONObject[0]));
        } else {
            jSONObject = C2976x.m10307a(iVar.mo9723j().mo9862o(), m9334d());
        }
        JSONObject a2 = C2976x.m10307a(jSONObject, iVar.mo9733t().mo9413b(), iVar.mo9712c());
        n0Var.mo9884b();
        C2976x.m10323b(a2, "signals_count", n0Var.mo9881a());
        C2976x.m10325b(a2, "device_audio", m9335e());
        a2.remove("launch_metadata");
        try {
            return Base64.encodeToString(a2.toString().getBytes(C6540C.UTF8_NAME), 0);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m9327a(activity, adColonyAppOptions, str, strArr);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").mo10088a("configured.").mo10090a(C2978z.f11947g);
            return false;
        } else if (!C2916s0.m10083e(str) || !C2916s0.m10083e(str2)) {
            new C2978z.C2979a().mo10088a("Ignoring call to notifyIAPComplete as one of the passed Strings ").mo10088a("is greater than ").mo10086a(128).mo10088a(" characters.").mo10090a(C2978z.f11947g);
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                new C2978z.C2979a().mo10088a("You are trying to report an IAP event with a currency String ").mo10088a("containing more than 3 characters.").mo10090a(C2978z.f11947g);
            }
            try {
                f10472a.execute(new C2676h(d, str3, str, str2));
                return true;
            } catch (RejectedExecutionException e) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a("AdColony.notifyIAPComplete failed with error: " + e.toString()).mo10090a(C2978z.f11950j);
                return false;
            }
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to requestAdView as AdColony has not yet been").mo10088a(" configured.").mo10090a(C2978z.f11947g);
            m9328a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new C2978z.C2979a().mo10088a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").mo10088a(" object with an invalid width or height.").mo10090a(C2978z.f11947g);
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C2844l0.m9828a(1, bundle)) {
                m9328a(adColonyAdViewListener, str);
                return false;
            }
            try {
                f10472a.execute(new C2677i(adColonyAdViewListener, str, adColonyAdSize, adColonyAdOptions));
                return true;
            } catch (RejectedExecutionException unused) {
                m9328a(adColonyAdViewListener, str);
                return false;
            }
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.requestInterstitial as AdColony has not").mo10088a(" yet been configured.").mo10090a(C2978z.f11947g);
            adColonyInterstitialListener.onRequestNotFilled(new AdColonyZone(str));
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C2844l0.m9828a(1, bundle)) {
            AdColonyZone adColonyZone = C2684a.m9409c().mo9691B().get(str);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(str);
            }
            adColonyInterstitialListener.onRequestNotFilled(adColonyZone);
            return false;
        }
        try {
            f10472a.execute(new C2679k(adColonyInterstitialListener, str, adColonyAdOptions));
            return true;
        } catch (RejectedExecutionException unused) {
            m9329a(adColonyInterstitialListener, str);
            return false;
        }
    }

    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str, strArr);
    }

    /* renamed from: a */
    private static String m9322a(C2794i iVar, C2855n0 n0Var) {
        return m9330b(iVar, n0Var, -1);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m9327a(application, adColonyAppOptions, str, strArr);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: a */
    private static boolean m9327a(Context context, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        if (C2844l0.m9828a(0, (Bundle) null)) {
            new C2978z.C2979a().mo10088a("Cannot configure AdColony; configuration mechanism requires 5 ").mo10088a("seconds between attempts.").mo10090a(C2978z.f11947g);
            return false;
        }
        if (context == null) {
            context = C2684a.m9407b();
        }
        if (context == null) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.configure() as the provided Activity or ").mo10088a("Application context is null and we do not currently hold a ").mo10088a("reference to either for our use.").mo10090a(C2978z.f11947g);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (C2684a.m9411e() && !C2976x.m10329c(C2684a.m9409c().mo9733t().mo9413b(), "reconfigurable")) {
            C2794i c = C2684a.m9409c();
            if (!c.mo9733t().mo9412a().equals(str)) {
                new C2978z.C2979a().mo10088a("Ignoring call to AdColony.configure() as the app id does not ").mo10088a("match what was used during the initial configuration.").mo10090a(C2978z.f11947g);
                return false;
            } else if (C2916s0.m10066a(strArr, c.mo9733t().mo9415c())) {
                new C2978z.C2979a().mo10088a("Ignoring call to AdColony.configure() as the same zone ids ").mo10088a("were used during the previous configuration.").mo10090a(C2978z.f11947g);
                return true;
            }
        }
        new SimpleDateFormat("HH:mm:ss:SSS", Locale.US).format(new Date(System.currentTimeMillis()));
        boolean z = true;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !strArr[i].equals("")) {
                z = false;
            }
        }
        if (str.equals("") || z) {
            new C2978z.C2979a().mo10088a("AdColony.configure() called with an empty app or zone id String.").mo10090a(C2978z.f11949i);
            return false;
        }
        C2684a.f10585c = true;
        adColonyAppOptions.mo9410a(str);
        adColonyAppOptions.mo9411a(strArr);
        if (Build.VERSION.SDK_INT < 14) {
            new C2978z.C2979a().mo10088a("The minimum API level for the AdColony SDK is 14.").mo10090a(C2978z.f11947g);
            C2684a.m9404a(context, adColonyAppOptions, true);
        } else {
            C2684a.m9404a(context, adColonyAppOptions, false);
        }
        String str2 = C2684a.m9409c().mo9738y().mo9910f() + "/adc3/AppInfo";
        JSONObject b = C2976x.m10319b();
        if (new File(str2).exists()) {
            b = C2976x.m10328c(str2);
        }
        JSONObject b2 = C2976x.m10319b();
        if (C2976x.m10337i(b, "appId").equals(str)) {
            C2976x.m10314a(b2, "zoneIds", C2976x.m10303a(C2976x.m10318b(b, "zoneIds"), strArr, true));
            C2976x.m10313a(b2, "appId", str);
        } else {
            C2976x.m10314a(b2, "zoneIds", C2976x.m10304a(strArr));
            C2976x.m10313a(b2, "appId", str);
        }
        C2976x.m10338j(b2, str2);
        return true;
    }

    @Deprecated
    public static String collectSignals() {
        if (!C2684a.m9412f()) {
            new C2978z.C2979a().mo10088a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10090a(C2978z.f11947g);
            return "";
        }
        C2794i c = C2684a.m9409c();
        return m9322a(c, c.mo9736w());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m9331b(long j) {
        C2838l.C2840b bVar;
        JSONObject b = C2976x.m10319b();
        if (j > 0) {
            bVar = C2823i0.m9743d().mo9759a(j);
        } else {
            bVar = C2823i0.m9743d().mo9767c();
        }
        if (bVar != null) {
            C2976x.m10315a(b, "odt_payload", bVar.mo9802c());
        }
        return b;
    }

    /* renamed from: a */
    static boolean m9329a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener == null || !C2684a.m9410d()) {
            return false;
        }
        C2916s0.m10063a((Runnable) new C2668a(str, adColonyInterstitialListener));
        return false;
    }

    /* renamed from: a */
    static boolean m9328a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener == null || !C2684a.m9410d()) {
            return false;
        }
        C2916s0.m10063a((Runnable) new C2669b(str, adColonyAdViewListener));
        return false;
    }

    /* renamed from: a */
    static void m9326a(Context context, AdColonyAppOptions adColonyAppOptions) {
        C2794i c = C2684a.m9409c();
        C2849n j = c.mo9723j();
        if (adColonyAppOptions != null && context != null) {
            String c2 = C2916s0.m10076c(context);
            String c3 = C2916s0.m10075c();
            int d = C2916s0.m10078d();
            String h = j.mo9855h();
            String a = c.mo9730q().mo9664a();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", C3791bd.UNKNOWN_CONTENT_TYPE);
            hashMap.put("advertiserId", C3791bd.UNKNOWN_CONTENT_TYPE);
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", C2684a.m9409c().mo9723j().mo9858k());
            hashMap.put("manufacturer", C2684a.m9409c().mo9723j().mo9871x());
            hashMap.put("model", C2684a.m9409c().mo9723j().mo9830A());
            hashMap.put("osVersion", C2684a.m9409c().mo9723j().mo9832C());
            hashMap.put("carrierName", h);
            hashMap.put("networkType", a);
            hashMap.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            hashMap.put("appName", c2);
            hashMap.put("appVersion", c3);
            hashMap.put("appBuildNumber", Integer.valueOf(d));
            hashMap.put("appId", "" + adColonyAppOptions.mo9412a());
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("sdkVersion", C2684a.m9409c().mo9723j().mo9833D());
            hashMap.put("controllerVersion", C3791bd.UNKNOWN_CONTENT_TYPE);
            hashMap.put("zoneIds", adColonyAppOptions.mo9416d());
            JSONObject mediationInfo = adColonyAppOptions.getMediationInfo();
            JSONObject pluginInfo = adColonyAppOptions.getPluginInfo();
            if (!C2976x.m10337i(mediationInfo, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", C2976x.m10337i(mediationInfo, "mediation_network"));
                hashMap.put("mediationNetworkVersion", C2976x.m10337i(mediationInfo, "mediation_network_version"));
            }
            if (!C2976x.m10337i(pluginInfo, "plugin").equals("")) {
                hashMap.put("plugin", C2976x.m10337i(pluginInfo, "plugin"));
                hashMap.put("pluginVersion", C2976x.m10337i(pluginInfo, "plugin_version"));
            }
            c.mo9728o().mo9554a((HashMap<String, Object>) hashMap);
        }
    }
}
