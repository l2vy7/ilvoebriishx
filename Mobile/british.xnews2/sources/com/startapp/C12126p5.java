package com.startapp;

import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.p5 */
/* compiled from: Sta */
public class C12126p5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f54008a;

    public C12126p5(List3DView list3DView) {
        this.f54008a = list3DView;
    }

    public void run() {
        int b;
        List3DView list3DView = this.f54008a;
        if (list3DView.f54244b == 1 && (b = list3DView.mo45890b(list3DView.f54245c, list3DView.f54246d)) != -1) {
            List3DView list3DView2 = this.f54008a;
            View childAt = list3DView2.getChildAt(b);
            int i = list3DView2.f54251i + b;
            long itemId = list3DView2.f54243a.getItemId(i);
            AdapterView.OnItemLongClickListener onItemLongClickListener = list3DView2.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                onItemLongClickListener.onItemLongClick(list3DView2, childAt, i, itemId);
            }
        }
    }
}
