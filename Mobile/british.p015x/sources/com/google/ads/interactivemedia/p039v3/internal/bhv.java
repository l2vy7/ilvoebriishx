package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.net.InetAddress;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhv */
/* compiled from: IMASDK */
final class bhv extends bfi<InetAddress> {
    bhv() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return InetAddress.getByName(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            str = null;
        } else {
            str = inetAddress.getHostAddress();
        }
        biy.mo15118k(str);
    }
}
