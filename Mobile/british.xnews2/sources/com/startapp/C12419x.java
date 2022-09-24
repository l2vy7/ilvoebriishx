package com.startapp;

import android.view.View;
import com.startapp.C12437y;
import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.x */
/* compiled from: Sta */
public class C12419x implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C12437y.C12439b f55094a;

    public C12419x(C12437y.C12439b bVar) {
        this.f55094a = bVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C12417wc wcVar = (C12417wc) this.f55094a;
        VideoMode videoMode = wcVar.f55093a;
        videoMode.f54336V = true;
        if (videoMode.f54335U && videoMode.mo45992E()) {
            wcVar.f55093a.mo45989B();
        }
    }
}
