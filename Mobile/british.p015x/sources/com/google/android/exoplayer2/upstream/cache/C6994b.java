package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* renamed from: com.google.android.exoplayer2.upstream.cache.b */
/* compiled from: CacheKeyFactory */
public final /* synthetic */ class C6994b {
    static {
        CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;
    }

    /* renamed from: b */
    public static /* synthetic */ String m28727b(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
