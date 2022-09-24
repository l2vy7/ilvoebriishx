package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d33;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzf extends d33 {
    public zzf(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28573a(Message message) {
        try {
            super.mo28573a(message);
        } catch (Throwable th) {
            zzt.zzp();
            zzt.zzP(zzt.zzo().mo18579c(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzt.zzo().mo18592s(e, "AdMobHandler.handleMessage");
        }
    }
}
