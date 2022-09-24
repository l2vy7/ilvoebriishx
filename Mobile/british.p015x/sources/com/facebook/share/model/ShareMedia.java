package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: b */
    private final Bundle f13746b;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C3720a<M extends ShareMedia, B extends C3720a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f13747a = new Bundle();

        /* renamed from: c */
        static List<ShareMedia> m12540c(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }

        /* renamed from: b */
        public B mo12492b(M m) {
            return m == null ? this : mo12493d(m.mo12489a());
        }

        @Deprecated
        /* renamed from: d */
        public B mo12493d(Bundle bundle) {
            this.f13747a.putAll(bundle);
            return this;
        }
    }

    protected ShareMedia(C3720a aVar) {
        this.f13746b = new Bundle(aVar.f13747a);
    }

    @Deprecated
    /* renamed from: a */
    public Bundle mo12489a() {
        return new Bundle(this.f13746b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f13746b);
    }

    ShareMedia(Parcel parcel) {
        this.f13746b = parcel.readBundle();
    }
}
