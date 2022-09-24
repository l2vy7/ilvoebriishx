package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.C10219l;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import p194c6.C6530j;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: DateFormatTextWatcher */
abstract class C10103c extends C10219l {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final TextInputLayout f47695b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DateFormat f47696c;

    /* renamed from: d */
    private final CalendarConstraints f47697d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f47698e;

    /* renamed from: f */
    private final Runnable f47699f;

    /* renamed from: g */
    private Runnable f47700g;

    /* renamed from: com.google.android.material.datepicker.c$a */
    /* compiled from: DateFormatTextWatcher */
    class C10104a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f47701b;

        C10104a(String str) {
            this.f47701b = str;
        }

        public void run() {
            TextInputLayout a = C10103c.this.f47695b;
            DateFormat b = C10103c.this.f47696c;
            Context context = a.getContext();
            String string = context.getString(C6530j.mtrl_picker_invalid_format);
            String format = String.format(context.getString(C6530j.mtrl_picker_invalid_format_use), new Object[]{this.f47701b});
            String format2 = String.format(context.getString(C6530j.mtrl_picker_invalid_format_example), new Object[]{b.format(new Date(C10138p.m46659o().getTimeInMillis()))});
            a.setError(string + "\n" + format + "\n" + format2);
            C10103c.this.mo40472e();
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$b */
    /* compiled from: DateFormatTextWatcher */
    class C10105b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f47703b;

        C10105b(long j) {
            this.f47703b = j;
        }

        public void run() {
            C10103c.this.f47695b.setError(String.format(C10103c.this.f47698e, new Object[]{C10106d.m46535c(this.f47703b)}));
            C10103c.this.mo40472e();
        }
    }

    C10103c(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f47696c = dateFormat;
        this.f47695b = textInputLayout;
        this.f47697d = calendarConstraints;
        this.f47698e = textInputLayout.getContext().getString(C6530j.mtrl_picker_out_of_range);
        this.f47699f = new C10104a(str);
    }

    /* renamed from: d */
    private Runnable m46529d(long j) {
        return new C10105b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo40472e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo40473f(Long l);

    /* renamed from: g */
    public void mo40488g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f47695b.removeCallbacks(this.f47699f);
        this.f47695b.removeCallbacks(this.f47700g);
        this.f47695b.setError((CharSequence) null);
        mo40473f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f47696c.parse(charSequence.toString());
                this.f47695b.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f47697d.mo40392g().mo40401h0(time) || !this.f47697d.mo40399m(time)) {
                    Runnable d = m46529d(time);
                    this.f47700g = d;
                    mo40488g(this.f47695b, d);
                    return;
                }
                mo40473f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo40488g(this.f47695b, this.f47699f);
            }
        }
    }
}
