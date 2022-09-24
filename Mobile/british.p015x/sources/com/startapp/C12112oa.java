package com.startapp;

import android.location.Location;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.TimeSources;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.Date;

/* renamed from: com.startapp.oa */
/* compiled from: Sta */
public class C12112oa {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f53967j = "oa";

    /* renamed from: k */
    private static final String f53968k = "0.de.pool.ntp.org";

    /* renamed from: l */
    private static final long f53969l = 28800000;

    /* renamed from: m */
    private static final int f53970m = 10000;

    /* renamed from: n */
    private static final int f53971n = 30000;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f53972a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f53973b = false;

    /* renamed from: c */
    private boolean f53974c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f53975d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f53976e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f53977f = -1;

    /* renamed from: g */
    private long f53978g = -1;

    /* renamed from: h */
    private long f53979h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12394v9 f53980i = new C12394v9();

    public C12112oa() {
        if (C12385v4.m53561b().NTP_SYNC_ENABLED()) {
            m52719g();
        }
    }

    /* renamed from: d */
    public static long m52716d() {
        return C12385v4.m53565f().m52718f();
    }

    /* renamed from: e */
    public static TimeInfo m52717e() {
        return C12385v4.m53565f().m52715c();
    }

    /* renamed from: f */
    private long m52718f() {
        long j;
        long elapsedRealtime;
        long j2;
        if (this.f53974c && this.f53978g > this.f53976e) {
            if (SystemClock.elapsedRealtime() - this.f53976e > f53969l) {
                m52712b();
            }
            j = this.f53979h;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.f53978g;
        } else if (this.f53973b) {
            if (SystemClock.elapsedRealtime() - this.f53976e > f53969l) {
                m52712b();
            }
            j = this.f53977f;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.f53976e;
        } else {
            m52712b();
            return System.currentTimeMillis();
        }
        return (elapsedRealtime - j2) + j;
    }

    /* renamed from: g */
    private void m52719g() {
        if (Build.VERSION.SDK_INT < 11) {
            new C12113a().execute(new Void[0]);
        } else {
            new C12113a().executeOnExecutor(ThreadManager.m52679b().mo45624a(), new Void[0]);
        }
    }

    /* renamed from: c */
    private TimeInfo m52715c() {
        long j;
        TimeInfo timeInfo = new TimeInfo();
        boolean z = this.f53973b;
        timeInfo.IsSynced = z || this.f53974c;
        if (this.f53974c && this.f53978g > this.f53976e) {
            j = (SystemClock.elapsedRealtime() - this.f53978g) + this.f53979h;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j;
            timeInfo.MillisSinceLastSync = j - this.f53979h;
            timeInfo.TimeSource = TimeSources.GPS;
            if (SystemClock.elapsedRealtime() - this.f53976e > f53969l) {
                m52712b();
            }
        } else if (z) {
            if (SystemClock.elapsedRealtime() - this.f53976e > f53969l) {
                m52712b();
            }
            j = (SystemClock.elapsedRealtime() - this.f53976e) + this.f53977f;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j;
            timeInfo.MillisSinceLastSync = j - this.f53977f;
            timeInfo.TimeSource = TimeSources.NTP;
        } else {
            m52712b();
            j = System.currentTimeMillis();
            timeInfo.TimeSource = TimeSources.Device;
        }
        timeInfo.setMillis(j);
        return timeInfo;
    }

    /* renamed from: b */
    private void m52712b() {
        if (C12385v4.m53561b().NTP_SYNC_ENABLED() && !this.f53972a && SystemClock.elapsedRealtime() - this.f53975d > 30000) {
            m52719g();
        }
    }

    /* renamed from: a */
    public void mo45643a(Location location) {
        this.f53979h = location.getTime();
        this.f53978g = SystemClock.elapsedRealtime();
        this.f53974c = true;
    }

    /* renamed from: com.startapp.oa$a */
    /* compiled from: Sta */
    public class C12113a extends AsyncTask<Void, Void, Void> {
        public C12113a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                String unused = C12112oa.f53967j;
                if (C12112oa.this.f53980i.mo46685a(C12112oa.f53968k, 10000)) {
                    long a = C12112oa.this.f53980i.mo46684a();
                    if (a <= 1458564533202L || a >= 3468524400000L) {
                        return null;
                    }
                    long unused2 = C12112oa.this.f53976e = SystemClock.elapsedRealtime();
                    long unused3 = C12112oa.this.f53977f = a;
                    String unused4 = C12112oa.f53967j;
                    new Date(C12112oa.this.f53977f).toString();
                    boolean unused5 = C12112oa.this.f53973b = true;
                    return null;
                }
                String unused6 = C12112oa.f53967j;
                long unused7 = C12112oa.this.f53975d = SystemClock.elapsedRealtime();
                return null;
            } catch (Throwable th) {
                C12356u2.m53522a(th);
                return null;
            }
        }

        public void onPreExecute() {
            boolean unused = C12112oa.this.f53972a = true;
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            boolean unused = C12112oa.this.f53972a = false;
        }
    }
}
