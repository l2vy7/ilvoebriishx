package p205f4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import java.util.Collections;
import java.util.List;
import p220j4.C10613g;

/* renamed from: f4.f */
final class C10528f extends C7191a.C7192a<C10613g, GoogleSignInOptions> {
    C10528f() {
    }

    public final /* synthetic */ C7191a.C7201f buildClient(Context context, Looper looper, C4601e eVar, Object obj, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        return new C10613g(context, looper, eVar, (GoogleSignInOptions) obj, bVar, cVar);
    }

    public final /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo29099E0();
    }
}
