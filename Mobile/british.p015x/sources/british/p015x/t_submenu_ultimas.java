package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
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

/* renamed from: british.x.t_submenu_ultimas */
public class t_submenu_ultimas extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, AdapterView.OnItemClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    ListView f9876A;

    /* renamed from: B */
    ProgressBar f9877B;

    /* renamed from: C */
    boolean f9878C = false;

    /* renamed from: D */
    SharedPreferences f9879D;

    /* renamed from: E */
    GridView f9880E;

    /* renamed from: F */
    C2460g f9881F;

    /* renamed from: G */
    boolean f9882G = false;

    /* renamed from: m */
    int f9883m = 80;

    /* renamed from: n */
    int f9884n = 30;

    /* renamed from: o */
    int f9885o;

    /* renamed from: p */
    int f9886p;

    /* renamed from: q */
    int f9887q;

    /* renamed from: r */
    int f9888r;

    /* renamed from: s */
    boolean f9889s = false;

    /* renamed from: t */
    C1692config f9890t;

    /* renamed from: u */
    Bundle f9891u;

    /* renamed from: v */
    C1603c f9892v;

    /* renamed from: w */
    C1855l f9893w;

    /* renamed from: x */
    C1855l[] f9894x;

    /* renamed from: y */
    String[] f9895y;

    /* renamed from: z */
    int f9896z = 0;

    /* renamed from: british.x.t_submenu_ultimas$a */
    class C2452a extends AdColonyInterstitialListener {
        C2452a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
            if (t_submenu_ultimas.f9878C) {
                t_submenu_ultimas.abrir_secc(t_submenu_ultimas.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_submenu_ultimas.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_submenu_ultimas.this.f6661g.cancel();
            t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
            t_submenu_ultimas.abrir_secc(t_submenu_ultimas.f6660f);
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$b */
    class C2453b implements SearchManager.OnCancelListener {
        C2453b() {
        }

        public void onCancel() {
            t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
            t_submenu_ultimas.f6657c = false;
            t_submenu_ultimas.setResult(0);
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$c */
    class C2454c implements SearchManager.OnDismissListener {
        C2454c() {
        }

        public void onDismiss() {
            t_submenu_ultimas.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$d */
    class C2455d implements NativeAdListener {

        /* renamed from: b */
        final /* synthetic */ NativeAd f9900b;

        C2455d(NativeAd nativeAd) {
            this.f9900b = nativeAd;
        }

        public void onAdClicked(C3371Ad ad) {
        }

        public void onAdLoaded(C3371Ad ad) {
            String str;
            String str2;
            NativeAdViewAttributes backgroundColor = new NativeAdViewAttributes().setTypeface(Typeface.MONOSPACE).setBackgroundColor(C1692config.f7104D5);
            String str3 = t_submenu_ultimas.this.f9893w.f7919h;
            if (str3 != null && !str3.equals("")) {
                int o = C1692config.m8194o(Color.parseColor("#" + t_submenu_ultimas.this.f9893w.f7919h), 0.2f, 0);
                backgroundColor.setBackgroundColor(o);
                if (C1692config.m8155J(o)) {
                    backgroundColor.setTitleTextColor(-16777216);
                    backgroundColor.setDescriptionTextColor(-16777216);
                } else {
                    backgroundColor.setTitleTextColor(-1);
                    backgroundColor.setDescriptionTextColor(-1);
                }
            }
            C1855l lVar = t_submenu_ultimas.this.f9893w;
            if (lVar.f7893X0 && (str = lVar.f7912e1) != null && !str.equals("") && (str2 = t_submenu_ultimas.this.f9893w.f7909d1) != null && !str2.equals("")) {
                NativeAdViewAttributes buttonBorderColor = backgroundColor.setButtonTextColor(Color.parseColor("#" + t_submenu_ultimas.this.f9893w.f7912e1)).setButtonBorderColor(-12303292);
                buttonBorderColor.setButtonColor(Color.parseColor("#" + t_submenu_ultimas.this.f9893w.f7909d1));
            }
            View render = NativeAdView.render(t_submenu_ultimas.this, this.f9900b, NativeAdView.Type.HEIGHT_300, backgroundColor);
            LinearLayout linearLayout = (LinearLayout) t_submenu_ultimas.this.findViewById(R.id.ll_nat);
            try {
                if (C1692config.m8153I("#" + t_submenu_ultimas.this.f9893w.f7919h)) {
                    linearLayout.setBackgroundColor(-16777216);
                } else {
                    linearLayout.setBackgroundColor(-1);
                }
                int E = C1692config.m8149E(t_submenu_ultimas.this.getApplicationContext(), 1);
                linearLayout.setPadding(E, E, E, E);
            } catch (Exception e) {
                e.printStackTrace();
            }
            linearLayout.setVisibility(0);
            ((LinearLayout) t_submenu_ultimas.this.findViewById(R.id.ll_nat)).removeViewAt(1);
            ((LinearLayout) t_submenu_ultimas.this.findViewById(R.id.ll_nat)).addView(render, 1);
        }

        public void onError(C3371Ad ad, AdError adError) {
        }

        public void onLoggingImpression(C3371Ad ad) {
        }

        public void onMediaDownloaded(C3371Ad ad) {
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$e */
    class C2456e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9902a;

        /* renamed from: british.x.t_submenu_ultimas$e$a */
        class C2457a extends FullScreenContentCallback {
            C2457a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
                if (t_submenu_ultimas.f9878C) {
                    t_submenu_ultimas.abrir_secc(t_submenu_ultimas.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
                t_submenu_ultimas.abrir_secc(t_submenu_ultimas.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_submenu_ultimas$e$b */
        class C2458b implements OnUserEarnedRewardListener {
            C2458b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2456e eVar = C2456e.this;
                t_submenu_ultimas.this.f9878C = true;
                C1692config.m8175Y0(eVar.f9902a);
            }
        }

        C2456e(Context context) {
            this.f9902a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_submenu_ultimas.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2457a());
            rewardedAd.show((Activity) this.f9902a, new C2458b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
            if (!t_submenu_ultimas.f9890t.mo7502f(this.f9902a, t_submenu_ultimas.f6663i)) {
                t_submenu_ultimas.this.f6661g.cancel();
                t_submenu_ultimas t_submenu_ultimas2 = t_submenu_ultimas.this;
                t_submenu_ultimas2.abrir_secc(t_submenu_ultimas2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$f */
    class C2459f implements AdDisplayListener {
        C2459f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
            if (t_submenu_ultimas.f9878C) {
                t_submenu_ultimas.abrir_secc(t_submenu_ultimas.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$g */
    public class C2460g extends BaseAdapter {

        /* renamed from: b */
        private Context f9907b;

        public C2460g(Context context) {
            this.f9907b = context;
        }

        public int getCount() {
            return t_submenu_ultimas.this.f9896z;
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
                LayoutInflater layoutInflater = (LayoutInflater) this.f9907b.getSystemService("layout_inflater");
                C1855l lVar = t_submenu_ultimas.this.f9893w;
                if (lVar.f7895Y0) {
                    i2 = R.layout.t_menugrid_row;
                } else {
                    int i4 = lVar.f7889V0;
                    i2 = i4 == 1 ? R.layout.t_menugrid_row_formato2 : i4 == 2 ? R.layout.t_menugrid_row_formato3 : R.layout.t_menugrid_row_v;
                }
                view = layoutInflater.inflate(i2, viewGroup, false);
                C1855l lVar2 = t_submenu_ultimas.this.f9893w;
                if (!lVar2.f7895Y0 && ((i3 = lVar2.f7889V0) == 1 || i3 == 2)) {
                    ((CardView) view.findViewById(R.id.cv)).setRadius((float) t_submenu_ultimas.this.f9893w.f7887U0);
                }
                if (t_submenu_ultimas.this.f9893w.f7891W0) {
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_menugrid);
                    if (t_submenu_ultimas.this.f9893w.f7895Y0) {
                        imageView.getLayoutParams().height = t_submenu_ultimas.this.f9886p;
                        imageView.getLayoutParams().width = t_submenu_ultimas.this.f9887q;
                    } else {
                        imageView.getLayoutParams().height = t_submenu_ultimas.this.f9886p;
                        imageView.getLayoutParams().width = t_submenu_ultimas.this.f9887q;
                    }
                    imageView.setVisibility(0);
                }
                if (t_submenu_ultimas.this.f9893w.f7893X0) {
                    TextView textView = (TextView) view.findViewById(R.id.tv_menugrid);
                    if (t_submenu_ultimas.this.f9893w.f7906c1) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    if (!t_submenu_ultimas.this.f9893w.f7912e1.equals("")) {
                        textView.setTextColor(Color.parseColor("#" + t_submenu_ultimas.this.f9893w.f7912e1));
                    }
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
                    layoutParams.width = t_submenu_ultimas.f9888r;
                    if (t_submenu_ultimas.f9893w.f7903b1) {
                        textView.setGravity(17);
                    } else if (Build.VERSION.SDK_INT >= 17 && t_submenu_ultimas.getResources().getBoolean(R.bool.es_rtl)) {
                        textView.setTextDirection(4);
                    }
                    if (t_submenu_ultimas.this.f9893w.f7909d1.equals("")) {
                        textView.setBackgroundDrawable((Drawable) null);
                    } else {
                        ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor("#" + t_submenu_ultimas.this.f9893w.f7909d1));
                        ((GradientDrawable) textView.getBackground()).setCornerRadius((float) t_submenu_ultimas.this.f9893w.f7887U0);
                    }
                    textView.setVisibility(0);
                }
            }
            if (t_submenu_ultimas.this.f9893w.f7891W0) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_menugrid);
                C1855l[] lVarArr = t_submenu_ultimas.this.f9894x;
                if (lVarArr[i].f7871M0 || lVarArr[i].f7869L0 == null) {
                    imageView2.setImageBitmap((Bitmap) null);
                } else {
                    if (!lVarArr[i].f7873N0) {
                        imageView2.setVisibility(4);
                    }
                    imageView2.setImageDrawable(new BitmapDrawable(t_submenu_ultimas.this.getResources(), t_submenu_ultimas.this.f9894x[i].f7869L0));
                    C1855l[] lVarArr2 = t_submenu_ultimas.this.f9894x;
                    if (!lVarArr2[i].f7873N0) {
                        lVarArr2[i].f7873N0 = true;
                        C1692config.m8172V(imageView2);
                    }
                }
            }
            if (t_submenu_ultimas.this.f9893w.f7893X0) {
                ((TextView) view.findViewById(R.id.tv_menugrid)).setText(t_submenu_ultimas.this.f9894x[i].f7898a);
            }
            return view;
        }
    }

    /* renamed from: british.x.t_submenu_ultimas$h */
    private class C2461h extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f9909a;

        /* renamed from: b */
        String f9910b;

        /* renamed from: c */
        String f9911c;

        private C2461h() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0081, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x007d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f9909a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f9910b = r2
                r2 = 2
                r6 = r6[r2]
                r5.f9911c = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7108H5
                r6.append(r2)
                java.lang.String r2 = "/srv/imgs/fondos_submenu/"
                r6.append(r2)
                java.lang.String r2 = r5.f9909a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f9911c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f9909a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0087 }
                r4.<init>(r6)     // Catch:{ MalformedURLException -> 0x0087 }
                java.net.URLConnection r6 = r4.openConnection()     // Catch:{ IOException -> 0x0082 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0082 }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x0082 }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0082 }
                r1 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x0082 }
                r6.connect()     // Catch:{ IOException -> 0x0082 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x0082 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x0082 }
                british.x.t_submenu_ultimas r1 = british.p015x.t_submenu_ultimas.this     // Catch:{ Exception -> 0x007d }
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x007d }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x007d }
                r4 = 100
                r6.compress(r2, r4, r1)     // Catch:{ Exception -> 0x007d }
                r1.close()     // Catch:{ Exception -> 0x007d }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x007d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)     // Catch:{ IOException -> 0x0082 }
                return r6
            L_0x0082:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x0087:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_submenu_ultimas.C2461h.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    ImageView imageView = (ImageView) t_submenu_ultimas.this.findViewById(R.id.iv_fondo);
                    t_submenu_ultimas t_submenu_ultimas = t_submenu_ultimas.this;
                    t_submenu_ultimas.f9890t.mo7514k1(imageView, Boolean.valueOf(t_submenu_ultimas.f9893w.f7931l), t_submenu_ultimas.this.f9893w.f7934m);
                    imageView.setVisibility(8);
                    C1692config config = t_submenu_ultimas.this.f9890t;
                    config.mo7493Y("fondo_" + t_submenu_ultimas.this.f9893w.f7958v, imageView);
                    C1692config.m8172V(imageView);
                } catch (Exception unused) {
                }
                SharedPreferences.Editor edit = t_submenu_ultimas.this.getSharedPreferences("sh", 0).edit();
                edit.putInt("s" + this.f9909a + "_fondo_modif", 0);
                edit.commit();
                t_submenu_ultimas.this.f9890t.f7231O1[Integer.parseInt(this.f9910b)].f7876P = false;
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r3 = r9.f9890t.f7463y5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8931a(int r10) {
        /*
            r9 = this;
            british.x.config r10 = r9.f9890t
            java.lang.String r10 = r10.f7197I3
            java.lang.String r0 = ""
            boolean r10 = r10.equals(r0)
            r1 = 0
            r2 = 1
            if (r10 != 0) goto L_0x001a
            british.x.config r10 = r9.f9890t
            int r3 = r10.f7328e4
            if (r3 == 0) goto L_0x001a
            int r10 = r10.f7334f4
            if (r10 == 0) goto L_0x001a
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            british.x.config r3 = r9.f9890t
            java.lang.String r3 = r3.f7203J3
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0033
            british.x.config r3 = r9.f9890t
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r3 = r3.f7463y5
            if (r3 == 0) goto L_0x0033
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            british.x.config r4 = r9.f9890t
            java.lang.String r4 = r4.f7215L3
            boolean r4 = r4.equals(r0)
            r4 = r4 ^ r2
            british.x.config r5 = r9.f9890t
            java.lang.String r5 = r5.f7227N3
            boolean r5 = r5.equals(r0)
            r5 = r5 ^ r2
            british.x.config r6 = r9.f9890t
            java.lang.String r6 = r6.f7239P3
            boolean r6 = r6.equals(r0)
            r6 = r6 ^ r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r10 == 0) goto L_0x005d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r7.add(r10)
        L_0x005d:
            r10 = 2
            if (r3 == 0) goto L_0x0067
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r7.add(r3)
        L_0x0067:
            r3 = 3
            if (r4 == 0) goto L_0x0071
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.add(r4)
        L_0x0071:
            r4 = 4
            if (r5 == 0) goto L_0x007b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.add(r5)
        L_0x007b:
            r5 = 5
            if (r6 == 0) goto L_0x0085
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7.add(r6)
        L_0x0085:
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x00a7
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int r8 = r7.size()
            int r8 = r8 - r2
            int r8 = r8 - r1
            int r8 = r8 + r2
            int r6 = r6.nextInt(r8)
            int r6 = r6 + r1
            java.lang.Object r6 = r7.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            if (r6 != r2) goto L_0x00b0
            r10 = 1
            r3 = 0
        L_0x00ac:
            r4 = 0
        L_0x00ad:
            r5 = 0
        L_0x00ae:
            r6 = 0
            goto L_0x00c9
        L_0x00b0:
            if (r6 != r10) goto L_0x00b5
            r10 = 0
            r3 = 1
            goto L_0x00ac
        L_0x00b5:
            if (r6 != r3) goto L_0x00bb
            r10 = 0
            r3 = 0
            r4 = 1
            goto L_0x00ad
        L_0x00bb:
            if (r6 != r4) goto L_0x00c2
            r10 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            goto L_0x00ae
        L_0x00c2:
            r10 = 0
            r3 = 0
            r4 = 0
            if (r6 != r5) goto L_0x00ad
            r5 = 0
            r6 = 1
        L_0x00c9:
            r7 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            if (r10 == 0) goto L_0x0114
            com.google.android.gms.ads.AdView r10 = new com.google.android.gms.ads.AdView
            r10.<init>(r9)
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE
            r10.setAdSize(r0)
            british.x.config r0 = r9.f9890t
            java.lang.String r0 = r0.f7197I3
            r10.setAdUnitId(r0)
            r0 = 2131362468(0x7f0a02a4, float:1.8344717E38)
            android.view.View r0 = r9.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r1)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViewAt(r2)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r10, r2)
            com.google.android.gms.ads.AdRequest$Builder r0 = new com.google.android.gms.ads.AdRequest$Builder
            r0.<init>()
            com.google.android.gms.ads.AdRequest r0 = r0.build()
            r10.loadAd(r0)
            goto L_0x01aa
        L_0x0114:
            if (r3 == 0) goto L_0x0154
            british.x.l r10 = r9.f9893w
            java.lang.String r10 = r10.f7916g
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0149
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "#"
            r10.append(r0)
            british.x.l r0 = r9.f9893w
            java.lang.String r0 = r0.f7916g
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            boolean r10 = british.p015x.C1692config.m8153I(r10)
            if (r10 == 0) goto L_0x0149
            r10 = 2131363071(0x7f0a04ff, float:1.834594E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r0 = british.p015x.C1692config.f7101A5
            r10.setTextColor(r0)
        L_0x0149:
            british.x.config r1 = r9.f9890t
            r3 = 1
            r4 = 3
            r5 = -1
            r6 = 0
            r2 = r9
            r1.mo7512k(r2, r3, r4, r5, r6)
            goto L_0x01aa
        L_0x0154:
            if (r4 == 0) goto L_0x0174
            com.facebook.ads.NativeAd r10 = new com.facebook.ads.NativeAd
            british.x.config r0 = r9.f9890t
            java.lang.String r0 = r0.f7215L3
            r10.<init>((android.content.Context) r9, (java.lang.String) r0)
            british.x.t_submenu_ultimas$d r0 = new british.x.t_submenu_ultimas$d
            r0.<init>(r10)
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r1 = r10.buildLoadAdConfig()
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r0 = r1.withAdListener(r0)
            com.facebook.ads.NativeAdBase$NativeLoadAdConfig r0 = r0.build()
            r10.loadAd(r0)
            goto L_0x01aa
        L_0x0174:
            if (r5 == 0) goto L_0x019c
            com.startapp.sdk.ads.banner.Mrec r10 = new com.startapp.sdk.ads.banner.Mrec
            r10.<init>((android.app.Activity) r9)
            java.lang.String r0 = "SUBMENU"
            r10.setAdTag(r0)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r1)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViewAt(r2)
            android.view.View r0 = r9.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r10, r2)
            goto L_0x01aa
        L_0x019c:
            if (r6 == 0) goto L_0x01a2
            r9.m8933d()
            goto L_0x01aa
        L_0x01a2:
            british.x.config r10 = r9.f9890t
            british.x.c r10 = r10.mo7474A0(r9, r1)
            r9.f9892v = r10
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_submenu_ultimas.m8931a(int):void");
    }

    /* renamed from: b */
    private void m8932b(Context context) {
        this.f6662h = new C2456e(context);
    }

    /* renamed from: d */
    private void m8933d() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f9890t.f7420s4;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        this.f9890t.f7420s4 = IronSource.createBanner(this, ISBannerSize.RECTANGLE);
        findViewById(R.id.ll_appsreco).setVisibility(8);
        ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
        ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
        ((LinearLayout) findViewById(R.id.ll_nat)).addView(this.f9890t.f7420s4, 1);
        IronSource.loadBanner(this.f9890t.f7420s4);
        this.f9882G = true;
    }

    public void abrir_secc(View view) {
        if (view.getTag(R.id.idaux2) != null) {
            this.f9890t.mo7497c(this, (String) view.getTag(R.id.idaux2));
            return;
        }
        C1845j j0 = this.f9890t.mo7510j0(view, this);
        if (view.getTag(R.id.idaux1) != null) {
            j0.f7843b = false;
        }
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
                if (j0.f7843b && this.f9890t.f7427t4 != 2) {
                    intent2.putExtra("es_root", true);
                }
                if (this.f6657c) {
                    this.f6659e = false;
                }
                startActivityForResult(j0.f7842a, 0);
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
    /* renamed from: c */
    public void mo8978c() {
        int q0 = this.f9890t.mo7522q0(this);
        int i = this.f9890t.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9876A = listView;
            this.f9890t.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9890t.f7231O1;
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
            int[] iArr = this.f9890t.f7249R1;
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
    @TargetApi(13)
    /* renamed from: e */
    public void mo8979e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Bitmap bitmap;
        float f = getResources().getDisplayMetrics().density;
        this.f9883m = (int) ((((float) this.f9883m) * f) + 0.5f);
        this.f9884n = (int) ((((float) this.f9884n) * f) + 0.5f);
        this.f9886p = 0;
        this.f9887q = 0;
        this.f9888r = 0;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        C1855l lVar = this.f9893w;
        if (lVar.f7895Y0) {
            i = R.layout.t_menugrid_row;
        } else {
            int i12 = lVar.f7889V0;
            i = i12 == 1 ? R.layout.t_menugrid_row_formato2 : i12 == 2 ? R.layout.t_menugrid_row_formato3 : R.layout.t_menugrid_row_v;
        }
        TextView textView = (TextView) layoutInflater.inflate(i, (LinearLayout) findViewById(R.id.ll_princ), false).findViewById(R.id.tv_menugrid);
        int i13 = 0;
        while (true) {
            C1855l lVar2 = null;
            if (i13 >= this.f9895y.length) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= this.f9890t.f7231O1.length) {
                    break;
                }
                if (this.f9895y[i13].equals(this.f9890t.f7231O1[i14].f7964y + "")) {
                    C1855l lVar3 = this.f9890t.f7231O1[i14];
                    int i15 = lVar3.f7954t;
                    if (i15 != 22 && ((i15 != 12 || this.f9893w.f7918g1) && (i15 != 14 || this.f9893w.f7921h1))) {
                        C1855l[] lVarArr = this.f9894x;
                        int i16 = this.f9896z;
                        lVarArr[i16] = lVar3;
                        this.f9896z = i16 + 1;
                        lVar2 = lVar3;
                    }
                } else {
                    i14++;
                }
            }
            if (lVar2 != null) {
                if (this.f9893w.f7893X0) {
                    textView.setText(lVar2.f7898a);
                    if (this.f9893w.f7906c1) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    textView.measure(0, 0);
                    this.f9888r = Math.max(this.f9888r, textView.getMeasuredWidth());
                }
                if (this.f9893w.f7891W0) {
                    boolean z = lVar2.f7871M0;
                    if (!z && (bitmap = lVar2.f7869L0) != null) {
                        this.f9886p = Math.max(this.f9886p, bitmap.getHeight());
                        this.f9887q = Math.max(this.f9887q, lVar2.f7869L0.getWidth());
                    } else if (!(!z || lVar2.f7879Q0 == 0 || (i11 = lVar2.f7881R0) == 0)) {
                        this.f9886p = Math.max(this.f9886p, i11);
                        this.f9887q = Math.max(this.f9887q, lVar2.f7879Q0);
                    }
                }
            }
            i13++;
        }
        if (this.f9896z == 0) {
            if (!this.f9893w.f7916g.equals("")) {
                if (C1692config.m8153I("#" + this.f9893w.f7916g)) {
                    ((TextView) findViewById(R.id.tv_sinseccs)).setTextColor(C1692config.f7101A5);
                }
            }
            findViewById(R.id.tv_sinseccs).setVisibility(0);
            return;
        }
        this.f9886p = (int) ((((float) this.f9886p) * f) + 0.5f);
        this.f9887q = (int) ((((float) this.f9887q) * f) + 0.5f);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i2 = point.x;
        } else {
            i2 = defaultDisplay.getWidth();
        }
        C1855l lVar4 = this.f9893w;
        boolean z2 = lVar4.f7895Y0;
        if (z2 && (i9 = this.f9886p) > (i10 = this.f9884n)) {
            this.f9887q = (this.f9887q * i10) / i9;
            this.f9886p = i10;
        } else if (!z2 && (i7 = this.f9886p) > (i8 = this.f9883m)) {
            this.f9887q = (this.f9887q * i8) / i7;
            this.f9886p = i8;
        }
        if (!z2 && lVar4.f7893X0 && (i5 = this.f9887q) > (i6 = this.f9888r)) {
            this.f9886p = (this.f9886p * i6) / i5;
            this.f9887q = i6;
        }
        this.f9880E = (GridView) findViewById(R.id.grid);
        if (this.f9893w.f7900a1) {
            ((LinearLayout) findViewById(R.id.ll_grid)).setGravity(1);
        }
        int i17 = this.f9893w.f7885T0;
        int i18 = (int) ((((float) (i17 == 1 ? 16 : i17 == 2 ? 24 : 1)) * f) + 0.5f);
        this.f9880E.setHorizontalSpacing(i18);
        this.f9880E.setVerticalSpacing(i18);
        int i19 = (int) ((10.0f * f) + 0.5f);
        this.f9880E.setPadding(i19, i19, i19, i19);
        int i20 = (int) ((f * 4.0f) + 0.5f);
        C1855l lVar5 = this.f9893w;
        int i21 = lVar5.f7883S0;
        if (lVar5.f7895Y0) {
            int i22 = this.f9887q;
            int i23 = this.f9888r;
            i3 = i22 + i23 + i18;
            if (lVar5.f7893X0) {
                i3 += i20;
            }
            m8931a(i22 + i23);
        } else {
            int i24 = lVar5.f7889V0;
            if (i24 == 1 || i24 == 2) {
                i4 = C1692config.m8149E(this, 10);
            } else {
                i4 = 0;
            }
            i3 = Math.max(this.f9887q, this.f9888r) + i18 + i4;
            m8931a(this.f9888r);
        }
        while (i21 > 1 && (i3 * i21) + (i19 * 2) > i2) {
            i21--;
        }
        this.f9880E.setNumColumns(i21);
        this.f9880E.getLayoutParams().width = ((i3 * i21) + (i19 * 2)) - i18;
        this.f9880E.setOnItemClickListener(this);
        if (!this.f9893w.f7897Z0) {
            this.f9880E.setLayoutAnimation((LayoutAnimationController) null);
        }
        C2460g gVar = new C2460g(this);
        this.f9881F = gVar;
        this.f9880E.setAdapter(gVar);
        C1855l lVar6 = this.f9893w;
        if (lVar6.f7958v > 0) {
            if (!lVar6.f7876P) {
                try {
                    ImageView imageView = (ImageView) findViewById(R.id.iv_fondo);
                    this.f9890t.mo7514k1(imageView, Boolean.valueOf(this.f9893w.f7931l), this.f9893w.f7934m);
                    this.f9890t.mo7493Y("fondo_" + this.f9893w.f7958v, imageView);
                } catch (Exception unused) {
                }
            } else {
                new C2461h().execute(new String[]{this.f9893w.f7958v + "", this.f9885o + "", this.f9893w.f7960w + ""});
            }
        } else if (this.f9890t.f7163D > 0) {
            int i25 = this.f9879D.getInt("fondo_v_act", 0);
            C1692config config = this.f9890t;
            if (i25 == config.f7163D) {
                config.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9890t.f7145A), this.f9890t.f7157C);
                this.f9890t.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        if (this.f9878C) {
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
        if (!this.f6659e || this.f9889s || !this.f9890t.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9889s = true;
        C1692config.m8199t(this);
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
        String str9 = this.f9890t.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9890t.f7281W3) == null || str.equals("")) && (((str2 = this.f9890t.f7250R2) == null || str2.equals("")) && (((str3 = this.f9890t.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9890t.f7269U3) == null || str4.equals("")) && (((str5 = this.f9890t.f7275V3) == null || str5.equals("")) && (((str6 = this.f9890t.f7358j4) == null || str6.equals("")) && (((str7 = this.f9890t.f7287X3) == null || str7.equals("")) && ((str8 = this.f9890t.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9890t.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9890t.f7251R3);
        }
        String str11 = this.f9890t.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9890t.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9890t.f7269U3);
        }
        String str13 = this.f9890t.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9890t.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f9890t = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8932b(this);
        this.f6666l = new C2452a();
        Bundle extras = getIntent().getExtras();
        this.f9891u = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9891u.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        Bundle extras2 = getIntent().getExtras();
        this.f9891u = extras2;
        int i = extras2.getInt("ind");
        this.f9885o = i;
        C1692config config2 = this.f9890t;
        this.f6656b = C1692config.m8189h(config2.f7231O1[i].f7916g, config2.f7368l1);
        if (!C1692config.m8153I("#" + this.f9890t.f7231O1[this.f9885o].f7916g)) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_menugrid);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9879D = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        mo8978c();
        this.f9890t.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2453b());
        searchManager.setOnDismissListener(new C2454c());
        if (bundle == null) {
            C1692config config3 = this.f9890t;
            Bundle bundle2 = this.f9891u;
            boolean z = bundle2 != null && bundle2.containsKey("ad_entrar");
            Bundle bundle3 = this.f9891u;
            config3.mo7503f1(this, z, bundle3 != null && bundle3.containsKey("fb_entrar"));
        }
        C1692config config4 = this.f9890t;
        config4.mo7488Q0(this, config4.f7318d, this.f6656b, bundle);
        C1855l lVar = this.f9890t.f7231O1[this.f9885o];
        this.f9893w = lVar;
        if (!lVar.f7916g.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f9893w.f7916g), Color.parseColor("#" + this.f9893w.f7919h)}));
        }
        this.f9894x = new C1855l[this.f9890t.f7231O1.length];
        this.f9895y = this.f9879D.getString("seccs_ultimas", "").split(",");
        this.f9896z = 0;
        if (C1692config.m8153I("#" + this.f9893w.f7916g)) {
            this.f9877B = (ProgressBar) findViewById(R.id.pb_inv);
        } else {
            this.f9877B = (ProgressBar) findViewById(R.id.pb);
        }
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(this.f9877B, this.f9890t.f7368l1);
        }
        mo8979e();
        if (this.f9893w.f7891W0) {
            Intent intent = new Intent(this, s_cargar_icos.class);
            intent.putExtra("ind_submenu", this.f9885o);
            startService(intent);
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9890t.f7384n3 == 0 || (cVar3 = this.f9892v) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9890t.f7384n3 == 0 || (cVar2 = this.f9892v) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9890t.f7384n3 == 0 || (cVar = this.f9892v) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
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
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C1855l[] lVarArr = this.f9890t.f7231O1;
            if (i3 >= lVarArr.length) {
                break;
            } else if (this.f9894x[i].f7964y == lVarArr[i3].f7964y) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        view.setId(i2);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i2));
        view.setTag(R.id.idaux1, 1);
        C1855l lVar = this.f9893w;
        if (lVar.f7862I) {
            C1855l[] lVarArr2 = this.f9894x;
            if (lVarArr2[i].f7954t == 1) {
                this.f9890t.mo7491W(lVarArr2[i].f7910e, "", "", this);
                return;
            }
        }
        if (lVar.f7962x == 1) {
            C1855l[] lVarArr3 = this.f9894x;
            if (lVarArr3[i].f7954t == 1 && !lVarArr3[i].f7910e.contains("forum.e-droid.net") && !this.f9894x[i].f7910e.contains("quiz.e-droid.net") && !this.f9894x[i].f7910e.contains("games.e-droid.net") && !this.f9894x[i].f7910e.contains("pixworld.io-desdeac")) {
                view.setTag(R.id.idaux2, this.f9894x[i].f7910e);
            }
        }
        onClick(view);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9890t.f7384n3 == 0 || (cVar = this.f9892v) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2459f());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9882G) {
            m8933d();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_nat);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).findViewById(R.id.ad_pb) != null) {
                viewGroup.getChildAt(i).findViewById(R.id.ad_pb).setVisibility(8);
            }
        }
        if (!(this.f9890t.f7384n3 == 0 || (cVar = this.f9892v) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        this.f9889s = false;
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9878C = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9878C) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9878C = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            if (this.f9893w.f7958v == 0) {
                try {
                    this.f9890t.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9890t.f7145A), this.f9890t.f7157C);
                    ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                    this.f9890t.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                    C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        } else if (this.f9881F != null && str.equals("ico_cargado")) {
            this.f9881F.notifyDataSetChanged();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9878C = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9878C = true;
        C1692config.m8175Y0(this);
    }
}
