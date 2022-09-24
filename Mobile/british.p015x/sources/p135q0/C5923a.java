package p135q0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import p111m0.C5682a;
import p111m0.C5723u;
import p111m0.C5739x;
import p117n0.C5770b;
import p117n0.C5771c;
import p117n0.C5776d;
import p117n0.C5780e;
import p135q0.C5927b;
import p150t.C6091h;

/* renamed from: q0.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C5923a extends C5682a {

    /* renamed from: n */
    private static final Rect f24804n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C5927b.C5928a<C5771c> f24805o = new C5924a();

    /* renamed from: p */
    private static final C5927b.C5929b<C6091h<C5771c>, C5771c> f24806p = new C5925b();

    /* renamed from: d */
    private final Rect f24807d = new Rect();

    /* renamed from: e */
    private final Rect f24808e = new Rect();

    /* renamed from: f */
    private final Rect f24809f = new Rect();

    /* renamed from: g */
    private final int[] f24810g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f24811h;

    /* renamed from: i */
    private final View f24812i;

    /* renamed from: j */
    private C5926c f24813j;

    /* renamed from: k */
    int f24814k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f24815l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f24816m = Integer.MIN_VALUE;

    /* renamed from: q0.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C5924a implements C5927b.C5928a<C5771c> {
        C5924a() {
        }

        /* renamed from: b */
        public void mo22938a(C5771c cVar, Rect rect) {
            cVar.mo22643m(rect);
        }
    }

    /* renamed from: q0.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C5925b implements C5927b.C5929b<C6091h<C5771c>, C5771c> {
        C5925b() {
        }

        /* renamed from: c */
        public C5771c mo22940a(C6091h<C5771c> hVar, int i) {
            return hVar.mo23409n(i);
        }

        /* renamed from: d */
        public int mo22941b(C6091h<C5771c> hVar) {
            return hVar.mo23408m();
        }
    }

    /* renamed from: q0.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C5926c extends C5776d {
        C5926c() {
        }

        /* renamed from: b */
        public C5771c mo22675b(int i) {
            return C5771c.m25535Q(C5923a.this.mo22923J(i));
        }

        /* renamed from: d */
        public C5771c mo22677d(int i) {
            int i2 = i == 2 ? C5923a.this.f24814k : C5923a.this.f24815l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo22675b(i2);
        }

        /* renamed from: f */
        public boolean mo22679f(int i, int i2, Bundle bundle) {
            return C5923a.this.mo22931R(i, i2, bundle);
        }
    }

    public C5923a(View view) {
        if (view != null) {
            this.f24812i = view;
            this.f24811h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C5723u.m25351z(view) == 0) {
                C5723u.m25350y0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m26102D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: G */
    private boolean m26103G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f24812i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f24812i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private static int m26104H(int i) {
        if (i == 19) {
            return 33;
        }
        if (i == 21) {
            return 17;
        }
        if (i != 22) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        return 66;
    }

    /* renamed from: I */
    private boolean m26105I(int i, Rect rect) {
        C5771c cVar;
        C5771c cVar2;
        C6091h<C5771c> y = m26117y();
        int i2 = this.f24815l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y.mo23403g(i2);
        }
        C5771c cVar3 = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (C5771c) C5927b.m26154d(y, f24806p, f24805o, cVar3, i, C5723u.m25265B(this.f24812i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f24815l;
            if (i4 != Integer.MIN_VALUE) {
                m26118z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m26102D(this.f24812i, i, rect2);
            }
            cVar2 = (C5771c) C5927b.m26153c(y, f24806p, f24805o, cVar3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = y.mo23406k(y.mo23405i(cVar2));
        }
        return mo22932V(i3);
    }

    /* renamed from: S */
    private boolean m26106S(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo22932V(i);
        }
        if (i2 == 2) {
            return mo22934o(i);
        }
        if (i2 == 64) {
            return m26108U(i);
        }
        if (i2 != 128) {
            return mo22925L(i, i2, bundle);
        }
        return m26110n(i);
    }

    /* renamed from: T */
    private boolean m26107T(int i, Bundle bundle) {
        return C5723u.m25308d0(this.f24812i, i, bundle);
    }

    /* renamed from: U */
    private boolean m26108U(int i) {
        int i2;
        if (!this.f24811h.isEnabled() || !this.f24811h.isTouchExplorationEnabled() || (i2 = this.f24814k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m26110n(i2);
        }
        this.f24814k = i;
        this.f24812i.invalidate();
        mo22933W(i, 32768);
        return true;
    }

    /* renamed from: X */
    private void m26109X(int i) {
        int i2 = this.f24816m;
        if (i2 != i) {
            this.f24816m = i;
            mo22933W(i, 128);
            mo22933W(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m26110n(int i) {
        if (this.f24814k != i) {
            return false;
        }
        this.f24814k = Integer.MIN_VALUE;
        this.f24812i.invalidate();
        mo22933W(i, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        return true;
    }

    /* renamed from: p */
    private boolean m26111p() {
        int i = this.f24815l;
        return i != Integer.MIN_VALUE && mo22925L(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    private AccessibilityEvent m26112q(int i, int i2) {
        if (i != -1) {
            return m26113r(i, i2);
        }
        return m26114s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m26113r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C5771c J = mo22923J(i);
        obtain.getText().add(J.mo22663x());
        obtain.setContentDescription(J.mo22652r());
        obtain.setScrollable(J.mo22611K());
        obtain.setPassword(J.mo22610J());
        obtain.setEnabled(J.mo22604F());
        obtain.setChecked(J.mo22600D());
        mo22927N(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(J.mo22649p());
            C5780e.m25633c(obtain, this.f24812i, i);
            obtain.setPackageName(this.f24812i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m26114s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f24812i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C5771c m26115t(int i) {
        C5771c O = C5771c.m25533O();
        O.mo22635h0(true);
        O.mo22639j0(true);
        O.mo22627c0("android.view.View");
        Rect rect = f24804n;
        O.mo22619X(rect);
        O.mo22620Y(rect);
        O.mo22655s0(this.f24812i);
        mo22929P(i, O);
        if (O.mo22663x() == null && O.mo22652r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O.mo22643m(this.f24808e);
        if (!this.f24808e.equals(rect)) {
            int k = O.mo22640k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                O.mo22651q0(this.f24812i.getContext().getPackageName());
                O.mo22597B0(this.f24812i, i);
                if (this.f24814k == i) {
                    O.mo22618V(true);
                    O.mo22622a(128);
                } else {
                    O.mo22618V(false);
                    O.mo22622a(64);
                }
                boolean z = this.f24815l == i;
                if (z) {
                    O.mo22622a(2);
                } else if (O.mo22606G()) {
                    O.mo22622a(1);
                }
                O.mo22641k0(z);
                this.f24812i.getLocationOnScreen(this.f24810g);
                O.mo22645n(this.f24807d);
                if (this.f24807d.equals(rect)) {
                    O.mo22643m(this.f24807d);
                    if (O.f24453b != -1) {
                        C5771c O2 = C5771c.m25533O();
                        for (int i2 = O.f24453b; i2 != -1; i2 = O2.f24453b) {
                            O2.mo22657t0(this.f24812i, -1);
                            O2.mo22619X(f24804n);
                            mo22929P(i2, O2);
                            O2.mo22643m(this.f24808e);
                            Rect rect2 = this.f24807d;
                            Rect rect3 = this.f24808e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        O2.mo22616S();
                    }
                    this.f24807d.offset(this.f24810g[0] - this.f24812i.getScrollX(), this.f24810g[1] - this.f24812i.getScrollY());
                }
                if (this.f24812i.getLocalVisibleRect(this.f24809f)) {
                    this.f24809f.offset(this.f24810g[0] - this.f24812i.getScrollX(), this.f24810g[1] - this.f24812i.getScrollY());
                    if (this.f24807d.intersect(this.f24809f)) {
                        O.mo22620Y(this.f24807d);
                        if (m26103G(this.f24807d)) {
                            O.mo22605F0(true);
                        }
                    }
                }
                return O;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C5771c m26116u() {
        C5771c P = C5771c.m25534P(this.f24812i);
        C5723u.m25304b0(this.f24812i, P);
        ArrayList arrayList = new ArrayList();
        mo22920C(arrayList);
        if (P.mo22647o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                P.mo22628d(this.f24812i, ((Integer) arrayList.get(i)).intValue());
            }
            return P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C6091h<C5771c> m26117y() {
        ArrayList arrayList = new ArrayList();
        mo22920C(arrayList);
        C6091h<C5771c> hVar = new C6091h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo23407l(i, m26115t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m26118z(int i, Rect rect) {
        mo22923J(i).mo22643m(rect);
    }

    /* renamed from: A */
    public final int mo22918A() {
        return this.f24815l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo22919B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo22920C(List<Integer> list);

    /* renamed from: E */
    public final void mo22921E(int i) {
        mo22922F(i, 0);
    }

    /* renamed from: F */
    public final void mo22922F(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f24811h.isEnabled() && (parent = this.f24812i.getParent()) != null) {
            AccessibilityEvent q = m26112q(i, 2048);
            C5770b.m25530b(q, i2);
            C5739x.m25414h(parent, this.f24812i, q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C5771c mo22923J(int i) {
        if (i == -1) {
            return m26116u();
        }
        return m26115t(i);
    }

    /* renamed from: K */
    public final void mo22924K(boolean z, int i, Rect rect) {
        int i2 = this.f24815l;
        if (i2 != Integer.MIN_VALUE) {
            mo22934o(i2);
        }
        if (z) {
            m26105I(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract boolean mo22925L(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo22926M(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo22927N(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo22928O(C5771c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo22929P(int i, C5771c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo22930Q(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo22931R(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m26106S(i, i2, bundle);
        }
        return m26107T(i2, bundle);
    }

    /* renamed from: V */
    public final boolean mo22932V(int i) {
        int i2;
        if ((!this.f24812i.isFocused() && !this.f24812i.requestFocus()) || (i2 = this.f24815l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo22934o(i2);
        }
        this.f24815l = i;
        mo22930Q(i, true);
        mo22933W(i, 8);
        return true;
    }

    /* renamed from: W */
    public final boolean mo22933W(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f24811h.isEnabled() || (parent = this.f24812i.getParent()) == null) {
            return false;
        }
        return C5739x.m25414h(parent, this.f24812i, m26112q(i, i2));
    }

    /* renamed from: b */
    public C5776d mo5794b(View view) {
        if (this.f24813j == null) {
            this.f24813j = new C5926c();
        }
        return this.f24813j;
    }

    /* renamed from: f */
    public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3196f(view, accessibilityEvent);
        mo22926M(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3197g(View view, C5771c cVar) {
        super.mo3197g(view, cVar);
        mo22928O(cVar);
    }

    /* renamed from: o */
    public final boolean mo22934o(int i) {
        if (this.f24815l != i) {
            return false;
        }
        this.f24815l = Integer.MIN_VALUE;
        mo22930Q(i, false);
        mo22933W(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo22935v(MotionEvent motionEvent) {
        if (!this.f24811h.isEnabled() || !this.f24811h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo22919B(motionEvent.getX(), motionEvent.getY());
            m26109X(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f24816m == Integer.MIN_VALUE) {
            return false;
        } else {
            m26109X(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo22936w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int H = m26104H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m26105I(H, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m26111p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m26105I(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m26105I(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo22937x() {
        return this.f24814k;
    }
}
