package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: I */
    protected boolean f4768I;

    /* renamed from: J */
    private CharSequence f4769J;

    /* renamed from: K */
    private CharSequence f4770K;

    /* renamed from: L */
    private boolean f4771L;

    /* renamed from: M */
    private boolean f4772M;

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1065a();

        /* renamed from: b */
        boolean f4773b;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        static class C1065a implements Parcelable.Creator<SavedState> {
            C1065a() {
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
            this.f4773b = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4773b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4848C() {
        super.mo4848C();
        boolean z = !mo4945P();
        if (mo4890a(Boolean.valueOf(z))) {
            mo4946R(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: M */
    public boolean mo4854M() {
        if ((this.f4772M ? this.f4768I : !this.f4768I) || super.mo4854M()) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public boolean mo4945P() {
        return this.f4768I;
    }

    /* renamed from: R */
    public void mo4946R(boolean z) {
        boolean z2 = this.f4768I != z;
        if (z2 || !this.f4771L) {
            this.f4768I = z;
            this.f4771L = true;
            mo4885I(z);
            if (z2) {
                mo4881B(mo4854M());
                mo4849A();
            }
        }
    }

    /* renamed from: S */
    public void mo4947S(boolean z) {
        this.f4772M = z;
    }

    /* renamed from: T */
    public void mo4948T(CharSequence charSequence) {
        this.f4770K = charSequence;
        if (!mo4945P()) {
            mo4849A();
        }
    }

    /* renamed from: U */
    public void mo4949U(CharSequence charSequence) {
        this.f4769J = charSequence;
        if (mo4945P()) {
            mo4849A();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4950V(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f4768I
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f4769J
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f4769J
            r5.setText(r0)
        L_0x001a:
            r0 = 0
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.f4768I
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.f4770K
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.f4770K
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.mo4869q()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = 0
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = 8
        L_0x0045:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004e
            r5.setVisibility(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo4950V(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
