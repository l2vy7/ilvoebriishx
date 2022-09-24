package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import p010b0.C1532g;

public class ListPreference extends DialogPreference {

    /* renamed from: O */
    private CharSequence[] f4686O;

    /* renamed from: P */
    private CharSequence[] f4687P;

    /* renamed from: Q */
    private String f4688Q;

    /* renamed from: R */
    private String f4689R;

    /* renamed from: S */
    private boolean f4690S;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1048a();

        /* renamed from: b */
        String f4691b;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        static class C1048a implements Parcelable.Creator<SavedState> {
            C1048a() {
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
            this.f4691b = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4691b);
        }
    }

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C1049a implements Preference.C1056e<ListPreference> {

        /* renamed from: a */
        private static C1049a f4692a;

        private C1049a() {
        }

        /* renamed from: b */
        public static C1049a m5378b() {
            if (f4692a == null) {
                f4692a = new C1049a();
            }
            return f4692a;
        }

        /* renamed from: c */
        public CharSequence mo4861a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.mo4865S())) {
                return listPreference.mo4893d().getString(C1073f.f4786a);
            }
            return listPreference.mo4865S();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4869b0, i, i2);
        this.f4686O = C1532g.m7919q(obtainStyledAttributes, C1074g.f4878e0, C1074g.f4872c0);
        this.f4687P = C1532g.m7919q(obtainStyledAttributes, C1074g.f4881f0, C1074g.f4875d0);
        int i3 = C1074g.f4884g0;
        if (C1532g.m7904b(obtainStyledAttributes, i3, i3, false)) {
            mo4888L(C1049a.m5378b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1074g.f4917r0, i, i2);
        this.f4689R = C1532g.m7917o(obtainStyledAttributes2, C1074g.f4863Z0, C1074g.f4941z0);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: V */
    private int m5367V() {
        return mo4863P(this.f4688Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: P */
    public int mo4863P(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4687P) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f4687P[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: R */
    public CharSequence[] mo4864R() {
        return this.f4686O;
    }

    /* renamed from: S */
    public CharSequence mo4865S() {
        CharSequence[] charSequenceArr;
        int V = m5367V();
        if (V < 0 || (charSequenceArr = this.f4686O) == null) {
            return null;
        }
        return charSequenceArr[V];
    }

    /* renamed from: T */
    public CharSequence[] mo4866T() {
        return this.f4687P;
    }

    /* renamed from: U */
    public String mo4867U() {
        return this.f4688Q;
    }

    /* renamed from: W */
    public void mo4868W(String str) {
        boolean z = !TextUtils.equals(this.f4688Q, str);
        if (z || !this.f4690S) {
            this.f4688Q = str;
            this.f4690S = true;
            mo4887K(str);
            if (z) {
                mo4849A();
            }
        }
    }

    /* renamed from: q */
    public CharSequence mo4869q() {
        if (mo4902s() != null) {
            return mo4902s().mo4861a(this);
        }
        Object S = mo4865S();
        CharSequence q = super.mo4869q();
        String str = this.f4689R;
        if (str == null) {
            return q;
        }
        Object[] objArr = new Object[1];
        if (S == null) {
            S = "";
        }
        objArr[0] = S;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, q)) {
            return q;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4775b, 16842897));
    }
}
