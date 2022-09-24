package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aby */
/* compiled from: IMASDK */
public final class aby implements abl {

    /* renamed from: a */
    private final ajf f14094a;

    /* renamed from: b */
    private final abm f14095b;

    /* renamed from: c */
    private final C4287qj f14096c = new C4273pw();

    /* renamed from: d */
    private final int f14097d = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

    /* renamed from: e */
    private final aup f14098e = new aup();

    public aby(ajf ajf, C4311rg rgVar) {
        abx abx = new abx(rgVar);
        this.f14094a = ajf;
        this.f14095b = abx;
    }

    @Deprecated
    /* renamed from: a */
    public final abz mo13378a(Uri uri) {
        C4124ki kiVar = new C4124ki();
        kiVar.mo16144f(uri);
        C4129kn a = kiVar.mo16139a();
        aup.m14890u(a.f17729b);
        Object obj = a.f17729b.f17727h;
        return new abz(a, this.f14094a, this.f14095b, this.f14096c.mo16529a(a), this.f14098e, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
