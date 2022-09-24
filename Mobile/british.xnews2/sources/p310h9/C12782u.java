package p310h9;

import p316k9.C12821b;

/* renamed from: h9.u */
/* compiled from: ParserCursor */
public class C12782u {

    /* renamed from: a */
    private final int f55471a;

    /* renamed from: b */
    private final int f55472b;

    /* renamed from: c */
    private int f55473c;

    public C12782u(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.f55471a = i;
            this.f55472b = i2;
            this.f55473c = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    /* renamed from: a */
    public boolean mo47920a() {
        return this.f55473c >= this.f55472b;
    }

    /* renamed from: b */
    public int mo47921b() {
        return this.f55473c;
    }

    /* renamed from: c */
    public int mo47922c() {
        return this.f55472b;
    }

    /* renamed from: d */
    public void mo47923d(int i) {
        if (i < this.f55471a) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("pos: ");
            stringBuffer.append(i);
            stringBuffer.append(" < lowerBound: ");
            stringBuffer.append(this.f55471a);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        } else if (i <= this.f55472b) {
            this.f55473c = i;
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("pos: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" > upperBound: ");
            stringBuffer2.append(this.f55472b);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
    }

    public String toString() {
        C12821b bVar = new C12821b(16);
        bVar.mo47964a('[');
        bVar.mo47966c(Integer.toString(this.f55471a));
        bVar.mo47964a('>');
        bVar.mo47966c(Integer.toString(this.f55473c));
        bVar.mo47964a('>');
        bVar.mo47966c(Integer.toString(this.f55472b));
        bVar.mo47964a(']');
        return bVar.toString();
    }
}
