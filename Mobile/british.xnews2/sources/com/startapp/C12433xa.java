package com.startapp;

import android.net.TrafficStats;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: com.startapp.xa */
/* compiled from: Sta */
public class C12433xa {

    /* renamed from: a */
    private static final String f55135a = "xa";

    /* renamed from: b */
    private static String[] f55136b = null;

    /* renamed from: c */
    private static String[] f55137c = null;

    /* renamed from: d */
    private static boolean f55138d = true;

    /* renamed from: e */
    private static Method f55139e;

    /* renamed from: f */
    private static Method f55140f;

    /* renamed from: g */
    private static Method f55141g;

    static {
        Class<String> cls = String.class;
        try {
            Method declaredMethod = TrafficStats.class.getDeclaredMethod("getRxBytes", new Class[]{cls});
            f55139e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            C12356u2.m53524b(th);
        }
        try {
            Method declaredMethod2 = TrafficStats.class.getDeclaredMethod("getTxBytes", new Class[]{cls});
            f55140f = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable th2) {
            C12356u2.m53524b(th2);
        }
        try {
            Method declaredMethod3 = TrafficStats.class.getDeclaredMethod("getMobileIfaces", new Class[0]);
            f55141g = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (Throwable th3) {
            C12356u2.m53524b(th3);
        }
    }

    /* renamed from: a */
    private static void m53756a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement != null && nextElement.getName().startsWith("eth")) {
                        String[] strArr = f55136b;
                        if (strArr != null && strArr.length > 0) {
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                if (nextElement.getName().equals(strArr[i])) {
                                    break;
                                }
                                i++;
                            }
                        }
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        boolean z = false;
                        if (inetAddresses != null) {
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress nextElement2 = inetAddresses.nextElement();
                                if (nextElement2 != null && nextElement2.isLinkLocalAddress() && !nextElement2.isLoopbackAddress()) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(C11926ga.m52349a(nextElement.getName()));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        } finally {
            f55137c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f55138d = false;
        }
    }

    /* renamed from: b */
    public static synchronized long m53757b() {
        long j;
        String[] strArr;
        synchronized (C12433xa.class) {
            j = 0;
            if (f55138d && ((strArr = f55137c) == null || strArr.length <= 0)) {
                m53756a();
            }
            String[] strArr2 = f55137c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String a : strArr2) {
                    long a2 = m53755a(a);
                    if (a2 > -1) {
                        j += a2;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    public static synchronized long m53759c() {
        long j;
        String[] strArr;
        synchronized (C12433xa.class) {
            j = 0;
            if (f55138d && ((strArr = f55137c) == null || strArr.length <= 0)) {
                m53756a();
            }
            String[] strArr2 = f55137c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String b : strArr2) {
                    long b2 = m53758b(b);
                    if (b2 > -1) {
                        j += b2;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: d */
    private static void m53761d() {
        Method method = f55141g;
        if (method != null) {
            try {
                String[] strArr = (String[]) method.invoke((Object) null, new Object[0]);
                if (strArr != null) {
                    f55136b = strArr;
                }
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
    }

    /* renamed from: e */
    public static synchronized long m53762e() {
        long j;
        synchronized (C12433xa.class) {
            try {
                j = TrafficStats.getMobileRxBytes();
            } catch (Throwable th) {
                C12356u2.m53522a(th);
                j = 0;
            }
            if (j <= 0) {
                String[] strArr = f55136b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c = m53760c("/sys/class/net/" + str + "/statistics/rx_bytes");
                        if (c > -1) {
                            j += c;
                        }
                    }
                }
            } else if (f55136b == null) {
                m53761d();
            }
        }
        return j;
    }

    /* renamed from: f */
    public static synchronized long m53763f() {
        long j;
        synchronized (C12433xa.class) {
            try {
                j = TrafficStats.getMobileTxBytes();
            } catch (Throwable th) {
                C12356u2.m53522a(th);
                j = 0;
            }
            if (j <= 0) {
                String[] strArr = f55136b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c = m53760c("/sys/class/net/" + str + "/statistics/tx_bytes");
                        if (c > -1) {
                            j += c;
                        }
                    }
                }
            } else if (f55136b == null) {
                m53761d();
            }
        }
        return j;
    }

    /* renamed from: g */
    public static synchronized long m53764g() {
        long totalRxBytes;
        synchronized (C12433xa.class) {
            totalRxBytes = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
        }
        return totalRxBytes;
    }

    /* renamed from: h */
    public static synchronized long m53765h() {
        long totalTxBytes;
        synchronized (C12433xa.class) {
            totalTxBytes = TrafficStats.getTotalTxBytes() - TrafficStats.getMobileTxBytes();
        }
        return totalTxBytes;
    }

    /* renamed from: b */
    public static long m53758b(String str) {
        Method method = f55140f;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
        return m53760c("/sys/class/net/" + str + "/statistics/tx_bytes");
    }

    /* renamed from: c */
    private static long m53760c(String str) {
        String[] a = C12130p9.m52744a(str);
        if (a.length > 0) {
            return Long.parseLong(a[0]);
        }
        return -1;
    }

    /* renamed from: a */
    public static long m53755a(String str) {
        Method method = f55139e;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
        return m53760c("/sys/class/net/" + str + "/statistics/rx_bytes");
    }
}
