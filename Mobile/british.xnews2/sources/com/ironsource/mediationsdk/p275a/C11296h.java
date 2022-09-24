package com.ironsource.mediationsdk.p275a;

import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.p275a.C11284b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.h */
public final class C11296h extends C11284b {

    /* renamed from: P */
    private static C11296h f50728P;

    /* renamed from: O */
    private String f50729O = "";

    private C11296h() {
        this.f50664H = "outcome";
        this.f50663G = 3;
        this.f50665I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C11296h m50466e() {
        C11296h hVar;
        synchronized (C11296h.class) {
            if (f50728P == null) {
                C11296h hVar2 = new C11296h();
                f50728P = hVar2;
                hVar2.mo43983c();
            }
            hVar = f50728P;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo43991l() {
        this.f50666J.add(1000);
        this.f50666J.add(1001);
        this.f50666J.add(1002);
        this.f50666J.add(1003);
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo43993n(C11308a aVar) {
        return aVar.mo44037a() == 305;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo43994o(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f50729O : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo43995p(C11308a aVar) {
        int a = aVar.mo44037a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo43996r(C11308a aVar) {
        return C11499n.m51312a().mo44568b((C11284b.m50405q(aVar.mo44037a()) == C11284b.C11285a.OFFERWALL.f50702f ? 1 : 0) ^ 1);
    }
}
