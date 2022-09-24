package p243q4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import p108l4.C10690m;

/* renamed from: q4.k0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10941k0 extends C7387f<C10928e> {

    /* renamed from: f */
    private static final C10922b f49859f = new C10922b("CastClientImplCxless");

    /* renamed from: b */
    private final CastDevice f49860b;

    /* renamed from: c */
    private final long f49861c;

    /* renamed from: d */
    private final Bundle f49862d;

    /* renamed from: e */
    private final String f49863e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10941k0(Context context, Looper looper, C4601e eVar, CastDevice castDevice, long j, Bundle bundle, String str, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 10, eVar, bVar, cVar);
        this.f49860b = castDevice;
        this.f49861c = j;
        this.f49862d = bundle;
        this.f49863e = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C10928e) {
            return (C10928e) queryLocalInterface;
        }
        return new C10928e(iBinder);
    }

    public final void disconnect() {
        try {
            ((C10928e) getService()).zze();
        } catch (RemoteException | IllegalStateException e) {
            f49859f.mo43191b(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.disconnect();
        }
    }

    public final Feature[] getApiFeatures() {
        return C10690m.f49312k;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f49859f.mo43190a("getRemoteService()", new Object[0]);
        this.f49860b.mo29187K0(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f49861c);
        bundle.putString("connectionless_client_record_id", this.f49863e);
        Bundle bundle2 = this.f49862d;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
