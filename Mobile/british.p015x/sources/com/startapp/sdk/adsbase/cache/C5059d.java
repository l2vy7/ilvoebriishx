package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.C11882e4;
import com.startapp.C12103o1;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.sdk.adsbase.cache.d */
/* compiled from: Sta */
public class C5059d {

    /* renamed from: h */
    public static C5059d f22346h = new C5059d();

    /* renamed from: a */
    public final Map<CacheKey, C5065h> f22347a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, String> f22348b = new WeakHashMap();

    /* renamed from: c */
    public boolean f22349c = false;

    /* renamed from: d */
    public boolean f22350d = false;

    /* renamed from: e */
    public Queue<C5064e> f22351e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public C5065h.C5067b f22352f;

    /* renamed from: g */
    public Context f22353g;

    /* renamed from: com.startapp.sdk.adsbase.cache.d$d */
    /* compiled from: Sta */
    public interface C5060d {
        /* renamed from: a */
        void mo20975a(C5041Ad ad, CacheKey cacheKey, boolean z);
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$a */
    /* compiled from: Sta */
    public class C5061a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ C5060d f22354a;

        /* renamed from: b */
        public final /* synthetic */ CacheKey f22355b;

        public C5061a(C5059d dVar, C5060d dVar2, CacheKey cacheKey) {
            this.f22354a = dVar2;
            this.f22355b = cacheKey;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            C5060d dVar = this.f22354a;
            if (dVar != null) {
                dVar.mo20975a(ad, this.f22355b, false);
            }
        }

        public void onReceiveAd(C5041Ad ad) {
            C5060d dVar = this.f22354a;
            if (dVar != null) {
                dVar.mo20975a(ad, this.f22355b, true);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$b */
    /* compiled from: Sta */
    public class C5062b implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ C5060d f22356a;

        /* renamed from: b */
        public final /* synthetic */ CacheKey f22357b;

        public C5062b(C5059d dVar, C5060d dVar2, CacheKey cacheKey) {
            this.f22356a = dVar2;
            this.f22357b = cacheKey;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            C5060d dVar = this.f22356a;
            if (dVar != null) {
                dVar.mo20975a(ad, this.f22357b, false);
            }
        }

        public void onReceiveAd(C5041Ad ad) {
            C5060d dVar = this.f22356a;
            if (dVar != null) {
                dVar.mo20975a(ad, this.f22357b, true);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$c */
    /* compiled from: Sta */
    public static /* synthetic */ class C5063c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22358a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22359b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22359b = r0
                r1 = 1
                com.startapp.sdk.adsbase.StartAppAd$AdMode r2 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f22359b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f22359b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f22359b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f22359b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f22359b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.startapp.sdk.adsbase.model.AdPreferences$Placement[] r3 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f22358a = r3
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f22358a     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 7
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C5059d.C5063c.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$e */
    /* compiled from: Sta */
    public class C5064e {

        /* renamed from: a */
        public StartAppAd f22360a;

        /* renamed from: b */
        public AdPreferences.Placement f22361b;

        /* renamed from: c */
        public AdPreferences f22362c;

        /* renamed from: d */
        public AdEventListener f22363d;

        public C5064e(C5059d dVar, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f22360a = startAppAd;
            this.f22361b = placement;
            this.f22362c = adPreferences;
            this.f22363d = adEventListener;
        }
    }

    /* renamed from: a */
    public void mo21044a(Context context, StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, C5060d dVar) {
        AdPreferences.Placement placement;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (C5063c.f22359b[adMode.ordinal()]) {
            case 1:
                Map<Activity, Integer> map = C5015nb.f22145a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                Map<Activity, Integer> map2 = C5015nb.f22145a;
                if (new Random().nextInt(100) >= AdsCommonMetaData.f22242h.mo20897i()) {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    break;
                } else {
                    if ((new Random().nextInt(100) >= AdsCommonMetaData.f22242h.mo20898j() && !adPreferences2.isForceFullpage()) || adPreferences2.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                        break;
                    } else {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                        break;
                    }
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences2.setType(C5041Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences2.setType(C5041Ad.AdType.VIDEO);
        }
        mo21046a(context, startAppAd, placement2, adPreferences2, dVar, false, 0);
    }

    /* renamed from: b */
    public String mo21050b(CacheKey cacheKey) {
        return String.valueOf(cacheKey.hashCode()).replace('-', '_');
    }

    /* renamed from: c */
    public C5068d mo21052c(CacheKey cacheKey) {
        C5065h hVar;
        if (cacheKey == null || (hVar = this.f22347a.get(cacheKey)) == null || !hVar.mo21060c()) {
            return null;
        }
        C5068d dVar = hVar.f22368e;
        hVar.f22376m = 0;
        hVar.f22378o = null;
        if (!AdsConstants.f54495f.booleanValue() && hVar.f22377n) {
            hVar.mo21056a((StartAppAd) null, (AdEventListener) null, true, true);
        } else if (!hVar.f22377n) {
            C5065h.C5067b bVar = hVar.f22379p;
            if (bVar != null) {
                ((C12269e) bVar).mo46174a(hVar);
            }
            C12103o1 o1Var = hVar.f22373j;
            if (o1Var != null) {
                o1Var.mo45561e();
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public void mo21051b(AdPreferences.Placement placement) {
        synchronized (this.f22347a) {
            Iterator<Map.Entry<CacheKey, C5065h>> it = this.f22347a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) it.next().getKey()).mo21035a() == placement) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo21046a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C5060d dVar, boolean z, int i) {
        C5065h hVar;
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            context = a;
        }
        this.f22353g = context;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        CacheKey cacheKey = new CacheKey(placement, adPreferences2);
        if (!this.f22350d || z) {
            AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
            synchronized (this.f22347a) {
                hVar = this.f22347a.get(cacheKey);
                if (hVar == null) {
                    if (placement.ordinal() != 3) {
                        hVar = new C5065h(this.f22353g, placement, adPreferences3);
                    } else {
                        hVar = new C5065h(this.f22353g, placement, adPreferences3);
                        hVar.f22377n = false;
                    }
                    if (this.f22352f == null) {
                        this.f22352f = new C12269e(this);
                    }
                    hVar.f22379p = this.f22352f;
                    if (z) {
                        hVar.f22371h = mo21050b(cacheKey);
                        hVar.f22372i = true;
                        hVar.f22376m = i;
                    }
                    mo21047a(cacheKey, hVar);
                } else {
                    hVar.f22367d = adPreferences3;
                }
            }
            hVar.mo21056a(startAppAd, new C5062b(this, dVar, cacheKey), false, true);
            return;
        }
        this.f22351e.add(new C5064e(this, startAppAd, placement, adPreferences2, new C5061a(this, dVar, cacheKey)));
    }

    /* renamed from: a */
    public C5068d mo21043a(CacheKey cacheKey) {
        C5065h hVar = cacheKey != null ? this.f22347a.get(cacheKey) : null;
        if (hVar != null) {
            return hVar.f22368e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21048a(boolean r7) {
        /*
            r6 = this;
            java.util.Map<com.startapp.sdk.adsbase.cache.CacheKey, com.startapp.sdk.adsbase.cache.h> r0 = r6.f22347a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            com.startapp.sdk.adsbase.cache.h r1 = (com.startapp.sdk.adsbase.cache.C5065h) r1
            com.startapp.sdk.adsbase.d r2 = r1.f22368e
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003c
            java.util.Map<android.app.Activity, java.lang.Integer> r5 = com.startapp.C5015nb.f22145a
            boolean r2 = r2 instanceof com.startapp.sdk.ads.interstitials.ReturnAd
            if (r2 == 0) goto L_0x003c
            if (r7 != 0) goto L_0x003c
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a
            com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo21039a()
            boolean r2 = r2.mo21033g()
            if (r2 != 0) goto L_0x0047
            com.startapp.o1 r2 = r1.f22373j
            android.os.Handler r5 = r2.f53320b
            if (r5 == 0) goto L_0x0039
            r5.removeCallbacksAndMessages(r3)
        L_0x0039:
            r2.f53322d = r4
            goto L_0x0047
        L_0x003c:
            com.startapp.o1 r2 = r1.f22373j
            android.os.Handler r5 = r2.f53320b
            if (r5 == 0) goto L_0x0045
            r5.removeCallbacksAndMessages(r3)
        L_0x0045:
            r2.f53322d = r4
        L_0x0047:
            com.startapp.m1 r1 = r1.f22374k
            android.os.Handler r2 = r1.f53320b
            if (r2 == 0) goto L_0x0050
            r2.removeCallbacksAndMessages(r3)
        L_0x0050:
            r1.f53322d = r4
            goto L_0x000a
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C5059d.mo21048a(boolean):void");
    }

    /* renamed from: a */
    public void mo21045a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C5060d dVar) {
        mo21046a(context, (StartAppAd) null, placement, adPreferences, dVar, false, 0);
    }

    /* renamed from: a */
    public final void mo21047a(CacheKey cacheKey, C5065h hVar) {
        synchronized (this.f22347a) {
            int d = CacheMetaData.f22345a.mo21039a().mo21029d();
            if (d != 0 && this.f22347a.size() >= d) {
                long j = Long.MAX_VALUE;
                CacheKey cacheKey2 = null;
                for (CacheKey next : this.f22347a.keySet()) {
                    C5065h hVar2 = this.f22347a.get(next);
                    if (hVar2.f22364a == hVar.f22364a) {
                        long j2 = hVar2.f22370g;
                        if (j2 < j) {
                            cacheKey2 = next;
                            j = j2;
                        }
                    }
                }
                if (cacheKey2 != null) {
                    this.f22347a.remove(cacheKey2);
                }
            }
            this.f22347a.put(cacheKey, hVar);
            if (Math.random() * 100.0d < ((double) CacheMetaData.f22345a.mo21040c())) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                d4Var.f22126d = "Cache Size";
                d4Var.f22127e = String.valueOf(this.f22347a.size());
                d4Var.mo20661a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo21049a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 3) {
            Object obj = StartAppSDKInternal.f22265C;
            if (!(!StartAppSDKInternal.C5051d.f22295a.f22290v) || AdsCommonMetaData.f22242h.mo20882L()) {
                return false;
            }
            return true;
        } else if (ordinal != 7) {
            return true;
        } else {
            Object obj2 = StartAppSDKInternal.f22265C;
            if (!StartAppSDKInternal.C5051d.f22295a.f22288t || AdsCommonMetaData.f22242h.mo20881K()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m23193a(StartAppAd.AdMode adMode) {
        StringBuilder a = C12458z0.m53804a("autoLoadNotShownAdPrefix");
        a.append(adMode.name());
        return a.toString();
    }
}
