package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.C7377d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ii0 extends zzc<ni0> {
    public ii0(Context context, Looper looper, C7377d.C7378a aVar, C7377d.C7379b bVar) {
        super(ij0.m33229a(context), looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof ni0 ? (ni0) queryLocalInterface : new li0(iBinder);
    }

    /* renamed from: e */
    public final ni0 mo32631e() throws DeadObjectException {
        return (ni0) super.getService();
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
