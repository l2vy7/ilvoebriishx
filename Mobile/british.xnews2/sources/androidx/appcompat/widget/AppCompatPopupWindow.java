package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0623j;
import p072f.C5247j;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1223b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1224a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1704a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m1704a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0384f0 v = C0384f0.m1994v(context, attributeSet, C5247j.f23129d2, i, i2);
        int i3 = C5247j.f23139f2;
        if (v.mo2113s(i3)) {
            m1705b(v.mo2095a(i3, false));
        }
        setBackgroundDrawable(v.mo2101g(C5247j.f23134e2));
        v.mo2114w();
    }

    /* renamed from: b */
    private void m1705b(boolean z) {
        if (f1223b) {
            this.f1224a = z;
        } else {
            C0623j.m3448a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1223b && this.f1224a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1223b && this.f1224a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1704a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1223b && this.f1224a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
