package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhy */
/* compiled from: IMASDK */
final class bhy extends bfi<Timestamp> {

    /* renamed from: a */
    final /* synthetic */ bfi f16361a;

    bhy(bfi bfi) {
        this.f16361a = bfi;
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        Date date = (Date) this.f16361a.read(biw);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        this.f16361a.write(biy, (Timestamp) obj);
    }
}
