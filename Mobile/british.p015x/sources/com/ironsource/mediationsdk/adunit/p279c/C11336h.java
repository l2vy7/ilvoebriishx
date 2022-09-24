package com.ironsource.mediationsdk.adunit.p279c;

import com.ironsource.mediationsdk.C11369d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p282d.C11337a;
import com.ironsource.mediationsdk.adunit.p282d.C11343c;
import com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.mediationsdk.adunit.c.h */
public final class C11336h extends C11334f<C11343c> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11336h(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r18, com.ironsource.mediationsdk.model.C11431p r19, java.lang.String r20, boolean r21, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r22) {
        /*
            r17 = this;
            r0 = r19
            com.ironsource.mediationsdk.adunit.c.a r10 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            com.ironsource.mediationsdk.utils.b r4 = r0.f51435l
            int r5 = r0.f51426c
            int r6 = r0.f51428e
            int r7 = r0.f51433j
            int r8 = r0.f51432i
            if (r21 == 0) goto L_0x0016
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a.C11326a.MANUAL
        L_0x0014:
            r12 = r0
            goto L_0x0020
        L_0x0016:
            boolean r0 = r4.f51545n
            if (r0 == 0) goto L_0x001d
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a.C11326a.AUTOMATIC_LOAD_WHILE_SHOW
            goto L_0x0014
        L_0x001d:
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a.C11326a.AUTOMATIC_LOAD_AFTER_CLOSE
            goto L_0x0014
        L_0x0020:
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            long r13 = r4.f51542k
            long r2 = r4.f51541j
            r11 = r9
            r15 = r2
            r11.<init>(r12, r13, r15)
            r0 = r10
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r1 = r22
            r0.<init>(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p279c.C11336h.<init>(java.util.List, com.ironsource.mediationsdk.model.p, java.lang.String, boolean, java.util.Set):void");
    }

    /* renamed from: G */
    private static BaseAdInteractionAdapter<?, AdapterAdRewardListener> m50665G(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C11369d.m50788a().mo44232b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ BaseAdAdapter mo44138a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return m50665G(networkSettings, ad_unit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C11340c mo44140b(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        C11320a aVar = this.f50867o;
        return new C11343c(new C11337a(ad_unit, aVar.f50832b, i, this.f50860h, str, this.f50858f, this.f50859g, networkSettings, aVar.f50837g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
