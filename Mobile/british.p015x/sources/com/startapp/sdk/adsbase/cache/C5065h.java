package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.C12041m1;
import com.startapp.C12103o1;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.C5011i;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.OverlayAd;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.sdk.adsbase.cache.h */
/* compiled from: Sta */
public class C5065h {

    /* renamed from: a */
    public final AdPreferences.Placement f22364a;

    /* renamed from: b */
    public Context f22365b;

    /* renamed from: c */
    public ActivityExtra f22366c;

    /* renamed from: d */
    public AdPreferences f22367d;

    /* renamed from: e */
    public C5068d f22368e = null;

    /* renamed from: f */
    public AtomicBoolean f22369f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f22370g;

    /* renamed from: h */
    public String f22371h = null;

    /* renamed from: i */
    public boolean f22372i = false;

    /* renamed from: j */
    public C12103o1 f22373j = null;

    /* renamed from: k */
    public C12041m1 f22374k = null;

    /* renamed from: l */
    public final Map<AdEventListener, List<StartAppAd>> f22375l = new ConcurrentHashMap();

    /* renamed from: m */
    public int f22376m;

    /* renamed from: n */
    public boolean f22377n = true;

    /* renamed from: o */
    public Long f22378o;

    /* renamed from: p */
    public C5067b f22379p;

    /* renamed from: com.startapp.sdk.adsbase.cache.h$a */
    /* compiled from: Sta */
    public class C5066a implements AdEventListener {

        /* renamed from: a */
        public boolean f22380a = false;

        /* renamed from: b */
        public boolean f22381b = false;

        public C5066a() {
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            List<StartAppAd> a;
            ConcurrentHashMap concurrentHashMap;
            ConcurrentHashMap concurrentHashMap2 = null;
            if (!this.f22381b) {
                synchronized (C5065h.this.f22375l) {
                    concurrentHashMap = new ConcurrentHashMap(C5065h.this.f22375l);
                    C5065h hVar = C5065h.this;
                    hVar.f22368e = null;
                    hVar.f22375l.clear();
                }
                concurrentHashMap2 = concurrentHashMap;
            }
            if (concurrentHashMap2 != null) {
                for (AdEventListener adEventListener : concurrentHashMap2.keySet()) {
                    if (!(adEventListener == null || (a = C5065h.this.mo21053a(concurrentHashMap2, adEventListener)) == null)) {
                        for (StartAppAd next : a) {
                            if (ad != null) {
                                next.setErrorMessage(ad.getErrorMessage());
                            }
                            C5011i.m22894a(C5065h.this.f22365b, adEventListener, next, true);
                        }
                    }
                }
            }
            this.f22381b = true;
            C5065h.this.f22374k.mo45560d();
            C5065h.this.f22373j.mo45561e();
            C5065h.this.f22369f.set(false);
        }

        public void onReceiveAd(C5041Ad ad) {
            C5068d dVar = C5065h.this.f22368e;
            boolean z = dVar != null && dVar.mo21074a();
            if (!this.f22380a && !z) {
                this.f22380a = true;
                synchronized (C5065h.this.f22375l) {
                    for (AdEventListener next : C5065h.this.f22375l.keySet()) {
                        if (next != null) {
                            C5065h hVar = C5065h.this;
                            List<StartAppAd> a = hVar.mo21053a(hVar.f22375l, next);
                            if (a != null) {
                                for (StartAppAd errorMessage : a) {
                                    errorMessage.setErrorMessage(ad.getErrorMessage());
                                    C5011i.m22895b(C5065h.this.f22365b, next, ad, true);
                                }
                            }
                        }
                    }
                    C5065h.this.f22375l.clear();
                }
            }
            C5065h.this.f22373j.mo45560d();
            C5065h.this.f22374k.mo45532f();
            C5065h.this.f22369f.set(false);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.h$b */
    /* compiled from: Sta */
    public interface C5067b {
    }

    public C5065h(Context context, AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.f22364a = placement;
        this.f22367d = adPreferences;
        mo21055a(context);
        mo21054a();
    }

    /* renamed from: a */
    public final void mo21055a(Context context) {
        if (context instanceof Activity) {
            Context a = C5009h0.m22892a(context);
            if (a == null) {
                a = context;
            }
            this.f22365b = a;
            this.f22366c = new ActivityExtra((Activity) context);
            return;
        }
        this.f22365b = context;
        this.f22366c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21058b() {
        /*
            r6 = this;
            boolean r0 = r6.mo21060c()
            if (r0 == 0) goto L_0x006c
            android.content.Context r0 = r6.f22365b
            com.startapp.sdk.adsbase.d r1 = r6.f22368e
            com.startapp.sdk.adsbase.Ad r1 = (com.startapp.sdk.adsbase.C5041Ad) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0049
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.HtmlAd
            if (r5 == 0) goto L_0x0031
            com.startapp.sdk.adsbase.HtmlAd r1 = (com.startapp.sdk.adsbase.HtmlAd) r1
            java.lang.String r1 = r1.mo20929j()
            java.util.List r1 = com.startapp.C11839d0.m52130a(r1, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Boolean r0 = com.startapp.C11839d0.m52128a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r5)
            boolean r0 = r0.booleanValue()
            goto L_0x004a
        L_0x0031:
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.JsonAd
            if (r5 == 0) goto L_0x0049
            com.startapp.sdk.adsbase.JsonAd r1 = (com.startapp.sdk.adsbase.JsonAd) r1
            java.util.List r1 = r1.mo46103g()
            java.util.List r0 = com.startapp.C11839d0.m52129a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.model.AdDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (boolean) r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0067
            com.startapp.sdk.adsbase.d r0 = r6.f22368e
            if (r0 != 0) goto L_0x0052
            r0 = 0
            goto L_0x0056
        L_0x0052:
            boolean r0 = r0.mo21078d()
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x0067
        L_0x0059:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f22369f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.o1 r0 = r6.f22373j
            r0.mo45560d()
            goto L_0x0079
        L_0x0067:
            r0 = 0
            r6.mo21056a(r0, r0, r2, r3)
            goto L_0x0079
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f22369f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.m1 r0 = r6.f22374k
            r0.mo45560d()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C5065h.mo21058b():void");
    }

    /* renamed from: c */
    public boolean mo21060c() {
        C5068d dVar = this.f22368e;
        return dVar != null && dVar.isReady();
    }

    /* renamed from: a */
    public final void mo21057a(boolean z) {
        C5068d dVar;
        boolean z2;
        boolean z3 = false;
        if (z) {
            Long h = AdsCommonMetaData.f22242h.mo20895h();
            if (h == null || this.f22378o == null || SystemClock.elapsedRealtime() - this.f22378o.longValue() >= h.longValue()) {
                this.f22378o = Long.valueOf(SystemClock.elapsedRealtime());
                z2 = false;
            } else {
                C5011i.m22894a(this.f22365b, new C5066a(), new CachedAd$3(this, this.f22365b, this.f22364a), true);
                Context context = this.f22365b;
                StringBuilder a = C12458z0.m53804a("Failed to load ");
                a.append(this.f22364a.name());
                a.append(" ad: NO FILL");
                C5015nb.m22915a(context, 6, a.toString(), true);
                z2 = true;
            }
            if (z2) {
                return;
            }
        }
        int ordinal = this.f22364a.ordinal();
        if (ordinal == 0) {
            dVar = new OverlayAd(this.f22365b);
        } else if (ordinal == 7) {
            dVar = new ReturnAd(this.f22365b);
        } else if (ordinal == 2) {
            if (new Random().nextInt(100) < AdsCommonMetaData.f22242h.mo20910w()) {
                z3 = true;
            }
            boolean isForceOfferWall3D = this.f22367d.isForceOfferWall3D();
            boolean isForceOfferWall2D = true ^ this.f22367d.isForceOfferWall2D();
            Map<Activity, Integer> map = C5015nb.f22145a;
            if ((z3 || isForceOfferWall3D) && isForceOfferWall2D) {
                dVar = new OfferWall3DAd(this.f22365b);
            } else {
                dVar = new OfferWallAd(this.f22365b);
            }
        } else if (ordinal == 3) {
            dVar = new SplashAd(this.f22365b);
        } else if (ordinal != 4) {
            dVar = new OverlayAd(this.f22365b);
        } else {
            Map<Activity, Integer> map2 = C5015nb.f22145a;
            dVar = new VideoEnabledAd(this.f22365b, AdPreferences.Placement.INAPP_OVERLAY);
        }
        this.f22368e = dVar;
        dVar.setActivityExtra(this.f22366c);
        this.f22367d.setAutoLoadAmount(this.f22376m);
        this.f22368e.load(this.f22367d, new C5066a());
        this.f22370g = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo21059b(boolean z) {
        C5068d dVar = this.f22368e;
        if (dVar != null) {
            dVar.mo21073a(false);
        }
        if (this.f22372i && this.f22371h != null) {
            this.f22372i = false;
            C12270f fVar = new C12270f(this, new C5066a(), z);
            Context context = this.f22365b;
            ComponentLocator.m23305a(context).mo21222i().execute(new C12276k(context, this.f22371h, fVar, new C12271g(this)));
            return;
        }
        mo21057a(z);
    }

    /* renamed from: a */
    public final void mo21054a() {
        this.f22373j = new C12103o1(this);
        this.f22374k = new C12041m1(this);
    }

    /* renamed from: a */
    public List<StartAppAd> mo21053a(Map<AdEventListener, List<StartAppAd>> map, AdEventListener adEventListener) {
        try {
            return map.get(adEventListener);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21056a(com.startapp.sdk.adsbase.StartAppAd r5, com.startapp.sdk.adsbase.adlisteners.AdEventListener r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r0 = r4.f22375l
            monitor-enter(r0)
            boolean r1 = r4.mo21060c()     // Catch:{ all -> 0x005e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            com.startapp.sdk.adsbase.d r1 = r4.f22368e     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0015
        L_0x0011:
            boolean r1 = r1.mo21078d()     // Catch:{ all -> 0x005e }
        L_0x0015:
            if (r1 != 0) goto L_0x001c
            if (r7 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r7 = 0
            goto L_0x001d
        L_0x001c:
            r7 = 1
        L_0x001d:
            if (r7 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x003d
            if (r6 == 0) goto L_0x003d
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r7 = r4.f22375l     // Catch:{ all -> 0x005e }
            java.util.List r7 = r4.mo21053a(r7, r6)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x003a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x005e }
            r7.<init>()     // Catch:{ all -> 0x005e }
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r1 = r4.f22375l     // Catch:{ all -> 0x005e }
            r1.put(r6, r7)     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r6)     // Catch:{ all -> 0x005e }
        L_0x003a:
            r7.add(r5)     // Catch:{ all -> 0x005e }
        L_0x003d:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f22369f     // Catch:{ all -> 0x005e }
            boolean r5 = r5.compareAndSet(r2, r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005c
            com.startapp.o1 r5 = r4.f22373j     // Catch:{ all -> 0x005e }
            r5.mo45561e()     // Catch:{ all -> 0x005e }
            com.startapp.m1 r5 = r4.f22374k     // Catch:{ all -> 0x005e }
            r5.mo45561e()     // Catch:{ all -> 0x005e }
            r4.mo21059b(r8)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0053:
            if (r5 == 0) goto L_0x005c
            if (r6 == 0) goto L_0x005c
            android.content.Context r7 = r4.f22365b     // Catch:{ all -> 0x005e }
            com.startapp.C5011i.m22895b(r7, r6, r5, r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C5065h.mo21056a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.adlisteners.AdEventListener, boolean, boolean):void");
    }
}
