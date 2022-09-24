package android.support.p007v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0176a();

    /* renamed from: b */
    public int f445b;

    /* renamed from: c */
    public int f446c;

    /* renamed from: d */
    public int f447d;

    /* renamed from: e */
    public int f448e;

    /* renamed from: f */
    public int f449f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0176a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0176a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f445b = i;
        this.f446c = i2;
        this.f447d = i3;
        this.f448e = i4;
        this.f449f = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f445b);
        parcel.writeInt(this.f447d);
        parcel.writeInt(this.f448e);
        parcel.writeInt(this.f449f);
        parcel.writeInt(this.f446c);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f445b = parcel.readInt();
        this.f447d = parcel.readInt();
        this.f448e = parcel.readInt();
        this.f449f = parcel.readInt();
        this.f446c = parcel.readInt();
    }
}
