package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.util.LinkedHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afp */
/* compiled from: IMASDK */
final class afp {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f14532a = new afo();

    /* renamed from: a */
    public final byte[] mo13609a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f14532a.get(uri);
    }

    /* renamed from: b */
    public final byte[] mo13610b(Uri uri) {
        return (byte[]) this.f14532a.remove(uri);
    }

    /* renamed from: c */
    public final void mo13611c(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.f14532a;
        aup.m14890u(uri);
        byte[] bArr2 = (byte[]) linkedHashMap.put(uri, (byte[]) aup.m14890u(bArr));
    }
}
