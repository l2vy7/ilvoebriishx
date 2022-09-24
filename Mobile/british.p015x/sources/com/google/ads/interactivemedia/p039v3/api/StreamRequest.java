package com.google.ads.interactivemedia.p039v3.api;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.api.StreamRequest */
/* compiled from: IMASDK */
public interface StreamRequest {

    /* renamed from: com.google.ads.interactivemedia.v3.api.StreamRequest$StreamFormat */
    /* compiled from: IMASDK */
    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentUrl();

    String getCustomAssetKey();

    StreamFormat getFormat();

    String getManifestSuffix();

    String getNetworkCode();

    String getStreamActivityMonitorId();

    Boolean getUseQAStreamBaseUrl();

    Object getUserRequestContext();

    String getVideoId();

    void setAdTagParameters(Map<String, String> map);

    void setAuthToken(String str);

    void setContentUrl(String str);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    void setStreamActivityMonitorId(String str);

    void setUseQAStreamBaseUrl(Boolean bool);

    void setUserRequestContext(Object obj);
}
