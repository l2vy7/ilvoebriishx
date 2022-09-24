package com.startapp.networkTest.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.startapp.C11762a2;
import com.startapp.C11787a9;
import com.startapp.C12028l5;
import com.startapp.C12144q7;
import com.startapp.C12356u2;
import com.startapp.C12385v4;
import com.startapp.C12422x2;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.startapp.CoverageMapperManager;

/* compiled from: Sta */
public final class NetworkTester {
    private static final String CTLT_CHECK_INTERVAL_KEY = "StartappCtLtCheckIntervalKey";
    private static final String CTLT_GUARD_DIFF_KEY = "StartappGuardDiffKey";
    private static final String CTLT_PREV_TIME_CHECK_KEY = "StartappCtLtPrevTimeCheckKey";
    public static final String LOG_TAG = "NetworkTester";
    private static final String P3WRAPPER_PREFS = "StartappP3WrapperPrefs";
    @SuppressLint({"StaticFieldLeak"})
    public static NetworkTester sInstance;
    public Thread mActiveThread;
    public ConnectivityTestListener mConnectivityTestListener;
    private Context mContext;
    public CoverageMapperManager mCoverageMapper;
    public C12422x2 mForegroundTestManager;

    /* compiled from: Sta */
    public static final class Config {
        public String CONNECTIVITY_TEST_CDNCONFIG_URL = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
        public boolean CONNECTIVITY_TEST_ENABLED = true;
        public String CONNECTIVITY_TEST_FILENAME = "/favicon.ico";
        public String CONNECTIVITY_TEST_HOSTNAME = "d2to8y50b3n6dq.cloudfront.net";
        public boolean CT_COLLECT_CELLINFO = true;
        public boolean FOREGROUND_TEST_CT_ENABLED = true;
        public long FOREGROUND_TEST_CT_MIN_INTERVAL = 180000;
        public long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
        public boolean FOREGROUND_TEST_NIR_ENABLED = true;
        public String GEOIP_URL = "https://geoip.api.c0nnectthed0ts.com/geoip/";
        public boolean NIR_COLLECT_CELLINFO = true;
        public int NIR_COLLECT_CELLINFO_THRESHOLD = 2;
        public String PROJECT_ID = "20050";
    }

    /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a */
    /* compiled from: Sta */
    public class C12093a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f53916a;

        /* renamed from: b */
        public final /* synthetic */ C12096b f53917b;

        /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a */
        /* compiled from: Sta */
        public class C12094a implements C12144q7 {

            /* renamed from: a */
            public final /* synthetic */ boolean[] f53918a;

            /* renamed from: b */
            public final /* synthetic */ Looper f53919b;

            /* renamed from: c */
            public final /* synthetic */ C11762a2 f53920c;

            /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a$a */
            /* compiled from: Sta */
            public class C12095a implements Runnable {
                public C12095a() {
                }

                public void run() {
                    C12093a.this.f53917b.mo45381a(false);
                }
            }

            public C12094a(boolean[] zArr, Looper looper, C11762a2 a2Var) {
                this.f53918a = zArr;
                this.f53919b = looper;
                this.f53920c = a2Var;
            }

            /* renamed from: a */
            public void mo45620a() {
                this.f53920c.mo45077b();
                Looper looper = this.f53919b;
                if (looper != null) {
                    NetworkTester.sInstance.mActiveThread = null;
                    looper.quit();
                }
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestFinished(new C11787a9(new C12095a()));
                } else {
                    C12093a.this.f53917b.mo45381a(false);
                }
            }

            public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
                boolean[] zArr = this.f53918a;
                if (zArr[0]) {
                    Looper looper = this.f53919b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        C12093a.this.f53917b.mo45381a(false);
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestResult(connectivityTestResult);
                }
            }

            public void onLatencyTestResult(LatencyResult latencyResult) {
                boolean[] zArr = this.f53918a;
                if (zArr[1]) {
                    Looper looper = this.f53919b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        C12093a.this.f53917b.mo45381a(false);
                        return;
                    }
                    return;
                }
                zArr[1] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onLatencyTestResult(latencyResult);
                }
            }
        }

        public C12093a(Context context, C12096b bVar) {
            this.f53916a = context;
            this.f53917b = bVar;
        }

        public void run() {
            Looper.prepare();
            Looper myLooper = Looper.myLooper();
            C11762a2 a2Var = new C11762a2(this.f53916a.getApplicationContext());
            a2Var.mo45075a();
            a2Var.mo45076a((C12144q7) new C12094a(new boolean[2], myLooper, a2Var));
            Looper.loop();
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.NetworkTester$b */
    /* compiled from: Sta */
    public interface C12096b {
        /* renamed from: a */
        void mo45381a(boolean z);
    }

    private NetworkTester() {
    }

    public static void init(Context context, Config config) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (config != null) {
            String a = C12028l5.m52559a(config);
            if (a == null) {
                throw new IllegalArgumentException("Wrong format of config");
            } else if (sInstance == null) {
                NetworkTester networkTester = new NetworkTester();
                sInstance = networkTester;
                networkTester.mContext = context;
                C12385v4.m53559a(context, a.getBytes());
                sInstance.mCoverageMapper = new CoverageMapperManager(context);
                if (Build.VERSION.SDK_INT >= 14) {
                    sInstance.mForegroundTestManager = new C12422x2(context, sInstance.mCoverageMapper);
                }
            }
        } else {
            throw new IllegalArgumentException("config is null");
        }
    }

    public static int isAppInForeground() {
        C12422x2 x2Var;
        NetworkTester networkTester = sInstance;
        if (networkTester == null || (x2Var = networkTester.mForegroundTestManager) == null) {
            return -1;
        }
        return x2Var.mo46793d();
    }

    public static boolean isPermissionGranted(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return false;
        }
    }

    public static void runTests(Context context, C12096b bVar) {
        CoverageMapperManager coverageMapperManager;
        CoverageMapperManager coverageMapperManager2;
        if (sInstance == null) {
            bVar.mo45381a(false);
        } else if (isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION") || isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(P3WRAPPER_PREFS, 0);
            long j = sharedPreferences.getLong(CTLT_GUARD_DIFF_KEY, 120000);
            if (System.currentTimeMillis() - sharedPreferences.getLong(CTLT_PREV_TIME_CHECK_KEY, 0) < sharedPreferences.getLong(CTLT_CHECK_INTERVAL_KEY, j) - j) {
                bVar.mo45381a(false);
            } else if (!C12385v4.m53567h()) {
                bVar.mo45381a(false);
            } else if (sInstance.mActiveThread != null) {
                bVar.mo45381a(false);
            } else {
                sharedPreferences.edit().putLong(CTLT_PREV_TIME_CHECK_KEY, System.currentTimeMillis()).commit();
                NetworkTester networkTester = sInstance;
                if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
                    coverageMapperManager.mo45610b();
                }
                if (networkTester != null) {
                    networkTester.mActiveThread = new Thread(new C11787a9(new C12093a(context, bVar)));
                }
                sInstance.mActiveThread.start();
            }
        } else {
            NetworkTester networkTester2 = sInstance;
            if (!(networkTester2 == null || (coverageMapperManager2 = networkTester2.mCoverageMapper) == null)) {
                coverageMapperManager2.mo45612e();
            }
            bVar.mo45381a(false);
        }
    }

    public static void setOnConnectivityLatencyListener(ConnectivityTestListener connectivityTestListener) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            networkTester.mConnectivityTestListener = connectivityTestListener;
        }
    }

    public static void setOnNetworkInfoListener(CoverageMapperManager.OnNetworkInfoResultListener onNetworkInfoResultListener) {
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (networkTester != null && (coverageMapperManager = networkTester.mCoverageMapper) != null) {
            coverageMapperManager.mo45609a(onNetworkInfoResultListener);
        }
    }

    public static void startListening(long j, long j2) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            SharedPreferences sharedPreferences = networkTester.mContext.getSharedPreferences(P3WRAPPER_PREFS, 0);
            sharedPreferences.edit().putLong(CTLT_CHECK_INTERVAL_KEY, j).commit();
            sharedPreferences.edit().putLong(CTLT_GUARD_DIFF_KEY, j2).commit();
            CoverageMapperManager coverageMapperManager = networkTester.mCoverageMapper;
            if (coverageMapperManager != null) {
                coverageMapperManager.mo45610b();
            }
            C12422x2 x2Var = networkTester.mForegroundTestManager;
            if (x2Var != null) {
                x2Var.mo46794e();
            }
        }
    }

    public static void stopListening() {
        C12422x2 x2Var;
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
            coverageMapperManager.mo45612e();
        }
        if (networkTester != null && Build.VERSION.SDK_INT >= 14 && (x2Var = networkTester.mForegroundTestManager) != null) {
            x2Var.mo46795h();
        }
    }
}
