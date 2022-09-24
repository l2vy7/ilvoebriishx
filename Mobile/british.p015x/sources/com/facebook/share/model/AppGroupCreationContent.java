package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C3707a();

    /* renamed from: b */
    private final String f13706b;

    /* renamed from: c */
    private final String f13707c;

    /* renamed from: d */
    private C3708b f13708d;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    static class C3707a implements Parcelable.Creator<AppGroupCreationContent> {
        C3707a() {
        }

        /* renamed from: a */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        /* renamed from: b */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$b */
    public enum C3708b {
        Open,
        Closed
    }

    AppGroupCreationContent(Parcel parcel) {
        this.f13706b = parcel.readString();
        this.f13707c = parcel.readString();
        this.f13708d = (C3708b) parcel.readSerializable();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13706b);
        parcel.writeString(this.f13707c);
        parcel.writeSerializable(this.f13708d);
    }
}
