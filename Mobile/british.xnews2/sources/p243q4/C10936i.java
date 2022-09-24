package p243q4;

import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.internal.cast.C8447b0;
import com.google.android.gms.internal.cast.C8831z;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: q4.i */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10936i {

    /* renamed from: a */
    public static final C7191a.C7202g<C10939j0> f49821a = new C7191a.C7202g<>();

    /* renamed from: b */
    public static final C7191a.C7202g<C10941k0> f49822b = new C7191a.C7202g<>();

    /* renamed from: c */
    public static final C7191a.C7202g<C8447b0> f49823c = new C7191a.C7202g<>();

    /* renamed from: d */
    public static final C7191a.C7202g<C8831z> f49824d = new C7191a.C7202g<>();

    /* renamed from: e */
    public static final C7191a.C7202g f49825e = new C7191a.C7202g();

    /* renamed from: f */
    public static final C7191a.C7202g f49826f = new C7191a.C7202g();

    /* renamed from: g */
    public static final Charset f49827g;

    /* renamed from: h */
    public static final String f49828h = C10920a.m49146i("com.google.cast.multizone");

    static {
        Charset charset = null;
        try {
            charset = Charset.forName(C6540C.UTF8_NAME);
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        f49827g = charset;
    }
}
