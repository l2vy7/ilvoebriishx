package com.ironsource.sdk.p297j;

import com.ironsource.sdk.p294g.C11699a;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.j.f */
public interface C11729f extends C11720a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(C11699a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
