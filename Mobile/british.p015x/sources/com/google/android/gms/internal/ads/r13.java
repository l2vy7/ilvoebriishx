package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.C7377d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r13 extends zzc<u13> {

    /* renamed from: a */
    private final int f38459a;

    public r13(Context context, Looper looper, C7377d.C7378a aVar, C7377d.C7379b bVar, int i) {
        super(context, looper, 116, aVar, bVar, (String) null);
        this.f38459a = i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof u13 ? (u13) queryLocalInterface : new u13(iBinder);
    }

    /* renamed from: e */
    public final u13 mo34473e() throws DeadObjectException {
        return (u13) super.getService();
    }

    public final int getMinApkVersion() {
        return this.f38459a;
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
