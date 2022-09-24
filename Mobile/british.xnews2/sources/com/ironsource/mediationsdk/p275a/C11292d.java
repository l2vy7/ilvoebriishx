package com.ironsource.mediationsdk.p275a;

import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.p275a.C11284b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.d */
public final class C11292d extends C11284b {

    /* renamed from: P */
    private static C11292d f50720P;

    /* renamed from: O */
    private String f50721O = "";

    private C11292d() {
        this.f50664H = "ironbeast";
        this.f50663G = 2;
        this.f50665I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C11292d m50446e() {
        C11292d dVar;
        synchronized (C11292d.class) {
            if (f50720P == null) {
                C11292d dVar2 = new C11292d();
                f50720P = dVar2;
                dVar2.mo43983c();
            }
            dVar = f50720P;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo43991l() {
        this.f50666J.add(2001);
        this.f50666J.add(2002);
        this.f50666J.add(2003);
        this.f50666J.add(2004);
        this.f50666J.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f50666J.add(3001);
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f50666J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo43993n(C11308a aVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo43994o(int i) {
        return this.f50721O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo43995p(C11308a aVar) {
        int a = aVar.mo44037a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3005 || a == 3015;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo43996r(C11308a aVar) {
        return C11499n.m51312a().mo44568b(C11284b.m50405q(aVar.mo44037a()) == C11284b.C11285a.f50700e.f50702f ? 3 : 2);
    }
}
