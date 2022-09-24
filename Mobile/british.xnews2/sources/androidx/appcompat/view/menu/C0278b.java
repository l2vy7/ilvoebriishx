package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.widget.C0418t;
import androidx.appcompat.widget.C0419u;
import java.util.ArrayList;
import java.util.List;
import p072f.C5241d;
import p072f.C5244g;
import p110m0.C5705d;
import p110m0.C5723u;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: CascadingMenuPopup */
final class C0278b extends C0293h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    private static final int f907C = C5244g.f22946g;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f908A;

    /* renamed from: B */
    boolean f909B;

    /* renamed from: c */
    private final Context f910c;

    /* renamed from: d */
    private final int f911d;

    /* renamed from: e */
    private final int f912e;

    /* renamed from: f */
    private final int f913f;

    /* renamed from: g */
    private final boolean f914g;

    /* renamed from: h */
    final Handler f915h;

    /* renamed from: i */
    private final List<C0287e> f916i = new ArrayList();

    /* renamed from: j */
    final List<C0283d> f917j = new ArrayList();

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f918k = new C0279a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f919l = new C0280b();

    /* renamed from: m */
    private final C0418t f920m = new C0281c();

    /* renamed from: n */
    private int f921n = 0;

    /* renamed from: o */
    private int f922o = 0;

    /* renamed from: p */
    private View f923p;

    /* renamed from: q */
    View f924q;

    /* renamed from: r */
    private int f925r;

    /* renamed from: s */
    private boolean f926s;

    /* renamed from: t */
    private boolean f927t;

    /* renamed from: u */
    private int f928u;

    /* renamed from: v */
    private int f929v;

    /* renamed from: w */
    private boolean f930w;

    /* renamed from: x */
    private boolean f931x;

    /* renamed from: y */
    private C0296j.C0297a f932y;

    /* renamed from: z */
    ViewTreeObserver f933z;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* compiled from: CascadingMenuPopup */
    class C0279a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0279a() {
        }

        public void onGlobalLayout() {
            if (C0278b.this.mo1044a() && C0278b.this.f917j.size() > 0 && !C0278b.this.f917j.get(0).f941a.mo1750A()) {
                View view = C0278b.this.f924q;
                if (view == null || !view.isShown()) {
                    C0278b.this.dismiss();
                    return;
                }
                for (C0283d dVar : C0278b.this.f917j) {
                    dVar.f941a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* compiled from: CascadingMenuPopup */
    class C0280b implements View.OnAttachStateChangeListener {
        C0280b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0278b.this.f933z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0278b.this.f933z = view.getViewTreeObserver();
                }
                C0278b bVar = C0278b.this;
                bVar.f933z.removeGlobalOnLayoutListener(bVar.f918k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* compiled from: CascadingMenuPopup */
    class C0281c implements C0418t {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0282a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0283d f937b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f938c;

            /* renamed from: d */
            final /* synthetic */ C0287e f939d;

            C0282a(C0283d dVar, MenuItem menuItem, C0287e eVar) {
                this.f937b = dVar;
                this.f938c = menuItem;
                this.f939d = eVar;
            }

            public void run() {
                C0283d dVar = this.f937b;
                if (dVar != null) {
                    C0278b.this.f909B = true;
                    dVar.f942b.mo1133e(false);
                    C0278b.this.f909B = false;
                }
                if (this.f938c.isEnabled() && this.f938c.hasSubMenu()) {
                    this.f939d.mo1102N(this.f938c, 4);
                }
            }
        }

        C0281c() {
        }

        /* renamed from: d */
        public void mo1065d(C0287e eVar, MenuItem menuItem) {
            C0283d dVar = null;
            C0278b.this.f915h.removeCallbacksAndMessages((Object) null);
            int size = C0278b.this.f917j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == C0278b.this.f917j.get(i).f942b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0278b.this.f917j.size()) {
                    dVar = C0278b.this.f917j.get(i2);
                }
                C0278b.this.f915h.postAtTime(new C0282a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: g */
        public void mo1066g(C0287e eVar, MenuItem menuItem) {
            C0278b.this.f915h.removeCallbacksAndMessages(eVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0283d {

        /* renamed from: a */
        public final C0419u f941a;

        /* renamed from: b */
        public final C0287e f942b;

        /* renamed from: c */
        public final int f943c;

        public C0283d(C0419u uVar, C0287e eVar, int i) {
            this.f941a = uVar;
            this.f942b = eVar;
            this.f943c = i;
        }

        /* renamed from: a */
        public ListView mo1068a() {
            return this.f941a.mo1048j();
        }
    }

    public C0278b(Context context, View view, int i, int i2, boolean z) {
        this.f910c = context;
        this.f923p = view;
        this.f912e = i;
        this.f913f = i2;
        this.f914g = z;
        this.f930w = false;
        this.f925r = m1359E();
        Resources resources = context.getResources();
        this.f911d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5241d.f22843d));
        this.f915h = new Handler();
    }

    /* renamed from: A */
    private C0419u m1355A() {
        C0419u uVar = new C0419u(this.f910c, (AttributeSet) null, this.f912e, this.f913f);
        uVar.mo2255S(this.f920m);
        uVar.mo1759K(this);
        uVar.mo1758J(this);
        uVar.mo1751C(this.f923p);
        uVar.mo1754F(this.f922o);
        uVar.mo1757I(true);
        uVar.mo1756H(2);
        return uVar;
    }

    /* renamed from: B */
    private int m1356B(C0287e eVar) {
        int size = this.f917j.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.f917j.get(i).f942b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C */
    private MenuItem m1357C(C0287e eVar, C0287e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: D */
    private View m1358D(C0283d dVar, C0287e eVar) {
        int i;
        C0286d dVar2;
        int firstVisiblePosition;
        MenuItem C = m1357C(dVar.f942b, eVar);
        if (C == null) {
            return null;
        }
        ListView a = dVar.mo1068a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (C0286d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (C0286d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (C == dVar2.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: E */
    private int m1359E() {
        return C5723u.m25265B(this.f923p) == 1 ? 0 : 1;
    }

    /* renamed from: F */
    private int m1360F(int i) {
        List<C0283d> list = this.f917j;
        ListView a = list.get(list.size() - 1).mo1068a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f924q.getWindowVisibleDisplayFrame(rect);
        if (this.f925r == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: G */
    private void m1361G(C0287e eVar) {
        View view;
        C0283d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f910c);
        C0286d dVar2 = new C0286d(eVar, from, this.f914g, f907C);
        if (!mo1044a() && this.f930w) {
            dVar2.mo1084d(true);
        } else if (mo1044a()) {
            dVar2.mo1084d(C0293h.m1499y(eVar));
        }
        int p = C0293h.m1498p(dVar2, (ViewGroup) null, this.f910c, this.f911d);
        C0419u A = m1355A();
        A.mo1630o(dVar2);
        A.mo1753E(p);
        A.mo1754F(this.f922o);
        if (this.f917j.size() > 0) {
            List<C0283d> list = this.f917j;
            dVar = list.get(list.size() - 1);
            view = m1358D(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            A.mo2256T(false);
            A.mo2253Q((Object) null);
            int F = m1360F(p);
            boolean z = F == 1;
            this.f925r = F;
            if (Build.VERSION.SDK_INT >= 26) {
                A.mo1751C(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f923p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f922o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f923p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f922o & 5) != 5) {
                if (z) {
                    p = view.getWidth();
                }
                i3 = i - p;
                A.mo1766e(i3);
                A.mo1760L(true);
                A.mo1768k(i2);
            } else if (!z) {
                p = view.getWidth();
                i3 = i - p;
                A.mo1766e(i3);
                A.mo1760L(true);
                A.mo1768k(i2);
            }
            i3 = i + p;
            A.mo1766e(i3);
            A.mo1760L(true);
            A.mo1768k(i2);
        } else {
            if (this.f926s) {
                A.mo1766e(this.f928u);
            }
            if (this.f927t) {
                A.mo1768k(this.f929v);
            }
            A.mo1755G(mo1253o());
        }
        this.f917j.add(new C0283d(A, eVar, this.f925r));
        A.show();
        ListView j = A.mo1048j();
        j.setOnKeyListener(this);
        if (dVar == null && this.f931x && eVar.mo1165z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5244g.f22953n, j, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.mo1165z());
            j.addHeaderView(frameLayout, (Object) null, false);
            A.show();
        }
    }

    /* renamed from: a */
    public boolean mo1044a() {
        return this.f917j.size() > 0 && this.f917j.get(0).f941a.mo1044a();
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
        int B = m1356B(eVar);
        if (B >= 0) {
            int i = B + 1;
            if (i < this.f917j.size()) {
                this.f917j.get(i).f942b.mo1133e(false);
            }
            C0283d remove = this.f917j.remove(B);
            remove.f942b.mo1104Q(this);
            if (this.f909B) {
                remove.f941a.mo2254R((Object) null);
                remove.f941a.mo1752D(0);
            }
            remove.f941a.dismiss();
            int size = this.f917j.size();
            if (size > 0) {
                this.f925r = this.f917j.get(size - 1).f943c;
            } else {
                this.f925r = m1359E();
            }
            if (size == 0) {
                dismiss();
                C0296j.C0297a aVar = this.f932y;
                if (aVar != null) {
                    aVar.mo877b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f933z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f933z.removeGlobalOnLayoutListener(this.f918k);
                    }
                    this.f933z = null;
                }
                this.f924q.removeOnAttachStateChangeListener(this.f919l);
                this.f908A.onDismiss();
            } else if (z) {
                this.f917j.get(0).f942b.mo1133e(false);
            }
        }
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        for (C0283d a : this.f917j) {
            C0293h.m1500z(a.mo1068a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1045d() {
        return false;
    }

    public void dismiss() {
        int size = this.f917j.size();
        if (size > 0) {
            C0283d[] dVarArr = (C0283d[]) this.f917j.toArray(new C0283d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0283d dVar = dVarArr[i];
                if (dVar.f941a.mo1044a()) {
                    dVar.f941a.dismiss();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo1031g(C0296j.C0297a aVar) {
        this.f932y = aVar;
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
    }

    /* renamed from: j */
    public ListView mo1048j() {
        if (this.f917j.isEmpty()) {
            return null;
        }
        List<C0283d> list = this.f917j;
        return list.get(list.size() - 1).mo1068a();
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        for (C0283d next : this.f917j) {
            if (mVar == next.f942b) {
                next.mo1068a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        mo1050m(mVar);
        C0296j.C0297a aVar = this.f932y;
        if (aVar != null) {
            aVar.mo878c(mVar);
        }
        return true;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        return null;
    }

    /* renamed from: m */
    public void mo1050m(C0287e eVar) {
        eVar.mo1126c(this, this.f910c);
        if (mo1044a()) {
            m1361G(eVar);
        } else {
            this.f916i.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo1051n() {
        return false;
    }

    public void onDismiss() {
        C0283d dVar;
        int size = this.f917j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f917j.get(i);
            if (!dVar.f941a.mo1044a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f942b.mo1133e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: q */
    public void mo1054q(View view) {
        if (this.f923p != view) {
            this.f923p = view;
            this.f922o = C5705d.m25206b(this.f921n, C5723u.m25265B(view));
        }
    }

    /* renamed from: s */
    public void mo1055s(boolean z) {
        this.f930w = z;
    }

    public void show() {
        if (!mo1044a()) {
            for (C0287e G : this.f916i) {
                m1361G(G);
            }
            this.f916i.clear();
            View view = this.f923p;
            this.f924q = view;
            if (view != null) {
                boolean z = this.f933z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f933z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f918k);
                }
                this.f924q.addOnAttachStateChangeListener(this.f919l);
            }
        }
    }

    /* renamed from: t */
    public void mo1057t(int i) {
        if (this.f921n != i) {
            this.f921n = i;
            this.f922o = C5705d.m25206b(i, C5723u.m25265B(this.f923p));
        }
    }

    /* renamed from: u */
    public void mo1058u(int i) {
        this.f926s = true;
        this.f928u = i;
    }

    /* renamed from: v */
    public void mo1059v(PopupWindow.OnDismissListener onDismissListener) {
        this.f908A = onDismissListener;
    }

    /* renamed from: w */
    public void mo1060w(boolean z) {
        this.f931x = z;
    }

    /* renamed from: x */
    public void mo1061x(int i) {
        this.f927t = true;
        this.f929v = i;
    }
}
