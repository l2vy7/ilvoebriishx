package p131p5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: p5.m */
public class C10879m extends C7387f<C10872e> {

    /* renamed from: b */
    private final String f49660b;

    /* renamed from: c */
    protected final C10876j<C10872e> f49661c = new C10880n(this);

    public C10879m(Context context, Looper looper, C7206f.C7208b bVar, C7206f.C7209c cVar, String str, C4601e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.f49660b = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C10872e ? (C10872e) queryLocalInterface : new C10873f(iBinder);
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f49660b);
        return bundle;
    }

    public int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
