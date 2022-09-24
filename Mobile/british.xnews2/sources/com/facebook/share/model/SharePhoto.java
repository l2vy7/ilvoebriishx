package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C3735a();

    /* renamed from: c */
    private final Bitmap f13783c;

    /* renamed from: d */
    private final Uri f13784d;

    /* renamed from: e */
    private final boolean f13785e;

    /* renamed from: f */
    private final String f13786f;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    static class C3735a implements Parcelable.Creator<SharePhoto> {
        C3735a() {
        }

        /* renamed from: a */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        /* renamed from: b */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    public static final class C3736b extends ShareMedia.C3720a<SharePhoto, C3736b> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f13787b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Uri f13788c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f13789d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f13790e;

        /* renamed from: n */
        static List<SharePhoto> m12584n(Parcel parcel) {
            List<ShareMedia> c = ShareMedia.C3720a.m12540c(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia next : c) {
                if (next instanceof SharePhoto) {
                    arrayList.add((SharePhoto) next);
                }
            }
            return arrayList;
        }

        /* renamed from: s */
        static void m12585s(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        /* renamed from: i */
        public SharePhoto mo12556i() {
            return new SharePhoto(this, (C3735a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public Bitmap mo12557j() {
            return this.f13787b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public Uri mo12558k() {
            return this.f13788c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C3736b mo12559l(Parcel parcel) {
            return mo12560m((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: m */
        public C3736b mo12560m(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C3736b) super.mo12492b(sharePhoto)).mo12561o(sharePhoto.mo12548b()).mo12563q(sharePhoto.mo12550e()).mo12564r(sharePhoto.mo12551f()).mo12562p(sharePhoto.mo12549d());
        }

        /* renamed from: o */
        public C3736b mo12561o(Bitmap bitmap) {
            this.f13787b = bitmap;
            return this;
        }

        /* renamed from: p */
        public C3736b mo12562p(String str) {
            this.f13790e = str;
            return this;
        }

        /* renamed from: q */
        public C3736b mo12563q(Uri uri) {
            this.f13788c = uri;
            return this;
        }

        /* renamed from: r */
        public C3736b mo12564r(boolean z) {
            this.f13789d = z;
            return this;
        }
    }

    /* synthetic */ SharePhoto(C3736b bVar, C3735a aVar) {
        this(bVar);
    }

    /* renamed from: b */
    public Bitmap mo12548b() {
        return this.f13783c;
    }

    /* renamed from: d */
    public String mo12549d() {
        return this.f13786f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri mo12550e() {
        return this.f13784d;
    }

    /* renamed from: f */
    public boolean mo12551f() {
        return this.f13785e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13783c, 0);
        parcel.writeParcelable(this.f13784d, 0);
        parcel.writeByte(this.f13785e ? (byte) 1 : 0);
        parcel.writeString(this.f13786f);
    }

    private SharePhoto(C3736b bVar) {
        super((ShareMedia.C3720a) bVar);
        this.f13783c = bVar.f13787b;
        this.f13784d = bVar.f13788c;
        this.f13785e = bVar.f13789d;
        this.f13786f = bVar.f13790e;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f13783c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f13784d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13785e = parcel.readByte() != 0;
        this.f13786f = parcel.readString();
    }
}
