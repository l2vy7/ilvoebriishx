package com.appnext.base.moments.p031b;

import java.util.Calendar;
import java.util.Date;

/* renamed from: com.appnext.base.moments.b.d */
public final class C3139d {
    /* renamed from: a */
    public static Date m10616a(long j) {
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            return instance.getTime();
        } catch (Throwable unused) {
            return new Date();
        }
    }
}
