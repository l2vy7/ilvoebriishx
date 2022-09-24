package p216i4;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: i4.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C10584c implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C10584c f49131b = new C10584c();

    private /* synthetic */ C10584c() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo29726C0().compareTo(((Scope) obj2).mo29726C0());
    }
}
