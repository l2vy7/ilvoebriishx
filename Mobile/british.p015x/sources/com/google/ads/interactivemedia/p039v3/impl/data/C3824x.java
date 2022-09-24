package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.internal.C3918cs;
import com.google.ads.interactivemedia.p039v3.internal.C3923cx;
import com.google.ads.interactivemedia.p039v3.internal.C3924cy;
import com.google.ads.interactivemedia.p039v3.internal.C3925cz;
import com.google.ads.interactivemedia.p039v3.internal.C3997fq;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aue;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.x */
/* compiled from: IMASDK */
final class C3824x implements C3784ax {
    private aue<String, String> adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private aue<String, String> companionSlots;
    private C3780at consentSettings;
    private Float contentDuration;
    private atz<String> contentKeywords;
    private String contentSourceId;
    private String contentTitle;
    private String contentUrl;
    private String customAssetKey;
    private String env;
    private aue<String, String> extraParameters;
    private String format;
    private C3997fq identifierInfo;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private Float liveStreamPrefetchSeconds;
    private C3918cs marketAppInfo;
    private String msParameter;
    private String network;
    private String networkCode;
    private Boolean omidAdSessionsOnStartedOnly;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeNetworking;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private C3924cy videoContinuousPlay;
    private String videoId;
    private C3923cx videoPlayActivation;
    private C3925cz videoPlayMuted;

    C3824x() {
    }

    public C3784ax adTagParameters(Map<String, String> map) {
        this.adTagParameters = map == null ? null : aue.m14838c(map);
        return this;
    }

    public C3784ax adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    public C3784ax adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    public C3784ax apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    public C3784ax assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    public C3784ax authToken(String str) {
        this.authToken = str;
        return this;
    }

    public C3785ay build() {
        return new C3825y(this.adTagUrl, this.adTagParameters, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.env, this.extraParameters, this.format, this.identifierInfo, this.isTv, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.networkCode, this.omidAdSessionsOnStartedOnly, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeNetworking, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted);
    }

    public C3784ax companionSlots(Map<String, String> map) {
        this.companionSlots = map == null ? null : aue.m14838c(map);
        return this;
    }

    public C3784ax consentSettings(C3780at atVar) {
        this.consentSettings = atVar;
        return this;
    }

    public C3784ax contentDuration(Float f) {
        this.contentDuration = f;
        return this;
    }

    public C3784ax contentKeywords(List<String> list) {
        this.contentKeywords = list == null ? null : atz.m14811m(list);
        return this;
    }

    public C3784ax contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    public C3784ax contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    public C3784ax contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    public C3784ax customAssetKey(String str) {
        this.customAssetKey = str;
        return this;
    }

    public C3784ax env(String str) {
        this.env = str;
        return this;
    }

    public C3784ax extraParameters(Map<String, String> map) {
        this.extraParameters = map == null ? null : aue.m14838c(map);
        return this;
    }

    public C3784ax format(String str) {
        this.format = str;
        return this;
    }

    public C3784ax identifierInfo(C3997fq fqVar) {
        this.identifierInfo = fqVar;
        return this;
    }

    public C3784ax isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    public C3784ax linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    public C3784ax linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    public C3784ax liveStreamPrefetchSeconds(Float f) {
        this.liveStreamPrefetchSeconds = f;
        return this;
    }

    public C3784ax marketAppInfo(C3918cs csVar) {
        this.marketAppInfo = csVar;
        return this;
    }

    public C3784ax msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    public C3784ax network(String str) {
        this.network = str;
        return this;
    }

    public C3784ax networkCode(String str) {
        this.networkCode = str;
        return this;
    }

    public C3784ax omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    public C3784ax settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    public C3784ax streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    public C3784ax supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    public C3784ax supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    public C3784ax supportsNativeNetworking(Boolean bool) {
        this.supportsNativeNetworking = bool;
        return this;
    }

    public C3784ax supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    public C3784ax useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    public C3784ax usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    public C3784ax vastLoadTimeout(Float f) {
        this.vastLoadTimeout = f;
        return this;
    }

    public C3784ax videoContinuousPlay(C3924cy cyVar) {
        this.videoContinuousPlay = cyVar;
        return this;
    }

    public C3784ax videoId(String str) {
        this.videoId = str;
        return this;
    }

    public C3784ax videoPlayActivation(C3923cx cxVar) {
        this.videoPlayActivation = cxVar;
        return this;
    }

    public C3784ax videoPlayMuted(C3925cz czVar) {
        this.videoPlayMuted = czVar;
        return this;
    }
}
