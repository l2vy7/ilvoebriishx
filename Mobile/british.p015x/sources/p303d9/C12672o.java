package p303d9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p308g8.C12718d;
import p308g8.C12738v;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12926k;

/* renamed from: d9.o */
/* compiled from: CookieSpecBase */
public abstract class C12672o extends C12652b {
    /* renamed from: j */
    protected static String m53942j(C12920e eVar) {
        return eVar.mo48092a();
    }

    /* renamed from: k */
    protected static String m53943k(C12920e eVar) {
        String b = eVar.mo48093b();
        int lastIndexOf = b.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return b;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return b.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public void mo47676a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            for (C12918c a : mo47651h()) {
                a.mo47647a(bVar, eVar);
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: b */
    public boolean mo47677b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            for (C12918c b : mo47651h()) {
                if (!b.mo47648b(bVar, eVar)) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public List<C12917b> mo47681l(C12718d[] dVarArr, C12920e eVar) throws C12926k {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C12718d dVar : dVarArr) {
            String name = dVar.getName();
            String value = dVar.getValue();
            if (name == null || name.length() == 0) {
                throw new C12926k("Cookie name may not be empty");
            }
            C12656d dVar2 = new C12656d(name, value);
            dVar2.mo47667h(m53943k(eVar));
            dVar2.mo47671p(m53942j(eVar));
            C12738v[] a = dVar.mo47766a();
            for (int length = a.length - 1; length >= 0; length--) {
                C12738v vVar = a[length];
                String lowerCase = vVar.getName().toLowerCase(Locale.ENGLISH);
                dVar2.mo47659C(lowerCase, vVar.getValue());
                C12918c g = mo47650g(lowerCase);
                if (g != null) {
                    g.mo47649c(dVar2, vVar.getValue());
                }
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }
}
