package p244q4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import p109l4.C10690m;

/* renamed from: q4.b0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10923b0 extends C7387f<C10934h> {
    public C10923b0(Context context, Looper looper, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 161, eVar, bVar, cVar);
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof C10934h) {
            return (C10934h) queryLocalInterface;
        }
        return new C10934h(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return C10690m.f49312k;
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
