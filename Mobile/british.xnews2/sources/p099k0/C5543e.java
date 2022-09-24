package p099k0;

import java.util.Locale;

/* renamed from: k0.e */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C5543e {

    /* renamed from: a */
    public static final C5542d f24064a = new C5548e((C5546c) null, false);

    /* renamed from: b */
    public static final C5542d f24065b = new C5548e((C5546c) null, true);

    /* renamed from: c */
    public static final C5542d f24066c;

    /* renamed from: d */
    public static final C5542d f24067d;

    /* renamed from: e */
    public static final C5542d f24068e = new C5548e(C5544a.f24070b, false);

    /* renamed from: f */
    public static final C5542d f24069f = C5549f.f24075b;

    /* renamed from: k0.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C5544a implements C5546c {

        /* renamed from: b */
        static final C5544a f24070b = new C5544a(true);

        /* renamed from: a */
        private final boolean f24071a;

        private C5544a(boolean z) {
            this.f24071a = z;
        }

        /* renamed from: a */
        public int mo22111a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C5543e.m24730a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f24071a) {
                        return 1;
                    }
                } else if (this.f24071a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f24071a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: k0.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C5545b implements C5546c {

        /* renamed from: a */
        static final C5545b f24072a = new C5545b();

        private C5545b() {
        }

        /* renamed from: a */
        public int mo22111a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C5543e.m24731b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: k0.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C5546c {
        /* renamed from: a */
        int mo22111a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: k0.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C5547d implements C5542d {

        /* renamed from: a */
        private final C5546c f24073a;

        C5547d(C5546c cVar) {
            this.f24073a = cVar;
        }

        /* renamed from: c */
        private boolean m24735c(CharSequence charSequence, int i, int i2) {
            int a = this.f24073a.mo22111a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo22112b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo22110a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f24073a == null) {
                return mo22112b();
            } else {
                return m24735c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo22112b();
    }

    /* renamed from: k0.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C5548e extends C5547d {

        /* renamed from: b */
        private final boolean f24074b;

        C5548e(C5546c cVar, boolean z) {
            super(cVar);
            this.f24074b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo22112b() {
            return this.f24074b;
        }
    }

    /* renamed from: k0.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C5549f extends C5547d {

        /* renamed from: b */
        static final C5549f f24075b = new C5549f();

        C5549f() {
            super((C5546c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo22112b() {
            return C5550f.m24741b(Locale.getDefault()) == 1;
        }
    }

    static {
        C5545b bVar = C5545b.f24072a;
        f24066c = new C5548e(bVar, false);
        f24067d = new C5548e(bVar, true);
    }

    /* renamed from: a */
    static int m24730a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m24731b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
