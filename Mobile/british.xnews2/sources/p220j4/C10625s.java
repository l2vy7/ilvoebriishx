package p220j4;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.api.C7206f;
import p205f4.C10521a;

/* renamed from: j4.s */
public final class C10625s extends C10620n {

    /* renamed from: b */
    private final Context f49177b;

    public C10625s(Context context) {
        this.f49177b = context;
    }

    private final void zzl() {
        if (!C7355d.m29943i(this.f49177b, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    public final void zzj() {
        zzl();
        C10608b b = C10608b.m48359b(this.f49177b);
        GoogleSignInAccount c = b.mo42723c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f28252m;
        if (c != null) {
            googleSignInOptions = b.mo42724d();
        }
        C7206f e = new C7206f.C7207a(this.f49177b).mo29778b(C10521a.f49056g, googleSignInOptions).mo29781e();
        try {
            if (e.mo29768d().mo29686G0()) {
                if (c != null) {
                    C10521a.f49059j.mo42698a(e);
                } else {
                    e.mo29769e();
                }
            }
        } finally {
            e.mo29771g();
        }
    }

    public final void zzk() {
        zzl();
        C10618l.m48388c(this.f49177b).mo42736a();
    }
}
