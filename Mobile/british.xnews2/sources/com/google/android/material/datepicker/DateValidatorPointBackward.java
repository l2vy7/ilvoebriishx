package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C10092a();

    /* renamed from: b */
    private final long f47652b;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    static class C10092a implements Parcelable.Creator<DateValidatorPointBackward> {
        C10092a() {
        }

        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C10092a) null);
        }

        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j, C10092a aVar) {
        this(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointBackward) && this.f47652b == ((DateValidatorPointBackward) obj).f47652b) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public boolean mo40401h0(long j) {
        return j <= this.f47652b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47652b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f47652b);
    }

    private DateValidatorPointBackward(long j) {
        this.f47652b = j;
    }
}
