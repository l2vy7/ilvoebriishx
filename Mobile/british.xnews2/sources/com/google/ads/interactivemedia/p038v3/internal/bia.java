package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bia */
/* compiled from: IMASDK */
final class bia extends bfi<Locale> {
    bia() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        String str = null;
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(biw.mo15092g(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        if (nextToken2 == null && str == null) {
            return new Locale(nextToken);
        }
        if (str == null) {
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, str);
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        Locale locale = (Locale) obj;
        if (locale == null) {
            str = null;
        } else {
            str = locale.toString();
        }
        biy.mo15118k(str);
    }
}
