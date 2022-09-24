package p114m4;

import com.google.android.gms.internal.cast.C8509ec;
import com.google.android.gms.internal.cast.C8669o8;
import java.io.IOException;
import p142r3.C5999e;

/* renamed from: m4.s0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C10782s0 implements C5999e {

    /* renamed from: a */
    static final C5999e f49520a = new C10782s0();

    private C10782s0() {
    }

    public final Object apply(Object obj) {
        C8669o8 o8Var = (C8669o8) obj;
        try {
            byte[] bArr = new byte[o8Var.zzr()];
            C8509ec x = C8509ec.m40805x(bArr);
            o8Var.mo36672a(x);
            x.mo36459c();
            return bArr;
        } catch (IOException e) {
            String name = o8Var.getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
