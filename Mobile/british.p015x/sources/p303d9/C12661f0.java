package p303d9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p308g8.C12716c;
import p308g8.C12718d;
import p308g8.C12738v;
import p311h9.C12777p;
import p317k9.C12821b;
import p334v8.C12916a;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12926k;

/* renamed from: d9.f0 */
/* compiled from: RFC2965Spec */
public class C12661f0 extends C12684y {
    public C12661f0() {
        this((String[]) null, false);
    }

    /* renamed from: q */
    private static C12920e m53907q(C12920e eVar) {
        String a = eVar.mo48092a();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a.length()) {
                z = true;
                break;
            }
            char charAt = a.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return eVar;
        }
        return new C12920e(a + ".local", eVar.mo48094c(), eVar.mo48093b(), eVar.mo48095d());
    }

    /* renamed from: r */
    private List<C12917b> m53908r(C12718d[] dVarArr, C12920e eVar) throws C12926k {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C12718d dVar : dVarArr) {
            String name = dVar.getName();
            String value = dVar.getValue();
            if (name == null || name.length() == 0) {
                throw new C12926k("Cookie name may not be empty");
            }
            C12654c cVar = new C12654c(name, value);
            cVar.mo47667h(C12672o.m53943k(eVar));
            cVar.mo47671p(C12672o.m53942j(eVar));
            cVar.mo47653B(new int[]{eVar.mo48094c()});
            C12738v[] a = dVar.mo47766a();
            HashMap hashMap = new HashMap(a.length);
            for (int length = a.length - 1; length >= 0; length--) {
                C12738v vVar = a[length];
                hashMap.put(vVar.getName().toLowerCase(Locale.ENGLISH), vVar);
            }
            for (Map.Entry value2 : hashMap.entrySet()) {
                C12738v vVar2 = (C12738v) value2.getValue();
                String lowerCase = vVar2.getName().toLowerCase(Locale.ENGLISH);
                cVar.mo47659C(lowerCase, vVar2.getValue());
                C12918c g = mo47650g(lowerCase);
                if (g != null) {
                    g.mo47649c(cVar, vVar2.getValue());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo47676a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            super.mo47676a(bVar, m53907q(eVar));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: b */
    public boolean mo47677b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return super.mo47677b(bVar, m53907q(eVar));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: c */
    public int mo47678c() {
        return 1;
    }

    /* renamed from: d */
    public C12716c mo47679d() {
        C12821b bVar = new C12821b(40);
        bVar.mo47966c("Cookie2");
        bVar.mo47966c(": ");
        bVar.mo47966c("$Version=");
        bVar.mo47966c(Integer.toString(mo47678c()));
        return new C12777p(bVar);
    }

    /* renamed from: e */
    public List<C12917b> mo47680e(C12716c cVar, C12920e eVar) throws C12926k {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie2")) {
            return m53908r(cVar.mo47760b(), m53907q(eVar));
        } else {
            throw new C12926k("Unrecognized cookie header '" + cVar.toString() + "'");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public List<C12917b> mo47681l(C12718d[] dVarArr, C12920e eVar) throws C12926k {
        return m53908r(dVarArr, m53907q(eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo47682o(C12821b bVar, C12917b bVar2, int i) {
        String b;
        int[] l;
        super.mo47682o(bVar, bVar2, i);
        if ((bVar2 instanceof C12916a) && (b = ((C12916a) bVar2).mo47661b("port")) != null) {
            bVar.mo47966c("; $Port");
            bVar.mo47966c("=\"");
            if (b.trim().length() > 0 && (l = bVar2.mo47656l()) != null) {
                int length = l.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        bVar.mo47966c(",");
                    }
                    bVar.mo47966c(Integer.toString(l[i2]));
                }
            }
            bVar.mo47966c("\"");
        }
    }

    public String toString() {
        return "rfc2965";
    }

    public C12661f0(String[] strArr, boolean z) {
        super(strArr, z);
        mo47652i("domain", new C12657d0());
        mo47652i("port", new C12659e0());
        mo47652i("commenturl", new C12653b0());
        mo47652i("discard", new C12655c0());
        mo47652i(MediationMetaData.KEY_VERSION, new C12665h0());
    }
}
