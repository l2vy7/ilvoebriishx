package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import p072f.C5238a;
import p110m0.C5682a;
import p110m0.C5723u;
import p116n0.C5771c;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    private static final int[] f47962g = {16842912};

    /* renamed from: d */
    private boolean f47963d;

    /* renamed from: e */
    private boolean f47964e;

    /* renamed from: f */
    private boolean f47965f;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10181a();

        /* renamed from: d */
        boolean f47966d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        static class C10181a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10181a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m46904b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f47966d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f47966d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m46904b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C10182a extends C5682a {
        C10182a() {
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3196f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22623a0(CheckableImageButton.this.mo40808a());
            cVar.mo22625b0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22790D);
    }

    /* renamed from: a */
    public boolean mo40808a() {
        return this.f47964e;
    }

    public boolean isChecked() {
        return this.f47963d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f47963d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f47962g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        setChecked(savedState.f47966d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47966d = this.f47963d;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f47964e != z) {
            this.f47964e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f47964e && this.f47963d != z) {
            this.f47963d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f47965f = z;
    }

    public void setPressed(boolean z) {
        if (this.f47965f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f47963d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47964e = true;
        this.f47965f = true;
        C5723u.m25330o0(this, new C10182a());
    }
}
