package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
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
import java.io.File;

/* renamed from: british.x.t_oficinas */
public class t_oficinas extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    SharedPreferences f9607A;

    /* renamed from: B */
    ListView f9608B;

    /* renamed from: m */
    C1692config f9609m;

    /* renamed from: n */
    boolean f9610n = false;

    /* renamed from: o */
    Bitmap f9611o;

    /* renamed from: p */
    ImageView[] f9612p;

    /* renamed from: q */
    ProgressBar[] f9613q;

    /* renamed from: r */
    int[] f9614r;

    /* renamed from: s */
    int[][] f9615s;

    /* renamed from: t */
    int f9616t;

    /* renamed from: u */
    int f9617u;

    /* renamed from: v */
    Bundle f9618v;

    /* renamed from: w */
    C1840i f9619w;

    /* renamed from: x */
    File f9620x;

    /* renamed from: y */
    private C1603c f9621y;

    /* renamed from: z */
    boolean f9622z = false;

    /* renamed from: british.x.t_oficinas$a */
    class C2381a extends AdColonyInterstitialListener {
        C2381a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_oficinas t_oficinas = t_oficinas.this;
            if (t_oficinas.f9622z) {
                t_oficinas.abrir_secc(t_oficinas.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_oficinas.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_oficinas.this.f6661g.cancel();
            t_oficinas t_oficinas = t_oficinas.this;
            t_oficinas.abrir_secc(t_oficinas.f6660f);
        }
    }

    /* renamed from: british.x.t_oficinas$b */
    class C2382b implements SearchManager.OnCancelListener {
        C2382b() {
        }

        public void onCancel() {
            t_oficinas t_oficinas = t_oficinas.this;
            t_oficinas.f6657c = false;
            t_oficinas.setResult(0);
        }
    }

    /* renamed from: british.x.t_oficinas$c */
    class C2383c implements SearchManager.OnDismissListener {
        C2383c() {
        }

        public void onDismiss() {
            t_oficinas.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_oficinas$d */
    class C2384d implements View.OnClickListener {

        /* renamed from: b */
        private File f9626b;

        C2384d() {
            this.f9626b = t_oficinas.this.f9620x;
        }

        public void onClick(View view) {
            File file = this.f9626b;
            if (file != null && file.exists()) {
                Intent intent = new Intent(t_oficinas.this, t_url.class);
                intent.putExtra("url", "file://" + this.f9626b);
                intent.putExtra("bg1", t_oficinas.this.f9609m.f7355j1);
                intent.putExtra("bg2", t_oficinas.this.f9609m.f7361k1);
                t_oficinas.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_oficinas$e */
    class C2385e implements View.OnClickListener {

        /* renamed from: b */
        private File f9628b;

        C2385e() {
            this.f9628b = t_oficinas.this.f9620x;
        }

        public void onClick(View view) {
            File file = this.f9628b;
            if (file != null && file.exists()) {
                Intent intent = new Intent(t_oficinas.this, t_url.class);
                intent.putExtra("url", "file://" + this.f9628b);
                intent.putExtra("bg1", t_oficinas.this.f9609m.f7355j1);
                intent.putExtra("bg2", t_oficinas.this.f9609m.f7361k1);
                t_oficinas.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_oficinas$f */
    class C2386f implements View.OnClickListener {

        /* renamed from: b */
        private File f9630b;

        C2386f() {
            this.f9630b = t_oficinas.this.f9620x;
        }

        public void onClick(View view) {
            File file = this.f9630b;
            if (file != null && file.exists()) {
                Intent intent = new Intent(t_oficinas.this, t_url.class);
                intent.putExtra("url", "file://" + this.f9630b);
                intent.putExtra("bg1", t_oficinas.this.f9609m.f7355j1);
                intent.putExtra("bg2", t_oficinas.this.f9609m.f7361k1);
                t_oficinas.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_oficinas$g */
    class C2387g implements View.OnClickListener {

        /* renamed from: b */
        private File f9632b;

        C2387g() {
            this.f9632b = t_oficinas.this.f9620x;
        }

        public void onClick(View view) {
            File file = this.f9632b;
            if (file != null && file.exists()) {
                Intent intent = new Intent(t_oficinas.this, t_url.class);
                intent.putExtra("url", "file://" + this.f9632b);
                intent.putExtra("bg1", t_oficinas.this.f9609m.f7355j1);
                intent.putExtra("bg2", t_oficinas.this.f9609m.f7361k1);
                t_oficinas.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_oficinas$h */
    class C2388h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9634a;

        /* renamed from: british.x.t_oficinas$h$a */
        class C2389a extends FullScreenContentCallback {
            C2389a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_oficinas t_oficinas = t_oficinas.this;
                if (t_oficinas.f9622z) {
                    t_oficinas.abrir_secc(t_oficinas.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_oficinas t_oficinas = t_oficinas.this;
                t_oficinas.abrir_secc(t_oficinas.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_oficinas$h$b */
        class C2390b implements OnUserEarnedRewardListener {
            C2390b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2388h hVar = C2388h.this;
                t_oficinas.this.f9622z = true;
                C1692config.m8175Y0(hVar.f9634a);
            }
        }

        C2388h(Context context) {
            this.f9634a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_oficinas.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2389a());
            rewardedAd.show((Activity) this.f9634a, new C2390b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_oficinas t_oficinas = t_oficinas.this;
            if (!t_oficinas.f9609m.mo7502f(this.f9634a, t_oficinas.f6663i)) {
                t_oficinas.this.f6661g.cancel();
                t_oficinas t_oficinas2 = t_oficinas.this;
                t_oficinas2.abrir_secc(t_oficinas2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_oficinas$i */
    class C2391i implements AdDisplayListener {
        C2391i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_oficinas t_oficinas = t_oficinas.this;
            if (t_oficinas.f9622z) {
                t_oficinas.abrir_secc(t_oficinas.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_oficinas$j */
    private class C2392j extends AsyncTask<String, Void, Byte> {
        private C2392j() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0086, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0082 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.String r6 = ".png"
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x008c }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = "/srv/imgs/ofics/f"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                british.x.t_oficinas r3 = british.p015x.t_oficinas.this     // Catch:{ MalformedURLException -> 0x008c }
                int[] r4 = r3.f9614r     // Catch:{ MalformedURLException -> 0x008c }
                int r3 = r3.f9616t     // Catch:{ MalformedURLException -> 0x008c }
                r3 = r4[r3]     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r6)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x008c }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x008c }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0087 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0087 }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x0087 }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0087 }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x0087 }
                r1.connect()     // Catch:{ IOException -> 0x0087 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0087 }
                british.x.t_oficinas r2 = british.p015x.t_oficinas.this     // Catch:{ IOException -> 0x0087 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0087 }
                r2.f9611o = r1     // Catch:{ IOException -> 0x0087 }
                british.x.t_oficinas r1 = british.p015x.t_oficinas.this     // Catch:{ Exception -> 0x0082 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r2.<init>()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r3 = "o_f"
                r2.append(r3)     // Catch:{ Exception -> 0x0082 }
                british.x.t_oficinas r3 = british.p015x.t_oficinas.this     // Catch:{ Exception -> 0x0082 }
                int[] r4 = r3.f9614r     // Catch:{ Exception -> 0x0082 }
                int r3 = r3.f9616t     // Catch:{ Exception -> 0x0082 }
                r3 = r4[r3]     // Catch:{ Exception -> 0x0082 }
                r2.append(r3)     // Catch:{ Exception -> 0x0082 }
                r2.append(r6)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0082 }
                r2 = 0
                java.io.FileOutputStream r6 = r1.openFileOutput(r6, r2)     // Catch:{ Exception -> 0x0082 }
                british.x.t_oficinas r1 = british.p015x.t_oficinas.this     // Catch:{ Exception -> 0x0082 }
                android.graphics.Bitmap r1 = r1.f9611o     // Catch:{ Exception -> 0x0082 }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0082 }
                r4 = 100
                r1.compress(r3, r4, r6)     // Catch:{ Exception -> 0x0082 }
                r6.close()     // Catch:{ Exception -> 0x0082 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r2)
                return r6
            L_0x0082:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)     // Catch:{ IOException -> 0x0087 }
                return r6
            L_0x0087:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x008c:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_oficinas.C2392j.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                t_oficinas t_oficinas = t_oficinas.this;
                t_oficinas.f9612p[t_oficinas.f9616t].setImageBitmap(t_oficinas.f9611o);
                t_oficinas t_oficinas2 = t_oficinas.this;
                t_oficinas2.f9613q[t_oficinas2.f9616t].setVisibility(8);
                t_oficinas t_oficinas3 = t_oficinas.this;
                C1692config.m8172V(t_oficinas3.f9612p[t_oficinas3.f9616t]);
                SharedPreferences.Editor edit = t_oficinas.this.getSharedPreferences("sh", 0).edit();
                StringBuilder sb = new StringBuilder();
                sb.append("o_f");
                t_oficinas t_oficinas4 = t_oficinas.this;
                sb.append(t_oficinas4.f9614r[t_oficinas4.f9616t]);
                sb.append("_modif");
                edit.putBoolean(sb.toString(), false);
                edit.commit();
                t_oficinas t_oficinas5 = t_oficinas.this;
                int[][] iArr = t_oficinas5.f9615s;
                int i = t_oficinas5.f9616t;
                int i2 = iArr[i][0];
                int i3 = iArr[i][1];
                if (i3 == 1) {
                    t_oficinas5.f9609m.f7237P1[i2].f7836u = false;
                } else if (i3 == 2) {
                    t_oficinas5.f9609m.f7237P1[i2].f7837v = false;
                } else if (i3 == 3) {
                    t_oficinas5.f9609m.f7237P1[i2].f7838w = false;
                } else if (i3 == 4) {
                    t_oficinas5.f9609m.f7237P1[i2].f7839x = false;
                }
            }
            t_oficinas t_oficinas6 = t_oficinas.this;
            int i4 = t_oficinas6.f9616t + 1;
            t_oficinas6.f9616t = i4;
            if (i4 < t_oficinas6.f9617u) {
                new C2392j().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.x.t_oficinas$k */
    private class C2393k {

        /* renamed from: a */
        int f9640a;

        /* renamed from: b */
        int f9641b;

        /* renamed from: c */
        int f9642c;

        /* renamed from: d */
        String f9643d;

        /* renamed from: e */
        String f9644e;

        /* renamed from: f */
        String f9645f;

        /* renamed from: g */
        String f9646g;

        /* renamed from: h */
        String f9647h;

        /* renamed from: i */
        String f9648i;

        private C2393k() {
        }
    }

    /* renamed from: a */
    private void m8851a(Context context) {
        this.f6662h = new C2388h(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9609m.mo7510j0(view, this);
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
                    if (this.f9609m.f7427t4 != 2) {
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
    public void mo8813b() {
        int q0 = this.f9609m.mo7522q0(this);
        int i = this.f9609m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9608B = listView;
            this.f9609m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9609m.f7231O1;
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
            int[] iArr = this.f9609m.f7249R1;
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
        if (this.f9622z) {
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
        if (!this.f6659e || this.f9610n || !this.f9609m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9610n = true;
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
        if (view.getId() == R.id.ll_tel1) {
            try {
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((TextView) view.findViewById(R.id.tv_tel1)).getText())));
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.ll_tel2) {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((TextView) view.findViewById(R.id.tv_tel2)).getText())));
        } else if (view.getId() == R.id.ll_chat) {
            startActivityForResult(new Intent(this, chat.class), 0);
        } else if (view.getId() == R.id.ll_email) {
            Intent intent = new Intent(this, contactar.class);
            intent.putExtra("idofic", (Integer) view.getTag());
            Bundle bundle = this.f9618v;
            if (bundle != null && bundle.containsKey("msg_predefinido")) {
                intent.putExtra("msg_predefinido", this.f9618v.getString("msg_predefinido"));
            }
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.ll_url) {
            TextView textView = (TextView) view.findViewById(R.id.tv_url);
            String str9 = (String) textView.getText();
            if (textView.getTag().equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                this.f9609m.mo7497c(this, str9);
                return;
            }
            Intent intent2 = new Intent(this, t_url.class);
            intent2.putExtra("url", str9);
            startActivityForResult(intent2, 0);
        } else if (view.getId() == R.id.btn_vermapa) {
            C2393k kVar = (C2393k) view.getTag();
            Intent intent3 = new Intent(this, t_mapa_web.class);
            intent3.putExtra("x", kVar.f9640a);
            intent3.putExtra("y", kVar.f9641b);
            intent3.putExtra("z", kVar.f9642c);
            intent3.putExtra("titulo", kVar.f9643d);
            intent3.putExtra("dir1", kVar.f9644e);
            intent3.putExtra("dir2", kVar.f9645f);
            intent3.putExtra("cp", kVar.f9646g);
            intent3.putExtra("pob", kVar.f9647h);
            intent3.putExtra("prov", kVar.f9648i);
            startActivityForResult(intent3, 0);
        } else {
            String str10 = this.f9609m.f7251R3;
            if ((str10 == null || str10.equals("")) && (((str = this.f9609m.f7281W3) == null || str.equals("")) && (((str2 = this.f9609m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9609m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9609m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9609m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9609m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9609m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9609m.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str11 = this.f9609m.f7251R3;
            if (str11 != null && !str11.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f9609m.f7251R3);
            }
            String str12 = this.f9609m.f7245Q3;
            if (str12 != null) {
                str12.equals("");
            }
            String str13 = this.f9609m.f7269U3;
            if (str13 != null && !str13.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f9609m.f7269U3);
            }
            String str14 = this.f9609m.f7275V3;
            if (str14 != null && !str14.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f9609m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:213:0x0979  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0a58  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0b32  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0c0c  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0cdf  */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            british.x.config r2 = (british.p015x.C1692config) r2
            r0.f9609m = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m8851a(r0)
            british.x.t_oficinas$a r2 = new british.x.t_oficinas$a
            r2.<init>()
            r0.f6666l = r2
            british.x.config r2 = r0.f9609m
            java.lang.String r2 = r2.f7417s1
            java.lang.String r3 = "FFFFFFFF"
            java.lang.String r2 = british.p015x.C1692config.m8189h(r3, r2)
            r0.f6656b = r2
            android.content.Intent r2 = r17.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f9618v = r2
            java.lang.String r3 = "es_root"
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x004f
            if (r2 == 0) goto L_0x004b
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x004b
            android.os.Bundle r2 = r0.f9618v
            boolean r2 = r2.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            r0.f6659e = r2
            goto L_0x0060
        L_0x004f:
            boolean r2 = r1.containsKey(r3)
            if (r2 == 0) goto L_0x005d
            boolean r2 = r1.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r0.f6659e = r2
        L_0x0060:
            super.onCreate(r18)
            r2 = 2131558672(0x7f0d0110, float:1.8742666E38)
            r0.setContentView(r2)
            r17.mo8813b()
            british.x.config r2 = r0.f9609m
            r2.mo7486N0(r0, r5)
            java.lang.String r2 = "search"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.SearchManager r2 = (android.app.SearchManager) r2
            british.x.t_oficinas$b r3 = new british.x.t_oficinas$b
            r3.<init>()
            r2.setOnCancelListener(r3)
            british.x.t_oficinas$c r3 = new british.x.t_oficinas$c
            r3.<init>()
            r2.setOnDismissListener(r3)
            if (r1 != 0) goto L_0x00ae
            british.x.config r2 = r0.f9609m
            android.os.Bundle r3 = r0.f9618v
            if (r3 == 0) goto L_0x009b
            java.lang.String r6 = "ad_entrar"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x009b
            r3 = 1
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            android.os.Bundle r6 = r0.f9618v
            if (r6 == 0) goto L_0x00aa
            java.lang.String r7 = "fb_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00aa
            r6 = 1
            goto L_0x00ab
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            r2.mo7503f1(r0, r3, r6)
        L_0x00ae:
            british.x.config r2 = r0.f9609m
            british.x.c r2 = r2.mo7474A0(r0, r5)
            r0.f9621y = r2
            british.x.config r2 = r0.f9609m
            int r3 = r2.f7318d
            java.lang.String r6 = r0.f6656b
            r2.mo7488Q0(r0, r3, r6, r1)
            java.lang.String r1 = "sh"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r5)
            r0.f9607A = r1
            british.x.config r2 = r0.f9609m
            int r2 = r2.f7163D
            if (r2 <= 0) goto L_0x00d0
            r1.registerOnSharedPreferenceChangeListener(r0)
        L_0x00d0:
            british.x.config r1 = r0.f9609m
            int r1 = r1.f7163D
            if (r1 <= 0) goto L_0x010b
            android.content.SharedPreferences r1 = r0.f9607A
            java.lang.String r2 = "fondo_v_act"
            int r1 = r1.getInt(r2, r5)
            british.x.config r2 = r0.f9609m
            int r3 = r2.f7163D
            if (r1 != r3) goto L_0x010b
            r1 = 2131362370(0x7f0a0242, float:1.8344519E38)
            android.view.View r3 = r0.findViewById(r1)     // Catch:{ Exception -> 0x010a }
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch:{ Exception -> 0x010a }
            british.x.config r6 = r0.f9609m     // Catch:{ Exception -> 0x010a }
            boolean r6 = r6.f7145A     // Catch:{ Exception -> 0x010a }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x010a }
            british.x.config r7 = r0.f9609m     // Catch:{ Exception -> 0x010a }
            int r7 = r7.f7157C     // Catch:{ Exception -> 0x010a }
            r2.mo7514k1(r3, r6, r7)     // Catch:{ Exception -> 0x010a }
            british.x.config r2 = r0.f9609m     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = "fondo"
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ Exception -> 0x010a }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x010a }
            r2.mo7493Y(r3, r1)     // Catch:{ Exception -> 0x010a }
            goto L_0x010b
        L_0x010a:
        L_0x010b:
            r1 = 2131362527(0x7f0a02df, float:1.8344837E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.WindowManager r2 = r17.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 13
            if (r3 < r6) goto L_0x012d
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r2.getSize(r3)
            int r2 = r3.x
            goto L_0x0131
        L_0x012d:
            int r2 = r2.getWidth()
        L_0x0131:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r17)
            r0.f9617u = r5
            british.x.config r6 = r0.f9609m
            british.x.i[] r6 = r6.f7237P1
            int r7 = r6.length
            r8 = 4
            int r7 = r7 * 4
            int[] r7 = new int[r7]
            r0.f9614r = r7
            int r7 = r6.length
            int r7 = r7 * 4
            android.widget.ImageView[] r7 = new android.widget.ImageView[r7]
            r0.f9612p = r7
            int r7 = r6.length
            int r7 = r7 * 4
            android.widget.ProgressBar[] r7 = new android.widget.ProgressBar[r7]
            r0.f9613q = r7
            int r6 = r6.length
            int r6 = r6 * 4
            r7 = 2
            int[] r9 = new int[r7]
            r9[r4] = r7
            r9[r5] = r6
            java.lang.Class<int> r6 = int.class
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r9)
            int[][] r6 = (int[][]) r6
            r0.f9615s = r6
            r6 = 0
        L_0x0166:
            british.x.config r9 = r0.f9609m
            british.x.i[] r10 = r9.f7237P1
            int r11 = r10.length
            r13 = 0
            java.lang.String r14 = "#"
            java.lang.String r15 = ""
            if (r6 >= r11) goto L_0x0d5c
            r9 = r10[r6]
            r0.f9619w = r9
            android.content.res.Resources r9 = r17.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r10 = 1140457472(0x43fa0000, float:500.0)
            float r9 = r9 * r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            if (r2 >= r9) goto L_0x0192
            r9 = 2131558671(0x7f0d010f, float:1.8742664E38)
            android.view.View r9 = r3.inflate(r9, r13)
            goto L_0x0199
        L_0x0192:
            r9 = 2131558670(0x7f0d010e, float:1.8742662E38)
            android.view.View r9 = r3.inflate(r9, r13)
        L_0x0199:
            r12 = 2131363169(0x7f0a0561, float:1.834614E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7382n1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x01c6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7382n1
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r12.setTextColor(r7)
        L_0x01c6:
            british.x.i r7 = r0.f9619w
            java.lang.String r7 = r7.f7816a
            r12.setText(r7)
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7389o1
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x01f8
            r7 = 2131363196(0x7f0a057c, float:1.8346194E38)
            android.view.View r7 = r9.findViewById(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r12 = r0.f9609m
            java.lang.String r12 = r12.f7389o1
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setBackgroundColor(r8)
        L_0x01f8:
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7396p1
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0235
            android.content.res.Resources r7 = r17.getResources()
            r8 = 2131231343(0x7f08026f, float:1.8078764E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r12 = r0.f9609m
            java.lang.String r12 = r12.f7396p1
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r8, r12)
            r8 = 2131362276(0x7f0a01e4, float:1.8344328E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r7)
        L_0x0235:
            british.x.i r7 = r0.f9619w
            java.lang.String r7 = r7.f7822g
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0278
            r7 = 2131363106(0x7f0a0522, float:1.8346011E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x026c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r12 = r0.f9609m
            java.lang.String r12 = r12.f7403q1
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setTextColor(r8)
        L_0x026c:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7822g
            r7.setText(r8)
            r7.setVisibility(r5)
            r7 = 1
            goto L_0x0279
        L_0x0278:
            r7 = 0
        L_0x0279:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7823h
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x02bb
            r7 = 2131363107(0x7f0a0523, float:1.8346013E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x02b0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r12 = r0.f9609m
            java.lang.String r12 = r12.f7403q1
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setTextColor(r8)
        L_0x02b0:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7823h
            r7.setText(r8)
            r7.setVisibility(r5)
            r7 = 1
        L_0x02bb:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7824i
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x02ca
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7824i
            goto L_0x02cb
        L_0x02ca:
            r8 = r15
        L_0x02cb:
            british.x.i r12 = r0.f9619w
            java.lang.String r12 = r12.f7825j
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x02ff
            boolean r12 = r8.equals(r15)
            if (r12 != 0) goto L_0x02ec
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r8 = " "
            r12.append(r8)
            java.lang.String r8 = r12.toString()
        L_0x02ec:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7825j
            r12.append(r8)
            java.lang.String r8 = r12.toString()
        L_0x02ff:
            boolean r12 = r8.equals(r15)
            if (r12 != 0) goto L_0x0339
            r7 = 2131363098(0x7f0a051a, float:1.8345995E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            british.x.config r12 = r0.f9609m
            java.lang.String r12 = r12.f7403q1
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x0332
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7403q1
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r7.setTextColor(r4)
        L_0x0332:
            r7.setText(r8)
            r7.setVisibility(r5)
            r7 = 1
        L_0x0339:
            british.x.i r4 = r0.f9619w
            java.lang.String r4 = r4.f7826k
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x037b
            r4 = 2131363156(0x7f0a0554, float:1.8346113E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7403q1
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0370
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setTextColor(r7)
        L_0x0370:
            british.x.i r7 = r0.f9619w
            java.lang.String r7 = r7.f7826k
            r4.setText(r7)
            r4.setVisibility(r5)
            r7 = 1
        L_0x037b:
            british.x.i r4 = r0.f9619w
            java.lang.String r4 = r4.f7817b
            boolean r4 = r4.equals(r15)
            r8 = 2131231511(0x7f080317, float:1.8079105E38)
            r12 = 2131231334(0x7f080266, float:1.8078746E38)
            if (r4 != 0) goto L_0x0446
            r4 = 2131363166(0x7f0a055e, float:1.8346133E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            boolean r11 = r11.equals(r15)
            if (r11 != 0) goto L_0x03b8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7403q1
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            r4.setTextColor(r10)
        L_0x03b8:
            british.x.i r10 = r0.f9619w
            java.lang.String r10 = r10.f7817b
            r4.setText(r10)
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x03f9
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7410r1
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r10, r11)
            r10 = 2131362408(0x7f0a0268, float:1.8344596E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r10.setImageDrawable(r4)
        L_0x03f9:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7417s1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0433
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7417s1
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r10, r11)
            r10 = 2131362409(0x7f0a0269, float:1.8344598E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r10.setImageDrawable(r4)
        L_0x0433:
            r4 = 2131362534(0x7f0a02e6, float:1.8344851E38)
            android.view.View r10 = r9.findViewById(r4)
            r10.setOnClickListener(r0)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
            goto L_0x0447
        L_0x0446:
            r4 = 0
        L_0x0447:
            british.x.i r10 = r0.f9619w
            java.lang.String r10 = r10.f7818c
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x050b
            r4 = 2131363167(0x7f0a055f, float:1.8346135E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7403q1
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x047e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            r4.setTextColor(r10)
        L_0x047e:
            british.x.i r10 = r0.f9619w
            java.lang.String r10 = r10.f7818c
            r4.setText(r10)
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x04bf
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7410r1
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r10)
            r8 = 2131362410(0x7f0a026a, float:1.83446E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x04bf:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7417s1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x04f9
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7417s1
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r10)
            r8 = 2131362411(0x7f0a026b, float:1.8344602E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x04f9:
            r4 = 2131362535(0x7f0a02e7, float:1.8344853E38)
            android.view.View r8 = r9.findViewById(r4)
            r8.setOnClickListener(r0)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
        L_0x050b:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7819d
            boolean r8 = r8.equals(r15)
            java.lang.String r10 = "FF000000"
            if (r8 != 0) goto L_0x05b5
            r4 = 2131363123(0x7f0a0533, float:1.8346046E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0544
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r4.setTextColor(r8)
        L_0x0544:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7819d
            r4.setText(r8)
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x05aa
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0577
            r4 = 2131362374(0x7f0a0246, float:1.8344527E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r8 = r17.getResources()
            r11 = 2131231475(0x7f0802f3, float:1.8079032E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r11)
            r4.setImageDrawable(r8)
            goto L_0x05aa
        L_0x0577:
            android.content.res.Resources r4 = r17.getResources()
            r8 = 2131231474(0x7f0802f2, float:1.807903E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7410r1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r11)
            r8 = 2131362374(0x7f0a0246, float:1.8344527E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x05aa:
            r4 = 2131362507(0x7f0a02cb, float:1.8344797E38)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
        L_0x05b5:
            british.x.i r8 = r0.f9619w
            boolean r8 = r8.f7841z
            if (r8 == 0) goto L_0x0680
            r4 = 2131363088(0x7f0a0510, float:1.8345975E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x05e8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r4.setTextColor(r8)
        L_0x05e8:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0625
            android.content.res.Resources r4 = r17.getResources()
            r8 = 2131230955(0x7f0800eb, float:1.8077977E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7410r1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r11)
            r8 = 2131362348(0x7f0a022c, float:1.8344474E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x0625:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7417s1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x065f
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7417s1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r11)
            r8 = 2131362347(0x7f0a022b, float:1.8344472E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x065f:
            r4 = 2131362478(0x7f0a02ae, float:1.8344738E38)
            android.view.View r8 = r9.findViewById(r4)
            british.x.i r11 = r0.f9619w
            int r11 = r11.f7827l
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.setTag(r11)
            android.view.View r8 = r9.findViewById(r4)
            r8.setOnClickListener(r0)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
        L_0x0680:
            british.x.i r8 = r0.f9619w
            boolean r8 = r8.f7840y
            if (r8 == 0) goto L_0x078d
            r4 = 2131363108(0x7f0a0524, float:1.8346016E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x06b3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r4.setTextColor(r8)
        L_0x06b3:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7820e
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x06c5
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7820e
            r4.setText(r8)
            goto L_0x06d3
        L_0x06c5:
            android.content.res.Resources r8 = r17.getResources()
            r11 = 2131820782(0x7f1100ee, float:1.9274289E38)
            java.lang.String r8 = r8.getString(r11)
            r4.setText(r8)
        L_0x06d3:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0732
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x06ff
            r4 = 2131362353(0x7f0a0231, float:1.8344484E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r8 = r17.getResources()
            r11 = 2131231009(0x7f080121, float:1.8078087E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r11)
            r4.setImageDrawable(r8)
            goto L_0x0732
        L_0x06ff:
            android.content.res.Resources r4 = r17.getResources()
            r8 = 2131231007(0x7f08011f, float:1.8078083E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7410r1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r11)
            r8 = 2131362353(0x7f0a0231, float:1.8344484E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x0732:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7417s1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x076c
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7417s1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r11)
            r8 = 2131362354(0x7f0a0232, float:1.8344486E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x076c:
            r4 = 2131362495(0x7f0a02bf, float:1.8344772E38)
            android.view.View r8 = r9.findViewById(r4)
            british.x.i r11 = r0.f9619w
            int r11 = r11.f7827l
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.setTag(r11)
            android.view.View r8 = r9.findViewById(r4)
            r8.setOnClickListener(r0)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
        L_0x078d:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7821f
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0887
            r4 = 2131363174(0x7f0a0566, float:1.834615E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7403q1
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x07c4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7403q1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r4.setTextColor(r8)
        L_0x07c4:
            british.x.i r8 = r0.f9619w
            java.lang.String r8 = r8.f7821f
            r4.setText(r8)
            british.x.i r8 = r0.f9619w
            boolean r8 = r8.f7815B
            if (r8 == 0) goto L_0x07d4
            java.lang.String r8 = "1"
            goto L_0x07d6
        L_0x07d4:
            java.lang.String r8 = "0"
        L_0x07d6:
            r4.setTag(r8)
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0838
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7410r1
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0805
            r4 = 2131362417(0x7f0a0271, float:1.8344614E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r8 = r17.getResources()
            r10 = 2131231522(0x7f080322, float:1.8079127E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r10)
            r4.setImageDrawable(r8)
            goto L_0x0838
        L_0x0805:
            android.content.res.Resources r4 = r17.getResources()
            r8 = 2131231523(0x7f080323, float:1.807913E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7410r1
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r10)
            r8 = 2131362417(0x7f0a0271, float:1.8344614E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x0838:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7417s1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0872
            android.content.res.Resources r4 = r17.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7417s1
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r8, r10)
            r8 = 2131362418(0x7f0a0272, float:1.8344616E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r4)
        L_0x0872:
            r4 = 2131362540(0x7f0a02ec, float:1.8344863E38)
            android.view.View r4 = r9.findViewById(r4)
            r4.setOnClickListener(r0)
            r4 = 2131362540(0x7f0a02ec, float:1.8344863E38)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 1
        L_0x0887:
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7833r
            if (r8 == 0) goto L_0x090d
            r7 = 2131361961(0x7f0a00a9, float:1.834369E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            british.x.t_oficinas$k r8 = new british.x.t_oficinas$k
            r8.<init>()
            british.x.i r10 = r0.f9619w
            int r11 = r10.f7833r
            r8.f9640a = r11
            int r11 = r10.f7834s
            r8.f9641b = r11
            int r11 = r10.f7835t
            r8.f9642c = r11
            java.lang.String r11 = r10.f7816a
            r8.f9643d = r11
            java.lang.String r11 = r10.f7822g
            r8.f9644e = r11
            java.lang.String r11 = r10.f7823h
            r8.f9645f = r11
            java.lang.String r11 = r10.f7824i
            r8.f9646g = r11
            java.lang.String r11 = r10.f7825j
            r8.f9647h = r11
            java.lang.String r10 = r10.f7826k
            r8.f9648i = r10
            british.x.config r10 = r0.f9609m
            java.lang.String r10 = r10.f7417s1
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0903
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7417s1
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            r7.setBackgroundColor(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7417s1
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            boolean r10 = british.p015x.C1692config.m8153I(r10)
            if (r10 == 0) goto L_0x0903
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setTextColor(r10)
        L_0x0903:
            r7.setTag(r8)
            r7.setOnClickListener(r0)
            r7.setVisibility(r5)
            r7 = 1
        L_0x090d:
            if (r7 == 0) goto L_0x0919
            r8 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            android.view.View r8 = r9.findViewById(r8)
            r8.setVisibility(r5)
        L_0x0919:
            if (r4 == 0) goto L_0x0925
            r8 = 2131362484(0x7f0a02b4, float:1.834475E38)
            android.view.View r8 = r9.findViewById(r8)
            r8.setVisibility(r5)
        L_0x0925:
            if (r7 == 0) goto L_0x0947
            if (r4 == 0) goto L_0x0947
            android.content.res.Resources r4 = r17.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r7 = 1140457472(0x43fa0000, float:500.0)
            float r4 = r4 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r7
            int r4 = (int) r4
            if (r2 >= r4) goto L_0x0947
            r4 = 2131363197(0x7f0a057d, float:1.8346196E38)
            android.view.View r4 = r9.findViewById(r4)
            r4.setVisibility(r5)
        L_0x0947:
            british.x.config r4 = r0.f9609m
            java.lang.String r4 = r4.f7355j1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x096c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7355j1
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            boolean r4 = british.p015x.C1692config.m8153I(r4)
            if (r4 == 0) goto L_0x096c
            r4 = 1
            goto L_0x096d
        L_0x096c:
            r4 = 0
        L_0x096d:
            british.x.i r7 = r0.f9619w
            int r7 = r7.f7828m
            r8 = 20
            java.lang.String r10 = ".png"
            java.lang.String r11 = "o_f"
            if (r7 <= 0) goto L_0x0a51
            r7 = 2131362501(0x7f0a02c5, float:1.8344784E38)
            android.view.View r7 = r9.findViewById(r7)
            r7.setVisibility(r5)
            r7 = 2131362397(0x7f0a025d, float:1.8344573E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            british.x.i r12 = r0.f9619w
            boolean r12 = r12.f7814A
            if (r12 == 0) goto L_0x09b6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            british.x.i r13 = r0.f9619w
            int r13 = r13.f7829n
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.io.File r12 = r0.getFileStreamPath(r12)
            r0.f9620x = r12
            british.x.t_oficinas$d r12 = new british.x.t_oficinas$d
            r12.<init>()
            r7.setOnClickListener(r12)
        L_0x09b6:
            if (r4 == 0) goto L_0x09c2
            r12 = 2131362760(0x7f0a03c8, float:1.834531E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            goto L_0x09cb
        L_0x09c2:
            r12 = 2131362759(0x7f0a03c7, float:1.8345308E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
        L_0x09cb:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 <= r8) goto L_0x09d6
            british.x.config r13 = r0.f9609m
            java.lang.String r13 = r13.f7417s1
            british.p015x.C1692config.m8168S0(r12, r13)
        L_0x09d6:
            british.x.i r13 = r0.f9619w
            boolean r8 = r13.f7836u
            if (r8 == 0) goto L_0x09ff
            int[] r8 = r0.f9614r
            int r5 = r0.f9617u
            int r13 = r13.f7829n
            r8[r5] = r13
            android.widget.ImageView[] r8 = r0.f9612p
            r8[r5] = r7
            android.widget.ProgressBar[] r7 = r0.f9613q
            r7[r5] = r12
            int[][] r7 = r0.f9615s
            r8 = r7[r5]
            r13 = 0
            r8[r13] = r6
            r7 = r7[r5]
            r8 = 1
            r7[r8] = r8
            int r5 = r5 + r8
            r0.f9617u = r5
            r12.setVisibility(r13)
            goto L_0x0a51
        L_0x09ff:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7829n
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r0.getFileStreamPath(r8)
            boolean r12 = r8.exists()
            if (r12 != 0) goto L_0x0a32
            java.io.File r5 = r0.getFileStreamPath(r5)
            r5.renameTo(r8)
        L_0x0a32:
            british.x.config r5 = r0.f9609m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            british.x.i r12 = r0.f9619w
            int r12 = r12.f7829n
            r8.append(r12)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r5.mo7493Y(r8, r7)
            r5 = 0
            r7.setVisibility(r5)
        L_0x0a51:
            british.x.i r5 = r0.f9619w
            int r5 = r5.f7828m
            r7 = 1
            if (r5 <= r7) goto L_0x0b2b
            r5 = 2131362398(0x7f0a025e, float:1.8344575E38)
            android.view.View r5 = r9.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            british.x.i r7 = r0.f9619w
            boolean r7 = r7.f7814A
            if (r7 == 0) goto L_0x0a8b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7830o
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r7 = r0.getFileStreamPath(r7)
            r0.f9620x = r7
            british.x.t_oficinas$e r7 = new british.x.t_oficinas$e
            r7.<init>()
            r5.setOnClickListener(r7)
        L_0x0a8b:
            if (r4 == 0) goto L_0x0a97
            r7 = 2131362762(0x7f0a03ca, float:1.8345314E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            goto L_0x0aa0
        L_0x0a97:
            r7 = 2131362761(0x7f0a03c9, float:1.8345312E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
        L_0x0aa0:
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 20
            if (r8 <= r12) goto L_0x0aad
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7417s1
            british.p015x.C1692config.m8168S0(r7, r8)
        L_0x0aad:
            british.x.i r8 = r0.f9619w
            boolean r12 = r8.f7837v
            if (r12 == 0) goto L_0x0ad9
            int[] r12 = r0.f9614r
            int r13 = r0.f9617u
            int r8 = r8.f7830o
            r12[r13] = r8
            android.widget.ImageView[] r8 = r0.f9612p
            r8[r13] = r5
            android.widget.ProgressBar[] r5 = r0.f9613q
            r5[r13] = r7
            int[][] r5 = r0.f9615s
            r8 = r5[r13]
            r12 = 0
            r8[r12] = r6
            r5 = r5[r13]
            r8 = 2
            r16 = 1
            r5[r16] = r8
            int r13 = r13 + 1
            r0.f9617u = r13
            r7.setVisibility(r12)
            goto L_0x0b2b
        L_0x0ad9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7830o
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r0.getFileStreamPath(r8)
            boolean r12 = r8.exists()
            if (r12 != 0) goto L_0x0b0c
            java.io.File r7 = r0.getFileStreamPath(r7)
            r7.renameTo(r8)
        L_0x0b0c:
            british.x.config r7 = r0.f9609m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            british.x.i r12 = r0.f9619w
            int r12 = r12.f7830o
            r8.append(r12)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.mo7493Y(r8, r5)
            r7 = 0
            r5.setVisibility(r7)
        L_0x0b2b:
            british.x.i r5 = r0.f9619w
            int r5 = r5.f7828m
            r7 = 2
            if (r5 <= r7) goto L_0x0c05
            r5 = 2131362399(0x7f0a025f, float:1.8344577E38)
            android.view.View r5 = r9.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            british.x.i r7 = r0.f9619w
            boolean r7 = r7.f7814A
            if (r7 == 0) goto L_0x0b65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7831p
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r7 = r0.getFileStreamPath(r7)
            r0.f9620x = r7
            british.x.t_oficinas$f r7 = new british.x.t_oficinas$f
            r7.<init>()
            r5.setOnClickListener(r7)
        L_0x0b65:
            if (r4 == 0) goto L_0x0b71
            r7 = 2131362764(0x7f0a03cc, float:1.8345318E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            goto L_0x0b7a
        L_0x0b71:
            r7 = 2131362763(0x7f0a03cb, float:1.8345316E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
        L_0x0b7a:
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 20
            if (r8 <= r12) goto L_0x0b87
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7417s1
            british.p015x.C1692config.m8168S0(r7, r8)
        L_0x0b87:
            british.x.i r8 = r0.f9619w
            boolean r12 = r8.f7838w
            if (r12 == 0) goto L_0x0bb3
            int[] r12 = r0.f9614r
            int r13 = r0.f9617u
            int r8 = r8.f7831p
            r12[r13] = r8
            android.widget.ImageView[] r8 = r0.f9612p
            r8[r13] = r5
            android.widget.ProgressBar[] r5 = r0.f9613q
            r5[r13] = r7
            int[][] r5 = r0.f9615s
            r8 = r5[r13]
            r12 = 0
            r8[r12] = r6
            r5 = r5[r13]
            r8 = 3
            r16 = 1
            r5[r16] = r8
            int r13 = r13 + 1
            r0.f9617u = r13
            r7.setVisibility(r12)
            goto L_0x0c05
        L_0x0bb3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7831p
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r0.getFileStreamPath(r8)
            boolean r12 = r8.exists()
            if (r12 != 0) goto L_0x0be6
            java.io.File r7 = r0.getFileStreamPath(r7)
            r7.renameTo(r8)
        L_0x0be6:
            british.x.config r7 = r0.f9609m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            british.x.i r12 = r0.f9619w
            int r12 = r12.f7831p
            r8.append(r12)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.mo7493Y(r8, r5)
            r7 = 0
            r5.setVisibility(r7)
        L_0x0c05:
            british.x.i r5 = r0.f9619w
            int r5 = r5.f7828m
            r7 = 3
            if (r5 <= r7) goto L_0x0cdf
            r5 = 2131362400(0x7f0a0260, float:1.834458E38)
            android.view.View r5 = r9.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            british.x.i r7 = r0.f9619w
            boolean r7 = r7.f7814A
            if (r7 == 0) goto L_0x0c3f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7832q
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r7 = r0.getFileStreamPath(r7)
            r0.f9620x = r7
            british.x.t_oficinas$g r7 = new british.x.t_oficinas$g
            r7.<init>()
            r5.setOnClickListener(r7)
        L_0x0c3f:
            if (r4 == 0) goto L_0x0c4b
            r4 = 2131362766(0x7f0a03ce, float:1.8345322E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            goto L_0x0c54
        L_0x0c4b:
            r4 = 2131362765(0x7f0a03cd, float:1.834532E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
        L_0x0c54:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 20
            if (r7 <= r8) goto L_0x0c61
            british.x.config r7 = r0.f9609m
            java.lang.String r7 = r7.f7417s1
            british.p015x.C1692config.m8168S0(r4, r7)
        L_0x0c61:
            british.x.i r7 = r0.f9619w
            boolean r8 = r7.f7839x
            if (r8 == 0) goto L_0x0c8b
            int[] r8 = r0.f9614r
            int r10 = r0.f9617u
            int r7 = r7.f7832q
            r8[r10] = r7
            android.widget.ImageView[] r7 = r0.f9612p
            r7[r10] = r5
            android.widget.ProgressBar[] r5 = r0.f9613q
            r5[r10] = r4
            int[][] r5 = r0.f9615s
            r7 = r5[r10]
            r8 = 0
            r7[r8] = r6
            r5 = r5[r10]
            r7 = 4
            r11 = 1
            r5[r11] = r7
            int r10 = r10 + r11
            r0.f9617u = r10
            r4.setVisibility(r8)
            goto L_0x0ce0
        L_0x0c8b:
            r7 = 4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            british.x.i r8 = r0.f9619w
            int r8 = r8.f7832q
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r0.getFileStreamPath(r8)
            boolean r12 = r8.exists()
            if (r12 != 0) goto L_0x0cbf
            java.io.File r4 = r0.getFileStreamPath(r4)
            r4.renameTo(r8)
        L_0x0cbf:
            british.x.config r4 = r0.f9609m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            british.x.i r11 = r0.f9619w
            int r11 = r11.f7832q
            r8.append(r11)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r4.mo7493Y(r8, r5)
            r4 = 0
            r5.setVisibility(r4)
            goto L_0x0ce0
        L_0x0cdf:
            r7 = 4
        L_0x0ce0:
            british.x.config r4 = r0.f9609m
            int r5 = r4.f7436v
            r8 = 1
            if (r5 != r8) goto L_0x0d51
            java.lang.String r4 = r4.f7355j1
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0d51
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r8 = 2
            int[] r10 = new int[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7355j1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r11 = 0
            r10[r11] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            british.x.config r11 = r0.f9609m
            java.lang.String r11 = r11.f7361k1
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r11 = 1
            r10[r11] = r8
            r4.<init>(r5, r10)
            r9.setBackgroundDrawable(r4)
            r4 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            british.x.config r8 = r0.f9609m
            java.lang.String r8 = r8.f7361k1
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r4.setBackgroundColor(r5)
        L_0x0d51:
            r1.addView(r9)
            int r6 = r6 + 1
            r4 = 1
            r5 = 0
            r7 = 2
            r8 = 4
            goto L_0x0166
        L_0x0d5c:
            int r1 = r9.f7436v
            if (r1 != 0) goto L_0x0db0
            java.lang.String r1 = r9.f7355j1
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0db0
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r3 = 2
            int[] r3 = new int[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            british.x.config r5 = r0.f9609m
            java.lang.String r5 = r5.f7355j1
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            british.x.config r5 = r0.f9609m
            java.lang.String r5 = r5.f7361k1
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r5 = 1
            r3[r5] = r4
            r1.<init>(r2, r3)
            r2 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setBackgroundDrawable(r1)
        L_0x0db0:
            int r1 = r0.f9617u
            if (r1 <= 0) goto L_0x0dc1
            r1 = 0
            r0.f9616t = r1
            british.x.t_oficinas$j r2 = new british.x.t_oficinas$j
            r2.<init>()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2.execute(r1)
        L_0x0dc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_oficinas.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9609m.f7384n3 == 0 || (cVar3 = this.f9621y) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9609m.f7384n3 == 0 || (cVar2 = this.f9621y) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9609m.f7384n3 == 0 || (cVar = this.f9621y) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
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
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9609m.f7384n3 == 0 || (cVar = this.f9621y) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2391i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9609m.f7384n3 != 0 && (cVar = this.f9621y) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9622z = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9622z) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9622z = true;
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
                this.f9609m.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9609m.f7145A), this.f9609m.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f9609m.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f9622z = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9622z = true;
        C1692config.m8175Y0(this);
    }
}
