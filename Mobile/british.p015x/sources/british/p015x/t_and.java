package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
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

/* renamed from: british.x.t_and */
public class t_and extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    Bundle f8521A;

    /* renamed from: B */
    C1603c f8522B;

    /* renamed from: C */
    boolean f8523C = false;

    /* renamed from: D */
    SharedPreferences f8524D;

    /* renamed from: E */
    ListView f8525E;

    /* renamed from: F */
    C1598b f8526F;

    /* renamed from: G */
    float f8527G;

    /* renamed from: m */
    C1692config f8528m;

    /* renamed from: n */
    boolean f8529n = false;

    /* renamed from: o */
    String f8530o;

    /* renamed from: p */
    int f8531p;

    /* renamed from: q */
    int f8532q;

    /* renamed from: r */
    int f8533r;

    /* renamed from: s */
    int f8534s = -1;

    /* renamed from: t */
    int[] f8535t;

    /* renamed from: u */
    ImageView[] f8536u;

    /* renamed from: v */
    ProgressBar[] f8537v;

    /* renamed from: w */
    int[][] f8538w;

    /* renamed from: x */
    Bitmap f8539x;

    /* renamed from: y */
    C1855l f8540y;

    /* renamed from: z */
    File f8541z;

    /* renamed from: british.x.t_and$a */
    class C2064a implements AdDisplayListener {
        C2064a() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_and t_and = t_and.this;
            if (t_and.f8523C) {
                t_and.abrir_secc(t_and.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_and$b */
    class C2065b extends AdColonyInterstitialListener {
        C2065b() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_and t_and = t_and.this;
            if (t_and.f8523C) {
                t_and.abrir_secc(t_and.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_and.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_and.this.f6661g.cancel();
            t_and t_and = t_and.this;
            t_and.abrir_secc(t_and.f6660f);
        }
    }

    /* renamed from: british.x.t_and$c */
    class C2066c implements SearchManager.OnCancelListener {
        C2066c() {
        }

        public void onCancel() {
            t_and t_and = t_and.this;
            t_and.f6657c = false;
            t_and.setResult(0);
        }
    }

    /* renamed from: british.x.t_and$d */
    class C2067d implements SearchManager.OnDismissListener {
        C2067d() {
        }

        public void onDismiss() {
            t_and.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_and$e */
    class C2068e implements View.OnClickListener {

        /* renamed from: b */
        private String f8546b;

        C2068e() {
            this.f8546b = t_and.this.f8526F.f6853I;
        }

        public void onClick(View view) {
            t_and.this.m8547e(this.f8546b);
        }
    }

    /* renamed from: british.x.t_and$f */
    class C2069f implements View.OnClickListener {
        C2069f() {
        }

        public void onClick(View view) {
            t_and t_and = t_and.this;
            File fileStreamPath = t_and.getFileStreamPath("it_fcab" + t_and.this.f8526F.f6857b + ".png");
            if (fileStreamPath != null && fileStreamPath.exists()) {
                Intent intent = new Intent(t_and.this, t_url.class);
                intent.putExtra("url", "file://" + fileStreamPath);
                t_and.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_and$g */
    class C2070g implements View.OnClickListener {

        /* renamed from: b */
        private String f8549b;

        C2070g() {
            this.f8549b = t_and.this.f8530o;
        }

        public void onClick(View view) {
            t_and.this.m8547e(this.f8549b);
        }
    }

    /* renamed from: british.x.t_and$h */
    class C2071h implements View.OnClickListener {

        /* renamed from: b */
        private File f8551b;

        C2071h() {
            this.f8551b = t_and.this.f8541z;
        }

        public void onClick(View view) {
            File file = this.f8551b;
            if (file != null && file.exists()) {
                Intent intent = new Intent(t_and.this, t_url.class);
                intent.putExtra("url", "file://" + this.f8551b);
                t_and.this.startActivityForResult(intent, 0);
            }
        }
    }

    /* renamed from: british.x.t_and$i */
    class C2072i extends ClickableSpan {

        /* renamed from: b */
        String f8553b;

        C2072i() {
            this.f8553b = t_and.this.f8530o;
        }

        public void onClick(View view) {
            t_and.this.m8547e(this.f8553b);
        }
    }

    /* renamed from: british.x.t_and$j */
    class C2073j extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8555a;

        /* renamed from: british.x.t_and$j$a */
        class C2074a extends FullScreenContentCallback {
            C2074a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_and t_and = t_and.this;
                if (t_and.f8523C) {
                    t_and.abrir_secc(t_and.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_and t_and = t_and.this;
                t_and.abrir_secc(t_and.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_and$j$b */
        class C2075b implements OnUserEarnedRewardListener {
            C2075b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2073j jVar = C2073j.this;
                t_and.this.f8523C = true;
                C1692config.m8175Y0(jVar.f8555a);
            }
        }

        C2073j(Context context) {
            this.f8555a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_and.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2074a());
            rewardedAd.show((Activity) this.f8555a, new C2075b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_and t_and = t_and.this;
            if (!t_and.f8528m.mo7502f(this.f8555a, t_and.f6663i)) {
                t_and.this.f6661g.cancel();
                t_and t_and2 = t_and.this;
                t_and2.abrir_secc(t_and2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_and$k */
    private class C2076k extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8559a;

        private C2076k() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d6, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00d2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                british.x.t_and r6 = british.p015x.t_and.this
                int[][] r0 = r6.f8538w
                int r6 = r6.f8531p
                r6 = r0[r6]
                r0 = 1
                r6 = r6[r0]
                java.lang.String r1 = ".png"
                if (r6 != 0) goto L_0x004f
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7109I5
                r6.append(r2)
                java.lang.String r2 = "/srv/imgs/and_items/fcab"
                r6.append(r2)
                british.x.t_and r2 = british.p015x.t_and.this
                int[] r3 = r2.f8535t
                int r2 = r2.f8531p
                r2 = r3[r2]
                r6.append(r2)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "it_fcab"
                r2.append(r3)
                british.x.t_and r3 = british.p015x.t_and.this
                int[] r4 = r3.f8535t
                int r3 = r3.f8531p
                r3 = r4[r3]
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r5.f8559a = r1
                goto L_0x008e
            L_0x004f:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7108H5
                r6.append(r2)
                java.lang.String r2 = "/srv/imgs/and_items/f"
                r6.append(r2)
                british.x.t_and r2 = british.p015x.t_and.this
                int[] r3 = r2.f8535t
                int r2 = r2.f8531p
                r2 = r3[r2]
                r6.append(r2)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "it_f"
                r2.append(r3)
                british.x.t_and r3 = british.p015x.t_and.this
                int[] r4 = r3.f8535t
                int r3 = r3.f8531p
                r3 = r4[r3]
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r5.f8559a = r1
            L_0x008e:
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00dc }
                r2.<init>(r6)     // Catch:{ MalformedURLException -> 0x00dc }
                java.net.URLConnection r6 = r2.openConnection()     // Catch:{ IOException -> 0x00d7 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00d7 }
                r6.setDoInput(r0)     // Catch:{ IOException -> 0x00d7 }
                r0 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00d7 }
                r0 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r0)     // Catch:{ IOException -> 0x00d7 }
                r6.connect()     // Catch:{ IOException -> 0x00d7 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x00d7 }
                british.x.t_and r0 = british.p015x.t_and.this     // Catch:{ IOException -> 0x00d7 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x00d7 }
                r0.f8539x = r6     // Catch:{ IOException -> 0x00d7 }
                british.x.t_and r6 = british.p015x.t_and.this     // Catch:{ Exception -> 0x00d2 }
                java.lang.String r0 = r5.f8559a     // Catch:{ Exception -> 0x00d2 }
                r2 = 0
                java.io.FileOutputStream r6 = r6.openFileOutput(r0, r2)     // Catch:{ Exception -> 0x00d2 }
                british.x.t_and r0 = british.p015x.t_and.this     // Catch:{ Exception -> 0x00d2 }
                android.graphics.Bitmap r0 = r0.f8539x     // Catch:{ Exception -> 0x00d2 }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00d2 }
                r4 = 100
                r0.compress(r3, r4, r6)     // Catch:{ Exception -> 0x00d2 }
                r6.close()     // Catch:{ Exception -> 0x00d2 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r2)
                return r6
            L_0x00d2:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)     // Catch:{ IOException -> 0x00d7 }
                return r6
            L_0x00d7:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
                return r6
            L_0x00dc:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_and.C2076k.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                t_and t_and = t_and.this;
                int[][] iArr = t_and.f8538w;
                int i = t_and.f8531p;
                int i2 = iArr[i][0];
                int i3 = iArr[i][1];
                int[] Y = t_and.f8528m.mo7493Y(this.f8559a, t_and.f8536u[i]);
                if (i3 > 0 && Y[0] > 0) {
                    int i4 = Y[0];
                    t_and t_and2 = t_and.this;
                    int i5 = t_and2.f8533r;
                    if (i4 > i5) {
                        Y[1] = (Y[1] * i5) / Y[0];
                        Y[0] = i5;
                    }
                    float f = t_and2.f8527G;
                    t_and2.f8536u[t_and2.f8531p].getLayoutParams().width = (int) ((((float) Y[0]) * f) + 0.5f);
                    t_and t_and3 = t_and.this;
                    t_and3.f8536u[t_and3.f8531p].getLayoutParams().height = (int) ((((float) Y[1]) * f) + 0.5f);
                }
                t_and t_and4 = t_and.this;
                t_and4.f8537v[t_and4.f8531p].setVisibility(8);
                t_and t_and5 = t_and.this;
                C1692config.m8172V(t_and5.f8536u[t_and5.f8531p]);
                SharedPreferences.Editor edit = t_and.this.f8524D.edit();
                if (i3 == 0) {
                    edit.putInt("it" + t_and.this.f8540y.f7865J0[i2].f6856a + "_fcab_modif", 0);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("it_f");
                    t_and t_and6 = t_and.this;
                    sb.append(t_and6.f8535t[t_and6.f8531p]);
                    sb.append("_modif");
                    edit.putInt(sb.toString(), 0);
                }
                edit.commit();
                if (i3 == 0) {
                    t_and.this.f8540y.f7865J0[i2].f6858c = 0;
                } else {
                    t_and.this.f8540y.f7865J0[i2].f6854J[i3 - 1][1] = 0;
                }
            }
            t_and t_and7 = t_and.this;
            int i6 = t_and7.f8531p + 1;
            t_and7.f8531p = i6;
            if (i6 < t_and7.f8532q) {
                new C2076k().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: b */
    private void m8545b(Context context) {
        this.f6662h = new C2073j(context);
    }

    /* renamed from: d */
    private void m8546d(TextView textView, String str, int i, int i2, int i3, int i4, String str2, int i5, int i6, boolean z) {
        Typeface typeface;
        int i7;
        int i8;
        TextView textView2 = textView;
        String str3 = str;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        String str4 = str2;
        int i13 = i5;
        if (i9 == 0) {
            textView2.setGravity(8388611);
            if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView2.setTextDirection(4);
            }
        } else if (i9 == 1) {
            textView2.setGravity(17);
        }
        if (i12 == 1) {
            typeface = C1692config.f7144r6;
        } else if (i12 == 2) {
            typeface = C1692config.f7142p6;
        } else if (i12 == 3) {
            typeface = C1692config.f7143q6;
        } else {
            typeface = Typeface.DEFAULT;
        }
        if (i10 == 1 && i11 == 1) {
            textView2.setTypeface(Typeface.create(typeface, 3));
        } else if (i10 == 1 && i11 == 0) {
            textView2.setTypeface(Typeface.create(typeface, 1));
        } else if (i10 == 0 && i11 == 1) {
            textView2.setTypeface(Typeface.create(typeface, 2));
        } else {
            textView2.setTypeface(typeface);
        }
        if (!str4.equals("")) {
            textView2.setTextColor(Color.parseColor("#" + str4));
            textView2.setLinkTextColor(Color.parseColor("#" + str4));
        }
        if (z) {
            if (str.toUpperCase().indexOf("<BR") == -1) {
                str3 = str3.replace("\n", "<br>");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str3.replace("<a href", "@AHREF_INI@").replace("<A HREF", "@AHREF_INI@").replace("</a>", "@AHREF_FIN@").replace("</A>", "@AHREF_FIN@").replace("</ a>", "@AHREF_FIN@").replace("</ A>", "@AHREF_FIN@")));
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            while (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, indexOf + 11, "<a href");
                spannableStringBuilder2 = spannableStringBuilder.toString();
                indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            }
            for (int indexOf2 = spannableStringBuilder2.indexOf("@AHREF_FIN@"); indexOf2 != -1; indexOf2 = spannableStringBuilder.toString().indexOf("@AHREF_FIN@")) {
                spannableStringBuilder.replace(indexOf2, indexOf2 + 11, "</a>");
            }
            if (i13 == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), 0, spannableStringBuilder.length(), 0);
            }
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            String upperCase = spannableStringBuilder3.toUpperCase();
            int indexOf3 = upperCase.indexOf("<A HREF=");
            while (indexOf3 != -1) {
                int i14 = indexOf3 + 8;
                int i15 = i14 + 1;
                String substring = spannableStringBuilder3.substring(i14, i15);
                if (substring.equals("\"") || substring.equals("'")) {
                    i14 = i15;
                }
                if (substring.equals("\"")) {
                    i8 = spannableStringBuilder3.indexOf("\"", i14);
                } else if (substring.equals("'")) {
                    i8 = spannableStringBuilder3.indexOf("'", i14);
                } else {
                    i8 = spannableStringBuilder3.indexOf(">", i14);
                }
                if (i8 != -1) {
                    this.f8530o = spannableStringBuilder3.substring(i14, i8).trim();
                    i8 = spannableStringBuilder3.indexOf(">", i8);
                    if (i8 != -1) {
                        int indexOf4 = upperCase.indexOf("</A>", i8);
                        int i16 = Integer.MAX_VALUE;
                        if (indexOf4 == -1) {
                            indexOf4 = Integer.MAX_VALUE;
                        }
                        int indexOf5 = upperCase.indexOf("</ A>", i8);
                        if (indexOf5 != -1) {
                            i16 = indexOf5;
                        }
                        if (indexOf4 == -1 && i16 == -1) {
                            i14 = i8;
                        } else {
                            int min = Math.min(indexOf4, i16);
                            int indexOf6 = spannableStringBuilder3.indexOf(">", min);
                            spannableStringBuilder.setSpan(new C2072i(), i8, min, 33);
                            int i17 = indexOf6 + 1;
                            spannableStringBuilder.delete(min, i17);
                            int i18 = min - (i17 - min);
                            int i19 = i8 + 1;
                            spannableStringBuilder.delete(indexOf3, i19);
                            int i20 = i18 - (i19 - indexOf3);
                            String spannableStringBuilder4 = spannableStringBuilder.toString();
                            i14 = i8;
                            i8 = i20;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            upperCase = spannableStringBuilder4.toUpperCase();
                        }
                    }
                }
                if (i8 == -1) {
                    i8 = i14;
                }
                indexOf3 = upperCase.indexOf("<A HREF=", i8);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            i7 = 0;
        } else if (i13 == 1) {
            SpannableString spannableString = new SpannableString(str3);
            i7 = 0;
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            textView2.setText(spannableString);
        } else {
            i7 = 0;
            textView.setText(str);
        }
        if (i6 != 0) {
            textView2.setTextSize(i7, textView.getTextSize() + ((float) (i6 * 2)));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8547e(java.lang.String r34) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            java.lang.String r0 = r34.toLowerCase()
            java.lang.String r13 = "doc"
            java.lang.String r14 = "docx"
            java.lang.String r15 = "xls"
            java.lang.String r16 = "xlsx"
            java.lang.String r17 = "ppt"
            java.lang.String r18 = "pptx"
            java.lang.String r19 = "pdf"
            java.lang.String r20 = "pages"
            java.lang.String r21 = "ai"
            java.lang.String r22 = "psd"
            java.lang.String r23 = "tiff"
            java.lang.String r24 = "dxf"
            java.lang.String r25 = "svg"
            java.lang.String r26 = "eps"
            java.lang.String r27 = "ps"
            java.lang.String r28 = "ttf"
            java.lang.String r29 = "otf"
            java.lang.String r30 = "xps"
            java.lang.String r31 = "zip"
            java.lang.String r32 = "rar"
            java.lang.String[] r1 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            java.lang.String r2 = "."
            int r3 = r12.lastIndexOf(r2)
            r4 = -1
            java.lang.String r13 = ""
            if (r3 == r4) goto L_0x0044
            java.lang.String r3 = r0.substring(r3)
            goto L_0x0045
        L_0x0044:
            r3 = r13
        L_0x0045:
            java.lang.String r2 = r3.replace(r2, r13)
            java.lang.String r3 = "tel:"
            boolean r5 = r0.startsWith(r3)
            java.lang.String r14 = "url"
            java.lang.String r6 = "/"
            r15 = 0
            r10 = 1
            if (r5 != 0) goto L_0x04d6
            java.lang.String r5 = "http://tel:"
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x0061
            goto L_0x04d6
        L_0x0061:
            java.lang.String r3 = "mailto:"
            boolean r5 = r0.startsWith(r3)
            java.lang.String r7 = "android.intent.action.SENDTO"
            java.lang.String r8 = "?"
            java.lang.String r9 = "UTF-8"
            if (r5 != 0) goto L_0x0420
            java.lang.String r5 = "http://mailto:"
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x0079
            goto L_0x0420
        L_0x0079:
            java.lang.String r3 = "smsto:"
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x039d
            java.lang.String r5 = "http://smsto:"
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x008b
            goto L_0x039d
        L_0x008b:
            java.lang.String r3 = "action_"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x033f
            java.lang.String r3 = "http://action_"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x009d
            goto L_0x033f
        L_0x009d:
            java.lang.String r3 = "go:"
            boolean r4 = r0.startsWith(r3)
            if (r4 != 0) goto L_0x01e0
            java.lang.String r4 = "http://go:"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x00af
            goto L_0x01e0
        L_0x00af:
            java.lang.String r3 = "vnd.youtube:"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x00f3
            int r0 = r12.indexOf(r8)
            r1 = 12
            if (r0 <= 0) goto L_0x00c4
            java.lang.String r0 = r12.substring(r1, r0)
            goto L_0x00c8
        L_0x00c4:
            java.lang.String r0 = r12.substring(r1)
        L_0x00c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "https://www.youtube.com/watch?v="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            british.x.l r1 = r11.f8540y
            int r1 = r1.f7962x
            if (r1 != r10) goto L_0x00e5
            british.x.config r1 = r11.f8528m
            r1.mo7497c(r11, r0)
            goto L_0x010e
        L_0x00e5:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.t_url> r2 = british.p015x.t_url.class
            r1.<init>(r11, r2)
            r1.putExtra(r14, r0)
            r11.startActivityForResult(r1, r15)
            goto L_0x010e
        L_0x00f3:
            java.lang.String r3 = ".mp3"
            boolean r3 = r0.endsWith(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            if (r3 == 0) goto L_0x0112
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            android.net.Uri r1 = android.net.Uri.parse(r34)
            java.lang.String r2 = "audio/*"
            r0.setDataAndType(r1, r2)
            r11.startActivity(r0)
        L_0x010e:
            r18 = r14
            goto L_0x0519
        L_0x0112:
            java.lang.String r3 = ".mp4"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x01cd
            java.lang.String r3 = ".3gp"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x0124
            goto L_0x01cd
        L_0x0124:
            java.lang.String r3 = "upi://"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x0148
            android.net.Uri r0 = android.net.Uri.parse(r34)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4, r0)
            android.content.res.Resources r0 = r33.getResources()
            r2 = 2131821054(0x7f1101fe, float:1.927484E38)
            java.lang.String r0 = r0.getString(r2)
            android.content.Intent r0 = android.content.Intent.createChooser(r1, r0)
            r11.startActivity(r0)
            goto L_0x010e
        L_0x0148:
            british.x.l r3 = r11.f8540y
            int r3 = r3.f7962x
            if (r3 == r10) goto L_0x01c5
            java.lang.String r3 = "rtsp://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = "rtmp://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = "market://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = ".apk"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = "whatsapp://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = ".m3u"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = ".m3u8"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x0187
            goto L_0x01c5
        L_0x0187:
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x01c0
            java.lang.String r1 = "docs.google.com"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01a1
        L_0x01a0:
            r0 = r12
        L_0x01a1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "https://docs.google.com/viewer?embedded=true&url="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4, r0)
            r11.startActivity(r1)
            goto L_0x010e
        L_0x01c0:
            r18 = r14
            r10 = 0
            goto L_0x0519
        L_0x01c5:
            british.x.config r0 = r11.f8528m
            boolean r10 = r0.mo7497c(r11, r12)
            goto L_0x010e
        L_0x01cd:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            android.net.Uri r1 = android.net.Uri.parse(r34)
            java.lang.String r2 = "video/*"
            r0.setDataAndType(r1, r2)
            r11.startActivity(r0)
            goto L_0x010e
        L_0x01e0:
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x01ec
            r0 = 3
            java.lang.String r0 = r12.substring(r0)
            goto L_0x01f2
        L_0x01ec:
            r0 = 10
            java.lang.String r0 = r12.substring(r0)
        L_0x01f2:
            boolean r1 = r0.endsWith(r6)
            if (r1 == 0) goto L_0x0201
            int r1 = r0.length()
            int r1 = r1 - r10
            java.lang.String r0 = r0.substring(r15, r1)
        L_0x0201:
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r9)     // Catch:{ Exception -> 0x0205 }
        L_0x0205:
            r9 = r0
            r0 = 0
            r8 = 0
        L_0x0208:
            british.x.config r1 = r11.f8528m
            british.x.l[] r1 = r1.f7231O1
            int r2 = r1.length
            if (r8 >= r2) goto L_0x033a
            r1 = r1[r8]
            java.lang.String r1 = r1.f7922i
            boolean r1 = r1.equalsIgnoreCase(r9)
            if (r1 == 0) goto L_0x032a
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7251R3
            if (r0 == 0) goto L_0x0225
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0225:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7281W3
            if (r0 == 0) goto L_0x0231
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0231:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7250R2
            if (r0 == 0) goto L_0x023d
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x023d:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7245Q3
            if (r0 == 0) goto L_0x0249
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0249:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7269U3
            if (r0 == 0) goto L_0x0255
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0255:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7275V3
            if (r0 == 0) goto L_0x0261
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0261:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7358j4
            if (r0 == 0) goto L_0x026d
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x026d:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7287X3
            if (r0 == 0) goto L_0x0279
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
        L_0x0279:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7293Y3
            if (r0 == 0) goto L_0x031d
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0287
            goto L_0x031d
        L_0x0287:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7251R3
            if (r0 == 0) goto L_0x029e
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x029e
            com.appnext.ads.fullscreen.RewardedVideo r0 = new com.appnext.ads.fullscreen.RewardedVideo
            british.x.config r1 = r11.f8528m
            java.lang.String r1 = r1.f7251R3
            r0.<init>((android.content.Context) r11, (java.lang.String) r1)
            r11.f6663i = r0
        L_0x029e:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7245Q3
            if (r0 == 0) goto L_0x02a7
            r0.equals(r13)
        L_0x02a7:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7269U3
            if (r0 == 0) goto L_0x02be
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x02be
            com.facebook.ads.RewardedVideoAd r0 = new com.facebook.ads.RewardedVideoAd
            british.x.config r1 = r11.f8528m
            java.lang.String r1 = r1.f7269U3
            r0.<init>(r11, r1)
            r11.f6664j = r0
        L_0x02be:
            british.x.config r0 = r11.f8528m
            java.lang.String r0 = r0.f7275V3
            if (r0 == 0) goto L_0x02d1
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x02d1
            com.startapp.sdk.adsbase.StartAppAd r0 = new com.startapp.sdk.adsbase.StartAppAd
            r0.<init>(r11)
            r11.f6665k = r0
        L_0x02d1:
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r11)
            r11.f6661g = r0
            android.view.View r2 = new android.view.View
            r2.<init>(r11)
            r2.setId(r8)
            r0 = 2131361812(0x7f0a0014, float:1.8343387E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.setTag(r0, r1)
            r7 = 0
            r11.f6660f = r7
            r11.f8534s = r8
            british.x.config r0 = r11.f8528m
            java.lang.String r3 = r11.f6656b
            android.app.ProgressDialog r4 = r11.f6661g
            com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r5 = r11.f6662h
            com.appnext.ads.fullscreen.RewardedVideo r6 = r11.f6663i
            com.facebook.ads.RewardedVideoAd r1 = r11.f6664j
            com.startapp.sdk.adsbase.StartAppAd r10 = r11.f6665k
            com.adcolony.sdk.AdColonyInterstitialListener r15 = r11.f6666l
            r18 = r1
            r1 = r33
            r19 = r7
            r7 = r18
            r18 = r14
            r14 = r8
            r8 = r10
            r20 = r9
            r9 = r15
            r15 = 1
            r10 = r19
            boolean r0 = r0.mo7494Z0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L_0x0328
            british.x.config r0 = r11.f8528m
            r0.mo7499d(r11, r14)
            goto L_0x0328
        L_0x031d:
            r20 = r9
            r18 = r14
            r15 = 1
            r14 = r8
            british.x.config r0 = r11.f8528m
            r0.mo7499d(r11, r14)
        L_0x0328:
            r0 = 1
            goto L_0x0330
        L_0x032a:
            r20 = r9
            r18 = r14
            r15 = 1
            r14 = r8
        L_0x0330:
            int r8 = r14 + 1
            r14 = r18
            r9 = r20
            r10 = 1
            r15 = 0
            goto L_0x0208
        L_0x033a:
            r18 = r14
            r10 = r0
            goto L_0x0519
        L_0x033f:
            r18 = r14
            r15 = 1
            british.x.config r1 = r11.f8528m
            british.x.j r0 = r1.mo7513k0(r0, r11)
            boolean r1 = r0.f7843b
            if (r1 == 0) goto L_0x0362
            r11.f6657c = r15
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "finalizar"
            r1.putExtra(r2, r15)
            boolean r2 = r0.f7844c
            java.lang.String r3 = "finalizar_app"
            r1.putExtra(r3, r2)
            r11.setResult(r4, r1)
        L_0x0362:
            boolean r1 = r0.f7845d
            if (r1 == 0) goto L_0x036d
            android.content.Intent r0 = r0.f7842a
            r1 = 0
            r11.startActivityForResult(r0, r1)
            goto L_0x0390
        L_0x036d:
            r1 = 0
            android.content.Intent r2 = r0.f7842a
            if (r2 == 0) goto L_0x0390
            boolean r3 = r0.f7843b
            if (r3 == 0) goto L_0x038c
            r11.f6659e = r1
            british.x.config r1 = r11.f8528m
            int r1 = r1.f7427t4
            r3 = 2
            if (r1 == r3) goto L_0x0384
            java.lang.String r1 = "es_root"
            r2.putExtra(r1, r15)
        L_0x0384:
            android.content.Intent r0 = r0.f7842a     // Catch:{ Exception -> 0x038a }
            r11.startActivity(r0)     // Catch:{ Exception -> 0x038a }
            goto L_0x0390
        L_0x038a:
            goto L_0x0390
        L_0x038c:
            r0 = 0
            r11.startActivityForResult(r2, r0)     // Catch:{ Exception -> 0x038a }
        L_0x0390:
            boolean r0 = r11.f6657c
            if (r0 == 0) goto L_0x04d4
            boolean r0 = r11.f6658d
            if (r0 != 0) goto L_0x04d4
            r33.finish()
            goto L_0x04d4
        L_0x039d:
            r18 = r14
            r15 = 1
            boolean r0 = r0.startsWith(r3)
            r1 = 6
            if (r0 == 0) goto L_0x03b0
            java.lang.String r0 = r12.substring(r1)
            java.lang.String r0 = r0.trim()
            goto L_0x03ba
        L_0x03b0:
            r0 = 13
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r0 = r0.trim()
        L_0x03ba:
            boolean r2 = r0.equals(r13)
            if (r2 != 0) goto L_0x04d4
            int r2 = r0.indexOf(r8)
            if (r2 <= 0) goto L_0x03e3
            java.lang.String r5 = "?body="
            int r5 = r0.indexOf(r5)
            if (r5 == r4) goto L_0x03d8
            int r5 = r5 + r1
            java.lang.String r1 = r0.substring(r5)
            java.lang.String r1 = r1.trim()
            goto L_0x03d9
        L_0x03d8:
            r1 = r13
        L_0x03d9:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            java.lang.String r0 = r0.trim()
            goto L_0x03e5
        L_0x03e3:
            r4 = 0
            r1 = r13
        L_0x03e5:
            boolean r2 = r0.endsWith(r6)
            if (r2 == 0) goto L_0x03f4
            int r2 = r0.length()
            int r2 = r2 - r15
            java.lang.String r0 = r0.substring(r4, r2)
        L_0x03f4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7, r0)
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x041b
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r9)     // Catch:{ Exception -> 0x0416 }
        L_0x0416:
            java.lang.String r0 = "sms_body"
            r2.putExtra(r0, r1)
        L_0x041b:
            r11.startActivity(r2)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x04d4
        L_0x0420:
            r18 = r14
            r15 = 1
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x0433
            r0 = 7
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r0 = r0.trim()
            goto L_0x043d
        L_0x0433:
            r0 = 14
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r0 = r0.trim()
        L_0x043d:
            boolean r1 = r0.equals(r13)
            if (r1 != 0) goto L_0x04d4
            int r1 = r0.indexOf(r8)
            if (r1 <= 0) goto L_0x0486
            java.lang.String r2 = "?subject="
            int r2 = r0.indexOf(r2)
            if (r2 == r4) goto L_0x047a
            int r2 = r2 + 9
            java.lang.String r2 = r0.substring(r2)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "&body="
            int r3 = r2.indexOf(r3)
            if (r3 == r4) goto L_0x0477
            int r4 = r3 + 6
            java.lang.String r4 = r2.substring(r4)
            java.lang.String r4 = r4.trim()
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r3)
            java.lang.String r2 = r2.trim()
            goto L_0x047d
        L_0x0477:
            r5 = 0
            r4 = r13
            goto L_0x047d
        L_0x047a:
            r5 = 0
            r2 = r13
            r4 = r2
        L_0x047d:
            java.lang.String r0 = r0.substring(r5, r1)
            java.lang.String r0 = r0.trim()
            goto L_0x0489
        L_0x0486:
            r5 = 0
            r2 = r13
            r4 = r2
        L_0x0489:
            boolean r1 = r0.endsWith(r6)
            if (r1 == 0) goto L_0x0498
            int r1 = r0.length()
            int r1 = r1 - r15
            java.lang.String r0 = r0.substring(r5, r1)
        L_0x0498:
            android.content.Intent r1 = new android.content.Intent
            r3 = 0
            java.lang.String r5 = "mailto"
            android.net.Uri r0 = android.net.Uri.fromParts(r5, r0, r3)
            r1.<init>(r7, r0)
            boolean r0 = r2.equals(r13)
            if (r0 != 0) goto L_0x04b3
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r9)     // Catch:{ Exception -> 0x04ae }
        L_0x04ae:
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r1.putExtra(r0, r2)
        L_0x04b3:
            boolean r0 = r4.equals(r13)
            if (r0 != 0) goto L_0x04c2
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r9)     // Catch:{ Exception -> 0x04bd }
        L_0x04bd:
            java.lang.String r0 = "android.intent.extra.TEXT"
            r1.putExtra(r0, r4)
        L_0x04c2:
            android.content.res.Resources r0 = r33.getResources()
            r2 = 2131820782(0x7f1100ee, float:1.9274289E38)
            java.lang.String r0 = r0.getString(r2)
            android.content.Intent r0 = android.content.Intent.createChooser(r1, r0)
            r11.startActivity(r0)
        L_0x04d4:
            r10 = 1
            goto L_0x0519
        L_0x04d6:
            r18 = r14
            r15 = 1
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x04e5
            r0 = 4
            java.lang.String r0 = r12.substring(r0)
            goto L_0x04eb
        L_0x04e5:
            r0 = 11
            java.lang.String r0 = r12.substring(r0)
        L_0x04eb:
            boolean r1 = r0.endsWith(r6)
            if (r1 == 0) goto L_0x04fb
            int r1 = r0.length()
            int r1 = r1 - r15
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L_0x04fb:
            android.content.Intent r1 = new android.content.Intent
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = "android.intent.action.DIAL"
            r1.<init>(r2, r0)
            r11.startActivity(r1)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x04d4
        L_0x0519:
            if (r10 != 0) goto L_0x052b
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<british.x.t_url> r1 = british.p015x.t_url.class
            r0.<init>(r11, r1)
            r1 = r18
            r0.putExtra(r1, r12)
            r1 = 0
            r11.startActivityForResult(r0, r1)
        L_0x052b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_and.m8547e(java.lang.String):void");
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f8534s;
            if (i != -1) {
                this.f8528m.mo7499d(this, i);
                return;
            }
            return;
        }
        C1845j j0 = this.f8528m.mo7510j0(view, this);
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
                    if (this.f8528m.f7427t4 != 2) {
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
    /* renamed from: c */
    public void mo8159c() {
        int q0 = this.f8528m.mo7522q0(this);
        int i = this.f8528m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8525E = listView;
            this.f8528m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8528m.f7231O1;
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
            int[] iArr = this.f8528m.f7249R1;
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
        if (this.f8523C) {
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
        if (!this.f6659e || this.f8529n || !this.f8528m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8529n = true;
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
        String str9 = this.f8528m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f8528m.f7281W3) == null || str.equals("")) && (((str2 = this.f8528m.f7250R2) == null || str2.equals("")) && (((str3 = this.f8528m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8528m.f7269U3) == null || str4.equals("")) && (((str5 = this.f8528m.f7275V3) == null || str5.equals("")) && (((str6 = this.f8528m.f7358j4) == null || str6.equals("")) && (((str7 = this.f8528m.f7287X3) == null || str7.equals("")) && ((str8 = this.f8528m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f8528m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f8528m.f7251R3);
        }
        String str11 = this.f8528m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f8528m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f8528m.f7269U3);
        }
        String str13 = this.f8528m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        this.f8534s = -1;
        if (!this.f8528m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x01a2 A[EDGE_INSN: B:202:0x01a2->B:57:0x01a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x061e A[EDGE_INSN: B:203:0x061e->B:192:0x061e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0198 A[LOOP:0: B:54:0x0191->B:56:0x0198, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r11 = r24
            r0 = r25
            android.content.Context r1 = r24.getApplicationContext()
            british.x.config r1 = (british.p015x.C1692config) r1
            r11.f8528m = r1
            java.lang.String r2 = r1.f7313c1
            if (r2 != 0) goto L_0x0013
            r1.mo7490V0()
        L_0x0013:
            r11.m8545b(r11)
            british.x.t_and$b r1 = new british.x.t_and$b
            r1.<init>()
            r11.f6666l = r1
            android.content.Intent r1 = r24.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r11.f8521A = r1
            java.lang.String r2 = "es_root"
            r12 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0043
            if (r1 == 0) goto L_0x003f
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x003f
            android.os.Bundle r1 = r11.f8521A
            boolean r1 = r1.getBoolean(r2, r13)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            r11.f6659e = r1
            goto L_0x0054
        L_0x0043:
            boolean r1 = r0.containsKey(r2)
            if (r1 == 0) goto L_0x0051
            boolean r1 = r0.getBoolean(r2, r13)
            if (r1 == 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            r11.f6659e = r1
        L_0x0054:
            british.x.config r1 = r11.f8528m
            british.x.l[] r2 = r1.f7231O1
            int r3 = r1.f7318d
            r2 = r2[r3]
            java.lang.String r2 = r2.f7916g
            java.lang.String r1 = r1.f7368l1
            java.lang.String r1 = british.p015x.C1692config.m8189h(r2, r1)
            r11.f6656b = r1
            super.onCreate(r25)
            r1 = 2131558639(0x7f0d00ef, float:1.87426E38)
            r11.setContentView(r1)
            r24.mo8159c()
            british.x.config r1 = r11.f8528m
            r1.mo7486N0(r11, r13)
            java.lang.String r1 = "search"
            java.lang.Object r1 = r11.getSystemService(r1)
            android.app.SearchManager r1 = (android.app.SearchManager) r1
            british.x.t_and$c r2 = new british.x.t_and$c
            r2.<init>()
            r1.setOnCancelListener(r2)
            british.x.t_and$d r2 = new british.x.t_and$d
            r2.<init>()
            r1.setOnDismissListener(r2)
            if (r0 != 0) goto L_0x00b4
            british.x.config r1 = r11.f8528m
            android.os.Bundle r2 = r11.f8521A
            if (r2 == 0) goto L_0x00a1
            java.lang.String r3 = "ad_entrar"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x00a1
            r2 = 1
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            android.os.Bundle r3 = r11.f8521A
            if (r3 == 0) goto L_0x00b0
            java.lang.String r4 = "fb_entrar"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x00b0
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            r1.mo7503f1(r11, r2, r3)
        L_0x00b4:
            british.x.config r1 = r11.f8528m
            british.x.c r1 = r1.mo7474A0(r11, r13)
            r11.f8522B = r1
            british.x.config r1 = r11.f8528m
            int r2 = r1.f7318d
            java.lang.String r3 = r11.f6656b
            r1.mo7488Q0(r11, r2, r3, r0)
            android.content.Intent r0 = r24.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            british.x.config r1 = r11.f8528m
            british.x.l[] r1 = r1.f7231O1
            java.lang.String r2 = "idsecc"
            int r0 = r0.getInt(r2)
            r0 = r1[r0]
            r11.f8540y = r0
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r11.f8527G = r0
            java.lang.String r0 = "sh"
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r13)
            r11.f8524D = r0
            british.x.config r1 = r11.f8528m
            int r1 = r1.f7163D
            if (r1 <= 0) goto L_0x00f8
            r0.registerOnSharedPreferenceChangeListener(r11)
        L_0x00f8:
            british.x.config r0 = r11.f8528m
            int r0 = r0.f7163D
            if (r0 <= 0) goto L_0x0133
            android.content.SharedPreferences r0 = r11.f8524D
            java.lang.String r1 = "fondo_v_act"
            int r0 = r0.getInt(r1, r13)
            british.x.config r1 = r11.f8528m
            int r2 = r1.f7163D
            if (r0 != r2) goto L_0x0133
            r0 = 2131362370(0x7f0a0242, float:1.8344519E38)
            android.view.View r2 = r11.findViewById(r0)     // Catch:{ Exception -> 0x0132 }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x0132 }
            british.x.config r3 = r11.f8528m     // Catch:{ Exception -> 0x0132 }
            boolean r3 = r3.f7145A     // Catch:{ Exception -> 0x0132 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0132 }
            british.x.config r4 = r11.f8528m     // Catch:{ Exception -> 0x0132 }
            int r4 = r4.f7157C     // Catch:{ Exception -> 0x0132 }
            r1.mo7514k1(r2, r3, r4)     // Catch:{ Exception -> 0x0132 }
            british.x.config r1 = r11.f8528m     // Catch:{ Exception -> 0x0132 }
            java.lang.String r2 = "fondo"
            android.view.View r0 = r11.findViewById(r0)     // Catch:{ Exception -> 0x0132 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0132 }
            r1.mo7493Y(r2, r0)     // Catch:{ Exception -> 0x0132 }
            goto L_0x0133
        L_0x0132:
        L_0x0133:
            r0 = 2131362532(0x7f0a02e4, float:1.8344847E38)
            android.view.View r0 = r11.findViewById(r0)
            r14 = r0
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r24)
            british.x.l r0 = r11.f8540y
            java.lang.String r0 = r0.f7916g
            java.lang.String r10 = ""
            boolean r0 = r0.equals(r10)
            java.lang.String r9 = "#"
            r1 = 2
            r8 = 0
            if (r0 != 0) goto L_0x018e
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x018e }
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ Exception -> 0x018e }
            int[] r3 = new int[r1]     // Catch:{ Exception -> 0x018e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
            r4.<init>()     // Catch:{ Exception -> 0x018e }
            r4.append(r9)     // Catch:{ Exception -> 0x018e }
            british.x.l r5 = r11.f8540y     // Catch:{ Exception -> 0x018e }
            java.lang.String r5 = r5.f7916g     // Catch:{ Exception -> 0x018e }
            r4.append(r5)     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x018e }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x018e }
            r3[r13] = r4     // Catch:{ Exception -> 0x018e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
            r4.<init>()     // Catch:{ Exception -> 0x018e }
            r4.append(r9)     // Catch:{ Exception -> 0x018e }
            british.x.l r5 = r11.f8540y     // Catch:{ Exception -> 0x018e }
            java.lang.String r5 = r5.f7919h     // Catch:{ Exception -> 0x018e }
            r4.append(r5)     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x018e }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x018e }
            r3[r12] = r4     // Catch:{ Exception -> 0x018e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x018e }
            r7 = r0
            goto L_0x018f
        L_0x018e:
            r7 = r8
        L_0x018f:
            r0 = 0
            r2 = 0
        L_0x0191:
            british.x.l r3 = r11.f8540y
            british.x.b[] r3 = r3.f7865J0
            int r4 = r3.length
            if (r0 >= r4) goto L_0x01a2
            r3 = r3[r0]
            int[][] r3 = r3.f6854J
            int r3 = r3.length
            int r3 = r3 + r12
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L_0x0191
        L_0x01a2:
            r11.f8532q = r13
            int[] r0 = new int[r2]
            r11.f8535t = r0
            android.widget.ImageView[] r0 = new android.widget.ImageView[r2]
            r11.f8536u = r0
            android.widget.ProgressBar[] r0 = new android.widget.ProgressBar[r2]
            r11.f8537v = r0
            int[] r0 = new int[r1]
            r0[r12] = r1
            r0[r13] = r2
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r11.f8538w = r0
            r6 = 0
        L_0x01c1:
            british.x.l r0 = r11.f8540y
            british.x.b[] r1 = r0.f7865J0
            int r2 = r1.length
            if (r6 >= r2) goto L_0x061e
            r0 = r1[r6]
            r11.f8526F = r0
            r0 = 2131558640(0x7f0d00f0, float:1.8742602E38)
            android.view.View r5 = r15.inflate(r0, r8)
            r0 = 125(0x7d, float:1.75E-43)
            r11.f8533r = r0
            british.x.b r0 = r11.f8526F
            java.lang.String r0 = r0.f6849E
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01e5
            r0 = 250(0xfa, float:3.5E-43)
            r11.f8533r = r0
        L_0x01e5:
            british.x.b r0 = r11.f8526F
            int r1 = r0.f6881z
            if (r1 != r12) goto L_0x01ef
            int r1 = r0.f6864i
            if (r1 == r12) goto L_0x01f7
        L_0x01ef:
            int r1 = r0.f6865j
            if (r1 != r12) goto L_0x01fa
            int r1 = r0.f6862g
            if (r1 != r12) goto L_0x01fa
        L_0x01f7:
            r1 = 17
            goto L_0x01fd
        L_0x01fa:
            r1 = 8388611(0x800003, float:1.1754948E-38)
        L_0x01fd:
            java.lang.String r0 = r0.f6847C
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0266
            british.x.b r0 = r11.f8526F
            int r2 = r0.f6881z
            if (r2 != 0) goto L_0x021a
            int r2 = r0.f6865j
            if (r2 != 0) goto L_0x021a
            int r0 = r0.f6860e
            if (r0 != 0) goto L_0x0217
            r16 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x021c
        L_0x0217:
            r16 = 17
            goto L_0x021c
        L_0x021a:
            r16 = r1
        L_0x021c:
            r0 = 2131361916(0x7f0a007c, float:1.8343598E38)
            android.view.View r0 = r5.findViewById(r0)
            r2 = r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            british.x.b r0 = r11.f8526F
            java.lang.String r1 = r0.f6847C
            int r3 = r0.f6860e
            int r4 = r0.f6866k
            int r8 = r0.f6867l
            int r12 = r0.f6868m
            java.lang.String r13 = r0.f6850F
            r18 = r9
            int r9 = r0.f6869n
            int r0 = r0.f6870o
            r19 = 0
            r20 = r0
            r0 = r24
            r21 = r1
            r1 = r2
            r22 = r2
            r2 = r21
            r23 = r5
            r5 = r8
            r17 = r6
            r6 = r12
            r12 = r7
            r7 = r13
            r13 = 0
            r8 = r9
            r13 = r18
            r9 = r20
            r25 = r15
            r15 = r10
            r10 = r19
            r0.m8546d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r22
            r1 = 0
            r0.setVisibility(r1)
            r4 = r16
            goto L_0x0270
        L_0x0266:
            r23 = r5
            r17 = r6
            r12 = r7
            r13 = r9
            r25 = r15
            r15 = r10
            r4 = r1
        L_0x0270:
            british.x.b r0 = r11.f8526F
            int r1 = r0.f6857b
            if (r1 == 0) goto L_0x0288
            int r1 = r0.f6881z
            if (r1 != 0) goto L_0x0288
            int r1 = r0.f6865j
            if (r1 != 0) goto L_0x0288
            int r1 = r0.f6859d
            if (r1 != 0) goto L_0x0286
            r4 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0288
        L_0x0286:
            r4 = 17
        L_0x0288:
            java.lang.String r0 = r0.f6848D
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x02e0
            british.x.b r0 = r11.f8526F
            int r1 = r0.f6881z
            if (r1 != 0) goto L_0x02a5
            int r1 = r0.f6865j
            if (r1 != 0) goto L_0x02a5
            int r0 = r0.f6861f
            if (r0 != 0) goto L_0x02a2
            r16 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x02a7
        L_0x02a2:
            r16 = 17
            goto L_0x02a7
        L_0x02a5:
            r16 = r4
        L_0x02a7:
            r0 = 2131361917(0x7f0a007d, float:1.83436E38)
            r10 = r23
            android.view.View r0 = r10.findViewById(r0)
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            british.x.b r0 = r11.f8526F
            java.lang.String r2 = r0.f6848D
            int r3 = r0.f6861f
            int r4 = r0.f6871p
            int r5 = r0.f6872q
            int r6 = r0.f6873r
            java.lang.String r7 = r0.f6851G
            int r8 = r0.f6874s
            int r1 = r0.f6875t
            r18 = 0
            r0 = r24
            r19 = r1
            r1 = r9
            r20 = r14
            r14 = r9
            r9 = r19
            r19 = r12
            r12 = r10
            r10 = r18
            r0.m8546d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r14.setVisibility(r0)
            r4 = r16
            goto L_0x02e6
        L_0x02e0:
            r19 = r12
            r20 = r14
            r12 = r23
        L_0x02e6:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r14 = -2
            r0.<init>(r14, r14)
            r10 = 2131362462(0x7f0a029e, float:1.8344705E38)
            r9 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r9) goto L_0x02ff
            r0.gravity = r4
            android.view.View r1 = r12.findViewById(r10)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setLayoutParams(r0)
        L_0x02ff:
            british.x.b r0 = r11.f8526F
            java.lang.String r0 = r0.f6849E
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0343
            android.view.View r0 = r12.findViewById(r10)
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2131361918(0x7f0a007e, float:1.8343602E38)
            android.view.View r0 = r12.findViewById(r0)
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            british.x.b r0 = r11.f8526F
            java.lang.String r2 = r0.f6849E
            r3 = 0
            int r4 = r0.f6876u
            int r5 = r0.f6877v
            int r6 = r0.f6878w
            java.lang.String r7 = r0.f6852H
            int r1 = r0.f6879x
            int r0 = r0.f6880y
            r16 = 1
            r18 = r0
            r0 = r24
            r21 = r1
            r1 = r8
            r14 = r8
            r8 = r21
            r9 = r18
            r10 = r16
            r0.m8546d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r14.setVisibility(r0)
        L_0x0343:
            british.x.l r0 = r11.f8540y
            java.lang.String r0 = r0.f7916g
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0368
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            british.x.l r1 = r11.f8540y
            java.lang.String r1 = r1.f7916g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = british.p015x.C1692config.m8153I(r0)
            if (r0 == 0) goto L_0x0368
            r0 = 1
            goto L_0x0369
        L_0x0368:
            r0 = 0
        L_0x0369:
            british.x.b r1 = r11.f8526F
            int r1 = r1.f6857b
            java.lang.String r2 = ".png"
            if (r1 == 0) goto L_0x045a
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            british.x.b r3 = r11.f8526F
            int r3 = r3.f6859d
            if (r3 != 0) goto L_0x0383
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r1.gravity = r4
            goto L_0x038a
        L_0x0383:
            r4 = 1
            if (r3 != r4) goto L_0x038a
            r3 = 17
            r1.gravity = r3
        L_0x038a:
            r3 = 2131361913(0x7f0a0079, float:1.8343592E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r0 == 0) goto L_0x039f
            r4 = 2131361915(0x7f0a007b, float:1.8343596E38)
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            goto L_0x03a8
        L_0x039f:
            r4 = 2131361914(0x7f0a007a, float:1.8343594E38)
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
        L_0x03a8:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 20
            if (r5 <= r6) goto L_0x03b5
            british.x.config r5 = r11.f8528m
            java.lang.String r5 = r5.f7368l1
            british.p015x.C1692config.m8168S0(r4, r5)
        L_0x03b5:
            r3.setLayoutParams(r1)
            r4.setLayoutParams(r1)
            british.x.b r1 = r11.f8526F
            java.lang.String r1 = r1.f6853I
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x03ce
            british.x.t_and$e r1 = new british.x.t_and$e
            r1.<init>()
            r3.setOnClickListener(r1)
            goto L_0x03dc
        L_0x03ce:
            british.x.b r1 = r11.f8526F
            boolean r1 = r1.f6845A
            if (r1 == 0) goto L_0x03dc
            british.x.t_and$f r1 = new british.x.t_and$f
            r1.<init>()
            r3.setOnClickListener(r1)
        L_0x03dc:
            british.x.b r1 = r11.f8526F
            int r5 = r1.f6858c
            r6 = 1
            if (r5 != r6) goto L_0x0406
            int[] r5 = r11.f8535t
            int r6 = r11.f8532q
            int r1 = r1.f6857b
            r5[r6] = r1
            android.widget.ImageView[] r1 = r11.f8536u
            r1[r6] = r3
            android.widget.ProgressBar[] r1 = r11.f8537v
            r1[r6] = r4
            int[][] r1 = r11.f8538w
            r3 = r1[r6]
            r5 = 0
            r3[r5] = r17
            r1 = r1[r6]
            r3 = 1
            r1[r3] = r5
            int r6 = r6 + r3
            r11.f8532q = r6
            r4.setVisibility(r5)
            goto L_0x045a
        L_0x0406:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "it_fcab"
            r1.append(r4)
            british.x.b r5 = r11.f8526F
            int r5 = r5.f6857b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.io.File r5 = r11.getFileStreamPath(r5)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x043b
            java.io.File r1 = r11.getFileStreamPath(r1)
            r1.renameTo(r5)
        L_0x043b:
            british.x.config r1 = r11.f8528m
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            british.x.b r4 = r11.f8526F
            int r4 = r4.f6857b
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            r1.mo7493Y(r4, r3)
            r1 = 0
            r3.setVisibility(r1)
        L_0x045a:
            british.x.b r1 = r11.f8526F
            int[][] r3 = r1.f6854J
            int r3 = r3.length
            if (r3 <= 0) goto L_0x05ef
            int r1 = r1.f6863h
            if (r1 != 0) goto L_0x046f
            r1 = 2131362463(0x7f0a029f, float:1.8344707E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x0478
        L_0x046f:
            r1 = 2131362464(0x7f0a02a0, float:1.834471E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
        L_0x0478:
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r4 = 0
        L_0x047f:
            british.x.b r5 = r11.f8526F
            int[][] r5 = r5.f6854J
            int r5 = r5.length
            if (r4 >= r5) goto L_0x05e1
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r11)
            r6 = 1092616192(0x41200000, float:10.0)
            float r7 = r11.f8527G
            float r7 = r7 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r6
            int r7 = (int) r7
            r8 = 0
            r5.setPadding(r8, r8, r8, r7)
            r7 = 8
            r5.setVisibility(r7)
            r8 = 1
            r5.setAdjustViewBounds(r8)
            british.x.b r8 = r11.f8526F
            java.lang.String[] r8 = r8.f6855K
            r8 = r8[r4]
            boolean r8 = r8.equals(r15)
            java.lang.String r9 = "it_f"
            if (r8 != 0) goto L_0x04c1
            british.x.b r8 = r11.f8526F
            java.lang.String[] r8 = r8.f6855K
            r8 = r8[r4]
            r11.f8530o = r8
            british.x.t_and$g r8 = new british.x.t_and$g
            r8.<init>()
            r5.setOnClickListener(r8)
            goto L_0x04f0
        L_0x04c1:
            british.x.b r8 = r11.f8526F
            boolean r8 = r8.f6846B
            if (r8 == 0) goto L_0x04f0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            british.x.b r10 = r11.f8526F
            int[][] r10 = r10.f6854J
            r10 = r10[r4]
            r14 = 0
            r10 = r10[r14]
            r8.append(r10)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r11.getFileStreamPath(r8)
            r11.f8541z = r8
            british.x.t_and$h r8 = new british.x.t_and$h
            r8.<init>()
            r5.setOnClickListener(r8)
        L_0x04f0:
            if (r0 == 0) goto L_0x04fc
            android.widget.ProgressBar r8 = new android.widget.ProgressBar
            r10 = 16843399(0x1010287, float:2.369537E-38)
            r14 = 0
            r8.<init>(r11, r14, r10)
            goto L_0x0501
        L_0x04fc:
            android.widget.ProgressBar r8 = new android.widget.ProgressBar
            r8.<init>(r11)
        L_0x0501:
            british.x.config r10 = r11.f8528m
            java.lang.String r10 = r10.f7368l1
            british.p015x.C1692config.m8168S0(r8, r10)
            r10 = 10
            r14 = 0
            r8.setPadding(r14, r14, r14, r10)
            r8.setVisibility(r7)
            r1.addView(r8, r3)
            r1.addView(r5, r3)
            british.x.b r7 = r11.f8526F
            int[][] r7 = r7.f6854J
            r10 = r7[r4]
            r14 = 1
            r10 = r10[r14]
            if (r10 != r14) goto L_0x054b
            int[] r6 = r11.f8535t
            int r9 = r11.f8532q
            r7 = r7[r4]
            r10 = 0
            r7 = r7[r10]
            r6[r9] = r7
            android.widget.ImageView[] r6 = r11.f8536u
            r6[r9] = r5
            android.widget.ProgressBar[] r5 = r11.f8537v
            r5[r9] = r8
            int[][] r5 = r11.f8538w
            r6 = r5[r9]
            r6[r10] = r17
            r5 = r5[r9]
            int r6 = r4 + 1
            r7 = 1
            r5[r7] = r6
            int r9 = r9 + r7
            r11.f8532q = r9
            r8.setVisibility(r10)
            r6 = 0
            goto L_0x05dd
        L_0x054b:
            r10 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            british.x.b r8 = r11.f8526F
            int[][] r8 = r8.f6854J
            r8 = r8[r4]
            r8 = r8[r10]
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r11.getFileStreamPath(r8)
            boolean r10 = r8.exists()
            if (r10 != 0) goto L_0x0583
            java.io.File r7 = r11.getFileStreamPath(r7)
            r7.renameTo(r8)
        L_0x0583:
            british.x.config r7 = r11.f8528m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            british.x.b r9 = r11.f8526F
            int[][] r9 = r9.f6854J
            r9 = r9[r4]
            r10 = 0
            r9 = r9[r10]
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            int[] r7 = r7.mo7493Y(r8, r5)
            r8 = r7[r10]
            if (r8 <= 0) goto L_0x05d9
            r8 = r7[r10]
            int r9 = r11.f8533r
            if (r8 <= r9) goto L_0x05bc
            r8 = 1
            r14 = r7[r8]
            int r14 = r14 * r9
            r16 = r7[r10]
            int r14 = r14 / r16
            r7[r8] = r14
            r7[r10] = r9
            goto L_0x05bd
        L_0x05bc:
            r8 = 1
        L_0x05bd:
            r9 = r7[r10]
            float r9 = (float) r9
            float r10 = r11.f8527G
            float r9 = r9 * r10
            float r9 = r9 + r6
            int r9 = (int) r9
            r7 = r7[r8]
            float r7 = (float) r7
            float r7 = r7 * r10
            float r7 = r7 + r6
            int r6 = (int) r7
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            r7.width = r9
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            r7.height = r6
        L_0x05d9:
            r6 = 0
            r5.setVisibility(r6)
        L_0x05dd:
            int r4 = r4 + 1
            goto L_0x047f
        L_0x05e1:
            r6 = 0
            r1.setVisibility(r6)
            r0 = 2131362462(0x7f0a029e, float:1.8344705E38)
            android.view.View r0 = r12.findViewById(r0)
            r0.setVisibility(r6)
        L_0x05ef:
            if (r19 == 0) goto L_0x0609
            british.x.l r0 = r11.f8540y
            int r1 = r0.f7956u
            r2 = 1
            if (r1 != r2) goto L_0x0606
            java.lang.String r0 = r0.f7916g
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0606
            r8 = r19
            r12.setBackgroundDrawable(r8)
            goto L_0x060c
        L_0x0606:
            r8 = r19
            goto L_0x060c
        L_0x0609:
            r8 = r19
            r2 = 1
        L_0x060c:
            r1 = r20
            r1.addView(r12)
            int r6 = r17 + 1
            r14 = r1
            r7 = r8
            r9 = r13
            r10 = r15
            r8 = 0
            r12 = 1
            r13 = 0
            r15 = r25
            goto L_0x01c1
        L_0x061e:
            r8 = r7
            r15 = r10
            if (r8 == 0) goto L_0x0638
            int r1 = r0.f7956u
            if (r1 != 0) goto L_0x0638
            java.lang.String r0 = r0.f7916g
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0638
            r0 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r0 = r11.findViewById(r0)
            r0.setBackgroundDrawable(r8)
        L_0x0638:
            int r0 = r11.f8532q
            if (r0 <= 0) goto L_0x064a
            r0 = 0
            r11.f8531p = r0
            british.x.t_and$k r1 = new british.x.t_and$k
            r2 = 0
            r1.<init>()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.execute(r0)
        L_0x064a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_and.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8528m.f7384n3 == 0 || (cVar3 = this.f8522B) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8528m.f7384n3 == 0 || (cVar2 = this.f8522B) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8528m.f7384n3 == 0 || (cVar = this.f8522B) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f8528m.f7384n3 == 0 || (cVar = this.f8522B) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2064a());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8528m.f7384n3 != 0 && (cVar = this.f8522B) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8523C = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8523C) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8523C = true;
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
                this.f8528m.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8528m.f7145A), this.f8528m.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f8528m.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f8523C = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8523C = true;
        C1692config.m8175Y0(this);
    }
}
