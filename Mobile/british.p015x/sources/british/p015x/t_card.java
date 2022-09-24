package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
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
import com.facebook.ads.C3371Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: british.x.t_card */
public class t_card extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    int f9039A;

    /* renamed from: B */
    int f9040B;

    /* renamed from: C */
    String f9041C;

    /* renamed from: D */
    String f9042D;

    /* renamed from: E */
    ArrayList<C2221q> f9043E;

    /* renamed from: F */
    ArrayList<C2222r> f9044F;

    /* renamed from: G */
    ArrayList<C2220p> f9045G;

    /* renamed from: H */
    C2223s f9046H;

    /* renamed from: I */
    C2224t f9047I;

    /* renamed from: J */
    C2225u f9048J;

    /* renamed from: K */
    C1603c f9049K;

    /* renamed from: L */
    boolean f9050L = false;

    /* renamed from: M */
    ProgressBar f9051M;

    /* renamed from: N */
    Bundle f9052N;

    /* renamed from: O */
    ListView f9053O;

    /* renamed from: P */
    SharedPreferences f9054P;

    /* renamed from: m */
    long f9055m;

    /* renamed from: n */
    int f9056n;

    /* renamed from: o */
    int f9057o = -1;

    /* renamed from: p */
    int f9058p;

    /* renamed from: q */
    C1692config f9059q;

    /* renamed from: r */
    boolean f9060r = false;

    /* renamed from: s */
    boolean f9061s;

    /* renamed from: t */
    boolean f9062t;

    /* renamed from: u */
    boolean f9063u = false;

    /* renamed from: v */
    int f9064v;

    /* renamed from: w */
    int f9065w;

    /* renamed from: x */
    int f9066x;

    /* renamed from: y */
    int f9067y;

    /* renamed from: z */
    int f9068z;

    /* renamed from: british.x.t_card$a */
    class C2203a implements NativeAdListener {
        C2203a() {
        }

        public void onAdClicked(C3371Ad ad) {
        }

        public void onAdLoaded(C3371Ad ad) {
            NativeAdViewAttributes backgroundColor = new NativeAdViewAttributes().setTypeface(Typeface.MONOSPACE).setBackgroundColor(C1692config.f7104D5);
            String str = t_card.this.f9042D;
            int i = 0;
            if (str != null && !str.equals("")) {
                int o = C1692config.m8194o(Color.parseColor("#" + t_card.this.f9042D), 0.2f, 0);
                backgroundColor.setBackgroundColor(o);
                if (C1692config.m8155J(o)) {
                    backgroundColor.setTitleTextColor(-16777216);
                    backgroundColor.setDescriptionTextColor(-16777216);
                } else {
                    backgroundColor.setTitleTextColor(-1);
                    backgroundColor.setDescriptionTextColor(-1);
                }
            }
            NativeAd nativeAd = (NativeAd) ad;
            View render = NativeAdView.render(t_card.this, nativeAd, NativeAdView.Type.HEIGHT_300, backgroundColor);
            Iterator<C2220p> it = t_card.this.f9045G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2220p next = it.next();
                if (next.f9088b.equals(nativeAd)) {
                    i = next.f9087a;
                    break;
                }
            }
            if (i != 0) {
                View findViewById = t_card.this.findViewById(R.id.llcards);
                LinearLayout linearLayout = (LinearLayout) findViewById.findViewWithTag(TtmlNode.ATTR_ID + i);
                try {
                    if (t_card.this.f9062t) {
                        linearLayout.setBackgroundColor(-16777216);
                    } else {
                        linearLayout.setBackgroundColor(-1);
                    }
                    int E = C1692config.m8149E(t_card.this.getApplicationContext(), 1);
                    linearLayout.setPadding(E, E, E, E);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                linearLayout.addView(render);
            }
        }

        public void onError(C3371Ad ad, AdError adError) {
        }

        public void onLoggingImpression(C3371Ad ad) {
        }

        public void onMediaDownloaded(C3371Ad ad) {
        }
    }

    /* renamed from: british.x.t_card$b */
    class C2204b implements View.OnClickListener {
        C2204b() {
        }

        public void onClick(View view) {
            View view2 = new View(t_card.this);
            C1692config config = t_card.this.f9059q;
            int indexOf = C1692config.f7114N5.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
            view2.setId(indexOf);
            view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
            String str = t_card.this.f9059q.f7251R3;
            if (str != null && !str.equals("")) {
                t_card t_card = t_card.this;
                t_card t_card2 = t_card.this;
                t_card.f6663i = new RewardedVideo((Context) t_card2, t_card2.f9059q.f7251R3);
            }
            String str2 = t_card.this.f9059q.f7245Q3;
            if (str2 != null) {
                str2.equals("");
            }
            String str3 = t_card.this.f9059q.f7269U3;
            if (str3 != null && !str3.equals("")) {
                t_card t_card3 = t_card.this;
                t_card3.f6664j = new RewardedVideoAd(t_card3, t_card3.f9059q.f7269U3);
            }
            String str4 = t_card.this.f9059q.f7275V3;
            if (str4 != null && !str4.equals("")) {
                t_card t_card4 = t_card.this;
                t_card4.f6665k = new StartAppAd(t_card4);
            }
            t_card.this.f6661g = new ProgressDialog(t_card.this);
            t_card t_card5 = t_card.this;
            t_card5.f6660f = null;
            t_card5.f9057o = indexOf;
            if (!t_card5.f9059q.mo7494Z0(t_card5, view2, t_card5.f6656b, t_card5.f6661g, t_card5.f6662h, t_card5.f6663i, t_card5.f6664j, t_card5.f6665k, t_card5.f6666l, (View) null)) {
                t_card t_card6 = t_card.this;
                t_card6.f9059q.mo7499d(t_card6, indexOf);
            }
        }
    }

    /* renamed from: british.x.t_card$c */
    class C2205c implements View.OnClickListener {
        C2205c() {
        }

        public void onClick(View view) {
            String str = (String) view.getTag(R.id.idaux1);
            str.toLowerCase();
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0(str, t_card);
            Intent intent = k0.f7842a;
            if (!(intent == null || intent.getAction() == null || !k0.f7842a.getAction().equals("android.intent.action.VIEW"))) {
                Intent intent2 = new Intent(t_card.this, t_url.class);
                intent2.putExtra("url", str);
                k0.f7842a = intent2;
            }
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent3 = new Intent();
                intent3.putExtra("finalizar", true);
                intent3.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent3);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent4 = k0.f7842a;
                if (intent4 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent4.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent4, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$d */
    class C2206d implements View.OnClickListener {
        C2206d() {
        }

        public void onClick(View view) {
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0((String) view.getTag(R.id.idaux1), t_card);
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent2 = k0.f7842a;
                if (intent2 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent2.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent2, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$e */
    class C2207e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9073a;

        /* renamed from: british.x.t_card$e$a */
        class C2208a extends FullScreenContentCallback {
            C2208a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_card t_card = t_card.this;
                if (t_card.f9050L) {
                    t_card.abrir_secc(t_card.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                t_card t_card = t_card.this;
                t_card.abrir_secc(t_card.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_card$e$b */
        class C2209b implements OnUserEarnedRewardListener {
            C2209b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2207e eVar = C2207e.this;
                t_card.this.f9050L = true;
                C1692config.m8175Y0(eVar.f9073a);
            }
        }

        C2207e(Context context) {
            this.f9073a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_card.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2208a());
            rewardedAd.show((Activity) this.f9073a, new C2209b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_card t_card = t_card.this;
            if (!t_card.f9059q.mo7502f(this.f9073a, t_card.f6663i)) {
                t_card.this.f6661g.cancel();
                t_card t_card2 = t_card.this;
                t_card2.abrir_secc(t_card2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_card$f */
    class C2210f implements AdDisplayListener {
        C2210f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_card t_card = t_card.this;
            if (t_card.f9050L) {
                t_card.abrir_secc(t_card.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_card$g */
    class C2211g extends AdColonyInterstitialListener {
        C2211g() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_card t_card = t_card.this;
            if (t_card.f9050L) {
                t_card.abrir_secc(t_card.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_card.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_card.this.f6661g.cancel();
            t_card t_card = t_card.this;
            t_card.abrir_secc(t_card.f6660f);
        }
    }

    /* renamed from: british.x.t_card$h */
    class C2212h implements SearchManager.OnCancelListener {
        C2212h() {
        }

        public void onCancel() {
            t_card t_card = t_card.this;
            t_card.f6657c = false;
            t_card.setResult(0);
        }
    }

    /* renamed from: british.x.t_card$i */
    class C2213i implements SearchManager.OnDismissListener {
        C2213i() {
        }

        public void onDismiss() {
            t_card.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_card$j */
    class C2214j implements View.OnClickListener {
        C2214j() {
        }

        public void onClick(View view) {
            View view2 = new View(t_card.this);
            C1692config config = t_card.this.f9059q;
            int indexOf = C1692config.f7114N5.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
            view2.setId(indexOf);
            view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
            String str = t_card.this.f9059q.f7251R3;
            if (str != null && !str.equals("")) {
                t_card t_card = t_card.this;
                t_card t_card2 = t_card.this;
                t_card.f6663i = new RewardedVideo((Context) t_card2, t_card2.f9059q.f7251R3);
            }
            String str2 = t_card.this.f9059q.f7245Q3;
            if (str2 != null) {
                str2.equals("");
            }
            String str3 = t_card.this.f9059q.f7269U3;
            if (str3 != null && !str3.equals("")) {
                t_card t_card3 = t_card.this;
                t_card3.f6664j = new RewardedVideoAd(t_card3, t_card3.f9059q.f7269U3);
            }
            String str4 = t_card.this.f9059q.f7275V3;
            if (str4 != null && !str4.equals("")) {
                t_card t_card4 = t_card.this;
                t_card4.f6665k = new StartAppAd(t_card4);
            }
            t_card.this.f6661g = new ProgressDialog(t_card.this);
            t_card t_card5 = t_card.this;
            t_card5.f6660f = null;
            t_card5.f9057o = indexOf;
            if (!t_card5.f9059q.mo7494Z0(t_card5, view2, t_card5.f6656b, t_card5.f6661g, t_card5.f6662h, t_card5.f6663i, t_card5.f6664j, t_card5.f6665k, t_card5.f6666l, (View) null)) {
                t_card t_card6 = t_card.this;
                t_card6.f9059q.mo7499d(t_card6, indexOf);
            }
        }
    }

    /* renamed from: british.x.t_card$k */
    class C2215k implements View.OnClickListener {
        C2215k() {
        }

        public void onClick(View view) {
            String str = (String) view.getTag(R.id.idaux1);
            str.toLowerCase();
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0(str, t_card);
            Intent intent = k0.f7842a;
            if (!(intent == null || intent.getAction() == null || !k0.f7842a.getAction().equals("android.intent.action.VIEW"))) {
                Intent intent2 = new Intent(t_card.this, t_url.class);
                intent2.putExtra("url", str);
                k0.f7842a = intent2;
            }
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent3 = new Intent();
                intent3.putExtra("finalizar", true);
                intent3.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent3);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent4 = k0.f7842a;
                if (intent4 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent4.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent4, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$l */
    class C2216l implements View.OnClickListener {
        C2216l() {
        }

        public void onClick(View view) {
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0((String) view.getTag(R.id.idaux1), t_card);
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent2 = k0.f7842a;
                if (intent2 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent2.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent2, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$m */
    class C2217m implements View.OnClickListener {
        C2217m() {
        }

        public void onClick(View view) {
            View view2 = new View(t_card.this);
            C1692config config = t_card.this.f9059q;
            int indexOf = C1692config.f7114N5.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
            view2.setId(indexOf);
            view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
            String str = t_card.this.f9059q.f7251R3;
            if (str != null && !str.equals("")) {
                t_card t_card = t_card.this;
                t_card t_card2 = t_card.this;
                t_card.f6663i = new RewardedVideo((Context) t_card2, t_card2.f9059q.f7251R3);
            }
            String str2 = t_card.this.f9059q.f7245Q3;
            if (str2 != null) {
                str2.equals("");
            }
            String str3 = t_card.this.f9059q.f7269U3;
            if (str3 != null && !str3.equals("")) {
                t_card t_card3 = t_card.this;
                t_card3.f6664j = new RewardedVideoAd(t_card3, t_card3.f9059q.f7269U3);
            }
            String str4 = t_card.this.f9059q.f7275V3;
            if (str4 != null && !str4.equals("")) {
                t_card t_card4 = t_card.this;
                t_card4.f6665k = new StartAppAd(t_card4);
            }
            t_card.this.f6661g = new ProgressDialog(t_card.this);
            t_card t_card5 = t_card.this;
            t_card5.f6660f = null;
            t_card5.f9057o = indexOf;
            if (!t_card5.f9059q.mo7494Z0(t_card5, view2, t_card5.f6656b, t_card5.f6661g, t_card5.f6662h, t_card5.f6663i, t_card5.f6664j, t_card5.f6665k, t_card5.f6666l, (View) null)) {
                t_card t_card6 = t_card.this;
                t_card6.f9059q.mo7499d(t_card6, indexOf);
            }
        }
    }

    /* renamed from: british.x.t_card$n */
    class C2218n implements View.OnClickListener {
        C2218n() {
        }

        public void onClick(View view) {
            String str = (String) view.getTag(R.id.idaux1);
            str.toLowerCase();
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0(str, t_card);
            Intent intent = k0.f7842a;
            if (!(intent == null || intent.getAction() == null || !k0.f7842a.getAction().equals("android.intent.action.VIEW"))) {
                Intent intent2 = new Intent(t_card.this, t_url.class);
                intent2.putExtra("url", str);
                k0.f7842a = intent2;
            }
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent3 = new Intent();
                intent3.putExtra("finalizar", true);
                intent3.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent3);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent4 = k0.f7842a;
                if (intent4 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent4.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent4, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$o */
    class C2219o implements View.OnClickListener {
        C2219o() {
        }

        public void onClick(View view) {
            t_card t_card = t_card.this;
            C1845j k0 = t_card.f9059q.mo7513k0((String) view.getTag(R.id.idaux1), t_card);
            if (k0.f7843b) {
                t_card.this.f6657c = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", k0.f7844c);
                t_card.this.setResult(-1, intent);
            }
            if (k0.f7845d) {
                t_card.this.startActivityForResult(k0.f7842a, 0);
            } else {
                Intent intent2 = k0.f7842a;
                if (intent2 != null) {
                    if (k0.f7843b) {
                        t_card t_card2 = t_card.this;
                        t_card2.f6659e = false;
                        if (t_card2.f9059q.f7427t4 != 2) {
                            intent2.putExtra("es_root", true);
                        }
                        try {
                            t_card.this.startActivity(k0.f7842a);
                        } catch (Exception unused) {
                        }
                    } else {
                        t_card.this.startActivityForResult(intent2, 0);
                    }
                }
            }
            t_card t_card3 = t_card.this;
            if (t_card3.f6657c && !t_card3.f6658d) {
                t_card3.finish();
            }
        }
    }

    /* renamed from: british.x.t_card$p */
    private class C2220p {

        /* renamed from: a */
        int f9087a;

        /* renamed from: b */
        NativeAd f9088b;

        private C2220p() {
        }
    }

    /* renamed from: british.x.t_card$q */
    private class C2221q {

        /* renamed from: a */
        int f9090a;

        /* renamed from: b */
        boolean f9091b;

        /* renamed from: c */
        boolean f9092c;

        /* renamed from: d */
        boolean f9093d;

        /* renamed from: e */
        String f9094e;

        /* renamed from: f */
        String f9095f;

        /* renamed from: g */
        String f9096g;

        private C2221q() {
            this.f9091b = false;
            this.f9092c = false;
            this.f9093d = false;
        }
    }

    /* renamed from: british.x.t_card$r */
    private class C2222r {

        /* renamed from: a */
        int f9098a;

        /* renamed from: b */
        int f9099b;

        /* renamed from: c */
        boolean f9100c;

        /* renamed from: d */
        String f9101d;

        private C2222r() {
            this.f9100c = false;
        }
    }

    /* renamed from: british.x.t_card$s */
    private class C2223s extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9103a;

        C2223s(int i) {
            this.f9103a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e }
                r0.<init>()     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "/srv/obtener_cards.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                british.x.t_card r1 = british.p015x.t_card.this     // Catch:{ Exception -> 0x008e }
                long r1 = r1.f9055m     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "&ind_ini="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                int r1 = r5.f9103a     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "&idsec="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                british.x.t_card r1 = british.p015x.t_card.this     // Catch:{ Exception -> 0x008e }
                int r1 = r1.f9058p     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008e }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x008e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x008e }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x008e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x008e }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r6.<init>()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            L_0x0062:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                if (r2 == 0) goto L_0x007d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r3.<init>()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r3.append(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r6.append(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                goto L_0x0062
            L_0x007d:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r0.disconnect()
                return r6
            L_0x0085:
                r6 = move-exception
                goto L_0x0096
            L_0x0087:
                r6 = r0
                goto L_0x008e
            L_0x0089:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0096
            L_0x008e:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0095
                r6.disconnect()
            L_0x0095:
                return r0
            L_0x0096:
                if (r0 == 0) goto L_0x009b
                r0.disconnect()
            L_0x009b:
                goto L_0x009d
            L_0x009c:
                throw r6
            L_0x009d:
                goto L_0x009c
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_card.C2223s.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                t_card.this.f9051M.setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                SharedPreferences.Editor edit = t_card.this.f9054P.edit();
                edit.putString("cards_" + t_card.this.f9058p, str.substring(str.indexOf("DATOS:") + 6).trim());
                t_card t_card = t_card.this;
                edit.putInt("s" + t_card.this.f9058p + "_v_guardado", t_card.f9059q.f7231O1[t_card.f9056n].f7846A);
                edit.commit();
            }
            t_card.this.m8687e();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_card.this.f9051M.setVisibility(0);
        }
    }

    /* renamed from: british.x.t_card$t */
    private class C2224t extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9105a;

        /* renamed from: b */
        String f9106b;

        /* renamed from: c */
        String f9107c;

        /* renamed from: d */
        Bitmap f9108d;

        /* renamed from: e */
        int f9109e;

        /* renamed from: f */
        int f9110f;

        private C2224t() {
            this.f9109e = -1;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                int r0 = r4.f9109e
                r1 = -1
                if (r0 != r1) goto L_0x000a
                java.lang.String r5 = "-1"
                return r5
            L_0x000a:
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/cards/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9105a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9106b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x008b }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r0.connect()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ MalformedURLException -> 0x008b }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r4.f9108d = r2     // Catch:{ MalformedURLException -> 0x008b }
                r1.close()     // Catch:{ MalformedURLException -> 0x008b }
                r0.disconnect()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.File r0 = new java.io.File     // Catch:{ MalformedURLException -> 0x008b }
                british.x.t_card r1 = british.p015x.t_card.this     // Catch:{ MalformedURLException -> 0x008b }
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.File r1 = r1.getFilesDir()     // Catch:{ MalformedURLException -> 0x008b }
                java.lang.String r2 = r4.f9105a     // Catch:{ MalformedURLException -> 0x008b }
                r0.<init>(r1, r2)     // Catch:{ MalformedURLException -> 0x008b }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f9108d     // Catch:{  }
                boolean r0 = r0.hasAlpha()     // Catch:{  }
                if (r0 == 0) goto L_0x0080
                android.graphics.Bitmap r0 = r4.f9108d     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch:{  }
                goto L_0x0089
            L_0x0080:
                android.graphics.Bitmap r0 = r4.f9108d     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
            L_0x0089:
                java.lang.String r5 = "1"
            L_0x008b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_card.C2224t.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            if (this.f9109e != -1) {
                t_card t_card = t_card.this;
                if (t_card.f9043E != null) {
                    View findViewById = t_card.findViewById(R.id.llcards);
                    CardView cardView = (CardView) findViewById.findViewWithTag(TtmlNode.ATTR_ID + t_card.this.f9043E.get(this.f9109e).f9090a);
                    int i = this.f9110f;
                    if (i == 1) {
                        cardView.findViewById(R.id.pb_main).setVisibility(8);
                        cardView.findViewById(R.id.pb_main_inv).setVisibility(8);
                    } else if (i == 2) {
                        cardView.findViewById(R.id.pb_logo).setVisibility(8);
                        cardView.findViewById(R.id.pb_logo_inv).setVisibility(8);
                    } else if (i == 3) {
                        cardView.findViewById(R.id.pb_btn).setVisibility(8);
                        cardView.findViewById(R.id.pb_btn_inv).setVisibility(8);
                    }
                    if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        SharedPreferences.Editor edit = t_card.this.f9054P.edit();
                        edit.putInt("c2261075_" + t_card.this.f9043E.get(this.f9109e).f9090a + "_" + this.f9107c + "_v", Integer.parseInt(this.f9106b));
                        edit.commit();
                        Bitmap bitmap = null;
                        try {
                            bitmap = MediaStore.Images.Media.getBitmap(t_card.this.getContentResolver(), Uri.fromFile(new File(t_card.this.getApplicationContext().getFilesDir(), this.f9105a)));
                            z = true;
                        } catch (Exception | OutOfMemoryError unused) {
                            z = false;
                        }
                        if (z) {
                            int i2 = this.f9110f;
                            if (i2 == 1) {
                                ((ImageView) cardView.findViewById(R.id.img)).setVisibility(4);
                                ((ImageView) cardView.findViewById(R.id.img)).setImageBitmap(bitmap);
                                C1692config.m8172V((ImageView) cardView.findViewById(R.id.img));
                            } else if (i2 == 2) {
                                ((ImageView) cardView.findViewById(R.id.iv_cab_card)).setVisibility(4);
                                ((ImageView) cardView.findViewById(R.id.iv_cab_card)).setImageBitmap(bitmap);
                                C1692config.m8172V((ImageView) cardView.findViewById(R.id.iv_cab_card));
                            } else if (i2 == 3) {
                                ((ImageView) cardView.findViewById(R.id.iv_btn)).setVisibility(4);
                                ((ImageView) cardView.findViewById(R.id.iv_btn)).setImageBitmap(bitmap);
                                C1692config.m8172V((ImageView) cardView.findViewById(R.id.iv_btn));
                            }
                        }
                    }
                    new C2224t().execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_card t_card = t_card.this;
            if (t_card.f9043E != null && t_card.f9059q.f7313c1 != null) {
                int i = 0;
                while (i < t_card.this.f9043E.size()) {
                    C2221q qVar = t_card.this.f9043E.get(i);
                    if (qVar.f9091b) {
                        this.f9109e = i;
                        this.f9110f = 1;
                        this.f9107c = "main";
                        this.f9105a = "c2261075_" + qVar.f9090a + "_main.png";
                        this.f9106b = qVar.f9094e;
                        qVar.f9091b = false;
                        return;
                    } else if (qVar.f9092c) {
                        this.f9109e = i;
                        this.f9110f = 2;
                        this.f9107c = "logo";
                        this.f9105a = "c2261075_" + qVar.f9090a + "_logo.png";
                        this.f9106b = qVar.f9095f;
                        qVar.f9092c = false;
                        return;
                    } else if (qVar.f9093d) {
                        this.f9109e = i;
                        this.f9110f = 3;
                        this.f9107c = "btn";
                        this.f9105a = "c2261075_" + qVar.f9090a + "_btn.png";
                        this.f9106b = qVar.f9096g;
                        qVar.f9093d = false;
                        return;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: british.x.t_card$u */
    private class C2225u extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9112a;

        /* renamed from: b */
        String f9113b;

        /* renamed from: c */
        Bitmap f9114c;

        /* renamed from: d */
        int f9115d;

        private C2225u() {
            this.f9115d = -1;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                int r0 = r4.f9115d
                r1 = -1
                if (r0 != r1) goto L_0x000a
                java.lang.String r5 = "-1"
                return r5
            L_0x000a:
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/cards/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9112a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9113b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x008b }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r0.connect()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ MalformedURLException -> 0x008b }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x008b }
                r4.f9114c = r2     // Catch:{ MalformedURLException -> 0x008b }
                r1.close()     // Catch:{ MalformedURLException -> 0x008b }
                r0.disconnect()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.File r0 = new java.io.File     // Catch:{ MalformedURLException -> 0x008b }
                british.x.t_card r1 = british.p015x.t_card.this     // Catch:{ MalformedURLException -> 0x008b }
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{ MalformedURLException -> 0x008b }
                java.io.File r1 = r1.getFilesDir()     // Catch:{ MalformedURLException -> 0x008b }
                java.lang.String r2 = r4.f9112a     // Catch:{ MalformedURLException -> 0x008b }
                r0.<init>(r1, r2)     // Catch:{ MalformedURLException -> 0x008b }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f9114c     // Catch:{  }
                boolean r0 = r0.hasAlpha()     // Catch:{  }
                if (r0 == 0) goto L_0x0080
                android.graphics.Bitmap r0 = r4.f9114c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch:{  }
                goto L_0x0089
            L_0x0080:
                android.graphics.Bitmap r0 = r4.f9114c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
            L_0x0089:
                java.lang.String r5 = "1"
            L_0x008b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_card.C2225u.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f9115d != -1) {
                t_card t_card = t_card.this;
                if (t_card.f9044F != null) {
                    View findViewById = t_card.findViewById(R.id.llcards);
                    CardView cardView = (CardView) ((CardView) findViewById.findViewWithTag(TtmlNode.ATTR_ID + t_card.this.f9044F.get(this.f9115d).f9099b)).findViewWithTag("idopc" + t_card.this.f9044F.get(this.f9115d).f9098a);
                    cardView.findViewById(R.id.pb_card_opc).setVisibility(8);
                    cardView.findViewById(R.id.pb_card_opc_inv).setVisibility(8);
                    if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        SharedPreferences.Editor edit = t_card.this.f9054P.edit();
                        edit.putInt("o2261075_" + t_card.this.f9044F.get(this.f9115d).f9098a + "_v", Integer.parseInt(this.f9113b));
                        edit.commit();
                        boolean z = true;
                        Bitmap bitmap = null;
                        try {
                            bitmap = MediaStore.Images.Media.getBitmap(t_card.this.getContentResolver(), Uri.fromFile(new File(t_card.this.getApplicationContext().getFilesDir(), this.f9112a)));
                        } catch (Exception | OutOfMemoryError unused) {
                            z = false;
                        }
                        if (z) {
                            ((ImageView) cardView.findViewById(R.id.iv_card_opc)).setVisibility(4);
                            ((ImageView) cardView.findViewById(R.id.iv_card_opc)).setImageBitmap(bitmap);
                            C1692config.m8172V((ImageView) cardView.findViewById(R.id.iv_card_opc));
                        }
                    }
                    new C2225u().execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_card.this.f9044F != null) {
                for (int i = 0; i < t_card.this.f9044F.size(); i++) {
                    C2222r rVar = t_card.this.f9044F.get(i);
                    if (rVar.f9100c) {
                        this.f9115d = i;
                        this.f9112a = "o2261075_" + rVar.f9098a + ".png";
                        this.f9113b = rVar.f9101d;
                        rVar.f9100c = false;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private CardView m8685b(String str, int i, boolean z) {
        CharSequence charSequence;
        CharSequence charSequence2;
        ProgressBar progressBar;
        C2222r rVar = new C2222r();
        String[] split = str.split(",");
        CardView cardView = (CardView) ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.t_card_opc, (ViewGroup) null);
        if (!z) {
            cardView.setCardBackgroundColor(0);
            cardView.setCardElevation(0.0f);
        }
        String str2 = split[0];
        rVar.f9098a = Integer.parseInt(str2);
        rVar.f9099b = i;
        cardView.setTag("idopc" + str2);
        if (!split[11].equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            cardView.setTag(R.id.idaux1, split[11]);
            cardView.setOnClickListener(new C2204b());
        } else if (!split[12].trim().equals("")) {
            cardView.setTag(R.id.idaux1, split[12].trim().replace("@X@", ",").replace("@Y@", ";"));
            if (split[13].equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                cardView.setOnClickListener(new C2205c());
            } else {
                cardView.setOnClickListener(new C2206d());
            }
        }
        if (!split[2].equals("")) {
            cardView.setCardBackgroundColor(Color.parseColor("#" + split[2]));
        }
        if (split[3].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            FrameLayout frameLayout = (FrameLayout) cardView.findViewById(R.id.fl_card_opc);
            ImageView imageView = (ImageView) cardView.findViewById(R.id.iv_card_opc);
            if (!split[5].trim().equals("") || !split[8].trim().equals("")) {
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (split[1].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    layoutParams.gravity = 17;
                }
                frameLayout.setLayoutParams(layoutParams);
            }
            frameLayout.setVisibility(0);
            int parseInt = Integer.parseInt(split[4]);
            SharedPreferences sharedPreferences = this.f9054P;
            StringBuilder sb = new StringBuilder();
            sb.append("o2261075_");
            charSequence = ";";
            sb.append(rVar.f9098a);
            sb.append("_v");
            if (parseInt > sharedPreferences.getInt(sb.toString(), -1)) {
                rVar.f9100c = true;
                rVar.f9101d = split[4];
                if (this.f9061s) {
                    progressBar = (ProgressBar) cardView.findViewById(R.id.pb_card_opc_inv);
                } else {
                    progressBar = (ProgressBar) cardView.findViewById(R.id.pb_card_opc);
                }
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0(progressBar, this.f9059q.f7368l1);
                }
                progressBar.setVisibility(0);
            } else {
                File filesDir = getApplicationContext().getFilesDir();
                File file = new File(filesDir, "o2261075_" + rVar.f9098a + ".png");
                if (file.exists()) {
                    try {
                        imageView.setImageBitmap(MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    } catch (OutOfMemoryError unused) {
                    }
                }
            }
        } else {
            charSequence = ";";
        }
        if (!split[5].trim().equals("")) {
            TextView textView = (TextView) cardView.findViewById(R.id.tv_card_tit);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (split[1].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                textView.setGravity(1);
            } else if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView.setTextDirection(4);
            }
            textView.setTextSize(Float.parseFloat(split[7]));
            textView.setTextColor(Color.parseColor("#" + split[6]));
            charSequence2 = charSequence;
            textView.setText(split[5].trim().replace("@X@", ",").replace("@Y@", charSequence2));
            textView.setVisibility(0);
            cardView.findViewById(R.id.ll_opc_txt).setVisibility(0);
        } else {
            charSequence2 = charSequence;
        }
        if (!split[8].trim().equals("")) {
            TextView textView2 = (TextView) cardView.findViewById(R.id.tv_card_subtit);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (split[1].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                textView2.setGravity(1);
            } else if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView2.setTextDirection(4);
            }
            textView2.setTextSize(Float.parseFloat(split[10]));
            textView2.setTextColor(Color.parseColor("#" + split[9]));
            textView2.setText(split[8].trim().replace("@X@", ",").replace("@Y@", charSequence2));
            textView2.setVisibility(0);
            cardView.findViewById(R.id.ll_opc_txt).setVisibility(0);
        }
        this.f9044F.add(rVar);
        return cardView;
    }

    /* renamed from: c */
    private void m8686c(Context context) {
        this.f6662h = new C2207e(context);
    }

    /* access modifiers changed from: private */
    @TargetApi(17)
    /* renamed from: e */
    public void m8687e() {
        String[] strArr;
        t_card t_card;
        String str;
        LinearLayout linearLayout;
        LayoutInflater layoutInflater;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3;
        int i4;
        C2220p pVar;
        int i5;
        ArrayList<com.appnext.nativeads.NativeAd> arrayList;
        String str7;
        String str8;
        int i6;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        t_card t_card2;
        LayoutInflater layoutInflater2;
        C2221q qVar;
        C2221q qVar2;
        int parseInt;
        LinearLayout linearLayout2;
        String str14;
        HorizontalScrollView horizontalScrollView;
        int i7;
        String str15;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        String str16;
        ProgressBar progressBar;
        ProgressBar progressBar2;
        int i8;
        LayoutInflater layoutInflater3;
        ProgressBar progressBar3;
        t_card t_card3 = this;
        String str17 = "";
        String string = t_card3.f9054P.getString("cards_" + t_card3.f9058p, str17);
        if (!string.equals(str17)) {
            String str18 = ";";
            String[] split = string.split(str18);
            t_card3.f9043E = new ArrayList<>();
            t_card3.f9044F = new ArrayList<>();
            t_card3.f9045G = new ArrayList<>();
            LinearLayout linearLayout6 = (LinearLayout) t_card3.findViewById(R.id.llcards);
            LayoutInflater layoutInflater4 = (LayoutInflater) t_card3.getSystemService("layout_inflater");
            int i9 = 0;
            int i10 = -1;
            while (!split[i9].equals(str17) && !split[i9].equals("S") && !split[i9].equals("N")) {
                String str19 = ",";
                String[] split2 = split[i9].split(str19);
                String str20 = split2[1];
                String str21 = SessionDescription.SUPPORTED_SDP_VERSION;
                String str22 = "@Y@";
                String str23 = "@X@";
                if (str20.equals(str21)) {
                    C2221q qVar3 = new C2221q();
                    qVar3.f9090a = Integer.parseInt(split2[0]);
                    CardView cardView = new CardView(t_card3);
                    int i11 = i9;
                    int i12 = i10;
                    LinearLayout linearLayout7 = linearLayout6;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    int i13 = t_card3.f9066x;
                    layoutParams.setMargins(0, i13, 0, i13);
                    cardView.setLayoutParams(layoutParams);
                    LinearLayout linearLayout8 = new LinearLayout(t_card3);
                    String str24 = TtmlNode.ATTR_ID;
                    linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout8.setOrientation(1);
                    String str25 = "#";
                    if (!split2[44].equals(str17)) {
                        try {
                            cardView.setCardBackgroundColor(Color.parseColor(str25 + split2[44]));
                        } catch (Exception unused) {
                        }
                    }
                    if (split2[2].equals(str21)) {
                        cardView.setCardBackgroundColor(0);
                        cardView.setCardElevation(0.0f);
                    } else {
                        cardView.setUseCompatPadding(true);
                        cardView.setCardElevation((float) t_card3.f9064v);
                    }
                    if (!split2[3].equals(str21)) {
                        cardView.setTag(R.id.idaux1, split2[3]);
                        cardView.setOnClickListener(new C2214j());
                    } else if (!split2[4].equals(str17)) {
                        cardView.setTag(R.id.idaux1, split2[4].replace(str23, str19).replace(str22, str18));
                        if (split2[46].equals(str21)) {
                            cardView.setOnClickListener(new C2215k());
                        } else {
                            cardView.setOnClickListener(new C2216l());
                        }
                    }
                    CardView cardView2 = cardView;
                    int i14 = 5;
                    int i15 = 1;
                    while (i15 < i14) {
                        boolean equals = split2[i14].equals(str17 + i15);
                        String[] strArr2 = split;
                        String str26 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        if (!equals || !split2[43].equals(str26)) {
                            String str27 = str21;
                            LayoutInflater layoutInflater5 = layoutInflater4;
                            String str28 = split2[6];
                            StringBuilder sb = new StringBuilder();
                            sb.append(str17);
                            int i16 = i15;
                            sb.append(i16);
                            if (str28.equals(sb.toString())) {
                                RelativeLayout relativeLayout = (RelativeLayout) layoutInflater5.inflate(R.layout.t_card_cab, (ViewGroup) null);
                                LinearLayout linearLayout9 = (LinearLayout) relativeLayout.findViewById(R.id.ll_tit);
                                int i17 = i16;
                                LinearLayout linearLayout10 = (LinearLayout) relativeLayout.findViewById(R.id.ll_tit_2);
                                if (!split2[14].equals(str17)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str25);
                                    linearLayout3 = linearLayout8;
                                    sb2.append(split2[14]);
                                    relativeLayout.setBackgroundColor(Color.parseColor(sb2.toString()));
                                } else {
                                    linearLayout3 = linearLayout8;
                                }
                                if (split2[15].equals(str26)) {
                                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout9.getLayoutParams();
                                    layoutParams2.addRule(13);
                                    linearLayout9.setLayoutParams(layoutParams2);
                                    linearLayout4 = linearLayout10;
                                } else {
                                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout9.getLayoutParams();
                                    linearLayout4 = linearLayout10;
                                    if (Build.VERSION.SDK_INT >= 17) {
                                        layoutParams3.addRule(20);
                                    } else {
                                        layoutParams3.addRule(9);
                                    }
                                    linearLayout9.setLayoutParams(layoutParams3);
                                }
                                if (split2[16].equals(str26)) {
                                    int parseInt2 = Integer.parseInt(split2[17]);
                                    SharedPreferences sharedPreferences = t_card3.f9054P;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("c2261075_");
                                    linearLayout5 = linearLayout9;
                                    sb3.append(qVar3.f9090a);
                                    sb3.append("_logo_v");
                                    if (parseInt2 > sharedPreferences.getInt(sb3.toString(), -1)) {
                                        qVar3.f9092c = true;
                                        qVar3.f9095f = split2[17];
                                        if (t_card3.f9061s) {
                                            progressBar2 = (ProgressBar) relativeLayout.findViewById(R.id.pb_logo_inv);
                                        } else {
                                            progressBar2 = (ProgressBar) relativeLayout.findViewById(R.id.pb_logo);
                                        }
                                        if (Build.VERSION.SDK_INT > 20) {
                                            C1692config.m8168S0(progressBar2, t_card3.f9059q.f7368l1);
                                        }
                                        progressBar2.setVisibility(0);
                                    } else {
                                        File file = new File(getApplicationContext().getFilesDir(), "c2261075_" + qVar3.f9090a + "_logo.png");
                                        if (file.exists()) {
                                            try {
                                                ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setImageBitmap(MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file)));
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            } catch (OutOfMemoryError unused2) {
                                            }
                                        }
                                    }
                                    if (!split2[18].trim().equals(str17) || !split2[21].trim().equals(str17)) {
                                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                        layoutParams4.setMargins(0, 0, t_card3.f9068z, 0);
                                        if (Build.VERSION.SDK_INT >= 17) {
                                            layoutParams4.setMarginStart(0);
                                            layoutParams4.setMarginEnd(t_card3.f9068z);
                                        }
                                        ((FrameLayout) relativeLayout.findViewById(R.id.fl_cab_card)).setLayoutParams(layoutParams4);
                                        ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setMaxHeight(t_card3.f9040B);
                                    } else {
                                        ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setMaxHeight(t_card3.f9040B);
                                    }
                                    relativeLayout.findViewById(R.id.fl_cab_card).setVisibility(0);
                                } else {
                                    linearLayout5 = linearLayout9;
                                }
                                String trim = split2[18].trim();
                                if (!trim.equals(str17)) {
                                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_tit);
                                    textView.setTextSize(Float.parseFloat(split2[20]));
                                    textView.setTextColor(Color.parseColor(str25 + split2[19]));
                                    textView.setText(trim.replace(str23, str19).replace(str22, str18));
                                    textView.setVisibility(0);
                                }
                                String trim2 = split2[21].trim();
                                if (!trim2.equals(str17)) {
                                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_subtit);
                                    textView2.setTextSize(Float.parseFloat(split2[23]));
                                    textView2.setTextColor(Color.parseColor(str25 + split2[22]));
                                    textView2.setText(trim2.replace(str23, str19).replace(str22, str18));
                                    textView2.setVisibility(0);
                                }
                                if (split2[16].equals(str26) || !split2[18].trim().equals(str17) || !split2[21].trim().equals(str17)) {
                                    linearLayout5.setVisibility(0);
                                    if (!split2[18].trim().equals(str17) || !split2[21].trim().equals(str17)) {
                                        linearLayout4.setVisibility(0);
                                    }
                                }
                                if (split2[24].equals(str26)) {
                                    if (Integer.parseInt(split2[25]) > t_card3.f9054P.getInt("c2261075_" + qVar3.f9090a + "_btn_v", -1)) {
                                        qVar3.f9093d = true;
                                        qVar3.f9096g = split2[25];
                                        if (t_card3.f9061s) {
                                            progressBar = (ProgressBar) relativeLayout.findViewById(R.id.pb_btn_inv);
                                        } else {
                                            progressBar = (ProgressBar) relativeLayout.findViewById(R.id.pb_btn);
                                        }
                                        if (Build.VERSION.SDK_INT > 20) {
                                            C1692config.m8168S0(progressBar, t_card3.f9059q.f7368l1);
                                        }
                                        progressBar.setVisibility(0);
                                    } else {
                                        File file2 = new File(getApplicationContext().getFilesDir(), "c2261075_" + qVar3.f9090a + "_btn.png");
                                        if (file2.exists()) {
                                            try {
                                                ((ImageView) relativeLayout.findViewById(R.id.iv_btn)).setImageBitmap(MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file2)));
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            } catch (OutOfMemoryError unused3) {
                                            }
                                        }
                                    }
                                    relativeLayout.findViewById(R.id.fl_btn).setVisibility(0);
                                } else if (!split2[26].trim().equals(str17)) {
                                    TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_btn);
                                    textView3.setTextSize(Float.parseFloat(split2[28]));
                                    textView3.setTextColor(Color.parseColor(str25 + split2[27]));
                                    if (!split2[29].equals(str17)) {
                                        textView3.setBackgroundResource(R.drawable.fondo_rounded_2);
                                        ((GradientDrawable) textView3.getBackground()).setColor(Color.parseColor(str25 + split2[29]));
                                    }
                                    textView3.setText(split2[26].trim().replace(str23, str19).replace(str22, str18));
                                    textView3.setVisibility(0);
                                }
                                if (split2[24].equals(str26) || !split2[26].trim().equals(str17)) {
                                    LinearLayout linearLayout11 = (LinearLayout) relativeLayout.findViewById(R.id.ll_btn);
                                    linearLayout11.setVisibility(0);
                                    str16 = str27;
                                    if (!split2[30].equals(str16)) {
                                        linearLayout11.setTag(R.id.idaux1, split2[30]);
                                        linearLayout11.setOnClickListener(new C2217m());
                                    } else if (!split2[31].equals(str17)) {
                                        linearLayout11.setTag(R.id.idaux1, split2[31].replace(str23, str19).replace(str22, str18));
                                        if (split2[47].equals(str16)) {
                                            linearLayout11.setOnClickListener(new C2218n());
                                        } else {
                                            linearLayout11.setOnClickListener(new C2219o());
                                        }
                                    }
                                } else {
                                    str16 = str27;
                                }
                                linearLayout8 = linearLayout3;
                                linearLayout8.addView(relativeLayout);
                                str13 = str16;
                                qVar = qVar3;
                                t_card2 = t_card3;
                                str7 = str17;
                                str11 = str18;
                                str8 = str25;
                                str12 = str22;
                                str9 = str23;
                                layoutInflater2 = layoutInflater5;
                                i6 = i17;
                                str10 = str19;
                            } else {
                                int i18 = i16;
                                String str29 = str27;
                                if (!split2[7].equals(str17 + i16) || split2[33].trim().equals(str17)) {
                                    qVar2 = qVar3;
                                    if (split2[8].equals(str17 + i16) && (parseInt = Integer.parseInt(split2[45])) > 0) {
                                        if (split2[39].equals(str26) || (split2[39].equals(str29) && split2[41].equals(str26))) {
                                            str10 = str19;
                                            str11 = str18;
                                            i6 = i16;
                                            str12 = str22;
                                            str9 = str23;
                                            C2221q qVar4 = qVar2;
                                            layoutInflater2 = layoutInflater5;
                                            String str30 = str26;
                                            if (!split2[41].equals(str29) || !split2[42].equals(str29)) {
                                                linearLayout2 = (LinearLayout) layoutInflater2.inflate(R.layout.t_card_aux2_cen, (ViewGroup) null);
                                            } else {
                                                linearLayout2 = (LinearLayout) layoutInflater2.inflate(R.layout.t_card_aux2, (ViewGroup) null);
                                            }
                                            TableLayout tableLayout = (TableLayout) linearLayout2.findViewById(R.id.tl_opc);
                                            if (!split2[37].equals(str17)) {
                                                linearLayout2.setBackgroundColor(Color.parseColor(str25 + split2[37]));
                                            }
                                            String str31 = str30;
                                            if (split2[41].equals(str31)) {
                                                tableLayout.setLayoutParams(new TableLayout.LayoutParams(-1, -2));
                                            }
                                            int parseInt3 = Integer.parseInt(split2[40]);
                                            if (split2[39].equals(str29)) {
                                                parseInt3 = 99999;
                                            }
                                            t_card2 = this;
                                            TableRow tableRow = new TableRow(t_card2);
                                            tableRow.setPadding(0, 0, 0, 0);
                                            int i19 = i11 + 1;
                                            int i20 = 0;
                                            while (i19 <= i11 + parseInt) {
                                                i20++;
                                                int i21 = parseInt;
                                                String str32 = str29;
                                                C2221q qVar5 = qVar4;
                                                String str33 = str25;
                                                CardView b = t_card2.m8685b(strArr2[i19], qVar5.f9090a, split2[38].equals(str31));
                                                if (split2[38].equals(str31)) {
                                                    str14 = str17;
                                                    TableRow.LayoutParams layoutParams5 = new TableRow.LayoutParams(-1, -2);
                                                    int i22 = t_card2.f9065w;
                                                    layoutParams5.setMargins(i22, i22, i22, i22);
                                                    b.setLayoutParams(layoutParams5);
                                                } else {
                                                    str14 = str17;
                                                }
                                                if (i20 > 1) {
                                                    tableRow.addView((CardView) layoutInflater2.inflate(R.layout.t_card_opc_aux, (ViewGroup) null));
                                                }
                                                tableRow.addView(b);
                                                if (i20 == parseInt3) {
                                                    tableLayout.addView(tableRow);
                                                    TableRow tableRow2 = new TableRow(t_card2);
                                                    tableRow2.setPadding(0, t_card2.f9067y, 0, 0);
                                                    tableRow = tableRow2;
                                                    i20 = 0;
                                                }
                                                i19++;
                                                parseInt = i21;
                                                str25 = str33;
                                                str17 = str14;
                                                qVar4 = qVar5;
                                                str29 = str32;
                                            }
                                            str13 = str29;
                                            str7 = str17;
                                            qVar = qVar4;
                                            str8 = str25;
                                            if (i20 > 0) {
                                                tableLayout.addView(tableRow);
                                            }
                                            int i23 = i19 - 1;
                                            if (split2[41].equals(str31)) {
                                                boolean z = false;
                                                TableRow tableRow3 = (TableRow) tableLayout.getChildAt(0);
                                                if (tableRow3 != null) {
                                                    int i24 = 0;
                                                    while (i24 < tableRow3.getChildCount()) {
                                                        if (i24 % 2 == 0) {
                                                            tableLayout.setColumnStretchable(i24, true);
                                                        } else {
                                                            tableLayout.setColumnShrinkable(i24, z);
                                                        }
                                                        i24++;
                                                        z = false;
                                                    }
                                                }
                                            }
                                            linearLayout8.addView(linearLayout2);
                                            i11 = i23;
                                        } else {
                                            if (split2[42].equals(str26)) {
                                                layoutInflater2 = layoutInflater5;
                                                horizontalScrollView = (HorizontalScrollView) layoutInflater2.inflate(R.layout.t_card_aux1_cen, (ViewGroup) null);
                                            } else {
                                                layoutInflater2 = layoutInflater5;
                                                horizontalScrollView = (HorizontalScrollView) layoutInflater2.inflate(R.layout.t_card_aux1, (ViewGroup) null);
                                            }
                                            LinearLayout linearLayout12 = (LinearLayout) horizontalScrollView.findViewById(R.id.ll_opc);
                                            if (!split2[37].equals(str17)) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(str25);
                                                str11 = str18;
                                                sb4.append(split2[37]);
                                                horizontalScrollView.setBackgroundColor(Color.parseColor(sb4.toString()));
                                            } else {
                                                str11 = str18;
                                            }
                                            int i25 = i11 + 1;
                                            str12 = str22;
                                            boolean z2 = true;
                                            while (i25 <= i11 + parseInt) {
                                                String str34 = str19;
                                                String str35 = str23;
                                                C2221q qVar6 = qVar2;
                                                int i26 = i16;
                                                C2221q qVar7 = qVar6;
                                                CardView b2 = m8685b(strArr2[i25], qVar6.f9090a, split2[38].equals(str26));
                                                if (!z2) {
                                                    i7 = this.f9067y;
                                                } else {
                                                    i7 = split2[38].equals(str26) ? this.f9065w : 0;
                                                }
                                                int i27 = split2[38].equals(str26) ? this.f9065w : 0;
                                                if (i7 > 0 || i27 > 0) {
                                                    str15 = str26;
                                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                                    layoutParams6.setMargins(i7, i27, i27, i27);
                                                    if (Build.VERSION.SDK_INT >= 17) {
                                                        layoutParams6.setMarginStart(i7);
                                                        layoutParams6.setMarginEnd(i27);
                                                    }
                                                    b2.setLayoutParams(layoutParams6);
                                                } else {
                                                    str15 = str26;
                                                }
                                                linearLayout12.addView(b2);
                                                i25++;
                                                str26 = str15;
                                                str19 = str34;
                                                str23 = str35;
                                                i16 = i26;
                                                qVar2 = qVar7;
                                                z2 = false;
                                            }
                                            str10 = str19;
                                            i6 = i16;
                                            str9 = str23;
                                            C2221q qVar8 = qVar2;
                                            linearLayout8.addView(horizontalScrollView);
                                            t_card2 = this;
                                            str13 = str29;
                                            i11 = i25 - 1;
                                            str7 = str17;
                                            qVar = qVar8;
                                            str8 = str25;
                                        }
                                    }
                                } else {
                                    LinearLayout linearLayout13 = new LinearLayout(t_card3);
                                    qVar2 = qVar3;
                                    linearLayout13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    int i28 = t_card3.f9039A;
                                    linearLayout13.setPadding(i28, i28, i28, i28);
                                    if (!split2[32].equals(str17)) {
                                        linearLayout13.setBackgroundColor(Color.parseColor(str25 + split2[32]));
                                    }
                                    TextView textView4 = new TextView(t_card3);
                                    textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    if (split2[34].equals(str26)) {
                                        textView4.setGravity(1);
                                    } else if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                                        textView4.setTextDirection(4);
                                    }
                                    textView4.setTextSize(Float.parseFloat(split2[36]));
                                    textView4.setTextColor(Color.parseColor(str25 + split2[35]));
                                    textView4.setText(split2[33].trim().replace(str23, str19).replace(str22, str18));
                                    textView4.setVisibility(0);
                                    linearLayout13.addView(textView4);
                                    linearLayout8.addView(linearLayout13);
                                }
                                str10 = str19;
                                str7 = str17;
                                str11 = str18;
                                str8 = str25;
                                i6 = i16;
                                str12 = str22;
                                str9 = str23;
                                layoutInflater2 = layoutInflater5;
                                t_card2 = this;
                                C2221q qVar9 = qVar2;
                                str13 = str29;
                                qVar = qVar9;
                            }
                        } else {
                            String str36 = str21;
                            RelativeLayout relativeLayout2 = (RelativeLayout) layoutInflater4.inflate(R.layout.t_card_img, (ViewGroup) null);
                            String trim3 = split2[10].trim();
                            if (!trim3.equals(str17)) {
                                layoutInflater3 = layoutInflater4;
                                TextView textView5 = (TextView) relativeLayout2.findViewById(R.id.tv_img_descr);
                                i8 = i15;
                                textView5.setTextSize(Float.parseFloat(split2[13]));
                                if (split2[11].equals(str26)) {
                                    textView5.setGravity(1);
                                } else if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                                    textView5.setTextDirection(4);
                                }
                                textView5.setTextColor(Color.parseColor(str25 + split2[12]));
                                textView5.setText(trim3.replace(str23, str19).replace(str22, str18));
                                relativeLayout2.findViewById(R.id.ll_img_descr).setVisibility(0);
                            } else {
                                layoutInflater3 = layoutInflater4;
                                i8 = i15;
                            }
                            if (Integer.parseInt(split2[9]) > t_card3.f9054P.getInt("c2261075_" + qVar3.f9090a + "_main_v", -1)) {
                                qVar3.f9091b = true;
                                qVar3.f9094e = split2[9];
                                if (t_card3.f9061s) {
                                    progressBar3 = (ProgressBar) relativeLayout2.findViewById(R.id.pb_main_inv);
                                } else {
                                    progressBar3 = (ProgressBar) relativeLayout2.findViewById(R.id.pb_main);
                                }
                                if (Build.VERSION.SDK_INT > 20) {
                                    C1692config.m8168S0(progressBar3, t_card3.f9059q.f7368l1);
                                }
                                progressBar3.setVisibility(0);
                            } else {
                                File file3 = new File(getApplicationContext().getFilesDir(), "c2261075_" + qVar3.f9090a + "_main.png");
                                if (file3.exists()) {
                                    try {
                                        ((ImageView) relativeLayout2.findViewById(R.id.img)).setImageBitmap(MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file3)));
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    } catch (OutOfMemoryError unused4) {
                                    }
                                }
                            }
                            linearLayout8.addView(relativeLayout2);
                            qVar = qVar3;
                            t_card2 = t_card3;
                            str7 = str17;
                            str11 = str18;
                            str8 = str25;
                            str9 = str23;
                            str13 = str36;
                            layoutInflater2 = layoutInflater3;
                            i6 = i8;
                            str10 = str19;
                            str12 = str22;
                        }
                        i15 = i6 + 1;
                        qVar3 = qVar;
                        str21 = str13;
                        split = strArr2;
                        str22 = str12;
                        str18 = str11;
                        str19 = str10;
                        str23 = str9;
                        str25 = str8;
                        str17 = str7;
                        i14 = 5;
                        t_card t_card4 = t_card2;
                        layoutInflater4 = layoutInflater2;
                        t_card3 = t_card4;
                    }
                    C2221q qVar10 = qVar3;
                    String str37 = str17;
                    String str38 = str18;
                    strArr = split;
                    LayoutInflater layoutInflater6 = layoutInflater4;
                    t_card = t_card3;
                    layoutInflater = layoutInflater6;
                    CardView cardView3 = cardView2;
                    cardView3.setTag(str24 + qVar10.f9090a);
                    cardView3.addView(linearLayout8);
                    linearLayout = linearLayout7;
                    linearLayout.addView(cardView3);
                    t_card.f9043E.add(qVar10);
                    i2 = i11;
                    i10 = i12;
                    str = str37;
                    i = 1;
                } else {
                    int i29 = i9;
                    int i30 = i10;
                    String str39 = str19;
                    String str40 = str17;
                    String str41 = str18;
                    strArr = split;
                    linearLayout = linearLayout6;
                    String str42 = str22;
                    String str43 = str23;
                    String str44 = TtmlNode.ATTR_ID;
                    LayoutInflater layoutInflater7 = layoutInflater4;
                    t_card = t_card3;
                    layoutInflater = layoutInflater7;
                    C1692config config = t_card.f9059q;
                    if (config.f7413r4) {
                        str5 = config.f7385n4;
                        str4 = config.f7392o4;
                        String str45 = config.f7399p4;
                        str6 = config.f7406q4;
                        str2 = str45;
                        str18 = str41;
                        str3 = str40;
                    } else {
                        String str46 = str39;
                        String str47 = str43;
                        String str48 = str42;
                        str18 = str41;
                        String replace = split2[2].trim().replace(str47, str46).replace(str48, str18);
                        String replace2 = split2[3].trim().replace(str47, str46).replace(str48, str18);
                        str2 = split2[4].trim().replace(str47, str46).replace(str48, str18);
                        String replace3 = split2[5].trim().replace(str47, str46).replace(str48, str18);
                        str3 = t_card.f9059q.f7299Z3;
                        str4 = replace2;
                        String str49 = replace3;
                        str5 = replace;
                        str6 = str49;
                    }
                    str = str40;
                    if (C1692config.f7120T5.equals(str)) {
                        str5 = str;
                    }
                    boolean z3 = !str5.equals(str);
                    boolean z4 = !str4.equals(str) && (arrayList = t_card.f9059q.f7463y5) != null && arrayList.size() > 0;
                    boolean z5 = !str2.equals(str);
                    boolean z6 = !str6.equals(str);
                    boolean z7 = !str3.equals(str) && !t_card.f9063u;
                    ArrayList arrayList2 = new ArrayList();
                    if (z3) {
                        arrayList2.add(1);
                    }
                    if (z4) {
                        arrayList2.add(2);
                    }
                    if (z5) {
                        arrayList2.add(3);
                    }
                    if (z6) {
                        arrayList2.add(4);
                    }
                    if (z7) {
                        arrayList2.add(5);
                    }
                    if (!arrayList2.isEmpty()) {
                        i3 = 0;
                        i4 = ((Integer) arrayList2.get(new Random().nextInt(((arrayList2.size() - 1) - 0) + 1) + 0)).intValue();
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        pVar = new C2220p();
                        pVar.f9087a = Integer.parseInt(split2[i3]);
                        LinearLayout linearLayout14 = new LinearLayout(t_card);
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                        int i31 = t_card.f9066x;
                        layoutParams7.setMargins(i3, i31, i3, i31);
                        linearLayout14.setLayoutParams(layoutParams7);
                        linearLayout14.setTag(str44 + split2[i3]);
                        linearLayout.addView(linearLayout14);
                        i5 = 1;
                    } else {
                        i5 = 1;
                        pVar = null;
                    }
                    if (i4 == i5) {
                        AdView adView = new AdView(t_card);
                        adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
                        adView.setAdUnitId(str5);
                        LinearLayout linearLayout15 = (LinearLayout) t_card.findViewById(R.id.llcards).findViewWithTag(str44 + pVar.f9087a);
                        linearLayout15.setGravity(1);
                        linearLayout15.addView(adView);
                        adView.loadAd(new AdRequest.Builder().build());
                    } else if (i4 == 2) {
                        int i32 = i30 + 1;
                        int i33 = i32 > t_card.f9059q.f7463y5.size() - 1 ? 0 : i32;
                        t_card.f9059q.mo7512k(this, 1, 3, i33, (String) null);
                        i10 = i33;
                        i2 = i29;
                        i = 1;
                    } else if (i4 == 3) {
                        pVar.f9088b = new NativeAd((Context) t_card, str2);
                        C2203a aVar = new C2203a();
                        t_card.f9045G.add(pVar);
                        NativeAd nativeAd = pVar.f9088b;
                        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(aVar).build());
                    } else if (i4 == 4) {
                        Mrec mrec = new Mrec((Activity) t_card);
                        mrec.setAdTag("CARD SECTION");
                        LinearLayout linearLayout16 = (LinearLayout) t_card.findViewById(R.id.llcards).findViewWithTag(str44 + pVar.f9087a);
                        linearLayout16.setGravity(1);
                        linearLayout16.addView(mrec);
                    } else if (i4 == 5) {
                        t_card.f9063u = true;
                        IronSourceBannerLayout ironSourceBannerLayout = t_card.f9059q.f7420s4;
                        if (ironSourceBannerLayout != null) {
                            IronSource.destroyBanner(ironSourceBannerLayout);
                        }
                        t_card.f9059q.f7420s4 = IronSource.createBanner(t_card, ISBannerSize.RECTANGLE);
                        LinearLayout linearLayout17 = (LinearLayout) t_card.findViewById(R.id.llcards).findViewWithTag(str44 + pVar.f9087a);
                        linearLayout17.setGravity(1);
                        try {
                            linearLayout17.addView(t_card.f9059q.f7420s4);
                            IronSource.loadBanner(t_card.f9059q.f7420s4);
                        } catch (Exception unused5) {
                        }
                    }
                    i2 = i29;
                    i10 = i30;
                    i = 1;
                }
                i9 = i2 + i;
                split = strArr;
                t_card t_card5 = t_card;
                layoutInflater4 = layoutInflater;
                t_card3 = t_card5;
                String str50 = str;
                linearLayout6 = linearLayout;
                str17 = str50;
            }
            t_card t_card6 = t_card3;
            C2224t tVar = t_card6.f9047I;
            if (tVar == null || tVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2224t tVar2 = new C2224t();
                t_card6.f9047I = tVar2;
                tVar2.execute(new String[0]);
            }
            C2225u uVar = t_card6.f9048J;
            if (uVar == null || uVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2225u uVar2 = new C2225u();
                t_card6.f9048J = uVar2;
                uVar2.execute(new String[0]);
            }
        }
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f9057o;
            if (i != -1) {
                this.f9059q.mo7499d(this, i);
                return;
            }
            return;
        }
        C1845j j0 = this.f9059q.mo7510j0(view, this);
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
                    if (this.f9059q.f7427t4 != 2) {
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
    /* renamed from: d */
    public void mo8438d() {
        int q0 = this.f9059q.mo7522q0(this);
        int i = this.f9059q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9053O = listView;
            this.f9059q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9059q.f7231O1;
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
            int[] iArr = this.f9059q.f7249R1;
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
        if (this.f9050L) {
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
        if (!this.f6659e || this.f9060r || !this.f9059q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9060r = true;
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
        String str9 = this.f9059q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9059q.f7281W3) == null || str.equals("")) && (((str2 = this.f9059q.f7250R2) == null || str2.equals("")) && (((str3 = this.f9059q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9059q.f7269U3) == null || str4.equals("")) && (((str5 = this.f9059q.f7275V3) == null || str5.equals("")) && (((str6 = this.f9059q.f7358j4) == null || str6.equals("")) && (((str7 = this.f9059q.f7287X3) == null || str7.equals("")) && ((str8 = this.f9059q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9059q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9059q.f7251R3);
        }
        String str11 = this.f9059q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9059q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9059q.f7269U3);
        }
        String str13 = this.f9059q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9059q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.facebook.ads.AdView adView;
        AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8438d();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9049K;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9049K;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f9049K = this.f9059q.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f9059q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8686c(this);
        this.f6666l = new C2211g();
        C1692config config2 = this.f9059q;
        C1855l[] lVarArr = config2.f7231O1;
        int i = config2.f7318d;
        this.f9041C = lVarArr[i].f7916g;
        this.f9042D = lVarArr[i].f7919h;
        this.f9061s = C1692config.m8153I("#" + this.f9041C);
        this.f9062t = C1692config.m8153I("#" + this.f9042D);
        this.f6656b = C1692config.m8189h(this.f9041C, this.f9059q.f7368l1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 12 && !this.f9061s) {
            setTheme(R.style.holonolight);
        }
        Bundle extras = getIntent().getExtras();
        this.f9052N = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9052N.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        C1692config config3 = this.f9059q;
        int i3 = config3.f7318d;
        this.f9056n = i3;
        this.f9058p = config3.f7231O1[i3].f7964y;
        super.onCreate(bundle);
        this.f9064v = C1692config.m8149E(this, 2);
        this.f9065w = C1692config.m8149E(this, 3);
        this.f9066x = C1692config.m8149E(this, 4);
        this.f9067y = C1692config.m8149E(this, 8);
        this.f9068z = C1692config.m8149E(this, 12);
        this.f9039A = C1692config.m8149E(this, 16);
        this.f9040B = C1692config.m8149E(this, 100);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9054P = sharedPreferences;
        this.f9055m = sharedPreferences.getLong("idusu", 0);
        setContentView(R.layout.t_card);
        mo8438d();
        this.f9059q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2212h());
        searchManager.setOnDismissListener(new C2213i());
        C1692config config4 = this.f9059q;
        Bundle bundle2 = this.f9052N;
        boolean z = bundle2 != null && bundle2.containsKey("ad_entrar");
        Bundle bundle3 = this.f9052N;
        config4.mo7503f1(this, z, bundle3 != null && bundle3.containsKey("fb_entrar"));
        this.f9049K = this.f9059q.mo7474A0(this, false);
        C1692config config5 = this.f9059q;
        config5.mo7488Q0(this, config5.f7318d, this.f6656b, bundle);
        if (!this.f9041C.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f9041C), Color.parseColor("#" + this.f9042D)}));
        }
        if (this.f9061s) {
            this.f9051M = (ProgressBar) findViewById(R.id.pb_inv);
        } else {
            this.f9051M = (ProgressBar) findViewById(R.id.pb);
        }
        if (i2 > 20) {
            C1692config.m8168S0(this.f9051M, this.f9059q.f7368l1);
        }
        if (this.f9059q.f7163D > 0) {
            this.f9054P.registerOnSharedPreferenceChangeListener(this);
        }
        if (this.f9059q.f7163D > 0) {
            int i4 = this.f9054P.getInt("fondo_v_act", 0);
            C1692config config6 = this.f9059q;
            if (i4 == config6.f7163D) {
                try {
                    config6.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9059q.f7145A), this.f9059q.f7157C);
                    this.f9059q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        }
        if (C1692config.m8205x0(this)) {
            int i5 = this.f9059q.f7231O1[this.f9056n].f7846A;
            SharedPreferences sharedPreferences2 = this.f9054P;
            if (i5 > sharedPreferences2.getInt("s" + this.f9058p + "_v_guardado", -1)) {
                C2223s sVar = new C2223s(0);
                this.f9046H = sVar;
                sVar.execute(new String[0]);
                return;
            }
            m8687e();
            return;
        }
        m8687e();
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        com.facebook.ads.AdView adView;
        C1603c cVar3;
        AdView adView2;
        if (!(this.f9059q.f7384n3 == 0 || (cVar3 = this.f9049K) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9059q.f7384n3 == 0 || (cVar2 = this.f9049K) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9059q.f7384n3 == 0 || (cVar = this.f9049K) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        AdView adView;
        if (!(this.f9059q.f7384n3 == 0 || (cVar = this.f9049K) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2210f());
    }

    public void onResume() {
        C1603c cVar;
        AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9059q.f7384n3 != 0 && (cVar = this.f9049K) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9050L = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9050L) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9050L = true;
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

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            try {
                this.f9059q.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9059q.f7145A), this.f9059q.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f9059q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
            } catch (Exception unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9050L = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9050L = true;
        C1692config.m8175Y0(this);
    }
}
