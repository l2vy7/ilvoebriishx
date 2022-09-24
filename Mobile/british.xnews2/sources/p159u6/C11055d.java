package p159u6;

import p148s6.C6073k;

/* renamed from: u6.d */
/* compiled from: Longs */
public final class C11055d {
    /* renamed from: a */
    public static int m49466a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m49467b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static long m49468c(long... jArr) {
        C6073k.m26681d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }
}
