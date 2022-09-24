package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d */
public final class C11369d {

    /* renamed from: i */
    private static final C11369d f51051i = new C11369d();

    /* renamed from: j */
    private static final Object f51052j = new Object();

    /* renamed from: a */
    private final ConcurrentHashMap<String, AbstractAdapter> f51053a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f51054b = new ConcurrentHashMap<>();

    /* renamed from: c */
    String f51055c;

    /* renamed from: d */
    String f51056d;

    /* renamed from: e */
    private Boolean f51057e;

    /* renamed from: f */
    private Boolean f51058f;

    /* renamed from: g */
    final ConcurrentHashMap<String, List<String>> f51059g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private final AtomicBoolean f51060h = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.d$a */
    static /* synthetic */ class C11370a {

        /* renamed from: a */
        static final /* synthetic */ int[] f51061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51061a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51061a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51061a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11369d.C11370a.<clinit>():void");
        }
    }

    private C11369d() {
    }

    /* renamed from: a */
    public static C11369d m50788a() {
        return f51051i;
    }

    /* renamed from: b */
    private AbstractAdapter m50789b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            m50793f(str3);
            return null;
        }
    }

    /* renamed from: c */
    private AdapterBaseInterface m50790c(String str, String str2, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + str2;
            try {
                BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
                IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
                Boolean bool = this.f51058f;
                if (bool != null) {
                    try {
                        baseAdapter.setAdapterDebug(bool.booleanValue());
                    } catch (Exception e) {
                        String str4 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
                        m50796i(str4);
                        e.printStackTrace();
                    }
                }
                this.f51054b.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
                return baseAdapter;
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str5 = "failed to load " + str3;
                    IronLog.INTERNAL.error(str5);
                    m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str5);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
    }

    /* renamed from: d */
    private static void m50791d(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            C11292d.m50446e().mo43979b(new C11308a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m50792e(AbstractAdapter abstractAdapter) {
        try {
            Boolean bool = this.f51057e;
            if (bool != null) {
                abstractAdapter.setConsent(bool.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            m50796i(str);
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    private static void m50793f(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    /* renamed from: g */
    private static String m50794g(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    /* renamed from: h */
    private void m50795h(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f51058f;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m50796i(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    private static void m50796i(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    /* renamed from: j */
    private BaseAdAdapter<?, ?> m50797j(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
            try {
                return (BaseAdAdapter) Class.forName(str).getConstructor(new Class[]{NetworkSettings.class}).newInstance(new Object[]{networkSettings});
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str2 = "failed to load " + str;
                    IronLog.INTERNAL.error(str2);
                    m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
    }

    /* renamed from: k */
    private void m50798k(AbstractAdapter abstractAdapter) {
        for (String next : this.f51059g.keySet()) {
            try {
                List list = this.f51059g.get(next);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + next + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(next, (List<String>) list);
                }
            } catch (Throwable th) {
                String str = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m50796i(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final AbstractAdapter mo44227a(NetworkSettings networkSettings) {
        String g = m50794g(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f51053a.get(g) : m50789b(g, networkSettings.getProviderTypeForReflection());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.AbstractAdapter mo44228a(com.ironsource.mediationsdk.model.NetworkSettings r7, org.json.JSONObject r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = m50794g(r7)
            if (r9 == 0) goto L_0x0009
            java.lang.String r7 = "IronSource"
            goto L_0x000d
        L_0x0009:
            java.lang.String r7 = r7.getProviderTypeForReflection()
        L_0x000d:
            java.lang.Object r9 = f51052j
            monitor-enter(r9)
            if (r10 != 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r6.f51053a     // Catch:{ all -> 0x0112 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f51053a     // Catch:{ all -> 0x0112 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.AbstractAdapter r7 = (com.ironsource.mediationsdk.AbstractAdapter) r7     // Catch:{ all -> 0x0112 }
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r7
        L_0x0024:
            com.ironsource.mediationsdk.AbstractAdapter r1 = r6.m50789b((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0041
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r7.<init>()     // Catch:{ all -> 0x0112 }
            r7.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r8 = " adapter was not loaded"
            r7.append(r8)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0112 }
            m50793f(r7)     // Catch:{ all -> 0x0112 }
            r7 = 0
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r7
        L_0x0041:
            r2 = 88001(0x157c1, float:1.23316E-40)
            java.lang.String r3 = r1.getCoreSDKVersion()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0072
        L_0x0049:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "error while retrieving coreSDKVersion "
            r4.<init>(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.getProviderName()     // Catch:{ all -> 0x0112 }
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0112 }
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0112 }
            m50791d(r2, r3)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0112 }
            r4.error(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "Unknown"
        L_0x0072:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r4.<init>()     // Catch:{ all -> 0x0112 }
            r4.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = " was allocated (adapter version: "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.getVersion()     // Catch:{ all -> 0x0112 }
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ", sdk version: "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0112 }
            m50796i(r3)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0112 }
            r1.setLogListener(r3)     // Catch:{ all -> 0x0112 }
            r6.m50798k(r1)     // Catch:{ all -> 0x0112 }
            r6.m50792e(r1)     // Catch:{ all -> 0x0112 }
            r6.m50795h(r1)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "SupersonicAds"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0112 }
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = "IronSource"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0109
        L_0x00ba:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f51060h     // Catch:{ all -> 0x0112 }
            r4 = 0
            r5 = 1
            boolean r3 = r3.compareAndSet(r4, r5)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0109
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = "SDK5 earlyInit  <"
            r3.<init>(r4)     // Catch:{ all -> 0x0112 }
            r3.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = ">"
            r3.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0112 }
            m50796i(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r6.f51055c     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r3 = r6.f51056d     // Catch:{ Exception -> 0x00e2 }
            r1.earlyInit(r7, r3, r8)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x0109
        L_0x00e2:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "error while calling early init for "
            r8.<init>(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r1.getProviderName()     // Catch:{ all -> 0x0112 }
            r8.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ": "
            r8.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x0112 }
            r8.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0112 }
            m50791d(r2, r7)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronLog r8 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0112 }
            r8.error(r7)     // Catch:{ all -> 0x0112 }
        L_0x0109:
            if (r10 != 0) goto L_0x0110
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f51053a     // Catch:{ all -> 0x0112 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r1
        L_0x0112:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11369d.mo44228a(com.ironsource.mediationsdk.model.NetworkSettings, org.json.JSONObject, boolean, boolean):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: a */
    public final AdapterBaseInterface mo44229a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String g = m50794g(networkSettings);
        if (this.f51054b.containsKey(g)) {
            AdapterBaseInterface adapterBaseInterface = this.f51054b.get(g).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof C11242K) {
                ((C11242K) adapterBaseInterface).f50486d = ad_unit;
            }
            return adapterBaseInterface;
        }
        AdapterBaseInterface c = m50790c(g, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName((IronSource.AD_UNIT) null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (c != null) {
            return c;
        }
        int i = C11370a.f51061a[ad_unit.ordinal()];
        AbstractAdapter a = mo44228a(networkSettings, i != 1 ? i != 2 ? i != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a != null) {
            C11242K k = new C11242K(a, networkSettings, ad_unit);
            this.f51054b.put(g, new AdapterBaseWrapper(k, networkSettings));
            return k;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: a */
    public final void mo44230a(String str, List<String> list) {
        synchronized (f51052j) {
            this.f51059g.put(str, list);
            if (!this.f51053a.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter next : this.f51053a.values()) {
                    try {
                        next.setMetaData(str, list);
                    } catch (Throwable th) {
                        String str2 = "error while setting metadata of " + next.getProviderName() + ": " + th.getLocalizedMessage();
                        m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        m50796i(str2);
                        th.printStackTrace();
                    }
                }
                for (AdapterBaseWrapper next2 : this.f51054b.values()) {
                    AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                    if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                        try {
                            ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                        } catch (Exception e) {
                            String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                            m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                            m50796i(str3);
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo44231a(boolean z) {
        synchronized (f51052j) {
            this.f51057e = Boolean.valueOf(z);
            for (AbstractAdapter e : this.f51053a.values()) {
                m50792e(e);
            }
            for (AdapterBaseWrapper next : this.f51054b.values()) {
                AdapterBaseInterface adapterBaseInterface = next.getAdapterBaseInterface();
                if (!next.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z);
                    } catch (Exception e2) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e2.getLocalizedMessage();
                        m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        m50796i(str);
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final BaseAdAdapter<?, ?> mo44232b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> j = m50797j(networkSettings, ad_unit);
        if (j != null) {
            return j;
        }
        AbstractAdapter a = mo44227a(networkSettings);
        if (a != null) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return new C11242K(a, networkSettings, ad_unit);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return new C11242K(a, networkSettings, ad_unit);
            }
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        m50791d(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: b */
    public final void mo44233b(boolean z) {
        synchronized (f51052j) {
            this.f51058f = Boolean.valueOf(z);
            for (AbstractAdapter h : this.f51053a.values()) {
                m50795h(h);
            }
        }
    }
}
