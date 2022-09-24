package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.j */
/* compiled from: MonthAdapter */
class C10129j extends BaseAdapter {

    /* renamed from: g */
    static final int f47772g = C10138p.m46661q().getMaximum(4);

    /* renamed from: b */
    final Month f47773b;

    /* renamed from: c */
    final DateSelector<?> f47774c;

    /* renamed from: d */
    private Collection<Long> f47775d;

    /* renamed from: e */
    C10102b f47776e;

    /* renamed from: f */
    final CalendarConstraints f47777f;

    C10129j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f47773b = month;
        this.f47774c = dateSelector;
        this.f47777f = calendarConstraints;
        this.f47775d = dateSelector.mo40423o0();
    }

    /* renamed from: e */
    private void m46616e(Context context) {
        if (this.f47776e == null) {
            this.f47776e = new C10102b(context);
        }
    }

    /* renamed from: h */
    private boolean m46617h(long j) {
        for (Long longValue : this.f47774c.mo40423o0()) {
            if (C10138p.m46645a(j) == C10138p.m46645a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m46618k(TextView textView, long j) {
        C10101a aVar;
        if (textView != null) {
            if (this.f47777f.mo40392g().mo40401h0(j)) {
                textView.setEnabled(true);
                if (m46617h(j)) {
                    aVar = this.f47776e.f47688b;
                } else if (C10138p.m46659o().getTimeInMillis() == j) {
                    aVar = this.f47776e.f47689c;
                } else {
                    aVar = this.f47776e.f47687a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f47776e.f47693g;
            }
            aVar.mo40487d(textView);
        }
    }

    /* renamed from: l */
    private void m46619l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m46470d(j).equals(this.f47773b)) {
            m46618k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo40519a(this.f47773b.mo40459l(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo40519a(int i) {
        return mo40520b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo40520b() {
        return this.f47773b.mo40457j();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f47773b.mo40457j() || i > mo40530i()) {
            return null;
        }
        return Long.valueOf(this.f47773b.mo40458k(mo40531j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m46616e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p193c6.C6528h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo40520b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f47773b
            int r2 = r8.f47661f
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f47773b
            long r7 = r8.mo40458k(r7)
            com.google.android.material.datepicker.Month r3 = r5.f47773b
            int r3 = r3.f47659d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m46471i()
            int r4 = r4.f47659d
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.C10106d.m46539g(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.C10106d.m46544l(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m46618k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C10129j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo40523f(int i) {
        return i % this.f47773b.f47660e == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo40524g(int i) {
        return (i + 1) % this.f47773b.f47660e == 0;
    }

    public int getCount() {
        return this.f47773b.f47661f + mo40520b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f47773b.f47660e);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo40530i() {
        return (this.f47773b.mo40457j() + this.f47773b.f47661f) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo40531j(int i) {
        return (i - this.f47773b.mo40457j()) + 1;
    }

    /* renamed from: m */
    public void mo40532m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f47775d) {
            m46619l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.f47774c;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo40423o0()) {
                m46619l(materialCalendarGridView, longValue2.longValue());
            }
            this.f47775d = this.f47774c.mo40423o0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo40533n(int i) {
        return i >= mo40520b() && i <= mo40530i();
    }
}
