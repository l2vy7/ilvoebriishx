package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.internal.C3918cs;
import com.google.ads.interactivemedia.p039v3.internal.C3923cx;
import com.google.ads.interactivemedia.p039v3.internal.C3924cy;
import com.google.ads.interactivemedia.p039v3.internal.C3925cz;
import com.google.ads.interactivemedia.p039v3.internal.C3997fq;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aue;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.y */
/* compiled from: IMASDK */
final class C3825y extends C3785ay {
    private final aue<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final aue<String, String> companionSlots;
    private final C3780at consentSettings;
    private final Float contentDuration;
    private final atz<String> contentKeywords;
    private final String contentSourceId;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final String env;
    private final aue<String, String> extraParameters;
    private final String format;
    private final C3997fq identifierInfo;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final Float liveStreamPrefetchSeconds;
    private final C3918cs marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final C3924cy videoContinuousPlay;
    private final String videoId;
    private final C3923cx videoPlayActivation;
    private final C3925cz videoPlayMuted;

    private C3825y(String str, aue<String, String> aue, String str2, String str3, String str4, String str5, aue<String, String> aue2, Float f, atz<String> atz, String str6, String str7, String str8, C3780at atVar, String str9, String str10, aue<String, String> aue3, String str11, C3997fq fqVar, Boolean bool, Integer num, Integer num2, Float f2, C3918cs csVar, String str12, String str13, String str14, Boolean bool2, ImaSdkSettings imaSdkSettings, Boolean bool3, Boolean bool4, Boolean bool5, String str15, Boolean bool6, Boolean bool7, Boolean bool8, Float f3, String str16, C3923cx cxVar, C3924cy cyVar, C3925cz czVar) {
        this.adTagUrl = str;
        this.adTagParameters = aue;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = aue2;
        this.contentDuration = f;
        this.contentKeywords = atz;
        this.contentTitle = str6;
        this.contentUrl = str7;
        this.contentSourceId = str8;
        this.consentSettings = atVar;
        this.customAssetKey = str9;
        this.env = str10;
        this.extraParameters = aue3;
        this.format = str11;
        this.identifierInfo = fqVar;
        this.isTv = bool;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = csVar;
        this.msParameter = str12;
        this.network = str13;
        this.networkCode = str14;
        this.omidAdSessionsOnStartedOnly = bool2;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool3;
        this.supportsIconClickFallback = bool4;
        this.supportsNativeNetworking = bool5;
        this.streamActivityMonitorId = str15;
        this.supportsResizing = bool6;
        this.useQAStreamBaseUrl = bool7;
        this.usesCustomVideoPlayback = bool8;
        this.vastLoadTimeout = f3;
        this.videoId = str16;
        this.videoPlayActivation = cxVar;
        this.videoContinuousPlay = cyVar;
        this.videoPlayMuted = czVar;
    }

    public aue<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    public String adTagUrl() {
        return this.adTagUrl;
    }

    public String adsResponse() {
        return this.adsResponse;
    }

    public String apiKey() {
        return this.apiKey;
    }

    public String assetKey() {
        return this.assetKey;
    }

    public String authToken() {
        return this.authToken;
    }

    public aue<String, String> companionSlots() {
        return this.companionSlots;
    }

    public C3780at consentSettings() {
        return this.consentSettings;
    }

    public Float contentDuration() {
        return this.contentDuration;
    }

    public atz<String> contentKeywords() {
        return this.contentKeywords;
    }

    public String contentSourceId() {
        return this.contentSourceId;
    }

    public String contentTitle() {
        return this.contentTitle;
    }

    public String contentUrl() {
        return this.contentUrl;
    }

    /* access modifiers changed from: package-private */
    public String customAssetKey() {
        return this.customAssetKey;
    }

    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3785ay) {
            C3785ay ayVar = (C3785ay) obj;
            String str = this.adTagUrl;
            if (str != null ? str.equals(ayVar.adTagUrl()) : ayVar.adTagUrl() == null) {
                aue<String, String> aue = this.adTagParameters;
                if (aue != null ? aue.equals(ayVar.adTagParameters()) : ayVar.adTagParameters() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(ayVar.adsResponse()) : ayVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(ayVar.apiKey()) : ayVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(ayVar.assetKey()) : ayVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(ayVar.authToken()) : ayVar.authToken() == null) {
                                    aue<String, String> aue2 = this.companionSlots;
                                    if (aue2 != null ? aue2.equals(ayVar.companionSlots()) : ayVar.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(ayVar.contentDuration()) : ayVar.contentDuration() == null) {
                                            atz<String> atz = this.contentKeywords;
                                            if (atz != null ? atz.equals(ayVar.contentKeywords()) : ayVar.contentKeywords() == null) {
                                                String str6 = this.contentTitle;
                                                if (str6 != null ? str6.equals(ayVar.contentTitle()) : ayVar.contentTitle() == null) {
                                                    String str7 = this.contentUrl;
                                                    if (str7 != null ? str7.equals(ayVar.contentUrl()) : ayVar.contentUrl() == null) {
                                                        String str8 = this.contentSourceId;
                                                        if (str8 != null ? str8.equals(ayVar.contentSourceId()) : ayVar.contentSourceId() == null) {
                                                            C3780at atVar = this.consentSettings;
                                                            if (atVar != null ? atVar.equals(ayVar.consentSettings()) : ayVar.consentSettings() == null) {
                                                                String str9 = this.customAssetKey;
                                                                if (str9 != null ? str9.equals(ayVar.customAssetKey()) : ayVar.customAssetKey() == null) {
                                                                    String str10 = this.env;
                                                                    if (str10 != null ? str10.equals(ayVar.env()) : ayVar.env() == null) {
                                                                        aue<String, String> aue3 = this.extraParameters;
                                                                        if (aue3 != null ? aue3.equals(ayVar.extraParameters()) : ayVar.extraParameters() == null) {
                                                                            String str11 = this.format;
                                                                            if (str11 != null ? str11.equals(ayVar.format()) : ayVar.format() == null) {
                                                                                C3997fq fqVar = this.identifierInfo;
                                                                                if (fqVar != null ? fqVar.equals(ayVar.identifierInfo()) : ayVar.identifierInfo() == null) {
                                                                                    Boolean bool = this.isTv;
                                                                                    if (bool != null ? bool.equals(ayVar.isTv()) : ayVar.isTv() == null) {
                                                                                        Integer num = this.linearAdSlotWidth;
                                                                                        if (num != null ? num.equals(ayVar.linearAdSlotWidth()) : ayVar.linearAdSlotWidth() == null) {
                                                                                            Integer num2 = this.linearAdSlotHeight;
                                                                                            if (num2 != null ? num2.equals(ayVar.linearAdSlotHeight()) : ayVar.linearAdSlotHeight() == null) {
                                                                                                Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                if (f2 != null ? f2.equals(ayVar.liveStreamPrefetchSeconds()) : ayVar.liveStreamPrefetchSeconds() == null) {
                                                                                                    C3918cs csVar = this.marketAppInfo;
                                                                                                    if (csVar != null ? csVar.equals(ayVar.marketAppInfo()) : ayVar.marketAppInfo() == null) {
                                                                                                        String str12 = this.msParameter;
                                                                                                        if (str12 != null ? str12.equals(ayVar.msParameter()) : ayVar.msParameter() == null) {
                                                                                                            String str13 = this.network;
                                                                                                            if (str13 != null ? str13.equals(ayVar.network()) : ayVar.network() == null) {
                                                                                                                String str14 = this.networkCode;
                                                                                                                if (str14 != null ? str14.equals(ayVar.networkCode()) : ayVar.networkCode() == null) {
                                                                                                                    Boolean bool2 = this.omidAdSessionsOnStartedOnly;
                                                                                                                    if (bool2 != null ? bool2.equals(ayVar.omidAdSessionsOnStartedOnly()) : ayVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                        ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                        if (imaSdkSettings != null ? imaSdkSettings.equals(ayVar.settings()) : ayVar.settings() == null) {
                                                                                                                            Boolean bool3 = this.supportsExternalNavigation;
                                                                                                                            if (bool3 != null ? bool3.equals(ayVar.supportsExternalNavigation()) : ayVar.supportsExternalNavigation() == null) {
                                                                                                                                Boolean bool4 = this.supportsIconClickFallback;
                                                                                                                                if (bool4 != null ? bool4.equals(ayVar.supportsIconClickFallback()) : ayVar.supportsIconClickFallback() == null) {
                                                                                                                                    Boolean bool5 = this.supportsNativeNetworking;
                                                                                                                                    if (bool5 != null ? bool5.equals(ayVar.supportsNativeNetworking()) : ayVar.supportsNativeNetworking() == null) {
                                                                                                                                        String str15 = this.streamActivityMonitorId;
                                                                                                                                        if (str15 != null ? str15.equals(ayVar.streamActivityMonitorId()) : ayVar.streamActivityMonitorId() == null) {
                                                                                                                                            Boolean bool6 = this.supportsResizing;
                                                                                                                                            if (bool6 != null ? bool6.equals(ayVar.supportsResizing()) : ayVar.supportsResizing() == null) {
                                                                                                                                                Boolean bool7 = this.useQAStreamBaseUrl;
                                                                                                                                                if (bool7 != null ? bool7.equals(ayVar.useQAStreamBaseUrl()) : ayVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                    Boolean bool8 = this.usesCustomVideoPlayback;
                                                                                                                                                    if (bool8 != null ? bool8.equals(ayVar.usesCustomVideoPlayback()) : ayVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                        Float f3 = this.vastLoadTimeout;
                                                                                                                                                        if (f3 != null ? f3.equals(ayVar.vastLoadTimeout()) : ayVar.vastLoadTimeout() == null) {
                                                                                                                                                            String str16 = this.videoId;
                                                                                                                                                            if (str16 != null ? str16.equals(ayVar.videoId()) : ayVar.videoId() == null) {
                                                                                                                                                                C3923cx cxVar = this.videoPlayActivation;
                                                                                                                                                                if (cxVar != null ? cxVar.equals(ayVar.videoPlayActivation()) : ayVar.videoPlayActivation() == null) {
                                                                                                                                                                    C3924cy cyVar = this.videoContinuousPlay;
                                                                                                                                                                    if (cyVar != null ? cyVar.equals(ayVar.videoContinuousPlay()) : ayVar.videoContinuousPlay() == null) {
                                                                                                                                                                        C3925cz czVar = this.videoPlayMuted;
                                                                                                                                                                        if (czVar != null ? czVar.equals(ayVar.videoPlayMuted()) : ayVar.videoPlayMuted() == null) {
                                                                                                                                                                            return true;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public aue<String, String> extraParameters() {
        return this.extraParameters;
    }

    public String format() {
        return this.format;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        String str = this.adTagUrl;
        int i39 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        aue<String, String> aue = this.adTagParameters;
        if (aue == null) {
            i = 0;
        } else {
            i = aue.hashCode();
        }
        int i40 = (hashCode ^ i) * 1000003;
        String str2 = this.adsResponse;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i41 = (i40 ^ i2) * 1000003;
        String str3 = this.apiKey;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i42 = (i41 ^ i3) * 1000003;
        String str4 = this.assetKey;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i43 = (i42 ^ i4) * 1000003;
        String str5 = this.authToken;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i44 = (i43 ^ i5) * 1000003;
        aue<String, String> aue2 = this.companionSlots;
        if (aue2 == null) {
            i6 = 0;
        } else {
            i6 = aue2.hashCode();
        }
        int i45 = (i44 ^ i6) * 1000003;
        Float f = this.contentDuration;
        if (f == null) {
            i7 = 0;
        } else {
            i7 = f.hashCode();
        }
        int i46 = (i45 ^ i7) * 1000003;
        atz<String> atz = this.contentKeywords;
        if (atz == null) {
            i8 = 0;
        } else {
            i8 = atz.hashCode();
        }
        int i47 = (i46 ^ i8) * 1000003;
        String str6 = this.contentTitle;
        if (str6 == null) {
            i9 = 0;
        } else {
            i9 = str6.hashCode();
        }
        int i48 = (i47 ^ i9) * 1000003;
        String str7 = this.contentUrl;
        if (str7 == null) {
            i10 = 0;
        } else {
            i10 = str7.hashCode();
        }
        int i49 = (i48 ^ i10) * 1000003;
        String str8 = this.contentSourceId;
        if (str8 == null) {
            i11 = 0;
        } else {
            i11 = str8.hashCode();
        }
        int i50 = (i49 ^ i11) * 1000003;
        C3780at atVar = this.consentSettings;
        if (atVar == null) {
            i12 = 0;
        } else {
            i12 = atVar.hashCode();
        }
        int i51 = (i50 ^ i12) * 1000003;
        String str9 = this.customAssetKey;
        if (str9 == null) {
            i13 = 0;
        } else {
            i13 = str9.hashCode();
        }
        int i52 = (i51 ^ i13) * 1000003;
        String str10 = this.env;
        if (str10 == null) {
            i14 = 0;
        } else {
            i14 = str10.hashCode();
        }
        int i53 = (i52 ^ i14) * 1000003;
        aue<String, String> aue3 = this.extraParameters;
        if (aue3 == null) {
            i15 = 0;
        } else {
            i15 = aue3.hashCode();
        }
        int i54 = (i53 ^ i15) * 1000003;
        String str11 = this.format;
        if (str11 == null) {
            i16 = 0;
        } else {
            i16 = str11.hashCode();
        }
        int i55 = (i54 ^ i16) * 1000003;
        C3997fq fqVar = this.identifierInfo;
        if (fqVar == null) {
            i17 = 0;
        } else {
            i17 = fqVar.hashCode();
        }
        int i56 = (i55 ^ i17) * 1000003;
        Boolean bool = this.isTv;
        if (bool == null) {
            i18 = 0;
        } else {
            i18 = bool.hashCode();
        }
        int i57 = (i56 ^ i18) * 1000003;
        Integer num = this.linearAdSlotWidth;
        if (num == null) {
            i19 = 0;
        } else {
            i19 = num.hashCode();
        }
        int i58 = (i57 ^ i19) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        if (num2 == null) {
            i20 = 0;
        } else {
            i20 = num2.hashCode();
        }
        int i59 = (i58 ^ i20) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        if (f2 == null) {
            i21 = 0;
        } else {
            i21 = f2.hashCode();
        }
        int i60 = (i59 ^ i21) * 1000003;
        C3918cs csVar = this.marketAppInfo;
        if (csVar == null) {
            i22 = 0;
        } else {
            i22 = csVar.hashCode();
        }
        int i61 = (i60 ^ i22) * 1000003;
        String str12 = this.msParameter;
        if (str12 == null) {
            i23 = 0;
        } else {
            i23 = str12.hashCode();
        }
        int i62 = (i61 ^ i23) * 1000003;
        String str13 = this.network;
        if (str13 == null) {
            i24 = 0;
        } else {
            i24 = str13.hashCode();
        }
        int i63 = (i62 ^ i24) * 1000003;
        String str14 = this.networkCode;
        if (str14 == null) {
            i25 = 0;
        } else {
            i25 = str14.hashCode();
        }
        int i64 = (i63 ^ i25) * 1000003;
        Boolean bool2 = this.omidAdSessionsOnStartedOnly;
        if (bool2 == null) {
            i26 = 0;
        } else {
            i26 = bool2.hashCode();
        }
        int i65 = (i64 ^ i26) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        if (imaSdkSettings == null) {
            i27 = 0;
        } else {
            i27 = imaSdkSettings.hashCode();
        }
        int i66 = (i65 ^ i27) * 1000003;
        Boolean bool3 = this.supportsExternalNavigation;
        if (bool3 == null) {
            i28 = 0;
        } else {
            i28 = bool3.hashCode();
        }
        int i67 = (i66 ^ i28) * 1000003;
        Boolean bool4 = this.supportsIconClickFallback;
        if (bool4 == null) {
            i29 = 0;
        } else {
            i29 = bool4.hashCode();
        }
        int i68 = (i67 ^ i29) * 1000003;
        Boolean bool5 = this.supportsNativeNetworking;
        if (bool5 == null) {
            i30 = 0;
        } else {
            i30 = bool5.hashCode();
        }
        int i69 = (i68 ^ i30) * 1000003;
        String str15 = this.streamActivityMonitorId;
        if (str15 == null) {
            i31 = 0;
        } else {
            i31 = str15.hashCode();
        }
        int i70 = (i69 ^ i31) * 1000003;
        Boolean bool6 = this.supportsResizing;
        if (bool6 == null) {
            i32 = 0;
        } else {
            i32 = bool6.hashCode();
        }
        int i71 = (i70 ^ i32) * 1000003;
        Boolean bool7 = this.useQAStreamBaseUrl;
        if (bool7 == null) {
            i33 = 0;
        } else {
            i33 = bool7.hashCode();
        }
        int i72 = (i71 ^ i33) * 1000003;
        Boolean bool8 = this.usesCustomVideoPlayback;
        if (bool8 == null) {
            i34 = 0;
        } else {
            i34 = bool8.hashCode();
        }
        int i73 = (i72 ^ i34) * 1000003;
        Float f3 = this.vastLoadTimeout;
        if (f3 == null) {
            i35 = 0;
        } else {
            i35 = f3.hashCode();
        }
        int i74 = (i73 ^ i35) * 1000003;
        String str16 = this.videoId;
        if (str16 == null) {
            i36 = 0;
        } else {
            i36 = str16.hashCode();
        }
        int i75 = (i74 ^ i36) * 1000003;
        C3923cx cxVar = this.videoPlayActivation;
        if (cxVar == null) {
            i37 = 0;
        } else {
            i37 = cxVar.hashCode();
        }
        int i76 = (i75 ^ i37) * 1000003;
        C3924cy cyVar = this.videoContinuousPlay;
        if (cyVar == null) {
            i38 = 0;
        } else {
            i38 = cyVar.hashCode();
        }
        int i77 = (i76 ^ i38) * 1000003;
        C3925cz czVar = this.videoPlayMuted;
        if (czVar != null) {
            i39 = czVar.hashCode();
        }
        return i77 ^ i39;
    }

    public C3997fq identifierInfo() {
        return this.identifierInfo;
    }

    public Boolean isTv() {
        return this.isTv;
    }

    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    public C3918cs marketAppInfo() {
        return this.marketAppInfo;
    }

    public String msParameter() {
        return this.msParameter;
    }

    public String network() {
        return this.network;
    }

    public String networkCode() {
        return this.networkCode;
    }

    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    public ImaSdkSettings settings() {
        return this.settings;
    }

    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        String str = this.adTagUrl;
        String valueOf = String.valueOf(this.adTagParameters);
        String str2 = this.adsResponse;
        String str3 = this.apiKey;
        String str4 = this.assetKey;
        String str5 = this.authToken;
        String valueOf2 = String.valueOf(this.companionSlots);
        String valueOf3 = String.valueOf(this.contentDuration);
        String valueOf4 = String.valueOf(this.contentKeywords);
        String str6 = this.contentTitle;
        String str7 = this.contentUrl;
        String str8 = this.contentSourceId;
        String valueOf5 = String.valueOf(this.consentSettings);
        String str9 = this.customAssetKey;
        String str10 = this.env;
        String valueOf6 = String.valueOf(this.extraParameters);
        String str11 = this.format;
        String valueOf7 = String.valueOf(this.identifierInfo);
        String valueOf8 = String.valueOf(this.isTv);
        String valueOf9 = String.valueOf(this.linearAdSlotWidth);
        String valueOf10 = String.valueOf(this.linearAdSlotHeight);
        String valueOf11 = String.valueOf(this.liveStreamPrefetchSeconds);
        String valueOf12 = String.valueOf(this.marketAppInfo);
        String str12 = this.msParameter;
        String str13 = this.network;
        String str14 = this.networkCode;
        String valueOf13 = String.valueOf(this.omidAdSessionsOnStartedOnly);
        String valueOf14 = String.valueOf(this.settings);
        String valueOf15 = String.valueOf(this.supportsExternalNavigation);
        String valueOf16 = String.valueOf(this.supportsIconClickFallback);
        String valueOf17 = String.valueOf(this.supportsNativeNetworking);
        String str15 = this.streamActivityMonitorId;
        String valueOf18 = String.valueOf(this.supportsResizing);
        String valueOf19 = String.valueOf(this.useQAStreamBaseUrl);
        String valueOf20 = String.valueOf(this.usesCustomVideoPlayback);
        String valueOf21 = String.valueOf(this.vastLoadTimeout);
        String str16 = this.videoId;
        String valueOf22 = String.valueOf(this.videoPlayActivation);
        String valueOf23 = String.valueOf(this.videoContinuousPlay);
        String valueOf24 = String.valueOf(this.videoPlayMuted);
        int length = String.valueOf(str).length() + 709 + valueOf.length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + valueOf2.length() + valueOf3.length() + valueOf4.length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length();
        int length2 = valueOf5.length();
        int length3 = String.valueOf(str9).length();
        int length4 = String.valueOf(str10).length();
        int length5 = valueOf6.length();
        int length6 = String.valueOf(str11).length();
        int length7 = valueOf7.length();
        int length8 = valueOf8.length();
        int length9 = valueOf9.length();
        int length10 = valueOf10.length();
        int length11 = valueOf11.length();
        int length12 = valueOf12.length();
        int length13 = String.valueOf(str12).length();
        int length14 = String.valueOf(str13).length();
        int length15 = String.valueOf(str14).length();
        int length16 = valueOf13.length();
        int length17 = valueOf14.length();
        int length18 = valueOf15.length();
        int length19 = valueOf16.length();
        int length20 = valueOf17.length();
        int length21 = String.valueOf(str15).length();
        int length22 = valueOf18.length();
        int length23 = valueOf19.length();
        int length24 = valueOf20.length();
        int length25 = valueOf21.length();
        int length26 = String.valueOf(str16).length();
        int length27 = valueOf22.length();
        String str17 = valueOf24;
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + length21 + length22 + length23 + length24 + length25 + length26 + length27 + valueOf23.length() + valueOf24.length());
        sb.append("GsonAdsRequest{adTagUrl=");
        sb.append(str);
        sb.append(", adTagParameters=");
        sb.append(valueOf);
        sb.append(", adsResponse=");
        sb.append(str2);
        sb.append(", apiKey=");
        sb.append(str3);
        sb.append(", assetKey=");
        sb.append(str4);
        sb.append(", authToken=");
        sb.append(str5);
        sb.append(", companionSlots=");
        sb.append(valueOf2);
        sb.append(", contentDuration=");
        sb.append(valueOf3);
        sb.append(", contentKeywords=");
        sb.append(valueOf4);
        sb.append(", contentTitle=");
        sb.append(str6);
        sb.append(", contentUrl=");
        sb.append(str7);
        sb.append(", contentSourceId=");
        sb.append(str8);
        sb.append(", consentSettings=");
        sb.append(valueOf5);
        sb.append(", customAssetKey=");
        sb.append(str9);
        sb.append(", env=");
        sb.append(str10);
        sb.append(", extraParameters=");
        sb.append(valueOf6);
        sb.append(", format=");
        sb.append(str11);
        sb.append(", identifierInfo=");
        sb.append(valueOf7);
        sb.append(", isTv=");
        sb.append(valueOf8);
        sb.append(", linearAdSlotWidth=");
        sb.append(valueOf9);
        sb.append(", linearAdSlotHeight=");
        sb.append(valueOf10);
        sb.append(", liveStreamPrefetchSeconds=");
        sb.append(valueOf11);
        sb.append(", marketAppInfo=");
        sb.append(valueOf12);
        sb.append(", msParameter=");
        sb.append(str12);
        sb.append(", network=");
        sb.append(str13);
        sb.append(", networkCode=");
        sb.append(str14);
        sb.append(", omidAdSessionsOnStartedOnly=");
        sb.append(valueOf13);
        sb.append(", settings=");
        sb.append(valueOf14);
        sb.append(", supportsExternalNavigation=");
        sb.append(valueOf15);
        sb.append(", supportsIconClickFallback=");
        sb.append(valueOf16);
        sb.append(", supportsNativeNetworking=");
        sb.append(valueOf17);
        sb.append(", streamActivityMonitorId=");
        sb.append(str15);
        sb.append(", supportsResizing=");
        sb.append(valueOf18);
        sb.append(", useQAStreamBaseUrl=");
        sb.append(valueOf19);
        sb.append(", usesCustomVideoPlayback=");
        sb.append(valueOf20);
        sb.append(", vastLoadTimeout=");
        sb.append(valueOf21);
        sb.append(", videoId=");
        sb.append(str16);
        sb.append(", videoPlayActivation=");
        sb.append(valueOf22);
        sb.append(", videoContinuousPlay=");
        sb.append(valueOf23);
        sb.append(", videoPlayMuted=");
        sb.append(str17);
        sb.append("}");
        return sb.toString();
    }

    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    public C3924cy videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    public String videoId() {
        return this.videoId;
    }

    public C3923cx videoPlayActivation() {
        return this.videoPlayActivation;
    }

    public C3925cz videoPlayMuted() {
        return this.videoPlayMuted;
    }
}
