package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yn */
/* compiled from: IMASDK */
public final class C4507yn implements Parcelable {
    public static final Parcelable.Creator<C4507yn> CREATOR = new C4505yl();

    /* renamed from: a */
    private final C4506ym[] f19689a;

    C4507yn(Parcel parcel) {
        this.f19689a = new C4506ym[parcel.readInt()];
        int i = 0;
        while (true) {
            C4506ym[] ymVarArr = this.f19689a;
            if (i < ymVarArr.length) {
                ymVarArr[i] = (C4506ym) parcel.readParcelable(C4506ym.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C4507yn(C4506ym... ymVarArr) {
        this.f19689a = ymVarArr;
    }

    /* renamed from: a */
    public final int mo16831a() {
        return this.f19689a.length;
    }

    /* renamed from: b */
    public final C4506ym mo16832b(int i) {
        return this.f19689a[i];
    }

    /* renamed from: c */
    public final C4507yn mo16833c(C4507yn ynVar) {
        return ynVar == null ? this : mo16834d(ynVar.f19689a);
    }

    /* renamed from: d */
    public final C4507yn mo16834d(C4506ym... ymVarArr) {
        if (ymVarArr.length == 0) {
            return this;
        }
        return new C4507yn((C4506ym[]) amm.m14240j(this.f19689a, ymVarArr));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4507yn.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19689a, ((C4507yn) obj).f19689a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19689a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f19689a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19689a.length);
        for (C4506ym writeParcelable : this.f19689a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4507yn(List<? extends C4506ym> list) {
        this.f19689a = (C4506ym[]) list.toArray(new C4506ym[0]);
    }
}
