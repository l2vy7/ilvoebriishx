package p222j5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;
import p206f4.C10524b;
import p206f4.C10525c;

/* renamed from: j5.b */
public final class C10628b extends C7387f<C10629c> {

    /* renamed from: b */
    private final Bundle f49180b;

    public C10628b(Context context, Looper looper, C4601e eVar, C10525c cVar, C7206f.C7208b bVar, C7206f.C7209c cVar2) {
        super(context, looper, 16, eVar, bVar, cVar2);
        if (cVar == null) {
            this.f49180b = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C10629c) {
            return (C10629c) queryLocalInterface;
        }
        return new C10630d(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f49180b;
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        C4601e clientSettings = getClientSettings();
        return !TextUtils.isEmpty(clientSettings.mo17978b()) && !clientSettings.mo17981e(C10524b.f49066c).isEmpty();
    }
}
