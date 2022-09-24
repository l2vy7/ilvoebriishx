package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.C10193d;
import com.google.android.material.internal.C10227s;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p104l0.C5644d;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6526f;
import p193c6.C6528h;
import p193c6.C6530j;
import p232m6.C10804b;

public class RangeDateSelector implements DateSelector<C5644d<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C10098c();

    /* renamed from: b */
    private String f47664b;

    /* renamed from: c */
    private final String f47665c = " ";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Long f47666d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Long f47667e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Long f47668f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f47669g = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    class C10096a extends C10103c {

        /* renamed from: h */
        final /* synthetic */ TextInputLayout f47670h;

        /* renamed from: i */
        final /* synthetic */ TextInputLayout f47671i;

        /* renamed from: j */
        final /* synthetic */ C10133l f47672j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10096a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C10133l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f47670h = textInputLayout2;
            this.f47671i = textInputLayout3;
            this.f47672j = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo40472e() {
            Long unused = RangeDateSelector.this.f47668f = null;
            RangeDateSelector.this.m46490k(this.f47670h, this.f47671i, this.f47672j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo40473f(Long l) {
            Long unused = RangeDateSelector.this.f47668f = l;
            RangeDateSelector.this.m46490k(this.f47670h, this.f47671i, this.f47672j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    class C10097b extends C10103c {

        /* renamed from: h */
        final /* synthetic */ TextInputLayout f47674h;

        /* renamed from: i */
        final /* synthetic */ TextInputLayout f47675i;

        /* renamed from: j */
        final /* synthetic */ C10133l f47676j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10097b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C10133l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f47674h = textInputLayout2;
            this.f47675i = textInputLayout3;
            this.f47676j = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo40472e() {
            Long unused = RangeDateSelector.this.f47669g = null;
            RangeDateSelector.this.m46490k(this.f47674h, this.f47675i, this.f47676j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo40473f(Long l) {
            Long unused = RangeDateSelector.this.f47669g = l;
            RangeDateSelector.this.m46490k(this.f47674h, this.f47675i, this.f47676j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    static class C10098c implements Parcelable.Creator<RangeDateSelector> {
        C10098c() {
        }

        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.f47666d = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f47667e = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: g */
    private void m46487g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f47664b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    /* renamed from: i */
    private boolean m46488i(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: j */
    private void m46489j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f47664b);
        textInputLayout2.setError(" ");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m46490k(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C10133l<C5644d<Long, Long>> lVar) {
        Long l = this.f47668f;
        if (l == null || this.f47669g == null) {
            m46487g(textInputLayout, textInputLayout2);
            lVar.mo40515a();
        } else if (m46488i(l.longValue(), this.f47669g.longValue())) {
            this.f47666d = this.f47668f;
            this.f47667e = this.f47669g;
            lVar.mo40516b(mo40424r0());
        } else {
            m46489j(textInputLayout, textInputLayout2);
            lVar.mo40515a();
        }
    }

    /* renamed from: H */
    public Collection<C5644d<Long, Long>> mo40418H() {
        if (this.f47666d == null || this.f47667e == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5644d(this.f47666d, this.f47667e));
        return arrayList;
    }

    /* renamed from: U */
    public View mo40419U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C10133l<C5644d<Long, Long>> lVar) {
        View inflate = layoutInflater.inflate(C6528h.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C6526f.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C6526f.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C10193d.m47020a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f47664b = inflate.getResources().getString(C6530j.mtrl_picker_invalid_range);
        SimpleDateFormat k = C10138p.m46655k();
        Long l = this.f47666d;
        if (l != null) {
            editText.setText(k.format(l));
            this.f47668f = this.f47666d;
        }
        Long l2 = this.f47667e;
        if (l2 != null) {
            editText2.setText(k.format(l2));
            this.f47669g = this.f47667e;
        }
        String l3 = C10138p.m46656l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l3);
        textInputLayout2.setPlaceholderText(l3);
        SimpleDateFormat simpleDateFormat = k;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        C10096a aVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = l3;
        C10133l<C5644d<Long, Long>> lVar2 = lVar;
        C10096a aVar2 = new C10096a(l3, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, lVar2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new C10097b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, lVar2));
        C10227s.m47143k(editText);
        return inflate;
    }

    /* renamed from: c */
    public String mo40420c(Context context) {
        Resources resources = context.getResources();
        Long l = this.f47666d;
        if (l == null && this.f47667e == null) {
            return resources.getString(C6530j.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f47667e;
        if (l2 == null) {
            return resources.getString(C6530j.mtrl_picker_range_header_only_start_selected, new Object[]{C10106d.m46535c(l.longValue())});
        } else if (l == null) {
            return resources.getString(C6530j.mtrl_picker_range_header_only_end_selected, new Object[]{C10106d.m46535c(l2.longValue())});
        } else {
            C5644d<String, String> a = C10106d.m46533a(l, l2);
            return resources.getString(C6530j.mtrl_picker_range_header_selected, new Object[]{a.f24210a, a.f24211b});
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f0 */
    public int mo40421f0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C10804b.m48751c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C6524d.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C6522b.materialCalendarTheme : C6522b.materialCalendarFullscreenTheme, C10121g.class.getCanonicalName());
    }

    /* renamed from: h */
    public C5644d<Long, Long> mo40424r0() {
        return new C5644d<>(this.f47666d, this.f47667e);
    }

    /* renamed from: k0 */
    public boolean mo40422k0() {
        Long l = this.f47666d;
        return (l == null || this.f47667e == null || !m46488i(l.longValue(), this.f47667e.longValue())) ? false : true;
    }

    /* renamed from: o0 */
    public Collection<Long> mo40423o0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f47666d;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f47667e;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f47666d);
        parcel.writeValue(this.f47667e);
    }

    /* renamed from: x0 */
    public void mo40425x0(long j) {
        Long l = this.f47666d;
        if (l == null) {
            this.f47666d = Long.valueOf(j);
        } else if (this.f47667e != null || !m46488i(l.longValue(), j)) {
            this.f47667e = null;
            this.f47666d = Long.valueOf(j);
        } else {
            this.f47667e = Long.valueOf(j);
        }
    }
}
