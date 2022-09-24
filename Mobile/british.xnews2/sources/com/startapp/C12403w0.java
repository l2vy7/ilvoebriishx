package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/* renamed from: com.startapp.w0 */
/* compiled from: Sta */
public abstract class C12403w0 {

    /* renamed from: g0 */
    public static final Collection<Integer> f54962g0;

    /* renamed from: A */
    public String f54963A;

    /* renamed from: B */
    public String f54964B;

    /* renamed from: C */
    public String f54965C;

    /* renamed from: D */
    public String f54966D;

    /* renamed from: E */
    public String f54967E;

    /* renamed from: F */
    public String f54968F;

    /* renamed from: G */
    public String f54969G;

    /* renamed from: H */
    public String f54970H;

    /* renamed from: I */
    public String f54971I;

    /* renamed from: J */
    public String f54972J;

    /* renamed from: K */
    public String f54973K = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;

    /* renamed from: L */
    public int f54974L;

    /* renamed from: M */
    public int f54975M;

    /* renamed from: N */
    public float f54976N;

    /* renamed from: O */
    public Boolean f54977O;

    /* renamed from: P */
    public int f54978P = 3;

    /* renamed from: Q */
    public String f54979Q;

    /* renamed from: R */
    public String f54980R;

    /* renamed from: S */
    public int f54981S;

    /* renamed from: T */
    public boolean f54982T;

    /* renamed from: U */
    public boolean f54983U;

    /* renamed from: V */
    public boolean f54984V;

    /* renamed from: W */
    public boolean f54985W;

    /* renamed from: X */
    public String f54986X;

    /* renamed from: Y */
    public String f54987Y;

    /* renamed from: Z */
    public final int f54988Z;

    /* renamed from: a */
    public String f54989a;

    /* renamed from: a0 */
    public Long f54990a0;

    /* renamed from: b */
    public String f54991b;

    /* renamed from: b0 */
    public Integer f54992b0;

    /* renamed from: c */
    public String f54993c = "4.10.2";

    /* renamed from: c0 */
    public Boolean f54994c0;

    /* renamed from: d */
    public Map<String, String> f54995d = new TreeMap();

    /* renamed from: d0 */
    public Boolean f54996d0;

    /* renamed from: e */
    public Map<String, ?> f54997e;

    /* renamed from: e0 */
    public Boolean f54998e0;

    /* renamed from: f */
    public String f54999f;

    /* renamed from: f0 */
    public Boolean f55000f0;

    /* renamed from: g */
    public C12172s f55001g;

    /* renamed from: h */
    public String f55002h;

    /* renamed from: i */
    public String f55003i;

    /* renamed from: j */
    public String f55004j;

    /* renamed from: k */
    public String f55005k;

    /* renamed from: l */
    public String f55006l;

    /* renamed from: m */
    public String f55007m;

    /* renamed from: n */
    public String f55008n;

    /* renamed from: o */
    public String f55009o;

    /* renamed from: p */
    public String f55010p;

    /* renamed from: q */
    public Boolean f55011q;

    /* renamed from: r */
    public Boolean f55012r;

    /* renamed from: s */
    public String f55013s;

    /* renamed from: t */
    public boolean f55014t;

    /* renamed from: u */
    public int f55015u;

    /* renamed from: v */
    public String f55016v;

    /* renamed from: w */
    public String f55017w;

    /* renamed from: x */
    public String f55018x;

    /* renamed from: y */
    public String f55019y;

    /* renamed from: z */
    public String f55020z;

    static {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add(23);
        }
        if (i >= 26) {
            arrayList.add(22);
        }
        if (i >= 23) {
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(8);
        }
        f54962g0 = Collections.unmodifiableCollection(arrayList);
    }

    public C12403w0(int i) {
        new HashMap();
        this.f54988Z = i;
    }

    /* renamed from: a */
    public void mo46693a(String str) {
        this.f54987Y = str;
    }

    /* renamed from: a */
    public boolean mo46275a() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b A[SYNTHETIC, Splitter:B:46:0x011b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45533b(android.content.Context r5, com.startapp.sdk.adsbase.model.AdPreferences r6) {
        /*
            r4 = this;
            com.startapp.n9 r0 = com.startapp.C5014n9.f22141d
            java.lang.String r0 = r0.f22142a
            r4.f54979Q = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r4.f55006l = r0
            java.lang.String r0 = android.os.Build.MODEL
            r4.f55005k = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.f55007m = r0
            if (r6 == 0) goto L_0x001e
            java.lang.String r6 = r6.getAge(r5)
            r4.f54999f = r6
        L_0x001e:
            com.startapp.sdk.components.ComponentLocator r6 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r5)
            com.startapp.w1<com.startapp.ba> r6 = r6.f22449o
            java.lang.Object r6 = r6.mo46698b()
            com.startapp.ba r6 = (com.startapp.C11805ba) r6
            java.lang.Object r6 = r6.mo45342b()
            com.startapp.aa r6 = (com.startapp.C11788aa) r6
            java.lang.String r6 = r6.f52588a
            r4.f55003i = r6
            int r6 = com.startapp.C12437y.f55146a
            r6 = 0
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0047 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.versionName     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            r4.f54980R = r1
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0059 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0059 }
            int r1 = r1.versionCode     // Catch:{ all -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r4.f54981S = r1
            boolean r1 = com.startapp.C12437y.m53786b((android.content.Context) r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.f55011q = r1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0083 }
            r2 = 17
            java.lang.String r3 = "adb_enabled"
            if (r1 >= r2) goto L_0x0077
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ all -> 0x0083 }
            int r1 = android.provider.Settings.Secure.getInt(r1, r3, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007f
        L_0x0077:
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ all -> 0x0083 }
            int r1 = android.provider.Settings.Global.getInt(r1, r3, r0)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            if (r1 == 0) goto L_0x0083
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            r4.f54982T = r1
            boolean r0 = com.startapp.C12012k8.m52540a(r5)     // Catch:{ all -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            r4.f54983U = r0
            boolean r0 = com.startapp.C12437y.m53787c(r5)
            r4.f54984V = r0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.startapp.C12437y.m53782a((android.content.Context) r5, (java.lang.String) r1)
            if (r1 == 0) goto L_0x00bb
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x00bb
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L_0x00bb
            boolean r0 = r0.isRoaming()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00bc
        L_0x00bb:
            r0 = r6
        L_0x00bc:
            r4.f55012r = r0
            boolean r0 = com.startapp.C5015nb.m22937f(r5)
            r4.f54985W = r0
            android.content.res.Resources r0 = r5.getResources()
            if (r0 == 0) goto L_0x00dc
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x00dc
            int r1 = r0.widthPixels
            r4.f54974L = r1
            int r1 = r0.heightPixels
            r4.f54975M = r1
            float r0 = r0.density
            r4.f54976N = r0
        L_0x00dc:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r5)
            com.startapp.w5 r1 = r0.mo21227n()
            java.lang.Object r1 = r1.mo45342b()
            com.startapp.v5 r1 = (com.startapp.C12387v5) r1
            java.lang.String r2 = r1.f54886a
            r4.f55008n = r2
            java.lang.String r1 = r1.f54887b
            r4.f55009o = r1
            com.startapp.w1<com.startapp.s4> r1 = r0.f22438d
            java.lang.Object r1 = r1.mo46698b()
            com.startapp.s4 r1 = (com.startapp.C12177s4) r1
            java.lang.Object r1 = r1.mo45342b()
            com.startapp.r4 r1 = (com.startapp.C12159r4) r1
            java.lang.String r1 = r1.f54100a
            r4.f55010p = r1
            com.startapp.sdk.adsbase.e r0 = r0.mo21217d()
            java.lang.String r1 = "USER_CONSENT_PERSONALIZED_ADS_SERVING"
            java.lang.String r1 = r0.getString(r1, r6)
            r4.f54986X = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f54995d
            java.lang.String r2 = "sharedPrefsWrappers"
            java.lang.String r6 = r0.getString(r2, r6)
            if (r6 != 0) goto L_0x011b
            goto L_0x013a
        L_0x011b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013a }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x013a }
            java.util.Iterator r6 = r0.keys()     // Catch:{ JSONException -> 0x013a }
        L_0x0124:
            boolean r2 = r6.hasNext()     // Catch:{ JSONException -> 0x013a }
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x013a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x013a }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x013a }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x013a }
            goto L_0x0124
        L_0x013a:
            boolean r5 = com.startapp.C5015nb.m22936e((android.content.Context) r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.f54977O = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12403w0.mo45533b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    /* renamed from: c */
    public void mo46695c(Context context) {
        if (!(this.f54991b != null)) {
            C5000a0 c = ComponentLocator.m23305a(context).mo21216c();
            String str = c.f22109c;
            if (str == null) {
                synchronized (c.f22107a) {
                    str = c.f22109c;
                    if (str == null) {
                        str = c.f22108b.getString("c88d4eab540fab77", (String) null);
                    }
                }
            }
            this.f54989a = str;
            String str2 = c.f22110d;
            if (str2 == null) {
                synchronized (c.f22107a) {
                    str2 = c.f22110d;
                    if (str2 == null && (str2 = c.f22108b.getString("2696a7f502faed4b", (String) null)) == null) {
                        str2 = c.f22108b.getString("31721150b470a3b9", (String) null);
                    }
                }
            }
            this.f54991b = str2;
        }
        this.f55002h = context.getPackageName();
    }

    /* renamed from: d */
    public void mo46696d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        String str = "e105";
        int i = 0;
        try {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager2 == null) {
                str = "e100";
            } else if (C12437y.m53782a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager2.getActiveNetwork();
                    if (!(activeNetwork == null || (networkCapabilities2 = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null)) {
                        if (!networkCapabilities2.hasTransport(1)) {
                            if (networkCapabilities2.hasTransport(0)) {
                                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager != null) {
                                    str = Integer.toString(telephonyManager.getNetworkType());
                                }
                                str = "e101";
                            }
                        }
                    }
                    str = "e102";
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) != 0) {
                            if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) == 0) {
                                TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager2 != null) {
                                    str = Integer.toString(telephonyManager2.getNetworkType());
                                }
                                str = "e101";
                            }
                        }
                    }
                    str = "e102";
                }
                str = "WIFI";
            }
        } catch (Exception unused) {
        }
        this.f55013s = str;
        String str2 = ComponentLocator.m23305a(context).mo21234u().f53289h;
        this.f54970H = str2;
        this.f55016v = str2;
        C12459z1 e = ComponentLocator.m23305a(context).mo21218e();
        e.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 21 && C12437y.m53782a(e.f55186a, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) e.f55186a.getSystemService("connectivity")) != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks != null) {
                    int i2 = 0;
                    for (Network network : allNetworks) {
                        if (!(network == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                            for (int i3 = 0; i3 <= 8; i3++) {
                                try {
                                    if (networkCapabilities.hasTransport(i3)) {
                                        i2 |= 1 << i3;
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                    i = i2;
                }
                this.f55015u = i;
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        i = -1;
        this.f55015u = i;
    }

    /* renamed from: e */
    public void mo46697e(Context context) {
        C11969ia iaVar = (C11969ia) ComponentLocator.m23305a(context).mo21233t().mo45342b();
        if (iaVar.mo45453a(7) == 5) {
            this.f55017w = iaVar.mo45455b(8);
            this.f55018x = iaVar.mo45455b(9);
            this.f55019y = iaVar.mo45455b(15);
            this.f55020z = iaVar.mo45455b(16);
        }
        int a = iaVar.mo45453a(10);
        if (!(a == 0 || a == 2)) {
            this.f54963A = iaVar.mo45455b(11);
            this.f54964B = iaVar.mo45455b(12);
        }
        this.f54965C = iaVar.mo45455b(4);
        this.f54966D = iaVar.mo45455b(3);
        this.f54967E = iaVar.mo45455b(5);
        boolean z = true;
        this.f54968F = iaVar.mo45455b(1);
        this.f54969G = iaVar.mo45455b(2);
        this.f54971I = iaVar.mo45455b(13);
        if (iaVar.mo45453a(14) != 1) {
            z = false;
        }
        this.f55014t = z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46692a(android.content.Context r1, com.startapp.sdk.adsbase.model.AdPreferences r2) {
        /*
            r0 = this;
            r0.mo46695c(r1)
            r0.mo45533b(r1, r2)     // Catch:{ all -> 0x0006 }
        L_0x0006:
            r0.mo46696d(r1)     // Catch:{ all -> 0x000a }
            goto L_0x000e
        L_0x000a:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)
        L_0x000e:
            r0.mo46697e(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)
        L_0x0016:
            com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r1)     // Catch:{ all -> 0x0025 }
            com.startapp.r8 r2 = r2.mo21230q()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r2.mo45716a((java.lang.Object) r0)     // Catch:{ all -> 0x0025 }
            r0.f54972J = r2     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)
        L_0x0029:
            r0.mo46691a((android.content.Context) r1)     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r2 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)
        L_0x0031:
            r0.mo46694b(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12403w0.mo46692a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        Map<String, ?> map = this.f54997e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                g8Var.mo45382a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        g8Var.mo45382a("publisherId", (Object) this.f54989a, false, true);
        g8Var.mo45382a(InAppPurchaseMetaData.KEY_PRODUCT_ID, (Object) this.f54991b, mo46275a(), true);
        g8Var.mo45382a("os", (Object) this.f54973K, true, true);
        g8Var.mo45382a("sdkVersion", (Object) this.f54993c, false, true);
        g8Var.mo45382a("flavor", (Object) 1023, false, true);
        Map<String, String> map2 = this.f54995d;
        if (map2 != null && !map2.isEmpty()) {
            String str = "";
            for (String next2 : this.f54995d.keySet()) {
                str = str + next2 + ":" + this.f54995d.get(next2) + ";";
            }
            g8Var.mo45382a("frameworksData", (Object) str.substring(0, str.length() - 1), false, false);
        }
        g8Var.mo45382a("packageId", (Object) this.f55002h, false, true);
        g8Var.mo45382a("installerPkg", (Object) this.f55003i, false, true);
        g8Var.mo45382a(IronSourceSegment.AGE, (Object) this.f54999f, false, true);
        C12172s sVar = this.f55001g;
        if (sVar != null) {
            g8Var.mo45382a("userAdvertisingId", (Object) sVar.f54121a, false, true);
            boolean z = this.f55001g.f54123c;
            if (z) {
                g8Var.mo45382a("limat", (Object) Boolean.valueOf(z), false, true);
            }
            g8Var.mo45382a("advertisingIdSource", (Object) this.f55001g.f54122b, false, true);
        }
        String str2 = this.f55004j;
        if (str2 != null) {
            g8Var.mo45382a("duid", (Object) str2, false, true);
        }
        g8Var.mo45382a("model", (Object) this.f55005k, false, true);
        g8Var.mo45382a("manufacturer", (Object) this.f55006l, false, true);
        g8Var.mo45382a("deviceVersion", (Object) this.f55007m, false, true);
        g8Var.mo45382a("locale", (Object) this.f55008n, false, true);
        g8Var.mo45382a("localeList", (Object) this.f55009o, false, true);
        g8Var.mo45382a("inputLangs", (Object) this.f55010p, false, true);
        g8Var.mo45382a("isp", (Object) this.f55017w, false, true);
        g8Var.mo45382a("ispName", (Object) this.f55018x, false, true);
        g8Var.mo45382a("ispCarrId", (Object) this.f55019y, false, true);
        g8Var.mo45382a("ispCarrIdName", (Object) this.f55020z, false, true);
        g8Var.mo45382a("netOper", (Object) this.f54963A, false, true);
        g8Var.mo45382a("networkOperName", (Object) this.f54964B, false, true);
        g8Var.mo45382a("cid", (Object) this.f54965C, false, true);
        g8Var.mo45382a("lac", (Object) this.f54966D, false, true);
        g8Var.mo45382a("tac", (Object) this.f54967E, false, true);
        g8Var.mo45382a("blat", (Object) this.f54968F, false, true);
        g8Var.mo45382a("blon", (Object) this.f54969G, false, true);
        g8Var.mo45382a("subPublisherId", (Object) null, false, true);
        g8Var.mo45382a("subProductId", (Object) null, false, true);
        g8Var.mo45382a("retryCount", (Object) null, false, true);
        g8Var.mo45382a("roaming", (Object) this.f55012r, false, true);
        g8Var.mo45382a("grid", (Object) this.f55013s, false, true);
        if (this.f55014t) {
            g8Var.mo45382a("c5g", (Object) IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false);
        }
        int i = this.f55015u;
        if (i >= 0) {
            g8Var.mo45382a("transport", (Object) String.valueOf(i), false, false);
        }
        g8Var.mo45382a("silev", (Object) this.f55016v, false, true);
        g8Var.mo45382a("cellSignalLevel", (Object) this.f54970H, false, true);
        g8Var.mo45382a("cellTimingAdv", (Object) this.f54971I, false, true);
        g8Var.mo45382a("outsource", (Object) this.f55011q, false, true);
        g8Var.mo45382a("width", (Object) String.valueOf(this.f54974L), false, true);
        g8Var.mo45382a("height", (Object) String.valueOf(this.f54975M), false, true);
        g8Var.mo45382a("density", (Object) String.valueOf(this.f54976N), false, true);
        g8Var.mo45382a("fgApp", (Object) this.f54977O, false, true);
        g8Var.mo45382a("sdkId", (Object) String.valueOf(this.f54978P), true, true);
        g8Var.mo45382a("clientSessionId", (Object) this.f54979Q, false, true);
        g8Var.mo45382a("appVersion", (Object) this.f54980R, false, true);
        g8Var.mo45382a("appCode", (Object) Integer.valueOf(this.f54981S), false, true);
        g8Var.mo45382a("timeSinceBoot", (Object) Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        g8Var.mo45382a("udbg", (Object) Boolean.valueOf(this.f54982T), false, true);
        g8Var.mo45382a("root", (Object) Boolean.valueOf(this.f54983U), false, true);
        g8Var.mo45382a("smltr", (Object) Boolean.valueOf(this.f54984V), false, true);
        g8Var.mo45382a("isddbg", (Object) Boolean.valueOf(this.f54985W), false, true);
        g8Var.mo45382a("pas", (Object) this.f54986X, false, true);
        g8Var.mo45382a("prm", (Object) this.f54987Y, false, false);
        g8Var.mo45382a("free", (Object) this.f54990a0, false, false);
        g8Var.mo45382a("chr", (Object) this.f54994c0, false, false);
        g8Var.mo45382a("blp", (Object) this.f54992b0, false, false);
        g8Var.mo45382a("hs", (Object) this.f54996d0, false, false);
        g8Var.mo45382a("lpm", (Object) this.f54998e0, false, false);
        g8Var.mo45382a("dm", (Object) this.f55000f0, false, false);
        g8Var.mo45382a("rsc", (Object) this.f54972J, false, true);
    }

    /* renamed from: b */
    public void mo46694b(Context context) {
        boolean z;
        try {
            this.f54990a0 = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f54990a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        boolean z2 = true;
        try {
            this.f54994c0 = null;
            this.f54992b0 = null;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra(IronSourceConstants.EVENTS_STATUS)) {
                    int intExtra = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
                    if (intExtra != 2) {
                        if (intExtra != 5) {
                            z = false;
                            this.f54994c0 = Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    this.f54994c0 = Boolean.valueOf(z);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f54992b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            C5004d4.m22887a(th2);
        }
        try {
            this.f54996d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    if (devices != null) {
                        int length = devices.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i];
                                if (audioDeviceInfo != null && f54962g0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        this.f54996d0 = Boolean.valueOf(z2);
                    }
                    z2 = false;
                    this.f54996d0 = Boolean.valueOf(z2);
                }
            }
        } catch (Throwable th3) {
            C5004d4.m22887a(th3);
        }
        try {
            this.f54998e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService2;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f54998e0 = Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }
        } catch (Throwable th4) {
            C5004d4.m22887a(th4);
        }
        try {
            this.f55000f0 = null;
            int i2 = context.getResources().getConfiguration().uiMode & 48;
            if (i2 == 32) {
                this.f55000f0 = Boolean.TRUE;
            } else if (i2 == 16) {
                this.f55000f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            C5004d4.m22887a(th5);
        }
    }

    /* renamed from: a */
    public void mo46691a(Context context) {
        if (!MetaData.f22407k.mo21201m()) {
            C12172s a = ComponentLocator.m23305a(context).mo21214a().mo46442a();
            this.f55001g = a;
            if (TextUtils.isEmpty(a.f54121a) || SessionDescription.SUPPORTED_SDP_VERSION.equals(a.f54121a)) {
                C12446y4 b = ComponentLocator.m23305a(context).f22444j.mo46698b();
                String str = b.f55155b;
                if (str == null) {
                    synchronized (b) {
                        str = b.f55155b;
                        if (str == null) {
                            str = b.f55154a.getString("e695c6d894060903", (String) null);
                            if (str == null) {
                                str = UUID.randomUUID().toString();
                                if (!b.f55154a.edit().putString("e695c6d894060903", str).commit()) {
                                    str = "00000000-0000-0000-0000-000000000000";
                                }
                            }
                            b.f55155b = str;
                        }
                    }
                }
                this.f55004j = str;
            }
            try {
                this.f54997e = ComponentLocator.m23305a(context).f22429E.mo46698b().getAll();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }
}
