package p221j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: j4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C10608b {

    /* renamed from: c */
    private static final Lock f49161c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    private static C10608b f49162d;

    /* renamed from: a */
    private final Lock f49163a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f49164b;

    C10608b(Context context) {
        this.f49164b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C10608b m48359b(Context context) {
        C4604n.m20098k(context);
        Lock lock = f49161c;
        lock.lock();
        try {
            if (f49162d == null) {
                f49162d = new C10608b(context.getApplicationContext());
            }
            C10608b bVar = f49162d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f49161c.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    private static final String m48360k(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo42722a() {
        this.f49163a.lock();
        try {
            this.f49164b.edit().clear().apply();
        } finally {
            this.f49163a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount mo42723c() {
        String g;
        String g2 = mo42727g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo42727g(m48360k("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m28957M0(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions mo42724d() {
        String g;
        String g2 = mo42727g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo42727g(m48360k("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m28971K0(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String mo42725e() {
        return mo42727g("refreshToken");
    }

    /* renamed from: f */
    public void mo42726f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C4604n.m20098k(googleSignInAccount);
        C4604n.m20098k(googleSignInOptions);
        mo42730j("defaultGoogleSignInAccount", googleSignInAccount.mo29091N0());
        C4604n.m20098k(googleSignInAccount);
        C4604n.m20098k(googleSignInOptions);
        String N0 = googleSignInAccount.mo29091N0();
        mo42730j(m48360k("googleSignInAccount", N0), googleSignInAccount.mo29092O0());
        mo42730j(m48360k("googleSignInOptions", N0), googleSignInOptions.mo29104O0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo42727g(String str) {
        this.f49163a.lock();
        try {
            return this.f49164b.getString(str, (String) null);
        } finally {
            this.f49163a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42728h(String str) {
        this.f49163a.lock();
        try {
            this.f49164b.edit().remove(str).apply();
        } finally {
            this.f49163a.unlock();
        }
    }

    /* renamed from: i */
    public final void mo42729i() {
        String g = mo42727g("defaultGoogleSignInAccount");
        mo42728h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g)) {
            mo42728h(m48360k("googleSignInAccount", g));
            mo42728h(m48360k("googleSignInOptions", g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo42730j(String str, String str2) {
        this.f49163a.lock();
        try {
            this.f49164b.edit().putString(str, str2).apply();
        } finally {
            this.f49163a.unlock();
        }
    }
}
