package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afo */
/* compiled from: IMASDK */
final class afo extends LinkedHashMap<Uri, byte[]> {
    afo() {
        super(5, 1.0f, false);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > 4;
    }
}
