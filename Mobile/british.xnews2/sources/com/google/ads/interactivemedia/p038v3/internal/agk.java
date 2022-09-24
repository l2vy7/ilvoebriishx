package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agk */
/* compiled from: IMASDK */
public final class agk implements Parcelable {
    public static final Parcelable.Creator<agk> CREATOR = new agj();

    /* renamed from: a */
    public final int f14699a;

    /* renamed from: b */
    public final int f14700b;

    /* renamed from: c */
    public final String f14701c;

    /* renamed from: d */
    public final String f14702d;

    /* renamed from: e */
    public final String f14703e;

    /* renamed from: f */
    public final String f14704f;

    public agk(int i, int i2, String str, String str2, String str3, String str4) {
        this.f14699a = i;
        this.f14700b = i2;
        this.f14701c = str;
        this.f14702d = str2;
        this.f14703e = str3;
        this.f14704f = str4;
    }

    agk(Parcel parcel) {
        this.f14699a = parcel.readInt();
        this.f14700b = parcel.readInt();
        this.f14701c = parcel.readString();
        this.f14702d = parcel.readString();
        this.f14703e = parcel.readString();
        this.f14704f = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agk.class == obj.getClass()) {
            agk agk = (agk) obj;
            return this.f14699a == agk.f14699a && this.f14700b == agk.f14700b && TextUtils.equals(this.f14701c, agk.f14701c) && TextUtils.equals(this.f14702d, agk.f14702d) && TextUtils.equals(this.f14703e, agk.f14703e) && TextUtils.equals(this.f14704f, agk.f14704f);
        }
    }

    public final int hashCode() {
        int i = ((this.f14699a * 31) + this.f14700b) * 31;
        String str = this.f14701c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14702d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14703e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14704f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14699a);
        parcel.writeInt(this.f14700b);
        parcel.writeString(this.f14701c);
        parcel.writeString(this.f14702d);
        parcel.writeString(this.f14703e);
        parcel.writeString(this.f14704f);
    }
}
