package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhe */
/* compiled from: IMASDK */
public final class bhe extends bfi<Time> {

    /* renamed from: a */
    public static final bfj f16345a = new bgr((int[]) null);

    /* renamed from: b */
    private final DateFormat f16346b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public final synchronized Time read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return new Time(this.f16346b.parse(biw.mo15092g()).getTime());
        } catch (ParseException e) {
            throw new bff((Throwable) e);
        }
    }

    /* renamed from: b */
    public final synchronized void write(biy biy, Time time) throws IOException {
        biy.mo15118k(time == null ? null : this.f16346b.format(time));
    }
}
