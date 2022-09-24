package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import british.p015x.t_chat;
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

/* renamed from: british.x.privados */
public class privados extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f8217m;

    /* renamed from: n */
    int f8218n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f8219o;

    /* renamed from: p */
    private SharedPreferences f8220p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1692config f8221q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public View f8222r;

    /* renamed from: s */
    private boolean f8223s = false;

    /* renamed from: t */
    private boolean f8224t;

    /* renamed from: u */
    private Bundle f8225u;

    /* renamed from: v */
    private C1603c f8226v;

    /* renamed from: w */
    boolean f8227w = false;

    /* renamed from: x */
    ListView f8228x;

    /* renamed from: british.x.privados$a */
    class C1968a extends AdColonyInterstitialListener {
        C1968a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            privados privados = privados.this;
            if (privados.f8227w) {
                privados.abrir_secc(privados.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            privados.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            privados.this.f6661g.cancel();
            privados privados = privados.this;
            privados.abrir_secc(privados.f6660f);
        }
    }

    /* renamed from: british.x.privados$b */
    class C1969b implements SearchManager.OnCancelListener {
        C1969b() {
        }

        public void onCancel() {
            privados privados = privados.this;
            privados.f6657c = false;
            privados.setResult(0);
        }
    }

    /* renamed from: british.x.privados$c */
    class C1970c implements SearchManager.OnDismissListener {
        C1970c() {
        }

        public void onDismiss() {
            privados.this.f6658d = false;
        }
    }

    /* renamed from: british.x.privados$d */
    class C1971d implements DialogInterface.OnClickListener {
        C1971d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new t_chat.C2282z((String) privados.this.f8222r.getTag(R.id.idaux1), 1, privados.this.f8217m, privados.this.f8219o).execute(new String[0]);
        }
    }

    /* renamed from: british.x.privados$e */
    class C1972e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8233a;

        C1972e(AlertDialog alertDialog) {
            this.f8233a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8233a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + privados.this.f6656b));
            Button button2 = this.f8233a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + privados.this.f6656b));
        }
    }

    /* renamed from: british.x.privados$f */
    class C1973f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AlertDialog f8235b;

        C1973f(AlertDialog alertDialog) {
            this.f8235b = alertDialog;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            privados privados = privados.this;
            C1692config.m8152H(privados, (String) privados.f8222r.getTag(R.id.idaux1));
            privados.this.m8469i();
            this.f8235b.show();
            try {
                ((TextView) this.f8235b.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.privados$g */
    class C1974g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8237a;

        C1974g(AlertDialog alertDialog) {
            this.f8237a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8237a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + privados.this.f6656b));
            Button button2 = this.f8237a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + privados.this.f6656b));
        }
    }

    /* renamed from: british.x.privados$h */
    class C1975h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8239a;

        /* renamed from: british.x.privados$h$a */
        class C1976a extends FullScreenContentCallback {
            C1976a() {
            }

            public void onAdDismissedFullScreenContent() {
                privados privados = privados.this;
                if (privados.f8227w) {
                    privados.abrir_secc(privados.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                privados privados = privados.this;
                privados.abrir_secc(privados.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.privados$h$b */
        class C1977b implements OnUserEarnedRewardListener {
            C1977b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1975h hVar = C1975h.this;
                privados.this.f8227w = true;
                C1692config.m8175Y0(hVar.f8239a);
            }
        }

        C1975h(Context context) {
            this.f8239a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            privados.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1976a());
            rewardedAd.show((Activity) this.f8239a, new C1977b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (!privados.this.f8221q.mo7502f(this.f8239a, privados.this.f6663i)) {
                privados.this.f6661g.cancel();
                privados privados = privados.this;
                privados.abrir_secc(privados.f6660f);
            }
        }
    }

    /* renamed from: british.x.privados$i */
    class C1978i implements AdDisplayListener {
        C1978i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            privados privados = privados.this;
            if (privados.f8227w) {
                privados.abrir_secc(privados.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: f */
    private void m8467f(Context context) {
        this.f6662h = new C1975h(context);
    }

    /* renamed from: g */
    private void m8468g() {
        SharedPreferences.Editor edit = getSharedPreferences("sh", 0).edit();
        edit.putBoolean("activa", false);
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ff  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8469i() {
        /*
            r20 = this;
            r0 = r20
            java.io.File r1 = r20.getFilesDir()
            r2 = 2131362548(0x7f0a02f4, float:1.834488E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.removeAllViews()
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
            r5 = 0
            r6 = 0
        L_0x001c:
            r7 = 100
            if (r5 >= r7) goto L_0x02e9
            android.content.SharedPreferences r7 = r0.f8220p
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "privado"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r10 = "_id"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            boolean r7 = r7.contains(r8)
            r8 = 1
            if (r7 == 0) goto L_0x02e3
            android.content.SharedPreferences r7 = r0.f8220p
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r5)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = ""
            java.lang.String r7 = r7.getString(r11, r12)
            boolean r11 = r7.equals(r12)
            if (r11 != 0) goto L_0x006c
            int r11 = r7.length()
            int r11 = r11 - r8
            int r13 = r7.length()
            java.lang.String r7 = r7.substring(r11, r13)
        L_0x006c:
            boolean r11 = r0.f8224t
            java.lang.String r13 = "9"
            java.lang.String r14 = "4"
            java.lang.String r15 = "8"
            java.lang.String r6 = "3"
            java.lang.String r8 = "7"
            java.lang.String r4 = "2"
            r16 = r2
            java.lang.String r2 = "6"
            r17 = r1
            java.lang.String r1 = "1"
            r18 = r12
            java.lang.String r12 = "5"
            r19 = r10
            java.lang.String r10 = "0"
            if (r11 == 0) goto L_0x00f4
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x00ec
            boolean r10 = r7.equals(r12)
            if (r10 == 0) goto L_0x0099
            goto L_0x00ec
        L_0x0099:
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x00e4
            boolean r1 = r7.equals(r2)
            if (r1 == 0) goto L_0x00a6
            goto L_0x00e4
        L_0x00a6:
            boolean r1 = r7.equals(r4)
            if (r1 != 0) goto L_0x00dc
            boolean r1 = r7.equals(r8)
            if (r1 == 0) goto L_0x00b3
            goto L_0x00dc
        L_0x00b3:
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x00d4
            boolean r1 = r7.equals(r15)
            if (r1 == 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            boolean r1 = r7.equals(r14)
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r7.equals(r13)
            if (r1 == 0) goto L_0x0135
        L_0x00cc:
            java.lang.String r1 = "#FFCC0000"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x00d4:
            java.lang.String r1 = "#FF9E5400"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x00dc:
            java.lang.String r1 = "#FF3D5C00"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x00e4:
            java.lang.String r1 = "#FF9933CC"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x00ec:
            java.lang.String r1 = "#FF00698C"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x00f4:
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x0154
            boolean r10 = r7.equals(r12)
            if (r10 == 0) goto L_0x0101
            goto L_0x0154
        L_0x0101:
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x014d
            boolean r1 = r7.equals(r2)
            if (r1 == 0) goto L_0x010e
            goto L_0x014d
        L_0x010e:
            boolean r1 = r7.equals(r4)
            if (r1 != 0) goto L_0x0146
            boolean r1 = r7.equals(r8)
            if (r1 == 0) goto L_0x011b
            goto L_0x0146
        L_0x011b:
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x013f
            boolean r1 = r7.equals(r15)
            if (r1 == 0) goto L_0x0128
            goto L_0x013f
        L_0x0128:
            boolean r1 = r7.equals(r14)
            if (r1 != 0) goto L_0x0138
            boolean r1 = r7.equals(r13)
            if (r1 == 0) goto L_0x0135
            goto L_0x0138
        L_0x0135:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x015a
        L_0x0138:
            java.lang.String r1 = "#FF33FFFF"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x013f:
            java.lang.String r1 = "#FF87BFFF"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x0146:
            java.lang.String r1 = "#FFC9ADFF"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x014d:
            java.lang.String r1 = "#FF66CC33"
            int r6 = android.graphics.Color.parseColor(r1)
            goto L_0x015a
        L_0x0154:
            java.lang.String r1 = "#FFFF6633"
            int r6 = android.graphics.Color.parseColor(r1)
        L_0x015a:
            r1 = 2131558622(0x7f0d00de, float:1.8742565E38)
            r2 = 0
            android.view.View r1 = r3.inflate(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131362327(0x7f0a0217, float:1.8344431E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r4 = r0.f8218n
            if (r4 != 0) goto L_0x0190
            r4 = 8
            r2.setVisibility(r4)
            r2 = 2131363190(0x7f0a0576, float:1.8346182E38)
            android.view.View r4 = r1.findViewById(r2)
            r4.setBackgroundColor(r6)
            android.view.View r2 = r1.findViewById(r2)
            r4 = 0
            r2.setVisibility(r4)
            r10 = r17
            r13 = r18
            r12 = r19
            goto L_0x020d
        L_0x0190:
            r2.setBackgroundColor(r6)
            android.content.ContentResolver r4 = r20.getContentResolver()     // Catch:{ Exception -> 0x01e6 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r8.<init>()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r10 = "fperfil_"
            r8.append(r10)     // Catch:{ Exception -> 0x01e6 }
            android.content.SharedPreferences r10 = r0.f8220p     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r11.<init>()     // Catch:{ Exception -> 0x01e6 }
            r11.append(r9)     // Catch:{ Exception -> 0x01e6 }
            r11.append(r5)     // Catch:{ Exception -> 0x01e6 }
            r12 = r19
            r11.append(r12)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01e1 }
            r13 = r18
            java.lang.String r10 = r10.getString(r11, r13)     // Catch:{ Exception -> 0x01de }
            r8.append(r10)     // Catch:{ Exception -> 0x01de }
            java.lang.String r10 = ".jpg"
            r8.append(r10)     // Catch:{ Exception -> 0x01de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01de }
            r10 = r17
            r7.<init>(r10, r8)     // Catch:{ Exception -> 0x01dc }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ Exception -> 0x01dc }
            android.graphics.Bitmap r4 = android.provider.MediaStore.Images.Media.getBitmap(r4, r7)     // Catch:{ Exception -> 0x01dc }
            r2.setImageBitmap(r4)     // Catch:{ Exception -> 0x01dc }
            goto L_0x020d
        L_0x01dc:
            goto L_0x01ec
        L_0x01de:
            r10 = r17
            goto L_0x01ec
        L_0x01e1:
            r10 = r17
            r13 = r18
            goto L_0x01ec
        L_0x01e6:
            r10 = r17
            r13 = r18
            r12 = r19
        L_0x01ec:
            boolean r4 = r0.f8224t
            if (r4 == 0) goto L_0x01ff
            android.content.res.Resources r4 = r20.getResources()
            r7 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
            r2.setImageDrawable(r4)
            goto L_0x020d
        L_0x01ff:
            android.content.res.Resources r4 = r20.getResources()
            r7 = 2131231485(0x7f0802fd, float:1.8079052E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
            r2.setImageDrawable(r4)
        L_0x020d:
            r2 = 2131363149(0x7f0a054d, float:1.8346099E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.SharedPreferences r4 = r0.f8220p
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r5)
            java.lang.String r8 = "_nombre"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = r4.getString(r7, r13)
            r2.setText(r4)
            r4 = 2131363148(0x7f0a054c, float:1.8346097E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.Date r7 = new java.util.Date
            android.content.SharedPreferences r11 = r0.f8220p
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r5)
            java.lang.String r15 = "_fultconex"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r19 = r12
            r18 = r13
            r12 = 0
            long r11 = r11.getLong(r14, r12)
            r7.<init>(r11)
            android.content.Context r11 = r20.getApplicationContext()
            java.text.DateFormat r11 = android.text.format.DateFormat.getDateFormat(r11)
            android.content.Context r12 = r20.getApplicationContext()
            java.text.DateFormat r12 = android.text.format.DateFormat.getTimeFormat(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r11 = r11.format(r7)
            r13.append(r11)
            java.lang.String r11 = " "
            r13.append(r11)
            java.lang.String r7 = r12.format(r7)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            r4.setText(r7)
            r2.setTextColor(r6)
            r4.setTextColor(r6)
            r2 = 2131362292(0x7f0a01f4, float:1.834436E38)
            android.content.SharedPreferences r4 = r0.f8220p
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r5)
            r7 = r19
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = r18
            java.lang.String r4 = r4.getString(r6, r7)
            r1.setTag(r2, r4)
            r2 = 2131362295(0x7f0a01f7, float:1.8344367E38)
            android.content.SharedPreferences r4 = r0.f8220p
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r5)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r4 = r4.getString(r6, r7)
            r1.setTag(r2, r4)
            r0.registerForContextMenu(r1)
            r1.setOnClickListener(r0)
            r2 = r16
            r2.addView(r1)
            r6 = 1
            goto L_0x02e4
        L_0x02e3:
            r10 = r1
        L_0x02e4:
            int r5 = r5 + 1
            r1 = r10
            goto L_0x001c
        L_0x02e9:
            if (r6 != 0) goto L_0x0311
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            r3 = 2131363160(0x7f0a0558, float:1.834612E38)
            if (r1 < r2) goto L_0x0309
            android.content.res.Resources r1 = r20.getResources()
            r2 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r1 = r1.getBoolean(r2)
            if (r1 == 0) goto L_0x0309
            android.view.View r1 = r0.findViewById(r3)
            r2 = 4
            r1.setTextDirection(r2)
        L_0x0309:
            android.view.View r1 = r0.findViewById(r3)
            r2 = 0
            r1.setVisibility(r2)
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.privados.m8469i():void");
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8221q.mo7510j0(view, this);
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
                    if (this.f8221q.f7427t4 != 2) {
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
    /* renamed from: h */
    public void mo7943h() {
        int q0 = this.f8221q.mo7522q0(this);
        int i = this.f8221q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8228x = listView;
            this.f8221q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8221q.f7231O1;
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
            int[] iArr = this.f8221q.f7249R1;
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
        if (this.f8227w) {
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
        if (!this.f6659e || this.f8223s || !this.f8221q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8223s = true;
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
        if (view.getTag(R.id.idaux1) != null) {
            openContextMenu(view);
            return;
        }
        String str9 = this.f8221q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f8221q.f7281W3) == null || str.equals("")) && (((str2 = this.f8221q.f7250R2) == null || str2.equals("")) && (((str3 = this.f8221q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8221q.f7269U3) == null || str4.equals("")) && (((str5 = this.f8221q.f7275V3) == null || str5.equals("")) && (((str6 = this.f8221q.f7358j4) == null || str6.equals("")) && (((str7 = this.f8221q.f7287X3) == null || str7.equals("")) && ((str8 = this.f8221q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f8221q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f8221q.f7251R3);
        }
        String str11 = this.f8221q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f8221q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f8221q.f7269U3);
        }
        String str13 = this.f8221q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f8221q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7943h();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8226v;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8226v;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8226v = this.f8221q.mo7474A0(this, false);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.eliminar) {
            AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C1971d()).setMessage(R.string.confirmar_bloquearprivado).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C1972e(create));
            }
            AlertDialog create2 = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C1973f(create)).setMessage(R.string.confirmar_elimprivado).create();
            if (!this.f6656b.equals("")) {
                create2.setOnShowListener(new C1974g(create2));
            }
            create2.show();
            try {
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId != R.id.pedirprivado) {
            return super.onContextItemSelected(menuItem);
        } else {
            C1692config.m8187g(this, (String) this.f8222r.getTag(R.id.idaux1), (String) this.f8222r.getTag(R.id.idaux3));
            SharedPreferences.Editor edit = getSharedPreferences("accion", 0).edit();
            edit.putString("id_remit", (String) this.f8222r.getTag(R.id.idaux1));
            edit.putString("nombre_remit", (String) this.f8222r.getTag(R.id.idaux3));
            edit.commit();
            Intent intent = new Intent();
            intent.putExtra("abrir_privado", true);
            setResult(-1, intent);
            finish();
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f8221q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8467f(this);
        this.f6666l = new C1968a();
        C1692config config2 = this.f8221q;
        int i = config2.f7318d;
        this.f6656b = C1692config.m8189h(config2.f7231O1[i].f7916g, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f8221q.f7231O1[i].f7916g)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.privados);
        mo7943h();
        this.f8221q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1969b());
        searchManager.setOnDismissListener(new C1970c());
        this.f8221q.mo7503f1(this, false, false);
        this.f8226v = this.f8221q.mo7474A0(this, false);
        Bundle extras = getIntent().getExtras();
        this.f8225u = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8225u.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8220p = sharedPreferences;
        this.f8217m = sharedPreferences.getLong("idusu", 0);
        this.f8219o = this.f8220p.getString("cod", "");
        this.f8224t = C1692config.m8153I("#" + this.f8221q.f7231O1[i].f7916g);
        if (!this.f8221q.f7231O1[i].f7916g.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8221q.f7231O1[i].f7916g), Color.parseColor("#" + this.f8221q.f7231O1[i].f7919h)}));
        }
        int i2 = -16777216;
        if (!this.f8224t) {
            i2 = -1;
        }
        ((TextView) findViewById(R.id.tv_listaprivados)).setTextColor(i2);
        findViewById(R.id.v_listaprivados).setBackgroundColor(i2);
        ((TextView) findViewById(R.id.tv_sinprivados)).setTextColor(i2);
        this.f8218n = 1;
        m8469i();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.f8222r = view;
        contextMenu.setHeaderTitle((String) view.getTag(R.id.idaux3));
        getMenuInflater().inflate(R.menu.m1_privado, contextMenu);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8221q.f7384n3 == 0 || (cVar3 = this.f8226v) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8221q.f7384n3 == 0 || (cVar2 = this.f8226v) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8221q.f7384n3 == 0 || (cVar = this.f8226v) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f8221q.f7384n3 == 0 || (cVar = this.f8226v) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        if (isFinishing()) {
            m8468g();
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1978i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        SharedPreferences.Editor edit = getSharedPreferences("accion", 0).edit();
        edit.putInt("accion", 0);
        edit.commit();
        SharedPreferences.Editor edit2 = getSharedPreferences("sh", 0).edit();
        edit2.putBoolean("activa", true);
        edit2.commit();
        if (this.f8221q.f7384n3 != 0 && (cVar = this.f8226v) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8227w = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8227w) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8227w = true;
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
        this.f8227w = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8227w = true;
        C1692config.m8175Y0(this);
    }
}
