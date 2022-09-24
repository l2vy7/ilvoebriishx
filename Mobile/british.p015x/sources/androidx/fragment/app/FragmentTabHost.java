package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b */
    private final ArrayList<C0673a> f3517b = new ArrayList<>();

    /* renamed from: c */
    private Context f3518c;

    /* renamed from: d */
    private FragmentManager f3519d;

    /* renamed from: e */
    private int f3520e;

    /* renamed from: f */
    private TabHost.OnTabChangeListener f3521f;

    /* renamed from: g */
    private C0673a f3522g;

    /* renamed from: h */
    private boolean f3523h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0672a();

        /* renamed from: b */
        String f3524b;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        class C0672a implements Parcelable.Creator<SavedState> {
            C0672a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3524b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3524b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3524b = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    static final class C0673a {

        /* renamed from: a */
        final String f3525a;

        /* renamed from: b */
        final Class<?> f3526b;

        /* renamed from: c */
        final Bundle f3527c;

        /* renamed from: d */
        Fragment f3528d;
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3879c(context, attributeSet);
    }

    /* renamed from: a */
    private C0720q m3877a(String str, C0720q qVar) {
        Fragment fragment;
        C0673a b = m3878b(str);
        if (this.f3522g != b) {
            if (qVar == null) {
                qVar = this.f3519d.mo3598m();
            }
            C0673a aVar = this.f3522g;
            if (!(aVar == null || (fragment = aVar.f3528d) == null)) {
                qVar.mo3676k(fragment);
            }
            if (b != null) {
                Fragment fragment2 = b.f3528d;
                if (fragment2 == null) {
                    Fragment a = this.f3519d.mo3603r0().mo3627a(this.f3518c.getClassLoader(), b.f3526b.getName());
                    b.f3528d = a;
                    a.mo3343A1(b.f3527c);
                    qVar.mo3850b(this.f3520e, b.f3528d, b.f3525a);
                } else {
                    qVar.mo3854f(fragment2);
                }
            }
            this.f3522g = b;
        }
        return qVar;
    }

    /* renamed from: b */
    private C0673a m3878b(String str) {
        int size = this.f3517b.size();
        for (int i = 0; i < size; i++) {
            C0673a aVar = this.f3517b.get(i);
            if (aVar.f3525a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m3879c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f3520e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3517b.size();
        C0720q qVar = null;
        for (int i = 0; i < size; i++) {
            C0673a aVar = this.f3517b.get(i);
            Fragment j0 = this.f3519d.mo3592j0(aVar.f3525a);
            aVar.f3528d = j0;
            if (j0 != null && !j0.mo3408c0()) {
                if (aVar.f3525a.equals(currentTabTag)) {
                    this.f3522g = aVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f3519d.mo3598m();
                    }
                    qVar.mo3676k(aVar.f3528d);
                }
            }
        }
        this.f3523h = true;
        C0720q a = m3877a(currentTabTag, qVar);
        if (a != null) {
            a.mo3672g();
            this.f3519d.mo3581f0();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3523h = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3524b);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3524b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        C0720q a;
        if (this.f3523h && (a = m3877a(str, (C0720q) null)) != null) {
            a.mo3672g();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3521f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3521f = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
