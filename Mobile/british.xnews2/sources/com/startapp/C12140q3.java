package com.startapp;

import com.google.android.exoplayer2.C6540C;
import com.startapp.networkTest.data.TimeInfo;

/* renamed from: com.startapp.q3 */
/* compiled from: Sta */
public class C12140q3 {
    /* renamed from: a */
    public static String m52770a(TimeInfo timeInfo, String str) {
        byte[] bArr;
        if (timeInfo == null || str == null || str.length() == 0) {
            return null;
        }
        StringBuilder a = C12458z0.m53804a(str);
        a.append(timeInfo.TimestampMillis);
        try {
            bArr = C12111o9.m52705a(a.toString().getBytes(C6540C.UTF8_NAME));
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return C11813c2.m52086a(bArr);
    }
}
