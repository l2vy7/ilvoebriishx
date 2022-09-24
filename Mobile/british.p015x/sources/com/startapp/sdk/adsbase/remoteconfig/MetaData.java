package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.startapp.C11795b1;
import com.startapp.C11812c1;
import com.startapp.C11840d1;
import com.startapp.C11882e4;
import com.startapp.C12437y;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class MetaData implements Serializable {

    /* renamed from: d */
    public static final Object f22400d = new Object();

    /* renamed from: e */
    public static final AtomicBoolean f22401e = new AtomicBoolean();

    /* renamed from: f */
    public static final Set<String> f22402f = new HashSet(Arrays.asList(new String[]{Constants.f54684a}));

    /* renamed from: g */
    public static final List<String> f22403g = Arrays.asList(new String[]{"https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/"});

    /* renamed from: h */
    public static final String f22404h = "https://req.startappservice.com/1.5/";

    /* renamed from: i */
    public static final int[] f22405i = {60, 60, PsExtractor.VIDEO_STREAM_MASK};

    /* renamed from: j */
    public static final Set<String> f22406j = new HashSet(Arrays.asList(new String[]{"com.facebook.katana", "com.yandex.browser"}));

    /* renamed from: k */
    public static volatile MetaData f22407k = new MetaData();

    /* renamed from: l */
    public static C12293a f22408l = null;
    private static final long serialVersionUID = -5959046617819281436L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    @C5010hb(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();
    private boolean SupportIABViewability;

    /* renamed from: a */
    public transient boolean f22409a;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    @C5010hb(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;
    @C5010hb(complex = true)
    public AnalyticsConfig analytics;
    @C5010hb(complex = true)
    private ANRRemoteConfig anrConfig;
    private String assetsBaseUrlSecured;

    /* renamed from: b */
    public transient boolean f22410b;
    @C5010hb(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c */
    public transient List<C5073c> f22411c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;
    @C5010hb(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;
    private double flh;
    private boolean inAppBrowser;
    @C5010hb(type = HashSet.class)
    private Set<String> installersList;
    @C5010hb(type = HashSet.class)
    private Set<Integer> invalidForRetry;
    private boolean isToken1Mandatory;
    private String lastVersion;
    @C5010hb(complex = true)
    private LocationMetadata location;
    @C5010hb(type = ArrayList.class)
    public List<String> metaDataHosts = f22403g;
    private String metadataUpdateVersion;
    @C5010hb(complex = true)
    private MotionMetadata motion;
    @C5010hb(complex = true)
    private NetworkDiagnosticConfig netDiag;
    @C5010hb(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;
    @C5010hb(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;
    @C5010hb(complex = true)
    private RcdMetadata rcd;
    @C5010hb(complex = true)
    private RscMetadata rsc;
    @C5010hb(complex = true)
    private SensorsConfig sensorsConfig;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;
    @C5010hb(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;
    @C5010hb(complex = true)
    private TelephonyMetadata telephony;
    public String trackDownloadHost;
    @C5010hb(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;
    private boolean webViewSecured;

    /* renamed from: com.startapp.sdk.adsbase.remoteconfig.MetaData$a */
    /* compiled from: Sta */
    public static class C5072a implements C11840d1.C11843b {

        /* renamed from: a */
        public Context f22412a;

        /* renamed from: b */
        public String f22413b;

        public C5072a(Context context, String str) {
            this.f22412a = context;
            this.f22413b = str;
        }

        /* renamed from: a */
        public void mo20798a(Bitmap bitmap, int i) {
            if (bitmap != null) {
                Context context = this.f22412a;
                String str = this.f22413b;
                Map<String, Bitmap> map = C11812c1.f52641a;
                ComponentLocator.m23305a(context).mo21222i().execute(new C11795b1(str, ".png", bitmap, context));
            }
        }
    }

    public MetaData() {
        String str = f22404h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f22402f;
        this.preInstalledPackages = f22406j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f22405i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1;
        this.IABVideoImpressionDelayInSeconds = 2;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.invalidForRetry = null;
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f22409a = false;
        this.f22410b = false;
        this.f22411c = new ArrayList();
        this.metadataUpdateVersion = "4.10.2";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
    }

    /* renamed from: a */
    public static void m23244a(MetaData metaData) {
        synchronized (f22400d) {
            metaData.f22411c.addAll(f22407k.f22411c);
            f22407k = metaData;
        }
    }

    /* renamed from: c */
    public static void m23246c(Context context) {
        if (!f22401e.getAndSet(true)) {
            MetaData metaData = (MetaData) C5126w2.m23386a(context, "StartappMetadata", MetaData.class);
            MetaData metaData2 = new MetaData();
            if (metaData != null) {
                boolean b = C5015nb.m22930b(metaData, metaData2);
                if (!(true ^ "4.10.2".equals(metaData.metadataUpdateVersion)) && b) {
                    C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                    d4Var.f22126d = "metadata_null";
                    d4Var.mo20661a();
                }
                metaData.f22409a = false;
                metaData.f22410b = false;
                metaData.f22411c = new ArrayList();
                m23244a(metaData);
            } else {
                m23244a(metaData2);
            }
            f22407k.mo21184a();
        }
    }

    /* renamed from: r */
    public static MetaData m23247r() {
        return f22407k;
    }

    /* renamed from: A */
    public Set<String> mo21159A() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = f22406j;
        }
        return Collections.unmodifiableSet(set);
    }

    /* renamed from: B */
    public String mo21160B() {
        return this.profileId;
    }

    /* renamed from: C */
    public RcdMetadata mo21161C() {
        return this.rcd;
    }

    /* renamed from: D */
    public RscMetadata mo21162D() {
        return this.rsc;
    }

    /* renamed from: E */
    public SensorsConfig mo21163E() {
        return this.sensorsConfig;
    }

    /* renamed from: F */
    public long mo21164F() {
        return TimeUnit.SECONDS.toMillis((long) this.sessionMaxBackgroundTime);
    }

    /* renamed from: G */
    public SimpleTokenConfig mo21165G() {
        return this.SimpleToken;
    }

    /* renamed from: H */
    public StaleDcConfig mo21166H() {
        return this.staleDc;
    }

    /* renamed from: I */
    public int mo21167I() {
        return this.stopAutoLoadAmount;
    }

    /* renamed from: J */
    public int mo21168J() {
        return this.stopAutoLoadPreCacheAmount;
    }

    /* renamed from: K */
    public TelephonyMetadata mo21169K() {
        return this.telephony;
    }

    /* renamed from: L */
    public TriggeredLinksMetadata mo21170L() {
        return this.triggeredLinks;
    }

    /* renamed from: M */
    public String mo21171M() {
        return this.vastRecorderHost;
    }

    /* renamed from: N */
    public boolean mo21172N() {
        return this.alwaysSendToken;
    }

    /* renamed from: O */
    public boolean mo21173O() {
        return this.compressionEnabled;
    }

    /* renamed from: P */
    public boolean mo21174P() {
        Map<Activity, Integer> map = C5015nb.f22145a;
        return this.inAppBrowser;
    }

    /* renamed from: Q */
    public boolean mo21175Q() {
        return this.omSdkEnabled;
    }

    /* renamed from: R */
    public boolean mo21176R() {
        return this.periodicForegroundEventSec != null;
    }

    /* renamed from: S */
    public boolean mo21177S() {
        return this.periodicInfoEventEnabled;
    }

    /* renamed from: T */
    public boolean mo21178T() {
        return this.periodicMetaDataEnabled;
    }

    /* renamed from: U */
    public boolean mo21179U() {
        return this.SupportIABViewability;
    }

    /* renamed from: V */
    public boolean mo21180V() {
        return this.isToken1Mandatory;
    }

    /* renamed from: b */
    public int mo21187b(Context context) {
        return m23241a(context, this.periodicEventIntMin);
    }

    /* renamed from: d */
    public AdvertisingIdResolverMetadata mo21190d() {
        return this.air;
    }

    /* renamed from: e */
    public ANRRemoteConfig mo21191e() {
        return this.anrConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        if (this.sessionMaxBackgroundTime != metaData.sessionMaxBackgroundTime || this.simpleToken2 != metaData.simpleToken2 || this.alwaysSendToken != metaData.alwaysSendToken || this.isToken1Mandatory != metaData.isToken1Mandatory || this.compressionEnabled != metaData.compressionEnabled || this.periodicMetaDataEnabled != metaData.periodicMetaDataEnabled || this.periodicMetaDataIntervalInMinutes != metaData.periodicMetaDataIntervalInMinutes || this.periodicInfoEventEnabled != metaData.periodicInfoEventEnabled || this.inAppBrowser != metaData.inAppBrowser || this.SupportIABViewability != metaData.SupportIABViewability || this.IABDisplayImpressionDelayInSeconds != metaData.IABDisplayImpressionDelayInSeconds || this.IABVideoImpressionDelayInSeconds != metaData.IABVideoImpressionDelayInSeconds || this.notVisibleBannerReloadInterval != metaData.notVisibleBannerReloadInterval || this.dns != metaData.dns || this.stopAutoLoadAmount != metaData.stopAutoLoadAmount || this.stopAutoLoadPreCacheAmount != metaData.stopAutoLoadPreCacheAmount || this.trueNetEnabled != metaData.trueNetEnabled || this.webViewSecured != metaData.webViewSecured || this.omSdkEnabled != metaData.omSdkEnabled || this.chromeCustomeTabsInternal != metaData.chromeCustomeTabsInternal || this.chromeCustomeTabsExternal != metaData.chromeCustomeTabsExternal || this.closeAdAfterClick != metaData.closeAdAfterClick || this.disableSendAdvertisingId != metaData.disableSendAdvertisingId || Double.compare(this.flh, metaData.flh) != 0 || !C5015nb.m22922a(this.SimpleToken, metaData.SimpleToken) || !C5015nb.m22922a(this.consentDetails, metaData.consentDetails) || !C5015nb.m22922a(this.calcProd, metaData.calcProd) || !C5015nb.m22922a(this.metaDataHosts, metaData.metaDataHosts) || !C5015nb.m22922a(this.adPlatformHostSecured, metaData.adPlatformHostSecured) || !C5015nb.m22922a(this.trackDownloadHost, metaData.trackDownloadHost) || !C5015nb.m22922a(this.vastRecorderHost, metaData.vastRecorderHost) || !C5015nb.m22922a(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) || !C5015nb.m22922a(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) || !C5015nb.m22922a(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) || !C5015nb.m22922a(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) || !C5015nb.m22922a(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) || !C5015nb.m22922a(this.profileId, metaData.profileId) || !C5015nb.m22922a(this.installersList, metaData.installersList) || !C5015nb.m22922a(this.preInstalledPackages, metaData.preInstalledPackages) || !Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) || !Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) || !C5015nb.m22922a(this.sensorsConfig, metaData.sensorsConfig) || !C5015nb.m22922a(this.btConfig, metaData.btConfig) || !C5015nb.m22922a(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) || !C5015nb.m22922a(this.invalidForRetry, metaData.invalidForRetry) || !C5015nb.m22922a(this.analytics, metaData.analytics) || !C5015nb.m22922a(this.metadataUpdateVersion, metaData.metadataUpdateVersion) || !C5015nb.m22922a(this.networkTests, metaData.networkTests) || !C5015nb.m22922a(this.triggeredLinks, metaData.triggeredLinks) || !C5015nb.m22922a(this.rsc, metaData.rsc) || !C5015nb.m22922a(this.rcd, metaData.rcd) || !C5015nb.m22922a(this.netDiag, metaData.netDiag) || !C5015nb.m22922a(this.staleDc, metaData.staleDc) || !C5015nb.m22922a(this.motion, metaData.motion) || !C5015nb.m22922a(this.air, metaData.air) || !C5015nb.m22922a(this.telephony, metaData.telephony) || !C5015nb.m22922a(this.anrConfig, metaData.anrConfig) || !C5015nb.m22922a(this.location, metaData.location) || !C5015nb.m22922a(this.lastVersion, metaData.lastVersion)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo21193f() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    /* renamed from: g */
    public BluetoothConfig mo21194g() {
        return this.btConfig;
    }

    /* renamed from: h */
    public String mo21195h() {
        return this.calcProd;
    }

    public int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.invalidForRetry, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.netDiag, this.staleDc, this.motion, this.air, this.telephony, this.anrConfig, this.location, this.lastVersion};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public boolean mo21197i() {
        return this.chromeCustomeTabsExternal;
    }

    /* renamed from: j */
    public boolean mo21198j() {
        return this.chromeCustomeTabsInternal;
    }

    /* renamed from: k */
    public boolean mo21199k() {
        return this.closeAdAfterClick;
    }

    /* renamed from: l */
    public ConsentConfig mo21200l() {
        return this.consentDetails;
    }

    /* renamed from: m */
    public boolean mo21201m() {
        return this.disableSendAdvertisingId;
    }

    /* renamed from: n */
    public String mo21202n() {
        int indexOf;
        String c = f22407k.mo21189c();
        String str = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        if (c.startsWith(str + "://") || (indexOf = c.indexOf(58)) == -1) {
            return c;
        }
        StringBuilder a = C12458z0.m53804a(str);
        a.append(c.substring(indexOf));
        return a.toString();
    }

    /* renamed from: o */
    public long mo21203o() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    /* renamed from: p */
    public long mo21204p() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    /* renamed from: q */
    public Set<String> mo21205q() {
        return this.installersList;
    }

    /* renamed from: s */
    public Set<Integer> mo21206s() {
        return this.invalidForRetry;
    }

    /* renamed from: t */
    public String mo21207t() {
        return this.lastVersion;
    }

    /* renamed from: u */
    public LocationMetadata mo21208u() {
        return this.location;
    }

    /* renamed from: v */
    public MotionMetadata mo21209v() {
        return this.motion;
    }

    /* renamed from: w */
    public NetworkDiagnosticConfig mo21210w() {
        return this.netDiag;
    }

    /* renamed from: x */
    public NetworkTestsMetaData mo21211x() {
        return this.networkTests;
    }

    /* renamed from: y */
    public int mo21212y() {
        return this.notVisibleBannerReloadInterval;
    }

    /* renamed from: z */
    public int mo21213z() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    /* renamed from: b */
    public boolean mo21188b() {
        return !this.dns;
    }

    /* renamed from: a */
    public static void m23242a(Context context, MetaData metaData, MetaDataRequest.RequestReason requestReason, boolean z) {
        ArrayList arrayList;
        boolean z2;
        Handler handler;
        synchronized (f22400d) {
            arrayList = new ArrayList(f22407k.f22411c);
            f22407k.f22411c.clear();
            metaData.f22411c = f22407k.f22411c;
            metaData.mo21184a();
            metaData.metadataUpdateVersion = "4.10.2";
            C5126w2.m23394b(context, "StartappMetadata", metaData);
            z2 = false;
            metaData.f22409a = false;
            metaData.f22410b = true;
            if (!C5015nb.m22922a(f22407k, metaData)) {
                z = true;
            }
            f22407k = metaData;
            if (C5015nb.m22936e(context)) {
                try {
                    C5069e d = ComponentLocator.m23305a(context).mo21217d();
                    int i = d.getInt("totalSessions", 0);
                    C5069e.C5070a a = d.edit();
                    int i2 = i + 1;
                    a.mo21101a("totalSessions", Integer.valueOf(i2));
                    a.f22385a.putInt("totalSessions", i2);
                    a.apply();
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
            handler = null;
            f22408l = null;
        }
        if (Math.random() < f22407k.flh) {
            z2 = true;
        }
        if (z2) {
            handler = new Handler(Looper.getMainLooper());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5073c cVar = (C5073c) it.next();
            if (z2) {
                handler.post(new C12294b(cVar, requestReason, z));
            } else {
                cVar.mo20651a(requestReason, z);
            }
        }
    }

    /* renamed from: c */
    public String mo21189c() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f22404h;
    }

    /* renamed from: a */
    public static void m23245a(MetaDataRequest.RequestReason requestReason) {
        ArrayList arrayList;
        synchronized (f22400d) {
            arrayList = new ArrayList(f22407k.f22411c);
            f22407k.f22411c.clear();
            f22407k.f22409a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C5073c) it.next()).mo20650a(requestReason);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r8.mo20651a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21185a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r6, boolean r7, com.startapp.sdk.adsbase.remoteconfig.C5073c r8, boolean r9) {
        /*
            r3 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            if (r8 == 0) goto L_0x0008
            r8.mo20651a(r6, r0)
        L_0x0008:
            java.lang.Object r1 = f22400d
            monitor-enter(r1)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f22407k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f22410b     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x001d
            if (r9 == 0) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x001c
            if (r8 == 0) goto L_0x001c
            r8.mo20651a(r6, r0)
        L_0x001c:
            return
        L_0x001d:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f22407k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f22409a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0047
        L_0x0025:
            r9 = 1
            r3.f22409a = r9     // Catch:{ all -> 0x0052 }
            r3.f22410b = r0     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.adsbase.remoteconfig.a r0 = f22408l     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0030
            r0.f54675j = r9     // Catch:{ all -> 0x0052 }
        L_0x0030:
            com.startapp.sdk.adsbase.remoteconfig.a r9 = new com.startapp.sdk.adsbase.remoteconfig.a     // Catch:{ all -> 0x0052 }
            r9.<init>(r4, r5, r6)     // Catch:{ all -> 0x0052 }
            f22408l = r9     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r4)     // Catch:{ all -> 0x0052 }
            java.util.concurrent.Executor r5 = r4.mo21229p()     // Catch:{ all -> 0x0052 }
            com.startapp.g3 r6 = new com.startapp.g3     // Catch:{ all -> 0x0052 }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x0052 }
            r5.execute(r6)     // Catch:{ all -> 0x0052 }
        L_0x0047:
            if (r7 == 0) goto L_0x0050
            if (r8 == 0) goto L_0x0050
            com.startapp.sdk.adsbase.remoteconfig.MetaData r4 = f22407k     // Catch:{ all -> 0x0052 }
            r4.mo21186a((com.startapp.sdk.adsbase.remoteconfig.C5073c) r8)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.MetaData.mo21185a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean, com.startapp.sdk.adsbase.remoteconfig.c, boolean):void");
    }

    /* renamed from: a */
    public void mo21186a(C5073c cVar) {
        synchronized (f22400d) {
            this.f22411c.add(cVar);
        }
    }

    /* renamed from: a */
    public int mo21181a(Context context) {
        return m23241a(context, this.periodicForegroundEventSec);
    }

    /* renamed from: a */
    public static int m23241a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f22405i;
        }
        if (C12437y.m53782a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i = iArr[0];
            if (i <= 0) {
                return f22405i[0];
            }
            return i;
        } else if (!C12437y.m53782a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return iArr[2];
        } else {
            int i2 = iArr[1];
            if (i2 <= 0) {
                return f22405i[1];
            }
            return i2;
        }
    }

    /* renamed from: a */
    public String mo21182a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 1) {
            String str = this.adPlatformBannerHostSecured;
            return str != null ? str : mo21189c();
        } else if (ordinal == 7) {
            String str2 = this.adPlatformReturnHostSecured;
            return str2 != null ? str2 : mo21189c();
        } else if (ordinal == 3) {
            String str3 = this.adPlatformSplashHostSecured;
            return str3 != null ? str3 : mo21189c();
        } else if (ordinal == 4) {
            String str4 = this.adPlatformOverlayHostSecured;
            return str4 != null ? str4 : mo21189c();
        } else if (ordinal != 5) {
            return mo21189c();
        } else {
            String str5 = this.adPlatformNativeHostSecured;
            return str5 != null ? str5 : mo21189c();
        }
    }

    /* renamed from: a */
    public void mo21184a() {
        ArrayList arrayList;
        this.adPlatformHostSecured = mo21183a(this.adPlatformHostSecured, f22404h);
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (String a : list) {
                String a2 = mo21183a(a, (String) null);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        this.adPlatformBannerHostSecured = mo21183a(this.adPlatformBannerHostSecured, (String) null);
        this.adPlatformSplashHostSecured = mo21183a(this.adPlatformSplashHostSecured, (String) null);
        this.adPlatformReturnHostSecured = mo21183a(this.adPlatformReturnHostSecured, (String) null);
        this.adPlatformOverlayHostSecured = mo21183a(this.adPlatformOverlayHostSecured, (String) null);
        this.adPlatformNativeHostSecured = mo21183a(this.adPlatformNativeHostSecured, (String) null);
    }

    /* renamed from: a */
    public final String mo21183a(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    /* renamed from: a */
    public static void m23243a(Context context, String str) {
        if (str != null && !str.equals("")) {
            if (!C11812c1.m52083a(context, "close_button", ".png")) {
                Map<Activity, Integer> map = C5015nb.f22145a;
                new C11840d1(context, str + "close_button" + ".png", new C5072a(context, "close_button"), 0).mo45233a();
            }
            Map<Activity, Integer> map2 = C5015nb.f22145a;
            for (String str2 : AdsConstants.f54497h) {
                if (!C11812c1.m52083a(context, str2, ".png")) {
                    new C11840d1(context, str + str2 + ".png", new C5072a(context, str2), 0).mo45233a();
                }
            }
            Map<Activity, Integer> map3 = C5015nb.f22145a;
            for (String str3 : AdsConstants.f54498i) {
                if (!C11812c1.m52083a(context, str3, ".png")) {
                    new C11840d1(context, str + str3 + ".png", new C5072a(context, str3), 0).mo45233a();
                }
            }
            if (!C11812c1.m52083a(context, "logo", ".png")) {
                new C11840d1(context, str + "logo" + ".png", new C5072a(context, "logo"), 0).mo45233a();
            }
        }
    }
}
