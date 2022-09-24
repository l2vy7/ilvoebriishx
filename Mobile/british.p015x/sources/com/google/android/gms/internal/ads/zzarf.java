package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzarf implements Comparator<zzare>, Parcelable {
    public static final Parcelable.Creator<zzarf> CREATOR = new C7978ng();

    /* renamed from: b */
    private final zzare[] f42895b;

    /* renamed from: c */
    private int f42896c;

    /* renamed from: d */
    public final int f42897d;

    zzarf(Parcel parcel) {
        zzare[] zzareArr = (zzare[]) parcel.createTypedArray(zzare.CREATOR);
        this.f42895b = zzareArr;
        this.f42897d = zzareArr.length;
    }

    /* renamed from: a */
    public final zzare mo36199a(int i) {
        return this.f42895b[i];
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzare zzare = (zzare) obj;
        zzare zzare2 = (zzare) obj2;
        UUID uuid = C7500ae.f29613b;
        if (uuid.equals(zzare.f42891c)) {
            return !uuid.equals(zzare2.f42891c) ? 1 : 0;
        }
        return zzare.f42891c.compareTo(zzare2.f42891c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzarf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f42895b, ((zzarf) obj).f42895b);
    }

    public final int hashCode() {
        int i = this.f42896c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f42895b);
        this.f42896c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f42895b, 0);
    }

    public zzarf(List<zzare> list) {
        this(false, (zzare[]) list.toArray(new zzare[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.zzare[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzarf(boolean r3, com.google.android.gms.internal.ads.zzare... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzare[] r4 = (com.google.android.gms.internal.ads.zzare[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0040
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f42891c
            r1 = r4[r3]
            java.util.UUID r1 = r1.f42891c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f42891c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Duplicate data for uuid: "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            throw r0
        L_0x0040:
            r2.f42895b = r4
            r2.f42897d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarf.<init>(boolean, com.google.android.gms.internal.ads.zzare[]):void");
    }

    public zzarf(zzare... zzareArr) {
        this(true, zzareArr);
    }
}
