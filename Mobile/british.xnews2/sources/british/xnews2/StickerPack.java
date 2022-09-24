package british.xnews2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

class StickerPack implements Parcelable {
    public static final Parcelable.Creator<StickerPack> CREATOR = new C1591a();

    /* renamed from: b */
    final String f6823b;

    /* renamed from: c */
    final String f6824c;

    /* renamed from: d */
    final String f6825d;

    /* renamed from: e */
    final String f6826e;

    /* renamed from: f */
    final String f6827f;

    /* renamed from: g */
    final String f6828g;

    /* renamed from: h */
    final String f6829h;

    /* renamed from: i */
    final String f6830i;

    /* renamed from: j */
    final String f6831j;

    /* renamed from: k */
    final boolean f6832k;

    /* renamed from: l */
    final boolean f6833l;

    /* renamed from: m */
    String f6834m;

    /* renamed from: n */
    private List<Sticker> f6835n;

    /* renamed from: o */
    private long f6836o;

    /* renamed from: p */
    String f6837p;

    /* renamed from: q */
    private boolean f6838q;

    /* renamed from: british.xnews2.StickerPack$a */
    class C1591a implements Parcelable.Creator<StickerPack> {
        C1591a() {
        }

        /* renamed from: a */
        public StickerPack createFromParcel(Parcel parcel) {
            return new StickerPack(parcel);
        }

        /* renamed from: b */
        public StickerPack[] newArray(int i) {
            return new StickerPack[i];
        }
    }

    StickerPack(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.f6823b = str;
        this.f6824c = str2;
        this.f6825d = str3;
        this.f6826e = str4;
        this.f6827f = str5;
        this.f6828g = str6;
        this.f6829h = str7;
        this.f6830i = str8;
        this.f6831j = str9;
        this.f6832k = z;
        this.f6833l = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<Sticker> mo7291a() {
        return this.f6835n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7292b(List<Sticker> list) {
        this.f6835n = list;
        this.f6836o = 0;
        for (Sticker sticker : list) {
            this.f6836o += sticker.f6819d;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6823b);
        parcel.writeString(this.f6824c);
        parcel.writeString(this.f6825d);
        parcel.writeString(this.f6826e);
        parcel.writeString(this.f6827f);
        parcel.writeString(this.f6828g);
        parcel.writeString(this.f6829h);
        parcel.writeString(this.f6830i);
        parcel.writeString(this.f6834m);
        parcel.writeTypedList(this.f6835n);
        parcel.writeLong(this.f6836o);
        parcel.writeString(this.f6837p);
        parcel.writeByte(this.f6838q ? (byte) 1 : 0);
        parcel.writeString(this.f6831j);
        parcel.writeByte(this.f6832k ? (byte) 1 : 0);
        parcel.writeByte(this.f6833l ? (byte) 1 : 0);
    }

    private StickerPack(Parcel parcel) {
        this.f6823b = parcel.readString();
        this.f6824c = parcel.readString();
        this.f6825d = parcel.readString();
        this.f6826e = parcel.readString();
        this.f6827f = parcel.readString();
        this.f6828g = parcel.readString();
        this.f6829h = parcel.readString();
        this.f6830i = parcel.readString();
        this.f6834m = parcel.readString();
        this.f6835n = parcel.createTypedArrayList(Sticker.CREATOR);
        this.f6836o = parcel.readLong();
        this.f6837p = parcel.readString();
        boolean z = true;
        this.f6838q = parcel.readByte() != 0;
        this.f6831j = parcel.readString();
        this.f6832k = parcel.readByte() != 0;
        this.f6833l = parcel.readByte() == 0 ? false : z;
    }
}
