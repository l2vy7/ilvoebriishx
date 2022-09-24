package com.startapp;

import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;

/* renamed from: com.startapp.j */
/* compiled from: Sta */
public final class C11974j {

    /* renamed from: a */
    public final C11972id f53135a;

    public C11974j(C11972id idVar) {
        this.f53135a = idVar;
    }

    /* renamed from: a */
    public static C11974j m52483a(C12039m mVar) {
        C11972id idVar = (C11972id) mVar;
        AdSessionStatePublisher adSessionStatePublisher = idVar.f53128e;
        if (adSessionStatePublisher.f21911b != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        } else if (!idVar.f53130g) {
            C11974j jVar = new C11974j(idVar);
            adSessionStatePublisher.f21911b = jVar;
            return jVar;
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
