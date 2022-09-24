package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aco */
/* compiled from: IMASDK */
public final class aco implements Parcelable {
    public static final Parcelable.Creator<aco> CREATOR = new acp((byte[]) null);

    /* renamed from: a */
    public final int f14188a;

    /* renamed from: b */
    private final C4120ke[] f14189b;

    /* renamed from: c */
    private int f14190c;

    aco(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f14188a = readInt;
        this.f14189b = new C4120ke[readInt];
        for (int i = 0; i < this.f14188a; i++) {
            this.f14189b[i] = (C4120ke) parcel.readParcelable(C4120ke.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final C4120ke mo13445a(int i) {
        return this.f14189b[i];
    }

    /* renamed from: b */
    public final int mo13446b(C4120ke keVar) {
        int i = 0;
        while (true) {
            C4120ke[] keVarArr = this.f14189b;
            if (i >= keVarArr.length) {
                return -1;
            }
            if (keVar == keVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aco.class == obj.getClass()) {
            aco aco = (aco) obj;
            return this.f14188a == aco.f14188a && Arrays.equals(this.f14189b, aco.f14189b);
        }
    }

    public final int hashCode() {
        int i = this.f14190c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14189b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f14190c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14188a);
        for (int i2 = 0; i2 < this.f14188a; i2++) {
            parcel.writeParcelable(this.f14189b[i2], 0);
        }
    }

    public aco(C4120ke... keVarArr) {
        int length = keVarArr.length;
        aup.m14887r(length > 0);
        this.f14189b = keVarArr;
        this.f14188a = length;
    }
}
