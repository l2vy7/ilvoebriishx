package com.unity3d.services.core.webview;

import com.google.android.exoplayer2.C6540C;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebViewUrlBuilder {
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        String str2 = ("?platform=android" + buildQueryParam(TtmlNode.ATTR_TTS_ORIGIN, configuration.getWebViewUrl())) + buildQueryParam(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion());
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            str2 = str2 + buildQueryParam("experiments", configuration.getExperiments().getExperimentData().toString());
        }
        this._urlWithQueryString = str + str2;
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "" + "&" + str + "=" + URLEncoder.encode(str2, C6540C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            DeviceLog.exception(String.format("Unsupported charset when encoding %s", new Object[]{str}), e);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
