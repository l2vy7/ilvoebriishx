package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.common.internal.C4604n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zp0 extends FrameLayout implements rp0 {

    /* renamed from: b */
    private final mq0 f21059b;

    /* renamed from: c */
    private final FrameLayout f21060c;

    /* renamed from: d */
    private final View f21061d;

    /* renamed from: e */
    private final e10 f21062e;

    /* renamed from: f */
    private final oq0 f21063f;

    /* renamed from: g */
    private final long f21064g;

    /* renamed from: h */
    private final sp0 f21065h;

    /* renamed from: i */
    private boolean f21066i;

    /* renamed from: j */
    private boolean f21067j;

    /* renamed from: k */
    private boolean f21068k;

    /* renamed from: l */
    private boolean f21069l;

    /* renamed from: m */
    private long f21070m;

    /* renamed from: n */
    private long f21071n;

    /* renamed from: o */
    private String f21072o;

    /* renamed from: p */
    private String[] f21073p;

    /* renamed from: q */
    private Bitmap f21074q;

    /* renamed from: r */
    private final ImageView f21075r;

    /* renamed from: s */
    private boolean f21076s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp0(Context context, mq0 mq0, int i, boolean z, e10 e10, lq0 lq0) {
        super(context);
        sp0 sp0;
        Context context2 = context;
        e10 e102 = e10;
        this.f21059b = mq0;
        this.f21062e = e102;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f21060c = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C4604n.m20098k(mq0.zzm());
        tp0 tp0 = mq0.zzm().zza;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            nq0 nq0 = new nq0(context, mq0.zzp(), mq0.mo18766n(), e10, mq0.zzn());
            if (i == 2) {
                sp0 = new dr0(context, nq0, mq0, z, tp0.m37933a(mq0), lq0);
            } else {
                Context context3 = context;
                sp0 = new qp0(context3, mq0, z, tp0.m37933a(mq0), lq0, new nq0(context3, mq0.zzp(), mq0.mo18766n(), e10, mq0.zzn()));
            }
        } else {
            sp0 = null;
        }
        this.f21065h = sp0;
        View view = new View(context2);
        this.f21061d = view;
        view.setBackgroundColor(0);
        if (sp0 != null) {
            frameLayout.addView(sp0, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36831A)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37241x)).booleanValue()) {
                mo19072n();
            }
        }
        this.f21075r = new ImageView(context2);
        this.f21064g = ((Long) C8311wv.m39277c().mo18570b(p00.f36847C)).longValue();
        boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37257z)).booleanValue();
        this.f21069l = booleanValue;
        if (e102 != null) {
            e102.mo18243d("spinner_used", true != booleanValue ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        this.f21063f = new oq0(this);
        if (sp0 != null) {
            sp0.mo31390t(this);
        }
        if (sp0 == null) {
            mo18701g("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: j */
    private final void m21294j() {
        if (this.f21059b.zzk() != null && this.f21067j && !this.f21068k) {
            this.f21059b.zzk().getWindow().clearFlags(128);
            this.f21067j = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m21295k(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f21059b.mo18321Z("onVideoEvent", hashMap);
    }

    /* renamed from: l */
    private final boolean m21296l() {
        return this.f21075r.getParent() != null;
    }

    /* renamed from: A */
    public final void mo19063A(int i) {
        this.f21065h.mo31355A(i);
    }

    /* renamed from: Y */
    public final void mo18699Y(String str, String str2) {
        m21295k("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* renamed from: a */
    public final void mo19064a(int i) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36831A)).booleanValue()) {
            this.f21060c.setBackgroundColor(i);
            this.f21061d.setBackgroundColor(i);
        }
    }

    /* renamed from: b */
    public final void mo19065b(int i) {
        this.f21065h.mo31370f(i);
    }

    /* renamed from: c */
    public final void mo19066c(String str, String[] strArr) {
        this.f21072o = str;
        this.f21073p = strArr;
    }

    /* renamed from: d */
    public final void mo19067d(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            zze.zza(sb.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f21060c.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: e */
    public final void mo18700e(int i, int i2) {
        if (this.f21069l) {
            h00 h00 = p00.f36839B;
            int max = Math.max(i / ((Integer) C8311wv.m39277c().mo18570b(h00)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) C8311wv.m39277c().mo18570b(h00)).intValue(), 1);
            Bitmap bitmap = this.f21074q;
            if (bitmap == null || bitmap.getWidth() != max || this.f21074q.getHeight() != max2) {
                this.f21074q = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f21076s = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo19068f(float f) {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.f39025c.mo34400e(f);
            sp0.zzn();
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f21063f.mo33979a();
            sp0 sp0 = this.f21065h;
            if (sp0 != null) {
                po0.f37726e.execute(new up0(sp0));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo18701g(String str, String str2) {
        m21295k("error", "what", str, "extra", str2);
    }

    /* renamed from: h */
    public final void mo19070h(float f, float f2) {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.mo31393w(f, f2);
        }
    }

    /* renamed from: i */
    public final void mo19071i() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.f39025c.mo34399d(false);
            sp0.zzn();
        }
    }

    @TargetApi(14)
    /* renamed from: n */
    public final void mo19072n() {
        String str;
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            TextView textView = new TextView(sp0.getContext());
            String valueOf = String.valueOf(this.f21065h.mo31386p());
            if (valueOf.length() != 0) {
                str = "AdMob - ".concat(valueOf);
            } else {
                str = new String("AdMob - ");
            }
            textView.setText(str);
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f21060c.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f21060c.bringChildToFront(textView);
        }
    }

    /* renamed from: o */
    public final void mo19073o() {
        this.f21063f.mo33979a();
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.mo31392v();
        }
        m21294j();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f21063f.mo33980b();
        } else {
            this.f21063f.mo33979a();
            this.f21071n = this.f21070m;
        }
        zzt.zza.post(new vp0(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f21063f.mo33980b();
            z = true;
        } else {
            this.f21063f.mo33979a();
            this.f21071n = this.f21070m;
            z = false;
        }
        zzt.zza.post(new yp0(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo19075p(boolean z) {
        m21295k("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: q */
    public final void mo19076q() {
        if (this.f21065h != null) {
            if (!TextUtils.isEmpty(this.f21072o)) {
                this.f21065h.mo31371g(this.f21072o, this.f21073p);
            } else {
                m21295k("no_src", new String[0]);
            }
        }
    }

    /* renamed from: r */
    public final void mo19077r() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.f39025c.mo34399d(true);
            sp0.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo19078s() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            long h = (long) sp0.mo31372h();
            if (this.f21070m != h && h > 0) {
                float f = ((float) h) / 1000.0f;
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue()) {
                    m21295k("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f21065h.mo31379o()), "qoeCachedBytes", String.valueOf(this.f21065h.mo31377m()), "qoeLoadedBytes", String.valueOf(this.f21065h.mo31378n()), "droppedFrames", String.valueOf(this.f21065h.mo31373i()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
                } else {
                    m21295k("timeupdate", "time", String.valueOf(f));
                }
                this.f21070m = h;
            }
        }
    }

    /* renamed from: t */
    public final void mo19079t() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.mo31387q();
        }
    }

    /* renamed from: u */
    public final void mo19080u() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.mo31388r();
        }
    }

    /* renamed from: v */
    public final void mo19081v(int i) {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.mo31389s(i);
        }
    }

    @TargetApi(14)
    /* renamed from: w */
    public final void mo19082w(MotionEvent motionEvent) {
        sp0 sp0 = this.f21065h;
        if (sp0 != null) {
            sp0.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: x */
    public final void mo19083x(int i) {
        this.f21065h.mo31394x(i);
    }

    /* renamed from: y */
    public final void mo19084y(int i) {
        this.f21065h.mo31395y(i);
    }

    /* renamed from: z */
    public final void mo19085z(int i) {
        this.f21065h.mo31396z(i);
    }

    public final void zza() {
        m21295k("ended", new String[0]);
        m21294j();
    }

    public final void zzd() {
        m21295k("pause", new String[0]);
        m21294j();
        this.f21066i = false;
    }

    public final void zze() {
        if (this.f21059b.zzk() != null && !this.f21067j) {
            boolean z = (this.f21059b.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.f21068k = z;
            if (!z) {
                this.f21059b.zzk().getWindow().addFlags(128);
                this.f21067j = true;
            }
        }
        this.f21066i = true;
    }

    public final void zzf() {
        sp0 sp0 = this.f21065h;
        if (sp0 != null && this.f21071n == 0) {
            m21295k("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(((float) sp0.mo31374j()) / 1000.0f), "videoWidth", String.valueOf(this.f21065h.mo31376l()), "videoHeight", String.valueOf(this.f21065h.mo31375k()));
        }
    }

    public final void zzg() {
        this.f21061d.setVisibility(4);
    }

    public final void zzh() {
        this.f21063f.mo33980b();
        zzt.zza.post(new wp0(this));
    }

    public final void zzi() {
        if (this.f21076s && this.f21074q != null && !m21296l()) {
            this.f21075r.setImageBitmap(this.f21074q);
            this.f21075r.invalidate();
            this.f21060c.addView(this.f21075r, new FrameLayout.LayoutParams(-1, -1));
            this.f21060c.bringChildToFront(this.f21075r);
        }
        this.f21063f.mo33979a();
        this.f21071n = this.f21070m;
        zzt.zza.post(new xp0(this));
    }

    public final void zzk() {
        if (this.f21066i && m21296l()) {
            this.f21060c.removeView(this.f21075r);
        }
        if (this.f21074q != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            if (this.f21065h.getBitmap(this.f21074q) != null) {
                this.f21076s = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zze.zza(sb.toString());
            }
            if (elapsedRealtime2 > this.f21064g) {
                co0.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f21069l = false;
                this.f21074q = null;
                e10 e10 = this.f21062e;
                if (e10 != null) {
                    e10.mo18243d("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }
}
