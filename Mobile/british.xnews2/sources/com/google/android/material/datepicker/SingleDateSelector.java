package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import p193c6.C6526f;
import p193c6.C6528h;
import p193c6.C6530j;
import p232m6.C10804b;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C10100b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Long f47678b;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    class C10099a extends C10103c {

        /* renamed from: h */
        final /* synthetic */ C10133l f47679h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10099a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C10133l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f47679h = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo40472e() {
            this.f47679h.mo40515a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo40473f(Long l) {
            if (l == null) {
                SingleDateSelector.this.m46508d();
            } else {
                SingleDateSelector.this.mo40425x0(l.longValue());
            }
            this.f47679h.mo40516b(SingleDateSelector.this.mo40424r0());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    static class C10100b implements Parcelable.Creator<SingleDateSelector> {
        C10100b() {
        }

        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f47678b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m46508d() {
        this.f47678b = null;
    }

    /* renamed from: H */
    public Collection<C5644d<Long, Long>> mo40418H() {
        return new ArrayList();
    }

    /* renamed from: U */
    public View mo40419U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C10133l<Long> lVar) {
        View inflate = layoutInflater.inflate(C6528h.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C6526f.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C10193d.m47020a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat k = C10138p.m46655k();
        String l = C10138p.m46656l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l);
        Long l2 = this.f47678b;
        if (l2 != null) {
            editText.setText(k.format(l2));
        }
        editText.addTextChangedListener(new C10099a(l, k, textInputLayout, calendarConstraints, lVar));
        C10227s.m47143k(editText);
        return inflate;
    }

    /* renamed from: c */
    public String mo40420c(Context context) {
        Resources resources = context.getResources();
        Long l = this.f47678b;
        if (l == null) {
            return resources.getString(C6530j.mtrl_picker_date_header_unselected);
        }
        String j = C10106d.m46542j(l.longValue());
        return resources.getString(C6530j.mtrl_picker_date_header_selected, new Object[]{j});
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Long mo40424r0() {
        return this.f47678b;
    }

    /* renamed from: f0 */
    public int mo40421f0(Context context) {
        return C10804b.m48751c(context, C6522b.materialCalendarTheme, C10121g.class.getCanonicalName());
    }

    /* renamed from: k0 */
    public boolean mo40422k0() {
        return this.f47678b != null;
    }

    /* renamed from: o0 */
    public Collection<Long> mo40423o0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f47678b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f47678b);
    }

    /* renamed from: x0 */
    public void mo40425x0(long j) {
        this.f47678b = Long.valueOf(j);
    }
}
