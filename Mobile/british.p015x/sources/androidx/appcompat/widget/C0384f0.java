package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p010b0.C1523f;
import p079g.C5264a;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: TintTypedArray */
public class C0384f0 {

    /* renamed from: a */
    private final Context f1560a;

    /* renamed from: b */
    private final TypedArray f1561b;

    /* renamed from: c */
    private TypedValue f1562c;

    private C0384f0(Context context, TypedArray typedArray) {
        this.f1560a = context;
        this.f1561b = typedArray;
    }

    /* renamed from: t */
    public static C0384f0 m1992t(Context context, int i, int[] iArr) {
        return new C0384f0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0384f0 m1993u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0384f0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0384f0 m1994v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0384f0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo2095a(int i, boolean z) {
        return this.f1561b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo2096b(int i, int i2) {
        return this.f1561b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo2097c(int i) {
        int resourceId;
        ColorStateList c;
        if (!this.f1561b.hasValue(i) || (resourceId = this.f1561b.getResourceId(i, 0)) == 0 || (c = C5264a.m23788c(this.f1560a, resourceId)) == null) {
            return this.f1561b.getColorStateList(i);
        }
        return c;
    }

    /* renamed from: d */
    public float mo2098d(int i, float f) {
        return this.f1561b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo2099e(int i, int i2) {
        return this.f1561b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo2100f(int i, int i2) {
        return this.f1561b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo2101g(int i) {
        int resourceId;
        if (!this.f1561b.hasValue(i) || (resourceId = this.f1561b.getResourceId(i, 0)) == 0) {
            return this.f1561b.getDrawable(i);
        }
        return C5264a.m23789d(this.f1560a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo2102h(int i) {
        int resourceId;
        if (!this.f1561b.hasValue(i) || (resourceId = this.f1561b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0382f.m1971b().mo2087d(this.f1560a, resourceId, true);
    }

    /* renamed from: i */
    public float mo2103i(int i, float f) {
        return this.f1561b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo2104j(int i, int i2, C1523f.C1526c cVar) {
        int resourceId = this.f1561b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1562c == null) {
            this.f1562c = new TypedValue();
        }
        return C1523f.m7888g(this.f1560a, resourceId, this.f1562c, i2, cVar);
    }

    /* renamed from: k */
    public int mo2105k(int i, int i2) {
        return this.f1561b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo2106l(int i, int i2) {
        return this.f1561b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo2107m(int i, int i2) {
        return this.f1561b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo2108n(int i, int i2) {
        return this.f1561b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo2109o(int i) {
        return this.f1561b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo2110p(int i) {
        return this.f1561b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo2111q(int i) {
        return this.f1561b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo2112r() {
        return this.f1561b;
    }

    /* renamed from: s */
    public boolean mo2113s(int i) {
        return this.f1561b.hasValue(i);
    }

    /* renamed from: w */
    public void mo2114w() {
        this.f1561b.recycle();
    }
}
