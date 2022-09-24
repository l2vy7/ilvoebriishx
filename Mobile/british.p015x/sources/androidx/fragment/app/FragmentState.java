package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0671a();

    /* renamed from: b */
    final String f3504b;

    /* renamed from: c */
    final String f3505c;

    /* renamed from: d */
    final boolean f3506d;

    /* renamed from: e */
    final int f3507e;

    /* renamed from: f */
    final int f3508f;

    /* renamed from: g */
    final String f3509g;

    /* renamed from: h */
    final boolean f3510h;

    /* renamed from: i */
    final boolean f3511i;

    /* renamed from: j */
    final boolean f3512j;

    /* renamed from: k */
    final Bundle f3513k;

    /* renamed from: l */
    final boolean f3514l;

    /* renamed from: m */
    final int f3515m;

    /* renamed from: n */
    Bundle f3516n;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    class C0671a implements Parcelable.Creator<FragmentState> {
        C0671a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f3504b = fragment.getClass().getName();
        this.f3505c = fragment.f3368g;
        this.f3506d = fragment.f3376o;
        this.f3507e = fragment.f3385x;
        this.f3508f = fragment.f3386y;
        this.f3509g = fragment.f3387z;
        this.f3510h = fragment.f3339C;
        this.f3511i = fragment.f3375n;
        this.f3512j = fragment.f3338B;
        this.f3513k = fragment.f3369h;
        this.f3514l = fragment.f3337A;
        this.f3515m = fragment.f3355S.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3504b);
        sb.append(" (");
        sb.append(this.f3505c);
        sb.append(")}:");
        if (this.f3506d) {
            sb.append(" fromLayout");
        }
        if (this.f3508f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3508f));
        }
        String str = this.f3509g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3509g);
        }
        if (this.f3510h) {
            sb.append(" retainInstance");
        }
        if (this.f3511i) {
            sb.append(" removing");
        }
        if (this.f3512j) {
            sb.append(" detached");
        }
        if (this.f3514l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3504b);
        parcel.writeString(this.f3505c);
        parcel.writeInt(this.f3506d ? 1 : 0);
        parcel.writeInt(this.f3507e);
        parcel.writeInt(this.f3508f);
        parcel.writeString(this.f3509g);
        parcel.writeInt(this.f3510h ? 1 : 0);
        parcel.writeInt(this.f3511i ? 1 : 0);
        parcel.writeInt(this.f3512j ? 1 : 0);
        parcel.writeBundle(this.f3513k);
        parcel.writeInt(this.f3514l ? 1 : 0);
        parcel.writeBundle(this.f3516n);
        parcel.writeInt(this.f3515m);
    }

    FragmentState(Parcel parcel) {
        this.f3504b = parcel.readString();
        this.f3505c = parcel.readString();
        boolean z = true;
        this.f3506d = parcel.readInt() != 0;
        this.f3507e = parcel.readInt();
        this.f3508f = parcel.readInt();
        this.f3509g = parcel.readString();
        this.f3510h = parcel.readInt() != 0;
        this.f3511i = parcel.readInt() != 0;
        this.f3512j = parcel.readInt() != 0;
        this.f3513k = parcel.readBundle();
        this.f3514l = parcel.readInt() == 0 ? false : z;
        this.f3516n = parcel.readBundle();
        this.f3515m = parcel.readInt();
    }
}
