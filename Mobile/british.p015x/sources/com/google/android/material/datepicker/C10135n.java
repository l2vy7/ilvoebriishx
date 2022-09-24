package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1154g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: SmoothCalendarLayoutManager */
class C10135n extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C10136a extends C1154g {
        C10136a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5765v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C10135n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: I1 */
    public void mo5014I1(RecyclerView recyclerView, RecyclerView.C1121z zVar, int i) {
        C10136a aVar = new C10136a(recyclerView.getContext());
        aVar.mo5570p(i);
        mo5420J1(aVar);
    }
}
