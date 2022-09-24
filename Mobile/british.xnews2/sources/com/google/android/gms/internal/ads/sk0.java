package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class sk0 extends xj0 {

    /* renamed from: b */
    private final String f38984b;

    /* renamed from: c */
    private final int f38985c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public sk0(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public final int zze() throws RemoteException {
        return this.f38985c;
    }

    public final String zzf() throws RemoteException {
        return this.f38984b;
    }

    public sk0(String str, int i) {
        this.f38984b = str;
        this.f38985c = i;
    }
}
