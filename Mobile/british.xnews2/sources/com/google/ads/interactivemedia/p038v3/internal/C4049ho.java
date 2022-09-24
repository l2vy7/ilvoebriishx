package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ho */
/* compiled from: IMASDK */
public final class C4049ho implements Callable {

    /* renamed from: a */
    private final C4037hc f17395a;

    /* renamed from: b */
    private final C4115k f17396b;

    public C4049ho(C4037hc hcVar, C4115k kVar) {
        this.f17395a = hcVar;
        this.f17396b = kVar;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f17395a.mo15904l() != null) {
            this.f17395a.mo15904l().get();
        }
        C4385u k = this.f17395a.mo15903k();
        if (k == null) {
            return null;
        }
        try {
            synchronized (this.f17396b) {
                C4115k kVar = this.f17396b;
                byte[] aV = k.mo15165aV();
                kVar.mo15163aa(aV, aV.length, bka.m16275a());
            }
            return null;
        } catch (bkt | NullPointerException unused) {
            return null;
        }
    }
}
