package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ain */
/* compiled from: IMASDK */
public class ain implements Parcelable {

    /* renamed from: C */
    public static final ain f14996C;
    public static final Parcelable.Creator<ain> CREATOR = new aib((char[]) null);

    /* renamed from: D */
    public final atz<String> f14997D;

    /* renamed from: E */
    public final int f14998E;

    /* renamed from: F */
    public final atz<String> f14999F;

    /* renamed from: G */
    public final int f15000G;

    /* renamed from: H */
    public final boolean f15001H;

    /* renamed from: I */
    public final int f15002I;

    static {
        aim aim = new aim();
        f14996C = new ain(aim.f14993a, aim.f14994b, aim.f14995c);
    }

    ain(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f14997D = atz.m14811m(arrayList);
        this.f14998E = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f14999F = atz.m14811m(arrayList2);
        this.f15000G = parcel.readInt();
        this.f15001H = amm.m14249s(parcel);
        this.f15002I = parcel.readInt();
    }

    ain(atz<String> atz, atz<String> atz2, int i) {
        this.f14997D = atz;
        this.f14998E = 0;
        this.f14999F = atz2;
        this.f15000G = i;
        this.f15001H = false;
        this.f15002I = 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ain ain = (ain) obj;
            return this.f14997D.equals(ain.f14997D) && this.f14998E == ain.f14998E && this.f14999F.equals(ain.f14999F) && this.f15000G == ain.f15000G && this.f15001H == ain.f15001H && this.f15002I == ain.f15002I;
        }
    }

    public int hashCode() {
        return ((((((((((this.f14997D.hashCode() + 31) * 31) + this.f14998E) * 31) + this.f14999F.hashCode()) * 31) + this.f15000G) * 31) + (this.f15001H ? 1 : 0)) * 31) + this.f15002I;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f14997D);
        parcel.writeInt(this.f14998E);
        parcel.writeList(this.f14999F);
        parcel.writeInt(this.f15000G);
        amm.m14250t(parcel, this.f15001H);
        parcel.writeInt(this.f15002I);
    }
}
