package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p010b0.C1532g;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: O */
    private CharSequence[] f4693O;

    /* renamed from: P */
    private CharSequence[] f4694P;

    /* renamed from: Q */
    private Set<String> f4695Q;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1050a();

        /* renamed from: b */
        Set<String> f4696b = new HashSet();

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$a */
        static class C1050a implements Parcelable.Creator<SavedState> {
            C1050a() {
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
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f4696b, strArr);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4696b.size());
            Set<String> set = this.f4696b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4695Q = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4896k0, i, i2);
        this.f4693O = C1532g.m7919q(obtainStyledAttributes, C1074g.f4905n0, C1074g.f4899l0);
        this.f4694P = C1532g.m7919q(obtainStyledAttributes, C1074g.f4908o0, C1074g.f4902m0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4775b, 16842897));
    }
}
