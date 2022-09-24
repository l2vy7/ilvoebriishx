package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.o */
public final class C11430o {

    /* renamed from: b */
    private static C11430o f51422b;

    /* renamed from: a */
    private ArrayList<NetworkSettings> f51423a = new ArrayList<>();

    private C11430o() {
    }

    /* renamed from: a */
    public static synchronized C11430o m51086a() {
        C11430o oVar;
        synchronized (C11430o.class) {
            if (f51422b == null) {
                f51422b = new C11430o();
            }
            oVar = f51422b;
        }
        return oVar;
    }

    /* renamed from: a */
    public final NetworkSettings mo44442a(String str) {
        Iterator<NetworkSettings> it = this.f51423a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        mo44443a(networkSettings);
        return networkSettings;
    }

    /* renamed from: a */
    public final void mo44443a(NetworkSettings networkSettings) {
        this.f51423a.add(networkSettings);
    }

    /* renamed from: b */
    public final void mo44444b() {
        Iterator<NetworkSettings> it = this.f51423a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = mo44442a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo44445b(String str) {
        Iterator<NetworkSettings> it = this.f51423a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
