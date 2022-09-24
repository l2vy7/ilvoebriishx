package p218i5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.api.internal.C7276m;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: i5.d */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C10589d extends C7387f<C10592g> {
    protected C10589d(Context context, Looper looper, C4601e eVar, C7240f fVar, C7276m mVar) {
        super(context, looper, 300, eVar, fVar, mVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C10592g ? (C10592g) queryLocalInterface : new C10592g(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zze.zzb;
    }

    public final int getMinApkVersion() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
