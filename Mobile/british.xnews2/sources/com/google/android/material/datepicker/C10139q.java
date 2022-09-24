package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C10108f;
import java.util.Calendar;
import java.util.Locale;
import p193c6.C6528h;
import p193c6.C6530j;

/* renamed from: com.google.android.material.datepicker.q */
/* compiled from: YearGridAdapter */
class C10139q extends RecyclerView.C1092h<C10141b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10108f<?> f47793a;

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* compiled from: YearGridAdapter */
    class C10140a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f47794b;

        C10140a(int i) {
            this.f47794b = i;
        }

        public void onClick(View view) {
            C10139q.this.f47793a.mo40503h2(C10139q.this.f47793a.mo40498Y1().mo40391f(Month.m46469b(this.f47794b, C10139q.this.f47793a.mo40500a2().f47658c)));
            C10139q.this.f47793a.mo40504i2(C10108f.C10119k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.q$b */
    /* compiled from: YearGridAdapter */
    public static class C10141b extends RecyclerView.C1087c0 {

        /* renamed from: a */
        final TextView f47796a;

        C10141b(TextView textView) {
            super(textView);
            this.f47796a = textView;
        }
    }

    C10139q(C10108f<?> fVar) {
        this.f47793a = fVar;
    }

    /* renamed from: b */
    private View.OnClickListener m46667b(int i) {
        return new C10140a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo40543c(int i) {
        return i - this.f47793a.mo40498Y1().mo40397k().f47659d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo40544d(int i) {
        return this.f47793a.mo40498Y1().mo40397k().f47659d + i;
    }

    /* renamed from: e */
    public void onBindViewHolder(C10141b bVar, int i) {
        int d = mo40544d(i);
        String string = bVar.f47796a.getContext().getString(C6530j.mtrl_picker_navigate_to_year_description);
        bVar.f47796a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(d)}));
        bVar.f47796a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(d)}));
        C10102b Z1 = this.f47793a.mo40499Z1();
        Calendar o = C10138p.m46659o();
        C10101a aVar = o.get(1) == d ? Z1.f47692f : Z1.f47690d;
        for (Long longValue : this.f47793a.mo40501c2().mo40423o0()) {
            o.setTimeInMillis(longValue.longValue());
            if (o.get(1) == d) {
                aVar = Z1.f47691e;
            }
        }
        aVar.mo40487d(bVar.f47796a);
        bVar.f47796a.setOnClickListener(m46667b(d));
    }

    /* renamed from: f */
    public C10141b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10141b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6528h.mtrl_calendar_year, viewGroup, false));
    }

    public int getItemCount() {
        return this.f47793a.mo40498Y1().mo40398l();
    }
}
