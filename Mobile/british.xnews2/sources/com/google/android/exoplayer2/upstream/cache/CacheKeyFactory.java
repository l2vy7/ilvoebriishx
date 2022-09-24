package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = C6993a.f27662a;

    String buildCacheKey(DataSpec dataSpec);
}
