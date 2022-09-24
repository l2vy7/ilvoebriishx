package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p111m1.C5745a;
import p111m1.C5746b;

public class Explode extends Visibility {

    /* renamed from: O */
    private static final TimeInterpolator f5756O = new DecelerateInterpolator();

    /* renamed from: P */
    private static final TimeInterpolator f5757P = new AccelerateInterpolator();

    /* renamed from: N */
    private int[] f5758N = new int[2];

    public Explode() {
        mo6259s0(new C5745a());
    }

    /* renamed from: E0 */
    private static float m6842E0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: F0 */
    private static float m6843F0(View view, int i, int i2) {
        return m6842E0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: G0 */
    private void m6844G0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f5758N);
        int[] iArr2 = this.f5758N;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect H = mo6224H();
        if (H == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = H.centerX();
            i = H.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float E0 = m6842E0(centerX2, centerY);
        float F0 = m6843F0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / E0) * F0);
        iArr[1] = Math.round(F0 * (centerY / E0));
    }

    /* renamed from: w0 */
    private void m6845w0(C1336u uVar) {
        View view = uVar.f5950b;
        view.getLocationOnScreen(this.f5758N);
        int[] iArr = this.f5758N;
        int i = iArr[0];
        int i2 = iArr[1];
        uVar.f5949a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: B0 */
    public Animator mo6214B0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        float f;
        float f2;
        if (uVar == null) {
            return null;
        }
        Rect rect = (Rect) uVar.f5949a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) uVar.f5950b.getTag(C5746b.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m6844G0(viewGroup, rect, this.f5758N);
        int[] iArr2 = this.f5758N;
        return C1338w.m7143a(view, uVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f5757P, this);
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        super.mo6152k(uVar);
        m6845w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        super.mo6153n(uVar);
        m6845w0(uVar);
    }

    /* renamed from: z0 */
    public Animator mo6215z0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        if (uVar2 == null) {
            return null;
        }
        Rect rect = (Rect) uVar2.f5949a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m6844G0(viewGroup, rect, this.f5758N);
        int[] iArr = this.f5758N;
        return C1338w.m7143a(view, uVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f5756O, this);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6259s0(new C5745a());
    }
}
