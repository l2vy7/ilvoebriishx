package com.facebook.share.model;

import android.os.Parcel;

@Deprecated
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: b */
    private final String f13749b;

    ShareMessengerActionButton(Parcel parcel) {
        this.f13749b = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13749b);
    }
}
