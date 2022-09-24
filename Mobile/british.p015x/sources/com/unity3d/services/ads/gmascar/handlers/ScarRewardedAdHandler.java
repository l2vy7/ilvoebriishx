package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C12486c;
import com.unity3d.scar.adapter.common.C12491h;
import com.unity3d.services.core.misc.EventSubject;
import p323q7.C12866c;

public class ScarRewardedAdHandler extends ScarAdHandlerBase implements C12491h {
    private boolean _hasEarnedReward = false;

    public ScarRewardedAdHandler(C12866c cVar, EventSubject<C12486c> eventSubject) {
        super(cVar, eventSubject);
    }

    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(C12486c.REWARDED_SHOW_ERROR, this._scarAdMetadata.mo48010c(), this._scarAdMetadata.mo48011d(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(C12486c.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(C12486c.AD_EARNED_REWARD, new Object[0]);
    }
}
