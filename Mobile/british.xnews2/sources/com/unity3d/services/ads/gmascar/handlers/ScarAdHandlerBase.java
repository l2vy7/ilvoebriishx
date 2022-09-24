package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C12486c;
import com.unity3d.scar.adapter.common.C12488e;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import p322q7.C12866c;

public abstract class ScarAdHandlerBase implements C12488e {
    protected final EventSubject<C12486c> _eventSubject;
    protected final GMAEventSender _gmaEventSender = new GMAEventSender();
    protected final C12866c _scarAdMetadata;

    public ScarAdHandlerBase(C12866c cVar, EventSubject<C12486c> eventSubject) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
    }

    public void onAdClosed() {
        this._gmaEventSender.send(C12486c.AD_CLOSED, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i, String str) {
        this._gmaEventSender.send(C12486c.LOAD_ERROR, this._scarAdMetadata.mo48010c(), this._scarAdMetadata.mo48011d(), str, Integer.valueOf(i));
    }

    public void onAdLoaded() {
        this._gmaEventSender.send(C12486c.AD_LOADED, this._scarAdMetadata.mo48010c(), this._scarAdMetadata.mo48011d());
    }

    public void onAdOpened() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C12486c.AD_STARTED, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<C12486c>() {
            public void onNextEvent(C12486c cVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(cVar, new Object[0]);
            }
        });
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(C12486c.AD_SKIPPED, new Object[0]);
    }
}
