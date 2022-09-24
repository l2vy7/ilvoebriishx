package p311h9;

import java.util.NoSuchElementException;
import p308g8.C12719d0;
import p308g8.C12722f;
import p308g8.C12740x;

/* renamed from: h9.o */
/* compiled from: BasicTokenIterator */
public class C12776o implements C12719d0 {

    /* renamed from: b */
    protected final C12722f f55463b;

    /* renamed from: c */
    protected String f55464c;

    /* renamed from: d */
    protected String f55465d;

    /* renamed from: e */
    protected int f55466e;

    public C12776o(C12722f fVar) {
        if (fVar != null) {
            this.f55463b = fVar;
            this.f55466e = mo47896b(-1);
            return;
        }
        throw new IllegalArgumentException("Header iterator must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo47895a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47896b(int i) throws C12740x {
        int i2;
        if (i >= 0) {
            i2 = mo47898e(i);
        } else if (!this.f55463b.hasNext()) {
            return -1;
        } else {
            this.f55464c = this.f55463b.mo47775j().getValue();
            i2 = 0;
        }
        int f = mo47899f(i2);
        if (f < 0) {
            this.f55465d = null;
            return -1;
        }
        int c = mo47897c(f);
        this.f55465d = mo47895a(this.f55464c, f, c);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo47897c(int i) {
        if (i >= 0) {
            int length = this.f55464c.length();
            do {
                i++;
                if (i >= length || !mo47901h(this.f55464c.charAt(i))) {
                    return i;
                }
                i++;
                break;
            } while (!mo47901h(this.f55464c.charAt(i)));
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Token start position must not be negative: ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo47898e(int i) {
        if (i >= 0) {
            boolean z = false;
            int length = this.f55464c.length();
            while (!z && i < length) {
                char charAt = this.f55464c.charAt(i);
                if (mo47902i(charAt)) {
                    z = true;
                } else if (mo47903m(charAt)) {
                    i++;
                } else if (mo47901h(charAt)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Tokens without separator (pos ");
                    stringBuffer.append(i);
                    stringBuffer.append("): ");
                    stringBuffer.append(this.f55464c);
                    throw new C12740x(stringBuffer.toString());
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid character after token (pos ");
                    stringBuffer2.append(i);
                    stringBuffer2.append("): ");
                    stringBuffer2.append(this.f55464c);
                    throw new C12740x(stringBuffer2.toString());
                }
            }
            return i;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("Search position must not be negative: ");
        stringBuffer3.append(i);
        throw new IllegalArgumentException(stringBuffer3.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo47899f(int i) {
        if (i >= 0) {
            boolean z = false;
            while (!z) {
                String str = this.f55464c;
                if (str == null) {
                    break;
                }
                int length = str.length();
                while (!z && i < length) {
                    char charAt = this.f55464c.charAt(i);
                    if (mo47902i(charAt) || mo47903m(charAt)) {
                        i++;
                    } else if (mo47901h(this.f55464c.charAt(i))) {
                        z = true;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid character before token (pos ");
                        stringBuffer.append(i);
                        stringBuffer.append("): ");
                        stringBuffer.append(this.f55464c);
                        throw new C12740x(stringBuffer.toString());
                    }
                }
                if (!z) {
                    if (this.f55463b.hasNext()) {
                        this.f55464c = this.f55463b.mo47775j().getValue();
                        i = 0;
                    } else {
                        this.f55464c = null;
                    }
                }
            }
            if (z) {
                return i;
            }
            return -1;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Search position must not be negative: ");
        stringBuffer2.append(i);
        throw new IllegalArgumentException(stringBuffer2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo47900g(char c) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo47901h(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (!Character.isISOControl(c) && !mo47900g(c)) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.f55465d != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo47902i(char c) {
        return c == ',';
    }

    /* renamed from: k */
    public String mo47771k() throws NoSuchElementException, C12740x {
        String str = this.f55465d;
        if (str != null) {
            this.f55466e = mo47896b(this.f55466e);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo47903m(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }

    public final Object next() throws NoSuchElementException, C12740x {
        return mo47771k();
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
