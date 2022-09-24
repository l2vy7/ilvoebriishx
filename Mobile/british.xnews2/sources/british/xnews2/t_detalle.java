package british.xnews2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
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
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

public class t_detalle extends FragmentActivity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: B */
    C1692config f9341B;

    /* renamed from: C */
    t_detalle_fr f9342C;

    /* renamed from: D */
    C1603c f9343D;

    /* renamed from: E */
    boolean f9344E = false;

    /* renamed from: F */
    ListView f9345F;

    /* renamed from: british.xnews2.t_detalle$a */
    class C2296a extends AdColonyInterstitialListener {
        C2296a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_detalle t_detalle = t_detalle.this;
            if (t_detalle.f9344E) {
                t_detalle.abrir_secc(t_detalle.f6672u);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_detalle.this.f6673v.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_detalle.this.f6673v.cancel();
            t_detalle t_detalle = t_detalle.this;
            t_detalle.abrir_secc(t_detalle.f6672u);
        }
    }

    /* renamed from: british.xnews2.t_detalle$b */
    class C2297b implements SearchManager.OnCancelListener {
        C2297b() {
        }

        public void onCancel() {
            t_detalle t_detalle = t_detalle.this;
            t_detalle.f6669r = false;
            t_detalle.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_detalle$c */
    class C2298c implements SearchManager.OnDismissListener {
        C2298c() {
        }

        public void onDismiss() {
            t_detalle.this.f6670s = false;
        }
    }

    /* renamed from: british.xnews2.t_detalle$d */
    class C2299d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9349a;

        /* renamed from: british.xnews2.t_detalle$d$a */
        class C2300a extends FullScreenContentCallback {
            C2300a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_detalle t_detalle = t_detalle.this;
                if (t_detalle.f9344E) {
                    t_detalle.abrir_secc(t_detalle.f6672u);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_detalle t_detalle = t_detalle.this;
                t_detalle.abrir_secc(t_detalle.f6672u);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_detalle$d$b */
        class C2301b implements OnUserEarnedRewardListener {
            C2301b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2299d dVar = C2299d.this;
                t_detalle.this.f9344E = true;
                C1692config.m8175Y0(dVar.f9349a);
            }
        }

        C2299d(Context context) {
            this.f9349a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_detalle.this.f6673v.cancel();
            rewardedAd.setFullScreenContentCallback(new C2300a());
            rewardedAd.show((Activity) this.f9349a, new C2301b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_detalle t_detalle = t_detalle.this;
            if (!t_detalle.f9341B.mo7502f(this.f9349a, t_detalle.f6675x)) {
                t_detalle.this.f6673v.cancel();
                t_detalle t_detalle2 = t_detalle.this;
                t_detalle2.abrir_secc(t_detalle2.f6672u);
            }
        }
    }

    /* renamed from: british.xnews2.t_detalle$e */
    class C2302e implements AdDisplayListener {
        C2302e() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_detalle t_detalle = t_detalle.this;
            if (t_detalle.f9344E) {
                t_detalle.abrir_secc(t_detalle.f6672u);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: B */
    private void m8782B(Context context) {
        this.f6674w = new C2299d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8626C() {
        int q0 = this.f9341B.mo7522q0(this);
        int i = this.f9341B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9345F = listView;
            this.f9341B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9341B.f7231O1;
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
            int[] iArr = this.f9341B.f7249R1;
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

    public void abrir_secc(View view) {
        C1845j j0 = this.f9341B.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6669r = true;
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
                    this.f6671t = false;
                    if (this.f9341B.f7427t4 != 2) {
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
        if (this.f6669r && !this.f6670s) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6673v.cancel();
        this.f6675x.showAd();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9344E) {
            abrir_secc(this.f6672u);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6673v.cancel();
        this.f6676y.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        super.onBackPressed();
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
        String str9 = this.f9341B.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9341B.f7281W3) == null || str.equals("")) && (((str2 = this.f9341B.f7250R2) == null || str2.equals("")) && (((str3 = this.f9341B.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9341B.f7269U3) == null || str4.equals("")) && (((str5 = this.f9341B.f7275V3) == null || str5.equals("")) && (((str6 = this.f9341B.f7358j4) == null || str6.equals("")) && (((str7 = this.f9341B.f7287X3) == null || str7.equals("")) && ((str8 = this.f9341B.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9341B.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6675x = new RewardedVideo((Context) this, this.f9341B.f7251R3);
        }
        String str11 = this.f9341B.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9341B.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6676y = new RewardedVideoAd(this, this.f9341B.f7269U3);
        }
        String str13 = this.f9341B.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6677z = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6673v = progressDialog;
        this.f6672u = view;
        if (!this.f9341B.mo7494Z0(this, view, this.f6668q, progressDialog, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6667A, view)) {
            abrir_secc(view);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f9341B = (C1692config) getApplicationContext();
        m8782B(this);
        this.f6667A = new C2296a();
        C1692config config = this.f9341B;
        this.f6668q = C1692config.m8189h(config.f7431u1, config.f7452x1);
        super.onCreate(bundle);
        setContentView((int) R.layout.detalle_fr);
        mo8626C();
        this.f9341B.mo7486N0(this, true);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2297b());
        searchManager.setOnDismissListener(new C2298c());
        this.f9343D = this.f9341B.mo7474A0(this, false);
        Intent intent = getIntent();
        String string = intent.getExtras().getString("url");
        long j = intent.getExtras().getLong("idprod");
        t_detalle_fr t_detalle_fr = (t_detalle_fr) mo3505r().mo3589i0(R.id.detalle_fr);
        this.f9342C = t_detalle_fr;
        t_detalle_fr.mo8633T1(string, j);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9341B.f7384n3 == 0 || (cVar3 = this.f9343D) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9341B.f7384n3 == 0 || (cVar2 = this.f9343D) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9341B.f7384n3 == 0 || (cVar = this.f9343D) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f9342C.mo8635W1(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9341B.f7384n3 == 0 || (cVar = this.f9343D) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        this.f6677z.showAd("REWARDED VIDEO", new C2302e());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9341B.f7384n3 != 0 && (cVar = this.f9343D) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9344E = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9344E) {
            abrir_secc(this.f6672u);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9344E = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6669r = true;
        this.f6670s = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6669r && !this.f6670s) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9344E = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9344E = true;
        C1692config.m8175Y0(this);
    }
}
