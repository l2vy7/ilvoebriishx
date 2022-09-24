package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C7384d1();

    /* renamed from: b */
    private IBinder f29264b;

    public BinderWrapper(IBinder iBinder) {
        this.f29264b = iBinder;
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C7386e1 e1Var) {
        this.f29264b = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f29264b);
    }
}
