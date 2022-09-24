package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kj2 implements zi2<ij2> {

    /* renamed from: a */
    private final nb3 f34349a;

    /* renamed from: b */
    private final Context f34350b;

    public kj2(nb3 nb3, Context context) {
        this.f34349a = nb3;
        this.f34350b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ij2 mo33098a() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f34350b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzF(this.f34350b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f34350b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        zzt.zzp();
        return new ij2(networkOperator, i2, com.google.android.gms.ads.internal.util.zzt.zzC(this.f34350b), phoneType, z, i);
    }

    public final mb3<ij2> zzb() {
        return this.f34349a.mo33675b(new jj2(this));
    }
}
