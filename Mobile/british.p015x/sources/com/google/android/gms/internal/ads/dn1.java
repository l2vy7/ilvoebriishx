package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dn1 extends t30 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, do1 {

    /* renamed from: o */
    public static final p63<String> f30863o = p63.m20817F("2011", "1009", "3010");

    /* renamed from: b */
    private final String f30864b;
    @GuardedBy("this")

    /* renamed from: c */
    private Map<String, WeakReference<View>> f30865c = new HashMap();

    /* renamed from: d */
    private FrameLayout f30866d;

    /* renamed from: e */
    private FrameLayout f30867e;

    /* renamed from: f */
    private final nb3 f30868f;

    /* renamed from: g */
    private View f30869g;

    /* renamed from: h */
    private final int f30870h;
    @GuardedBy("this")

    /* renamed from: i */
    private dm1 f30871i;

    /* renamed from: j */
    private C7801in f30872j;

    /* renamed from: k */
    private C10487a f30873k = null;

    /* renamed from: l */
    private n30 f30874l;

    /* renamed from: m */
    private boolean f30875m;

    /* renamed from: n */
    private boolean f30876n = false;

    public dn1(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f30866d = frameLayout;
        this.f30867e = frameLayout2;
        this.f30870h = 214106000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f30864b = str;
        zzt.zzx();
        cp0.m31076a(frameLayout, this);
        zzt.zzx();
        cp0.m31077b(frameLayout, this);
        this.f30868f = po0.f37726e;
        this.f30872j = new C7801in(this.f30866d.getContext(), this.f30866d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: o6 */
    private final synchronized void m31516o6(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f30867e.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f30867e.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    co0.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.f30867e.addView(frameLayout);
    }

    private final synchronized void zzt() {
        this.f30868f.execute(new cn1(this));
    }

    /* renamed from: A */
    public final synchronized void mo31331A(C10487a aVar, int i) {
    }

    /* renamed from: C2 */
    public final synchronized void mo31332C2(String str, C10487a aVar) {
        mo18151b2(str, (View) C10489b.m48194f3(aVar), true);
    }

    /* renamed from: D */
    public final void mo31333D(C10487a aVar) {
        onTouch(this.f30866d, (MotionEvent) C10489b.m48194f3(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* renamed from: I2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31334I2(p199d5.C10487a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f30876n     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = p199d5.C10489b.m48194f3(r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.dm1     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.co0.zzj(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.dm1 r0 = r1.f30871i     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001d
            r0.mo31323s(r1)     // Catch:{ all -> 0x006f }
        L_0x001d:
            r1.zzt()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.dm1 r2 = (com.google.android.gms.internal.ads.dm1) r2     // Catch:{ all -> 0x006f }
            r1.f30871i = r2     // Catch:{ all -> 0x006f }
            r2.mo31322r(r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.dm1 r2 = r1.f30871i     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f30866d     // Catch:{ all -> 0x006f }
            r2.mo31314j(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.dm1 r2 = r1.f30871i     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f30867e     // Catch:{ all -> 0x006f }
            r2.mo31298H(r0)     // Catch:{ all -> 0x006f }
            boolean r2 = r1.f30875m     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.dm1 r2 = r1.f30871i     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.fm1 r2 = r2.mo31294A()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.n30 r0 = r1.f30874l     // Catch:{ all -> 0x006f }
            r2.mo31888b(r0)     // Catch:{ all -> 0x006f }
        L_0x0044:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.p00.f37252y2     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r0.mo18570b(r2)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x006f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.dm1 r2 = r1.f30871i     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo31295C()     // Catch:{ all -> 0x006f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006d
            com.google.android.gms.internal.ads.dm1 r2 = r1.f30871i     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo31295C()     // Catch:{ all -> 0x006f }
            r1.m31516o6(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x006d:
            monitor-exit(r1)
            return
        L_0x006f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dn1.mo31334I2(d5.a):void");
    }

    /* renamed from: S1 */
    public final synchronized void mo31335S1(C10487a aVar) {
        if (!this.f30876n) {
            this.f30873k = aVar;
        }
    }

    /* renamed from: U2 */
    public final synchronized void mo31336U2(n30 n30) {
        if (!this.f30876n) {
            this.f30875m = true;
            this.f30874l = n30;
            dm1 dm1 = this.f30871i;
            if (dm1 != null) {
                dm1.mo31294A().mo31888b(n30);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C10487a mo31337a(String str) {
        return C10489b.m48195m6(mo18156x(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18151b2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f30876n     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f30865c     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f30865c     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f30870h     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.ads.internal.util.zzcb.zzi(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dn1.mo18151b2(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: k0 */
    public final synchronized void mo31338k0(C10487a aVar) {
        this.f30871i.mo31317m((View) C10489b.m48194f3(aVar));
    }

    public final synchronized void onClick(View view) {
        dm1 dm1 = this.f30871i;
        if (dm1 != null) {
            dm1.mo31299I();
            this.f30871i.mo31307Q(view, this.f30866d, zzl(), zzm(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        dm1 dm1 = this.f30871i;
        if (dm1 != null) {
            dm1.mo31305O(this.f30866d, zzl(), zzm(), dm1.m31477w(this.f30866d));
        }
    }

    public final synchronized void onScrollChanged() {
        dm1 dm1 = this.f30871i;
        if (dm1 != null) {
            dm1.mo31305O(this.f30866d, zzl(), zzm(), dm1.m31477w(this.f30866d));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        dm1 dm1 = this.f30871i;
        if (dm1 != null) {
            dm1.mo31315k(view, motionEvent, this.f30866d);
        }
        return false;
    }

    /* renamed from: x */
    public final synchronized View mo18156x(String str) {
        if (this.f30876n) {
            return null;
        }
        WeakReference weakReference = this.f30865c.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void zzc() {
        if (!this.f30876n) {
            dm1 dm1 = this.f30871i;
            if (dm1 != null) {
                dm1.mo31323s(this);
                this.f30871i = null;
            }
            this.f30865c.clear();
            this.f30866d.removeAllViews();
            this.f30867e.removeAllViews();
            this.f30865c = null;
            this.f30866d = null;
            this.f30867e = null;
            this.f30869g = null;
            this.f30872j = null;
            this.f30876n = true;
        }
    }

    public final /* synthetic */ View zzf() {
        return this.f30866d;
    }

    public final FrameLayout zzh() {
        return this.f30867e;
    }

    public final C7801in zzi() {
        return this.f30872j;
    }

    public final C10487a zzj() {
        return this.f30873k;
    }

    public final synchronized String zzk() {
        return this.f30864b;
    }

    public final synchronized Map<String, WeakReference<View>> zzl() {
        return this.f30865c;
    }

    public final synchronized Map<String, WeakReference<View>> zzm() {
        return this.f30865c;
    }

    public final synchronized Map<String, WeakReference<View>> zzn() {
        return null;
    }

    public final synchronized JSONObject zzo() {
        dm1 dm1 = this.f30871i;
        if (dm1 == null) {
            return null;
        }
        return dm1.mo31296E(this.f30866d, zzl(), zzm());
    }

    public final synchronized JSONObject zzp() {
        dm1 dm1 = this.f30871i;
        if (dm1 == null) {
            return null;
        }
        return dm1.mo31297F(this.f30866d, zzl(), zzm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        if (this.f30869g == null) {
            View view = new View(this.f30866d.getContext());
            this.f30869g = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f30866d != this.f30869g.getParent()) {
            this.f30866d.addView(this.f30869g);
        }
    }
}
