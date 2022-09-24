package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0720q;
import androidx.lifecycle.C0769d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0638a();

    /* renamed from: b */
    final int[] f3322b;

    /* renamed from: c */
    final ArrayList<String> f3323c;

    /* renamed from: d */
    final int[] f3324d;

    /* renamed from: e */
    final int[] f3325e;

    /* renamed from: f */
    final int f3326f;

    /* renamed from: g */
    final String f3327g;

    /* renamed from: h */
    final int f3328h;

    /* renamed from: i */
    final int f3329i;

    /* renamed from: j */
    final CharSequence f3330j;

    /* renamed from: k */
    final int f3331k;

    /* renamed from: l */
    final CharSequence f3332l;

    /* renamed from: m */
    final ArrayList<String> f3333m;

    /* renamed from: n */
    final ArrayList<String> f3334n;

    /* renamed from: o */
    final boolean f3335o;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    class C0638a implements Parcelable.Creator<BackStackState> {
        C0638a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C0674a aVar) {
        int size = aVar.f3650c.size();
        this.f3322b = new int[(size * 5)];
        if (aVar.f3656i) {
            this.f3323c = new ArrayList<>(size);
            this.f3324d = new int[size];
            this.f3325e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0720q.C0721a aVar2 = aVar.f3650c.get(i);
                int i3 = i2 + 1;
                this.f3322b[i2] = aVar2.f3667a;
                ArrayList<String> arrayList = this.f3323c;
                Fragment fragment = aVar2.f3668b;
                arrayList.add(fragment != null ? fragment.f3368g : null);
                int[] iArr = this.f3322b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3669c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3670d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3671e;
                iArr[i6] = aVar2.f3672f;
                this.f3324d[i] = aVar2.f3673g.ordinal();
                this.f3325e[i] = aVar2.f3674h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f3326f = aVar.f3655h;
            this.f3327g = aVar.f3658k;
            this.f3328h = aVar.f3531v;
            this.f3329i = aVar.f3659l;
            this.f3330j = aVar.f3660m;
            this.f3331k = aVar.f3661n;
            this.f3332l = aVar.f3662o;
            this.f3333m = aVar.f3663p;
            this.f3334n = aVar.f3664q;
            this.f3335o = aVar.f3665r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0674a mo3334a(FragmentManager fragmentManager) {
        C0674a aVar = new C0674a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f3322b.length) {
            C0720q.C0721a aVar2 = new C0720q.C0721a();
            int i3 = i + 1;
            aVar2.f3667a = this.f3322b[i];
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3322b[i3]);
            }
            String str = this.f3323c.get(i2);
            if (str != null) {
                aVar2.f3668b = fragmentManager.mo3586h0(str);
            } else {
                aVar2.f3668b = null;
            }
            aVar2.f3673g = C0769d.C0772c.values()[this.f3324d[i2]];
            aVar2.f3674h = C0769d.C0772c.values()[this.f3325e[i2]];
            int[] iArr = this.f3322b;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f3669c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f3670d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f3671e = i9;
            int i10 = iArr[i8];
            aVar2.f3672f = i10;
            aVar.f3651d = i5;
            aVar.f3652e = i7;
            aVar.f3653f = i9;
            aVar.f3654g = i10;
            aVar.mo3853e(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f3655h = this.f3326f;
        aVar.f3658k = this.f3327g;
        aVar.f3531v = this.f3328h;
        aVar.f3656i = true;
        aVar.f3659l = this.f3329i;
        aVar.f3660m = this.f3330j;
        aVar.f3661n = this.f3331k;
        aVar.f3662o = this.f3332l;
        aVar.f3663p = this.f3333m;
        aVar.f3664q = this.f3334n;
        aVar.f3665r = this.f3335o;
        aVar.mo3679r(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3322b);
        parcel.writeStringList(this.f3323c);
        parcel.writeIntArray(this.f3324d);
        parcel.writeIntArray(this.f3325e);
        parcel.writeInt(this.f3326f);
        parcel.writeString(this.f3327g);
        parcel.writeInt(this.f3328h);
        parcel.writeInt(this.f3329i);
        TextUtils.writeToParcel(this.f3330j, parcel, 0);
        parcel.writeInt(this.f3331k);
        TextUtils.writeToParcel(this.f3332l, parcel, 0);
        parcel.writeStringList(this.f3333m);
        parcel.writeStringList(this.f3334n);
        parcel.writeInt(this.f3335o ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3322b = parcel.createIntArray();
        this.f3323c = parcel.createStringArrayList();
        this.f3324d = parcel.createIntArray();
        this.f3325e = parcel.createIntArray();
        this.f3326f = parcel.readInt();
        this.f3327g = parcel.readString();
        this.f3328h = parcel.readInt();
        this.f3329i = parcel.readInt();
        this.f3330j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3331k = parcel.readInt();
        this.f3332l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3333m = parcel.createStringArrayList();
        this.f3334n = parcel.createStringArrayList();
        this.f3335o = parcel.readInt() != 0;
    }
}
