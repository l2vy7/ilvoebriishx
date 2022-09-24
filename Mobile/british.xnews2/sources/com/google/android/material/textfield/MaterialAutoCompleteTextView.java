package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.C10193d;
import com.google.android.material.internal.C10220m;
import p193c6.C6522b;
import p193c6.C6531k;
import p193c6.C6532l;
import p245q6.C10962a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ListPopupWindow f48512e;

    /* renamed from: f */
    private final AccessibilityManager f48513f;

    /* renamed from: g */
    private final Rect f48514g;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    class C10311a implements AdapterView.OnItemClickListener {
        C10311a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MaterialAutoCompleteTextView.this.m47617e(i < 0 ? MaterialAutoCompleteTextView.this.f48512e.mo1773u() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f48512e.mo1776x();
                    i = MaterialAutoCompleteTextView.this.f48512e.mo1775w();
                    j = MaterialAutoCompleteTextView.this.f48512e.mo1774v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f48512e.mo1048j(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f48512e.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.f26599b);
    }

    /* renamed from: c */
    private TextInputLayout m47615c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m47616d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m47615c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f48512e.mo1775w()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable h = this.f48512e.mo1767h();
        if (h != null) {
            h.getPadding(this.f48514g);
            Rect rect = this.f48514g;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m47617e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter((ListAdapter) null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = m47615c();
        if (c == null || !c.mo41537O()) {
            return super.getHint();
        }
        return c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m47615c();
        if (c != null && c.mo41537O() && super.getHint() == null && C10193d.m47022c()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m47616d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f48512e.mo1630o(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f48513f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f48512e.show();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C10962a.m49296c(context, attributeSet, i, 0), attributeSet, i);
        this.f48514g = new Rect();
        Context context2 = getContext();
        TypedArray h = C10220m.m47116h(context2, attributeSet, C6532l.f27156y3, i, C6531k.f26608f, new int[0]);
        int i2 = C6532l.f27167z3;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f48513f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f48512e = listPopupWindow;
        listPopupWindow.mo1757I(true);
        listPopupWindow.mo1751C(this);
        listPopupWindow.mo1756H(2);
        listPopupWindow.mo1630o(getAdapter());
        listPopupWindow.mo1759K(new C10311a());
        h.recycle();
    }
}
