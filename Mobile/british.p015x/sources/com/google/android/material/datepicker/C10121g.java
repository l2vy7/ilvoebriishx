package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0690c;
import androidx.fragment.app.C0720q;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p079g.C5264a;
import p111m0.C5682a;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6525e;
import p194c6.C6526f;
import p194c6.C6528h;
import p194c6.C6530j;
import p194c6.C6531k;
import p211g6.C10567a;
import p233m6.C10804b;
import p243p6.C10889h;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: MaterialDatePicker */
public final class C10121g<S> extends C0690c {

    /* renamed from: T0 */
    static final Object f47744T0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: U0 */
    static final Object f47745U0 = "CANCEL_BUTTON_TAG";

    /* renamed from: V0 */
    static final Object f47746V0 = "TOGGLE_BUTTON_TAG";
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public final LinkedHashSet<C10126h<? super S>> f47747C0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public final LinkedHashSet<View.OnClickListener> f47748D0 = new LinkedHashSet<>();

    /* renamed from: E0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f47749E0 = new LinkedHashSet<>();

    /* renamed from: F0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f47750F0 = new LinkedHashSet<>();

    /* renamed from: G0 */
    private int f47751G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public DateSelector<S> f47752H0;

    /* renamed from: I0 */
    private C10134m<S> f47753I0;

    /* renamed from: J0 */
    private CalendarConstraints f47754J0;

    /* renamed from: K0 */
    private C10108f<S> f47755K0;

    /* renamed from: L0 */
    private int f47756L0;

    /* renamed from: M0 */
    private CharSequence f47757M0;

    /* renamed from: N0 */
    private boolean f47758N0;

    /* renamed from: O0 */
    private int f47759O0;

    /* renamed from: P0 */
    private TextView f47760P0;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public CheckableImageButton f47761Q0;

    /* renamed from: R0 */
    private C10889h f47762R0;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public Button f47763S0;

    /* renamed from: com.google.android.material.datepicker.g$a */
    /* compiled from: MaterialDatePicker */
    class C10122a implements View.OnClickListener {
        C10122a() {
        }

        public void onClick(View view) {
            Iterator it = C10121g.this.f47747C0.iterator();
            while (it.hasNext()) {
                ((C10126h) it.next()).mo40518a(C10121g.this.mo40512r2());
            }
            C10121g.this.mo3718Q1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$b */
    /* compiled from: MaterialDatePicker */
    class C10123b implements View.OnClickListener {
        C10123b() {
        }

        public void onClick(View view) {
            Iterator it = C10121g.this.f47748D0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C10121g.this.mo3718Q1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$c */
    /* compiled from: MaterialDatePicker */
    class C10124c extends C10133l<S> {
        C10124c() {
        }

        /* renamed from: a */
        public void mo40515a() {
            C10121g.this.f47763S0.setEnabled(false);
        }

        /* renamed from: b */
        public void mo40516b(S s) {
            C10121g.this.m46597y2();
            C10121g.this.f47763S0.setEnabled(C10121g.this.f47752H0.mo40422k0());
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$d */
    /* compiled from: MaterialDatePicker */
    class C10125d implements View.OnClickListener {
        C10125d() {
        }

        public void onClick(View view) {
            C10121g.this.f47763S0.setEnabled(C10121g.this.f47752H0.mo40422k0());
            C10121g.this.f47761Q0.toggle();
            C10121g gVar = C10121g.this;
            gVar.m46598z2(gVar.f47761Q0);
            C10121g.this.m46596x2();
        }
    }

    /* renamed from: n2 */
    private static Drawable m46588n2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C5264a.m23789d(context, C6525e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C5264a.m23789d(context, C6525e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: o2 */
    private static int m46589o2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C6524d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C6524d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C6524d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C6524d.mtrl_calendar_days_of_week_height);
        int i = C10129j.f47772g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C6524d.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C6524d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C6524d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: q2 */
    private static int m46590q2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C6524d.mtrl_calendar_content_padding);
        int i = Month.m46471i().f47660e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C6524d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C6524d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: s2 */
    private int m46591s2(Context context) {
        int i = this.f47751G0;
        if (i != 0) {
            return i;
        }
        return this.f47752H0.mo40421f0(context);
    }

    /* renamed from: t2 */
    private void m46592t2(Context context) {
        this.f47761Q0.setTag(f47746V0);
        this.f47761Q0.setImageDrawable(m46588n2(context));
        this.f47761Q0.setChecked(this.f47759O0 != 0);
        C5723u.m25330o0(this.f47761Q0, (C5682a) null);
        m46598z2(this.f47761Q0);
        this.f47761Q0.setOnClickListener(new C10125d());
    }

    /* renamed from: u2 */
    static boolean m46593u2(Context context) {
        return m46595w2(context, 16843277);
    }

    /* renamed from: v2 */
    static boolean m46594v2(Context context) {
        return m46595w2(context, C6522b.nestedScrollable);
    }

    /* renamed from: w2 */
    static boolean m46595w2(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10804b.m48751c(context, C6522b.materialCalendarStyle, C10108f.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m46596x2() {
        int s2 = m46591s2(mo3458t1());
        this.f47755K0 = C10108f.m46558f2(this.f47752H0, s2, this.f47754J0);
        this.f47753I0 = this.f47761Q0.isChecked() ? C10127i.m46610P1(this.f47752H0, s2, this.f47754J0) : this.f47755K0;
        m46597y2();
        C0720q m = mo3463v().mo3598m();
        m.mo3856o(C6526f.mtrl_calendar_frame, this.f47753I0);
        m.mo3674i();
        this.f47753I0.mo40497N1(new C10124c());
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public void m46597y2() {
        String p2 = mo40511p2();
        this.f47760P0.setContentDescription(String.format(mo3394U(C6530j.mtrl_picker_announce_current_selection), new Object[]{p2}));
        this.f47760P0.setText(p2);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m46598z2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f47761Q0.isChecked()) {
            str = checkableImageButton.getContext().getString(C6530j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C6530j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f47761Q0.setContentDescription(str);
    }

    /* renamed from: P0 */
    public final void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f47751G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f47752H0);
        CalendarConstraints.C10087b bVar = new CalendarConstraints.C10087b(this.f47754J0);
        if (this.f47755K0.mo40500a2() != null) {
            bVar.mo40407b(this.f47755K0.mo40500a2().f47662g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo40406a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f47756L0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f47757M0);
    }

    /* renamed from: Q0 */
    public void mo3387Q0() {
        super.mo3387Q0();
        Window window = mo3724Y1().getWindow();
        if (this.f47758N0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f47762R0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo3380N().getDimensionPixelOffset(C6524d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f47762R0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C10567a(mo3724Y1(), rect));
        }
        m46596x2();
    }

    /* renamed from: R0 */
    public void mo3389R0() {
        this.f47753I0.mo40540O1();
        super.mo3389R0();
    }

    /* renamed from: U1 */
    public final Dialog mo3721U1(Bundle bundle) {
        Dialog dialog = new Dialog(mo3458t1(), m46591s2(mo3458t1()));
        Context context = dialog.getContext();
        this.f47758N0 = m46593u2(context);
        int c = C10804b.m48751c(context, C6522b.colorSurface, C10121g.class.getCanonicalName());
        C10889h hVar = new C10889h(context, (AttributeSet) null, C6522b.materialCalendarStyle, C6531k.Widget_MaterialComponents_MaterialCalendar);
        this.f47762R0 = hVar;
        hVar.mo43084P(context);
        this.f47762R0.mo43091a0(ColorStateList.valueOf(c));
        this.f47762R0.mo43090Z(C5723u.m25345w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f47749E0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f47750F0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo3398W();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: p2 */
    public String mo40511p2() {
        return this.f47752H0.mo40420c(mo3466w());
    }

    /* renamed from: r2 */
    public final S mo40512r2() {
        return this.f47752H0.mo40424r0();
    }

    /* renamed from: t0 */
    public final void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        if (bundle == null) {
            bundle = mo3460u();
        }
        this.f47751G0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f47752H0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f47754J0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f47756L0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f47757M0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f47759O0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: x0 */
    public final View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f47758N0 ? C6528h.mtrl_picker_fullscreen : C6528h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f47758N0) {
            inflate.findViewById(C6526f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m46590q2(context), -2));
        } else {
            View findViewById = inflate.findViewById(C6526f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C6526f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m46590q2(context), -1));
            findViewById2.setMinimumHeight(m46589o2(mo3458t1()));
        }
        TextView textView = (TextView) inflate.findViewById(C6526f.mtrl_picker_header_selection_text);
        this.f47760P0 = textView;
        C5723u.m25334q0(textView, 1);
        this.f47761Q0 = (CheckableImageButton) inflate.findViewById(C6526f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C6526f.mtrl_picker_title_text);
        CharSequence charSequence = this.f47757M0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f47756L0);
        }
        m46592t2(context);
        this.f47763S0 = (Button) inflate.findViewById(C6526f.confirm_button);
        if (this.f47752H0.mo40422k0()) {
            this.f47763S0.setEnabled(true);
        } else {
            this.f47763S0.setEnabled(false);
        }
        this.f47763S0.setTag(f47744T0);
        this.f47763S0.setOnClickListener(new C10122a());
        Button button = (Button) inflate.findViewById(C6526f.f26605a);
        button.setTag(f47745U0);
        button.setOnClickListener(new C10123b());
        return inflate;
    }
}
