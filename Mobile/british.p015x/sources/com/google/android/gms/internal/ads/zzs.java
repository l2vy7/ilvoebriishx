package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new c44();

    /* renamed from: b */
    private final zzr[] f43063b;

    /* renamed from: c */
    private int f43064c;

    /* renamed from: d */
    public final String f43065d;

    zzs(Parcel parcel) {
        this.f43065d = parcel.readString();
        zzr[] zzrArr = (zzr[]) d13.m20300c((zzr[]) parcel.createTypedArray(zzr.CREATOR));
        this.f43063b = zzrArr;
        int length = zzrArr.length;
    }

    /* renamed from: a */
    public final zzs mo36292a(String str) {
        if (d13.m20317p(this.f43065d, str)) {
            return this;
        }
        return new zzs(str, false, this.f43063b);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzr zzr = (zzr) obj;
        zzr zzr2 = (zzr) obj2;
        UUID uuid = xy3.f41582a;
        if (uuid.equals(zzr.f43059c)) {
            return !uuid.equals(zzr2.f43059c) ? 1 : 0;
        }
        return zzr.f43059c.compareTo(zzr2.f43059c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzs = (zzs) obj;
            return d13.m20317p(this.f43065d, zzs.f43065d) && Arrays.equals(this.f43063b, zzs.f43063b);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.f43064c;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f43065d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f43063b);
        this.f43064c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43065d);
        parcel.writeTypedArray(this.f43063b, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzr[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzs(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzr... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f43065d = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzr[] r3 = (com.google.android.gms.internal.ads.zzr[]) r3
        L_0x000e:
            r0.f43063b = r3
            int r1 = r3.length
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzs.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzr[]):void");
    }

    public zzs(String str, zzr... zzrArr) {
        this((String) null, true, zzrArr);
    }

    public zzs(List<zzr> list) {
        this((String) null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}
