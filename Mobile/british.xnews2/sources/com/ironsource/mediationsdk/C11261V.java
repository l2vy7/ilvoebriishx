package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.utils.C11497m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.V */
public abstract class C11261V implements C11497m.C11498a {

    /* renamed from: a */
    protected AbstractAdapter f50598a;

    /* renamed from: b */
    protected C11415a f50599b;

    /* renamed from: c */
    boolean f50600c;

    /* renamed from: d */
    protected JSONObject f50601d;

    /* renamed from: e */
    protected String f50602e;

    /* renamed from: f */
    protected int f50603f;

    /* renamed from: g */
    protected Long f50604g = null;

    C11261V(C11415a aVar, AbstractAdapter abstractAdapter) {
        this.f50599b = aVar;
        this.f50598a = abstractAdapter;
        this.f50601d = aVar.f51347b;
    }

    /* renamed from: q */
    private String m50350q() {
        return this.f50599b.f51346a.isMultipleInstances() ? this.f50599b.f51346a.getProviderTypeForReflection() : this.f50599b.f51346a.getProviderName();
    }

    /* renamed from: b */
    public final void mo43922b(String str) {
        C11377f.m50856a();
        this.f50602e = C11377f.m50861d(str);
    }

    /* renamed from: d */
    public void mo43876d() {
        try {
            this.f50598a.releaseMemory(this.f50599b.f51351f, this.f50601d);
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.f50598a = null;
    }

    /* renamed from: e */
    public int mo43792e() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo43923h() {
        return this.f50599b.f51348c;
    }

    /* renamed from: i */
    public final int mo43924i() {
        return this.f50599b.f51349d;
    }

    /* renamed from: j */
    public final int mo43925j() {
        return this.f50599b.f51350e;
    }

    /* renamed from: k */
    public final String mo43926k() {
        return this.f50599b.f51346a.getProviderName();
    }

    /* renamed from: l */
    public final String mo43927l() {
        return this.f50599b.f51346a.getProviderTypeForReflection();
    }

    /* renamed from: m */
    public final int mo43928m() {
        return this.f50603f;
    }

    /* renamed from: n */
    public final Map<String, Object> mo43929n() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f50598a;
            String str = "";
            hashMap.put("providerAdapterVersion", abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f50598a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f50599b.f51346a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f50599b.f51346a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(mo43923h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo43792e()));
            if (!TextUtils.isEmpty(this.f50602e)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f50602e);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo43926k() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: o */
    public final Long mo43930o() {
        return this.f50604g;
    }

    /* renamed from: p */
    public final String mo43931p() {
        return String.format("%s %s", new Object[]{m50350q(), Integer.valueOf(hashCode())});
    }
}
