package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C3738a();

    /* renamed from: h */
    private final ShareMedia f13792h;

    /* renamed from: i */
    private final SharePhoto f13793i;

    /* renamed from: j */
    private final List<String> f13794j;

    /* renamed from: k */
    private final String f13795k;

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    static class C3738a implements Parcelable.Creator<ShareStoryContent> {
        C3738a() {
        }

        /* renamed from: a */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        /* renamed from: b */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.f13792h = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f13793i = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f13794j = m12597d(parcel);
        this.f13795k = parcel.readString();
    }

    /* renamed from: d */
    private List<String> m12597d(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13792h, 0);
        parcel.writeParcelable(this.f13793i, 0);
        parcel.writeStringList(this.f13794j);
        parcel.writeString(this.f13795k);
    }
}
