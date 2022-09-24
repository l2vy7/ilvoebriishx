package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.upstream.cache.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6996d implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6996d f27663b = new C6996d();

    private /* synthetic */ C6996d() {
    }

    public final int compare(Object obj, Object obj2) {
        return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
    }
}
