package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: I */
    int f4743I;

    /* renamed from: J */
    int f4744J;

    /* renamed from: K */
    private int f4745K;

    /* renamed from: L */
    private int f4746L;

    /* renamed from: M */
    boolean f4747M;

    /* renamed from: N */
    SeekBar f4748N;

    /* renamed from: O */
    private TextView f4749O;

    /* renamed from: P */
    boolean f4750P;

    /* renamed from: Q */
    private boolean f4751Q;

    /* renamed from: R */
    boolean f4752R;

    /* renamed from: S */
    private SeekBar.OnSeekBarChangeListener f4753S;

    /* renamed from: T */
    private View.OnKeyListener f4754T;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1060a();

        /* renamed from: b */
        int f4755b;

        /* renamed from: c */
        int f4756c;

        /* renamed from: d */
        int f4757d;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        static class C1060a implements Parcelable.Creator<SavedState> {
            C1060a() {
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
            this.f4755b = parcel.readInt();
            this.f4756c = parcel.readInt();
            this.f4757d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4755b);
            parcel.writeInt(this.f4756c);
            parcel.writeInt(this.f4757d);
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C1061a implements SeekBar.OnSeekBarChangeListener {
        C1061a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f4752R || !seekBarPreference.f4747M) {
                    seekBarPreference.mo4928T(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo4929U(i + seekBarPreference2.f4744J);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4747M = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4747M = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f4744J != seekBarPreference.f4743I) {
                seekBarPreference.mo4928T(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C1062b implements View.OnKeyListener {
        C1062b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f4750P && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f4748N;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4753S = new C1061a();
        this.f4754T = new C1062b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4909o1, i, i2);
        this.f4744J = obtainStyledAttributes.getInt(C1074g.f4918r1, 0);
        mo4926P(obtainStyledAttributes.getInt(C1074g.f4912p1, 100));
        mo4927R(obtainStyledAttributes.getInt(C1074g.f4921s1, 0));
        this.f4750P = obtainStyledAttributes.getBoolean(C1074g.f4915q1, true);
        this.f4751Q = obtainStyledAttributes.getBoolean(C1074g.f4924t1, false);
        this.f4752R = obtainStyledAttributes.getBoolean(C1074g.f4927u1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m5432S(int i, boolean z) {
        int i2 = this.f4744J;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f4745K;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f4743I) {
            this.f4743I = i;
            mo4929U(i);
            mo4886J(i);
            if (z) {
                mo4849A();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Object mo4853E(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: P */
    public final void mo4926P(int i) {
        int i2 = this.f4744J;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f4745K) {
            this.f4745K = i;
            mo4849A();
        }
    }

    /* renamed from: R */
    public final void mo4927R(int i) {
        if (i != this.f4746L) {
            this.f4746L = Math.min(this.f4745K - this.f4744J, Math.abs(i));
            mo4849A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo4928T(SeekBar seekBar) {
        int progress = this.f4744J + seekBar.getProgress();
        if (progress == this.f4743I) {
            return;
        }
        if (mo4890a(Integer.valueOf(progress))) {
            m5432S(progress, false);
            return;
        }
        seekBar.setProgress(this.f4743I - this.f4744J);
        mo4929U(this.f4743I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4929U(int i) {
        TextView textView = this.f4749O;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1070c.f4781h);
    }
}
