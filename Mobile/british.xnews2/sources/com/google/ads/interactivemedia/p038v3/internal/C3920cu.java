package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StrictMode;
import androidx.preference.C1067b;
import com.google.ads.interactivemedia.p038v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p038v3.api.AdsLoader;
import com.google.ads.interactivemedia.p038v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p038v3.api.AdsRequest;
import com.google.ads.interactivemedia.p038v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.p038v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p038v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.StreamRequest;
import com.google.ads.interactivemedia.p038v3.impl.data.C3780at;
import com.google.ads.interactivemedia.p038v3.impl.data.TestingConfiguration;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cu */
/* compiled from: IMASDK */
public final class C3920cu implements AdsLoader {

    /* renamed from: a */
    anp f16846a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f16847b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3958ee f16848c;

    /* renamed from: d */
    private final C3954ea f16849d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3940dn f16850e;

    /* renamed from: f */
    private final List<AdsLoader.AdsLoadedListener> f16851f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<String, AdsRequest> f16852g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<String, StreamRequest> f16853h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3973et f16854i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ImaSdkSettings f16855j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final TestingConfiguration f16856k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final StreamDisplayContainer f16857l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AdDisplayContainer f16858m;

    /* renamed from: n */
    private final Object f16859n;

    public C3920cu(Context context, Uri uri, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new C3958ee(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, adDisplayContainer, (StreamDisplayContainer) null);
        this.f16848c.mo15704b();
    }

    /* renamed from: d */
    static /* synthetic */ C3780at m16929d(C3920cu cuVar) {
        String str;
        SharedPreferences a = C1067b.m5461a(cuVar.f16847b);
        if (a == null) {
            return null;
        }
        try {
            int i = a.getInt("IABTCF_gdprApplies", 0);
            if (a.contains("IABTCF_gdprApplies")) {
                str = String.valueOf(i);
            } else {
                str = "";
            }
            return C3780at.create(str, a.getString("IABTCF_TCString", ""), a.getString("IABTCF_AddtlConsent", ""), a.getString("IABUSPrivacy_String", ""));
        } catch (ClassCastException e) {
            C4257pg.m18527f("Failed to read TCF Consent settings from SharedPreferences.", e);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ String m16931f(C3920cu cuVar) {
        if (cuVar.f16847b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            C4257pg.m18526e("Host application doesn't have ACCESS_NETWORK_STATE permission");
            return "android:0";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) cuVar.f16847b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "android:0";
        }
        return String.format(Locale.US, "android:%d:%d", new Object[]{Integer.valueOf(activeNetworkInfo.getType()), Integer.valueOf(activeNetworkInfo.getSubtype())});
    }

    /* renamed from: h */
    static /* synthetic */ C3918cs m16933h(C3920cu cuVar) {
        ActivityInfo activityInfo;
        PackageManager packageManager = cuVar.f16847b.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return C3918cs.create(packageInfo.versionCode, activityInfo.packageName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m16941p(C3920cu cuVar, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        for (AdsLoader.AdsLoadedListener onAdsManagerLoaded : cuVar.f16851f) {
            onAdsManagerLoaded.onAdsManagerLoaded(adsManagerLoadedEvent);
        }
    }

    /* renamed from: r */
    private final String m16943r() {
        TestingConfiguration testingConfiguration = this.f16856k;
        if (testingConfiguration == null || !testingConfiguration.ignoreStrictModeFalsePositives()) {
            return UUID.randomUUID().toString();
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        String uuid = UUID.randomUUID().toString();
        StrictMode.setThreadPolicy(threadPolicy);
        return uuid;
    }

    /* renamed from: a */
    public final void mo15642a() {
        this.f16848c.mo15704b();
    }

    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16850e.mo15681a(adErrorListener);
    }

    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f16851f.add(adsLoadedListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15643b() {
        synchronized (this.f16859n) {
            if (this.f16846a == null) {
                try {
                    this.f16846a = new anp(this.f16847b);
                } catch (RuntimeException unused) {
                    this.f16846a = null;
                }
            }
        }
    }

    public final void contentComplete() {
        this.f16848c.mo15717o(new C3949dw(C3947du.adsLoader, C3948dv.contentComplete, "*"));
    }

    public final ImaSdkSettings getSettings() {
        return this.f16855j;
    }

    public final void release() {
        AdDisplayContainer adDisplayContainer = this.f16858m;
        if (adDisplayContainer != null) {
            adDisplayContainer.destroy();
        }
        StreamDisplayContainer streamDisplayContainer = this.f16857l;
        if (streamDisplayContainer != null) {
            streamDisplayContainer.destroy();
        }
        C3958ee eeVar = this.f16848c;
        if (eeVar != null) {
            eeVar.mo15716n();
        }
        this.f16852g.clear();
        this.f16851f.clear();
        this.f16853h.clear();
    }

    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16850e.mo15682b(adErrorListener);
    }

    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f16851f.remove(adsLoadedListener);
    }

    public final void requestAds(AdsRequest adsRequest) {
        String r = m16943r();
        if (adsRequest == null) {
            this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
            return;
        }
        AdDisplayContainer adDisplayContainer = this.f16858m;
        if (adDisplayContainer == null) {
            this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must be provided.")));
        } else if (adDisplayContainer.getAdContainer() == null) {
            this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
        } else if (!aru.m14636b(adsRequest.getAdTagUrl()) || !aru.m14636b(adsRequest.getAdsResponse())) {
            if (this.f16858m.getPlayer() == null) {
                AdDisplayContainer adDisplayContainer2 = this.f16858m;
                adDisplayContainer2.setPlayer(ImaSdkFactory.createSdkOwnedPlayer(this.f16847b, adDisplayContainer2.getAdContainer()));
            }
            this.f16852g.put(r, adsRequest);
            this.f16848c.mo15708f(this.f16849d, r);
            this.f16848c.mo15714l(this.f16858m, r);
            new C3915cp(this, adsRequest, r).execute(new String[]{adsRequest.getAdTagUrl()});
        } else {
            this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
        }
    }

    public final String requestStream(StreamRequest streamRequest) {
        String r = m16943r();
        if (streamRequest == null) {
            this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null.")));
        } else {
            StreamDisplayContainer streamDisplayContainer = this.f16857l;
            if (streamDisplayContainer == null) {
                this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream display container must be provided.")));
            } else if (streamDisplayContainer.getVideoStreamPlayer() == null) {
                this.f16850e.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player.")));
            } else {
                this.f16853h.put(r, streamRequest);
                this.f16848c.mo15708f(this.f16849d, r);
                this.f16848c.mo15714l(this.f16857l, r);
                new C3919ct(this, streamRequest, r).execute(new Void[0]);
            }
        }
        return r;
    }

    public C3920cu(Context context, Uri uri, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new C3958ee(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, (AdDisplayContainer) null, streamDisplayContainer);
        this.f16848c.mo15704b();
    }

    private C3920cu(C3958ee eeVar, Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer, StreamDisplayContainer streamDisplayContainer) {
        this.f16849d = new C3914co(this);
        this.f16850e = new C3940dn();
        this.f16851f = new ArrayList(1);
        this.f16852g = new HashMap();
        this.f16853h = new HashMap();
        this.f16859n = new Object();
        this.f16848c = eeVar;
        this.f16847b = context;
        this.f16855j = imaSdkSettings == null ? ImaSdkFactory.getInstance().createImaSdkSettings() : imaSdkSettings;
        this.f16856k = testingConfiguration;
        this.f16858m = adDisplayContainer;
        this.f16857l = streamDisplayContainer;
        C3973et etVar = new C3973et(eeVar, context);
        this.f16854i = etVar;
        eeVar.mo15710h(etVar);
        if (adDisplayContainer != null) {
            adDisplayContainer.claim();
        }
        if (streamDisplayContainer != null) {
            streamDisplayContainer.claim();
        }
    }
}
