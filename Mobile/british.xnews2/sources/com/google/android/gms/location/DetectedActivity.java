package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import p250s5.C10984o;
import p256v4.C11058b;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C10984o();

    /* renamed from: d */
    private static final Comparator<DetectedActivity> f46072d = new C9702j();

    /* renamed from: e */
    private static final int[] f46073e = {9, 10};

    /* renamed from: f */
    private static final int[] f46074f = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: g */
    private static final int[] f46075g = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: b */
    private int f46076b;

    /* renamed from: c */
    private int f46077c;

    public DetectedActivity(int i, int i2) {
        this.f46076b = i;
        this.f46077c = i2;
    }

    /* renamed from: E0 */
    public static void m44934E0(int i) {
        boolean z = false;
        for (int i2 : f46075g) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    /* renamed from: C0 */
    public int mo38702C0() {
        return this.f46077c;
    }

    /* renamed from: D0 */
    public int mo38703D0() {
        int i = this.f46076b;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f46076b == detectedActivity.f46076b && this.f46077c == detectedActivity.f46077c;
        }
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46076b), Integer.valueOf(this.f46077c));
    }

    public String toString() {
        String str;
        int D0 = mo38703D0();
        if (D0 == 0) {
            str = "IN_VEHICLE";
        } else if (D0 == 1) {
            str = "ON_BICYCLE";
        } else if (D0 == 2) {
            str = "ON_FOOT";
        } else if (D0 == 3) {
            str = "STILL";
        } else if (D0 == 4) {
            str = "UNKNOWN";
        } else if (D0 == 5) {
            str = "TILTING";
        } else if (D0 == 7) {
            str = "WALKING";
        } else if (D0 != 8) {
            switch (D0) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(D0);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f46077c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f46076b);
        C11058b.m49527m(parcel, 2, this.f46077c);
        C11058b.m49516b(parcel, a);
    }
}
