package com.startapp;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* renamed from: com.startapp.y6 */
/* compiled from: Sta */
public class C12448y6 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ NativeAdDetails f55156a;

    public C12448y6(NativeAdDetails nativeAdDetails) {
        this.f55156a = nativeAdDetails;
    }

    public void onViewAttachedToWindow(View view) {
        View view2;
        NativeAdDetails nativeAdDetails = this.f55156a;
        nativeAdDetails.getClass();
        if (MetaData.f22407k.mo21175Q() && (view2 = (View) nativeAdDetails.f22208h.get()) != null) {
            C12011k7 k7Var = new C12011k7(view2.getContext(), nativeAdDetails.f22201a.mo46245b(), false);
            nativeAdDetails.f22211k = k7Var;
            if (k7Var.mo45503c()) {
                nativeAdDetails.f22211k.mo45500a(view2);
                nativeAdDetails.f22211k.mo45505e();
                nativeAdDetails.f22211k.mo45504d();
                nativeAdDetails.f22211k.mo45502b();
            }
        }
        this.f55156a.mo20775a();
    }

    public void onViewDetachedFromWindow(View view) {
        NativeAdDetails nativeAdDetails = this.f55156a;
        C12454yc ycVar = nativeAdDetails.f22207g;
        if (ycVar != null) {
            ycVar.mo46839a();
            nativeAdDetails.f22207g = null;
        }
        NativeAdDetails nativeAdDetails2 = this.f55156a;
        C12011k7 k7Var = nativeAdDetails2.f22211k;
        if (k7Var != null) {
            k7Var.mo45499a();
            nativeAdDetails2.f22211k = null;
        }
        view.removeOnAttachStateChangeListener(this.f55156a.f22209i);
    }
}
