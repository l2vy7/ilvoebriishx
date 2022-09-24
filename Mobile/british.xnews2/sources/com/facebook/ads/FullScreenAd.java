package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.C3371Ad;

public interface FullScreenAd extends C3371Ad {

    @Keep
    public interface ShowAdConfig {
    }

    @Keep
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C3371Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
