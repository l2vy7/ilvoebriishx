package com.ironsource.mediationsdk.adunit.p278b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.p276a.C11284b;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.b.d */
public final class C11312d {

    /* renamed from: a */
    public C11317g f50812a;

    /* renamed from: b */
    public C11318h f50813b;

    /* renamed from: c */
    public C11315e f50814c;

    /* renamed from: d */
    public C11309a f50815d;

    /* renamed from: e */
    public C11319i f50816e;

    /* renamed from: f */
    private final int f50817f = -1;

    /* renamed from: g */
    private IronSource.AD_UNIT f50818g;

    /* renamed from: h */
    private C11314b f50819h;

    /* renamed from: i */
    private C11311c f50820i;

    /* renamed from: j */
    private C11284b f50821j;

    /* renamed from: k */
    private Map<C11310b, C11313a> f50822k;

    /* renamed from: l */
    private Map<C11310b, C11313a> f50823l;

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$a */
    class C11313a {

        /* renamed from: a */
        private int f50824a;

        /* renamed from: b */
        private int f50825b;

        public C11313a(int i, int i2) {
            this.f50824a = i;
            this.f50825b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo44081a(C11314b bVar) {
            return C11314b.MEDIATION.equals(bVar) ? this.f50824a : this.f50825b;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$b */
    public enum C11314b {
        MEDIATION,
        PROVIDER
    }

    public C11312d(IronSource.AD_UNIT ad_unit, C11314b bVar, C11311c cVar) {
        IronSource.AD_UNIT ad_unit2 = ad_unit;
        this.f50818g = ad_unit2;
        this.f50819h = bVar;
        this.f50820i = cVar;
        this.f50821j = (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit2.equals(IronSource.AD_UNIT.OFFERWALL)) ? C11296h.m50466e() : C11292d.m50446e();
        HashMap hashMap = new HashMap();
        this.f50822k = hashMap;
        C11310b bVar2 = C11310b.INIT_STARTED;
        hashMap.put(bVar2, new C11313a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        Map<C11310b, C11313a> map = this.f50822k;
        C11310b bVar3 = C11310b.INIT_ENDED;
        map.put(bVar3, new C11313a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        Map<C11310b, C11313a> map2 = this.f50822k;
        C11310b bVar4 = C11310b.SESSION_CAPPED;
        map2.put(bVar4, new C11313a(-1, IronSourceConstants.IS_CAP_SESSION));
        Map<C11310b, C11313a> map3 = this.f50822k;
        C11310b bVar5 = C11310b.PLACEMENT_CAPPED;
        map3.put(bVar5, new C11313a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        Map<C11310b, C11313a> map4 = this.f50822k;
        C11310b bVar6 = C11310b.AUCTION_REQUEST;
        map4.put(bVar6, new C11313a(2000, -1));
        Map<C11310b, C11313a> map5 = this.f50822k;
        C11310b bVar7 = C11310b.AUCTION_SUCCESS;
        map5.put(bVar7, new C11313a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        Map<C11310b, C11313a> map6 = this.f50822k;
        C11310b bVar8 = C11310b.AUCTION_FAILED;
        map6.put(bVar8, new C11313a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        Map<C11310b, C11313a> map7 = this.f50822k;
        C11310b bVar9 = C11310b.AUCTION_REQUEST_WATERFALL;
        map7.put(bVar9, new C11313a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        Map<C11310b, C11313a> map8 = this.f50822k;
        C11310b bVar10 = C11310b.AUCTION_RESULT_WATERFALL;
        map8.put(bVar10, new C11313a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        Map<C11310b, C11313a> map9 = this.f50822k;
        C11310b bVar11 = C11310b.INIT_SUCCESS;
        map9.put(bVar11, new C11313a(-1, -1));
        Map<C11310b, C11313a> map10 = this.f50822k;
        C11310b bVar12 = C11310b.INIT_FAILED;
        map10.put(bVar12, new C11313a(-1, -1));
        Map<C11310b, C11313a> map11 = this.f50822k;
        C11310b bVar13 = C11310b.SHOW_AD_SUCCESS;
        C11310b bVar14 = bVar12;
        map11.put(bVar13, new C11313a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        Map<C11310b, C11313a> map12 = this.f50822k;
        C11310b bVar15 = C11310b.AD_OPENED;
        C11310b bVar16 = bVar11;
        map12.put(bVar15, new C11313a(-1, IronSourceConstants.IS_INSTANCE_OPENED));
        Map<C11310b, C11313a> map13 = this.f50822k;
        C11310b bVar17 = C11310b.AD_CLOSED;
        C11310b bVar18 = bVar15;
        map13.put(bVar17, new C11313a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        Map<C11310b, C11313a> map14 = this.f50822k;
        C11310b bVar19 = C11310b.AD_CLICKED;
        C11310b bVar20 = bVar17;
        map14.put(bVar19, new C11313a(-1, 2006));
        Map<C11310b, C11313a> map15 = this.f50822k;
        C11310b bVar21 = C11310b.LOAD_AD;
        C11310b bVar22 = bVar19;
        map15.put(bVar21, new C11313a(2001, 2002));
        Map<C11310b, C11313a> map16 = this.f50822k;
        C11310b bVar23 = C11310b.LOAD_AD_SUCCESS;
        C11310b bVar24 = bVar21;
        map16.put(bVar23, new C11313a(2004, 2003));
        Map<C11310b, C11313a> map17 = this.f50822k;
        C11310b bVar25 = C11310b.LOAD_AD_FAILED;
        C11310b bVar26 = bVar23;
        map17.put(bVar25, new C11313a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        Map<C11310b, C11313a> map18 = this.f50822k;
        C11310b bVar27 = C11310b.LOAD_AD_NO_FILL;
        C11310b bVar28 = bVar25;
        map18.put(bVar27, new C11313a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        Map<C11310b, C11313a> map19 = this.f50822k;
        C11310b bVar29 = C11310b.SHOW_AD;
        C11310b bVar30 = bVar27;
        map19.put(bVar29, new C11313a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f50822k.put(bVar13, new C11313a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        Map<C11310b, C11313a> map20 = this.f50822k;
        C11310b bVar31 = C11310b.SHOW_AD_FAILED;
        map20.put(bVar31, new C11313a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        Map<C11310b, C11313a> map21 = this.f50822k;
        C11310b bVar32 = C11310b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE;
        map21.put(bVar32, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        Map<C11310b, C11313a> map22 = this.f50822k;
        C11310b bVar33 = C11310b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE;
        C11310b bVar34 = bVar32;
        map22.put(bVar33, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        Map<C11310b, C11313a> map23 = this.f50822k;
        C11310b bVar35 = C11310b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        C11310b bVar36 = bVar33;
        map23.put(bVar35, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        Map<C11310b, C11313a> map24 = this.f50822k;
        C11310b bVar37 = C11310b.TROUBLESHOOT_BIDDING_DATA_MISSING;
        C11310b bVar38 = bVar35;
        map24.put(bVar37, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        Map<C11310b, C11313a> map25 = this.f50822k;
        C11310b bVar39 = C11310b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        C11310b bVar40 = bVar37;
        map25.put(bVar39, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        Map<C11310b, C11313a> map26 = this.f50822k;
        C11310b bVar41 = C11310b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        C11310b bVar42 = bVar39;
        map26.put(bVar41, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        Map<C11310b, C11313a> map27 = this.f50822k;
        C11310b bVar43 = C11310b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        C11310b bVar44 = bVar41;
        map27.put(bVar43, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        Map<C11310b, C11313a> map28 = this.f50822k;
        C11310b bVar45 = C11310b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        C11310b bVar46 = bVar43;
        map28.put(bVar45, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        Map<C11310b, C11313a> map29 = this.f50822k;
        C11310b bVar47 = C11310b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        C11310b bVar48 = bVar45;
        map29.put(bVar47, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        Map<C11310b, C11313a> map30 = this.f50822k;
        C11310b bVar49 = C11310b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        C11310b bVar50 = bVar47;
        map30.put(bVar49, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        Map<C11310b, C11313a> map31 = this.f50822k;
        C11310b bVar51 = C11310b.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        C11310b bVar52 = bVar49;
        map31.put(bVar51, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        Map<C11310b, C11313a> map32 = this.f50822k;
        C11310b bVar53 = C11310b.TROUBLESHOOT_INTERNAL_ERROR;
        C11310b bVar54 = bVar51;
        map32.put(bVar53, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        Map<C11310b, C11313a> map33 = this.f50822k;
        C11310b bVar55 = C11310b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR;
        map33.put(bVar55, new C11313a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        Map<C11310b, C11313a> map34 = this.f50822k;
        C11310b bVar56 = C11310b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        C11310b bVar57 = bVar55;
        map34.put(bVar56, new C11313a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f50822k.put(C11310b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C11313a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR));
        Map<C11310b, C11313a> map35 = this.f50822k;
        C11310b bVar58 = C11310b.TROUBLESHOOT_NOTIFICATION_ERROR;
        map35.put(bVar58, new C11313a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f50823l = hashMap2;
        hashMap2.put(bVar2, new C11313a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f50823l.put(bVar3, new C11313a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f50823l.put(bVar4, new C11313a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f50823l.put(bVar5, new C11313a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f50823l.put(bVar6, new C11313a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f50823l.put(bVar7, new C11313a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f50823l.put(bVar8, new C11313a(IronSourceConstants.RV_AUCTION_FAILED, -1));
        this.f50823l.put(bVar9, new C11313a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f50823l.put(bVar10, new C11313a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f50823l.put(bVar16, new C11313a(-1, -1));
        this.f50823l.put(bVar14, new C11313a(-1, -1));
        this.f50823l.put(C11310b.AD_VISIBLE, new C11313a(-1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        this.f50823l.put(bVar18, new C11313a(-1, 1005));
        this.f50823l.put(bVar20, new C11313a(-1, IronSourceConstants.RV_INSTANCE_CLOSED));
        this.f50823l.put(C11310b.AD_STARTED, new C11313a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f50823l.put(C11310b.AD_ENDED, new C11313a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f50823l.put(bVar22, new C11313a(-1, 1006));
        this.f50823l.put(C11310b.AD_REWARDED, new C11313a(-1, 1010));
        this.f50823l.put(C11310b.AD_AVAILABILITY_CHANGED_TRUE, new C11313a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f50823l.put(C11310b.AD_AVAILABILITY_CHANGED_FALSE, new C11313a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f50823l.put(bVar24, new C11313a(1000, 1001));
        this.f50823l.put(bVar26, new C11313a(1003, 1002));
        this.f50823l.put(bVar28, new C11313a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f50823l.put(C11310b.LOAD_AD_FAILED_WITH_REASON, new C11313a(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f50823l.put(bVar30, new C11313a(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f50823l.put(bVar29, new C11313a(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW));
        this.f50823l.put(C11310b.SHOW_AD_CHANCE, new C11313a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f50823l.put(bVar31, new C11313a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED));
        this.f50823l.put(bVar34, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f50823l.put(bVar36, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        this.f50823l.put(bVar38, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f50823l.put(bVar40, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f50823l.put(bVar42, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f50823l.put(bVar44, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f50823l.put(bVar46, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f50823l.put(bVar48, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f50823l.put(bVar50, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f50823l.put(bVar52, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f50823l.put(bVar54, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f50823l.put(C11310b.TROUBLESHOOT_LOAD_FAILED, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f50823l.put(bVar53, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f50823l.put(bVar57, new C11313a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f50823l.put(bVar56, new C11313a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f50823l.put(C11310b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f50823l.put(bVar58, new C11313a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f50812a = new C11317g(this);
        this.f50813b = new C11318h(this);
        this.f50814c = new C11315e(this);
        this.f50815d = new C11309a(this);
        this.f50816e = new C11319i(this);
    }

    /* renamed from: a */
    private int m50535a(C11310b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f50818g) && this.f50822k.containsKey(bVar)) {
                return this.f50822k.get(bVar).mo44081a(this.f50819h);
            }
            if (!IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f50818g) || !this.f50823l.containsKey(bVar)) {
                return -1;
            }
            return this.f50823l.get(bVar).mo44081a(this.f50819h);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo44078a() {
        this.f50820i = null;
        this.f50814c = null;
        this.f50812a = null;
        this.f50813b = null;
        this.f50815d = null;
        this.f50816e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44079b(C11310b bVar, Map<String, Object> map) {
        mo44080c(bVar, map, System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo44080c(C11310b bVar, Map<String, Object> map, long j) {
        int a = m50535a(bVar);
        if (-1 != a) {
            if (map == null) {
                map = new HashMap<>();
            }
            C11311c cVar = this.f50820i;
            if (cVar != null) {
                map.putAll(cVar.mo44077a(bVar));
            }
            this.f50821j.mo43979b(new C11308a(a, j, new JSONObject(map)));
        }
    }
}
