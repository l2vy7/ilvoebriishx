package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p010b0.C1532g;

public class EditTextPreference extends DialogPreference {

    /* renamed from: O */
    private String f4683O;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1046a();

        /* renamed from: b */
        String f4684b;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        static class C1046a implements Parcelable.Creator<SavedState> {
            C1046a() {
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
            this.f4684b = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4684b);
        }
    }

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static final class C1047a implements Preference.C1056e<EditTextPreference> {

        /* renamed from: a */
        private static C1047a f4685a;

        private C1047a() {
        }

        /* renamed from: b */
        public static C1047a m5364b() {
            if (f4685a == null) {
                f4685a = new C1047a();
            }
            return f4685a;
        }

        /* renamed from: c */
        public CharSequence mo4861a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.mo4855P())) {
                return editTextPreference.mo4893d().getString(C1073f.f4786a);
            }
            return editTextPreference.mo4855P();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4835Q, i, i2);
        int i3 = C1074g.f4838R;
        if (C1532g.m7904b(obtainStyledAttributes, i3, i3, false)) {
            mo4888L(C1047a.m5364b());
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: M */
    public boolean mo4854M() {
        return TextUtils.isEmpty(this.f4683O) || super.mo4854M();
    }

    /* renamed from: P */
    public String mo4855P() {
        return this.f4683O;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4777d, 16842898));
    }
}
