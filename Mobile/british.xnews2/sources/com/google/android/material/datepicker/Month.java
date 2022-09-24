package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C10095a();

    /* renamed from: b */
    private final Calendar f47657b;

    /* renamed from: c */
    final int f47658c;

    /* renamed from: d */
    final int f47659d;

    /* renamed from: e */
    final int f47660e;

    /* renamed from: f */
    final int f47661f;

    /* renamed from: g */
    final long f47662g;

    /* renamed from: h */
    private String f47663h;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    static class C10095a implements Parcelable.Creator<Month> {
        C10095a() {
        }

        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m46469b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = C10138p.m46650f(calendar);
        this.f47657b = f;
        this.f47658c = f.get(2);
        this.f47659d = f.get(1);
        this.f47660e = f.getMaximum(7);
        this.f47661f = f.getActualMaximum(5);
        this.f47662g = f.getTimeInMillis();
    }

    /* renamed from: b */
    static Month m46469b(int i, int i2) {
        Calendar q = C10138p.m46661q();
        q.set(1, i);
        q.set(2, i2);
        return new Month(q);
    }

    /* renamed from: d */
    static Month m46470d(long j) {
        Calendar q = C10138p.m46661q();
        q.setTimeInMillis(j);
        return new Month(q);
    }

    /* renamed from: i */
    static Month m46471i() {
        return new Month(C10138p.m46659o());
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f47657b.compareTo(month.f47657b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f47658c == month.f47658c && this.f47659d == month.f47659d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47658c), Integer.valueOf(this.f47659d)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo40457j() {
        int firstDayOfWeek = this.f47657b.get(7) - this.f47657b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f47660e : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public long mo40458k(int i) {
        Calendar f = C10138p.m46650f(this.f47657b);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo40459l(long j) {
        Calendar f = C10138p.m46650f(this.f47657b);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo40460m(Context context) {
        if (this.f47663h == null) {
            this.f47663h = C10106d.m46541i(context, this.f47657b.getTimeInMillis());
        }
        return this.f47663h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public long mo40461n() {
        return this.f47657b.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Month mo40462o(int i) {
        Calendar f = C10138p.m46650f(this.f47657b);
        f.add(2, i);
        return new Month(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo40463p(Month month) {
        if (this.f47657b instanceof GregorianCalendar) {
            return ((month.f47659d - this.f47659d) * 12) + (month.f47658c - this.f47658c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f47659d);
        parcel.writeInt(this.f47658c);
    }
}
