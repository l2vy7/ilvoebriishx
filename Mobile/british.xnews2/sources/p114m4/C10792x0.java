package p114m4;

import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbl;
import p108l4.C5675h0;

/* renamed from: m4.x0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C10792x0 extends C10743b1 {

    /* renamed from: b */
    final /* synthetic */ C5759d f49525b;

    /* synthetic */ C10792x0(C5759d dVar, C10786u0 u0Var) {
        this.f49525b = dVar;
    }

    /* renamed from: I5 */
    public final void mo42918I5(String str, LaunchOptions launchOptions) {
        if (this.f49525b.f24427i != null) {
            this.f49525b.f24427i.mo22366e(str, launchOptions).addOnCompleteListener(new C10790w0(this));
        }
    }

    /* renamed from: a3 */
    public final void mo42919a3(String str) {
        if (this.f49525b.f24427i != null) {
            this.f49525b.f24427i.mo22369x(str);
        }
    }

    /* renamed from: g */
    public final void mo42920g(String str, String str2) {
        if (this.f49525b.f24427i != null) {
            ((C5675h0) this.f49525b.f24427i).mo22355J(str, str2, (zzbl) null).addOnCompleteListener(new C10788v0(this));
        }
    }

    /* renamed from: l */
    public final void mo42921l(int i) {
        C5759d.m25482x(this.f49525b, i);
    }
}
