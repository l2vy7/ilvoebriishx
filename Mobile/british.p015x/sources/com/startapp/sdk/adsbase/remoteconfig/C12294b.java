package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.b */
/* compiled from: Sta */
public class C12294b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5073c f54677a;

    /* renamed from: b */
    public final /* synthetic */ MetaDataRequest.RequestReason f54678b;

    /* renamed from: c */
    public final /* synthetic */ boolean f54679c;

    public C12294b(C5073c cVar, MetaDataRequest.RequestReason requestReason, boolean z) {
        this.f54677a = cVar;
        this.f54678b = requestReason;
        this.f54679c = z;
    }

    public void run() {
        this.f54677a.mo20651a(this.f54678b, this.f54679c);
    }
}
