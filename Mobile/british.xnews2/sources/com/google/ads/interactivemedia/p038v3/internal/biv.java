package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.biv */
/* compiled from: IMASDK */
final class biv extends bfz {
    biv() {
    }

    /* renamed from: a */
    public final void mo15036a(biw biw) throws IOException {
        if (biw instanceof bgv) {
            ((bgv) biw).mo15099n();
            return;
        }
        int i = biw.f16434a;
        if (i == 0) {
            i = biw.mo15140s();
        }
        if (i == 13) {
            biw.f16434a = 9;
        } else if (i == 12) {
            biw.f16434a = 8;
        } else if (i == 14) {
            biw.f16434a = 10;
        } else {
            String a = bix.m15972a(biw.mo15101p());
            String t = biw.mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24 + String.valueOf(t).length());
            sb.append("Expected a name but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
    }
}
