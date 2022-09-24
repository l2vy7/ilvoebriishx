package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C3739a();

    /* renamed from: c */
    private final Uri f13796c;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    static class C3739a implements Parcelable.Creator<ShareVideo> {
        C3739a() {
        }

        /* renamed from: a */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        /* renamed from: b */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    public static final class C3740b extends ShareMedia.C3720a<ShareVideo, C3740b> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f13797b;

        /* renamed from: f */
        public ShareVideo mo12578f() {
            return new ShareVideo(this, (C3739a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3740b mo12579g(Parcel parcel) {
            return mo12580h((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        /* renamed from: h */
        public C3740b mo12580h(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            return ((C3740b) super.mo12492b(shareVideo)).mo12581i(shareVideo.mo12573b());
        }

        /* renamed from: i */
        public C3740b mo12581i(Uri uri) {
            this.f13797b = uri;
            return this;
        }
    }

    /* synthetic */ ShareVideo(C3740b bVar, C3739a aVar) {
        this(bVar);
    }

    /* renamed from: b */
    public Uri mo12573b() {
        return this.f13796c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13796c, 0);
    }

    private ShareVideo(C3740b bVar) {
        super((ShareMedia.C3720a) bVar);
        this.f13796c = bVar.f13797b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f13796c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
