package p302d9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import p307g8.C12714b;
import p307g8.C12716c;
import p307g8.C12718d;
import p310h9.C12782u;
import p316k9.C12821b;
import p333v8.C12917b;
import p333v8.C12920e;
import p333v8.C12923h;
import p333v8.C12926k;
import p333v8.C12927l;

/* renamed from: d9.k */
/* compiled from: BestMatchSpec */
public class C12668k implements C12923h {

    /* renamed from: a */
    private final String[] f55305a;

    /* renamed from: b */
    private final boolean f55306b;

    /* renamed from: c */
    private C12661f0 f55307c;

    /* renamed from: d */
    private C12684y f55308d;

    /* renamed from: e */
    private C12670m f55309e;

    public C12668k(String[] strArr, boolean z) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.f55305a = strArr2;
        this.f55306b = z;
    }

    /* renamed from: g */
    private C12670m m53927g() {
        if (this.f55309e == null) {
            this.f55309e = new C12670m(this.f55305a);
        }
        return this.f55309e;
    }

    /* renamed from: h */
    private C12684y m53928h() {
        if (this.f55308d == null) {
            this.f55308d = new C12684y(this.f55305a, this.f55306b);
        }
        return this.f55308d;
    }

    /* renamed from: i */
    private C12661f0 m53929i() {
        if (this.f55307c == null) {
            this.f55307c = new C12661f0(this.f55305a, this.f55306b);
        }
        return this.f55307c;
    }

    /* renamed from: a */
    public void mo47676a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo47662c() <= 0) {
            m53927g().mo47676a(bVar, eVar);
        } else if (bVar instanceof C12927l) {
            m53929i().mo47676a(bVar, eVar);
        } else {
            m53928h().mo47676a(bVar, eVar);
        }
    }

    /* renamed from: b */
    public boolean mo47677b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo47662c() <= 0) {
            return m53927g().mo47677b(bVar, eVar);
        } else {
            if (bVar instanceof C12927l) {
                return m53929i().mo47677b(bVar, eVar);
            }
            return m53928h().mo47677b(bVar, eVar);
        }
    }

    /* renamed from: c */
    public int mo47678c() {
        return m53929i().mo47678c();
    }

    /* renamed from: d */
    public C12716c mo47679d() {
        return m53929i().mo47679d();
    }

    /* renamed from: e */
    public List<C12917b> mo47680e(C12716c cVar, C12920e eVar) throws C12926k {
        C12782u uVar;
        C12821b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar != null) {
            C12718d[] b = cVar.mo47760b();
            boolean z = false;
            boolean z2 = false;
            for (C12718d dVar : b) {
                if (dVar.mo47767b(MediationMetaData.KEY_VERSION) != null) {
                    z2 = true;
                }
                if (dVar.mo47767b("expires") != null) {
                    z = true;
                }
            }
            if (z || !z2) {
                C12680u uVar2 = C12680u.f55317a;
                if (cVar instanceof C12714b) {
                    C12714b bVar2 = (C12714b) cVar;
                    bVar = bVar2.mo47755a();
                    uVar = new C12782u(bVar2.mo47756c(), bVar.mo47978p());
                } else {
                    String value = cVar.getValue();
                    if (value != null) {
                        bVar = new C12821b(value.length());
                        bVar.mo47966c(value);
                        uVar = new C12782u(0, bVar.mo47978p());
                    } else {
                        throw new C12926k("Header value is null");
                    }
                }
                return m53927g().mo47681l(new C12718d[]{uVar2.mo47690a(bVar, uVar)}, eVar);
            } else if ("Set-Cookie2".equals(cVar.getName())) {
                return m53929i().mo47681l(b, eVar);
            } else {
                return m53928h().mo47681l(b, eVar);
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: f */
    public List<C12716c> mo47685f(List<C12917b> list) {
        if (list != null) {
            int i = Integer.MAX_VALUE;
            boolean z = true;
            for (C12917b next : list) {
                if (!(next instanceof C12927l)) {
                    z = false;
                }
                if (next.mo47662c() < i) {
                    i = next.mo47662c();
                }
            }
            if (i <= 0) {
                return m53927g().mo47685f(list);
            }
            if (z) {
                return m53929i().mo47685f(list);
            }
            return m53928h().mo47685f(list);
        }
        throw new IllegalArgumentException("List of cookie may not be null");
    }

    public String toString() {
        return "best-match";
    }

    public C12668k() {
        this((String[]) null, false);
    }
}
