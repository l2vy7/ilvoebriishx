package com.startapp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.enums.LtrCriteriaTypes;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.P3TestResult;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.networkTest.speedtest.SpeedtestEngineStatus;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.startapp.i0 */
/* compiled from: Sta */
public class C11947i0 {

    /* renamed from: s */
    public static final String f53049s = "i0";

    /* renamed from: t */
    private static final boolean f53050t = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11771a4 f53051a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f53052b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11849d8 f53053c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11891ed f53054d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LocationController f53055e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12440y0 f53056f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public P3TestResult f53057g;

    /* renamed from: h */
    private ArrayList<C11825c8> f53058h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f53059i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12408w4 f53060j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f53061k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f53062l = "";

    /* renamed from: m */
    private String f53063m = "";

    /* renamed from: n */
    private String f53064n = "";

    /* renamed from: o */
    private String f53065o = "";

    /* renamed from: p */
    private String f53066p = "";

    /* renamed from: q */
    private String f53067q = "";
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f53068r = "";

    /* renamed from: com.startapp.i0$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C11948a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.LtrCriteriaTypes[] r0 = com.startapp.networkTest.enums.LtrCriteriaTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53069a = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53069a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.NoChange     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53069a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.Random     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53069a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.FullSuccessful     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53069a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.TotalTests     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11947i0.C11948a.<clinit>():void");
        }
    }

    public C11947i0(C11771a4 a4Var, Context context) {
        if (a4Var != null) {
            this.f53051a = a4Var;
            this.f53052b = context;
            C12341t4 b = C12385v4.m53561b();
            this.f53059i = b.PROJECT_ID();
            this.f53060j = new C12408w4(this.f53052b);
            m52402a(context, b);
            return;
        }
        throw new IllegalArgumentException("ISpeedtestListener is NULL");
    }

    /* renamed from: com.startapp.i0$b */
    /* compiled from: Sta */
    public class C11949b extends AsyncTask<Void, Void, LatencyResult> {

        /* renamed from: a */
        private String f53070a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f53071b;

        /* renamed from: c */
        private int f53072c;

        /* renamed from: d */
        private int f53073d;

        /* renamed from: e */
        private int f53074e;

        /* renamed from: f */
        private String[] f53075f;

        /* renamed from: g */
        private LtrCriteriaTypes f53076g;

        /* renamed from: h */
        private boolean f53077h;

        /* renamed from: com.startapp.i0$b$a */
        /* compiled from: Sta */
        public class C11950a implements C12449y7 {

            /* renamed from: a */
            public final /* synthetic */ boolean[] f53079a;

            /* renamed from: b */
            public final /* synthetic */ int[] f53080b;

            /* renamed from: c */
            public final /* synthetic */ ArrayList f53081c;

            /* renamed from: d */
            public final /* synthetic */ C12401w f53082d;

            public C11950a(boolean[] zArr, int[] iArr, ArrayList arrayList, C12401w wVar) {
                this.f53079a = zArr;
                this.f53080b = iArr;
                this.f53081c = arrayList;
                this.f53082d = wVar;
            }

            /* renamed from: a */
            public void mo45427a(int i, long j, long j2) {
                int i2 = 0;
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i3 >= 0) {
                    this.f53079a[0] = true;
                    int[] iArr = this.f53080b;
                    iArr[0] = iArr[0] + 1;
                }
                int i4 = (int) j2;
                this.f53081c.add(C11949b.this.m52427a(j, i4));
                if (C11947i0.this.f53051a != null) {
                    C11771a4 a = C11947i0.this.f53051a;
                    float a2 = ((float) i) / ((float) C11949b.this.f53071b);
                    if (i3 >= 0) {
                        i2 = i4;
                    }
                    a.mo45082b(a2, i2);
                }
                if (C11949b.this.isCancelled()) {
                    this.f53082d.mo46688b();
                }
            }
        }

        /* renamed from: com.startapp.i0$b$b */
        /* compiled from: Sta */
        public class C11951b implements Comparator<C12447y5> {
            public C11951b() {
            }

            /* renamed from: a */
            public int compare(C12447y5 y5Var, C12447y5 y5Var2) {
                return y5Var.successfulTests - y5Var2.successfulTests;
            }
        }

        /* renamed from: com.startapp.i0$b$c */
        /* compiled from: Sta */
        public class C11952c implements Comparator<C12447y5> {
            public C11952c() {
            }

            /* renamed from: a */
            public int compare(C12447y5 y5Var, C12447y5 y5Var2) {
                return y5Var.totalTests - y5Var2.totalTests;
            }
        }

        public C11949b(String str, int i, int i2, int i3, int i4, boolean z) {
            this.f53070a = str;
            this.f53071b = i;
            this.f53072c = i2;
            this.f53073d = i3;
            this.f53074e = i4;
            this.f53077h = z;
            if (i2 < 200) {
                this.f53072c = 200;
            }
            if (C11947i0.this.f53051a != null) {
                C11947i0.this.f53051a.mo45081a(SpeedtestEngineStatus.CONNECT, SpeedtestEngineError.OK, (long) (this.f53071b * this.f53073d));
            }
            C12408w4 c = C12385v4.m53562c();
            this.f53075f = c.mo46764k();
            this.f53076g = LtrCriteriaTypes.valueOf(c.mo46759j());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bd, code lost:
            if (r1 == 7) goto L_0x02bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0379, code lost:
            if (r1 == null) goto L_0x0382;
         */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x02bc A[Catch:{ all -> 0x02fb, all -> 0x031d }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02e2 A[Catch:{ all -> 0x02fb, all -> 0x031d }] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x02f8 A[Catch:{ all -> 0x02fb, all -> 0x031d }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0370 A[SYNTHETIC, Splitter:B:173:0x0370] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0384  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x03b8  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x044b  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0452  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x047a A[LOOP:0: B:8:0x0028->B:192:0x047a, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x0473 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0157 A[SYNTHETIC, Splitter:B:24:0x0157] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0221 A[ADDED_TO_REGION, Catch:{ all -> 0x0342 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0234 A[SYNTHETIC, Splitter:B:76:0x0234] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0262 A[Catch:{ all -> 0x024f, all -> 0x031f }] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x026a A[Catch:{ all -> 0x024f, all -> 0x031f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.startapp.networkTest.results.LatencyResult doInBackground(java.lang.Void... r31) {
            /*
                r30 = this;
                r7 = r30
                java.lang.String r8 = "ping6"
                boolean r0 = r30.isCancelled()
                r9 = 0
                if (r0 == 0) goto L_0x000c
                return r9
            L_0x000c:
                boolean r0 = r7.f53077h
                if (r0 == 0) goto L_0x001b
                java.lang.String[] r0 = r7.f53075f
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = r7.f53076g
                java.lang.String r2 = r7.f53070a
                java.util.List r0 = r7.m52429a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r1, (java.lang.String) r2)
                goto L_0x0025
            L_0x001b:
                java.lang.String[] r0 = r7.f53075f
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                java.lang.String r2 = r7.f53070a
                java.util.List r0 = r7.m52429a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r1, (java.lang.String) r2)
            L_0x0025:
                r10 = r0
                r0 = r9
                r12 = 0
            L_0x0028:
                int r1 = r10.size()
                if (r12 >= r1) goto L_0x0497
                long r13 = android.os.SystemClock.elapsedRealtime()
                long r15 = android.os.SystemClock.uptimeMillis()
                java.lang.Object r0 = r10.get(r12)
                r6 = r0
                com.startapp.y5 r6 = (com.startapp.C12447y5) r6
                int r0 = r6.totalTests
                r5 = 1
                int r0 = r0 + r5
                r6.totalTests = r0
                java.lang.String r0 = r6.address
                r7.f53070a = r0
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                com.startapp.networkTest.results.LatencyResult r3 = new com.startapp.networkTest.results.LatencyResult
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                java.lang.String r0 = r0.f53059i
                com.startapp.i0 r1 = com.startapp.C11947i0.this
                com.startapp.w4 r1 = r1.f53060j
                java.lang.String r1 = r1.mo46775p()
                r3.<init>(r0, r1)
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.y0 r0 = r0.f53056f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.mo46829a()
                r3.BatteryInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f53055e
                com.startapp.networkTest.data.LocationInfo r0 = r0.mo45580c()
                r3.LocationInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                android.content.Context r0 = r0.f53052b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.C12042m2.m52586h(r0)
                r3.ScreenStateOnStart = r0
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.IPING
                r3.MeasurementType = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.C12112oa.m52717e()
                r3.TimeInfoOnStart = r0
                java.lang.String r1 = r3.GUID
                java.lang.String r0 = com.startapp.C12140q3.m52770a(r0, r1)
                r3.LtrId = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                android.content.Context r0 = r0.f53052b
                com.startapp.b6 r0 = com.startapp.C12042m2.m52583e(r0)
                r3.MemoryInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.d8 r0 = r0.f53053c
                com.startapp.networkTest.data.RadioInfo r0 = r0.mo45255h()
                r3.RadioInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.ed r0 = r0.f53054d
                com.startapp.networkTest.data.WifiInfo r0 = r0.mo45333c()
                r3.WifiInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.ed r0 = r0.f53054d
                com.startapp.wa r0 = com.startapp.C12042m2.m52574a((com.startapp.C11891ed) r0)
                r3.TrafficInfoOnStart = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                android.content.Context r0 = r0.f53052b
                com.startapp.n2 r0 = com.startapp.C12042m2.m52578b((android.content.Context) r0)
                r3.DeviceInfo = r0
                int r0 = com.startapp.networkTest.startapp.NetworkTester.isAppInForeground()
                r3.IsAppInForeground = r0
                int r0 = r7.f53071b
                r3.Pings = r0
                int r0 = r7.f53072c
                r3.Pause = r0
                java.lang.String r1 = r7.f53070a
                r3.Server = r1
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv4
                r3.IpVersion = r0
                java.lang.String r2 = "ping"
                java.net.InetAddress r9 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x00ff }
                java.lang.String r1 = r9.getHostAddress()     // Catch:{ UnknownHostException -> 0x00fd }
                boolean r0 = r9 instanceof java.net.Inet6Address     // Catch:{ UnknownHostException -> 0x00fd }
                if (r0 == 0) goto L_0x0104
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv6     // Catch:{ UnknownHostException -> 0x00fd }
                r3.IpVersion = r0     // Catch:{ UnknownHostException -> 0x00fd }
                r2 = r8
                goto L_0x0104
            L_0x00fd:
                r0 = move-exception
                goto L_0x0101
            L_0x00ff:
                r0 = move-exception
                r9 = 0
            L_0x0101:
                com.startapp.C12356u2.m53524b(r0)
            L_0x0104:
                r18 = r9
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r9 = " -i "
                r0.append(r9)
                int r9 = r7.f53072c
                r23 = r12
                double r11 = (double) r9
                r19 = 4652007308841189376(0x408f400000000000, double:1000.0)
                java.lang.Double.isNaN(r11)
                double r11 = r11 / r19
                r0.append(r11)
                java.lang.String r9 = " -W "
                r0.append(r9)
                int r9 = r7.f53073d
                double r11 = (double) r9
                java.lang.Double.isNaN(r11)
                double r11 = r11 / r19
                r0.append(r11)
                java.lang.String r9 = " -c "
                r0.append(r9)
                int r9 = r7.f53071b
                r0.append(r9)
                java.lang.String r9 = " -s "
                r0.append(r9)
                int r9 = r7.f53074e
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                boolean r0 = r2.equals(r8)
                r2 = 21
                java.lang.String r11 = ""
                if (r0 == 0) goto L_0x01e5
                com.startapp.i0 r0 = com.startapp.C11947i0.this     // Catch:{ all -> 0x01de }
                android.content.Context r0 = r0.f53052b     // Catch:{ all -> 0x01de }
                java.lang.String r12 = "connectivity"
                java.lang.Object r0 = r0.getSystemService(r12)     // Catch:{ all -> 0x01de }
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x01de }
                if (r0 == 0) goto L_0x01bc
                com.startapp.i0 r12 = com.startapp.C11947i0.this     // Catch:{ all -> 0x01de }
                android.content.Context r12 = r12.f53052b     // Catch:{ all -> 0x01de }
                java.lang.String r5 = "android.permission.ACCESS_NETWORK_STATE"
                int r5 = r12.checkCallingOrSelfPermission(r5)     // Catch:{ all -> 0x01de }
                if (r5 != 0) goto L_0x01bc
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01de }
                r12 = 23
                if (r5 < r12) goto L_0x018c
                android.net.Network r5 = r0.getActiveNetwork()     // Catch:{ all -> 0x01de }
                android.net.LinkProperties r0 = r0.getLinkProperties(r5)     // Catch:{ all -> 0x01de }
                if (r0 == 0) goto L_0x01bc
                java.lang.String r0 = r0.getInterfaceName()     // Catch:{ all -> 0x01de }
                r24 = r6
                goto L_0x01bf
            L_0x018c:
                if (r5 < r2) goto L_0x01bc
                android.net.Network[] r5 = r0.getAllNetworks()     // Catch:{ all -> 0x01de }
                int r12 = r5.length     // Catch:{ all -> 0x01de }
                r17 = r11
                r2 = 0
            L_0x0196:
                if (r2 >= r12) goto L_0x01b7
                r24 = r6
                r6 = r5[r2]     // Catch:{ all -> 0x01dc }
                android.net.NetworkInfo r20 = r0.getNetworkInfo(r6)     // Catch:{ all -> 0x01dc }
                if (r20 == 0) goto L_0x01b2
                boolean r20 = r20.isConnected()     // Catch:{ all -> 0x01dc }
                if (r20 == 0) goto L_0x01b2
                android.net.LinkProperties r6 = r0.getLinkProperties(r6)     // Catch:{ all -> 0x01dc }
                if (r6 == 0) goto L_0x01b2
                java.lang.String r17 = r6.getInterfaceName()     // Catch:{ all -> 0x01dc }
            L_0x01b2:
                int r2 = r2 + 1
                r6 = r24
                goto L_0x0196
            L_0x01b7:
                r24 = r6
                r0 = r17
                goto L_0x01bf
            L_0x01bc:
                r24 = r6
                r0 = r11
            L_0x01bf:
                if (r0 == 0) goto L_0x01e7
                boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x01dc }
                if (r2 != 0) goto L_0x01e7
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
                r2.<init>()     // Catch:{ all -> 0x01dc }
                r2.append(r9)     // Catch:{ all -> 0x01dc }
                java.lang.String r5 = " -I "
                r2.append(r5)     // Catch:{ all -> 0x01dc }
                r2.append(r0)     // Catch:{ all -> 0x01dc }
                java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x01dc }
                goto L_0x01e7
            L_0x01dc:
                r0 = move-exception
                goto L_0x01e1
            L_0x01de:
                r0 = move-exception
                r24 = r6
            L_0x01e1:
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)
                goto L_0x01e7
            L_0x01e5:
                r24 = r6
            L_0x01e7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                java.lang.String r2 = " "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                boolean[] r9 = new boolean[r1]
                r5 = 0
                r9[r5] = r5
                int[] r12 = new int[r1]
                r12[r5] = r5
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x035e }
                java.lang.Process r1 = r1.exec(r0)     // Catch:{ all -> 0x035e }
                java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0352 }
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0352 }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x0352 }
                r0.<init>(r6)     // Catch:{ all -> 0x0352 }
                r5.<init>(r0)     // Catch:{ all -> 0x0352 }
                java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x0342 }
                if (r0 != 0) goto L_0x022b
                if (r18 == 0) goto L_0x022b
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0342 }
                r6 = 21
                if (r0 < r6) goto L_0x022b
                r6 = 1
                goto L_0x022c
            L_0x022b:
                r6 = 0
            L_0x022c:
                com.startapp.i0 r0 = com.startapp.C11947i0.this     // Catch:{ all -> 0x0334 }
                com.startapp.a4 r0 = r0.f53051a     // Catch:{ all -> 0x0334 }
                if (r0 == 0) goto L_0x0262
                com.startapp.i0 r0 = com.startapp.C11947i0.this     // Catch:{ all -> 0x0253 }
                com.startapp.a4 r0 = r0.f53051a     // Catch:{ all -> 0x0253 }
                r25 = r8
                com.startapp.networkTest.speedtest.SpeedtestEngineStatus r8 = com.startapp.networkTest.speedtest.SpeedtestEngineStatus.PING     // Catch:{ all -> 0x0251 }
                r26 = r10
                com.startapp.networkTest.speedtest.SpeedtestEngineError r10 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK     // Catch:{ all -> 0x024f }
                r27 = r13
                int r13 = r7.f53071b     // Catch:{ all -> 0x031f }
                int r14 = r7.f53073d     // Catch:{ all -> 0x031f }
                int r13 = r13 * r14
                long r13 = (long) r13     // Catch:{ all -> 0x031f }
                r0.mo45081a(r8, r10, r13)     // Catch:{ all -> 0x031f }
                goto L_0x0268
            L_0x024f:
                r0 = move-exception
                goto L_0x0258
            L_0x0251:
                r0 = move-exception
                goto L_0x0256
            L_0x0253:
                r0 = move-exception
                r25 = r8
            L_0x0256:
                r26 = r10
            L_0x0258:
                r27 = r13
            L_0x025a:
                r19 = r1
                r21 = r6
                r29 = r9
                goto L_0x034f
            L_0x0262:
                r25 = r8
                r26 = r10
                r27 = r13
            L_0x0268:
                if (r6 != 0) goto L_0x0322
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x031f }
                r0 = 0
            L_0x026f:
                int r8 = r7.f53071b     // Catch:{ all -> 0x031f }
                if (r0 >= r8) goto L_0x0322
                boolean r8 = r30.isCancelled()     // Catch:{ all -> 0x031f }
                if (r8 == 0) goto L_0x028a
                r5.close()     // Catch:{ all -> 0x031f }
                r5.close()     // Catch:{ all -> 0x0280 }
                goto L_0x0285
            L_0x0280:
                r0 = move-exception
                r2 = r0
                com.startapp.C12356u2.m53524b(r2)
            L_0x0285:
                r1.destroy()
                r8 = 0
                return r8
            L_0x028a:
                r8 = 0
                java.lang.String r10 = r5.readLine()     // Catch:{ all -> 0x031f }
                long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x031f }
                r29 = r9
                long r8 = r19 - r13
                r17 = -1
                if (r10 == 0) goto L_0x0303
                int r19 = r10.length()     // Catch:{ all -> 0x02fd }
                if (r19 <= 0) goto L_0x0303
                java.lang.String[] r10 = r10.split(r2)     // Catch:{ all -> 0x02fd }
                r19 = r1
                int r1 = r10.length     // Catch:{ all -> 0x02fb }
                r20 = r2
                r2 = 8
                if (r1 == r2) goto L_0x02b6
                int r1 = r10.length     // Catch:{ all -> 0x02fb }
                r2 = 9
                if (r1 != r2) goto L_0x02b4
                goto L_0x02b6
            L_0x02b4:
                r1 = -1
                goto L_0x02b9
            L_0x02b6:
                int r1 = r10.length     // Catch:{ all -> 0x02fb }
                int r1 = r1 + -2
            L_0x02b9:
                r2 = 6
                if (r1 == r2) goto L_0x02bf
                r2 = 7
                if (r1 != r2) goto L_0x0307
            L_0x02bf:
                r1 = r10[r1]     // Catch:{ all -> 0x02fb }
                java.lang.String r2 = "time="
                java.lang.String r1 = r1.replace(r2, r11)     // Catch:{ all -> 0x02fb }
                double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ all -> 0x02fb }
                long r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x02fb }
                int r2 = (int) r1     // Catch:{ all -> 0x02fb }
                r1 = 0
                r10 = 1
                r29[r1] = r10     // Catch:{ all -> 0x02fb }
                r17 = r12[r1]     // Catch:{ all -> 0x02fb }
                int r17 = r17 + 1
                r12[r1] = r17     // Catch:{ all -> 0x02fb }
                com.startapp.i0 r1 = com.startapp.C11947i0.this     // Catch:{ all -> 0x02fb }
                com.startapp.a4 r1 = r1.f53051a     // Catch:{ all -> 0x02fb }
                if (r1 == 0) goto L_0x02f8
                com.startapp.i0 r1 = com.startapp.C11947i0.this     // Catch:{ all -> 0x02fb }
                com.startapp.a4 r1 = r1.f53051a     // Catch:{ all -> 0x02fb }
                float r10 = (float) r0
                r21 = r6
                int r6 = r7.f53071b     // Catch:{ all -> 0x031d }
                float r6 = (float) r6     // Catch:{ all -> 0x031d }
                float r10 = r10 / r6
                if (r2 >= 0) goto L_0x02f3
                r6 = 0
                goto L_0x02f4
            L_0x02f3:
                r6 = r2
            L_0x02f4:
                r1.mo45082b(r10, r6)     // Catch:{ all -> 0x031d }
                goto L_0x030a
            L_0x02f8:
                r21 = r6
                goto L_0x030a
            L_0x02fb:
                r0 = move-exception
                goto L_0x0300
            L_0x02fd:
                r0 = move-exception
                r19 = r1
            L_0x0300:
                r21 = r6
                goto L_0x034f
            L_0x0303:
                r19 = r1
                r20 = r2
            L_0x0307:
                r21 = r6
                r2 = -1
            L_0x030a:
                com.startapp.networkTest.results.speedtest.MeasurementPointLatency r1 = r7.m52427a(r8, r2)     // Catch:{ all -> 0x031d }
                r4.add(r1)     // Catch:{ all -> 0x031d }
                int r0 = r0 + 1
                r1 = r19
                r2 = r20
                r6 = r21
                r9 = r29
                goto L_0x026f
            L_0x031d:
                r0 = move-exception
                goto L_0x034f
            L_0x031f:
                r0 = move-exception
                goto L_0x025a
            L_0x0322:
                r19 = r1
                r21 = r6
                r29 = r9
                r5.close()     // Catch:{ all -> 0x032c }
                goto L_0x0331
            L_0x032c:
                r0 = move-exception
                r1 = r0
                com.startapp.C12356u2.m53524b(r1)
            L_0x0331:
                r1 = r19
                goto L_0x037b
            L_0x0334:
                r0 = move-exception
                r19 = r1
                r21 = r6
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                goto L_0x034f
            L_0x0342:
                r0 = move-exception
                r19 = r1
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                r21 = 0
            L_0x034f:
                r1 = r19
                goto L_0x036b
            L_0x0352:
                r0 = move-exception
                r19 = r1
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                goto L_0x0368
            L_0x035e:
                r0 = move-exception
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                r1 = 0
            L_0x0368:
                r5 = 0
                r21 = 0
            L_0x036b:
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0484 }
                if (r5 == 0) goto L_0x0379
                r5.close()     // Catch:{ all -> 0x0374 }
                goto L_0x0379
            L_0x0374:
                r0 = move-exception
                r2 = r0
                com.startapp.C12356u2.m53524b(r2)
            L_0x0379:
                if (r1 == 0) goto L_0x0382
            L_0x037b:
                r6 = r21
                r1.destroy()
                r21 = r6
            L_0x0382:
                if (r21 == 0) goto L_0x03b8
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.APIIPING
                r3.MeasurementType = r0
                com.startapp.w r0 = new com.startapp.w
                int r1 = r7.f53071b
                int r2 = r7.f53072c
                int r5 = r7.f53073d
                int r6 = r7.f53074e
                r17 = r0
                r19 = r1
                r20 = r2
                r21 = r5
                r22 = r6
                r17.<init>(r18, r19, r20, r21, r22)
                com.startapp.i0$b$a r8 = new com.startapp.i0$b$a
                r1 = r8
                r2 = r30
                r9 = r3
                r3 = r29
                r10 = r4
                r4 = r12
                r11 = 1
                r5 = r10
                r13 = r24
                r6 = r0
                r1.<init>(r3, r4, r5, r6)
                r0.mo46686a((com.startapp.C12449y7) r8)
                r0.mo46689c()
                goto L_0x03bd
            L_0x03b8:
                r9 = r3
                r10 = r4
                r13 = r24
                r11 = 1
            L_0x03bd:
                com.startapp.networkTest.enums.SpeedtestEndStates r0 = com.startapp.networkTest.enums.SpeedtestEndStates.Finish
                r9.TestEndState = r0
                com.startapp.networkTest.speedtest.SpeedtestEngineError r0 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK
                r9.TestErrorReason = r0
                r1 = 0
                boolean r0 = r29[r1]
                r9.Success = r0
                r0 = r12[r1]
                r9.SuccessfulPings = r0
                int r0 = r10.size()
                if (r0 <= 0) goto L_0x03dc
                r9.calculateStats(r10)
                java.util.ArrayList<com.startapp.networkTest.results.speedtest.MeasurementPointLatency> r0 = r9.MeasurementPoints
                r9.calcRatShare(r0)
            L_0x03dc:
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.y0 r0 = r0.f53056f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.mo46829a()
                r9.BatteryInfoOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f53055e
                com.startapp.networkTest.data.LocationInfo r0 = r0.mo45580c()
                r9.LocationInfoOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                android.content.Context r0 = r0.f53052b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.C12042m2.m52586h(r0)
                r9.ScreenStateOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                android.content.Context r0 = r0.f53052b
                com.startapp.b6 r0 = com.startapp.C12042m2.m52583e(r0)
                r9.MemoryInfoOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.d8 r0 = r0.f53053c
                com.startapp.networkTest.data.RadioInfo r0 = r0.mo45255h()
                r9.RadioInfoOnEnd = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.C12112oa.m52717e()
                r9.TimeInfoOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.ed r0 = r0.f53054d
                com.startapp.networkTest.data.WifiInfo r0 = r0.mo45333c()
                r9.WifiInfoOnEnd = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                com.startapp.ed r0 = r0.f53054d
                com.startapp.wa r0 = com.startapp.C12042m2.m52574a((com.startapp.C11891ed) r0)
                r9.TrafficInfoOnEnd = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                long r0 = r0 - r15
                r9.DurationOverallNoSleep = r0
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r0 = r0 - r27
                r9.DurationOverall = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r0 = r7.f53076g
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r0 != r1) goto L_0x0452
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                java.lang.String r0 = r0.f53068r
                goto L_0x0458
            L_0x0452:
                java.lang.String r0 = r7.f53070a
                java.lang.String r0 = com.startapp.C12051m9.m52597a(r0)
            L_0x0458:
                r9.AirportCode = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                java.lang.String r0 = r0.f53062l
                r9.Meta = r0
                com.startapp.i0 r0 = com.startapp.C11947i0.this
                java.lang.String r0 = r0.f53061k
                java.lang.String r0 = com.startapp.C11926ga.m52349a((java.lang.String) r0)
                r9.QuestionnaireName = r0
                r2 = 0
                boolean r0 = r29[r2]
                if (r0 == 0) goto L_0x047a
                int r0 = r13.successfulTests
                int r0 = r0 + r11
                r13.successfulTests = r0
                r0 = r9
                goto L_0x0499
            L_0x047a:
                int r12 = r23 + 1
                r0 = r9
                r8 = r25
                r10 = r26
                r9 = 0
                goto L_0x0028
            L_0x0484:
                r0 = move-exception
                r2 = r0
                if (r5 == 0) goto L_0x0491
                r5.close()     // Catch:{ all -> 0x048c }
                goto L_0x0491
            L_0x048c:
                r0 = move-exception
                r3 = r0
                com.startapp.C12356u2.m53524b(r3)
            L_0x0491:
                if (r1 == 0) goto L_0x0496
                r1.destroy()
            L_0x0496:
                throw r2
            L_0x0497:
                r26 = r10
            L_0x0499:
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = r7.f53076g
                com.startapp.networkTest.enums.LtrCriteriaTypes r2 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r1 == r2) goto L_0x04a4
                r1 = r26
                r7.m52430a((java.util.List<com.startapp.C12447y5>) r1)
            L_0x04a4:
                com.startapp.t4 r1 = com.startapp.C12385v4.m53561b()
                boolean r1 = r1.CLEAR_LTR_LOCATION_INFO()
                if (r1 == 0) goto L_0x04be
                if (r0 == 0) goto L_0x04be
                com.startapp.networkTest.data.LocationInfo r1 = new com.startapp.networkTest.data.LocationInfo
                r1.<init>()
                r0.LocationInfoOnStart = r1
                com.startapp.networkTest.data.LocationInfo r1 = new com.startapp.networkTest.data.LocationInfo
                r1.<init>()
                r0.LocationInfoOnEnd = r1
            L_0x04be:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11947i0.C11949b.doInBackground(java.lang.Void[]):com.startapp.networkTest.results.LatencyResult");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MeasurementPointLatency m52427a(long j, int i) {
            MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
            measurementPointLatency.Delta = j;
            RadioInfo h = C11947i0.this.f53053c.mo45255h();
            measurementPointLatency.ConnectionType = h.ConnectionType;
            measurementPointLatency.NetworkType = h.NetworkType;
            measurementPointLatency.NrAvailable = h.NrAvailable;
            measurementPointLatency.NrState = h.NrState;
            measurementPointLatency.RxLev = h.RXLevel;
            measurementPointLatency.Rtt = i;
            return measurementPointLatency;
        }

        /* renamed from: a */
        public void onPostExecute(LatencyResult latencyResult) {
            super.onPostExecute(latencyResult);
            P3TestResult unused = C11947i0.this.f53057g = latencyResult;
            if (latencyResult != null) {
                if (C11947i0.this.f53051a != null) {
                    C11947i0.this.f53051a.mo45081a(SpeedtestEngineStatus.END, SpeedtestEngineError.OK, 0);
                }
            } else if (C11947i0.this.f53051a != null) {
                C11947i0.this.f53051a.mo45081a(SpeedtestEngineStatus.ABORTED, SpeedtestEngineError.OK, 0);
            }
        }

        /* renamed from: a */
        private void m52430a(List<C12447y5> list) {
            HashSet hashSet = new HashSet();
            for (C12447y5 y5Var : list) {
                hashSet.add(y5Var.toString());
            }
            C12385v4.m53562c().mo46739d((Set<String>) hashSet);
        }

        /* renamed from: a */
        private List<C12447y5> m52429a(String[] strArr, LtrCriteriaTypes ltrCriteriaTypes, String str) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Set<String> q = C12385v4.m53562c().mo46777q();
            LinkedList<C12447y5> linkedList3 = new LinkedList<>();
            if (q != null) {
                for (String a : q) {
                    C12447y5 y5Var = (C12447y5) C12028l5.m52556a(a, C12447y5.class);
                    if (y5Var != null) {
                        linkedList3.add(y5Var);
                    }
                }
            }
            for (String str2 : strArr) {
                C12447y5 y5Var2 = new C12447y5();
                y5Var2.address = str2;
                linkedList2.add(y5Var2);
            }
            for (C12447y5 y5Var3 : linkedList3) {
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i].equals(y5Var3.address)) {
                        linkedList2.set(i, y5Var3);
                    }
                }
            }
            int i2 = C11948a.f53069a[ltrCriteriaTypes.ordinal()];
            if (i2 == 1) {
                C12447y5 y5Var4 = new C12447y5();
                y5Var4.address = str;
                linkedList.add(y5Var4);
                return linkedList;
            } else if (i2 == 2) {
                return linkedList2;
            } else {
                if (i2 == 3) {
                    Collections.shuffle(linkedList2, new Random(System.nanoTime()));
                    return new LinkedList(linkedList2);
                } else if (i2 == 4) {
                    Collections.sort(linkedList2, new C11951b());
                    return new LinkedList(linkedList2);
                } else if (i2 != 5) {
                    return linkedList;
                } else {
                    Collections.sort(linkedList2, new C11952c());
                    return new LinkedList(linkedList2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo45415b() {
        mo45411a(LocationController.ProviderMode.GpsAndNetwork);
    }

    /* renamed from: c */
    public void mo45417c() {
        LocationController locationController = this.f53055e;
        if (locationController != null) {
            locationController.mo45582f();
        }
        C11849d8 d8Var = this.f53053c;
        if (d8Var != null) {
            d8Var.mo45267y();
        }
        C11891ed edVar = this.f53054d;
        if (edVar != null) {
            edVar.mo45337g();
        }
    }

    /* renamed from: d */
    public void mo45419d(String str) {
        this.f53066p = str;
    }

    /* renamed from: e */
    public void mo45420e(String str) {
        this.f53062l = str;
    }

    /* renamed from: f */
    public void mo45421f(String str) {
        this.f53067q = str;
    }

    /* renamed from: g */
    public void mo45422g(String str) {
        this.f53061k = str;
    }

    /* renamed from: a */
    public P3TestResult mo45410a() {
        return this.f53057g;
    }

    /* renamed from: b */
    public void mo45416b(String str) {
        this.f53068r = str;
    }

    /* renamed from: a */
    private void m52402a(Context context, C12341t4 t4Var) {
        this.f53053c = new C11849d8(context);
        this.f53054d = new C11891ed(context);
        this.f53055e = new LocationController(this.f53052b);
        this.f53056f = new C12440y0(this.f53052b);
        this.f53058h = new ArrayList<>();
        if (t4Var.BANDWDITH_TEST_MANAGER_GET_IMEI_IMSI()) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        }
    }

    /* renamed from: c */
    public void mo45418c(String str) {
        this.f53063m = str;
    }

    /* renamed from: a */
    public void mo45411a(LocationController.ProviderMode providerMode) {
        LocationController locationController = this.f53055e;
        if (locationController != null) {
            locationController.mo45578a(providerMode);
        }
        C11849d8 d8Var = this.f53053c;
        if (d8Var != null) {
            d8Var.mo45266x();
        }
        C11891ed edVar = this.f53054d;
        if (edVar != null) {
            edVar.mo45336f();
        }
    }

    /* renamed from: a */
    public void mo45412a(String str) {
        ArrayList<C11825c8> arrayList = this.f53058h;
        arrayList.add(new C11825c8(arrayList.size() + 1, str));
    }

    /* renamed from: a */
    public void mo45414a(String str, int i, int i2, int i3, int i4, boolean z) {
        this.f53058h = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 11) {
            new C11949b(str, i, i2, i3, i4, z).execute(new Void[0]);
        } else {
            new C11949b(str, i, i2, i3, i4, z).executeOnExecutor(ThreadManager.m52679b().mo45624a(), new Void[0]);
        }
    }

    /* renamed from: a */
    public void mo45413a(String str, int i, int i2, int i3, int i4) {
        mo45414a(str, i, i2, i3, i4, false);
    }
}
