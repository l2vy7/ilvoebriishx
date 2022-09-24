package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.internal.atz;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ac */
/* compiled from: IMASDK */
final class C3763ac extends C3792be {
    private atz<C3794bg> obstructions;

    C3763ac() {
    }

    public C3795bh build() {
        String str;
        String str2 = "";
        if (this.obstructions == null) {
            str2 = str2.concat(" obstructions");
        }
        if (str2.isEmpty()) {
            return new C3764ad(this.obstructions);
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3792be obstructions(List<C3794bg> list) {
        this.obstructions = atz.m14811m(list);
        return this;
    }
}
