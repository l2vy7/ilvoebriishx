package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.startapp.C11882e4;
import com.startapp.C12172s;
import com.startapp.C12335t;
import com.startapp.C12437y;
import com.startapp.C12462z2;
import com.startapp.C5004d4;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Sta */
public class AdvertisingIdResolver {

    /* renamed from: a */
    public final Context f54685a;

    /* renamed from: b */
    public final ThreadFactory f54686b;

    /* renamed from: c */
    public final C12462z2<AdvertisingIdResolverMetadata> f54687c;

    /* renamed from: d */
    public final Lock f54688d;

    /* renamed from: e */
    public final Condition f54689e;

    /* renamed from: f */
    public final AtomicReference<C12172s> f54690f = new AtomicReference<>();

    /* renamed from: g */
    public volatile int f54691g = 0;

    /* renamed from: h */
    public final double f54692h = Math.random();

    /* renamed from: i */
    public int f54693i;

    /* compiled from: Sta */
    public static class InternalException extends Exception {
        private static final long serialVersionUID = -3951983339713608735L;
        public final int infoEventFlags;

        public InternalException(int i) {
            super(String.valueOf(i));
            this.infoEventFlags = i;
        }
    }

    public AdvertisingIdResolver(Context context, ThreadFactory threadFactory, C12462z2<AdvertisingIdResolverMetadata> z2Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f54688d = reentrantLock;
        this.f54689e = reentrantLock.newCondition();
        this.f54685a = context;
        this.f54686b = threadFactory;
        this.f54687c = z2Var;
    }

    /* renamed from: a */
    public boolean mo46443a(int i) {
        AdvertisingIdResolverMetadata call = this.f54687c.call();
        if (call == null || !call.mo46287c()) {
            call = null;
        }
        if (call == null || this.f54692h >= call.mo46286b() || (call.mo46285a() & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo46445b(int i) {
        if (mo46443a(i)) {
            int i2 = this.f54693i;
            if (!((i2 & i) == i)) {
                this.f54693i = i2 | i;
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "AIR";
                d4Var.f22127e = String.valueOf(i);
                d4Var.mo20661a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r9.f54685a.checkSelfPermission("com.google.android.gms.permission.AD_ID") == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        r2 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.C12172s mo46442a() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<com.startapp.s> r0 = r9.f54690f
            java.lang.Object r0 = r0.get()
            com.startapp.s r0 = (com.startapp.C12172s) r0
            if (r0 != 0) goto L_0x00ca
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            r2 = 1
            if (r0 != r1) goto L_0x001f
            r9.mo46445b((int) r2)
            com.startapp.s r0 = com.startapp.C12172s.f54120d
            return r0
        L_0x001f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00bc }
            r3 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.locks.Lock r5 = r9.f54688d     // Catch:{ all -> 0x00bc }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00bc }
            boolean r5 = r5.tryLock(r3, r6)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x00b4
            int r5 = r9.f54691g     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x0043
            java.util.concurrent.ThreadFactory r5 = r9.f54686b     // Catch:{ all -> 0x00ad }
            com.startapp.sdk.common.advertisingid.a r6 = new com.startapp.sdk.common.advertisingid.a     // Catch:{ all -> 0x00ad }
            r6.<init>(r9)     // Catch:{ all -> 0x00ad }
            java.lang.Thread r5 = r5.newThread(r6)     // Catch:{ all -> 0x00ad }
            r5.start()     // Catch:{ all -> 0x00ad }
            r9.f54691g = r2     // Catch:{ all -> 0x00ad }
        L_0x0043:
            int r5 = r9.f54691g     // Catch:{ all -> 0x00ad }
            r6 = 2
            if (r5 == r6) goto L_0x0066
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ad }
            long r7 = r7 - r0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x005c
            r9.mo46445b((int) r6)     // Catch:{ all -> 0x00ad }
            com.startapp.s r0 = com.startapp.C12172s.f54120d     // Catch:{ all -> 0x00ad }
            java.util.concurrent.locks.Lock r1 = r9.f54688d     // Catch:{ all -> 0x00bc }
            r1.unlock()     // Catch:{ all -> 0x00bc }
            return r0
        L_0x005c:
            java.util.concurrent.locks.Condition r5 = r9.f54689e     // Catch:{ all -> 0x00ad }
            long r7 = r3 - r7
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ad }
            r5.await(r7, r6)     // Catch:{ all -> 0x00ad }
            goto L_0x0043
        L_0x0066:
            java.util.concurrent.atomic.AtomicReference<com.startapp.s> r0 = r9.f54690f     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
            com.startapp.s r0 = (com.startapp.C12172s) r0     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0077
            r0 = 4
            r9.mo46445b((int) r0)     // Catch:{ all -> 0x00ad }
            com.startapp.s r0 = com.startapp.C12172s.f54120d     // Catch:{ all -> 0x00ad }
            goto L_0x00a7
        L_0x0077:
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
            java.lang.String r3 = r0.f54121a     // Catch:{ all -> 0x00ad }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x00a7
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ad }
            r3 = 31
            if (r1 >= r3) goto L_0x0088
            goto L_0x00a0
        L_0x0088:
            android.content.Context r1 = r9.f54685a     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "com.google.android.gms.permission.AD_ID"
            int r1 = r1.checkSelfPermission(r3)     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x009f
            goto L_0x00a0
        L_0x0093:
            r1 = move-exception
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r9.mo46443a((int) r2)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x009f
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)     // Catch:{ all -> 0x00ad }
        L_0x009f:
            r2 = 0
        L_0x00a0:
            if (r2 != 0) goto L_0x00a7
            r1 = 4096(0x1000, float:5.74E-42)
            r9.mo46445b((int) r1)     // Catch:{ all -> 0x00ad }
        L_0x00a7:
            java.util.concurrent.locks.Lock r1 = r9.f54688d     // Catch:{ all -> 0x00bc }
            r1.unlock()     // Catch:{ all -> 0x00bc }
            goto L_0x00ca
        L_0x00ad:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r9.f54688d     // Catch:{ all -> 0x00bc }
            r1.unlock()     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00b4:
            r0 = 8
            r9.mo46445b((int) r0)     // Catch:{ all -> 0x00bc }
            com.startapp.s r0 = com.startapp.C12172s.f54120d     // Catch:{ all -> 0x00bc }
            goto L_0x00ca
        L_0x00bc:
            r0 = move-exception
            r1 = 32
            boolean r1 = r9.mo46443a((int) r1)
            if (r1 == 0) goto L_0x00c8
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00c8:
            com.startapp.s r0 = com.startapp.C12172s.f54120d
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.AdvertisingIdResolver.mo46442a():com.startapp.s");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46444b() {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            java.util.concurrent.locks.Lock r2 = r3.f54688d     // Catch:{ all -> 0x0025 }
            boolean r2 = r2.tryLock()     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0021
            int r1 = r3.f54691g     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0022
            java.util.concurrent.ThreadFactory r1 = r3.f54686b     // Catch:{ all -> 0x001f }
            com.startapp.sdk.common.advertisingid.a r2 = new com.startapp.sdk.common.advertisingid.a     // Catch:{ all -> 0x001f }
            r2.<init>(r3)     // Catch:{ all -> 0x001f }
            java.lang.Thread r1 = r1.newThread(r2)     // Catch:{ all -> 0x001f }
            r1.start()     // Catch:{ all -> 0x001f }
            r3.f54691g = r0     // Catch:{ all -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r1 = move-exception
            goto L_0x0028
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x003a
            goto L_0x0035
        L_0x0025:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L_0x0028:
            r2 = 16
            boolean r2 = r3.mo46443a((int) r2)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0033
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)     // Catch:{ all -> 0x003b }
        L_0x0033:
            if (r0 == 0) goto L_0x003a
        L_0x0035:
            java.util.concurrent.locks.Lock r0 = r3.f54688d
            r0.unlock()
        L_0x003a:
            return
        L_0x003b:
            r1 = move-exception
            if (r0 == 0) goto L_0x0043
            java.util.concurrent.locks.Lock r0 = r3.f54688d
            r0.unlock()
        L_0x0043:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.AdvertisingIdResolver.mo46444b():void");
    }

    /* renamed from: b */
    public static C12172s m53420b(Context context) throws Exception {
        C12335t tVar;
        Parcel obtain;
        Parcel obtain2;
        Parcel obtain3;
        Parcel obtain4;
        try {
            boolean z = false;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            tVar = new C12335t();
            try {
                if (!context.bindService(intent, tVar, 1)) {
                    throw new InternalException(2048);
                } else if (!tVar.f54756b) {
                    IBinder take = tVar.f54755a.take();
                    if (take != null) {
                        tVar.f54756b = true;
                        obtain = Parcel.obtain();
                        obtain2 = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        take.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        String readString = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                        if (readString != null) {
                            obtain3 = Parcel.obtain();
                            obtain4 = Parcel.obtain();
                            obtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            obtain3.writeInt(1);
                            take.transact(2, obtain3, obtain4, 0);
                            obtain4.readException();
                            if (obtain4.readInt() != 0) {
                                z = true;
                            }
                            obtain4.recycle();
                            obtain3.recycle();
                            C12172s sVar = new C12172s(readString, "DEVICE", z);
                            C12437y.m53777a(context, (ServiceConnection) tVar);
                            return sVar;
                        }
                        throw new RemoteException();
                    }
                    throw new IllegalStateException();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                th = th;
                C12437y.m53777a(context, (ServiceConnection) tVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = null;
            C12437y.m53777a(context, (ServiceConnection) tVar);
            throw th;
        }
    }

    /* renamed from: a */
    public static C12172s m53419a(Context context) throws Exception {
        Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        if (invoke != null) {
            String str = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (str == null || str.length() < 1) {
                throw new InternalException(1024);
            }
            return new C12172s(str, "APP", Boolean.TRUE.equals((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])));
        }
        throw new InternalException(512);
    }
}
