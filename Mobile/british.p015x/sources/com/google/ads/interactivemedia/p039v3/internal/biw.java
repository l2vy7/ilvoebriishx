package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.biw */
/* compiled from: IMASDK */
public class biw implements Closeable {

    /* renamed from: a */
    int f16434a = 0;

    /* renamed from: b */
    private final Reader f16435b;

    /* renamed from: c */
    private boolean f16436c = false;

    /* renamed from: d */
    private final char[] f16437d = new char[1024];

    /* renamed from: e */
    private int f16438e = 0;

    /* renamed from: f */
    private int f16439f = 0;

    /* renamed from: g */
    private int f16440g = 0;

    /* renamed from: h */
    private int f16441h = 0;

    /* renamed from: i */
    private long f16442i;

    /* renamed from: j */
    private int f16443j;

    /* renamed from: k */
    private String f16444k;

    /* renamed from: l */
    private int[] f16445l;

    /* renamed from: m */
    private int f16446m;

    /* renamed from: n */
    private String[] f16447n;

    /* renamed from: o */
    private int[] f16448o;

    static {
        bfz.f16269a = new biv();
    }

    public biw(Reader reader) {
        int[] iArr = new int[32];
        this.f16445l = iArr;
        this.f16446m = 1;
        iArr[0] = 6;
        this.f16447n = new String[32];
        this.f16448o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f16435b = reader;
    }

    /* renamed from: A */
    private final void m15942A() throws IOException {
        if (!this.f16436c) {
            throw m15945D("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: B */
    private final void m15943B() throws IOException {
        char c;
        do {
            if (this.f16438e < this.f16439f || m15951y(1)) {
                char[] cArr = this.f16437d;
                int i = this.f16438e;
                int i2 = i + 1;
                this.f16438e = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f16440g++;
                    this.f16441h = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: C */
    private final char m15944C() throws IOException {
        int i;
        if (this.f16438e != this.f16439f || m15951y(1)) {
            char[] cArr = this.f16437d;
            int i2 = this.f16438e;
            int i3 = i2 + 1;
            this.f16438e = i3;
            char c = cArr[i2];
            if (c == 10) {
                this.f16440g++;
                this.f16441h = i3;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m15945D("Invalid escape sequence");
                } else if (i3 + 4 <= this.f16439f || m15951y(4)) {
                    int i4 = this.f16438e;
                    int i5 = i4 + 4;
                    char c2 = 0;
                    while (i4 < i5) {
                        char[] cArr2 = this.f16437d;
                        char c3 = cArr2[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 >= '0' && c3 <= '9') {
                            i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'W';
                        } else if (c3 < 'A' || c3 > 'F') {
                            String str = new String(cArr2, this.f16438e, 4);
                            throw new NumberFormatException(str.length() != 0 ? "\\u".concat(str) : new String("\\u"));
                        } else {
                            i = c3 - '7';
                        }
                        c2 = (char) (c4 + i);
                        i4++;
                    }
                    this.f16438e += 4;
                    return c2;
                } else {
                    throw m15945D("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m15945D("Unterminated escape sequence");
    }

    /* renamed from: D */
    private final IOException m15945D(String str) throws IOException {
        String valueOf = String.valueOf(mo15141t());
        throw new biz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: n */
    private final boolean m15946n(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m15942A();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f16438e = r2;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m15947u(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f16437d
            r1 = 0
        L_0x0003:
            int r2 = r9.f16438e
            int r3 = r9.f16439f
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005d
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0029
            r9.f16438e = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0021
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0021:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0029:
            r8 = 92
            if (r2 != r8) goto L_0x0050
            r9.f16438e = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0041
            int r1 = r7 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0041:
            r1.append(r0, r3, r7)
            char r2 = r9.m15944C()
            r1.append(r2)
            int r2 = r9.f16438e
            int r3 = r9.f16439f
            goto L_0x0007
        L_0x0050:
            r5 = 10
            if (r2 != r5) goto L_0x005b
            int r2 = r9.f16440g
            int r2 = r2 + r6
            r9.f16440g = r2
            r9.f16441h = r7
        L_0x005b:
            r2 = r7
            goto L_0x0009
        L_0x005d:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f16438e = r2
            boolean r2 = r9.m15951y(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m15945D(r10)
            goto L_0x0082
        L_0x0081:
            throw r10
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.biw.m15947u(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        m15942A();
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m15948v() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r5.f16438e
            int r3 = r3 + r2
            int r4 = r5.f16439f
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f16437d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x0058
            r4 = 10
            if (r3 == r4) goto L_0x0058
            r4 = 12
            if (r3 == r4) goto L_0x0058
            r4 = 13
            if (r3 == r4) goto L_0x0058
            r4 = 32
            if (r3 == r4) goto L_0x0058
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x0058
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 58
            if (r3 == r4) goto L_0x0058
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x0058;
                case 92: goto L_0x0048;
                case 93: goto L_0x0058;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.m15942A()
            goto L_0x0058
        L_0x004c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L_0x005a
            int r3 = r2 + 1
            boolean r3 = r5.m15951y(r3)
            if (r3 != 0) goto L_0x0003
        L_0x0058:
            r0 = r2
            goto L_0x007a
        L_0x005a:
            if (r1 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x0067:
            char[] r3 = r5.f16437d
            int r4 = r5.f16438e
            r1.append(r3, r4, r2)
            int r3 = r5.f16438e
            int r3 = r3 + r2
            r5.f16438e = r3
            r2 = 1
            boolean r2 = r5.m15951y(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f16437d
            int r3 = r5.f16438e
            r1.<init>(r2, r3, r0)
            goto L_0x0091
        L_0x0086:
            char[] r2 = r5.f16437d
            int r3 = r5.f16438e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0091:
            int r2 = r5.f16438e
            int r2 = r2 + r0
            r5.f16438e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.biw.m15948v():java.lang.String");
    }

    /* renamed from: w */
    private final void m15949w(char c) throws IOException {
        char[] cArr = this.f16437d;
        do {
            int i = this.f16438e;
            int i2 = this.f16439f;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f16438e = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f16438e = i3;
                    m15944C();
                    i = this.f16438e;
                    i2 = this.f16439f;
                } else {
                    if (c2 == 10) {
                        this.f16440g++;
                        this.f16441h = i3;
                    }
                    i = i3;
                }
            }
            this.f16438e = i;
        } while (m15951y(1));
        throw m15945D("Unterminated string");
    }

    /* renamed from: x */
    private final void m15950x(int i) {
        int i2 = this.f16446m;
        int[] iArr = this.f16445l;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.f16445l = Arrays.copyOf(iArr, i3);
            this.f16448o = Arrays.copyOf(this.f16448o, i3);
            this.f16447n = (String[]) Arrays.copyOf(this.f16447n, i3);
        }
        int[] iArr2 = this.f16445l;
        int i4 = this.f16446m;
        this.f16446m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: y */
    private final boolean m15951y(int i) throws IOException {
        int i2;
        char[] cArr = this.f16437d;
        int i3 = this.f16441h;
        int i4 = this.f16438e;
        this.f16441h = i3 - i4;
        int i5 = this.f16439f;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f16439f = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f16439f = 0;
        }
        this.f16438e = 0;
        do {
            Reader reader = this.f16435b;
            int i7 = this.f16439f;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f16439f + read;
            this.f16439f = i2;
            if (this.f16440g == 0 && this.f16441h == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f16438e++;
                this.f16441h = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: z */
    private final int m15952z(boolean z) throws IOException {
        String str;
        char[] cArr = this.f16437d;
        int i = this.f16438e;
        int i2 = this.f16439f;
        while (true) {
            if (i == i2) {
                this.f16438e = i;
                if (m15951y(1)) {
                    i = this.f16438e;
                    i2 = this.f16439f;
                } else if (!z) {
                    return -1;
                } else {
                    String valueOf = String.valueOf(mo15141t());
                    if (valueOf.length() != 0) {
                        str = "End of input".concat(valueOf);
                    } else {
                        str = new String("End of input");
                    }
                    throw new EOFException(str);
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f16440g++;
                this.f16441h = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f16438e = i3;
                    if (i3 == i2) {
                        this.f16438e = i3 - 1;
                        boolean y = m15951y(2);
                        this.f16438e++;
                        if (!y) {
                            return 47;
                        }
                    }
                    m15942A();
                    int i4 = this.f16438e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f16438e = i4 + 1;
                        while (true) {
                            if (this.f16438e + 2 <= this.f16439f || m15951y(2)) {
                                char[] cArr2 = this.f16437d;
                                int i5 = this.f16438e;
                                if (cArr2[i5] != 10) {
                                    int i6 = 0;
                                    while (i6 < 2) {
                                        if (this.f16437d[this.f16438e + i6] == "*/".charAt(i6)) {
                                            i6++;
                                        }
                                    }
                                    i = 2 + this.f16438e;
                                    i2 = this.f16439f;
                                    break;
                                }
                                this.f16440g++;
                                this.f16441h = i5 + 1;
                                this.f16438e++;
                            } else {
                                throw m15945D("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.f16438e = i4 + 1;
                        m15943B();
                        i = this.f16438e;
                        i2 = this.f16439f;
                    }
                } else if (c == '#') {
                    this.f16438e = i3;
                    m15942A();
                    m15943B();
                    i = this.f16438e;
                    i2 = this.f16439f;
                } else {
                    this.f16438e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: a */
    public void mo15085a() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 3) {
            m15950x(1);
            this.f16448o[this.f16446m - 1] = 0;
            this.f16434a = 0;
            return;
        }
        String a = bix.m15972a(mo15101p());
        String t = mo15141t();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 29 + String.valueOf(t).length());
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(a);
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public void mo15086b() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 4) {
            int i2 = this.f16446m - 1;
            this.f16446m = i2;
            int[] iArr = this.f16448o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f16434a = 0;
            return;
        }
        String a = bix.m15972a(mo15101p());
        String t = mo15141t();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 27 + String.valueOf(t).length());
        sb.append("Expected END_ARRAY but was ");
        sb.append(a);
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo15087c() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 1) {
            m15950x(3);
            this.f16434a = 0;
            return;
        }
        String a = bix.m15972a(mo15101p());
        String t = mo15141t();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 30 + String.valueOf(t).length());
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(a);
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    public void close() throws IOException {
        this.f16434a = 0;
        this.f16445l[0] = 8;
        this.f16446m = 1;
        this.f16435b.close();
    }

    /* renamed from: d */
    public void mo15089d() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 2) {
            int i2 = this.f16446m - 1;
            this.f16446m = i2;
            this.f16447n[i2] = null;
            int[] iArr = this.f16448o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f16434a = 0;
            return;
        }
        String a = bix.m15972a(mo15101p());
        String t = mo15141t();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(t).length());
        sb.append("Expected END_OBJECT but was ");
        sb.append(a);
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public boolean mo15090e() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public String mo15091f() throws IOException {
        String str;
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 14) {
            str = m15948v();
        } else if (i == 12) {
            str = m15947u('\'');
        } else if (i == 13) {
            str = m15947u('\"');
        } else {
            String a = bix.m15972a(mo15101p());
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24 + String.valueOf(t).length());
            sb.append("Expected a name but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
        this.f16434a = 0;
        this.f16447n[this.f16446m - 1] = str;
        return str;
    }

    /* renamed from: g */
    public String mo15092g() throws IOException {
        String str;
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 10) {
            str = m15948v();
        } else if (i == 8) {
            str = m15947u('\'');
        } else if (i == 9) {
            str = m15947u('\"');
        } else if (i == 11) {
            str = this.f16444k;
            this.f16444k = null;
        } else if (i == 15) {
            str = Long.toString(this.f16442i);
        } else if (i == 16) {
            str = new String(this.f16437d, this.f16438e, this.f16443j);
            this.f16438e += this.f16443j;
        } else {
            String a = bix.m15972a(mo15101p());
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26 + String.valueOf(t).length());
            sb.append("Expected a string but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
        this.f16434a = 0;
        int[] iArr = this.f16448o;
        int i2 = this.f16446m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: h */
    public boolean mo15093h() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 5) {
            this.f16434a = 0;
            int[] iArr = this.f16448o;
            int i2 = this.f16446m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f16434a = 0;
            int[] iArr2 = this.f16448o;
            int i3 = this.f16446m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            String a = bix.m15972a(mo15101p());
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 27 + String.valueOf(t).length());
            sb.append("Expected a boolean but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: i */
    public void mo15094i() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 7) {
            this.f16434a = 0;
            int[] iArr = this.f16448o;
            int i2 = this.f16446m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String a = bix.m15972a(mo15101p());
        String t = mo15141t();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22 + String.valueOf(t).length());
        sb.append("Expected null but was ");
        sb.append(a);
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public double mo15095j() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 15) {
            this.f16434a = 0;
            int[] iArr = this.f16448o;
            int i2 = this.f16446m - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f16442i;
        }
        if (i == 16) {
            this.f16444k = new String(this.f16437d, this.f16438e, this.f16443j);
            this.f16438e += this.f16443j;
        } else if (i == 8 || i == 9) {
            this.f16444k = m15947u(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f16444k = m15948v();
        } else if (i != 11) {
            String a = bix.m15972a(mo15101p());
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26 + String.valueOf(t).length());
            sb.append("Expected a double but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
        this.f16434a = 11;
        double parseDouble = Double.parseDouble(this.f16444k);
        if (this.f16436c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f16444k = null;
            this.f16434a = 0;
            int[] iArr2 = this.f16448o;
            int i3 = this.f16446m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        String t2 = mo15141t();
        StringBuilder sb2 = new StringBuilder(String.valueOf(t2).length() + 57);
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(t2);
        throw new biz(sb2.toString());
    }

    /* renamed from: k */
    public long mo15096k() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 15) {
            this.f16434a = 0;
            int[] iArr = this.f16448o;
            int i2 = this.f16446m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f16442i;
        }
        if (i == 16) {
            this.f16444k = new String(this.f16437d, this.f16438e, this.f16443j);
            this.f16438e += this.f16443j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f16444k = m15948v();
            } else {
                this.f16444k = m15947u(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f16444k);
                this.f16434a = 0;
                int[] iArr2 = this.f16448o;
                int i3 = this.f16446m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            String a = bix.m15972a(mo15101p());
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24 + String.valueOf(t).length());
            sb.append("Expected a long but was ");
            sb.append(a);
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
        this.f16434a = 11;
        double parseDouble = Double.parseDouble(this.f16444k);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f16444k = null;
            this.f16434a = 0;
            int[] iArr3 = this.f16448o;
            int i4 = this.f16446m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        String str = this.f16444k;
        String t2 = mo15141t();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(t2).length());
        sb2.append("Expected a long but was ");
        sb2.append(str);
        sb2.append(t2);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: l */
    public int mo15097l() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        if (i == 15) {
            long j = this.f16442i;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f16434a = 0;
                int[] iArr = this.f16448o;
                int i3 = this.f16446m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            String t = mo15141t();
            StringBuilder sb = new StringBuilder(String.valueOf(t).length() + 44);
            sb.append("Expected an int but was ");
            sb.append(j);
            sb.append(t);
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f16444k = new String(this.f16437d, this.f16438e, this.f16443j);
            this.f16438e += this.f16443j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f16444k = m15948v();
            } else {
                this.f16444k = m15947u(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f16444k);
                this.f16434a = 0;
                int[] iArr2 = this.f16448o;
                int i4 = this.f16446m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            String a = bix.m15972a(mo15101p());
            String t2 = mo15141t();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 24 + String.valueOf(t2).length());
            sb2.append("Expected an int but was ");
            sb2.append(a);
            sb2.append(t2);
            throw new IllegalStateException(sb2.toString());
        }
        this.f16434a = 11;
        double parseDouble = Double.parseDouble(this.f16444k);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f16444k = null;
            this.f16434a = 0;
            int[] iArr3 = this.f16448o;
            int i6 = this.f16446m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        String str = this.f16444k;
        String t3 = mo15141t();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(t3).length());
        sb3.append("Expected an int but was ");
        sb3.append(str);
        sb3.append(t3);
        throw new NumberFormatException(sb3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009d, code lost:
        m15942A();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15098m() throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r10.f16434a
            if (r2 != 0) goto L_0x000a
            int r2 = r10.mo15140s()
        L_0x000a:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            r10.m15950x(r4)
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x00af
        L_0x0015:
            if (r2 != r4) goto L_0x001b
            r10.m15950x(r3)
            goto L_0x0011
        L_0x001b:
            r3 = 4
            if (r2 != r3) goto L_0x0028
        L_0x001e:
            int r2 = r10.f16446m
            int r2 = r2 + -1
            r10.f16446m = r2
            int r1 = r1 + -1
            goto L_0x00af
        L_0x0028:
            r3 = 2
            if (r2 != r3) goto L_0x002c
            goto L_0x001e
        L_0x002c:
            r3 = 14
            r5 = 13
            r6 = 12
            r7 = 9
            r8 = 10
            if (r2 == r3) goto L_0x005f
            if (r2 != r8) goto L_0x003b
            goto L_0x005f
        L_0x003b:
            r3 = 8
            if (r2 == r3) goto L_0x0059
            if (r2 != r6) goto L_0x0042
            goto L_0x0059
        L_0x0042:
            if (r2 == r7) goto L_0x0053
            if (r2 != r5) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            r3 = 16
            if (r2 != r3) goto L_0x00af
            int r2 = r10.f16438e
            int r3 = r10.f16443j
            int r2 = r2 + r3
            r10.f16438e = r2
            goto L_0x00af
        L_0x0053:
            r2 = 34
            r10.m15949w(r2)
            goto L_0x00af
        L_0x0059:
            r2 = 39
            r10.m15949w(r2)
            goto L_0x00af
        L_0x005f:
            r2 = 0
        L_0x0060:
            int r3 = r10.f16438e
            int r3 = r3 + r2
            int r9 = r10.f16439f
            if (r3 >= r9) goto L_0x00a6
            char[] r9 = r10.f16437d
            char r3 = r9[r3]
            if (r3 == r7) goto L_0x00a0
            if (r3 == r8) goto L_0x00a0
            if (r3 == r6) goto L_0x00a0
            if (r3 == r5) goto L_0x00a0
            r9 = 32
            if (r3 == r9) goto L_0x00a0
            r9 = 35
            if (r3 == r9) goto L_0x009d
            r9 = 44
            if (r3 == r9) goto L_0x00a0
            r9 = 47
            if (r3 == r9) goto L_0x009d
            r9 = 61
            if (r3 == r9) goto L_0x009d
            r9 = 123(0x7b, float:1.72E-43)
            if (r3 == r9) goto L_0x00a0
            r9 = 125(0x7d, float:1.75E-43)
            if (r3 == r9) goto L_0x00a0
            r9 = 58
            if (r3 == r9) goto L_0x00a0
            r9 = 59
            if (r3 == r9) goto L_0x009d
            switch(r3) {
                case 91: goto L_0x00a0;
                case 92: goto L_0x009d;
                case 93: goto L_0x00a0;
                default: goto L_0x009a;
            }
        L_0x009a:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x009d:
            r10.m15942A()
        L_0x00a0:
            int r3 = r10.f16438e
            int r3 = r3 + r2
            r10.f16438e = r3
            goto L_0x00af
        L_0x00a6:
            r10.f16438e = r3
            boolean r2 = r10.m15951y(r4)
            if (r2 == 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            r10.f16434a = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r10.f16448o
            int r1 = r10.f16446m
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            java.lang.String[] r0 = r10.f16447n
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.biw.mo15098m():void");
    }

    /* renamed from: o */
    public String mo15100o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f16446m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f16445l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f16448o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f16447n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: p */
    public int mo15101p() throws IOException {
        int i = this.f16434a;
        if (i == 0) {
            i = mo15140s();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* renamed from: q */
    public final void mo15138q(boolean z) {
        this.f16436c = z;
    }

    /* renamed from: r */
    public final boolean mo15139r() {
        return this.f16436c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0218, code lost:
        if (m15946n(r1) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021c, code lost:
        if (r9 != 2) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021e, code lost:
        if (r13 == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0224, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0226, code lost:
        if (r16 == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0228, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022a, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x022e, code lost:
        if (r11 != 0) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0230, code lost:
        if (r14 != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0232, code lost:
        if (r14 == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0235, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0236, code lost:
        r0.f16442i = r11;
        r0.f16438e += r10;
        r0.f16434a = 15;
        r14 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0244, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0246, code lost:
        if (r9 == r1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0249, code lost:
        if (r9 == 4) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x024c, code lost:
        if (r9 != 7) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x024e, code lost:
        r0.f16443j = r10;
        r0.f16434a = 16;
        r14 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x029b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15140s() throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f16445l
            int r2 = r0.f16446m
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r6 = 10
            r8 = 39
            r9 = 93
            r10 = 59
            r11 = 44
            r12 = 6
            r13 = 3
            r15 = 4
            r5 = 5
            r7 = 2
            r14 = 1
            if (r4 != r14) goto L_0x0021
            r1[r2] = r7
        L_0x001e:
            r1 = 0
            goto L_0x00dd
        L_0x0021:
            if (r4 != r7) goto L_0x003b
            int r1 = r0.m15952z(r14)
            if (r1 == r11) goto L_0x001e
            if (r1 == r10) goto L_0x0037
            if (r1 != r9) goto L_0x0030
            r0.f16434a = r15
            return r15
        L_0x0030:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.m15945D(r1)
            throw r1
        L_0x0037:
            r19.m15942A()
            goto L_0x001e
        L_0x003b:
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r13) goto L_0x02db
            if (r4 != r5) goto L_0x0043
            goto L_0x02db
        L_0x0043:
            if (r4 != r15) goto L_0x0077
            r1[r2] = r5
            int r1 = r0.m15952z(r14)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x0070
            r19.m15942A()
            int r1 = r0.f16438e
            int r2 = r0.f16439f
            if (r1 < r2) goto L_0x0062
            boolean r1 = r0.m15951y(r14)
            if (r1 == 0) goto L_0x001e
        L_0x0062:
            char[] r1 = r0.f16437d
            int r2 = r0.f16438e
            char r1 = r1[r2]
            r7 = 62
            if (r1 != r7) goto L_0x001e
            int r2 = r2 + r14
            r0.f16438e = r2
            goto L_0x001e
        L_0x0070:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.m15945D(r1)
            throw r1
        L_0x0077:
            if (r4 != r12) goto L_0x00c0
            boolean r1 = r0.f16436c
            if (r1 == 0) goto L_0x00b6
            r0.m15952z(r14)
            int r1 = r0.f16438e
            int r1 = r1 + r3
            r0.f16438e = r1
            int r2 = r1 + 5
            int r12 = r0.f16439f
            if (r2 <= r12) goto L_0x0092
            boolean r2 = r0.m15951y(r5)
            if (r2 != 0) goto L_0x0092
            goto L_0x00b6
        L_0x0092:
            char[] r2 = r0.f16437d
            char r12 = r2[r1]
            r13 = 41
            if (r12 != r13) goto L_0x00b6
            int r12 = r1 + 1
            char r12 = r2[r12]
            if (r12 != r9) goto L_0x00b6
            int r12 = r1 + 2
            char r12 = r2[r12]
            if (r12 != r7) goto L_0x00b6
            int r7 = r1 + 3
            char r7 = r2[r7]
            if (r7 != r8) goto L_0x00b6
            int r1 = r1 + r15
            char r1 = r2[r1]
            if (r1 != r6) goto L_0x00b6
            int r1 = r0.f16438e
            int r1 = r1 + r5
            r0.f16438e = r1
        L_0x00b6:
            int[] r1 = r0.f16445l
            int r2 = r0.f16446m
            int r2 = r2 + r3
            r7 = 7
            r1[r2] = r7
            goto L_0x001e
        L_0x00c0:
            r7 = 7
            if (r4 != r7) goto L_0x00d8
            r1 = 0
            int r2 = r0.m15952z(r1)
            if (r2 != r3) goto L_0x00cf
            r1 = 17
            r0.f16434a = r1
            return r1
        L_0x00cf:
            r19.m15942A()
            int r2 = r0.f16438e
            int r2 = r2 + r3
            r0.f16438e = r2
            goto L_0x00dd
        L_0x00d8:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x02d3
        L_0x00dd:
            int r2 = r0.m15952z(r14)
            r7 = 34
            if (r2 == r7) goto L_0x02ce
            if (r2 == r8) goto L_0x02c6
            if (r2 == r11) goto L_0x02ac
            if (r2 == r10) goto L_0x02ac
            r7 = 91
            if (r2 == r7) goto L_0x02a8
            if (r2 == r9) goto L_0x02a0
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x029c
            int r2 = r0.f16438e
            int r2 = r2 + r3
            r0.f16438e = r2
            char[] r3 = r0.f16437d
            char r2 = r3[r2]
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0124
            r3 = 84
            if (r2 != r3) goto L_0x0107
            goto L_0x0124
        L_0x0107:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x011e
            r3 = 70
            if (r2 != r3) goto L_0x0110
            goto L_0x011e
        L_0x0110:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0118
            r3 = 78
            if (r2 != r3) goto L_0x0173
        L_0x0118:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L_0x0129
        L_0x011e:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r4 = 6
            goto L_0x0129
        L_0x0124:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r4 = 5
        L_0x0129:
            int r7 = r2.length()
            r8 = 1
        L_0x012e:
            if (r8 >= r7) goto L_0x0157
            int r9 = r0.f16438e
            int r9 = r9 + r8
            int r10 = r0.f16439f
            if (r9 < r10) goto L_0x0140
            int r9 = r8 + 1
            boolean r9 = r0.m15951y(r9)
            if (r9 != 0) goto L_0x0140
            goto L_0x0173
        L_0x0140:
            char[] r9 = r0.f16437d
            int r10 = r0.f16438e
            int r10 = r10 + r8
            char r9 = r9[r10]
            char r10 = r2.charAt(r8)
            if (r9 == r10) goto L_0x0154
            char r10 = r3.charAt(r8)
            if (r9 == r10) goto L_0x0154
            goto L_0x0173
        L_0x0154:
            int r8 = r8 + 1
            goto L_0x012e
        L_0x0157:
            int r2 = r0.f16438e
            int r2 = r2 + r7
            int r3 = r0.f16439f
            if (r2 < r3) goto L_0x0166
            int r2 = r7 + 1
            boolean r2 = r0.m15951y(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0166:
            char[] r2 = r0.f16437d
            int r3 = r0.f16438e
            int r3 = r3 + r7
            char r2 = r2[r3]
            boolean r2 = r0.m15946n(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0173:
            r4 = 0
            goto L_0x017c
        L_0x0175:
            int r2 = r0.f16438e
            int r2 = r2 + r7
            r0.f16438e = r2
            r0.f16434a = r4
        L_0x017c:
            if (r4 != 0) goto L_0x029b
            char[] r2 = r0.f16437d
            int r3 = r0.f16438e
            int r4 = r0.f16439f
            r7 = 0
            r11 = r7
            r9 = 0
            r10 = 0
            r13 = 1
            r16 = 0
        L_0x018c:
            int r1 = r3 + r10
            if (r1 != r4) goto L_0x01a8
            r1 = 1024(0x400, float:1.435E-42)
            if (r10 != r1) goto L_0x0197
        L_0x0194:
            r14 = 0
            goto L_0x027d
        L_0x0197:
            int r1 = r10 + 1
            boolean r1 = r0.m15951y(r1)
            if (r1 != 0) goto L_0x01a2
        L_0x019f:
            r1 = 2
            goto L_0x021c
        L_0x01a2:
            int r1 = r0.f16438e
            int r3 = r0.f16439f
            r4 = r3
            r3 = r1
        L_0x01a8:
            int r1 = r3 + r10
            char r1 = r2[r1]
            r6 = 43
            if (r1 == r6) goto L_0x0271
            r6 = 69
            if (r1 == r6) goto L_0x0268
            r6 = 101(0x65, float:1.42E-43)
            if (r1 == r6) goto L_0x0268
            r6 = 45
            if (r1 == r6) goto L_0x025d
            r6 = 46
            if (r1 == r6) goto L_0x0257
            r6 = 48
            if (r1 < r6) goto L_0x0214
            r6 = 57
            if (r1 <= r6) goto L_0x01c9
            goto L_0x0214
        L_0x01c9:
            if (r9 == r14) goto L_0x020c
            if (r9 != 0) goto L_0x01ce
            goto L_0x020c
        L_0x01ce:
            r6 = 2
            if (r9 != r6) goto L_0x01fd
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01d6
            goto L_0x0194
        L_0x01d6:
            r17 = 10
            long r17 = r17 * r11
            int r1 = r1 + -48
            long r14 = (long) r1
            long r17 = r17 - r14
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x01f8
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x01f6
            int r1 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r1 = 0
            goto L_0x01f9
        L_0x01f8:
            r1 = 1
        L_0x01f9:
            r13 = r13 & r1
            r11 = r17
            goto L_0x0201
        L_0x01fd:
            r1 = 3
            if (r9 != r1) goto L_0x0204
            r9 = 4
        L_0x0201:
            r14 = 6
            goto L_0x0275
        L_0x0204:
            r14 = 6
            if (r9 == r5) goto L_0x0209
            if (r9 != r14) goto L_0x0275
        L_0x0209:
            r9 = 7
            goto L_0x0275
        L_0x020c:
            r14 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r11 = (long) r1
            r9 = 2
            goto L_0x0275
        L_0x0214:
            boolean r1 = r0.m15946n(r1)
            if (r1 == 0) goto L_0x019f
            goto L_0x0194
        L_0x021c:
            if (r9 != r1) goto L_0x0246
            if (r13 == 0) goto L_0x0244
            r1 = -9223372036854775808
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x022a
            if (r16 == 0) goto L_0x0244
            r14 = 1
            goto L_0x022c
        L_0x022a:
            r14 = r16
        L_0x022c:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0232
            if (r14 != 0) goto L_0x0244
        L_0x0232:
            if (r14 == 0) goto L_0x0235
            goto L_0x0236
        L_0x0235:
            long r11 = -r11
        L_0x0236:
            r0.f16442i = r11
            int r1 = r0.f16438e
            int r1 = r1 + r10
            r0.f16438e = r1
            r1 = 15
            r0.f16434a = r1
            r14 = 15
            goto L_0x027d
        L_0x0244:
            r1 = 2
            r9 = 2
        L_0x0246:
            if (r9 == r1) goto L_0x024e
            r1 = 4
            if (r9 == r1) goto L_0x024e
            r1 = 7
            if (r9 != r1) goto L_0x0194
        L_0x024e:
            r0.f16443j = r10
            r1 = 16
            r0.f16434a = r1
            r14 = 16
            goto L_0x027d
        L_0x0257:
            r1 = 2
            r14 = 6
            if (r9 != r1) goto L_0x0194
            r9 = 3
            goto L_0x0275
        L_0x025d:
            r1 = 2
            r14 = 6
            if (r9 != 0) goto L_0x0265
            r9 = 1
            r16 = 1
            goto L_0x0275
        L_0x0265:
            if (r9 != r5) goto L_0x0194
            goto L_0x0274
        L_0x0268:
            r1 = 2
            r14 = 6
            if (r9 == r1) goto L_0x026f
            r1 = 4
            if (r9 != r1) goto L_0x0194
        L_0x026f:
            r9 = 5
            goto L_0x0275
        L_0x0271:
            r14 = 6
            if (r9 != r5) goto L_0x0194
        L_0x0274:
            r9 = 6
        L_0x0275:
            int r10 = r10 + 1
            r6 = 10
            r14 = 1
            r15 = 4
            goto L_0x018c
        L_0x027d:
            if (r14 == 0) goto L_0x0280
            return r14
        L_0x0280:
            char[] r1 = r0.f16437d
            int r2 = r0.f16438e
            char r1 = r1[r2]
            boolean r1 = r0.m15946n(r1)
            if (r1 == 0) goto L_0x0294
            r19.m15942A()
            r1 = 10
            r0.f16434a = r1
            return r1
        L_0x0294:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.m15945D(r1)
            throw r1
        L_0x029b:
            return r4
        L_0x029c:
            r1 = 1
            r0.f16434a = r1
            return r1
        L_0x02a0:
            r1 = 1
            if (r4 == r1) goto L_0x02a4
            goto L_0x02ad
        L_0x02a4:
            r2 = 4
            r0.f16434a = r2
            return r2
        L_0x02a8:
            r1 = 3
            r0.f16434a = r1
            return r1
        L_0x02ac:
            r1 = 1
        L_0x02ad:
            if (r4 == r1) goto L_0x02ba
            r1 = 2
            if (r4 != r1) goto L_0x02b3
            goto L_0x02ba
        L_0x02b3:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.m15945D(r1)
            throw r1
        L_0x02ba:
            r19.m15942A()
            int r1 = r0.f16438e
            int r1 = r1 + r3
            r0.f16438e = r1
            r1 = 7
            r0.f16434a = r1
            return r1
        L_0x02c6:
            r19.m15942A()
            r1 = 8
            r0.f16434a = r1
            return r1
        L_0x02ce:
            r1 = 9
            r0.f16434a = r1
            return r1
        L_0x02d3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02db:
            r6 = 4
            r1[r2] = r6
            if (r4 != r5) goto L_0x02f9
            r1 = 1
            int r2 = r0.m15952z(r1)
            if (r2 == r11) goto L_0x02f9
            if (r2 == r10) goto L_0x02f6
            if (r2 != r7) goto L_0x02ef
            r1 = 2
            r0.f16434a = r1
            return r1
        L_0x02ef:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.m15945D(r1)
            throw r1
        L_0x02f6:
            r19.m15942A()
        L_0x02f9:
            r1 = 1
            int r1 = r0.m15952z(r1)
            r2 = 34
            if (r1 == r2) goto L_0x0334
            if (r1 == r8) goto L_0x032c
            java.lang.String r2 = "Expected name"
            if (r1 == r7) goto L_0x0321
            r19.m15942A()
            int r4 = r0.f16438e
            int r4 = r4 + r3
            r0.f16438e = r4
            char r1 = (char) r1
            boolean r1 = r0.m15946n(r1)
            if (r1 == 0) goto L_0x031c
            r1 = 14
            r0.f16434a = r1
            return r1
        L_0x031c:
            java.io.IOException r1 = r0.m15945D(r2)
            throw r1
        L_0x0321:
            if (r4 == r5) goto L_0x0327
            r1 = 2
            r0.f16434a = r1
            return r1
        L_0x0327:
            java.io.IOException r1 = r0.m15945D(r2)
            throw r1
        L_0x032c:
            r19.m15942A()
            r1 = 12
            r0.f16434a = r1
            return r1
        L_0x0334:
            r1 = 13
            r0.f16434a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.biw.mo15140s():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo15141t() {
        int i = this.f16440g;
        int i2 = this.f16438e;
        int i3 = this.f16441h;
        String o = mo15100o();
        StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 45);
        sb.append(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(o);
        return sb.toString();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(mo15141t());
        return valueOf.length() != 0 ? simpleName.concat(valueOf) : new String(simpleName);
    }
}
