package p311h9;

import p308g8.C12716c;
import p308g8.C12717c0;
import p308g8.C12736t;
import p308g8.C12740x;
import p308g8.C12742z;
import p315j9.C12810d;
import p317k9.C12821b;

/* renamed from: h9.j */
/* compiled from: BasicLineParser */
public class C12771j implements C12781t {

    /* renamed from: b */
    public static final C12771j f55449b = new C12771j();

    /* renamed from: a */
    protected final C12742z f55450a;

    public C12771j(C12742z zVar) {
        this.f55450a = zVar == null ? C12736t.f55407g : zVar;
    }

    /* renamed from: a */
    public C12716c mo47876a(C12821b bVar) throws C12740x {
        return new C12777p(bVar);
    }

    /* renamed from: b */
    public boolean mo47877b(C12821b bVar, C12782u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            int b = uVar.mo47921b();
            String g = this.f55450a.mo47817g();
            int length = g.length();
            boolean z = false;
            if (bVar.mo47978p() < length + 4) {
                return false;
            }
            if (b < 0) {
                b = (bVar.mo47978p() - 4) - length;
            } else if (b == 0) {
                while (b < bVar.mo47978p() && C12810d.m54317a(bVar.mo47972i(b))) {
                    b++;
                }
            }
            int i = b + length;
            if (i + 4 > bVar.mo47978p()) {
                return false;
            }
            boolean z2 = true;
            int i2 = 0;
            while (z2 && i2 < length) {
                z2 = bVar.mo47972i(b + i2) == g.charAt(i2);
                i2++;
            }
            if (!z2) {
                return z2;
            }
            if (bVar.mo47972i(i) == '/') {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: c */
    public C12717c0 mo47878c(C12821b bVar, C12782u uVar) throws C12740x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            int b = uVar.mo47921b();
            int c = uVar.mo47922c();
            try {
                C12742z f = mo47881f(bVar, uVar);
                mo47882g(bVar, uVar);
                int b2 = uVar.mo47921b();
                int n = bVar.mo47976n(32, b2, c);
                if (n < 0) {
                    n = c;
                }
                String r = bVar.mo47980r(b2, n);
                int i = 0;
                while (i < r.length()) {
                    if (Character.isDigit(r.charAt(i))) {
                        i++;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Status line contains invalid status code: ");
                        stringBuffer.append(bVar.mo47979q(b, c));
                        throw new C12740x(stringBuffer.toString());
                    }
                }
                return mo47880e(f, Integer.parseInt(r), n < c ? bVar.mo47980r(n, c) : "");
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Status line contains invalid status code: ");
                stringBuffer2.append(bVar.mo47979q(b, c));
                throw new C12740x(stringBuffer2.toString());
            } catch (IndexOutOfBoundsException unused2) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid status line: ");
                stringBuffer3.append(bVar.mo47979q(b, c));
                throw new C12740x(stringBuffer3.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12742z mo47879d(int i, int i2) {
        return this.f55450a.mo47809b(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12717c0 mo47880e(C12742z zVar, int i, String str) {
        return new C12775n(zVar, i, str);
    }

    /* renamed from: f */
    public C12742z mo47881f(C12821b bVar, C12782u uVar) throws C12740x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            String g = this.f55450a.mo47817g();
            int length = g.length();
            int b = uVar.mo47921b();
            int c = uVar.mo47922c();
            mo47882g(bVar, uVar);
            int b2 = uVar.mo47921b();
            int i = b2 + length;
            if (i + 4 <= c) {
                boolean z = false;
                boolean z2 = true;
                int i2 = 0;
                while (z2 && i2 < length) {
                    z2 = bVar.mo47972i(b2 + i2) == g.charAt(i2);
                    i2++;
                }
                if (z2) {
                    if (bVar.mo47972i(i) == '/') {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    int i3 = b2 + length + 1;
                    int n = bVar.mo47976n(46, i3, c);
                    if (n != -1) {
                        try {
                            int parseInt = Integer.parseInt(bVar.mo47980r(i3, n));
                            int i4 = n + 1;
                            int n2 = bVar.mo47976n(32, i4, c);
                            if (n2 == -1) {
                                n2 = c;
                            }
                            try {
                                int parseInt2 = Integer.parseInt(bVar.mo47980r(i4, n2));
                                uVar.mo47923d(n2);
                                return mo47879d(parseInt, parseInt2);
                            } catch (NumberFormatException unused) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Invalid protocol minor version number: ");
                                stringBuffer.append(bVar.mo47979q(b, c));
                                throw new C12740x(stringBuffer.toString());
                            }
                        } catch (NumberFormatException unused2) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Invalid protocol major version number: ");
                            stringBuffer2.append(bVar.mo47979q(b, c));
                            throw new C12740x(stringBuffer2.toString());
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Invalid protocol version number: ");
                        stringBuffer3.append(bVar.mo47979q(b, c));
                        throw new C12740x(stringBuffer3.toString());
                    }
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Not a valid protocol version: ");
                    stringBuffer4.append(bVar.mo47979q(b, c));
                    throw new C12740x(stringBuffer4.toString());
                }
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Not a valid protocol version: ");
                stringBuffer5.append(bVar.mo47979q(b, c));
                throw new C12740x(stringBuffer5.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo47882g(C12821b bVar, C12782u uVar) {
        int b = uVar.mo47921b();
        int c = uVar.mo47922c();
        while (b < c && C12810d.m54317a(bVar.mo47972i(b))) {
            b++;
        }
        uVar.mo47923d(b);
    }

    public C12771j() {
        this((C12742z) null);
    }
}
