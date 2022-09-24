package p220j4;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C7387f;

/* renamed from: j4.g */
public final class C10613g extends C7387f<C10623q> {

    /* renamed from: b */
    private final GoogleSignInOptions f49170b;

    public C10613g(Context context, Looper looper, C4601e eVar, GoogleSignInOptions googleSignInOptions, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.C7063a().mo29109a() : googleSignInOptions;
        if (!eVar.mo17980d().isEmpty()) {
            GoogleSignInOptions.C7063a aVar = new GoogleSignInOptions.C7063a(googleSignInOptions);
            for (Scope d : eVar.mo17980d()) {
                aVar.mo29112d(d, new Scope[0]);
            }
            googleSignInOptions = aVar.mo29109a();
        }
        this.f49170b = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C10623q) {
            return (C10623q) queryLocalInterface;
        }
        return new C10624r(iBinder);
    }

    /* renamed from: e */
    public final GoogleSignInOptions mo42734e() {
        return this.f49170b;
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return C10614h.m48380b(getContext(), this.f49170b);
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}
