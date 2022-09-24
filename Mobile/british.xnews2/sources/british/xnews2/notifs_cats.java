package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
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

public class notifs_cats extends Activity_ext_class implements C1592a, View.OnClickListener, CompoundButton.OnCheckedChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public SharedPreferences f8000m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1692config f8001n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f8002o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f8003p;

    /* renamed from: q */
    private boolean f8004q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f8005r;

    /* renamed from: s */
    private Bundle f8006s;

    /* renamed from: t */
    private C1603c f8007t;

    /* renamed from: u */
    boolean f8008u = false;

    /* renamed from: v */
    ListView f8009v;

    /* renamed from: british.xnews2.notifs_cats$a */
    class C1879a extends AdColonyInterstitialListener {
        C1879a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            notifs_cats notifs_cats = notifs_cats.this;
            if (notifs_cats.f8008u) {
                notifs_cats.abrir_secc(notifs_cats.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            notifs_cats.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            notifs_cats.this.f6661g.cancel();
            notifs_cats notifs_cats = notifs_cats.this;
            notifs_cats.abrir_secc(notifs_cats.f6660f);
        }
    }

    /* renamed from: british.xnews2.notifs_cats$b */
    class C1880b implements SearchManager.OnCancelListener {
        C1880b() {
        }

        public void onCancel() {
            notifs_cats notifs_cats = notifs_cats.this;
            notifs_cats.f6657c = false;
            notifs_cats.setResult(0);
        }
    }

    /* renamed from: british.xnews2.notifs_cats$c */
    class C1881c implements SearchManager.OnDismissListener {
        C1881c() {
        }

        public void onDismiss() {
            notifs_cats.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.notifs_cats$d */
    class C1882d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8013a;

        /* renamed from: british.xnews2.notifs_cats$d$a */
        class C1883a extends FullScreenContentCallback {
            C1883a() {
            }

            public void onAdDismissedFullScreenContent() {
                notifs_cats notifs_cats = notifs_cats.this;
                if (notifs_cats.f8008u) {
                    notifs_cats.abrir_secc(notifs_cats.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                notifs_cats notifs_cats = notifs_cats.this;
                notifs_cats.abrir_secc(notifs_cats.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.notifs_cats$d$b */
        class C1884b implements OnUserEarnedRewardListener {
            C1884b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1882d dVar = C1882d.this;
                notifs_cats.this.f8008u = true;
                C1692config.m8175Y0(dVar.f8013a);
            }
        }

        C1882d(Context context) {
            this.f8013a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            notifs_cats.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1883a());
            rewardedAd.show((Activity) this.f8013a, new C1884b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (!notifs_cats.this.f8001n.mo7502f(this.f8013a, notifs_cats.this.f6663i)) {
                notifs_cats.this.f6661g.cancel();
                notifs_cats notifs_cats = notifs_cats.this;
                notifs_cats.abrir_secc(notifs_cats.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.notifs_cats$e */
    class C1885e implements AdDisplayListener {
        C1885e() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            notifs_cats notifs_cats = notifs_cats.this;
            if (notifs_cats.f8008u) {
                notifs_cats.abrir_secc(notifs_cats.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.notifs_cats$f */
    private class C1886f extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8018a;

        /* renamed from: b */
        String f8019b;

        C1886f(String str, Boolean bool) {
            this.f8018a = bool.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
            this.f8019b = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ae }
                r0.<init>()     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00ae }
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = "/srv/usu_catnotif.php?v=2&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                british.xnews2.notifs_cats r1 = british.xnews2.notifs_cats.this     // Catch:{ Exception -> 0x00ae }
                long r1 = r1.f8002o     // Catch:{ Exception -> 0x00ae }
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                british.xnews2.notifs_cats r1 = british.xnews2.notifs_cats.this     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = r1.f8003p     // Catch:{ Exception -> 0x00ae }
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = "&idcat="
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = r6.f8019b     // Catch:{ Exception -> 0x00ae }
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = "&modo="
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r1 = r6.f8018a     // Catch:{ Exception -> 0x00ae }
                r0.append(r1)     // Catch:{ Exception -> 0x00ae }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ae }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00ae }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00ae }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00ae }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00ae }
                r7 = 1
                r0.setDoInput(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r1.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            L_0x0070:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                if (r3 == 0) goto L_0x008b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r4.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r4.append(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r1.append(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                goto L_0x0070
            L_0x008b:
                java.lang.String r2 = "ANDROID:OK"
                int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r2 = -1
                if (r1 == r2) goto L_0x009c
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r0.disconnect()
                return r7
            L_0x009c:
                r7 = 0
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                r0.disconnect()
                return r7
            L_0x00a5:
                r7 = move-exception
                goto L_0x00b9
            L_0x00a7:
                r7 = r0
                goto L_0x00ae
            L_0x00a9:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00b9
            L_0x00ae:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00a9 }
                if (r7 == 0) goto L_0x00b8
                r7.disconnect()
            L_0x00b8:
                return r0
            L_0x00b9:
                if (r0 == 0) goto L_0x00be
                r0.disconnect()
            L_0x00be:
                goto L_0x00c0
            L_0x00bf:
                throw r7
            L_0x00c0:
                goto L_0x00bf
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.notifs_cats.C1886f.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 1) {
                SharedPreferences.Editor edit = notifs_cats.this.f8000m.edit();
                edit.putString("catsnotif_" + this.f8019b + "_def", this.f8018a);
                edit.commit();
            }
        }
    }

    /* renamed from: british.xnews2.notifs_cats$g */
    private class C1887g extends AsyncTask<String, Void, String> {
        private C1887g() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088 }
                r0.<init>()     // Catch:{ Exception -> 0x0088 }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x0088 }
                r0.append(r1)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r1 = "/srv/cargar_catsnotif.php?v=2&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0088 }
                british.xnews2.notifs_cats r1 = british.xnews2.notifs_cats.this     // Catch:{ Exception -> 0x0088 }
                long r1 = r1.f8002o     // Catch:{ Exception -> 0x0088 }
                r0.append(r1)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0088 }
                british.xnews2.notifs_cats r1 = british.xnews2.notifs_cats.this     // Catch:{ Exception -> 0x0088 }
                java.lang.String r1 = r1.f8003p     // Catch:{ Exception -> 0x0088 }
                r0.append(r1)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0088 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0088 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0088 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0088 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0088 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r6.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
            L_0x005c:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                if (r2 == 0) goto L_0x0077
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r3.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r3.append(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r6.append(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                goto L_0x005c
            L_0x0077:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                r0.disconnect()
                return r6
            L_0x007f:
                r6 = move-exception
                goto L_0x0090
            L_0x0081:
                r6 = r0
                goto L_0x0088
            L_0x0083:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0090
            L_0x0088:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x008f
                r6.disconnect()
            L_0x008f:
                return r0
            L_0x0090:
                if (r0 == 0) goto L_0x0095
                r0.disconnect()
            L_0x0095:
                goto L_0x0097
            L_0x0096:
                throw r6
            L_0x0097:
                goto L_0x0096
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.notifs_cats.C1887g.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String[] strArr;
            String str2 = str;
            try {
                notifs_cats.this.findViewById(R.id.pb_cargarcats).setVisibility(8);
                notifs_cats.this.findViewById(R.id.pb_cargarcats_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str2.contains("ANDROID:OK DATOS:")) {
                int indexOf = str2.indexOf("DATOS:") + 6;
                String[] split = str2.substring(indexOf, str2.indexOf(";", indexOf)).split(",");
                String[] split2 = notifs_cats.this.f8000m.getString("catsnotif_ids", "").split(",");
                SharedPreferences.Editor edit = notifs_cats.this.f8000m.edit();
                for (int i = 0; i < split2.length; i++) {
                    edit.remove("catsnotif_" + split2[i] + "_descr");
                    edit.remove("catsnotif_" + split2[i] + "_def");
                    edit.remove("catsnotif_" + split2[i] + "_sep");
                }
                String str3 = "";
                int i2 = 0;
                while (i2 < split.length) {
                    if (!split[i2].equals("")) {
                        String[] split3 = split[i2].split("-");
                        strArr = split;
                        if (split3.length == 2) {
                            notifs_cats.this.f8001n.f7414r5 = Integer.parseInt(split3[1]);
                            edit.putInt("vcn", Integer.parseInt(split3[1]));
                            edit.putInt("catsnotif_v_aplic", Integer.parseInt(split3[1]));
                        } else {
                            String str4 = split3[0];
                            if (!str3.equals("")) {
                                str3 = str3 + ",";
                            }
                            edit.putString("catsnotif_" + str4 + "_descr", split3[2].replace("@X@", "-").replace("@Y@", ",").replace("@Z@", ";"));
                            edit.putString("catsnotif_" + str4 + "_def", split3[3]);
                            edit.putString("catsnotif_" + str4 + "_sep", split3[1]);
                            str3 = str3 + str4;
                        }
                    } else {
                        strArr = split;
                    }
                    i2++;
                    split = strArr;
                }
                edit.putString("catsnotif_ids", str3);
                notifs_cats.this.f8001n.f7428t5 = !str3.equals("");
                if (str3.equals("")) {
                    edit.putInt("hcn", 0);
                } else {
                    edit.putInt("hcn", 1);
                }
                edit.commit();
                notifs_cats.this.m8344i();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (notifs_cats.this.f8005r) {
                notifs_cats.this.findViewById(R.id.pb_cargarcats_inv).setVisibility(0);
            } else {
                notifs_cats.this.findViewById(R.id.pb_cargarcats).setVisibility(0);
            }
        }
    }

    /* renamed from: g */
    private void m8343g(Context context) {
        this.f6662h = new C1882d(context);
    }

    /* access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: i */
    public void m8344i() {
        String[] strArr;
        LayoutInflater layoutInflater;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llnotifs);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater2 = (LayoutInflater) getSystemService("layout_inflater");
        String[] split = this.f8000m.getString("catsnotif_ids", "").split(",");
        int i = 0;
        while (i < split.length) {
            if (!split[i].equals("")) {
                String str = split[i];
                int i2 = C1692config.f7101A5;
                int i3 = C1692config.f7105E5;
                if (!this.f8005r) {
                    i2 = C1692config.f7103C5;
                    i3 = C1692config.f7106F5;
                }
                SharedPreferences sharedPreferences = this.f8000m;
                if (sharedPreferences.getString("catsnotif_" + str + "_sep", SessionDescription.SUPPORTED_SDP_VERSION).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    LinearLayout linearLayout2 = (LinearLayout) layoutInflater2.inflate(R.layout.notif_sep, (ViewGroup) null);
                    TextView textView = (TextView) linearLayout2.findViewById(R.id.tv_sep);
                    SharedPreferences sharedPreferences2 = this.f8000m;
                    textView.setText(sharedPreferences2.getString("catsnotif_" + str + "_descr", ""));
                    textView.setTextColor(i2);
                    linearLayout2.findViewById(R.id.v_sep).setBackgroundColor(i3);
                    linearLayout.addView(linearLayout2);
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) layoutInflater2.inflate(R.layout.notif_cat, (ViewGroup) null);
                    TextView textView2 = (TextView) linearLayout3.findViewById(R.id.tv_cat);
                    int i4 = Build.VERSION.SDK_INT;
                    layoutInflater = layoutInflater2;
                    if (i4 >= 17) {
                        strArr = split;
                        if (getResources().getBoolean(R.bool.es_rtl)) {
                            textView2.setTextDirection(4);
                        }
                    } else {
                        strArr = split;
                    }
                    SharedPreferences sharedPreferences3 = this.f8000m;
                    textView2.setText(sharedPreferences3.getString("catsnotif_" + str + "_descr", ""));
                    textView2.setTextColor(i2);
                    LinearLayout linearLayout4 = (LinearLayout) linearLayout3.findViewById(R.id.ll_sc);
                    if (i4 > 13) {
                        Switch switchR = new Switch(this);
                        SharedPreferences sharedPreferences4 = this.f8000m;
                        switchR.setChecked(sharedPreferences4.getString("catsnotif_" + str + "_def", SessionDescription.SUPPORTED_SDP_VERSION).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                        switchR.setOnCheckedChangeListener(this);
                        switchR.setTag(R.id.idaux1, str);
                        linearLayout4.addView(switchR);
                    } else {
                        ToggleButton toggleButton = new ToggleButton(this);
                        SharedPreferences sharedPreferences5 = this.f8000m;
                        toggleButton.setChecked(sharedPreferences5.getString("catsnotif_" + str + "_def", SessionDescription.SUPPORTED_SDP_VERSION).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                        toggleButton.setOnCheckedChangeListener(this);
                        toggleButton.setTag(R.id.idaux1, str);
                        linearLayout4.addView(toggleButton);
                    }
                    linearLayout3.findViewById(R.id.v_sep).setBackgroundColor(i3);
                    linearLayout.addView(linearLayout3);
                    i++;
                    layoutInflater2 = layoutInflater;
                    split = strArr;
                }
            }
            layoutInflater = layoutInflater2;
            strArr = split;
            i++;
            layoutInflater2 = layoutInflater;
            split = strArr;
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8001n.mo7510j0(view, this);
        try {
            Intent intent = j0.f7842a;
            if (intent != null && intent.getComponent().getClassName().endsWith(".notifs")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            intent2.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent2);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent3 = j0.f7842a;
            if (intent3 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f8001n.f7427t4 != 2) {
                        intent3.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused2) {
                    }
                } else {
                    startActivityForResult(intent3, 0);
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
    /* renamed from: h */
    public void mo7769h() {
        int q0 = this.f8001n.mo7522q0(this);
        int i = this.f8001n.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8009v = listView;
            this.f8001n.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8001n.f7231O1;
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
            int[] iArr = this.f8001n.f7249R1;
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
        if (this.f8008u) {
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
        if (!this.f6659e || this.f8004q || !this.f8001n.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8004q = true;
        C1692config.m8199t(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        new C1886f((String) compoundButton.getTag(R.id.idaux1), Boolean.valueOf(z)).execute(new String[0]);
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
        if (view.getTag(R.id.idaux1) == null) {
            String str9 = this.f8001n.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f8001n.f7281W3) == null || str.equals("")) && (((str2 = this.f8001n.f7250R2) == null || str2.equals("")) && (((str3 = this.f8001n.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8001n.f7269U3) == null || str4.equals("")) && (((str5 = this.f8001n.f7275V3) == null || str5.equals("")) && (((str6 = this.f8001n.f7358j4) == null || str6.equals("")) && (((str7 = this.f8001n.f7287X3) == null || str7.equals("")) && ((str8 = this.f8001n.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f8001n.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f8001n.f7251R3);
            }
            String str11 = this.f8001n.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f8001n.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f8001n.f7269U3);
            }
            String str13 = this.f8001n.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f8001n.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7769h();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8007t;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8007t;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8007t = this.f8001n.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f8001n = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8343g(this);
        this.f6666l = new C1879a();
        C1692config config2 = this.f8001n;
        this.f6656b = C1692config.m8189h(config2.f7313c1, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f8001n.f7313c1)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.notifs_cats);
        mo7769h();
        this.f8001n.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1880b());
        searchManager.setOnDismissListener(new C1881c());
        this.f8001n.mo7503f1(this, false, false);
        this.f8007t = this.f8001n.mo7474A0(this, false);
        Bundle extras = getIntent().getExtras();
        this.f8006s = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8006s.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8000m = sharedPreferences;
        this.f8002o = sharedPreferences.getLong("idusu", 0);
        this.f8003p = this.f8000m.getString("cod_g", "");
        this.f8005r = C1692config.m8153I("#" + this.f8001n.f7313c1);
        if (!this.f8001n.f7313c1.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8001n.f7313c1), Color.parseColor("#" + this.f8001n.f7319d1)}));
        }
        int i = -16777216;
        if (!this.f8005r) {
            i = -1;
        }
        TextView textView = (TextView) findViewById(R.id.tv_listacatsnotifs);
        textView.setTextColor(i);
        if (!this.f8001n.f7424t1.equals("")) {
            textView.setText(this.f8001n.f7424t1);
        }
        findViewById(R.id.v_listacatsnotifs).setBackgroundColor(i);
        if (this.f8000m.getInt("catsnotif_v_aplic", 0) == this.f8001n.f7414r5) {
            m8344i();
        } else {
            new C1887g().execute(new String[0]);
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8001n.f7384n3 == 0 || (cVar3 = this.f8007t) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8001n.f7384n3 == 0 || (cVar2 = this.f8007t) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8001n.f7384n3 == 0 || (cVar = this.f8007t) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f8001n.f7384n3 == 0 || (cVar = this.f8007t) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1885e());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8001n.f7384n3 != 0 && (cVar = this.f8007t) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8008u = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8008u) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8008u = true;
        C1692config.m8175Y0(this);
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
        this.f8008u = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8008u = true;
        C1692config.m8175Y0(this);
    }
}
