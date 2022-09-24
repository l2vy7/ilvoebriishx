package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
/* compiled from: AnimateLayoutChangeDetector */
final class C1405a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f6239b;

    /* renamed from: a */
    private LinearLayoutManager f6240a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    /* compiled from: AnimateLayoutChangeDetector */
    class C1406a implements Comparator<int[]> {
        C1406a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f6239b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C1405a(LinearLayoutManager linearLayoutManager) {
        this.f6240a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m7472a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int J = this.f6240a.mo5419J();
        if (J == 0) {
            return true;
        }
        boolean z = this.f6240a.mo5034l2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = J;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < J) {
            View I = this.f6240a.mo5418I(i5);
            if (I != null) {
                ViewGroup.LayoutParams layoutParams = I.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f6239b;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = I.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = I.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = I.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = I.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C1406a());
        for (int i6 = 1; i6 < J; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int i7 = iArr2[0][1] - iArr2[0][0];
        if (iArr2[0][0] > 0 || iArr2[J - 1][1] < i7) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m7473b() {
        int J = this.f6240a.mo5419J();
        for (int i = 0; i < J; i++) {
            if (m7474c(this.f6240a.mo5418I(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m7474c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m7474c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6789d() {
        if ((!m7472a() || this.f6240a.mo5419J() <= 1) && m7473b()) {
            return true;
        }
        return false;
    }
}
