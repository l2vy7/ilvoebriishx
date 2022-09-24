package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import british.p015x.C1692config;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: british.x.t_menugrid */
public class t_menugrid extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, AdapterView.OnItemClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    int f9577m = 80;

    /* renamed from: n */
    int f9578n = 30;

    /* renamed from: o */
    int f9579o;

    /* renamed from: p */
    int f9580p;

    /* renamed from: q */
    int f9581q;

    /* renamed from: r */
    int f9582r = 0;

    /* renamed from: s */
    boolean f9583s = false;

    /* renamed from: t */
    C2380j f9584t;

    /* renamed from: u */
    C1692config f9585u;

    /* renamed from: v */
    C1603c f9586v;

    /* renamed from: w */
    boolean f9587w = false;

    /* renamed from: x */
    MyGridView f9588x;

    /* renamed from: y */
    C2379i f9589y;

    /* renamed from: z */
    boolean f9590z = false;

    /* renamed from: british.x.t_menugrid$a */
    class C2369a extends AdColonyInterstitialListener {
        C2369a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_menugrid t_menugrid = t_menugrid.this;
            if (t_menugrid.f9587w) {
                t_menugrid.abrir_secc(t_menugrid.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_menugrid.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_menugrid.this.f6661g.cancel();
            t_menugrid t_menugrid = t_menugrid.this;
            t_menugrid.abrir_secc(t_menugrid.f6660f);
        }
    }

    /* renamed from: british.x.t_menugrid$b */
    class C2370b implements SearchManager.OnCancelListener {
        C2370b() {
        }

        public void onCancel() {
            t_menugrid.this.setResult(0);
        }
    }

    /* renamed from: british.x.t_menugrid$c */
    class C2371c implements SearchManager.OnDismissListener {
        C2371c() {
        }

        public void onDismiss() {
        }
    }

    /* renamed from: british.x.t_menugrid$d */
    class C2372d implements View.OnClickListener {
        C2372d() {
        }

        public void onClick(View view) {
            t_menugrid t_menugrid = t_menugrid.this;
            C1692config config = t_menugrid.f9585u;
            String str = config.f7368l1;
            new C1692config.C1721n0(t_menugrid, str, C1692config.m8189h(config.f7313c1, str)).execute(new String[0]);
        }
    }

    /* renamed from: british.x.t_menugrid$e */
    class C2373e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f9595b;

        C2373e(int i) {
            this.f9595b = i;
        }

        public void run() {
            t_menugrid.this.m8844b(this.f9595b);
        }
    }

    /* renamed from: british.x.t_menugrid$f */
    class C2374f implements NativeAdListener {

        /* renamed from: b */
        final /* synthetic */ NativeAd f9597b;

        C2374f(NativeAd nativeAd) {
            this.f9597b = nativeAd;
        }

        public void onAdClicked(C3371Ad ad) {
        }

        public void onAdLoaded(C3371Ad ad) {
            String str;
            String str2;
            NativeAdViewAttributes backgroundColor = new NativeAdViewAttributes().setTypeface(Typeface.MONOSPACE).setBackgroundColor(C1692config.f7104D5);
            String str3 = t_menugrid.this.f9585u.f7228N4;
            if (str3 != null && !str3.equals("")) {
                int o = C1692config.m8194o(Color.parseColor("#" + t_menugrid.this.f9585u.f7228N4), 0.2f, 0);
                backgroundColor.setBackgroundColor(o);
                if (C1692config.m8155J(o)) {
                    backgroundColor.setTitleTextColor(-16777216);
                    backgroundColor.setDescriptionTextColor(-16777216);
                } else {
                    backgroundColor.setTitleTextColor(-1);
                    backgroundColor.setDescriptionTextColor(-1);
                }
            }
            C1692config config = t_menugrid.this.f9585u;
            if (config.f7150A4 && (str = config.f7216L4) != null && !str.equals("") && (str2 = t_menugrid.this.f9585u.f7210K4) != null && !str2.equals("")) {
                NativeAdViewAttributes buttonBorderColor = backgroundColor.setButtonTextColor(Color.parseColor("#" + t_menugrid.this.f9585u.f7216L4)).setButtonBorderColor(-12303292);
                buttonBorderColor.setButtonColor(Color.parseColor("#" + t_menugrid.this.f9585u.f7210K4));
            }
            View render = NativeAdView.render(t_menugrid.this, this.f9597b, NativeAdView.Type.HEIGHT_300, backgroundColor);
            LinearLayout linearLayout = (LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat);
            try {
                if (C1692config.m8153I("#" + t_menugrid.this.f9585u.f7228N4)) {
                    linearLayout.setBackgroundColor(-16777216);
                } else {
                    linearLayout.setBackgroundColor(-1);
                }
                int E = C1692config.m8149E(t_menugrid.this.getApplicationContext(), 1);
                linearLayout.setPadding(E, E, E, E);
            } catch (Exception e) {
                e.printStackTrace();
            }
            linearLayout.setVisibility(0);
            ((LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat)).removeViewAt(1);
            ((LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat)).addView(render, 1);
        }

        public void onError(C3371Ad ad, AdError adError) {
        }

        public void onLoggingImpression(C3371Ad ad) {
        }

        public void onMediaDownloaded(C3371Ad ad) {
        }
    }

    /* renamed from: british.x.t_menugrid$g */
    class C2375g extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9599a;

        /* renamed from: british.x.t_menugrid$g$a */
        class C2376a extends FullScreenContentCallback {
            C2376a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_menugrid t_menugrid = t_menugrid.this;
                if (t_menugrid.f9587w) {
                    t_menugrid.abrir_secc(t_menugrid.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                t_menugrid t_menugrid = t_menugrid.this;
                t_menugrid.abrir_secc(t_menugrid.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_menugrid$g$b */
        class C2377b implements OnUserEarnedRewardListener {
            C2377b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2375g gVar = C2375g.this;
                t_menugrid.this.f9587w = true;
                C1692config.m8175Y0(gVar.f9599a);
            }
        }

        C2375g(Context context) {
            this.f9599a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_menugrid.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2376a());
            rewardedAd.show((Activity) this.f9599a, new C2377b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_menugrid t_menugrid = t_menugrid.this;
            if (!t_menugrid.f9585u.mo7502f(this.f9599a, t_menugrid.f6663i)) {
                t_menugrid.this.f6661g.cancel();
                t_menugrid t_menugrid2 = t_menugrid.this;
                t_menugrid2.abrir_secc(t_menugrid2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_menugrid$h */
    class C2378h implements AdDisplayListener {
        C2378h() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_menugrid t_menugrid = t_menugrid.this;
            if (t_menugrid.f9587w) {
                t_menugrid.abrir_secc(t_menugrid.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_menugrid$i */
    public class C2379i extends BaseAdapter {

        /* renamed from: b */
        private Context f9604b;

        public C2379i(Context context) {
            this.f9604b = context;
        }

        public int getCount() {
            return t_menugrid.this.f9585u.f7243Q1.length;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3;
            if (view == null) {
                LayoutInflater layoutInflater = (LayoutInflater) this.f9604b.getSystemService("layout_inflater");
                C1692config config = t_menugrid.this.f9585u;
                if (config.f7156B4) {
                    i2 = R.layout.t_menugrid_row;
                } else {
                    int i4 = config.f7186G4;
                    i2 = i4 == 1 ? R.layout.t_menugrid_row_formato2 : i4 == 2 ? R.layout.t_menugrid_row_formato3 : R.layout.t_menugrid_row_v;
                }
                view = layoutInflater.inflate(i2, viewGroup, false);
                C1692config config2 = t_menugrid.this.f9585u;
                if (!config2.f7156B4 && ((i3 = config2.f7186G4) == 1 || i3 == 2)) {
                    ((CardView) view.findViewById(R.id.cv)).setRadius((float) t_menugrid.this.f9585u.f7448w4);
                }
                if (t_menugrid.this.f9585u.f7469z4) {
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_menugrid);
                    if (t_menugrid.this.f9585u.f7156B4) {
                        imageView.getLayoutParams().height = t_menugrid.this.f9579o;
                        imageView.getLayoutParams().width = t_menugrid.this.f9580p;
                    } else {
                        imageView.getLayoutParams().height = t_menugrid.this.f9579o;
                        imageView.getLayoutParams().width = t_menugrid.this.f9580p;
                    }
                    imageView.setVisibility(0);
                }
                if (t_menugrid.this.f9585u.f7150A4) {
                    TextView textView = (TextView) view.findViewById(R.id.tv_menugrid);
                    if (t_menugrid.this.f9585u.f7180F4) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    if (!t_menugrid.this.f9585u.f7216L4.equals("")) {
                        textView.setTextColor(Color.parseColor("#" + t_menugrid.this.f9585u.f7216L4));
                    }
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    t_menugrid t_menugrid = t_menugrid.this;
                    layoutParams.width = t_menugrid.f9581q;
                    if (t_menugrid.f9585u.f7174E4) {
                        textView.setGravity(17);
                    } else if (Build.VERSION.SDK_INT >= 17 && t_menugrid.getResources().getBoolean(R.bool.es_rtl)) {
                        textView.setTextDirection(4);
                    }
                    if (t_menugrid.this.f9585u.f7210K4.equals("")) {
                        textView.setBackgroundDrawable((Drawable) null);
                    } else {
                        ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor("#" + t_menugrid.this.f9585u.f7210K4));
                        ((GradientDrawable) textView.getBackground()).setCornerRadius((float) t_menugrid.this.f9585u.f7448w4);
                    }
                    textView.setVisibility(0);
                }
            }
            if (t_menugrid.this.f9585u.f7469z4) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_menugrid);
                C1692config config3 = t_menugrid.this.f9585u;
                C1855l[] lVarArr = config3.f7231O1;
                int[] iArr = config3.f7243Q1;
                if (lVarArr[iArr[i]].f7871M0 || lVarArr[iArr[i]].f7869L0 == null) {
                    imageView2.setImageBitmap((Bitmap) null);
                } else {
                    if (!lVarArr[iArr[i]].f7873N0) {
                        imageView2.setVisibility(4);
                    }
                    Resources resources = t_menugrid.this.getResources();
                    C1692config config4 = t_menugrid.this.f9585u;
                    imageView2.setImageDrawable(new BitmapDrawable(resources, config4.f7231O1[config4.f7243Q1[i]].f7869L0));
                    C1692config config5 = t_menugrid.this.f9585u;
                    C1855l[] lVarArr2 = config5.f7231O1;
                    int[] iArr2 = config5.f7243Q1;
                    if (!lVarArr2[iArr2[i]].f7873N0) {
                        lVarArr2[iArr2[i]].f7873N0 = true;
                        C1692config.m8172V(imageView2);
                    }
                }
            }
            if (t_menugrid.this.f9585u.f7150A4) {
                C1692config config6 = t_menugrid.this.f9585u;
                ((TextView) view.findViewById(R.id.tv_menugrid)).setText(config6.f7231O1[config6.f7243Q1[i]].f7898a);
            }
            return view;
        }
    }

    /* renamed from: british.x.t_menugrid$j */
    private class C2380j extends AsyncTask<String, Void, String> {
        private C2380j() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0066 }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0066 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r2 = "/srv/imgs/fondos_menu/fm"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                r2 = 2261075(0x228053, float:3.168441E-39)
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r2 = ".png?v="
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                british.x.t_menugrid r2 = british.p015x.t_menugrid.this     // Catch:{ MalformedURLException -> 0x0066 }
                british.x.config r2 = r2.f9585u     // Catch:{ MalformedURLException -> 0x0066 }
                int r2 = r2.f7455x4     // Catch:{ MalformedURLException -> 0x0066 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x0066 }
                r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0066 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 60000(0xea60, float:8.4078E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{  }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                british.x.t_menugrid r0 = british.p015x.t_menugrid.this     // Catch:{  }
                java.lang.String r1 = "fondomenu"
                r3 = 0
                java.io.FileOutputStream r0 = r0.openFileOutput(r1, r3)     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
                r3 = 100
                r2.compress(r1, r3, r0)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0066:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_menugrid.C2380j.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                t_menugrid t_menugrid = t_menugrid.this;
                t_menugrid.f9585u.f7198I4 = false;
                SharedPreferences.Editor edit = t_menugrid.getSharedPreferences("sh", 0).edit();
                edit.putBoolean("act_fm", false);
                edit.commit();
                if (!t_menugrid.this.f9585u.equals((Object) null)) {
                    try {
                        FileInputStream openFileInput = t_menugrid.this.openFileInput("fondomenu");
                        ImageView imageView = (ImageView) t_menugrid.this.findViewById(R.id.iv_fondo);
                        C1692config config = t_menugrid.this.f9585u;
                        config.mo7514k1(imageView, Boolean.valueOf(config.f7204J4), t_menugrid.this.f9585u.f7462y4);
                        imageView.setVisibility(8);
                        imageView.setImageBitmap(BitmapFactory.decodeFileDescriptor(openFileInput.getFD()));
                        C1692config.m8172V(imageView);
                        openFileInput.close();
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r4 = r10.f9585u.f7463y5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0142  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8844b(int r11) {
        /*
            r10 = this;
            british.x.config r0 = r10.f9585u
            java.lang.String r0 = r0.f7197I3
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001a
            british.x.config r0 = r10.f9585u
            int r4 = r0.f7328e4
            if (r4 == 0) goto L_0x001a
            int r0 = r0.f7334f4
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            british.x.config r4 = r10.f9585u
            java.lang.String r4 = r4.f7203J3
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0033
            british.x.config r4 = r10.f9585u
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r4 = r4.f7463y5
            if (r4 == 0) goto L_0x0033
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            british.x.config r5 = r10.f9585u
            java.lang.String r5 = r5.f7215L3
            boolean r5 = r5.equals(r1)
            r5 = r5 ^ r3
            british.x.config r6 = r10.f9585u
            java.lang.String r6 = r6.f7227N3
            boolean r6 = r6.equals(r1)
            r6 = r6 ^ r3
            british.x.config r7 = r10.f9585u
            java.lang.String r7 = r7.f7239P3
            boolean r7 = r7.equals(r1)
            r7 = r7 ^ r3
            r8 = 5
            if (r0 != 0) goto L_0x007b
            if (r4 != 0) goto L_0x007b
            if (r5 != 0) goto L_0x007b
            if (r6 != 0) goto L_0x007b
            if (r7 != 0) goto L_0x007b
            british.x.config r9 = r10.f9585u
            java.lang.String r9 = r9.f7203J3
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x007b
            int r9 = r10.f9582r
            if (r9 >= r8) goto L_0x007b
            int r9 = r9 + r3
            r10.f9582r = r9
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            british.x.t_menugrid$e r1 = new british.x.t_menugrid$e
            r1.<init>(r11)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
        L_0x007b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r11.add(r0)
        L_0x0089:
            r0 = 2
            if (r4 == 0) goto L_0x0093
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r11.add(r4)
        L_0x0093:
            r4 = 3
            if (r5 == 0) goto L_0x009d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r11.add(r5)
        L_0x009d:
            r5 = 4
            if (r6 == 0) goto L_0x00a7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11.add(r6)
        L_0x00a7:
            if (r7 == 0) goto L_0x00b0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r11.add(r6)
        L_0x00b0:
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x00d2
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int r7 = r11.size()
            int r7 = r7 - r3
            int r7 = r7 - r2
            int r7 = r7 + r3
            int r6 = r6.nextInt(r7)
            int r6 = r6 + r2
            java.lang.Object r11 = r11.get(r6)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x00d3
        L_0x00d2:
            r11 = 0
        L_0x00d3:
            if (r11 != r3) goto L_0x00db
            r11 = 1
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            r6 = 0
            goto L_0x00f7
        L_0x00db:
            if (r11 != r0) goto L_0x00e0
            r11 = 0
            r0 = 1
            goto L_0x00d7
        L_0x00e0:
            if (r11 != r4) goto L_0x00e6
            r11 = 0
            r0 = 0
            r4 = 1
            goto L_0x00d8
        L_0x00e6:
            if (r11 != r5) goto L_0x00ed
            r11 = 0
            r0 = 0
            r4 = 0
            r5 = 1
            goto L_0x00d9
        L_0x00ed:
            if (r11 != r8) goto L_0x00f5
            r11 = 0
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            goto L_0x00f7
        L_0x00f5:
            r11 = 0
            goto L_0x00d6
        L_0x00f7:
            r7 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            if (r11 == 0) goto L_0x0142
            com.google.android.gms.ads.AdView r11 = new com.google.android.gms.ads.AdView
            r11.<init>(r10)
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE
            r11.setAdSize(r0)
            british.x.config r0 = r10.f9585u
            java.lang.String r0 = r0.f7197I3
            r11.setAdUnitId(r0)
            r0 = 2131362468(0x7f0a02a4, float:1.8344717E38)
            android.view.View r0 = r10.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r2)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViewAt(r3)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r11, r3)
            com.google.android.gms.ads.AdRequest$Builder r0 = new com.google.android.gms.ads.AdRequest$Builder
            r0.<init>()
            com.google.android.gms.ads.AdRequest r0 = r0.build()
            r11.loadAd(r0)
            goto L_0x01d8
        L_0x0142:
            if (r0 == 0) goto L_0x0182
            british.x.config r11 = r10.f9585u
            java.lang.String r11 = r11.f7222M4
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0177
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "#"
            r11.append(r0)
            british.x.config r0 = r10.f9585u
            java.lang.String r0 = r0.f7222M4
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            boolean r11 = british.p015x.C1692config.m8153I(r11)
            if (r11 == 0) goto L_0x0177
            r11 = 2131363071(0x7f0a04ff, float:1.834594E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r0 = british.p015x.C1692config.f7101A5
            r11.setTextColor(r0)
        L_0x0177:
            british.x.config r1 = r10.f9585u
            r3 = 1
            r4 = 3
            r5 = -1
            r6 = 0
            r2 = r10
            r1.mo7512k(r2, r3, r4, r5, r6)
            goto L_0x01d8
        L_0x0182:
            if (r4 == 0) goto L_0x01a2
            com.facebook.ads.NativeAd r11 = new com.facebook.ads.NativeAd
            british.x.config r0 = r10.f9585u
            java.lang.String r0 = r0.f7215L3
            r11.<init>((android.content.Context) r10, (java.lang.String) r0)
            british.x.t_menugrid$f r0 = new british.x.t_menugrid$f
            r0.<init>(r11)
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r1 = r11.buildLoadAdConfig()
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r0 = r1.withAdListener(r0)
            com.facebook.ads.NativeAdBase$NativeLoadAdConfig r0 = r0.build()
            r11.loadAd(r0)
            goto L_0x01d8
        L_0x01a2:
            if (r5 == 0) goto L_0x01ca
            com.startapp.sdk.ads.banner.Mrec r11 = new com.startapp.sdk.ads.banner.Mrec
            r11.<init>((android.app.Activity) r10)
            java.lang.String r0 = "MENU"
            r11.setAdTag(r0)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r2)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViewAt(r3)
            android.view.View r0 = r10.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r11, r3)
            goto L_0x01d8
        L_0x01ca:
            if (r6 == 0) goto L_0x01d0
            r10.m8846e()
            goto L_0x01d8
        L_0x01d0:
            british.x.config r11 = r10.f9585u
            british.x.c r11 = r11.mo7474A0(r10, r2)
            r10.f9586v = r11
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_menugrid.m8844b(int):void");
    }

    /* renamed from: c */
    private void m8845c(Context context) {
        this.f6662h = new C2375g(context);
    }

    /* renamed from: e */
    private void m8846e() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f9585u.f7420s4;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        this.f9585u.f7420s4 = IronSource.createBanner(this, ISBannerSize.RECTANGLE);
        findViewById(R.id.ll_appsreco).setVisibility(8);
        ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
        ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
        ((LinearLayout) findViewById(R.id.ll_nat)).addView(this.f9585u.f7420s4, 1);
        IronSource.loadBanner(this.f9585u.f7420s4);
        this.f9590z = true;
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9585u.mo7510j0(view, this);
        if (j0.f7844c) {
            finish();
            return;
        }
        Intent intent = j0.f7842a;
        if (intent != null) {
            startActivityForResult(intent, 0);
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
    /* renamed from: d */
    public void mo8789d() {
        this.f9585u.mo7522q0(this);
        int i = 0;
        while (true) {
            int[] iArr = this.f9585u.f7249R1;
            if (i < iArr.length) {
                if (iArr[i] > 0) {
                    findViewById(iArr[i]).setOnClickListener(this);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar_app") && intent.getExtras().getBoolean("finalizar_app")) {
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9587w) {
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
        if (this.f9583s || !this.f9585u.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9583s = true;
        C1692config.m8199t(this);
    }

    public void onClick(View view) {
        String str = this.f9585u.f7251R3;
        if (str != null && !str.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9585u.f7251R3);
        }
        String str2 = this.f9585u.f7245Q3;
        if (str2 != null) {
            str2.equals("");
        }
        String str3 = this.f9585u.f7269U3;
        if (str3 != null && !str3.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9585u.f7269U3);
        }
        String str4 = this.f9585u.f7275V3;
        if (str4 != null && !str4.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9585u.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(13)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r1 = r18.getApplicationContext()
            british.x.config r1 = (british.p015x.C1692config) r1
            r0.f9585u = r1
            java.lang.String r2 = r1.f7313c1
            if (r2 != 0) goto L_0x0011
            r1.mo7490V0()
        L_0x0011:
            r0.m8845c(r0)
            british.x.t_menugrid$a r1 = new british.x.t_menugrid$a
            r1.<init>()
            r0.f6666l = r1
            british.x.config r1 = r0.f9585u
            java.lang.String r2 = r1.f7222M4
            java.lang.String r1 = r1.f7368l1
            java.lang.String r1 = british.p015x.C1692config.m8189h(r2, r1)
            r0.f6656b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            british.x.config r3 = r0.f9585u
            java.lang.String r3 = r3.f7222M4
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.p015x.C1692config.m8153I(r1)
            if (r1 != 0) goto L_0x0048
            r1 = 2131886906(0x7f12033a, float:1.9408404E38)
            r0.setTheme(r1)
        L_0x0048:
            super.onCreate(r19)
            r1 = 2131558665(0x7f0d0109, float:1.8742652E38)
            r0.setContentView(r1)
            british.x.config r1 = r0.f9585u
            r3 = 900(0x384, float:1.261E-42)
            r1.f7312c = r3
            java.lang.String r1 = "sh"
            r3 = 0
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r3)
            r1.registerOnSharedPreferenceChangeListener(r0)
            android.content.SharedPreferences$Editor r4 = r1.edit()
            british.x.config r5 = r0.f9585u
            int r5 = r5.f7312c
            java.lang.String r6 = "ind_secc_sel"
            r4.putInt(r6, r5)
            r4.commit()
            r18.mo8789d()
            british.x.config r4 = r0.f9585u
            r4.mo7486N0(r0, r3)
            java.lang.String r4 = "search"
            java.lang.Object r4 = r0.getSystemService(r4)
            android.app.SearchManager r4 = (android.app.SearchManager) r4
            british.x.t_menugrid$b r5 = new british.x.t_menugrid$b
            r5.<init>()
            r4.setOnCancelListener(r5)
            british.x.t_menugrid$c r5 = new british.x.t_menugrid$c
            r5.<init>()
            r4.setOnDismissListener(r5)
            british.x.config r4 = r0.f9585u
            java.lang.String r4 = r4.f7222M4
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            r6 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            r7 = 2
            r8 = 1
            if (r4 != 0) goto L_0x00e4
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r10 = new int[r7]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            british.x.config r12 = r0.f9585u
            java.lang.String r12 = r12.f7222M4
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r10[r3] = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            british.x.config r12 = r0.f9585u
            java.lang.String r12 = r12.f7228N4
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r10[r8] = r11
            r4.<init>(r9, r10)
            android.view.View r9 = r0.findViewById(r6)
            r9.setBackgroundDrawable(r4)
        L_0x00e4:
            android.content.res.Resources r4 = r18.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r9 = r0.f9577m
            float r9 = (float) r9
            float r9 = r9 * r4
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r10
            int r9 = (int) r9
            r0.f9577m = r9
            int r9 = r0.f9578n
            float r9 = (float) r9
            float r9 = r9 * r4
            float r9 = r9 + r10
            int r9 = (int) r9
            r0.f9578n = r9
            r0.f9579o = r3
            r0.f9580p = r3
            r0.f9581q = r3
            java.lang.String r9 = "layout_inflater"
            java.lang.Object r9 = r0.getSystemService(r9)
            android.view.LayoutInflater r9 = (android.view.LayoutInflater) r9
            british.x.config r11 = r0.f9585u
            boolean r12 = r11.f7156B4
            if (r12 == 0) goto L_0x011a
            r11 = 2131558666(0x7f0d010a, float:1.8742654E38)
            goto L_0x012b
        L_0x011a:
            int r11 = r11.f7186G4
            if (r11 != r8) goto L_0x0122
            r11 = 2131558667(0x7f0d010b, float:1.8742656E38)
            goto L_0x012b
        L_0x0122:
            if (r11 != r7) goto L_0x0128
            r11 = 2131558668(0x7f0d010c, float:1.8742658E38)
            goto L_0x012b
        L_0x0128:
            r11 = 2131558669(0x7f0d010d, float:1.874266E38)
        L_0x012b:
            android.view.View r6 = r0.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            android.view.View r6 = r9.inflate(r11, r6, r3)
            r9 = 2131363144(0x7f0a0548, float:1.8346089E38)
            android.view.View r6 = r6.findViewById(r9)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r9 = 0
        L_0x013f:
            british.x.config r11 = r0.f9585u
            british.x.l[] r12 = r11.f7231O1
            int r13 = r12.length
            if (r9 >= r13) goto L_0x01de
            r13 = r12[r9]
            boolean r13 = r13.f7848B
            if (r13 != 0) goto L_0x01da
            boolean r11 = r11.f7150A4
            if (r11 == 0) goto L_0x0173
            r11 = r12[r9]
            java.lang.String r11 = r11.f7898a
            r6.setText(r11)
            british.x.config r11 = r0.f9585u
            boolean r11 = r11.f7180F4
            if (r11 == 0) goto L_0x0164
            android.graphics.Typeface r11 = r6.getTypeface()
            r6.setTypeface(r11, r8)
        L_0x0164:
            r6.measure(r3, r3)
            int r11 = r0.f9581q
            int r12 = r6.getMeasuredWidth()
            int r11 = java.lang.Math.max(r11, r12)
            r0.f9581q = r11
        L_0x0173:
            british.x.config r11 = r0.f9585u
            boolean r12 = r11.f7469z4
            if (r12 == 0) goto L_0x01da
            british.x.l[] r11 = r11.f7231O1
            r12 = r11[r9]
            boolean r12 = r12.f7871M0
            if (r12 != 0) goto L_0x01ac
            r12 = r11[r9]
            android.graphics.Bitmap r12 = r12.f7869L0
            if (r12 == 0) goto L_0x01ac
            int r12 = r0.f9579o
            r11 = r11[r9]
            android.graphics.Bitmap r11 = r11.f7869L0
            int r11 = r11.getHeight()
            int r11 = java.lang.Math.max(r12, r11)
            r0.f9579o = r11
            int r11 = r0.f9580p
            british.x.config r12 = r0.f9585u
            british.x.l[] r12 = r12.f7231O1
            r12 = r12[r9]
            android.graphics.Bitmap r12 = r12.f7869L0
            int r12 = r12.getWidth()
            int r11 = java.lang.Math.max(r11, r12)
            r0.f9580p = r11
            goto L_0x01da
        L_0x01ac:
            r12 = r11[r9]
            boolean r12 = r12.f7871M0
            if (r12 == 0) goto L_0x01da
            r12 = r11[r9]
            int r12 = r12.f7879Q0
            if (r12 == 0) goto L_0x01da
            r12 = r11[r9]
            int r12 = r12.f7881R0
            if (r12 == 0) goto L_0x01da
            int r12 = r0.f9579o
            r11 = r11[r9]
            int r11 = r11.f7881R0
            int r11 = java.lang.Math.max(r12, r11)
            r0.f9579o = r11
            int r11 = r0.f9580p
            british.x.config r12 = r0.f9585u
            british.x.l[] r12 = r12.f7231O1
            r12 = r12[r9]
            int r12 = r12.f7879Q0
            int r11 = java.lang.Math.max(r11, r12)
            r0.f9580p = r11
        L_0x01da:
            int r9 = r9 + 1
            goto L_0x013f
        L_0x01de:
            int r6 = r0.f9579o
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r10
            int r6 = (int) r6
            r0.f9579o = r6
            int r6 = r0.f9580p
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r10
            int r6 = (int) r6
            r0.f9580p = r6
            android.view.WindowManager r6 = r18.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 13
            if (r9 < r11) goto L_0x0209
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>()
            r6.getSize(r9)
            int r6 = r9.x
            goto L_0x020d
        L_0x0209:
            int r6 = r6.getWidth()
        L_0x020d:
            british.x.config r9 = r0.f9585u
            boolean r11 = r9.f7156B4
            if (r11 == 0) goto L_0x0223
            int r12 = r0.f9579o
            int r13 = r0.f9578n
            if (r12 <= r13) goto L_0x0223
            int r14 = r0.f9580p
            int r14 = r14 * r13
            int r14 = r14 / r12
            r0.f9580p = r14
            r0.f9579o = r13
            goto L_0x0234
        L_0x0223:
            if (r11 != 0) goto L_0x0234
            int r12 = r0.f9579o
            int r13 = r0.f9577m
            if (r12 <= r13) goto L_0x0234
            int r14 = r0.f9580p
            int r14 = r14 * r13
            int r14 = r14 / r12
            r0.f9580p = r14
            r0.f9579o = r13
        L_0x0234:
            if (r11 != 0) goto L_0x0249
            boolean r9 = r9.f7150A4
            if (r9 == 0) goto L_0x0249
            int r9 = r0.f9580p
            int r11 = r0.f9581q
            if (r9 <= r11) goto L_0x0249
            int r12 = r0.f9579o
            int r12 = r12 * r11
            int r12 = r12 / r9
            r0.f9579o = r12
            r0.f9580p = r11
        L_0x0249:
            r9 = 2131362258(0x7f0a01d2, float:1.8344292E38)
            android.view.View r9 = r0.findViewById(r9)
            british.x.MyGridView r9 = (british.p015x.MyGridView) r9
            r0.f9588x = r9
            british.x.config r9 = r0.f9585u
            boolean r9 = r9.f7168D4
            if (r9 == 0) goto L_0x0266
            r9 = 2131362506(0x7f0a02ca, float:1.8344795E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r9.setGravity(r8)
        L_0x0266:
            british.x.config r9 = r0.f9585u
            int r9 = r9.f7441v4
            if (r9 != r8) goto L_0x026f
            r9 = 16
            goto L_0x0275
        L_0x026f:
            if (r9 != r7) goto L_0x0274
            r9 = 24
            goto L_0x0275
        L_0x0274:
            r9 = 1
        L_0x0275:
            float r9 = (float) r9
            float r9 = r9 * r4
            float r9 = r9 + r10
            int r9 = (int) r9
            british.x.MyGridView r11 = r0.f9588x
            r11.setVerticalSpacing(r9)
            british.x.MyGridView r11 = r0.f9588x
            r11.setHorizontalSpacing(r9)
            r11 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 * r4
            float r11 = r11 + r10
            int r11 = (int) r11
            british.x.MyGridView r12 = r0.f9588x
            r12.setPadding(r11, r11, r11, r11)
            british.x.config r12 = r0.f9585u
            int r13 = r12.f7434u4
            boolean r14 = r12.f7156B4
            if (r14 == 0) goto L_0x02b0
            int r14 = r0.f9580p
            int r15 = r0.f9581q
            int r16 = r14 + r15
            int r16 = r16 + r9
            r17 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r17
            float r4 = r4 + r10
            int r4 = (int) r4
            boolean r10 = r12.f7150A4
            if (r10 == 0) goto L_0x02ab
            int r16 = r16 + r4
        L_0x02ab:
            int r14 = r14 + r15
            r0.m8844b(r14)
            goto L_0x02cf
        L_0x02b0:
            int r4 = r12.f7186G4
            if (r4 == r8) goto L_0x02b9
            if (r4 != r7) goto L_0x02b7
            goto L_0x02b9
        L_0x02b7:
            r4 = 0
            goto L_0x02bf
        L_0x02b9:
            r4 = 10
            int r4 = british.p015x.C1692config.m8149E(r0, r4)
        L_0x02bf:
            int r10 = r0.f9580p
            int r12 = r0.f9581q
            int r10 = java.lang.Math.max(r10, r12)
            int r10 = r10 + r9
            int r16 = r10 + r4
            int r4 = r0.f9581q
            r0.m8844b(r4)
        L_0x02cf:
            if (r13 <= r8) goto L_0x02db
            int r4 = r16 * r13
            int r10 = r11 * 2
            int r4 = r4 + r10
            if (r4 <= r6) goto L_0x02db
            int r13 = r13 + -1
            goto L_0x02cf
        L_0x02db:
            british.x.MyGridView r4 = r0.f9588x
            r4.setNumColumns(r13)
            british.x.MyGridView r4 = r0.f9588x
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r16 = r16 * r13
            int r11 = r11 * 2
            int r16 = r16 + r11
            int r6 = r16 - r9
            r4.width = r6
            british.x.MyGridView r4 = r0.f9588x
            r4.setOnItemClickListener(r0)
            british.x.config r4 = r0.f9585u
            boolean r4 = r4.f7162C4
            r6 = 0
            if (r4 == 0) goto L_0x02fe
            if (r19 == 0) goto L_0x0303
        L_0x02fe:
            british.x.MyGridView r4 = r0.f9588x
            r4.setLayoutAnimation(r6)
        L_0x0303:
            british.x.t_menugrid$i r4 = new british.x.t_menugrid$i
            r4.<init>(r0)
            r0.f9589y = r4
            british.x.MyGridView r7 = r0.f9588x
            r7.setAdapter(r4)
            british.x.config r4 = r0.f9585u
            boolean r7 = r4.f7192H4
            r9 = 2131362370(0x7f0a0242, float:1.8344519E38)
            if (r7 == 0) goto L_0x0373
            java.io.File r1 = new java.io.File
            java.io.File r4 = r18.getFilesDir()
            java.lang.String r7 = "fondomenu"
            r1.<init>(r4, r7)
            british.x.config r4 = r0.f9585u
            boolean r4 = r4.f7198I4
            if (r4 != 0) goto L_0x035a
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0330
            goto L_0x035a
        L_0x0330:
            java.io.FileInputStream r1 = r0.openFileInput(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            android.view.View r4 = r0.findViewById(r9)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            british.x.config r6 = r0.f9585u     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            boolean r7 = r6.f7204J4     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            british.x.config r9 = r0.f9585u     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            int r9 = r9.f7462y4     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            r6.mo7514k1(r4, r7, r9)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            java.io.FileDescriptor r6 = r1.getFD()     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFileDescriptor(r6)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            r4.setImageBitmap(r6)     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            r1.close()     // Catch:{ FileNotFoundException | IOException -> 0x0358 }
            goto L_0x03a5
        L_0x0358:
            goto L_0x03a5
        L_0x035a:
            british.x.t_menugrid$j r1 = r0.f9584t
            if (r1 == 0) goto L_0x0366
            android.os.AsyncTask$Status r1 = r1.getStatus()
            android.os.AsyncTask$Status r4 = android.os.AsyncTask.Status.RUNNING
            if (r1 == r4) goto L_0x03a5
        L_0x0366:
            british.x.t_menugrid$j r1 = new british.x.t_menugrid$j
            r1.<init>()
            r0.f9584t = r1
            java.lang.String[] r4 = new java.lang.String[r3]
            r1.execute(r4)
            goto L_0x03a5
        L_0x0373:
            int r4 = r4.f7163D
            if (r4 <= 0) goto L_0x03a5
            java.lang.String r4 = "fondo_v_act"
            int r1 = r1.getInt(r4, r3)
            british.x.config r4 = r0.f9585u
            int r6 = r4.f7163D
            if (r1 != r6) goto L_0x03a5
            android.view.View r1 = r0.findViewById(r9)     // Catch:{  }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{  }
            british.x.config r6 = r0.f9585u     // Catch:{  }
            boolean r6 = r6.f7145A     // Catch:{  }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{  }
            british.x.config r7 = r0.f9585u     // Catch:{  }
            int r7 = r7.f7157C     // Catch:{  }
            r4.mo7514k1(r1, r6, r7)     // Catch:{  }
            british.x.config r1 = r0.f9585u     // Catch:{  }
            java.lang.String r4 = "fondo"
            android.view.View r6 = r0.findViewById(r9)     // Catch:{  }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{  }
            r1.mo7493Y(r4, r6)     // Catch:{  }
        L_0x03a5:
            british.x.config r1 = r0.f9585u
            boolean r1 = r1.f7386n5
            if (r1 == 0) goto L_0x03ed
            r1 = 2131362806(0x7f0a03f6, float:1.8345403E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            british.x.config r4 = r0.f9585u
            java.lang.String r4 = r4.f7228N4
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x03dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            british.x.config r2 = r0.f9585u
            java.lang.String r2 = r2.f7228N4
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            boolean r2 = british.p015x.C1692config.m8153I(r2)
            if (r2 == 0) goto L_0x03dd
            int r2 = british.p015x.C1692config.f7106F5
            r1.setTextColor(r2)
            goto L_0x03e2
        L_0x03dd:
            int r2 = british.p015x.C1692config.f7105E5
            r1.setTextColor(r2)
        L_0x03e2:
            british.x.t_menugrid$d r2 = new british.x.t_menugrid$d
            r2.<init>()
            r1.setOnClickListener(r2)
            r1.setVisibility(r3)
        L_0x03ed:
            if (r19 != 0) goto L_0x042a
            android.content.Intent r1 = r18.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x040b
            java.lang.String r2 = "intent_abrir"
            boolean r4 = r1.containsKey(r2)
            if (r4 == 0) goto L_0x040b
            java.lang.Object r1 = r1.get(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivityForResult(r1, r3)
            goto L_0x042a
        L_0x040b:
            if (r19 != 0) goto L_0x042a
            british.x.config r2 = r0.f9585u
            if (r1 == 0) goto L_0x041b
            java.lang.String r4 = "ad_entrar"
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x041b
            r4 = 1
            goto L_0x041c
        L_0x041b:
            r4 = 0
        L_0x041c:
            if (r1 == 0) goto L_0x0427
            java.lang.String r5 = "fb_entrar"
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x0427
            r3 = 1
        L_0x0427:
            r2.mo7503f1(r0, r4, r3)
        L_0x042a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_menugrid.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9585u.f7384n3 == 0 || (cVar3 = this.f9586v) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9585u.f7384n3 == 0 || (cVar2 = this.f9586v) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9585u.f7384n3 == 0 || (cVar = this.f9586v) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if (isFinishing()) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        view.setId(this.f9585u.f7243Q1[i]);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(this.f9585u.f7243Q1[i]));
        onClick(view);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9585u.f7384n3 == 0 || (cVar = this.f9586v) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2378h());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        ImageView imageView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9590z) {
            m8846e();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_nat);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).findViewById(R.id.ad_pb) != null) {
                viewGroup.getChildAt(i).findViewById(R.id.ad_pb).setVisibility(8);
            }
        }
        int i2 = this.f9585u.f7380n;
        if (i2 > 0 && (imageView = (ImageView) findViewById(i2 + 10000)) != null) {
            this.f9585u.mo7478D0(this, imageView);
        }
        if (!(this.f9585u.f7384n3 == 0 || (cVar = this.f9586v) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        this.f9583s = false;
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9587w = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9587w) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9587w = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            C1692config config = this.f9585u;
            if (!config.f7192H4) {
                try {
                    config.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9585u.f7145A), this.f9585u.f7157C);
                    ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                    this.f9585u.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                    C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        } else if (this.f9589y != null && str.equals("ico_cargado")) {
            this.f9589y.notifyDataSetChanged();
        }
    }

    public void onVideoCompleted() {
        this.f9587w = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9587w = true;
        C1692config.m8175Y0(this);
    }
}
