package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C1160j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p105l0.C5644d;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p194c6.C6524d;
import p194c6.C6526f;
import p194c6.C6527g;
import p194c6.C6528h;
import p194c6.C6530j;

/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: MaterialCalendar */
public final class C10108f<S> extends C10134m<S> {

    /* renamed from: A0 */
    static final Object f47709A0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: x0 */
    static final Object f47710x0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: y0 */
    static final Object f47711y0 = "NAVIGATION_PREV_TAG";

    /* renamed from: z0 */
    static final Object f47712z0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: n0 */
    private int f47713n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public DateSelector<S> f47714o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public CalendarConstraints f47715p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public Month f47716q0;

    /* renamed from: r0 */
    private C10119k f47717r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C10102b f47718s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public RecyclerView f47719t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public RecyclerView f47720u0;

    /* renamed from: v0 */
    private View f47721v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public View f47722w0;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* compiled from: MaterialCalendar */
    class C10109a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f47723b;

        C10109a(int i) {
            this.f47723b = i;
        }

        public void run() {
            C10108f.this.f47720u0.mo5195s1(this.f47723b);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    /* compiled from: MaterialCalendar */
    class C10110b extends C5682a {
        C10110b() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22630e0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    /* compiled from: MaterialCalendar */
    class C10111c extends C10135n {

        /* renamed from: I */
        final /* synthetic */ int f47726I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10111c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f47726I = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo5016M1(RecyclerView.C1121z zVar, int[] iArr) {
            if (this.f47726I == 0) {
                iArr[0] = C10108f.this.f47720u0.getWidth();
                iArr[1] = C10108f.this.f47720u0.getWidth();
                return;
            }
            iArr[0] = C10108f.this.f47720u0.getHeight();
            iArr[1] = C10108f.this.f47720u0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    /* compiled from: MaterialCalendar */
    class C10112d implements C10120l {
        C10112d() {
        }

        /* renamed from: a */
        public void mo40507a(long j) {
            if (C10108f.this.f47715p0.mo40392g().mo40401h0(j)) {
                C10108f.this.f47714o0.mo40425x0(j);
                Iterator it = C10108f.this.f47787m0.iterator();
                while (it.hasNext()) {
                    ((C10133l) it.next()).mo40516b(C10108f.this.f47714o0.mo40424r0());
                }
                C10108f.this.f47720u0.getAdapter().notifyDataSetChanged();
                if (C10108f.this.f47719t0 != null) {
                    C10108f.this.f47719t0.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$e */
    /* compiled from: MaterialCalendar */
    class C10113e extends RecyclerView.C1103o {

        /* renamed from: a */
        private final Calendar f47729a = C10138p.m46661q();

        /* renamed from: b */
        private final Calendar f47730b = C10138p.m46661q();

        C10113e() {
        }

        /* renamed from: g */
        public void mo5397g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1121z zVar) {
            int i;
            if ((recyclerView.getAdapter() instanceof C10139q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C10139q qVar = (C10139q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C5644d next : C10108f.this.f47714o0.mo40418H()) {
                    F f = next.f24210a;
                    if (!(f == null || next.f24211b == null)) {
                        this.f47729a.setTimeInMillis(((Long) f).longValue());
                        this.f47730b.setTimeInMillis(((Long) next.f24211b).longValue());
                        int c = qVar.mo40543c(this.f47729a.get(1));
                        int c2 = qVar.mo40543c(this.f47730b.get(1));
                        View C = gridLayoutManager.mo5011C(c);
                        View C2 = gridLayoutManager.mo5011C(c2);
                        int T2 = c / gridLayoutManager.mo4985T2();
                        int T22 = c2 / gridLayoutManager.mo4985T2();
                        int i2 = T2;
                        while (i2 <= T22) {
                            View C3 = gridLayoutManager.mo5011C(gridLayoutManager.mo4985T2() * i2);
                            if (C3 != null) {
                                int top = C3.getTop() + C10108f.this.f47718s0.f47690d.mo40486c();
                                int bottom = C3.getBottom() - C10108f.this.f47718s0.f47690d.mo40485b();
                                int left = i2 == T2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i2 == T22) {
                                    i = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, C10108f.this.f47718s0.f47694h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$f */
    /* compiled from: MaterialCalendar */
    class C10114f extends C5682a {
        C10114f() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            String str;
            super.mo3197g(view, cVar);
            if (C10108f.this.f47722w0.getVisibility() == 0) {
                str = C10108f.this.mo3394U(C6530j.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C10108f.this.mo3394U(C6530j.mtrl_picker_toggle_to_day_selection);
            }
            cVar.mo22644m0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$g */
    /* compiled from: MaterialCalendar */
    class C10115g extends RecyclerView.C1112t {

        /* renamed from: a */
        final /* synthetic */ C10130k f47733a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f47734b;

        C10115g(C10130k kVar, MaterialButton materialButton) {
            this.f47733a = kVar;
            this.f47734b = materialButton;
        }

        /* renamed from: a */
        public void mo5505a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f47734b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo5506b(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C10108f.this.mo40502e2().mo5023Y1();
            } else {
                i3 = C10108f.this.mo40502e2().mo5025a2();
            }
            Month unused = C10108f.this.f47716q0 = this.f47733a.mo40534b(i3);
            this.f47734b.setText(this.f47733a.mo40535c(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$h */
    /* compiled from: MaterialCalendar */
    class C10116h implements View.OnClickListener {
        C10116h() {
        }

        public void onClick(View view) {
            C10108f.this.mo40505j2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$i */
    /* compiled from: MaterialCalendar */
    class C10117i implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C10130k f47737b;

        C10117i(C10130k kVar) {
            this.f47737b = kVar;
        }

        public void onClick(View view) {
            int Y1 = C10108f.this.mo40502e2().mo5023Y1() + 1;
            if (Y1 < C10108f.this.f47720u0.getAdapter().getItemCount()) {
                C10108f.this.mo40503h2(this.f47737b.mo40534b(Y1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$j */
    /* compiled from: MaterialCalendar */
    class C10118j implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C10130k f47739b;

        C10118j(C10130k kVar) {
            this.f47739b = kVar;
        }

        public void onClick(View view) {
            int a2 = C10108f.this.mo40502e2().mo5025a2() - 1;
            if (a2 >= 0) {
                C10108f.this.mo40503h2(this.f47739b.mo40534b(a2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$k */
    /* compiled from: MaterialCalendar */
    enum C10119k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.f$l */
    /* compiled from: MaterialCalendar */
    interface C10120l {
        /* renamed from: a */
        void mo40507a(long j);
    }

    /* renamed from: W1 */
    private void m46555W1(View view, C10130k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C6526f.month_navigation_fragment_toggle);
        materialButton.setTag(f47709A0);
        C5723u.m25330o0(materialButton, new C10114f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C6526f.month_navigation_previous);
        materialButton2.setTag(f47711y0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C6526f.month_navigation_next);
        materialButton3.setTag(f47712z0);
        this.f47721v0 = view.findViewById(C6526f.mtrl_calendar_year_selector_frame);
        this.f47722w0 = view.findViewById(C6526f.mtrl_calendar_day_selector_frame);
        mo40504i2(C10119k.DAY);
        materialButton.setText(this.f47716q0.mo40460m(view.getContext()));
        this.f47720u0.mo5164l(new C10115g(kVar, materialButton));
        materialButton.setOnClickListener(new C10116h());
        materialButton3.setOnClickListener(new C10117i(kVar));
        materialButton2.setOnClickListener(new C10118j(kVar));
    }

    /* renamed from: X1 */
    private RecyclerView.C1103o m46556X1() {
        return new C10113e();
    }

    /* renamed from: d2 */
    static int m46557d2(Context context) {
        return context.getResources().getDimensionPixelSize(C6524d.mtrl_calendar_day_height);
    }

    /* renamed from: f2 */
    public static <T> C10108f<T> m46558f2(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C10108f<T> fVar = new C10108f<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mo40396j());
        fVar.mo3343A1(bundle);
        return fVar;
    }

    /* renamed from: g2 */
    private void m46559g2(int i) {
        this.f47720u0.post(new C10109a(i));
    }

    /* renamed from: N1 */
    public boolean mo40497N1(C10133l<S> lVar) {
        return super.mo40497N1(lVar);
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f47713n0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f47714o0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f47715p0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f47716q0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public CalendarConstraints mo40498Y1() {
        return this.f47715p0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public C10102b mo40499Z1() {
        return this.f47718s0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public Month mo40500a2() {
        return this.f47716q0;
    }

    /* renamed from: c2 */
    public DateSelector<S> mo40501c2() {
        return this.f47714o0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public LinearLayoutManager mo40502e2() {
        return (LinearLayoutManager) this.f47720u0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public void mo40503h2(Month month) {
        C10130k kVar = (C10130k) this.f47720u0.getAdapter();
        int d = kVar.mo40536d(month);
        int d2 = d - kVar.mo40536d(this.f47716q0);
        boolean z = true;
        boolean z2 = Math.abs(d2) > 3;
        if (d2 <= 0) {
            z = false;
        }
        this.f47716q0 = month;
        if (z2 && z) {
            this.f47720u0.mo5163k1(d - 3);
            m46559g2(d);
        } else if (z2) {
            this.f47720u0.mo5163k1(d + 3);
            m46559g2(d);
        } else {
            m46559g2(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i2 */
    public void mo40504i2(C10119k kVar) {
        this.f47717r0 = kVar;
        if (kVar == C10119k.YEAR) {
            this.f47719t0.getLayoutManager().mo5043x1(((C10139q) this.f47719t0.getAdapter()).mo40543c(this.f47716q0.f47659d));
            this.f47721v0.setVisibility(0);
            this.f47722w0.setVisibility(8);
        } else if (kVar == C10119k.DAY) {
            this.f47721v0.setVisibility(8);
            this.f47722w0.setVisibility(0);
            mo40503h2(this.f47716q0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public void mo40505j2() {
        C10119k kVar = this.f47717r0;
        C10119k kVar2 = C10119k.YEAR;
        if (kVar == kVar2) {
            mo40504i2(C10119k.DAY);
        } else if (kVar == C10119k.DAY) {
            mo40504i2(kVar2);
        }
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        if (bundle == null) {
            bundle = mo3460u();
        }
        this.f47713n0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f47714o0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f47715p0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f47716q0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo3466w(), this.f47713n0);
        this.f47718s0 = new C10102b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month k = this.f47715p0.mo40397k();
        if (C10121g.m46593u2(contextThemeWrapper)) {
            i2 = C6528h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C6528h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C6526f.mtrl_calendar_days_of_week);
        C5723u.m25330o0(gridView, new C10110b());
        gridView.setAdapter(new C10107e());
        gridView.setNumColumns(k.f47660e);
        gridView.setEnabled(false);
        this.f47720u0 = (RecyclerView) inflate.findViewById(C6526f.mtrl_calendar_months);
        this.f47720u0.setLayoutManager(new C10111c(mo3466w(), i, false, i));
        this.f47720u0.setTag(f47710x0);
        C10130k kVar = new C10130k(contextThemeWrapper, this.f47714o0, this.f47715p0, new C10112d());
        this.f47720u0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(C6527g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C6526f.mtrl_calendar_year_selector_frame);
        this.f47719t0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f47719t0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f47719t0.setAdapter(new C10139q(this));
            this.f47719t0.mo5152h(m46556X1());
        }
        if (inflate.findViewById(C6526f.month_navigation_fragment_toggle) != null) {
            m46555W1(inflate, kVar);
        }
        if (!C10121g.m46593u2(contextThemeWrapper)) {
            new C1160j().mo5816b(this.f47720u0);
        }
        this.f47720u0.mo5163k1(kVar.mo40536d(this.f47716q0));
        return inflate;
    }
}
