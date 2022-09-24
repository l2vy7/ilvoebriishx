package com.google.ads.interactivemedia.p039v3.impl.data;

import android.os.Build;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.AdsRequest;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.StreamRequest;
import com.google.ads.interactivemedia.p039v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p039v3.internal.C3908ci;
import com.google.ads.interactivemedia.p039v3.internal.C3918cs;
import com.google.ads.interactivemedia.p039v3.internal.C3923cx;
import com.google.ads.interactivemedia.p039v3.internal.C3924cy;
import com.google.ads.interactivemedia.p039v3.internal.C3925cz;
import com.google.ads.interactivemedia.p039v3.internal.C3927da;
import com.google.ads.interactivemedia.p039v3.internal.C3932df;
import com.google.ads.interactivemedia.p039v3.internal.C3977ex;
import com.google.ads.interactivemedia.p039v3.internal.C3991fk;
import com.google.ads.interactivemedia.p039v3.internal.C3997fq;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.auc;
import com.google.ads.interactivemedia.p039v3.internal.aue;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ay */
/* compiled from: IMASDK */
public abstract class C3785ay {
    public static C3784ax builder() {
        return new C3824x();
    }

    public static C3785ay create(AdsRequest adsRequest, String str, C3780at atVar, String str2, ImaSdkSettings imaSdkSettings, C3918cs csVar, boolean z, C3997fq fqVar, AdDisplayContainer adDisplayContainer) {
        String adTagUrl = adsRequest.getAdTagUrl();
        String adsResponse = adsRequest.getAdsResponse();
        Map<String, String> extraParameters = adsRequest.getExtraParameters();
        C3927da daVar = (C3927da) adsRequest;
        C3923cx a = daVar.mo15646a();
        C3925cz b = daVar.mo15647b();
        C3924cy c = daVar.mo15648c();
        Float d = daVar.mo15649d();
        List<String> e = daVar.mo15650e();
        String f = daVar.mo15651f();
        String g = daVar.mo15652g();
        Float h = daVar.mo15653h();
        Float i = daVar.mo15654i();
        Map<String, String> companionSlots = getCompanionSlots((C3908ci) adDisplayContainer);
        ViewGroup adContainer = adDisplayContainer.getAdContainer();
        C3784ax builder = builder();
        builder.adTagUrl(adTagUrl);
        builder.adsResponse(adsResponse);
        builder.companionSlots(companionSlots);
        builder.consentSettings(atVar);
        builder.contentDuration(d);
        builder.contentKeywords(e);
        builder.contentTitle(f);
        builder.contentUrl(g);
        builder.env(str);
        builder.extraParameters(extraParameters);
        builder.identifierInfo(fqVar);
        Boolean valueOf = Boolean.valueOf(z);
        builder.isTv(valueOf);
        builder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        builder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        builder.liveStreamPrefetchSeconds(i);
        builder.marketAppInfo(csVar);
        builder.network(str2);
        builder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        builder.settings(imaSdkSettings);
        builder.supportsExternalNavigation(Boolean.valueOf(!z));
        builder.supportsIconClickFallback(valueOf);
        builder.supportsNativeNetworking(Boolean.valueOf(supportsNativeNetworkRequests()));
        builder.supportsResizing(Boolean.valueOf(adDisplayContainer.getPlayer() instanceof ResizablePlayer));
        builder.usesCustomVideoPlayback(Boolean.valueOf(!(adDisplayContainer.getPlayer() instanceof C3991fk)));
        builder.vastLoadTimeout(h);
        builder.videoContinuousPlay(c);
        builder.videoPlayActivation(a);
        builder.videoPlayMuted(b);
        return builder.build();
    }

    public static C3785ay createFromStreamRequest(StreamRequest streamRequest, String str, C3780at atVar, String str2, ImaSdkSettings imaSdkSettings, C3918cs csVar, boolean z, String str3, C3997fq fqVar, StreamDisplayContainer streamDisplayContainer) {
        Map<String, String> companionSlots = getCompanionSlots((C3977ex) streamDisplayContainer);
        ViewGroup adContainer = streamDisplayContainer.getAdContainer();
        String str4 = streamRequest.getFormat() == StreamRequest.StreamFormat.DASH ? "dash" : "hls";
        C3784ax builder = builder();
        builder.adTagParameters(streamRequest.getAdTagParameters());
        builder.apiKey(streamRequest.getApiKey());
        builder.assetKey(streamRequest.getAssetKey());
        builder.authToken(streamRequest.getAuthToken());
        builder.companionSlots(companionSlots);
        builder.consentSettings(atVar);
        builder.contentSourceId(streamRequest.getContentSourceId());
        builder.contentUrl(streamRequest.getContentUrl());
        builder.customAssetKey(streamRequest.getCustomAssetKey());
        builder.env(str);
        builder.format(str4);
        builder.identifierInfo(fqVar);
        builder.network(str2);
        builder.networkCode(streamRequest.getNetworkCode());
        builder.settings(imaSdkSettings);
        builder.marketAppInfo(csVar);
        Boolean valueOf = Boolean.valueOf(z);
        builder.isTv(valueOf);
        builder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        builder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        builder.msParameter(str3);
        builder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        builder.streamActivityMonitorId(streamRequest.getStreamActivityMonitorId());
        builder.supportsExternalNavigation(Boolean.valueOf(!z));
        builder.supportsIconClickFallback(valueOf);
        builder.supportsNativeNetworking(Boolean.valueOf(supportsNativeNetworkRequests()));
        builder.supportsResizing(Boolean.valueOf(streamDisplayContainer.getVideoStreamPlayer() instanceof ResizablePlayer));
        builder.useQAStreamBaseUrl(streamRequest.getUseQAStreamBaseUrl());
        builder.videoId(streamRequest.getVideoId());
        return builder.build();
    }

    private static Map<String, String> getCompanionSlots(C3932df dfVar) {
        Map<String, CompanionAdSlot> a = dfVar.mo15663a();
        if (a == null || a.isEmpty()) {
            return null;
        }
        auc auc = new auc();
        for (String str : ((aue) a).keySet()) {
            CompanionAdSlot companionAdSlot = a.get(str);
            int width = companionAdSlot.getWidth();
            int height = companionAdSlot.getHeight();
            StringBuilder sb = new StringBuilder(23);
            sb.append(width);
            sb.append("x");
            sb.append(height);
            auc.mo14540b(str, sb.toString());
        }
        return auc.mo14539a();
    }

    private static boolean supportsNativeNetworkRequests() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public abstract aue<String, String> adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract aue<String, String> companionSlots();

    public abstract C3780at consentSettings();

    public abstract Float contentDuration();

    public abstract atz<String> contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentTitle();

    public abstract String contentUrl();

    /* access modifiers changed from: package-private */
    public abstract String customAssetKey();

    public abstract String env();

    public abstract aue<String, String> extraParameters();

    public abstract String format();

    public abstract C3997fq identifierInfo();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract C3918cs marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract String networkCode();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract ImaSdkSettings settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeNetworking();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract C3924cy videoContinuousPlay();

    public abstract String videoId();

    public abstract C3923cx videoPlayActivation();

    public abstract C3925cz videoPlayMuted();
}
