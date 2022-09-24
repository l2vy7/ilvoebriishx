package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rn2 extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ so2 f38741a;

    /* synthetic */ rn2(so2 so2, pm2 pm2) {
        this.f38741a = so2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        so2.m37464c(this.f38741a, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        so2.m37464c(this.f38741a, true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
