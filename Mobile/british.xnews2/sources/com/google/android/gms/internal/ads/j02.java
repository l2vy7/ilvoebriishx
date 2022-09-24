package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j02 extends l02 {
    public j02(Context context) {
        this.f34772g = new ii0(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.f34768c) {
            if (!this.f34770e) {
                this.f34770e = true;
                try {
                    this.f34772g.mo32631e().mo31078X2(this.f34771f, new k02(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f34767b.zze(new b12(1));
                } catch (Throwable th) {
                    zzt.zzo().mo18592s(th, "RemoteAdRequestClientTask.onConnected");
                    this.f34767b.zze(new b12(1));
                }
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        co0.zze("Cannot connect to remote service, fallback to local instance.");
        this.f34767b.zze(new b12(1));
    }
}
