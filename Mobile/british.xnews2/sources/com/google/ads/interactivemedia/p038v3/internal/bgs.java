package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgs */
/* compiled from: IMASDK */
public final class bgs extends bfi<Date> {

    /* renamed from: a */
    public static final bfj f16306a = new bgr();

    /* renamed from: b */
    private final List<DateFormat> f16307b;

    public bgs() {
        ArrayList arrayList = new ArrayList();
        this.f16307b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (bfy.m15842b()) {
            arrayList.add(aru.m14641g(2, 2));
        }
    }

    /* renamed from: b */
    private final synchronized Date m15864b(String str) {
        for (DateFormat parse : this.f16307b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return biq.m15929a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new bff(str, e);
        }
    }

    /* renamed from: a */
    public final synchronized void write(biy biy, Date date) throws IOException {
        if (date == null) {
            biy.mo15114g();
        } else {
            biy.mo15118k(this.f16307b.get(0).format(date));
        }
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return m15864b(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }
}
