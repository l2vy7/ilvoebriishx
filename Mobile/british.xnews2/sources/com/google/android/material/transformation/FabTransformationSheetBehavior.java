package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p110m0.C5723u;
import p193c6.C6521a;
import p199d6.C10500h;
import p199d6.C10502j;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f48801i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m47922g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f48801i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0581e) && (((CoordinatorLayout.C0581e) childAt.getLayoutParams()).mo3035f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f48801i;
                        if (map != null && map.containsKey(childAt)) {
                            C5723u.m25350y0(childAt, this.f48801i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f48801i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C5723u.m25350y0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f48801i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo41810H(View view, View view2, boolean z, boolean z2) {
        m47922g0(view2, z);
        return super.mo41810H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public FabTransformationBehavior.C10380e mo41814e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C6521a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C6521a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C10380e eVar = new FabTransformationBehavior.C10380e();
        eVar.f48794a = C10500h.m48214d(context, i);
        eVar.f48795b = new C10502j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
