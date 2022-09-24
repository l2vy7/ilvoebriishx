package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p117n1.C5791b;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1365a();

    /* renamed from: b */
    private final C5791b f6065b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1365a implements Parcelable.Creator<ParcelImpl> {
        C1365a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C5791b bVar) {
        this.f6065b = bVar;
    }

    /* renamed from: a */
    public <T extends C5791b> T mo6544a() {
        return this.f6065b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1367b(parcel).mo6562L(this.f6065b);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f6065b = new C1367b(parcel).mo6581u();
    }
}
