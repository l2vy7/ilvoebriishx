package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.C11963i7;
import com.startapp.C12359u3;
import com.startapp.C12442y2;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Collections;
import java.util.List;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.a */
/* compiled from: Sta */
public class C12293a {

    /* renamed from: a */
    public final Context f54666a;

    /* renamed from: b */
    public final AdPreferences f54667b;

    /* renamed from: c */
    public final MetaDataRequest.RequestReason f54668c;

    /* renamed from: d */
    public MetaData f54669d = null;

    /* renamed from: e */
    public BannerMetaData f54670e = null;

    /* renamed from: f */
    public SplashMetaData f54671f = null;

    /* renamed from: g */
    public CacheMetaData f54672g = null;

    /* renamed from: h */
    public AdInformationMetaData f54673h = null;

    /* renamed from: i */
    public AdsCommonMetaData f54674i = null;

    /* renamed from: j */
    public boolean f54675j = false;

    /* renamed from: k */
    public boolean f54676k = false;

    public C12293a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason) {
        this.f54666a = context;
        this.f54667b = adPreferences;
        this.f54668c = requestReason;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|(22:34|35|36|(1:38)|42|43|44|(1:46)|50|51|52|(1:54)|58|59|60|(1:62)|66|67|68|(1:70)|74|75)|76|77) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0143 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo46435a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f54666a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.e r0 = r0.mo21217d()     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest r1 = new com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest     // Catch:{ all -> 0x014a }
            android.content.Context r2 = r5.f54666a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason r3 = r5.f54668c     // Catch:{ all -> 0x014a }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x014a }
            android.content.Context r0 = r5.f54666a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r5.f54667b     // Catch:{ all -> 0x014a }
            r1.mo46692a(r0, r2)     // Catch:{ all -> 0x014a }
            android.content.Context r0 = r5.f54666a     // Catch:{ all -> 0x014a }
            com.startapp.i7$a r0 = m53411a(r0, r1)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x0025
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x014a }
            return r0
        L_0x0025:
            java.lang.String r0 = r0.f53099a     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x014a }
            return r0
        L_0x002c:
            java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.MetaData> r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.class
            java.lang.Object r1 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = (com.startapp.sdk.adsbase.remoteconfig.MetaData) r1     // Catch:{ all -> 0x014a }
            r5.f54669d = r1     // Catch:{ all -> 0x014a }
            java.lang.String r1 = r1.mo21195h()     // Catch:{ all -> 0x014a }
            if (r1 == 0) goto L_0x0069
            android.content.Context r1 = r5.f54666a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r1)     // Catch:{ all -> 0x014a }
            com.startapp.a0 r1 = r1.mo21216c()     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f54669d     // Catch:{ all -> 0x014a }
            java.lang.String r2 = r2.mo21195h()     // Catch:{ all -> 0x014a }
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x014a }
        L_0x0052:
            java.lang.Object r3 = r1.f22107a     // Catch:{ all -> 0x014a }
            monitor-enter(r3)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r1 = r1.f22108b     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "31721150b470a3b9"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)     // Catch:{ all -> 0x0066 }
            r1.commit()     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0069:
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.C5015nb.f22145a     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.AdsCommonMetaData> r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.class
            java.lang.Object r1 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = (com.startapp.sdk.adsbase.AdsCommonMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f54674i = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.ads.banner.BannerMetaData> r1 = com.startapp.sdk.ads.banner.BannerMetaData.class
            java.lang.Object r1 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.ads.banner.BannerMetaData r1 = (com.startapp.sdk.ads.banner.BannerMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f54670e = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.ads.splash.SplashMetaData> r1 = com.startapp.sdk.ads.splash.SplashMetaData.class
            java.lang.Object r1 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.ads.splash.SplashMetaData r1 = (com.startapp.sdk.ads.splash.SplashMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f54671f = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.cache.CacheMetaData> r1 = com.startapp.sdk.adsbase.cache.CacheMetaData.class
            java.lang.Object r1 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r1 = (com.startapp.sdk.adsbase.cache.CacheMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f54672g = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.adinformation.AdInformationMetaData> r1 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.class
            java.lang.Object r0 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r0 = (com.startapp.sdk.adsbase.adinformation.AdInformationMetaData) r0     // Catch:{ all -> 0x014a }
            r5.f54673h = r0     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22400d
            monitor-enter(r0)
            boolean r1 = r5.f54675j     // Catch:{ all -> 0x0147 }
            if (r1 != 0) goto L_0x0143
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = r5.f54669d     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x0143
            android.content.Context r1 = r5.f54666a     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x0143
            r1 = 1
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f54674i     // Catch:{ all -> 0x00c1 }
            boolean r2 = com.startapp.C5015nb.m22922a(r2, r3)     // Catch:{ all -> 0x00c1 }
            if (r2 != 0) goto L_0x00c5
            r5.f54676k = r1     // Catch:{ all -> 0x00c1 }
            android.content.Context r2 = r5.f54666a     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f54674i     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData.m23013a(r2, r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x00c5:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C5015nb.f22145a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.banner.BannerMetaData r2 = com.startapp.sdk.ads.banner.BannerMetaData.f54159b     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f54670e     // Catch:{ all -> 0x00db }
            boolean r2 = com.startapp.C5015nb.m22922a(r2, r3)     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00df
            r5.f54676k = r1     // Catch:{ all -> 0x00db }
            android.content.Context r2 = r5.f54666a     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f54670e     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData.m52841a(r2, r3)     // Catch:{ all -> 0x00db }
            goto L_0x00df
        L_0x00db:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x00df:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C5015nb.f22145a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f54671f     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashConfig r2 = r2.mo45954a()     // Catch:{ all -> 0x0147 }
            android.content.Context r3 = r5.f54666a     // Catch:{ all -> 0x0147 }
            r2.setDefaults(r3)     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = com.startapp.sdk.ads.splash.SplashMetaData.f54294a     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f54671f     // Catch:{ all -> 0x0100 }
            boolean r2 = com.startapp.C5015nb.m22922a(r2, r3)     // Catch:{ all -> 0x0100 }
            if (r2 != 0) goto L_0x0104
            r5.f54676k = r1     // Catch:{ all -> 0x0100 }
            android.content.Context r2 = r5.f54666a     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f54671f     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData.m52957a(r2, r3)     // Catch:{ all -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x0104:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C5015nb.f22145a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f54672g     // Catch:{ all -> 0x011a }
            boolean r2 = com.startapp.C5015nb.m22922a(r2, r3)     // Catch:{ all -> 0x011a }
            if (r2 != 0) goto L_0x011e
            r5.f54676k = r1     // Catch:{ all -> 0x011a }
            android.content.Context r2 = r5.f54666a     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f54672g     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData.m23189a(r2, r3)     // Catch:{ all -> 0x011a }
            goto L_0x011e
        L_0x011a:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x011e:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C5015nb.f22145a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.f54504a     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r3 = r5.f54673h     // Catch:{ all -> 0x0134 }
            boolean r2 = com.startapp.C5015nb.m22922a(r2, r3)     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x0138
            r5.f54676k = r1     // Catch:{ all -> 0x0134 }
            android.content.Context r1 = r5.f54666a     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = r5.f54673h     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.m53149a(r1, r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0138
        L_0x0134:
            r1 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0147 }
        L_0x0138:
            android.content.Context r1 = r5.f54666a     // Catch:{ Exception -> 0x0143 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f54669d     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r2.mo21193f()     // Catch:{ Exception -> 0x0143 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData.m23243a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0143 }
        L_0x0143:
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0147:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            throw r1
        L_0x014a:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.C12293a.mo46435a():java.lang.Boolean");
    }

    /* renamed from: a */
    public void mo46436a(Boolean bool) {
        MetaData metaData;
        Context context;
        synchronized (MetaData.f22400d) {
            if (!this.f54675j) {
                if (!bool.booleanValue() || (metaData = this.f54669d) == null || (context = this.f54666a) == null) {
                    MetaData.m23245a(this.f54668c);
                } else {
                    try {
                        MetaData.m23242a(context, metaData, this.f54668c, this.f54676k);
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C11963i7.C11964a m53411a(Context context, MetaDataRequest metaDataRequest) {
        C11963i7.C11964a aVar;
        List<String> list = MetaData.f22407k.metaDataHosts;
        if (list == null || list.size() < 1) {
            list = MetaData.f22403g;
        }
        for (T a : Collections.unmodifiableList(list)) {
            C12359u3 k = ComponentLocator.m23305a(context).mo21224k();
            StringBuilder a2 = C12458z0.m53804a(a);
            a2.append(AdsConstants.f54493d);
            String sb = a2.toString();
            k.getClass();
            try {
                aVar = k.mo46647a(sb, metaDataRequest, (C12442y2<String, Void>) null);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                aVar = null;
            }
            if (aVar == null) {
                if (!ComponentLocator.m23305a(context).mo21218e().mo46842a()) {
                    break;
                }
            } else {
                return aVar;
            }
        }
        return null;
    }
}
