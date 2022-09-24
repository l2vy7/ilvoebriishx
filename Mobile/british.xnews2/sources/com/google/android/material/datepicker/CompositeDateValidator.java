package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;
import p104l0.C5648h;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C10090c();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C10091d f47648d = new C10088a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C10091d f47649e = new C10089b();

    /* renamed from: b */
    private final C10091d f47650b;

    /* renamed from: c */
    private final List<CalendarConstraints.DateValidator> f47651c;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    static class C10088a implements C10091d {
        C10088a() {
        }

        /* renamed from: a */
        public boolean mo40412a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.mo40401h0(j)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    static class C10089b implements C10091d {
        C10089b() {
        }

        /* renamed from: a */
        public boolean mo40412a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.mo40401h0(j)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    static class C10090c implements Parcelable.Creator<CompositeDateValidator> {
        C10090c() {
        }

        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            C10091d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f47649e;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f47648d;
            } else {
                dVar = CompositeDateValidator.f47649e;
            }
            return new CompositeDateValidator((List) C5648h.m24964c(readArrayList), dVar, (C10088a) null);
        }

        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    private interface C10091d {
        /* renamed from: a */
        boolean mo40412a(List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    /* synthetic */ CompositeDateValidator(List list, C10091d dVar, C10088a aVar) {
        this(list, dVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f47651c.equals(compositeDateValidator.f47651c) || this.f47650b.getId() != compositeDateValidator.f47650b.getId()) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public boolean mo40401h0(long j) {
        return this.f47650b.mo40412a(this.f47651c, j);
    }

    public int hashCode() {
        return this.f47651c.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f47651c);
        parcel.writeInt(this.f47650b.getId());
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list, C10091d dVar) {
        this.f47651c = list;
        this.f47650b = dVar;
    }
}
