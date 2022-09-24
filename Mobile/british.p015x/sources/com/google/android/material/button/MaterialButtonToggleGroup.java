package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C10227s;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p111m0.C5682a;
import p111m0.C5709g;
import p111m0.C5723u;
import p117n0.C5771c;
import p194c6.C6522b;
import p194c6.C6531k;
import p243p6.C10882a;
import p243p6.C10884c;
import p243p6.C10897m;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l */
    private static final String f47436l = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: m */
    private static final int f47437m = C6531k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: b */
    private final List<C10060d> f47438b;

    /* renamed from: c */
    private final C10059c f47439c;

    /* renamed from: d */
    private final C10062f f47440d;

    /* renamed from: e */
    private final LinkedHashSet<C10061e> f47441e;

    /* renamed from: f */
    private final Comparator<MaterialButton> f47442f;

    /* renamed from: g */
    private Integer[] f47443g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f47444h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f47445i;

    /* renamed from: j */
    private boolean f47446j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f47447k;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C10057a implements Comparator<MaterialButton> {
        C10057a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    class C10058b extends C5682a {
        C10058b() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22633f0(C5771c.C5774c.m25623a(0, 1, MaterialButtonToggleGroup.this.m46055n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    private class C10059c implements MaterialButton.C10055a {
        private C10059c() {
        }

        /* renamed from: a */
        public void mo39896a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.f47444h) {
                if (MaterialButtonToggleGroup.this.f47445i) {
                    int unused = MaterialButtonToggleGroup.this.f47447k = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.m46061u(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.m46053l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        /* synthetic */ C10059c(MaterialButtonToggleGroup materialButtonToggleGroup, C10057a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    private static class C10060d {

        /* renamed from: e */
        private static final C10884c f47451e = new C10882a(0.0f);

        /* renamed from: a */
        C10884c f47452a;

        /* renamed from: b */
        C10884c f47453b;

        /* renamed from: c */
        C10884c f47454c;

        /* renamed from: d */
        C10884c f47455d;

        C10060d(C10884c cVar, C10884c cVar2, C10884c cVar3, C10884c cVar4) {
            this.f47452a = cVar;
            this.f47453b = cVar3;
            this.f47454c = cVar4;
            this.f47455d = cVar2;
        }

        /* renamed from: a */
        public static C10060d m46070a(C10060d dVar) {
            C10884c cVar = f47451e;
            return new C10060d(cVar, dVar.f47455d, cVar, dVar.f47454c);
        }

        /* renamed from: b */
        public static C10060d m46071b(C10060d dVar, View view) {
            return C10227s.m47140h(view) ? m46072c(dVar) : m46073d(dVar);
        }

        /* renamed from: c */
        public static C10060d m46072c(C10060d dVar) {
            C10884c cVar = dVar.f47452a;
            C10884c cVar2 = dVar.f47455d;
            C10884c cVar3 = f47451e;
            return new C10060d(cVar, cVar2, cVar3, cVar3);
        }

        /* renamed from: d */
        public static C10060d m46073d(C10060d dVar) {
            C10884c cVar = f47451e;
            return new C10060d(cVar, cVar, dVar.f47453b, dVar.f47454c);
        }

        /* renamed from: e */
        public static C10060d m46074e(C10060d dVar, View view) {
            return C10227s.m47140h(view) ? m46073d(dVar) : m46072c(dVar);
        }

        /* renamed from: f */
        public static C10060d m46075f(C10060d dVar) {
            C10884c cVar = dVar.f47452a;
            C10884c cVar2 = f47451e;
            return new C10060d(cVar, cVar2, dVar.f47453b, cVar2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C10061e {
        /* renamed from: a */
        void mo39917a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    private class C10062f implements MaterialButton.C10056b {
        private C10062f() {
        }

        /* renamed from: a */
        public void mo39897a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C10062f(MaterialButtonToggleGroup materialButtonToggleGroup, C10057a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m46057p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m46057p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m46057p(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m46050h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton m = m46054m(i);
                int min = Math.min(m.getStrokeWidth(), m46054m(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams i2 = m46051i(m);
                if (getOrientation() == 0) {
                    C5709g.m25218c(i2, 0);
                    C5709g.m25219d(i2, -min);
                    i2.topMargin = 0;
                } else {
                    i2.bottomMargin = 0;
                    i2.topMargin = -min;
                    C5709g.m25219d(i2, 0);
                }
                m.setLayoutParams(i2);
            }
            m46058r(firstVisibleChildIndex);
        }
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m46051i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m46052j(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m46053l(int i, boolean z) {
        Iterator it = this.f47441e.iterator();
        while (it.hasNext()) {
            ((C10061e) it.next()).mo39917a(this, i, z);
        }
    }

    /* renamed from: m */
    private MaterialButton m46054m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public int m46055n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m46057p(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private C10060d m46056o(int i, int i2, int i3) {
        C10060d dVar = this.f47438b.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C10060d.m46074e(dVar, this) : C10060d.m46075f(dVar);
        }
        if (i == i3) {
            return z ? C10060d.m46071b(dVar, this) : C10060d.m46070a(dVar);
        }
        return null;
    }

    /* renamed from: p */
    private boolean m46057p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: r */
    private void m46058r(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m46054m(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C5709g.m25218c(layoutParams, 0);
            C5709g.m25219d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    private void m46059s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f47444h = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f47444h = false;
        }
    }

    private void setCheckedId(int i) {
        this.f47447k = i;
        m46053l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C5723u.m25321k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo39834a(this.f47439c);
        materialButton.setOnPressedChangeListenerInternal(this.f47440d);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private static void m46060t(C10897m.C10899b bVar, C10060d dVar) {
        if (dVar == null) {
            bVar.mo43155o(0.0f);
        } else {
            bVar.mo43149F(dVar.f47452a).mo43163w(dVar.f47455d).mo43153J(dVar.f47453b).mo43144A(dVar.f47454c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m46061u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f47446j || !checkedButtonIds.isEmpty()) {
            if (z && this.f47445i) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    m46059s(intValue2, false);
                    m46053l(intValue2, false);
                }
            }
            return true;
        }
        m46059s(i, true);
        this.f47447k = i;
        return false;
    }

    /* renamed from: v */
    private void m46062v() {
        TreeMap treeMap = new TreeMap(this.f47442f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m46054m(i), Integer.valueOf(i));
        }
        this.f47443g = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f47436l, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m46061u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C10897m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f47438b.add(new C10060d(shapeAppearanceModel.mo43136r(), shapeAppearanceModel.mo43129j(), shapeAppearanceModel.mo43138t(), shapeAppearanceModel.mo43131l()));
        C5723u.m25330o0(materialButton, new C10058b());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m46062v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void mo39900g(C10061e eVar) {
        this.f47441e.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f47445i) {
            return this.f47447k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m46054m(i);
            if (m.isChecked()) {
                arrayList.add(Integer.valueOf(m.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f47443g;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f47436l, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: k */
    public void mo39905k() {
        this.f47444h = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m46054m(i);
            m.setChecked(false);
            m46053l(m.getId(), false);
        }
        this.f47444h = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f47447k;
        if (i != -1) {
            m46052j(i, true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5771c.m25532H0(accessibilityNodeInfo).mo22630e0(C5771c.C5773b.m25622b(1, getVisibleButtonCount(), false, mo39910q() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo39914w();
        m46050h();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo39851h(this.f47439c);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.C10056b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f47438b.remove(indexOfChild);
        }
        mo39914w();
        m46050h();
    }

    /* renamed from: q */
    public boolean mo39910q() {
        return this.f47445i;
    }

    public void setSelectionRequired(boolean z) {
        this.f47446j = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f47445i != z) {
            this.f47445i = z;
            mo39905k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo39914w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m = m46054m(i);
            if (m.getVisibility() != 8) {
                C10897m.C10899b v = m.getShapeAppearanceModel().mo43140v();
                m46060t(v, m46056o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m.setShapeAppearanceModel(v.mo43154m());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f47437m
            android.content.Context r7 = p246q6.C10962a.m49296c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f47438b = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f47439c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f47440d = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f47441e = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f47442f = r7
            r7 = 0
            r6.f47444h = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p194c6.C6532l.f26832U3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r9 = p194c6.C6532l.f26862X3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = p194c6.C6532l.f26842V3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f47447k = r9
            int r9 = p194c6.C6532l.f26852W3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f47446j = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            p111m0.C5723u.m25350y0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
