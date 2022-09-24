package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apf */
/* compiled from: IMASDK */
public final class apf extends C7387f<aov> {
    public apf(Context context, Looper looper, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 203, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return aou.m14479b(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return aqa.f15557c;
    }

    public final int getMinApkVersion() {
        return 17108000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }
}
