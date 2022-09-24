package p311i8;

import com.google.android.exoplayer2.C6540C;
import p312i9.C12790d;

/* renamed from: i8.a */
/* compiled from: AuthParams */
public final class C12786a {
    /* renamed from: a */
    public static String m54249a(C12790d dVar) {
        if (dVar != null) {
            String str = (String) dVar.mo43553i("http.auth.credential-charset");
            return str == null ? C6540C.ASCII_NAME : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
