package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C3663a();

    /* renamed from: h */
    private final String f13596h;

    /* renamed from: i */
    private final String f13597i;

    /* renamed from: j */
    private final String f13598j;

    /* renamed from: k */
    private final String f13599k;

    /* renamed from: l */
    private final String f13600l;

    /* renamed from: m */
    private final String f13601m;

    /* renamed from: n */
    private final String f13602n;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    static class C3663a implements Parcelable.Creator<ShareFeedContent> {
        C3663a() {
        }

        /* renamed from: a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* renamed from: b */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f13596h = parcel.readString();
        this.f13597i = parcel.readString();
        this.f13598j = parcel.readString();
        this.f13599k = parcel.readString();
        this.f13600l = parcel.readString();
        this.f13601m = parcel.readString();
        this.f13602n = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13596h);
        parcel.writeString(this.f13597i);
        parcel.writeString(this.f13598j);
        parcel.writeString(this.f13599k);
        parcel.writeString(this.f13600l);
        parcel.writeString(this.f13601m);
        parcel.writeString(this.f13602n);
    }
}
