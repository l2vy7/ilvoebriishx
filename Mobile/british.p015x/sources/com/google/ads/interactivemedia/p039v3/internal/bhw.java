package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhw */
/* compiled from: IMASDK */
final class bhw extends bfi<UUID> {
    bhw() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return UUID.fromString(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            str = null;
        } else {
            str = uuid.toString();
        }
        biy.mo15118k(str);
    }
}
