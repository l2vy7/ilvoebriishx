package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.startapp.s9 */
/* compiled from: Sta */
public class C12182s9 extends C12157r2 {
    public static final Parcelable.Creator<C12182s9> CREATOR = new C12183a();

    /* renamed from: f */
    public float f54146f;

    /* renamed from: g */
    public float f54147g;

    /* renamed from: com.startapp.s9$a */
    /* compiled from: Sta */
    public class C12183a implements Parcelable.Creator<C12182s9> {
        public Object createFromParcel(Parcel parcel) {
            return new C12182s9(parcel);
        }

        public Object[] newArray(int i) {
            return new C12182s9[i];
        }
    }

    public C12182s9(float f, float f2) {
        this.f54146f = f;
        this.f54147g = f2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return super.toString() + ", Friction: [" + this.f54146f + "], Snap:[" + this.f54147g + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f54090a);
        parcel.writeFloat(this.f54091b);
        parcel.writeFloat(this.f54092c);
        parcel.writeFloat(this.f54093d);
        parcel.writeFloat(this.f54146f);
        parcel.writeFloat(this.f54147g);
    }

    public C12182s9(Parcel parcel) {
        super(parcel);
        this.f54146f = parcel.readFloat();
        this.f54147g = parcel.readFloat();
    }
}
