package com.startapp;

import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;

/* renamed from: com.startapp.a6 */
/* compiled from: Sta */
public final class C11780a6 {

    /* renamed from: a */
    public final C11972id f52572a;

    public C11780a6(C11972id idVar) {
        this.f52572a = idVar;
    }

    /* renamed from: a */
    public static C11780a6 m52056a(C12039m mVar) {
        C11972id idVar = (C11972id) mVar;
        if (!idVar.mo45462e()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (idVar.f53129f) {
            throw new IllegalStateException("AdSession is started");
        } else if (!idVar.f53130g) {
            AdSessionStatePublisher adSessionStatePublisher = idVar.f53128e;
            if (adSessionStatePublisher.f21912c == null) {
                C11780a6 a6Var = new C11780a6(idVar);
                adSessionStatePublisher.f21912c = a6Var;
                return a6Var;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public final void mo45134a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }
}
