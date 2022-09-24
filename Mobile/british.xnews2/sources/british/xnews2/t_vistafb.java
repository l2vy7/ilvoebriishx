package british.xnews2;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import java.util.ArrayList;

public class t_vistafb extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    SharedPreferences f10272A;

    /* renamed from: m */
    long f10273m;

    /* renamed from: n */
    int f10274n;

    /* renamed from: o */
    int f10275o = -1;

    /* renamed from: p */
    String f10276p;

    /* renamed from: q */
    C1692config f10277q;

    /* renamed from: r */
    boolean f10278r = false;

    /* renamed from: s */
    boolean f10279s = false;

    /* renamed from: t */
    boolean f10280t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ArrayList<C2046r3> f10281u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C1899p3 f10282v;

    /* renamed from: w */
    C1603c f10283w;

    /* renamed from: x */
    boolean f10284x = false;

    /* renamed from: y */
    Bundle f10285y;

    /* renamed from: z */
    ListView f10286z;

    /* renamed from: british.xnews2.t_vistafb$a */
    class C2576a extends AdColonyInterstitialListener {
        C2576a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_vistafb t_vistafb = t_vistafb.this;
            if (t_vistafb.f10284x) {
                t_vistafb.abrir_secc(t_vistafb.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_vistafb.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_vistafb.this.f6661g.cancel();
            t_vistafb t_vistafb = t_vistafb.this;
            t_vistafb.abrir_secc(t_vistafb.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_vistafb$b */
    class C2577b implements SearchManager.OnCancelListener {
        C2577b() {
        }

        public void onCancel() {
            t_vistafb t_vistafb = t_vistafb.this;
            t_vistafb.f6657c = false;
            t_vistafb.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_vistafb$c */
    class C2578c implements SearchManager.OnDismissListener {
        C2578c() {
        }

        public void onDismiss() {
            t_vistafb.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_vistafb$d */
    class C2579d implements View.OnClickListener {
        C2579d() {
        }

        public void onClick(View view) {
            AppWidgetManager appWidgetManager = (AppWidgetManager) t_vistafb.this.getApplicationContext().getSystemService(AppWidgetManager.class);
            ComponentName componentName = new ComponentName(t_vistafb.this.getApplicationContext(), widget_vistafb.class);
            if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                try {
                    appWidgetManager.requestPinAppWidget(componentName, (Bundle) null, (PendingIntent) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: british.xnews2.t_vistafb$e */
    class C2580e implements AdapterView.OnItemClickListener {
        C2580e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            t_vistafb.this.f10282v.mo7802e(i);
        }
    }

    /* renamed from: british.xnews2.t_vistafb$f */
    class C2581f extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f10292a;

        /* renamed from: british.xnews2.t_vistafb$f$a */
        class C2582a extends FullScreenContentCallback {
            C2582a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_vistafb t_vistafb = t_vistafb.this;
                if (t_vistafb.f10284x) {
                    t_vistafb.abrir_secc(t_vistafb.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_vistafb t_vistafb = t_vistafb.this;
                t_vistafb.abrir_secc(t_vistafb.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_vistafb$f$b */
        class C2583b implements OnUserEarnedRewardListener {
            C2583b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2581f fVar = C2581f.this;
                t_vistafb.this.f10284x = true;
                C1692config.m8175Y0(fVar.f10292a);
            }
        }

        C2581f(Context context) {
            this.f10292a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_vistafb.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2582a());
            rewardedAd.show((Activity) this.f10292a, new C2583b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_vistafb t_vistafb = t_vistafb.this;
            if (!t_vistafb.f10277q.mo7502f(this.f10292a, t_vistafb.f6663i)) {
                t_vistafb.this.f6661g.cancel();
                t_vistafb t_vistafb2 = t_vistafb.this;
                t_vistafb2.abrir_secc(t_vistafb2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_vistafb$g */
    class C2584g implements AdDisplayListener {
        C2584g() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_vistafb t_vistafb = t_vistafb.this;
            if (t_vistafb.f10284x) {
                t_vistafb.abrir_secc(t_vistafb.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_vistafb$h */
    private class C2585h extends AsyncTask<String, Integer, ArrayList<C2046r3>> {

        /* renamed from: a */
        ProgressBar f10297a;

        private C2585h() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:20|21|22|23|(3:25|26|(4:28|30|31|41))|29|30|31|41) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x01ec */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.ArrayList<british.xnews2.C2046r3> doInBackground(java.lang.String... r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r0 = ";"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = british.xnews2.C1692config.f7107G5
                r2.append(r3)
                java.lang.String r3 = "widget.e-droid.net/srv/widget_fb.php?ids="
                r2.append(r3)
                british.xnews2.t_vistafb r3 = british.xnews2.t_vistafb.this
                british.xnews2.config r3 = r3.f10277q
                british.xnews2.l[] r4 = r3.f7231O1
                int r3 = r3.f7318d
                r3 = r4[r3]
                int r3 = r3.f7964y
                r2.append(r3)
                java.lang.String r3 = "&idusu="
                r2.append(r3)
                british.xnews2.t_vistafb r3 = british.xnews2.t_vistafb.this
                long r3 = r3.f10273m
                r2.append(r3)
                java.lang.String r3 = "&c="
                r2.append(r3)
                british.xnews2.t_vistafb r3 = british.xnews2.t_vistafb.this
                android.content.SharedPreferences r3 = r3.f10272A
                java.lang.String r4 = "cod"
                java.lang.String r5 = ""
                java.lang.String r3 = r3.getString(r4, r5)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 0
                i9.b r4 = new i9.b     // Catch:{ Exception -> 0x0203 }
                r4.<init>()     // Catch:{ Exception -> 0x0203 }
                r5 = 10000(0x2710, float:1.4013E-41)
                p312i9.C12789c.m54266h(r4, r5)     // Catch:{ Exception -> 0x0203 }
                r5 = 60000(0xea60, float:8.4078E-41)
                p312i9.C12789c.m54267i(r4, r5)     // Catch:{ Exception -> 0x0203 }
                b9.h r5 = new b9.h     // Catch:{ Exception -> 0x0203 }
                r5.<init>(r4)     // Catch:{ Exception -> 0x0203 }
                l8.e r4 = new l8.e     // Catch:{ Exception -> 0x0203 }
                r4.<init>(r2)     // Catch:{ Exception -> 0x0203 }
                x8.g r2 = new x8.g     // Catch:{ Exception -> 0x0203 }
                x8.d r6 = p337x8.C12957d.BROWSER_COMPATIBLE     // Catch:{ Exception -> 0x0203 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r2 = "User-Agent"
                java.lang.String r6 = "Android Vinebre Software"
                r4.mo47794K(r2, r6)     // Catch:{ Exception -> 0x0203 }
                g8.q r2 = r5.mo43518a(r4)     // Catch:{ Exception -> 0x0203 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0203 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0203 }
                g8.i r2 = r2.mo47805b()     // Catch:{ Exception -> 0x0203 }
                java.io.InputStream r2 = r2.mo43577k()     // Catch:{ Exception -> 0x0203 }
                java.lang.String r6 = "UTF-8"
                r5.<init>(r2, r6)     // Catch:{ Exception -> 0x0203 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0203 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0203 }
                r2.<init>()     // Catch:{ Exception -> 0x0203 }
            L_0x008c:
                java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x0203 }
                if (r5 == 0) goto L_0x0096
                r2.append(r5)     // Catch:{ Exception -> 0x0203 }
                goto L_0x008c
            L_0x0096:
                java.lang.String r4 = "ANDROID:OK CAD:"
                int r4 = r2.indexOf(r4)     // Catch:{ Exception -> 0x0203 }
                r5 = -1
                if (r4 != r5) goto L_0x00a0
                return r3
            L_0x00a0:
                r6 = 15
                int r4 = r4 + r6
                java.lang.String r2 = r2.substring(r4)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r4 = "@"
                java.lang.String[] r2 = r2.split(r4)     // Catch:{ Exception -> 0x0203 }
                int r4 = r2.length     // Catch:{ Exception -> 0x0203 }
                if (r4 <= 0) goto L_0x0202
                r4 = 0
                r7 = r2[r4]     // Catch:{ Exception -> 0x0203 }
                int r7 = r7.indexOf(r0)     // Catch:{ Exception -> 0x0203 }
                if (r7 == r5) goto L_0x0202
                r5 = r2[r4]     // Catch:{ Exception -> 0x0203 }
                java.lang.String[] r5 = r5.split(r0)     // Catch:{ Exception -> 0x0203 }
                r5 = r5[r4]     // Catch:{ Exception -> 0x0203 }
                java.lang.String r7 = "1"
                boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0203 }
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0203 }
                british.xnews2.t_vistafb r7 = british.xnews2.t_vistafb.this     // Catch:{ Exception -> 0x0203 }
                british.xnews2.p3 r7 = r7.f10282v     // Catch:{ Exception -> 0x0203 }
                boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0203 }
                r7.f8056k = r5     // Catch:{ Exception -> 0x0203 }
                r5 = 1
                r7 = 1
            L_0x00d9:
                int r8 = r2.length     // Catch:{ Exception -> 0x0203 }
                if (r7 >= r8) goto L_0x01fb
                r8 = r2[r7]     // Catch:{ Exception -> 0x0203 }
                boolean r8 = r8.contains(r0)     // Catch:{ Exception -> 0x0203 }
                if (r8 == 0) goto L_0x01f5
                r8 = r2[r7]     // Catch:{ Exception -> 0x0203 }
                java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x0203 }
                int r9 = r8.length     // Catch:{ Exception -> 0x0203 }
                r10 = 2
                if (r9 <= r10) goto L_0x01f5
                r9 = r8[r4]     // Catch:{ Exception -> 0x0203 }
                r11 = r8[r5]     // Catch:{ Exception -> 0x0203 }
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r12 = 3
                r12 = r8[r12]     // Catch:{ Exception -> 0x0203 }
                r13 = 4
                r13 = r8[r13]     // Catch:{ Exception -> 0x0203 }
                r14 = 5
                r14 = r8[r14]     // Catch:{ Exception -> 0x0203 }
                british.xnews2.r3 r15 = new british.xnews2.r3     // Catch:{ Exception -> 0x0203 }
                r15.<init>()     // Catch:{ Exception -> 0x0203 }
                r15.f8446a = r9     // Catch:{ Exception -> 0x0203 }
                r15.f8447b = r11     // Catch:{ Exception -> 0x0203 }
                r15.f8448c = r10     // Catch:{ Exception -> 0x0203 }
                r15.f8450e = r12     // Catch:{ Exception -> 0x0203 }
                r15.f8451f = r14     // Catch:{ Exception -> 0x0203 }
                r9 = 6
                r10 = r8[r9]     // Catch:{ Exception -> 0x0203 }
                r15.f8452g = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 7
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8454i = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 8
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8456k = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 9
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8457l = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 10
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8458m = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 11
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8459n = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 12
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8455j = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 13
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8467v = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 14
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8466u = r10     // Catch:{ Exception -> 0x0203 }
                r10 = r8[r6]     // Catch:{ Exception -> 0x0203 }
                r15.f8468w = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 16
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8464s = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 17
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8460o = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 18
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8461p = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 19
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8462q = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 20
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8465t = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 21
                r10 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8463r = r10     // Catch:{ Exception -> 0x0203 }
                r10 = 22
                r8 = r8[r10]     // Catch:{ Exception -> 0x0203 }
                r15.f8453h = r8     // Catch:{ Exception -> 0x0203 }
                java.lang.String r8 = british.xnews2.C1692config.m8200u(r13)     // Catch:{ Exception -> 0x0203 }
                java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0203 }
                java.lang.String r11 = "ddMMyyHHmm"
                r10.<init>(r11)     // Catch:{ Exception -> 0x0203 }
                british.xnews2.t_vistafb r11 = british.xnews2.t_vistafb.this     // Catch:{ Exception -> 0x01ec }
                java.text.DateFormat r11 = android.text.format.DateFormat.getDateFormat(r11)     // Catch:{ Exception -> 0x01ec }
                british.xnews2.t_vistafb r12 = british.xnews2.t_vistafb.this     // Catch:{ Exception -> 0x01ec }
                java.text.DateFormat r12 = android.text.format.DateFormat.getTimeFormat(r12)     // Catch:{ Exception -> 0x01ec }
                java.util.Date r8 = r10.parse(r8)     // Catch:{ Exception -> 0x01ec }
                java.util.Calendar r10 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01ec }
                java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01ec }
                r13.setTime(r8)     // Catch:{ Exception -> 0x01ec }
                int r14 = r13.get(r5)     // Catch:{ Exception -> 0x01ec }
                int r4 = r10.get(r5)     // Catch:{ Exception -> 0x01ec }
                java.lang.String r5 = " "
                if (r14 != r4) goto L_0x01d0
                int r4 = r13.get(r9)     // Catch:{ Exception -> 0x01ec }
                int r9 = r10.get(r9)     // Catch:{ Exception -> 0x01ec }
                if (r4 != r9) goto L_0x01d0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ec }
                r4.<init>()     // Catch:{ Exception -> 0x01ec }
                british.xnews2.t_vistafb r9 = british.xnews2.t_vistafb.this     // Catch:{ Exception -> 0x01ec }
                android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x01ec }
                r10 = 2131820893(0x7f11015d, float:1.9274514E38)
                java.lang.String r9 = r9.getString(r10)     // Catch:{ Exception -> 0x01ec }
                r4.append(r9)     // Catch:{ Exception -> 0x01ec }
                r4.append(r5)     // Catch:{ Exception -> 0x01ec }
                java.lang.String r5 = r12.format(r8)     // Catch:{ Exception -> 0x01ec }
                r4.append(r5)     // Catch:{ Exception -> 0x01ec }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ec }
                r15.f8449d = r4     // Catch:{ Exception -> 0x01ec }
                goto L_0x01ec
            L_0x01d0:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ec }
                r4.<init>()     // Catch:{ Exception -> 0x01ec }
                java.lang.String r9 = r11.format(r8)     // Catch:{ Exception -> 0x01ec }
                r4.append(r9)     // Catch:{ Exception -> 0x01ec }
                r4.append(r5)     // Catch:{ Exception -> 0x01ec }
                java.lang.String r5 = r12.format(r8)     // Catch:{ Exception -> 0x01ec }
                r4.append(r5)     // Catch:{ Exception -> 0x01ec }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ec }
                r15.f8449d = r4     // Catch:{ Exception -> 0x01ec }
            L_0x01ec:
                british.xnews2.t_vistafb r4 = british.xnews2.t_vistafb.this     // Catch:{ Exception -> 0x0203 }
                java.util.ArrayList r4 = r4.f10281u     // Catch:{ Exception -> 0x0203 }
                r4.add(r15)     // Catch:{ Exception -> 0x0203 }
            L_0x01f5:
                int r7 = r7 + 1
                r4 = 0
                r5 = 1
                goto L_0x00d9
            L_0x01fb:
                british.xnews2.t_vistafb r0 = british.xnews2.t_vistafb.this
                java.util.ArrayList r0 = r0.f10281u
                return r0
            L_0x0202:
                return r3
            L_0x0203:
                r0 = move-exception
                r0.printStackTrace()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_vistafb.C2585h.doInBackground(java.lang.String[]):java.util.ArrayList");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(ArrayList<C2046r3> arrayList) {
            try {
                this.f10297a.setVisibility(8);
            } catch (Exception unused) {
            }
            if (arrayList == null || arrayList.isEmpty()) {
                t_vistafb.this.findViewById(R.id.w_main).setVisibility(8);
                t_vistafb.this.findViewById(R.id.w_empty_view).setVisibility(0);
                return;
            }
            t_vistafb.this.f10282v.notifyDataSetChanged();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_vistafb t_vistafb = t_vistafb.this;
            if (t_vistafb.f10280t) {
                this.f10297a = (ProgressBar) t_vistafb.findViewById(R.id.w_pb);
            } else {
                this.f10297a = (ProgressBar) t_vistafb.findViewById(R.id.w_pb);
            }
            if (Build.VERSION.SDK_INT > 20) {
                C1692config.m8168S0(this.f10297a, t_vistafb.this.f10277q.f7368l1);
            }
            this.f10297a.setVisibility(0);
        }
    }

    /* renamed from: c */
    private void m9091c(Context context) {
        this.f6662h = new C2581f(context);
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C1845j j0 = this.f10277q.mo7510j0(view, this);
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
                        if (this.f10277q.f7427t4 != 2) {
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
    public void mo9222d() {
        int q0 = this.f10277q.mo7522q0(this);
        int i = this.f10277q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f10286z = listView;
            this.f10277q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f10277q.f7231O1;
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
            int[] iArr = this.f10277q.f7249R1;
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
        if (this.f10284x) {
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
        if (!this.f6659e || this.f10278r || !this.f10277q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f10278r = true;
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
        String str9 = this.f10277q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f10277q.f7281W3) == null || str.equals("")) && (((str2 = this.f10277q.f7250R2) == null || str2.equals("")) && (((str3 = this.f10277q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f10277q.f7269U3) == null || str4.equals("")) && (((str5 = this.f10277q.f7275V3) == null || str5.equals("")) && (((str6 = this.f10277q.f7358j4) == null || str6.equals("")) && (((str7 = this.f10277q.f7287X3) == null || str7.equals("")) && ((str8 = this.f10277q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f10277q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f10277q.f7251R3);
        }
        String str11 = this.f10277q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f10277q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f10277q.f7269U3);
        }
        String str13 = this.f10277q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f10277q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo9222d();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f10283w;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f10283w;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f10283w = this.f10277q.mo7474A0(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        if (r0.f10272A.getBoolean("email_confirmado", false) == false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r0.f10277q = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m9091c(r0)
            british.xnews2.t_vistafb$a r2 = new british.xnews2.t_vistafb$a
            r2.<init>()
            r0.f6666l = r2
            british.xnews2.config r2 = r0.f10277q
            british.xnews2.l[] r3 = r2.f7231O1
            int r2 = r2.f7318d
            r4 = r3[r2]
            java.lang.String r4 = r4.f7916g
            r2 = r3[r2]
            java.lang.String r2 = r2.f7919h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = british.xnews2.C1692config.m8153I(r3)
            r0.f10280t = r3
            british.xnews2.config r3 = r0.f10277q
            java.lang.String r3 = r3.f7368l1
            java.lang.String r3 = british.xnews2.C1692config.m8189h(r4, r3)
            r0.f6656b = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 12
            if (r3 <= r6) goto L_0x005c
            boolean r6 = r0.f10280t
            if (r6 != 0) goto L_0x005c
            r6 = 2131886906(0x7f12033a, float:1.9408404E38)
            r0.setTheme(r6)
        L_0x005c:
            android.content.Intent r6 = r17.getIntent()
            android.os.Bundle r6 = r6.getExtras()
            r0.f10285y = r6
            java.lang.String r7 = "es_root"
            r9 = 0
            if (r1 != 0) goto L_0x0081
            if (r6 == 0) goto L_0x007d
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x007d
            android.os.Bundle r6 = r0.f10285y
            boolean r6 = r6.getBoolean(r7, r9)
            if (r6 == 0) goto L_0x007d
            r6 = 1
            goto L_0x007e
        L_0x007d:
            r6 = 0
        L_0x007e:
            r0.f6659e = r6
            goto L_0x0092
        L_0x0081:
            boolean r6 = r1.containsKey(r7)
            if (r6 == 0) goto L_0x008f
            boolean r6 = r1.getBoolean(r7, r9)
            if (r6 == 0) goto L_0x008f
            r6 = 1
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            r0.f6659e = r6
        L_0x0092:
            british.xnews2.config r6 = r0.f10277q
            int r6 = r6.f7318d
            r0.f10274n = r6
            super.onCreate(r18)
            java.lang.String r6 = "sh"
            android.content.SharedPreferences r6 = r0.getSharedPreferences(r6, r9)
            r0.f10272A = r6
            r10 = 0
            java.lang.String r12 = "idusu"
            long r10 = r6.getLong(r12, r10)
            r0.f10273m = r10
            android.content.SharedPreferences r6 = r0.f10272A
            java.lang.String r10 = "cod"
            java.lang.String r11 = ""
            java.lang.String r6 = r6.getString(r10, r11)
            r0.f10276p = r6
            british.xnews2.config r6 = r0.f10277q
            british.xnews2.l[] r10 = r6.f7231O1
            int r6 = r6.f7318d
            r12 = r10[r6]
            int r12 = r12.f7851C0
            r13 = r10[r6]
            int r13 = r13.f7853D0
            r14 = r10[r6]
            int r14 = r14.f7855E0
            r6 = r10[r6]
            int r6 = r6.f7849B0
            android.content.SharedPreferences r10 = r0.f10272A
            java.lang.String r15 = "nick"
            java.lang.String r10 = r10.getString(r15, r11)
            boolean r10 = r10.equals(r11)
            java.lang.String r15 = "desde_vistafb"
            java.lang.String r8 = "idsecc"
            if (r10 != 0) goto L_0x0173
            british.xnews2.config r10 = r0.f10277q
            int r10 = r10.f7393o5
            r9 = 3
            if (r10 != r9) goto L_0x00f7
            android.content.SharedPreferences r9 = r0.f10272A
            java.lang.String r10 = "email_confirmado"
            r16 = r3
            r3 = 0
            boolean r9 = r9.getBoolean(r10, r3)
            if (r9 != 0) goto L_0x00f9
            goto L_0x0175
        L_0x00f7:
            r16 = r3
        L_0x00f9:
            r3 = 2
            if (r6 != r3) goto L_0x0109
            british.xnews2.config r6 = r0.f10277q
            r9 = 1
            java.io.File r6 = r6.mo7516l0(r0, r9)
            boolean r6 = r6.exists()
            if (r6 == 0) goto L_0x0149
        L_0x0109:
            if (r12 != r3) goto L_0x012c
            android.content.SharedPreferences r3 = r0.f10272A
            java.lang.String r6 = "fnac_d"
            r9 = 0
            int r3 = r3.getInt(r6, r9)
            if (r3 == 0) goto L_0x0149
            android.content.SharedPreferences r3 = r0.f10272A
            java.lang.String r6 = "fnac_m"
            int r3 = r3.getInt(r6, r9)
            if (r3 == 0) goto L_0x0149
            android.content.SharedPreferences r3 = r0.f10272A
            java.lang.String r6 = "fnac_a"
            int r3 = r3.getInt(r6, r9)
            if (r3 == 0) goto L_0x0149
            r3 = 2
            goto L_0x012d
        L_0x012c:
            r9 = 0
        L_0x012d:
            if (r13 != r3) goto L_0x0139
            android.content.SharedPreferences r6 = r0.f10272A
            java.lang.String r10 = "sexo"
            int r6 = r6.getInt(r10, r9)
            if (r6 == 0) goto L_0x0149
        L_0x0139:
            if (r14 != r3) goto L_0x0171
            android.content.SharedPreferences r3 = r0.f10272A
            java.lang.String r6 = "descr"
            java.lang.String r3 = r3.getString(r6, r11)
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0171
        L_0x0149:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<british.xnews2.preperfil> r6 = british.xnews2.preperfil.class
            r3.<init>(r0, r6)
            british.xnews2.config r6 = r0.f10277q
            british.xnews2.l[] r6 = r6.f7231O1
            int r9 = r0.f10274n
            r6 = r6[r9]
            int r6 = r6.f7964y
            r3.putExtra(r8, r6)
            r6 = 1
            r3.putExtra(r15, r6)
            boolean r8 = r0.f6659e
            if (r8 == 0) goto L_0x0168
            r3.putExtra(r7, r8)
        L_0x0168:
            r7 = 0
            r0.f6659e = r7
            r0.f6657c = r6
            r0.startActivityForResult(r3, r7)
            goto L_0x019c
        L_0x0171:
            r7 = 0
            goto L_0x019c
        L_0x0173:
            r16 = r3
        L_0x0175:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<british.xnews2.chat_perfil> r6 = british.xnews2.chat_perfil.class
            r3.<init>(r0, r6)
            british.xnews2.config r6 = r0.f10277q
            british.xnews2.l[] r6 = r6.f7231O1
            int r9 = r0.f10274n
            r6 = r6[r9]
            int r6 = r6.f7964y
            r3.putExtra(r8, r6)
            r6 = 1
            r3.putExtra(r15, r6)
            boolean r8 = r0.f6659e
            if (r8 == 0) goto L_0x0194
            r3.putExtra(r7, r8)
        L_0x0194:
            r7 = 0
            r0.f6659e = r7
            r0.f6657c = r6
            r0.startActivityForResult(r3, r7)
        L_0x019c:
            boolean r3 = r0.f6657c
            if (r3 == 0) goto L_0x01a1
            return
        L_0x01a1:
            r3 = 2131558682(0x7f0d011a, float:1.8742687E38)
            r0.setContentView(r3)
            r17.mo9222d()
            british.xnews2.config r3 = r0.f10277q
            r3.mo7486N0(r0, r7)
            java.lang.String r3 = "search"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.SearchManager r3 = (android.app.SearchManager) r3
            british.xnews2.t_vistafb$b r6 = new british.xnews2.t_vistafb$b
            r6.<init>()
            r3.setOnCancelListener(r6)
            british.xnews2.t_vistafb$c r6 = new british.xnews2.t_vistafb$c
            r6.<init>()
            r3.setOnDismissListener(r6)
            british.xnews2.config r3 = r0.f10277q
            android.os.Bundle r6 = r0.f10285y
            if (r6 == 0) goto L_0x01d7
            java.lang.String r7 = "ad_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x01d7
            r6 = 1
            goto L_0x01d8
        L_0x01d7:
            r6 = 0
        L_0x01d8:
            android.os.Bundle r7 = r0.f10285y
            if (r7 == 0) goto L_0x01e6
            java.lang.String r8 = "fb_entrar"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x01e6
            r7 = 1
            goto L_0x01e7
        L_0x01e6:
            r7 = 0
        L_0x01e7:
            r3.mo7503f1(r0, r6, r7)
            british.xnews2.config r3 = r0.f10277q
            r6 = 0
            british.xnews2.c r3 = r3.mo7474A0(r0, r6)
            r0.f10283w = r3
            british.xnews2.config r3 = r0.f10277q
            int r6 = r3.f7318d
            java.lang.String r7 = r0.f6656b
            r3.mo7488Q0(r0, r6, r7, r1)
            boolean r1 = r4.equals(r11)
            if (r1 != 0) goto L_0x0242
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r6 = 2
            int[] r6 = new int[r6]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r7 = 0
            r6[r7] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r4 = 1
            r6[r4] = r2
            r1.<init>(r3, r6)
            r2 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setBackgroundDrawable(r1)
        L_0x0242:
            british.xnews2.config r1 = r0.f10277q
            british.xnews2.l[] r2 = r1.f7231O1
            int r1 = r1.f7318d
            r1 = r2[r1]
            boolean r1 = r1.f7880R
            if (r1 == 0) goto L_0x028b
            r1 = 25
            r2 = r16
            if (r2 <= r1) goto L_0x028b
            android.app.Application r1 = r17.getApplication()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x026c }
            java.lang.Class<british.xnews2.widget_vistafb> r4 = british.xnews2.widget_vistafb.class
            r3.<init>(r0, r4)     // Catch:{ NameNotFoundException -> 0x026c }
            r4 = 0
            r1.getReceiverInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x026c }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x026c }
            goto L_0x026d
        L_0x026c:
        L_0x026d:
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L_0x028b
            r1 = 2131362285(0x7f0a01ed, float:1.8344346E38)
            android.view.View r2 = r0.findViewById(r1)
            british.xnews2.t_vistafb$d r3 = new british.xnews2.t_vistafb$d
            r3.<init>()
            r2.setOnClickListener(r3)
            android.view.View r1 = r0.findViewById(r1)
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x028c
        L_0x028b:
            r2 = 0
        L_0x028c:
            r1 = 2131363238(0x7f0a05a6, float:1.834628E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r1.setCacheColorHint(r2)
            boolean r2 = r0.f10280t
            r3 = 2131363231(0x7f0a059f, float:1.8346265E38)
            if (r2 == 0) goto L_0x02ab
            android.view.View r2 = r0.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = british.xnews2.C1692config.f7101A5
            r2.setTextColor(r3)
            goto L_0x02b6
        L_0x02ab:
            android.view.View r2 = r0.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = british.xnews2.C1692config.f7104D5
            r2.setTextColor(r3)
        L_0x02b6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f10281u = r2
            british.xnews2.p3 r2 = new british.xnews2.p3
            r3 = 2131558703(0x7f0d012f, float:1.874273E38)
            java.util.ArrayList<british.xnews2.r3> r4 = r0.f10281u
            r2.<init>(r0, r3, r4)
            r0.f10282v = r2
            int r3 = r0.f10274n
            r2.f8058m = r3
            boolean r3 = r0.f10280t
            r2.f8057l = r3
            r1.setAdapter(r2)
            british.xnews2.t_vistafb$e r2 = new british.xnews2.t_vistafb$e
            r2.<init>()
            r1.setOnItemClickListener(r2)
            british.xnews2.t_vistafb$h r1 = new british.xnews2.t_vistafb$h
            r2 = 0
            r1.<init>()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_vistafb.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f10277q.f7384n3 == 0 || (cVar3 = this.f10283w) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f10277q.f7384n3 == 0 || (cVar2 = this.f10283w) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f10277q.f7384n3 == 0 || (cVar = this.f10283w) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f10277q.f7384n3 == 0 || (cVar = this.f10283w) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2584g());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f10277q.f7384n3 != 0 && (cVar = this.f10283w) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f10284x = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f10284x) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f10284x = true;
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
        this.f10284x = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f10284x = true;
        C1692config.m8175Y0(this);
    }
}
