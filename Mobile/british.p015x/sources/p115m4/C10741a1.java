package p115m4;

import android.os.RemoteException;
import p199d5.C10487a;
import p244q4.C10922b;

/* renamed from: m4.a1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10741a1 {

    /* renamed from: b */
    private static final C10922b f49386b = new C10922b("DiscoveryManager");

    /* renamed from: a */
    private final C10787v f49387a;

    C10741a1(C10787v vVar) {
        this.f49387a = vVar;
    }

    /* renamed from: a */
    public final C10487a mo42905a() {
        try {
            return this.f49387a.zze();
        } catch (RemoteException e) {
            f49386b.mo43191b(e, "Unable to call %s on %s.", "getWrappedThis", C10787v.class.getSimpleName());
            return null;
        }
    }
}
