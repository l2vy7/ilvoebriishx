package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.i */
/* compiled from: MaterialTextInputPicker */
public final class C10127i<S> extends C10134m<S> {

    /* renamed from: n0 */
    private int f47768n0;

    /* renamed from: o0 */
    private DateSelector<S> f47769o0;

    /* renamed from: p0 */
    private CalendarConstraints f47770p0;

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* compiled from: MaterialTextInputPicker */
    class C10128a extends C10133l<S> {
        C10128a() {
        }

        /* renamed from: a */
        public void mo40515a() {
            Iterator it = C10127i.this.f47787m0.iterator();
            while (it.hasNext()) {
                ((C10133l) it.next()).mo40515a();
            }
        }

        /* renamed from: b */
        public void mo40516b(S s) {
            Iterator it = C10127i.this.f47787m0.iterator();
            while (it.hasNext()) {
                ((C10133l) it.next()).mo40516b(s);
            }
        }
    }

    /* renamed from: P1 */
    static <T> C10127i<T> m46610P1(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C10127i<T> iVar = new C10127i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        iVar.mo3343A1(bundle);
        return iVar;
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f47768n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f47769o0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f47770p0);
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        if (bundle == null) {
            bundle = mo3460u();
        }
        this.f47768n0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f47769o0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f47770p0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f47769o0.mo40419U(layoutInflater.cloneInContext(new ContextThemeWrapper(mo3466w(), this.f47768n0)), viewGroup, bundle, this.f47770p0, new C10128a());
    }
}
