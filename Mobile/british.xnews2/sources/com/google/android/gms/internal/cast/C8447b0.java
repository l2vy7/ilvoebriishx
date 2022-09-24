package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import p108l4.C10667c;
import p243q4.C10922b;

@Deprecated
/* renamed from: com.google.android.gms.internal.cast.b0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8447b0 extends C7387f<C8498e0> implements IBinder.DeathRecipient {

    /* renamed from: e */
    private static final C10922b f43277e = new C10922b("CastRemoteDisplayClientImpl");

    /* renamed from: b */
    private final C10667c.C10669b f43278b;

    /* renamed from: c */
    private final CastDevice f43279c;

    /* renamed from: d */
    private final Bundle f43280d;

    public C8447b0(Context context, Looper looper, C4601e eVar, CastDevice castDevice, Bundle bundle, C10667c.C10669b bVar, C7206f.C7208b bVar2, C7206f.C7209c cVar) {
        super(context, looper, 83, eVar, bVar2, cVar);
        f43277e.mo43190a("instance created", new Object[0]);
        this.f43278b = bVar;
        this.f43279c = castDevice;
        this.f43280d = bundle;
    }

    public final void binderDied() {
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

    public final void disconnect() {
        f43277e.mo43190a("disconnect", new Object[0]);
        try {
            ((C8498e0) getService()).zze();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.disconnect();
        }
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
