package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.C0600b;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerSize;
import com.appnext.banners.BannerView;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.vision.barcode.Barcode;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import p001a0.C0008a;
import p187z5.C11141a;
import p187z5.C11145b;
import p188a6.C6498a;

/* renamed from: british.x.t_qr */
public class t_qr extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    Bundle f9650A;

    /* renamed from: B */
    ListView f9651B;

    /* renamed from: C */
    SharedPreferences f9652C;

    /* renamed from: D */
    Camera f9653D;

    /* renamed from: E */
    C11141a f9654E;

    /* renamed from: F */
    SurfaceView f9655F;

    /* renamed from: G */
    C6498a f9656G;

    /* renamed from: H */
    List<Camera.Size> f9657H;

    /* renamed from: I */
    C1855l f9658I;

    /* renamed from: J */
    BannerView f9659J;

    /* renamed from: K */
    AdView f9660K;

    /* renamed from: L */
    com.facebook.ads.AdView f9661L;

    /* renamed from: m */
    long f9662m;

    /* renamed from: n */
    int f9663n;

    /* renamed from: o */
    int f9664o = -1;

    /* renamed from: p */
    int f9665p;

    /* renamed from: q */
    C1692config f9666q;

    /* renamed from: r */
    boolean f9667r = false;

    /* renamed from: s */
    boolean f9668s;

    /* renamed from: t */
    boolean f9669t;

    /* renamed from: u */
    boolean f9670u;

    /* renamed from: v */
    boolean f9671v;

    /* renamed from: w */
    String f9672w;

    /* renamed from: x */
    String f9673x;

    /* renamed from: y */
    C1603c f9674y;

    /* renamed from: z */
    boolean f9675z = false;

    /* renamed from: british.x.t_qr$a */
    class C2394a extends AdColonyInterstitialListener {
        C2394a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_qr t_qr = t_qr.this;
            if (t_qr.f9675z) {
                t_qr.abrir_secc(t_qr.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_qr.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_qr.this.f6661g.cancel();
            t_qr t_qr = t_qr.this;
            t_qr.abrir_secc(t_qr.f6660f);
        }
    }

    /* renamed from: british.x.t_qr$b */
    class C2395b implements SearchManager.OnCancelListener {
        C2395b() {
        }

        public void onCancel() {
            t_qr t_qr = t_qr.this;
            t_qr.f6657c = false;
            t_qr.setResult(0);
        }
    }

    /* renamed from: british.x.t_qr$c */
    class C2396c implements SearchManager.OnDismissListener {
        C2396c() {
        }

        public void onDismiss() {
            t_qr.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_qr$d */
    class C2397d implements SurfaceHolder.Callback {
        C2397d() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C11141a aVar = t_qr.this.f9654E;
            if (aVar != null) {
                try {
                    aVar.mo43438c();
                    t_qr.this.f9654E.mo43436a();
                } catch (Exception unused) {
                }
            }
            t_qr t_qr = t_qr.this;
            Camera.Size a = t_qr.m8859e(t_qr.f9657H, t_qr.f9655F.getWidth(), t_qr.this.f9655F.getHeight());
            t_qr.this.mo8839g();
            t_qr t_qr2 = t_qr.this;
            t_qr2.f9654E = new C11141a.C11142a(t_qr2, t_qr2.f9656G).mo43441c(a.width, a.height).mo43440b(true).mo43439a();
            try {
                t_qr t_qr3 = t_qr.this;
                t_qr3.f9654E.mo43437b(t_qr3.f9655F.getHolder());
            } catch (IOException | SecurityException unused2) {
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            t_qr.this.f9654E.mo43438c();
        }
    }

    /* renamed from: british.x.t_qr$e */
    class C2398e implements C11145b.C11147b<Barcode> {

        /* renamed from: british.x.t_qr$e$a */
        class C2399a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f9681b;

            /* renamed from: british.x.t_qr$e$a$a */
            class C2400a implements View.OnClickListener {
                C2400a() {
                }

                public void onClick(View view) {
                    C2399a aVar = C2399a.this;
                    t_qr.this.mo8837b(aVar.f9681b);
                }
            }

            /* renamed from: british.x.t_qr$e$a$b */
            class C2401b implements View.OnClickListener {
                C2401b() {
                }

                public void onClick(View view) {
                    C2399a aVar = C2399a.this;
                    t_qr.this.mo8837b(aVar.f9681b);
                }
            }

            /* renamed from: british.x.t_qr$e$a$c */
            class C2402c implements View.OnClickListener {
                C2402c() {
                }

                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", C2399a.this.f9681b);
                    t_qr.this.startActivity(Intent.createChooser(intent, t_qr.this.getString(R.string.compartir)));
                }
            }

            C2399a(String str) {
                this.f9681b = str;
            }

            public void run() {
                ((TextView) t_qr.this.findViewById(R.id.tv_url)).setText(this.f9681b);
                t_qr.this.findViewById(R.id.tv_url).setOnClickListener(new C2400a());
                t_qr.this.findViewById(R.id.btn_abrir_url).setOnClickListener(new C2401b());
                t_qr t_qr = t_qr.this;
                if (t_qr.f9658I.f7945p1) {
                    t_qr.findViewById(R.id.btn_share_url).setVisibility(0);
                    t_qr.this.findViewById(R.id.v_qr_aux).setVisibility(0);
                    t_qr.this.findViewById(R.id.btn_share_url).setOnClickListener(new C2402c());
                } else {
                    t_qr.findViewById(R.id.btn_share_url).setVisibility(8);
                    t_qr.this.findViewById(R.id.v_qr_aux).setVisibility(8);
                }
                t_qr.this.findViewById(R.id.rl_scan).setVisibility(8);
                t_qr.this.findViewById(R.id.ll_aux).setVisibility(8);
                t_qr.this.findViewById(R.id.ll_cont).setVisibility(0);
                t_qr.this.findViewById(R.id.ll_ad).setVisibility(0);
                C11141a aVar = t_qr.this.f9654E;
                if (aVar != null) {
                    try {
                        aVar.mo43438c();
                    } catch (Exception unused) {
                    }
                }
            }
        }

        C2398e() {
        }

        /* renamed from: a */
        public void mo8859a(C11145b.C11146a<Barcode> aVar) {
            if (!t_qr.this.f9670u) {
                SparseArray<Barcode> a = aVar.mo43449a();
                if (a.size() != 0) {
                    t_qr.this.f9670u = true;
                    String str = a.valueAt(0).f47014d;
                    t_qr t_qr = t_qr.this;
                    if (t_qr.f9658I.f7942o1) {
                        t_qr.mo8837b(str);
                    } else {
                        t_qr.runOnUiThread(new C2399a(str));
                    }
                }
            }
        }

        public void release() {
        }
    }

    /* renamed from: british.x.t_qr$f */
    class C2403f extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9686a;

        /* renamed from: british.x.t_qr$f$a */
        class C2404a extends FullScreenContentCallback {
            C2404a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_qr t_qr = t_qr.this;
                if (t_qr.f9675z) {
                    t_qr.abrir_secc(t_qr.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_qr t_qr = t_qr.this;
                t_qr.abrir_secc(t_qr.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_qr$f$b */
        class C2405b implements OnUserEarnedRewardListener {
            C2405b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2403f fVar = C2403f.this;
                t_qr.this.f9675z = true;
                C1692config.m8175Y0(fVar.f9686a);
            }
        }

        C2403f(Context context) {
            this.f9686a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_qr.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2404a());
            rewardedAd.show((Activity) this.f9686a, new C2405b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_qr t_qr = t_qr.this;
            if (!t_qr.f9666q.mo7502f(this.f9686a, t_qr.f6663i)) {
                t_qr.this.f6661g.cancel();
                t_qr t_qr2 = t_qr.this;
                t_qr2.abrir_secc(t_qr2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_qr$g */
    class C2406g implements AdDisplayListener {
        C2406g() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_qr t_qr = t_qr.this;
            if (t_qr.f9675z) {
                t_qr.abrir_secc(t_qr.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: c */
    private void m8857c(Context context) {
        this.f6662h = new C2403f(context);
    }

    /* renamed from: d */
    public static Camera m8858d() {
        try {
            return Camera.open();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Camera.Size m8859e(List<Camera.Size> list, int i, int i2) {
        if (i2 > i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d4 = Double.MAX_VALUE;
        for (Camera.Size next : list) {
            int i4 = next.width;
            double d5 = (double) i4;
            int i5 = next.height;
            double d6 = (double) i5;
            if (i5 > i4) {
                d5 = (double) i5;
                d6 = (double) i4;
            }
            double d7 = (d5 / d6) - d3;
            if (Math.abs(d7) < d4) {
                d4 = Math.abs(d7);
                size = next;
            }
        }
        return size;
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f9664o;
            if (i != -1) {
                this.f9666q.mo7499d(this, i);
                return;
            }
            return;
        }
        C1845j j0 = this.f9666q.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f9666q.f7427t4 != 2) {
                        intent2.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused) {
                    }
                } else {
                    startActivityForResult(intent2, 0);
                }
            }
        }
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6661g.cancel();
        this.f6663i.showAd();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8837b(String str) {
        if (this.f9658I.f7962x == 1) {
            this.f9666q.mo7497c(this, str);
            return;
        }
        Intent intent = new Intent(this, t_url.class);
        intent.putExtra("url", str);
        startActivityForResult(intent, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8838f() {
        int q0 = this.f9666q.mo7522q0(this);
        int i = this.f9666q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9651B = listView;
            this.f9666q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9666q.f7231O1;
                if (i3 >= lVarArr.length) {
                    break;
                }
                if (!lVarArr[i3].f7848B) {
                    findViewById(i3).setOnClickListener(this);
                    i4++;
                    if (i4 == q0) {
                        break;
                    }
                }
                i3++;
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        while (true) {
            int[] iArr = this.f9666q.f7249R1;
            if (i2 < iArr.length) {
                if (iArr[i2] > 0) {
                    findViewById(iArr[i2]).setOnClickListener(this);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8839g() {
        C6498a aVar = this.f9656G;
        if (aVar != null) {
            try {
                aVar.mo24324d();
            } catch (Exception unused) {
            }
        }
        C6498a a = new C6498a.C6499a(this).mo24326b(256).mo24325a();
        this.f9656G = a;
        a.mo43448e(new C2398e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8840h() {
        Camera d = m8858d();
        this.f9653D = d;
        this.f9657H = d.getParameters().getSupportedPreviewSizes();
        findViewById(R.id.ll_aux).setVisibility(8);
        findViewById(R.id.rl_scan).setVisibility(0);
        this.f9655F = (SurfaceView) findViewById(R.id.surface_view);
        mo8839g();
        this.f9655F.getHolder().addCallback(new C2397d());
    }

    /* renamed from: i */
    public void mo8841i() {
        ArrayList arrayList = new ArrayList();
        if (!this.f9666q.f7161C3.equals("")) {
            arrayList.add(1);
        }
        if (!this.f9666q.f7167D3.equals("")) {
            arrayList.add(2);
        }
        if (!this.f9666q.f7173E3.equals("") && getResources().getConfiguration().orientation == 1) {
            arrayList.add(3);
        }
        if (!this.f9666q.f7179F3.equals("")) {
            arrayList.add(4);
        }
        if (!this.f9666q.f7185G3.equals("")) {
            arrayList.add(5);
        }
        if (!arrayList.isEmpty()) {
            int intValue = ((Integer) arrayList.get(new Random().nextInt((arrayList.size() - 1) + 0 + 1) + 0)).intValue();
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_ad_qr);
            linearLayout.removeAllViews();
            if (intValue == 1) {
                this.f9660K = new AdView(this);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f9660K.setAdSize(AdSize.LARGE_BANNER);
                } else {
                    this.f9660K.setAdSize(AdSize.MEDIUM_RECTANGLE);
                }
                this.f9660K.setAdUnitId(this.f9666q.f7161C3);
                linearLayout.addView(this.f9660K);
                this.f9660K.loadAd(new AdRequest.Builder().build());
            } else if (intValue == 2) {
                BannerView bannerView = new BannerView(this);
                this.f9659J = bannerView;
                bannerView.setPlacementId(this.f9666q.f7167D3);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f9659J.setBannerSize(BannerSize.LARGE_BANNER);
                } else {
                    this.f9659J.setBannerSize(BannerSize.MEDIUM_RECTANGLE);
                }
                linearLayout.addView(this.f9659J);
                this.f9659J.loadAd(new BannerAdRequest());
            } else if (intValue == 3) {
                com.facebook.ads.AdView adView = new com.facebook.ads.AdView((Context) this, this.f9666q.f7173E3, com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250);
                this.f9661L = adView;
                linearLayout.addView(adView);
                this.f9661L.loadAd();
            } else if (intValue == 4) {
                Mrec mrec = new Mrec((Activity) this);
                mrec.setAdTag("QR SECTION");
                linearLayout.addView(mrec);
            } else if (intValue == 5) {
                IronSourceBannerLayout ironSourceBannerLayout = this.f9666q.f7420s4;
                if (ironSourceBannerLayout != null) {
                    IronSource.destroyBanner(ironSourceBannerLayout);
                }
                this.f9666q.f7420s4 = IronSource.createBanner(this, ISBannerSize.RECTANGLE);
                linearLayout.addView(this.f9666q.f7420s4);
                IronSource.loadBanner(this.f9666q.f7420s4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9675z) {
            abrir_secc(this.f6660f);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6661g.cancel();
        this.f6664j.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        SurfaceView surfaceView;
        if (findViewById(R.id.ll_cont).getVisibility() == 0) {
            findViewById(R.id.ll_cont).setVisibility(8);
            findViewById(R.id.ll_ad).setVisibility(8);
            findViewById(R.id.ll_aux).setVisibility(8);
            findViewById(R.id.rl_scan).setVisibility(0);
            this.f9670u = false;
            C11141a aVar = this.f9654E;
            if (aVar != null && (surfaceView = this.f9655F) != null) {
                try {
                    aVar.mo43437b(surfaceView.getHolder());
                } catch (Exception unused) {
                }
            }
        } else if (!this.f6659e || this.f9667r || !this.f9666q.f7365k5) {
            super.onBackPressed();
        } else {
            this.f9667r = true;
            C1692config.m8199t(this);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = this.f9666q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9666q.f7281W3) == null || str.equals("")) && (((str2 = this.f9666q.f7250R2) == null || str2.equals("")) && (((str3 = this.f9666q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9666q.f7269U3) == null || str4.equals("")) && (((str5 = this.f9666q.f7275V3) == null || str5.equals("")) && (((str6 = this.f9666q.f7358j4) == null || str6.equals("")) && (((str7 = this.f9666q.f7287X3) == null || str7.equals("")) && ((str8 = this.f9666q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9666q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9666q.f7251R3);
        }
        String str11 = this.f9666q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9666q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9666q.f7269U3);
        }
        String str13 = this.f9666q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9666q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.facebook.ads.AdView adView;
        AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8838f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9674y;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9674y;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        if (this.f9671v) {
            mo8841i();
        } else {
            this.f9674y = this.f9666q.mo7474A0(this, false);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        String[] strArr;
        String str;
        C1692config config = (C1692config) getApplicationContext();
        this.f9666q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8857c(this);
        this.f6666l = new C2394a();
        C1692config config2 = this.f9666q;
        C1855l[] lVarArr = config2.f7231O1;
        int i2 = config2.f7318d;
        this.f9672w = lVarArr[i2].f7916g;
        this.f9673x = lVarArr[i2].f7919h;
        this.f9668s = C1692config.m8153I("#" + this.f9672w);
        this.f9669t = C1692config.m8153I("#" + this.f9673x);
        this.f6656b = C1692config.m8189h(this.f9672w, this.f9666q.f7368l1);
        if (Build.VERSION.SDK_INT > 12 && !this.f9668s) {
            setTheme(R.style.holonolight);
        }
        Bundle extras = getIntent().getExtras();
        this.f9650A = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9650A.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        C1692config config3 = this.f9666q;
        int i3 = config3.f7318d;
        this.f9663n = i3;
        C1855l lVar = config3.f7231O1[i3];
        this.f9658I = lVar;
        this.f9665p = lVar.f7964y;
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9652C = sharedPreferences;
        this.f9662m = sharedPreferences.getLong("idusu", 0);
        setContentView(R.layout.t_qr);
        mo8838f();
        this.f9666q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2395b());
        searchManager.setOnDismissListener(new C2396c());
        C1692config config4 = this.f9666q;
        Bundle bundle2 = this.f9650A;
        boolean z = bundle2 != null && bundle2.containsKey("ad_entrar");
        Bundle bundle3 = this.f9650A;
        config4.mo7503f1(this, z, bundle3 != null && bundle3.containsKey("fb_entrar"));
        C1692config config5 = this.f9666q;
        boolean z2 = (config5.f7161C3 == "" && config5.f7167D3 == "" && config5.f7173E3 == "" && config5.f7179F3 == "" && config5.f7185G3 == "") ? false : true;
        this.f9671v = z2;
        if (z2) {
            mo8841i();
        } else {
            this.f9674y = config5.mo7474A0(this, false);
        }
        C1692config config6 = this.f9666q;
        config6.mo7488Q0(this, config6.f7318d, this.f6656b, bundle);
        int i4 = C1692config.f7101A5;
        int i5 = -1;
        if (!this.f9672w.equals("")) {
            i = !this.f9668s ? -1 : i4;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f9672w), Color.parseColor("#" + this.f9673x)}));
        } else {
            i = i4;
        }
        ((TextView) findViewById(R.id.tv_url)).setTextColor(i);
        if (!this.f6656b.equals("")) {
            ((Button) findViewById(R.id.btn_share_url)).setBackgroundColor(Color.parseColor("#" + this.f6656b));
            ((Button) findViewById(R.id.btn_abrir_url)).setBackgroundColor(Color.parseColor("#" + this.f6656b));
            if (C1692config.m8153I("#" + this.f6656b)) {
                i5 = i4;
            }
            ((Button) findViewById(R.id.btn_share_url)).setTextColor(i5);
            ((Button) findViewById(R.id.btn_abrir_url)).setTextColor(i5);
            if (i5 == i4) {
                ((Button) findViewById(R.id.btn_share_url)).setCompoundDrawablesWithIntrinsicBounds(R.drawable.share_n, 0, 0, 0);
                ((Button) findViewById(R.id.btn_abrir_url)).setCompoundDrawablesWithIntrinsicBounds(R.drawable.view_n, 0, 0, 0);
            }
        } else {
            ((Button) findViewById(R.id.btn_share_url)).setTextColor(i);
            ((Button) findViewById(R.id.btn_abrir_url)).setTextColor(i);
            if (i == i4) {
                ((Button) findViewById(R.id.btn_share_url)).setCompoundDrawablesWithIntrinsicBounds(R.drawable.share_n, 0, 0, 0);
                ((Button) findViewById(R.id.btn_abrir_url)).setCompoundDrawablesWithIntrinsicBounds(R.drawable.view_n, 0, 0, 0);
            }
        }
        C1855l lVar2 = this.f9658I;
        boolean z3 = lVar2.f7948q1;
        if (!z3) {
            findViewById(R.id.iv_visor).setVisibility(8);
        } else if (z3 && (str = lVar2.f7951r1) != null && !str.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.qr_visor);
            try {
                drawable.setColorFilter(Color.parseColor("#" + this.f9658I.f7951r1), PorterDuff.Mode.MULTIPLY);
            } catch (Exception unused) {
            }
            ((ImageView) findViewById(R.id.iv_visor)).setImageDrawable(drawable);
        }
        Boolean bool = Boolean.FALSE;
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (!(packageInfo == null || (strArr = packageInfo.requestedPermissions) == null)) {
            bool = Boolean.valueOf(Arrays.asList(strArr).contains("android.permission.CAMERA"));
        }
        if (!bool.booleanValue()) {
            C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
        } else if (C0600b.m3289a(this, "android.permission.CAMERA") != 0) {
            C0008a.m34p(this, new String[]{"android.permission.CAMERA"}, 107);
        } else {
            mo8840h();
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        com.facebook.ads.AdView adView;
        C1603c cVar3;
        AdView adView2;
        if (!(this.f9666q.f7384n3 == 0 || (cVar3 = this.f9674y) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9666q.f7384n3 == 0 || (cVar2 = this.f9674y) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9666q.f7384n3 == 0 || (cVar = this.f9674y) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        AdView adView3 = this.f9660K;
        if (adView3 != null) {
            adView3.destroy();
        }
        BannerView bannerView = this.f9659J;
        if (bannerView != null) {
            bannerView.destroy();
        }
        com.facebook.ads.AdView adView4 = this.f9661L;
        if (adView4 != null) {
            adView4.destroy();
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f9666q.f7420s4;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        AdView adView;
        C11141a aVar = this.f9654E;
        if (aVar != null) {
            try {
                aVar.mo43438c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f9666q.f7384n3 == 0 || (cVar = this.f9674y) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2406g());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 107) {
            return;
        }
        if (iArr == null || iArr.length <= 0 || !strArr[0].equals("android.permission.CAMERA") || iArr[0] != 0) {
            C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
        } else {
            mo8840h();
        }
    }

    public void onResume() {
        C1603c cVar;
        AdView adView;
        SurfaceView surfaceView;
        super.onResume();
        C1692config.m8164P0(this);
        if (findViewById(R.id.rl_scan).getVisibility() == 0) {
            this.f9670u = false;
            C11141a aVar = this.f9654E;
            if (!(aVar == null || (surfaceView = this.f9655F) == null)) {
                try {
                    aVar.mo43437b(surfaceView.getHolder());
                } catch (Exception unused) {
                }
            }
        }
        if (this.f9666q.f7384n3 != 0 && (cVar = this.f9674y) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9675z = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9675z) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9675z = true;
        C1692config.m8175Y0(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f6659e);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9675z = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9675z = true;
        C1692config.m8175Y0(this);
    }
}
