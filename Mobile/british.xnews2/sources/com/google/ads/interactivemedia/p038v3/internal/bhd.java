package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhd */
/* compiled from: IMASDK */
public final class bhd extends bfi<Date> {

    /* renamed from: a */
    public static final bfj f16343a = new bgr((short[]) null);

    /* renamed from: b */
    private final DateFormat f16344b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public final synchronized Date read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return new Date(this.f16344b.parse(biw.mo15092g()).getTime());
        } catch (ParseException e) {
            throw new bff((Throwable) e);
        }
    }

    /* renamed from: b */
    public final synchronized void write(biy biy, Date date) throws IOException {
        biy.mo15118k(date == null ? null : this.f16344b.format(date));
    }
}
