package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.v */
class C2967v extends ImageView {

    /* renamed from: a */
    private int f11919a;

    /* renamed from: b */
    private int f11920b;

    /* renamed from: c */
    private int f11921c;

    /* renamed from: d */
    private int f11922d;

    /* renamed from: e */
    private int f11923e;

    /* renamed from: f */
    private boolean f11924f;

    /* renamed from: g */
    private boolean f11925g;

    /* renamed from: h */
    private boolean f11926h;

    /* renamed from: i */
    private String f11927i;

    /* renamed from: j */
    private String f11928j;

    /* renamed from: k */
    private C2714c0 f11929k;

    /* renamed from: l */
    private C2701c f11930l;

    /* renamed from: com.adcolony.sdk.v$a */
    class C2968a implements C2750e0 {
        C2968a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2967v.this.m10270a(c0Var)) {
                C2967v.this.m10276d(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$b */
    class C2969b implements C2750e0 {
        C2969b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2967v.this.m10270a(c0Var)) {
                C2967v.this.m10272b(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$c */
    class C2970c implements C2750e0 {
        C2970c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2967v.this.m10270a(c0Var)) {
                C2967v.this.m10274c(c0Var);
            }
        }
    }

    private C2967v(Context context) {
        super(context);
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
        C2976x.m10323b(b2, "view_id", this.f11919a);
        C2976x.m10313a(b2, "ad_session_id", this.f11928j);
        C2976x.m10323b(b2, "container_x", this.f11920b + x);
        C2976x.m10323b(b2, "container_y", this.f11921c + y);
        C2976x.m10323b(b2, "view_x", x);
        C2976x.m10323b(b2, "view_y", y);
        C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f11930l.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f11930l.mo9598p()) {
                    c.mo9699a(b.mo9621b().get(this.f11928j));
                }
                if (x <= 0 || x >= this.f11922d || i <= 0 || i >= this.f11923e) {
                    new C2714c0("AdContainer.on_touch_cancelled", this.f11930l.mo9591k(), b2).mo9612d();
                    return true;
                }
                new C2714c0("AdContainer.on_touch_ended", this.f11930l.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 2) {
                new C2714c0("AdContainer.on_touch_moved", this.f11930l.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 3) {
                new C2714c0("AdContainer.on_touch_cancelled", this.f11930l.mo9591k(), b2).mo9612d();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f11920b);
                C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f11921c);
                C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action2));
                C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C2714c0("AdContainer.on_touch_began", this.f11930l.mo9591k(), b2).mo9612d();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f11920b);
                C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f11921c);
                C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action3));
                C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f11930l.mo9598p()) {
                    c.mo9699a(b.mo9621b().get(this.f11928j));
                }
                if (x2 <= 0 || x2 >= this.f11922d || y2 <= 0 || y2 >= this.f11923e) {
                    new C2714c0("AdContainer.on_touch_cancelled", this.f11930l.mo9591k(), b2).mo9612d();
                    return true;
                }
                new C2714c0("AdContainer.on_touch_ended", this.f11930l.mo9591k(), b2).mo9612d();
                return true;
            }
        } else {
            new C2714c0("AdContainer.on_touch_began", this.f11930l.mo9591k(), b2).mo9612d();
            return true;
        }
    }

    C2967v(Context context, C2714c0 c0Var, int i, C2701c cVar) {
        super(context);
        this.f11919a = i;
        this.f11929k = c0Var;
        this.f11930l = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10270a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, TtmlNode.ATTR_ID) == this.f11919a && C2976x.m10332e(b, "container_id") == this.f11930l.mo9573c() && C2976x.m10337i(b, "ad_session_id").equals(this.f11930l.mo9563a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10272b(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11920b = C2976x.m10332e(b, "x");
        this.f11921c = C2976x.m10332e(b, "y");
        this.f11922d = C2976x.m10332e(b, "width");
        this.f11923e = C2976x.m10332e(b, "height");
        if (this.f11924f) {
            float n = (((float) this.f11923e) * C2684a.m9409c().mo9723j().mo9861n()) / ((float) getDrawable().getIntrinsicHeight());
            this.f11923e = (int) (((float) getDrawable().getIntrinsicHeight()) * n);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * n);
            this.f11922d = intrinsicWidth;
            this.f11920b -= intrinsicWidth;
            this.f11921c -= this.f11923e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f11920b, this.f11921c, 0, 0);
        layoutParams.width = this.f11922d;
        layoutParams.height = this.f11923e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10274c(C2714c0 c0Var) {
        this.f11927i = C2976x.m10337i(c0Var.mo9608b(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f11927i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10276d(C2714c0 c0Var) {
        if (C2976x.m10329c(c0Var.mo9608b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10077a() {
        JSONObject b = this.f11929k.mo9608b();
        this.f11928j = C2976x.m10337i(b, "ad_session_id");
        this.f11920b = C2976x.m10332e(b, "x");
        this.f11921c = C2976x.m10332e(b, "y");
        this.f11922d = C2976x.m10332e(b, "width");
        this.f11923e = C2976x.m10332e(b, "height");
        this.f11927i = C2976x.m10337i(b, "filepath");
        this.f11924f = C2976x.m10329c(b, "dpi");
        this.f11925g = C2976x.m10329c(b, "invert_y");
        this.f11926h = C2976x.m10329c(b, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f11927i)));
        if (this.f11924f) {
            float n = (((float) this.f11923e) * C2684a.m9409c().mo9723j().mo9861n()) / ((float) getDrawable().getIntrinsicHeight());
            this.f11923e = (int) (((float) getDrawable().getIntrinsicHeight()) * n);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * n);
            this.f11922d = intrinsicWidth;
            this.f11920b -= intrinsicWidth;
            this.f11921c = this.f11925g ? this.f11921c + this.f11923e : this.f11921c - this.f11923e;
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = this.f11926h ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.f11922d, this.f11923e);
        layoutParams.setMargins(this.f11920b, this.f11921c, 0, 0);
        layoutParams.gravity = 0;
        this.f11930l.addView(this, layoutParams);
        this.f11930l.mo9587i().add(C2684a.m9401a("ImageView.set_visible", (C2750e0) new C2968a(), true));
        this.f11930l.mo9587i().add(C2684a.m9401a("ImageView.set_bounds", (C2750e0) new C2969b(), true));
        this.f11930l.mo9587i().add(C2684a.m9401a("ImageView.set_image", (C2750e0) new C2970c(), true));
        this.f11930l.mo9589j().add("ImageView.set_visible");
        this.f11930l.mo9589j().add("ImageView.set_bounds");
        this.f11930l.mo9589j().add("ImageView.set_image");
    }
}
