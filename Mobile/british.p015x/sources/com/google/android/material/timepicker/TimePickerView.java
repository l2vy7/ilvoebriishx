package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p111m0.C5723u;
import p194c6.C6526f;
import p194c6.C6528h;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    private final ClockHandView f48755A;

    /* renamed from: B */
    private final ClockFaceView f48756B;

    /* renamed from: C */
    private final MaterialButtonToggleGroup f48757C;

    /* renamed from: D */
    private final View.OnClickListener f48758D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C10371f f48759E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C10372g f48760F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C10370e f48761G;

    /* renamed from: y */
    private final Chip f48762y;

    /* renamed from: z */
    private final Chip f48763z;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class C10366a implements View.OnClickListener {
        C10366a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f48760F != null) {
                TimePickerView.this.f48760F.mo41807a(((Integer) view.getTag(C6526f.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C10367b implements MaterialButtonToggleGroup.C10061e {
        C10367b() {
        }

        /* renamed from: a */
        public void mo39917a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == C6526f.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f48759E != null && z) {
                TimePickerView.this.f48759E.mo41806a(i2);
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class C10368c extends GestureDetector.SimpleOnGestureListener {
        C10368c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f48761G != null) {
                TimePickerView.this.f48761G.mo41805a();
            }
            return onDoubleTap;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    class C10369d implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ GestureDetector f48767b;

        C10369d(GestureDetector gestureDetector) {
            this.f48767b = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f48767b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface C10370e {
        /* renamed from: a */
        void mo41805a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    interface C10371f {
        /* renamed from: a */
        void mo41806a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    interface C10372g {
        /* renamed from: a */
        void mo41807a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: C */
    private void m47875C() {
        Chip chip = this.f48762y;
        int i = C6526f.selection_type;
        chip.setTag(i, 12);
        this.f48763z.setTag(i, 10);
        this.f48762y.setOnClickListener(this.f48758D);
        this.f48763z.setOnClickListener(this.f48758D);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    private void m47876D() {
        C10369d dVar = new C10369d(new GestureDetector(getContext(), new C10368c()));
        this.f48762y.setOnTouchListener(dVar);
        this.f48763z.setOnTouchListener(dVar);
    }

    /* renamed from: E */
    private void m47877E() {
        if (this.f48757C.getVisibility() == 0) {
            C0564c cVar = new C0564c();
            cVar.mo2910j(this);
            int i = 1;
            if (C5723u.m25265B(this) == 0) {
                i = 2;
            }
            cVar.mo2908h(C6526f.material_clock_display, i);
            cVar.mo2904d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m47877E();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m47877E();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48758D = new C10366a();
        LayoutInflater.from(context).inflate(C6528h.material_timepicker, this);
        this.f48756B = (ClockFaceView) findViewById(C6526f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C6526f.material_clock_period_toggle);
        this.f48757C = materialButtonToggleGroup;
        materialButtonToggleGroup.mo39900g(new C10367b());
        this.f48762y = (Chip) findViewById(C6526f.material_minute_tv);
        this.f48763z = (Chip) findViewById(C6526f.material_hour_tv);
        this.f48755A = (ClockHandView) findViewById(C6526f.material_clock_hand);
        m47876D();
        m47875C();
    }
}
