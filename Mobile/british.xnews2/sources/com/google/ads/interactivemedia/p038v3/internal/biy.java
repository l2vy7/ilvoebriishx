package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.biy */
/* compiled from: IMASDK */
public class biy implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f16449a = new String[128];

    /* renamed from: b */
    private static final String[] f16450b;

    /* renamed from: c */
    private final Writer f16451c;

    /* renamed from: d */
    private int[] f16452d = new int[32];

    /* renamed from: e */
    private int f16453e = 0;

    /* renamed from: f */
    private final String f16454f;

    /* renamed from: g */
    private boolean f16455g;

    /* renamed from: h */
    private boolean f16456h;

    /* renamed from: i */
    private String f16457i;

    /* renamed from: j */
    private boolean f16458j;

    static {
        for (int i = 0; i <= 31; i++) {
            f16449a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f16449a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16450b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public biy(Writer writer) {
        m15973a(6);
        this.f16454f = ":";
        this.f16458j = true;
        Objects.requireNonNull(writer, "out == null");
        this.f16451c = writer;
    }

    /* renamed from: a */
    private final void m15973a(int i) {
        int i2 = this.f16453e;
        int[] iArr = this.f16452d;
        if (i2 == iArr.length) {
            this.f16452d = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.f16452d;
        int i3 = this.f16453e;
        this.f16453e = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: s */
    private final int m15974s() {
        int i = this.f16453e;
        if (i != 0) {
            return this.f16452d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: t */
    private final void m15975t(int i) {
        this.f16452d[this.f16453e - 1] = i;
    }

    /* renamed from: u */
    private final void m15976u() throws IOException {
        if (this.f16457i != null) {
            int s = m15974s();
            if (s == 5) {
                this.f16451c.write(44);
            } else if (s != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m15975t(4);
            m15977v(this.f16457i);
            this.f16457i = null;
        }
    }

    /* renamed from: v */
    private final void m15977v(String str) throws IOException {
        String str2;
        String[] strArr = this.f16456h ? f16450b : f16449a;
        this.f16451c.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f16451c.write(str, i, i2 - i);
            }
            this.f16451c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f16451c.write(str, i, length - i);
        }
        this.f16451c.write(34);
    }

    /* renamed from: w */
    private final void m15978w() throws IOException {
        int s = m15974s();
        if (s == 1) {
            m15975t(2);
        } else if (s == 2) {
            this.f16451c.append(',');
        } else if (s != 4) {
            if (s != 6) {
                if (s != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f16455g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m15975t(7);
        } else {
            this.f16451c.append(this.f16454f);
            m15975t(5);
        }
    }

    /* renamed from: x */
    private final void m15979x(int i, int i2, char c) throws IOException {
        String str;
        int s = m15974s();
        if (s == i2 || s == i) {
            String str2 = this.f16457i;
            if (str2 != null) {
                if (str2.length() != 0) {
                    str = "Dangling name: ".concat(str2);
                } else {
                    str = new String("Dangling name: ");
                }
                throw new IllegalStateException(str);
            }
            this.f16453e--;
            this.f16451c.write(c);
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: y */
    private final void m15980y(int i, char c) throws IOException {
        m15978w();
        m15973a(i);
        this.f16451c.write(c);
    }

    /* renamed from: b */
    public void mo15107b() throws IOException {
        m15976u();
        m15980y(1, '[');
    }

    /* renamed from: c */
    public void mo15108c() throws IOException {
        m15976u();
        m15980y(3, '{');
    }

    public void close() throws IOException {
        this.f16451c.close();
        int i = this.f16453e;
        if (i > 1 || (i == 1 && this.f16452d[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f16453e = 0;
    }

    /* renamed from: d */
    public void mo15110d() throws IOException {
        m15979x(1, 2, ']');
    }

    /* renamed from: e */
    public void mo15111e() throws IOException {
        m15979x(3, 5, '}');
    }

    /* renamed from: f */
    public void mo15112f(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f16457i != null) {
            throw new IllegalStateException();
        } else if (this.f16453e != 0) {
            this.f16457i = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public void flush() throws IOException {
        if (this.f16453e != 0) {
            this.f16451c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public void mo15114g() throws IOException {
        if (this.f16457i != null) {
            if (this.f16458j) {
                m15976u();
            } else {
                this.f16457i = null;
                return;
            }
        }
        m15978w();
        this.f16451c.write("null");
    }

    /* renamed from: h */
    public void mo15115h(long j) throws IOException {
        m15976u();
        m15978w();
        this.f16451c.write(Long.toString(j));
    }

    /* renamed from: i */
    public void mo15116i(Boolean bool) throws IOException {
        if (bool == null) {
            mo15114g();
            return;
        }
        m15976u();
        m15978w();
        this.f16451c.write(true != bool.booleanValue() ? "false" : "true");
    }

    /* renamed from: j */
    public void mo15117j(Number number) throws IOException {
        if (number == null) {
            mo15114g();
            return;
        }
        m15976u();
        String obj = number.toString();
        if (this.f16455g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m15978w();
            this.f16451c.append(obj);
            return;
        }
        String valueOf = String.valueOf(number);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Numeric values must be finite, but was ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public void mo15118k(String str) throws IOException {
        if (str == null) {
            mo15114g();
            return;
        }
        m15976u();
        m15978w();
        m15977v(str);
    }

    /* renamed from: l */
    public void mo15119l(boolean z) throws IOException {
        m15976u();
        m15978w();
        this.f16451c.write(true != z ? "false" : "true");
    }

    /* renamed from: m */
    public final void mo15142m(boolean z) {
        this.f16455g = z;
    }

    /* renamed from: n */
    public final boolean mo15143n() {
        return this.f16455g;
    }

    /* renamed from: o */
    public final void mo15144o(boolean z) {
        this.f16456h = z;
    }

    /* renamed from: p */
    public final boolean mo15145p() {
        return this.f16456h;
    }

    /* renamed from: q */
    public final void mo15146q(boolean z) {
        this.f16458j = z;
    }

    /* renamed from: r */
    public final boolean mo15147r() {
        return this.f16458j;
    }
}
