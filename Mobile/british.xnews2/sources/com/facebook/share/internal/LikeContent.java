package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new C3661a();

    /* renamed from: b */
    private final String f13592b;

    /* renamed from: c */
    private final String f13593c;

    /* renamed from: com.facebook.share.internal.LikeContent$a */
    static class C3661a implements Parcelable.Creator<LikeContent> {
        C3661a() {
        }

        /* renamed from: a */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        /* renamed from: b */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.LikeContent$b */
    public static class C3662b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f13594a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f13595b;

        @Deprecated
        /* renamed from: c */
        public LikeContent mo12402c() {
            return new LikeContent(this, (C3661a) null);
        }

        @Deprecated
        /* renamed from: d */
        public C3662b mo12403d(String str) {
            this.f13594a = str;
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C3662b mo12404e(String str) {
            this.f13595b = str;
            return this;
        }
    }

    /* synthetic */ LikeContent(C3662b bVar, C3661a aVar) {
        this(bVar);
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13592b);
        parcel.writeString(this.f13593c);
    }

    private LikeContent(C3662b bVar) {
        this.f13592b = bVar.f13594a;
        this.f13593c = bVar.f13595b;
    }

    @Deprecated
    LikeContent(Parcel parcel) {
        this.f13592b = parcel.readString();
        this.f13593c = parcel.readString();
    }
}
