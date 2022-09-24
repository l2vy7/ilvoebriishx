package p174x2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C3326g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p004a3.C0065j;
import p169w2.C6306c;

@Deprecated
/* renamed from: x2.i */
/* compiled from: ViewTarget */
public abstract class C6387i<T extends View, Z> extends C6379a<Z> {

    /* renamed from: g */
    private static boolean f26275g;

    /* renamed from: h */
    private static int f26276h = C3326g.f12651a;

    /* renamed from: b */
    protected final T f26277b;

    /* renamed from: c */
    private final C6388a f26278c;

    /* renamed from: d */
    private View.OnAttachStateChangeListener f26279d;

    /* renamed from: e */
    private boolean f26280e;

    /* renamed from: f */
    private boolean f26281f;

    /* renamed from: x2.i$a */
    /* compiled from: ViewTarget */
    static final class C6388a {

        /* renamed from: e */
        static Integer f26282e;

        /* renamed from: a */
        private final View f26283a;

        /* renamed from: b */
        private final List<C6385g> f26284b = new ArrayList();

        /* renamed from: c */
        boolean f26285c;

        /* renamed from: d */
        private C6389a f26286d;

        /* renamed from: x2.i$a$a */
        /* compiled from: ViewTarget */
        private static final class C6389a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            private final WeakReference<C6388a> f26287b;

            C6389a(C6388a aVar) {
                this.f26287b = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C6388a aVar = (C6388a) this.f26287b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo24221a();
                return true;
            }
        }

        C6388a(View view) {
            this.f26283a = view;
        }

        /* renamed from: c */
        private static int m28061c(Context context) {
            if (f26282e == null) {
                Display defaultDisplay = ((WindowManager) C0065j.m247d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f26282e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f26282e.intValue();
        }

        /* renamed from: e */
        private int m28062e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f26285c && this.f26283a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f26283a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m28061c(this.f26283a.getContext());
        }

        /* renamed from: f */
        private int m28063f() {
            int paddingTop = this.f26283a.getPaddingTop() + this.f26283a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f26283a.getLayoutParams();
            return m28062e(this.f26283a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m28064g() {
            int paddingLeft = this.f26283a.getPaddingLeft() + this.f26283a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f26283a.getLayoutParams();
            return m28062e(this.f26283a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m28065h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m28066i(int i, int i2) {
            return m28065h(i) && m28065h(i2);
        }

        /* renamed from: j */
        private void m28067j(int i, int i2) {
            Iterator it = new ArrayList(this.f26284b).iterator();
            while (it.hasNext()) {
                ((C6385g) it.next()).mo24077f(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24221a() {
            if (!this.f26284b.isEmpty()) {
                int g = m28064g();
                int f = m28063f();
                if (m28066i(g, f)) {
                    m28067j(g, f);
                    mo24222b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24222b() {
            ViewTreeObserver viewTreeObserver = this.f26283a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f26286d);
            }
            this.f26286d = null;
            this.f26284b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24223d(C6385g gVar) {
            int g = m28064g();
            int f = m28063f();
            if (m28066i(g, f)) {
                gVar.mo24077f(g, f);
                return;
            }
            if (!this.f26284b.contains(gVar)) {
                this.f26284b.add(gVar);
            }
            if (this.f26286d == null) {
                ViewTreeObserver viewTreeObserver = this.f26283a.getViewTreeObserver();
                C6389a aVar = new C6389a(this);
                this.f26286d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo24224k(C6385g gVar) {
            this.f26284b.remove(gVar);
        }
    }

    public C6387i(T t) {
        this.f26277b = (View) C0065j.m247d(t);
        this.f26278c = new C6388a(t);
    }

    /* renamed from: i */
    private Object m28051i() {
        return this.f26277b.getTag(f26276h);
    }

    /* renamed from: j */
    private void m28052j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26279d;
        if (onAttachStateChangeListener != null && !this.f26281f) {
            this.f26277b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26281f = true;
        }
    }

    /* renamed from: k */
    private void m28053k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26279d;
        if (onAttachStateChangeListener != null && this.f26281f) {
            this.f26277b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26281f = false;
        }
    }

    /* renamed from: l */
    private void m28054l(Object obj) {
        f26275g = true;
        this.f26277b.setTag(f26276h, obj);
    }

    /* renamed from: a */
    public void mo24213a(C6385g gVar) {
        this.f26278c.mo24223d(gVar);
    }

    /* renamed from: c */
    public void mo24214c(C6306c cVar) {
        m28054l(cVar);
    }

    /* renamed from: e */
    public void mo24215e(C6385g gVar) {
        this.f26278c.mo24224k(gVar);
    }

    /* renamed from: f */
    public void mo24210f(Drawable drawable) {
        super.mo24210f(drawable);
        m28052j();
    }

    /* renamed from: g */
    public C6306c mo24216g() {
        Object i = m28051i();
        if (i == null) {
            return null;
        }
        if (i instanceof C6306c) {
            return (C6306c) i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: h */
    public void mo23080h(Drawable drawable) {
        super.mo23080h(drawable);
        this.f26278c.mo24222b();
        if (!this.f26280e) {
            m28053k();
        }
    }

    public String toString() {
        return "Target for: " + this.f26277b;
    }
}
