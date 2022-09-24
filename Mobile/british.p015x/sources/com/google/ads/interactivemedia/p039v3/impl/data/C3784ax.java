package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.internal.C3918cs;
import com.google.ads.interactivemedia.p039v3.internal.C3923cx;
import com.google.ads.interactivemedia.p039v3.internal.C3924cy;
import com.google.ads.interactivemedia.p039v3.internal.C3925cz;
import com.google.ads.interactivemedia.p039v3.internal.C3997fq;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ax */
/* compiled from: IMASDK */
public interface C3784ax {
    C3784ax adTagParameters(Map<String, String> map);

    C3784ax adTagUrl(String str);

    C3784ax adsResponse(String str);

    C3784ax apiKey(String str);

    C3784ax assetKey(String str);

    C3784ax authToken(String str);

    C3785ay build();

    C3784ax companionSlots(Map<String, String> map);

    C3784ax consentSettings(C3780at atVar);

    C3784ax contentDuration(Float f);

    C3784ax contentKeywords(List<String> list);

    C3784ax contentSourceId(String str);

    C3784ax contentTitle(String str);

    C3784ax contentUrl(String str);

    C3784ax customAssetKey(String str);

    C3784ax env(String str);

    C3784ax extraParameters(Map<String, String> map);

    C3784ax format(String str);

    C3784ax identifierInfo(C3997fq fqVar);

    C3784ax isTv(Boolean bool);

    C3784ax linearAdSlotHeight(Integer num);

    C3784ax linearAdSlotWidth(Integer num);

    C3784ax liveStreamPrefetchSeconds(Float f);

    C3784ax marketAppInfo(C3918cs csVar);

    C3784ax msParameter(String str);

    C3784ax network(String str);

    C3784ax networkCode(String str);

    C3784ax omidAdSessionsOnStartedOnly(Boolean bool);

    C3784ax settings(ImaSdkSettings imaSdkSettings);

    C3784ax streamActivityMonitorId(String str);

    C3784ax supportsExternalNavigation(Boolean bool);

    C3784ax supportsIconClickFallback(Boolean bool);

    C3784ax supportsNativeNetworking(Boolean bool);

    C3784ax supportsResizing(Boolean bool);

    C3784ax useQAStreamBaseUrl(Boolean bool);

    C3784ax usesCustomVideoPlayback(Boolean bool);

    C3784ax vastLoadTimeout(Float f);

    C3784ax videoContinuousPlay(C3924cy cyVar);

    C3784ax videoId(String str);

    C3784ax videoPlayActivation(C3923cx cxVar);

    C3784ax videoPlayMuted(C3925cz czVar);
}
