package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.r */
class C2890r extends EditText {

    /* renamed from: A */
    private C2701c f11663A;

    /* renamed from: B */
    private C2714c0 f11664B;

    /* renamed from: a */
    private final int f11665a = 0;

    /* renamed from: b */
    private final int f11666b = 1;

    /* renamed from: c */
    private final int f11667c = 2;

    /* renamed from: d */
    private final int f11668d = 3;

    /* renamed from: e */
    private final int f11669e = 1;

    /* renamed from: f */
    private final int f11670f = 2;

    /* renamed from: g */
    private final int f11671g = 3;

    /* renamed from: h */
    private final int f11672h = 0;

    /* renamed from: i */
    private final int f11673i = 1;

    /* renamed from: j */
    private final int f11674j = 2;

    /* renamed from: k */
    private final int f11675k = 1;

    /* renamed from: l */
    private final int f11676l = 2;

    /* renamed from: m */
    private int f11677m;

    /* renamed from: n */
    private int f11678n;

    /* renamed from: o */
    private int f11679o;

    /* renamed from: p */
    private int f11680p;

    /* renamed from: q */
    private int f11681q;

    /* renamed from: r */
    private int f11682r;

    /* renamed from: s */
    private int f11683s;

    /* renamed from: t */
    private int f11684t;

    /* renamed from: u */
    private int f11685u;

    /* renamed from: v */
    private int f11686v;

    /* renamed from: w */
    private String f11687w;

    /* renamed from: x */
    private String f11688x;

    /* renamed from: y */
    private String f11689y;

    /* renamed from: z */
    private String f11690z;

    /* renamed from: com.adcolony.sdk.r$a */
    class C2891a implements C2750e0 {
        C2891a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9943a(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C2892b implements C2750e0 {
        C2892b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9953k(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C2893c implements C2750e0 {
        C2893c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9947e(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$d */
    class C2894d implements C2750e0 {
        C2894d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9948f(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$e */
    class C2895e implements C2750e0 {
        C2895e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9946d(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$f */
    class C2896f implements C2750e0 {
        C2896f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9952j(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$g */
    class C2897g implements C2750e0 {
        C2897g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9949g(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$h */
    class C2898h implements C2750e0 {
        C2898h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9950h(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$i */
    class C2899i implements C2750e0 {
        C2899i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9944b(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$j */
    class C2900j implements C2750e0 {
        C2900j() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2890r.this.mo9945c(c0Var)) {
                C2890r.this.mo9951i(c0Var);
            }
        }
    }

    private C2890r(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9941a(boolean z, int i) {
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
    public void mo9943a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11685u = C2976x.m10332e(b, "x");
        this.f11686v = C2976x.m10332e(b, "y");
        setGravity(mo9941a(true, this.f11685u) | mo9941a(false, this.f11686v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9944b(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "text", getText().toString());
        c0Var.mo9607a(b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9945c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, TtmlNode.ATTR_ID) == this.f11677m && C2976x.m10332e(b, "container_id") == this.f11663A.mo9573c() && C2976x.m10337i(b, "ad_session_id").equals(this.f11663A.mo9563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9946d(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "background_color");
        this.f11688x = i;
        setBackgroundColor(C2916s0.m10084f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9947e(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11678n = C2976x.m10332e(b, "x");
        this.f11679o = C2976x.m10332e(b, "y");
        this.f11680p = C2976x.m10332e(b, "width");
        this.f11681q = C2976x.m10332e(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f11678n, this.f11679o, 0, 0);
        layoutParams.width = this.f11680p;
        layoutParams.height = this.f11681q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9948f(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "font_color");
        this.f11689y = i;
        setTextColor(C2916s0.m10084f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9949g(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_size");
        this.f11684t = e;
        setTextSize((float) e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9950h(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_style");
        this.f11682r = e;
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
    public void mo9951i(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "text");
        this.f11690z = i;
        setText(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9952j(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), "font_family");
        this.f11683s = e;
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
    public void mo9953k(C2714c0 c0Var) {
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
        C2976x.m10323b(b2, "view_id", this.f11677m);
        C2976x.m10313a(b2, "ad_session_id", this.f11687w);
        C2976x.m10323b(b2, "container_x", this.f11678n + x);
        C2976x.m10323b(b2, "container_y", this.f11679o + y);
        C2976x.m10323b(b2, "view_x", x);
        C2976x.m10323b(b2, "view_y", y);
        C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f11663A.mo9573c());
        if (action == 0) {
            new C2714c0("AdContainer.on_touch_began", this.f11663A.mo9591k(), b2).mo9612d();
        } else if (action == 1) {
            if (!this.f11663A.mo9598p()) {
                c.mo9699a(b.mo9621b().get(this.f11687w));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f11663A.mo9591k(), b2).mo9612d();
        } else if (action == 2) {
            new C2714c0("AdContainer.on_touch_moved", this.f11663A.mo9591k(), b2).mo9612d();
        } else if (action == 3) {
            new C2714c0("AdContainer.on_touch_cancelled", this.f11663A.mo9591k(), b2).mo9612d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f11678n);
            C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f11679o);
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action2));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C2714c0("AdContainer.on_touch_began", this.f11663A.mo9591k(), b2).mo9612d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f11678n);
            C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f11679o);
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action3));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f11663A.mo9598p()) {
                c.mo9699a(b.mo9621b().get(this.f11687w));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f11663A.mo9591k(), b2).mo9612d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9942a() {
        JSONObject b = this.f11664B.mo9608b();
        this.f11687w = C2976x.m10337i(b, "ad_session_id");
        this.f11678n = C2976x.m10332e(b, "x");
        this.f11679o = C2976x.m10332e(b, "y");
        this.f11680p = C2976x.m10332e(b, "width");
        this.f11681q = C2976x.m10332e(b, "height");
        this.f11683s = C2976x.m10332e(b, "font_family");
        this.f11682r = C2976x.m10332e(b, "font_style");
        this.f11684t = C2976x.m10332e(b, "font_size");
        this.f11688x = C2976x.m10337i(b, "background_color");
        this.f11689y = C2976x.m10337i(b, "font_color");
        this.f11690z = C2976x.m10337i(b, "text");
        this.f11685u = C2976x.m10332e(b, "align_x");
        this.f11686v = C2976x.m10332e(b, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11680p, this.f11681q);
        layoutParams.setMargins(this.f11678n, this.f11679o, 0, 0);
        layoutParams.gravity = 0;
        this.f11663A.addView(this, layoutParams);
        int i = this.f11683s;
        if (i == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i2 = this.f11682r;
        if (i2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i2 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f11690z);
        setTextSize((float) this.f11684t);
        setGravity(mo9941a(true, this.f11685u) | mo9941a(false, this.f11686v));
        if (!this.f11688x.equals("")) {
            setBackgroundColor(C2916s0.m10084f(this.f11688x));
        }
        if (!this.f11689y.equals("")) {
            setTextColor(C2916s0.m10084f(this.f11689y));
        }
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_visible", (C2750e0) new C2892b(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_bounds", (C2750e0) new C2893c(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_font_color", (C2750e0) new C2894d(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_background_color", (C2750e0) new C2895e(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_typeface", (C2750e0) new C2896f(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_font_size", (C2750e0) new C2897g(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_font_style", (C2750e0) new C2898h(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.get_text", (C2750e0) new C2899i(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.set_text", (C2750e0) new C2900j(), true));
        this.f11663A.mo9587i().add(C2684a.m9401a("TextView.align", (C2750e0) new C2891a(), true));
        this.f11663A.mo9589j().add("TextView.set_visible");
        this.f11663A.mo9589j().add("TextView.set_bounds");
        this.f11663A.mo9589j().add("TextView.set_font_color");
        this.f11663A.mo9589j().add("TextView.set_background_color");
        this.f11663A.mo9589j().add("TextView.set_typeface");
        this.f11663A.mo9589j().add("TextView.set_font_size");
        this.f11663A.mo9589j().add("TextView.set_font_style");
        this.f11663A.mo9589j().add("TextView.get_text");
        this.f11663A.mo9589j().add("TextView.set_text");
        this.f11663A.mo9589j().add("TextView.align");
    }

    C2890r(Context context, C2714c0 c0Var, int i, C2701c cVar) {
        super(context);
        this.f11677m = i;
        this.f11664B = c0Var;
        this.f11663A = cVar;
    }
}
