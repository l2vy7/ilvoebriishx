package p310h9;

import java.util.Locale;
import p307g8.C12713a0;
import p307g8.C12717c0;
import p307g8.C12725i;
import p307g8.C12733q;
import p307g8.C12742z;

/* renamed from: h9.h */
/* compiled from: BasicHttpResponse */
public class C12769h extends C12762a implements C12733q {

    /* renamed from: d */
    private C12717c0 f55444d;

    /* renamed from: e */
    private C12725i f55445e;

    /* renamed from: f */
    private C12713a0 f55446f;

    /* renamed from: g */
    private Locale f55447g;

    public C12769h(C12717c0 c0Var, C12713a0 a0Var, Locale locale) {
        if (c0Var != null) {
            this.f55444d = c0Var;
            this.f55446f = a0Var;
            this.f55447g = locale == null ? Locale.getDefault() : locale;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null.");
    }

    /* renamed from: B */
    public void mo47804B(C12725i iVar) {
        this.f55445e = iVar;
    }

    /* renamed from: a */
    public C12742z mo43587a() {
        return this.f55444d.mo47763a();
    }

    /* renamed from: b */
    public C12725i mo47805b() {
        return this.f55445e;
    }

    /* renamed from: p */
    public C12717c0 mo47806p() {
        return this.f55444d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f55444d);
        stringBuffer.append(" ");
        stringBuffer.append(this.f55426b);
        return stringBuffer.toString();
    }
}
