package p139r0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import p110m0.C5723u;
import p139r0.C5945a;
import p139r0.C5953b;

/* renamed from: r0.b */
/* compiled from: DynamicAnimation */
public abstract class C5953b<T extends C5953b<T>> implements C5945a.C5947b {

    /* renamed from: m */
    public static final C5971r f24880m = new C5959f("translationX");

    /* renamed from: n */
    public static final C5971r f24881n = new C5960g("translationY");

    /* renamed from: o */
    public static final C5971r f24882o = new C5961h("translationZ");

    /* renamed from: p */
    public static final C5971r f24883p = new C5962i("scaleX");

    /* renamed from: q */
    public static final C5971r f24884q = new C5963j("scaleY");

    /* renamed from: r */
    public static final C5971r f24885r = new C5964k("rotation");

    /* renamed from: s */
    public static final C5971r f24886s = new C5965l("rotationX");

    /* renamed from: t */
    public static final C5971r f24887t = new C5966m("rotationY");

    /* renamed from: u */
    public static final C5971r f24888u = new C5967n("x");

    /* renamed from: v */
    public static final C5971r f24889v = new C5954a("y");

    /* renamed from: w */
    public static final C5971r f24890w = new C5955b("z");

    /* renamed from: x */
    public static final C5971r f24891x = new C5956c("alpha");

    /* renamed from: y */
    public static final C5971r f24892y = new C5957d("scrollX");

    /* renamed from: z */
    public static final C5971r f24893z = new C5958e("scrollY");

    /* renamed from: a */
    float f24894a = 0.0f;

    /* renamed from: b */
    float f24895b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f24896c = false;

    /* renamed from: d */
    final Object f24897d;

    /* renamed from: e */
    final C5972c f24898e;

    /* renamed from: f */
    boolean f24899f = false;

    /* renamed from: g */
    float f24900g = Float.MAX_VALUE;

    /* renamed from: h */
    float f24901h = (-Float.MAX_VALUE);

    /* renamed from: i */
    private long f24902i = 0;

    /* renamed from: j */
    private float f24903j;

    /* renamed from: k */
    private final ArrayList<C5969p> f24904k = new ArrayList<>();

    /* renamed from: l */
    private final ArrayList<C5970q> f24905l = new ArrayList<>();

    /* renamed from: r0.b$a */
    /* compiled from: DynamicAnimation */
    static class C5954a extends C5971r {
        C5954a(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: r0.b$b */
    /* compiled from: DynamicAnimation */
    static class C5955b extends C5971r {
        C5955b(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return C5723u.m25288N(view);
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            C5723u.m25280I0(view, f);
        }
    }

    /* renamed from: r0.b$c */
    /* compiled from: DynamicAnimation */
    static class C5956c extends C5971r {
        C5956c(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: r0.b$d */
    /* compiled from: DynamicAnimation */
    static class C5957d extends C5971r {
        C5957d(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: r0.b$e */
    /* compiled from: DynamicAnimation */
    static class C5958e extends C5971r {
        C5958e(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: r0.b$f */
    /* compiled from: DynamicAnimation */
    static class C5959f extends C5971r {
        C5959f(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: r0.b$g */
    /* compiled from: DynamicAnimation */
    static class C5960g extends C5971r {
        C5960g(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: r0.b$h */
    /* compiled from: DynamicAnimation */
    static class C5961h extends C5971r {
        C5961h(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return C5723u.m25285L(view);
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            C5723u.m25276G0(view, f);
        }
    }

    /* renamed from: r0.b$i */
    /* compiled from: DynamicAnimation */
    static class C5962i extends C5971r {
        C5962i(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: r0.b$j */
    /* compiled from: DynamicAnimation */
    static class C5963j extends C5971r {
        C5963j(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: r0.b$k */
    /* compiled from: DynamicAnimation */
    static class C5964k extends C5971r {
        C5964k(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: r0.b$l */
    /* compiled from: DynamicAnimation */
    static class C5965l extends C5971r {
        C5965l(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: r0.b$m */
    /* compiled from: DynamicAnimation */
    static class C5966m extends C5971r {
        C5966m(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: r0.b$n */
    /* compiled from: DynamicAnimation */
    static class C5967n extends C5971r {
        C5967n(String str) {
            super(str, (C5959f) null);
        }

        /* renamed from: c */
        public float mo22993a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void mo22994b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: r0.b$o */
    /* compiled from: DynamicAnimation */
    static class C5968o {

        /* renamed from: a */
        float f24906a;

        /* renamed from: b */
        float f24907b;

        C5968o() {
        }
    }

    /* renamed from: r0.b$p */
    /* compiled from: DynamicAnimation */
    public interface C5969p {
        /* renamed from: a */
        void mo23023a(C5953b bVar, boolean z, float f, float f2);
    }

    /* renamed from: r0.b$q */
    /* compiled from: DynamicAnimation */
    public interface C5970q {
        /* renamed from: a */
        void mo23024a(C5953b bVar, float f, float f2);
    }

    /* renamed from: r0.b$r */
    /* compiled from: DynamicAnimation */
    public static abstract class C5971r extends C5972c<View> {
        /* synthetic */ C5971r(String str, C5959f fVar) {
            this(str);
        }

        private C5971r(String str) {
            super(str);
        }
    }

    <K> C5953b(K k, C5972c<K> cVar) {
        this.f24897d = k;
        this.f24898e = cVar;
        if (cVar == f24885r || cVar == f24886s || cVar == f24887t) {
            this.f24903j = 0.1f;
        } else if (cVar == f24891x) {
            this.f24903j = 0.00390625f;
        } else if (cVar == f24883p || cVar == f24884q) {
            this.f24903j = 0.00390625f;
        } else {
            this.f24903j = 1.0f;
        }
    }

    /* renamed from: c */
    private void m26252c(boolean z) {
        this.f24899f = false;
        C5945a.m26241d().mo22980g(this);
        this.f24902i = 0;
        this.f24896c = false;
        for (int i = 0; i < this.f24904k.size(); i++) {
            if (this.f24904k.get(i) != null) {
                this.f24904k.get(i).mo23023a(this, z, this.f24895b, this.f24894a);
            }
        }
        m26254g(this.f24904k);
    }

    /* renamed from: d */
    private float m26253d() {
        return this.f24898e.mo22993a(this.f24897d);
    }

    /* renamed from: g */
    private static <T> void m26254g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: k */
    private void m26255k() {
        if (!this.f24899f) {
            this.f24899f = true;
            if (!this.f24896c) {
                this.f24895b = m26253d();
            }
            float f = this.f24895b;
            if (f > this.f24900g || f < this.f24901h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C5945a.m26241d().mo22977a(this, 0);
        }
    }

    /* renamed from: a */
    public boolean mo22982a(long j) {
        long j2 = this.f24902i;
        if (j2 == 0) {
            this.f24902i = j;
            mo22989h(this.f24895b);
            return false;
        }
        this.f24902i = j;
        boolean l = mo22992l(j - j2);
        float min = Math.min(this.f24895b, this.f24900g);
        this.f24895b = min;
        float max = Math.max(min, this.f24901h);
        this.f24895b = max;
        mo22989h(max);
        if (l) {
            m26252c(false);
        }
        return l;
    }

    /* renamed from: b */
    public void mo22986b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f24899f) {
            m26252c(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo22987e() {
        return this.f24903j * 0.75f;
    }

    /* renamed from: f */
    public boolean mo22988f() {
        return this.f24899f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo22989h(float f) {
        this.f24898e.mo22994b(this.f24897d, f);
        for (int i = 0; i < this.f24905l.size(); i++) {
            if (this.f24905l.get(i) != null) {
                this.f24905l.get(i).mo23024a(this, this.f24895b, this.f24894a);
            }
        }
        m26254g(this.f24905l);
    }

    /* renamed from: i */
    public T mo22990i(float f) {
        this.f24895b = f;
        this.f24896c = true;
        return this;
    }

    /* renamed from: j */
    public void mo22991j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f24899f) {
            m26255k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract boolean mo22992l(long j);
}
