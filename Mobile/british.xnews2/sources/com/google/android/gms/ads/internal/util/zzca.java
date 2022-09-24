package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzca {

    /* renamed from: a */
    final Map<Integer, Bitmap> f27875a = new ConcurrentHashMap();

    /* renamed from: b */
    private final AtomicInteger f27876b = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.f27875a.get(num);
    }
}
