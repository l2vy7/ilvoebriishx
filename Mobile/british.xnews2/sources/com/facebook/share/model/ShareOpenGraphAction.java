package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C3731b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C3730a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    static class C3730a implements Parcelable.Creator<ShareOpenGraphAction> {
        C3730a() {
        }

        /* renamed from: a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        /* renamed from: b */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$b */
    public static final class C3731b extends ShareOpenGraphValueContainer.C3734a<ShareOpenGraphAction, C3731b> {
        /* renamed from: d */
        public ShareOpenGraphAction mo12527d() {
            return new ShareOpenGraphAction(this, (C3730a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3731b mo12528e(Parcel parcel) {
            return mo12529f((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        /* renamed from: f */
        public C3731b mo12529f(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            return ((C3731b) super.mo12547c(shareOpenGraphAction)).mo12530g(shareOpenGraphAction.mo12522f());
        }

        /* renamed from: g */
        public C3731b mo12530g(String str) {
            mo12546b("og:type", str);
            return this;
        }
    }

    /* synthetic */ ShareOpenGraphAction(C3731b bVar, C3730a aVar) {
        this(bVar);
    }

    /* renamed from: f */
    public String mo12522f() {
        return mo12542d("og:type");
    }

    private ShareOpenGraphAction(C3731b bVar) {
        super(bVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
