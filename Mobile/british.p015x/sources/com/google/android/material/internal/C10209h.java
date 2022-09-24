package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.h */
/* compiled from: StateListAnimator */
public final class C10209h {

    /* renamed from: a */
    private final ArrayList<C10211b> f48096a = new ArrayList<>();

    /* renamed from: b */
    private C10211b f48097b = null;

    /* renamed from: c */
    ValueAnimator f48098c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f48099d = new C10210a();

    /* renamed from: com.google.android.material.internal.h$a */
    /* compiled from: StateListAnimator */
    class C10210a extends AnimatorListenerAdapter {
        C10210a() {
        }

        public void onAnimationEnd(Animator animator) {
            C10209h hVar = C10209h.this;
            if (hVar.f48098c == animator) {
                hVar.f48098c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* compiled from: StateListAnimator */
    static class C10211b {

        /* renamed from: a */
        final int[] f48101a;

        /* renamed from: b */
        final ValueAnimator f48102b;

        C10211b(int[] iArr, ValueAnimator valueAnimator) {
            this.f48101a = iArr;
            this.f48102b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m47077b() {
        ValueAnimator valueAnimator = this.f48098c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48098c = null;
        }
    }

    /* renamed from: e */
    private void m47078e(C10211b bVar) {
        ValueAnimator valueAnimator = bVar.f48102b;
        this.f48098c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo40977a(int[] iArr, ValueAnimator valueAnimator) {
        C10211b bVar = new C10211b(iArr, valueAnimator);
        valueAnimator.addListener(this.f48099d);
        this.f48096a.add(bVar);
    }

    /* renamed from: c */
    public void mo40978c() {
        ValueAnimator valueAnimator = this.f48098c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f48098c = null;
        }
    }

    /* renamed from: d */
    public void mo40979d(int[] iArr) {
        C10211b bVar;
        int size = this.f48096a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f48096a.get(i);
            if (StateSet.stateSetMatches(bVar.f48101a, iArr)) {
                break;
            }
            i++;
        }
        C10211b bVar2 = this.f48097b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m47077b();
            }
            this.f48097b = bVar;
            if (bVar != null) {
                m47078e(bVar);
            }
        }
    }
}
