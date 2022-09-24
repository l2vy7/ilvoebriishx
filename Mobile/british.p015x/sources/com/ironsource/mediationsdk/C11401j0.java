package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.C11377f;
import com.ironsource.mediationsdk.C11508z;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11423i;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.sdk.C11443c;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.j0 */
final class C11401j0 implements C11443c {

    /* renamed from: a */
    ConcurrentHashMap<String, C11439s> f51262a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C11483b f51263b;

    C11401j0(List<NetworkSettings> list, C11423i iVar, String str, String str2) {
        this.f51263b = iVar.f51390i;
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.f51262a.put(next.getSubProviderId(), new C11439s(str, str2, next, this, iVar.f51386e, a));
                }
            } else {
                m50999e("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: b */
    static void m50996b(int i, C11439s sVar, Object[][] objArr) {
        Map<String, Object> c = sVar.mo44467c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(c)));
    }

    /* renamed from: c */
    static void m50997c(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C11292d.m50446e().mo43979b(new C11308a(2500, new JSONObject(hashMap)));
    }

    /* renamed from: d */
    private static void m50998d(C11439s sVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + sVar.mo44576d() + " : " + str, 0);
    }

    /* renamed from: e */
    private static void m50999e(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyIsManager " + str, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44322a(int i, C11439s sVar) {
        m50996b(i, sVar, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo44323a(IronSourceError ironSourceError, C11439s sVar) {
        m50998d(sVar, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        m50996b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, sVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        C11508z.m51348a().mo44590b(sVar.mo44579f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo44324a(IronSourceError ironSourceError, C11439s sVar, long j) {
        m50998d(sVar, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            m50996b(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, sVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m50996b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, sVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        C11508z.m51348a().mo44589a(sVar.mo44579f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo44325a(C11439s sVar) {
        m50998d(sVar, "onInterstitialAdOpened");
        m50996b(IronSourceConstants.IS_INSTANCE_OPENED, sVar, (Object[][]) null);
        C11508z a = C11508z.m51348a();
        String f = sVar.mo44579f();
        if (a.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11508z.C11511d(f));
        }
        if (sVar.mo44582i()) {
            for (String a2 : sVar.f51757i) {
                C11377f.m50856a();
                String a3 = C11377f.m50857a(a2, sVar.mo44576d(), sVar.mo44578e(), sVar.f51758j, "", "", "", "");
                C11377f.m50856a();
                C11377f.m50864i("onInterstitialAdOpened", sVar.mo44576d(), a3);
            }
        }
    }

    /* renamed from: a */
    public final void mo44326a(C11439s sVar, long j) {
        m50998d(sVar, "onInterstitialAdReady");
        m50996b(2003, sVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        C11508z a = C11508z.m51348a();
        String f = sVar.mo44579f();
        if (a.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11508z.C11509b(f));
        }
    }

    /* renamed from: a */
    public final void mo44327a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        try {
            if (!this.f51262a.containsKey(str)) {
                m50997c(2500, str);
                C11508z.m51348a().mo44589a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                return;
            }
            C11439s sVar = this.f51262a.get(str);
            if (z) {
                if (!sVar.mo44582i()) {
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                    m50999e(buildLoadFailedError.getErrorMessage());
                    m50996b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, sVar, (Object[][]) null);
                } else {
                    C11377f.m50856a();
                    JSONObject e = C11377f.m50862e(str2);
                    C11377f.m50856a();
                    C11377f.C11378a b = C11377f.m50858b(e);
                    C11377f.m50856a();
                    C11291c a = C11377f.m50855a(sVar.mo44576d(), b.f51106b);
                    if (a != null) {
                        sVar.mo44571a(a.mo44005b());
                        sVar.mo44574b(b.f51105a);
                        sVar.mo44572a(b.f51108d);
                        m50996b(2002, sVar, (Object[][]) null);
                        sVar.mo44470a(a.mo44005b(), b.f51105a, b.f51108d, a.mo44007d());
                        return;
                    }
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                    m50999e(buildLoadFailedError.getErrorMessage());
                    m50996b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, sVar, (Object[][]) null);
                }
                C11508z.m51348a().mo44589a(str, buildLoadFailedError);
            } else if (!sVar.mo44582i()) {
                m50996b(2002, sVar, (Object[][]) null);
                sVar.mo44470a("", "", (JSONObject) null, (List<String>) null);
            } else {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                m50999e(buildLoadFailedError2.getErrorMessage());
                m50996b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, sVar, (Object[][]) null);
                C11508z.m51348a().mo44589a(str, buildLoadFailedError2);
            }
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            m50999e(buildLoadFailedError3.getErrorMessage());
            C11508z.m51348a().mo44589a(str, buildLoadFailedError3);
        }
    }

    /* renamed from: b */
    public final void mo44328b(C11439s sVar) {
        m50998d(sVar, "onInterstitialAdClosed");
        m50996b(IronSourceConstants.IS_INSTANCE_CLOSED, sVar, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11499n.m51312a().mo44568b(2))}});
        C11499n.m51312a().mo44566a(2);
        C11508z a = C11508z.m51348a();
        String f = sVar.mo44579f();
        if (a.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11508z.C11512e(f));
        }
    }

    /* renamed from: c */
    public final void mo44329c(C11439s sVar) {
        m50998d(sVar, "onInterstitialAdClicked");
        m50996b(2006, sVar, (Object[][]) null);
        C11508z a = C11508z.m51348a();
        String f = sVar.mo44579f();
        if (a.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11508z.C11514g(f));
        }
    }

    /* renamed from: d */
    public final void mo44330d(C11439s sVar) {
        m50996b(IronSourceConstants.IS_INSTANCE_VISIBLE, sVar, (Object[][]) null);
        m50998d(sVar, "onInterstitialAdVisible");
    }
}
