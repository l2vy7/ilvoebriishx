package com.startapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.startapp.w */
/* compiled from: Sta */
public class C12401w {

    /* renamed from: p */
    private static final String f54938p = "w";

    /* renamed from: q */
    private static final boolean f54939q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final short f54940r;

    /* renamed from: s */
    private static final int f54941s = 7;

    /* renamed from: t */
    private static final int f54942t = 16;

    /* renamed from: u */
    private static final int f54943u = 64;

    /* renamed from: v */
    private static final short f54944v = 30583;

    /* renamed from: a */
    private InetAddress f54945a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12449y7 f54946b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f54947c;

    /* renamed from: d */
    private int f54948d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f54949e;

    /* renamed from: f */
    private C12425x3 f54950f;

    /* renamed from: g */
    private short f54951g = 1;

    /* renamed from: h */
    private short f54952h = f54944v;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f54953i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f54954j = false;

    /* renamed from: k */
    private int f54955k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f54956l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f54957m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f54958n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public SparseArray<Long> f54959o;

    /* renamed from: com.startapp.w$a */
    /* compiled from: Sta */
    public class C12402a extends Thread {

        /* renamed from: a */
        private StructPollfd[] f54960a;

        public C12402a(StructPollfd[] structPollfdArr) {
            this.f54960a = structPollfdArr;
        }

        public void run() {
            StructPollfd structPollfd = this.f54960a[0];
            FileDescriptor fileDescriptor = structPollfd.fd;
            int a = C12401w.this.f54956l;
            byte[] bArr = new byte[a];
            int i = 0;
            while (C12401w.this.f54954j && !C12401w.this.f54953i && C12401w.this.f54957m < C12401w.this.f54949e) {
                try {
                    int poll = Os.poll(this.f54960a, C12401w.this.f54947c);
                    if (!C12401w.this.f54953i) {
                        if (poll >= 0 && structPollfd.revents == C12401w.f54940r) {
                            structPollfd.revents = C12401w.f54940r;
                            Os.recvfrom(fileDescriptor, bArr, 0, a, 64, (InetSocketAddress) null);
                            int hashCode = Arrays.hashCode(C12401w.m53596b(bArr));
                            Long l = (Long) C12401w.this.f54959o.get(hashCode);
                            if (l != null) {
                                C12401w.this.f54959o.remove(hashCode);
                                long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                                int i2 = i + 1;
                                try {
                                    C12401w.this.f54946b.mo45427a(i, SystemClock.elapsedRealtime() - C12401w.this.f54958n, elapsedRealtime);
                                    C12401w.m53600f(C12401w.this);
                                    i = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    i = i2;
                                    C12356u2.m53522a(th);
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C12356u2.m53522a(th);
                }
            }
        }
    }

    static {
        int i = OsConstants.POLLIN;
        if (i == 0) {
            i = 1;
        }
        f54940r = (short) i;
    }

    public C12401w(InetAddress inetAddress, int i, int i2, int i3, int i4) {
        this.f54945a = inetAddress;
        this.f54947c = i3;
        this.f54949e = i;
        this.f54948d = i2;
        this.f54950f = new C12425x3(inetAddress instanceof Inet6Address ? C12425x3.f55111d : 8);
        this.f54955k = i4;
        this.f54956l = i4 + 8;
        this.f54959o = new SparseArray<>();
    }

    /* renamed from: f */
    public static /* synthetic */ int m53600f(C12401w wVar) {
        int i = wVar.f54957m;
        wVar.f54957m = i + 1;
        return i;
    }

    /* renamed from: b */
    public void mo46688b() {
        this.f54953i = true;
    }

    @TargetApi(21)
    /* renamed from: c */
    public void mo46689c() {
        int i;
        int i2;
        int i3;
        this.f54953i = false;
        if (this.f54945a instanceof Inet6Address) {
            i2 = OsConstants.AF_INET6;
            i = OsConstants.IPPROTO_ICMPV6;
        } else {
            i2 = OsConstants.AF_INET;
            i = OsConstants.IPPROTO_ICMP;
        }
        this.f54958n = SystemClock.elapsedRealtime();
        try {
            FileDescriptor socket = Os.socket(i2, OsConstants.SOCK_DGRAM, i);
            if (socket.valid()) {
                try {
                    m53593a(socket);
                    StructPollfd structPollfd = new StructPollfd();
                    structPollfd.fd = socket;
                    structPollfd.events = f54940r;
                    C12402a aVar = new C12402a(new StructPollfd[]{structPollfd});
                    this.f54954j = true;
                    this.f54958n = SystemClock.elapsedRealtime();
                    aVar.start();
                    i3 = 0;
                    while (true) {
                        if (i3 >= this.f54949e) {
                            break;
                        } else if (this.f54953i) {
                            break;
                        } else {
                            byte[] a = C12425x3.m53743a(this.f54955k);
                            C12425x3 x3Var = this.f54950f;
                            short s = this.f54951g;
                            this.f54951g = (short) (s + 1);
                            ByteBuffer a2 = x3Var.mo46807a(s, this.f54952h, a);
                            this.f54959o.put(Arrays.hashCode(a), Long.valueOf(SystemClock.elapsedRealtime()));
                            if (Os.sendto(socket, a2, 0, this.f54945a, 7) < 0) {
                                break;
                            }
                            if (i3 < this.f54949e - 1) {
                                try {
                                    Thread.sleep((long) this.f54948d);
                                } catch (Throwable th) {
                                    C12356u2.m53522a(th);
                                }
                            }
                            i3++;
                        }
                    }
                    this.f54954j = false;
                    if (aVar.isAlive()) {
                        aVar.join();
                    }
                    Os.close(socket);
                    this.f54954j = false;
                } catch (Throwable th2) {
                    Os.close(socket);
                    this.f54954j = false;
                    throw th2;
                }
            }
            if (!this.f54953i) {
                for (int i4 = this.f54957m; i4 < this.f54949e; i4++) {
                    this.f54946b.mo45427a(i4, SystemClock.elapsedRealtime() - this.f54958n, -1);
                }
            }
        } catch (Throwable th3) {
            C12356u2.m53522a(th3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m53596b(byte[] bArr) {
        return Arrays.copyOfRange(bArr, 8, bArr.length);
    }

    /* renamed from: a */
    public void mo46687a(short s) {
        this.f54952h = s;
    }

    /* renamed from: a */
    public void mo46686a(C12449y7 y7Var) {
        this.f54946b = y7Var;
    }

    /* renamed from: a */
    private void m53593a(FileDescriptor fileDescriptor) throws ErrnoException {
        if (Build.VERSION.SDK_INT >= 26) {
            Os.setsockoptInt(fileDescriptor, OsConstants.IPPROTO_IP, OsConstants.IP_TOS, 16);
            return;
        }
        Class<Os> cls = Os.class;
        try {
            Class cls2 = Integer.TYPE;
            cls.getMethod("setsockoptInt", new Class[]{FileDescriptor.class, cls2, cls2, cls2}).invoke((Object) null, new Object[]{fileDescriptor, Integer.valueOf(OsConstants.IPPROTO_IP), Integer.valueOf(OsConstants.IP_TOS), 16});
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
    }
}
