package p226k5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import p206f4.C10521a;

/* renamed from: k5.e */
public final class C10643e extends C7387f<C10645g> {

    /* renamed from: b */
    private final C10521a.C10522a f49216b;

    public C10643e(Context context, Looper looper, C4601e eVar, C10521a.C10522a aVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.f49216b = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C10645g) {
            return (C10645g) queryLocalInterface;
        }
        return new C10646h(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        C10521a.C10522a aVar = this.f49216b;
        return aVar == null ? new Bundle() : aVar.mo42653a();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
