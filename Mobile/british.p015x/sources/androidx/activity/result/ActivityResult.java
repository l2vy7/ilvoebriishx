package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0203a();

    /* renamed from: b */
    private final int f526b;

    /* renamed from: c */
    private final Intent f527c;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    class C0203a implements Parcelable.Creator<ActivityResult> {
        C0203a() {
        }

        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f526b = i;
        this.f527c = intent;
    }

    /* renamed from: d */
    public static String m918d(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    /* renamed from: a */
    public Intent mo675a() {
        return this.f527c;
    }

    /* renamed from: b */
    public int mo676b() {
        return this.f526b;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m918d(this.f526b) + ", data=" + this.f527c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f526b);
        parcel.writeInt(this.f527c == null ? 0 : 1);
        Intent intent = this.f527c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f526b = parcel.readInt();
        this.f527c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
