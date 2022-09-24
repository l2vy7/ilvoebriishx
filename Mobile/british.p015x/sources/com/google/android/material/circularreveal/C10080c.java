package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C10078b;
import p227k6.C10648a;

/* renamed from: com.google.android.material.circularreveal.c */
/* compiled from: CircularRevealWidget */
public interface C10080c extends C10078b.C10079a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    /* compiled from: CircularRevealWidget */
    public static class C10082b implements TypeEvaluator<C10085e> {

        /* renamed from: b */
        public static final TypeEvaluator<C10085e> f47627b = new C10082b();

        /* renamed from: a */
        private final C10085e f47628a = new C10085e();

        /* renamed from: a */
        public C10085e evaluate(float f, C10085e eVar, C10085e eVar2) {
            this.f47628a.mo40381b(C10648a.m48416d(eVar.f47631a, eVar2.f47631a, f), C10648a.m48416d(eVar.f47632b, eVar2.f47632b, f), C10648a.m48416d(eVar.f47633c, eVar2.f47633c, f));
            return this.f47628a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* compiled from: CircularRevealWidget */
    public static class C10083c extends Property<C10080c, C10085e> {

        /* renamed from: a */
        public static final Property<C10080c, C10085e> f47629a = new C10083c("circularReveal");

        private C10083c(String str) {
            super(C10085e.class, str);
        }

        /* renamed from: a */
        public C10085e get(C10080c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C10080c cVar, C10085e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    /* compiled from: CircularRevealWidget */
    public static class C10084d extends Property<C10080c, Integer> {

        /* renamed from: a */
        public static final Property<C10080c, Integer> f47630a = new C10084d("circularRevealScrimColor");

        private C10084d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C10080c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C10080c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    /* compiled from: CircularRevealWidget */
    public static class C10085e {

        /* renamed from: a */
        public float f47631a;

        /* renamed from: b */
        public float f47632b;

        /* renamed from: c */
        public float f47633c;

        /* renamed from: a */
        public boolean mo40380a() {
            return this.f47633c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void mo40381b(float f, float f2, float f3) {
            this.f47631a = f;
            this.f47632b = f2;
            this.f47633c = f3;
        }

        /* renamed from: c */
        public void mo40382c(C10085e eVar) {
            mo40381b(eVar.f47631a, eVar.f47632b, eVar.f47633c);
        }

        private C10085e() {
        }

        public C10085e(float f, float f2, float f3) {
            this.f47631a = f;
            this.f47632b = f2;
            this.f47633c = f3;
        }

        public C10085e(C10085e eVar) {
            this(eVar.f47631a, eVar.f47632b, eVar.f47633c);
        }
    }

    /* renamed from: a */
    void mo40337a();

    /* renamed from: b */
    void mo40338b();

    int getCircularRevealScrimColor();

    C10085e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C10085e eVar);
}
