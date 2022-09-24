package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.iab.omid.library.adcolony.p045d.C4847e;

public final class AdEvents {

    /* renamed from: a */
    private final C4826a f21628a;

    private AdEvents(C4826a aVar) {
        this.f21628a = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C4826a aVar = (C4826a) adSession;
        C4847e.m22345a((Object) adSession, "AdSession is null");
        C4847e.m22350d(aVar);
        C4847e.m22348b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo20157a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4847e.m22348b(this.f21628a);
        C4847e.m22352f(this.f21628a);
        if (!this.f21628a.mo20080e()) {
            try {
                this.f21628a.start();
            } catch (Exception unused) {
            }
        }
        if (this.f21628a.mo20080e()) {
            this.f21628a.mo20077b();
        }
    }

    public void loaded() {
        C4847e.m22349c(this.f21628a);
        C4847e.m22352f(this.f21628a);
        this.f21628a.mo20078c();
    }

    public void loaded(VastProperties vastProperties) {
        C4847e.m22345a((Object) vastProperties, "VastProperties is null");
        C4847e.m22349c(this.f21628a);
        C4847e.m22352f(this.f21628a);
        this.f21628a.mo20076a(vastProperties.mo20101a());
    }
}
