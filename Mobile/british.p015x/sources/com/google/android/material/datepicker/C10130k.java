package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C10108f;
import p111m0.C5723u;
import p194c6.C6526f;
import p194c6.C6528h;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: MonthsPagerAdapter */
class C10130k extends RecyclerView.C1092h<C10132b> {

    /* renamed from: a */
    private final Context f47778a;

    /* renamed from: b */
    private final CalendarConstraints f47779b;

    /* renamed from: c */
    private final DateSelector<?> f47780c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10108f.C10120l f47781d;

    /* renamed from: e */
    private final int f47782e;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* compiled from: MonthsPagerAdapter */
    class C10131a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ MaterialCalendarGridView f47783b;

        C10131a(MaterialCalendarGridView materialCalendarGridView) {
            this.f47783b = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f47783b.getAdapter().mo40533n(i)) {
                C10130k.this.f47781d.mo40507a(this.f47783b.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C10132b extends RecyclerView.C1087c0 {

        /* renamed from: a */
        final TextView f47785a;

        /* renamed from: b */
        final MaterialCalendarGridView f47786b;

        C10132b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C6526f.month_title);
            this.f47785a = textView;
            C5723u.m25332p0(textView, true);
            this.f47786b = (MaterialCalendarGridView) linearLayout.findViewById(C6526f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C10130k(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C10108f.C10120l lVar) {
        Month k = calendarConstraints.mo40397k();
        Month h = calendarConstraints.mo40393h();
        Month j = calendarConstraints.mo40396j();
        if (k.compareTo(j) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j.compareTo(h) <= 0) {
            int d2 = C10129j.f47772g * C10108f.m46557d2(context);
            int d22 = C10121g.m46593u2(context) ? C10108f.m46557d2(context) : 0;
            this.f47778a = context;
            this.f47782e = d2 + d22;
            this.f47779b = calendarConstraints;
            this.f47780c = dateSelector;
            this.f47781d = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo40534b(int i) {
        return this.f47779b.mo40397k().mo40462o(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence mo40535c(int i) {
        return mo40534b(i).mo40460m(this.f47778a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo40536d(Month month) {
        return this.f47779b.mo40397k().mo40463p(month);
    }

    /* renamed from: e */
    public void onBindViewHolder(C10132b bVar, int i) {
        Month o = this.f47779b.mo40397k().mo40462o(i);
        bVar.f47785a.setText(o.mo40460m(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f47786b.findViewById(C6526f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o.equals(materialCalendarGridView.getAdapter().f47773b)) {
            C10129j jVar = new C10129j(o, this.f47780c, this.f47779b);
            materialCalendarGridView.setNumColumns(o.f47660e);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo40532m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C10131a(materialCalendarGridView));
    }

    /* renamed from: f */
    public C10132b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C6528h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C10121g.m46593u2(viewGroup.getContext())) {
            return new C10132b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f47782e));
        return new C10132b(linearLayout, true);
    }

    public int getItemCount() {
        return this.f47779b.mo40395i();
    }

    public long getItemId(int i) {
        return this.f47779b.mo40397k().mo40462o(i).mo40461n();
    }
}
