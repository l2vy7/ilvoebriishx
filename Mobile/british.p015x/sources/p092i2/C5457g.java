package p092i2;

import android.annotation.SuppressLint;
import p004a3.C0062g;
import p065d2.C5159f;
import p082g2.C5323v;
import p092i2.C5458h;

/* renamed from: i2.g */
/* compiled from: LruResourceCache */
public class C5457g extends C0062g<C5159f, C5323v<?>> implements C5458h {

    /* renamed from: e */
    private C5458h.C5459a f23815e;

    public C5457g(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo21917a(int i) {
        if (i >= 40) {
            mo180b();
        } else if (i >= 20 || i == 15) {
            mo187m(mo182h() / 2);
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C5323v mo21918c(C5159f fVar) {
        return (C5323v) super.mo186l(fVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C5323v mo21919d(C5159f fVar, C5323v vVar) {
        return (C5323v) super.mo185k(fVar, vVar);
    }

    /* renamed from: e */
    public void mo21920e(C5458h.C5459a aVar) {
        this.f23815e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo183i(C5323v<?> vVar) {
        if (vVar == null) {
            return super.mo183i(null);
        }
        return vVar.mo21592b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo184j(C5159f fVar, C5323v<?> vVar) {
        C5458h.C5459a aVar = this.f23815e;
        if (aVar != null && vVar != null) {
            aVar.mo21554b(vVar);
        }
    }
}
