package com.startapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.j4 */
/* compiled from: Sta */
public class C11979j4 {

    /* renamed from: a */
    public final C11919g4 f53138a;

    /* renamed from: b */
    public final C12071n3 f53139b;

    /* renamed from: c */
    public final Executor f53140c;

    /* renamed from: d */
    public final C12462z2<Integer> f53141d;

    /* renamed from: e */
    public final C12459z1 f53142e;

    /* renamed from: f */
    public final C12125p4 f53143f;

    /* renamed from: g */
    public final C12462z2<AnalyticsConfig> f53144g;

    /* renamed from: h */
    public final Map<String, Pair<C11899f4, Long>> f53145h = new HashMap();

    /* renamed from: i */
    public final AtomicLong f53146i = new AtomicLong();

    /* renamed from: j */
    public final C12462z2<Void> f53147j = new C11980a();

    /* renamed from: k */
    public final Runnable f53148k = new C11981b();

    /* renamed from: l */
    public final C12462z2<Void> f53149l = new C11982c();

    /* renamed from: m */
    public final C11956i4 f53150m = new C11983d();

    /* renamed from: n */
    public final C12442y2<C5004d4, Void> f53151n = new C11986g();

    /* renamed from: com.startapp.j4$a */
    /* compiled from: Sta */
    public class C11980a implements C12462z2<Void> {
        public C11980a() {
        }

        public Object call() {
            try {
                C11979j4 j4Var = C11979j4.this;
                j4Var.f53139b.execute(new C12027l4(j4Var));
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.startapp.j4$b */
    /* compiled from: Sta */
    public class C11981b implements Runnable {
        public C11981b() {
        }

        public void run() {
            try {
                C11979j4.this.mo45474b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.startapp.j4$c */
    /* compiled from: Sta */
    public class C11982c implements C12462z2<Void> {
        public C11982c() {
        }

        public Object call() {
            try {
                C11979j4.this.mo45469a(0);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.startapp.j4$d */
    /* compiled from: Sta */
    public class C11983d implements C11956i4 {
        public C11983d() {
        }

        /* renamed from: a */
        public void mo45138a(C5004d4 d4Var, int i) {
            try {
                C11979j4 j4Var = C11979j4.this;
                j4Var.getClass();
                j4Var.f53139b.execute(new C12007k4(j4Var, d4Var, i, System.currentTimeMillis()));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.startapp.j4$e */
    /* compiled from: Sta */
    public class C11984e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5004d4 f53156a;

        /* renamed from: b */
        public final /* synthetic */ C11899f4 f53157b;

        /* renamed from: c */
        public final /* synthetic */ C11956i4 f53158c;

        public C11984e(C5004d4 d4Var, C11899f4 f4Var, C11956i4 i4Var) {
            this.f53156a = d4Var;
            this.f53157b = f4Var;
            this.f53158c = i4Var;
        }

        public void run() {
            int i;
            C11979j4 j4Var = C11979j4.this;
            C5004d4 d4Var = this.f53156a;
            C11899f4 f4Var = this.f53157b;
            C11956i4 i4Var = this.f53158c;
            j4Var.getClass();
            try {
                i = j4Var.f53138a.mo45375a(d4Var, f4Var) ? 2 : 3;
                if (i4Var == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (i4Var != null) {
                    i = 0;
                } else {
                    return;
                }
            }
            i4Var.mo45138a(d4Var, i);
        }
    }

    /* renamed from: com.startapp.j4$f */
    /* compiled from: Sta */
    public class C11985f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5004d4 f53160a;

        /* renamed from: b */
        public final /* synthetic */ C11899f4 f53161b;

        /* renamed from: c */
        public final /* synthetic */ C11956i4 f53162c;

        public C11985f(long j, C5004d4 d4Var, C11899f4 f4Var, C11956i4 i4Var) {
            this.f53160a = d4Var;
            this.f53161b = f4Var;
            this.f53162c = i4Var;
        }

        public void run() {
            C11979j4.this.mo45472a(this.f53160a, this.f53161b, this.f53162c);
        }
    }

    /* renamed from: com.startapp.j4$g */
    /* compiled from: Sta */
    public class C11986g implements C12442y2<C5004d4, Void> {
        public C11986g() {
        }

        /* renamed from: a */
        public Object mo45478a(Object obj) {
            C5004d4 d4Var = (C5004d4) obj;
            if (d4Var == null) {
                return null;
            }
            try {
                C11979j4.this.mo45470a(d4Var);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public C11979j4(C11919g4 g4Var, C12071n3 n3Var, Executor executor, C12462z2<Integer> z2Var, C12459z1 z1Var, C12125p4 p4Var, C12462z2<AnalyticsConfig> z2Var2) {
        this.f53138a = g4Var;
        this.f53139b = n3Var;
        this.f53140c = executor;
        this.f53141d = z2Var;
        this.f53142e = z1Var;
        this.f53143f = p4Var;
        this.f53144g = z2Var2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo45470a(C5004d4 d4Var) {
        C11899f4 a = mo45467a(d4Var.f22123a);
        long uptimeMillis = (this.f53146i.get() + a.f52939f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            mo45469a(uptimeMillis);
            return;
        }
        C11919g4 g4Var = this.f53138a;
        long currentTimeMillis = System.currentTimeMillis();
        g4Var.getClass();
        long j = d4Var.f22124b;
        C11919g4.m52334a(j, currentTimeMillis);
        SQLiteDatabase a2 = g4Var.mo45465a();
        a2.beginTransaction();
        try {
            int a3 = C11919g4.m52333a(a2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a3 + 1));
            a2.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            a2.setTransactionSuccessful();
            a2.endTransaction();
            mo45472a(d4Var, a, this.f53150m);
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo45474b() {
        this.f53139b.mo45564a(this.f53148k);
        if (!this.f53142e.mo46842a()) {
            AnalyticsConfig call = this.f53144g.call();
            long j = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
            if (call != null) {
                j = Math.max(DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS, C5015nb.m22935e(call.mo46313f()));
            }
            mo45469a(j);
            return;
        }
        Integer call2 = this.f53141d.call();
        int i = 1;
        int max = call2 != null ? Math.max(1, call2.intValue()) : 1;
        AnalyticsConfig call3 = this.f53144g.call();
        if (call3 != null) {
            i = Math.max(1, call3.mo46314g());
        }
        try {
            this.f53138a.mo45374a(this.f53151n, i, max);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo45468a() {
        ConnectivityManager.OnNetworkActiveListener onNetworkActiveListener;
        if (this.f53146i.compareAndSet(0, SystemClock.uptimeMillis())) {
            C11919g4 g4Var = this.f53138a;
            C12462z2<Void> z2Var = this.f53149l;
            synchronized (g4Var) {
                g4Var.f52980c.add(z2Var);
            }
            C12459z1 z1Var = this.f53142e;
            C12462z2<Void> z2Var2 = this.f53147j;
            synchronized (z1Var) {
                if (!z1Var.f55189d.contains(z2Var2)) {
                    z1Var.f55189d.add(z2Var2);
                }
            }
            C12459z1 z1Var2 = this.f53142e;
            if (!z1Var2.f55190e.getAndSet(true)) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) z1Var2.f55186a.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 24 && C12437y.m53782a(z1Var2.f55186a, "android.permission.ACCESS_NETWORK_STATE")) {
                            ConnectivityManager.NetworkCallback networkCallback = z1Var2.f55187b;
                            if (networkCallback != null) {
                                connectivityManager.registerDefaultNetworkCallback(networkCallback);
                            }
                        } else if (i >= 21 && (onNetworkActiveListener = z1Var2.f55188c) != null) {
                            connectivityManager.addDefaultNetworkActiveListener(onNetworkActiveListener);
                        }
                    }
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
            this.f53139b.execute(new C12027l4(this));
        }
    }

    /* renamed from: a */
    public final C11899f4 mo45467a(C11882e4 e4Var) {
        C11899f4 f4Var;
        Map<String, AnalyticsCategoryConfig> d;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f53145h) {
            Pair pair = this.f53145h.get(e4Var.f52899a);
            f4Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (C11899f4) pair.first;
        }
        if (f4Var != null) {
            return f4Var;
        }
        AnalyticsConfig call = this.f53144g.call();
        if (!(call == null || (d = call.mo46310d()) == null || (analyticsCategoryConfig = d.get(e4Var.f52899a)) == null)) {
            f4Var = new C11899f4(e4Var.f52900b, analyticsCategoryConfig);
        }
        if (f4Var == null) {
            f4Var = e4Var.f52900b;
        }
        synchronized (this.f53145h) {
            this.f53145h.put(e4Var.f52899a, new Pair(f4Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return f4Var;
    }

    /* renamed from: a */
    public void mo45473a(C5004d4 d4Var, C11956i4 i4Var) {
        AnalyticsConfig call = this.f53144g.call();
        if (call != null && !call.dns) {
            C11899f4 a = mo45467a(d4Var.f22123a);
            if (Math.random() < a.f52934a) {
                if (a.f52937d) {
                    this.f53139b.execute(new C11984e(d4Var, a, (C11956i4) null));
                } else if (this.f53142e.mo46842a()) {
                    long uptimeMillis = (this.f53146i.get() + a.f52939f) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0) {
                        this.f53139b.mo45565a(new C11985f(uptimeMillis, d4Var, a, (C11956i4) null), uptimeMillis);
                    } else {
                        mo45472a(d4Var, a, (C11956i4) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo45469a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f53139b.mo45565a(this.f53148k, j);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo45471a(C5004d4 d4Var, int i, long j) {
        if (i == 1) {
            C11919g4 g4Var = this.f53138a;
            g4Var.getClass();
            long j2 = d4Var.f22124b;
            C11919g4.m52334a(j2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j));
            g4Var.mo45465a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            mo45469a(0);
            return;
        }
        AnalyticsConfig call = this.f53144g.call();
        int max = call != null ? Math.max(1, call.mo46314g()) : 1;
        C11919g4 g4Var2 = this.f53138a;
        g4Var2.getClass();
        long j3 = d4Var.f22124b;
        C11919g4.m52334a(j3, j);
        SQLiteDatabase a = g4Var2.mo45465a();
        a.beginTransaction();
        try {
            if (C11919g4.m52333a(a, j3) >= max) {
                a.delete("events", "rowid = ?", new String[]{String.valueOf(j3)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j));
                a.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            AnalyticsConfig call2 = this.f53144g.call();
            long j4 = 1000;
            if (call2 != null) {
                j4 = Math.max(1000, call2.mo46315h());
            }
            mo45469a(j4);
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.startapp.n4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45472a(com.startapp.C5004d4 r9, com.startapp.C11899f4 r10, com.startapp.C11956i4 r11) {
        /*
            r8 = this;
            com.startapp.p4 r0 = r8.f53143f
            r0.getClass()
            if (r9 == 0) goto L_0x002a
            if (r10 != 0) goto L_0x000a
            goto L_0x002a
        L_0x000a:
            com.startapp.e4 r1 = com.startapp.C11882e4.f52893l
            com.startapp.e4 r2 = r9.f22123a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0022
            com.startapp.q4 r1 = new com.startapp.q4
            com.startapp.w1<com.startapp.u3> r3 = r0.f54006b
            com.startapp.w1<com.startapp.r8> r4 = r0.f54007c
            r2 = r1
            r5 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x002b
        L_0x0022:
            com.startapp.n4 r1 = new com.startapp.n4
            android.content.Context r0 = r0.f54005a
            r1.<init>(r0, r9, r10, r11)
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0033
            java.util.concurrent.Executor r9 = r8.f53140c
            r9.execute(r1)
            goto L_0x0039
        L_0x0033:
            if (r11 == 0) goto L_0x0039
            r10 = 0
            r11.mo45138a(r9, r10)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11979j4.mo45472a(com.startapp.d4, com.startapp.f4, com.startapp.i4):void");
    }
}
