package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C11262W;
import com.ironsource.mediationsdk.C11377f;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11431p;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.sdk.C11444d;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.k0 */
final class C11405k0 implements C11444d {

    /* renamed from: a */
    ConcurrentHashMap<String, C11480u> f51287a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f51288b;

    /* renamed from: c */
    private C11483b f51289c;

    C11405k0(List<NetworkSettings> list, C11431p pVar, String str, String str2) {
        this.f51288b = str;
        this.f51289c = pVar.f51435l;
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.f51287a.put(next.getSubProviderId(), new C11480u(str, str2, next, this, pVar.f51428e, a));
                }
            } else {
                m51040e("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: b */
    static void m51037b(int i, C11480u uVar, Object[][] objArr) {
        Map<String, Object> c = uVar.mo44467c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, new JSONObject(c)));
    }

    /* renamed from: c */
    static void m51038c(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C11296h.m50466e().mo43979b(new C11308a(IronSourceConstants.RV_INSTANCE_NOT_FOUND, new JSONObject(hashMap)));
    }

    /* renamed from: d */
    private static void m51039d(C11480u uVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + uVar.mo44576d() + " : " + str, 0);
    }

    /* renamed from: e */
    private static void m51040e(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyRvManager " + str, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44343a(int i, C11480u uVar) {
        m51037b(i, uVar, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo44344a(IronSourceError ironSourceError, C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdShowFailed error=" + ironSourceError);
        m51037b(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, uVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        C11262W.m50363a().mo43933b(uVar.mo44579f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo44345a(IronSourceError ironSourceError, C11480u uVar, long j) {
        m51039d(uVar, "onRewardedVideoAdLoadFailed error=" + ironSourceError);
        m51037b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, uVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        if (ironSourceError.getErrorCode() == 1058) {
            m51037b(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, uVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m51037b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, uVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        C11262W.m50363a().mo43932a(uVar.mo44579f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo44346a(C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdOpened");
        m51037b(1005, uVar, (Object[][]) null);
        C11262W a = C11262W.m50363a();
        String f = uVar.mo44579f();
        if (a.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11262W.C11265c(f));
        }
        if (uVar.mo44582i()) {
            for (String a2 : uVar.f51757i) {
                C11377f.m50856a();
                String a3 = C11377f.m50857a(a2, uVar.mo44576d(), uVar.mo44578e(), uVar.f51758j, "", "", "", "");
                C11377f.m50856a();
                C11377f.m50864i("onRewardedVideoAdOpened", uVar.mo44576d(), a3);
            }
        }
    }

    /* renamed from: a */
    public final void mo44347a(C11480u uVar, long j) {
        m51039d(uVar, "onRewardedVideoLoadSuccess");
        m51037b(1002, uVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        C11262W a = C11262W.m50363a();
        String f = uVar.mo44579f();
        if (a.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11262W.C11263a(f));
        }
    }

    /* renamed from: a */
    public final void mo44348a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        C11262W a;
        try {
            if (!this.f51287a.containsKey(str)) {
                m51038c(IronSourceConstants.RV_INSTANCE_NOT_FOUND, str);
                C11262W.m50363a().mo43932a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            C11480u uVar = this.f51287a.get(str);
            if (z) {
                if (!uVar.mo44582i()) {
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in IAB flow must be called by bidder instances");
                    m51040e(buildLoadFailedError.getErrorMessage());
                    m51037b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, uVar, (Object[][]) null);
                    a = C11262W.m50363a();
                } else {
                    C11377f.m50856a();
                    JSONObject e = C11377f.m50862e(str2);
                    C11377f.m50856a();
                    C11377f.C11378a b = C11377f.m50858b(e);
                    C11377f.m50856a();
                    C11291c a2 = C11377f.m50855a(uVar.mo44576d(), b.f51106b);
                    if (a2 != null) {
                        uVar.mo44571a(a2.mo44005b());
                        uVar.mo44574b(b.f51105a);
                        uVar.mo44572a(b.f51108d);
                        m51037b(1001, uVar, (Object[][]) null);
                        uVar.mo44535a(a2.mo44005b(), b.f51105a, b.f51108d, a2.mo44007d());
                        return;
                    }
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                    m51040e(buildLoadFailedError.getErrorMessage());
                    m51037b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, uVar, (Object[][]) null);
                    a = C11262W.m50363a();
                }
                a.mo43932a(str, buildLoadFailedError);
            } else if (!uVar.mo44582i()) {
                m51037b(1001, uVar, (Object[][]) null);
                uVar.mo44535a("", "", (JSONObject) null, (List<String>) null);
            } else {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in non IAB flow must be called by non bidder instances");
                m51040e(buildLoadFailedError2.getErrorMessage());
                m51037b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, uVar, (Object[][]) null);
                C11262W.m50363a().mo43932a(str, buildLoadFailedError2);
            }
        } catch (Exception e2) {
            m51040e("loadRewardedVideoWithAdm exception " + e2.getMessage());
            C11262W.m50363a().mo43932a(str, ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm exception"));
        }
    }

    /* renamed from: b */
    public final void mo44349b(C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdClosed");
        m51037b(IronSourceConstants.RV_INSTANCE_CLOSED, uVar, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11499n.m51312a().mo44568b(1))}});
        C11499n.m51312a().mo44566a(1);
        C11262W a = C11262W.m50363a();
        String f = uVar.mo44579f();
        if (a.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11262W.C11266d(f));
        }
    }

    /* renamed from: c */
    public final void mo44350c(C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdClicked");
        m51037b(1006, uVar, (Object[][]) null);
        C11262W a = C11262W.m50363a();
        String f = uVar.mo44579f();
        if (a.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11262W.C11268f(f));
        }
    }

    /* renamed from: d */
    public final void mo44351d(C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdVisible");
        m51037b(IronSourceConstants.RV_INSTANCE_VISIBLE, uVar, (Object[][]) null);
    }

    /* renamed from: e */
    public final void mo44352e(C11480u uVar) {
        m51039d(uVar, "onRewardedVideoAdRewarded");
        Map<String, Object> c = uVar.mo44467c();
        if (!TextUtils.isEmpty(C11232E.m50103a().f50423m)) {
            c.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C11232E.m50103a().f50423m);
        }
        if (C11232E.m50103a().f50424n != null) {
            for (String next : C11232E.m50103a().f50424n.keySet()) {
                c.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C11232E.m50103a().f50424n.get(next));
            }
        }
        Placement a = C11232E.m50103a().f50430t.f51666c.f51377a.mo44446a();
        if (a != null) {
            c.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, a.getPlacementName());
            c.put(IronSourceConstants.EVENTS_REWARD_NAME, a.getRewardName());
            c.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a.getRewardAmount()));
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "defaultPlacement is null", 3);
        }
        C11308a aVar = new C11308a(1010, new JSONObject(c));
        aVar.mo44039a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.mo44040b(), uVar.mo44576d()));
        C11296h.m50466e().mo43979b(aVar);
        C11262W a2 = C11262W.m50363a();
        String f = uVar.mo44579f();
        if (a2.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11262W.C11269g(f));
        }
    }
}
