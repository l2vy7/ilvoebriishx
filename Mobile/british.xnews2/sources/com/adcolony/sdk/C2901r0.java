package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.r0 */
class C2901r0 extends Button {

    /* renamed from: A */
    private C2701c f11701A;

    /* renamed from: B */
    private C2714c0 f11702B;

    /* renamed from: a */
    private final int f11703a = 0;

    /* renamed from: b */
    private final int f11704b = 1;

    /* renamed from: c */
    private final int f11705c = 2;

    /* renamed from: d */
    private final int f11706d = 3;

    /* renamed from: e */
    private final int f11707e = 1;

    /* renamed from: f */
    private final int f11708f = 2;

    /* renamed from: g */
    private final int f11709g = 3;

    /* renamed from: h */
    private final int f11710h = 0;

    /* renamed from: i */
    private final int f11711i = 1;

    /* renamed from: j */
    private final int f11712j = 2;

    /* renamed from: k */
    private final int f11713k = 1;

    /* renamed from: l */
    private final int f11714l = 2;

    /* renamed from: m */
    private int f11715m;

    /* renamed from: n */
    private int f11716n;

    /* renamed from: o */
    private int f11717o;

    /* renamed from: p */
    private int f11718p;

    /* renamed from: q */
    private int f11719q;

    /* renamed from: r */
    private int f11720r;

    /* renamed from: s */
    private int f11721s;

    /* renamed from: t */
    private int f11722t;

    /* renamed from: u */
    private int f11723u;

    /* renamed from: v */
    private int f11724v;

    /* renamed from: w */
    private String f11725w;

    /* renamed from: x */
    private String f11726x;

    /* renamed from: y */
    private String f11727y;

    /* renamed from: z */
    private String f11728z;

    /* renamed from: com.adcolony.sdk.r0$a */
    class C2902a implements C2750e0 {
        C2902a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9957a(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$b */
    class C2903b implements C2750e0 {
        C2903b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9967k(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$c */
    class C2904c implements C2750e0 {
        C2904c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9961e(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$d */
    class C2905d implements C2750e0 {
        C2905d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9962f(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$e */
    class C2906e implements C2750e0 {
        C2906e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9960d(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$f */
    class C2907f implements C2750e0 {
        C2907f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9966j(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$g */
    class C2908g implements C2750e0 {
        C2908g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9963g(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$h */
    class C2909h implements C2750e0 {
        C2909h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9964h(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$i */
    class C2910i implements C2750e0 {
        C2910i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9958b(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r0$j */
    class C2911j implements C2750e0 {
        C2911j() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2901r0.this.mo9959c(c0Var)) {
                C2901r0.this.mo9965i(c0Var);
            }
        }
    }

    private C2901r0(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9955a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i == 1) {
            return z ? 8388611 : 48;
        }
        if (i != 2) {
            return 17;
        }
        return z ? 8388613 : 80;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9957a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11723u = C2976x.m10332e(b, "x");
        this.f11724v = C2976x.m10332e(b, "y");
        setGravity(mo9955a(true, this.f11723u) | mo9955a(false, this.f11724v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9958b(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "text", getText().toString());
        c0Var.mo9607a(b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9959c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, TtmlNode.ATTR_ID) == this.f11715m && C2976x.m10332e(b, "container_id") == this.f11701A.mo9573c() && C2976x.m10337i(b, "ad_session_id").equals(this.f11701A.mo9563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9960d(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "background_color");
        this.f11725w = i;
        setBackgroundColor(C2916s0.m10084f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9961e(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11716n = C2976x.m10332e(b, "x");
        this.f11717o = C2976x.m10332e(b, "y");
        this.f11718p = C2976x.m10332e(b, "width");
        this.f11719q = C2976x.m10332e(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f11716n, this.f11717o, 0, 0);
        layoutParams.width = this.f11718p;
        layoutParams.height = this.f11719q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9962f(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "font_color");
        this.f11726x = i;
        setTextColor(C2916s0.m10084f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9963g(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_size");
        this.f11722t = e;
        setTextSize((float) e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9964h(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_style");
        this.f11720r = e;
        if (e == 0) {
            setTypeface(getTypeface(), 0);
        } else if (e == 1) {
            setTypeface(getTypeface(), 1);
        } else if (e == 2) {
            setTypeface(getTypeface(), 2);
        } else if (e == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9965i(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "text");
        this.f11727y = i;
        setText(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9966j(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_family");
        this.f11721s = e;
        if (e == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (e == 1) {
            setTypeface(Typeface.SERIF);
        } else if (e == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (e == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9967k(C2714c0 c0Var) {
        if (C2976x.m10329c(c0Var.mo9608b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C2794i c = C2684a.m9409c();
        C2715d b = c.mo9708b();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10323b(b2, "view_id", this.f11715m);
        C2976x.m10313a(b2, "ad_session_id", this.f11728z);
        C2976x.m10323b(b2, "container_x", this.f11716n + x);
        C2976x.m10323b(b2, "container_y", this.f11717o + y);
        C2976x.m10323b(b2, "view_x", x);
        C2976x.m10323b(b2, "view_y", y);
        C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f11701A.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f11701A.mo9598p()) {
                    c.mo9699a(b.mo9621b().get(this.f11728z));
                }
                if (x <= 0 || x >= getWidth() || i <= 0 || i >= getHeight()) {
                    new C2714c0("AdContainer.on_touch_cancelled", this.f11701A.mo9591k(), b2).mo9612d();
                    return true;
                }
                new C2714c0("AdContainer.on_touch_ended", this.f11701A.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 2) {
                new C2714c0("AdContainer.on_touch_moved", this.f11701A.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 3) {
                new C2714c0("AdContainer.on_touch_cancelled", this.f11701A.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f11716n);
                C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f11717o);
                C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action2));
                C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C2714c0("AdContainer.on_touch_began", this.f11701A.mo9591k(), b2).mo9612d();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f11716n);
                C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f11717o);
                C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action3));
                C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f11701A.mo9598p()) {
                    c.mo9699a(b.mo9621b().get(this.f11728z));
                }
                if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                    new C2714c0("AdContainer.on_touch_cancelled", this.f11701A.mo9591k(), b2).mo9612d();
                    return true;
                }
                new C2714c0("AdContainer.on_touch_ended", this.f11701A.mo9591k(), b2).mo9612d();
                return true;
            }
        } else {
            new C2714c0("AdContainer.on_touch_began", this.f11701A.mo9591k(), b2).mo9612d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9956a() {
        int i;
        int i2;
        JSONObject b = this.f11702B.mo9608b();
        this.f11728z = C2976x.m10337i(b, "ad_session_id");
        this.f11716n = C2976x.m10332e(b, "x");
        this.f11717o = C2976x.m10332e(b, "y");
        this.f11718p = C2976x.m10332e(b, "width");
        this.f11719q = C2976x.m10332e(b, "height");
        this.f11721s = C2976x.m10332e(b, "font_family");
        this.f11720r = C2976x.m10332e(b, "font_style");
        this.f11722t = C2976x.m10332e(b, "font_size");
        this.f11725w = C2976x.m10337i(b, "background_color");
        this.f11726x = C2976x.m10337i(b, "font_color");
        this.f11727y = C2976x.m10337i(b, "text");
        this.f11723u = C2976x.m10332e(b, "align_x");
        this.f11724v = C2976x.m10332e(b, "align_y");
        C2794i c = C2684a.m9409c();
        if (this.f11727y.equals("")) {
            this.f11727y = "Learn More";
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = C2976x.m10329c(b, "wrap_content") ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.f11718p, this.f11719q);
        layoutParams.gravity = 0;
        setText(this.f11727y);
        setTextSize((float) this.f11722t);
        if (C2976x.m10329c(b, "overlay")) {
            this.f11716n = 0;
            this.f11717o = 0;
            i2 = (int) (c.mo9723j().mo9861n() * 6.0f);
            i = (int) (c.mo9723j().mo9861n() * 6.0f);
            int n = (int) (c.mo9723j().mo9861n() * 4.0f);
            setPadding(n, n, n, n);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f11716n, this.f11717o, i2, i);
        this.f11701A.addView(this, layoutParams);
        int i3 = this.f11721s;
        if (i3 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i3 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i3 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i3 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i4 = this.f11720r;
        if (i4 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i4 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i4 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i4 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(mo9955a(true, this.f11723u) | mo9955a(false, this.f11724v));
        if (!this.f11725w.equals("")) {
            setBackgroundColor(C2916s0.m10084f(this.f11725w));
        }
        if (!this.f11726x.equals("")) {
            setTextColor(C2916s0.m10084f(this.f11726x));
        }
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_visible", (C2750e0) new C2903b(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_bounds", (C2750e0) new C2904c(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_font_color", (C2750e0) new C2905d(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_background_color", (C2750e0) new C2906e(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_typeface", (C2750e0) new C2907f(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_font_size", (C2750e0) new C2908g(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_font_style", (C2750e0) new C2909h(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.get_text", (C2750e0) new C2910i(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.set_text", (C2750e0) new C2911j(), true));
        this.f11701A.mo9587i().add(C2684a.m9401a("TextView.align", (C2750e0) new C2902a(), true));
        this.f11701A.mo9589j().add("TextView.set_visible");
        this.f11701A.mo9589j().add("TextView.set_bounds");
        this.f11701A.mo9589j().add("TextView.set_font_color");
        this.f11701A.mo9589j().add("TextView.set_background_color");
        this.f11701A.mo9589j().add("TextView.set_typeface");
        this.f11701A.mo9589j().add("TextView.set_font_size");
        this.f11701A.mo9589j().add("TextView.set_font_style");
        this.f11701A.mo9589j().add("TextView.get_text");
        this.f11701A.mo9589j().add("TextView.set_text");
        this.f11701A.mo9589j().add("TextView.align");
    }

    C2901r0(Context context, C2714c0 c0Var, int i, C2701c cVar) {
        super(context);
        this.f11715m = i;
        this.f11702B = c0Var;
        this.f11701A = cVar;
    }

    C2901r0(Context context, int i, C2714c0 c0Var, int i2, C2701c cVar) {
        super(context, (AttributeSet) null, i);
        this.f11715m = i2;
        this.f11702B = c0Var;
        this.f11701A = cVar;
    }
}
