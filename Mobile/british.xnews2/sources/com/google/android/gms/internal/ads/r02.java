package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r02 extends l02 {

    /* renamed from: h */
    private String f38447h;

    /* renamed from: i */
    private int f38448i = 1;

    public r02(Context context) {
        this.f34772g = new ii0(context, zzt.zzt().zzb(), this, this);
    }

    /* renamed from: b */
    public final mb3<InputStream> mo34448b(zzcdq zzcdq) {
        synchronized (this.f34768c) {
            int i = this.f38448i;
            if (i != 1 && i != 2) {
                mb3<InputStream> h = bb3.m30648h(new b12(2));
                return h;
            } else if (this.f34769d) {
                uo0<InputStream> uo0 = this.f34767b;
                return uo0;
            } else {
                this.f38448i = 2;
                this.f34769d = true;
                this.f34771f = zzcdq;
                this.f34772g.checkAvailabilityAndConnect();
                this.f34767b.zzc(new p02(this), po0.f37727f);
                uo0<InputStream> uo02 = this.f34767b;
                return uo02;
            }
        }
    }

    /* renamed from: c */
    public final mb3<InputStream> mo34449c(String str) {
        synchronized (this.f34768c) {
            int i = this.f38448i;
            if (i != 1 && i != 3) {
                mb3<InputStream> h = bb3.m30648h(new b12(2));
                return h;
            } else if (this.f34769d) {
                uo0<InputStream> uo0 = this.f34767b;
                return uo0;
            } else {
                this.f38448i = 3;
                this.f34769d = true;
                this.f38447h = str;
                this.f34772g.checkAvailabilityAndConnect();
                this.f34767b.zzc(new q02(this), po0.f37727f);
                uo0<InputStream> uo02 = this.f34767b;
                return uo02;
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.f34768c) {
            if (!this.f34770e) {
                this.f34770e = true;
                try {
                    int i = this.f38448i;
                    if (i == 2) {
                        this.f34772g.mo32631e().mo31079d1(this.f34771f, new k02(this));
                    } else if (i == 3) {
                        this.f34772g.mo32631e().mo31081n0(this.f38447h, new k02(this));
                    } else {
                        this.f34767b.zze(new b12(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f34767b.zze(new b12(1));
                } catch (Throwable th) {
                    zzt.zzo().mo18592s(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
