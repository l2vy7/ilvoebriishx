package com.startapp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.google.android.exoplayer2.C6540C;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.enums.CtCriteriaTypes;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.networkTest.speedtest.SpeedtestEngineStatus;
import com.startapp.networkTest.threads.ThreadManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.startapp.a2 */
/* compiled from: Sta */
public class C11762a2 {

    /* renamed from: n */
    private static final boolean f52521n = false;

    /* renamed from: o */
    private static final String f52522o = "a2";

    /* renamed from: p */
    private static final int f52523p = 30000;

    /* renamed from: q */
    private static final String f52524q = "\r\n";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f52525a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11849d8 f52526b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11891ed f52527c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LocationController f52528d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C12408w4 f52529e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12144q7 f52530f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f52531g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f52532h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f52533i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f52534j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Random f52535k = new Random();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f52536l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f52537m;

    /* renamed from: com.startapp.a2$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C11763a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.CtCriteriaTypes[] r0 = com.startapp.networkTest.enums.CtCriteriaTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52538a = r0
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.Random     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.DNSSuccessful     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.TCPSuccessful     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.FullSuccessful     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.TotalTests     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11762a2.C11763a.<clinit>():void");
        }
    }

    public C11762a2(Context context) {
        this.f52525a = context;
        this.f52529e = new C12408w4(context);
        C12341t4 b = C12385v4.m53561b();
        this.f52531g = b.PROJECT_ID();
        this.f52532h = b.CONNECTIVITY_TEST_HOSTNAME();
        this.f52533i = b.CONNECTIVITY_TEST_FILENAME();
        this.f52534j = b.CONNECTIVITY_TEST_IP();
        this.f52536l = b.CONNECTIVITY_TEST_MIN_BATTERY_LEVEL();
        this.f52537m = b.CONNECTIVITY_TEST_ENABLED_IN_ROAMING();
        this.f52528d = new LocationController(context);
        this.f52526b = new C11849d8(context);
        this.f52527c = new C11891ed(context);
    }

    /* renamed from: b */
    public void mo45077b() {
        this.f52528d.mo45582f();
        this.f52526b.mo45267y();
        this.f52527c.mo45337g();
    }

    /* renamed from: a */
    public void mo45075a() {
        this.f52528d.mo45578a(LocationController.ProviderMode.Passive);
        this.f52526b.mo45266x();
        this.f52527c.mo45336f();
    }

    /* renamed from: com.startapp.a2$b */
    /* compiled from: Sta */
    public class C11764b extends AsyncTask<Void, String, ConnectivityTestResult> implements C11771a4 {

        /* renamed from: a */
        private ConnectivityTestResult f52539a;

        /* renamed from: b */
        private C11947i0 f52540b;

        /* renamed from: com.startapp.a2$b$a */
        /* compiled from: Sta */
        public class C11765a implements Comparator<C11880e2> {
            public C11765a() {
            }

            /* renamed from: a */
            public int compare(C11880e2 e2Var, C11880e2 e2Var2) {
                return e2Var.DNSSuccess - e2Var2.DNSSuccess;
            }
        }

        /* renamed from: com.startapp.a2$b$b */
        /* compiled from: Sta */
        public class C11766b implements Comparator<C11880e2> {
            public C11766b() {
            }

            /* renamed from: a */
            public int compare(C11880e2 e2Var, C11880e2 e2Var2) {
                return e2Var.TCPSuccess - e2Var2.TCPSuccess;
            }
        }

        /* renamed from: com.startapp.a2$b$c */
        /* compiled from: Sta */
        public class C11767c implements Comparator<C11880e2> {
            public C11767c() {
            }

            /* renamed from: a */
            public int compare(C11880e2 e2Var, C11880e2 e2Var2) {
                return e2Var.successfulTests - e2Var2.successfulTests;
            }
        }

        /* renamed from: com.startapp.a2$b$d */
        /* compiled from: Sta */
        public class C11768d implements Comparator<C11880e2> {
            public C11768d() {
            }

            /* renamed from: a */
            public int compare(C11880e2 e2Var, C11880e2 e2Var2) {
                return e2Var.totalTests - e2Var2.totalTests;
            }
        }

        /* renamed from: com.startapp.a2$b$e */
        /* compiled from: Sta */
        public class C11769e {

            /* renamed from: a */
            public final int f52546a;

            /* renamed from: b */
            public final String f52547b;

            /* renamed from: c */
            public final boolean f52548c;

            public C11769e(int i, String str, boolean z) {
                this.f52546a = i;
                this.f52547b = str;
                this.f52548c = z;
            }
        }

        public C11764b() {
        }

        /* renamed from: a */
        private C11769e m52006a(InputStream inputStream) throws IOException {
            boolean z;
            byte[] bArr = new byte[1024];
            int i = 0;
            int i2 = 0;
            while (true) {
                int read = inputStream.read();
                z = true;
                i++;
                if (read == 10) {
                    z = false;
                    break;
                } else if (read < 0) {
                    break;
                } else {
                    int i3 = i2 + 1;
                    bArr[i2] = (byte) read;
                    if (i3 == bArr.length) {
                        bArr = Arrays.copyOf(bArr, i3 + 1024);
                    }
                    i2 = i3;
                }
            }
            if (i2 > 0 && bArr[i2 - 1] == 13) {
                i2--;
            }
            return new C11769e(i, new String(bArr, 0, i2, C6540C.UTF8_NAME), z);
        }

        /* renamed from: b */
        private CallStates m52010b() {
            TelephonyManager telephonyManager = (TelephonyManager) C11762a2.this.f52525a.getSystemService("phone");
            if (telephonyManager == null) {
                return CallStates.Unknown;
            }
            if (Build.VERSION.SDK_INT >= 31 && C11762a2.this.f52525a.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                return CallStates.Unknown;
            }
            int callState = telephonyManager.getCallState();
            if (callState == 0) {
                return CallStates.Idle;
            }
            if (callState == 1) {
                return CallStates.Ringing;
            }
            if (callState != 2) {
                return CallStates.Unknown;
            }
            return CallStates.Offhook;
        }

        /* renamed from: a */
        public void mo45079a(float f, int i) {
        }

        /* renamed from: b */
        public void mo45082b(float f, int i) {
        }

        /* renamed from: c */
        public void mo45083c(float f, int i) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:150:0x04a2 A[Catch:{ all -> 0x04d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0519 A[Catch:{ Exception -> 0x0701 }] */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x053c A[Catch:{ Exception -> 0x0701 }] */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x05ba A[Catch:{ all -> 0x0622, all -> 0x06e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x0678  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x0681  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x069e  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x06ac A[SYNTHETIC, Splitter:B:215:0x06ac] */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x06bf A[SYNTHETIC, Splitter:B:220:0x06bf] */
        /* JADX WARNING: Removed duplicated region for block: B:235:0x06ec A[SYNTHETIC, Splitter:B:235:0x06ec] */
        /* JADX WARNING: Removed duplicated region for block: B:259:0x0752 A[SYNTHETIC, Splitter:B:259:0x0752] */
        /* JADX WARNING: Removed duplicated region for block: B:272:0x0779  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x082c  */
        /* JADX WARNING: Removed duplicated region for block: B:285:0x083c  */
        /* JADX WARNING: Removed duplicated region for block: B:288:0x084b  */
        /* JADX WARNING: Removed duplicated region for block: B:329:0x091f A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:335:0x0935  */
        /* JADX WARNING: Removed duplicated region for block: B:341:0x0922 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:345:0x066d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:350:0x0691 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.startapp.networkTest.results.ConnectivityTestResult doInBackground(java.lang.Void... r37) {
            /*
                r36 = this;
                r1 = r36
                java.lang.String r2 = "\r\n"
                com.startapp.y0 r0 = new com.startapp.y0
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                android.content.Context r3 = r3.f52525a
                r0.<init>(r3)
                com.startapp.networkTest.data.BatteryInfo r3 = r0.mo46829a()
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                float r0 = r0.f52536l
                r4 = 0
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 == 0) goto L_0x002d
                float r0 = r3.BatteryLevel
                com.startapp.a2 r5 = com.startapp.C11762a2.this
                float r5 = r5.f52536l
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x002d
                return r4
            L_0x002d:
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                android.content.Context r0 = r0.f52525a
                com.startapp.r9 r5 = com.startapp.C12042m2.m52587i(r0)
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                boolean r0 = r0.f52537m
                if (r0 != 0) goto L_0x005c
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                com.startapp.d8 r0 = r0.f52526b
                com.startapp.networkTest.enums.ConnectionTypes r0 = r0.mo45249d()
                com.startapp.networkTest.enums.ConnectionTypes r6 = com.startapp.networkTest.enums.ConnectionTypes.Mobile
                if (r0 != r6) goto L_0x005c
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                com.startapp.d8 r0 = r0.f52526b
                int r6 = r5.SubscriptionId
                boolean r0 = r0.mo45260j((int) r6)
                if (r0 == 0) goto L_0x005c
                return r4
            L_0x005c:
                com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x0085 }
                long r7 = r0.mo46783w()     // Catch:{ all -> 0x0085 }
                long r9 = com.startapp.C12112oa.m52716d()     // Catch:{ all -> 0x0085 }
                com.startapp.t4 r0 = com.startapp.C12385v4.m53561b()     // Catch:{ all -> 0x0085 }
                long r11 = r0.CONNECTIVITY_TEST_TRUSTSTORE_UPDATE_INTERVAL()     // Catch:{ all -> 0x0085 }
                long r11 = r11 + r7
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 < 0) goto L_0x0079
                int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0089
            L_0x0079:
                com.startapp.a2 r0 = com.startapp.C11762a2.this     // Catch:{ all -> 0x0085 }
                android.content.Context r0 = r0.f52525a     // Catch:{ all -> 0x0085 }
                boolean r0 = com.startapp.C11907fb.m52317a((android.content.Context) r0)     // Catch:{ all -> 0x0085 }
                r7 = r0
                goto L_0x008a
            L_0x0085:
                r0 = move-exception
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)
            L_0x0089:
                r7 = 0
            L_0x008a:
                com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x00ab }
                long r8 = r0.mo46780t()     // Catch:{ all -> 0x00ab }
                long r10 = com.startapp.C12112oa.m52716d()     // Catch:{ all -> 0x00ab }
                com.startapp.t4 r0 = com.startapp.C12385v4.m53561b()     // Catch:{ all -> 0x00ab }
                long r12 = r0.CONNECTIVITY_TEST_CDNCONFIG_UPDATE_INTERVAL()     // Catch:{ all -> 0x00ab }
                long r12 = r12 + r8
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 < 0) goto L_0x00a7
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x00af
            L_0x00a7:
                com.startapp.C12355u1.m53517a()     // Catch:{ all -> 0x00ab }
                goto L_0x00af
            L_0x00ab:
                r0 = move-exception
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)
            L_0x00af:
                boolean r0 = com.startapp.C12385v4.m53567h()
                if (r0 == 0) goto L_0x0935
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                com.startapp.ed r0 = r0.f52527c
                if (r0 != 0) goto L_0x00bf
                goto L_0x0935
            L_0x00bf:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = new com.startapp.networkTest.results.ConnectivityTestResult
                com.startapp.a2 r8 = com.startapp.C11762a2.this
                java.lang.String r8 = r8.f52531g
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                com.startapp.w4 r9 = r9.f52529e
                java.lang.String r9 = r9.mo46775p()
                r0.<init>(r8, r9)
                r1.f52539a = r0
                com.startapp.a2 r8 = com.startapp.C11762a2.this
                com.startapp.networkTest.controller.LocationController r8 = r8.f52528d
                com.startapp.networkTest.data.LocationInfo r8 = r8.mo45580c()
                r0.LocationInfo = r8
                com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()
                java.lang.String[] r0 = r0.mo46758i()
                com.startapp.w4 r8 = com.startapp.C12385v4.m53562c()
                java.lang.String r8 = r8.mo46753h()
                com.startapp.networkTest.enums.CtCriteriaTypes r8 = com.startapp.networkTest.enums.CtCriteriaTypes.valueOf(r8)
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f52539a
                int r10 = com.startapp.networkTest.startapp.NetworkTester.isAppInForeground()
                r9.IsAppInForeground = r10
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f52539a
                java.lang.String r10 = "20220530140220"
                r9.Version = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.startapp.a2 r11 = com.startapp.C11762a2.this
                java.lang.String r11 = r11.f52533i
                r10.append(r11)
                java.lang.String r11 = "?id="
                r10.append(r11)
                com.startapp.a2 r11 = com.startapp.C11762a2.this
                java.util.Random r11 = r11.f52535k
                long r11 = r11.nextLong()
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.ServerFilename = r10
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f52539a
                r9.BatteryInfo = r3
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                android.content.Context r3 = r3.f52525a
                com.startapp.n2 r3 = com.startapp.C12042m2.m52578b((android.content.Context) r3)
                r9.DeviceInfo = r3
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                android.content.Context r9 = r9.f52525a
                com.startapp.b6 r9 = com.startapp.C12042m2.m52583e(r9)
                r3.MemoryInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                com.startapp.d8 r9 = r9.f52526b
                com.startapp.networkTest.data.RadioInfo r9 = r9.mo45255h()
                r3.RadioInfo = r9
                com.startapp.t4 r3 = com.startapp.C12385v4.m53561b()
                boolean r3 = r3.CT_COLLECT_CELLINFO()
                if (r3 == 0) goto L_0x0177
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.a2 r10 = com.startapp.C11762a2.this
                com.startapp.d8 r10 = r10.f52526b
                com.startapp.networkTest.data.radio.CellInfo[] r10 = r10.mo45248c()
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.CellInfo = r9
            L_0x0177:
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.a2 r10 = com.startapp.C11762a2.this
                com.startapp.d8 r10 = r10.f52526b
                com.startapp.networkTest.data.radio.ApnInfo[] r10 = r10.mo45242a()
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.ApnInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.a2 r10 = com.startapp.C11762a2.this
                com.startapp.d8 r10 = r10.f52526b
                com.startapp.a2 r11 = com.startapp.C11762a2.this
                com.startapp.d8 r11 = r11.f52526b
                com.startapp.s6 r11 = r11.mo45245b()
                int r11 = r11.DefaultDataSimId
                com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r10 = r10.mo45254g((int) r11)
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.NetworkRegistrationInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                com.startapp.d8 r9 = r9.f52526b
                com.startapp.a2 r10 = com.startapp.C11762a2.this
                com.startapp.d8 r10 = r10.f52526b
                com.startapp.s6 r10 = r10.mo45245b()
                int r10 = r10.DefaultDataSimId
                com.startapp.networkTest.enums.NetworkTypes r9 = r9.mo45258i((int) r10)
                r3.VoiceNetworkType = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.networkTest.enums.voice.CallStates r9 = r36.m52010b()
                r3.CallState = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                android.content.Context r9 = r9.f52525a
                com.startapp.da r9 = com.startapp.C12042m2.m52589k(r9)
                r3.StorageInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                com.startapp.ed r9 = r9.f52527c
                com.startapp.networkTest.data.WifiInfo r9 = r9.mo45333c()
                r3.WifiInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                com.startapp.ed r9 = r9.f52527c
                com.startapp.wa r9 = com.startapp.C12042m2.m52574a((com.startapp.C11891ed) r9)
                r3.TrafficInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                android.content.Context r9 = r9.f52525a
                com.startapp.networkTest.enums.ScreenStates r9 = com.startapp.C12042m2.m52586h(r9)
                r3.ScreenState = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.a2 r9 = com.startapp.C11762a2.this
                android.content.Context r9 = r9.f52525a
                com.startapp.networkTest.enums.IdleStates r9 = com.startapp.C12042m2.m52582d(r9)
                r3.IdleStateOnStart = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                r3.SimInfo = r5
                com.startapp.networkTest.data.TimeInfo r5 = com.startapp.C12112oa.m52717e()
                r3.TimeInfo = r5
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.networkTest.data.TimeInfo r5 = r3.TimeInfo
                java.lang.String r5 = r5.TimestampTableau
                r3.TestTimestamp = r5
                com.startapp.w4 r5 = com.startapp.C12385v4.m53562c()
                long r9 = r5.mo46713F()
                r3.TruststoreTimestamp = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                com.startapp.networkTest.data.TimeInfo r5 = r3.TimeInfo
                java.lang.String r9 = r3.GUID
                java.lang.String r5 = com.startapp.C12140q3.m52770a(r5, r9)
                r3.CtId = r5
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                com.startapp.w4 r3 = r3.f52529e
                boolean r3 = r3.mo46767l()
                r5 = 1
                if (r3 == 0) goto L_0x025e
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                com.startapp.w4 r3 = r3.f52529e
                boolean r3 = r3.mo46770m()
                if (r3 != 0) goto L_0x025e
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a
                r3.IsKeepAlive = r5
            L_0x025e:
                long r9 = android.os.SystemClock.elapsedRealtime()
                long r11 = android.os.SystemClock.uptimeMillis()
                javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
                com.startapp.x4 r13 = new com.startapp.x4
                com.startapp.a2 r14 = com.startapp.C11762a2.this
                android.content.Context r14 = r14.f52525a
                r13.<init>(r14, r7)
                java.util.List r7 = r1.m52007a((java.lang.String[]) r0, (com.startapp.networkTest.enums.CtCriteriaTypes) r8)
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                com.startapp.a2 r0 = com.startapp.C11762a2.this
                java.lang.String r0 = r0.f52532h
                com.startapp.a2 r14 = com.startapp.C11762a2.this
                java.lang.String r14 = r14.f52534j
                r18 = r4
                r19 = r18
                r20 = r19
                r4 = 0
                r16 = 0
                r17 = 0
                r32 = r9
                r9 = r0
                r34 = r11
                r12 = r14
                r10 = r32
                r14 = r34
            L_0x029f:
                int r0 = r7.size()
                java.lang.String r5 = ""
                java.lang.String r6 = "; "
                if (r4 < r0) goto L_0x02c8
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L_0x02b6
                int r0 = r9.length()
                if (r0 <= 0) goto L_0x02b6
                goto L_0x02c8
            L_0x02b6:
                r26 = r7
                r9 = r16
                r12 = r17
                r7 = r18
                r0 = r19
                r4 = r20
                r16 = 0
                r17 = 0
                goto L_0x041d
            L_0x02c8:
                r22 = r10
                com.startapp.r6 r10 = new com.startapp.r6
                r10.<init>()
                long r22 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x08ed }
                long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x08ed }
                com.startapp.e2 r11 = new com.startapp.e2     // Catch:{ all -> 0x08e2 }
                r11.<init>()     // Catch:{ all -> 0x08e2 }
                int r16 = r16 + 1
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x08d2 }
                r24 = r11
                boolean r11 = r36.m52009a()     // Catch:{ all -> 0x08d0 }
                r0.LocalhostPingSuccess = r11     // Catch:{ all -> 0x08d0 }
                long r25 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x08d0 }
                boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x08d0 }
                if (r0 != 0) goto L_0x036c
                java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x035f }
                r11 = r0
                com.startapp.e2 r11 = (com.startapp.C11880e2) r11     // Catch:{ all -> 0x035f }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x034e }
                r27 = r14
                java.lang.String r14 = r11.address     // Catch:{ all -> 0x034a }
                r0.ServerHostname = r14     // Catch:{ all -> 0x034a }
                int r0 = r11.totalTests     // Catch:{ all -> 0x034a }
                r14 = 1
                int r0 = r0 + r14
                r11.totalTests = r0     // Catch:{ all -> 0x034a }
                int r0 = r4 + 1
                r10.Try = r0     // Catch:{ all -> 0x034a }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x034a }
                r0.<init>()     // Catch:{ all -> 0x034a }
                com.startapp.networkTest.results.ConnectivityTestResult r14 = r1.f52539a     // Catch:{ all -> 0x034a }
                java.lang.String r14 = r14.ServerHostname     // Catch:{ all -> 0x034a }
                r0.append(r14)     // Catch:{ all -> 0x034a }
                com.startapp.networkTest.results.ConnectivityTestResult r14 = r1.f52539a     // Catch:{ all -> 0x034a }
                java.lang.String r14 = r14.ServerFilename     // Catch:{ all -> 0x034a }
                r0.append(r14)     // Catch:{ all -> 0x034a }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x034a }
                r10.HostFile = r0     // Catch:{ all -> 0x034a }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x034a }
                com.startapp.q2 r14 = new com.startapp.q2     // Catch:{ all -> 0x034a }
                r14.<init>()     // Catch:{ all -> 0x034a }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f52539a     // Catch:{ all -> 0x034a }
                java.lang.String r15 = r15.ServerHostname     // Catch:{ all -> 0x034a }
                r29 = r11
                r11 = 30000(0x7530, float:4.2039E-41)
                java.lang.String r14 = r14.mo45691a((java.lang.String) r15, (int) r11)     // Catch:{ all -> 0x0348 }
                r0.ServerIp = r14     // Catch:{ all -> 0x0348 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x0348 }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0348 }
                long r14 = r14 - r25
                r0.DurationDNS = r14     // Catch:{ all -> 0x0348 }
                r11 = r29
                r14 = 1
                goto L_0x03b2
            L_0x0348:
                r0 = move-exception
                goto L_0x0353
            L_0x034a:
                r0 = move-exception
                r29 = r11
                goto L_0x0353
            L_0x034e:
                r0 = move-exception
                r29 = r11
                r27 = r14
            L_0x0353:
                r20 = r29
                r14 = 1
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                goto L_0x08f8
            L_0x035f:
                r0 = move-exception
                r27 = r14
                r14 = 1
            L_0x0363:
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                goto L_0x08df
            L_0x036c:
                r27 = r14
                int r0 = r12.length()     // Catch:{ all -> 0x08ce }
                if (r0 <= 0) goto L_0x038f
                int r0 = r9.length()     // Catch:{ all -> 0x038c }
                if (r0 <= 0) goto L_0x038f
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x038c }
                r0.ServerIp = r12     // Catch:{ all -> 0x038c }
                r0.ServerHostname = r9     // Catch:{ all -> 0x038c }
                r14 = 0
                r0.DurationDNS = r14     // Catch:{ all -> 0x038c }
                int r4 = r4 + -1
                r9 = r5
                r12 = r9
            L_0x0388:
                r11 = r24
                r14 = 0
                goto L_0x03b2
            L_0x038c:
                r0 = move-exception
                r14 = 0
                goto L_0x0363
            L_0x038f:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x08ce }
                r0.ServerHostname = r9     // Catch:{ all -> 0x08ce }
                int r4 = r4 + -1
                com.startapp.q2 r9 = new com.startapp.q2     // Catch:{ all -> 0x08c4 }
                r9.<init>()     // Catch:{ all -> 0x08c4 }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ all -> 0x08c4 }
                java.lang.String r11 = r11.ServerHostname     // Catch:{ all -> 0x08c4 }
                r14 = 30000(0x7530, float:4.2039E-41)
                java.lang.String r9 = r9.mo45691a((java.lang.String) r11, (int) r14)     // Catch:{ all -> 0x08c4 }
                r0.ServerIp = r9     // Catch:{ all -> 0x08c4 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x08c4 }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x08c4 }
                long r14 = r14 - r25
                r0.DurationDNS = r14     // Catch:{ all -> 0x08c4 }
                r9 = r5
                goto L_0x0388
            L_0x03b2:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x08b5 }
                r24 = r14
                long r14 = r0.DurationDNS     // Catch:{ all -> 0x08a6 }
                r25 = 30000(0x7530, double:1.4822E-319)
                int r29 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
                if (r29 > 0) goto L_0x0888
                java.lang.String r0 = r0.ServerIp     // Catch:{ all -> 0x08a6 }
                r10.ServerIp = r0     // Catch:{ all -> 0x08a6 }
                r10.DurationDNS = r14     // Catch:{ all -> 0x08a6 }
                int r0 = r11.DNSSuccess     // Catch:{ all -> 0x08a6 }
                r14 = 1
                int r0 = r0 + r14
                r11.DNSSuccess = r0     // Catch:{ all -> 0x08a6 }
                int r17 = r17 + 1
                r0 = 30000(0x7530, float:4.2039E-41)
                javax.net.SocketFactory r14 = android.net.SSLCertificateSocketFactory.getDefault(r0)     // Catch:{ all -> 0x08a6 }
                android.net.SSLCertificateSocketFactory r14 = (android.net.SSLCertificateSocketFactory) r14     // Catch:{ all -> 0x08a6 }
                r15 = 1
                javax.net.ssl.TrustManager[] r0 = new javax.net.ssl.TrustManager[r15]     // Catch:{ all -> 0x0877 }
                r15 = 0
                r0[r15] = r13     // Catch:{ all -> 0x0877 }
                r14.setTrustManagers(r0)     // Catch:{ all -> 0x0877 }
                java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0877 }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f52539a     // Catch:{ all -> 0x0877 }
                java.lang.String r15 = r15.ServerIp     // Catch:{ all -> 0x0877 }
                r25 = r4
                r4 = 443(0x1bb, float:6.21E-43)
                r0.<init>(r15, r4)     // Catch:{ all -> 0x0866 }
                java.net.Socket r4 = r14.createSocket()     // Catch:{ all -> 0x0866 }
                javax.net.ssl.SSLSocket r4 = (javax.net.ssl.SSLSocket) r4     // Catch:{ all -> 0x0866 }
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0859 }
                r15 = 30000(0x7530, float:4.2039E-41)
                r4.connect(r0, r15)     // Catch:{ all -> 0x0859 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x0859 }
                long r29 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0859 }
                r20 = r14
                long r14 = r29 - r18
                r0.DurationTcpConnect = r14     // Catch:{ all -> 0x0857 }
                int r0 = r11.TCPSuccess     // Catch:{ all -> 0x0857 }
                r14 = 1
                int r0 = r0 + r14
                r11.TCPSuccess = r0     // Catch:{ all -> 0x0857 }
                r26 = r7
                r9 = r16
                r12 = r17
                r0 = r20
                r14 = r27
                r16 = 1
                r17 = 1
                r7 = r4
                r4 = r11
                r10 = r22
            L_0x041d:
                if (r17 == 0) goto L_0x076b
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x071b }
                r20 = r12
                int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x070e }
                r22 = r9
                r9 = 17
                if (r12 < r9) goto L_0x0442
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f52539a     // Catch:{ Exception -> 0x043b }
                java.lang.String r9 = r9.ServerHostname     // Catch:{ Exception -> 0x043b }
                r0.setHostname(r7, r9)     // Catch:{ Exception -> 0x043b }
                r29 = r8
                r23 = r10
                r21 = 0
                goto L_0x0494
            L_0x043b:
                r0 = move-exception
                r31 = r6
                r29 = r8
                goto L_0x0715
            L_0x0442:
                java.lang.Class r9 = r0.getClass()     // Catch:{ all -> 0x0469 }
                java.lang.String r12 = "setHostname"
                r29 = r8
                r23 = r10
                r8 = 1
                java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0467 }
                java.lang.Class<java.lang.String> r11 = java.lang.String.class
                r21 = 0
                r10[r21] = r11     // Catch:{ all -> 0x0465 }
                java.lang.reflect.Method r9 = r9.getMethod(r12, r10)     // Catch:{ all -> 0x0465 }
                java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0465 }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f52539a     // Catch:{ all -> 0x0465 }
                java.lang.String r8 = r8.ServerHostname     // Catch:{ all -> 0x0465 }
                r10[r21] = r8     // Catch:{ all -> 0x0465 }
                r9.invoke(r0, r10)     // Catch:{ all -> 0x0465 }
                goto L_0x0494
            L_0x0465:
                r0 = move-exception
                goto L_0x0470
            L_0x0467:
                r0 = move-exception
                goto L_0x046e
            L_0x0469:
                r0 = move-exception
                r29 = r8
                r23 = r10
            L_0x046e:
                r21 = 0
            L_0x0470:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x070a }
                r8.<init>()     // Catch:{ Exception -> 0x070a }
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f52539a     // Catch:{ Exception -> 0x070a }
                java.lang.String r10 = r9.SslException     // Catch:{ Exception -> 0x070a }
                r8.append(r10)     // Catch:{ Exception -> 0x070a }
                java.lang.String r10 = "SNI not available:"
                r8.append(r10)     // Catch:{ Exception -> 0x070a }
                java.lang.String r10 = r0.getMessage()     // Catch:{ Exception -> 0x070a }
                r8.append(r10)     // Catch:{ Exception -> 0x070a }
                r8.append(r6)     // Catch:{ Exception -> 0x070a }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x070a }
                r9.SslException = r8     // Catch:{ Exception -> 0x070a }
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x070a }
            L_0x0494:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x04d4 }
                java.lang.String r0 = r0.ServerHostname     // Catch:{ all -> 0x04d4 }
                javax.net.ssl.SSLSession r8 = r7.getSession()     // Catch:{ all -> 0x04d4 }
                boolean r0 = r3.verify(r0, r8)     // Catch:{ all -> 0x04d4 }
                if (r0 != 0) goto L_0x04fb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04d4 }
                r0.<init>()     // Catch:{ all -> 0x04d4 }
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a     // Catch:{ all -> 0x04d4 }
                java.lang.String r8 = r3.SslException     // Catch:{ all -> 0x04d4 }
                r0.append(r8)     // Catch:{ all -> 0x04d4 }
                java.lang.String r8 = "Expected "
                r0.append(r8)     // Catch:{ all -> 0x04d4 }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f52539a     // Catch:{ all -> 0x04d4 }
                java.lang.String r8 = r8.ServerHostname     // Catch:{ all -> 0x04d4 }
                r0.append(r8)     // Catch:{ all -> 0x04d4 }
                java.lang.String r8 = " found "
                r0.append(r8)     // Catch:{ all -> 0x04d4 }
                javax.net.ssl.SSLSession r8 = r7.getSession()     // Catch:{ all -> 0x04d4 }
                java.security.Principal r8 = r8.getPeerPrincipal()     // Catch:{ all -> 0x04d4 }
                r0.append(r8)     // Catch:{ all -> 0x04d4 }
                r0.append(r6)     // Catch:{ all -> 0x04d4 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04d4 }
                r3.SslException = r0     // Catch:{ all -> 0x04d4 }
                goto L_0x04f9
            L_0x04d4:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x070a }
                r3.<init>()     // Catch:{ Exception -> 0x070a }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f52539a     // Catch:{ Exception -> 0x070a }
                java.lang.String r9 = r8.SslException     // Catch:{ Exception -> 0x070a }
                r3.append(r9)     // Catch:{ Exception -> 0x070a }
                java.lang.String r9 = "Cannot validate hostname: "
                r3.append(r9)     // Catch:{ Exception -> 0x070a }
                java.lang.String r9 = r0.getMessage()     // Catch:{ Exception -> 0x070a }
                r3.append(r9)     // Catch:{ Exception -> 0x070a }
                r3.append(r6)     // Catch:{ Exception -> 0x070a }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x070a }
                r8.SslException = r3     // Catch:{ Exception -> 0x070a }
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x070a }
            L_0x04f9:
                r17 = 0
            L_0x04fb:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ Exception -> 0x070a }
                long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x070a }
                long r8 = r8 - r18
                r0.DurationSSL = r8     // Catch:{ Exception -> 0x070a }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.enums.CtTestTypes r3 = r13.mo46809b()     // Catch:{ Exception -> 0x0701 }
                r0.TestType = r3     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.enums.CtTestTypes r0 = r0.TestType     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.enums.CtTestTypes r3 = com.startapp.networkTest.enums.CtTestTypes.SSLOwnTs     // Catch:{ Exception -> 0x0701 }
                boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0701 }
                if (r0 != 0) goto L_0x053c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0701 }
                r0.<init>()     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f52539a     // Catch:{ Exception -> 0x0701 }
                java.lang.String r8 = r3.SslException     // Catch:{ Exception -> 0x0701 }
                r0.append(r8)     // Catch:{ Exception -> 0x0701 }
                java.lang.String r8 = "We couldn't use our own truststore, used: "
                r0.append(r8)     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f52539a     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.enums.CtTestTypes r8 = r8.TestType     // Catch:{ Exception -> 0x0701 }
                r0.append(r8)     // Catch:{ Exception -> 0x0701 }
                r0.append(r6)     // Catch:{ Exception -> 0x0701 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0701 }
                r3.SslException = r0     // Catch:{ Exception -> 0x0701 }
                r0 = 0
                goto L_0x053e
            L_0x053c:
                r0 = r17
            L_0x053e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0701 }
                r3.<init>()     // Catch:{ Exception -> 0x0701 }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f52539a     // Catch:{ Exception -> 0x0701 }
                java.lang.String r9 = r8.SslException     // Catch:{ Exception -> 0x0701 }
                r3.append(r9)     // Catch:{ Exception -> 0x0701 }
                java.lang.String r9 = r13.mo46808a()     // Catch:{ Exception -> 0x0701 }
                r3.append(r9)     // Catch:{ Exception -> 0x0701 }
                r3.append(r6)     // Catch:{ Exception -> 0x0701 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0701 }
                r8.SslException = r3     // Catch:{ Exception -> 0x0701 }
                r3 = 2048(0x800, float:2.87E-42)
                byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x06fc }
                java.io.PrintWriter r8 = new java.io.PrintWriter     // Catch:{ Exception -> 0x06fc }
                java.io.OutputStream r9 = r7.getOutputStream()     // Catch:{ Exception -> 0x06fc }
                r8.<init>(r9)     // Catch:{ Exception -> 0x06fc }
                long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = "GET "
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = r11.ServerFilename     // Catch:{ Exception -> 0x06fc }
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = " HTTP/1.1"
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                r8.print(r2)     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = "HOST: "
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = r11.ServerHostname     // Catch:{ Exception -> 0x06fc }
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                r8.print(r2)     // Catch:{ Exception -> 0x06fc }
                java.lang.String r11 = "Connection: close"
                r8.print(r11)     // Catch:{ Exception -> 0x06fc }
                r8.print(r2)     // Catch:{ Exception -> 0x06fc }
                r8.print(r2)     // Catch:{ Exception -> 0x06fc }
                r8.print(r2)     // Catch:{ Exception -> 0x06fc }
                r8.flush()     // Catch:{ Exception -> 0x06fc }
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a     // Catch:{ Exception -> 0x06fc }
                long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06fc }
                long r11 = r11 - r9
                r2.DurationHttpGetCommand = r11     // Catch:{ Exception -> 0x06fc }
                long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06fc }
                java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Exception -> 0x06fc }
                r13 = r0
                r10 = -1
                r18 = 0
            L_0x05b4:
                com.startapp.a2$b$e r0 = r1.m52006a((java.io.InputStream) r2)     // Catch:{ all -> 0x06e1 }
                if (r0 == 0) goto L_0x066d
                int r11 = r0.f52546a     // Catch:{ all -> 0x06e1 }
                r30 = r13
                long r12 = (long) r11     // Catch:{ all -> 0x06e1 }
                long r18 = r18 + r12
                java.lang.String r11 = r0.f52547b     // Catch:{ all -> 0x06e1 }
                java.lang.String r11 = r11.toUpperCase()     // Catch:{ all -> 0x06e1 }
                java.lang.String r12 = "HTTP"
                boolean r12 = r11.startsWith(r12)     // Catch:{ all -> 0x06e1 }
                if (r12 == 0) goto L_0x060b
                java.lang.String r0 = " "
                java.lang.String[] r0 = r11.split(r0)     // Catch:{ all -> 0x06e1 }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                r12 = 1
                r0 = r0[r12]     // Catch:{ all -> 0x06e1 }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x06e1 }
                r11.HTTPStatus = r0     // Catch:{ all -> 0x06e1 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                int r0 = r0.HTTPStatus     // Catch:{ all -> 0x06e1 }
                r11 = 200(0xc8, float:2.8E-43)
                if (r0 == r11) goto L_0x0669
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e1 }
                r0.<init>()     // Catch:{ all -> 0x06e1 }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                java.lang.String r12 = r11.ErrorReason     // Catch:{ all -> 0x06e1 }
                r0.append(r12)     // Catch:{ all -> 0x06e1 }
                java.lang.String r12 = "Request failed! Unexcepted HTTP code: "
                r0.append(r12)     // Catch:{ all -> 0x06e1 }
                com.startapp.networkTest.results.ConnectivityTestResult r12 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                int r12 = r12.HTTPStatus     // Catch:{ all -> 0x06e1 }
                r0.append(r12)     // Catch:{ all -> 0x06e1 }
                r0.append(r6)     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06e1 }
                r11.ErrorReason = r0     // Catch:{ all -> 0x06e1 }
                r13 = 0
                goto L_0x05b4
            L_0x060b:
                java.lang.String r12 = "CONTENT-LENGTH:"
                boolean r12 = r11.startsWith(r12)     // Catch:{ all -> 0x06e1 }
                r13 = 15
                if (r12 == 0) goto L_0x0627
                java.lang.String r0 = r11.substring(r13)     // Catch:{ all -> 0x0622 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0622 }
                int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0622 }
                goto L_0x0669
            L_0x0622:
                r0 = move-exception
                com.startapp.C12356u2.m53524b(r0)     // Catch:{ all -> 0x06e1 }
                goto L_0x0669
            L_0x0627:
                java.lang.String r12 = "X-AMZ-CF-ID:"
                boolean r12 = r11.startsWith(r12)     // Catch:{ all -> 0x06e1 }
                if (r12 == 0) goto L_0x063e
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.f52547b     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.substring(r13)     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x06e1 }
                r11.AmazonId = r0     // Catch:{ all -> 0x06e1 }
                goto L_0x0669
            L_0x063e:
                boolean r12 = r0.f52548c     // Catch:{ all -> 0x06e1 }
                if (r12 != 0) goto L_0x066f
                boolean r12 = r11.equals(r5)     // Catch:{ all -> 0x06e1 }
                if (r12 == 0) goto L_0x0649
                goto L_0x066f
            L_0x0649:
                java.lang.String r12 = "X-AMZ-CF-POP:"
                boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x06e1 }
                if (r11 == 0) goto L_0x0669
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f52539a     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.f52547b     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x06e1 }
                r12 = 13
                java.lang.String r0 = r0.substring(r12)     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x06e1 }
                java.lang.String r0 = com.startapp.C12051m9.m52598b(r0)     // Catch:{ all -> 0x06e1 }
                r11.AirportCode = r0     // Catch:{ all -> 0x06e1 }
            L_0x0669:
                r13 = r30
                goto L_0x05b4
            L_0x066d:
                r30 = r13
            L_0x066f:
                r11 = r18
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x06dc }
                r0.HeaderBytesRead = r11     // Catch:{ all -> 0x06dc }
                r5 = -1
                if (r10 == r5) goto L_0x0681
                int r0 = (int) r11
                int r0 = r0 + r10
                r31 = r6
                long r5 = (long) r0
                r18 = r11
                r10 = r5
                goto L_0x068a
            L_0x0681:
                r31 = r6
                r18 = r11
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x068a:
                int r0 = r2.read(r3)     // Catch:{ all -> 0x06da }
                r5 = -1
                if (r0 != r5) goto L_0x069e
                int r0 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
                if (r0 < 0) goto L_0x0696
                goto L_0x06a8
            L_0x0696:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x06da }
                java.lang.String r2 = "Could not read all bytes"
                r0.<init>(r2)     // Catch:{ all -> 0x06da }
                throw r0     // Catch:{ all -> 0x06da }
            L_0x069e:
                long r12 = (long) r0
                long r18 = r18 + r12
                int r6 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
                if (r6 < 0) goto L_0x06a6
                goto L_0x06a8
            L_0x06a6:
                if (r0 > 0) goto L_0x068a
            L_0x06a8:
                r2 = r18
                if (r30 == 0) goto L_0x06b9
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ all -> 0x06b7 }
                r5 = 1
                r0.Success = r5     // Catch:{ all -> 0x06b7 }
                int r0 = r4.successfulTests     // Catch:{ all -> 0x06b7 }
                int r0 = r0 + r5
                r4.successfulTests = r0     // Catch:{ all -> 0x06b7 }
                goto L_0x06b9
            L_0x06b7:
                r0 = move-exception
                goto L_0x06e6
            L_0x06b9:
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x06cc
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ Exception -> 0x06fa }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06fa }
                long r4 = r4 - r8
                r0.DurationHttpReceive = r4     // Catch:{ Exception -> 0x06fa }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a     // Catch:{ Exception -> 0x06fa }
                r0.BytesRead = r2     // Catch:{ Exception -> 0x06fa }
            L_0x06cc:
                r7.close()     // Catch:{ all -> 0x06d0 }
                goto L_0x06d5
            L_0x06d0:
                r0 = move-exception
                r2 = r0
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r2)
            L_0x06d5:
                r0 = r17
                r6 = 1
                goto L_0x0777
            L_0x06da:
                r0 = move-exception
                goto L_0x06e4
            L_0x06dc:
                r0 = move-exception
                r31 = r6
                r2 = r11
                goto L_0x06e6
            L_0x06e1:
                r0 = move-exception
                r31 = r6
            L_0x06e4:
                r2 = r18
            L_0x06e6:
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x06f9
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f52539a     // Catch:{ Exception -> 0x06fa }
                long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06fa }
                long r5 = r5 - r8
                r4.DurationHttpReceive = r5     // Catch:{ Exception -> 0x06fa }
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f52539a     // Catch:{ Exception -> 0x06fa }
                r4.BytesRead = r2     // Catch:{ Exception -> 0x06fa }
            L_0x06f9:
                throw r0     // Catch:{ Exception -> 0x06fa }
            L_0x06fa:
                r0 = move-exception
                goto L_0x06ff
            L_0x06fc:
                r0 = move-exception
                r31 = r6
            L_0x06ff:
                r6 = 1
                goto L_0x0705
            L_0x0701:
                r0 = move-exception
                r31 = r6
                r6 = 0
            L_0x0705:
                r21 = r6
                r6 = r17
                goto L_0x0729
            L_0x070a:
                r0 = move-exception
                r31 = r6
                goto L_0x0728
            L_0x070e:
                r0 = move-exception
                r31 = r6
                r29 = r8
                r22 = r9
            L_0x0715:
                r23 = r10
                goto L_0x0726
            L_0x0718:
                r0 = move-exception
                r2 = r0
                goto L_0x075f
            L_0x071b:
                r0 = move-exception
                r31 = r6
                r29 = r8
                r22 = r9
                r23 = r10
                r20 = r12
            L_0x0726:
                r21 = 0
            L_0x0728:
                r6 = 0
            L_0x0729:
                com.startapp.a2 r2 = com.startapp.C11762a2.this     // Catch:{ all -> 0x0718 }
                java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0718 }
                java.lang.String r2 = r2.m51990a((java.lang.String) r3)     // Catch:{ all -> 0x0718 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0718 }
                r3.<init>()     // Catch:{ all -> 0x0718 }
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f52539a     // Catch:{ all -> 0x0718 }
                java.lang.String r5 = r4.ErrorReason     // Catch:{ all -> 0x0718 }
                r3.append(r5)     // Catch:{ all -> 0x0718 }
                r3.append(r2)     // Catch:{ all -> 0x0718 }
                r8 = r31
                r3.append(r8)     // Catch:{ all -> 0x0718 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0718 }
                r4.ErrorReason = r2     // Catch:{ all -> 0x0718 }
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0718 }
                if (r7 == 0) goto L_0x075b
                r7.close()     // Catch:{ all -> 0x0756 }
                goto L_0x075b
            L_0x0756:
                r0 = move-exception
                r2 = r0
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r2)
            L_0x075b:
                r0 = r6
                r6 = r21
                goto L_0x0777
            L_0x075f:
                if (r7 == 0) goto L_0x076a
                r7.close()     // Catch:{ all -> 0x0765 }
                goto L_0x076a
            L_0x0765:
                r0 = move-exception
                r3 = r0
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r3)
            L_0x076a:
                throw r2
            L_0x076b:
                r29 = r8
                r22 = r9
                r23 = r10
                r20 = r12
                r21 = 0
                r0 = 0
                r6 = 0
            L_0x0777:
                if (r6 == 0) goto L_0x07b1
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                com.startapp.networkTest.data.RadioInfo r3 = r2.RadioInfo
                com.startapp.networkTest.enums.ConnectionTypes r3 = r3.ConnectionType
                com.startapp.networkTest.enums.ConnectionTypes r4 = com.startapp.networkTest.enums.ConnectionTypes.WiFi
                if (r3 != r4) goto L_0x0792
                com.startapp.c3 r3 = com.startapp.C11815c3.m52088a()
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f52539a
                com.startapp.networkTest.data.WifiInfo r4 = r4.WifiInfo
                com.startapp.networkTest.data.IspInfo r3 = r3.mo45180a(r4)
                r2.IspInfo = r3
                goto L_0x07b1
            L_0x0792:
                com.startapp.t4 r2 = com.startapp.C12385v4.m53561b()
                boolean r2 = r2.GEOIP_MOBILE_ENABLED()
                if (r2 == 0) goto L_0x07b1
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                com.startapp.networkTest.data.RadioInfo r3 = r2.RadioInfo
                com.startapp.networkTest.enums.ConnectionTypes r3 = r3.ConnectionType
                com.startapp.networkTest.enums.ConnectionTypes r4 = com.startapp.networkTest.enums.ConnectionTypes.Mobile
                if (r3 != r4) goto L_0x07b1
                com.startapp.c3 r3 = com.startapp.C11815c3.m52088a()
                r4 = 0
                com.startapp.networkTest.data.IspInfo r3 = r3.mo45180a(r4)
                r2.IspInfo = r3
            L_0x07b1:
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                com.startapp.d8 r3 = r3.f52526b
                com.startapp.networkTest.data.RadioInfo r3 = r3.mo45255h()
                r2.RadioInfoOnEnd = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                long r3 = android.os.SystemClock.uptimeMillis()
                long r3 = r3 - r14
                r2.DurationOverallNoSleep = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                long r3 = android.os.SystemClock.elapsedRealtime()
                long r3 = r3 - r23
                r2.DurationOverall = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                com.startapp.a2 r3 = com.startapp.C11762a2.this
                android.content.Context r3 = r3.f52525a
                com.startapp.networkTest.enums.IdleStates r3 = com.startapp.C12042m2.m52582d(r3)
                r2.IdleStateOnEnd = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                java.util.ArrayList r3 = new java.util.ArrayList
                r6 = r29
                r3.<init>(r6)
                r2.MultiCdnInfo = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f52539a
                r3 = r22
                long r3 = (long) r3
                r5 = r20
                long r5 = (long) r5
                r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                r9 = 4621819117588971520(0x4024000000000000, double:10.0)
                double r7 = java.lang.Math.pow(r9, r7)
                long r7 = java.lang.Math.round(r7)
                long r7 = r7 * r5
                long r7 = r7 + r3
                r3 = r16
                long r3 = (long) r3
                r5 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r5 = java.lang.Math.pow(r9, r5)
                long r5 = java.lang.Math.round(r5)
                long r5 = r5 * r3
                long r5 = r5 + r7
                long r3 = (long) r0
                r7 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r7 = java.lang.Math.pow(r9, r7)
                long r7 = java.lang.Math.round(r7)
                long r7 = r7 * r3
                long r7 = r7 + r5
                r2.ServerMultiSuccess = r7
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a
                java.lang.String r0 = r0.AirportCode
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0836
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a
                java.lang.String r2 = r0.ServerIp
                java.lang.String r2 = com.startapp.C12051m9.m52597a(r2)
                r0.AirportCode = r2
            L_0x0836:
                int r0 = r26.size()
                if (r0 <= 0) goto L_0x0841
                r7 = r26
                r1.m52008a((java.util.List<com.startapp.C11880e2>) r7)
            L_0x0841:
                com.startapp.t4 r0 = com.startapp.C12385v4.m53561b()
                boolean r0 = r0.CLEAR_CT_LOCATION_INFO()
                if (r0 == 0) goto L_0x0854
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a
                com.startapp.networkTest.data.LocationInfo r2 = new com.startapp.networkTest.data.LocationInfo
                r2.<init>()
                r0.LocationInfo = r2
            L_0x0854:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f52539a
                return r0
            L_0x0857:
                r0 = move-exception
                goto L_0x085c
            L_0x0859:
                r0 = move-exception
                r20 = r14
            L_0x085c:
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r18 = r4
                goto L_0x0870
            L_0x0866:
                r0 = move-exception
                r20 = r14
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
            L_0x0870:
                r19 = r20
                r14 = r24
                r4 = r25
                goto L_0x08c1
            L_0x0877:
                r0 = move-exception
                r25 = r4
                r20 = r14
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r19 = r20
                r14 = r24
                goto L_0x08c1
            L_0x0888:
                r25 = r4
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r4 = -1
                r0.DurationDNS = r4     // Catch:{ all -> 0x089d }
                java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x089d }
                java.lang.String r4 = "DNS Timeout"
                r0.<init>(r4)     // Catch:{ all -> 0x089d }
                throw r0     // Catch:{ all -> 0x089d }
            L_0x089d:
                r0 = move-exception
                r20 = r11
                r14 = r24
                r4 = r25
                goto L_0x08f8
            L_0x08a6:
                r0 = move-exception
                r25 = r4
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r20 = r11
                r14 = r24
                goto L_0x08f8
            L_0x08b5:
                r0 = move-exception
                r25 = r4
                r24 = r14
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
            L_0x08c1:
                r20 = r11
                goto L_0x08f8
            L_0x08c4:
                r0 = move-exception
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r9 = r5
                goto L_0x08de
            L_0x08ce:
                r0 = move-exception
                goto L_0x08d7
            L_0x08d0:
                r0 = move-exception
                goto L_0x08d5
            L_0x08d2:
                r0 = move-exception
                r24 = r11
            L_0x08d5:
                r27 = r14
            L_0x08d7:
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
            L_0x08de:
                r14 = 0
            L_0x08df:
                r20 = r24
                goto L_0x08f8
            L_0x08e2:
                r0 = move-exception
                r27 = r14
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                goto L_0x08f7
            L_0x08ed:
                r0 = move-exception
                r21 = 0
                r32 = r8
                r8 = r6
                r6 = r32
                r27 = r14
            L_0x08f7:
                r14 = 0
            L_0x08f8:
                com.startapp.a2 r5 = com.startapp.C11762a2.this     // Catch:{ all -> 0x092e }
                java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x092e }
                java.lang.String r5 = r5.m51990a((java.lang.String) r11)     // Catch:{ all -> 0x092e }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x092e }
                r11.<init>()     // Catch:{ all -> 0x092e }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f52539a     // Catch:{ all -> 0x092e }
                java.lang.String r1 = r15.ErrorReason     // Catch:{ all -> 0x092e }
                r11.append(r1)     // Catch:{ all -> 0x092e }
                r11.append(r5)     // Catch:{ all -> 0x092e }
                r11.append(r8)     // Catch:{ all -> 0x092e }
                java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x092e }
                r15.ErrorReason = r1     // Catch:{ all -> 0x092e }
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ all -> 0x092e }
                if (r14 == 0) goto L_0x0922
                r6.add(r10)
            L_0x0922:
                r1 = 1
                int r4 = r4 + r1
                r1 = r36
                r8 = r6
                r10 = r22
                r14 = r27
                r5 = 1
                goto L_0x029f
            L_0x092e:
                r0 = move-exception
                if (r14 == 0) goto L_0x0934
                r6.add(r10)
            L_0x0934:
                throw r0
            L_0x0935:
                r1 = r4
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11762a2.C11764b.doInBackground(java.lang.Void[]):com.startapp.networkTest.results.ConnectivityTestResult");
        }

        /* renamed from: a */
        public void onPostExecute(ConnectivityTestResult connectivityTestResult) {
            C11762a2.this.f52529e.mo46746f(SystemClock.elapsedRealtime());
            if (C11762a2.this.f52530f != null) {
                C11762a2.this.f52530f.onConnectivityTestResult(connectivityTestResult);
            }
            if (connectivityTestResult != null) {
                boolean z = false;
                if (C11762a2.this.f52529e.mo46770m() && connectivityTestResult.ServerIp.length() > 0) {
                    C11947i0 i0Var = new C11947i0(this, C11762a2.this.f52525a);
                    this.f52540b = i0Var;
                    i0Var.mo45422g(connectivityTestResult.CtId);
                    this.f52540b.mo45416b(connectivityTestResult.AirportCode);
                    this.f52540b.mo45420e(String.valueOf(connectivityTestResult.TimeInfo.TimestampMillis + connectivityTestResult.DurationDNS + connectivityTestResult.DurationTcpConnect + connectivityTestResult.DurationHttpReceive));
                    this.f52540b.mo45411a(C12385v4.m53561b().LTR_LOCATIONPROVIDER());
                    this.f52540b.mo45414a(connectivityTestResult.ServerIp, 10, 200, C11762a2.f52523p, 56, true);
                    z = true;
                }
                if (!z && C11762a2.this.f52530f != null) {
                    C11762a2.this.f52530f.mo45620a();
                }
            } else if (C11762a2.this.f52530f != null) {
                C11762a2.this.f52530f.mo45620a();
            }
        }

        /* renamed from: a */
        public void mo45081a(SpeedtestEngineStatus speedtestEngineStatus, SpeedtestEngineError speedtestEngineError, long j) {
            if (speedtestEngineStatus == SpeedtestEngineStatus.END || speedtestEngineStatus == SpeedtestEngineStatus.ABORTED) {
                this.f52540b.mo45417c();
                if (C11762a2.this.f52530f != null) {
                    C11762a2.this.f52530f.onLatencyTestResult((LatencyResult) this.f52540b.mo45410a());
                    C11762a2.this.f52530f.mo45620a();
                }
            }
        }

        /* renamed from: a */
        private List<C11880e2> m52007a(String[] strArr, CtCriteriaTypes ctCriteriaTypes) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Set<String> f = C12385v4.m53562c().mo46745f();
            LinkedList<C11880e2> linkedList3 = new LinkedList<>();
            if (f != null) {
                for (String a : f) {
                    C11880e2 e2Var = (C11880e2) C12028l5.m52556a(a, C11880e2.class);
                    if (e2Var != null) {
                        linkedList3.add(e2Var);
                    }
                }
            }
            for (String str : strArr) {
                C11880e2 e2Var2 = new C11880e2();
                e2Var2.address = str;
                linkedList2.add(e2Var2);
            }
            for (C11880e2 e2Var3 : linkedList3) {
                for (int i = 0; i < linkedList2.size(); i++) {
                    if (((C11880e2) linkedList2.get(i)).address.equals(e2Var3.address)) {
                        linkedList2.set(i, e2Var3);
                    }
                }
            }
            switch (C11763a.f52538a[ctCriteriaTypes.ordinal()]) {
                case 1:
                    return linkedList2;
                case 2:
                    Collections.shuffle(linkedList2, new Random(System.nanoTime()));
                    return new LinkedList(linkedList2);
                case 3:
                    Collections.sort(linkedList2, new C11765a());
                    return new LinkedList(linkedList2);
                case 4:
                    Collections.sort(linkedList2, new C11766b());
                    return new LinkedList(linkedList2);
                case 5:
                    Collections.sort(linkedList2, new C11767c());
                    return new LinkedList(linkedList2);
                case 6:
                    Collections.sort(linkedList2, new C11768d());
                    return new LinkedList(linkedList2);
                default:
                    return linkedList;
            }
        }

        /* renamed from: a */
        private void m52008a(List<C11880e2> list) {
            HashSet hashSet = new HashSet();
            for (C11880e2 e2Var : list) {
                hashSet.add(e2Var.toString());
            }
            C12385v4.m53562c().mo46726a((Set<String>) hashSet);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m52009a() {
            /*
                r4 = this;
                java.lang.String r0 = "ping -W 3 -c 1 -s 56 127.0.0.1"
                r1 = 0
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0044 }
                java.lang.Process r0 = r2.exec(r0)     // Catch:{ all -> 0x0044 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0044 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0044 }
                r3.<init>(r0)     // Catch:{ all -> 0x0044 }
                r2.<init>(r3)     // Catch:{ all -> 0x0044 }
                r2.readLine()     // Catch:{ all -> 0x0041 }
                java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0041 }
                if (r0 == 0) goto L_0x003d
                int r1 = r0.length()     // Catch:{ all -> 0x0041 }
                if (r1 <= 0) goto L_0x003d
                java.lang.String r1 = " "
                java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x0041 }
                int r0 = r0.length     // Catch:{ all -> 0x0041 }
                r1 = 8
                if (r0 != r1) goto L_0x003d
                r0 = 1
                r2.close()     // Catch:{ all -> 0x0038 }
                goto L_0x003c
            L_0x0038:
                r1 = move-exception
                com.startapp.C12356u2.m53524b(r1)
            L_0x003c:
                return r0
            L_0x003d:
                r2.close()     // Catch:{ all -> 0x004e }
                goto L_0x0052
            L_0x0041:
                r0 = move-exception
                r1 = r2
                goto L_0x0045
            L_0x0044:
                r0 = move-exception
            L_0x0045:
                com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x0052
                r1.close()     // Catch:{ all -> 0x004e }
                goto L_0x0052
            L_0x004e:
                r0 = move-exception
                com.startapp.C12356u2.m53524b(r0)
            L_0x0052:
                r0 = 0
                return r0
            L_0x0054:
                r0 = move-exception
                if (r1 == 0) goto L_0x005f
                r1.close()     // Catch:{ all -> 0x005b }
                goto L_0x005f
            L_0x005b:
                r1 = move-exception
                com.startapp.C12356u2.m53524b(r1)
            L_0x005f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11762a2.C11764b.m52009a():boolean");
        }
    }

    /* renamed from: a */
    public void mo45076a(C12144q7 q7Var) {
        this.f52530f = q7Var;
        if (Build.VERSION.SDK_INT < 11) {
            new C11764b().execute(new Void[0]);
        } else {
            new C11764b().executeOnExecutor(ThreadManager.m52679b().mo45624a(), new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m51990a(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}", "XXX").replaceAll("([A-Fa-f0-9]{1,4}::?){1,7}[A-Fa-f0-9]{1,4}", "XXX");
    }
}
