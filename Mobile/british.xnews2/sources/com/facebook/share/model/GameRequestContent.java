package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C3713a();

    /* renamed from: b */
    private final String f13716b;

    /* renamed from: c */
    private final List<String> f13717c;

    /* renamed from: d */
    private final String f13718d;

    /* renamed from: e */
    private final String f13719e;

    /* renamed from: f */
    private final C3714b f13720f;

    /* renamed from: g */
    private final String f13721g;

    /* renamed from: h */
    private final C3715c f13722h;

    /* renamed from: i */
    private final List<String> f13723i;

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    static class C3713a implements Parcelable.Creator<GameRequestContent> {
        C3713a() {
        }

        /* renamed from: a */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        /* renamed from: b */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public enum C3714b {
        SEND,
        ASKFOR,
        TURN
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$c */
    public enum C3715c {
        APP_USERS,
        APP_NON_USERS
    }

    GameRequestContent(Parcel parcel) {
        this.f13716b = parcel.readString();
        this.f13717c = parcel.createStringArrayList();
        this.f13718d = parcel.readString();
        this.f13719e = parcel.readString();
        this.f13720f = (C3714b) parcel.readSerializable();
        this.f13721g = parcel.readString();
        this.f13722h = (C3715c) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f13723i = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13716b);
        parcel.writeStringList(this.f13717c);
        parcel.writeString(this.f13718d);
        parcel.writeString(this.f13719e);
        parcel.writeSerializable(this.f13720f);
        parcel.writeString(this.f13721g);
        parcel.writeSerializable(this.f13722h);
        parcel.writeStringList(this.f13723i);
    }
}
