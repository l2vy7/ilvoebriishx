package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.adcolony.sdk.C2978z;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.c */
class C2701c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C2921t0> f10637a;

    /* renamed from: b */
    private HashMap<Integer, C2901r0> f10638b;

    /* renamed from: c */
    private HashMap<Integer, C2951u0> f10639c;

    /* renamed from: d */
    private HashMap<Integer, C2890r> f10640d;

    /* renamed from: e */
    private HashMap<Integer, C2967v> f10641e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f10642f;

    /* renamed from: g */
    private HashMap<Integer, View> f10643g;

    /* renamed from: h */
    private int f10644h;

    /* renamed from: i */
    private int f10645i;

    /* renamed from: j */
    private int f10646j;

    /* renamed from: k */
    private int f10647k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f10648l;

    /* renamed from: m */
    boolean f10649m;

    /* renamed from: n */
    boolean f10650n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f10651o = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public double f10652p = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f10653q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f10654r = 0;

    /* renamed from: s */
    private ArrayList<C2750e0> f10655s;

    /* renamed from: t */
    private ArrayList<String> f10656t;

    /* renamed from: u */
    private boolean f10657u;

    /* renamed from: v */
    private boolean f10658v;

    /* renamed from: w */
    private boolean f10659w;

    /* renamed from: x */
    private AdSession f10660x;

    /* renamed from: y */
    Context f10661y;

    /* renamed from: z */
    VideoView f10662z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C2702a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f10663a;

        C2702a(Runnable runnable) {
            this.f10663a = runnable;
        }

        public void run() {
            while (!C2701c.this.f10649m) {
                C2916s0.m10063a(this.f10663a);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C2703b implements C2750e0 {
        C2703b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c cVar = C2701c.this;
                cVar.mo9566a((View) cVar.mo9574c(c0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C2704c implements C2750e0 {
        C2704c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c.this.mo9584g(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C2705d implements C2750e0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C2706a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10668a;

            C2706a(C2714c0 c0Var) {
                this.f10668a = c0Var;
            }

            public void run() {
                C2701c cVar = C2701c.this;
                cVar.mo9566a((View) cVar.mo9577d(this.f10668a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C2705d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2916s0.m10063a((Runnable) new C2706a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C2707e implements C2750e0 {

        /* renamed from: com.adcolony.sdk.c$e$a */
        class C2708a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f10671a;

            C2708a(C2714c0 c0Var) {
                this.f10671a = c0Var;
            }

            public void run() {
                C2701c.this.mo9586h(this.f10671a);
            }
        }

        C2707e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2916s0.m10063a((Runnable) new C2708a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C2709f implements C2750e0 {
        C2709f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c cVar = C2701c.this;
                cVar.mo9566a(cVar.mo9570b(c0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C2710g implements C2750e0 {
        C2710g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c.this.mo9582f(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C2711h implements C2750e0 {
        C2711h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c cVar = C2701c.this;
                cVar.mo9566a((View) cVar.mo9562a(c0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C2712i implements C2750e0 {
        C2712i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2701c.this.mo9588i(c0Var)) {
                C2701c.this.mo9580e(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$j */
    class C2713j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10677a;

        C2713j(boolean z) {
            this.f10677a = z;
        }

        public void run() {
            C2951u0 u0Var;
            double d;
            View view = (View) C2701c.this.getParent();
            AdColonyAdView adColonyAdView = C2684a.m9409c().mo9708b().mo9621b().get(C2701c.this.f10648l);
            if (adColonyAdView == null) {
                u0Var = null;
            } else {
                u0Var = adColonyAdView.getWebView();
            }
            C2951u0 u0Var2 = u0Var;
            Context b = C2684a.m9407b();
            boolean z = true;
            float a = C2973w0.m10288a(view, b, true, this.f10677a, true, adColonyAdView != null);
            if (b == null) {
                d = 0.0d;
            } else {
                d = C2916s0.m10048a(C2916s0.m10054a(b));
            }
            int a2 = C2916s0.m10051a((View) u0Var2);
            int b2 = C2916s0.m10067b((View) u0Var2);
            if (a2 == C2701c.this.f10653q && b2 == C2701c.this.f10654r) {
                z = false;
            }
            if (z) {
                int unused = C2701c.this.f10653q = a2;
                int unused2 = C2701c.this.f10654r = b2;
                C2701c.this.m9465a(a2, b2, u0Var2);
            }
            if (!(C2701c.this.f10651o == a && C2701c.this.f10652p == d && !z)) {
                C2701c.this.m9464a(a, d);
            }
            float unused3 = C2701c.this.f10651o = a;
            double unused4 = C2701c.this.f10652p = d;
        }
    }

    C2701c(Context context, String str) {
        super(context);
        this.f10661y = context;
        this.f10648l = str;
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9582f(C2714c0 c0Var) {
        TextView textView;
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        View remove = this.f10643g.remove(Integer.valueOf(e));
        if (this.f10642f.remove(Integer.valueOf(e)).booleanValue()) {
            textView = this.f10640d.remove(Integer.valueOf(e));
        } else {
            textView = this.f10638b.remove(Integer.valueOf(e));
        }
        if (remove == null || textView == null) {
            C2715d b = C2684a.m9409c().mo9708b();
            String c = c0Var.mo9611c();
            b.mo9619a(c, "" + e);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9584g(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        View remove = this.f10643g.remove(Integer.valueOf(e));
        C2921t0 remove2 = this.f10637a.remove(Integer.valueOf(e));
        if (remove == null || remove2 == null) {
            C2715d b = C2684a.m9409c().mo9708b();
            String c = c0Var.mo9611c();
            b.mo9619a(c, "" + e);
            return false;
        }
        if (remove2.mo9989c()) {
            remove2.mo9995j();
        }
        remove2.mo9987a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9586h(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        C2794i c = C2684a.m9409c();
        View remove = this.f10643g.remove(Integer.valueOf(e));
        C2951u0 remove2 = this.f10639c.remove(Integer.valueOf(e));
        if (remove2 == null || remove == null) {
            C2715d b = c.mo9708b();
            String c2 = c0Var.mo9611c();
            b.mo9619a(c2, "" + e);
            return false;
        }
        c.mo9729p().mo9643a(remove2.mo9663d());
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9588i(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, "container_id") == this.f10646j && C2976x.m10337i(b, "ad_session_id").equals(this.f10648l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9590j(C2714c0 c0Var) {
        int i;
        this.f10637a = new HashMap<>();
        this.f10638b = new HashMap<>();
        this.f10639c = new HashMap<>();
        this.f10640d = new HashMap<>();
        this.f10641e = new HashMap<>();
        this.f10642f = new HashMap<>();
        this.f10643g = new HashMap<>();
        this.f10655s = new ArrayList<>();
        this.f10656t = new ArrayList<>();
        JSONObject b = c0Var.mo9608b();
        if (C2976x.m10329c(b, "transparent")) {
            setBackgroundColor(0);
        }
        this.f10646j = C2976x.m10332e(b, TtmlNode.ATTR_ID);
        this.f10644h = C2976x.m10332e(b, "width");
        this.f10645i = C2976x.m10332e(b, "height");
        this.f10647k = C2976x.m10332e(b, "module_id");
        this.f10650n = C2976x.m10329c(b, "viewability_enabled");
        this.f10657u = this.f10646j == 1;
        C2794i c = C2684a.m9409c();
        if (this.f10644h == 0 && this.f10645i == 0) {
            this.f10644h = c.mo9723j().mo9866s();
            if (c.mo9733t().getMultiWindowEnabled()) {
                i = c.mo9723j().mo9865r() - C2916s0.m10081e(C2684a.m9407b());
            } else {
                i = c.mo9723j().mo9865r();
            }
            this.f10645i = i;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f10644h, this.f10645i));
        }
        this.f10655s.add(C2684a.m9401a("VideoView.create", (C2750e0) new C2703b(), true));
        this.f10655s.add(C2684a.m9401a("VideoView.destroy", (C2750e0) new C2704c(), true));
        this.f10655s.add(C2684a.m9401a("WebView.create", (C2750e0) new C2705d(), true));
        this.f10655s.add(C2684a.m9401a("WebView.destroy", (C2750e0) new C2707e(), true));
        this.f10655s.add(C2684a.m9401a("TextView.create", (C2750e0) new C2709f(), true));
        this.f10655s.add(C2684a.m9401a("TextView.destroy", (C2750e0) new C2710g(), true));
        this.f10655s.add(C2684a.m9401a("ImageView.create", (C2750e0) new C2711h(), true));
        this.f10655s.add(C2684a.m9401a("ImageView.destroy", (C2750e0) new C2712i(), true));
        this.f10656t.add("VideoView.create");
        this.f10656t.add("VideoView.destroy");
        this.f10656t.add("WebView.create");
        this.f10656t.add("WebView.destroy");
        this.f10656t.add("TextView.create");
        this.f10656t.add("TextView.destroy");
        this.f10656t.add("ImageView.create");
        this.f10656t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f10661y);
        this.f10662z = videoView;
        videoView.setVisibility(8);
        addView(this.f10662z);
        setClipToPadding(false);
        if (this.f10650n) {
            m9468a(C2976x.m10329c(c0Var.mo9608b(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo9591k() {
        return this.f10647k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C2901r0> mo9592l() {
        return this.f10638b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C2921t0> mo9593m() {
        return this.f10637a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C2951u0> mo9594n() {
        return this.f10639c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo9595o() {
        return this.f10658v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C2794i c = C2684a.m9409c();
        C2715d b = c.mo9708b();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10323b(b2, "view_id", -1);
        C2976x.m10313a(b2, "ad_session_id", this.f10648l);
        C2976x.m10323b(b2, "container_x", x);
        C2976x.m10323b(b2, "container_y", y);
        C2976x.m10323b(b2, "view_x", x);
        C2976x.m10323b(b2, "view_y", y);
        C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f10646j);
        if (action == 0) {
            new C2714c0("AdContainer.on_touch_began", this.f10647k, b2).mo9612d();
        } else if (action == 1) {
            if (!this.f10657u) {
                c.mo9699a(b.mo9621b().get(this.f10648l));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f10647k, b2).mo9612d();
        } else if (action == 2) {
            new C2714c0("AdContainer.on_touch_moved", this.f10647k, b2).mo9612d();
        } else if (action == 3) {
            new C2714c0("AdContainer.on_touch_cancelled", this.f10647k, b2).mo9612d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", (int) motionEvent2.getX(action2));
            C2976x.m10323b(b2, "container_y", (int) motionEvent2.getY(action2));
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action2));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C2714c0("AdContainer.on_touch_began", this.f10647k, b2).mo9612d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", (int) motionEvent2.getX(action3));
            C2976x.m10323b(b2, "container_y", (int) motionEvent2.getY(action3));
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action3));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action3));
            C2976x.m10323b(b2, "x", (int) motionEvent2.getX(action3));
            C2976x.m10323b(b2, "y", (int) motionEvent2.getY(action3));
            if (!this.f10657u) {
                c.mo9699a(b.mo9621b().get(this.f10648l));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f10647k, b2).mo9612d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9598p() {
        return this.f10657u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo9599q() {
        return this.f10659w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo9600r() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10648l);
        new C2714c0("AdSession.on_error", this.f10647k, b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2921t0 mo9574c(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        C2921t0 t0Var = new C2921t0(this.f10661y, c0Var, e, this);
        t0Var.mo9990d();
        this.f10637a.put(Integer.valueOf(e), t0Var);
        this.f10643g.put(Integer.valueOf(e), t0Var);
        return t0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2951u0 mo9577d(C2714c0 c0Var) {
        C2951u0 u0Var;
        JSONObject b = c0Var.mo9608b();
        int e = C2976x.m10332e(b, TtmlNode.ATTR_ID);
        boolean c = C2976x.m10329c(b, "is_module");
        C2794i c2 = C2684a.m9409c();
        if (c) {
            u0Var = c2.mo9690A().get(Integer.valueOf(C2976x.m10332e(b, "module_id")));
            if (u0Var == null) {
                new C2978z.C2979a().mo10088a("Module WebView created with invalid id").mo10090a(C2978z.f11949i);
                return null;
            }
            u0Var.mo10029a(c0Var, e, this);
        } else {
            try {
                u0Var = new C2951u0(this.f10661y, c0Var, e, c2.mo9729p().mo9652d(), this);
            } catch (RuntimeException e2) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a(e2.toString() + ": during WebView initialization.").mo10088a(" Disabling AdColony.").mo10090a(C2978z.f11949i);
                AdColony.disable();
                return null;
            }
        }
        this.f10639c.put(Integer.valueOf(e), u0Var);
        this.f10643g.put(Integer.valueOf(e), u0Var);
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10323b(b2, "module_id", u0Var.mo9663d());
        C2976x.m10323b(b2, "mraid_module_id", u0Var.mo9662c());
        c0Var.mo9607a(b2).mo9612d();
        return u0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9580e(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        View remove = this.f10643g.remove(Integer.valueOf(e));
        C2967v remove2 = this.f10641e.remove(Integer.valueOf(e));
        if (remove == null || remove2 == null) {
            C2715d b = C2684a.m9409c().mo9708b();
            String c = c0Var.mo9611c();
            b.mo9619a(c, "" + e);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public View mo9570b(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        int e = C2976x.m10332e(b, TtmlNode.ATTR_ID);
        if (C2976x.m10329c(b, "editable")) {
            C2890r rVar = new C2890r(this.f10661y, c0Var, e, this);
            rVar.mo9942a();
            this.f10640d.put(Integer.valueOf(e), rVar);
            this.f10643g.put(Integer.valueOf(e), rVar);
            this.f10642f.put(Integer.valueOf(e), Boolean.TRUE);
            return rVar;
        } else if (!C2976x.m10329c(b, "button")) {
            C2901r0 r0Var = new C2901r0(this.f10661y, c0Var, e, this);
            r0Var.mo9956a();
            this.f10638b.put(Integer.valueOf(e), r0Var);
            this.f10643g.put(Integer.valueOf(e), r0Var);
            this.f10642f.put(Integer.valueOf(e), Boolean.FALSE);
            return r0Var;
        } else {
            C2901r0 r0Var2 = new C2901r0(this.f10661y, 16974145, c0Var, e, this);
            r0Var2.mo9956a();
            this.f10638b.put(Integer.valueOf(e), r0Var2);
            this.f10643g.put(Integer.valueOf(e), r0Var2);
            this.f10642f.put(Integer.valueOf(e), Boolean.FALSE);
            return r0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C2750e0> mo9587i() {
        return this.f10655s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2967v mo9562a(C2714c0 c0Var) {
        int e = C2976x.m10332e(c0Var.mo9608b(), TtmlNode.ATTR_ID);
        C2967v vVar = new C2967v(this.f10661y, c0Var, e, this);
        vVar.mo10077a();
        this.f10641e.put(Integer.valueOf(e), vVar);
        this.f10643g.put(Integer.valueOf(e), vVar);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9573c() {
        return this.f10646j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo9579e() {
        return this.f10643g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9575c(boolean z) {
        this.f10659w = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C2890r> mo9581f() {
        return this.f10640d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C2967v> mo9585h() {
        return this.f10641e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo9583g() {
        return this.f10642f;
    }

    /* renamed from: a */
    private void m9468a(boolean z) {
        new Thread(new C2702a(new C2713j(z))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9465a(int i, int i2, C2951u0 u0Var) {
        float n = C2684a.m9409c().mo9723j().mo9861n();
        if (u0Var != null) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10323b(b, "app_orientation", C2916s0.m10079d(C2916s0.m10082e()));
            C2976x.m10323b(b, "width", (int) (((float) u0Var.mo10042m()) / n));
            C2976x.m10323b(b, "height", (int) (((float) u0Var.mo10041l()) / n));
            C2976x.m10323b(b, "x", i);
            C2976x.m10323b(b, "y", i2);
            C2976x.m10313a(b, "ad_session_id", this.f10648l);
            new C2714c0("MRAID.on_size_change", this.f10647k, b).mo9612d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9569b() {
        return this.f10645i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9571b(int i) {
        this.f10644h = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9464a(float f, double d) {
        JSONObject b = C2976x.m10319b();
        C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f10646j);
        C2976x.m10313a(b, "ad_session_id", this.f10648l);
        C2976x.m10312a(b, "exposure", (double) f);
        C2976x.m10312a(b, "volume", d);
        new C2714c0("AdContainer.on_exposure_change", this.f10647k, b).mo9612d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9572b(boolean z) {
        this.f10657u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9576d() {
        return this.f10644h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9578d(boolean z) {
        this.f10658v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9563a() {
        return this.f10648l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9564a(int i) {
        this.f10645i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9567a(AdSession adSession) {
        this.f10660x = adSession;
        mo9568a((Map) this.f10643g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9568a(Map map) {
        if (this.f10660x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo9566a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9566a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f10660x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9565a(View view) {
        AdSession adSession = this.f10660x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo9589j() {
        return this.f10656t;
    }
}
