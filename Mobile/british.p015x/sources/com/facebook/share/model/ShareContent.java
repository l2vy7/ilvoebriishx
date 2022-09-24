package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {

    /* renamed from: b */
    private final Uri f13734b;

    /* renamed from: c */
    private final List<String> f13735c;

    /* renamed from: d */
    private final String f13736d;

    /* renamed from: e */
    private final String f13737e;

    /* renamed from: f */
    private final String f13738f;

    /* renamed from: g */
    private final ShareHashtag f13739g;

    protected ShareContent(Parcel parcel) {
        this.f13734b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13735c = m12524d(parcel);
        this.f13736d = parcel.readString();
        this.f13737e = parcel.readString();
        this.f13738f = parcel.readString();
        this.f13739g = new ShareHashtag.C3718b().mo12481c(parcel).mo12480b();
    }

    /* renamed from: d */
    private List<String> m12524d(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public Uri mo12471a() {
        return this.f13734b;
    }

    /* renamed from: b */
    public ShareHashtag mo12472b() {
        return this.f13739g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13734b, 0);
        parcel.writeStringList(this.f13735c);
        parcel.writeString(this.f13736d);
        parcel.writeString(this.f13737e);
        parcel.writeString(this.f13738f);
        parcel.writeParcelable(this.f13739g, 0);
    }
}
