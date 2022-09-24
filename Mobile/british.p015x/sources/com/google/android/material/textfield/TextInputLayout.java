package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0382f;
import androidx.appcompat.widget.C0409p;
import androidx.core.content.C0600b;
import androidx.core.widget.C0624k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C10188a;
import com.google.android.material.internal.C10192c;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p063d0.C5135a;
import p079g.C5264a;
import p100k0.C5535a;
import p111m0.C5682a;
import p111m0.C5709g;
import p111m0.C5723u;
import p117n0.C5771c;
import p194c6.C6522b;
import p194c6.C6523c;
import p194c6.C6524d;
import p194c6.C6526f;
import p194c6.C6530j;
import p194c6.C6531k;
import p200d6.C10493a;
import p208f6.C10538a;
import p233m6.C10805c;
import p243p6.C10889h;
import p243p6.C10897m;

public class TextInputLayout extends LinearLayout {

    /* renamed from: Y0 */
    private static final int f48518Y0 = C6531k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private final TextView f48519A;

    /* renamed from: A0 */
    private int f48520A0;

    /* renamed from: B */
    private boolean f48521B;

    /* renamed from: B0 */
    private Drawable f48522B0;

    /* renamed from: C */
    private CharSequence f48523C;

    /* renamed from: C0 */
    private View.OnLongClickListener f48524C0;

    /* renamed from: D */
    private boolean f48525D;

    /* renamed from: D0 */
    private View.OnLongClickListener f48526D0;

    /* renamed from: E */
    private C10889h f48527E;

    /* renamed from: E0 */
    private final CheckableImageButton f48528E0;

    /* renamed from: F */
    private C10889h f48529F;

    /* renamed from: F0 */
    private ColorStateList f48530F0;

    /* renamed from: G */
    private C10897m f48531G;

    /* renamed from: G0 */
    private ColorStateList f48532G0;

    /* renamed from: H */
    private final int f48533H;

    /* renamed from: H0 */
    private ColorStateList f48534H0;

    /* renamed from: I */
    private int f48535I;

    /* renamed from: I0 */
    private int f48536I0;

    /* renamed from: J */
    private int f48537J;

    /* renamed from: J0 */
    private int f48538J0;

    /* renamed from: K */
    private int f48539K;

    /* renamed from: K0 */
    private int f48540K0;

    /* renamed from: L */
    private int f48541L;

    /* renamed from: L0 */
    private ColorStateList f48542L0;

    /* renamed from: M */
    private int f48543M;

    /* renamed from: M0 */
    private int f48544M0;

    /* renamed from: N */
    private int f48545N;

    /* renamed from: N0 */
    private int f48546N0;

    /* renamed from: O */
    private int f48547O;

    /* renamed from: O0 */
    private int f48548O0;

    /* renamed from: P */
    private int f48549P;

    /* renamed from: P0 */
    private int f48550P0;

    /* renamed from: Q */
    private final Rect f48551Q;

    /* renamed from: Q0 */
    private int f48552Q0;

    /* renamed from: R */
    private final Rect f48553R;

    /* renamed from: R0 */
    private boolean f48554R0;

    /* renamed from: S */
    private final RectF f48555S;

    /* renamed from: S0 */
    final C10188a f48556S0;

    /* renamed from: T */
    private Typeface f48557T;

    /* renamed from: T0 */
    private boolean f48558T0;

    /* renamed from: U */
    private final CheckableImageButton f48559U;

    /* renamed from: U0 */
    private boolean f48560U0;

    /* renamed from: V */
    private ColorStateList f48561V;

    /* renamed from: V0 */
    private ValueAnimator f48562V0;

    /* renamed from: W */
    private boolean f48563W;

    /* renamed from: W0 */
    private boolean f48564W0;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public boolean f48565X0;

    /* renamed from: b */
    private final FrameLayout f48566b;

    /* renamed from: c */
    private final LinearLayout f48567c;

    /* renamed from: d */
    private final LinearLayout f48568d;

    /* renamed from: e */
    private final FrameLayout f48569e;

    /* renamed from: f */
    EditText f48570f;

    /* renamed from: g */
    private CharSequence f48571g;

    /* renamed from: h */
    private int f48572h;

    /* renamed from: i */
    private int f48573i;

    /* renamed from: j */
    private final C10347f f48574j;

    /* renamed from: k */
    boolean f48575k;

    /* renamed from: l */
    private int f48576l;

    /* renamed from: l0 */
    private PorterDuff.Mode f48577l0;

    /* renamed from: m */
    private boolean f48578m;

    /* renamed from: m0 */
    private boolean f48579m0;

    /* renamed from: n */
    private TextView f48580n;

    /* renamed from: n0 */
    private Drawable f48581n0;

    /* renamed from: o */
    private int f48582o;

    /* renamed from: o0 */
    private int f48583o0;

    /* renamed from: p */
    private int f48584p;

    /* renamed from: p0 */
    private View.OnLongClickListener f48585p0;

    /* renamed from: q */
    private CharSequence f48586q;

    /* renamed from: q0 */
    private final LinkedHashSet<C10318f> f48587q0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f48588r;

    /* renamed from: r0 */
    private int f48589r0;

    /* renamed from: s */
    private TextView f48590s;

    /* renamed from: s0 */
    private final SparseArray<C10346e> f48591s0;

    /* renamed from: t */
    private ColorStateList f48592t;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public final CheckableImageButton f48593t0;

    /* renamed from: u */
    private int f48594u;

    /* renamed from: u0 */
    private final LinkedHashSet<C10319g> f48595u0;

    /* renamed from: v */
    private ColorStateList f48596v;

    /* renamed from: v0 */
    private ColorStateList f48597v0;

    /* renamed from: w */
    private ColorStateList f48598w;

    /* renamed from: w0 */
    private boolean f48599w0;

    /* renamed from: x */
    private CharSequence f48600x;

    /* renamed from: x0 */
    private PorterDuff.Mode f48601x0;

    /* renamed from: y */
    private final TextView f48602y;

    /* renamed from: y0 */
    private boolean f48603y0;

    /* renamed from: z */
    private CharSequence f48604z;

    /* renamed from: z0 */
    private Drawable f48605z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10312a();

        /* renamed from: d */
        CharSequence f48606d;

        /* renamed from: e */
        boolean f48607e;

        /* renamed from: f */
        CharSequence f48608f;

        /* renamed from: g */
        CharSequence f48609g;

        /* renamed from: h */
        CharSequence f48610h;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C10312a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10312a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f48606d + " hint=" + this.f48608f + " helperText=" + this.f48609g + " placeholderText=" + this.f48610h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f48606d, parcel, i);
            parcel.writeInt(this.f48607e ? 1 : 0);
            TextUtils.writeToParcel(this.f48608f, parcel, i);
            TextUtils.writeToParcel(this.f48609g, parcel, i);
            TextUtils.writeToParcel(this.f48610h, parcel, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f48606d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f48607e = parcel.readInt() != 1 ? false : true;
            this.f48608f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f48609g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f48610h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C10313a implements TextWatcher {
        C10313a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo41691v0(!textInputLayout.f48565X0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f48575k) {
                textInputLayout2.mo41600n0(editable.length());
            }
            if (TextInputLayout.this.f48588r) {
                TextInputLayout.this.m47686z0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C10314b implements Runnable {
        C10314b() {
        }

        public void run() {
            TextInputLayout.this.f48593t0.performClick();
            TextInputLayout.this.f48593t0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C10315c implements Runnable {
        C10315c() {
        }

        public void run() {
            TextInputLayout.this.f48570f.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C10316d implements ValueAnimator.AnimatorUpdateListener {
        C10316d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f48556S0.mo40921p0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C10317e extends C5682a {

        /* renamed from: d */
        private final TextInputLayout f48615d;

        public C10317e(TextInputLayout textInputLayout) {
            this.f48615d = textInputLayout;
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            EditText editText = this.f48615d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f48615d.getHint();
            CharSequence error = this.f48615d.getError();
            CharSequence placeholderText = this.f48615d.getPlaceholderText();
            int counterMaxLength = this.f48615d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f48615d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f48615d.mo41536N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                cVar.mo22601D0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.mo22601D0(charSequence);
                if (z3 && placeholderText != null) {
                    cVar.mo22601D0(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                cVar.mo22601D0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.mo22644m0(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    cVar.mo22601D0(charSequence);
                }
                cVar.mo22667z0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo22648o0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo22638i0(error);
            }
            if (Build.VERSION.SDK_INT >= 17 && editText != null) {
                editText.setLabelFor(C6526f.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C10318f {
        /* renamed from: a */
        void mo41705a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C10319g {
        /* renamed from: a */
        void mo41706a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.textInputStyle);
    }

    /* renamed from: A */
    private boolean m47619A() {
        return this.f48521B && !TextUtils.isEmpty(this.f48523C) && (this.f48527E instanceof C10332c);
    }

    /* renamed from: A0 */
    private void m47620A0() {
        if (this.f48570f != null) {
            C5723u.m25268C0(this.f48602y, mo41538Q() ? 0 : C5723u.m25275G(this.f48570f), this.f48570f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C6524d.material_input_text_to_prefix_suffix_padding), this.f48570f.getCompoundPaddingBottom());
        }
    }

    /* renamed from: B */
    private void m47621B() {
        Iterator it = this.f48587q0.iterator();
        while (it.hasNext()) {
            ((C10318f) it.next()).mo41705a(this);
        }
    }

    /* renamed from: B0 */
    private void m47622B0() {
        this.f48602y.setVisibility((this.f48600x == null || mo41536N()) ? 8 : 0);
        m47672r0();
    }

    /* renamed from: C */
    private void m47623C(int i) {
        Iterator it = this.f48595u0.iterator();
        while (it.hasNext()) {
            ((C10319g) it.next()).mo41706a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m47624C0(boolean z, boolean z2) {
        int defaultColor = this.f48542L0.getDefaultColor();
        int colorForState = this.f48542L0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f48542L0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f48547O = colorForState2;
        } else if (z2) {
            this.f48547O = colorForState;
        } else {
            this.f48547O = defaultColor;
        }
    }

    /* renamed from: D */
    private void m47625D(Canvas canvas) {
        C10889h hVar = this.f48529F;
        if (hVar != null) {
            Rect bounds = hVar.getBounds();
            bounds.top = bounds.bottom - this.f48541L;
            this.f48529F.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m47626D0() {
        if (this.f48570f != null) {
            C5723u.m25268C0(this.f48519A, getContext().getResources().getDimensionPixelSize(C6524d.material_input_text_to_prefix_suffix_padding), this.f48570f.getPaddingTop(), (mo41534K() || m47634L()) ? 0 : C5723u.m25273F(this.f48570f), this.f48570f.getPaddingBottom());
        }
    }

    /* renamed from: E */
    private void m47627E(Canvas canvas) {
        if (this.f48521B) {
            this.f48556S0.mo40917m(canvas);
        }
    }

    /* renamed from: E0 */
    private void m47628E0() {
        int visibility = this.f48519A.getVisibility();
        int i = 0;
        boolean z = this.f48604z != null && !mo41536N();
        TextView textView = this.f48519A;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f48519A.getVisibility()) {
            getEndIconDelegate().mo41708c(z);
        }
        m47672r0();
    }

    /* renamed from: F */
    private void m47629F(boolean z) {
        ValueAnimator valueAnimator = this.f48562V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f48562V0.cancel();
        }
        if (!z || !this.f48560U0) {
            this.f48556S0.mo40921p0(0.0f);
        } else {
            mo41599i(0.0f);
        }
        if (m47619A() && ((C10332c) this.f48527E).mo41719q0()) {
            m47683y();
        }
        this.f48554R0 = true;
        m47633J();
        m47622B0();
        m47628E0();
    }

    /* renamed from: G */
    private int m47630G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f48570f.getCompoundPaddingLeft();
        return (this.f48600x == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f48602y.getMeasuredWidth()) + this.f48602y.getPaddingLeft();
    }

    /* renamed from: H */
    private int m47631H(int i, boolean z) {
        int compoundPaddingRight = i - this.f48570f.getCompoundPaddingRight();
        return (this.f48600x == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f48602y.getMeasuredWidth() - this.f48602y.getPaddingRight());
    }

    /* renamed from: I */
    private boolean m47632I() {
        return this.f48589r0 != 0;
    }

    /* renamed from: J */
    private void m47633J() {
        TextView textView = this.f48590s;
        if (textView != null && this.f48588r) {
            textView.setText((CharSequence) null);
            this.f48590s.setVisibility(4);
        }
    }

    /* renamed from: L */
    private boolean m47634L() {
        return this.f48528E0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m47635P() {
        if (this.f48537J != 1 || (Build.VERSION.SDK_INT >= 16 && this.f48570f.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private int[] m47636R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    private void m47637S() {
        m47667p();
        m47643a0();
        mo41533F0();
        m47659k0();
        m47653h();
        if (this.f48537J != 0) {
            m47677u0();
        }
    }

    /* renamed from: T */
    private void m47638T() {
        if (m47619A()) {
            RectF rectF = this.f48555S;
            this.f48556S0.mo40920p(rectF, this.f48570f.getWidth(), this.f48570f.getGravity());
            m47660l(rectF);
            int i = this.f48541L;
            this.f48535I = i;
            rectF.top = 0.0f;
            rectF.bottom = (float) i;
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C10332c) this.f48527E).mo41722w0(rectF);
        }
    }

    /* renamed from: U */
    private static void m47639U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m47639U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m47640X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m47636R(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C5135a.m23418r(drawable).mutate();
            C5135a.m23415o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: Z */
    private void m47641Z() {
        TextView textView = this.f48590s;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    private void m47643a0() {
        if (m47654h0()) {
            C5723u.m25336r0(this.f48570f, this.f48527E);
        }
    }

    /* renamed from: b0 */
    private static void m47645b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean O = C5723u.m25289O(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (O || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(O);
        checkableImageButton.setPressable(O);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C5723u.m25350y0(checkableImageButton, i);
    }

    /* renamed from: c0 */
    private static void m47647c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m47645b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    private static void m47649d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m47645b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private boolean m47650f0() {
        return (this.f48528E0.getVisibility() == 0 || ((m47632I() && mo41534K()) || this.f48604z != null)) && this.f48568d.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    private void m47651g() {
        TextView textView = this.f48590s;
        if (textView != null) {
            this.f48566b.addView(textView);
            this.f48590s.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    private boolean m47652g0() {
        return !(getStartIconDrawable() == null && this.f48600x == null) && this.f48567c.getMeasuredWidth() > 0;
    }

    private C10346e getEndIconDelegate() {
        C10346e eVar = this.f48591s0.get(this.f48589r0);
        return eVar != null ? eVar : this.f48591s0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f48528E0.getVisibility() == 0) {
            return this.f48528E0;
        }
        if (!m47632I() || !mo41534K()) {
            return null;
        }
        return this.f48593t0;
    }

    /* renamed from: h */
    private void m47653h() {
        if (this.f48570f != null && this.f48537J == 1) {
            if (C10805c.m48760h(getContext())) {
                EditText editText = this.f48570f;
                C5723u.m25268C0(editText, C5723u.m25275G(editText), getResources().getDimensionPixelSize(C6524d.material_filled_edittext_font_2_0_padding_top), C5723u.m25273F(this.f48570f), getResources().getDimensionPixelSize(C6524d.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C10805c.m48759g(getContext())) {
                EditText editText2 = this.f48570f;
                C5723u.m25268C0(editText2, C5723u.m25275G(editText2), getResources().getDimensionPixelSize(C6524d.material_filled_edittext_font_1_3_padding_top), C5723u.m25273F(this.f48570f), getResources().getDimensionPixelSize(C6524d.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m47654h0() {
        EditText editText = this.f48570f;
        return (editText == null || this.f48527E == null || editText.getBackground() != null || this.f48537J == 0) ? false : true;
    }

    /* renamed from: i0 */
    private void m47655i0() {
        TextView textView = this.f48590s;
        if (textView != null && this.f48588r) {
            textView.setText(this.f48586q);
            this.f48590s.setVisibility(0);
            this.f48590s.bringToFront();
        }
    }

    /* renamed from: j */
    private void m47656j() {
        C10889h hVar = this.f48527E;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(this.f48531G);
            if (m47679w()) {
                this.f48527E.mo43105j0((float) this.f48541L, this.f48547O);
            }
            int q = m47669q();
            this.f48549P = q;
            this.f48527E.mo43091a0(ColorStateList.valueOf(q));
            if (this.f48589r0 == 3) {
                this.f48570f.getBackground().invalidateSelf();
            }
            m47658k();
            invalidate();
        }
    }

    /* renamed from: j0 */
    private void m47657j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m47662m();
            return;
        }
        Drawable mutate = C5135a.m23418r(getEndIconDrawable()).mutate();
        C5135a.m23414n(mutate, this.f48574j.mo41749o());
        this.f48593t0.setImageDrawable(mutate);
    }

    /* renamed from: k */
    private void m47658k() {
        if (this.f48529F != null) {
            if (m47681x()) {
                this.f48529F.mo43091a0(ColorStateList.valueOf(this.f48547O));
            }
            invalidate();
        }
    }

    /* renamed from: k0 */
    private void m47659k0() {
        if (this.f48537J != 1) {
            return;
        }
        if (C10805c.m48760h(getContext())) {
            this.f48539K = getResources().getDimensionPixelSize(C6524d.material_font_2_0_box_collapsed_padding_top);
        } else if (C10805c.m48759g(getContext())) {
            this.f48539K = getResources().getDimensionPixelSize(C6524d.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: l */
    private void m47660l(RectF rectF) {
        float f = rectF.left;
        int i = this.f48533H;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: l0 */
    private void m47661l0(Rect rect) {
        C10889h hVar = this.f48529F;
        if (hVar != null) {
            int i = rect.bottom;
            hVar.setBounds(rect.left, i - this.f48545N, rect.right, i);
        }
    }

    /* renamed from: m */
    private void m47662m() {
        m47664n(this.f48593t0, this.f48599w0, this.f48597v0, this.f48603y0, this.f48601x0);
    }

    /* renamed from: m0 */
    private void m47663m0() {
        if (this.f48580n != null) {
            EditText editText = this.f48570f;
            mo41600n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    private void m47664n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C5135a.m23418r(drawable).mutate();
            if (z) {
                C5135a.m23415o(drawable, colorStateList);
            }
            if (z2) {
                C5135a.m23416p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    private void m47665o() {
        m47664n(this.f48559U, this.f48563W, this.f48561V, this.f48579m0, this.f48577l0);
    }

    /* renamed from: o0 */
    private static void m47666o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C6530j.character_counter_overflowed_content_description : C6530j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: p */
    private void m47667p() {
        int i = this.f48537J;
        if (i == 0) {
            this.f48527E = null;
            this.f48529F = null;
        } else if (i == 1) {
            this.f48527E = new C10889h(this.f48531G);
            this.f48529F = new C10889h();
        } else if (i == 2) {
            if (!this.f48521B || (this.f48527E instanceof C10332c)) {
                this.f48527E = new C10889h(this.f48531G);
            } else {
                this.f48527E = new C10332c(this.f48531G);
            }
            this.f48529F = null;
        } else {
            throw new IllegalArgumentException(this.f48537J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: p0 */
    private void m47668p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f48580n;
        if (textView != null) {
            mo41548e0(textView, this.f48578m ? this.f48582o : this.f48584p);
            if (!this.f48578m && (colorStateList2 = this.f48596v) != null) {
                this.f48580n.setTextColor(colorStateList2);
            }
            if (this.f48578m && (colorStateList = this.f48598w) != null) {
                this.f48580n.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: q */
    private int m47669q() {
        return this.f48537J == 1 ? C10538a.m48272f(C10538a.m48271e(this, C6522b.colorSurface, 0), this.f48549P) : this.f48549P;
    }

    /* renamed from: q0 */
    private void m47670q0() {
        if (m47619A() && !this.f48554R0 && this.f48535I != this.f48541L) {
            m47683y();
            m47638T();
        }
    }

    /* renamed from: r */
    private Rect m47671r(Rect rect) {
        if (this.f48570f != null) {
            Rect rect2 = this.f48553R;
            boolean z = C5723u.m25265B(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f48537J;
            if (i == 1) {
                rect2.left = m47630G(rect.left, z);
                rect2.top = rect.top + this.f48539K;
                rect2.right = m47631H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m47630G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m47631H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f48570f.getPaddingLeft();
                rect2.top = rect.top - m47678v();
                rect2.right = rect.right - this.f48570f.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m47672r0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f48570f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m47652g0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f48567c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f48570f
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f48581n0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f48583o0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f48581n0 = r6
            r10.f48583o0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f48570f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0624k.m3451a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f48581n0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f48570f
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0624k.m3462l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f48581n0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f48570f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0624k.m3451a(r0)
            android.widget.EditText r6 = r10.f48570f
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0624k.m3462l(r6, r2, r7, r8, r0)
            r10.f48581n0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m47650f0()
            if (r6 == 0) goto L_0x00d3
            android.widget.TextView r2 = r10.f48519A
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f48570f
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p111m0.C5709g.m25217b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f48570f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0624k.m3451a(r6)
            android.graphics.drawable.Drawable r7 = r10.f48605z0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f48520A0
            if (r8 == r2) goto L_0x00ad
            r10.f48520A0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f48570f
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f48605z0
            r3 = r6[r3]
            androidx.core.widget.C0624k.m3462l(r0, r1, r2, r4, r3)
            goto L_0x00f4
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f48605z0 = r7
            r10.f48520A0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f48605z0
            if (r2 == r7) goto L_0x00d1
            r0 = r6[r4]
            r10.f48522B0 = r0
            android.widget.EditText r0 = r10.f48570f
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C0624k.m3462l(r0, r1, r2, r7, r3)
            goto L_0x00f4
        L_0x00d1:
            r5 = r0
            goto L_0x00f4
        L_0x00d3:
            android.graphics.drawable.Drawable r6 = r10.f48605z0
            if (r6 == 0) goto L_0x00f5
            android.widget.EditText r6 = r10.f48570f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0624k.m3451a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f48605z0
            if (r4 != r7) goto L_0x00f1
            android.widget.EditText r0 = r10.f48570f
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f48522B0
            r3 = r6[r3]
            androidx.core.widget.C0624k.m3462l(r0, r1, r4, r7, r3)
            goto L_0x00f2
        L_0x00f1:
            r5 = r0
        L_0x00f2:
            r10.f48605z0 = r2
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m47672r0():boolean");
    }

    /* renamed from: s */
    private int m47673s(Rect rect, Rect rect2, float f) {
        if (m47635P()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f48570f.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f48570f == null) {
            if (this.f48589r0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f48570f = editText;
            setMinWidth(this.f48572h);
            setMaxWidth(this.f48573i);
            m47637S();
            setTextInputAccessibilityDelegate(new C10317e(this));
            this.f48556S0.mo40891C0(this.f48570f.getTypeface());
            this.f48556S0.mo40918m0(this.f48570f.getTextSize());
            int gravity = this.f48570f.getGravity();
            this.f48556S0.mo40909c0((gravity & -113) | 48);
            this.f48556S0.mo40916l0(gravity);
            this.f48570f.addTextChangedListener(new C10313a());
            if (this.f48532G0 == null) {
                this.f48532G0 = this.f48570f.getHintTextColors();
            }
            if (this.f48521B) {
                if (TextUtils.isEmpty(this.f48523C)) {
                    CharSequence hint = this.f48570f.getHint();
                    this.f48571g = hint;
                    setHint(hint);
                    this.f48570f.setHint((CharSequence) null);
                }
                this.f48525D = true;
            }
            if (this.f48580n != null) {
                mo41600n0(this.f48570f.getText().length());
            }
            mo41605s0();
            this.f48574j.mo41744e();
            this.f48567c.bringToFront();
            this.f48568d.bringToFront();
            this.f48569e.bringToFront();
            this.f48528E0.bringToFront();
            m47621B();
            m47620A0();
            m47626D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m47680w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f48528E0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f48569e;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m47626D0();
        if (!m47632I()) {
            m47672r0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f48523C)) {
            this.f48523C = charSequence;
            this.f48556S0.mo40887A0(charSequence);
            if (!this.f48554R0) {
                m47638T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f48588r != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f48590s = appCompatTextView;
                appCompatTextView.setId(C6526f.textinput_placeholder);
                C5723u.m25334q0(this.f48590s, 1);
                setPlaceholderTextAppearance(this.f48594u);
                setPlaceholderTextColor(this.f48592t);
                m47651g();
            } else {
                m47641Z();
                this.f48590s = null;
            }
            this.f48588r = z;
        }
    }

    /* renamed from: t */
    private int m47674t(Rect rect, float f) {
        if (m47635P()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f48570f.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    private boolean m47675t0() {
        int max;
        if (this.f48570f == null || this.f48570f.getMeasuredHeight() >= (max = Math.max(this.f48568d.getMeasuredHeight(), this.f48567c.getMeasuredHeight()))) {
            return false;
        }
        this.f48570f.setMinimumHeight(max);
        return true;
    }

    /* renamed from: u */
    private Rect m47676u(Rect rect) {
        if (this.f48570f != null) {
            Rect rect2 = this.f48553R;
            float B = this.f48556S0.mo40888B();
            rect2.left = rect.left + this.f48570f.getCompoundPaddingLeft();
            rect2.top = m47674t(rect, B);
            rect2.right = rect.right - this.f48570f.getCompoundPaddingRight();
            rect2.bottom = m47673s(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    private void m47677u0() {
        if (this.f48537J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48566b.getLayoutParams();
            int v = m47678v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f48566b.requestLayout();
            }
        }
    }

    /* renamed from: v */
    private int m47678v() {
        float s;
        if (!this.f48521B) {
            return 0;
        }
        int i = this.f48537J;
        if (i == 0 || i == 1) {
            s = this.f48556S0.mo40926s();
        } else if (i != 2) {
            return 0;
        } else {
            s = this.f48556S0.mo40926s() / 2.0f;
        }
        return (int) s;
    }

    /* renamed from: w */
    private boolean m47679w() {
        return this.f48537J == 2 && m47681x();
    }

    /* renamed from: w0 */
    private void m47680w0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f48570f;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f48570f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f48574j.mo41746k();
        ColorStateList colorStateList2 = this.f48532G0;
        if (colorStateList2 != null) {
            this.f48556S0.mo40907b0(colorStateList2);
            this.f48556S0.mo40915k0(this.f48532G0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f48532G0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f48552Q0) : this.f48552Q0;
            this.f48556S0.mo40907b0(ColorStateList.valueOf(colorForState));
            this.f48556S0.mo40915k0(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f48556S0.mo40907b0(this.f48574j.mo41750p());
        } else if (this.f48578m && (textView = this.f48580n) != null) {
            this.f48556S0.mo40907b0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f48534H0) != null) {
            this.f48556S0.mo40907b0(colorStateList);
        }
        if (z3 || !this.f48558T0 || (isEnabled() && z4)) {
            if (z2 || this.f48554R0) {
                m47685z(z);
            }
        } else if (z2 || !this.f48554R0) {
            m47629F(z);
        }
    }

    /* renamed from: x */
    private boolean m47681x() {
        return this.f48541L > -1 && this.f48547O != 0;
    }

    /* renamed from: x0 */
    private void m47682x0() {
        EditText editText;
        if (this.f48590s != null && (editText = this.f48570f) != null) {
            this.f48590s.setGravity(editText.getGravity());
            this.f48590s.setPadding(this.f48570f.getCompoundPaddingLeft(), this.f48570f.getCompoundPaddingTop(), this.f48570f.getCompoundPaddingRight(), this.f48570f.getCompoundPaddingBottom());
        }
    }

    /* renamed from: y */
    private void m47683y() {
        if (m47619A()) {
            ((C10332c) this.f48527E).mo41720t0();
        }
    }

    /* renamed from: y0 */
    private void m47684y0() {
        EditText editText = this.f48570f;
        m47686z0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: z */
    private void m47685z(boolean z) {
        ValueAnimator valueAnimator = this.f48562V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f48562V0.cancel();
        }
        if (!z || !this.f48560U0) {
            this.f48556S0.mo40921p0(1.0f);
        } else {
            mo41599i(1.0f);
        }
        this.f48554R0 = false;
        if (m47619A()) {
            m47638T();
        }
        m47684y0();
        m47622B0();
        m47628E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m47686z0(int i) {
        if (i != 0 || this.f48554R0) {
            m47633J();
        } else {
            m47655i0();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f48570f;
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41533F0() {
        /*
            r6 = this;
            p6.h r0 = r6.f48527E
            if (r0 == 0) goto L_0x00f6
            int r0 = r6.f48537J
            if (r0 != 0) goto L_0x000a
            goto L_0x00f6
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f48570f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f48570f
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f48552Q0
            r6.f48547O = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f48574j
            boolean r4 = r4.mo41746k()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f48542L0
            if (r4 == 0) goto L_0x004f
            r6.m47624C0(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f48574j
            int r4 = r4.mo41749o()
            r6.f48547O = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f48578m
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f48580n
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f48542L0
            if (r5 == 0) goto L_0x0068
            r6.m47624C0(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f48547O = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f48540K0
            r6.f48547O = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f48538J0
            r6.f48547O = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f48536I0
            r6.f48547O = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f48574j
            boolean r4 = r4.mo41756x()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f48574j
            boolean r4 = r4.mo41746k()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            r6.mo41540W()
            r6.mo41541Y()
            r6.mo41539V()
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo41724d()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.f r1 = r6.f48574j
            boolean r1 = r1.mo41746k()
            r6.m47657j0(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c4
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c4
            int r1 = r6.f48545N
            r6.f48541L = r1
            goto L_0x00c8
        L_0x00c4:
            int r1 = r6.f48543M
            r6.f48541L = r1
        L_0x00c8:
            int r1 = r6.f48537J
            r4 = 2
            if (r1 != r4) goto L_0x00d0
            r6.m47670q0()
        L_0x00d0:
            int r1 = r6.f48537J
            if (r1 != r2) goto L_0x00f3
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00df
            int r0 = r6.f48546N0
            r6.f48549P = r0
            goto L_0x00f3
        L_0x00df:
            if (r3 == 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            int r0 = r6.f48550P0
            r6.f48549P = r0
            goto L_0x00f3
        L_0x00e8:
            if (r0 == 0) goto L_0x00ef
            int r0 = r6.f48548O0
            r6.f48549P = r0
            goto L_0x00f3
        L_0x00ef:
            int r0 = r6.f48544M0
            r6.f48549P = r0
        L_0x00f3:
            r6.m47656j()
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo41533F0():void");
    }

    /* renamed from: K */
    public boolean mo41534K() {
        return this.f48569e.getVisibility() == 0 && this.f48593t0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean mo41535M() {
        return this.f48574j.mo41757y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo41536N() {
        return this.f48554R0;
    }

    /* renamed from: O */
    public boolean mo41537O() {
        return this.f48525D;
    }

    /* renamed from: Q */
    public boolean mo41538Q() {
        return this.f48559U.getVisibility() == 0;
    }

    /* renamed from: V */
    public void mo41539V() {
        m47640X(this.f48593t0, this.f48597v0);
    }

    /* renamed from: W */
    public void mo41540W() {
        m47640X(this.f48528E0, this.f48530F0);
    }

    /* renamed from: Y */
    public void mo41541Y() {
        m47640X(this.f48559U, this.f48561V);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f48566b.addView(view, layoutParams2);
            this.f48566b.setLayoutParams(layoutParams);
            m47677u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f48570f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f48571g != null) {
            boolean z = this.f48525D;
            this.f48525D = false;
            CharSequence hint = editText.getHint();
            this.f48570f.setHint(this.f48571g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f48570f.setHint(hint);
                this.f48525D = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f48566b.getChildCount());
            for (int i2 = 0; i2 < this.f48566b.getChildCount(); i2++) {
                View childAt = this.f48566b.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f48570f) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f48565X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f48565X0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m47627E(canvas);
        m47625D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f48564W0) {
            boolean z = true;
            this.f48564W0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C10188a aVar = this.f48556S0;
            boolean z0 = aVar != null ? aVar.mo40936z0(drawableState) | false : false;
            if (this.f48570f != null) {
                if (!C5723u.m25294T(this) || !isEnabled()) {
                    z = false;
                }
                mo41691v0(z);
            }
            mo41605s0();
            mo41533F0();
            if (z0) {
                invalidate();
            }
            this.f48564W0 = false;
        }
    }

    /* renamed from: e */
    public void mo41547e(C10318f fVar) {
        this.f48587q0.add(fVar);
        if (this.f48570f != null) {
            fVar.mo41705a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo41548e0(TextView textView, int i) {
        boolean z = true;
        try {
            C0624k.m3467q(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0624k.m3467q(textView, C6531k.f26607b);
            textView.setTextColor(C0600b.m3292d(getContext(), C6523c.design_error));
        }
    }

    /* renamed from: f */
    public void mo41549f(C10319g gVar) {
        this.f48595u0.add(gVar);
    }

    public int getBaseline() {
        EditText editText = this.f48570f;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m47678v();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C10889h getBoxBackground() {
        int i = this.f48537J;
        if (i == 1 || i == 2) {
            return this.f48527E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f48549P;
    }

    public int getBoxBackgroundMode() {
        return this.f48537J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f48527E.mo43113s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f48527E.mo43114t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f48527E.mo43081J();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f48527E.mo43080I();
    }

    public int getBoxStrokeColor() {
        return this.f48540K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f48542L0;
    }

    public int getBoxStrokeWidth() {
        return this.f48543M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f48545N;
    }

    public int getCounterMaxLength() {
        return this.f48576l;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f48575k || !this.f48578m || (textView = this.f48580n) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f48596v;
    }

    public ColorStateList getCounterTextColor() {
        return this.f48596v;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f48532G0;
    }

    public EditText getEditText() {
        return this.f48570f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f48593t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f48593t0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f48589r0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f48593t0;
    }

    public CharSequence getError() {
        if (this.f48574j.mo41756x()) {
            return this.f48574j.mo41748n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f48574j.mo41747m();
    }

    public int getErrorCurrentTextColors() {
        return this.f48574j.mo41749o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f48528E0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f48574j.mo41749o();
    }

    public CharSequence getHelperText() {
        if (this.f48574j.mo41757y()) {
            return this.f48574j.mo41751q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f48574j.mo41752r();
    }

    public CharSequence getHint() {
        if (this.f48521B) {
            return this.f48523C;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f48556S0.mo40926s();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f48556S0.mo40931w();
    }

    public ColorStateList getHintTextColor() {
        return this.f48534H0;
    }

    public int getMaxWidth() {
        return this.f48573i;
    }

    public int getMinWidth() {
        return this.f48572h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f48593t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f48593t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f48588r) {
            return this.f48586q;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f48594u;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f48592t;
    }

    public CharSequence getPrefixText() {
        return this.f48600x;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f48602y.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f48602y;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f48559U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f48559U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f48604z;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f48519A.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f48519A;
    }

    public Typeface getTypeface() {
        return this.f48557T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo41599i(float f) {
        if (this.f48556S0.mo40892D() != f) {
            if (this.f48562V0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f48562V0 = valueAnimator;
                valueAnimator.setInterpolator(C10493a.f49009b);
                this.f48562V0.setDuration(167);
                this.f48562V0.addUpdateListener(new C10316d());
            }
            this.f48562V0.setFloatValues(new float[]{this.f48556S0.mo40892D(), f});
            this.f48562V0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo41600n0(int i) {
        boolean z = this.f48578m;
        int i2 = this.f48576l;
        if (i2 == -1) {
            this.f48580n.setText(String.valueOf(i));
            this.f48580n.setContentDescription((CharSequence) null);
            this.f48578m = false;
        } else {
            this.f48578m = i > i2;
            m47666o0(getContext(), this.f48580n, i, this.f48576l, this.f48578m);
            if (z != this.f48578m) {
                m47668p0();
            }
            this.f48580n.setText(C5535a.m24694c().mo22078j(getContext().getString(C6530j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f48576l)})));
        }
        if (this.f48570f != null && z != this.f48578m) {
            mo41691v0(false);
            mo41533F0();
            mo41605s0();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f48570f;
        if (editText != null) {
            Rect rect = this.f48551Q;
            C10192c.m47017a(this, editText, rect);
            m47661l0(rect);
            if (this.f48521B) {
                this.f48556S0.mo40918m0(this.f48570f.getTextSize());
                int gravity = this.f48570f.getGravity();
                this.f48556S0.mo40909c0((gravity & -113) | 48);
                this.f48556S0.mo40916l0(gravity);
                this.f48556S0.mo40905Y(m47671r(rect));
                this.f48556S0.mo40913h0(m47676u(rect));
                this.f48556S0.mo40902U();
                if (m47619A() && !this.f48554R0) {
                    m47638T();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean t0 = m47675t0();
        boolean r0 = m47672r0();
        if (t0 || r0) {
            this.f48570f.post(new C10315c());
        }
        m47682x0();
        m47620A0();
        m47626D0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        setError(savedState.f48606d);
        if (savedState.f48607e) {
            this.f48593t0.post(new C10314b());
        }
        setHint(savedState.f48608f);
        setHelperText(savedState.f48609g);
        setPlaceholderText(savedState.f48610h);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f48574j.mo41746k()) {
            savedState.f48606d = getError();
        }
        savedState.f48607e = m47632I() && this.f48593t0.isChecked();
        savedState.f48608f = getHint();
        savedState.f48609g = getHelperText();
        savedState.f48610h = getPlaceholderText();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo41605s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f48570f;
        if (editText != null && this.f48537J == 0 && (background = editText.getBackground()) != null) {
            if (C0409p.m2197a(background)) {
                background = background.mutate();
            }
            if (this.f48574j.mo41746k()) {
                background.setColorFilter(C0382f.m1972e(this.f48574j.mo41749o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f48578m || (textView = this.f48580n) == null) {
                C5135a.m23403c(background);
                this.f48570f.refreshDrawableState();
            } else {
                background.setColorFilter(C0382f.m1972e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f48549P != i) {
            this.f48549P = i;
            this.f48544M0 = i;
            this.f48548O0 = i;
            this.f48550P0 = i;
            m47656j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0600b.m3292d(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f48544M0 = defaultColor;
        this.f48549P = defaultColor;
        this.f48546N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f48548O0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f48550P0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m47656j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f48537J) {
            this.f48537J = i;
            if (this.f48570f != null) {
                m47637S();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f48540K0 != i) {
            this.f48540K0 = i;
            mo41533F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f48536I0 = colorStateList.getDefaultColor();
            this.f48552Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f48538J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f48540K0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f48540K0 != colorStateList.getDefaultColor()) {
            this.f48540K0 = colorStateList.getDefaultColor();
        }
        mo41533F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f48542L0 != colorStateList) {
            this.f48542L0 = colorStateList;
            mo41533F0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f48543M = i;
        mo41533F0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f48545N = i;
        mo41533F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f48575k != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f48580n = appCompatTextView;
                appCompatTextView.setId(C6526f.textinput_counter);
                Typeface typeface = this.f48557T;
                if (typeface != null) {
                    this.f48580n.setTypeface(typeface);
                }
                this.f48580n.setMaxLines(1);
                this.f48574j.mo41743d(this.f48580n, 2);
                C5709g.m25219d((ViewGroup.MarginLayoutParams) this.f48580n.getLayoutParams(), getResources().getDimensionPixelOffset(C6524d.mtrl_textinput_counter_margin_start));
                m47668p0();
                m47663m0();
            } else {
                this.f48574j.mo41758z(this.f48580n, 2);
                this.f48580n = null;
            }
            this.f48575k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f48576l != i) {
            if (i > 0) {
                this.f48576l = i;
            } else {
                this.f48576l = -1;
            }
            if (this.f48575k) {
                m47663m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f48582o != i) {
            this.f48582o = i;
            m47668p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f48598w != colorStateList) {
            this.f48598w = colorStateList;
            m47668p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f48584p != i) {
            this.f48584p = i;
            m47668p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f48596v != colorStateList) {
            this.f48596v = colorStateList;
            m47668p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f48532G0 = colorStateList;
        this.f48534H0 = colorStateList;
        if (this.f48570f != null) {
            mo41691v0(false);
        }
    }

    public void setEnabled(boolean z) {
        m47639U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f48593t0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f48593t0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f48589r0;
        this.f48589r0 = i;
        m47623C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo41723b(this.f48537J)) {
            getEndIconDelegate().mo41707a();
            m47662m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f48537J + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m47647c0(this.f48593t0, onClickListener, this.f48524C0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f48524C0 = onLongClickListener;
        m47649d0(this.f48593t0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f48597v0 != colorStateList) {
            this.f48597v0 = colorStateList;
            this.f48599w0 = true;
            m47662m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f48601x0 != mode) {
            this.f48601x0 = mode;
            this.f48603y0 = true;
            m47662m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo41534K() != z) {
            this.f48593t0.setVisibility(z ? 0 : 8);
            m47626D0();
            m47672r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f48574j.mo41756x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f48574j.mo41741M(charSequence);
        } else {
            this.f48574j.mo41753t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f48574j.mo41733B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f48574j.mo41734C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C5264a.m23789d(getContext(), i) : null);
        mo41540W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m47647c0(this.f48528E0, onClickListener, this.f48526D0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f48526D0 = onLongClickListener;
        m47649d0(this.f48528E0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f48530F0 = colorStateList;
        Drawable drawable = this.f48528E0.getDrawable();
        if (drawable != null) {
            drawable = C5135a.m23418r(drawable).mutate();
            C5135a.m23415o(drawable, colorStateList);
        }
        if (this.f48528E0.getDrawable() != drawable) {
            this.f48528E0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f48528E0.getDrawable();
        if (drawable != null) {
            drawable = C5135a.m23418r(drawable).mutate();
            C5135a.m23416p(drawable, mode);
        }
        if (this.f48528E0.getDrawable() != drawable) {
            this.f48528E0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f48574j.mo41735D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f48574j.mo41736E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f48558T0 != z) {
            this.f48558T0 = z;
            mo41691v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo41535M()) {
                setHelperTextEnabled(true);
            }
            this.f48574j.mo41742N(charSequence);
        } else if (mo41535M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f48574j.mo41739H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f48574j.mo41738G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f48574j.mo41737F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f48521B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f48560U0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f48521B) {
            this.f48521B = z;
            if (!z) {
                this.f48525D = false;
                if (!TextUtils.isEmpty(this.f48523C) && TextUtils.isEmpty(this.f48570f.getHint())) {
                    this.f48570f.setHint(this.f48523C);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f48570f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f48523C)) {
                        setHint(hint);
                    }
                    this.f48570f.setHint((CharSequence) null);
                }
                this.f48525D = true;
            }
            if (this.f48570f != null) {
                m47677u0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f48556S0.mo40906Z(i);
        this.f48534H0 = this.f48556S0.mo40922q();
        if (this.f48570f != null) {
            mo41691v0(false);
            m47677u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f48534H0 != colorStateList) {
            if (this.f48532G0 == null) {
                this.f48556S0.mo40907b0(colorStateList);
            }
            this.f48534H0 = colorStateList;
            if (this.f48570f != null) {
                mo41691v0(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f48573i = i;
        EditText editText = this.f48570f;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.f48572h = i;
        EditText editText = this.f48570f;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f48589r0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f48597v0 = colorStateList;
        this.f48599w0 = true;
        m47662m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f48601x0 = mode;
        this.f48603y0 = true;
        m47662m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f48588r || !TextUtils.isEmpty(charSequence)) {
            if (!this.f48588r) {
                setPlaceholderTextEnabled(true);
            }
            this.f48586q = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m47684y0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f48594u = i;
        TextView textView = this.f48590s;
        if (textView != null) {
            C0624k.m3467q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f48592t != colorStateList) {
            this.f48592t = colorStateList;
            TextView textView = this.f48590s;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f48600x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f48602y.setText(charSequence);
        m47622B0();
    }

    public void setPrefixTextAppearance(int i) {
        C0624k.m3467q(this.f48602y, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f48602y.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f48559U.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m47647c0(this.f48559U, onClickListener, this.f48585p0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f48585p0 = onLongClickListener;
        m47649d0(this.f48559U, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f48561V != colorStateList) {
            this.f48561V = colorStateList;
            this.f48563W = true;
            m47665o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f48577l0 != mode) {
            this.f48577l0 = mode;
            this.f48579m0 = true;
            m47665o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo41538Q() != z) {
            this.f48559U.setVisibility(z ? 0 : 8);
            m47620A0();
            m47672r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f48604z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f48519A.setText(charSequence);
        m47628E0();
    }

    public void setSuffixTextAppearance(int i) {
        C0624k.m3467q(this.f48519A, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f48519A.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C10317e eVar) {
        EditText editText = this.f48570f;
        if (editText != null) {
            C5723u.m25330o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f48557T) {
            this.f48557T = typeface;
            this.f48556S0.mo40891C0(typeface);
            this.f48574j.mo41740J(typeface);
            TextView textView = this.f48580n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo41691v0(boolean z) {
        m47680w0(z, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f48518Y0
            r1 = r27
            android.content.Context r1 = p246q6.C10962a.m49296c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f48572h = r10
            r0.f48573i = r10
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f48574j = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f48551Q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f48553R = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f48555S = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f48587q0 = r1
            r11 = 0
            r0.f48589r0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f48591s0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f48595u0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f48556S0 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.f48566b = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.f48567c = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f48568d = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.f48569e = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = p200d6.C10493a.f49008a
            r1.mo40889B0(r2)
            r1.mo40933x0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo40909c0(r2)
            int[] r3 = p194c6.C6532l.f27040n8
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = p194c6.C6532l.f26706I8
            r2[r11] = r1
            int r11 = p194c6.C6532l.f26684G8
            r2[r14] = r11
            int r10 = p194c6.C6532l.f26847V8
            r14 = 2
            r2[r14] = r10
            int r14 = p194c6.C6532l.f26898a9
            r16 = r12
            r12 = 3
            r2[r12] = r14
            int r12 = p194c6.C6532l.f26942e9
            r17 = 4
            r2[r17] = r12
            r17 = r15
            r15 = r1
            r1 = r13
            r18 = r2
            r2 = r28
            r19 = r4
            r4 = r29
            r20 = r11
            r11 = r5
            r5 = r9
            r6 = r18
            androidx.appcompat.widget.f0 r1 = com.google.android.material.internal.C10220m.m47117i(r1, r2, r3, r4, r5, r6)
            int r2 = p194c6.C6532l.f26931d9
            r3 = 1
            boolean r2 = r1.mo2095a(r2, r3)
            r0.f48521B = r2
            int r2 = p194c6.C6532l.f27095s8
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = p194c6.C6532l.f26920c9
            boolean r2 = r1.mo2095a(r2, r3)
            r0.f48560U0 = r2
            int r2 = p194c6.C6532l.f26867X8
            boolean r2 = r1.mo2095a(r2, r3)
            r0.f48558T0 = r2
            int r2 = p194c6.C6532l.f27084r8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x0122
            r3 = -1
            int r2 = r1.mo2100f(r2, r3)
            r0.setMinWidth(r2)
            goto L_0x0123
        L_0x0122:
            r3 = -1
        L_0x0123:
            int r2 = p194c6.C6532l.f27073q8
            boolean r4 = r1.mo2113s(r2)
            if (r4 == 0) goto L_0x0132
            int r2 = r1.mo2100f(r2, r3)
            r0.setMaxWidth(r2)
        L_0x0132:
            p6.m$b r2 = p243p6.C10897m.m48996e(r13, r7, r8, r9)
            p6.m r2 = r2.mo43154m()
            r0.f48531G = r2
            android.content.res.Resources r2 = r13.getResources()
            int r3 = p194c6.C6524d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f48533H = r2
            int r2 = p194c6.C6532l.f27128v8
            r3 = 0
            int r2 = r1.mo2099e(r2, r3)
            r0.f48539K = r2
            int r2 = p194c6.C6532l.f26640C8
            android.content.res.Resources r3 = r13.getResources()
            int r4 = p194c6.C6524d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo2100f(r2, r3)
            r0.f48543M = r2
            int r2 = p194c6.C6532l.f26651D8
            android.content.res.Resources r3 = r13.getResources()
            int r4 = p194c6.C6524d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo2100f(r2, r3)
            r0.f48545N = r2
            int r2 = r0.f48543M
            r0.f48541L = r2
            int r2 = p194c6.C6532l.f27172z8
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo2098d(r2, r3)
            int r4 = p194c6.C6532l.f27161y8
            float r4 = r1.mo2098d(r4, r3)
            int r5 = p194c6.C6532l.f27139w8
            float r5 = r1.mo2098d(r5, r3)
            int r6 = p194c6.C6532l.f27150x8
            float r3 = r1.mo2098d(r6, r3)
            p6.m r6 = r0.f48531G
            p6.m$b r6 = r6.mo43140v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x01a1
            r6.mo43148E(r2)
        L_0x01a1:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a8
            r6.mo43152I(r4)
        L_0x01a8:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01af
            r6.mo43166z(r5)
        L_0x01af:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01b6
            r6.mo43162v(r3)
        L_0x01b6:
            p6.m r2 = r6.mo43154m()
            r0.f48531G = r2
            int r2 = p194c6.C6532l.f27106t8
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            if (r2 == 0) goto L_0x021f
            int r3 = r2.getDefaultColor()
            r0.f48544M0 = r3
            r0.f48549P = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01fa
            r3 = 1
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r4
            r3 = -1
            int r4 = r2.getColorForState(r5, r3)
            r0.f48546N0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r2.getColorForState(r5, r3)
            r0.f48548O0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r5, r3)
            r0.f48550P0 = r2
            goto L_0x022a
        L_0x01fa:
            r3 = -1
            int r2 = r0.f48544M0
            r0.f48548O0 = r2
            int r2 = p194c6.C6523c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p079g.C5264a.m23788c(r13, r2)
            r5 = 1
            int[] r6 = new int[r5]
            r7 = 0
            r6[r7] = r4
            int r4 = r2.getColorForState(r6, r3)
            r0.f48546N0 = r4
            int[] r4 = new int[r5]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r7] = r5
            int r2 = r2.getColorForState(r4, r3)
            r0.f48550P0 = r2
            goto L_0x022a
        L_0x021f:
            r7 = 0
            r0.f48549P = r7
            r0.f48544M0 = r7
            r0.f48546N0 = r7
            r0.f48548O0 = r7
            r0.f48550P0 = r7
        L_0x022a:
            int r2 = p194c6.C6532l.f27062p8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x023a
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.f48534H0 = r2
            r0.f48532G0 = r2
        L_0x023a:
            int r2 = p194c6.C6532l.f26618A8
            android.content.res.ColorStateList r3 = p233m6.C10805c.m48754b(r13, r1, r2)
            r4 = 0
            int r2 = r1.mo2096b(r2, r4)
            r0.f48540K0 = r2
            int r2 = p194c6.C6523c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.C0600b.m3292d(r13, r2)
            r0.f48536I0 = r2
            int r2 = p194c6.C6523c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.C0600b.m3292d(r13, r2)
            r0.f48552Q0 = r2
            int r2 = p194c6.C6523c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.C0600b.m3292d(r13, r2)
            r0.f48538J0 = r2
            if (r3 == 0) goto L_0x0264
            r0.setBoxStrokeColorStateList(r3)
        L_0x0264:
            int r2 = p194c6.C6532l.f26629B8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x0273
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0273:
            r2 = -1
            int r3 = r1.mo2108n(r12, r2)
            if (r3 == r2) goto L_0x0283
            r2 = 0
            int r3 = r1.mo2108n(r12, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x0284
        L_0x0283:
            r2 = 0
        L_0x0284:
            int r3 = r1.mo2108n(r10, r2)
            int r4 = p194c6.C6532l.f26794Q8
            java.lang.CharSequence r4 = r1.mo2110p(r4)
            int r5 = p194c6.C6532l.f26805R8
            boolean r5 = r1.mo2095a(r5, r2)
            android.content.Context r6 = r26.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = p194c6.C6528h.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r11, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f48528E0 = r6
            int r8 = p194c6.C6526f.text_input_error_icon
            r6.setId(r8)
            r8 = 8
            r6.setVisibility(r8)
            boolean r9 = p233m6.C10805c.m48759g(r13)
            if (r9 == 0) goto L_0x02bf
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            p111m0.C5709g.m25219d(r9, r2)
        L_0x02bf:
            int r2 = p194c6.C6532l.f26816S8
            boolean r9 = r1.mo2113s(r2)
            if (r9 == 0) goto L_0x02ce
            android.graphics.drawable.Drawable r2 = r1.mo2101g(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02ce:
            int r2 = p194c6.C6532l.f26827T8
            boolean r9 = r1.mo2113s(r2)
            if (r9 == 0) goto L_0x02dd
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02dd:
            int r2 = p194c6.C6532l.f26837U8
            boolean r9 = r1.mo2113s(r2)
            r10 = 0
            if (r9 == 0) goto L_0x02f2
            r9 = -1
            int r2 = r1.mo2105k(r2, r9)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C10227s.m47141i(r2, r10)
            r0.setErrorIconTintMode(r2)
        L_0x02f2:
            android.content.res.Resources r2 = r26.getResources()
            int r9 = p194c6.C6530j.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r9)
            r6.setContentDescription(r2)
            r2 = 2
            p111m0.C5723u.m25350y0(r6, r2)
            r2 = 0
            r6.setClickable(r2)
            r6.setPressable(r2)
            r6.setFocusable(r2)
            int r9 = r1.mo2108n(r14, r2)
            int r12 = p194c6.C6532l.f26887Z8
            boolean r12 = r1.mo2095a(r12, r2)
            int r14 = p194c6.C6532l.f26877Y8
            java.lang.CharSequence r14 = r1.mo2110p(r14)
            int r10 = p194c6.C6532l.f27030m9
            int r10 = r1.mo2108n(r10, r2)
            int r8 = p194c6.C6532l.f27019l9
            java.lang.CharSequence r8 = r1.mo2110p(r8)
            r18 = r10
            int r10 = p194c6.C6532l.f27063p9
            int r10 = r1.mo2108n(r10, r2)
            int r2 = p194c6.C6532l.f27052o9
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r21 = r10
            int r10 = p194c6.C6532l.f27151x9
            r22 = r2
            r2 = 0
            int r10 = r1.mo2108n(r10, r2)
            int r2 = p194c6.C6532l.f27140w9
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r23 = r10
            int r10 = p194c6.C6532l.f26662E8
            r24 = r2
            r2 = 0
            boolean r10 = r1.mo2095a(r10, r2)
            int r2 = p194c6.C6532l.f26673F8
            r25 = r10
            r10 = -1
            int r2 = r1.mo2105k(r2, r10)
            r0.setCounterMaxLength(r2)
            r2 = 0
            int r10 = r1.mo2108n(r15, r2)
            r0.f48584p = r10
            r10 = r20
            int r10 = r1.mo2108n(r10, r2)
            r0.f48582o = r10
            android.content.Context r10 = r26.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r15 = p194c6.C6528h.design_text_input_start_icon
            r20 = r8
            r8 = r17
            android.view.View r10 = r10.inflate(r15, r8, r2)
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f48559U = r10
            r15 = 8
            r10.setVisibility(r15)
            boolean r15 = p233m6.C10805c.m48759g(r13)
            if (r15 == 0) goto L_0x0398
            android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            p111m0.C5709g.m25218c(r15, r2)
        L_0x0398:
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = p194c6.C6532l.f27107t9
            boolean r15 = r1.mo2113s(r2)
            if (r15 == 0) goto L_0x03c7
            android.graphics.drawable.Drawable r2 = r1.mo2101g(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p194c6.C6532l.f27096s9
            boolean r15 = r1.mo2113s(r2)
            if (r15 == 0) goto L_0x03bd
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x03bd:
            int r2 = p194c6.C6532l.f27085r9
            r15 = 1
            boolean r2 = r1.mo2095a(r2, r15)
            r0.setStartIconCheckable(r2)
        L_0x03c7:
            int r2 = p194c6.C6532l.f27118u9
            boolean r15 = r1.mo2113s(r2)
            if (r15 == 0) goto L_0x03d6
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x03d6:
            int r2 = p194c6.C6532l.f27129v9
            boolean r15 = r1.mo2113s(r2)
            if (r15 == 0) goto L_0x03eb
            r15 = -1
            int r2 = r1.mo2105k(r2, r15)
            r15 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C10227s.m47141i(r2, r15)
            r0.setStartIconTintMode(r2)
        L_0x03eb:
            int r2 = p194c6.C6532l.f27117u8
            r15 = 0
            int r2 = r1.mo2105k(r2, r15)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r26.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r17 = r4
            r4 = r19
            android.view.View r2 = r2.inflate(r7, r4, r15)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f48593t0 = r2
            r4.addView(r2)
            r7 = 8
            r2.setVisibility(r7)
            boolean r7 = p233m6.C10805c.m48759g(r13)
            if (r7 == 0) goto L_0x0420
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            p111m0.C5709g.m25219d(r2, r15)
        L_0x0420:
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r7 = r16
            r15 = -1
            r7.append(r15, r2)
            com.google.android.material.textfield.g r2 = new com.google.android.material.textfield.g
            r2.<init>(r0)
            r15 = 0
            r7.append(r15, r2)
            com.google.android.material.textfield.h r2 = new com.google.android.material.textfield.h
            r2.<init>(r0)
            r15 = 1
            r7.append(r15, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r15 = 2
            r7.append(r15, r2)
            com.google.android.material.textfield.d r2 = new com.google.android.material.textfield.d
            r2.<init>(r0)
            r15 = 3
            r7.append(r15, r2)
            int r2 = p194c6.C6532l.f26761N8
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x0488
            r7 = 0
            int r2 = r1.mo2105k(r2, r7)
            r0.setEndIconMode(r2)
            int r2 = p194c6.C6532l.f26750M8
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x046e
            android.graphics.drawable.Drawable r2 = r1.mo2101g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x046e:
            int r2 = p194c6.C6532l.f26739L8
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x047d
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x047d:
            int r2 = p194c6.C6532l.f26728K8
            r7 = 1
            boolean r2 = r1.mo2095a(r2, r7)
            r0.setEndIconCheckable(r2)
            goto L_0x04ce
        L_0x0488:
            int r2 = p194c6.C6532l.f26986i9
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x04ce
            r7 = 0
            boolean r2 = r1.mo2095a(r2, r7)
            r0.setEndIconMode(r2)
            int r2 = p194c6.C6532l.f26975h9
            android.graphics.drawable.Drawable r2 = r1.mo2101g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p194c6.C6532l.f26964g9
            java.lang.CharSequence r2 = r1.mo2110p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p194c6.C6532l.f26997j9
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x04b9
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04b9:
            int r2 = p194c6.C6532l.f27008k9
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x04ce
            r7 = -1
            int r2 = r1.mo2105k(r2, r7)
            r7 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C10227s.m47141i(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04ce:
            int r2 = p194c6.C6532l.f26986i9
            boolean r2 = r1.mo2113s(r2)
            if (r2 != 0) goto L_0x04fa
            int r2 = p194c6.C6532l.f26772O8
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x04e5
            android.content.res.ColorStateList r2 = p233m6.C10805c.m48754b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e5:
            int r2 = p194c6.C6532l.f26783P8
            boolean r7 = r1.mo2113s(r2)
            if (r7 == 0) goto L_0x04fa
            r7 = -1
            int r2 = r1.mo2105k(r2, r7)
            r7 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C10227s.m47141i(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04fa:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f48602y = r2
            int r7 = p194c6.C6526f.textinput_prefix_text
            r2.setId(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r7.<init>(r15, r15)
            r2.setLayoutParams(r7)
            r7 = 1
            p111m0.C5723u.m25334q0(r2, r7)
            r8.addView(r10)
            r8.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f48519A = r2
            int r7 = p194c6.C6526f.textinput_suffix_text
            r2.setId(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r7.<init>(r15, r15, r8)
            r2.setLayoutParams(r7)
            r7 = 1
            p111m0.C5723u.m25334q0(r2, r7)
            r11.addView(r2)
            r11.addView(r6)
            r11.addView(r4)
            r0.setHelperTextEnabled(r12)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorEnabled(r5)
            r0.setErrorTextAppearance(r3)
            r2 = r17
            r0.setErrorContentDescription(r2)
            int r2 = r0.f48584p
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f48582o
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r20
            r0.setPlaceholderText(r2)
            r2 = r18
            r0.setPlaceholderTextAppearance(r2)
            r2 = r22
            r0.setPrefixText(r2)
            r2 = r21
            r0.setPrefixTextAppearance(r2)
            r2 = r24
            r0.setSuffixText(r2)
            r2 = r23
            r0.setSuffixTextAppearance(r2)
            int r2 = p194c6.C6532l.f26857W8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x0587
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setErrorTextColor(r2)
        L_0x0587:
            int r2 = p194c6.C6532l.f26909b9
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x0596
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setHelperTextColor(r2)
        L_0x0596:
            int r2 = p194c6.C6532l.f26953f9
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05a5
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setHintTextColor(r2)
        L_0x05a5:
            int r2 = p194c6.C6532l.f26717J8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05b4
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setCounterTextColor(r2)
        L_0x05b4:
            int r2 = p194c6.C6532l.f26695H8
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05c3
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05c3:
            int r2 = p194c6.C6532l.f27041n9
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05d2
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05d2:
            int r2 = p194c6.C6532l.f27074q9
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05e1
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05e1:
            int r2 = p194c6.C6532l.f27162y9
            boolean r3 = r1.mo2113s(r2)
            if (r3 == 0) goto L_0x05f0
            android.content.res.ColorStateList r2 = r1.mo2097c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05f0:
            r2 = r25
            r0.setCounterEnabled(r2)
            int r2 = p194c6.C6532l.f27051o8
            r3 = 1
            boolean r2 = r1.mo2095a(r2, r3)
            r0.setEnabled(r2)
            r1.mo2114w()
            r1 = 2
            p111m0.C5723u.m25350y0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x060f
            p111m0.C5723u.m25352z0(r0, r3)
        L_0x060f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f48593t0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f48593t0.setImageDrawable(drawable);
        mo41539V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f48559U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f48559U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo41541Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f48528E0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f48574j.mo41756x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f48593t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f48593t0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
