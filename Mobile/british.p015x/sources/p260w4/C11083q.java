package p260w4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.api.internal.C7276m;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import com.google.android.gms.common.internal.C7426s;
import p229l5.C10716d;

/* renamed from: w4.q */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11083q extends C7387f<C11076j> {

    /* renamed from: b */
    private final C7426s f50022b;

    public C11083q(Context context, Looper looper, C4601e eVar, C7426s sVar, C7240f fVar, C7276m mVar) {
        super(context, looper, 270, eVar, fVar, mVar);
        this.f50022b = sVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C11076j ? (C11076j) queryLocalInterface : new C11076j(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return C10716d.f49344b;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f50022b.mo30160b();
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
