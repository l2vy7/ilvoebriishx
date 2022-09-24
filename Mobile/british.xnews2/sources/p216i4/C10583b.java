package p216i4;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;

/* renamed from: i4.b */
public class C10583b implements C7341k {

    /* renamed from: b */
    private Status f49129b;

    /* renamed from: c */
    private GoogleSignInAccount f49130c;

    public C10583b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f49130c = googleSignInAccount;
        this.f49129b = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo42699a() {
        return this.f49130c;
    }

    /* renamed from: p0 */
    public Status mo29527p0() {
        return this.f49129b;
    }
}
