package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {

    /* renamed from: L */
    private static final String[] f5725L = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: w0 */
    private void m6813w0(C1336u uVar) {
        uVar.f5949a.put("android:changeScroll:x", Integer.valueOf(uVar.f5950b.getScrollX()));
        uVar.f5949a.put("android:changeScroll:y", Integer.valueOf(uVar.f5950b.getScrollY()));
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return f5725L;
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m6813w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m6813w0(uVar);
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (uVar == null || uVar2 == null) {
            return null;
        }
        View view = uVar2.f5950b;
        int intValue = ((Integer) uVar.f5949a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) uVar2.f5949a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) uVar.f5949a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) uVar2.f5949a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C1334t.m7141c(objectAnimator, objectAnimator2);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
