package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhz */
/* compiled from: IMASDK */
final class bhz extends bfi<Calendar> {
    bhz() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        biw.mo15087c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (biw.mo15101p() != 4) {
            String f = biw.mo15091f();
            int l = biw.mo15097l();
            if ("year".equals(f)) {
                i = l;
            } else if ("month".equals(f)) {
                i2 = l;
            } else if ("dayOfMonth".equals(f)) {
                i3 = l;
            } else if ("hourOfDay".equals(f)) {
                i4 = l;
            } else if ("minute".equals(f)) {
                i5 = l;
            } else if ("second".equals(f)) {
                i6 = l;
            }
        }
        biw.mo15089d();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            biy.mo15114g();
            return;
        }
        biy.mo15108c();
        biy.mo15112f("year");
        biy.mo15115h((long) calendar.get(1));
        biy.mo15112f("month");
        biy.mo15115h((long) calendar.get(2));
        biy.mo15112f("dayOfMonth");
        biy.mo15115h((long) calendar.get(5));
        biy.mo15112f("hourOfDay");
        biy.mo15115h((long) calendar.get(11));
        biy.mo15112f("minute");
        biy.mo15115h((long) calendar.get(12));
        biy.mo15112f("second");
        biy.mo15115h((long) calendar.get(13));
        biy.mo15111e();
    }
}
