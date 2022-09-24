package com.startapp.networkTest.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.startapp.C11886e8;
import com.startapp.C12356u2;
import com.startapp.C12388v6;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class CoverageMapperManager implements LocationController.C12083c, C11886e8 {

    /* renamed from: A */
    private static final int f53882A = 1000;

    /* renamed from: B */
    private static final int f53883B = 2000;

    /* renamed from: s */
    private static final String f53884s = "CoverageMapperManager";

    /* renamed from: t */
    private static final long f53885t = 1;

    /* renamed from: u */
    private static final long f53886u = 10000;

    /* renamed from: v */
    private static final long f53887v = 10000;

    /* renamed from: w */
    private static final int f53888w = 500;

    /* renamed from: x */
    private static final int f53889x = 10000;

    /* renamed from: y */
    private static final int f53890y = 1000;

    /* renamed from: z */
    private static final int f53891z = 1000;

    /* renamed from: a */
    private Context f53892a;

    /* renamed from: b */
    private C12388v6 f53893b;

    /* renamed from: c */
    private boolean f53894c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f53895d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ScheduledFuture<?> f53896e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f53897f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f53898g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f53899h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f53900i;

    /* renamed from: j */
    private int f53901j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f53902k;

    /* renamed from: l */
    private int f53903l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f53904m;

    /* renamed from: n */
    private OnNetworkInfoResultListener f53905n;

    /* renamed from: o */
    private Runnable f53906o = new C12089b();

    /* renamed from: p */
    private Runnable f53907p = new C12090c();

    /* renamed from: q */
    private Runnable f53908q = new C12091d();

    /* renamed from: r */
    private BroadcastReceiver f53909r = new C12092e();

    /* compiled from: Sta */
    public interface OnNetworkInfoResultListener {
        void onNetworkInfoResult(NetworkInformationResult networkInformationResult);
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$a */
    /* compiled from: Sta */
    public class C12088a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ LocationInfo f53910a;

        public C12088a(LocationInfo locationInfo) {
            this.f53910a = locationInfo;
        }

        public void run() {
            CoverageMapperManager.this.m52658a(this.f53910a, TriggerEvents.LocationUpdateGps, false);
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$b */
    /* compiled from: Sta */
    public class C12089b implements Runnable {
        public C12089b() {
        }

        public void run() {
            CoverageMapperManager.this.m52658a((LocationInfo) null, TriggerEvents.OutOfService, true);
            if (CoverageMapperManager.this.f53899h + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f53896e.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$c */
    /* compiled from: Sta */
    public class C12090c implements Runnable {
        public C12090c() {
        }

        public void run() {
            CoverageMapperManager.this.m52658a((LocationInfo) null, TriggerEvents.CellIdChange, true);
            if (CoverageMapperManager.this.f53902k + 1 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f53897f.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$d */
    /* compiled from: Sta */
    public class C12091d implements Runnable {
        public C12091d() {
        }

        public void run() {
            if (SystemClock.elapsedRealtime() > CoverageMapperManager.this.f53895d + SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                CoverageMapperManager.this.m52658a((LocationInfo) null, TriggerEvents.Foreground, false);
            }
            if (CoverageMapperManager.this.f53904m + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f53898g.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$e */
    /* compiled from: Sta */
    public class C12092e extends BroadcastReceiver {
        public C12092e() {
        }

        public void onReceive(Context context, Intent intent) {
            long unused = CoverageMapperManager.this.f53900i = SystemClock.elapsedRealtime();
        }
    }

    public CoverageMapperManager(Context context) {
        this.f53893b = new C12388v6(context);
        this.f53892a = context;
    }

    /* renamed from: d */
    private void m52663d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f53900i + ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS <= elapsedRealtime) {
            this.f53899h = elapsedRealtime;
            ScheduledFuture<?> scheduledFuture = this.f53896e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f53896e = ThreadManager.m52679b().mo45626d().scheduleWithFixedDelay(this.f53906o, 0, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public void mo45610b() {
        if (!this.f53894c) {
            this.f53894c = true;
            this.f53893b.mo46676a((C11886e8) this);
            this.f53893b.mo46677a((LocationController.C12083c) this);
            this.f53893b.mo46681e();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
            this.f53892a.registerReceiver(this.f53909r, intentFilter);
        }
    }

    /* renamed from: c */
    public void mo45611c() {
        this.f53904m = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f53898g;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f53898g = ThreadManager.m52679b().mo45626d().scheduleWithFixedDelay(this.f53908q, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public void mo45612e() {
        if (this.f53894c) {
            this.f53893b.mo46679b(this);
            this.f53893b.mo46680c();
            this.f53893b.mo46682f();
            try {
                this.f53892a.unregisterReceiver(this.f53909r);
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
            this.f53894c = false;
        }
    }

    /* renamed from: f */
    public void mo45613f() {
        ScheduledFuture<?> scheduledFuture = this.f53898g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public void mo45609a(OnNetworkInfoResultListener onNetworkInfoResultListener) {
        this.f53905n = onNetworkInfoResultListener;
    }

    /* renamed from: a */
    public void mo45587a(LocationInfo locationInfo) {
        if (locationInfo.LocationProvider == LocationProviders.Gps) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f53895d + 500) {
                this.f53895d = elapsedRealtime;
                ThreadManager.m52679b().mo45624a().execute(new C12088a(locationInfo));
            }
        }
    }

    /* renamed from: a */
    public void mo45328a(ServiceState serviceState, int i) {
        if (this.f53893b.mo46678b().mo45245b().DefaultDataSimId == i) {
            int state = serviceState.getState();
            if (state == 1 && this.f53901j == 0) {
                m52663d();
            }
            this.f53901j = state;
        }
    }

    /* renamed from: a */
    public void mo45327a(CellLocation cellLocation, int i) {
        int i2;
        if (this.f53893b.mo46678b().mo45245b().DefaultDataSimId == i && cellLocation != null) {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                i2 = ((GsmCellLocation) cellLocation).getCid();
            } else {
                i2 = cellLocation.getClass().equals(CdmaCellLocation.class) ? ((CdmaCellLocation) cellLocation).getBaseStationId() : -1;
            }
            int i3 = this.f53903l;
            if (i2 != i3 && i3 != -1 && i2 > 0 && i2 != Integer.MAX_VALUE) {
                this.f53903l = i2;
                m52657a();
            } else if (i2 > 0 && i2 < Integer.MAX_VALUE) {
                this.f53903l = i2;
            }
        }
    }

    /* renamed from: a */
    private void m52657a() {
        this.f53902k = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f53897f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f53897f = ThreadManager.m52679b().mo45626d().scheduleWithFixedDelay(this.f53907p, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52658a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z) {
        NetworkInformationResult networkInformationResult;
        if (locationInfo == null) {
            networkInformationResult = this.f53893b.mo46675a(triggerEvents, z);
        } else {
            networkInformationResult = this.f53893b.mo46674a(locationInfo, triggerEvents, z);
        }
        OnNetworkInfoResultListener onNetworkInfoResultListener = this.f53905n;
        if (onNetworkInfoResultListener != null) {
            onNetworkInfoResultListener.onNetworkInfoResult(networkInformationResult);
        }
    }
}
