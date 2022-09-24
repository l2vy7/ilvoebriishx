package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C12486c;
import com.unity3d.scar.adapter.common.C12490g;
import com.unity3d.services.core.misc.EventSubject;
import p322q7.C12866c;

public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements C12490g {
    public ScarInterstitialAdHandler(C12866c cVar, EventSubject<C12486c> eventSubject) {
        super(cVar, eventSubject);
    }

    public void onAdClicked() {
        this._gmaEventSender.send(C12486c.AD_CLICKED, new Object[0]);
    }

    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(C12486c.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.mo48010c(), this._scarAdMetadata.mo48011d(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(C12486c.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(C12486c.AD_LEFT_APPLICATION, new Object[0]);
    }
}
