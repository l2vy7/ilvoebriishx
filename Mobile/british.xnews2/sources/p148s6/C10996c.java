package p148s6;

/* renamed from: s6.c */
/* compiled from: CharMatcher */
public abstract class C10996c implements C6074l<Character> {

    /* renamed from: s6.c$a */
    /* compiled from: CharMatcher */
    static abstract class C10997a extends C10996c {
        C10997a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C10996c.super.mo43287b((Character) obj);
        }
    }

    /* renamed from: s6.c$b */
    /* compiled from: CharMatcher */
    private static final class C10998b extends C10997a {

        /* renamed from: a */
        private final char f49942a;

        C10998b(char c) {
            this.f49942a = c;
        }

        /* renamed from: e */
        public boolean mo43289e(char c) {
            return c == this.f49942a;
        }

        public String toString() {
            return "CharMatcher.is('" + C10996c.m49343g(this.f49942a) + "')";
        }
    }

    /* renamed from: s6.c$c */
    /* compiled from: CharMatcher */
    static abstract class C10999c extends C10997a {

        /* renamed from: a */
        private final String f49943a;

        C10999c(String str) {
            this.f49943a = (String) C6073k.m26688k(str);
        }

        public final String toString() {
            return this.f49943a;
        }
    }

    /* renamed from: s6.c$d */
    /* compiled from: CharMatcher */
    private static final class C11000d extends C10999c {

        /* renamed from: b */
        static final C11000d f49944b = new C11000d();

        private C11000d() {
            super("CharMatcher.none()");
        }

        /* renamed from: c */
        public int mo43288c(CharSequence charSequence, int i) {
            C6073k.m26690m(i, charSequence.length());
            return -1;
        }

        /* renamed from: e */
        public boolean mo43289e(char c) {
            return false;
        }
    }

    protected C10996c() {
    }

    /* renamed from: d */
    public static C10996c m49341d(char c) {
        return new C10998b(c);
    }

    /* renamed from: f */
    public static C10996c m49342f() {
        return C11000d.f49944b;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static String m49343g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo43287b(Character ch) {
        return mo43289e(ch.charValue());
    }

    /* renamed from: c */
    public int mo43288c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C6073k.m26690m(i, length);
        while (i < length) {
            if (mo43289e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo43289e(char c);
}
