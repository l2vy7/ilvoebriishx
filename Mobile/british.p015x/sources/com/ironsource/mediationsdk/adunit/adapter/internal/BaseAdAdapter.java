package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.C11369d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    /* renamed from: a */
    private final IronSource.AD_UNIT f50759a;

    /* renamed from: b */
    private final NetworkSettings f50760b;

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        this.f50759a = ad_unit;
        this.f50760b = networkSettings;
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter a = C11369d.m50788a().mo44229a(this.f50760b, this.f50759a);
        if (a != null) {
            return a;
        }
        return null;
    }

    public abstract void loadAd(AdData adData, Activity activity, Listener listener);

    public void releaseMemory() {
    }
}
