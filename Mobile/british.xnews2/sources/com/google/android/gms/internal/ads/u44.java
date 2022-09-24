package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u44 {

    /* renamed from: d */
    private static final AtomicLong f39765d = new AtomicLong();

    /* renamed from: a */
    public final ci1 f39766a;

    /* renamed from: b */
    public final Uri f39767b;

    /* renamed from: c */
    public final Map<String, List<String>> f39768c;

    public u44(long j, ci1 ci1, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f39766a = ci1;
        this.f39767b = uri;
        this.f39768c = map;
    }

    /* renamed from: a */
    public static long m38145a() {
        return f39765d.getAndIncrement();
    }
}
