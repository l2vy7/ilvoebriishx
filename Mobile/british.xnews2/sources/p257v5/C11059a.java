package p257v5;

import android.net.Uri;
import com.google.android.gms.common.api.C7191a;
import p244q5.C10960d;
import p244q5.C10961e;

/* renamed from: v5.a */
public final class C11059a {

    /* renamed from: a */
    private static final C7191a.C7202g<C10961e> f50008a;

    /* renamed from: b */
    private static final C7191a.C7192a<C10961e, C7191a.C7195d.C7199d> f50009b;
    @Deprecated

    /* renamed from: c */
    private static final C7191a<C7191a.C7195d.C7199d> f50010c;
    @Deprecated

    /* renamed from: d */
    private static final C11064f f50011d = new C10960d();

    /* JADX WARNING: type inference failed for: r0v1, types: [v5.f, q5.d] */
    static {
        C7191a.C7202g<C10961e> gVar = new C7191a.C7202g<>();
        f50008a = gVar;
        C11063e eVar = new C11063e();
        f50009b = eVar;
        f50010c = new C7191a<>("Phenotype.API", eVar, gVar);
    }

    /* renamed from: a */
    public static Uri m49541a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
