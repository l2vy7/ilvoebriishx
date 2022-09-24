package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aas */
/* compiled from: IMASDK */
public final class aas {

    /* renamed from: a */
    private static final AtomicLong f13965a = new AtomicLong();

    public aas() {
    }

    public aas(ajk ajk) {
        Uri uri = ajk.f15056a;
        Collections.emptyMap();
    }

    /* renamed from: a */
    public static long m12804a() {
        return f13965a.getAndIncrement();
    }
}
