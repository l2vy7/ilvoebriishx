package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.qc0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            C8241uv.m38462a().mo34799l(this, new qc0()).mo33079i0(intent);
        } catch (RemoteException e) {
            co0.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
