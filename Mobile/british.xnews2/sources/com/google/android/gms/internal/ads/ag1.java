package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ag1 {

    /* renamed from: a */
    private Uri f29632a;

    /* renamed from: b */
    private final int f29633b = 1;

    /* renamed from: c */
    private Map<String, String> f29634c = Collections.emptyMap();

    /* renamed from: d */
    private long f29635d;

    /* renamed from: e */
    private int f29636e;

    /* renamed from: a */
    public final ag1 mo30371a(int i) {
        this.f29636e = 6;
        return this;
    }

    /* renamed from: b */
    public final ag1 mo30372b(Map<String, String> map) {
        this.f29634c = map;
        return this;
    }

    /* renamed from: c */
    public final ag1 mo30373c(long j) {
        this.f29635d = j;
        return this;
    }

    /* renamed from: d */
    public final ag1 mo30374d(Uri uri) {
        this.f29632a = uri;
        return this;
    }

    /* renamed from: e */
    public final ci1 mo30375e() {
        Uri uri = this.f29632a;
        if (uri != null) {
            return new ci1(uri, 0, 1, (byte[]) null, this.f29634c, this.f29635d, -1, (String) null, this.f29636e, (Object) null, (bh1) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
