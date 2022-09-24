package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C3642m;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
/* compiled from: AttributionIdentifiers */
public class C3459b {

    /* renamed from: f */
    private static final String f13019f = "com.facebook.internal.b";

    /* renamed from: g */
    private static C3459b f13020g;

    /* renamed from: a */
    private String f13021a;

    /* renamed from: b */
    private String f13022b;

    /* renamed from: c */
    private String f13023c;

    /* renamed from: d */
    private boolean f13024d;

    /* renamed from: e */
    private long f13025e;

    /* renamed from: com.facebook.internal.b$b */
    /* compiled from: AttributionIdentifiers */
    private static final class C3461b implements IInterface {

        /* renamed from: b */
        private IBinder f13026b;

        C3461b(IBinder iBinder) {
            this.f13026b = iBinder;
        }

        public IBinder asBinder() {
            return this.f13026b;
        }

        /* renamed from: b2 */
        public boolean mo11922b2() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f13026b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: x */
        public String mo11923x() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f13026b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.internal.b$c */
    /* compiled from: AttributionIdentifiers */
    private static final class C3462c implements ServiceConnection {

        /* renamed from: b */
        private AtomicBoolean f13027b;

        /* renamed from: c */
        private final BlockingQueue<IBinder> f13028c;

        private C3462c() {
            this.f13027b = new AtomicBoolean(false);
            this.f13028c = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo11924a() throws InterruptedException {
            if (!this.f13027b.compareAndSet(true, true)) {
                return this.f13028c.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f13028c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C3459b m11539a(C3459b bVar) {
        bVar.f13025e = System.currentTimeMillis();
        f13020g = bVar;
        return bVar;
    }

    /* renamed from: c */
    private static C3459b m11540c(Context context) {
        C3459b d = m11541d(context);
        if (d != null) {
            return d;
        }
        C3459b e = m11542e(context);
        return e == null ? new C3459b() : e;
    }

    /* renamed from: d */
    private static C3459b m11541d(Context context) {
        Method A;
        Object H;
        try {
            if (!m11545j(context) || (A = C3481f0.m11590A("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (H = C3481f0.m11597H((Object) null, A, context)) == null) {
                return null;
            }
            Method z = C3481f0.m11661z(H.getClass(), "getId", new Class[0]);
            Method z2 = C3481f0.m11661z(H.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (z != null) {
                if (z2 != null) {
                    C3459b bVar = new C3459b();
                    bVar.f13022b = (String) C3481f0.m11597H(H, z, new Object[0]);
                    bVar.f13024d = ((Boolean) C3481f0.m11597H(H, z2, new Object[0])).booleanValue();
                    return bVar;
                }
            }
            return null;
        } catch (Exception e) {
            C3481f0.m11608S("android_id", e);
            return null;
        }
    }

    /* renamed from: e */
    private static C3459b m11542e(Context context) {
        C3462c cVar = new C3462c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, cVar, 1)) {
            try {
                C3461b bVar = new C3461b(cVar.mo11924a());
                C3459b bVar2 = new C3459b();
                bVar2.f13022b = bVar.mo11923x();
                bVar2.f13024d = bVar.mo11922b2();
                return bVar2;
            } catch (Exception e) {
                C3481f0.m11608S("android_id", e);
            } finally {
                context.unbindService(cVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C3459b m11543h(android.content.Context r12) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            com.facebook.internal.b r3 = m11540c(r12)
            r4 = 0
            android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == r6) goto L_0x00d1
            com.facebook.internal.b r5 = f13020g     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x002a
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            com.facebook.internal.b r7 = f13020g     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            long r8 = r7.f13025e     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            long r5 = r5 - r8
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x002a
            return r7
        L_0x002a:
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
            r8 = 0
            android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.content.pm.PackageManager r6 = r12.getPackageManager()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            boolean r5 = com.facebook.internal.C3504i.m11735b(r12, r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x0053:
            r6 = r5
            goto L_0x0067
        L_0x0055:
            if (r6 == 0) goto L_0x0066
            java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            boolean r5 = com.facebook.internal.C3504i.m11735b(r12, r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            goto L_0x0053
        L_0x0066:
            r6 = r4
        L_0x0067:
            java.lang.String r5 = m11544i(r12)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x006f
            r3.f13023c = r5     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x006f:
            if (r6 != 0) goto L_0x0076
            com.facebook.internal.b r12 = m11539a(r3)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            return r12
        L_0x0076:
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r12 == 0) goto L_0x00be
            boolean r5 = r12.moveToFirst()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r5 != 0) goto L_0x008a
            goto L_0x00be
        L_0x008a:
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            int r1 = r12.getColumnIndex(r1)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f13021a = r2     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r1 <= 0) goto L_0x00b6
            if (r0 <= 0) goto L_0x00b6
            java.lang.String r2 = r3.mo11917b()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r2 != 0) goto L_0x00b6
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f13022b = r1     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f13024d = r0     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
        L_0x00b6:
            r12.close()
            com.facebook.internal.b r12 = m11539a(r3)
            return r12
        L_0x00be:
            com.facebook.internal.b r0 = m11539a(r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r12 == 0) goto L_0x00c7
            r12.close()
        L_0x00c7:
            return r0
        L_0x00c8:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x00ff
        L_0x00cc:
            r0 = move-exception
            r11 = r0
            r0 = r12
            r12 = r11
            goto L_0x00dd
        L_0x00d1:
            com.facebook.j r12 = new com.facebook.j     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r12.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            throw r12     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x00d9:
            r12 = move-exception
            goto L_0x00ff
        L_0x00db:
            r12 = move-exception
            r0 = r4
        L_0x00dd:
            java.lang.String r1 = f13019f     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r2.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00fd }
            r2.append(r12)     // Catch:{ all -> 0x00fd }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x00fd }
            com.facebook.internal.C3481f0.m11609T(r1, r12)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00fc
            r0.close()
        L_0x00fc:
            return r4
        L_0x00fd:
            r12 = move-exception
            r4 = r0
        L_0x00ff:
            if (r4 == 0) goto L_0x0104
            r4.close()
        L_0x0104:
            goto L_0x0106
        L_0x0105:
            throw r12
        L_0x0106:
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3459b.m11543h(android.content.Context):com.facebook.internal.b");
    }

    /* renamed from: i */
    private static String m11544i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: j */
    private static boolean m11545j(Context context) {
        Method A = C3481f0.m11590A("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (A == null) {
            return false;
        }
        Object H = C3481f0.m11597H((Object) null, A, context);
        return (H instanceof Integer) && ((Integer) H).intValue() == 0;
    }

    /* renamed from: l */
    public static boolean m11546l(Context context) {
        C3459b h = m11543h(context);
        return h != null && h.mo11920k();
    }

    /* renamed from: b */
    public String mo11917b() {
        if (!C3642m.m12296v() || !C3642m.m12278d()) {
            return null;
        }
        return this.f13022b;
    }

    /* renamed from: f */
    public String mo11918f() {
        return this.f13023c;
    }

    /* renamed from: g */
    public String mo11919g() {
        return this.f13021a;
    }

    /* renamed from: k */
    public boolean mo11920k() {
        return this.f13024d;
    }
}
