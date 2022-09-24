package p243p6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p194c6.C6532l;

/* renamed from: p6.m */
/* compiled from: ShapeAppearanceModel */
public class C10897m {

    /* renamed from: m */
    public static final C10884c f49721m = new C10895k(0.5f);

    /* renamed from: a */
    C10885d f49722a;

    /* renamed from: b */
    C10885d f49723b;

    /* renamed from: c */
    C10885d f49724c;

    /* renamed from: d */
    C10885d f49725d;

    /* renamed from: e */
    C10884c f49726e;

    /* renamed from: f */
    C10884c f49727f;

    /* renamed from: g */
    C10884c f49728g;

    /* renamed from: h */
    C10884c f49729h;

    /* renamed from: i */
    C10887f f49730i;

    /* renamed from: j */
    C10887f f49731j;

    /* renamed from: k */
    C10887f f49732k;

    /* renamed from: l */
    C10887f f49733l;

    /* renamed from: p6.m$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C10900c {
        /* renamed from: a */
        C10884c mo43122a(C10884c cVar);
    }

    /* renamed from: a */
    public static C10899b m48992a() {
        return new C10899b();
    }

    /* renamed from: b */
    public static C10899b m48993b(Context context, int i, int i2) {
        return m48994c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C10899b m48994c(Context context, int i, int i2, int i3) {
        return m48995d(context, i, i2, new C10882a((float) i3));
    }

    /* renamed from: d */
    private static C10899b m48995d(Context context, int i, int i2, C10884c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6532l.f26994j6);
        try {
            int i3 = obtainStyledAttributes.getInt(C6532l.f27005k6, 0);
            int i4 = obtainStyledAttributes.getInt(C6532l.f27038n6, i3);
            int i5 = obtainStyledAttributes.getInt(C6532l.f27049o6, i3);
            int i6 = obtainStyledAttributes.getInt(C6532l.f27027m6, i3);
            int i7 = obtainStyledAttributes.getInt(C6532l.f27016l6, i3);
            C10884c m = m48999m(obtainStyledAttributes, C6532l.f27060p6, cVar);
            C10884c m2 = m48999m(obtainStyledAttributes, C6532l.f27093s6, m);
            C10884c m3 = m48999m(obtainStyledAttributes, C6532l.f27104t6, m);
            C10884c m4 = m48999m(obtainStyledAttributes, C6532l.f27082r6, m);
            return new C10899b().mo43146C(i4, m2).mo43150G(i5, m3).mo43164x(i6, m4).mo43160t(i7, m48999m(obtainStyledAttributes, C6532l.f27071q6, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C10899b m48996e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m48997f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C10899b m48997f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m48998g(context, attributeSet, i, i2, new C10882a((float) i3));
    }

    /* renamed from: g */
    public static C10899b m48998g(Context context, AttributeSet attributeSet, int i, int i2, C10884c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26702I4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C6532l.f26713J4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C6532l.f26724K4, 0);
        obtainStyledAttributes.recycle();
        return m48995d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C10884c m48999m(TypedArray typedArray, int i, C10884c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C10882a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C10895k(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C10887f mo43127h() {
        return this.f49732k;
    }

    /* renamed from: i */
    public C10885d mo43128i() {
        return this.f49725d;
    }

    /* renamed from: j */
    public C10884c mo43129j() {
        return this.f49729h;
    }

    /* renamed from: k */
    public C10885d mo43130k() {
        return this.f49724c;
    }

    /* renamed from: l */
    public C10884c mo43131l() {
        return this.f49728g;
    }

    /* renamed from: n */
    public C10887f mo43132n() {
        return this.f49733l;
    }

    /* renamed from: o */
    public C10887f mo43133o() {
        return this.f49731j;
    }

    /* renamed from: p */
    public C10887f mo43134p() {
        return this.f49730i;
    }

    /* renamed from: q */
    public C10885d mo43135q() {
        return this.f49722a;
    }

    /* renamed from: r */
    public C10884c mo43136r() {
        return this.f49726e;
    }

    /* renamed from: s */
    public C10885d mo43137s() {
        return this.f49723b;
    }

    /* renamed from: t */
    public C10884c mo43138t() {
        return this.f49727f;
    }

    /* renamed from: u */
    public boolean mo43139u(RectF rectF) {
        Class<C10887f> cls = C10887f.class;
        boolean z = this.f49733l.getClass().equals(cls) && this.f49731j.getClass().equals(cls) && this.f49730i.getClass().equals(cls) && this.f49732k.getClass().equals(cls);
        float a = this.f49726e.mo43065a(rectF);
        boolean z2 = this.f49727f.mo43065a(rectF) == a && this.f49729h.mo43065a(rectF) == a && this.f49728g.mo43065a(rectF) == a;
        boolean z3 = (this.f49723b instanceof C10896l) && (this.f49722a instanceof C10896l) && (this.f49724c instanceof C10896l) && (this.f49725d instanceof C10896l);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C10899b mo43140v() {
        return new C10899b(this);
    }

    /* renamed from: w */
    public C10897m mo43141w(float f) {
        return mo43140v().mo43155o(f).mo43154m();
    }

    /* renamed from: x */
    public C10897m mo43142x(C10884c cVar) {
        return mo43140v().mo43156p(cVar).mo43154m();
    }

    /* renamed from: y */
    public C10897m mo43143y(C10900c cVar) {
        return mo43140v().mo43149F(cVar.mo43122a(mo43136r())).mo43153J(cVar.mo43122a(mo43138t())).mo43163w(cVar.mo43122a(mo43129j())).mo43144A(cVar.mo43122a(mo43131l())).mo43154m();
    }

    private C10897m(C10899b bVar) {
        this.f49722a = bVar.f49734a;
        this.f49723b = bVar.f49735b;
        this.f49724c = bVar.f49736c;
        this.f49725d = bVar.f49737d;
        this.f49726e = bVar.f49738e;
        this.f49727f = bVar.f49739f;
        this.f49728g = bVar.f49740g;
        this.f49729h = bVar.f49741h;
        this.f49730i = bVar.f49742i;
        this.f49731j = bVar.f49743j;
        this.f49732k = bVar.f49744k;
        this.f49733l = bVar.f49745l;
    }

    /* renamed from: p6.m$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C10899b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10885d f49734a = C10893i.m48983b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10885d f49735b = C10893i.m48983b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10885d f49736c = C10893i.m48983b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10885d f49737d = C10893i.m48983b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10884c f49738e = new C10882a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C10884c f49739f = new C10882a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C10884c f49740g = new C10882a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C10884c f49741h = new C10882a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C10887f f49742i = C10893i.m48984c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C10887f f49743j = C10893i.m48984c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C10887f f49744k = C10893i.m48984c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C10887f f49745l = C10893i.m48984c();

        public C10899b() {
        }

        /* renamed from: n */
        private static float m49029n(C10885d dVar) {
            if (dVar instanceof C10896l) {
                return ((C10896l) dVar).f49720a;
            }
            if (dVar instanceof C10886e) {
                return ((C10886e) dVar).f49666a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C10899b mo43144A(C10884c cVar) {
            this.f49740g = cVar;
            return this;
        }

        /* renamed from: B */
        public C10899b mo43145B(C10887f fVar) {
            this.f49742i = fVar;
            return this;
        }

        /* renamed from: C */
        public C10899b mo43146C(int i, C10884c cVar) {
            return mo43147D(C10893i.m48982a(i)).mo43149F(cVar);
        }

        /* renamed from: D */
        public C10899b mo43147D(C10885d dVar) {
            this.f49734a = dVar;
            float n = m49029n(dVar);
            if (n != -1.0f) {
                mo43148E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C10899b mo43148E(float f) {
            this.f49738e = new C10882a(f);
            return this;
        }

        /* renamed from: F */
        public C10899b mo43149F(C10884c cVar) {
            this.f49738e = cVar;
            return this;
        }

        /* renamed from: G */
        public C10899b mo43150G(int i, C10884c cVar) {
            return mo43151H(C10893i.m48982a(i)).mo43153J(cVar);
        }

        /* renamed from: H */
        public C10899b mo43151H(C10885d dVar) {
            this.f49735b = dVar;
            float n = m49029n(dVar);
            if (n != -1.0f) {
                mo43152I(n);
            }
            return this;
        }

        /* renamed from: I */
        public C10899b mo43152I(float f) {
            this.f49739f = new C10882a(f);
            return this;
        }

        /* renamed from: J */
        public C10899b mo43153J(C10884c cVar) {
            this.f49739f = cVar;
            return this;
        }

        /* renamed from: m */
        public C10897m mo43154m() {
            return new C10897m(this);
        }

        /* renamed from: o */
        public C10899b mo43155o(float f) {
            return mo43148E(f).mo43152I(f).mo43166z(f).mo43162v(f);
        }

        /* renamed from: p */
        public C10899b mo43156p(C10884c cVar) {
            return mo43149F(cVar).mo43153J(cVar).mo43144A(cVar).mo43163w(cVar);
        }

        /* renamed from: q */
        public C10899b mo43157q(int i, float f) {
            return mo43158r(C10893i.m48982a(i)).mo43155o(f);
        }

        /* renamed from: r */
        public C10899b mo43158r(C10885d dVar) {
            return mo43147D(dVar).mo43151H(dVar).mo43165y(dVar).mo43161u(dVar);
        }

        /* renamed from: s */
        public C10899b mo43159s(C10887f fVar) {
            this.f49744k = fVar;
            return this;
        }

        /* renamed from: t */
        public C10899b mo43160t(int i, C10884c cVar) {
            return mo43161u(C10893i.m48982a(i)).mo43163w(cVar);
        }

        /* renamed from: u */
        public C10899b mo43161u(C10885d dVar) {
            this.f49737d = dVar;
            float n = m49029n(dVar);
            if (n != -1.0f) {
                mo43162v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C10899b mo43162v(float f) {
            this.f49741h = new C10882a(f);
            return this;
        }

        /* renamed from: w */
        public C10899b mo43163w(C10884c cVar) {
            this.f49741h = cVar;
            return this;
        }

        /* renamed from: x */
        public C10899b mo43164x(int i, C10884c cVar) {
            return mo43165y(C10893i.m48982a(i)).mo43144A(cVar);
        }

        /* renamed from: y */
        public C10899b mo43165y(C10885d dVar) {
            this.f49736c = dVar;
            float n = m49029n(dVar);
            if (n != -1.0f) {
                mo43166z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C10899b mo43166z(float f) {
            this.f49740g = new C10882a(f);
            return this;
        }

        public C10899b(C10897m mVar) {
            this.f49734a = mVar.f49722a;
            this.f49735b = mVar.f49723b;
            this.f49736c = mVar.f49724c;
            this.f49737d = mVar.f49725d;
            this.f49738e = mVar.f49726e;
            this.f49739f = mVar.f49727f;
            this.f49740g = mVar.f49728g;
            this.f49741h = mVar.f49729h;
            this.f49742i = mVar.f49730i;
            this.f49743j = mVar.f49731j;
            this.f49744k = mVar.f49732k;
            this.f49745l = mVar.f49733l;
        }
    }

    public C10897m() {
        this.f49722a = C10893i.m48983b();
        this.f49723b = C10893i.m48983b();
        this.f49724c = C10893i.m48983b();
        this.f49725d = C10893i.m48983b();
        this.f49726e = new C10882a(0.0f);
        this.f49727f = new C10882a(0.0f);
        this.f49728g = new C10882a(0.0f);
        this.f49729h = new C10882a(0.0f);
        this.f49730i = C10893i.m48984c();
        this.f49731j = C10893i.m48984c();
        this.f49732k = C10893i.m48984c();
        this.f49733l = C10893i.m48984c();
    }
}
