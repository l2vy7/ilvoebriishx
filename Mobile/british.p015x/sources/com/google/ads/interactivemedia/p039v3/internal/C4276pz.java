package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pz */
/* compiled from: IMASDK */
public final class C4276pz implements Comparator<C4275py>, Parcelable {
    public static final Parcelable.Creator<C4276pz> CREATOR = new C4274px((byte[]) null);

    /* renamed from: a */
    public final String f18417a;

    /* renamed from: b */
    public final int f18418b;

    /* renamed from: c */
    private final C4275py[] f18419c;

    /* renamed from: d */
    private int f18420d;

    C4276pz(Parcel parcel) {
        this.f18417a = parcel.readString();
        C4275py[] pyVarArr = (C4275py[]) amm.m14236f((C4275py[]) parcel.createTypedArray(C4275py.CREATOR));
        this.f18419c = pyVarArr;
        this.f18418b = pyVarArr.length;
    }

    /* renamed from: a */
    public static C4276pz m18604a(C4276pz pzVar, C4276pz pzVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (pzVar != null) {
            str = pzVar.f18417a;
            for (C4275py pyVar : pzVar.f18419c) {
                if (pyVar.mo16533b()) {
                    arrayList.add(pyVar);
                }
            }
        } else {
            str = null;
        }
        if (pzVar2 != null) {
            if (str == null) {
                str = pzVar2.f18417a;
            }
            int size = arrayList.size();
            for (C4275py pyVar2 : pzVar2.f18419c) {
                if (pyVar2.mo16533b()) {
                    UUID uuid = pyVar2.f18412a;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(pyVar2);
                            break;
                        } else if (((C4275py) arrayList.get(i)).f18412a.equals(uuid)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4276pz(str, (List<C4275py>) arrayList);
    }

    /* renamed from: b */
    public final C4276pz mo16539b(String str) {
        if (amm.m14233c(this.f18417a, str)) {
            return this;
        }
        return new C4276pz(str, false, this.f18419c);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4275py pyVar = (C4275py) obj;
        C4275py pyVar2 = (C4275py) obj2;
        UUID uuid = C4083iv.f17461a;
        if (uuid.equals(pyVar.f18412a)) {
            return !uuid.equals(pyVar2.f18412a) ? 1 : 0;
        }
        return pyVar.f18412a.compareTo(pyVar2.f18412a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4276pz.class == obj.getClass()) {
            C4276pz pzVar = (C4276pz) obj;
            return amm.m14233c(this.f18417a, pzVar.f18417a) && Arrays.equals(this.f18419c, pzVar.f18419c);
        }
    }

    public final int hashCode() {
        int i = this.f18420d;
        if (i != 0) {
            return i;
        }
        String str = this.f18417a;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18419c);
        this.f18420d = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18417a);
        parcel.writeTypedArray(this.f18419c, 0);
    }

    public C4276pz(String str, List<C4275py> list) {
        this(str, false, (C4275py[]) list.toArray(new C4275py[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.ads.interactivemedia.v3.internal.py[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4276pz(java.lang.String r1, boolean r2, com.google.ads.interactivemedia.p039v3.internal.C4275py... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f18417a = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.ads.interactivemedia.v3.internal.py[] r3 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r3
        L_0x000e:
            r0.f18419c = r3
            int r1 = r3.length
            r0.f18418b = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4276pz.<init>(java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.py[]):void");
    }

    public C4276pz(String str, C4275py... pyVarArr) {
        this(str, true, pyVarArr);
    }

    public C4276pz(List<C4275py> list) {
        this((String) null, false, (C4275py[]) list.toArray(new C4275py[0]));
    }
}
