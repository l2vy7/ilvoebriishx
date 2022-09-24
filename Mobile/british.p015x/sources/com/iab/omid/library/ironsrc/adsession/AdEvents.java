package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.p051d.C4897e;

public final class AdEvents {
    private final C4876a adSession;

    private AdEvents(C4876a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4876a aVar = (C4876a) adSession2;
        C4897e.m22566a((Object) adSession2, "AdSession is null");
        C4897e.m22571d(aVar);
        C4897e.m22569b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo20343a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4897e.m22569b(this.adSession);
        C4897e.m22573f(this.adSession);
        if (!this.adSession.mo20266e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo20266e()) {
            this.adSession.mo20263b();
        }
    }

    public final void loaded() {
        C4897e.m22570c(this.adSession);
        C4897e.m22573f(this.adSession);
        this.adSession.mo20264c();
    }

    public final void loaded(VastProperties vastProperties) {
        C4897e.m22566a((Object) vastProperties, "VastProperties is null");
        C4897e.m22570c(this.adSession);
        C4897e.m22573f(this.adSession);
        this.adSession.mo20262a(vastProperties.mo20287a());
    }
}
