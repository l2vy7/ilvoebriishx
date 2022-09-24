package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import com.google.android.exoplayer2.audio.AacUtil;
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
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

/* renamed from: british.x.t_buscchats */
public class t_buscchats extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    int f8627A = 1;

    /* renamed from: B */
    int f8628B;

    /* renamed from: C */
    GridView f8629C;

    /* renamed from: D */
    ListView f8630D;

    /* renamed from: E */
    SharedPreferences f8631E;

    /* renamed from: m */
    long f8632m;

    /* renamed from: n */
    int f8633n;

    /* renamed from: o */
    int f8634o;

    /* renamed from: p */
    int f8635p;

    /* renamed from: q */
    C1692config f8636q;

    /* renamed from: r */
    boolean f8637r = false;

    /* renamed from: s */
    boolean f8638s;

    /* renamed from: t */
    Bundle f8639t;

    /* renamed from: u */
    C1603c f8640u;

    /* renamed from: v */
    boolean f8641v = false;

    /* renamed from: w */
    int f8642w;

    /* renamed from: x */
    int f8643x;

    /* renamed from: y */
    int f8644y;

    /* renamed from: z */
    int f8645z;

    /* renamed from: british.x.t_buscchats$a */
    class C2096a extends AdColonyInterstitialListener {
        C2096a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscchats t_buscchats = t_buscchats.this;
            if (t_buscchats.f8641v) {
                t_buscchats.abrir_secc(t_buscchats.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscchats.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscchats.this.f6661g.cancel();
            t_buscchats t_buscchats = t_buscchats.this;
            t_buscchats.abrir_secc(t_buscchats.f6660f);
        }
    }

    /* renamed from: british.x.t_buscchats$b */
    class C2097b implements SearchManager.OnCancelListener {
        C2097b() {
        }

        public void onCancel() {
            t_buscchats t_buscchats = t_buscchats.this;
            t_buscchats.f6657c = false;
            t_buscchats.setResult(0);
        }
    }

    /* renamed from: british.x.t_buscchats$c */
    class C2098c implements SearchManager.OnDismissListener {
        C2098c() {
        }

        public void onDismiss() {
            t_buscchats.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_buscchats$d */
    class C2099d implements View.OnClickListener {
        C2099d() {
        }

        public void onClick(View view) {
            t_buscchats.this.finish();
        }
    }

    /* renamed from: british.x.t_buscchats$e */
    class C2100e implements View.OnClickListener {
        C2100e() {
        }

        public void onClick(View view) {
            t_buscchats.this.finish();
        }
    }

    /* renamed from: british.x.t_buscchats$f */
    class C2101f implements AdapterView.OnItemClickListener {
        C2101f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent;
            if (t_buscchats.this.f8628B == 0) {
                intent = new Intent(t_buscchats.this, t_buscchats.class);
                intent.putExtra("idcat", Integer.parseInt(t_buscchats.this.getResources().getStringArray(R.array.idcats_menu_a)[i]));
                intent.putExtra("tit_cab", t_buscchats.this.getResources().getStringArray(R.array.cats_menu_a)[i]);
            } else {
                intent = new Intent(t_buscchats.this, t_buscchats_lista.class);
                intent.putExtra("idcat", t_buscchats.this.f8628B);
                intent.putExtra("idsubcat", Integer.parseInt(t_buscchats.this.getResources().getStringArray(t_buscchats.this.f8635p)[i]));
                intent.putExtra("tit_cab", t_buscchats.this.getResources().getStringArray(t_buscchats.this.f8634o)[i]);
            }
            intent.putExtra("ind", t_buscchats.this.f8633n);
            t_buscchats.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: british.x.t_buscchats$g */
    class C2102g extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8652a;

        /* renamed from: british.x.t_buscchats$g$a */
        class C2103a extends FullScreenContentCallback {
            C2103a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscchats t_buscchats = t_buscchats.this;
                if (t_buscchats.f8641v) {
                    t_buscchats.abrir_secc(t_buscchats.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscchats t_buscchats = t_buscchats.this;
                t_buscchats.abrir_secc(t_buscchats.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_buscchats$g$b */
        class C2104b implements OnUserEarnedRewardListener {
            C2104b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2102g gVar = C2102g.this;
                t_buscchats.this.f8641v = true;
                C1692config.m8175Y0(gVar.f8652a);
            }
        }

        C2102g(Context context) {
            this.f8652a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscchats.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2103a());
            rewardedAd.show((Activity) this.f8652a, new C2104b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscchats t_buscchats = t_buscchats.this;
            if (!t_buscchats.f8636q.mo7502f(this.f8652a, t_buscchats.f6663i)) {
                t_buscchats.this.f6661g.cancel();
                t_buscchats t_buscchats2 = t_buscchats.this;
                t_buscchats2.abrir_secc(t_buscchats2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_buscchats$h */
    class C2105h implements AdDisplayListener {
        C2105h() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscchats t_buscchats = t_buscchats.this;
            if (t_buscchats.f8641v) {
                t_buscchats.abrir_secc(t_buscchats.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_buscchats$i */
    public class C2106i extends BaseAdapter {

        /* renamed from: b */
        private Context f8657b;

        /* renamed from: c */
        private int[] f8658c = {R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4, R.drawable.bg_5, R.drawable.bg_6, R.drawable.bg_7, R.drawable.bg_8, R.drawable.bg_9, R.drawable.bg_10, R.drawable.bg_11, R.drawable.bg_12, R.drawable.bg_13, R.drawable.bg_14, R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4, R.drawable.bg_5, R.drawable.bg_6, R.drawable.bg_7, R.drawable.bg_8, R.drawable.bg_9, R.drawable.bg_10, R.drawable.bg_11, R.drawable.bg_12, R.drawable.bg_13, R.drawable.bg_14, R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4};

        public C2106i(Context context) {
            this.f8657b = context;
        }

        public int getCount() {
            t_buscchats t_buscchats = t_buscchats.this;
            if (t_buscchats.f8628B == 0) {
                return t_buscchats.getResources().getStringArray(R.array.cats_menu_a).length;
            }
            return t_buscchats.getResources().getStringArray(t_buscchats.this.f8634o).length;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.f8657b);
                textView.setSingleLine(true);
                textView.setHeight(t_buscchats.this.f8642w);
                textView.setBackgroundResource(this.f8658c[i]);
                textView.setTextColor(-1);
                int i2 = t_buscchats.this.f8643x;
                textView.setPadding(i2, 0, i2, 0);
                textView.setGravity(16);
                if (Build.VERSION.SDK_INT >= 17 && t_buscchats.this.getResources().getBoolean(R.bool.es_rtl)) {
                    textView.setTextDirection(4);
                }
            } else {
                textView = (TextView) view;
            }
            t_buscchats t_buscchats = t_buscchats.this;
            if (t_buscchats.f8628B == 0) {
                textView.setText(t_buscchats.getResources().getStringArray(R.array.cats_menu_a)[i].toUpperCase(Locale.getDefault()));
            } else {
                textView.setText(t_buscchats.getResources().getStringArray(t_buscchats.this.f8634o)[i].toUpperCase(Locale.getDefault()));
            }
            return textView;
        }
    }

    /* renamed from: british.x.t_buscchats$j */
    private class C2107j extends AsyncTask<String, Void, String> {

        /* renamed from: british.x.t_buscchats$j$a */
        class C2108a implements View.OnClickListener {

            /* renamed from: british.x.t_buscchats$j$a$a */
            class C2109a implements DialogInterface.OnClickListener {
                C2109a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }

            /* renamed from: british.x.t_buscchats$j$a$b */
            class C2110b implements DialogInterface.OnShowListener {

                /* renamed from: a */
                final /* synthetic */ AlertDialog f8663a;

                C2110b(AlertDialog alertDialog) {
                    this.f8663a = alertDialog;
                }

                public void onShow(DialogInterface dialogInterface) {
                    Button button = this.f8663a.getButton(-1);
                    button.setTextColor(Color.parseColor("#" + t_buscchats.this.f6656b));
                }
            }

            C2108a() {
            }

            public void onClick(View view) {
                AlertDialog create = new AlertDialog.Builder(t_buscchats.this).setCancelable(true).setPositiveButton(t_buscchats.this.getString(R.string.aceptar), new C2109a()).setMessage(R.string.cat_sinchats).create();
                if (!t_buscchats.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2110b(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            }
        }

        private C2107j() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
                r0.<init>()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "/srv/chats_home.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this     // Catch:{ Exception -> 0x0095 }
                long r1 = r1.f8632m     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idcat="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f8628B     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&chats="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this     // Catch:{ Exception -> 0x0095 }
                boolean r1 = r1.f8638s     // Catch:{ Exception -> 0x0095 }
                r2 = 1
                if (r1 == 0) goto L_0x0031
                r1 = 1
                goto L_0x0032
            L_0x0031:
                r1 = 0
            L_0x0032:
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0095 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0095 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0095 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0095 }
                r0.setDoInput(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r2.<init>(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r1.<init>(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6.<init>()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            L_0x0069:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                if (r2 == 0) goto L_0x0084
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r3.<init>()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r3.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                goto L_0x0069
            L_0x0084:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r0.disconnect()
                return r6
            L_0x008c:
                r6 = move-exception
                goto L_0x009d
            L_0x008e:
                r6 = r0
                goto L_0x0095
            L_0x0090:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x009d
            L_0x0095:
                java.lang.String r0 = "ANDROID:KO"
                if (r6 == 0) goto L_0x009c
                r6.disconnect()
            L_0x009c:
                return r0
            L_0x009d:
                if (r0 == 0) goto L_0x00a2
                r0.disconnect()
            L_0x00a2:
                goto L_0x00a4
            L_0x00a3:
                throw r6
            L_0x00a4:
                goto L_0x00a3
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscchats.C2107j.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* JADX WARNING: type inference failed for: r2v33, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v35, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v37, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v39, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v41, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v43, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v45, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v47, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v49, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v51, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v53, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v55, types: [android.view.View] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                java.lang.String r2 = "ANDROID:OK RESULT:"
                int r3 = r1.indexOf(r2)
                r4 = -1
                if (r3 != r4) goto L_0x0015
                java.lang.String r3 = "ANDROID:KO"
                int r3 = r1.indexOf(r3)
                if (r3 == r4) goto L_0x02f6
            L_0x0015:
                int r2 = r1.indexOf(r2)
                if (r2 == r4) goto L_0x02f6
                british.x.t_buscchats r3 = british.p015x.t_buscchats.this
                android.content.SharedPreferences r3 = r3.f8631E
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.String r5 = "@y@"
                int r2 = r1.indexOf(r5, r2)
                r6 = 0
                r7 = r6
                r8 = r7
            L_0x002c:
                r9 = 2
                if (r2 == r4) goto L_0x0265
                int r2 = r2 + 3
                java.lang.String r10 = ";"
                int r11 = r1.indexOf(r10, r2)
                java.lang.String r2 = r1.substring(r2, r11)
                int r2 = java.lang.Integer.parseInt(r2)
                r12 = 1
                int r11 = r11 + r12
                int r13 = r1.indexOf(r10, r11)
                java.lang.String r11 = r1.substring(r11, r13)
                int r18 = java.lang.Integer.parseInt(r11)
                int r13 = r13 + r12
                int r11 = r1.indexOf(r10, r13)
                java.lang.String r13 = r1.substring(r13, r11)
                int r16 = java.lang.Integer.parseInt(r13)
                int r11 = r11 + r12
                int r13 = r1.indexOf(r10, r11)
                java.lang.String r11 = r1.substring(r11, r13)
                int r17 = java.lang.Integer.parseInt(r11)
                int r13 = r13 + r12
                int r11 = r1.indexOf(r10, r13)
                java.lang.String r13 = r1.substring(r13, r11)
                int r19 = java.lang.Integer.parseInt(r13)
                int r11 = r11 + r12
                int r13 = r1.indexOf(r10, r11)
                java.lang.String r11 = r1.substring(r11, r13)
                int r24 = java.lang.Integer.parseInt(r11)
                int r13 = r13 + r12
                int r11 = r1.indexOf(r10, r13)
                int r11 = r11 + r12
                int r13 = r1.indexOf(r10, r11)
                java.lang.String r11 = r1.substring(r11, r13)
                int r27 = java.lang.Integer.parseInt(r11)
                int r13 = r13 + r12
                int r11 = r1.indexOf(r10, r13)
                java.lang.String r13 = r1.substring(r13, r11)
                int r11 = r11 + r12
                int r14 = r1.indexOf(r10, r11)
                java.lang.String r29 = r1.substring(r11, r14)
                int r14 = r14 + r12
                int r11 = r1.indexOf(r10, r14)
                java.lang.String r30 = r1.substring(r14, r11)
                int r11 = r11 + r12
                int r14 = r1.indexOf(r10, r11)
                java.lang.String r11 = r1.substring(r11, r14)
                int r11 = java.lang.Integer.parseInt(r11)
                int r14 = r14 + r12
                int r15 = r1.indexOf(r10, r14)
                java.lang.String r14 = r1.substring(r14, r15)
                int r25 = java.lang.Integer.parseInt(r14)
                int r15 = r15 + r12
                int r14 = r1.indexOf(r10, r15)
                java.lang.String r15 = r1.substring(r15, r14)
                int r20 = java.lang.Integer.parseInt(r15)
                int r14 = r14 + r12
                int r15 = r1.indexOf(r10, r14)
                java.lang.String r14 = r1.substring(r14, r15)
                int r21 = java.lang.Integer.parseInt(r14)
                int r15 = r15 + r12
                int r14 = r1.indexOf(r10, r15)
                java.lang.String r15 = r1.substring(r15, r14)
                int r22 = java.lang.Integer.parseInt(r15)
                int r14 = r14 + r12
                int r15 = r1.indexOf(r10, r14)
                java.lang.String r14 = r1.substring(r14, r15)
                int r26 = java.lang.Integer.parseInt(r14)
                int r15 = r15 + r12
                int r10 = r1.indexOf(r10, r15)
                java.lang.String r14 = r1.substring(r15, r10)
                int r23 = java.lang.Integer.parseInt(r14)
                if (r2 != r12) goto L_0x0131
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363089(0x7f0a0511, float:1.8345977E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362785(0x7f0a03e1, float:1.834536E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362017(0x7f0a00e1, float:1.8343803E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x0131:
                if (r2 != r9) goto L_0x0159
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363090(0x7f0a0512, float:1.834598E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362786(0x7f0a03e2, float:1.8345362E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362018(0x7f0a00e2, float:1.8343805E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x0159:
                r9 = 3
                if (r2 != r9) goto L_0x0182
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363091(0x7f0a0513, float:1.8345981E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362787(0x7f0a03e3, float:1.8345364E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362019(0x7f0a00e3, float:1.8343807E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x0182:
                r9 = 4
                if (r2 != r9) goto L_0x01aa
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363092(0x7f0a0514, float:1.8345983E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362788(0x7f0a03e4, float:1.8345366E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362020(0x7f0a00e4, float:1.8343809E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x01aa:
                r9 = 5
                if (r2 != r9) goto L_0x01d2
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363093(0x7f0a0515, float:1.8345985E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362789(0x7f0a03e5, float:1.8345368E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362021(0x7f0a00e5, float:1.834381E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x01f9
            L_0x01d2:
                r9 = 6
                if (r2 != r9) goto L_0x01f9
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r7 = 2131363094(0x7f0a0516, float:1.8345987E38)
                android.view.View r2 = r2.findViewById(r7)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r8 = 2131362790(0x7f0a03e6, float:1.834537E38)
                android.view.View r2 = r2.findViewById(r8)
                r8 = r2
                android.widget.TextView r8 = (android.widget.TextView) r8
                british.x.t_buscchats r14 = british.p015x.t_buscchats.this
                r15 = 2131362022(0x7f0a00e6, float:1.8343813E38)
                r28 = r13
                r31 = r11
                r14.m8576b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            L_0x01f9:
                if (r7 == 0) goto L_0x025f
                int r2 = british.p015x.C1692config.f7101A5
                r7.setTextColor(r2)
                int r2 = british.p015x.C1692config.f7102B5
                r8.setTextColor(r2)
                r2 = 99999(0x1869f, float:1.40128E-40)
                int r2 = java.lang.Math.min(r11, r2)
                r7.setText(r13)
                r9 = 10
                r11 = 2131821096(0x7f110228, float:1.9274926E38)
                if (r2 >= r9) goto L_0x0235
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = "<10 "
                r2.append(r9)
                british.x.t_buscchats r9 = british.p015x.t_buscchats.this
                android.content.res.Resources r9 = r9.getResources()
                java.lang.String r9 = r9.getString(r11)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                r8.setText(r2)
                goto L_0x025f
            L_0x0235:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.text.NumberFormat r12 = java.text.NumberFormat.getInstance()
                long r13 = (long) r2
                java.lang.String r2 = r12.format(r13)
                r9.append(r2)
                java.lang.String r2 = " "
                r9.append(r2)
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r11)
                r9.append(r2)
                java.lang.String r2 = r9.toString()
                r8.setText(r2)
            L_0x025f:
                int r2 = r1.indexOf(r5, r10)
                goto L_0x002c
            L_0x0265:
                r3.commit()
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r2.mo8215g()
                java.lang.String r2 = "@z@"
                int r2 = r1.indexOf(r2)
                r3 = 0
                if (r2 == r4) goto L_0x02ea
                int r2 = r2 + r9
                java.lang.String r1 = r1.substring(r2)
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                int r5 = r2.f8628B
                if (r5 != 0) goto L_0x028d
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2130903076(0x7f030024, float:1.741296E38)
                java.lang.String[] r2 = r2.getStringArray(r5)
                goto L_0x0299
            L_0x028d:
                android.content.res.Resources r2 = r2.getResources()
                british.x.t_buscchats r5 = british.p015x.t_buscchats.this
                int r5 = r5.f8635p
                java.lang.String[] r2 = r2.getStringArray(r5)
            L_0x0299:
                r5 = 0
            L_0x029a:
                int r7 = r2.length
                if (r5 >= r7) goto L_0x02ea
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "@"
                r7.append(r8)
                r9 = r2[r5]
                r7.append(r9)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r7 = r1.indexOf(r7)
                if (r7 != r4) goto L_0x02e7
                british.x.t_buscchats r7 = british.p015x.t_buscchats.this
                android.widget.GridView r7 = r7.f8629C
                android.view.View r7 = r7.getChildAt(r5)
                r8 = -3355444(0xffffffffffcccccc, float:NaN)
                r7.setBackgroundColor(r8)
                british.x.t_buscchats r7 = british.p015x.t_buscchats.this
                android.widget.GridView r7 = r7.f8629C
                android.view.View r7 = r7.getChildAt(r5)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
                r7.setTextColor(r8)
                british.x.t_buscchats r7 = british.p015x.t_buscchats.this
                android.widget.GridView r7 = r7.f8629C
                android.view.View r7 = r7.getChildAt(r5)
                british.x.t_buscchats$j$a r8 = new british.x.t_buscchats$j$a
                r8.<init>()
                r7.setOnClickListener(r8)
            L_0x02e7:
                int r5 = r5 + 1
                goto L_0x029a
            L_0x02ea:
                british.x.t_buscchats$k r1 = new british.x.t_buscchats$k
                british.x.t_buscchats r2 = british.p015x.t_buscchats.this
                r1.<init>()
                java.lang.String[] r2 = new java.lang.String[r3]
                r1.execute(r2)
            L_0x02f6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscchats.C2107j.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: british.x.t_buscchats$k */
    private class C2111k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f8665a;

        /* renamed from: b */
        Bitmap f8666b;

        /* renamed from: c */
        ImageView f8667c;

        private C2111k() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                URL url = new URL(C1692config.f7108H5 + "/srv/imgs/gen/" + this.f8665a + "_ico.png");
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                inputStream.close();
                httpURLConnection.disconnect();
                int round = Math.round(TypedValue.applyDimension(1, 200.0f, t_buscchats.this.getResources().getDisplayMetrics()));
                options.inSampleSize = C1692config.m8192m(options, round, round);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
                httpURLConnection2.connect();
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                options.inJustDecodeBounds = false;
                this.f8666b = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                inputStream2.close();
                return "ANDROID:OK";
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.indexOf("ANDROID:OK") != -1) {
                this.f8667c.setImageBitmap(this.f8666b);
                C1692config.m8172V(this.f8667c);
            }
            t_buscchats t_buscchats = t_buscchats.this;
            int i = t_buscchats.f8627A;
            if (i < 6) {
                t_buscchats.f8627A = i + 1;
                new C2111k().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:3:0x0008  */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x001e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreExecute() {
            /*
                r5 = this;
                r0 = 0
            L_0x0001:
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                int r2 = r1.f8627A
                r3 = 1
                if (r2 != r3) goto L_0x001e
                r0 = 2131362017(0x7f0a00e1, float:1.8343803E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362341(0x7f0a0225, float:1.834446E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
                goto L_0x0095
            L_0x001e:
                r4 = 2
                if (r2 != r4) goto L_0x0036
                r0 = 2131362018(0x7f0a00e2, float:1.8343805E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362342(0x7f0a0226, float:1.8344462E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
                goto L_0x0095
            L_0x0036:
                r4 = 3
                if (r2 != r4) goto L_0x004e
                r0 = 2131362019(0x7f0a00e3, float:1.8343807E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362343(0x7f0a0227, float:1.8344464E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
                goto L_0x0095
            L_0x004e:
                r4 = 4
                if (r2 != r4) goto L_0x0066
                r0 = 2131362020(0x7f0a00e4, float:1.8343809E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362344(0x7f0a0228, float:1.8344466E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
                goto L_0x0095
            L_0x0066:
                r4 = 5
                if (r2 != r4) goto L_0x007e
                r0 = 2131362021(0x7f0a00e5, float:1.834381E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362345(0x7f0a0229, float:1.8344468E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
                goto L_0x0095
            L_0x007e:
                r4 = 6
                if (r2 != r4) goto L_0x0095
                r0 = 2131362022(0x7f0a00e6, float:1.8343813E38)
                android.view.View r0 = r1.findViewById(r0)
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                r2 = 2131362346(0x7f0a022a, float:1.834447E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.f8667c = r1
            L_0x0095:
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                int r2 = r1.f8627A
                int r2 = r2 + r3
                r1.f8627A = r2
                java.lang.Object r1 = r0.getTag()
                if (r1 != 0) goto L_0x00a9
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                int r1 = r1.f8627A
                r2 = 7
                if (r1 < r2) goto L_0x0001
            L_0x00a9:
                java.lang.Object r1 = r0.getTag()
                if (r1 != 0) goto L_0x00b3
                r5.cancel(r3)
                goto L_0x00d8
            L_0x00b3:
                british.x.t_buscchats r1 = british.p015x.t_buscchats.this
                int r2 = r1.f8627A
                int r2 = r2 - r3
                r1.f8627A = r2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 2131362976(0x7f0a04a0, float:1.8345748E38)
                java.lang.Object r0 = r0.getTag(r2)
                r1.append(r0)
                java.lang.String r0 = ""
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                int r0 = java.lang.Integer.parseInt(r0)
                r5.f8665a = r0
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscchats.C2111k.onPreExecute():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8576b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, String str3, int i14) {
        findViewById(i).setTag(Integer.valueOf(i2));
        findViewById(i).setTag(R.id.tag_idtema, Integer.valueOf(i3));
        findViewById(i).setTag(R.id.tag_idapp, Integer.valueOf(i4));
        findViewById(i).setTag(R.id.tag_fotos_perfil, Integer.valueOf(i5));
        findViewById(i).setTag(R.id.tag_fnac, Integer.valueOf(i6));
        findViewById(i).setTag(R.id.tag_sexo, Integer.valueOf(i7));
        findViewById(i).setTag(R.id.tag_descr, Integer.valueOf(i8));
        findViewById(i).setTag(R.id.tag_dist, Integer.valueOf(i9));
        findViewById(i).setTag(R.id.tag_privados, Integer.valueOf(i10));
        findViewById(i).setTag(R.id.tag_coments, Integer.valueOf(i11));
        findViewById(i).setTag(R.id.tag_galeria, Integer.valueOf(i12));
        findViewById(i).setTag(R.id.tag_fotos_chat, Integer.valueOf(i13));
        findViewById(i).setTag(R.id.tag_titulo, str);
        findViewById(i).setTag(R.id.tag_c1, str2);
        findViewById(i).setTag(R.id.tag_c2, str3);
        findViewById(i).setTag(R.id.tag_nusus, Integer.valueOf(i14));
        findViewById(i).setOnClickListener(this);
    }

    /* renamed from: d */
    private void m8577d(Context context) {
        this.f6662h = new C2102g(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8636q.mo7510j0(view, this);
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
                    if (this.f8636q.f7427t4 != 2) {
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

    /* renamed from: c */
    public int mo8212c(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8213e() {
        int q0 = this.f8636q.mo7522q0(this);
        int i = this.f8636q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8630D = listView;
            this.f8636q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8636q.f7231O1;
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
            int[] iArr = this.f8636q.f7249R1;
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

    @TargetApi(13)
    /* renamed from: f */
    public int mo8214f() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT < 13) {
            return defaultDisplay.getWidth();
        }
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8215g() {
        if (this.f8638s) {
            int f = mo8214f();
            int c = mo8212c(10.0f, this);
            int c2 = (f - (c * 2)) / (mo8212c(120.0f, this) + c);
            findViewById(R.id.ll_chats_fila1).setVisibility(0);
            findViewById(R.id.rl_chats_fila1).setVisibility(0);
            findViewById(R.id.ll_chats_fila2).setVisibility(0);
            findViewById(R.id.rl_chats_fila2).setVisibility(0);
            findViewById(R.id.card_view_1).setVisibility(0);
            findViewById(R.id.card_view_2).setVisibility(0);
            findViewById(R.id.card_view_3).setVisibility(0);
            findViewById(R.id.card_view_4).setVisibility(0);
            findViewById(R.id.card_view_5).setVisibility(0);
            findViewById(R.id.card_view_6).setVisibility(0);
            if (c2 < 3) {
                findViewById(R.id.card_view_3).setVisibility(8);
                findViewById(R.id.card_view_6).setVisibility(8);
                if (c2 < 2) {
                    findViewById(R.id.card_view_2).setVisibility(8);
                    findViewById(R.id.card_view_5).setVisibility(8);
                }
            }
            if (findViewById(R.id.card_view_3).getTag() == null) {
                findViewById(R.id.card_view_3).setVisibility(8);
                if (findViewById(R.id.card_view_2).getTag() == null) {
                    findViewById(R.id.card_view_2).setVisibility(8);
                    if (findViewById(R.id.card_view_1).getTag() == null) {
                        findViewById(R.id.ll_chats_fila1).setVisibility(8);
                        findViewById(R.id.rl_chats_fila1).setVisibility(8);
                    }
                }
            }
            if (findViewById(R.id.card_view_6).getTag() == null) {
                findViewById(R.id.card_view_6).setVisibility(8);
                if (findViewById(R.id.card_view_5).getTag() == null) {
                    findViewById(R.id.card_view_5).setVisibility(8);
                    if (findViewById(R.id.card_view_4).getTag() == null) {
                        findViewById(R.id.ll_chats_fila2).setVisibility(8);
                        findViewById(R.id.rl_chats_fila2).setVisibility(8);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8216h() {
        int f = (mo8214f() - this.f8645z) / this.f8644y;
        int i = this.f8628B > 0 ? this.f8635p : R.array.cats_menu_a;
        ViewGroup.LayoutParams layoutParams = this.f8629C.getLayoutParams();
        layoutParams.height = mo8212c((float) ((((int) Math.ceil((double) (((float) getResources().getStringArray(i).length) / ((float) f)))) * 40) - 5), this);
        this.f8629C.setLayoutParams(layoutParams);
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
        if (this.f8641v) {
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
        if (!this.f6659e || this.f8637r || !this.f8636q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8637r = true;
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
        boolean z = true;
        if (view.getId() == R.id.tv_fav) {
            Intent intent = new Intent(this, t_buscchats_lista.class);
            intent.putExtra("ind", this.f8633n);
            intent.putExtra("idcat", 0);
            intent.putExtra("tipo", 3);
            intent.putExtra("tit_cab", getResources().getString(R.string.favoritos).charAt(0) + getResources().getString(R.string.favoritos).substring(1).toLowerCase());
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.tv_mas_nuevos) {
            Intent intent2 = new Intent(this, t_buscchats_lista.class);
            intent2.putExtra("ind", this.f8633n);
            intent2.putExtra("idcat", this.f8628B);
            intent2.putExtra("tipo", 1);
            intent2.putExtra("tit_cab", getResources().getString(R.string.chats_nuevos));
            startActivityForResult(intent2, 0);
        } else if (view.getId() == R.id.tv_mas_pop) {
            Intent intent3 = new Intent(this, t_buscchats_lista.class);
            intent3.putExtra("ind", this.f8633n);
            intent3.putExtra("idcat", this.f8628B);
            intent3.putExtra("tipo", 2);
            intent3.putExtra("tit_cab", getResources().getString(R.string.chats_maspopulares));
            startActivityForResult(intent3, 0);
        } else if (view.getId() == R.id.card_view_1 || view.getId() == R.id.card_view_2 || view.getId() == R.id.card_view_3 || view.getId() == R.id.card_view_4 || view.getId() == R.id.card_view_5 || view.getId() == R.id.card_view_6) {
            Intent intent4 = new Intent(this, t_chat_contra.class);
            intent4.putExtra("externo", true);
            intent4.putExtra("idapp", Integer.parseInt(view.getTag(R.id.tag_idapp) + ""));
            intent4.putExtra("idchat", Integer.parseInt(view.getTag() + ""));
            intent4.putExtra("idtema", Integer.parseInt(view.getTag(R.id.tag_idtema) + ""));
            intent4.putExtra("fotos_perfil", Integer.parseInt(view.getTag(R.id.tag_fotos_perfil) + ""));
            intent4.putExtra("fnac", Integer.parseInt(view.getTag(R.id.tag_fnac) + ""));
            intent4.putExtra("sexo", Integer.parseInt(view.getTag(R.id.tag_sexo) + ""));
            intent4.putExtra("descr", Integer.parseInt(view.getTag(R.id.tag_descr) + ""));
            intent4.putExtra("dist", Integer.parseInt(view.getTag(R.id.tag_dist) + ""));
            StringBuilder sb = new StringBuilder();
            sb.append(view.getTag(R.id.tag_privados));
            sb.append("");
            intent4.putExtra("privados", Integer.parseInt(sb.toString()) == 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(view.getTag(R.id.tag_coments));
            sb2.append("");
            intent4.putExtra("coments", Integer.parseInt(sb2.toString()) == 1);
            if (Integer.parseInt(view.getTag(R.id.tag_galeria) + "") != 1) {
                z = false;
            }
            intent4.putExtra("galeria", z);
            intent4.putExtra("fotos_chat", Integer.parseInt(view.getTag(R.id.tag_fotos_chat) + ""));
            intent4.putExtra("c1", view.getTag(R.id.tag_c1) + "");
            intent4.putExtra("c2", view.getTag(R.id.tag_c2) + "");
            intent4.putExtra("tit_cab", view.getTag(R.id.tag_titulo) + "");
            startActivityForResult(intent4, 0);
        } else {
            String str9 = this.f8636q.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f8636q.f7281W3) == null || str.equals("")) && (((str2 = this.f8636q.f7250R2) == null || str2.equals("")) && (((str3 = this.f8636q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8636q.f7269U3) == null || str4.equals("")) && (((str5 = this.f8636q.f7275V3) == null || str5.equals("")) && (((str6 = this.f8636q.f7358j4) == null || str6.equals("")) && (((str7 = this.f8636q.f7287X3) == null || str7.equals("")) && ((str8 = this.f8636q.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f8636q.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f8636q.f7251R3);
            }
            String str11 = this.f8636q.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f8636q.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f8636q.f7269U3);
            }
            String str13 = this.f8636q.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f8636q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8213e();
        mo8216h();
        mo8215g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8640u;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8640u;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8640u = this.f8636q.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        int i;
        Bundle bundle2 = bundle;
        C1692config config = (C1692config) getApplicationContext();
        this.f8636q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8577d(this);
        this.f6666l = new C2096a();
        Bundle extras = getIntent().getExtras();
        this.f8639t = extras;
        if (bundle2 == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8639t.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f8633n = this.f8639t.getInt("ind");
        this.f8628B = this.f8639t.getInt("idcat", 0);
        C1692config config2 = this.f8636q;
        this.f6656b = C1692config.m8189h(config2.f7231O1[this.f8633n].f7916g, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f8636q.f7231O1[this.f8633n].f7916g)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscchats);
        mo8213e();
        this.f8636q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2097b());
        searchManager.setOnDismissListener(new C2098c());
        C1692config config3 = this.f8636q;
        Bundle bundle3 = this.f8639t;
        boolean z = bundle3 != null && bundle3.containsKey("ad_entrar");
        Bundle bundle4 = this.f8639t;
        config3.mo7503f1(this, z, bundle4 != null && bundle4.containsKey("fb_entrar"));
        this.f8640u = this.f8636q.mo7474A0(this, false);
        if (this.f8628B == 0) {
            C1692config config4 = this.f8636q;
            config4.mo7488Q0(this, config4.f7318d, this.f6656b, bundle2);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8631E = sharedPreferences;
        if (this.f8636q.f7163D > 0) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (this.f8636q.f7163D > 0) {
            int i2 = this.f8631E.getInt("fondo_v_act", 0);
            C1692config config5 = this.f8636q;
            if (i2 == config5.f7163D) {
                try {
                    config5.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8636q.f7145A), this.f8636q.f7157C);
                    this.f8636q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        }
        int i3 = C1692config.f7101A5;
        if (!this.f8636q.f7231O1[this.f8633n].f7916g.equals("")) {
            if (!C1692config.m8153I("#" + this.f8636q.f7231O1[this.f8633n].f7916g)) {
                findViewById(R.id.ll_cabe).setBackgroundColor(C1692config.f7105E5);
                ((TextView) findViewById(R.id.tv_cabe)).setTextColor(i3);
                i = -1;
            } else {
                findViewById(R.id.ll_cabe).setBackgroundColor(C1692config.f7106F5);
                ((TextView) findViewById(R.id.tv_cabe)).setTextColor(-1);
                i = i3;
            }
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8636q.f7231O1[this.f8633n].f7916g), Color.parseColor("#" + this.f8636q.f7231O1[this.f8633n].f7919h)}));
        } else {
            i = i3;
        }
        this.f8632m = this.f8631E.getLong("idusu", 0);
        ((TextView) findViewById(R.id.tv_cats)).setTextColor(i);
        ((TextView) findViewById(R.id.tv_nuevos)).setTextColor(i);
        ((TextView) findViewById(R.id.tv_populares)).setTextColor(i);
        if (!this.f6656b.equals("")) {
            ((TextView) findViewById(R.id.tv_fav)).setBackgroundColor(Color.parseColor("#" + this.f6656b));
            ((TextView) findViewById(R.id.tv_mas_nuevos)).setBackgroundColor(Color.parseColor("#" + this.f6656b));
            ((TextView) findViewById(R.id.tv_mas_pop)).setBackgroundColor(Color.parseColor("#" + this.f6656b));
            if (!C1692config.m8153I("#" + this.f6656b)) {
                i3 = -1;
            }
            ((TextView) findViewById(R.id.tv_fav)).setTextColor(i3);
            ((TextView) findViewById(R.id.tv_mas_nuevos)).setTextColor(i3);
            ((TextView) findViewById(R.id.tv_mas_pop)).setTextColor(i3);
        } else {
            ((TextView) findViewById(R.id.tv_fav)).setTextColor(i);
            ((TextView) findViewById(R.id.tv_mas_nuevos)).setTextColor(i);
            ((TextView) findViewById(R.id.tv_mas_pop)).setTextColor(i);
        }
        Bundle bundle5 = this.f8639t;
        if (bundle5 != null && bundle5.containsKey("tit_cab")) {
            ((TextView) findViewById(R.id.tv_cabe)).setText(this.f8639t.getString("tit_cab"));
            findViewById(R.id.tv_cabe).setOnClickListener(new C2099d());
            findViewById(R.id.iv_cabe).setOnClickListener(new C2100e());
            findViewById(R.id.ll_cabe).setVisibility(0);
        }
        this.f8638s = true;
        int i4 = this.f8628B;
        if (i4 > 0) {
            if (i4 == 1) {
                this.f8634o = R.array.cats_1_a;
                this.f8635p = R.array.idcats_1_a;
            } else if (i4 == 2) {
                this.f8634o = R.array.cats_2_a;
                this.f8635p = R.array.idcats_2_a;
            } else if (i4 == 3) {
                this.f8634o = R.array.cats_3_a;
                this.f8635p = R.array.idcats_3_a;
            } else if (i4 == 4) {
                this.f8634o = R.array.cats_4_a;
                this.f8635p = R.array.idcats_4_a;
            } else if (i4 == 5) {
                this.f8634o = R.array.cats_5_a;
                this.f8635p = R.array.idcats_5_a;
            } else if (i4 == 6) {
                this.f8634o = R.array.cats_6_a;
                this.f8635p = R.array.idcats_6_a;
            } else if (i4 == 7) {
                this.f8634o = R.array.cats_7_a;
                this.f8635p = R.array.idcats_7_a;
            } else if (i4 == 9) {
                this.f8634o = R.array.cats_9_a;
                this.f8635p = R.array.idcats_9_a;
            } else if (i4 == 10) {
                this.f8634o = R.array.cats_10_a;
                this.f8635p = R.array.idcats_10_a;
            } else if (i4 == 11) {
                this.f8634o = R.array.cats_11_a;
                this.f8635p = R.array.idcats_11_a;
            } else if (i4 == 12) {
                this.f8634o = R.array.cats_12_a;
                this.f8635p = R.array.idcats_12_a;
            } else if (i4 == 13) {
                this.f8634o = R.array.cats_13_a;
                this.f8635p = R.array.idcats_13_a;
            } else if (i4 == 14) {
                this.f8634o = R.array.cats_14_a;
                this.f8635p = R.array.idcats_14_a;
            } else if (i4 == 15) {
                this.f8634o = R.array.cats_15_a;
                this.f8635p = R.array.idcats_15_a;
            }
            if (this.f8636q.f7231O1[this.f8633n].f7861H0 == 0) {
                this.f8638s = false;
                findViewById(R.id.rl_chats_fila1).setVisibility(8);
                findViewById(R.id.ll_chats_fila1).setVisibility(8);
                findViewById(R.id.rl_chats_fila2).setVisibility(8);
                findViewById(R.id.ll_chats_fila2).setVisibility(8);
            }
        }
        GridView gridView = (GridView) findViewById(R.id.gridview);
        this.f8629C = gridView;
        gridView.setAdapter(new C2106i(this));
        this.f8629C.setOnItemClickListener(new C2101f());
        this.f8642w = (int) ((getResources().getDisplayMetrics().density * 30.0f) + 0.5f);
        this.f8643x = (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
        this.f8644y = mo8212c(149.0f, this);
        this.f8645z = mo8212c(10.0f, this);
        mo8216h();
        findViewById(R.id.tv_fav).setOnClickListener(this);
        findViewById(R.id.tv_mas_nuevos).setOnClickListener(this);
        findViewById(R.id.tv_mas_pop).setOnClickListener(this);
        new C2107j().execute(new String[0]);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8636q.f7384n3 == 0 || (cVar3 = this.f8640u) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8636q.f7384n3 == 0 || (cVar2 = this.f8640u) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8636q.f7384n3 == 0 || (cVar = this.f8640u) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f8636q.f7384n3 == 0 || (cVar = this.f8640u) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2105h());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8636q.f7384n3 != 0 && (cVar = this.f8640u) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8641v = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8641v) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8641v = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            try {
                this.f8636q.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8636q.f7145A), this.f8636q.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f8636q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f8641v = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8641v = true;
        C1692config.m8175Y0(this);
    }
}
