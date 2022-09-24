package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.b1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7374b1 extends C7412n0 {

    /* renamed from: g */
    public final IBinder f29307g;

    /* renamed from: h */
    final /* synthetic */ C7377d f29308h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7374b1(C7377d dVar, int i, IBinder iBinder, Bundle bundle) {
        super(dVar, i, bundle);
        this.f29308h = dVar;
        this.f29307g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30043f(ConnectionResult connectionResult) {
        if (this.f29308h.zzx != null) {
            this.f29308h.zzx.onConnectionFailed(connectionResult);
        }
        this.f29308h.onConnectionFailed(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo30044g() {
        try {
            IBinder iBinder = this.f29307g;
            C4604n.m20098k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f29308h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f29308h.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface createServiceInterface = this.f29308h.createServiceInterface(this.f29307g);
            if (createServiceInterface == null || (!C7377d.zzn(this.f29308h, 2, 4, createServiceInterface) && !C7377d.zzn(this.f29308h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f29308h.zzB = null;
            Bundle connectionHint = this.f29308h.getConnectionHint();
            C7377d dVar = this.f29308h;
            if (dVar.zzw == null) {
                return true;
            }
            dVar.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
