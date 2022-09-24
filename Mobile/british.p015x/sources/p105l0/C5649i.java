package p105l0;

import java.io.PrintWriter;

/* renamed from: l0.i */
/* compiled from: TimeUtils */
public final class C5649i {

    /* renamed from: a */
    private static final Object f24215a = new Object();

    /* renamed from: b */
    private static char[] f24216b = new char[24];

    /* renamed from: a */
    private static int m24966a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m24967b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m24969d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m24968c(long j, PrintWriter printWriter) {
        m24969d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m24969d(long j, PrintWriter printWriter, int i) {
        synchronized (f24215a) {
            printWriter.print(new String(f24216b, 0, m24970e(j, i)));
        }
    }

    /* renamed from: e */
    private static int m24970e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f24216b.length < i7) {
            f24216b = new char[i7];
        }
        char[] cArr = f24216b;
        if (j2 == 0) {
            int i8 = i7 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m24966a(i2, 1, false, 0);
            int a2 = a + m24966a(i3, 1, a > 0, 2);
            int a3 = a2 + m24966a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m24966a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m24966a(i9, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i11 = i6 + 1;
        boolean z = i7 != 0;
        int i12 = i11;
        int f = m24971f(cArr, i2, 'd', i11, false, 0);
        int f2 = m24971f(cArr, i3, 'h', f, f != i12, z ? 2 : 0);
        int f3 = m24971f(cArr, i5, 'm', f2, f2 != i12, z ? 2 : 0);
        int f4 = m24971f(cArr, i4, 's', f3, f3 != i12, z ? 2 : 0);
        int f5 = m24971f(cArr, i9, 'm', f4, true, (!z || f4 == i12) ? 0 : 3);
        cArr[f5] = 's';
        return f5 + 1;
    }

    /* renamed from: f */
    private static int m24971f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
