package p316k9;

import java.io.Serializable;
import p314j9.C12810d;

/* renamed from: k9.b */
/* compiled from: CharArrayBuffer */
public final class C12821b implements Serializable {

    /* renamed from: b */
    private char[] f55489b;

    /* renamed from: c */
    private int f55490c;

    public C12821b(int i) {
        if (i >= 0) {
            this.f55489b = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: l */
    private void m54347l(int i) {
        char[] cArr = new char[Math.max(this.f55489b.length << 1, i)];
        System.arraycopy(this.f55489b, 0, cArr, 0, this.f55490c);
        this.f55489b = cArr;
    }

    /* renamed from: a */
    public void mo47964a(char c) {
        int i = this.f55490c + 1;
        if (i > this.f55489b.length) {
            m54347l(i);
        }
        this.f55489b[this.f55490c] = c;
        this.f55490c = i;
    }

    /* renamed from: b */
    public void mo47965b(Object obj) {
        mo47966c(String.valueOf(obj));
    }

    /* renamed from: c */
    public void mo47966c(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f55490c + length;
        if (i > this.f55489b.length) {
            m54347l(i);
        }
        str.getChars(0, length, this.f55489b, this.f55490c);
        this.f55490c = i;
    }

    /* renamed from: d */
    public void mo47967d(C12820a aVar, int i, int i2) {
        if (aVar != null) {
            mo47969f(aVar.mo47955e(), i, i2);
        }
    }

    /* renamed from: e */
    public void mo47968e(C12821b bVar, int i, int i2) {
        if (bVar != null) {
            mo47970g(bVar.f55489b, i, i2);
        }
    }

    /* renamed from: f */
    public void mo47969f(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("off: ");
                stringBuffer.append(i);
                stringBuffer.append(" len: ");
                stringBuffer.append(i2);
                stringBuffer.append(" b.length: ");
                stringBuffer.append(bArr.length);
                throw new IndexOutOfBoundsException(stringBuffer.toString());
            } else if (i2 != 0) {
                int i4 = this.f55490c;
                int i5 = i2 + i4;
                if (i5 > this.f55489b.length) {
                    m54347l(i5);
                }
                while (i4 < i5) {
                    this.f55489b[i4] = (char) (bArr[i] & 255);
                    i++;
                    i4++;
                }
                this.f55490c = i5;
            }
        }
    }

    /* renamed from: g */
    public void mo47970g(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("off: ");
                stringBuffer.append(i);
                stringBuffer.append(" len: ");
                stringBuffer.append(i2);
                stringBuffer.append(" b.length: ");
                stringBuffer.append(cArr.length);
                throw new IndexOutOfBoundsException(stringBuffer.toString());
            } else if (i2 != 0) {
                int i4 = this.f55490c + i2;
                if (i4 > this.f55489b.length) {
                    m54347l(i4);
                }
                System.arraycopy(cArr, i, this.f55489b, this.f55490c, i2);
                this.f55490c = i4;
            }
        }
    }

    /* renamed from: h */
    public char[] mo47971h() {
        return this.f55489b;
    }

    /* renamed from: i */
    public char mo47972i(int i) {
        return this.f55489b[i];
    }

    /* renamed from: j */
    public void mo47973j() {
        this.f55490c = 0;
    }

    /* renamed from: k */
    public void mo47974k(int i) {
        if (i > 0) {
            int length = this.f55489b.length;
            int i2 = this.f55490c;
            if (i > length - i2) {
                m54347l(i2 + i);
            }
        }
    }

    /* renamed from: m */
    public int mo47975m(int i) {
        return mo47976n(i, 0, this.f55490c);
    }

    /* renamed from: n */
    public int mo47976n(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.f55490c;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f55489b[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo47977o() {
        return this.f55490c == 0;
    }

    /* renamed from: p */
    public int mo47978p() {
        return this.f55490c;
    }

    /* renamed from: q */
    public String mo47979q(int i, int i2) {
        return new String(this.f55489b, i, i2 - i);
    }

    /* renamed from: r */
    public String mo47980r(int i, int i2) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Negative beginIndex: ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        } else if (i2 > this.f55490c) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("endIndex: ");
            stringBuffer2.append(i2);
            stringBuffer2.append(" > length: ");
            stringBuffer2.append(this.f55490c);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        } else if (i <= i2) {
            while (i < i2 && C12810d.m54317a(this.f55489b[i])) {
                i++;
            }
            while (i2 > i && C12810d.m54317a(this.f55489b[i2 - 1])) {
                i2--;
            }
            return new String(this.f55489b, i, i2 - i);
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("beginIndex: ");
            stringBuffer3.append(i);
            stringBuffer3.append(" > endIndex: ");
            stringBuffer3.append(i2);
            throw new IndexOutOfBoundsException(stringBuffer3.toString());
        }
    }

    public String toString() {
        return new String(this.f55489b, 0, this.f55490c);
    }
}
