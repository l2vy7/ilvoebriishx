package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C3721a();

    /* renamed from: h */
    private final List<ShareMedia> f13748h;

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    static class C3721a implements Parcelable.Creator<ShareMediaContent> {
        C3721a() {
        }

        /* renamed from: a */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        /* renamed from: b */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f13748h = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f13748h.toArray(), i);
    }
}
