package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agl */
/* compiled from: IMASDK */
public final class agl implements C4506ym {
    public static final Parcelable.Creator<agl> CREATOR = new agj((byte[]) null);

    /* renamed from: a */
    public final String f14705a;

    /* renamed from: b */
    public final String f14706b;

    /* renamed from: c */
    public final List<agk> f14707c;

    agl(Parcel parcel) {
        this.f14705a = parcel.readString();
        this.f14706b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((agk) parcel.readParcelable(agk.class.getClassLoader()));
        }
        this.f14707c = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agl.class == obj.getClass()) {
            agl agl = (agl) obj;
            return TextUtils.equals(this.f14705a, agl.f14705a) && TextUtils.equals(this.f14706b, agl.f14706b) && this.f14707c.equals(agl.f14707c);
        }
    }

    public final int hashCode() {
        String str = this.f14705a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14706b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f14707c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f14705a;
        if (str2 != null) {
            String str3 = this.f14706b;
            StringBuilder sb = new StringBuilder(str2.length() + 5 + String.valueOf(str3).length());
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14705a);
        parcel.writeString(this.f14706b);
        int size = this.f14707c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f14707c.get(i2), 0);
        }
    }

    public agl(String str, String str2, List<agk> list) {
        this.f14705a = str;
        this.f14706b = str2;
        this.f14707c = Collections.unmodifiableList(new ArrayList(list));
    }
}
