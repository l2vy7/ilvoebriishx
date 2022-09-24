package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.cast.C8794w9;
import p115m4.C10793y;
import p115m4.C5758b;
import p244q4.C10922b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class ReconnectionService extends Service {

    /* renamed from: c */
    private static final C10922b f28561c = new C10922b("ReconnectionService");

    /* renamed from: b */
    private C10793y f28562b;

    @RecentlyNullable
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        C10793y yVar = this.f28562b;
        if (yVar != null) {
            try {
                return yVar.mo42962e2(intent);
            } catch (RemoteException e) {
                f28561c.mo43191b(e, "Unable to call %s on %s.", "onBind", C10793y.class.getSimpleName());
            }
        }
        return null;
    }

    public void onCreate() {
        C5758b e = C5758b.m25464e(this);
        C10793y d = C8794w9.m41378d(this, e.mo22535c().mo42957h(), e.mo22537h().mo42905a());
        this.f28562b = d;
        if (d != null) {
            try {
                d.zze();
            } catch (RemoteException e2) {
                f28561c.mo43191b(e2, "Unable to call %s on %s.", "onCreate", C10793y.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    public void onDestroy() {
        C10793y yVar = this.f28562b;
        if (yVar != null) {
            try {
                yVar.zzh();
            } catch (RemoteException e) {
                f28561c.mo43191b(e, "Unable to call %s on %s.", "onDestroy", C10793y.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    public int onStartCommand(@RecentlyNonNull Intent intent, int i, int i2) {
        C10793y yVar = this.f28562b;
        if (yVar != null) {
            try {
                return yVar.mo42963z5(intent, i, i2);
            } catch (RemoteException e) {
                f28561c.mo43191b(e, "Unable to call %s on %s.", "onStartCommand", C10793y.class.getSimpleName());
            }
        }
        return 2;
    }
}
