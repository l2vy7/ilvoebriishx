package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p199d5.C10487a;
import p199d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bn1 extends z30 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, do1 {

    /* renamed from: b */
    private final WeakReference<View> f20147b;

    /* renamed from: c */
    private final Map<String, WeakReference<View>> f20148c = new HashMap();

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f20149d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f20150e = new HashMap();
    @GuardedBy("this")

    /* renamed from: f */
    private dm1 f20151f;

    /* renamed from: g */
    private C7801in f20152g;

    public bn1(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzx();
        cp0.m31076a(view, this);
        zzt.zzx();
        cp0.m31077b(view, this);
        this.f20147b = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f20148c.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f20150e.putAll(this.f20148c);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f20149d.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f20150e.putAll(this.f20149d);
        this.f20152g = new C7801in(view.getContext(), view);
    }

    /* renamed from: K */
    public final synchronized void mo18149K(C10487a aVar) {
        Object f3 = C10489b.m48194f3(aVar);
        if (!(f3 instanceof dm1)) {
            co0.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31323s(this);
        }
        dm1 dm12 = (dm1) f3;
        if (dm12.mo31324t()) {
            this.f20151f = dm12;
            dm12.mo31322r(this);
            this.f20151f.mo31314j(zzf());
            return;
        }
        co0.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    /* renamed from: O */
    public final synchronized void mo18150O(C10487a aVar) {
        if (this.f20151f != null) {
            Object f3 = C10489b.m48194f3(aVar);
            if (!(f3 instanceof View)) {
                co0.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f20151f.mo31317m((View) f3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18151b2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f20150e     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f20148c     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn1.mo18151b2(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized void onClick(View view) {
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31307Q(view, zzf(), zzl(), zzm(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31305O(zzf(), zzl(), zzm(), dm1.m31477w(zzf()));
        }
    }

    public final synchronized void onScrollChanged() {
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31305O(zzf(), zzl(), zzm(), dm1.m31477w(zzf()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31315k(view, motionEvent, zzf());
        }
        return false;
    }

    /* renamed from: x */
    public final synchronized View mo18156x(String str) {
        WeakReference weakReference = this.f20150e.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void zzd() {
        dm1 dm1 = this.f20151f;
        if (dm1 != null) {
            dm1.mo31323s(this);
            this.f20151f = null;
        }
    }

    public final View zzf() {
        return (View) this.f20147b.get();
    }

    public final FrameLayout zzh() {
        return null;
    }

    public final C7801in zzi() {
        return this.f20152g;
    }

    public final synchronized C10487a zzj() {
        return null;
    }

    public final synchronized String zzk() {
        return "1007";
    }

    public final synchronized Map<String, WeakReference<View>> zzl() {
        return this.f20150e;
    }

    public final synchronized Map<String, WeakReference<View>> zzm() {
        return this.f20148c;
    }

    public final synchronized Map<String, WeakReference<View>> zzn() {
        return this.f20149d;
    }

    public final synchronized JSONObject zzo() {
        return null;
    }

    public final synchronized JSONObject zzp() {
        dm1 dm1 = this.f20151f;
        if (dm1 == null) {
            return null;
        }
        return dm1.mo31297F(zzf(), zzl(), zzm());
    }
}
