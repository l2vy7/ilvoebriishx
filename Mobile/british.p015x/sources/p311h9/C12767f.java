package p311h9;

import java.util.ArrayList;
import p308g8.C12718d;
import p308g8.C12738v;
import p308g8.C12740x;
import p315j9.C12810d;
import p317k9.C12821b;

/* renamed from: h9.f */
/* compiled from: BasicHeaderValueParser */
public class C12767f implements C12779r {

    /* renamed from: a */
    public static final C12767f f55439a = new C12767f();

    /* renamed from: b */
    private static final char[] f55440b = {';', ','};

    /* renamed from: e */
    private static boolean m54175e(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final C12718d[] m54176f(String str, C12779r rVar) throws C12740x {
        if (str != null) {
            if (rVar == null) {
                rVar = f55439a;
            }
            C12821b bVar = new C12821b(str.length());
            bVar.mo47966c(str);
            return rVar.mo47858a(bVar, new C12782u(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: a */
    public C12718d[] mo47858a(C12821b bVar, C12782u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo47920a()) {
                C12718d b = mo47859b(bVar, uVar);
                if (b.getName().length() != 0 || b.getValue() != null) {
                    arrayList.add(b);
                }
            }
            return (C12718d[]) arrayList.toArray(new C12718d[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: b */
    public C12718d mo47859b(C12821b bVar, C12782u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            C12738v g = mo47862g(bVar, uVar);
            C12738v[] vVarArr = null;
            if (!uVar.mo47920a() && bVar.mo47972i(uVar.mo47921b() - 1) != ',') {
                vVarArr = mo47864i(bVar, uVar);
            }
            return mo47860c(g.getName(), g.getValue(), vVarArr);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12718d mo47860c(String str, String str2, C12738v[] vVarArr) {
        return new C12764c(str, str2, vVarArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12738v mo47861d(String str, String str2) {
        return new C12773l(str, str2);
    }

    /* renamed from: g */
    public C12738v mo47862g(C12821b bVar, C12782u uVar) {
        return mo47863h(bVar, uVar, f55440b);
    }

    /* renamed from: h */
    public C12738v mo47863h(C12821b bVar, C12782u uVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        char i;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            int b = uVar.mo47921b();
            int b2 = uVar.mo47921b();
            int c = uVar.mo47922c();
            while (true) {
                z = true;
                if (b >= c || (i = bVar.mo47972i(b)) == '=') {
                    z2 = false;
                } else if (m54175e(i, cArr)) {
                    z2 = true;
                    break;
                } else {
                    b++;
                }
            }
            z2 = false;
            if (b == c) {
                str = bVar.mo47980r(b2, c);
                z2 = true;
            } else {
                str = bVar.mo47980r(b2, b);
                b++;
            }
            if (z2) {
                uVar.mo47923d(b);
                return mo47861d(str, (String) null);
            }
            int i2 = b;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i2 >= c) {
                    z = z2;
                    break;
                }
                char i3 = bVar.mo47972i(i2);
                if (i3 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && m54175e(i3, cArr)) {
                    break;
                }
                z3 = !z3 && z4 && i3 == '\\';
                i2++;
            }
            while (b < i2 && C12810d.m54317a(bVar.mo47972i(b))) {
                b++;
            }
            int i4 = i2;
            while (i4 > b && C12810d.m54317a(bVar.mo47972i(i4 - 1))) {
                i4--;
            }
            if (i4 - b >= 2 && bVar.mo47972i(b) == '\"' && bVar.mo47972i(i4 - 1) == '\"') {
                b++;
                i4--;
            }
            String q = bVar.mo47979q(b, i4);
            if (z) {
                i2++;
            }
            uVar.mo47923d(i2);
            return mo47861d(str, q);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: i */
    public C12738v[] mo47864i(C12821b bVar, C12782u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            int b = uVar.mo47921b();
            int c = uVar.mo47922c();
            while (b < c && C12810d.m54317a(bVar.mo47972i(b))) {
                b++;
            }
            uVar.mo47923d(b);
            if (uVar.mo47920a()) {
                return new C12738v[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo47920a()) {
                arrayList.add(mo47862g(bVar, uVar));
                if (bVar.mo47972i(uVar.mo47921b() - 1) == ',') {
                    break;
                }
            }
            return (C12738v[]) arrayList.toArray(new C12738v[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
