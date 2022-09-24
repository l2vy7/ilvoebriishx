package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class xf0 extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final List<NativeAd.Image> f41152a = new ArrayList();

    /* renamed from: b */
    private String f41153b;

    public xf0(i30 i30) {
        try {
            this.f41153b = i30.zzg();
        } catch (RemoteException e) {
            co0.zzh("", e);
            this.f41153b = "";
        }
        try {
            for (q30 next : i30.zzh()) {
                q30 n6 = next instanceof IBinder ? p30.m35940n6((IBinder) next) : null;
                if (n6 != null) {
                    this.f41152a.add(new zf0(n6));
                }
            }
        } catch (RemoteException e2) {
            co0.zzh("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f41152a;
    }

    public final CharSequence getText() {
        return this.f41153b;
    }
}
