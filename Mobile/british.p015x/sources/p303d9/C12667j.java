package p303d9;

import p334v8.C12917b;
import p334v8.C12920e;
import p334v8.C12926k;
import p334v8.C12928m;

/* renamed from: d9.j */
/* compiled from: BasicSecureHandler */
public class C12667j extends C12650a {
    /* renamed from: b */
    public boolean mo47648b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return !bVar.mo47660a() || eVar.mo48095d();
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar != null) {
            mVar.mo47664g(true);
            return;
        }
        throw new IllegalArgumentException("Cookie may not be null");
    }
}
