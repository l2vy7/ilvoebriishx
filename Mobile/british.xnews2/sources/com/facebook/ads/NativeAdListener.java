package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface NativeAdListener extends AdListener {
    void onMediaDownloaded(C3371Ad ad);
}
