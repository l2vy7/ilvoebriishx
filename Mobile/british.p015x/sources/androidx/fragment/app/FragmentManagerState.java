package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0670a();

    /* renamed from: b */
    ArrayList<FragmentState> f3496b;

    /* renamed from: c */
    ArrayList<String> f3497c;

    /* renamed from: d */
    BackStackState[] f3498d;

    /* renamed from: e */
    int f3499e;

    /* renamed from: f */
    String f3500f = null;

    /* renamed from: g */
    ArrayList<String> f3501g = new ArrayList<>();

    /* renamed from: h */
    ArrayList<Bundle> f3502h = new ArrayList<>();

    /* renamed from: i */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3503i;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    class C0670a implements Parcelable.Creator<FragmentManagerState> {
        C0670a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3496b);
        parcel.writeStringList(this.f3497c);
        parcel.writeTypedArray(this.f3498d, i);
        parcel.writeInt(this.f3499e);
        parcel.writeString(this.f3500f);
        parcel.writeStringList(this.f3501g);
        parcel.writeTypedList(this.f3502h);
        parcel.writeTypedList(this.f3503i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3496b = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3497c = parcel.createStringArrayList();
        this.f3498d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3499e = parcel.readInt();
        this.f3500f = parcel.readString();
        this.f3501g = parcel.createStringArrayList();
        this.f3502h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3503i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
