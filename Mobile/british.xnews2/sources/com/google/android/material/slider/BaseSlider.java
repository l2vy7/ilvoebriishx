package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.internal.C10192c;
import com.google.android.material.internal.C10220m;
import com.google.android.material.internal.C10226r;
import com.google.android.material.internal.C10227s;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.C10283a;
import com.google.android.material.slider.C10284b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p062d0.C5135a;
import p078g.C5264a;
import p079g0.C5266a;
import p110m0.C5723u;
import p116n0.C5771c;
import p134q0.C5923a;
import p193c6.C6522b;
import p193c6.C6523c;
import p193c6.C6524d;
import p193c6.C6530j;
import p193c6.C6531k;
import p193c6.C6532l;
import p199d6.C10493a;
import p214h6.C10579a;
import p232m6.C10805c;
import p242p6.C10889h;
import p242p6.C10897m;
import p245q6.C10962a;
import p248r6.C10966a;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C10283a<S>, T extends C10284b<S>> extends View {

    /* renamed from: o0 */
    private static final String f48323o0 = BaseSlider.class.getSimpleName();

    /* renamed from: p0 */
    static final int f48324p0 = C6531k.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    private int f48325A;

    /* renamed from: B */
    private int f48326B;

    /* renamed from: C */
    private float f48327C;

    /* renamed from: D */
    private MotionEvent f48328D;

    /* renamed from: E */
    private C10285c f48329E;

    /* renamed from: F */
    private boolean f48330F;

    /* renamed from: G */
    private float f48331G;

    /* renamed from: H */
    private float f48332H;

    /* renamed from: I */
    private ArrayList<Float> f48333I;

    /* renamed from: J */
    private int f48334J;

    /* renamed from: K */
    private int f48335K;

    /* renamed from: L */
    private float f48336L;

    /* renamed from: M */
    private float[] f48337M;

    /* renamed from: N */
    private boolean f48338N;

    /* renamed from: O */
    private int f48339O;

    /* renamed from: P */
    private boolean f48340P;

    /* renamed from: Q */
    private boolean f48341Q;

    /* renamed from: R */
    private boolean f48342R;

    /* renamed from: S */
    private ColorStateList f48343S;

    /* renamed from: T */
    private ColorStateList f48344T;

    /* renamed from: U */
    private ColorStateList f48345U;

    /* renamed from: V */
    private ColorStateList f48346V;

    /* renamed from: W */
    private ColorStateList f48347W;

    /* renamed from: b */
    private final Paint f48348b;

    /* renamed from: c */
    private final Paint f48349c;

    /* renamed from: d */
    private final Paint f48350d;

    /* renamed from: e */
    private final Paint f48351e;

    /* renamed from: f */
    private final Paint f48352f;

    /* renamed from: g */
    private final Paint f48353g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10279e f48354h;

    /* renamed from: i */
    private final AccessibilityManager f48355i;

    /* renamed from: j */
    private BaseSlider<S, L, T>.d f48356j;

    /* renamed from: k */
    private final C10280f f48357k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<C10966a> f48358l;

    /* renamed from: l0 */
    private final C10889h f48359l0;

    /* renamed from: m */
    private final List<L> f48360m;

    /* renamed from: m0 */
    private float f48361m0;

    /* renamed from: n */
    private final List<T> f48362n;

    /* renamed from: n0 */
    private int f48363n0;

    /* renamed from: o */
    private boolean f48364o;

    /* renamed from: p */
    private ValueAnimator f48365p;

    /* renamed from: q */
    private ValueAnimator f48366q;

    /* renamed from: r */
    private final int f48367r;

    /* renamed from: s */
    private int f48368s;

    /* renamed from: t */
    private int f48369t;

    /* renamed from: u */
    private int f48370u;

    /* renamed from: v */
    private int f48371v;

    /* renamed from: w */
    private int f48372w;

    /* renamed from: x */
    private int f48373x;

    /* renamed from: y */
    private int f48374y;

    /* renamed from: z */
    private int f48375z;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C10274a();

        /* renamed from: b */
        float f48376b;

        /* renamed from: c */
        float f48377c;

        /* renamed from: d */
        ArrayList<Float> f48378d;

        /* renamed from: e */
        float f48379e;

        /* renamed from: f */
        boolean f48380f;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        static class C10274a implements Parcelable.Creator<SliderState> {
            C10274a() {
            }

            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, (C10275a) null);
            }

            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, C10275a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f48376b);
            parcel.writeFloat(this.f48377c);
            parcel.writeList(this.f48378d);
            parcel.writeFloat(this.f48379e);
            parcel.writeBooleanArray(new boolean[]{this.f48380f});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f48376b = parcel.readFloat();
            this.f48377c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f48378d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f48379e = parcel.readFloat();
            this.f48380f = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    class C10275a implements C10280f {

        /* renamed from: a */
        final /* synthetic */ AttributeSet f48381a;

        /* renamed from: b */
        final /* synthetic */ int f48382b;

        C10275a(AttributeSet attributeSet, int i) {
            this.f48381a = attributeSet;
            this.f48382b = i;
        }

        /* renamed from: a */
        public C10966a mo41347a() {
            TypedArray h = C10220m.m47116h(BaseSlider.this.getContext(), this.f48381a, C6532l.f26660E6, this.f48382b, BaseSlider.f48324p0, new int[0]);
            C10966a a = BaseSlider.m47410R(BaseSlider.this.getContext(), h);
            h.recycle();
            return a;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    class C10276b implements ValueAnimator.AnimatorUpdateListener {
        C10276b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (C10966a B0 : BaseSlider.this.f48358l) {
                B0.mo43260B0(floatValue);
            }
            C5723u.m25310e0(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    class C10277c extends AnimatorListenerAdapter {
        C10277c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (C10966a b : BaseSlider.this.f48358l) {
                C10227s.m47137e(BaseSlider.this).mo41001b(b);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    private static class C10279e extends C5923a {

        /* renamed from: q */
        private final BaseSlider<?, ?, ?> f48388q;

        /* renamed from: r */
        Rect f48389r = new Rect();

        C10279e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f48388q = baseSlider;
        }

        /* renamed from: Y */
        private String m47464Y(int i) {
            if (i == this.f48388q.getValues().size() - 1) {
                return this.f48388q.getContext().getString(C6530j.material_slider_range_end);
            }
            return i == 0 ? this.f48388q.getContext().getString(C6530j.material_slider_range_start) : "";
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo22919B(float f, float f2) {
            for (int i = 0; i < this.f48388q.getValues().size(); i++) {
                this.f48388q.mo41270c0(i, this.f48389r);
                if (this.f48389r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo22920C(List<Integer> list) {
            for (int i = 0; i < this.f48388q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public boolean mo22925L(int i, int i2, Bundle bundle) {
            if (!this.f48388q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float g = this.f48388q.m47437k(20);
                if (i2 == 8192) {
                    g = -g;
                }
                if (this.f48388q.mo41268F()) {
                    g = -g;
                }
                if (!this.f48388q.m47419a0(i, C5266a.m23793a(this.f48388q.getValues().get(i).floatValue() + g, this.f48388q.getValueFrom(), this.f48388q.getValueTo()))) {
                    return false;
                }
                this.f48388q.m47424d0();
                this.f48388q.postInvalidate();
                mo22921E(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f48388q.m47419a0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f48388q.m47424d0();
                    this.f48388q.postInvalidate();
                    mo22921E(i);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo22929P(int i, C5771c cVar) {
            cVar.mo22624b(C5771c.C5772a.f24466L);
            List<Float> values = this.f48388q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f48388q.getValueFrom();
            float valueTo = this.f48388q.getValueTo();
            if (this.f48388q.isEnabled()) {
                if (floatValue > valueFrom) {
                    cVar.mo22622a(8192);
                }
                if (floatValue < valueTo) {
                    cVar.mo22622a(4096);
                }
            }
            cVar.mo22659u0(C5771c.C5775d.m25624a(1, valueFrom, valueTo, floatValue));
            cVar.mo22627c0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f48388q.getContentDescription() != null) {
                sb.append(this.f48388q.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m47464Y(i));
                sb.append(this.f48388q.m47454y(floatValue));
            }
            cVar.mo22634g0(sb.toString());
            this.f48388q.mo41270c0(i, this.f48389r);
            cVar.mo22619X(this.f48389r);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    private interface C10280f {
        /* renamed from: a */
        C10966a mo41347a();
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.sliderStyle);
    }

    /* renamed from: A */
    private float m47395A(int i, float f) {
        float f2 = 0.0f;
        if (this.f48336L == 0.0f) {
            f2 = getMinSeparation();
        }
        if (this.f48363n0 == 0) {
            f2 = m47445p(f2);
        }
        if (mo41268F()) {
            f2 = -f2;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return C5266a.m23793a(f, i3 < 0 ? this.f48331G : this.f48333I.get(i3).floatValue() + f2, i2 >= this.f48333I.size() ? this.f48332H : this.f48333I.get(i2).floatValue() - f2);
    }

    /* renamed from: B */
    private int m47396B(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: D */
    private void m47397D() {
        this.f48348b.setStrokeWidth((float) this.f48372w);
        this.f48349c.setStrokeWidth((float) this.f48372w);
        this.f48352f.setStrokeWidth(((float) this.f48372w) / 2.0f);
        this.f48353g.setStrokeWidth(((float) this.f48372w) / 2.0f);
    }

    /* renamed from: E */
    private boolean m47398E() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: G */
    private void m47399G(Resources resources) {
        this.f48370u = resources.getDimensionPixelSize(C6524d.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C6524d.mtrl_slider_track_side_padding);
        this.f48368s = dimensionPixelOffset;
        this.f48373x = dimensionPixelOffset;
        this.f48369t = resources.getDimensionPixelSize(C6524d.mtrl_slider_thumb_radius);
        this.f48374y = resources.getDimensionPixelOffset(C6524d.mtrl_slider_track_top);
        this.f48326B = resources.getDimensionPixelSize(C6524d.mtrl_slider_label_padding);
    }

    /* renamed from: H */
    private void m47400H() {
        if (this.f48336L > 0.0f) {
            m47428f0();
            int min = Math.min((int) (((this.f48332H - this.f48331G) / this.f48336L) + 1.0f), (this.f48339O / (this.f48372w * 2)) + 1);
            float[] fArr = this.f48337M;
            if (fArr == null || fArr.length != min * 2) {
                this.f48337M = new float[(min * 2)];
            }
            float f = ((float) this.f48339O) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f48337M;
                fArr2[i] = ((float) this.f48373x) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) m47439l();
            }
        }
    }

    /* renamed from: I */
    private void m47401I(Canvas canvas, int i, int i2) {
        if (m47415X()) {
            int N = (int) (((float) this.f48373x) + (m47406N(this.f48333I.get(this.f48335K).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f48325A;
                canvas.clipRect((float) (N - i3), (float) (i2 - i3), (float) (N + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) N, (float) i2, (float) this.f48325A, this.f48351e);
        }
    }

    /* renamed from: J */
    private void m47402J(Canvas canvas) {
        if (this.f48338N && this.f48336L > 0.0f) {
            float[] activeRange = getActiveRange();
            int T = m47411T(this.f48337M, activeRange[0]);
            int T2 = m47411T(this.f48337M, activeRange[1]);
            int i = T * 2;
            canvas.drawPoints(this.f48337M, 0, i, this.f48352f);
            int i2 = T2 * 2;
            canvas.drawPoints(this.f48337M, i, i2 - i, this.f48353g);
            float[] fArr = this.f48337M;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f48352f);
        }
    }

    /* renamed from: K */
    private void m47403K() {
        this.f48373x = this.f48368s + Math.max(this.f48375z - this.f48369t, 0);
        if (C5723u.m25294T(this)) {
            m47426e0(getWidth());
        }
    }

    /* renamed from: L */
    private boolean m47404L(int i) {
        int i2 = this.f48335K;
        int c = (int) C5266a.m23795c(((long) i2) + ((long) i), 0, (long) (this.f48333I.size() - 1));
        this.f48335K = c;
        if (c == i2) {
            return false;
        }
        if (this.f48334J != -1) {
            this.f48334J = c;
        }
        m47424d0();
        postInvalidate();
        return true;
    }

    /* renamed from: M */
    private boolean m47405M(int i) {
        if (mo41268F()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return m47404L(i);
    }

    /* renamed from: N */
    private float m47406N(float f) {
        float f2 = this.f48331G;
        float f3 = (f - f2) / (this.f48332H - f2);
        return mo41268F() ? 1.0f - f3 : f3;
    }

    /* renamed from: O */
    private Boolean m47407O(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        m47404L(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                m47405M(-1);
                                return Boolean.TRUE;
                            case 22:
                                m47405M(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                m47404L(1);
                return Boolean.TRUE;
            }
            this.f48334J = this.f48335K;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m47404L(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m47404L(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: P */
    private void m47408P() {
        for (T a : this.f48362n) {
            a.mo41362a(this);
        }
    }

    /* renamed from: Q */
    private void m47409Q() {
        for (T b : this.f48362n) {
            b.mo41363b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static C10966a m47410R(Context context, TypedArray typedArray) {
        return C10966a.m49309u0(context, (AttributeSet) null, 0, typedArray.getResourceId(C6532l.f26748M6, C6531k.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: T */
    private static int m47411T(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* renamed from: U */
    private void m47412U(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26660E6, i, f48324p0, new int[0]);
        this.f48331G = h.getFloat(C6532l.f26693H6, 0.0f);
        this.f48332H = h.getFloat(C6532l.f26704I6, 1.0f);
        setValues(Float.valueOf(this.f48331G));
        this.f48336L = h.getFloat(C6532l.f26682G6, 0.0f);
        int i4 = C6532l.f26855W6;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C6532l.f26875Y6;
        }
        if (!hasValue) {
            i4 = C6532l.f26865X6;
        }
        ColorStateList a = C10805c.m48753a(context, h, i2);
        if (a == null) {
            a = C5264a.m23788c(context, C6523c.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = C10805c.m48753a(context, h, i4);
        if (a2 == null) {
            a2 = C5264a.m23788c(context, C6523c.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.f48359l0.mo43091a0(C10805c.m48753a(context, h, C6532l.f26759N6));
        int i5 = C6532l.f26792Q6;
        if (h.hasValue(i5)) {
            setThumbStrokeColor(C10805c.m48753a(context, h, i5));
        }
        setThumbStrokeWidth(h.getDimension(C6532l.f26803R6, 0.0f));
        ColorStateList a3 = C10805c.m48753a(context, h, C6532l.f26715J6);
        if (a3 == null) {
            a3 = C5264a.m23788c(context, C6523c.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.f48338N = h.getBoolean(C6532l.f26845V6, true);
        int i6 = C6532l.f26814S6;
        boolean hasValue2 = h.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C6532l.f26835U6;
        }
        if (!hasValue2) {
            i6 = C6532l.f26825T6;
        }
        ColorStateList a4 = C10805c.m48753a(context, h, i3);
        if (a4 == null) {
            a4 = C5264a.m23788c(context, C6523c.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = C10805c.m48753a(context, h, i6);
        if (a5 == null) {
            a5 = C5264a.m23788c(context, C6523c.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(h.getDimensionPixelSize(C6532l.f26781P6, 0));
        setHaloRadius(h.getDimensionPixelSize(C6532l.f26726K6, 0));
        setThumbElevation(h.getDimension(C6532l.f26770O6, 0.0f));
        setTrackHeight(h.getDimensionPixelSize(C6532l.f26885Z6, 0));
        this.f48371v = h.getInt(C6532l.f26737L6, 0);
        if (!h.getBoolean(C6532l.f26671F6, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    /* renamed from: V */
    private void m47413V(int i) {
        BaseSlider<S, L, T>.d dVar = this.f48356j;
        if (dVar == null) {
            this.f48356j = new C10278d(this, (C10275a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.f48356j.mo41350a(i);
        postDelayed(this.f48356j, 200);
    }

    /* renamed from: W */
    private void m47414W(C10966a aVar, float f) {
        aVar.mo43261C0(m47454y(f));
        int N = (this.f48373x + ((int) (m47406N(f) * ((float) this.f48339O)))) - (aVar.getIntrinsicWidth() / 2);
        int l = m47439l() - (this.f48326B + this.f48375z);
        aVar.setBounds(N, l - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + N, l);
        Rect rect = new Rect(aVar.getBounds());
        C10192c.m47019c(C10227s.m47136d(this), this, rect);
        aVar.setBounds(rect);
        C10227s.m47137e(this).mo41000a(aVar);
    }

    /* renamed from: X */
    private boolean m47415X() {
        return this.f48340P || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: Y */
    private boolean m47416Y(float f) {
        return m47419a0(this.f48334J, f);
    }

    /* renamed from: Z */
    private double m47417Z(float f) {
        float f2 = this.f48336L;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.f48332H - this.f48331G) / f2);
        double round = (double) Math.round(f * ((float) i));
        double d = (double) i;
        Double.isNaN(round);
        Double.isNaN(d);
        return round / d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public boolean m47419a0(int i, float f) {
        if (((double) Math.abs(f - this.f48333I.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f48333I.set(i, Float.valueOf(m47395A(i, f)));
        this.f48335K = i;
        m47446q(i);
        return true;
    }

    /* renamed from: b0 */
    private boolean m47421b0() {
        return m47416Y(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m47424d0() {
        if (!m47415X() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int N = (int) ((m47406N(this.f48333I.get(this.f48335K).floatValue()) * ((float) this.f48339O)) + ((float) this.f48373x));
                int l = m47439l();
                int i = this.f48325A;
                C5135a.m23412l(background, N - i, l - i, N + i, l + i);
            }
        }
    }

    /* renamed from: e0 */
    private void m47426e0(int i) {
        this.f48339O = Math.max(i - (this.f48373x * 2), 0);
        m47400H();
    }

    /* renamed from: f0 */
    private void m47428f0() {
        if (this.f48342R) {
            m47432h0();
            m47434i0();
            m47430g0();
            m47436j0();
            m47442m0();
            this.f48342R = false;
        }
    }

    /* renamed from: g0 */
    private void m47430g0() {
        if (this.f48336L > 0.0f && !m47438k0(this.f48332H)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(this.f48336L), Float.toString(this.f48331G), Float.toString(this.f48332H)}));
        }
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f48333I.size() == 1) {
            floatValue2 = this.f48331G;
        }
        float N = m47406N(floatValue2);
        float N2 = m47406N(floatValue);
        if (mo41268F()) {
            return new float[]{N2, N};
        }
        return new float[]{N, N2};
    }

    private float getValueOfTouchPosition() {
        double Z = m47417Z(this.f48361m0);
        if (mo41268F()) {
            Z = 1.0d - Z;
        }
        float f = this.f48332H;
        float f2 = this.f48331G;
        double d = (double) (f - f2);
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (float) ((Z * d) + d2);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f48361m0;
        if (mo41268F()) {
            f = 1.0f - f;
        }
        float f2 = this.f48332H;
        float f3 = this.f48331G;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: h */
    private void m47431h(C10966a aVar) {
        aVar.mo43259A0(C10227s.m47136d(this));
    }

    /* renamed from: h0 */
    private void m47432h0() {
        if (this.f48331G >= this.f48332H) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.toString(this.f48331G), Float.toString(this.f48332H)}));
        }
    }

    /* renamed from: i */
    private Float m47433i(int i) {
        float k = this.f48341Q ? m47437k(20) : m47435j();
        if (i == 21) {
            if (!mo41268F()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 22) {
            if (mo41268F()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 69) {
            return Float.valueOf(-k);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(k);
            }
            return null;
        }
    }

    /* renamed from: i0 */
    private void m47434i0() {
        if (this.f48332H <= this.f48331G) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.toString(this.f48332H), Float.toString(this.f48331G)}));
        }
    }

    /* renamed from: j */
    private float m47435j() {
        float f = this.f48336L;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    private void m47436j0() {
        Iterator<Float> it = this.f48333I.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f48331G || next.floatValue() > this.f48332H) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f48331G), Float.toString(this.f48332H)}));
            } else if (this.f48336L > 0.0f && !m47438k0(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f48331G), Float.toString(this.f48336L), Float.toString(this.f48336L)}));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public float m47437k(int i) {
        float j = m47435j();
        float f = (this.f48332H - this.f48331G) / j;
        float f2 = (float) i;
        if (f <= f2) {
            return j;
        }
        return ((float) Math.round(f / f2)) * j;
    }

    /* renamed from: k0 */
    private boolean m47438k0(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f48331G))).divide(new BigDecimal(Float.toString(this.f48336L)), MathContext.DECIMAL64).doubleValue();
        double round = (double) Math.round(doubleValue);
        Double.isNaN(round);
        return Math.abs(round - doubleValue) < 1.0E-4d;
    }

    /* renamed from: l */
    private int m47439l() {
        int i = this.f48374y;
        int i2 = 0;
        if (this.f48371v == 1) {
            i2 = this.f48358l.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    private float m47440l0(float f) {
        return (m47406N(f) * ((float) this.f48339O)) + ((float) this.f48373x);
    }

    /* renamed from: m */
    private ValueAnimator m47441m(boolean z) {
        float f = 0.0f;
        float z2 = m47455z(z ? this.f48366q : this.f48365p, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{z2, f});
        ofFloat.setDuration(z ? 83 : 117);
        ofFloat.setInterpolator(z ? C10493a.f49012e : C10493a.f49010c);
        ofFloat.addUpdateListener(new C10276b());
        return ofFloat;
    }

    /* renamed from: m0 */
    private void m47442m0() {
        float f = this.f48336L;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(f48323o0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.f48331G;
            if (((float) ((int) f2)) != f2) {
                Log.w(f48323o0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.f48332H;
            if (((float) ((int) f3)) != f3) {
                Log.w(f48323o0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    /* renamed from: n */
    private void m47443n() {
        if (this.f48358l.size() > this.f48333I.size()) {
            List<C10966a> subList = this.f48358l.subList(this.f48333I.size(), this.f48358l.size());
            for (C10966a next : subList) {
                if (C5723u.m25293S(this)) {
                    m47444o(next);
                }
            }
            subList.clear();
        }
        while (this.f48358l.size() < this.f48333I.size()) {
            C10966a a = this.f48357k.mo41347a();
            this.f48358l.add(a);
            if (C5723u.m25293S(this)) {
                m47431h(a);
            }
        }
        int i = 1;
        if (this.f48358l.size() == 1) {
            i = 0;
        }
        for (C10966a m0 : this.f48358l) {
            m0.mo43109m0((float) i);
        }
    }

    /* renamed from: o */
    private void m47444o(C10966a aVar) {
        C10226r e = C10227s.m47137e(this);
        if (e != null) {
            e.mo41001b(aVar);
            aVar.mo43265w0(C10227s.m47136d(this));
        }
    }

    /* renamed from: p */
    private float m47445p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.f48373x)) / ((float) this.f48339O);
        float f3 = this.f48331G;
        return (f2 * (f3 - this.f48332H)) + f3;
    }

    /* renamed from: q */
    private void m47446q(int i) {
        for (L a : this.f48360m) {
            a.mo41361a(this, this.f48333I.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f48355i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m47413V(i);
        }
    }

    /* renamed from: r */
    private void m47447r() {
        for (L l : this.f48360m) {
            Iterator<Float> it = this.f48333I.iterator();
            while (it.hasNext()) {
                l.mo41361a(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: s */
    private void m47448s(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f48373x;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (activeRange[0] * f), f2, ((float) i3) + (activeRange[1] * f), f2, this.f48349c);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f48333I.size() != arrayList.size() || !this.f48333I.equals(arrayList)) {
                this.f48333I = arrayList;
                this.f48342R = true;
                this.f48335K = 0;
                m47424d0();
                m47443n();
                m47447r();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: t */
    private void m47449t(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f48373x;
        float f = (float) i;
        float f2 = ((float) i3) + (activeRange[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f48348b);
        }
        int i4 = this.f48373x;
        float f4 = ((float) i4) + (activeRange[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f48348b);
        }
    }

    /* renamed from: u */
    private void m47450u(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f48333I.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f48373x) + (m47406N(it.next().floatValue()) * ((float) i)), (float) i2, (float) this.f48375z, this.f48350d);
            }
        }
        Iterator<Float> it2 = this.f48333I.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int N = this.f48373x + ((int) (m47406N(it2.next().floatValue()) * ((float) i)));
            int i3 = this.f48375z;
            canvas.translate((float) (N - i3), (float) (i2 - i3));
            this.f48359l0.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: v */
    private void m47451v() {
        if (this.f48371v != 2) {
            if (!this.f48364o) {
                this.f48364o = true;
                ValueAnimator m = m47441m(true);
                this.f48365p = m;
                this.f48366q = null;
                m.start();
            }
            Iterator<C10966a> it = this.f48358l.iterator();
            for (int i = 0; i < this.f48333I.size() && it.hasNext(); i++) {
                if (i != this.f48335K) {
                    m47414W(it.next(), this.f48333I.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                m47414W(it.next(), this.f48333I.get(this.f48335K).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f48358l.size()), Integer.valueOf(this.f48333I.size())}));
            }
        }
    }

    /* renamed from: w */
    private void m47452w() {
        if (this.f48364o) {
            this.f48364o = false;
            ValueAnimator m = m47441m(false);
            this.f48366q = m;
            this.f48365p = null;
            m.addListener(new C10277c());
            this.f48366q.start();
        }
    }

    /* renamed from: x */
    private void m47453x(int i) {
        if (i == 1) {
            m47404L(Integer.MAX_VALUE);
        } else if (i == 2) {
            m47404L(Integer.MIN_VALUE);
        } else if (i == 17) {
            m47405M(Integer.MAX_VALUE);
        } else if (i == 66) {
            m47405M(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public String m47454y(float f) {
        if (mo41267C()) {
            return this.f48329E.mo41364a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    /* renamed from: z */
    private static float m47455z(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    /* renamed from: C */
    public boolean mo41267C() {
        return this.f48329E != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo41268F() {
        return C5723u.m25265B(this) == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public boolean mo41269S() {
        if (this.f48334J != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float l0 = m47440l0(valueOfTouchPositionAbsolute);
        this.f48334J = 0;
        float abs = Math.abs(this.f48333I.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f48333I.size(); i++) {
            float abs2 = Math.abs(this.f48333I.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float l02 = m47440l0(this.f48333I.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !mo41268F() ? l02 - l0 < 0.0f : l02 - l0 > 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.f48334J = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(l02 - l0) < ((float) this.f48367r)) {
                    this.f48334J = -1;
                    return false;
                } else if (z) {
                    this.f48334J = i;
                }
            }
            abs = abs2;
        }
        if (this.f48334J != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo41270c0(int i, Rect rect) {
        int N = this.f48373x + ((int) (m47406N(getValues().get(i).floatValue()) * ((float) this.f48339O)));
        int l = m47439l();
        int i2 = this.f48375z;
        rect.set(N - i2, l - i2, N + i2, l + i2);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f48354h.mo22935v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f48348b.setColor(m47396B(this.f48347W));
        this.f48349c.setColor(m47396B(this.f48346V));
        this.f48352f.setColor(m47396B(this.f48345U));
        this.f48353g.setColor(m47396B(this.f48344T));
        for (C10966a next : this.f48358l) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f48359l0.isStateful()) {
            this.f48359l0.setState(getDrawableState());
        }
        this.f48351e.setColor(m47396B(this.f48343S));
        this.f48351e.setAlpha(63);
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f48354h.mo22937x();
    }

    public int getActiveThumbIndex() {
        return this.f48334J;
    }

    public int getFocusedThumbIndex() {
        return this.f48335K;
    }

    public int getHaloRadius() {
        return this.f48325A;
    }

    public ColorStateList getHaloTintList() {
        return this.f48343S;
    }

    public int getLabelBehavior() {
        return this.f48371v;
    }

    /* access modifiers changed from: protected */
    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f48336L;
    }

    public float getThumbElevation() {
        return this.f48359l0.mo43116w();
    }

    public int getThumbRadius() {
        return this.f48375z;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f48359l0.mo43077E();
    }

    public float getThumbStrokeWidth() {
        return this.f48359l0.mo43078G();
    }

    public ColorStateList getThumbTintList() {
        return this.f48359l0.mo43117x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.f48344T;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f48345U;
    }

    public ColorStateList getTickTintList() {
        if (this.f48345U.equals(this.f48344T)) {
            return this.f48344T;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f48346V;
    }

    public int getTrackHeight() {
        return this.f48372w;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f48347W;
    }

    public int getTrackSidePadding() {
        return this.f48373x;
    }

    public ColorStateList getTrackTintList() {
        if (this.f48347W.equals(this.f48346V)) {
            return this.f48346V;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f48339O;
    }

    public float getValueFrom() {
        return this.f48331G;
    }

    public float getValueTo() {
        return this.f48332H;
    }

    /* access modifiers changed from: package-private */
    public List<Float> getValues() {
        return new ArrayList(this.f48333I);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C10966a h : this.f48358l) {
            m47431h(h);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f48356j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f48364o = false;
        for (C10966a o : this.f48358l) {
            m47444o(o);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f48342R) {
            m47428f0();
            m47400H();
        }
        super.onDraw(canvas);
        int l = m47439l();
        m47449t(canvas, this.f48339O, l);
        if (((Float) Collections.max(getValues())).floatValue() > this.f48331G) {
            m47448s(canvas, this.f48339O, l);
        }
        m47402J(canvas);
        if ((this.f48330F || isFocused()) && isEnabled()) {
            m47401I(canvas, this.f48339O, l);
            if (this.f48334J != -1) {
                m47451v();
            }
        }
        m47450u(canvas, this.f48339O, l);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f48334J = -1;
            m47452w();
            this.f48354h.mo22934o(this.f48335K);
            return;
        }
        m47453x(i);
        this.f48354h.mo22932V(this.f48335K);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f48333I.size() == 1) {
            this.f48334J = 0;
        }
        if (this.f48334J == -1) {
            Boolean O = m47407O(i, keyEvent);
            return O != null ? O.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f48341Q |= keyEvent.isLongPress();
        Float i2 = m47433i(i);
        if (i2 != null) {
            if (m47416Y(this.f48333I.get(this.f48334J).floatValue() + i2.floatValue())) {
                m47424d0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m47404L(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return m47404L(-1);
                }
                return false;
            }
        }
        this.f48334J = -1;
        m47452w();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f48341Q = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f48370u;
        int i4 = 0;
        if (this.f48371v == 1) {
            i4 = this.f48358l.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f48331G = sliderState.f48376b;
        this.f48332H = sliderState.f48377c;
        setValuesInternal(sliderState.f48378d);
        this.f48336L = sliderState.f48379e;
        if (sliderState.f48380f) {
            requestFocus();
        }
        m47447r();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f48376b = this.f48331G;
        sliderState.f48377c = this.f48332H;
        sliderState.f48378d = new ArrayList<>(this.f48333I);
        sliderState.f48379e = this.f48336L;
        sliderState.f48380f = hasFocus();
        return sliderState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m47426e0(i);
        m47424d0();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f48373x)) / ((float) this.f48339O);
        this.f48361m0 = f;
        float max = Math.max(0.0f, f);
        this.f48361m0 = max;
        this.f48361m0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f48327C = x;
            if (!m47398E()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo41269S()) {
                    requestFocus();
                    this.f48330F = true;
                    m47421b0();
                    m47424d0();
                    invalidate();
                    m47408P();
                }
            }
        } else if (actionMasked == 1) {
            this.f48330F = false;
            MotionEvent motionEvent2 = this.f48328D;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f48328D.getX() - motionEvent.getX()) <= ((float) this.f48367r) && Math.abs(this.f48328D.getY() - motionEvent.getY()) <= ((float) this.f48367r) && mo41269S()) {
                m47408P();
            }
            if (this.f48334J != -1) {
                m47421b0();
                this.f48334J = -1;
                m47409Q();
            }
            m47452w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f48330F) {
                if (m47398E() && Math.abs(x - this.f48327C) < ((float) this.f48367r)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m47408P();
            }
            if (mo41269S()) {
                this.f48330F = true;
                m47421b0();
                m47424d0();
                invalidate();
            }
        }
        setPressed(this.f48330F);
        this.f48328D = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.f48334J = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f48333I.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f48335K = i;
        this.f48354h.mo22932V(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.f48325A) {
            this.f48325A = i;
            Drawable background = getBackground();
            if (m47415X() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                C10579a.m48323a((RippleDrawable) background, this.f48325A);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48343S)) {
            this.f48343S = colorStateList;
            Drawable background = getBackground();
            if (m47415X() || !(background instanceof RippleDrawable)) {
                this.f48351e.setColor(m47396B(colorStateList));
                this.f48351e.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f48371v != i) {
            this.f48371v = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(C10285c cVar) {
        this.f48329E = cVar;
    }

    /* access modifiers changed from: protected */
    public void setSeparationUnit(int i) {
        this.f48363n0 = i;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(f), Float.toString(this.f48331G), Float.toString(this.f48332H)}));
        } else if (this.f48336L != f) {
            this.f48336L = f;
            this.f48342R = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f48359l0.mo43090Z(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.f48375z) {
            this.f48375z = i;
            m47403K();
            this.f48359l0.setShapeAppearanceModel(C10897m.m48992a().mo43157q(0, (float) this.f48375z).mo43154m());
            C10889h hVar = this.f48359l0;
            int i2 = this.f48375z;
            hVar.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f48359l0.mo43108l0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C5264a.m23788c(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f48359l0.mo43109m0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48359l0.mo43117x())) {
            this.f48359l0.mo43091a0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48344T)) {
            this.f48344T = colorStateList;
            this.f48353g.setColor(m47396B(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48345U)) {
            this.f48345U = colorStateList;
            this.f48352f.setColor(m47396B(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f48338N != z) {
            this.f48338N = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48346V)) {
            this.f48346V = colorStateList;
            this.f48349c.setColor(m47396B(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.f48372w != i) {
            this.f48372w = i;
            m47397D();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f48347W)) {
            this.f48347W = colorStateList;
            this.f48348b.setColor(m47396B(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f48331G = f;
        this.f48342R = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f48332H = f;
        this.f48342R = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    private class C10278d implements Runnable {

        /* renamed from: b */
        int f48386b;

        private C10278d() {
            this.f48386b = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41350a(int i) {
            this.f48386b = i;
        }

        public void run() {
            BaseSlider.this.f48354h.mo22933W(this.f48386b, 4);
        }

        /* synthetic */ C10278d(BaseSlider baseSlider, C10275a aVar) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(C10962a.m49296c(context, attributeSet, i, f48324p0), attributeSet, i);
        this.f48358l = new ArrayList();
        this.f48360m = new ArrayList();
        this.f48362n = new ArrayList();
        this.f48364o = false;
        this.f48330F = false;
        this.f48333I = new ArrayList<>();
        this.f48334J = -1;
        this.f48335K = -1;
        this.f48336L = 0.0f;
        this.f48338N = true;
        this.f48341Q = false;
        C10889h hVar = new C10889h();
        this.f48359l0 = hVar;
        this.f48363n0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f48348b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f48349c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f48350d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f48351e = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f48352f = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f48353g = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m47399G(context2.getResources());
        this.f48357k = new C10275a(attributeSet, i);
        m47412U(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        hVar.mo43103i0(2);
        this.f48367r = ViewConfiguration.get(context2).getScaledTouchSlop();
        C10279e eVar = new C10279e(this);
        this.f48354h = eVar;
        C5723u.m25330o0(this, eVar);
        this.f48355i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }
}
