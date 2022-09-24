package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.sdk.g */
public interface C11447g extends OfferwallListener {
    /* renamed from: a */
    void mo44236a(boolean z, IronSourceError ironSourceError);

    /* synthetic */ void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    /* synthetic */ boolean onOfferwallAdCredited(int i, int i2, boolean z);

    /* synthetic */ void onOfferwallAvailable(boolean z);

    /* synthetic */ void onOfferwallClosed();

    /* synthetic */ void onOfferwallOpened();

    /* synthetic */ void onOfferwallShowFailed(IronSourceError ironSourceError);
}
