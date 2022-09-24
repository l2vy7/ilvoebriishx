package p305f8;

/* renamed from: f8.a */
/* compiled from: Base64 */
public class C12696a {

    /* renamed from: m */
    static final byte[] f55329m = {13, 10};

    /* renamed from: n */
    private static final byte[] f55330n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: o */
    private static final byte[] f55331o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: p */
    private static final byte[] f55332p = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: a */
    private final byte[] f55333a;

    /* renamed from: b */
    private final int f55334b;

    /* renamed from: c */
    private final byte[] f55335c;

    /* renamed from: d */
    private final int f55336d;

    /* renamed from: e */
    private final int f55337e;

    /* renamed from: f */
    private byte[] f55338f;

    /* renamed from: g */
    private int f55339g;

    /* renamed from: h */
    private int f55340h;

    /* renamed from: i */
    private int f55341i;

    /* renamed from: j */
    private int f55342j;

    /* renamed from: k */
    private boolean f55343k;

    /* renamed from: l */
    private int f55344l;

    public C12696a() {
        this(false);
    }

    /* renamed from: b */
    private static boolean m53995b(byte[] bArr) {
        for (byte m : bArr) {
            if (m54002m(m)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static byte[] m53996e(byte[] bArr) {
        return new C12696a().mo47701d(bArr);
    }

    /* renamed from: h */
    public static byte[] m53997h(byte[] bArr) {
        return m53998i(bArr, false);
    }

    /* renamed from: i */
    public static byte[] m53998i(byte[] bArr, boolean z) {
        return m53999j(bArr, z, false);
    }

    /* renamed from: j */
    public static byte[] m53999j(byte[] bArr, boolean z, boolean z2) {
        return m54000k(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: k */
    public static byte[] m54000k(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = f55329m;
        long l = m54001l(bArr, 76, bArr2);
        if (l <= ((long) i)) {
            return (z ? new C12696a(z2) : new C12696a(0, bArr2, z2)).mo47703g(bArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Input array too big, the output array would be bigger (");
        stringBuffer.append(l);
        stringBuffer.append(") than the specified maxium size of ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: l */
    private static long m54001l(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i / 4) * 4;
        long length = (long) ((bArr.length * 4) / 3);
        long j = length % 4;
        if (j != 0) {
            length += 4 - j;
        }
        if (i2 <= 0) {
            return length;
        }
        long j2 = (long) i2;
        boolean z = length % j2 == 0;
        long length2 = length + ((length / j2) * ((long) bArr2.length));
        return !z ? length2 + ((long) bArr2.length) : length2;
    }

    /* renamed from: m */
    public static boolean m54002m(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = f55332p;
                if (b >= bArr.length || bArr[b] == -1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private void m54003p() {
        this.f55338f = null;
        this.f55339g = 0;
        this.f55340h = 0;
        this.f55341i = 0;
        this.f55342j = 0;
        this.f55343k = false;
    }

    /* renamed from: q */
    private void m54004q() {
        byte[] bArr = this.f55338f;
        if (bArr == null) {
            this.f55338f = new byte[8192];
            this.f55339g = 0;
            this.f55340h = 0;
            return;
        }
        byte[] bArr2 = new byte[(bArr.length * 2)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f55338f = bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo47699a() {
        if (this.f55338f != null) {
            return this.f55339g - this.f55340h;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo47700c(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        if (!this.f55343k) {
            if (i2 < 0) {
                this.f55343k = true;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    break;
                }
                byte[] bArr2 = this.f55338f;
                if (bArr2 == null || bArr2.length - this.f55339g < this.f55336d) {
                    m54004q();
                }
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 == 61) {
                    this.f55343k = true;
                    break;
                }
                if (b2 >= 0) {
                    byte[] bArr3 = f55332p;
                    if (b2 < bArr3.length && (b = bArr3[b2]) >= 0) {
                        int i6 = this.f55342j + 1;
                        this.f55342j = i6;
                        int i7 = i6 % 4;
                        this.f55342j = i7;
                        int i8 = (this.f55344l << 6) + b;
                        this.f55344l = i8;
                        if (i7 == 0) {
                            byte[] bArr4 = this.f55338f;
                            int i9 = this.f55339g;
                            int i10 = i9 + 1;
                            this.f55339g = i10;
                            bArr4[i9] = (byte) ((i8 >> 16) & 255);
                            int i11 = i10 + 1;
                            this.f55339g = i11;
                            bArr4[i10] = (byte) ((i8 >> 8) & 255);
                            this.f55339g = i11 + 1;
                            bArr4[i11] = (byte) (i8 & 255);
                        }
                    }
                }
                i4++;
                i = i5;
            }
            if (this.f55343k && (i3 = this.f55342j) != 0) {
                int i12 = this.f55344l << 6;
                this.f55344l = i12;
                if (i3 == 2) {
                    int i13 = i12 << 6;
                    this.f55344l = i13;
                    byte[] bArr5 = this.f55338f;
                    int i14 = this.f55339g;
                    this.f55339g = i14 + 1;
                    bArr5[i14] = (byte) ((i13 >> 16) & 255);
                } else if (i3 == 3) {
                    byte[] bArr6 = this.f55338f;
                    int i15 = this.f55339g;
                    int i16 = i15 + 1;
                    this.f55339g = i16;
                    bArr6[i15] = (byte) ((i12 >> 16) & 255);
                    this.f55339g = i16 + 1;
                    bArr6[i16] = (byte) ((i12 >> 8) & 255);
                }
            }
        }
    }

    /* renamed from: d */
    public byte[] mo47701d(byte[] bArr) {
        m54003p();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int length = (int) ((long) ((bArr.length * 3) / 4));
        mo47706r(new byte[length], 0, length);
        mo47700c(bArr, 0, bArr.length);
        mo47700c(bArr, 0, -1);
        int i = this.f55339g;
        byte[] bArr2 = new byte[i];
        mo47705o(bArr2, 0, i);
        return bArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo47702f(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f55343k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r12 >= 0) goto L_0x00a5
            r9.f55343k = r1
            byte[] r10 = r9.f55338f
            if (r10 == 0) goto L_0x0017
            int r10 = r10.length
            int r11 = r9.f55339g
            int r10 = r10 - r11
            int r11 = r9.f55337e
            if (r10 >= r11) goto L_0x001a
        L_0x0017:
            r9.m54004q()
        L_0x001a:
            int r10 = r9.f55342j
            r11 = 61
            if (r10 == r1) goto L_0x005b
            r12 = 2
            if (r10 == r12) goto L_0x0024
            goto L_0x008b
        L_0x0024:
            byte[] r10 = r9.f55338f
            int r1 = r9.f55339g
            int r2 = r1 + 1
            r9.f55339g = r2
            byte[] r3 = r9.f55333a
            int r4 = r9.f55344l
            int r5 = r4 >> 10
            r5 = r5 & 63
            byte r5 = r3[r5]
            r10[r1] = r5
            int r1 = r2 + 1
            r9.f55339g = r1
            int r5 = r4 >> 4
            r5 = r5 & 63
            byte r5 = r3[r5]
            r10[r2] = r5
            int r2 = r1 + 1
            r9.f55339g = r2
            int r12 = r4 << 2
            r12 = r12 & 63
            byte r12 = r3[r12]
            r10[r1] = r12
            byte[] r12 = f55330n
            if (r3 != r12) goto L_0x008b
            int r12 = r2 + 1
            r9.f55339g = r12
            r10[r2] = r11
            goto L_0x008b
        L_0x005b:
            byte[] r10 = r9.f55338f
            int r12 = r9.f55339g
            int r1 = r12 + 1
            r9.f55339g = r1
            byte[] r2 = r9.f55333a
            int r3 = r9.f55344l
            int r4 = r3 >> 2
            r4 = r4 & 63
            byte r4 = r2[r4]
            r10[r12] = r4
            int r12 = r1 + 1
            r9.f55339g = r12
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r3 = r2[r3]
            r10[r1] = r3
            byte[] r1 = f55330n
            if (r2 != r1) goto L_0x008b
            int r1 = r12 + 1
            r9.f55339g = r1
            r10[r12] = r11
            int r12 = r1 + 1
            r9.f55339g = r12
            r10[r1] = r11
        L_0x008b:
            int r10 = r9.f55334b
            if (r10 <= 0) goto L_0x0125
            int r10 = r9.f55339g
            if (r10 <= 0) goto L_0x0125
            byte[] r11 = r9.f55335c
            byte[] r12 = r9.f55338f
            int r1 = r11.length
            java.lang.System.arraycopy(r11, r0, r12, r10, r1)
            int r10 = r9.f55339g
            byte[] r11 = r9.f55335c
            int r11 = r11.length
            int r10 = r10 + r11
            r9.f55339g = r10
            goto L_0x0125
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            if (r2 >= r12) goto L_0x0125
            byte[] r3 = r9.f55338f
            if (r3 == 0) goto L_0x00b4
            int r3 = r3.length
            int r4 = r9.f55339g
            int r3 = r3 - r4
            int r4 = r9.f55337e
            if (r3 >= r4) goto L_0x00b7
        L_0x00b4:
            r9.m54004q()
        L_0x00b7:
            int r3 = r9.f55342j
            int r3 = r3 + r1
            r9.f55342j = r3
            int r3 = r3 % 3
            r9.f55342j = r3
            int r4 = r11 + 1
            byte r11 = r10[r11]
            if (r11 >= 0) goto L_0x00c8
            int r11 = r11 + 256
        L_0x00c8:
            int r5 = r9.f55344l
            int r5 = r5 << 8
            int r5 = r5 + r11
            r9.f55344l = r5
            if (r3 != 0) goto L_0x0121
            byte[] r11 = r9.f55338f
            int r3 = r9.f55339g
            int r6 = r3 + 1
            r9.f55339g = r6
            byte[] r7 = r9.f55333a
            int r8 = r5 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            r9.f55339g = r3
            int r8 = r5 >> 12
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r6] = r8
            int r6 = r3 + 1
            r9.f55339g = r6
            int r8 = r5 >> 6
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            r9.f55339g = r3
            r5 = r5 & 63
            byte r5 = r7[r5]
            r11[r6] = r5
            int r5 = r9.f55341i
            int r5 = r5 + 4
            r9.f55341i = r5
            int r6 = r9.f55334b
            if (r6 <= 0) goto L_0x0121
            if (r6 > r5) goto L_0x0121
            byte[] r5 = r9.f55335c
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r11, r3, r6)
            int r11 = r9.f55339g
            byte[] r3 = r9.f55335c
            int r3 = r3.length
            int r11 = r11 + r3
            r9.f55339g = r11
            r9.f55341i = r0
        L_0x0121:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x00a6
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305f8.C12696a.mo47702f(byte[], int, int):void");
    }

    /* renamed from: g */
    public byte[] mo47703g(byte[] bArr) {
        int i;
        m54003p();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int l = (int) m54001l(bArr, this.f55334b, this.f55335c);
        byte[] bArr2 = new byte[l];
        mo47706r(bArr2, 0, l);
        mo47702f(bArr, 0, bArr.length);
        mo47702f(bArr, 0, -1);
        if (this.f55338f != bArr2) {
            mo47705o(bArr2, 0, l);
        }
        if (!mo47704n() || (i = this.f55339g) >= l) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    /* renamed from: n */
    public boolean mo47704n() {
        return this.f55333a == f55331o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo47705o(byte[] bArr, int i, int i2) {
        if (this.f55338f == null) {
            return this.f55343k ? -1 : 0;
        }
        int min = Math.min(mo47699a(), i2);
        byte[] bArr2 = this.f55338f;
        if (bArr2 != bArr) {
            System.arraycopy(bArr2, this.f55340h, bArr, i, min);
            int i3 = this.f55340h + min;
            this.f55340h = i3;
            if (i3 >= this.f55339g) {
                this.f55338f = null;
            }
        } else {
            this.f55338f = null;
        }
        return min;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo47706r(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length == i2) {
            this.f55338f = bArr;
            this.f55339g = i;
            this.f55340h = i;
        }
    }

    public C12696a(boolean z) {
        this(76, f55329m, z);
    }

    public C12696a(int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            bArr = f55329m;
            i = 0;
        }
        this.f55334b = i > 0 ? (i / 4) * 4 : 0;
        byte[] bArr2 = new byte[bArr.length];
        this.f55335c = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        if (i > 0) {
            this.f55337e = bArr.length + 4;
        } else {
            this.f55337e = 4;
        }
        this.f55336d = this.f55337e - 1;
        if (!m53995b(bArr)) {
            this.f55333a = z ? f55331o : f55330n;
            return;
        }
        String c = C12697b.m54015c(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lineSeperator must not contain base64 characters: [");
        stringBuffer.append(c);
        stringBuffer.append("]");
        throw new IllegalArgumentException(stringBuffer.toString());
    }
}
