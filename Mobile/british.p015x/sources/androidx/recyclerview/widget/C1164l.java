package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: ScrollbarHelper */
class C1164l {
    /* renamed from: a */
    static int m6473a(RecyclerView.C1121z zVar, C1157i iVar, View view, View view2, RecyclerView.C1104p pVar, boolean z) {
        if (pVar.mo5419J() == 0 || zVar.mo5578b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.mo5459h0(view) - pVar.mo5459h0(view2)) + 1;
        }
        return Math.min(iVar.mo5782n(), iVar.mo5772d(view2) - iVar.mo5775g(view));
    }

    /* renamed from: b */
    static int m6474b(RecyclerView.C1121z zVar, C1157i iVar, View view, View view2, RecyclerView.C1104p pVar, boolean z, boolean z2) {
        int i;
        if (pVar.mo5419J() == 0 || zVar.mo5578b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.mo5459h0(view), pVar.mo5459h0(view2));
        int max = Math.max(pVar.mo5459h0(view), pVar.mo5459h0(view2));
        if (z2) {
            i = Math.max(0, (zVar.mo5578b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(iVar.mo5772d(view2) - iVar.mo5775g(view))) / ((float) (Math.abs(pVar.mo5459h0(view) - pVar.mo5459h0(view2)) + 1)))) + ((float) (iVar.mo5781m() - iVar.mo5775g(view))));
    }

    /* renamed from: c */
    static int m6475c(RecyclerView.C1121z zVar, C1157i iVar, View view, View view2, RecyclerView.C1104p pVar, boolean z) {
        if (pVar.mo5419J() == 0 || zVar.mo5578b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.mo5578b();
        }
        return (int) ((((float) (iVar.mo5772d(view2) - iVar.mo5775g(view))) / ((float) (Math.abs(pVar.mo5459h0(view) - pVar.mo5459h0(view2)) + 1))) * ((float) zVar.mo5578b()));
    }
}
