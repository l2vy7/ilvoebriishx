package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.C0624k;
import p063d0.C5135a;
import p073f.C5238a;
import p073f.C5247j;
import p079g.C5264a;
import p094j.C5470a;
import p111m0.C5723u;

public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    private static final Property<SwitchCompat, Float> f1412O = new C0363a(Float.class, "thumbPos");

    /* renamed from: P */
    private static final int[] f1413P = {16842912};

    /* renamed from: A */
    private int f1414A;

    /* renamed from: B */
    private int f1415B;

    /* renamed from: C */
    private int f1416C;

    /* renamed from: D */
    private int f1417D;

    /* renamed from: E */
    private int f1418E;

    /* renamed from: F */
    private int f1419F;

    /* renamed from: G */
    private final TextPaint f1420G;

    /* renamed from: H */
    private ColorStateList f1421H;

    /* renamed from: I */
    private Layout f1422I;

    /* renamed from: J */
    private Layout f1423J;

    /* renamed from: K */
    private TransformationMethod f1424K;

    /* renamed from: L */
    ObjectAnimator f1425L;

    /* renamed from: M */
    private final C0399l f1426M;

    /* renamed from: N */
    private final Rect f1427N;

    /* renamed from: b */
    private Drawable f1428b;

    /* renamed from: c */
    private ColorStateList f1429c;

    /* renamed from: d */
    private PorterDuff.Mode f1430d;

    /* renamed from: e */
    private boolean f1431e;

    /* renamed from: f */
    private boolean f1432f;

    /* renamed from: g */
    private Drawable f1433g;

    /* renamed from: h */
    private ColorStateList f1434h;

    /* renamed from: i */
    private PorterDuff.Mode f1435i;

    /* renamed from: j */
    private boolean f1436j;

    /* renamed from: k */
    private boolean f1437k;

    /* renamed from: l */
    private int f1438l;

    /* renamed from: m */
    private int f1439m;

    /* renamed from: n */
    private int f1440n;

    /* renamed from: o */
    private boolean f1441o;

    /* renamed from: p */
    private CharSequence f1442p;

    /* renamed from: q */
    private CharSequence f1443q;

    /* renamed from: r */
    private boolean f1444r;

    /* renamed from: s */
    private int f1445s;

    /* renamed from: t */
    private int f1446t;

    /* renamed from: u */
    private float f1447u;

    /* renamed from: v */
    private float f1448v;

    /* renamed from: w */
    private VelocityTracker f1449w;

    /* renamed from: x */
    private int f1450x;

    /* renamed from: y */
    float f1451y;

    /* renamed from: z */
    private int f1452z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0363a extends Property<SwitchCompat, Float> {
        C0363a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1451y);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22801O);
    }

    /* renamed from: a */
    private void m1862a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1412O, new float[]{z ? 1.0f : 0.0f});
        this.f1425L = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1425L.setAutoCancel(true);
        }
        this.f1425L.start();
    }

    /* renamed from: b */
    private void m1863b() {
        Drawable drawable = this.f1428b;
        if (drawable == null) {
            return;
        }
        if (this.f1431e || this.f1432f) {
            Drawable mutate = C5135a.m23418r(drawable).mutate();
            this.f1428b = mutate;
            if (this.f1431e) {
                C5135a.m23415o(mutate, this.f1429c);
            }
            if (this.f1432f) {
                C5135a.m23416p(this.f1428b, this.f1430d);
            }
            if (this.f1428b.isStateful()) {
                this.f1428b.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1864c() {
        Drawable drawable = this.f1433g;
        if (drawable == null) {
            return;
        }
        if (this.f1436j || this.f1437k) {
            Drawable mutate = C5135a.m23418r(drawable).mutate();
            this.f1433g = mutate;
            if (this.f1436j) {
                C5135a.m23415o(mutate, this.f1434h);
            }
            if (this.f1437k) {
                C5135a.m23416p(this.f1433g, this.f1435i);
            }
            if (this.f1433g.isStateful()) {
                this.f1433g.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m1865d() {
        ObjectAnimator objectAnimator = this.f1425L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m1866e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m1867f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m1868g(float f, float f2) {
        if (this.f1428b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1428b.getPadding(this.f1427N);
        int i = this.f1417D;
        int i2 = this.f1446t;
        int i3 = i - i2;
        int i4 = (this.f1416C + thumbOffset) - i2;
        Rect rect = this.f1427N;
        int i5 = this.f1415B + i4 + rect.left + rect.right + i2;
        int i6 = this.f1419F + i2;
        if (f <= ((float) i4) || f >= ((float) i5) || f2 <= ((float) i3) || f2 >= ((float) i6)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.f1451y > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0401l0.m2125b(this)) {
            f = 1.0f - this.f1451y;
        } else {
            f = this.f1451y;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1433g;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1427N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1428b;
        if (drawable2 != null) {
            rect = C0409p.m2200d(drawable2);
        } else {
            rect = C0409p.f1656c;
        }
        return ((((this.f1452z - this.f1415B) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: h */
    private Layout m1869h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1424K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1420G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m1870k(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        mo1901j(typeface, i2);
    }

    /* renamed from: l */
    private void m1871l(MotionEvent motionEvent) {
        this.f1445s = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1449w.computeCurrentVelocity(1000);
            float xVelocity = this.f1449w.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1450x)) {
                z = getTargetCheckedState();
            } else if (!C0401l0.m2125b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1866e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1427N;
        int i3 = this.f1416C;
        int i4 = this.f1417D;
        int i5 = this.f1418E;
        int i6 = this.f1419F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1428b;
        if (drawable != null) {
            rect = C0409p.m2200d(drawable);
        } else {
            rect = C0409p.f1656c;
        }
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1433g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1433g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1428b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f1415B + rect2.right;
            this.f1428b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C5135a.m23412l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1428b;
        if (drawable != null) {
            C5135a.m23411k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null) {
            C5135a.m23411k(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1428b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0401l0.m2125b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1452z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1440n : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0401l0.m2125b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1452z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1440n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1444r;
    }

    public boolean getSplitTrack() {
        return this.f1441o;
    }

    public int getSwitchMinWidth() {
        return this.f1439m;
    }

    public int getSwitchPadding() {
        return this.f1440n;
    }

    public CharSequence getTextOff() {
        return this.f1443q;
    }

    public CharSequence getTextOn() {
        return this.f1442p;
    }

    public Drawable getThumbDrawable() {
        return this.f1428b;
    }

    public int getThumbTextPadding() {
        return this.f1438l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1429c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1430d;
    }

    public Drawable getTrackDrawable() {
        return this.f1433g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1434h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1435i;
    }

    /* renamed from: i */
    public void mo1900i(Context context, int i) {
        C0384f0 t = C0384f0.m1992t(context, i, C5247j.f23108Z2);
        ColorStateList c = t.mo2097c(C5247j.f23130d3);
        if (c != null) {
            this.f1421H = c;
        } else {
            this.f1421H = getTextColors();
        }
        int f = t.mo2100f(C5247j.f23114a3, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f1420G.getTextSize()) {
                this.f1420G.setTextSize(f2);
                requestLayout();
            }
        }
        m1870k(t.mo2105k(C5247j.f23120b3, -1), t.mo2105k(C5247j.f23125c3, -1));
        if (t.mo2095a(C5247j.f23165k3, false)) {
            this.f1424K = new C5470a(getContext());
        } else {
            this.f1424K = null;
        }
        t.mo2114w();
    }

    /* renamed from: j */
    public void mo1901j(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f1420G;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1420G;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1420G.setFakeBoldText(false);
        this.f1420G.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1428b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1425L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1425L.end();
            this.f1425L = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1413P);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1427N;
        Drawable drawable = this.f1433g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1417D;
        int i3 = this.f1419F;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1428b;
        if (drawable != null) {
            if (!this.f1441o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0409p.m2200d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1422I : this.f1423J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1421H;
            if (colorStateList != null) {
                this.f1420G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1420G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1442p : this.f1443q;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1428b != null) {
            Rect rect = this.f1427N;
            Drawable drawable = this.f1433g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0409p.m2200d(this.f1428b);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0401l0.m2125b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1452z + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1452z) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1414A;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1414A;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1414A;
            this.f1416C = i7;
            this.f1417D = i9;
            this.f1419F = i8;
            this.f1418E = i6;
        }
        i8 = i10 + i9;
        this.f1416C = i7;
        this.f1417D = i9;
        this.f1419F = i8;
        this.f1418E = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1444r) {
            if (this.f1422I == null) {
                this.f1422I = m1869h(this.f1442p);
            }
            if (this.f1423J == null) {
                this.f1423J = m1869h(this.f1443q);
            }
        }
        Rect rect = this.f1427N;
        Drawable drawable = this.f1428b;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1428b.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1428b.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1415B = Math.max(this.f1444r ? Math.max(this.f1422I.getWidth(), this.f1423J.getWidth()) + (this.f1438l * 2) : 0, i4);
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1433g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1428b;
        if (drawable3 != null) {
            Rect d = C0409p.m2200d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1439m, (this.f1415B * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1452z = max;
        this.f1414A = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1442p : this.f1443q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1449w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1445s
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1447u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0401l0.m2125b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1451y
            float r0 = r0 + r2
            float r0 = m1867f(r0, r4, r3)
            float r2 = r6.f1451y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1447u = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1447u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1446t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1448v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1446t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1445s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1447u = r0
            r6.f1448v = r3
            return r1
        L_0x008b:
            int r0 = r6.f1445s
            if (r0 != r2) goto L_0x0096
            r6.m1871l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1445s = r0
            android.view.VelocityTracker r0 = r6.f1449w
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m1868g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1445s = r1
            r6.f1447u = r0
            r6.f1448v = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C5723u.m25294T(this)) {
            m1865d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1862a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0624k.m3469s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1444r != z) {
            this.f1444r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1441o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1439m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1440n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1420G.getTypeface() != null && !this.f1420G.getTypeface().equals(typeface)) || (this.f1420G.getTypeface() == null && typeface != null)) {
            this.f1420G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1443q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1442p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1428b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1428b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1451y = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C5264a.m23789d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1438l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1429c = colorStateList;
        this.f1431e = true;
        m1863b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1430d = mode;
        this.f1432f = true;
        m1863b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1433g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1433g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C5264a.m23789d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1434h = colorStateList;
        this.f1436j = true;
        m1864c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1435i = mode;
        this.f1437k = true;
        m1864c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1428b || drawable == this.f1433g;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1429c = null;
        this.f1430d = null;
        this.f1431e = false;
        this.f1432f = false;
        this.f1434h = null;
        this.f1435i = null;
        this.f1436j = false;
        this.f1437k = false;
        this.f1449w = VelocityTracker.obtain();
        this.f1427N = new Rect();
        C0373a0.m1942a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1420G = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C5247j.f23033K2;
        C0384f0 v = C0384f0.m1994v(context, attributeSet, iArr, i, 0);
        C5723u.m25326m0(this, context, iArr, attributeSet, v.mo2112r(), i, 0);
        Drawable g = v.mo2101g(C5247j.f23048N2);
        this.f1428b = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo2101g(C5247j.f23093W2);
        this.f1433g = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.f1442p = v.mo2110p(C5247j.f23038L2);
        this.f1443q = v.mo2110p(C5247j.f23043M2);
        this.f1444r = v.mo2095a(C5247j.f23053O2, true);
        this.f1438l = v.mo2100f(C5247j.f23078T2, 0);
        this.f1439m = v.mo2100f(C5247j.f23063Q2, 0);
        this.f1440n = v.mo2100f(C5247j.f23068R2, 0);
        this.f1441o = v.mo2095a(C5247j.f23058P2, false);
        ColorStateList c = v.mo2097c(C5247j.f23083U2);
        if (c != null) {
            this.f1429c = c;
            this.f1431e = true;
        }
        PorterDuff.Mode e = C0409p.m2201e(v.mo2105k(C5247j.f23088V2, -1), (PorterDuff.Mode) null);
        if (this.f1430d != e) {
            this.f1430d = e;
            this.f1432f = true;
        }
        if (this.f1431e || this.f1432f) {
            m1863b();
        }
        ColorStateList c2 = v.mo2097c(C5247j.f23098X2);
        if (c2 != null) {
            this.f1434h = c2;
            this.f1436j = true;
        }
        PorterDuff.Mode e2 = C0409p.m2201e(v.mo2105k(C5247j.f23103Y2, -1), (PorterDuff.Mode) null);
        if (this.f1435i != e2) {
            this.f1435i = e2;
            this.f1437k = true;
        }
        if (this.f1436j || this.f1437k) {
            m1864c();
        }
        int n = v.mo2108n(C5247j.f23073S2, 0);
        if (n != 0) {
            mo1900i(context, n);
        }
        C0399l lVar = new C0399l(this);
        this.f1426M = lVar;
        lVar.mo2194m(attributeSet, i);
        v.mo2114w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1446t = viewConfiguration.getScaledTouchSlop();
        this.f1450x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
