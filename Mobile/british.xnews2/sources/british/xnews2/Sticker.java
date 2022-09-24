package british.xnews2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

class Sticker implements Parcelable {
    public static final Parcelable.Creator<Sticker> CREATOR = new C1590a();

    /* renamed from: b */
    final String f6817b;

    /* renamed from: c */
    final List<String> f6818c;

    /* renamed from: d */
    long f6819d;

    /* renamed from: british.xnews2.Sticker$a */
    class C1590a implements Parcelable.Creator<Sticker> {
        C1590a() {
        }

        /* renamed from: a */
        public Sticker createFromParcel(Parcel parcel) {
            return new Sticker(parcel);
        }

        /* renamed from: b */
        public Sticker[] newArray(int i) {
            return new Sticker[i];
        }
    }

    Sticker(String str, List<String> list) {
        this.f6817b = str;
        this.f6818c = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6817b);
        parcel.writeStringList(this.f6818c);
        parcel.writeLong(this.f6819d);
    }

    private Sticker(Parcel parcel) {
        this.f6817b = parcel.readString();
        this.f6818c = parcel.createStringArrayList();
        this.f6819d = parcel.readLong();
    }
}
