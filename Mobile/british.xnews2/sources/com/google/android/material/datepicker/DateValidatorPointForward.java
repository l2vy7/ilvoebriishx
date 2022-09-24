package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C10093a();

    /* renamed from: b */
    private final long f47653b;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    static class C10093a implements Parcelable.Creator<DateValidatorPointForward> {
        C10093a() {
        }

        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C10093a) null);
        }

        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C10093a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m46460a(long j) {
        return new DateValidatorPointForward(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f47653b == ((DateValidatorPointForward) obj).f47653b) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public boolean mo40401h0(long j) {
        return j >= this.f47653b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47653b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f47653b);
    }

    private DateValidatorPointForward(long j) {
        this.f47653b = j;
    }
}
