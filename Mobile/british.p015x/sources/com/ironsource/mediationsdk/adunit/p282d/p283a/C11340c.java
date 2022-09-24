package com.ironsource.mediationsdk.adunit.p282d.p283a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11377f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.adunit.p278b.C11310b;
import com.ironsource.mediationsdk.adunit.p278b.C11311c;
import com.ironsource.mediationsdk.adunit.p278b.C11312d;
import com.ironsource.mediationsdk.adunit.p279c.p280a.C11322b;
import com.ironsource.mediationsdk.adunit.p282d.C11337a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p285b.C11353c;
import com.ironsource.mediationsdk.p286c.C11361b;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.C11497m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.c */
public abstract class C11340c<Listener extends C11322b> implements AdapterAdListener, NetworkInitializationListener, C11311c, C11353c.C11354a, C11497m.C11498a {

    /* renamed from: a */
    protected C11337a f50897a;

    /* renamed from: b */
    protected Listener f50898b;

    /* renamed from: c */
    private BaseAdAdapter<?, AdapterAdListener> f50899c;

    /* renamed from: d */
    protected C11312d f50900d;

    /* renamed from: e */
    protected C11341a f50901e;

    /* renamed from: f */
    protected Placement f50902f;

    /* renamed from: g */
    private C11415a f50903g;

    /* renamed from: h */
    private JSONObject f50904h;

    /* renamed from: i */
    private String f50905i;

    /* renamed from: j */
    protected AdData f50906j;

    /* renamed from: k */
    private Long f50907k;

    /* renamed from: l */
    private C11490f f50908l;

    /* renamed from: m */
    private C11353c f50909m = new C11353c((long) (this.f50897a.f50889d * 1000));

    /* renamed from: com.ironsource.mediationsdk.adunit.d.a.c$a */
    public enum C11341a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public C11340c(C11337a aVar, BaseAdAdapter<?, ?> baseAdAdapter, C11415a aVar2, Listener listener) {
        this.f50897a = aVar;
        this.f50898b = listener;
        this.f50900d = new C11312d(aVar.f50886a, C11312d.C11314b.PROVIDER, this);
        this.f50903g = aVar2;
        this.f50904h = aVar2.f51347b;
        this.f50899c = baseAdAdapter;
        mo44156b(C11341a.NONE);
    }

    /* renamed from: a */
    private boolean mo44154a() {
        return this.f50901e == C11341a.INIT_IN_PROGRESS;
    }

    /* renamed from: a */
    public final Map<String, Object> mo44077a(C11310b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter baseAdAdapter = this.f50899c;
            String str = "";
            hashMap.put("providerAdapterVersion", baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : str);
            BaseAdAdapter baseAdAdapter2 = this.f50899c;
            if (baseAdAdapter2 != null) {
                str = baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
        } catch (Exception unused) {
            String str2 = "could not get adapter version for event data" + mo44166l();
            IronLog.INTERNAL.error(mo44158c(str2));
            this.f50900d.f50816e.mo44100a(str2);
        }
        hashMap.put("spId", this.f50903g.f51346a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f50903g.f51346a.getAdSourceNameForEvents());
        boolean z = true;
        hashMap.put("instanceType", Integer.valueOf(mo44164h() ? 2 : 1));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f50905i)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f50905i);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50897a.f50890e));
        JSONObject jSONObject = this.f50897a.f50891f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50897a.f50891f);
        }
        if (!TextUtils.isEmpty(this.f50897a.f50892g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50897a.f50892g);
        }
        if (!(bVar == C11310b.LOAD_AD || bVar == C11310b.LOAD_AD_SUCCESS || bVar == C11310b.LOAD_AD_FAILED || bVar == C11310b.LOAD_AD_FAILED_WITH_REASON || bVar == C11310b.LOAD_AD_NO_FILL || bVar == C11310b.AD_OPENED || bVar == C11310b.AD_CLOSED || bVar == C11310b.SHOW_AD || bVar == C11310b.SHOW_AD_FAILED || bVar == C11310b.AD_CLICKED || bVar == C11310b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f50897a.f50893h));
            if (!TextUtils.isEmpty(this.f50897a.f50894i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f50897a.f50894i);
            }
        }
        if (!TextUtils.isEmpty(this.f50897a.f50888c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f50897a.f50888c.getCustomNetwork());
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo44155a(String str) {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(mo44158c(""));
            this.f50900d.f50813b.mo44095a(false);
            this.f50907k = null;
            this.f50908l = new C11490f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f50897a.f50887b);
            hashMap.putAll(C11361b.m50767a(this.f50904h));
            this.f50906j = new AdData(str, hashMap);
            mo44156b(C11341a.INIT_IN_PROGRESS);
            this.f50909m.mo44195a(this);
            AdapterBaseInterface networkAdapter = this.f50899c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f50906j, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + mo44166l();
            ironLog.error(mo44158c(str2));
            this.f50900d.f50816e.mo44100a(str2);
            onInitFailed(C11308a.m50513a(this.f50897a.f50886a), str2);
        } catch (Throwable th) {
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo44158c(str3));
            this.f50900d.f50816e.mo44111l(str3);
            onInitFailed(C11308a.m50513a(this.f50897a.f50886a), str3);
        }
    }

    /* renamed from: b */
    public final void mo43874b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c("state = " + this.f50901e + ", isBidder = " + mo44164h()));
        long a = C11490f.m51271a(this.f50908l);
        if (mo44159c()) {
            mo44156b(C11341a.FAILED);
            this.f50900d.f50813b.mo44093a(a, 1025, "time out");
            this.f50900d.f50813b.mo44097b(a, 1025, "time out");
            Listener listener = this.f50898b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("timed out");
            C11490f.m51271a(this.f50908l);
            listener.mo44119a(buildLoadFailedError, this);
            return;
        }
        this.f50900d.f50816e.mo44110k(String.format("unexpected timeout for %s, state - %s, error - %s", new Object[]{mo44166l(), this.f50901e, 1025}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44156b(C11341a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c("to " + aVar));
        this.f50901e = aVar;
    }

    /* renamed from: b */
    public final void mo44157b(String str) {
        C11377f.m50856a();
        this.f50905i = C11377f.m50861d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo44158c(String str) {
        String str2 = this.f50897a.f50886a.name() + " - " + mo44166l() + " - state = " + this.f50901e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* renamed from: c */
    public final boolean mo44159c() {
        C11341a aVar = this.f50901e;
        return aVar == C11341a.INIT_IN_PROGRESS || aVar == C11341a.LOADING;
    }

    /* renamed from: d */
    public final boolean mo44160d() {
        return this.f50901e == C11341a.LOADED;
    }

    /* renamed from: e */
    public final boolean mo44161e() {
        return this.f50901e != C11341a.FAILED;
    }

    /* renamed from: f */
    public final void mo44162f() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44064a();
    }

    /* renamed from: g */
    public final Long mo44163g() {
        return this.f50907k;
    }

    /* renamed from: h */
    public final boolean mo44164h() {
        return this.f50903g.f51348c;
    }

    /* renamed from: i */
    public final int mo44165i() {
        return this.f50903g.f51349d;
    }

    /* renamed from: j */
    public final int mo43925j() {
        return this.f50903g.f51350e;
    }

    /* renamed from: k */
    public final String mo43926k() {
        return this.f50903g.f51346a.getProviderName();
    }

    /* renamed from: l */
    public final String mo44166l() {
        return String.format("%s %s", new Object[]{mo43926k(), Integer.valueOf(hashCode())});
    }

    /* renamed from: m */
    public final String mo44167m() {
        return this.f50903g.f51346a.getProviderTypeForReflection();
    }

    /* renamed from: n */
    public final String mo44168n() {
        return this.f50897a.f50892g;
    }

    /* renamed from: o */
    public final void mo44169o() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f50899c;
        if (baseAdAdapter != null) {
            baseAdAdapter.releaseMemory();
            this.f50899c = null;
        }
        C11312d dVar = this.f50900d;
        if (dVar != null) {
            dVar.mo44078a();
            this.f50900d = null;
        }
        C11353c cVar = this.f50909m;
        if (cVar != null) {
            cVar.mo44190c();
            this.f50909m = null;
        }
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44072d(mo44171q());
        this.f50898b.mo44121b(this);
    }

    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c("error = " + i + ", " + str));
        this.f50909m.mo44196d();
        if (this.f50901e == C11341a.LOADING) {
            long a = C11490f.m51271a(this.f50908l);
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                this.f50900d.f50813b.mo44092a(a, i);
            } else {
                if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                    this.f50907k = Long.valueOf(System.currentTimeMillis());
                }
                this.f50900d.f50813b.mo44093a(a, i, str);
                this.f50900d.f50813b.mo44097b(a, i, str);
            }
            mo44156b(C11341a.FAILED);
            this.f50898b.mo44119a(new IronSourceError(i, str), this);
        }
        if (this.f50901e != C11341a.FAILED) {
            this.f50900d.f50816e.mo44109j(String.format("unexpected load failed for %s, state - %s, error - %s, %s", new Object[]{mo44166l(), this.f50901e, Integer.valueOf(i), str}));
        }
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50909m.mo44196d();
        C11341a aVar = this.f50901e;
        if (aVar == C11341a.LOADING) {
            this.f50900d.f50813b.mo44094a(C11490f.m51271a(this.f50908l), false);
            mo44156b(C11341a.LOADED);
            this.f50898b.mo44117a(this);
        } else if (aVar != C11341a.FAILED) {
            this.f50900d.f50816e.mo44108i(String.format("unexpected load success for %s, state - %s", new Object[]{mo44166l(), this.f50901e}));
        }
    }

    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c("error = " + i + ", " + str));
        if (mo44154a()) {
            this.f50909m.mo44196d();
            mo44156b(C11341a.FAILED);
            Listener listener = this.f50898b;
            IronSourceError ironSourceError = new IronSourceError(i, str);
            C11490f.m51271a(this.f50908l);
            listener.mo44119a(ironSourceError, this);
        } else if (this.f50901e != C11341a.FAILED) {
            this.f50900d.f50816e.mo44105f(String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{mo44166l(), this.f50901e, Integer.valueOf(i), str}));
        }
    }

    public void onInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c(""));
        if (mo44154a()) {
            this.f50909m.mo44196d();
            mo44156b(C11341a.READY_TO_LOAD);
            ironLog.verbose(mo44158c(""));
            mo44156b(C11341a.LOADING);
            this.f50909m.mo44195a(this);
            try {
                this.f50899c.loadAd(this.f50906j, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo44158c(str));
                this.f50900d.f50816e.mo44111l(str);
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
            }
        } else if (this.f50901e != C11341a.FAILED) {
            this.f50900d.f50816e.mo44104e(String.format("unexpected init success for %s, state - %s", new Object[]{mo44166l(), this.f50901e}));
        }
    }

    /* renamed from: p */
    public final boolean mo44170p() {
        return this.f50901e == C11341a.SHOWING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo44171q() {
        Placement placement = this.f50902f;
        return placement == null ? "" : placement.getPlacementName();
    }
}
