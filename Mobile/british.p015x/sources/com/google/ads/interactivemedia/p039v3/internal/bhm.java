package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhm */
/* compiled from: IMASDK */
final class bhm extends bfi<Character> {
    bhm() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        String str;
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        String g = biw.mo15092g();
        if (g.length() == 1) {
            return Character.valueOf(g.charAt(0));
        }
        if (g.length() != 0) {
            str = "Expecting character, got: ".concat(g);
        } else {
            str = new String("Expecting character, got: ");
        }
        throw new bff(str);
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        Character ch = (Character) obj;
        if (ch == null) {
            str = null;
        } else {
            str = String.valueOf(ch);
        }
        biy.mo15118k(str);
    }
}
