package p148s6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: s6.m */
/* compiled from: Splitter */
public final class C11005m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10996c f49952a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f49953b;

    /* renamed from: c */
    private final C11009c f49954c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f49955d;

    /* renamed from: s6.m$a */
    /* compiled from: Splitter */
    static class C11006a implements C11009c {

        /* renamed from: a */
        final /* synthetic */ C10996c f49956a;

        /* renamed from: s6.m$a$a */
        /* compiled from: Splitter */
        class C11007a extends C11008b {
            C11007a(C11005m mVar, CharSequence charSequence) {
                super(mVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public int mo43300f(int i) {
                return i + 1;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public int mo43301g(int i) {
                return C11006a.this.f49956a.mo43288c(this.f49958d, i);
            }
        }

        C11006a(C10996c cVar) {
            this.f49956a = cVar;
        }

        /* renamed from: b */
        public C11008b mo43298a(C11005m mVar, CharSequence charSequence) {
            return new C11007a(mVar, charSequence);
        }
    }

    /* renamed from: s6.m$b */
    /* compiled from: Splitter */
    private static abstract class C11008b extends C6065a<String> {

        /* renamed from: d */
        final CharSequence f49958d;

        /* renamed from: e */
        final C10996c f49959e;

        /* renamed from: f */
        final boolean f49960f;

        /* renamed from: g */
        int f49961g = 0;

        /* renamed from: h */
        int f49962h;

        protected C11008b(C11005m mVar, CharSequence charSequence) {
            this.f49959e = mVar.f49952a;
            this.f49960f = mVar.f49953b;
            this.f49962h = mVar.f49955d;
            this.f49958d = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo23253a() {
            int i;
            int i2 = this.f49961g;
            while (true) {
                int i3 = this.f49961g;
                if (i3 == -1) {
                    return (String) mo23254b();
                }
                int g = mo43301g(i3);
                if (g == -1) {
                    g = this.f49958d.length();
                    this.f49961g = -1;
                } else {
                    this.f49961g = mo43300f(g);
                }
                int i4 = this.f49961g;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f49961g = i5;
                    if (i5 > this.f49958d.length()) {
                        this.f49961g = -1;
                    }
                } else {
                    while (i2 < g && this.f49959e.mo43289e(this.f49958d.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f49959e.mo43289e(this.f49958d.charAt(i - 1))) {
                        g = i - 1;
                    }
                    if (!this.f49960f || i2 != i) {
                        int i6 = this.f49962h;
                    } else {
                        i2 = this.f49961g;
                    }
                }
            }
            int i62 = this.f49962h;
            if (i62 == 1) {
                i = this.f49958d.length();
                this.f49961g = -1;
                while (i > i2 && this.f49959e.mo43289e(this.f49958d.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f49962h = i62 - 1;
            }
            return this.f49958d.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract int mo43300f(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract int mo43301g(int i);
    }

    /* renamed from: s6.m$c */
    /* compiled from: Splitter */
    private interface C11009c {
        /* renamed from: a */
        Iterator<String> mo43298a(C11005m mVar, CharSequence charSequence);
    }

    private C11005m(C11009c cVar) {
        this(cVar, false, C10996c.m49342f(), Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public static C11005m m49359d(char c) {
        return m49360e(C10996c.m49341d(c));
    }

    /* renamed from: e */
    public static C11005m m49360e(C10996c cVar) {
        C6073k.m26688k(cVar);
        return new C11005m(new C11006a(cVar));
    }

    /* renamed from: g */
    private Iterator<String> m49361g(CharSequence charSequence) {
        return this.f49954c.mo43298a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> mo43297f(CharSequence charSequence) {
        C6073k.m26688k(charSequence);
        Iterator<String> g = m49361g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C11005m(C11009c cVar, boolean z, C10996c cVar2, int i) {
        this.f49954c = cVar;
        this.f49953b = z;
        this.f49952a = cVar2;
        this.f49955d = i;
    }
}
