package p263x5;

import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C9986a;

/* renamed from: x5.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11099e {

    /* renamed from: a */
    public static final C7191a.C7202g<C9986a> f50065a;

    /* renamed from: b */
    public static final C7191a.C7202g<C9986a> f50066b;

    /* renamed from: c */
    public static final C7191a.C7192a<C9986a, C11095a> f50067c;

    /* renamed from: d */
    static final C7191a.C7192a<C9986a, C11098d> f50068d;

    /* renamed from: e */
    public static final Scope f50069e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f50070f = new Scope("email");

    /* renamed from: g */
    public static final C7191a<C11095a> f50071g;

    /* renamed from: h */
    public static final C7191a<C11098d> f50072h;

    static {
        C7191a.C7202g<C9986a> gVar = new C7191a.C7202g<>();
        f50065a = gVar;
        C7191a.C7202g<C9986a> gVar2 = new C7191a.C7202g<>();
        f50066b = gVar2;
        C11096b bVar = new C11096b();
        f50067c = bVar;
        C11097c cVar = new C11097c();
        f50068d = cVar;
        f50071g = new C7191a<>("SignIn.API", bVar, gVar);
        f50072h = new C7191a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
