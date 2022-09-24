package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.d1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7384d1 implements Parcelable.Creator<BinderWrapper> {
    C7384d1() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C7386e1) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
