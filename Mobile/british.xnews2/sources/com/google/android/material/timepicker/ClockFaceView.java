package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p078g.C5264a;
import p110m0.C5682a;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6522b;
import p193c6.C6523c;
import p193c6.C6524d;
import p193c6.C6526f;
import p193c6.C6528h;
import p193c6.C6531k;
import p193c6.C6532l;
import p232m6.C10805c;

class ClockFaceView extends RadialViewGroup implements ClockHandView.C10363d {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ClockHandView f48709B;

    /* renamed from: C */
    private final Rect f48710C;

    /* renamed from: D */
    private final RectF f48711D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final SparseArray<TextView> f48712E;

    /* renamed from: F */
    private final C5682a f48713F;

    /* renamed from: G */
    private final int[] f48714G;

    /* renamed from: H */
    private final float[] f48715H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final int f48716I;

    /* renamed from: J */
    private final int f48717J;

    /* renamed from: K */
    private final int f48718K;

    /* renamed from: L */
    private final int f48719L;

    /* renamed from: M */
    private String[] f48720M;

    /* renamed from: N */
    private float f48721N;

    /* renamed from: O */
    private final ColorStateList f48722O;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class C10358a implements ViewTreeObserver.OnPreDrawListener {
        C10358a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo41769B(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f48709B.mo41777g()) - ClockFaceView.this.f48716I);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C10359b extends C5682a {
        C10359b() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            int intValue = ((Integer) view.getTag(C6526f.material_value_index)).intValue();
            if (intValue > 0) {
                cVar.mo22603E0((View) ClockFaceView.this.f48712E.get(intValue - 1));
            }
            cVar.mo22633f0(C5771c.C5774c.m25623a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.materialClockStyle);
    }

    /* renamed from: I */
    private void m47839I() {
        RectF d = this.f48709B.mo41775d();
        for (int i = 0; i < this.f48712E.size(); i++) {
            TextView textView = this.f48712E.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f48710C);
                this.f48710C.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f48710C);
                this.f48711D.set(this.f48710C);
                textView.getPaint().setShader(m47840J(d, this.f48711D));
                textView.invalidate();
            }
        }
    }

    /* renamed from: J */
    private RadialGradient m47840J(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f48711D.left, rectF.centerY() - this.f48711D.top, rectF.width() * 0.5f, this.f48714G, this.f48715H, Shader.TileMode.CLAMP);
    }

    /* renamed from: K */
    private static float m47841K(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: M */
    private void m47842M(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f48712E.size();
        for (int i2 = 0; i2 < Math.max(this.f48720M.length, size); i2++) {
            TextView textView = this.f48712E.get(i2);
            if (i2 >= this.f48720M.length) {
                removeView(textView);
                this.f48712E.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C6528h.material_clockface_textview, this, false);
                    this.f48712E.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f48720M[i2]);
                textView.setTag(C6526f.material_value_index, Integer.valueOf(i2));
                C5723u.m25330o0(textView, this.f48713F);
                textView.setTextColor(this.f48722O);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f48720M[i2]}));
                }
            }
        }
    }

    /* renamed from: B */
    public void mo41769B(int i) {
        if (i != mo41787A()) {
            super.mo41769B(i);
            this.f48709B.mo41778j(mo41787A());
        }
    }

    /* renamed from: L */
    public void mo41770L(String[] strArr, int i) {
        this.f48720M = strArr;
        m47842M(i);
    }

    /* renamed from: a */
    public void mo41771a(float f, boolean z) {
        if (Math.abs(this.f48721N - f) > 0.001f) {
            this.f48721N = f;
            m47839I();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(1, this.f48720M.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m47839I();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int K = (int) (((float) this.f48719L) / m47841K(((float) this.f48717J) / ((float) displayMetrics.heightPixels), ((float) this.f48718K) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(K, 1073741824);
        setMeasuredDimension(K, K);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48710C = new Rect();
        this.f48711D = new RectF();
        this.f48712E = new SparseArray<>();
        this.f48715H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26655E1, i, C6531k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26677G1);
        this.f48722O = a;
        LayoutInflater.from(context).inflate(C6528h.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C6526f.material_clock_hand);
        this.f48709B = clockHandView;
        this.f48716I = resources.getDimensionPixelSize(C6524d.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f48714G = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo41774b(this);
        int defaultColor = C5264a.m23788c(context, C6523c.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26666F1);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C10358a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f48713F = new C10359b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo41770L(strArr, 0);
        this.f48717J = resources.getDimensionPixelSize(C6524d.material_time_picker_minimum_screen_height);
        this.f48718K = resources.getDimensionPixelSize(C6524d.material_time_picker_minimum_screen_width);
        this.f48719L = resources.getDimensionPixelSize(C6524d.material_clock_size);
    }
}
