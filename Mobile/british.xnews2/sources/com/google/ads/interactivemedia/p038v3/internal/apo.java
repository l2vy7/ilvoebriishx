package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.Hide;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.apo */
/* compiled from: IMASDK */
public final class apo extends anw<apt> {

    /* renamed from: a */
    private final int f15534a = 9200000;

    public apo(Context context, Looper looper, C7377d.C7378a aVar, C7377d.C7379b bVar) {
        super(context, looper, aVar, bVar);
    }

    /* renamed from: a */
    public final apt mo14189a() throws DeadObjectException {
        return (apt) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof apt) {
            return (apt) queryLocalInterface;
        }
        return new aps(iBinder);
    }

    public final int getMinApkVersion() {
        return this.f15534a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
