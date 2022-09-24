package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6522b;
import p193c6.C6531k;

public class ChipGroup extends FlowLayout {

    /* renamed from: o */
    private static final int f47535o = C6531k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: f */
    private int f47536f;

    /* renamed from: g */
    private int f47537g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f47538h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f47539i;

    /* renamed from: j */
    private C10072c f47540j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C10071b f47541k;

    /* renamed from: l */
    private C10073d f47542l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f47543m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f47544n;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C10071b implements CompoundButton.OnCheckedChangeListener {
        private C10071b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f47544n) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f47539i) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f47543m == -1 || ChipGroup.this.f47543m == id || !ChipGroup.this.f47538h)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m46222r(chipGroup.f47543m, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f47543m == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m46222r(compoundButton.getId(), true);
                    ChipGroup.this.m46221q(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C10072c {
        /* renamed from: a */
        void mo40214a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    private class C10073d implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f47546b;

        private C10073d() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C5723u.m25321k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo40189m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f47541k);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f47546b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f47546b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m46221q(int i, boolean z) {
        this.f47543m = i;
        C10072c cVar = this.f47540j;
        if (cVar != null && this.f47538h && z) {
            cVar.mo40214a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m46222r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f47544n = true;
            ((Chip) findViewById).setChecked(z);
            this.f47544n = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m46221q(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f47543m;
                if (i2 != -1 && this.f47538h) {
                    m46222r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo40180c() {
        return super.mo40180c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f47538h) {
            return this.f47543m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f47538h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f47536f;
    }

    public int getChipSpacingVertical() {
        return this.f47537g;
    }

    /* renamed from: m */
    public void mo40189m(int i) {
        int i2 = this.f47543m;
        if (i != i2) {
            if (i2 != -1 && this.f47538h) {
                m46222r(i2, false);
            }
            if (i != -1) {
                m46222r(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: n */
    public void mo40190n() {
        this.f47544n = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f47544n = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo40191o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f47543m;
        if (i != -1) {
            m46222r(i, true);
            setCheckedId(this.f47543m);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(getRowCount(), mo40180c() ? getChipCount() : -1, false, mo40194p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean mo40194p() {
        return this.f47538h;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f47536f != i) {
            this.f47536f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f47537g != i) {
            this.f47537g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C10072c cVar) {
        this.f47540j = cVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f47542l.f47546b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f47539i = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f47538h != z) {
            this.f47538h = z;
            mo40190n();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f47535o
            android.content.Context r8 = p245q6.C10962a.m49296c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f47541k = r8
            com.google.android.material.chip.ChipGroup$d r8 = new com.google.android.material.chip.ChipGroup$d
            r8.<init>()
            r7.f47542l = r8
            r8 = -1
            r7.f47543m = r8
            r6 = 0
            r7.f47544n = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p193c6.C6532l.f27088s1
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r10 = p193c6.C6532l.f27110u1
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p193c6.C6532l.f27121v1
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p193c6.C6532l.f27132w1
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p193c6.C6532l.f27154y1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = p193c6.C6532l.f27165z1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = p193c6.C6532l.f27143x1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p193c6.C6532l.f27099t1
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f47543m = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$d r8 = r7.f47542l
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            p110m0.C5723u.m25350y0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
