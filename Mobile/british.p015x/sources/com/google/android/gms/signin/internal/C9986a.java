package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7387f;
import com.google.android.gms.common.internal.C7395i;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import p221j4.C10608b;
import p264x5.C11100f;
import p267y5.C11109c;

/* renamed from: com.google.android.gms.signin.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9986a extends C7387f<C9988c> implements C11100f {

    /* renamed from: f */
    public static final /* synthetic */ int f46997f = 0;

    /* renamed from: b */
    private final boolean f46998b = true;

    /* renamed from: c */
    private final C4601e f46999c;

    /* renamed from: d */
    private final Bundle f47000d;

    /* renamed from: e */
    private final Integer f47001e;

    public C9986a(Context context, Looper looper, boolean z, C4601e eVar, Bundle bundle, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f46999c = eVar;
        this.f47000d = bundle;
        this.f47001e = eVar.mo17985i();
    }

    /* renamed from: e */
    public static Bundle m45578e(C4601e eVar) {
        eVar.mo17984h();
        Integer i = eVar.mo17985i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo17977a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* renamed from: a */
    public final void mo39381a(C11109c cVar) {
        C4604n.m20099l(cVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f46999c.mo17979c();
            ((C9988c) getService()).mo39389p6(new zai(1, new zat(c, ((Integer) C4604n.m20098k(this.f47001e)).intValue(), C7377d.DEFAULT_ACCOUNT.equals(c.name) ? C10608b.m48359b(getContext()).mo42723c() : null)), cVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.mo29897D1(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo39382b() {
        connect(new C7377d.C7381d());
    }

    /* renamed from: c */
    public final void mo39383c(C7395i iVar, boolean z) {
        try {
            ((C9988c) getService()).mo39388o6(iVar, ((Integer) C4604n.m20098k(this.f47001e)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C9988c ? (C9988c) queryLocalInterface : new C9988c(iBinder);
    }

    /* renamed from: d */
    public final void mo39384d() {
        try {
            ((C9988c) getService()).mo39387n6(((Integer) C4604n.m20098k(this.f47001e)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f46999c.mo17982f())) {
            this.f47000d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f46999c.mo17982f());
        }
        return this.f47000d;
    }

    public final int getMinApkVersion() {
        return C7355d.f29215a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f46998b;
    }
}
