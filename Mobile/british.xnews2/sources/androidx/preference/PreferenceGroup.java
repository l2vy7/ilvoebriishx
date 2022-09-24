package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;
import p010b0.C1532g;
import p149t.C6090g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: I */
    final C6090g<String, Long> f4731I;

    /* renamed from: J */
    private final Handler f4732J;

    /* renamed from: K */
    private List<Preference> f4733K;

    /* renamed from: L */
    private boolean f4734L;

    /* renamed from: M */
    private int f4735M;

    /* renamed from: N */
    private boolean f4736N;

    /* renamed from: O */
    private int f4737O;

    /* renamed from: P */
    private C1059b f4738P;

    /* renamed from: Q */
    private final Runnable f4739Q;

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1057a();

        /* renamed from: b */
        int f4740b;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        static class C1057a implements Parcelable.Creator<SavedState> {
            C1057a() {
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

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4740b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4740b);
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C1058a implements Runnable {
        C1058a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f4731I.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C1059b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4731I = new C6090g<>();
        this.f4732J = new Handler();
        this.f4734L = true;
        this.f4735M = 0;
        this.f4736N = false;
        this.f4737O = Integer.MAX_VALUE;
        this.f4738P = null;
        this.f4739Q = new C1058a();
        this.f4733K = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4879e1, i, i2);
        int i3 = C1074g.f4885g1;
        this.f4734L = C1532g.m7904b(obtainStyledAttributes, i3, i3, true);
        int i4 = C1074g.f4882f1;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo4919S(C1532g.m7906d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public void mo4881B(boolean z) {
        super.mo4881B(z);
        int R = mo4918R();
        for (int i = 0; i < R; i++) {
            mo4917P(i).mo4883F(this, z);
        }
    }

    /* renamed from: P */
    public Preference mo4917P(int i) {
        return this.f4733K.get(i);
    }

    /* renamed from: R */
    public int mo4918R() {
        return this.f4733K.size();
    }

    /* renamed from: S */
    public void mo4919S(int i) {
        if (i != Integer.MAX_VALUE && !mo4905w()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f4737O = i;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
