package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
abstract class C8205tv<T> {

    /* renamed from: a */
    private static final C7554bx f39542a;

    static {
        C7554bx bxVar = null;
        try {
            Object newInstance = C8169sv.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                co0.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    bxVar = queryLocalInterface instanceof C7554bx ? (C7554bx) queryLocalInterface : new C8421zw(iBinder);
                }
            }
        } catch (Exception unused) {
            co0.zzj("Failed to instantiate ClientApi class.");
        }
        f39542a = bxVar;
    }

    C8205tv() {
    }

    /* renamed from: e */
    private final T m38018e() {
        C7554bx bxVar = f39542a;
        if (bxVar == null) {
            co0.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo30802b(bxVar);
        } catch (RemoteException e) {
            co0.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: f */
    private final T m38019f() {
        try {
            return mo30803c();
        } catch (RemoteException e) {
            co0.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30801a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo30802b(C7554bx bxVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo30803c() throws RemoteException;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo35040d(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x0015
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.internal.ads.vn0.m38855n(r9, r1)
            if (r1 != 0) goto L_0x0015
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.internal.ads.co0.zze(r10)
            r10 = 1
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.m30155a(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.m30156c(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L_0x0024
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r1 = r1 ^ r0
            r10 = r10 | r1
            com.google.android.gms.internal.ads.p00.m35913c(r9)
            com.google.android.gms.internal.ads.s10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.a20.f29500a
            java.lang.Object r1 = r1.mo34648e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            r10 = 0
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.internal.ads.s10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.a20.f29501b
            java.lang.Object r1 = r1.mo34648e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004b
            r10 = 1
            r3 = 1
            goto L_0x004d
        L_0x004b:
            r3 = r10
            goto L_0x0038
        L_0x004d:
            if (r3 == 0) goto L_0x005c
            java.lang.Object r9 = r8.m38018e()
            if (r9 != 0) goto L_0x00a2
            if (r10 != 0) goto L_0x00a2
            java.lang.Object r9 = r8.m38019f()
            goto L_0x00a2
        L_0x005c:
            java.lang.Object r10 = r8.m38019f()
            if (r10 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.s10<java.lang.Long> r1 = com.google.android.gms.internal.ads.m20.f35356a
            java.lang.Object r1 = r1.mo34648e()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.internal.ads.C8241uv.m38466e()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L_0x009a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.internal.ads.vn0 r2 = com.google.android.gms.internal.ads.C8241uv.m38463b()
            com.google.android.gms.internal.ads.zzcjf r0 = com.google.android.gms.internal.ads.C8241uv.m38464c()
            java.lang.String r4 = r0.f43036b
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.mo35450i(r3, r4, r5, r6, r7)
        L_0x009a:
            if (r10 != 0) goto L_0x00a1
            java.lang.Object r9 = r8.m38018e()
            goto L_0x00a2
        L_0x00a1:
            r9 = r10
        L_0x00a2:
            if (r9 != 0) goto L_0x00a8
            java.lang.Object r9 = r8.mo30801a()
        L_0x00a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8205tv.mo35040d(android.content.Context, boolean):java.lang.Object");
    }
}
