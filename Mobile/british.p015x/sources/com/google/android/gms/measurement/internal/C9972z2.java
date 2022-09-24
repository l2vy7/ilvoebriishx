package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C7377d;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9972z2 extends C7377d {
    public C9972z2(Context context, Looper looper, C7377d.C7378a aVar, C7377d.C7379b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C11030e ? (C11030e) queryLocalInterface : new C9913t2(iBinder);
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
