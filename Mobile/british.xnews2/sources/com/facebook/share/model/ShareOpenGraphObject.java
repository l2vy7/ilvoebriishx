package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new C3733a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$a */
    static class C3733a implements Parcelable.Creator<ShareOpenGraphObject> {
        C3733a() {
        }

        /* renamed from: a */
        public ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        /* renamed from: b */
        public ShareOpenGraphObject[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }
    }

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
