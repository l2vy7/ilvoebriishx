package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aft */
/* compiled from: IMASDK */
final class aft extends ahv {

    /* renamed from: d */
    private int f14539d;

    public aft(aco aco, int[] iArr) {
        super(aco, iArr);
        this.f14539d = mo13741n(aco.mo13445a(iArr[0]));
    }

    /* renamed from: a */
    public final int mo13614a() {
        return this.f14539d;
    }

    /* renamed from: b */
    public final int mo13615b() {
        return 0;
    }

    /* renamed from: c */
    public final void mo13616c() {
    }

    /* renamed from: d */
    public final void mo13617d(long j, long j2, List<? extends adl> list, adn[] adnArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo13746s(this.f14539d, elapsedRealtime)) {
            int i = this.f14884b;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo13746s(i, elapsedRealtime));
            this.f14539d = i;
        }
    }
}
