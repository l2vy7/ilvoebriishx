package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import p257v4.C11058b;
import p258v5.C11060b;

public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    public static final Parcelable.Creator<Configuration> CREATOR = new C11060b();

    /* renamed from: b */
    private final int f46970b;

    /* renamed from: c */
    private final zzi[] f46971c;

    /* renamed from: d */
    private final String[] f46972d;

    /* renamed from: e */
    private final Map<String, zzi> f46973e = new TreeMap();

    public Configuration(int i, zzi[] zziArr, String[] strArr) {
        this.f46970b = i;
        this.f46971c = zziArr;
        for (zzi zzi : zziArr) {
            this.f46973e.put(zzi.f46989b, zzi);
        }
        this.f46972d = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f46970b - ((Configuration) obj).f46970b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.f46970b == configuration.f46970b && C9985f.m45576a(this.f46973e, configuration.f46973e) && Arrays.equals(this.f46972d, configuration.f46972d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f46970b);
        sb.append(", ");
        sb.append("(");
        for (zzi append : this.f46973e.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.f46972d;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f46970b);
        C11058b.m49540z(parcel, 3, this.f46971c, i, false);
        C11058b.m49538x(parcel, 4, this.f46972d, false);
        C11058b.m49516b(parcel, a);
    }
}
