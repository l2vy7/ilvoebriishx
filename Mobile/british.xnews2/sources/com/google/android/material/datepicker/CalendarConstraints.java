package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p104l0.C5643c;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C10086a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Month f47636b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Month f47637c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final DateValidator f47638d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Month f47639e;

    /* renamed from: f */
    private final int f47640f;

    /* renamed from: g */
    private final int f47641g;

    public interface DateValidator extends Parcelable {
        /* renamed from: h0 */
        boolean mo40401h0(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    static class C10086a implements Parcelable.Creator<CalendarConstraints> {
        C10086a() {
        }

        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (C10086a) null);
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C10087b {

        /* renamed from: e */
        static final long f47642e = C10138p.m46645a(Month.m46469b(1900, 0).f47662g);

        /* renamed from: f */
        static final long f47643f = C10138p.m46645a(Month.m46469b(2100, 11).f47662g);

        /* renamed from: a */
        private long f47644a = f47642e;

        /* renamed from: b */
        private long f47645b = f47643f;

        /* renamed from: c */
        private Long f47646c;

        /* renamed from: d */
        private DateValidator f47647d = DateValidatorPointForward.m46460a(Long.MIN_VALUE);

        C10087b(CalendarConstraints calendarConstraints) {
            this.f47644a = calendarConstraints.f47636b.f47662g;
            this.f47645b = calendarConstraints.f47637c.f47662g;
            this.f47646c = Long.valueOf(calendarConstraints.f47639e.f47662g);
            this.f47647d = calendarConstraints.f47638d;
        }

        /* renamed from: a */
        public CalendarConstraints mo40406a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f47647d);
            Month d = Month.m46470d(this.f47644a);
            Month d2 = Month.m46470d(this.f47645b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f47646c;
            if (l == null) {
                month = null;
            } else {
                month = Month.m46470d(l.longValue());
            }
            return new CalendarConstraints(d, d2, dateValidator, month, (C10086a) null);
        }

        /* renamed from: b */
        public C10087b mo40407b(long j) {
            this.f47646c = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C10086a aVar) {
        this(month, month2, dateValidator, month3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f47636b.equals(calendarConstraints.f47636b) || !this.f47637c.equals(calendarConstraints.f47637c) || !C5643c.m24954a(this.f47639e, calendarConstraints.f47639e) || !this.f47638d.equals(calendarConstraints.f47638d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Month mo40391f(Month month) {
        if (month.compareTo(this.f47636b) < 0) {
            return this.f47636b;
        }
        return month.compareTo(this.f47637c) > 0 ? this.f47637c : month;
    }

    /* renamed from: g */
    public DateValidator mo40392g() {
        return this.f47638d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Month mo40393h() {
        return this.f47637c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47636b, this.f47637c, this.f47639e, this.f47638d});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo40395i() {
        return this.f47641g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Month mo40396j() {
        return this.f47639e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Month mo40397k() {
        return this.f47636b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo40398l() {
        return this.f47640f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo40399m(long j) {
        if (this.f47636b.mo40458k(1) <= j) {
            Month month = this.f47637c;
            if (j <= month.mo40458k(month.f47661f)) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47636b, 0);
        parcel.writeParcelable(this.f47637c, 0);
        parcel.writeParcelable(this.f47639e, 0);
        parcel.writeParcelable(this.f47638d, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f47636b = month;
        this.f47637c = month2;
        this.f47639e = month3;
        this.f47638d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.f47641g = month.mo40463p(month2) + 1;
            this.f47640f = (month2.f47659d - month.f47659d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
