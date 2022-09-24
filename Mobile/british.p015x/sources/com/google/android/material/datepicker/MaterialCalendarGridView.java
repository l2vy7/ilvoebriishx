package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.C10227s;
import java.util.Calendar;
import p105l0.C5644d;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p194c6.C6526f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    private final Calendar f47654b;

    /* renamed from: c */
    private final boolean f47655c;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C10094a extends C5682a {
        C10094a() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22630e0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m46464a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo40530i());
        } else if (i == 130) {
            setSelection(getAdapter().mo40520b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private static int m46465c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m46466d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C10129j getAdapter() {
        return (C10129j) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C10129j b = getAdapter();
        DateSelector<?> dateSelector = b.f47774c;
        C10102b bVar = b.f47776e;
        Long c = b.getItem(b.mo40520b());
        Long c2 = b.getItem(b.mo40530i());
        for (C5644d next : dateSelector.mo40418H()) {
            F f = next.f24210a;
            if (f != null) {
                if (next.f24211b != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f24211b).longValue();
                    if (!m46466d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean h = C10227s.m47140h(this);
                        if (longValue < c.longValue()) {
                            i2 = b.mo40520b();
                            if (b.mo40523f(i2)) {
                                i = 0;
                            } else if (!h) {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f47654b.setTimeInMillis(longValue);
                            i2 = b.mo40519a(materialCalendarGridView.f47654b.get(5));
                            i = m46465c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo40530i(), getChildCount() - 1);
                            if (b.mo40524g(i4)) {
                                i3 = getWidth();
                            } else if (!h) {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f47654b.setTimeInMillis(longValue2);
                            i4 = b.mo40519a(materialCalendarGridView.f47654b.get(5));
                            i3 = m46465c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + bVar.f47687a.mo40486c();
                            int bottom = childAt.getBottom() - bVar.f47687a.mo40485b();
                            if (!h) {
                                i6 = numColumns > i2 ? 0 : i;
                                i5 = i4 > numColumns2 ? getWidth() : i3;
                            } else {
                                int i7 = i4 > numColumns2 ? 0 : i3;
                                i5 = numColumns > i2 ? getWidth() : i;
                                i6 = i7;
                            }
                            canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f47694h);
                            itemId++;
                            materialCalendarGridView = this;
                            b = b;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m46464a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo40520b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo40520b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f47655c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo40520b()) {
            super.setSelection(getAdapter().mo40520b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47654b = C10138p.m46661q();
        if (C10121g.m46593u2(getContext())) {
            setNextFocusLeftId(C6526f.f26605a);
            setNextFocusRightId(C6526f.confirm_button);
        }
        this.f47655c = C10121g.m46594v2(getContext());
        C5723u.m25330o0(this, new C10094a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C10129j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C10129j.class.getCanonicalName()}));
        }
    }
}
