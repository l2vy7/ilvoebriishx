package com.ironsource.mediationsdk.adunit.adapter;

import android.content.Context;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

public abstract class BaseAdapter implements AdapterDebugInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface {
    public abstract /* synthetic */ String getAdapterVersion();

    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.NONE;
    }

    public abstract /* synthetic */ String getNetworkSDKVersion();

    public abstract /* synthetic */ void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener);

    public void setAdapterDebug(boolean z) {
    }

    public void setConsent(boolean z) {
    }

    public void setMetaData(String str, List<String> list) {
    }
}
