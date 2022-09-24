package p317l8;

import p307g8.C12716c;
import p307g8.C12725i;
import p307g8.C12726j;
import p320o8.C12844a;

/* renamed from: l8.b */
/* compiled from: HttpEntityEnclosingRequestBase */
public abstract class C12828b extends C12832f implements C12726j {

    /* renamed from: i */
    private C12725i f55498i;

    /* renamed from: B */
    public void mo47986B(C12725i iVar) {
        this.f55498i = iVar;
    }

    /* renamed from: b */
    public C12725i mo43574b() {
        return this.f55498i;
    }

    public Object clone() throws CloneNotSupportedException {
        C12828b bVar = (C12828b) super.clone();
        C12725i iVar = this.f55498i;
        if (iVar != null) {
            bVar.f55498i = (C12725i) C12844a.m54420a(iVar);
        }
        return bVar;
    }

    /* renamed from: h */
    public boolean mo43575h() {
        C12716c I = mo47792I("Expect");
        return I != null && "100-continue".equalsIgnoreCase(I.getValue());
    }
}
