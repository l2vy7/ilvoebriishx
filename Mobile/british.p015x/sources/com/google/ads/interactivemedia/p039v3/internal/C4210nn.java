package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioAttributes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nn */
/* compiled from: IMASDK */
public final class C4210nn {

    /* renamed from: a */
    public static final C4210nn f18088a = C4257pg.m18523b(1, 1);

    /* renamed from: b */
    public final int f18089b = 0;

    /* renamed from: c */
    public final int f18090c = 1;

    /* renamed from: d */
    public final int f18091d = 1;

    /* renamed from: e */
    private AudioAttributes f18092e;

    /* synthetic */ C4210nn(int i, int i2) {
    }

    /* renamed from: a */
    public final AudioAttributes mo16365a() {
        if (this.f18092e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (amm.f15298a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f18092e = usage.build();
        }
        return this.f18092e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4210nn.class != obj.getClass()) {
            return false;
        }
        C4210nn nnVar = (C4210nn) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
