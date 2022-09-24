package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;
import p114m4.C10742b0;
import p114m4.C10746c1;
import p114m4.C10754f1;
import p114m4.C10763i1;
import p114m4.C10765j0;
import p114m4.C10767k0;
import p114m4.C10793y;
import p198d5.C10487a;
import p198d5.C10489b;
import p234n4.C10821i;
import p234n4.C10823k;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.w9 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8794w9 {

    /* renamed from: a */
    private static final C10922b f44176a = new C10922b("CastDynamiteModule");

    /* renamed from: a */
    public static C10754f1 m41375a(Context context, CastOptions castOptions, C8660nf nfVar, Map<String, IBinder> map) throws C10767k0, RemoteException {
        return m41380f(context).mo36775O1(C10489b.m48195m6(context.getApplicationContext()), castOptions, nfVar, map);
    }

    /* renamed from: b */
    public static C10742b0 m41376b(Context context, String str, String str2, C10765j0 j0Var) {
        try {
            return m41380f(context).mo36778r0(str, str2, j0Var);
        } catch (RemoteException | C10767k0 e) {
            f44176a.mo43191b(e, "Unable to call %s on %s.", "newSessionImpl", C8814xd.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: c */
    public static C10763i1 m41377c(Context context, CastOptions castOptions, C10487a aVar, C10746c1 c1Var) {
        if (aVar == null) {
            return null;
        }
        try {
            return m41380f(context).mo36776d4(castOptions, aVar, c1Var);
        } catch (RemoteException | C10767k0 e) {
            f44176a.mo43191b(e, "Unable to call %s on %s.", "newCastSessionImpl", C8814xd.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: d */
    public static C10793y m41378d(Service service, C10487a aVar, C10487a aVar2) {
        if (!(aVar == null || aVar2 == null)) {
            try {
                return m41380f(service.getApplicationContext()).mo36777j0(C10489b.m48195m6(service), aVar, aVar2);
            } catch (RemoteException | C10767k0 e) {
                f44176a.mo43191b(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", C8814xd.class.getSimpleName());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C10821i m41379e(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, C10823k kVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return m41380f(context.getApplicationContext()).mo36774N0(C10489b.m48195m6(asyncTask), kVar, i, i2, false, 2097152, 5, 333, 10000);
        } catch (RemoteException | C10767k0 e) {
            f44176a.mo43191b(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C8814xd.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: f */
    private static C8814xd m41380f(Context context) throws C10767k0 {
        try {
            IBinder d = DynamiteModule.m30157e(context, DynamiteModule.f29454b, "com.google.android.gms.cast.framework.dynamite").mo30249d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (d == null) {
                return null;
            }
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof C8814xd) {
                return (C8814xd) queryLocalInterface;
            }
            return new C8828yc(d);
        } catch (DynamiteModule.C7468a e) {
            throw new C10767k0(e);
        }
    }
}
