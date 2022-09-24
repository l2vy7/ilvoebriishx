package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(C3371Ad ad);

    @Benchmark
    void onAdLoaded(C3371Ad ad);

    @Benchmark
    void onError(C3371Ad ad, AdError adError);

    @Benchmark
    void onLoggingImpression(C3371Ad ad);
}
