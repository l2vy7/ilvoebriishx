package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahz */
/* compiled from: IMASDK */
public final class ahz extends ain {
    public static final Parcelable.Creator<ahz> CREATOR = new aib((byte[]) null);

    /* renamed from: a */
    public static final ahz f14909a = new aia().mo13760a();

    /* renamed from: A */
    public final boolean f14910A;

    /* renamed from: B */
    public final boolean f14911B;

    /* renamed from: J */
    private final SparseArray<Map<acq, aic>> f14912J;

    /* renamed from: K */
    private final SparseBooleanArray f14913K;

    /* renamed from: b */
    public final int f14914b;

    /* renamed from: c */
    public final int f14915c;

    /* renamed from: d */
    public final int f14916d;

    /* renamed from: e */
    public final int f14917e;

    /* renamed from: f */
    public final int f14918f;

    /* renamed from: g */
    public final int f14919g;

    /* renamed from: h */
    public final int f14920h;

    /* renamed from: i */
    public final int f14921i;

    /* renamed from: j */
    public final boolean f14922j;

    /* renamed from: k */
    public final boolean f14923k;

    /* renamed from: l */
    public final boolean f14924l;

    /* renamed from: m */
    public final int f14925m;

    /* renamed from: n */
    public final int f14926n;

    /* renamed from: o */
    public final boolean f14927o;

    /* renamed from: p */
    public final atz<String> f14928p;

    /* renamed from: q */
    public final int f14929q;

    /* renamed from: r */
    public final int f14930r;

    /* renamed from: s */
    public final boolean f14931s;

    /* renamed from: t */
    public final boolean f14932t;

    /* renamed from: u */
    public final boolean f14933u;

    /* renamed from: v */
    public final boolean f14934v;

    /* renamed from: w */
    public final atz<String> f14935w;

    /* renamed from: x */
    public final boolean f14936x;

    /* renamed from: y */
    public final boolean f14937y;

    /* renamed from: z */
    public final boolean f14938z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ahz(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, atz<String> atz, atz<String> atz2, int i7, int i8, boolean z4, atz<String> atz3, atz<String> atz4, int i9, boolean z5, boolean z6, SparseArray<Map<acq, aic>> sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(atz2, atz4, i9);
        atz<String> atz5 = atz2;
        this.f14914b = i;
        this.f14915c = i2;
        this.f14916d = i3;
        this.f14917e = i4;
        this.f14918f = 0;
        this.f14919g = 0;
        this.f14920h = 0;
        this.f14921i = 0;
        this.f14922j = z;
        this.f14923k = false;
        this.f14924l = z2;
        this.f14925m = i5;
        this.f14926n = i6;
        this.f14927o = z3;
        this.f14928p = atz;
        this.f14929q = i7;
        this.f14930r = i8;
        this.f14931s = z4;
        this.f14932t = false;
        this.f14933u = false;
        this.f14934v = false;
        this.f14935w = atz3;
        this.f14936x = false;
        this.f14937y = false;
        this.f14938z = z5;
        this.f14910A = false;
        this.f14911B = z6;
        this.f14912J = sparseArray;
        this.f14913K = sparseBooleanArray;
    }

    /* renamed from: a */
    public static ahz m13753a(Context context) {
        return new aia(context).mo13760a();
    }

    /* renamed from: b */
    public final boolean mo13753b(int i) {
        return this.f14913K.get(i);
    }

    /* renamed from: c */
    public final boolean mo13754c(int i, acq acq) {
        Map map = this.f14912J.get(i);
        return map != null && map.containsKey(acq);
    }

    /* renamed from: d */
    public final aic mo13755d(int i, acq acq) {
        Map map = this.f14912J.get(i);
        if (map != null) {
            return (aic) map.get(acq);
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ahz.class == obj.getClass()) {
            ahz ahz = (ahz) obj;
            if (super.equals(obj) && this.f14914b == ahz.f14914b && this.f14915c == ahz.f14915c && this.f14916d == ahz.f14916d && this.f14917e == ahz.f14917e && this.f14918f == ahz.f14918f && this.f14919g == ahz.f14919g && this.f14920h == ahz.f14920h && this.f14921i == ahz.f14921i && this.f14922j == ahz.f14922j && this.f14923k == ahz.f14923k && this.f14924l == ahz.f14924l && this.f14927o == ahz.f14927o && this.f14925m == ahz.f14925m && this.f14926n == ahz.f14926n && this.f14928p.equals(ahz.f14928p) && this.f14929q == ahz.f14929q && this.f14930r == ahz.f14930r && this.f14931s == ahz.f14931s && this.f14932t == ahz.f14932t && this.f14933u == ahz.f14933u && this.f14934v == ahz.f14934v && this.f14935w.equals(ahz.f14935w) && this.f14936x == ahz.f14936x && this.f14937y == ahz.f14937y && this.f14938z == ahz.f14938z && this.f14910A == ahz.f14910A && this.f14911B == ahz.f14911B) {
                SparseBooleanArray sparseBooleanArray = this.f14913K;
                SparseBooleanArray sparseBooleanArray2 = ahz.f14913K;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray<Map<acq, aic>> sparseArray = this.f14912J;
                            SparseArray<Map<acq, aic>> sparseArray2 = ahz.f14912J;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map valueAt = sparseArray.valueAt(i2);
                                        Map valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry entry : valueAt.entrySet()) {
                                                acq acq = (acq) entry.getKey();
                                                if (valueAt2.containsKey(acq)) {
                                                    if (!amm.m14233c(entry.getValue(), valueAt2.get(acq))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f14914b) * 31) + this.f14915c) * 31) + this.f14916d) * 31) + this.f14917e) * 31) + this.f14918f) * 31) + this.f14919g) * 31) + this.f14920h) * 31) + this.f14921i) * 31) + (this.f14922j ? 1 : 0)) * 31) + (this.f14923k ? 1 : 0)) * 31) + (this.f14924l ? 1 : 0)) * 31) + (this.f14927o ? 1 : 0)) * 31) + this.f14925m) * 31) + this.f14926n) * 31) + this.f14928p.hashCode()) * 31) + this.f14929q) * 31) + this.f14930r) * 31) + (this.f14931s ? 1 : 0)) * 31) + (this.f14932t ? 1 : 0)) * 31) + (this.f14933u ? 1 : 0)) * 31) + (this.f14934v ? 1 : 0)) * 31) + this.f14935w.hashCode()) * 31) + (this.f14936x ? 1 : 0)) * 31) + (this.f14937y ? 1 : 0)) * 31) + (this.f14938z ? 1 : 0)) * 31) + (this.f14910A ? 1 : 0)) * 31) + (this.f14911B ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14914b);
        parcel.writeInt(this.f14915c);
        parcel.writeInt(this.f14916d);
        parcel.writeInt(this.f14917e);
        parcel.writeInt(this.f14918f);
        parcel.writeInt(this.f14919g);
        parcel.writeInt(this.f14920h);
        parcel.writeInt(this.f14921i);
        amm.m14250t(parcel, this.f14922j);
        amm.m14250t(parcel, this.f14923k);
        amm.m14250t(parcel, this.f14924l);
        parcel.writeInt(this.f14925m);
        parcel.writeInt(this.f14926n);
        amm.m14250t(parcel, this.f14927o);
        parcel.writeList(this.f14928p);
        parcel.writeInt(this.f14929q);
        parcel.writeInt(this.f14930r);
        amm.m14250t(parcel, this.f14931s);
        amm.m14250t(parcel, this.f14932t);
        amm.m14250t(parcel, this.f14933u);
        amm.m14250t(parcel, this.f14934v);
        parcel.writeList(this.f14935w);
        amm.m14250t(parcel, this.f14936x);
        amm.m14250t(parcel, this.f14937y);
        amm.m14250t(parcel, this.f14938z);
        amm.m14250t(parcel, this.f14910A);
        amm.m14250t(parcel, this.f14911B);
        SparseArray<Map<acq, aic>> sparseArray = this.f14912J;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map valueAt = sparseArray.valueAt(i2);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : valueAt.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f14913K);
    }

    ahz(Parcel parcel) {
        super(parcel);
        this.f14914b = parcel.readInt();
        this.f14915c = parcel.readInt();
        this.f14916d = parcel.readInt();
        this.f14917e = parcel.readInt();
        this.f14918f = parcel.readInt();
        this.f14919g = parcel.readInt();
        this.f14920h = parcel.readInt();
        this.f14921i = parcel.readInt();
        this.f14922j = amm.m14249s(parcel);
        this.f14923k = amm.m14249s(parcel);
        this.f14924l = amm.m14249s(parcel);
        this.f14925m = parcel.readInt();
        this.f14926n = parcel.readInt();
        this.f14927o = amm.m14249s(parcel);
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f14928p = atz.m14811m(arrayList);
        this.f14929q = parcel.readInt();
        this.f14930r = parcel.readInt();
        this.f14931s = amm.m14249s(parcel);
        this.f14932t = amm.m14249s(parcel);
        this.f14933u = amm.m14249s(parcel);
        this.f14934v = amm.m14249s(parcel);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f14935w = atz.m14811m(arrayList2);
        this.f14936x = amm.m14249s(parcel);
        this.f14937y = amm.m14249s(parcel);
        this.f14938z = amm.m14249s(parcel);
        this.f14910A = amm.m14249s(parcel);
        this.f14911B = amm.m14249s(parcel);
        int readInt = parcel.readInt();
        SparseArray<Map<acq, aic>> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                acq acq = (acq) parcel.readParcelable(acq.class.getClassLoader());
                aup.m14890u(acq);
                hashMap.put(acq, (aic) parcel.readParcelable(aic.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.f14912J = sparseArray;
        this.f14913K = parcel.readSparseBooleanArray();
    }
}
