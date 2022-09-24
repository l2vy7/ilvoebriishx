package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.adcolony.sdk.AdColonyAppOptions;
import com.startapp.C11954i2;
import com.startapp.C12464z4;
import com.startapp.C5002c;
import com.startapp.C5003d;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.C5057c;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;

/* renamed from: com.startapp.sdk.adsbase.g */
/* compiled from: Sta */
public class C12291g extends C11954i2 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        startAppSDKInternal.getClass();
        boolean z2 = true;
        if (activity.getClass().getName().equals(C5015nb.m22931c((Context) activity))) {
            startAppSDKInternal.f22292x = true;
        }
        startAppSDKInternal.f22285q = bundle;
        Map<Activity, Integer> map = C5015nb.f22145a;
        C5057c cVar = C5057c.C5058a.f22344a;
        boolean equals = activity.getClass().getName().equals(C5015nb.m22931c((Context) activity));
        if (bundle == null) {
            String[] split = C5057c.class.getName().split("\\.");
            if (split.length < 3) {
                z = false;
            } else {
                z = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (!z && !equals) {
                cVar.f22342d++;
                if (cVar.f22339a && AdsCommonMetaData.f22242h.mo20879I()) {
                    if (cVar.f22340b == null) {
                        cVar.f22340b = new AutoInterstitialPreferences();
                    }
                    boolean z3 = cVar.f22341c <= 0 || System.currentTimeMillis() >= cVar.f22341c + ((long) (cVar.f22340b.getSecondsBetweenAds() * 1000));
                    int i = cVar.f22342d;
                    boolean z4 = i <= 0 || i >= cVar.f22340b.getActivitiesBetweenAds();
                    if (!z3 || !z4) {
                        z2 = false;
                    }
                    if (z2) {
                        if (cVar.f22343e == null) {
                            cVar.f22343e = new StartAppAd(activity);
                        }
                        cVar.f22343e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new C12464z4(cVar));
                    }
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        if (startAppSDKInternal.mo20980a(activity)) {
            startAppSDKInternal.f22291w = false;
        }
        if (startAppSDKInternal.f22277i.size() == 0) {
            startAppSDKInternal.f22272d = false;
        }
    }

    public void onActivityPaused(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        startAppSDKInternal.getClass();
        startAppSDKInternal.f22275g = System.currentTimeMillis();
        startAppSDKInternal.f22279k = null;
    }

    public void onActivityResumed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        if (startAppSDKInternal.f22270b && startAppSDKInternal.f22273e) {
            startAppSDKInternal.f22273e = false;
            C5059d dVar = C5059d.f22346h;
            if (!dVar.f22350d) {
                synchronized (dVar.f22347a) {
                    for (C5065h b : dVar.f22347a.values()) {
                        b.mo21058b();
                    }
                }
            }
        }
        if (startAppSDKInternal.f22280l) {
            startAppSDKInternal.f22280l = false;
            SimpleTokenUtils.m23087f(activity);
        }
        startAppSDKInternal.f22279k = activity;
    }

    public void onActivityStarted(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        boolean a = startAppSDKInternal.mo20980a(activity);
        boolean z = !startAppSDKInternal.f22291w && a && startAppSDKInternal.f22285q == null && startAppSDKInternal.f22277i.size() == 0 && StartAppSDKInternal.f22266D == StartAppSDKInternal.InitState.EXPLICIT;
        if (z) {
            ComponentLocator.m23305a((Context) activity).mo21219f().mo20653a(false, (String) null, (String) null, (String) null);
        }
        Map<Activity, Integer> map = C5015nb.f22145a;
        if (!ComponentLocator.m23305a((Context) activity).mo21219f().f22114d && !AdsCommonMetaData.f22242h.mo20882L() && !startAppSDKInternal.f22290v && !startAppSDKInternal.mo20981a("MoPub") && !startAppSDKInternal.mo20981a(AdColonyAppOptions.ADMOB) && !startAppSDKInternal.f22289u && z) {
            StartAppAd.m23092a(activity, startAppSDKInternal.f22285q, new SplashConfig(), new AdPreferences(), (SplashHideListener) null, false);
        }
        if (a) {
            startAppSDKInternal.f22292x = false;
            startAppSDKInternal.f22291w = true;
        }
        if (startAppSDKInternal.f22272d) {
            if (MetaData.f22407k.mo21188b() && startAppSDKInternal.f22288t && !AdsCommonMetaData.f22242h.mo20881K() && !startAppSDKInternal.f22282n) {
                if (System.currentTimeMillis() - startAppSDKInternal.f22275g > AdsCommonMetaData.f22242h.mo20911x()) {
                    C5068d c = C5059d.f22346h.mo21052c(startAppSDKInternal.f22287s);
                    startAppSDKInternal.f22293y = c;
                    if (c != null && c.isReady()) {
                        AdRules b = AdsCommonMetaData.f22242h.mo20888b();
                        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                        AdRulesResult a2 = b.mo21019a(placement, (String) null);
                        if (!a2.mo21025b()) {
                            C5055a.m23154a(((ReturnAd) startAppSDKInternal.f22293y).trackingUrls, (String) null, 0, a2.mo21024a());
                        } else if (startAppSDKInternal.f22293y.mo21075a((String) null)) {
                            C5003d.f22119d.mo20659a(new C5002c(placement, (String) null));
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - startAppSDKInternal.f22275g > MetaData.f22407k.mo21164F()) {
                startAppSDKInternal.mo20983b(activity, MetaDataRequest.RequestReason.APP_IDLE);
            }
        }
        startAppSDKInternal.f22274f = false;
        startAppSDKInternal.f22272d = false;
        if (startAppSDKInternal.f22277i.get(Integer.valueOf(activity.hashCode())) == null) {
            startAppSDKInternal.f22277i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r7v0, types: [android.content.Context, java.lang.Object, android.app.Activity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityStopped(android.content.Context r7) {
        /*
            r6 = this;
            com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.C5051d.f22295a
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f22277i
            int r2 = r7.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0091
            int r1 = r1.intValue()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x0032
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f22277i
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.remove(r3)
            goto L_0x003f
        L_0x0032:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r0.f22277i
            int r4 = r7.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r1)
        L_0x003f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f22277i
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0091
            boolean r1 = r0.f22274f
            if (r1 != 0) goto L_0x0050
            r0.f22272d = r2
            r0.mo20988e(r7)
        L_0x0050:
            boolean r1 = r0.f22270b
            if (r1 == 0) goto L_0x0091
            android.content.Context r1 = com.startapp.C5009h0.m22892a(r7)
            if (r1 == 0) goto L_0x005b
            r7 = r1
        L_0x005b:
            com.startapp.sdk.adsbase.cache.d r1 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            boolean r3 = r0.f22274f
            r1.getClass()
            boolean r4 = r1.f22349c     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0074
            com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.mo21039a()     // Catch:{ all -> 0x008b }
            boolean r4 = r4.mo21032f()     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0087
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r7)     // Catch:{ all -> 0x008b }
            java.util.concurrent.Executor r4 = r4.mo21222i()     // Catch:{ all -> 0x008b }
            com.startapp.b r5 = new com.startapp.b     // Catch:{ all -> 0x008b }
            r5.<init>(r1, r7)     // Catch:{ all -> 0x008b }
            r4.execute(r5)     // Catch:{ all -> 0x008b }
        L_0x0087:
            r1.mo21048a((boolean) r3)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r7)
        L_0x008f:
            r0.f22273e = r2
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C12291g.onActivityStopped(android.app.Activity):void");
    }
}
