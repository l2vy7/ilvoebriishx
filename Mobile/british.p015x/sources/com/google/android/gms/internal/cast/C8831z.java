package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: com.google.android.gms.internal.cast.z */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8831z extends C7387f<C8498e0> {
    public C8831z(Context context, Looper looper, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 83, eVar, bVar, cVar);
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (queryLocalInterface instanceof C8498e0) {
            return (C8498e0) queryLocalInterface;
        }
        return new C8498e0(iBinder);
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }
}
