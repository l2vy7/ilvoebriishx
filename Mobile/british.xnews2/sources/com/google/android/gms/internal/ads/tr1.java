package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tr1 extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    private final im1 f39517a;

    public tr1(im1 im1) {
        this.f39517a = im1;
    }

    /* renamed from: a */
    private static C7921ly m38006a(im1 im1) {
        C7774hy R = im1.mo32658R();
        if (R == null) {
            return null;
        }
        try {
            return R.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        C7921ly a = m38006a(this.f39517a);
        if (a != null) {
            try {
                a.zze();
            } catch (RemoteException e) {
                co0.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        C7921ly a = m38006a(this.f39517a);
        if (a != null) {
            try {
                a.zzg();
            } catch (RemoteException e) {
                co0.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoStart() {
        C7921ly a = m38006a(this.f39517a);
        if (a != null) {
            try {
                a.zzi();
            } catch (RemoteException e) {
                co0.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }
}
