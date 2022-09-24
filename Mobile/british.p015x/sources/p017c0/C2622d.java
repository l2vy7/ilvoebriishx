package p017c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p010b0.C1515c;
import p010b0.C1523f;
import p095j0.C5484f;
import p150t.C6083e;

@SuppressLint({"NewApi"})
/* renamed from: c0.d */
/* compiled from: TypefaceCompat */
public class C2622d {

    /* renamed from: a */
    private static final C2629j f10367a;

    /* renamed from: b */
    private static final C6083e<String, Typeface> f10368b = new C6083e<>(16);

    /* renamed from: c0.d$a */
    /* compiled from: TypefaceCompat */
    public static class C2623a extends C5484f.C5487c {

        /* renamed from: a */
        private C1523f.C1526c f10369a;

        public C2623a(C1523f.C1526c cVar) {
            this.f10369a = cVar;
        }

        /* renamed from: a */
        public void mo9262a(int i) {
            C1523f.C1526c cVar = this.f10369a;
            if (cVar != null) {
                cVar.mo2206d(i);
            }
        }

        /* renamed from: b */
        public void mo9263b(Typeface typeface) {
            C1523f.C1526c cVar = this.f10369a;
            if (cVar != null) {
                cVar.mo2207e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f10367a = new C2628i();
        } else if (i >= 28) {
            f10367a = new C2627h();
        } else if (i >= 26) {
            f10367a = new C2626g();
        } else if (i >= 24 && C2625f.m9159m()) {
            f10367a = new C2625f();
        } else if (i >= 21) {
            f10367a = new C2624e();
        } else {
            f10367a = new C2629j();
        }
    }

    /* renamed from: a */
    public static Typeface m9140a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g = m9146g(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return g;
        }
    }

    /* renamed from: b */
    public static Typeface m9141b(Context context, CancellationSignal cancellationSignal, C5484f.C5486b[] bVarArr, int i) {
        return f10367a.mo9265c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m9142c(Context context, C1515c.C1516a aVar, Resources resources, int i, int i2, C1523f.C1526c cVar, Handler handler, boolean z) {
        Typeface typeface;
        C1515c.C1516a aVar2 = aVar;
        C1523f.C1526c cVar2 = cVar;
        Handler handler2 = handler;
        if (aVar2 instanceof C1515c.C1519d) {
            C1515c.C1519d dVar = (C1515c.C1519d) aVar2;
            Typeface h = m9147h(dVar.mo7078c());
            if (h != null) {
                if (cVar2 != null) {
                    cVar2.mo7083b(h, handler2);
                }
                return h;
            }
            typeface = C5484f.m24510a(context, dVar.mo7077b(), i2, !z ? cVar2 == null : dVar.mo7076a() == 0, z ? dVar.mo7079d() : -1, C1523f.C1526c.m7895c(handler), new C2623a(cVar2));
            Resources resources2 = resources;
            int i3 = i2;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f10367a.mo9264b(context, (C1515c.C1517b) aVar2, resources, i2);
            if (cVar2 != null) {
                if (typeface != null) {
                    cVar2.mo7083b(typeface, handler2);
                } else {
                    cVar2.mo7082a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f10368b.mo23311d(m9144e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m9143d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f10367a.mo9267e(context, resources, i, str, i2);
        if (e != null) {
            f10368b.mo23311d(m9144e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m9144e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m9145f(Resources resources, int i, int i2) {
        return f10368b.mo23310c(m9144e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m9146g(Context context, Typeface typeface, int i) {
        C2629j jVar = f10367a;
        C1515c.C1517b i2 = jVar.mo9277i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo9264b(context, i2, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m9147h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
