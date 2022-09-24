package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0303m;
import com.google.android.material.badge.C10023a;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter implements C0296j {

    /* renamed from: b */
    private C0287e f48150b;

    /* renamed from: c */
    private C10242c f48151c;

    /* renamed from: d */
    private boolean f48152d = false;

    /* renamed from: e */
    private int f48153e;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10234a();

        /* renamed from: b */
        int f48154b;

        /* renamed from: c */
        ParcelableSparseArray f48155c;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        static class C10234a implements Parcelable.Creator<SavedState> {
            C10234a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f48154b);
            parcel.writeParcelable(this.f48155c, 0);
        }

        SavedState(Parcel parcel) {
            this.f48154b = parcel.readInt();
            this.f48155c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo41014a(int i) {
        this.f48153e = i;
    }

    /* renamed from: b */
    public void mo1027b(C0287e eVar, boolean z) {
    }

    /* renamed from: c */
    public void mo1028c(boolean z) {
        if (!this.f48152d) {
            if (z) {
                this.f48151c.mo41086d();
            } else {
                this.f48151c.mo41103k();
            }
        }
    }

    /* renamed from: d */
    public boolean mo1045d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1029e(C0287e eVar, C0291g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1030f(C0287e eVar, C0291g gVar) {
        return false;
    }

    public int getId() {
        return this.f48153e;
    }

    /* renamed from: h */
    public void mo1033h(Context context, C0287e eVar) {
        this.f48150b = eVar;
        this.f48151c.mo1013b(eVar);
    }

    /* renamed from: i */
    public void mo1047i(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f48151c.mo41102j(savedState.f48154b);
            this.f48151c.setBadgeDrawables(C10023a.m45822b(this.f48151c.getContext(), savedState.f48155c));
        }
    }

    /* renamed from: j */
    public void mo41015j(C10242c cVar) {
        this.f48151c = cVar;
    }

    /* renamed from: k */
    public boolean mo1035k(C0303m mVar) {
        return false;
    }

    /* renamed from: l */
    public Parcelable mo1049l() {
        SavedState savedState = new SavedState();
        savedState.f48154b = this.f48151c.getSelectedItemId();
        savedState.f48155c = C10023a.m45823c(this.f48151c.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: m */
    public void mo41016m(boolean z) {
        this.f48152d = z;
    }
}
