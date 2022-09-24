package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C3734a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C3734a> implements ShareModel {

    /* renamed from: b */
    private final Bundle f13781b;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C3734a<P extends ShareOpenGraphValueContainer, E extends C3734a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f13782a = new Bundle();

        /* renamed from: b */
        public E mo12546b(String str, String str2) {
            this.f13782a.putString(str, str2);
            return this;
        }

        /* renamed from: c */
        public E mo12547c(P p) {
            if (p != null) {
                this.f13782a.putAll(p.mo12541b());
            }
            return this;
        }
    }

    protected ShareOpenGraphValueContainer(C3734a<P, E> aVar) {
        this.f13781b = (Bundle) aVar.f13782a.clone();
    }

    /* renamed from: a */
    public Object mo12540a(String str) {
        return this.f13781b.get(str);
    }

    /* renamed from: b */
    public Bundle mo12541b() {
        return (Bundle) this.f13781b.clone();
    }

    /* renamed from: d */
    public String mo12542d(String str) {
        return this.f13781b.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Set<String> mo12544e() {
        return this.f13781b.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f13781b);
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f13781b = parcel.readBundle(C3734a.class.getClassLoader());
    }
}
