package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import p072f.C5241d;
import p072f.C5243f;
import p072f.C5244g;
import p072f.C5246i;

/* renamed from: androidx.appcompat.widget.j0 */
/* compiled from: TooltipPopup */
class C0396j0 {

    /* renamed from: a */
    private final Context f1611a;

    /* renamed from: b */
    private final View f1612b;

    /* renamed from: c */
    private final TextView f1613c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1614d;

    /* renamed from: e */
    private final Rect f1615e = new Rect();

    /* renamed from: f */
    private final int[] f1616f = new int[2];

    /* renamed from: g */
    private final int[] f1617g = new int[2];

    C0396j0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1614d = layoutParams;
        this.f1611a = context;
        View inflate = LayoutInflater.from(context).inflate(C5244g.f22960u, (ViewGroup) null);
        this.f1612b = inflate;
        this.f1613c = (TextView) inflate.findViewById(C5243f.f22938y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C5246i.f22975a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m2084a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1611a.getResources().getDimensionPixelOffset(C5241d.f22849m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1611a.getResources().getDimensionPixelOffset(C5241d.f22848l);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1611a.getResources().getDimensionPixelOffset(z ? C5241d.f22851o : C5241d.f22850n);
        View b = m2085b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1615e);
        Rect rect = this.f1615e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1611a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1615e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1617g);
        view.getLocationOnScreen(this.f1616f);
        int[] iArr = this.f1616f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1617g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1612b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1612b.getMeasuredHeight();
        int[] iArr3 = this.f1616f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1615e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m2085b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2177c() {
        if (mo2178d()) {
            ((WindowManager) this.f1611a.getSystemService("window")).removeView(this.f1612b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2178d() {
        return this.f1612b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2179e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2178d()) {
            mo2177c();
        }
        this.f1613c.setText(charSequence);
        m2084a(view, i, i2, z, this.f1614d);
        ((WindowManager) this.f1611a.getSystemService("window")).addView(this.f1612b, this.f1614d);
    }
}
