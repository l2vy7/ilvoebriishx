package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.a1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7371a1 implements ServiceConnection {

    /* renamed from: b */
    private final int f29305b;

    /* renamed from: c */
    final /* synthetic */ C7377d f29306c;

    public C7371a1(C7377d dVar, int i) {
        this.f29306c = dVar;
        this.f29305b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C7405l lVar;
        C7377d dVar = this.f29306c;
        if (iBinder == null) {
            C7377d.zzk(dVar, 16);
            return;
        }
        synchronized (dVar.zzq) {
            C7377d dVar2 = this.f29306c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C7405l)) {
                lVar = new C7418p0(iBinder);
            } else {
                lVar = (C7405l) queryLocalInterface;
            }
            dVar2.zzr = lVar;
        }
        this.f29306c.zzl(0, (Bundle) null, this.f29305b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f29306c.zzq) {
            this.f29306c.zzr = null;
        }
        Handler handler = this.f29306c.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f29305b, 1));
    }
}
