package p316k9;

import java.io.Serializable;

/* renamed from: k9.a */
/* compiled from: ByteArrayBuffer */
public final class C12820a implements Serializable {

    /* renamed from: b */
    private byte[] f55487b;

    /* renamed from: c */
    private int f55488c;

    public C12820a(int i) {
        if (i >= 0) {
            this.f55487b = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: i */
    private void m54333i(int i) {
        byte[] bArr = new byte[Math.max(this.f55487b.length << 1, i)];
        System.arraycopy(this.f55487b, 0, bArr, 0, this.f55488c);
        this.f55487b = bArr;
    }

    /* renamed from: a */
    public void mo47951a(int i) {
        int i2 = this.f55488c + 1;
        if (i2 > this.f55487b.length) {
            m54333i(i2);
        }
        this.f55487b[this.f55488c] = (byte) i;
        this.f55488c = i2;
    }

    /* renamed from: b */
    public void mo47952b(C12821b bVar, int i, int i2) {
        if (bVar != null) {
            mo47954d(bVar.mo47971h(), i, i2);
        }
    }

    /* renamed from: c */
    public void mo47953c(byte[] bArr, int i, int i2) {
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
                int i4 = this.f55488c + i2;
                if (i4 > this.f55487b.length) {
                    m54333i(i4);
                }
                System.arraycopy(bArr, i, this.f55487b, this.f55488c, i2);
                this.f55488c = i4;
            }
        }
    }

    /* renamed from: d */
    public void mo47954d(char[] cArr, int i, int i2) {
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
                int i4 = this.f55488c;
                int i5 = i2 + i4;
                if (i5 > this.f55487b.length) {
                    m54333i(i5);
                }
                while (i4 < i5) {
                    this.f55487b[i4] = (byte) cArr[i];
                    i++;
                    i4++;
                }
                this.f55488c = i5;
            }
        }
    }

    /* renamed from: e */
    public byte[] mo47955e() {
        return this.f55487b;
    }

    /* renamed from: f */
    public int mo47956f(int i) {
        return this.f55487b[i];
    }

    /* renamed from: g */
    public int mo47957g() {
        return this.f55487b.length;
    }

    /* renamed from: h */
    public void mo47958h() {
        this.f55488c = 0;
    }

    /* renamed from: j */
    public boolean mo47959j() {
        return this.f55488c == 0;
    }

    /* renamed from: k */
    public boolean mo47960k() {
        return this.f55488c == this.f55487b.length;
    }

    /* renamed from: l */
    public int mo47961l() {
        return this.f55488c;
    }

    /* renamed from: m */
    public void mo47962m(int i) {
        if (i < 0 || i > this.f55487b.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("len: ");
            stringBuffer.append(i);
            stringBuffer.append(" < 0 or > buffer len: ");
            stringBuffer.append(this.f55487b.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        this.f55488c = i;
    }

    /* renamed from: n */
    public byte[] mo47963n() {
        int i = this.f55488c;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.f55487b, 0, bArr, 0, i);
        }
        return bArr;
    }
}
