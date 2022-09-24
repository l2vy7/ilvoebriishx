package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

public class AdapterBaseWrapper {

    /* renamed from: a */
    AdapterBaseInterface f50757a;

    /* renamed from: b */
    NetworkSettings f50758b;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.f50757a = adapterBaseInterface;
        this.f50758b = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.f50757a;
    }

    public NetworkSettings getSettings() {
        return this.f50758b;
    }
}
