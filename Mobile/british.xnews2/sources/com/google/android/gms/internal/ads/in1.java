package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class in1 {

    /* renamed from: a */
    private final zzg f33353a;

    /* renamed from: b */
    private final bs2 f33354b;

    /* renamed from: c */
    private final nm1 f33355c;

    /* renamed from: d */
    private final im1 f33356d;

    /* renamed from: e */
    private final tn1 f33357e;

    /* renamed from: f */
    private final bo1 f33358f;

    /* renamed from: g */
    private final Executor f33359g;

    /* renamed from: h */
    private final Executor f33360h;

    /* renamed from: i */
    private final zzbnw f33361i;

    /* renamed from: j */
    private final fm1 f33362j;

    public in1(zzg zzg, bs2 bs2, nm1 nm1, im1 im1, tn1 tn1, bo1 bo1, Executor executor, Executor executor2, fm1 fm1) {
        this.f33353a = zzg;
        this.f33354b = bs2;
        this.f33361i = bs2.f30092i;
        this.f33355c = nm1;
        this.f33356d = im1;
        this.f33357e = tn1;
        this.f33358f = bo1;
        this.f33359g = executor;
        this.f33360h = executor2;
        this.f33362j = fm1;
    }

    /* renamed from: g */
    private static void m33333g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: h */
    private final boolean m33334h(ViewGroup viewGroup, boolean z) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            view = this.f33356d.mo32654N();
        } else {
            view = this.f33356d.mo32655O();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37228v2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo32728a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f33356d.mo32654N() == null) {
            return;
        }
        if (this.f33356d.mo32651K() == 2 || this.f33356d.mo32651K() == 1) {
            this.f33353a.zzE(this.f33354b.f30089f, String.valueOf(this.f33356d.mo32651K()), z);
        } else if (this.f33356d.mo32651K() == 6) {
            this.f33353a.zzE(this.f33354b.f30089f, "2", z);
            this.f33353a.zzE(this.f33354b.f30089f, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo32729b(do1 do1) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        n30 a;
        Drawable drawable;
        Context context = null;
        if (this.f33355c.mo33566e() || this.f33355c.mo33565d()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View x = do1.mo18156x(strArr[i]);
                if (x != null && (x instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) x;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context2 = do1.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f33356d.mo32653M() != null) {
            view = this.f33356d.mo32653M();
            zzbnw zzbnw = this.f33361i;
            if (zzbnw != null && viewGroup == null) {
                m33333g(layoutParams, zzbnw.f42997f);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.f33356d.mo32660T() instanceof z20)) {
            view = null;
        } else {
            z20 z20 = (z20) this.f33356d.mo32660T();
            if (viewGroup == null) {
                m33333g(layoutParams, z20.zzc());
            }
            a30 a30 = new a30(context2, z20, layoutParams);
            a30.setContentDescription((CharSequence) C8311wv.m39277c().mo18570b(p00.f37212t2));
            view = a30;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza = new zza(do1.zzf().getContext());
                zza.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza.addView(view);
                FrameLayout zzh = do1.zzh();
                if (zzh != null) {
                    zzh.addView(zza);
                }
            }
            do1.mo18151b2(do1.zzk(), view, true);
        }
        p63<String> p63 = dn1.f30863o;
        int size = p63.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View x2 = do1.mo18156x(p63.get(i2));
            i2++;
            if (x2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) x2;
                break;
            }
        }
        this.f33360h.execute(new en1(this, viewGroup2));
        if (viewGroup2 != null) {
            if (!m33334h(viewGroup2, true)) {
                if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37038Z6)).booleanValue() || !m33334h(viewGroup2, false)) {
                    viewGroup2.removeAllViews();
                    View zzf = do1.zzf();
                    if (zzf != null) {
                        context = zzf.getContext();
                    }
                    if (context != null && (a = this.f33362j.mo31887a()) != null) {
                        try {
                            C10487a zzi = a.zzi();
                            if (zzi != null && (drawable = (Drawable) C10489b.m48194f3(zzi)) != null) {
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(drawable);
                                C10487a zzj = do1.zzj();
                                if (zzj != null) {
                                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36860D4)).booleanValue()) {
                                        imageView.setScaleType((ImageView.ScaleType) C10489b.m48194f3(zzj));
                                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        viewGroup2.addView(imageView);
                                    }
                                }
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup2.addView(imageView);
                            }
                        } catch (RemoteException unused) {
                            co0.zzj("Could not get main image drawable");
                        }
                    }
                } else if (this.f33356d.mo32664X() != null) {
                    this.f33356d.mo32664X().mo18714C0(new hn1(do1, viewGroup2));
                }
            } else if (this.f33356d.mo32666Z() != null) {
                this.f33356d.mo32666Z().mo18714C0(new hn1(do1, viewGroup2));
            }
        }
    }

    /* renamed from: c */
    public final void mo32730c(do1 do1) {
        if (do1 != null && this.f33357e != null && do1.zzh() != null && this.f33355c.mo33567f()) {
            try {
                do1.zzh().addView(this.f33357e.mo34988a());
            } catch (ju0 e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo32731d(do1 do1) {
        if (do1 != null) {
            Context context = do1.zzf().getContext();
            if (zzcb.zzh(context, this.f33355c.f36046a)) {
                if (!(context instanceof Activity)) {
                    co0.zze("Activity context is needed for policy validator.");
                } else if (this.f33358f != null && do1.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f33358f.mo30744a(do1.zzh(), windowManager), zzcb.zzb());
                    } catch (ju0 e) {
                        zze.zzb("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo32732e(do1 do1) {
        this.f33359g.execute(new fn1(this, do1));
    }

    /* renamed from: f */
    public final boolean mo32733f(ViewGroup viewGroup) {
        return m33334h(viewGroup, true);
    }
}
