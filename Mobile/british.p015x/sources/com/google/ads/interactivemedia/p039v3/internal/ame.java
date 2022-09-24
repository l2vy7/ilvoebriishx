package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ame */
/* compiled from: IMASDK */
public final class ame {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f15276a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f15277b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f15278c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f15279d = 0;

    /* renamed from: e */
    private static final String f15280e = "time.android.com";

    /* renamed from: a */
    public static boolean m14133a() {
        boolean z;
        synchronized (f15277b) {
            z = f15278c;
        }
        return z;
    }

    /* renamed from: b */
    public static long m14134b() {
        long j;
        synchronized (f15277b) {
            j = f15278c ? f15279d : C6540C.TIME_UNSET;
        }
        return j;
    }

    /* renamed from: c */
    public static void m14135c(aki aki, amb amb) {
        if (m14133a()) {
            amb.mo13514a();
            return;
        }
        if (aki == null) {
            aki = new aki("SntpClient");
        }
        aki.mo13843e(new amd((byte[]) null), new amc(amb), 1);
    }

    /* renamed from: g */
    static /* synthetic */ long m14139g() throws IOException {
        String str;
        long j;
        DatagramSocket datagramSocket;
        synchronized (f15277b) {
            str = f15280e;
        }
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
            } else {
                long j2 = currentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                DatagramSocket datagramSocket3 = datagramSocket2;
                try {
                    bArr[41] = (byte) ((int) (j4 >> 16));
                    datagramSocket = datagramSocket3;
                } catch (Throwable th) {
                    th = th;
                    datagramSocket2 = datagramSocket3;
                    Throwable th2 = th;
                    try {
                        datagramSocket2.close();
                    } catch (Throwable th3) {
                        bej.m15774a(th2, th3);
                    }
                    throw th2;
                }
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                    datagramSocket2 = datagramSocket;
                } catch (Throwable th4) {
                    th = th4;
                    datagramSocket2 = datagramSocket;
                    Throwable th22 = th;
                    datagramSocket2.close();
                    throw th22;
                }
            }
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = j + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            int i = (b >> 6) & 3;
            byte b2 = b & 7;
            byte b3 = bArr[1] & 255;
            long j7 = m14142j(bArr, 24);
            long j8 = m14142j(bArr, 32);
            long j9 = m14142j(bArr, 40);
            if (i != 3) {
                if (b2 != 4) {
                    if (b2 != 5) {
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("SNTP: Untrusted mode: ");
                        sb.append(b2);
                        throw new IOException(sb.toString());
                    }
                }
                if (b3 == 0 || b3 > 15) {
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("SNTP: Untrusted stratum: ");
                    sb2.append(b3);
                    throw new IOException(sb2.toString());
                } else if (j9 != 0) {
                    long j10 = ((j8 - j7) + (j9 - j6)) / 2;
                    datagramSocket2.close();
                    return (j6 + j10) - elapsedRealtime2;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            } else {
                throw new IOException("SNTP: Unsynchronized server");
            }
        } catch (Throwable th5) {
            th = th5;
            Throwable th222 = th;
            datagramSocket2.close();
            throw th222;
        }
    }

    /* renamed from: j */
    private static long m14142j(byte[] bArr, int i) {
        long k = m14143k(bArr, i);
        long k2 = m14143k(bArr, i + 4);
        if (k == 0 && k2 == 0) {
            return 0;
        }
        return ((k - 2208988800L) * 1000) + ((k2 * 1000) / 4294967296L);
    }

    /* renamed from: k */
    private static long m14143k(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + C12425x3.f55111d;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + C12425x3.f55111d;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + C12425x3.f55111d;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + C12425x3.f55111d;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }
}
