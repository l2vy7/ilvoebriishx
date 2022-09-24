package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p199d5.C10489b;
import p253t5.C11020a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class kc0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ mc0 f34236b;

    /* renamed from: c */
    public final /* synthetic */ Context f34237c;

    /* renamed from: d */
    public final /* synthetic */ String f34238d;

    public /* synthetic */ kc0(mc0 mc0, Context context, String str) {
        this.f34236b = mc0;
        this.f34237c = context;
        this.f34238d = str;
    }

    public final void run() {
        Context context = this.f34237c;
        String str = this.f34238d;
        p00.m35913c(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) C8311wv.m39277c().mo18570b(p00.f37058c0)).booleanValue());
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37121j0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((tv0) ho0.m32903b(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", jc0.f33840a)).mo34627U4(C10489b.m48195m6(context), new ic0(C11020a.m49377k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | go0 | NullPointerException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
