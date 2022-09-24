package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0630a();

    /* renamed from: c */
    public static final AbsSavedState f3262c = new AbsSavedState() {
    };

    /* renamed from: b */
    private final Parcelable f3263b;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    static class C0630a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        C0630a() {
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3262c;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: a */
    public final Parcelable mo3233a() {
        return this.f3263b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3263b, i);
    }

    private AbsSavedState() {
        this.f3263b = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3263b = parcelable == f3262c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3263b = readParcelable == null ? f3262c : readParcelable;
    }
}
