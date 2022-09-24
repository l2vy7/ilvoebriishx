package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.C3572j;
import com.facebook.common.C3437a;
import com.facebook.common.C3438b;
import com.facebook.common.C3444h;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3541p;
import com.facebook.internal.C3563z;
import com.facebook.share.internal.C3664a;
import com.facebook.share.internal.C3695b;
import com.facebook.share.internal.C3698c;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import p177y0.C6396a;

@Deprecated
public class LikeView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13802b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3748g f13803c;

    /* renamed from: d */
    private LinearLayout f13804d;

    /* renamed from: e */
    private C3698c f13805e;

    /* renamed from: f */
    private C3695b f13806f;

    /* renamed from: g */
    private TextView f13807g;

    /* renamed from: h */
    private C3664a f13808h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3749h f13809i;

    /* renamed from: j */
    private BroadcastReceiver f13810j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C3746e f13811k;

    /* renamed from: l */
    private C3750i f13812l = C3750i.f13849g;

    /* renamed from: m */
    private C3745d f13813m = C3745d.f13832g;

    /* renamed from: n */
    private C3744c f13814n = C3744c.f13825g;

    /* renamed from: o */
    private int f13815o = -1;

    /* renamed from: p */
    private int f13816p;

    /* renamed from: q */
    private int f13817q;

    /* renamed from: r */
    private C3541p f13818r;

    /* renamed from: s */
    private boolean f13819s = true;

    /* renamed from: com.facebook.share.widget.LikeView$a */
    class C3742a implements View.OnClickListener {
        C3742a() {
        }

        public void onClick(View view) {
            LikeView.this.m12626r();
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$b */
    static /* synthetic */ class C3743b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13821a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.share.widget.LikeView$c[] r0 = com.facebook.share.widget.LikeView.C3744c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13821a = r0
                com.facebook.share.widget.LikeView$c r1 = com.facebook.share.widget.LikeView.C3744c.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13821a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.share.widget.LikeView$c r1 = com.facebook.share.widget.LikeView.C3744c.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.share.widget.LikeView$c r1 = com.facebook.share.widget.LikeView.C3744c.INLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.C3743b.<clinit>():void");
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$c */
    public enum C3744c {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        

        /* renamed from: g */
        static C3744c f13825g;

        /* renamed from: b */
        private String f13827b;

        /* renamed from: c */
        private int f13828c;

        static {
            C3744c cVar;
            f13825g = cVar;
        }

        private C3744c(String str, int i) {
            this.f13827b = str;
            this.f13828c = i;
        }

        /* renamed from: b */
        static C3744c m12632b(int i) {
            for (C3744c cVar : values()) {
                if (cVar.m12633d() == i) {
                    return cVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m12633d() {
            return this.f13828c;
        }

        public String toString() {
            return this.f13827b;
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$d */
    public enum C3745d {
        CENTER(TtmlNode.CENTER, 0),
        LEFT(TtmlNode.LEFT, 1),
        RIGHT(TtmlNode.RIGHT, 2);
        

        /* renamed from: g */
        static C3745d f13832g;

        /* renamed from: b */
        private String f13834b;

        /* renamed from: c */
        private int f13835c;

        static {
            C3745d dVar;
            f13832g = dVar;
        }

        private C3745d(String str, int i) {
            this.f13834b = str;
            this.f13835c = i;
        }

        /* renamed from: b */
        static C3745d m12635b(int i) {
            for (C3745d dVar : values()) {
                if (dVar.m12636d() == i) {
                    return dVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m12636d() {
            return this.f13835c;
        }

        public String toString() {
            return this.f13834b;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$e */
    private class C3746e implements C3664a.C3683o {

        /* renamed from: a */
        private boolean f13836a;

        private C3746e() {
        }

        /* renamed from: a */
        public void mo12418a(C3664a aVar, C3572j jVar) {
            if (!this.f13836a) {
                if (aVar != null) {
                    if (!aVar.mo12415p0()) {
                        jVar = new C3572j("Cannot use LikeView. The device may not be supported.");
                    }
                    LikeView.this.m12618i(aVar);
                    LikeView.this.m12629u();
                }
                if (!(jVar == null || LikeView.this.f13809i == null)) {
                    LikeView.this.f13809i.mo12604a(jVar);
                }
                C3746e unused = LikeView.this.f13811k = null;
            }
        }

        /* renamed from: b */
        public void mo12600b() {
            this.f13836a = true;
        }

        /* synthetic */ C3746e(LikeView likeView, C3742a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$f */
    private class C3747f extends BroadcastReceiver {
        private C3747f() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!C3481f0.m11604O(string) && !C3481f0.m11618b(LikeView.this.f13802b, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.m12629u();
                } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.this.f13809i != null) {
                        LikeView.this.f13809i.mo12604a(C3563z.m11926r(extras));
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView likeView = LikeView.this;
                    likeView.m12624p(likeView.f13802b, LikeView.this.f13803c);
                    LikeView.this.m12629u();
                }
            }
        }

        /* synthetic */ C3747f(LikeView likeView, C3742a aVar) {
            this();
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$g */
    public enum C3748g {
        UNKNOWN(C3791bd.UNKNOWN_CONTENT_TYPE, 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        

        /* renamed from: g */
        public static C3748g f13842g;

        /* renamed from: b */
        private String f13844b;

        /* renamed from: c */
        private int f13845c;

        static {
            C3748g gVar;
            f13842g = gVar;
        }

        private C3748g(String str, int i) {
            this.f13844b = str;
            this.f13845c = i;
        }

        /* renamed from: a */
        public static C3748g m12639a(int i) {
            for (C3748g gVar : values()) {
                if (gVar.mo12602d() == i) {
                    return gVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public int mo12602d() {
            return this.f13845c;
        }

        public String toString() {
            return this.f13844b;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$h */
    public interface C3749h {
        /* renamed from: a */
        void mo12604a(C3572j jVar);
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$i */
    public enum C3750i {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        

        /* renamed from: g */
        static C3750i f13849g;

        /* renamed from: b */
        private String f13851b;

        /* renamed from: c */
        private int f13852c;

        static {
            C3750i iVar;
            f13849g = iVar;
        }

        private C3750i(String str, int i) {
            this.f13851b = str;
            this.f13852c = i;
        }

        /* renamed from: b */
        static C3750i m12643b(int i) {
            for (C3750i iVar : values()) {
                if (iVar.m12644d() == i) {
                    return iVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m12644d() {
            return this.f13852c;
        }

        public String toString() {
            return this.f13851b;
        }
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12623n(attributeSet);
        m12619j(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.j r0 = new com.facebook.j
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>((java.lang.String) r1)
            goto L_0x0021
        L_0x0020:
            throw r0
        L_0x0021:
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.getActivity():android.app.Activity");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString(TtmlNode.TAG_STYLE, this.f13812l.toString());
        bundle.putString("auxiliary_position", this.f13814n.toString());
        bundle.putString("horizontal_alignment", this.f13813m.toString());
        bundle.putString("object_id", C3481f0.m11632i(this.f13802b, ""));
        bundle.putString("object_type", this.f13803c.toString());
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12618i(C3664a aVar) {
        this.f13808h = aVar;
        this.f13810j = new C3747f(this, (C3742a) null);
        C6396a b = C6396a.m28074b(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        b.mo24227c(this.f13810j, intentFilter);
    }

    /* renamed from: j */
    private void m12619j(Context context) {
        this.f13816p = getResources().getDimensionPixelSize(C3438b.com_facebook_likeview_edge_padding);
        this.f13817q = getResources().getDimensionPixelSize(C3438b.com_facebook_likeview_internal_padding);
        if (this.f13815o == -1) {
            this.f13815o = getResources().getColor(C3437a.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.f13804d = new LinearLayout(context);
        this.f13804d.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        m12620k(context);
        m12622m(context);
        m12621l(context);
        this.f13804d.addView(this.f13805e);
        this.f13804d.addView(this.f13807g);
        this.f13804d.addView(this.f13806f);
        addView(this.f13804d);
        m12624p(this.f13802b, this.f13803c);
        m12629u();
    }

    /* renamed from: k */
    private void m12620k(Context context) {
        C3664a aVar = this.f13808h;
        C3698c cVar = new C3698c(context, aVar != null && aVar.mo12414W());
        this.f13805e = cVar;
        cVar.setOnClickListener(new C3742a());
        this.f13805e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: l */
    private void m12621l(Context context) {
        this.f13806f = new C3695b(context);
        this.f13806f.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: m */
    private void m12622m(Context context) {
        TextView textView = new TextView(context);
        this.f13807g = textView;
        textView.setTextSize(0, getResources().getDimension(C3438b.com_facebook_likeview_text_size));
        this.f13807g.setMaxLines(2);
        this.f13807g.setTextColor(this.f13815o);
        this.f13807g.setGravity(17);
        this.f13807g.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    /* renamed from: n */
    private void m12623n(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && getContext() != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3444h.f12956J)) != null) {
            this.f13802b = C3481f0.m11632i(obtainStyledAttributes.getString(C3444h.f12960N), (String) null);
            this.f13803c = C3748g.m12639a(obtainStyledAttributes.getInt(C3444h.f12961O, C3748g.f13842g.mo12602d()));
            C3750i b = C3750i.m12643b(obtainStyledAttributes.getInt(C3444h.f12962P, C3750i.f13849g.m12644d()));
            this.f13812l = b;
            if (b != null) {
                C3744c b2 = C3744c.m12632b(obtainStyledAttributes.getInt(C3444h.f12957K, C3744c.f13825g.m12633d()));
                this.f13814n = b2;
                if (b2 != null) {
                    C3745d b3 = C3745d.m12635b(obtainStyledAttributes.getInt(C3444h.f12959M, C3745d.f13832g.m12636d()));
                    this.f13813m = b3;
                    if (b3 != null) {
                        this.f13815o = obtainStyledAttributes.getColor(C3444h.f12958L, -1);
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                }
                throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
            }
            throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m12624p(String str, C3748g gVar) {
        m12625q();
        this.f13802b = str;
        this.f13803c = gVar;
        if (!C3481f0.m11604O(str)) {
            this.f13811k = new C3746e(this, (C3742a) null);
            if (!isInEditMode()) {
                C3664a.m12379O(str, gVar, this.f13811k);
            }
        }
    }

    /* renamed from: q */
    private void m12625q() {
        if (this.f13810j != null) {
            C6396a.m28074b(getContext()).mo24229e(this.f13810j);
            this.f13810j = null;
        }
        C3746e eVar = this.f13811k;
        if (eVar != null) {
            eVar.mo12600b();
            this.f13811k = null;
        }
        this.f13808h = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m12626r() {
        if (this.f13808h != null) {
            Activity activity = null;
            if (this.f13818r == null) {
                activity = getActivity();
            }
            this.f13808h.mo12416r0(activity, this.f13818r, getAnalyticsParameters());
        }
    }

    /* renamed from: s */
    private void m12627s() {
        int i = C3743b.f13821a[this.f13814n.ordinal()];
        if (i == 1) {
            this.f13806f.setCaretPosition(C3695b.C3697b.BOTTOM);
        } else if (i == 2) {
            this.f13806f.setCaretPosition(C3695b.C3697b.TOP);
        } else if (i == 3) {
            this.f13806f.setCaretPosition(this.f13813m == C3745d.RIGHT ? C3695b.C3697b.RIGHT : C3695b.C3697b.LEFT);
        }
    }

    /* renamed from: t */
    private void m12628t() {
        View view;
        C3664a aVar;
        C3664a aVar2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13804d.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13805e.getLayoutParams();
        C3745d dVar = this.f13813m;
        int i = dVar == C3745d.LEFT ? 3 : dVar == C3745d.CENTER ? 1 : 5;
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f13807g.setVisibility(8);
        this.f13806f.setVisibility(8);
        if (this.f13812l == C3750i.STANDARD && (aVar2 = this.f13808h) != null && !C3481f0.m11604O(aVar2.mo12413T())) {
            view = this.f13807g;
        } else if (this.f13812l == C3750i.BOX_COUNT && (aVar = this.f13808h) != null && !C3481f0.m11604O(aVar.mo12411Q())) {
            m12627s();
            view = this.f13806f;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.f13804d;
        C3744c cVar = this.f13814n;
        C3744c cVar2 = C3744c.INLINE;
        if (cVar != cVar2) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        C3744c cVar3 = this.f13814n;
        if (cVar3 == C3744c.TOP || (cVar3 == cVar2 && this.f13813m == C3745d.RIGHT)) {
            this.f13804d.removeView(this.f13805e);
            this.f13804d.addView(this.f13805e);
        } else {
            this.f13804d.removeView(view);
            this.f13804d.addView(view);
        }
        int i3 = C3743b.f13821a[this.f13814n.ordinal()];
        if (i3 == 1) {
            int i4 = this.f13816p;
            view.setPadding(i4, i4, i4, this.f13817q);
        } else if (i3 == 2) {
            int i5 = this.f13816p;
            view.setPadding(i5, this.f13817q, i5, i5);
        } else if (i3 == 3) {
            if (this.f13813m == C3745d.RIGHT) {
                int i6 = this.f13816p;
                view.setPadding(i6, i6, this.f13817q, i6);
                return;
            }
            int i7 = this.f13817q;
            int i8 = this.f13816p;
            view.setPadding(i7, i8, i8, i8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m12629u() {
        boolean z = !this.f13819s;
        C3664a aVar = this.f13808h;
        if (aVar == null) {
            this.f13805e.setSelected(false);
            this.f13807g.setText((CharSequence) null);
            this.f13806f.setText((String) null);
        } else {
            this.f13805e.setSelected(aVar.mo12414W());
            this.f13807g.setText(this.f13808h.mo12413T());
            this.f13806f.setText(this.f13808h.mo12411Q());
            z &= this.f13808h.mo12415p0();
        }
        super.setEnabled(z);
        this.f13805e.setEnabled(z);
        m12628t();
    }

    @Deprecated
    public C3749h getOnErrorListener() {
        return this.f13809i;
    }

    @Deprecated
    /* renamed from: o */
    public void mo12587o(String str, C3748g gVar) {
        String i = C3481f0.m11632i(str, (String) null);
        if (gVar == null) {
            gVar = C3748g.f13842g;
        }
        if (!C3481f0.m11618b(i, this.f13802b) || gVar != this.f13803c) {
            m12624p(i, gVar);
            m12629u();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo12587o((String) null, C3748g.UNKNOWN);
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAuxiliaryViewPosition(C3744c cVar) {
        if (cVar == null) {
            cVar = C3744c.f13825g;
        }
        if (this.f13814n != cVar) {
            this.f13814n = cVar;
            m12628t();
        }
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.f13819s = true;
        m12629u();
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.f13815o != i) {
            this.f13807g.setTextColor(i);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.f13818r = new C3541p(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(C3745d dVar) {
        if (dVar == null) {
            dVar = C3745d.f13832g;
        }
        if (this.f13813m != dVar) {
            this.f13813m = dVar;
            m12628t();
        }
    }

    @Deprecated
    public void setLikeViewStyle(C3750i iVar) {
        if (iVar == null) {
            iVar = C3750i.f13849g;
        }
        if (this.f13812l != iVar) {
            this.f13812l = iVar;
            m12628t();
        }
    }

    @Deprecated
    public void setOnErrorListener(C3749h hVar) {
        this.f13809i = hVar;
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.f13818r = new C3541p(fragment);
    }
}
