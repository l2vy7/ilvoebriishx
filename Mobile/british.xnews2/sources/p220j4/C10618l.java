package p220j4;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: j4.l */
public final class C10618l {

    /* renamed from: d */
    private static C10618l f49173d;

    /* renamed from: a */
    private C10608b f49174a;

    /* renamed from: b */
    private GoogleSignInAccount f49175b;

    /* renamed from: c */
    private GoogleSignInOptions f49176c = this.f49174a.mo42724d();

    private C10618l(Context context) {
        C10608b b = C10608b.m48359b(context);
        this.f49174a = b;
        this.f49175b = b.mo42723c();
    }

    /* renamed from: c */
    public static synchronized C10618l m48388c(Context context) {
        C10618l d;
        synchronized (C10618l.class) {
            d = m48389d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized C10618l m48389d(Context context) {
        C10618l lVar;
        synchronized (C10618l.class) {
            if (f49173d == null) {
                f49173d = new C10618l(context);
            }
            lVar = f49173d;
        }
        return lVar;
    }

    /* renamed from: a */
    public final synchronized void mo42736a() {
        this.f49174a.mo42722a();
        this.f49175b = null;
        this.f49176c = null;
    }

    /* renamed from: b */
    public final synchronized void mo42737b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f49174a.mo42726f(googleSignInAccount, googleSignInOptions);
        this.f49175b = googleSignInAccount;
        this.f49176c = googleSignInOptions;
    }
}
