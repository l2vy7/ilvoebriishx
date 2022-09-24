package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f34 {

    /* renamed from: a */
    public final j34 f31611a;

    /* renamed from: b */
    public final MediaFormat f31612b;

    /* renamed from: c */
    public final C8281w f31613c;

    /* renamed from: d */
    public final Surface f31614d;

    /* renamed from: e */
    public final MediaCrypto f31615e = null;

    private f34(j34 j34, MediaFormat mediaFormat, C8281w wVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f31611a = j34;
        this.f31612b = mediaFormat;
        this.f31613c = wVar;
        this.f31614d = surface;
    }

    /* renamed from: a */
    public static f34 m32022a(j34 j34, MediaFormat mediaFormat, C8281w wVar, MediaCrypto mediaCrypto) {
        return new f34(j34, mediaFormat, wVar, (Surface) null, (MediaCrypto) null, 0, false);
    }

    /* renamed from: b */
    public static f34 m32023b(j34 j34, MediaFormat mediaFormat, C8281w wVar, Surface surface, MediaCrypto mediaCrypto) {
        return new f34(j34, mediaFormat, wVar, surface, (MediaCrypto) null, 0, false);
    }
}
