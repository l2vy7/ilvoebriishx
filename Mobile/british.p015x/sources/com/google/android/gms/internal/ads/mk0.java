package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class mk0 implements RewardItem {

    /* renamed from: a */
    private final yj0 f35534a;

    public mk0(yj0 yj0) {
        this.f35534a = yj0;
    }

    public final int getAmount() {
        yj0 yj0 = this.f35534a;
        if (yj0 != null) {
            try {
                return yj0.zze();
            } catch (RemoteException e) {
                co0.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        yj0 yj0 = this.f35534a;
        if (yj0 != null) {
            try {
                return yj0.zzf();
            } catch (RemoteException e) {
                co0.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
