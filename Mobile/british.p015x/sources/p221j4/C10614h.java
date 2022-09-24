package p221j4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4595g;
import p217i4.C10583b;
import p263x4.C11094a;

/* renamed from: j4.h */
public final class C10614h {

    /* renamed from: a */
    private static C11094a f49171a = new C11094a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static C10583b m48379a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f28882g;
        }
        return new C10583b(googleSignInAccount, status);
    }

    /* renamed from: b */
    public static Intent m48380b(Context context, GoogleSignInOptions googleSignInOptions) {
        f49171a.mo43374a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: c */
    private static void m48381c(Context context) {
        C10618l.m48388c(context).mo42736a();
        for (C7206f n : C7206f.m29521j()) {
            n.mo29774n();
        }
        C4595g.m19967a();
    }

    /* renamed from: d */
    public static Intent m48382d(Context context, GoogleSignInOptions googleSignInOptions) {
        f49171a.mo43374a("getFallbackSignInIntent()", new Object[0]);
        Intent b = m48380b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    /* renamed from: e */
    public static C7210g<Status> m48383e(C7206f fVar, Context context, boolean z) {
        f49171a.mo43374a("Revoking access", new Object[0]);
        String e = C10608b.m48359b(context).mo42725e();
        m48381c(context);
        if (z) {
            return C10610d.m48372a(e);
        }
        return fVar.mo17960i(new C10615i(fVar));
    }

    /* renamed from: f */
    public static Intent m48384f(Context context, GoogleSignInOptions googleSignInOptions) {
        f49171a.mo43374a("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = m48380b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
