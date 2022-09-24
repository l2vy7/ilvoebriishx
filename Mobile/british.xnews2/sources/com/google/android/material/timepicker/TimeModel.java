package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C10365a();

    /* renamed from: b */
    private final C10373a f48748b;

    /* renamed from: c */
    private final C10373a f48749c;

    /* renamed from: d */
    final int f48750d;

    /* renamed from: e */
    int f48751e;

    /* renamed from: f */
    int f48752f;

    /* renamed from: g */
    int f48753g;

    /* renamed from: h */
    int f48754h;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    static class C10365a implements Parcelable.Creator<TimeModel> {
        C10365a() {
        }

        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m47868a(Resources resources, CharSequence charSequence) {
        return m47869b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m47869b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: d */
    private static int m47870d(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f48751e == timeModel.f48751e && this.f48752f == timeModel.f48752f && this.f48750d == timeModel.f48750d && this.f48753g == timeModel.f48753g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48750d), Integer.valueOf(this.f48751e), Integer.valueOf(this.f48752f), Integer.valueOf(this.f48753g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48751e);
        parcel.writeInt(this.f48752f);
        parcel.writeInt(this.f48753g);
        parcel.writeInt(this.f48750d);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f48751e = i;
        this.f48752f = i2;
        this.f48753g = i3;
        this.f48750d = i4;
        this.f48754h = m47870d(i);
        this.f48748b = new C10373a(59);
        this.f48749c = new C10373a(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
