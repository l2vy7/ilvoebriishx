package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.C10214j;
import com.google.android.material.internal.C10220m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6526f;
import p193c6.C6529i;
import p193c6.C6530j;
import p193c6.C6531k;
import p193c6.C6532l;
import p232m6.C10805c;
import p232m6.C10806d;
import p242p6.C10889h;

public class BadgeDrawable extends Drawable implements C10214j.C10216b {

    /* renamed from: r */
    private static final int f47229r = C6531k.Widget_MaterialComponents_Badge;

    /* renamed from: s */
    private static final int f47230s = C6522b.badgeStyle;

    /* renamed from: b */
    private final WeakReference<Context> f47231b;

    /* renamed from: c */
    private final C10889h f47232c = new C10889h();

    /* renamed from: d */
    private final C10214j f47233d;

    /* renamed from: e */
    private final Rect f47234e = new Rect();

    /* renamed from: f */
    private final float f47235f;

    /* renamed from: g */
    private final float f47236g;

    /* renamed from: h */
    private final float f47237h;

    /* renamed from: i */
    private final SavedState f47238i;

    /* renamed from: j */
    private float f47239j;

    /* renamed from: k */
    private float f47240k;

    /* renamed from: l */
    private int f47241l;

    /* renamed from: m */
    private float f47242m;

    /* renamed from: n */
    private float f47243n;

    /* renamed from: o */
    private float f47244o;

    /* renamed from: p */
    private WeakReference<View> f47245p;

    /* renamed from: q */
    private WeakReference<FrameLayout> f47246q;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    class C10022a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f47261b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout f47262c;

        C10022a(View view, FrameLayout frameLayout) {
            this.f47261b = view;
            this.f47262c = frameLayout;
        }

        public void run() {
            BadgeDrawable.this.mo39690F(this.f47261b, this.f47262c);
        }
    }

    private BadgeDrawable(Context context) {
        this.f47231b = new WeakReference<>(context);
        C10220m.m47111c(context);
        Resources resources = context.getResources();
        this.f47235f = (float) resources.getDimensionPixelSize(C6524d.mtrl_badge_radius);
        this.f47237h = (float) resources.getDimensionPixelSize(C6524d.mtrl_badge_long_text_horizontal_padding);
        this.f47236g = (float) resources.getDimensionPixelSize(C6524d.mtrl_badge_with_text_radius);
        C10214j jVar = new C10214j(this);
        this.f47233d = jVar;
        jVar.mo40990e().setTextAlign(Paint.Align.CENTER);
        this.f47238i = new SavedState(context);
        m45760A(C6531k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: A */
    private void m45760A(int i) {
        Context context = (Context) this.f47231b.get();
        if (context != null) {
            m45774z(new C10806d(context, i));
        }
    }

    /* renamed from: D */
    private void m45761D(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C6526f.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f47246q;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m45762E(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C6526f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f47246q = new WeakReference<>(frameLayout);
                frameLayout.post(new C10022a(view, frameLayout));
            }
        }
    }

    /* renamed from: E */
    private static void m45762E(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: G */
    private void m45763G() {
        Context context = (Context) this.f47231b.get();
        WeakReference<View> weakReference = this.f47245p;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f47234e);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f47246q;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || C10023a.f47264a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m45765b(context, rect2, view);
            C10023a.m45826f(this.f47234e, this.f47239j, this.f47240k, this.f47243n, this.f47244o);
            this.f47232c.mo43088X(this.f47242m);
            if (!rect.equals(this.f47234e)) {
                this.f47232c.setBounds(this.f47234e);
            }
        }
    }

    /* renamed from: H */
    private void m45764H() {
        double k = (double) mo39701k();
        Double.isNaN(k);
        this.f47241l = ((int) Math.pow(10.0d, k - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m45765b(Context context, Rect rect, View view) {
        int u = this.f47238i.f47258m + this.f47238i.f47260o;
        int q = this.f47238i.f47255j;
        if (q == 8388691 || q == 8388693) {
            this.f47240k = (float) (rect.bottom - u);
        } else {
            this.f47240k = (float) (rect.top + u);
        }
        if (mo39702l() <= 9) {
            float f = !mo39704n() ? this.f47235f : this.f47236g;
            this.f47242m = f;
            this.f47244o = f;
            this.f47243n = f;
        } else {
            float f2 = this.f47236g;
            this.f47242m = f2;
            this.f47244o = f2;
            this.f47243n = (this.f47233d.mo40991f(m45770g()) / 2.0f) + this.f47237h;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo39704n() ? C6524d.mtrl_badge_text_horizontal_edge_offset : C6524d.mtrl_badge_horizontal_edge_offset);
        int s = this.f47238i.f47257l + this.f47238i.f47259n;
        int q2 = this.f47238i.f47255j;
        if (q2 == 8388659 || q2 == 8388691) {
            this.f47239j = C5723u.m25265B(view) == 0 ? (((float) rect.left) - this.f47243n) + ((float) dimensionPixelSize) + ((float) s) : ((((float) rect.right) + this.f47243n) - ((float) dimensionPixelSize)) - ((float) s);
        } else {
            this.f47239j = C5723u.m25265B(view) == 0 ? ((((float) rect.right) + this.f47243n) - ((float) dimensionPixelSize)) - ((float) s) : (((float) rect.left) - this.f47243n) + ((float) dimensionPixelSize) + ((float) s);
        }
    }

    /* renamed from: c */
    public static BadgeDrawable m45766c(Context context) {
        return m45767d(context, (AttributeSet) null, f47230s, f47229r);
    }

    /* renamed from: d */
    private static BadgeDrawable m45767d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m45771o(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    /* renamed from: e */
    static BadgeDrawable m45768e(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m45773q(savedState);
        return badgeDrawable;
    }

    /* renamed from: f */
    private void m45769f(Canvas canvas) {
        Rect rect = new Rect();
        String g = m45770g();
        this.f47233d.mo40990e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f47239j, this.f47240k + ((float) (rect.height() / 2)), this.f47233d.mo40990e());
    }

    /* renamed from: g */
    private String m45770g() {
        if (mo39702l() <= this.f47241l) {
            return NumberFormat.getInstance().format((long) mo39702l());
        }
        Context context = (Context) this.f47231b.get();
        if (context == null) {
            return "";
        }
        return context.getString(C6530j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f47241l), "+"});
    }

    /* renamed from: o */
    private void m45771o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26631C, i, i2, new int[0]);
        mo39714x(h.getInt(C6532l.f26686H, 4));
        int i3 = C6532l.f26697I;
        if (h.hasValue(i3)) {
            mo39715y(h.getInt(i3, 0));
        }
        mo39710t(m45772p(context, h, C6532l.f26642D));
        int i4 = C6532l.f26664F;
        if (h.hasValue(i4)) {
            mo39712v(m45772p(context, h, i4));
        }
        mo39711u(h.getInt(C6532l.f26653E, 8388661));
        mo39713w(h.getDimensionPixelOffset(C6532l.f26675G, 0));
        mo39688B(h.getDimensionPixelOffset(C6532l.f26708J, 0));
        h.recycle();
    }

    /* renamed from: p */
    private static int m45772p(Context context, TypedArray typedArray, int i) {
        return C10805c.m48753a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: q */
    private void m45773q(SavedState savedState) {
        mo39714x(savedState.f47251f);
        if (savedState.f47250e != -1) {
            mo39715y(savedState.f47250e);
        }
        mo39710t(savedState.f47247b);
        mo39712v(savedState.f47248c);
        mo39711u(savedState.f47255j);
        mo39713w(savedState.f47257l);
        mo39688B(savedState.f47258m);
        mo39706r(savedState.f47259n);
        mo39707s(savedState.f47260o);
        mo39689C(savedState.f47256k);
    }

    /* renamed from: z */
    private void m45774z(C10806d dVar) {
        Context context;
        if (this.f47233d.mo40989d() != dVar && (context = (Context) this.f47231b.get()) != null) {
            this.f47233d.mo40993h(dVar, context);
            m45763G();
        }
    }

    /* renamed from: B */
    public void mo39688B(int i) {
        int unused = this.f47238i.f47258m = i;
        m45763G();
    }

    /* renamed from: C */
    public void mo39689C(boolean z) {
        setVisible(z, false);
        boolean unused = this.f47238i.f47256k = z;
        if (C10023a.f47264a && mo39698i() != null && !z) {
            ((ViewGroup) mo39698i().getParent()).invalidate();
        }
    }

    /* renamed from: F */
    public void mo39690F(View view, FrameLayout frameLayout) {
        this.f47245p = new WeakReference<>(view);
        boolean z = C10023a.f47264a;
        if (!z || frameLayout != null) {
            this.f47246q = new WeakReference<>(frameLayout);
        } else {
            m45761D(view);
        }
        if (!z) {
            m45762E(view);
        }
        m45763G();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo39691a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f47232c.draw(canvas);
            if (mo39704n()) {
                m45769f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.f47238i.f47249d;
    }

    public int getIntrinsicHeight() {
        return this.f47234e.height();
    }

    public int getIntrinsicWidth() {
        return this.f47234e.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public CharSequence mo39697h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo39704n()) {
            return this.f47238i.f47252g;
        }
        if (this.f47238i.f47253h <= 0 || (context = (Context) this.f47231b.get()) == null) {
            return null;
        }
        if (mo39702l() <= this.f47241l) {
            return context.getResources().getQuantityString(this.f47238i.f47253h, mo39702l(), new Object[]{Integer.valueOf(mo39702l())});
        }
        return context.getString(this.f47238i.f47254i, new Object[]{Integer.valueOf(this.f47241l)});
    }

    /* renamed from: i */
    public FrameLayout mo39698i() {
        WeakReference<FrameLayout> weakReference = this.f47246q;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo39700j() {
        return this.f47238i.f47257l;
    }

    /* renamed from: k */
    public int mo39701k() {
        return this.f47238i.f47251f;
    }

    /* renamed from: l */
    public int mo39702l() {
        if (!mo39704n()) {
            return 0;
        }
        return this.f47238i.f47250e;
    }

    /* renamed from: m */
    public SavedState mo39703m() {
        return this.f47238i;
    }

    /* renamed from: n */
    public boolean mo39704n() {
        return this.f47238i.f47250e != -1;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo39706r(int i) {
        int unused = this.f47238i.f47259n = i;
        m45763G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo39707s(int i) {
        int unused = this.f47238i.f47260o = i;
        m45763G();
    }

    public void setAlpha(int i) {
        int unused = this.f47238i.f47249d = i;
        this.f47233d.mo40990e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void mo39710t(int i) {
        int unused = this.f47238i.f47247b = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f47232c.mo43117x() != valueOf) {
            this.f47232c.mo43091a0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo39711u(int i) {
        if (this.f47238i.f47255j != i) {
            int unused = this.f47238i.f47255j = i;
            WeakReference<View> weakReference = this.f47245p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f47245p.get();
                WeakReference<FrameLayout> weakReference2 = this.f47246q;
                mo39690F(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: v */
    public void mo39712v(int i) {
        int unused = this.f47238i.f47248c = i;
        if (this.f47233d.mo40990e().getColor() != i) {
            this.f47233d.mo40990e().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void mo39713w(int i) {
        int unused = this.f47238i.f47257l = i;
        m45763G();
    }

    /* renamed from: x */
    public void mo39714x(int i) {
        if (this.f47238i.f47251f != i) {
            int unused = this.f47238i.f47251f = i;
            m45764H();
            this.f47233d.mo40994i(true);
            m45763G();
            invalidateSelf();
        }
    }

    /* renamed from: y */
    public void mo39715y(int i) {
        int max = Math.max(0, i);
        if (this.f47238i.f47250e != max) {
            int unused = this.f47238i.f47250e = max;
            this.f47233d.mo40994i(true);
            m45763G();
            invalidateSelf();
        }
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10021a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f47247b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f47248c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f47249d = 255;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f47250e = -1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f47251f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public CharSequence f47252g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f47253h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f47254i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f47255j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f47256k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f47257l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f47258m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f47259n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f47260o;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        static class C10021a implements Parcelable.Creator<SavedState> {
            C10021a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.f47248c = new C10806d(context, C6531k.TextAppearance_MaterialComponents_Badge).f49535a.getDefaultColor();
            this.f47252g = context.getString(C6530j.mtrl_badge_numberless_content_description);
            this.f47253h = C6529i.mtrl_badge_content_description;
            this.f47254i = C6530j.mtrl_exceed_max_badge_number_content_description;
            this.f47256k = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f47247b);
            parcel.writeInt(this.f47248c);
            parcel.writeInt(this.f47249d);
            parcel.writeInt(this.f47250e);
            parcel.writeInt(this.f47251f);
            parcel.writeString(this.f47252g.toString());
            parcel.writeInt(this.f47253h);
            parcel.writeInt(this.f47255j);
            parcel.writeInt(this.f47257l);
            parcel.writeInt(this.f47258m);
            parcel.writeInt(this.f47259n);
            parcel.writeInt(this.f47260o);
            parcel.writeInt(this.f47256k ? 1 : 0);
        }

        protected SavedState(Parcel parcel) {
            this.f47247b = parcel.readInt();
            this.f47248c = parcel.readInt();
            this.f47249d = parcel.readInt();
            this.f47250e = parcel.readInt();
            this.f47251f = parcel.readInt();
            this.f47252g = parcel.readString();
            this.f47253h = parcel.readInt();
            this.f47255j = parcel.readInt();
            this.f47257l = parcel.readInt();
            this.f47258m = parcel.readInt();
            this.f47259n = parcel.readInt();
            this.f47260o = parcel.readInt();
            this.f47256k = parcel.readInt() != 0;
        }
    }
}
