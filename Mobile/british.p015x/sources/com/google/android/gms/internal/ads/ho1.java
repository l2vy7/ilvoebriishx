package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ho1 extends ze1 {

    /* renamed from: c */
    public final ci1 f32792c;

    public ho1(ci1 ci1, int i, int i2) {
        super(m32906b(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.f32792c = ci1;
    }

    /* renamed from: a */
    public static ho1 m32905a(IOException iOException, ci1 ci1, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && h33.m32792a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new gn1(iOException, ci1);
        }
        return new ho1(iOException, ci1, i2, i);
    }

    /* renamed from: b */
    private static int m32906b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public ho1(IOException iOException, ci1 ci1, int i, int i2) {
        super((Throwable) iOException, m32906b(i, i2));
        this.f32792c = ci1;
    }

    public ho1(String str, ci1 ci1, int i, int i2) {
        super(str, m32906b(2001, 1));
        this.f32792c = ci1;
    }

    @Deprecated
    public ho1(String str, IOException iOException, ci1 ci1, int i) {
        this(str, iOException, ci1, 2000, 1);
    }

    public ho1(String str, IOException iOException, ci1 ci1, int i, int i2) {
        super(str, iOException, m32906b(i, 1));
        this.f32792c = ci1;
    }
}
