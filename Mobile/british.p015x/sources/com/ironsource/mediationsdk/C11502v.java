package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v */
public class C11502v {

    /* renamed from: a */
    protected AbstractAdapter f51749a;

    /* renamed from: b */
    protected C11415a f51750b;

    /* renamed from: c */
    protected JSONObject f51751c;

    /* renamed from: d */
    private C11503a f51752d;

    /* renamed from: e */
    private Timer f51753e;

    /* renamed from: f */
    int f51754f;

    /* renamed from: g */
    protected String f51755g;

    /* renamed from: h */
    protected JSONObject f51756h;

    /* renamed from: i */
    protected List<String> f51757i;

    /* renamed from: j */
    protected String f51758j;

    /* renamed from: k */
    private final Object f51759k = new Object();

    /* renamed from: l */
    private final Object f51760l = new Object();

    /* renamed from: com.ironsource.mediationsdk.v$a */
    public enum C11503a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C11502v(C11415a aVar, AbstractAdapter abstractAdapter) {
        this.f51750b = aVar;
        this.f51749a = abstractAdapter;
        this.f51751c = aVar.f51347b;
        this.f51752d = C11503a.NOT_LOADED;
        this.f51753e = null;
        this.f51755g = "";
        this.f51756h = null;
        this.f51757i = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C11503a mo44570a(C11503a[] aVarArr, C11503a aVar) {
        C11503a aVar2;
        synchronized (this.f51759k) {
            aVar2 = this.f51752d;
            if (Arrays.asList(aVarArr).contains(this.f51752d)) {
                mo44573b(aVar);
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    public final void mo44571a(String str) {
        C11377f.m50856a();
        this.f51758j = C11377f.m50861d(str);
    }

    /* renamed from: a */
    public final void mo44572a(JSONObject jSONObject) {
        this.f51756h = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44573b(C11503a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f51750b.f51346a.getProviderName() + ": current state=" + this.f51752d + ", new state=" + aVar, 0);
        synchronized (this.f51759k) {
            this.f51752d = aVar;
        }
    }

    /* renamed from: b */
    public final void mo44574b(String str) {
        this.f51755g = str;
    }

    /* renamed from: c */
    public Map<String, Object> mo44467c() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f51749a;
            String str = "";
            hashMap.put("providerAdapterVersion", abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f51749a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f51750b.f51346a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f51750b.f51346a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f51750b.f51348c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f51755g)) {
                    hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f51755g);
                }
                JSONObject jSONObject = this.f51756h;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f51756h);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f51758j)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f51758j);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo44576d() + ")", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo44575c(TimerTask timerTask) {
        synchronized (this.f51760l) {
            mo44581h();
            Timer timer = new Timer();
            this.f51753e = timer;
            timer.schedule(timerTask, (long) (this.f51754f * 1000));
        }
    }

    /* renamed from: d */
    public final String mo44576d() {
        return this.f51750b.f51346a.getProviderName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo44577d(C11503a aVar, C11503a aVar2) {
        synchronized (this.f51759k) {
            if (this.f51752d != aVar) {
                return false;
            }
            mo44573b(aVar2);
            return true;
        }
    }

    /* renamed from: e */
    public final int mo44578e() {
        return this.f51750b.f51349d;
    }

    /* renamed from: f */
    public final String mo44579f() {
        return this.f51750b.f51346a.getSubProviderId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo44580g() {
        C11503a aVar = this.f51752d;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo44581h() {
        synchronized (this.f51760l) {
            Timer timer = this.f51753e;
            if (timer != null) {
                timer.cancel();
                this.f51753e = null;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo44582i() {
        return this.f51750b.f51348c;
    }
}
