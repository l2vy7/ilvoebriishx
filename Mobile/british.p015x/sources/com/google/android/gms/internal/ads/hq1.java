package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hq1 extends k90 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, b30 {

    /* renamed from: b */
    private View f32802b;

    /* renamed from: c */
    private C7774hy f32803c;

    /* renamed from: d */
    private dm1 f32804d;

    /* renamed from: e */
    private boolean f32805e = false;

    /* renamed from: f */
    private boolean f32806f = false;

    public hq1(dm1 dm1, im1 im1) {
        this.f32802b = im1.mo32654N();
        this.f32803c = im1.mo32658R();
        this.f32804d = dm1;
        if (im1.mo32666Z() != null) {
            im1.mo32666Z().mo18736W(this);
        }
    }

    /* renamed from: n6 */
    private static final void m32918n6(o90 o90, int i) {
        try {
            o90.mo32220l(i);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    private final void zzg() {
        View view;
        dm1 dm1 = this.f32804d;
        if (dm1 != null && (view = this.f32802b) != null) {
            dm1.mo31305O(view, Collections.emptyMap(), Collections.emptyMap(), dm1.m31477w(this.f32802b));
        }
    }

    private final void zzh() {
        View view = this.f32802b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f32802b);
            }
        }
    }

    /* renamed from: A1 */
    public final void mo32429A1(C10487a aVar, o90 o90) throws RemoteException {
        String str;
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        if (this.f32805e) {
            co0.zzg("Instream ad can not be shown after destroy().");
            m32918n6(o90, 2);
            return;
        }
        View view = this.f32802b;
        if (view == null || this.f32803c == null) {
            String str2 = view == null ? "can not get video view." : "can not get video controller.";
            if (str2.length() != 0) {
                str = "Instream internal error: ".concat(str2);
            } else {
                str = new String("Instream internal error: ");
            }
            co0.zzg(str);
            m32918n6(o90, 0);
        } else if (this.f32806f) {
            co0.zzg("Instream ad should not be used again.");
            m32918n6(o90, 1);
        } else {
            this.f32806f = true;
            zzh();
            ((ViewGroup) C10489b.m48194f3(aVar)).addView(this.f32802b, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            cp0.m31076a(this.f32802b, this);
            zzt.zzx();
            cp0.m31077b(this.f32802b, this);
            zzg();
            try {
                o90.zzf();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final C7774hy zzb() throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        if (!this.f32805e) {
            return this.f32803c;
        }
        co0.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final n30 zzc() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        if (this.f32805e) {
            co0.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        dm1 dm1 = this.f32804d;
        if (dm1 == null || dm1.mo31294A() == null) {
            return null;
        }
        return this.f32804d.mo31294A().mo31887a();
    }

    public final void zzd() throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        zzh();
        dm1 dm1 = this.f32804d;
        if (dm1 != null) {
            dm1.mo31310a();
        }
        this.f32804d = null;
        this.f32802b = null;
        this.f32803c = null;
        this.f32805e = true;
    }

    public final void zze(C10487a aVar) throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        mo32429A1(aVar, new gq1(this));
    }
}
