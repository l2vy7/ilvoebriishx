package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.hy1;
import com.google.android.gms.internal.ads.ly1;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.po0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaw {

    /* renamed from: a */
    private final Context f27824a;

    /* renamed from: b */
    private final ly1 f27825b;

    /* renamed from: c */
    private String f27826c;

    /* renamed from: d */
    private String f27827d;

    /* renamed from: e */
    private String f27828e;

    /* renamed from: f */
    private String f27829f;

    /* renamed from: g */
    private int f27830g;

    /* renamed from: h */
    private int f27831h;

    /* renamed from: i */
    private PointF f27832i;

    /* renamed from: j */
    private PointF f27833j;

    /* renamed from: k */
    private Handler f27834k;

    /* renamed from: l */
    private Runnable f27835l;

    public zzaw(Context context) {
        this.f27830g = 0;
        this.f27835l = new zzai(this);
        this.f27824a = context;
        this.f27831h = ViewConfiguration.get(context).getScaledTouchSlop();
        zzt.zzt().zzb();
        this.f27834k = zzt.zzt().zza();
        this.f27825b = zzt.zzs().zza();
    }

    /* renamed from: m */
    private final void m28800m(Context context) {
        ArrayList arrayList = new ArrayList();
        int o = m28802o(arrayList, "None", true);
        int o2 = m28802o(arrayList, "Shake", true);
        int o3 = m28802o(arrayList, "Flick", true);
        hy1 hy1 = hy1.NONE;
        int ordinal = this.f27825b.mo33421a().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? o : o3 : o2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, zzt.zzq().zzk());
        AtomicInteger atomicInteger = new AtomicInteger(i);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new zzar(atomicInteger));
        builder.setNegativeButton("Dismiss", new zzan(this));
        builder.setPositiveButton("Save", new zzaq(this, atomicInteger, i, o2, o3));
        builder.setOnCancelListener(new zzag(this));
        builder.create().show();
    }

    /* renamed from: n */
    private final boolean m28801n(float f, float f2, float f3, float f4) {
        return Math.abs(this.f27832i.x - f) < ((float) this.f27831h) && Math.abs(this.f27832i.y - f2) < ((float) this.f27831h) && Math.abs(this.f27833j.x - f3) < ((float) this.f27831h) && Math.abs(this.f27833j.y - f4) < ((float) this.f27831h);
    }

    /* renamed from: o */
    private static final int m28802o(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28499a() {
        m28800m(this.f27824a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28500b() {
        m28800m(this.f27824a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo28501c(nb3 nb3) {
        if (!zzt.zzs().zzj(this.f27824a, this.f27827d, this.f27828e)) {
            zzt.zzs().zzd(this.f27824a, this.f27827d, this.f27828e);
        } else {
            nb3.execute(new zzau(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28502d(nb3 nb3) {
        if (!zzt.zzs().zzj(this.f27824a, this.f27827d, this.f27828e)) {
            zzt.zzs().zzd(this.f27824a, this.f27827d, this.f27828e);
        } else {
            nb3.execute(new zzah(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo28503e() {
        zzt.zzs().zzc(this.f27824a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo28504f() {
        zzt.zzs().zzc(this.f27824a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo28505g() {
        this.f27830g = 4;
        zzr();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo28506h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f27825b.mo33430j(hy1.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.f27825b.mo33430j(hy1.FLICK);
            } else {
                this.f27825b.mo33430j(hy1.NONE);
            }
        }
        zzr();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo28507i(String str, DialogInterface dialogInterface, int i) {
        zzt.zzp();
        zzt.zzQ(this.f27824a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo28508j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.f27824a instanceof Activity)) {
                co0.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f27826c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                zzt.zzp();
                Map<String, String> zzS = zzt.zzS(build);
                for (String next : zzS.keySet()) {
                    sb.append(next);
                    sb.append(" = ");
                    sb.append(zzS.get(next));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f27824a);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new zzap(this, str2));
            builder.setNegativeButton("Close", zzas.zza);
            builder.create().show();
        } else if (i6 == i2) {
            co0.zze("Debug mode [Creative Preview] selected.");
            po0.f37722a.execute(new zzak(this));
        } else if (i6 == i3) {
            co0.zze("Debug mode [Troubleshooting] selected.");
            po0.f37722a.execute(new zzaj(this));
        } else if (i6 == i4) {
            nb3 nb3 = po0.f37726e;
            nb3 nb32 = po0.f37722a;
            if (this.f27825b.mo33433m()) {
                nb3.execute(new zzav(this));
            } else {
                nb32.execute(new zzam(this, nb3));
            }
        } else if (i6 == i5) {
            nb3 nb33 = po0.f37726e;
            nb3 nb34 = po0.f37722a;
            if (this.f27825b.mo33433m()) {
                nb33.execute(new zzat(this));
            } else {
                nb34.execute(new zzal(this, nb33));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo28509k() {
        zzba zzs = zzt.zzs();
        Context context = this.f27824a;
        String str = this.f27827d;
        String str2 = this.f27828e;
        String str3 = this.f27829f;
        boolean zzm = zzs.zzm();
        zzs.zzh(zzs.zzj(context, str, str2));
        if (zzs.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzs.zze(context, str2, str3, str);
            }
            co0.zze("Device is linked for debug signals.");
            zzs.mo28521a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzs.zzd(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo28510l() {
        zzba zzs = zzt.zzs();
        Context context = this.f27824a;
        String str = this.f27827d;
        String str2 = this.f27828e;
        if (!zzs.mo28522b(context, str, str2)) {
            zzs.mo28521a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzs.f27850f)) {
            co0.zze("Creative is not pushed for this device.");
            zzs.mo28521a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(zzs.f27850f)) {
            co0.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if (SessionDescription.SUPPORTED_SDP_VERSION.equals(zzs.f27850f)) {
            co0.zze("Device is linked for in app preview.");
            zzs.mo28521a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f27826c);
        sb.append(",DebugSignal: ");
        sb.append(this.f27829f);
        sb.append(",AFMA Version: ");
        sb.append(this.f27828e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f27827d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f27830g = 0;
            this.f27832i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f27830g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f27830g = 5;
                    this.f27833j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f27834k.postDelayed(this.f27835l, ((Long) C8311wv.m39277c().mo18570b(p00.f37124j3)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !m28801n(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (m28801n(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f27830g = -1;
                this.f27834k.removeCallbacks(this.f27835l);
            }
        }
    }

    public final void zzn(String str) {
        this.f27827d = str;
    }

    public final void zzo(String str) {
        this.f27828e = str;
    }

    public final void zzp(String str) {
        this.f27826c = str;
    }

    public final void zzq(String str) {
        this.f27829f = str;
    }

    public final void zzr() {
        try {
            if (!(this.f27824a instanceof Activity)) {
                co0.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != zzt.zzs().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int o = m28802o(arrayList, "Ad information", true);
            int o2 = m28802o(arrayList, str, true);
            int o3 = m28802o(arrayList, str2, true);
            boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue();
            int o4 = m28802o(arrayList, "Open ad inspector", booleanValue);
            int o5 = m28802o(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f27824a, zzt.zzq().zzk());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzao(this, o, o2, o3, o4, o5));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzaw(Context context, String str) {
        this(context);
        this.f27826c = str;
    }
}
