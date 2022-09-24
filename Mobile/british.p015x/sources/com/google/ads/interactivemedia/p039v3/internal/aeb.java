package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aeb */
/* compiled from: IMASDK */
final class aeb implements akk<Long> {
    private aeb() {
    }

    /* synthetic */ aeb(byte[] bArr) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13517a(Uri uri, InputStream inputStream) throws IOException {
        return Long.valueOf(amm.m14195L(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
