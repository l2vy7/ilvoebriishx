package p099k0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: k0.a */
/* compiled from: BidiFormatter */
public final class C5535a {

    /* renamed from: d */
    static final C5542d f24032d;

    /* renamed from: e */
    private static final String f24033e = Character.toString(8206);

    /* renamed from: f */
    private static final String f24034f = Character.toString(8207);

    /* renamed from: g */
    static final C5535a f24035g;

    /* renamed from: h */
    static final C5535a f24036h;

    /* renamed from: a */
    private final boolean f24037a;

    /* renamed from: b */
    private final int f24038b;

    /* renamed from: c */
    private final C5542d f24039c;

    /* renamed from: k0.a$a */
    /* compiled from: BidiFormatter */
    public static final class C5536a {

        /* renamed from: a */
        private boolean f24040a;

        /* renamed from: b */
        private int f24041b;

        /* renamed from: c */
        private C5542d f24042c;

        public C5536a() {
            m24704c(C5535a.m24695e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C5535a m24703b(boolean z) {
            return z ? C5535a.f24036h : C5535a.f24035g;
        }

        /* renamed from: c */
        private void m24704c(boolean z) {
            this.f24040a = z;
            this.f24042c = C5535a.f24032d;
            this.f24041b = 2;
        }

        /* renamed from: a */
        public C5535a mo22080a() {
            if (this.f24041b == 2 && this.f24042c == C5535a.f24032d) {
                return m24703b(this.f24040a);
            }
            return new C5535a(this.f24040a, this.f24041b, this.f24042c);
        }
    }

    /* renamed from: k0.a$b */
    /* compiled from: BidiFormatter */
    private static class C5537b {

        /* renamed from: f */
        private static final byte[] f24043f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f24044a;

        /* renamed from: b */
        private final boolean f24045b;

        /* renamed from: c */
        private final int f24046c;

        /* renamed from: d */
        private int f24047d;

        /* renamed from: e */
        private char f24048e;

        static {
            for (int i = 0; i < 1792; i++) {
                f24043f[i] = Character.getDirectionality(i);
            }
        }

        C5537b(CharSequence charSequence, boolean z) {
            this.f24044a = charSequence;
            this.f24045b = z;
            this.f24046c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m24706c(char c) {
            return c < 1792 ? f24043f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m24707f() {
            char charAt;
            int i = this.f24047d;
            do {
                int i2 = this.f24047d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f24044a;
                int i3 = i2 - 1;
                this.f24047d = i3;
                charAt = charSequence.charAt(i3);
                this.f24048e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f24047d = i;
            this.f24048e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m24708g() {
            char charAt;
            do {
                int i = this.f24047d;
                if (i >= this.f24046c) {
                    return 12;
                }
                CharSequence charSequence = this.f24044a;
                this.f24047d = i + 1;
                charAt = charSequence.charAt(i);
                this.f24048e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m24709h() {
            char charAt;
            int i = this.f24047d;
            while (true) {
                int i2 = this.f24047d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f24044a;
                int i3 = i2 - 1;
                this.f24047d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f24048e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f24047d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f24044a;
                        int i5 = i4 - 1;
                        this.f24047d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f24048e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f24047d = i;
            this.f24048e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m24710i() {
            char charAt;
            int i = this.f24047d;
            while (true) {
                int i2 = this.f24047d;
                if (i2 < this.f24046c) {
                    CharSequence charSequence = this.f24044a;
                    this.f24047d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f24048e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f24047d;
                            if (i3 >= this.f24046c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f24044a;
                            this.f24047d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f24048e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f24047d = i;
                    this.f24048e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo22081a() {
            char charAt = this.f24044a.charAt(this.f24047d - 1);
            this.f24048e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f24044a, this.f24047d);
                this.f24047d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f24047d--;
            byte c = m24706c(this.f24048e);
            if (!this.f24045b) {
                return c;
            }
            char c2 = this.f24048e;
            if (c2 == '>') {
                return m24709h();
            }
            return c2 == ';' ? m24707f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo22082b() {
            char charAt = this.f24044a.charAt(this.f24047d);
            this.f24048e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f24044a, this.f24047d);
                this.f24047d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f24047d++;
            byte c = m24706c(this.f24048e);
            if (!this.f24045b) {
                return c;
            }
            char c2 = this.f24048e;
            if (c2 == '<') {
                return m24710i();
            }
            return c2 == '&' ? m24708g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22083d() {
            this.f24047d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f24047d < this.f24046c && i == 0) {
                byte b = mo22082b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f24047d > 0) {
                switch (mo22081a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo22084e() {
            /*
                r7 = this;
                int r0 = r7.f24046c
                r7.f24047d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f24047d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo22081a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p099k0.C5535a.C5537b.mo22084e():int");
        }
    }

    static {
        C5542d dVar = C5543e.f24066c;
        f24032d = dVar;
        f24035g = new C5535a(false, 2, dVar);
        f24036h = new C5535a(true, 2, dVar);
    }

    C5535a(boolean z, int i, C5542d dVar) {
        this.f24037a = z;
        this.f24038b = i;
        this.f24039c = dVar;
    }

    /* renamed from: a */
    private static int m24692a(CharSequence charSequence) {
        return new C5537b(charSequence, false).mo22083d();
    }

    /* renamed from: b */
    private static int m24693b(CharSequence charSequence) {
        return new C5537b(charSequence, false).mo22084e();
    }

    /* renamed from: c */
    public static C5535a m24694c() {
        return new C5536a().mo22080a();
    }

    /* renamed from: e */
    static boolean m24695e(Locale locale) {
        return C5550f.m24741b(locale) == 1;
    }

    /* renamed from: f */
    private String m24696f(CharSequence charSequence, C5542d dVar) {
        boolean a = dVar.mo22110a(charSequence, 0, charSequence.length());
        if (!this.f24037a && (a || m24693b(charSequence) == 1)) {
            return f24033e;
        }
        if (this.f24037a) {
            return (!a || m24693b(charSequence) == -1) ? f24034f : "";
        }
        return "";
    }

    /* renamed from: g */
    private String m24697g(CharSequence charSequence, C5542d dVar) {
        boolean a = dVar.mo22110a(charSequence, 0, charSequence.length());
        if (!this.f24037a && (a || m24692a(charSequence) == 1)) {
            return f24033e;
        }
        if (this.f24037a) {
            return (!a || m24692a(charSequence) == -1) ? f24034f : "";
        }
        return "";
    }

    /* renamed from: d */
    public boolean mo22075d() {
        return (this.f24038b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo22076h(CharSequence charSequence) {
        return mo22077i(charSequence, this.f24039c, true);
    }

    /* renamed from: i */
    public CharSequence mo22077i(CharSequence charSequence, C5542d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo22110a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo22075d() && z) {
            spannableStringBuilder.append(m24697g(charSequence, a ? C5543e.f24065b : C5543e.f24064a));
        }
        if (a != this.f24037a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m24696f(charSequence, a ? C5543e.f24065b : C5543e.f24064a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo22078j(String str) {
        return mo22079k(str, this.f24039c, true);
    }

    /* renamed from: k */
    public String mo22079k(String str, C5542d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo22077i(str, dVar, z).toString();
    }
}
