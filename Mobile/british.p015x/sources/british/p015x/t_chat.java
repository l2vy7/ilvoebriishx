package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
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
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
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
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p273b9.C11188h;
import p308g8.C12725i;
import p313i9.C12788b;
import p313i9.C12789c;
import p317k9.C12823d;
import p318l8.C12831e;
import p338x8.C12957d;
import p338x8.C12960g;
import p340y8.C12978b;
import p340y8.C12981e;
import p340y8.C12982f;

/* renamed from: british.x.t_chat */
public class t_chat extends Activity_ext_class implements C1592a, View.OnKeyListener, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    MediaPlayer f9117A;

    /* renamed from: A0 */
    boolean f9118A0 = false;

    /* renamed from: B */
    MediaPlayer f9119B;

    /* renamed from: B0 */
    boolean f9120B0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f9121C;

    /* renamed from: C0 */
    boolean f9122C0;

    /* renamed from: D */
    boolean f9123D = false;

    /* renamed from: D0 */
    boolean f9124D0;

    /* renamed from: E */
    int f9125E;

    /* renamed from: E0 */
    boolean f9126E0;

    /* renamed from: F */
    int f9127F;

    /* renamed from: F0 */
    boolean f9128F0;

    /* renamed from: G */
    int f9129G;

    /* renamed from: G0 */
    boolean f9130G0;

    /* renamed from: H */
    int f9131H;

    /* renamed from: H0 */
    boolean f9132H0;

    /* renamed from: I */
    int f9133I;

    /* renamed from: I0 */
    ListView f9134I0;

    /* renamed from: J */
    int f9135J;

    /* renamed from: J0 */
    Bundle f9136J0;

    /* renamed from: K */
    int f9137K;

    /* renamed from: K0 */
    Bitmap f9138K0;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public long f9139L;

    /* renamed from: L0 */
    Map<String, Bitmap> f9140L0;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f9141M;

    /* renamed from: M0 */
    Map<String, String> f9142M0;

    /* renamed from: N */
    private int f9143N;

    /* renamed from: N0 */
    Map<String, String> f9144N0;

    /* renamed from: O */
    private int f9145O;

    /* renamed from: O0 */
    File f9146O0;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f9147P;

    /* renamed from: P0 */
    C2249i0 f9148P0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f9149Q;

    /* renamed from: Q0 */
    C2257j0 f9150Q0;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f9151R;

    /* renamed from: R0 */
    C2259k0 f9152R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f9153S;

    /* renamed from: S0 */
    C2261l0 f9154S0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f9155T;

    /* renamed from: T0 */
    C2235d0 f9156T0;

    /* renamed from: U */
    private int f9157U;

    /* renamed from: U0 */
    LinearLayout f9158U0;

    /* renamed from: V */
    private int f9159V;

    /* renamed from: V0 */
    ProgressBar f9160V0;

    /* renamed from: W */
    private int f9161W;

    /* renamed from: W0 */
    ProgressBar f9162W0;

    /* renamed from: X */
    private int f9163X;

    /* renamed from: X0 */
    TextToSpeech f9164X0;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f9165Y;

    /* renamed from: Y0 */
    boolean f9166Y0 = false;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f9167Z;

    /* renamed from: Z0 */
    int f9168Z0 = 1;

    /* renamed from: a1 */
    String f9169a1 = "";

    /* renamed from: l0 */
    private boolean f9170l0;

    /* renamed from: m */
    private int f9171m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public SharedPreferences f9172m0;

    /* renamed from: n */
    private int f9173n;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public SharedPreferences f9174n0;

    /* renamed from: o */
    private int f9175o;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C1692config f9176o0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f9177p;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public AlertDialog f9178p0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f9179q;

    /* renamed from: q0 */
    private Dialog f9180q0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f9181r;

    /* renamed from: r0 */
    private C1603c f9182r0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f9183s;

    /* renamed from: s0 */
    boolean f9184s0 = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f9185t;

    /* renamed from: t0 */
    int f9186t0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f9187u;

    /* renamed from: u0 */
    C1855l f9188u0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f9189v;

    /* renamed from: v0 */
    ImageView f9190v0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String f9191w;

    /* renamed from: w0 */
    long f9192w0;

    /* renamed from: x */
    private String f9193x;

    /* renamed from: x0 */
    boolean f9194x0;

    /* renamed from: y */
    private String f9195y;

    /* renamed from: y0 */
    boolean f9196y0;

    /* renamed from: z */
    List<String> f9197z = new ArrayList();

    /* renamed from: z0 */
    boolean f9198z0;

    /* renamed from: british.x.t_chat$a */
    class C2226a implements View.OnClickListener {
        C2226a() {
        }

        public void onClick(View view) {
            int i;
            t_chat t_chat = t_chat.this;
            if (t_chat.f9128F0) {
                if (!t_chat.f9194x0) {
                    ((ImageView) view).setImageDrawable(t_chat.getResources().getDrawable(R.drawable.fav_noactiv_light));
                } else {
                    ((ImageView) view).setImageDrawable(t_chat.getResources().getDrawable(R.drawable.fav_noactiv));
                }
                t_chat.this.f9128F0 = false;
                i = 0;
            } else {
                Drawable drawable = t_chat.getResources().getDrawable(R.drawable.fav_blanco);
                drawable.setColorFilter(t_chat.this.f9186t0, PorterDuff.Mode.MULTIPLY);
                ((ImageView) view).setImageDrawable(drawable);
                t_chat.this.f9128F0 = true;
                i = 1;
            }
            SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
            edit.putBoolean("fav" + t_chat.this.f9147P, t_chat.this.f9128F0);
            edit.commit();
            new C1692config.C1732r0(t_chat.this.f9139L, t_chat.this.f9177p, t_chat.this.f9147P, "fav", i).execute(new String[0]);
        }
    }

    /* renamed from: british.x.t_chat$a0 */
    private class C2227a0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private String f9200a;

        /* renamed from: b */
        private String f9201b;

        /* renamed from: c */
        private int f9202c;

        /* renamed from: d */
        private int f9203d;

        /* renamed from: british.x.t_chat$a0$a */
        class C2228a implements DialogInterface.OnClickListener {
            C2228a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: british.x.t_chat$a0$b */
        class C2229b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9206a;

            C2229b(AlertDialog alertDialog) {
                this.f9206a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9206a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
                Button button2 = this.f9206a.getButton(-2);
                button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        public C2227a0(String str, String str2, int i) {
            this.f9200a = str;
            this.f9201b = str2;
            this.f9202c = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00c4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
                r0.<init>()     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "/srv/ultimas_frases.php?ver=1&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x00c0 }
                long r1 = r1.f9139L     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = r1.f9177p     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&idtema="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x00c0 }
                int r1 = r1.f9149Q     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                int r1 = r5.f9202c     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&idprivado_finalizar="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = r5.f9200a     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&idconversante="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = r5.f9201b     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r1 = "&externo="
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x00c0 }
                boolean r1 = r1.f9126E0     // Catch:{ Exception -> 0x00c0 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c0 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c0 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00c0 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00c0 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00c0 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00c0 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r6.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            L_0x0094:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                if (r2 == 0) goto L_0x00af
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r3.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r3.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r6.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                goto L_0x0094
            L_0x00af:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
                r0.disconnect()
                return r6
            L_0x00b7:
                r6 = move-exception
                goto L_0x00c8
            L_0x00b9:
                r6 = r0
                goto L_0x00c0
            L_0x00bb:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00c8
            L_0x00c0:
                java.lang.String r0 = "ANDROID:KO"
                if (r6 == 0) goto L_0x00c7
                r6.disconnect()
            L_0x00c7:
                return r0
            L_0x00c8:
                if (r0 == 0) goto L_0x00cd
                r0.disconnect()
            L_0x00cd:
                goto L_0x00cf
            L_0x00ce:
                throw r6
            L_0x00cf:
                goto L_0x00ce
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2227a0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            int i;
            int indexOf;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            boolean z;
            int i2;
            String str7;
            String str8 = str;
            if (this.f9202c != -1) {
                try {
                    t_chat.this.f9162W0.setVisibility(8);
                } catch (Exception unused) {
                }
                if (str8.indexOf("ANDROID:OK") == -1 && str8.indexOf("ANDROID:KO") == -1 && str8.indexOf("ANDROID:PERFILKO") == -1) {
                    t_chat.this.findViewById(R.id.btncargarmas).setVisibility(this.f9203d);
                } else if (str8.indexOf("ANDROID:PERFILKO") != -1) {
                    AlertDialog create = new AlertDialog.Builder(t_chat.this).setPositiveButton(R.string.aceptar, new C2228a()).setMessage(R.string.perfil_desactivado).create();
                    if (!t_chat.this.f6656b.equals("")) {
                        create.setOnShowListener(new C2229b(create));
                    }
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused2) {
                    }
                } else if (str8.indexOf("ANDROID:OK") != -1) {
                    int indexOf2 = str8.indexOf("@XYY53@");
                    String str9 = "";
                    String str10 = str9;
                    boolean z2 = false;
                    for (int i3 = -1; indexOf2 != i3; i3 = -1) {
                        int indexOf3 = str8.indexOf("@", indexOf2 + 1) + 1;
                        int indexOf4 = str8.indexOf("@", indexOf3);
                        String substring = str8.substring(indexOf3, indexOf4);
                        t_chat.this.f9151R = Integer.parseInt(substring);
                        int i4 = indexOf4 + 1;
                        int indexOf5 = str8.indexOf("@", i4);
                        String substring2 = str8.substring(i4, indexOf5);
                        int i5 = indexOf5 + 1;
                        int indexOf6 = str8.indexOf("@", i5);
                        String substring3 = str8.substring(i5, indexOf6);
                        int i6 = indexOf6 + 1;
                        int indexOf7 = str8.indexOf("@", i6);
                        String substring4 = str8.substring(i6, indexOf7);
                        int i7 = indexOf7 + 1;
                        String str11 = substring3;
                        int indexOf8 = str8.indexOf("@", i7);
                        String substring5 = str8.substring(i7, indexOf8);
                        int i8 = indexOf8 + 1;
                        String str12 = substring5;
                        int indexOf9 = str8.indexOf("@", i8);
                        String substring6 = str8.substring(i8, indexOf9);
                        int i9 = indexOf9 + 1;
                        String str13 = substring6;
                        int indexOf10 = str8.indexOf("@", i9);
                        String substring7 = str8.substring(i9, indexOf10);
                        int i10 = indexOf10 + 1;
                        String str14 = substring7;
                        int indexOf11 = str8.indexOf("@", i10);
                        String substring8 = str8.substring(i10, indexOf11);
                        int i11 = indexOf11 + 1;
                        String str15 = substring8;
                        int indexOf12 = str8.indexOf("@", i11);
                        String substring9 = str8.substring(i11, indexOf12);
                        int i12 = indexOf12 + 1;
                        String str16 = substring9;
                        int indexOf13 = str8.indexOf("@", i12);
                        String substring10 = str8.substring(i12, indexOf13);
                        int i13 = indexOf13 + 1;
                        String str17 = substring10;
                        int indexOf14 = str8.indexOf("@", i13);
                        String substring11 = str8.substring(i13, indexOf14);
                        int i14 = indexOf14 + 1;
                        String str18 = substring11;
                        int indexOf15 = str8.indexOf("@", i14);
                        String substring12 = str8.substring(i14, indexOf15);
                        int i15 = indexOf15 + 1;
                        int indexOf16 = str8.indexOf("@", i15);
                        String substring13 = str8.substring(i15, indexOf16);
                        if (substring13.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                            int i16 = indexOf16 + 1;
                            int indexOf17 = str8.indexOf("@", i16);
                            String substring14 = str8.substring(i16, indexOf17);
                            int i17 = indexOf17 + 1;
                            String str19 = substring14;
                            indexOf16 = str8.indexOf("@", i17);
                            str3 = str8.substring(i17, indexOf16);
                            String str20 = str19;
                            str2 = substring12;
                            str4 = str20;
                        } else {
                            str3 = "";
                            str2 = substring12;
                            str4 = str3;
                        }
                        if (str9.equals("") || substring4.equals("") || !str9.equals(substring4) || str10.equals("") || substring2.equals("") || !str10.equals(substring2)) {
                            int indexOf18 = str8.indexOf("@XYY53@", indexOf16);
                            if (indexOf18 != -1) {
                                int indexOf19 = str8.indexOf("@", str8.indexOf("@", indexOf18 + 1) + 1) + 1;
                                str5 = str8.substring(indexOf19, str8.indexOf("@", indexOf19));
                            } else {
                                str5 = "";
                            }
                            if (z2 || str8.indexOf("ZXRT4@1@") != -1) {
                                z = z2;
                                str6 = str3;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z = z2;
                                str6 = str3;
                                sb.append(t_chat.this.f9139L);
                                sb.append("");
                                if (substring2.equals(sb.toString())) {
                                    int i18 = indexOf16;
                                    while (true) {
                                        int indexOf20 = str8.indexOf("@XYY53@", i18);
                                        if (indexOf20 != -1) {
                                            int indexOf21 = str8.indexOf("@", str8.indexOf("@", indexOf20 + 1) + 1) + 1;
                                            i2 = str8.indexOf("@", indexOf21);
                                            str7 = str8.substring(indexOf21, i2);
                                        } else {
                                            i2 = i18;
                                            str7 = "";
                                        }
                                        if (str7.equals("")) {
                                            z2 = true;
                                            break;
                                        } else if (!str7.equals(substring2)) {
                                            z2 = false;
                                            break;
                                        } else {
                                            i18 = i2;
                                        }
                                    }
                                    SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
                                    edit.putString("f2_idfrase", substring);
                                    edit.putString("f2_id", substring2);
                                    edit.putString("f2_idusu_prev", str5);
                                    edit.putBoolean("f2_mateixusu_hastafinal", z2);
                                    edit.putString("f2_nombre", str11);
                                    edit.putString("f2_privados", str13);
                                    edit.putString("f2_frase", substring4);
                                    edit.putString("f2_fcrea", C1692config.m8200u(str14));
                                    edit.putString("f2_b64", "");
                                    edit.putString("f2_tipo", substring13);
                                    edit.putString("f2_b64_th", "");
                                    edit.putString("f2_idvideo", str4);
                                    edit.putString("f2_formato", str6);
                                    edit.putString("f2_idtema", t_chat.this.f9149Q + "");
                                    edit.putString("f2_vfoto", str12);
                                    edit.putString("f2_fnac_d", str15);
                                    edit.putString("f2_fnac_m", str16);
                                    edit.putString("f2_fnac_a", str17);
                                    edit.putString("f2_sexo", str18);
                                    edit.putString("f2_coments", str2);
                                    edit.putBoolean("f2_ultimas", true);
                                    edit.putString("f2_ts", System.currentTimeMillis() + "");
                                    edit.commit();
                                    str10 = substring2;
                                    str9 = substring4;
                                }
                            }
                            z2 = z;
                            SharedPreferences.Editor edit2 = t_chat.this.f9172m0.edit();
                            edit2.putString("f2_idfrase", substring);
                            edit2.putString("f2_id", substring2);
                            edit2.putString("f2_idusu_prev", str5);
                            edit2.putBoolean("f2_mateixusu_hastafinal", z2);
                            edit2.putString("f2_nombre", str11);
                            edit2.putString("f2_privados", str13);
                            edit2.putString("f2_frase", substring4);
                            edit2.putString("f2_fcrea", C1692config.m8200u(str14));
                            edit2.putString("f2_b64", "");
                            edit2.putString("f2_tipo", substring13);
                            edit2.putString("f2_b64_th", "");
                            edit2.putString("f2_idvideo", str4);
                            edit2.putString("f2_formato", str6);
                            edit2.putString("f2_idtema", t_chat.this.f9149Q + "");
                            edit2.putString("f2_vfoto", str12);
                            edit2.putString("f2_fnac_d", str15);
                            edit2.putString("f2_fnac_m", str16);
                            edit2.putString("f2_fnac_a", str17);
                            edit2.putString("f2_sexo", str18);
                            edit2.putString("f2_coments", str2);
                            edit2.putBoolean("f2_ultimas", true);
                            edit2.putString("f2_ts", System.currentTimeMillis() + "");
                            edit2.commit();
                            str10 = substring2;
                            str9 = substring4;
                        }
                        indexOf2 = str8.indexOf("@XYY53@", indexOf16);
                    }
                    if (str8.indexOf("ZXRT4@1@") != -1) {
                        t_chat.this.findViewById(R.id.btncargarmas).setVisibility(0);
                        i = 8;
                    } else {
                        t_chat.this.mo8481P();
                        i = 8;
                        t_chat.this.findViewById(R.id.btncargarmas).setVisibility(8);
                    }
                    if (t_chat.this.f9126E0 && (indexOf = str8.indexOf("ZXRT4@")) != -1) {
                        int i19 = indexOf + i;
                        int indexOf22 = str8.indexOf("@", i19);
                        int parseInt = Integer.parseInt(str8.substring(i19, indexOf22));
                        int i20 = indexOf22 + 1;
                        int indexOf23 = str8.indexOf("@", i20);
                        boolean equals = str8.substring(i20, indexOf23).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        int i21 = indexOf23 + 1;
                        int indexOf24 = str8.indexOf("@", i21);
                        int parseInt2 = Integer.parseInt(str8.substring(i21, indexOf24));
                        int i22 = indexOf24 + 1;
                        int indexOf25 = str8.indexOf("@", i22);
                        boolean z3 = Integer.parseInt(str8.substring(i22, indexOf25)) == 1;
                        int i23 = indexOf25 + 1;
                        int parseInt3 = Integer.parseInt(str8.substring(i23, str8.indexOf("@", i23)));
                        if (parseInt <= 0) {
                            return;
                        }
                        if (!equals) {
                            t_chat.this.f9176o0.mo7514k1((ImageView) t_chat.this.findViewById(R.id.iv_fondo), Boolean.valueOf(z3), parseInt3);
                            C1692config i24 = t_chat.this.f9176o0;
                            i24.mo7493Y("fondo_" + parseInt, (ImageView) t_chat.this.findViewById(R.id.iv_fondo));
                            return;
                        }
                        C2231b0 b0Var = new C2231b0();
                        b0Var.execute(new String[]{parseInt + "", "", parseInt2 + "", z3 + "", parseInt3 + ""});
                    }
                } else {
                    t_chat.this.findViewById(R.id.btncargarmas).setVisibility(this.f9203d);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f9202c > -1) {
                this.f9203d = t_chat.this.findViewById(R.id.btncargarmas).getVisibility();
                t_chat.this.findViewById(R.id.btncargarmas).setVisibility(8);
                t_chat.this.f9162W0.setVisibility(0);
            }
        }
    }

    /* renamed from: british.x.t_chat$b */
    class C2230b implements View.OnClickListener {
        C2230b() {
        }

        public void onClick(View view) {
            int i;
            t_chat t_chat = t_chat.this;
            if (t_chat.f9130G0) {
                if (!t_chat.f9194x0) {
                    ((ImageView) view).setImageDrawable(t_chat.getResources().getDrawable(R.drawable.notif_noactiv_light));
                } else {
                    ((ImageView) view).setImageDrawable(t_chat.getResources().getDrawable(R.drawable.notif_noactiv));
                }
                t_chat.this.f9130G0 = false;
                i = 0;
            } else {
                Drawable drawable = t_chat.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f9186t0, PorterDuff.Mode.MULTIPLY);
                ((ImageView) view).setImageDrawable(drawable);
                t_chat.this.f9130G0 = true;
                i = 1;
            }
            SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
            edit.putBoolean("notif" + t_chat.this.f9147P, t_chat.this.f9130G0);
            edit.commit();
            new C1692config.C1732r0(t_chat.this.f9139L, t_chat.this.f9177p, t_chat.this.f9147P, "notif", i).execute(new String[0]);
        }
    }

    /* renamed from: british.x.t_chat$b0 */
    private class C2231b0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f9209a;

        /* renamed from: b */
        String f9210b;

        /* renamed from: c */
        String f9211c;

        /* renamed from: d */
        boolean f9212d;

        /* renamed from: e */
        int f9213e;

        private C2231b0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0091 */
        /* JADX WARNING: Removed duplicated region for block: B:13:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:3:0x005e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f9209a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f9210b = r2
                r2 = 2
                r2 = r6[r2]
                r5.f9211c = r2
                r2 = 3
                r2 = r6[r2]
                java.lang.String r3 = "1"
                boolean r2 = r2.equals(r3)
                r5.f9212d = r2
                r2 = 4
                r6 = r6[r2]
                int r6 = java.lang.Integer.parseInt(r6)
                r5.f9213e = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7108H5
                r6.append(r2)
                java.lang.String r2 = "/srv/imgs/chat/"
                r6.append(r2)
                java.lang.String r2 = r5.f9209a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f9211c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f9209a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a0 }
                r4.<init>(r6)     // Catch:{ MalformedURLException -> 0x00a0 }
                java.net.URLConnection r6 = r4.openConnection()     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                r6.connect()     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x0091, OutOfMemoryError -> 0x0096 }
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x0091, OutOfMemoryError -> 0x0096 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0091, OutOfMemoryError -> 0x0096 }
                r4 = 100
                r6.compress(r2, r4, r1)     // Catch:{ Exception -> 0x0091, OutOfMemoryError -> 0x0096 }
                r1.close()     // Catch:{ Exception -> 0x0091, OutOfMemoryError -> 0x0096 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x0091:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)     // Catch:{ IOException -> 0x009b, OutOfMemoryError -> 0x0096 }
                return r6
            L_0x0096:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x009b:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x00a0:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2231b0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    ImageView imageView = (ImageView) t_chat.this.findViewById(R.id.iv_fondo);
                    t_chat.this.f9176o0.mo7514k1(imageView, Boolean.valueOf(this.f9212d), this.f9213e);
                    imageView.setVisibility(8);
                    C1692config i = t_chat.this.f9176o0;
                    i.mo7493Y("fondo_" + this.f9209a, imageView);
                    C1692config.m8172V(imageView);
                } catch (Exception unused) {
                }
                t_chat t_chat = t_chat.this;
                if (!t_chat.f9126E0) {
                    SharedPreferences.Editor edit = t_chat.getSharedPreferences("sh", 0).edit();
                    edit.putInt("s" + this.f9209a + "_fondo_modif", 0);
                    edit.commit();
                    t_chat.this.f9176o0.f7231O1[Integer.parseInt(this.f9210b)].f7876P = false;
                    return;
                }
                new C2247h0().execute(new String[]{this.f9209a});
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.x.t_chat$c */
    class C2232c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9215a;

        C2232c(AlertDialog alertDialog) {
            this.f9215a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f9215a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
        }
    }

    /* renamed from: british.x.t_chat$c0 */
    public static class C2233c0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private long f9217a;

        /* renamed from: b */
        private String f9218b;

        /* renamed from: c */
        private String f9219c;

        /* renamed from: d */
        private Context f9220d;

        public C2233c0(String str, long j, String str2, Context context) {
            this.f9218b = str;
            this.f9217a = j;
            this.f9219c = str2;
            this.f9220d = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/eliminar_usu.php");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("idusu", new C12982f(this.f9217a + ""));
                gVar.mo48144c("c", new C12982f(this.f9219c));
                gVar.mo48144c("idusu_elim", new C12982f(this.f9218b));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if ((str.indexOf("ANDROID:OK") != -1 || str.indexOf("ANDROID:KO") != -1) && str.indexOf("ANDROID:OK") != -1) {
                Context context = this.f9220d;
                C1692config.m8157K0(Toast.makeText(context, context.getString(R.string.usu_eliminado), 0));
            }
        }
    }

    /* renamed from: british.x.t_chat$d */
    class C2234d implements DialogInterface.OnClickListener {
        C2234d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            t_chat.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: british.x.t_chat$d0 */
    private class C2235d0 extends AsyncTask<String, Void, String> {
        private C2235d0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Iterator<String> it = t_chat.this.f9197z.iterator();
            while (it.hasNext()) {
                try {
                    it.remove();
                    C12788b bVar = new C12788b();
                    C12789c.m54266h(bVar, 10000);
                    C12789c.m54267i(bVar, 20000);
                    C11188h hVar = new C11188h(bVar);
                    C12831e eVar = new C12831e(C1692config.f7107G5 + "gcm.e-droid.net/enviar_mensaje.php");
                    C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                    gVar.mo48144c("v", new C12982f("4"));
                    gVar.mo48144c("idapp", new C12982f("2261075"));
                    gVar.mo48144c("idusu", new C12982f(t_chat.this.f9139L + ""));
                    gVar.mo48144c("c", new C12982f(t_chat.this.f9177p));
                    gVar.mo48144c("idtema", new C12982f(t_chat.this.f9149Q + ""));
                    gVar.mo48144c("idusudest", new C12982f(t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION)));
                    gVar.mo48144c("externo", new C12982f(t_chat.this.f9126E0 + ""));
                    gVar.mo48144c("m", new C12982f(URLEncoder.encode(it.next(), C6540C.UTF8_NAME)));
                    eVar.mo47986B(gVar);
                    eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        }
                    }
                } catch (Exception unused) {
                    return "KO";
                }
            }
            return "OK";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.equals("OK") && t_chat.this.f9197z.size() > 0) {
                t_chat t_chat = t_chat.this;
                t_chat.f9156T0 = new C2235d0();
                t_chat.this.f9156T0.execute(new String[0]);
            }
        }
    }

    /* renamed from: british.x.t_chat$e */
    class C2236e implements DialogInterface.OnClickListener {
        C2236e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!t_chat.this.f9176o0.mo7500d1(t_chat.this, 107)) {
                t_chat.this.f9192w0 = System.currentTimeMillis();
                C1692config i2 = t_chat.this.f9176o0;
                t_chat t_chat = t_chat.this;
                i2.mo7525s0(t_chat, t_chat.f9176o0.mo7505h0(t_chat.this, 99));
            }
        }
    }

    /* renamed from: british.x.t_chat$e0 */
    private class C2237e0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9224a;

        /* renamed from: british.x.t_chat$e0$a */
        class C2238a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9226a;

            C2238a(AlertDialog alertDialog) {
                this.f9226a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9226a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        /* renamed from: british.x.t_chat$e0$b */
        class C2239b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9228a;

            C2239b(AlertDialog alertDialog) {
                this.f9228a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9228a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        public C2237e0(int i) {
            this.f9224a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 60000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_foto.php");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(t_chat.this.getContentResolver(), Uri.fromFile(t_chat.this.f9176o0.mo7516l0(t_chat.this, this.f9224a)));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                gVar.mo48144c("foto", new C12978b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
                gVar.mo48144c("v", new C12982f("2"));
                gVar.mo48144c("idusu", new C12982f(t_chat.this.f9139L + ""));
                gVar.mo48144c("c", new C12982f(t_chat.this.f9177p));
                gVar.mo48144c("idtema", new C12982f(t_chat.this.f9149Q + ""));
                gVar.mo48144c("idusudest", new C12982f(t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION)));
                gVar.mo48144c("externo", new C12982f(t_chat.this.f9126E0 + ""));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(t_chat.this);
            try {
                LinearLayout linearLayout = t_chat.this.f9158U0;
                linearLayout.findViewWithTag(this.f9224a + "").setVisibility(8);
                LinearLayout linearLayout2 = t_chat.this.f9158U0;
                linearLayout2.findViewWithTag(this.f9224a + "").setTag((Object) null);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK IDFRASE:") != -1 || str.indexOf("ANDROID:KO") != -1) {
                if (str.indexOf("ANDROID:OK IDFRASE:") != -1) {
                    t_chat.this.mo8484U();
                    int indexOf = str.indexOf("ANDROID:OK IDFRASE:") + 19;
                    int indexOf2 = str.indexOf("@", indexOf);
                    t_chat.this.f9176o0.mo7516l0(t_chat.this, this.f9224a).renameTo(t_chat.this.f9176o0.mo7518n0(t_chat.this, Integer.parseInt(str.substring(indexOf, indexOf2)), false));
                    try {
                        LinearLayout linearLayout3 = t_chat.this.f9158U0;
                        View findViewWithTag = linearLayout3.findViewWithTag("imgtemp" + this.f9224a);
                        findViewWithTag.setTag("img" + str.substring(indexOf, indexOf2));
                        LinearLayout linearLayout4 = t_chat.this.f9158U0;
                        linearLayout4.findViewWithTag("img" + str.substring(indexOf, indexOf2)).setOnClickListener(t_chat.this);
                    } catch (Exception unused2) {
                    }
                } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                    AlertDialog create = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.nogcm).create();
                    if (!t_chat.this.f6656b.equals("")) {
                        create.setOnShowListener(new C2238a(create));
                    }
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else if ((str.indexOf("ANDROID:KO MOTIVO:ABANDONADO") == -1 || t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) && str.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1 && !t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.noadmiteprivados).create();
                    if (!t_chat.this.f6656b.equals("")) {
                        create2.setOnShowListener(new C2239b(create2));
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_chat t_chat = t_chat.this;
            if (!t_chat.f9130G0) {
                Drawable drawable = t_chat.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f9186t0, PorterDuff.Mode.MULTIPLY);
                t_chat.this.f9190v0.setImageDrawable(drawable);
                t_chat t_chat2 = t_chat.this;
                t_chat2.f9130G0 = true;
                SharedPreferences.Editor edit = t_chat2.f9172m0.edit();
                edit.putBoolean("notif" + t_chat.this.f9147P, true);
                edit.commit();
                new C1692config.C1732r0(t_chat.this.f9139L, t_chat.this.f9177p, t_chat.this.f9147P, "notif", 1).execute(new String[0]);
            }
            if (t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                t_chat.this.f9176o0.mo7508i1(t_chat.this);
                C1692config i = t_chat.this.f9176o0;
                t_chat t_chat3 = t_chat.this;
                SharedPreferences t = t_chat3.f9172m0;
                i.mo7501e1(t_chat3, t, t_chat.this.f9149Q + "");
            }
            SharedPreferences.Editor edit2 = t_chat.this.f9172m0.edit();
            edit2.putString("f2_id", t_chat.this.f9139L + "");
            edit2.putString("f2_frase", "@@idfoto_temp:" + this.f9224a + "@@");
            edit2.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit2.putString("f2_b64", "");
            edit2.putString("f2_idfrase", "");
            edit2.putString("f2_idtema", t_chat.this.f9149Q + "");
            edit2.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
            edit2.putString("f2_tipo", SessionDescription.SUPPORTED_SDP_VERSION);
            edit2.putBoolean("f2_ultimas", false);
            edit2.putString("f2_ts", System.currentTimeMillis() + "");
            edit2.commit();
        }
    }

    /* renamed from: british.x.t_chat$f */
    class C2240f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9230a;

        C2240f(AlertDialog alertDialog) {
            this.f9230a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f9230a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            Button button2 = this.f9230a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
        }
    }

    /* renamed from: british.x.t_chat$f0 */
    private class C2241f0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9232a;

        /* renamed from: b */
        String f9233b;

        /* renamed from: c */
        String f9234c;

        /* renamed from: british.x.t_chat$f0$a */
        class C2242a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9236a;

            C2242a(AlertDialog alertDialog) {
                this.f9236a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9236a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        /* renamed from: british.x.t_chat$f0$b */
        class C2243b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9238a;

            C2243b(AlertDialog alertDialog) {
                this.f9238a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9238a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        public C2241f0(int i, String str, String str2) {
            this.f9232a = i;
            this.f9233b = str;
            this.f9234c = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_video.php");
            C12960g gVar = new C12960g();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(t_chat.this.getContentResolver(), Uri.fromFile(t_chat.this.f9176o0.mo7516l0(t_chat.this, this.f9232a)));
            } catch (IOException e) {
                e.printStackTrace();
                bitmap = null;
            }
            if (bitmap == null) {
                return "KO";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            gVar.mo48144c("thumb", new C12978b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
            try {
                gVar.mo48144c("v", new C12982f("2"));
                gVar.mo48144c("idusu", new C12982f(t_chat.this.f9139L + str));
                gVar.mo48144c("c", new C12982f(t_chat.this.f9177p));
                gVar.mo48144c("idvideo", new C12982f(this.f9233b));
                gVar.mo48144c("formato", new C12982f(this.f9234c));
                gVar.mo48144c("idtema", new C12982f(t_chat.this.f9149Q + str));
                gVar.mo48144c("idusudest", new C12982f(t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION)));
                gVar.mo48144c("externo", new C12982f(t_chat.this.f9126E0 + str));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                str = C12823d.m54372d(b);
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(t_chat.this);
            try {
                LinearLayout linearLayout = t_chat.this.f9158U0;
                linearLayout.findViewWithTag(this.f9232a + "").setVisibility(8);
                LinearLayout linearLayout2 = t_chat.this.f9158U0;
                linearLayout2.findViewWithTag(this.f9232a + "").setTag((Object) null);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK IDFRASE:") != -1 || str.indexOf("ANDROID:KO") != -1) {
                if (str.indexOf("ANDROID:OK IDFRASE:") != -1) {
                    t_chat.this.mo8484U();
                    int indexOf = str.indexOf("ANDROID:OK IDFRASE:") + 19;
                    int indexOf2 = str.indexOf("@", indexOf);
                    t_chat.this.f9176o0.mo7516l0(t_chat.this, this.f9232a).renameTo(t_chat.this.f9176o0.mo7518n0(t_chat.this, Integer.parseInt(str.substring(indexOf, indexOf2)), false));
                    try {
                        LinearLayout linearLayout3 = t_chat.this.f9158U0;
                        View findViewWithTag = linearLayout3.findViewWithTag("imgtemp" + this.f9232a);
                        findViewWithTag.setTag(R.id.idaux2, this.f9233b);
                        findViewWithTag.setTag(R.id.idaux3, this.f9234c);
                        findViewWithTag.setTag("img" + str.substring(indexOf, indexOf2));
                        LinearLayout linearLayout4 = t_chat.this.f9158U0;
                        linearLayout4.findViewWithTag("img" + str.substring(indexOf, indexOf2)).setOnClickListener(t_chat.this);
                    } catch (Exception unused2) {
                    }
                } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                    AlertDialog create = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.nogcm).create();
                    if (!t_chat.this.f6656b.equals("")) {
                        create.setOnShowListener(new C2242a(create));
                    }
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else if ((str.indexOf("ANDROID:KO MOTIVO:ABANDONADO") == -1 || t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) && str.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1 && !t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.noadmiteprivados).create();
                    if (!t_chat.this.f6656b.equals("")) {
                        create2.setOnShowListener(new C2243b(create2));
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }
    }

    /* renamed from: british.x.t_chat$g */
    class C2244g implements DialogInterface.OnClickListener {
        C2244g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            t_chat.this.startActivityForResult(intent, 4);
        }
    }

    /* renamed from: british.x.t_chat$g0 */
    private class C2245g0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9241a;

        /* renamed from: b */
        int f9242b;

        public C2245g0(int i, String str) {
            this.f9241a = str;
            this.f9242b = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e("https://video-upload.e-droid.net/upload.php");
            C12981e eVar2 = new C12981e(new File(this.f9241a));
            C12960g gVar = new C12960g();
            gVar.mo48144c("videoFile", eVar2);
            try {
                gVar.mo48144c("idusu", new C12982f(t_chat.this.f9139L + str));
                gVar.mo48144c("idapp", new C12982f("2261075"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            int indexOf = str.indexOf("ANDROID:OK:-");
            if (indexOf != -1) {
                int i = indexOf + 12;
                int indexOf2 = str.indexOf("-", i + 1);
                String substring = str.substring(i, indexOf2);
                int i2 = indexOf2 + 1;
                String substring2 = str.substring(i2, str.indexOf("-", i2));
                if (substring2.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    str2 = "mp4";
                } else if (substring2.equals("2")) {
                    str2 = "3gp";
                } else if (substring2.equals("3")) {
                    str2 = "webm";
                } else {
                    return;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.f9241a);
                    C1692config i3 = t_chat.this.f9176o0;
                    t_chat t_chat = t_chat.this;
                    String absolutePath = i3.mo7517m0(t_chat, "v" + substring + "." + str2).getAbsolutePath();
                    FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.f9241a = absolutePath;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new C2241f0(this.f9242b, substring, substring2).execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_chat t_chat = t_chat.this;
            if (!t_chat.f9130G0) {
                Drawable drawable = t_chat.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f9186t0, PorterDuff.Mode.MULTIPLY);
                t_chat.this.f9190v0.setImageDrawable(drawable);
                t_chat t_chat2 = t_chat.this;
                t_chat2.f9130G0 = true;
                SharedPreferences.Editor edit = t_chat2.f9172m0.edit();
                edit.putBoolean("notif" + t_chat.this.f9147P, true);
                edit.commit();
                new C1692config.C1732r0(t_chat.this.f9139L, t_chat.this.f9177p, t_chat.this.f9147P, "notif", 1).execute(new String[0]);
            }
            if (t_chat.this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                t_chat.this.f9176o0.mo7508i1(t_chat.this);
                C1692config i = t_chat.this.f9176o0;
                t_chat t_chat3 = t_chat.this;
                SharedPreferences t = t_chat3.f9172m0;
                i.mo7501e1(t_chat3, t, t_chat.this.f9149Q + "");
            }
            SharedPreferences.Editor edit2 = t_chat.this.f9172m0.edit();
            edit2.putString("f2_id", t_chat.this.f9139L + "");
            edit2.putString("f2_frase", "@@idfoto_temp:" + this.f9242b + "@@");
            edit2.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit2.putString("f2_b64", "");
            edit2.putString("f2_idfrase", "");
            edit2.putString("f2_idtema", t_chat.this.f9149Q + "");
            edit2.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
            edit2.putString("f2_tipo", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            edit2.putString("f2_idvideo", "");
            edit2.putString("f2_formato", "");
            edit2.putBoolean("f2_ultimas", false);
            edit2.putString("f2_ts", System.currentTimeMillis() + "");
            edit2.commit();
        }
    }

    /* renamed from: british.x.t_chat$h */
    class C2246h implements DialogInterface.OnClickListener {
        C2246h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!t_chat.this.f9176o0.mo7500d1(t_chat.this, 109)) {
                C1692config i2 = t_chat.this.f9176o0;
                t_chat t_chat = t_chat.this;
                i2.mo7526t0(t_chat, t_chat.f9176o0.mo7507i0(t_chat.this, "dt_foto98_temp.mp4"));
            }
        }
    }

    /* renamed from: british.x.t_chat$h0 */
    private class C2247h0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f9245a;

        private C2247h0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            this.f9245a = strArr[0];
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/fondo_guardado.php");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("idusu", new C12982f(t_chat.this.f9139L + ""));
                gVar.mo48144c("c", new C12982f(t_chat.this.f9177p));
                gVar.mo48144c("idfoto", new C12982f(this.f9245a + ""));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                hVar.mo43518a(eVar);
                return (byte) 0;
            } catch (Exception unused) {
                return (byte) -1;
            }
        }
    }

    /* renamed from: british.x.t_chat$i */
    class C2248i implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9247a;

        C2248i(AlertDialog alertDialog) {
            this.f9247a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f9247a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            Button button2 = this.f9247a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
        }
    }

    /* renamed from: british.x.t_chat$i0 */
    private class C2249i0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9249a;

        /* renamed from: b */
        String f9250b;

        /* renamed from: c */
        Bitmap f9251c;

        private C2249i0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = r4.f9249a
                java.lang.String r0 = "0"
                if (r5 == 0) goto L_0x008c
                java.lang.String r5 = r4.f9250b
                if (r5 != 0) goto L_0x000c
                goto L_0x008c
            L_0x000c:
                java.net.URL r5 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9249a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9250b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r5.<init>(r1)     // Catch:{  }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x008c }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 1
                r5.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r5.setReadTimeout(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r5.connect()     // Catch:{ MalformedURLException -> 0x008c }
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x008c }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r4.f9251c = r2     // Catch:{ MalformedURLException -> 0x008c }
                r1.close()     // Catch:{ MalformedURLException -> 0x008c }
                r5.disconnect()     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r5 = new java.io.File     // Catch:{ MalformedURLException -> 0x008c }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r1 = r1.f9146O0     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x008c }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = r4.f9249a     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x008c }
                r5.<init>(r1, r2)     // Catch:{ MalformedURLException -> 0x008c }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r5)     // Catch:{  }
                android.graphics.Bitmap r5 = r4.f9251c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r5.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
                return r5
            L_0x008c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2249i0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            Map<String, Bitmap> map = t_chat.this.f9140L0;
            if (map != null) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    map.put(this.f9249a, this.f9251c);
                    SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
                    edit.putString("fperfil_" + this.f9249a, t_chat.this.f9144N0.get(this.f9249a));
                    edit.commit();
                }
                int childCount = t_chat.this.f9158U0.getChildCount();
                int i = 0;
                while (i < childCount) {
                    try {
                        String str2 = (String) t_chat.this.f9158U0.getChildAt(i).getTag();
                        if (str2 != null && str2.equals(this.f9249a)) {
                            t_chat.this.f9158U0.getChildAt(i).findViewById(R.id.pb_foto).setVisibility(8);
                            t_chat.this.f9158U0.getChildAt(i).findViewById(R.id.pb_foto_inv).setVisibility(8);
                            if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                                ((ImageView) t_chat.this.f9158U0.getChildAt(i).findViewById(R.id.iv_avatar_f)).setImageBitmap(this.f9251c);
                            }
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                if (!t_chat.this.f9142M0.equals("")) {
                    t_chat t_chat = t_chat.this;
                    t_chat.f9148P0 = new C2249i0();
                    t_chat.this.f9148P0.execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_chat.this.f9142M0.equals("")) {
                cancel(false);
                return;
            }
            try {
                this.f9249a = (String) t_chat.this.f9142M0.keySet().toArray()[0];
            } catch (Exception unused) {
                cancel(false);
            }
            String str = this.f9249a;
            if (str != null) {
                this.f9250b = t_chat.this.f9142M0.get(str);
                t_chat t_chat = t_chat.this;
                Map<String, String> map = t_chat.f9144N0;
                String str2 = this.f9249a;
                map.put(str2, t_chat.f9142M0.get(str2));
                t_chat.this.f9142M0.remove(this.f9249a);
            }
        }
    }

    /* renamed from: british.x.t_chat$j */
    class C2250j implements DialogInterface.OnClickListener {

        /* renamed from: british.x.t_chat$j$a */
        class C2251a implements DialogInterface.OnClickListener {
            C2251a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_chat t_chat = t_chat.this;
                C1692config.m8152H(t_chat, t_chat.f9181r);
                new C2282z(t_chat.this.f9181r, 1, t_chat.this.f9141M, t_chat.this.f9179q).execute(new String[0]);
                t_chat t_chat2 = t_chat.this;
                if (t_chat2.f9126E0 && t_chat2.f9136J0.containsKey("id_remit")) {
                    t_chat t_chat3 = t_chat.this;
                    t_chat3.f6657c = true;
                    t_chat3.mo8479K();
                    t_chat.this.finish();
                }
            }
        }

        /* renamed from: british.x.t_chat$j$b */
        class C2252b implements DialogInterface.OnClickListener {
            C2252b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_chat t_chat = t_chat.this;
                if (t_chat.f9126E0 && t_chat.f9136J0.containsKey("id_remit")) {
                    t_chat t_chat2 = t_chat.this;
                    t_chat2.f6657c = true;
                    t_chat2.mo8479K();
                    t_chat.this.finish();
                }
            }
        }

        /* renamed from: british.x.t_chat$j$c */
        class C2253c implements DialogInterface.OnShowListener {
            C2253c() {
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = t_chat.this.f9178p0.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
                Button button2 = t_chat.this.f9178p0.getButton(-2);
                button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        /* renamed from: british.x.t_chat$j$d */
        class C2254d implements DialogInterface.OnClickListener {
            C2254d() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                new C2282z(t_chat.this.f9181r, 3, t_chat.this.f9141M, t_chat.this.f9179q).execute(new String[0]);
                SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
                edit.putInt("privados", 0);
                edit.commit();
                t_chat t_chat = t_chat.this;
                if (t_chat.f9126E0 && t_chat.f9136J0.containsKey("id_remit")) {
                    t_chat t_chat2 = t_chat.this;
                    t_chat2.f6657c = true;
                    t_chat2.mo8479K();
                    t_chat.this.finish();
                }
            }
        }

        /* renamed from: british.x.t_chat$j$e */
        class C2255e implements DialogInterface.OnClickListener {
            C2255e() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_chat t_chat = t_chat.this;
                if (t_chat.f9126E0 && t_chat.f9136J0.containsKey("id_remit")) {
                    t_chat t_chat2 = t_chat.this;
                    t_chat2.f6657c = true;
                    t_chat2.mo8479K();
                    t_chat.this.finish();
                }
            }
        }

        /* renamed from: british.x.t_chat$j$f */
        class C2256f implements DialogInterface.OnShowListener {
            C2256f() {
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = t_chat.this.f9178p0.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
                Button button2 = t_chat.this.f9178p0.getButton(-2);
                button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            }
        }

        C2250j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                t_chat t_chat = t_chat.this;
                t_chat.m8706N(t_chat.f9181r, t_chat.this.f9183s);
            } else if (i == 1) {
                SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
                edit.putLong("f_ult_" + t_chat.this.f9181r, System.currentTimeMillis());
                edit.commit();
                t_chat t_chat2 = t_chat.this;
                if (t_chat2.f9126E0 && t_chat2.f9136J0.containsKey("id_remit")) {
                    t_chat t_chat3 = t_chat.this;
                    t_chat3.f6657c = true;
                    t_chat3.mo8479K();
                    t_chat.this.finish();
                }
            } else if (i == 2) {
                t_chat.this.f9178p0 = new AlertDialog.Builder(t_chat.this).setCancelable(true).setNegativeButton(t_chat.this.getString(R.string.cancelar), new C2252b()).setPositiveButton(t_chat.this.getString(R.string.aceptar), new C2251a()).setMessage(R.string.avisodenegarprivados).create();
                if (!t_chat.this.f6656b.equals("")) {
                    t_chat.this.f9178p0.setOnShowListener(new C2253c());
                }
                t_chat.this.f9178p0.show();
                try {
                    ((TextView) t_chat.this.f9178p0.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (i == 3) {
                t_chat.this.f9178p0 = new AlertDialog.Builder(t_chat.this).setCancelable(true).setNegativeButton(t_chat.this.getString(R.string.cancelar), new C2255e()).setPositiveButton(t_chat.this.getString(R.string.aceptar), new C2254d()).setMessage(R.string.confirmar_ningunprivado).create();
                if (!t_chat.this.f6656b.equals("")) {
                    t_chat.this.f9178p0.setOnShowListener(new C2256f());
                }
                t_chat.this.f9178p0.show();
                ((TextView) t_chat.this.f9178p0.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: british.x.t_chat$j0 */
    private class C2257j0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9260a;

        /* renamed from: b */
        String f9261b;

        /* renamed from: c */
        String f9262c;

        /* renamed from: d */
        String f9263d;

        /* renamed from: e */
        Bitmap f9264e;

        private C2257j0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.String r6 = r5.f9260a
                java.lang.String r0 = "0"
                if (r6 == 0) goto L_0x00bb
                java.lang.String r1 = ""
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L_0x0010
                goto L_0x00bb
            L_0x0010:
                r6 = 0
                java.lang.String r1 = r5.f9261b     // Catch:{  }
                boolean r1 = r1.equals(r0)     // Catch:{  }
                java.lang.String r2 = "1"
                if (r1 == 0) goto L_0x003e
                java.net.URL r6 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = "/srv/imgs/frases/f"
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = r5.f9260a     // Catch:{  }
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = "_p.jpg"
                r1.append(r3)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r6.<init>(r1)     // Catch:{  }
                goto L_0x0072
            L_0x003e:
                java.lang.String r1 = r5.f9261b     // Catch:{  }
                boolean r1 = r1.equals(r2)     // Catch:{  }
                if (r1 == 0) goto L_0x0072
                java.net.URL r6 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = "/srv/imgs/videos/v"
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = r5.f9262c     // Catch:{  }
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = "_"
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = r5.f9263d     // Catch:{  }
                r1.append(r3)     // Catch:{  }
                java.lang.String r3 = "_th.jpg"
                r1.append(r3)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r6.<init>(r1)     // Catch:{  }
            L_0x0072:
                java.net.URLConnection r6 = r6.openConnection()     // Catch:{ MalformedURLException -> 0x00bb }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ MalformedURLException -> 0x00bb }
                r1 = 1
                r6.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x00bb }
                r1 = 10000(0x2710, float:1.4013E-41)
                r6.setConnectTimeout(r1)     // Catch:{ MalformedURLException -> 0x00bb }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r6.setReadTimeout(r1)     // Catch:{ MalformedURLException -> 0x00bb }
                r6.connect()     // Catch:{ MalformedURLException -> 0x00bb }
                java.io.InputStream r1 = r6.getInputStream()     // Catch:{ MalformedURLException -> 0x00bb }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x00bb }
                r5.f9264e = r3     // Catch:{ MalformedURLException -> 0x00bb }
                r1.close()     // Catch:{ MalformedURLException -> 0x00bb }
                r6.disconnect()     // Catch:{ MalformedURLException -> 0x00bb }
                british.x.t_chat r6 = british.p015x.t_chat.this     // Catch:{ MalformedURLException -> 0x00bb }
                british.x.config r6 = r6.f9176o0     // Catch:{ MalformedURLException -> 0x00bb }
                british.x.t_chat r1 = british.p015x.t_chat.this     // Catch:{ MalformedURLException -> 0x00bb }
                java.lang.String r3 = r5.f9260a     // Catch:{ MalformedURLException -> 0x00bb }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ MalformedURLException -> 0x00bb }
                r4 = 0
                java.io.File r6 = r6.mo7518n0(r1, r3, r4)     // Catch:{ MalformedURLException -> 0x00bb }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r6)     // Catch:{  }
                android.graphics.Bitmap r6 = r5.f9264e     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r4 = 100
                r6.compress(r3, r4, r1)     // Catch:{  }
                return r2
            L_0x00bb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2257j0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (t_chat.this.f9185t != null) {
                if (this.f9261b.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    t_chat t_chat = t_chat.this;
                    String q = t_chat.f9185t;
                    t_chat.f9185t = q.replace("," + this.f9260a + "@" + this.f9261b + ",", "");
                } else if (this.f9261b.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    t_chat t_chat2 = t_chat.this;
                    String q2 = t_chat2.f9185t;
                    t_chat2.f9185t = q2.replace("," + this.f9260a + "@" + this.f9261b + "@" + this.f9262c + "@" + this.f9263d + ",", "");
                }
                try {
                    LinearLayout linearLayout = t_chat.this.f9158U0;
                    linearLayout.findViewWithTag("pb" + this.f9260a).setVisibility(8);
                } catch (Exception unused) {
                }
                t_chat t_chat3 = t_chat.this;
                int parseInt = Integer.parseInt(this.f9260a);
                LinearLayout linearLayout2 = t_chat.this.f9158U0;
                t_chat3.m8708Q(parseInt, false, (ImageView) linearLayout2.findViewWithTag("img" + this.f9260a));
                try {
                    LinearLayout linearLayout3 = t_chat.this.f9158U0;
                    linearLayout3.findViewWithTag("img" + this.f9260a).setOnClickListener(t_chat.this);
                } catch (Exception unused2) {
                }
                if (!t_chat.this.f9185t.equals("")) {
                    t_chat t_chat4 = t_chat.this;
                    t_chat4.f9150Q0 = new C2257j0();
                    t_chat.this.f9150Q0.execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_chat.this.f9185t.equals("")) {
                cancel(false);
                return;
            }
            int indexOf = t_chat.this.f9185t.indexOf(",");
            if (indexOf == -1) {
                cancel(false);
                return;
            }
            int i = indexOf + 1;
            int indexOf2 = t_chat.this.f9185t.indexOf(",", i);
            if (indexOf2 == -1) {
                cancel(false);
                return;
            }
            String substring = t_chat.this.f9185t.substring(i, indexOf2);
            this.f9260a = substring;
            if (substring.equals("")) {
                cancel(false);
                return;
            }
            String[] split = this.f9260a.split("@");
            if ((!split[1].equals(SessionDescription.SUPPORTED_SDP_VERSION) || split.length == 2) && (!split[1].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || split.length == 4)) {
                this.f9260a = split[0];
                String str = split[1];
                this.f9261b = str;
                if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    this.f9262c = split[2];
                    this.f9263d = split[3];
                    return;
                }
                return;
            }
            cancel(false);
        }
    }

    /* renamed from: british.x.t_chat$k */
    class C2258k extends AdColonyInterstitialListener {
        C2258k() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_chat t_chat = t_chat.this;
            if (t_chat.f9184s0) {
                t_chat.abrir_secc(t_chat.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_chat.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_chat.this.f6661g.cancel();
            t_chat t_chat = t_chat.this;
            t_chat.abrir_secc(t_chat.f6660f);
        }
    }

    /* renamed from: british.x.t_chat$k0 */
    private class C2259k0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9267a;

        /* renamed from: b */
        Bitmap f9268b;

        public C2259k0(String str) {
            this.f9267a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/frases/f"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9267a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = ".jpg"
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x006e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ MalformedURLException -> 0x006e }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x006e }
                r2 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r2)     // Catch:{ MalformedURLException -> 0x006e }
                r2 = 60000(0xea60, float:8.4078E-41)
                r0.setReadTimeout(r2)     // Catch:{ MalformedURLException -> 0x006e }
                r0.connect()     // Catch:{ MalformedURLException -> 0x006e }
                java.io.InputStream r2 = r0.getInputStream()     // Catch:{ MalformedURLException -> 0x006e }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ MalformedURLException -> 0x006e }
                r4.f9268b = r3     // Catch:{ MalformedURLException -> 0x006e }
                r2.close()     // Catch:{ MalformedURLException -> 0x006e }
                r0.disconnect()     // Catch:{ MalformedURLException -> 0x006e }
                british.x.t_chat r0 = british.p015x.t_chat.this     // Catch:{ MalformedURLException -> 0x006e }
                british.x.config r0 = r0.f9176o0     // Catch:{ MalformedURLException -> 0x006e }
                british.x.t_chat r2 = british.p015x.t_chat.this     // Catch:{ MalformedURLException -> 0x006e }
                java.lang.String r3 = r4.f9267a     // Catch:{ MalformedURLException -> 0x006e }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ MalformedURLException -> 0x006e }
                java.io.File r0 = r0.mo7518n0(r2, r3, r1)     // Catch:{ MalformedURLException -> 0x006e }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f9268b     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2259k0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                LinearLayout linearLayout = t_chat.this.f9158U0;
                linearLayout.findViewWithTag("pb" + this.f9267a).setVisibility(8);
            } catch (Exception unused) {
            }
            Intent intent = new Intent(t_chat.this, t_url.class);
            intent.putExtra("url", "file://" + t_chat.this.f9176o0.mo7518n0(t_chat.this, Integer.parseInt(this.f9267a), true).getAbsolutePath());
            t_chat.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: british.x.t_chat$l */
    class C2260l implements Runnable {
        C2260l() {
        }

        public void run() {
            t_chat t_chat = t_chat.this;
            t_chat.mo8482R(t_chat.f9174n0.getString("id_remit", ""), t_chat.this.f9174n0.getString("nombre_remit", ""));
        }
    }

    /* renamed from: british.x.t_chat$l0 */
    private class C2261l0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9271a;

        /* renamed from: b */
        String f9272b;

        /* renamed from: c */
        String f9273c = "";

        /* renamed from: d */
        String f9274d;

        public C2261l0(String str, String str2, String str3, String str4) {
            this.f9271a = str;
            this.f9272b = str2;
            if (str3.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                this.f9273c = "mp4";
            } else if (str3.equals("2")) {
                this.f9273c = "3gp";
            } else if (str3.equals("3")) {
                this.f9273c = "webm";
            }
            this.f9274d = str4;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r10) {
            /*
                r9 = this;
                java.lang.String r10 = "."
                java.lang.String r0 = "0"
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00af }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r3 = "https://video.e-droid.net/files/v"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r3 = r9.f9272b     // Catch:{ MalformedURLException -> 0x00af }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r3 = "_"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r3 = r9.f9274d     // Catch:{ MalformedURLException -> 0x00af }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00af }
                r2.append(r10)     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r3 = r9.f9273c     // Catch:{ MalformedURLException -> 0x00af }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00af }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x00af }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x00af }
                r2 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x00a9 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00a9 }
                r3 = 1
                r1.setDoInput(r3)     // Catch:{ Exception -> 0x00a9 }
                r4 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r4)     // Catch:{ Exception -> 0x00a9 }
                r4 = 60000(0xea60, float:8.4078E-41)
                r1.setReadTimeout(r4)     // Catch:{ Exception -> 0x00a9 }
                r1.connect()     // Catch:{ Exception -> 0x00a9 }
                java.io.InputStream r4 = r1.getInputStream()     // Catch:{ Exception -> 0x00a9 }
                british.x.t_chat r5 = british.p015x.t_chat.this     // Catch:{ all -> 0x00a4 }
                british.x.config r5 = r5.f9176o0     // Catch:{ all -> 0x00a4 }
                british.x.t_chat r6 = british.p015x.t_chat.this     // Catch:{ all -> 0x00a4 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
                r7.<init>()     // Catch:{ all -> 0x00a4 }
                java.lang.String r8 = "v"
                r7.append(r8)     // Catch:{ all -> 0x00a4 }
                java.lang.String r8 = r9.f9272b     // Catch:{ all -> 0x00a4 }
                r7.append(r8)     // Catch:{ all -> 0x00a4 }
                r7.append(r10)     // Catch:{ all -> 0x00a4 }
                java.lang.String r10 = r9.f9273c     // Catch:{ all -> 0x00a4 }
                r7.append(r10)     // Catch:{ all -> 0x00a4 }
                java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x00a4 }
                java.io.File r10 = r5.mo7517m0(r6, r10)     // Catch:{ all -> 0x00a4 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a4 }
                r5.<init>(r10)     // Catch:{ all -> 0x00a4 }
                r10 = 4096(0x1000, float:5.74E-42)
                byte[] r10 = new byte[r10]     // Catch:{ all -> 0x0094 }
            L_0x007b:
                int r6 = r4.read(r10)     // Catch:{ all -> 0x0094 }
                r7 = -1
                if (r6 == r7) goto L_0x0086
                r5.write(r10, r2, r6)     // Catch:{ all -> 0x0094 }
                goto L_0x007b
            L_0x0086:
                r5.flush()     // Catch:{ all -> 0x0094 }
                r5.close()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
                r2 = 1
                goto L_0x009d
            L_0x008e:
                r10 = move-exception
                r2 = 1
                goto L_0x00a5
            L_0x0091:
                r10 = move-exception
                r2 = 1
                goto L_0x009a
            L_0x0094:
                r10 = move-exception
                r5.close()     // Catch:{ Exception -> 0x0099 }
                throw r10     // Catch:{ Exception -> 0x0099 }
            L_0x0099:
                r10 = move-exception
            L_0x009a:
                r10.printStackTrace()     // Catch:{ all -> 0x00a4 }
            L_0x009d:
                r4.close()     // Catch:{ Exception -> 0x00a9 }
                r1.disconnect()     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00aa
            L_0x00a4:
                r10 = move-exception
            L_0x00a5:
                r4.close()     // Catch:{ Exception -> 0x00a9 }
                throw r10     // Catch:{ Exception -> 0x00a9 }
            L_0x00a9:
            L_0x00aa:
                if (r2 == 0) goto L_0x00af
                java.lang.String r10 = "1"
                return r10
            L_0x00af:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2261l0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                LinearLayout linearLayout = t_chat.this.f9158U0;
                linearLayout.findViewWithTag("pb" + this.f9271a).setVisibility(8);
            } catch (Exception unused) {
            }
            Intent intent = new Intent(t_chat.this, t_video.class);
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            C1692config i = t_chat.this.f9176o0;
            t_chat t_chat = t_chat.this;
            sb.append(i.mo7517m0(t_chat, "v" + this.f9272b + "." + this.f9273c).getAbsolutePath());
            intent.putExtra("url", sb.toString());
            intent.putExtra("desde_chat", true);
            t_chat.this.startActivityForResult(intent, 0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f9273c.equals("")) {
                cancel(false);
            }
        }
    }

    /* renamed from: british.x.t_chat$m */
    class C2262m implements Runnable {

        /* renamed from: b */
        final /* synthetic */ SharedPreferences f9276b;

        /* renamed from: british.x.t_chat$m$a */
        class C2263a implements View.OnClickListener {
            C2263a() {
            }

            public void onClick(View view) {
                C1692config i = t_chat.this.f9176o0;
                t_chat t_chat = t_chat.this;
                i.mo7489T(t_chat, (ImageView) view, t_chat.f6656b);
            }
        }

        /* renamed from: british.x.t_chat$m$b */
        class C2264b implements View.OnClickListener {
            C2264b() {
            }

            public void onClick(View view) {
                t_chat.this.mo8478J((ImageView) view, (ImageView) ((LinearLayout) view.getParent()).findViewById(R.id.iv_tts_pause));
            }
        }

        /* renamed from: british.x.t_chat$m$c */
        class C2265c implements View.OnClickListener {
            C2265c() {
            }

            public void onClick(View view) {
                t_chat.this.f9164X0.stop();
                view.setVisibility(8);
                ((LinearLayout) view.getParent()).findViewById(R.id.iv_tts).setVisibility(0);
            }
        }

        /* renamed from: british.x.t_chat$m$d */
        class C2266d implements Runnable {
            C2266d() {
            }

            public void run() {
                ((ScrollView) t_chat.this.findViewById(R.id.sv_chat)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        }

        C2262m(SharedPreferences sharedPreferences) {
            this.f9276b = sharedPreferences;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:246:0x0791, code lost:
            if (british.p015x.t_chat.m8720i(r1.f9277c).f7338g2 == 4) goto L_0x083d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x07c0, code lost:
            if (british.p015x.t_chat.m8720i(r1.f9277c).f7338g2 == 4) goto L_0x0804;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x0802, code lost:
            if (british.p015x.t_chat.m8720i(r1.f9277c).f7338g2 == 4) goto L_0x0804;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x0804, code lost:
            r0 = british.p015x.R.drawable.bubble4_flip;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x083b, code lost:
            if (british.p015x.t_chat.m8720i(r1.f9277c).f7338g2 == 4) goto L_0x083d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:279:0x083d, code lost:
            r0 = british.p015x.R.drawable.bubble4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
            if (r1.f9276b.getString("f2_id", "").equals(british.p015x.t_chat.m8726o(r1.f9277c) + "") == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r1.f9276b.getString("f2_id", "").equals(r1.f9276b.getString("f2_idusu_prev", "")) != false) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
            r0 = java.lang.Boolean.TRUE;
         */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0512  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x0538  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x054a  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x0660  */
        /* JADX WARNING: Removed duplicated region for block: B:208:0x066f  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x069e  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0722  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x0867  */
        /* JADX WARNING: Removed duplicated region for block: B:290:0x0893  */
        /* JADX WARNING: Removed duplicated region for block: B:298:0x08ad  */
        /* JADX WARNING: Removed duplicated region for block: B:311:0x0915  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:351:0x0b38  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:415:0x0f3e  */
        /* JADX WARNING: Removed duplicated region for block: B:416:0x0f46  */
        /* JADX WARNING: Removed duplicated region for block: B:423:0x0f8e  */
        /* JADX WARNING: Removed duplicated region for block: B:424:0x0f9d  */
        /* JADX WARNING: Removed duplicated region for block: B:429:0x0fd2  */
        /* JADX WARNING: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x02a7  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x02ae  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x02bb  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x02ee  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x031f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r3 = "f2_ultimas"
                r4 = 0
                boolean r2 = r2.getBoolean(r3, r4)
                java.lang.String r5 = "f2_id"
                java.lang.String r6 = ""
                if (r2 != 0) goto L_0x0034
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_chat r8 = british.p015x.t_chat.this
                java.lang.String r8 = r8.f9121C
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0050
            L_0x0034:
                android.content.SharedPreferences r2 = r1.f9276b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 == 0) goto L_0x0052
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r5, r6)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r8 = "f2_idusu_prev"
                java.lang.String r7 = r7.getString(r8, r6)
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0052
            L_0x0050:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
            L_0x0052:
                r2 = r0
                android.content.SharedPreferences r0 = r1.f9276b
                boolean r0 = r0.getBoolean(r3, r4)
                if (r0 != 0) goto L_0x0066
                british.x.t_chat r0 = british.p015x.t_chat.this
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r7 = r7.getString(r5, r6)
                r0.f9121C = r7
            L_0x0066:
                android.content.SharedPreferences r0 = r1.f9276b
                java.lang.String r0 = r0.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_chat r8 = british.p015x.t_chat.this
                long r8 = r8.f9139L
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r0 = r0.equals(r7)
                r7 = 1
                if (r0 == 0) goto L_0x00b3
                british.x.t_chat r0 = british.p015x.t_chat.this
                r8 = 2131361963(0x7f0a00ab, float:1.8343693E38)
                android.view.View r0 = r0.findViewById(r8)
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x00b1
                android.content.SharedPreferences r0 = r1.f9276b
                boolean r0 = r0.getBoolean(r3, r4)
                if (r0 == 0) goto L_0x00aa
                android.content.SharedPreferences r0 = r1.f9276b
                java.lang.String r8 = "f2_mateixusu_hastafinal"
                boolean r0 = r0.getBoolean(r8, r4)
                if (r0 == 0) goto L_0x00b1
                goto L_0x00b0
            L_0x00aa:
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9123D
                if (r0 != 0) goto L_0x00b1
            L_0x00b0:
                goto L_0x00b7
            L_0x00b1:
                r0 = 1
                goto L_0x00b8
            L_0x00b3:
                british.x.t_chat r0 = british.p015x.t_chat.this
                r0.f9123D = r7
            L_0x00b7:
                r0 = 0
            L_0x00b8:
                android.content.SharedPreferences r8 = r1.f9276b
                boolean r8 = r8.getBoolean(r3, r4)
                if (r8 == 0) goto L_0x00e9
                android.content.SharedPreferences r8 = r1.f9276b
                java.lang.String r9 = "f2_fcrea"
                java.lang.String r8 = r8.getString(r9, r6)
                boolean r9 = r8.equals(r6)
                if (r9 != 0) goto L_0x00e9
                r9 = 6
                java.lang.String r8 = r8.substring(r4, r9)
                british.x.t_chat r9 = british.p015x.t_chat.this
                java.lang.String r9 = r9.f9191w
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x00e9
                british.x.t_chat r9 = british.p015x.t_chat.this
                r9.mo8481P()
                british.x.t_chat r9 = british.p015x.t_chat.this
                r9.f9191w = r8
            L_0x00e9:
                british.x.t_chat r8 = british.p015x.t_chat.this
                java.lang.String r9 = "layout_inflater"
                java.lang.Object r8 = r8.getSystemService(r9)
                android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
                r9 = 2131558520(0x7f0d0078, float:1.8742358E38)
                r10 = 0
                android.view.View r8 = r8.inflate(r9, r10)
                android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
                boolean r9 = r2.booleanValue()
                r10 = 4
                r11 = 8
                r12 = 2131362292(0x7f0a01f4, float:1.834436E38)
                if (r9 == 0) goto L_0x0152
                r9 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r9 = r8.findViewById(r9)
                r9.setVisibility(r10)
                r9 = 2131363190(0x7f0a0576, float:1.8346182E38)
                android.view.View r9 = r8.findViewById(r9)
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                r9.height = r7
                r9 = 2131362327(0x7f0a0217, float:1.8344431E38)
                android.view.View r9 = r8.findViewById(r9)
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                r9.height = r7
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r13 = -2
                r14 = -2
                r9.<init>(r13, r14)
                british.x.t_chat r13 = british.p015x.t_chat.this
                int r13 = r13.f9133I
                r9.setMargins(r13, r4, r13, r4)
                r13 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r13 = r8.findViewById(r13)
                android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
                r13.setLayoutParams(r9)
                r9 = 2131362503(0x7f0a02c7, float:1.8344788E38)
                android.view.View r9 = r8.findViewById(r9)
                r9.setVisibility(r11)
                goto L_0x01c2
            L_0x0152:
                british.x.t_chat r9 = british.p015x.t_chat.this
                int r13 = r9.f9135J
                int r9 = r9.f9137K
                r8.setPadding(r13, r9, r13, r4)
                british.x.t_chat r9 = british.p015x.t_chat.this
                british.x.config r9 = r9.f9176o0
                boolean r9 = r9.f7332f2
                if (r9 == 0) goto L_0x01c2
                android.content.SharedPreferences r9 = r1.f9276b
                java.lang.String r9 = r9.getString(r5, r6)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                british.x.t_chat r14 = british.p015x.t_chat.this
                long r14 = r14.f9139L
                r13.append(r14)
                r13.append(r6)
                java.lang.String r13 = r13.toString()
                boolean r9 = r9.equals(r13)
                if (r9 != 0) goto L_0x01c2
                boolean r9 = r2.booleanValue()
                if (r9 != 0) goto L_0x01c2
                british.x.t_chat r9 = british.p015x.t_chat.this
                boolean r9 = r9.f9196y0
                r13 = 2131362328(0x7f0a0218, float:1.8344433E38)
                if (r9 == 0) goto L_0x01a2
                android.view.View r9 = r8.findViewById(r13)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                int r14 = british.p015x.C1692config.f7101A5
                android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.MULTIPLY
                r9.setColorFilter(r14, r15)
            L_0x01a2:
                android.view.View r9 = r8.findViewById(r13)
                r9.setVisibility(r4)
                android.view.View r9 = r8.findViewById(r13)
                android.content.SharedPreferences r14 = r1.f9276b
                java.lang.String r14 = r14.getString(r5, r6)
                r9.setTag(r12, r14)
                android.view.View r9 = r8.findViewById(r13)
                british.x.t_chat$m$a r13 = new british.x.t_chat$m$a
                r13.<init>()
                r9.setOnClickListener(r13)
            L_0x01c2:
                british.x.t_chat r9 = british.p015x.t_chat.this
                int r9 = r9.f9129G
                if (r9 == 0) goto L_0x01dc
                boolean r9 = r2.booleanValue()
                if (r9 != 0) goto L_0x01dc
                r9 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r9 = r8.findViewById(r9)
                british.x.t_chat r13 = british.p015x.t_chat.this
                int r13 = r13.f9129G
                r9.setMinimumWidth(r13)
            L_0x01dc:
                int r9 = android.os.Build.VERSION.SDK_INT
                r13 = 17
                r14 = 2131363149(0x7f0a054d, float:1.8346099E38)
                r15 = 3
                if (r9 < r13) goto L_0x022f
                british.x.t_chat r13 = british.p015x.t_chat.this
                android.content.res.Resources r13 = r13.getResources()
                r11 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r11 = r13.getBoolean(r11)
                if (r11 == 0) goto L_0x0212
                if (r0 == 0) goto L_0x0207
                r8.setGravity(r15)
                r8.setLayoutDirection(r4)
                android.view.View r11 = r8.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r11.setGravity(r15)
                goto L_0x022f
            L_0x0207:
                android.view.View r11 = r8.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r13 = 5
                r11.setGravity(r13)
                goto L_0x022f
            L_0x0212:
                if (r0 == 0) goto L_0x0226
                r11 = 5
                r8.setGravity(r11)
                r8.setLayoutDirection(r7)
                android.view.View r11 = r8.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r13 = 5
                r11.setGravity(r13)
                goto L_0x022f
            L_0x0226:
                android.view.View r11 = r8.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r11.setGravity(r15)
            L_0x022f:
                r11 = 20
                r13 = 2131362745(0x7f0a03b9, float:1.834528E38)
                r10 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                if (r9 <= r11) goto L_0x0273
                r9 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
                british.x.t_chat r11 = british.p015x.t_chat.this
                java.lang.String r11 = r11.f6656b
                british.p015x.C1692config.m8168S0(r9, r11)
                r9 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
                british.x.t_chat r11 = british.p015x.t_chat.this
                java.lang.String r11 = r11.f6656b
                british.p015x.C1692config.m8168S0(r9, r11)
                android.view.View r9 = r8.findViewById(r10)
                android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
                british.x.t_chat r11 = british.p015x.t_chat.this
                java.lang.String r11 = r11.f6656b
                british.p015x.C1692config.m8168S0(r9, r11)
                android.view.View r9 = r8.findViewById(r13)
                android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
                british.x.t_chat r11 = british.p015x.t_chat.this
                java.lang.String r11 = r11.f6656b
                british.p015x.C1692config.m8168S0(r9, r11)
            L_0x0273:
                r9 = 2131362327(0x7f0a0217, float:1.8344431E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                android.view.View r11 = r8.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r14 = 2131363113(0x7f0a0529, float:1.8346026E38)
                android.view.View r14 = r8.findViewById(r14)
                android.widget.TextView r14 = (android.widget.TextView) r14
                british.x.t_chat r10 = british.p015x.t_chat.this
                java.lang.String r10 = r10.f9187u
                java.lang.String r13 = "FFFFFFFF"
                boolean r10 = r10.equals(r13)
                if (r10 == 0) goto L_0x02ae
                british.x.t_chat r10 = british.p015x.t_chat.this
                java.lang.String r10 = r10.f9189v
                java.lang.String r13 = "FFFFFFFF"
                boolean r10 = r10.equals(r13)
                if (r10 == 0) goto L_0x02ae
                java.lang.String r10 = "#EEEEEE"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x02af
            L_0x02ae:
                r10 = -1
            L_0x02af:
                java.lang.String r13 = "#555555"
                int r13 = android.graphics.Color.parseColor(r13)
                british.x.t_chat r15 = british.p015x.t_chat.this
                boolean r15 = r15.f9196y0
                if (r15 != 0) goto L_0x02c1
                java.lang.String r13 = "#999999"
                int r13 = android.graphics.Color.parseColor(r13)
            L_0x02c1:
                r11.setTextColor(r13)
                r14.setTextColor(r13)
                android.content.SharedPreferences r13 = r1.f9276b
                java.lang.String r13 = r13.getString(r5, r6)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                british.x.t_chat r4 = british.p015x.t_chat.this
                r16 = r8
                long r7 = r4.f9139L
                r15.append(r7)
                r15.append(r6)
                java.lang.String r4 = r15.toString()
                boolean r4 = r13.equals(r4)
                java.lang.String r13 = "1"
                java.lang.String r15 = "0"
                if (r4 == 0) goto L_0x031f
                british.x.t_chat r4 = british.p015x.t_chat.this
                boolean r7 = r4.f9196y0
                if (r7 != 0) goto L_0x02f6
                r7 = -1
                goto L_0x02f8
            L_0x02f6:
                r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            L_0x02f8:
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131821091(0x7f110223, float:1.9274915E38)
                java.lang.String r4 = r4.getString(r8)
                r11.setText(r4)
                british.x.t_chat r4 = british.p015x.t_chat.this
                int r4 = r4.f9153S
                if (r4 <= 0) goto L_0x0317
                british.x.t_chat r4 = british.p015x.t_chat.this
                android.graphics.Bitmap r4 = r4.f9138K0
                if (r4 == 0) goto L_0x0317
                r9.setImageBitmap(r4)
            L_0x0317:
                r19 = r3
                r20 = r15
                r8 = r16
                goto L_0x0717
            L_0x031f:
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r7 = "f2_nombre"
                java.lang.String r4 = r4.getString(r7, r6)
                java.lang.String r4 = r4.trim()
                r11.setText(r4)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r15)
                r8 = r16
                r8.setTag(r12, r4)
                r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_privados"
                java.lang.String r7 = r7.getString(r11, r13)
                r8.setTag(r4, r7)
                r4 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_nombre"
                java.lang.String r7 = r7.getString(r11, r6)
                r8.setTag(r4, r7)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r7 = "f2_coments"
                java.lang.String r4 = r4.getString(r7, r13)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                r8.setTag(r7, r4)
                r4 = 2131362297(0x7f0a01f9, float:1.834437E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_fnac_d"
                java.lang.String r7 = r7.getString(r11, r15)
                r8.setTag(r4, r7)
                r4 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_fnac_m"
                java.lang.String r7 = r7.getString(r11, r15)
                r8.setTag(r4, r7)
                r4 = 2131362299(0x7f0a01fb, float:1.8344375E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_fnac_a"
                java.lang.String r7 = r7.getString(r11, r15)
                r8.setTag(r4, r7)
                r4 = 2131362300(0x7f0a01fc, float:1.8344377E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_sexo"
                java.lang.String r7 = r7.getString(r11, r15)
                r8.setTag(r4, r7)
                r4 = 2131362301(0x7f0a01fd, float:1.8344379E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_vfoto"
                java.lang.String r7 = r7.getString(r11, r15)
                r8.setTag(r4, r7)
                british.x.t_chat r4 = british.p015x.t_chat.this
                android.content.SharedPreferences r4 = r4.f9172m0
                java.lang.String r7 = "idprivado"
                java.lang.String r4 = r4.getString(r7, r15)
                boolean r4 = r4.equals(r15)
                if (r4 != 0) goto L_0x03c9
                r4 = 2131362293(0x7f0a01f5, float:1.8344362E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r11 = "f2_desdepriv"
                java.lang.String r7 = r7.getString(r11, r13)
                r8.setTag(r4, r7)
            L_0x03c9:
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x03da
                british.x.t_chat r4 = british.p015x.t_chat.this
                r8.setOnClickListener(r4)
            L_0x03da:
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                int r7 = r4.length()
                r11 = 1
                int r7 = r7 - r11
                int r11 = r4.length()
                java.lang.String r7 = r4.substring(r7, r11)
                boolean r11 = r4.equals(r13)
                if (r11 == 0) goto L_0x03f5
                r7 = r15
            L_0x03f5:
                british.x.t_chat r11 = british.p015x.t_chat.this
                boolean r11 = r11.f9196y0
                if (r11 == 0) goto L_0x0492
                boolean r11 = r7.equals(r15)
                if (r11 != 0) goto L_0x0484
                java.lang.String r11 = "5"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x040b
                goto L_0x0484
            L_0x040b:
                boolean r11 = r7.equals(r13)
                if (r11 != 0) goto L_0x0476
                java.lang.String r11 = "6"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x041a
                goto L_0x0476
            L_0x041a:
                java.lang.String r11 = "2"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x0468
                java.lang.String r11 = "7"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x042b
                goto L_0x0468
            L_0x042b:
                java.lang.String r11 = "3"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x045a
                java.lang.String r11 = "8"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x043c
                goto L_0x045a
            L_0x043c:
                java.lang.String r11 = "4"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x044c
                java.lang.String r11 = "9"
                boolean r7 = r7.equals(r11)
                if (r7 == 0) goto L_0x04e3
            L_0x044c:
                java.lang.String r7 = "#FFCC0000"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.String r10 = "#FFFFDFDF"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x0508
            L_0x045a:
                java.lang.String r7 = "#FF9E5400"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.String r10 = "#FFFFF0DF"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x0508
            L_0x0468:
                java.lang.String r7 = "#FF3D5C00"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.String r10 = "#FFF4FFDF"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x0508
            L_0x0476:
                java.lang.String r7 = "#FF9933CC"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.String r10 = "#FFF2E6F9"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x0508
            L_0x0484:
                java.lang.String r7 = "#FF00698C"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.String r10 = "#FFDFF8FF"
                int r10 = android.graphics.Color.parseColor(r10)
                goto L_0x0508
            L_0x0492:
                boolean r11 = r7.equals(r15)
                if (r11 != 0) goto L_0x0502
                java.lang.String r11 = "5"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x04a1
                goto L_0x0502
            L_0x04a1:
                boolean r11 = r7.equals(r13)
                if (r11 != 0) goto L_0x04fb
                java.lang.String r11 = "6"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x04b0
                goto L_0x04fb
            L_0x04b0:
                java.lang.String r11 = "2"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x04f4
                java.lang.String r11 = "7"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x04c1
                goto L_0x04f4
            L_0x04c1:
                java.lang.String r11 = "3"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x04ed
                java.lang.String r11 = "8"
                boolean r11 = r7.equals(r11)
                if (r11 == 0) goto L_0x04d2
                goto L_0x04ed
            L_0x04d2:
                java.lang.String r11 = "4"
                boolean r11 = r7.equals(r11)
                if (r11 != 0) goto L_0x04e6
                java.lang.String r11 = "9"
                boolean r7 = r7.equals(r11)
                if (r7 == 0) goto L_0x04e3
                goto L_0x04e6
            L_0x04e3:
                r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0508
            L_0x04e6:
                java.lang.String r7 = "#FF33FFFF"
                int r7 = android.graphics.Color.parseColor(r7)
                goto L_0x0508
            L_0x04ed:
                java.lang.String r7 = "#FF87BFFF"
                int r7 = android.graphics.Color.parseColor(r7)
                goto L_0x0508
            L_0x04f4:
                java.lang.String r7 = "#FFC9ADFF"
                int r7 = android.graphics.Color.parseColor(r7)
                goto L_0x0508
            L_0x04fb:
                java.lang.String r7 = "#FF66CC33"
                int r7 = android.graphics.Color.parseColor(r7)
                goto L_0x0508
            L_0x0502:
                java.lang.String r7 = "#FFFF6633"
                int r7 = android.graphics.Color.parseColor(r7)
            L_0x0508:
                british.x.t_chat r11 = british.p015x.t_chat.this
                british.x.config r11 = r11.f9176o0
                boolean r11 = r11.f7297Z1
                if (r11 != 0) goto L_0x051c
                british.x.t_chat r7 = british.p015x.t_chat.this
                boolean r7 = r7.f9196y0
                if (r7 == 0) goto L_0x051b
                r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x051c
            L_0x051b:
                r7 = -1
            L_0x051c:
                android.content.SharedPreferences r11 = r1.f9276b
                java.lang.String r12 = "f2_vfoto"
                java.lang.String r11 = r11.getString(r12, r15)
                british.x.t_chat r12 = british.p015x.t_chat.this
                int r12 = r12.f9153S
                if (r12 <= 0) goto L_0x054a
                android.content.SharedPreferences r12 = r1.f9276b
                java.lang.String r12 = r12.getString(r5, r6)
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L_0x054a
                british.x.t_chat r4 = british.p015x.t_chat.this
                android.content.res.Resources r4 = r4.getResources()
                r11 = 2131230865(0x7f080091, float:1.8077795E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r11)
                r9.setImageDrawable(r4)
                goto L_0x070b
            L_0x054a:
                british.x.t_chat r12 = british.p015x.t_chat.this
                int r12 = r12.f9153S
                if (r12 <= 0) goto L_0x0581
                boolean r12 = r11.equals(r15)
                if (r12 == 0) goto L_0x0581
                british.x.t_chat r4 = british.p015x.t_chat.this
                boolean r11 = r4.f9196y0
                if (r11 == 0) goto L_0x056d
                android.content.res.Resources r4 = r4.getResources()
                r11 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r11)
                r9.setImageDrawable(r4)
                goto L_0x057b
            L_0x056d:
                android.content.res.Resources r4 = r4.getResources()
                r11 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r11)
                r9.setImageDrawable(r4)
            L_0x057b:
                r4 = 0
                r9.setVisibility(r4)
                goto L_0x070b
            L_0x0581:
                british.x.t_chat r12 = british.p015x.t_chat.this
                int r12 = r12.f9153S
                if (r12 <= 0) goto L_0x070b
                boolean r12 = r11.equals(r15)
                if (r12 != 0) goto L_0x070b
                british.x.t_chat r12 = british.p015x.t_chat.this
                java.util.Map<java.lang.String, android.graphics.Bitmap> r12 = r12.f9140L0
                java.lang.Object r12 = r12.get(r4)
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
                if (r12 == 0) goto L_0x05a8
                r9.setImageBitmap(r12)
                r19 = r3
                r17 = r7
                r18 = r10
                r20 = r15
                goto L_0x0681
            L_0x05a8:
                java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0652 }
                r17 = r7
                british.x.t_chat r7 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x064f }
                java.io.File r7 = r7.f9146O0     // Catch:{ Exception -> 0x064f }
                r18 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x064c }
                r10.<init>()     // Catch:{ Exception -> 0x064c }
                r19 = r3
                java.lang.String r3 = "fperfil_"
                r10.append(r3)     // Catch:{ Exception -> 0x0658 }
                r10.append(r4)     // Catch:{ Exception -> 0x0658 }
                java.lang.String r3 = ".jpg"
                r10.append(r3)     // Catch:{ Exception -> 0x0658 }
                java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0658 }
                r12.<init>(r7, r3)     // Catch:{ Exception -> 0x0658 }
                android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0658 }
                r3.<init>()     // Catch:{ Exception -> 0x0658 }
                r7 = 1
                r3.inJustDecodeBounds = r7     // Catch:{ Exception -> 0x0658 }
                java.lang.String r7 = r12.getPath()     // Catch:{ Exception -> 0x0658 }
                android.graphics.BitmapFactory.decodeFile(r7, r3)     // Catch:{ Exception -> 0x0658 }
                r7 = 1111490560(0x42400000, float:48.0)
                british.x.t_chat r10 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x0658 }
                android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0658 }
                android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ Exception -> 0x0658 }
                float r10 = r10.density     // Catch:{ Exception -> 0x0658 }
                float r10 = r10 * r7
                r7 = 1056964608(0x3f000000, float:0.5)
                float r10 = r10 + r7
                int r7 = (int) r10     // Catch:{ Exception -> 0x0658 }
                british.x.t_chat r10 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x0658 }
                android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0658 }
                android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ Exception -> 0x0658 }
                float r10 = r10.density     // Catch:{ Exception -> 0x0658 }
                r20 = 1111490560(0x42400000, float:48.0)
                float r10 = r10 * r20
                r20 = 1056964608(0x3f000000, float:0.5)
                float r10 = r10 + r20
                int r10 = (int) r10
                r20 = r15
                int r15 = r3.outWidth     // Catch:{ Exception -> 0x064a }
                int r3 = r3.outHeight     // Catch:{ Exception -> 0x064a }
                if (r15 > r7) goto L_0x0612
                if (r3 > r10) goto L_0x0612
                r21 = 1
                goto L_0x0614
            L_0x0612:
                r21 = 0
            L_0x0614:
                if (r21 != 0) goto L_0x0631
                int r3 = british.p015x.C1692config.m8193n(r15, r3, r7, r10)     // Catch:{ Exception -> 0x064a }
                float r7 = (float) r15     // Catch:{ Exception -> 0x064a }
                float r3 = (float) r3     // Catch:{ Exception -> 0x064a }
                float r7 = r7 / r3
                int r3 = java.lang.Math.round(r7)     // Catch:{ Exception -> 0x064a }
                android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x064a }
                r7.<init>()     // Catch:{ Exception -> 0x064a }
                r7.inSampleSize = r3     // Catch:{ Exception -> 0x064a }
                java.lang.String r3 = r12.getPath()     // Catch:{ Exception -> 0x064a }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r7)     // Catch:{ Exception -> 0x064a }
                goto L_0x063f
            L_0x0631:
                british.x.t_chat r3 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x064a }
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x064a }
                android.net.Uri r7 = android.net.Uri.fromFile(r12)     // Catch:{ Exception -> 0x064a }
                android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r3, r7)     // Catch:{ Exception -> 0x064a }
            L_0x063f:
                r9.setImageBitmap(r3)     // Catch:{ Exception -> 0x064a }
                british.x.t_chat r7 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x064a }
                java.util.Map<java.lang.String, android.graphics.Bitmap> r7 = r7.f9140L0     // Catch:{ Exception -> 0x064a }
                r7.put(r4, r3)     // Catch:{ Exception -> 0x064a }
                goto L_0x0681
            L_0x064a:
                goto L_0x065a
            L_0x064c:
                r19 = r3
                goto L_0x0658
            L_0x064f:
                r19 = r3
                goto L_0x0656
            L_0x0652:
                r19 = r3
                r17 = r7
            L_0x0656:
                r18 = r10
            L_0x0658:
                r20 = r15
            L_0x065a:
                british.x.t_chat r3 = british.p015x.t_chat.this
                boolean r7 = r3.f9196y0
                if (r7 == 0) goto L_0x066f
                android.content.res.Resources r3 = r3.getResources()
                r7 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)
                r9.setImageDrawable(r3)
                goto L_0x067d
            L_0x066f:
                android.content.res.Resources r3 = r3.getResources()
                r7 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)
                r9.setImageDrawable(r3)
            L_0x067d:
                r3 = 0
                r9.setVisibility(r3)
            L_0x0681:
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "fperfil_"
                r7.append(r10)
                r7.append(r4)
                java.lang.String r7 = r7.toString()
                java.lang.String r3 = r3.getString(r7, r6)
                boolean r3 = r3.equals(r11)
                if (r3 != 0) goto L_0x0713
                british.x.t_chat r3 = british.p015x.t_chat.this
                boolean r3 = r3.f9194x0
                if (r3 == 0) goto L_0x06b0
                r3 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r3 = r8.findViewById(r3)
                r7 = 0
                r3.setVisibility(r7)
                goto L_0x06bb
            L_0x06b0:
                r7 = 0
                r3 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r3 = r8.findViewById(r3)
                r3.setVisibility(r7)
            L_0x06bb:
                british.x.t_chat r3 = british.p015x.t_chat.this
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f9142M0
                boolean r3 = r3.containsKey(r4)
                if (r3 != 0) goto L_0x0713
                british.x.t_chat r3 = british.p015x.t_chat.this
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f9144N0
                boolean r3 = r3.containsKey(r4)
                if (r3 == 0) goto L_0x06df
                british.x.t_chat r3 = british.p015x.t_chat.this
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f9144N0
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r3.equals(r11)
                if (r3 != 0) goto L_0x0713
            L_0x06df:
                british.x.t_chat r3 = british.p015x.t_chat.this
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f9142M0
                r3.put(r4, r11)
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.t_chat$i0 r3 = r3.f9148P0
                if (r3 == 0) goto L_0x06f4
                android.os.AsyncTask$Status r3 = r3.getStatus()
                android.os.AsyncTask$Status r4 = android.os.AsyncTask.Status.RUNNING
                if (r3 == r4) goto L_0x0713
            L_0x06f4:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.t_chat$i0 r4 = new british.x.t_chat$i0
                british.x.t_chat r7 = british.p015x.t_chat.this
                r10 = 0
                r4.<init>()
                r3.f9148P0 = r4
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.t_chat$i0 r3 = r3.f9148P0
                r4 = 0
                java.lang.String[] r7 = new java.lang.String[r4]
                r3.execute(r7)
                goto L_0x0713
            L_0x070b:
                r19 = r3
                r17 = r7
                r18 = r10
                r20 = r15
            L_0x0713:
                r7 = r17
                r10 = r18
            L_0x0717:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r4 = 2
                if (r3 <= 0) goto L_0x0859
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                java.lang.String r3 = r3.f7356j2
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto L_0x074d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r10 = "#"
                r3.append(r10)
                british.x.t_chat r10 = british.p015x.t_chat.this
                british.x.config r10 = r10.f9176o0
                java.lang.String r10 = r10.f7356j2
                r3.append(r10)
                java.lang.String r3 = r3.toString()
                int r10 = android.graphics.Color.parseColor(r3)
            L_0x074d:
                int r3 = android.os.Build.VERSION.SDK_INT
                r11 = 17
                if (r3 < r11) goto L_0x07c3
                if (r0 == 0) goto L_0x07c3
                british.x.t_chat r0 = british.p015x.t_chat.this
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r0 = r0.getBoolean(r3)
                if (r0 == 0) goto L_0x0795
                boolean r0 = r2.booleanValue()
                if (r0 == 0) goto L_0x076c
                goto L_0x080e
            L_0x076c:
                r0 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                if (r3 != r4) goto L_0x077b
                goto L_0x081f
            L_0x077b:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 3
                if (r3 != r11) goto L_0x0788
                goto L_0x082e
            L_0x0788:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 4
                if (r3 != r11) goto L_0x0840
                goto L_0x083d
            L_0x0795:
                boolean r0 = r2.booleanValue()
                if (r0 == 0) goto L_0x079d
                goto L_0x080e
            L_0x079d:
                r0 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                if (r3 != r4) goto L_0x07ab
                goto L_0x07e6
            L_0x07ab:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 3
                if (r3 != r11) goto L_0x07b7
                goto L_0x07f5
            L_0x07b7:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 4
                if (r3 != r11) goto L_0x0840
                goto L_0x0804
            L_0x07c3:
                british.x.t_chat r0 = british.p015x.t_chat.this
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r0 = r0.getBoolean(r3)
                if (r0 == 0) goto L_0x0808
                boolean r0 = r2.booleanValue()
                if (r0 == 0) goto L_0x07d9
                goto L_0x080e
            L_0x07d9:
                r0 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                if (r3 != r4) goto L_0x07ea
            L_0x07e6:
                r0 = 2131230885(0x7f0800a5, float:1.8077835E38)
                goto L_0x0840
            L_0x07ea:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 3
                if (r3 != r11) goto L_0x07f9
            L_0x07f5:
                r0 = 2131230887(0x7f0800a7, float:1.807784E38)
                goto L_0x0840
            L_0x07f9:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 4
                if (r3 != r11) goto L_0x0840
            L_0x0804:
                r0 = 2131230889(0x7f0800a9, float:1.8077844E38)
                goto L_0x0840
            L_0x0808:
                boolean r0 = r2.booleanValue()
                if (r0 == 0) goto L_0x0812
            L_0x080e:
                r0 = 2131230891(0x7f0800ab, float:1.8077848E38)
                goto L_0x0840
            L_0x0812:
                r0 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                if (r3 != r4) goto L_0x0823
            L_0x081f:
                r0 = 2131230884(0x7f0800a4, float:1.8077833E38)
                goto L_0x0840
            L_0x0823:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 3
                if (r3 != r11) goto L_0x0832
            L_0x082e:
                r0 = 2131230886(0x7f0800a6, float:1.8077837E38)
                goto L_0x0840
            L_0x0832:
                british.x.t_chat r3 = british.p015x.t_chat.this
                british.x.config r3 = r3.f9176o0
                int r3 = r3.f7338g2
                r11 = 4
                if (r3 != r11) goto L_0x0840
            L_0x083d:
                r0 = 2131230888(0x7f0800a8, float:1.8077841E38)
            L_0x0840:
                british.x.t_chat r3 = british.p015x.t_chat.this
                android.content.res.Resources r3 = r3.getResources()
                android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
                android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
                r0.setColorFilter(r10, r3)
                r3 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r3 = r8.findViewById(r3)
                r3.setBackgroundDrawable(r0)
            L_0x0859:
                android.content.SharedPreferences r0 = r1.f9276b
                java.lang.String r3 = "f2_fcrea"
                java.lang.String r0 = r0.getString(r3, r6)
                boolean r3 = r0.equals(r6)
                if (r3 != 0) goto L_0x088b
                r3 = 6
                r10 = 10
                java.lang.String r0 = r0.substring(r3, r10)
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
                java.lang.String r10 = "HHmm"
                r3.<init>(r10)
                java.util.Date r0 = r3.parse(r0)     // Catch:{ Exception -> 0x0887 }
                british.x.t_chat r3 = british.p015x.t_chat.this     // Catch:{ Exception -> 0x0887 }
                java.text.DateFormat r3 = android.text.format.DateFormat.getTimeFormat(r3)     // Catch:{ Exception -> 0x0887 }
                java.lang.String r0 = r3.format(r0)     // Catch:{ Exception -> 0x0887 }
                r14.setText(r0)     // Catch:{ Exception -> 0x0887 }
                goto L_0x088b
            L_0x0887:
                r0 = move-exception
                r0.printStackTrace()
            L_0x088b:
                british.x.t_chat r0 = british.p015x.t_chat.this
                int r0 = r0.f9153S
                if (r0 <= 0) goto L_0x08ad
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.config r0 = r0.f9176o0
                boolean r0 = r0.f7297Z1
                if (r0 == 0) goto L_0x089f
                r0 = r7
                goto L_0x08a9
            L_0x089f:
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9194x0
                if (r0 == 0) goto L_0x08a8
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x08a9
            L_0x08a8:
                r0 = -1
            L_0x08a9:
                r9.setBackgroundColor(r0)
                goto L_0x08f2
            L_0x08ad:
                r3 = 8
                r9.setVisibility(r3)
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.config r0 = r0.f9176o0
                int r0 = r0.f7338g2
                if (r0 <= 0) goto L_0x08c7
                r0 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r0 = r8.findViewById(r0)
                r0.setVisibility(r3)
                goto L_0x08f2
            L_0x08c7:
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.config r0 = r0.f9176o0
                boolean r0 = r0.f7297Z1
                if (r0 == 0) goto L_0x08d3
                r0 = r7
                goto L_0x08dd
            L_0x08d3:
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9194x0
                if (r0 == 0) goto L_0x08dc
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x08dd
            L_0x08dc:
                r0 = -1
            L_0x08dd:
                r3 = 2131363190(0x7f0a0576, float:1.8346182E38)
                android.view.View r3 = r8.findViewById(r3)
                r3.setBackgroundColor(r0)
                r0 = 2131363190(0x7f0a0576, float:1.8346182E38)
                android.view.View r0 = r8.findViewById(r0)
                r3 = 0
                r0.setVisibility(r3)
            L_0x08f2:
                r0 = 2131363120(0x7f0a0530, float:1.834604E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.String r9 = "f2_frase"
                java.lang.String r3 = r3.getString(r9, r6)
                android.content.SharedPreferences r9 = r1.f9276b
                java.lang.String r10 = "f2_tipo"
                java.lang.String r9 = r9.getString(r10, r6)
                boolean r9 = r9.equals(r13)
                boolean r10 = r3.equals(r6)
                if (r10 != 0) goto L_0x0b38
                int r10 = r3.length()
                r11 = 14
                if (r10 <= r11) goto L_0x09c5
                r10 = 14
                r11 = 0
                java.lang.String r10 = r3.substring(r11, r10)
                java.lang.String r11 = "@@idfoto_temp:"
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x09c5
                java.lang.String r2 = "@@"
                int r2 = r3.indexOf(r2, r4)
                r7 = 14
                java.lang.String r2 = r3.substring(r7, r2)
                r3 = 8
                r0.setVisibility(r3)
                r0 = 2131362371(0x7f0a0243, float:1.834452E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                if (r9 == 0) goto L_0x095b
                r3 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r3, r13)
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.String r3 = r3.getString(r5, r6)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                r0.setTag(r7, r3)
                goto L_0x0963
            L_0x095b:
                r10 = r20
                r3 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r3, r10)
            L_0x0963:
                r3 = 2131361808(0x7f0a0010, float:1.8343379E38)
                r7 = 1
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r0.setTag(r3, r9)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r9 = "imgtemp"
                r3.append(r9)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                r0.setTag(r3)
                british.x.t_chat r3 = british.p015x.t_chat.this
                int r9 = java.lang.Integer.parseInt(r2)
                r3.m8708Q(r9, r7, r0)
                r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
                android.view.View r0 = r8.findViewById(r0)
                r3 = 0
                r0.setVisibility(r3)
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9194x0
                if (r0 == 0) goto L_0x09ae
                r7 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r0 = r8.findViewById(r7)
                r0.setVisibility(r3)
                android.view.View r0 = r8.findViewById(r7)
                r0.setTag(r2)
                goto L_0x09bf
            L_0x09ae:
                r7 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r0 = r8.findViewById(r7)
                r0.setVisibility(r3)
                android.view.View r0 = r8.findViewById(r7)
                r0.setTag(r2)
            L_0x09bf:
                r11 = r19
                r0 = 1
                r2 = 0
                goto L_0x0f2d
            L_0x09c5:
                british.x.t_chat r9 = british.p015x.t_chat.this
                java.lang.CharSequence r9 = british.p015x.t_chat.m8702G(r9, r3)
                british.x.t_chat r10 = british.p015x.t_chat.this
                british.x.config r10 = r10.f9176o0
                boolean r10 = r10.f7273V1
                if (r10 == 0) goto L_0x09e2
                british.x.t_chat r10 = british.p015x.t_chat.this
                boolean r10 = r10.f9126E0
                if (r10 != 0) goto L_0x09e2
                r10 = 1
                r0.setAutoLinkMask(r10)
                r0.setLinkTextColor(r7)
            L_0x09e2:
                r0.setText(r9)
                r0.setTextColor(r7)
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.config r0 = r0.f9176o0
                boolean r0 = r0.f7326e2
                if (r0 == 0) goto L_0x0b35
                android.content.SharedPreferences r0 = r1.f9276b
                java.lang.String r0 = r0.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_chat r9 = british.p015x.t_chat.this
                long r9 = r9.f9139L
                r7.append(r9)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r0 = r0.equals(r7)
                if (r0 != 0) goto L_0x0b35
                british.x.t_chat r0 = british.p015x.t_chat.this
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r3)
                java.lang.String r9 = " "
                r7.append(r9)
                british.x.t_chat r9 = british.p015x.t_chat.this
                java.lang.String r9 = r9.f9169a1
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                r0.f9169a1 = r7
                boolean r0 = r2.booleanValue()
                if (r0 != 0) goto L_0x0ae7
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9196y0
                r2 = 2131362415(0x7f0a026f, float:1.834461E38)
                if (r0 == 0) goto L_0x0a59
                android.view.View r0 = r8.findViewById(r2)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                int r7 = british.p015x.C1692config.f7101A5
                android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
                r0.setColorFilter(r7, r9)
                r0 = 2131362416(0x7f0a0270, float:1.8344612E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
                r0.setColorFilter(r7, r9)
            L_0x0a59:
                r0 = 2131362539(0x7f0a02eb, float:1.8344861E38)
                android.view.View r0 = r8.findViewById(r0)
                r7 = 0
                r0.setVisibility(r7)
                android.content.SharedPreferences r0 = r1.f9276b
                r11 = r19
                boolean r0 = r0.getBoolean(r11, r7)
                if (r0 == 0) goto L_0x0a81
                android.view.View r0 = r8.findViewById(r2)
                british.x.t_chat r7 = british.p015x.t_chat.this
                java.lang.String r7 = r7.f9169a1
                r9 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r9, r7)
                british.x.t_chat r0 = british.p015x.t_chat.this
                r0.f9169a1 = r6
                goto L_0x0a8b
            L_0x0a81:
                r9 = 2131362292(0x7f0a01f4, float:1.834436E38)
                android.view.View r0 = r8.findViewById(r2)
                r0.setTag(r9, r3)
            L_0x0a8b:
                british.x.t_chat r0 = british.p015x.t_chat.this
                int r7 = r0.f9168Z0
                r9 = 1
                int r7 = r7 + r9
                r0.f9168Z0 = r7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = "m"
                r0.append(r7)
                british.x.t_chat r7 = british.p015x.t_chat.this
                int r7 = r7.f9168Z0
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                android.view.View r7 = r8.findViewById(r2)
                r7.setTag(r0)
                android.view.View r2 = r8.findViewById(r2)
                british.x.t_chat$m$b r7 = new british.x.t_chat$m$b
                r7.<init>()
                r2.setOnClickListener(r7)
                r2 = 2131362416(0x7f0a0270, float:1.8344612E38)
                android.view.View r2 = r8.findViewById(r2)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                java.lang.String r0 = "_pause"
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                r2.setTag(r0)
                r0 = 2131362416(0x7f0a0270, float:1.8344612E38)
                android.view.View r0 = r8.findViewById(r0)
                british.x.t_chat$m$c r2 = new british.x.t_chat$m$c
                r2.<init>()
                r0.setOnClickListener(r2)
                r0 = 1
                goto L_0x0aea
            L_0x0ae7:
                r11 = r19
                r0 = 0
            L_0x0aea:
                if (r0 != 0) goto L_0x0b59
                android.content.SharedPreferences r0 = r1.f9276b
                r2 = 0
                boolean r0 = r0.getBoolean(r11, r2)
                if (r0 != 0) goto L_0x0b59
                british.x.t_chat r0 = british.p015x.t_chat.this
                android.widget.LinearLayout r0 = r0.f9158U0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "m"
                r2.append(r7)
                british.x.t_chat r7 = british.p015x.t_chat.this
                int r7 = r7.f9168Z0
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                android.view.View r0 = r0.findViewWithTag(r2)
                if (r0 == 0) goto L_0x0b59
                r2 = 2131362292(0x7f0a01f4, float:1.834436E38)
                java.lang.Object r7 = r0.getTag(r2)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = " "
                r9.append(r7)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                r0.setTag(r2, r3)
                goto L_0x0b59
            L_0x0b35:
                r11 = r19
                goto L_0x0b59
            L_0x0b38:
                r11 = r19
                r10 = r20
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r3 = "f2_b64"
                java.lang.String r2 = r2.getString(r3, r6)
                java.lang.String r3 = "es_ad"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0b5c
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.config r0 = r0.f9176o0
                british.x.t_chat r2 = british.p015x.t_chat.this
                int r2 = r2.f9131H
                r0.mo7480F0(r8, r7, r2)
            L_0x0b59:
                r2 = 0
                goto L_0x0f2c
            L_0x0b5c:
                java.lang.String r2 = "pb"
                java.lang.String r3 = "f2_idfrase"
                if (r9 != 0) goto L_0x0b70
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r12 = "f2_b64"
                java.lang.String r7 = r7.getString(r12, r6)
                boolean r7 = r7.equals(r6)
                if (r7 == 0) goto L_0x0b80
            L_0x0b70:
                if (r9 == 0) goto L_0x0c83
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r12 = "f2_b64_th"
                java.lang.String r7 = r7.getString(r12, r6)
                boolean r7 = r7.equals(r6)
                if (r7 != 0) goto L_0x0c83
            L_0x0b80:
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r12 = "f2_b64"
                java.lang.String r7 = r7.getString(r12, r6)
                if (r9 == 0) goto L_0x0b92
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r12 = "f2_b64_th"
                java.lang.String r7 = r7.getString(r12, r6)
            L_0x0b92:
                r12 = 0
                byte[] r7 = android.util.Base64.decode(r7, r12)
                int r14 = r7.length
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r12, r14)
                british.x.t_chat r14 = british.p015x.t_chat.this
                british.x.config r14 = r14.f9176o0
                british.x.t_chat r15 = british.p015x.t_chat.this
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r3, r6)
                int r4 = java.lang.Integer.parseInt(r4)
                java.io.File r4 = r14.mo7518n0(r15, r4, r12)
                java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0bbe }
                r12.<init>(r4)     // Catch:{ Exception -> 0x0bbe }
                android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0bbe }
                r14 = 100
                r7.compress(r4, r14, r12)     // Catch:{ Exception -> 0x0bbe }
            L_0x0bbe:
                r4 = 8
                r0.setVisibility(r4)
                r0 = 2131362371(0x7f0a0243, float:1.834452E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "img"
                r4.append(r7)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r7 = r7.getString(r3, r6)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r0.setTag(r4)
                if (r9 == 0) goto L_0x0c17
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r13)
                r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r9 = "f2_idvideo"
                java.lang.String r7 = r7.getString(r9, r6)
                r0.setTag(r4, r7)
                r4 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r9 = "f2_formato"
                java.lang.String r7 = r7.getString(r9, r6)
                r0.setTag(r4, r7)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                r0.setTag(r7, r4)
                goto L_0x0c1d
            L_0x0c17:
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r10)
            L_0x0c1d:
                british.x.t_chat r4 = british.p015x.t_chat.this
                boolean r4 = r4.f9194x0
                if (r4 == 0) goto L_0x0c43
                r4 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r4 = r8.findViewById(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r4.setTag(r2)
                goto L_0x0c62
            L_0x0c43:
                r4 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r4 = r8.findViewById(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r4.setTag(r2)
            L_0x0c62:
                british.x.t_chat r2 = british.p015x.t_chat.this
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r3 = r4.getString(r3, r6)
                int r3 = java.lang.Integer.parseInt(r3)
                r4 = 0
                r2.m8708Q(r3, r4, r0)
                british.x.t_chat r2 = british.p015x.t_chat.this
                r0.setOnClickListener(r2)
                r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
                android.view.View r0 = r8.findViewById(r0)
                r0.setVisibility(r4)
                goto L_0x0b59
            L_0x0c83:
                r4 = 0
                british.x.t_chat r7 = british.p015x.t_chat.this
                british.x.config r7 = r7.f9176o0
                british.x.t_chat r12 = british.p015x.t_chat.this
                android.content.SharedPreferences r14 = r1.f9276b
                java.lang.String r14 = r14.getString(r3, r6)
                int r14 = java.lang.Integer.parseInt(r14)
                java.io.File r7 = r7.mo7518n0(r12, r14, r4)
                boolean r4 = r7.exists()
                if (r4 == 0) goto L_0x0d91
                r4 = 8
                r0.setVisibility(r4)
                r0 = 2131362371(0x7f0a0243, float:1.834452E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "img"
                r4.append(r7)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r7 = r7.getString(r3, r6)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r0.setTag(r4)
                if (r9 == 0) goto L_0x0cf9
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r13)
                r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r9 = "f2_idvideo"
                java.lang.String r7 = r7.getString(r9, r6)
                r0.setTag(r4, r7)
                r4 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r9 = "f2_formato"
                java.lang.String r7 = r7.getString(r9, r6)
                r0.setTag(r4, r7)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                r0.setTag(r7, r4)
                goto L_0x0cff
            L_0x0cf9:
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r10)
            L_0x0cff:
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_chat r9 = british.p015x.t_chat.this
                long r9 = r9.f9139L
                r7.append(r9)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L_0x0d2b
                r4 = 2131361808(0x7f0a0010, float:1.8343379E38)
                r7 = 1
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r0.setTag(r4, r9)
            L_0x0d2b:
                british.x.t_chat r4 = british.p015x.t_chat.this
                boolean r4 = r4.f9194x0
                if (r4 == 0) goto L_0x0d51
                r4 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r4 = r8.findViewById(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r4.setTag(r2)
                goto L_0x0d70
            L_0x0d51:
                r4 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r4 = r8.findViewById(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r4.setTag(r2)
            L_0x0d70:
                british.x.t_chat r2 = british.p015x.t_chat.this
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r3 = r4.getString(r3, r6)
                int r3 = java.lang.Integer.parseInt(r3)
                r4 = 0
                r2.m8708Q(r3, r4, r0)
                british.x.t_chat r2 = british.p015x.t_chat.this
                r0.setOnClickListener(r2)
                r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
                android.view.View r0 = r8.findViewById(r0)
                r0.setVisibility(r4)
                goto L_0x0b59
            L_0x0d91:
                r4 = 8
                r0.setVisibility(r4)
                r0 = 2131362371(0x7f0a0243, float:1.834452E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "img"
                r4.append(r7)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r7 = r7.getString(r3, r6)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r0.setTag(r4)
                if (r9 == 0) goto L_0x0dea
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r13)
                r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r10 = "f2_idvideo"
                java.lang.String r7 = r7.getString(r10, r6)
                r0.setTag(r4, r7)
                r4 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r7 = r1.f9276b
                java.lang.String r10 = "f2_formato"
                java.lang.String r7 = r7.getString(r10, r6)
                r0.setTag(r4, r7)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                r0.setTag(r7, r4)
                goto L_0x0df0
            L_0x0dea:
                r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
                r0.setTag(r4, r10)
            L_0x0df0:
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r4 = r4.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_chat r10 = british.p015x.t_chat.this
                long r12 = r10.f9139L
                r7.append(r12)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L_0x0e1c
                r4 = 2131361808(0x7f0a0010, float:1.8343379E38)
                r7 = 1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                r0.setTag(r4, r10)
            L_0x0e1c:
                r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
                android.view.View r0 = r8.findViewById(r0)
                r4 = 0
                r0.setVisibility(r4)
                british.x.t_chat r0 = british.p015x.t_chat.this
                boolean r0 = r0.f9194x0
                if (r0 == 0) goto L_0x0e54
                r7 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r0 = r8.findViewById(r7)
                r0.setVisibility(r4)
                android.view.View r0 = r8.findViewById(r7)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.setTag(r2)
                goto L_0x0e7b
            L_0x0e54:
                r4 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r0 = r8.findViewById(r4)
                r7 = 0
                r0.setVisibility(r7)
                android.view.View r0 = r8.findViewById(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r3, r6)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.setTag(r2)
            L_0x0e7b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                british.x.t_chat r2 = british.p015x.t_chat.this
                java.lang.String r4 = r2.f9185t
                r0.append(r4)
                java.lang.String r4 = ","
                r0.append(r4)
                android.content.SharedPreferences r4 = r1.f9276b
                java.lang.String r3 = r4.getString(r3, r6)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.f9185t = r0
                if (r9 == 0) goto L_0x0ed4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                british.x.t_chat r2 = british.p015x.t_chat.this
                java.lang.String r3 = r2.f9185t
                r0.append(r3)
                java.lang.String r3 = "@1@"
                r0.append(r3)
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.String r4 = "f2_idvideo"
                java.lang.String r3 = r3.getString(r4, r6)
                r0.append(r3)
                java.lang.String r3 = "@"
                r0.append(r3)
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.String r3 = r3.getString(r5, r6)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.f9185t = r0
                goto L_0x0eee
            L_0x0ed4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                british.x.t_chat r2 = british.p015x.t_chat.this
                java.lang.String r3 = r2.f9185t
                r0.append(r3)
                java.lang.String r3 = "@0"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.f9185t = r0
            L_0x0eee:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                british.x.t_chat r2 = british.p015x.t_chat.this
                java.lang.String r3 = r2.f9185t
                r0.append(r3)
                java.lang.String r3 = ","
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.f9185t = r0
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.t_chat$j0 r0 = r0.f9150Q0
                if (r0 == 0) goto L_0x0f16
                android.os.AsyncTask$Status r0 = r0.getStatus()
                android.os.AsyncTask$Status r2 = android.os.AsyncTask.Status.RUNNING
                if (r0 == r2) goto L_0x0b59
            L_0x0f16:
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.t_chat$j0 r2 = new british.x.t_chat$j0
                british.x.t_chat r3 = british.p015x.t_chat.this
                r4 = 0
                r2.<init>()
                r0.f9150Q0 = r2
                british.x.t_chat r0 = british.p015x.t_chat.this
                british.x.t_chat$j0 r0 = r0.f9150Q0
                r2 = 0
                java.lang.String[] r3 = new java.lang.String[r2]
                r0.execute(r3)
            L_0x0f2c:
                r0 = 0
            L_0x0f2d:
                android.content.SharedPreferences r3 = r1.f9276b
                java.lang.String r3 = r3.getString(r5, r6)
                r8.setTag(r3)
                android.content.SharedPreferences r3 = r1.f9276b
                boolean r3 = r3.getBoolean(r11, r2)
                if (r3 == 0) goto L_0x0f46
                british.x.t_chat r0 = british.p015x.t_chat.this
                android.widget.LinearLayout r0 = r0.f9158U0
                r0.addView(r8, r2)
                goto L_0x0f7b
            L_0x0f46:
                british.x.t_chat r2 = british.p015x.t_chat.this
                android.widget.LinearLayout r2 = r2.f9158U0
                r2.addView(r8)
                android.content.SharedPreferences r2 = r1.f9276b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                british.x.t_chat r4 = british.p015x.t_chat.this
                long r4 = r4.f9139L
                r3.append(r4)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0f76
                if (r0 != 0) goto L_0x0f7b
                british.x.t_chat r0 = british.p015x.t_chat.this
                r0.mo8484U()
                goto L_0x0f7b
            L_0x0f76:
                british.x.t_chat r0 = british.p015x.t_chat.this
                r0.mo8483T()
            L_0x0f7b:
                british.x.t_chat r0 = british.p015x.t_chat.this
                int r2 = r0.f9165Y
                r3 = 1
                int r2 = r2 + r3
                r0.f9165Y = r2
                british.x.t_chat r0 = british.p015x.t_chat.this
                int r0 = r0.f9165Y
                if (r0 != r3) goto L_0x0f9d
                british.x.t_chat r0 = british.p015x.t_chat.this
                r2 = 2131363221(0x7f0a0595, float:1.8346245E38)
                android.view.View r0 = r0.findViewById(r2)
                r2 = 8
                r0.setVisibility(r2)
                goto L_0x0fb4
            L_0x0f9d:
                r2 = 8
                british.x.t_chat r0 = british.p015x.t_chat.this
                int r0 = r0.f9165Y
                r3 = 2
                if (r0 != r3) goto L_0x0fb4
                british.x.t_chat r0 = british.p015x.t_chat.this
                r3 = 2131363222(0x7f0a0596, float:1.8346247E38)
                android.view.View r0 = r0.findViewById(r3)
                r0.setVisibility(r2)
            L_0x0fb4:
                british.x.t_chat r0 = british.p015x.t_chat.this
                r2 = 2131362951(0x7f0a0487, float:1.8345697E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.ScrollView r0 = (android.widget.ScrollView) r0
                british.x.t_chat r2 = british.p015x.t_chat.this
                android.widget.LinearLayout r2 = r2.f9158U0
                int r2 = r2.getMeasuredHeight()
                int r3 = r0.getScrollY()
                int r4 = r0.getHeight()
                int r3 = r3 + r4
                if (r2 > r3) goto L_0x0fda
                british.x.t_chat$m$d r2 = new british.x.t_chat$m$d
                r2.<init>()
                r0.post(r2)
            L_0x0fda:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.C2262m.run():void");
        }
    }

    /* renamed from: british.x.t_chat$n */
    class C2267n implements DialogInterface.OnClickListener {
        C2267n() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            Bundle bundle;
            t_chat t_chat = t_chat.this;
            if (!t_chat.f9126E0 || (bundle = t_chat.f9136J0) == null || !bundle.containsKey("id_remit")) {
                ((LinearLayout) t_chat.this.findViewById(R.id.llchat)).removeAllViews();
                t_chat.this.f9165Y = 0;
                t_chat.this.f9191w = "";
                t_chat.this.f9121C = "";
                t_chat t_chat2 = t_chat.this;
                t_chat2.f9123D = false;
                t_chat2.findViewById(R.id.view_aux_1).setVisibility(0);
                t_chat.this.findViewById(R.id.view_aux_2).setVisibility(0);
                t_chat.this.findViewById(R.id.btnfavoritos).setVisibility(0);
                t_chat.this.findViewById(R.id.btnperfil).setVisibility(0);
                if (t_chat.this.f9155T == 1) {
                    t_chat.this.findViewById(R.id.btnfoto).setVisibility(0);
                } else {
                    t_chat.this.findViewById(R.id.btnfoto).setVisibility(8);
                }
                t_chat t_chat3 = t_chat.this;
                if (t_chat3.f9126E0 || t_chat3.f9176o0.f7350i2 == 0 || t_chat.this.f9176o0.f7350i2 == 1) {
                    t_chat.this.findViewById(R.id.btnvideo).setVisibility(8);
                } else {
                    t_chat.this.findViewById(R.id.btnvideo).setVisibility(0);
                }
                t_chat.this.findViewById(R.id.ll_cabe_priv).setVisibility(8);
                t_chat.this.findViewById(R.id.ll_favnotif).setVisibility(0);
                t_chat t_chat4 = t_chat.this;
                if (t_chat4.f9132H0) {
                    t_chat4.findViewById(R.id.ll_cabe).setVisibility(0);
                } else if (!t_chat4.f9126E0 && t_chat4.f9188u0.f7890W) {
                    t_chat4.findViewById(R.id.ll_cabe_der).setVisibility(0);
                }
                t_chat.this.f9151R = 0;
                z = false;
            } else {
                t_chat.this.f9151R = -1;
                z = true;
            }
            if (t_chat.this.f9151R != -1) {
                t_chat t_chat5 = t_chat.this;
                new C2227a0(SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION, t_chat5.f9151R).execute(new String[0]);
            }
            t_chat.this.f9167Z = false;
            SharedPreferences.Editor edit = t_chat.this.f9172m0.edit();
            edit.putString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.commit();
            if (z) {
                t_chat t_chat6 = t_chat.this;
                t_chat6.f6657c = true;
                t_chat6.mo8479K();
                t_chat.this.finish();
            }
        }
    }

    /* renamed from: british.x.t_chat$o */
    class C2268o implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9283a;

        C2268o(AlertDialog alertDialog) {
            this.f9283a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f9283a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
            Button button2 = this.f9283a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_chat.this.f6656b));
        }
    }

    /* renamed from: british.x.t_chat$p */
    class C2269p extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9285a;

        /* renamed from: british.x.t_chat$p$a */
        class C2270a extends FullScreenContentCallback {
            C2270a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_chat t_chat = t_chat.this;
                if (t_chat.f9184s0) {
                    t_chat.abrir_secc(t_chat.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_chat t_chat = t_chat.this;
                t_chat.abrir_secc(t_chat.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_chat$p$b */
        class C2271b implements OnUserEarnedRewardListener {
            C2271b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2269p pVar = C2269p.this;
                t_chat.this.f9184s0 = true;
                C1692config.m8175Y0(pVar.f9285a);
            }
        }

        C2269p(Context context) {
            this.f9285a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_chat.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2270a());
            rewardedAd.show((Activity) this.f9285a, new C2271b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (!t_chat.this.f9176o0.mo7502f(this.f9285a, t_chat.this.f6663i)) {
                t_chat.this.f6661g.cancel();
                t_chat t_chat = t_chat.this;
                t_chat.abrir_secc(t_chat.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_chat$q */
    class C2272q implements AdDisplayListener {
        C2272q() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_chat t_chat = t_chat.this;
            if (t_chat.f9184s0) {
                t_chat.abrir_secc(t_chat.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_chat$r */
    class C2273r implements SearchManager.OnCancelListener {
        C2273r() {
        }

        public void onCancel() {
            t_chat t_chat = t_chat.this;
            t_chat.f6657c = false;
            t_chat.setResult(0);
        }
    }

    /* renamed from: british.x.t_chat$s */
    class C2274s implements SearchManager.OnDismissListener {
        C2274s() {
        }

        public void onDismiss() {
            t_chat.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_chat$t */
    class C2275t implements TextToSpeech.OnInitListener {
        C2275t() {
        }

        public void onInit(int i) {
            if (i == 0) {
                t_chat.this.f9166Y0 = true;
            }
        }
    }

    /* renamed from: british.x.t_chat$u */
    class C2276u extends UtteranceProgressListener {

        /* renamed from: british.x.t_chat$u$a */
        class C2277a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ View f9294b;

            /* renamed from: c */
            final /* synthetic */ View f9295c;

            C2277a(View view, View view2) {
                this.f9294b = view;
                this.f9295c = view2;
            }

            public void run() {
                this.f9294b.setVisibility(8);
                this.f9295c.setVisibility(0);
            }
        }

        C2276u() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8586a(String str) {
            View findViewWithTag = t_chat.this.f9158U0.findViewWithTag(str);
            LinearLayout linearLayout = t_chat.this.f9158U0;
            View findViewWithTag2 = linearLayout.findViewWithTag(str + "_pause");
            if (findViewWithTag != null && findViewWithTag2 != null) {
                t_chat.this.runOnUiThread(new C2277a(findViewWithTag2, findViewWithTag));
            }
        }

        public void onDone(String str) {
            mo8586a(str);
        }

        public void onError(String str) {
            mo8586a(str);
        }

        public void onStart(String str) {
        }

        public void onStop(String str, boolean z) {
            mo8586a(str);
        }
    }

    /* renamed from: british.x.t_chat$v */
    class C2278v implements View.OnClickListener {
        C2278v() {
        }

        public void onClick(View view) {
            t_chat.this.finish();
        }
    }

    /* renamed from: british.x.t_chat$w */
    class C2279w implements View.OnClickListener {
        C2279w() {
        }

        public void onClick(View view) {
            t_chat.this.finish();
        }
    }

    /* renamed from: british.x.t_chat$x */
    class C2280x implements View.OnClickListener {
        C2280x() {
        }

        public void onClick(View view) {
            t_chat.this.m8707O();
        }
    }

    /* renamed from: british.x.t_chat$y */
    class C2281y implements View.OnClickListener {
        C2281y() {
        }

        public void onClick(View view) {
            t_chat.this.m8707O();
        }
    }

    /* renamed from: british.x.t_chat$z */
    public static class C2282z extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private String f9301a;

        /* renamed from: b */
        private String f9302b;

        /* renamed from: c */
        private long f9303c;

        /* renamed from: d */
        private int f9304d;

        public C2282z(String str, int i, long j, String str2) {
            this.f9301a = str;
            this.f9304d = i;
            this.f9303c = j;
            this.f9302b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/cancelar_solicitud.php");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("v", new C12982f("2"));
                gVar.mo48144c("idusu", new C12982f(this.f9303c + ""));
                gVar.mo48144c("codigo", new C12982f(this.f9302b));
                gVar.mo48144c("idusu_conversante", new C12982f(this.f9301a));
                gVar.mo48144c("modo", new C12982f(this.f9304d + ""));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO 99";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.indexOf("ANDROID:OK") != -1 || str.indexOf("ANDROID:KO") != -1) {
                str.indexOf("ANDROID:OK");
            }
        }
    }

    /* renamed from: G */
    public static CharSequence m8702G(Context context, CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        hashMap.put(":-D\\|", Integer.valueOf(R.drawable.smile1));
        hashMap.put(":-O\\|", Integer.valueOf(R.drawable.smile2));
        hashMap.put(":-\\(\\|", Integer.valueOf(R.drawable.smile3));
        hashMap.put(":-\\)\\|", Integer.valueOf(R.drawable.smile4));
        hashMap.put(";-\\)\\|", Integer.valueOf(R.drawable.smile5));
        hashMap.put(":-\\|", Integer.valueOf(R.drawable.smile6));
        hashMap.put("B-D\\|", Integer.valueOf(R.drawable.smile7));
        hashMap.put("8-\\)", Integer.valueOf(R.drawable.smile8));
        hashMap.put(":-p\\|", Integer.valueOf(R.drawable.smile9));
        hashMap.put(":\"\\)", Integer.valueOf(R.drawable.smile10));
        hashMap.put(":'\\(\\|", Integer.valueOf(R.drawable.smile11));
        hashMap.put("X\\(", Integer.valueOf(R.drawable.smile12));
        hashMap.put(":x\\|", Integer.valueOf(R.drawable.smile13));
        hashMap.put(">:\\)\\|", Integer.valueOf(R.drawable.smile14));
        hashMap.put("O:\\)\\|", Integer.valueOf(R.drawable.smile15));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matcher matcher = Pattern.compile((String) entry.getKey(), 2).matcher(charSequence);
            while (matcher.find()) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), ((Integer) entry.getValue()).intValue());
                Object[] spans = spannableStringBuilder.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
                if (spans == null || spans.length == 0) {
                    spannableStringBuilder.setSpan(new ImageSpan(context, decodeResource), matcher.start(), matcher.end(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: H */
    private void m8703H(Context context) {
        this.f6662h = new C2269p(context);
    }

    /* renamed from: I */
    private void m8704I(boolean z) {
        String trim = ((TextView) findViewById(R.id.c_mensaje)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f9143N < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((EditText) findViewById(R.id.c_mensaje)).setText("");
            SharedPreferences.Editor edit = this.f9172m0.edit();
            edit.putString("f2_id", this.f9139L + "");
            edit.putString("f2_frase", trim);
            edit.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit.putString("f2_b64", "");
            edit.putString("f2_idfrase", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putString("f2_idtema", this.f9149Q + "");
            edit.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putBoolean("f2_ultimas", false);
            edit.putString("f2_ts", System.currentTimeMillis() + "");
            edit.commit();
            if (!this.f9130G0) {
                Drawable drawable = getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(this.f9186t0, PorterDuff.Mode.MULTIPLY);
                this.f9190v0.setImageDrawable(drawable);
                this.f9130G0 = true;
                SharedPreferences.Editor edit2 = this.f9172m0.edit();
                edit2.putBoolean("notif" + this.f9147P, true);
                edit2.commit();
                new C1692config.C1732r0(this.f9139L, this.f9177p, this.f9147P, "notif", 1).execute(new String[0]);
            }
            if (this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                this.f9176o0.mo7508i1(this);
                C1692config config = this.f9176o0;
                SharedPreferences sharedPreferences = this.f9172m0;
                config.mo7501e1(this, sharedPreferences, this.f9149Q + "");
            }
            this.f9197z.add(trim);
            C2235d0 d0Var = this.f9156T0;
            if (d0Var == null || d0Var.getStatus() != AsyncTask.Status.RUNNING) {
                C2235d0 d0Var2 = new C2235d0();
                this.f9156T0 = d0Var2;
                d0Var2.execute(new String[0]);
            }
            String string = this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION);
            if (!string.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                SharedPreferences sharedPreferences2 = this.f9172m0;
                if (!sharedPreferences2.contains("usufav_" + string)) {
                    SharedPreferences sharedPreferences3 = this.f9172m0;
                    if (!sharedPreferences3.contains("usufav_noactivar_" + string)) {
                        SharedPreferences.Editor edit3 = this.f9172m0.edit();
                        edit3.putBoolean("usufav_" + string, true);
                        edit3.commit();
                    }
                }
            }
        }
    }

    /* renamed from: L */
    private void m8705L(String str) {
        AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C2267n()).setMessage(R.string.confirmar_salirprivado).create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C2268o(create));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m8706N(String str, String str2) {
        ((LinearLayout) findViewById(R.id.llchat)).removeAllViews();
        findViewById(R.id.btnfavoritos).setVisibility(8);
        findViewById(R.id.btnperfil).setVisibility(8);
        if (this.f9176o0.f7285X1) {
            findViewById(R.id.btnfoto).setVisibility(0);
        } else {
            findViewById(R.id.btnfoto).setVisibility(8);
        }
        int i = this.f9176o0.f7350i2;
        if (i == 1 || i == 3) {
            findViewById(R.id.btnvideo).setVisibility(0);
        } else {
            findViewById(R.id.btnvideo).setVisibility(8);
        }
        ((TextView) findViewById(R.id.tv_cabe_priv)).setText(getResources().getString(R.string.chatprivadocon) + " " + str2);
        if (this.f9170l0) {
            findViewById(R.id.iv_cabe_priv).setVisibility(8);
        } else {
            findViewById(R.id.iv_cabe_priv).setVisibility(0);
        }
        findViewById(R.id.ll_cabe_priv).setVisibility(0);
        findViewById(R.id.ll_favnotif).setVisibility(8);
        findViewById(R.id.ll_cabe).setVisibility(8);
        findViewById(R.id.ll_cabe_der).setVisibility(8);
        this.f9151R = 0;
        new C2227a0(SessionDescription.SUPPORTED_SDP_VERSION, str, this.f9151R).execute(new String[0]);
        this.f9165Y = 0;
        this.f9191w = "";
        this.f9121C = "";
        this.f9123D = false;
        findViewById(R.id.view_aux_1).setVisibility(0);
        findViewById(R.id.view_aux_2).setVisibility(0);
        this.f9167Z = true;
        SharedPreferences.Editor edit = this.f9172m0.edit();
        edit.putString("idprivado", str);
        edit.putString("nombreprivado", str2);
        edit.commit();
        C1692config.m8187g(this, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m8707O() {
        Intent intent;
        Intent intent2 = new Intent();
        intent2.putExtra("finalizar", true);
        setResult(-1, intent2);
        if (this.f9188u0.f7863I0 > 0) {
            intent = new Intent(this, t_buscchats_lista.class);
            intent.putExtra("ind", this.f9176o0.f7318d);
            intent.putExtra("idcat", this.f9188u0.f7861H0);
            intent.putExtra("idsubcat", this.f9188u0.f7863I0);
        } else {
            intent = new Intent(this, t_buscchats.class);
            intent.putExtra("ind", this.f9176o0.f7318d);
            intent.putExtra("idcat", this.f9188u0.f7861H0);
        }
        if (this.f9176o0.f7427t4 != 2) {
            intent.putExtra("es_root", true);
        }
        this.f6659e = false;
        this.f6657c = true;
        mo8479K();
        finish();
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m8708Q(int i, boolean z, ImageView imageView) {
        File file;
        Bitmap bitmap;
        if (imageView != null) {
            boolean z2 = false;
            if (z) {
                file = this.f9176o0.mo7516l0(this, i);
            } else {
                file = this.f9176o0.mo7518n0(this, i, false);
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                int i2 = options.outWidth;
                imageView.getLayoutParams().width = this.f9171m;
                imageView.getLayoutParams().height = (options.outHeight * this.f9171m) / i2;
                int i3 = this.f9171m;
                if (i2 <= i3) {
                    z2 = true;
                }
                if (!z2) {
                    int round = Math.round(((float) i2) / ((float) i3));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file.getPath(), options2);
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file));
                }
                if (imageView.getTag(R.id.idaux1) != null && imageView.getTag(R.id.idaux1).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    bitmap = C1692config.m8169T0(bitmap, BitmapFactory.decodeResource(getResources(), R.drawable.play_pp));
                }
                imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
                C1692config.m8172V(imageView);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: S */
    static void m8709S(Context context, String str) {
        LinearLayout linearLayout = (LinearLayout) ((Activity) context).findViewById(R.id.llchat);
        if (linearLayout != null) {
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View childAt = linearLayout.getChildAt(i);
                if (childAt.getTag() != null && childAt.getTag().equals(str)) {
                    childAt.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: W */
    private void m8710W() {
        AlertDialog create = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C2236e()).setNegativeButton(getString(R.string.selimg), new C2234d()).setMessage(R.string.enviarimg).create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C2240f(create));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* renamed from: X */
    private void m8711X() {
        AlertDialog create = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C2246h()).setNegativeButton(getString(R.string.selvideo), new C2244g()).setMessage(R.string.enviarvideo).create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C2248i(create));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo8478J(ImageView imageView, ImageView imageView2) {
        if (!this.f9166Y0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9164X0.speak((String) imageView.getTag(R.id.idaux1), 0, (Bundle) null, (String) imageView.getTag());
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            return;
        }
        this.f9164X0.speak((String) imageView.getTag(R.id.idaux1), 0, (HashMap) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo8479K() {
        this.f9167Z = false;
        SharedPreferences.Editor edit = this.f9172m0.edit();
        edit.putBoolean("activa" + this.f9149Q, false);
        edit.putBoolean("activa", false);
        edit.putString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.commit();
        this.f9172m0.unregisterOnSharedPreferenceChangeListener(this);
        this.f9174n0.unregisterOnSharedPreferenceChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo8480M() {
        int q0 = this.f9176o0.mo7522q0(this);
        int i = this.f9176o0.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9134I0 = listView;
            this.f9176o0.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9176o0.f7231O1;
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
            int[] iArr = this.f9176o0.f7249R1;
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
    /* renamed from: P */
    public void mo8481P() {
        boolean z;
        if (!this.f9191w.equals("")) {
            Date date = null;
            try {
                date = new SimpleDateFormat("ddMMyy").parse(this.f9191w);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                TextView textView = new TextView(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int i = this.f9175o;
                layoutParams.setMargins(0, i * 4, 0, i * 2);
                textView.setLayoutParams(layoutParams);
                int i2 = this.f9173n;
                textView.setPadding(i2 * 2, i2, i2, i2);
                textView.setBackgroundColor(Color.parseColor("#CCEEEEEE"));
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(Typeface.DEFAULT, 2);
                textView.setTextColor(-12303292);
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(date);
                if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
                    textView.setText(getResources().getString(R.string.hoy));
                } else {
                    textView.setText(DateFormat.getDateFormat(this).format(date));
                }
                this.f9158U0.addView(textView, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo8482R(String str, String str2) {
        this.f9181r = str;
        this.f9183s = str2;
        this.f9141M = this.f9139L;
        this.f9179q = this.f9177p;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str2 + " " + getResources().getString(R.string.solicitaprivado)).setItems(R.array.privado_opcs, new C2250j()).setCancelable(false);
        try {
            AlertDialog show = builder.show();
            this.f9180q0 = show;
            ((TextView) show.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo8483T() {
        MediaPlayer mediaPlayer;
        if (!this.f9193x.equals(SessionDescription.SUPPORTED_SDP_VERSION) && (mediaPlayer = this.f9117A) != null && !mediaPlayer.isPlaying()) {
            try {
                this.f9117A.start();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo8484U() {
        MediaPlayer mediaPlayer;
        if (!this.f9195y.equals(SessionDescription.SUPPORTED_SDP_VERSION) && (mediaPlayer = this.f9119B) != null && !mediaPlayer.isPlaying()) {
            try {
                this.f9119B.start();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo8485V(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 111149056) {
            AlertDialog create = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.vidlargo).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C2232c(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return false;
        }
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 3);
        try {
            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.f9176o0.mo7516l0(this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File l0 = this.f9176o0.mo7516l0(this, 99);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(l0.getPath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i <= 800 && i2 <= 800) {
                z = true;
            }
            if (!z) {
                int round = Math.round(((float) i) / ((float) C1692config.m8193n(i, i2, 800, 800)));
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = round;
                bitmap = BitmapFactory.decodeFile(l0.getPath(), options2);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(l0));
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, new FileOutputStream(this.f9176o0.mo7516l0(this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9176o0.mo7510j0(view, this);
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
                    if (this.f9176o0.f7427t4 != 2) {
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
            mo8479K();
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:101|102|103|(1:107)|108|(2:111|109)|140|112|113|114|115|116|157) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x02c6 */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0235 A[LOOP:3: B:90:0x0229->B:92:0x0235, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = -1
            r4 = r23
            if (r4 != r3) goto L_0x032f
            r4 = 108(0x6c, float:1.51E-43)
            java.lang.String r5 = "dt_foto98_temp."
            java.lang.String r6 = ""
            r7 = 100
            r8 = 99
            r9 = 0
            if (r0 != r4) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r2 = "mp4"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            british.x.config r2 = r1.f9176o0
            java.io.File r0 = r2.mo7507i0(r1, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 == 0) goto L_0x032f
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L_0x032f
            boolean r2 = r1.mo8485V(r0)
            if (r2 != 0) goto L_0x0042
            return
        L_0x0042:
            british.x.config r2 = r1.f9176o0
            java.io.File r2 = r2.mo7516l0(r1, r7)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x0051
            int r7 = r7 + 1
            goto L_0x0042
        L_0x0051:
            british.x.config r2 = r1.f9176o0
            java.io.File r2 = r2.mo7516l0(r1, r8)
            british.x.config r3 = r1.f9176o0
            java.io.File r3 = r3.mo7516l0(r1, r7)
            r2.renameTo(r3)
            british.x.t_chat$g0 r2 = new british.x.t_chat$g0
            r2.<init>(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r9]
            r2.execute(r0)
            goto L_0x032f
        L_0x006c:
            r4 = 4
            r10 = 1
            if (r0 != r4) goto L_0x00e0
            android.net.Uri r0 = r24.getData()
            android.content.Context r2 = r21.getApplicationContext()
            java.lang.String r2 = british.p015x.C1692config.m8181b0(r0, r2)
            java.lang.String r3 = "."
            int r3 = r2.lastIndexOf(r3)
            int r3 = r3 + r10
            java.lang.String r2 = r2.substring(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r0 = british.p015x.C1692config.m8179a1(r1, r0, r2)
            if (r0 != 0) goto L_0x009d
            return
        L_0x009d:
            british.x.config r0 = r1.f9176o0
            java.io.File r0 = r0.mo7507i0(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 == 0) goto L_0x032f
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L_0x032f
            boolean r2 = r1.mo8485V(r0)
            if (r2 != 0) goto L_0x00b6
            return
        L_0x00b6:
            british.x.config r2 = r1.f9176o0
            java.io.File r2 = r2.mo7516l0(r1, r7)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x00c5
            int r7 = r7 + 1
            goto L_0x00b6
        L_0x00c5:
            british.x.config r2 = r1.f9176o0
            java.io.File r2 = r2.mo7516l0(r1, r8)
            british.x.config r3 = r1.f9176o0
            java.io.File r3 = r3.mo7516l0(r1, r7)
            r2.renameTo(r3)
            british.x.t_chat$g0 r2 = new british.x.t_chat$g0
            r2.<init>(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r9]
            r2.execute(r0)
            goto L_0x032f
        L_0x00e0:
            r4 = 106(0x6a, float:1.49E-43)
            java.lang.String r11 = "orientation"
            r12 = 800(0x320, float:1.121E-42)
            if (r0 != r4) goto L_0x0257
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x014d }
            british.x.config r2 = r1.f9176o0     // Catch:{ Exception -> 0x014d }
            java.io.File r2 = r2.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x014d }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x014d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x014d }
            long r13 = r0.length()     // Catch:{ Exception -> 0x014d }
            android.content.Context r0 = r21.getApplicationContext()     // Catch:{ Exception -> 0x014d }
            android.content.ContentResolver r15 = r0.getContentResolver()     // Catch:{ Exception -> 0x014d }
            android.net.Uri r16 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = "_size"
            java.lang.String[] r17 = new java.lang.String[]{r11, r0}     // Catch:{ Exception -> 0x014d }
            java.lang.String r18 = "date_added>=?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ Exception -> 0x014d }
            long r5 = r1.f9192w0     // Catch:{ Exception -> 0x014d }
            r19 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r19
            r19 = 1
            long r5 = r5 - r19
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x014d }
            r0[r9] = r2     // Catch:{ Exception -> 0x014d }
            java.lang.String r20 = "date_added desc"
            r19 = r0
            android.database.Cursor r0 = r15.query(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x014a
            long r4 = r1.f9192w0     // Catch:{ Exception -> 0x014d }
            r15 = 0
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x014a
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x014d }
            if (r2 == 0) goto L_0x014a
        L_0x0137:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x014d }
            if (r2 == 0) goto L_0x014a
            long r4 = r0.getLong(r10)     // Catch:{ Exception -> 0x014d }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0137
            int r0 = r0.getInt(r9)     // Catch:{ Exception -> 0x014d }
            goto L_0x014b
        L_0x014a:
            r0 = -1
        L_0x014b:
            r2 = r0
            goto L_0x0152
        L_0x014d:
            r0 = move-exception
            r0.printStackTrace()
            r2 = -1
        L_0x0152:
            if (r2 != r3) goto L_0x016e
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x016a }
            british.x.config r4 = r1.f9176o0     // Catch:{ IOException -> 0x016a }
            java.io.File r4 = r4.mo7505h0(r1, r8)     // Catch:{ IOException -> 0x016a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x016a }
            r0.<init>(r4)     // Catch:{ IOException -> 0x016a }
            java.lang.String r4 = "Orientation"
            int r2 = r0.getAttributeInt(r4, r3)     // Catch:{ IOException -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x016e:
            british.x.config r0 = r1.f9176o0     // Catch:{ Exception -> 0x01cb }
            java.io.File r0 = r0.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x01cb }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x01cb }
            r4.<init>()     // Catch:{ Exception -> 0x01cb }
            r4.inJustDecodeBounds = r10     // Catch:{ Exception -> 0x01cb }
            java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x01cb }
            android.graphics.BitmapFactory.decodeFile(r5, r4)     // Catch:{ Exception -> 0x01cb }
            int r5 = r4.outWidth     // Catch:{ Exception -> 0x01cb }
            int r4 = r4.outHeight     // Catch:{ Exception -> 0x01cb }
            if (r5 > r12) goto L_0x018c
            if (r4 > r12) goto L_0x018c
            r6 = 1
            goto L_0x018d
        L_0x018c:
            r6 = 0
        L_0x018d:
            if (r6 != 0) goto L_0x01aa
            int r4 = british.p015x.C1692config.m8193n(r5, r4, r12, r12)     // Catch:{ Exception -> 0x01cb }
            float r5 = (float) r5     // Catch:{ Exception -> 0x01cb }
            float r4 = (float) r4     // Catch:{ Exception -> 0x01cb }
            float r5 = r5 / r4
            int r4 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x01cb }
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x01cb }
            r5.<init>()     // Catch:{ Exception -> 0x01cb }
            r5.inSampleSize = r4     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x01cb }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r5)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01b6
        L_0x01aa:
            android.content.ContentResolver r4 = r21.getContentResolver()     // Catch:{ Exception -> 0x01cb }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x01cb }
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r4, r0)     // Catch:{ Exception -> 0x01cb }
        L_0x01b6:
            british.x.config r4 = r1.f9176o0     // Catch:{ Exception -> 0x01cb }
            java.io.File r4 = r4.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x01cb }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01cf }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01cf }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01cf }
            r6 = 75
            r0.compress(r4, r6, r5)     // Catch:{ Exception -> 0x01cf }
            r5 = 100
            goto L_0x01d1
        L_0x01cb:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01cf:
            r5 = 75
        L_0x01d1:
            if (r2 == r3) goto L_0x0229
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3 = 3
            if (r2 != r3) goto L_0x01de
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x01ec
        L_0x01de:
            r3 = 8
            if (r2 != r3) goto L_0x01e5
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x01ec
        L_0x01e5:
            r3 = 6
            if (r2 != r3) goto L_0x01eb
            r2 = 90
            goto L_0x01ec
        L_0x01eb:
            r2 = 0
        L_0x01ec:
            if (r2 <= 0) goto L_0x0229
            british.x.config r3 = r1.f9176o0     // Catch:{ Exception -> 0x0225 }
            java.io.File r3 = r3.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0225 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch:{ Exception -> 0x0225 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0225 }
            r0.postRotate(r2)     // Catch:{ Exception -> 0x0225 }
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()     // Catch:{ Exception -> 0x0225 }
            int r15 = r11.getHeight()     // Catch:{ Exception -> 0x0225 }
            r17 = 1
            r16 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0225 }
            british.x.config r2 = r1.f9176o0     // Catch:{ Exception -> 0x0225 }
            java.io.File r2 = r2.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x0225 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0223 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0223 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0223 }
            r0.compress(r2, r5, r3)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0229
        L_0x0223:
            goto L_0x0229
        L_0x0225:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0229:
            british.x.config r0 = r1.f9176o0
            java.io.File r0 = r0.mo7516l0(r1, r7)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0238
            int r7 = r7 + 1
            goto L_0x0229
        L_0x0238:
            british.x.config r0 = r1.f9176o0     // Catch:{ Exception -> 0x0248 }
            java.io.File r0 = r0.mo7505h0(r1, r8)     // Catch:{ Exception -> 0x0248 }
            british.x.config r2 = r1.f9176o0     // Catch:{ Exception -> 0x0248 }
            java.io.File r2 = r2.mo7516l0(r1, r7)     // Catch:{ Exception -> 0x0248 }
            british.p015x.C1692config.m8202w(r0, r2)     // Catch:{ Exception -> 0x0248 }
            goto L_0x0249
        L_0x0248:
            r10 = 0
        L_0x0249:
            if (r10 == 0) goto L_0x032f
            british.x.t_chat$e0 r0 = new british.x.t_chat$e0
            r0.<init>(r7)
            java.lang.String[] r2 = new java.lang.String[r9]
            r0.execute(r2)
            goto L_0x032f
        L_0x0257:
            r4 = 2
            if (r0 != r4) goto L_0x02d4
            android.net.Uri r0 = r24.getData()
            java.lang.String[] r2 = new java.lang.String[]{r11}     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            android.content.ContentResolver r13 = r21.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r16 = 0
            r17 = 0
            r18 = 0
            r14 = r0
            r15 = r2
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            if (r4 == 0) goto L_0x0284
            boolean r5 = r4.moveToFirst()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            if (r5 == 0) goto L_0x0284
            r2 = r2[r9]     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            int r3 = r4.getInt(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
        L_0x0284:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r2.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            float r3 = (float) r3     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r2.postRotate(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            british.x.config r3 = r1.f9176o0     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            android.graphics.Bitmap r13 = r3.mo7477D(r0, r12, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r14 = 0
            r15 = 0
            int r16 = r13.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            int r17 = r13.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r19 = 1
            r18 = r2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
        L_0x02a5:
            british.x.config r2 = r1.f9176o0     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            java.io.File r2 = r2.mo7516l0(r1, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            boolean r2 = r2.exists()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            if (r2 == 0) goto L_0x02b4
            int r7 = r7 + 1
            goto L_0x02a5
        L_0x02b4:
            british.x.config r2 = r1.f9176o0     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            java.io.File r2 = r2.mo7516l0(r1, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x02c6 }
            r3.<init>(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x02c6 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x02c6 }
            r4 = 75
            r0.compress(r2, r4, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02c6 }
        L_0x02c6:
            r0.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            british.x.t_chat$e0 r0 = new british.x.t_chat$e0     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r0.<init>(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            r0.execute(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x032f }
            goto L_0x032f
        L_0x02d4:
            if (r2 == 0) goto L_0x02e6
            java.lang.String r0 = "idusu_ban"
            boolean r4 = r2.hasExtra(r0)
            if (r4 == 0) goto L_0x02e6
            java.lang.String r0 = r2.getStringExtra(r0)
            m8709S(r1, r0)
            goto L_0x032f
        L_0x02e6:
            if (r2 == 0) goto L_0x0304
            java.lang.String r0 = "abrir_privado"
            boolean r0 = r2.hasExtra(r0)
            if (r0 == 0) goto L_0x0304
            android.content.SharedPreferences r0 = r1.f9174n0
            java.lang.String r2 = "id_remit"
            java.lang.String r0 = r0.getString(r2, r6)
            android.content.SharedPreferences r2 = r1.f9174n0
            java.lang.String r3 = "nombre_remit"
            java.lang.String r2 = r2.getString(r3, r6)
            r1.m8706N(r0, r2)
            goto L_0x032f
        L_0x0304:
            if (r2 == 0) goto L_0x032f
            java.lang.String r0 = "finalizar"
            boolean r4 = r2.hasExtra(r0)
            if (r4 == 0) goto L_0x032f
            android.os.Bundle r4 = r24.getExtras()
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L_0x032f
            android.os.Bundle r0 = r24.getExtras()
            java.lang.String r4 = "finalizar_app"
            boolean r0 = r0.getBoolean(r4)
            if (r0 != 0) goto L_0x0326
            r1.f6659e = r9
        L_0x0326:
            r1.setResult(r3, r2)
            r21.mo8479K()
            r21.finish()
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9184s0) {
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
        String string = this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION);
        if (!string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && !this.f9170l0) {
            m8705L(string);
        } else if (!this.f6659e || this.f9118A0 || !this.f9176o0.f7365k5) {
            if (this.f9170l0) {
                mo8479K();
            }
            super.onBackPressed();
        } else {
            this.f9118A0 = true;
            C1692config.m8199t(this);
        }
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
        String str9;
        if (view.getId() == R.id.btnfoto) {
            m8710W();
        } else if (view.getId() == R.id.btnvideo) {
            m8711X();
        } else if (view.getId() == R.id.btnfavoritos) {
            Intent intent = new Intent(this, privados.class);
            mo8479K();
            startActivityForResult(intent, 0);
        } else {
            boolean z = true;
            if (view.getId() == R.id.btnperfil) {
                Intent intent2 = new Intent(this, preperfil.class);
                if (this.f9126E0) {
                    intent2 = C1692config.m8198r(intent2, this.f9136J0);
                } else {
                    intent2.putExtra("idsecc", this.f9145O);
                }
                intent2.putExtra("nocompletar", true);
                mo8479K();
                startActivityForResult(intent2, 0);
            } else if (view.getId() == R.id.iv_cabe_priv) {
                m8705L(this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION));
            } else if (view.getId() == R.id.btncargarmas) {
                new C2227a0(SessionDescription.SUPPORTED_SDP_VERSION, this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION), this.f9151R).execute(new String[0]);
            } else if (view.getId() == R.id.btnemotic) {
                new C1824g((EditText) findViewById(R.id.c_mensaje), this).show();
            } else if (view.getId() == R.id.btnenv) {
                m8704I(false);
            } else if (view.getTag(R.id.idaux1) != null && !view.getTag(R.id.idaux1).equals(SessionDescription.SUPPORTED_SDP_VERSION) && !view.getTag(R.id.idaux1).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                Intent intent3 = new Intent(this, profile.class);
                intent3.putExtra(TtmlNode.ATTR_ID, (String) view.getTag(R.id.idaux1));
                intent3.putExtra("privados", (String) view.getTag(R.id.idaux2));
                intent3.putExtra("nombre", (String) view.getTag(R.id.idaux3));
                intent3.putExtra("coments", (String) view.getTag(R.id.idaux4));
                intent3.putExtra("fnac_d", (String) view.getTag(R.id.idaux5));
                intent3.putExtra("fnac_m", (String) view.getTag(R.id.idaux6));
                intent3.putExtra("fnac_a", (String) view.getTag(R.id.idaux7));
                intent3.putExtra("sexo", (String) view.getTag(R.id.idaux8));
                intent3.putExtra("vfoto", (String) view.getTag(R.id.idaux9));
                if (view.getTag(R.id.idaux10) != null && ((String) view.getTag(R.id.idaux10)).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    intent3.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                intent3.putExtra("p_fnac", this.f9157U);
                intent3.putExtra("p_sexo", this.f9159V);
                intent3.putExtra("p_descr", this.f9161W);
                intent3.putExtra("p_dist", this.f9163X);
                intent3.putExtra("coments_chat", this.f9122C0);
                intent3.putExtra("galeria", this.f9124D0);
                intent3.putExtra("privados_chat", this.f9120B0);
                intent3.putExtra("fotos_perfil", this.f9153S);
                intent3.putExtra("fotos_chat", this.f9155T);
                startActivityForResult(intent3, 0);
            } else if (view.getTag() == null || ((String) view.getTag()).length() <= 3 || !((String) view.getTag()).substring(0, 3).equals("img")) {
                String str10 = this.f9176o0.f7251R3;
                if ((str10 == null || str10.equals("")) && (((str = this.f9176o0.f7281W3) == null || str.equals("")) && (((str2 = this.f9176o0.f7250R2) == null || str2.equals("")) && (((str3 = this.f9176o0.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9176o0.f7269U3) == null || str4.equals("")) && (((str5 = this.f9176o0.f7275V3) == null || str5.equals("")) && (((str6 = this.f9176o0.f7358j4) == null || str6.equals("")) && (((str7 = this.f9176o0.f7287X3) == null || str7.equals("")) && ((str8 = this.f9176o0.f7293Y3) == null || str8.equals("")))))))))) {
                    abrir_secc(view);
                    return;
                }
                String str11 = this.f9176o0.f7251R3;
                if (str11 != null && !str11.equals("")) {
                    this.f6663i = new RewardedVideo((Context) this, this.f9176o0.f7251R3);
                }
                String str12 = this.f9176o0.f7245Q3;
                if (str12 != null) {
                    str12.equals("");
                }
                String str13 = this.f9176o0.f7269U3;
                if (str13 != null && !str13.equals("")) {
                    this.f6664j = new RewardedVideoAd(this, this.f9176o0.f7269U3);
                }
                String str14 = this.f9176o0.f7275V3;
                if (str14 != null && !str14.equals("")) {
                    this.f6665k = new StartAppAd(this);
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f6661g = progressDialog;
                this.f6660f = view;
                if (!this.f9176o0.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                    abrir_secc(view);
                }
            } else if (view.getTag(R.id.idaux1).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                String substring = ((String) view.getTag()).substring(3);
                if (view.getTag(R.id.TAG_ESIMGPROPIA) != null) {
                    z = false;
                }
                if (this.f9176o0.mo7518n0(this, Integer.parseInt(substring), z).exists()) {
                    Intent intent4 = new Intent(this, t_url.class);
                    intent4.putExtra("url", "file://" + this.f9176o0.mo7518n0(this, Integer.parseInt(substring), z).getAbsolutePath());
                    startActivityForResult(intent4, 0);
                    return;
                }
                C2259k0 k0Var = this.f9152R0;
                if (k0Var == null || k0Var.getStatus() != AsyncTask.Status.RUNNING) {
                    try {
                        this.f9158U0.findViewWithTag("pb" + substring).setVisibility(0);
                    } catch (Exception unused) {
                    }
                    C2259k0 k0Var2 = new C2259k0(substring);
                    this.f9152R0 = k0Var2;
                    k0Var2.execute(new String[0]);
                }
            } else if (view.getTag(R.id.idaux1).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                String substring2 = ((String) view.getTag()).substring(3);
                String str15 = (String) view.getTag(R.id.idaux2);
                String str16 = (String) view.getTag(R.id.idaux3);
                if (str16.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    str9 = "mp4";
                } else if (str16.equals("2")) {
                    str9 = "3gp";
                } else if (str16.equals("3")) {
                    str9 = "webm";
                } else {
                    return;
                }
                String str17 = "v" + str15 + "." + str9;
                String str18 = (String) view.getTag(R.id.idaux4);
                if (this.f9176o0.mo7517m0(this, str17).exists()) {
                    Intent intent5 = new Intent(this, t_video.class);
                    intent5.putExtra("url", "file://" + this.f9176o0.mo7517m0(this, str17).getAbsolutePath());
                    intent5.putExtra("desde_chat", true);
                    startActivityForResult(intent5, 0);
                    return;
                }
                C2261l0 l0Var = this.f9154S0;
                if (l0Var == null || l0Var.getStatus() != AsyncTask.Status.RUNNING) {
                    try {
                        this.f9158U0.findViewWithTag("pb" + substring2).setVisibility(0);
                    } catch (Exception unused2) {
                    }
                    C2261l0 l0Var2 = new C2261l0(substring2, str15, str16, str18);
                    this.f9154S0 = l0Var2;
                    l0Var2.execute(new String[0]);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8480M();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9182r0;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9182r0;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        C1692config config = this.f9176o0;
        this.f9182r0 = config.mo7476B0(this, false, !config.f7279W1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:264:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x094d  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0b82  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0c79  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0c86  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0c9d  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0d74  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0df9 A[Catch:{ OutOfMemoryError -> 0x0e15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0e07 A[Catch:{ OutOfMemoryError -> 0x0e15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0e1a  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0e78  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0e8c  */
    @android.annotation.TargetApi(13)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            android.content.Context r2 = r23.getApplicationContext()
            british.x.config r2 = (british.p015x.C1692config) r2
            r1.f9176o0 = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r1.m8703H(r1)
            british.x.t_chat$k r2 = new british.x.t_chat$k
            r2.<init>()
            r1.f6666l = r2
            android.content.Intent r2 = r23.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r1.f9136J0 = r2
            java.lang.String r3 = "es_root"
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x003f
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x003f
            android.os.Bundle r2 = r1.f9136J0
            boolean r2 = r2.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r1.f6659e = r2
            goto L_0x0054
        L_0x0043:
            boolean r2 = r0.containsKey(r3)
            if (r2 == 0) goto L_0x0051
            boolean r2 = r0.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r1.f6659e = r2
        L_0x0054:
            android.os.Bundle r2 = r1.f9136J0
            if (r2 == 0) goto L_0x0062
            java.lang.String r3 = "externo"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0062
            r2 = 1
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            r1.f9126E0 = r2
            british.x.config r3 = r1.f9176o0
            british.x.l[] r6 = r3.f7231O1
            int r3 = r3.f7318d
            r3 = r6[r3]
            r1.f9188u0 = r3
            boolean r3 = r1.f6659e
            java.lang.String r6 = "id_remit"
            if (r3 == 0) goto L_0x0081
            if (r2 == 0) goto L_0x0081
            android.os.Bundle r2 = r1.f9136J0
            boolean r2 = r2.containsKey(r6)
            if (r2 == 0) goto L_0x0081
            r2 = 1
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            r1.f9170l0 = r2
            boolean r2 = r1.f9126E0
            if (r2 == 0) goto L_0x009d
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r3 = "c1"
            java.lang.String r2 = r2.getString(r3)
            r1.f9187u = r2
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r3 = "c2"
            java.lang.String r2 = r2.getString(r3)
            r1.f9189v = r2
            goto L_0x00a7
        L_0x009d:
            british.x.l r2 = r1.f9188u0
            java.lang.String r3 = r2.f7916g
            r1.f9187u = r3
            java.lang.String r2 = r2.f7919h
            r1.f9189v = r2
        L_0x00a7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            java.lang.String r7 = r1.f9187u
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.p015x.C1692config.m8153I(r2)
            r1.f9194x0 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r7 = r1.f9189v
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.p015x.C1692config.m8153I(r2)
            r1.f9198z0 = r2
            british.x.config r2 = r1.f9176o0
            int r7 = r2.f7338g2
            java.lang.String r8 = ""
            if (r7 <= 0) goto L_0x0103
            r1.f9196y0 = r4
            java.lang.String r2 = r2.f7356j2
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0107
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            british.x.config r7 = r1.f9176o0
            java.lang.String r7 = r7.f7356j2
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.p015x.C1692config.m8153I(r2)
            r1.f9196y0 = r2
            goto L_0x0107
        L_0x0103:
            boolean r2 = r1.f9194x0
            r1.f9196y0 = r2
        L_0x0107:
            java.lang.String r2 = r1.f9187u
            british.x.config r7 = r1.f9176o0
            java.lang.String r7 = r7.f7368l1
            java.lang.String r2 = british.p015x.C1692config.m8189h(r2, r7)
            r1.f6656b = r2
            boolean r2 = r1.f9194x0
            if (r2 != 0) goto L_0x011d
            r2 = 2131886906(0x7f12033a, float:1.9408404E38)
            r1.setTheme(r2)
        L_0x011d:
            super.onCreate(r24)
            r2 = 2131558659(0x7f0d0103, float:1.874264E38)
            r1.setContentView(r2)
            r23.mo8480M()
            british.x.config r2 = r1.f9176o0
            r2.mo7486N0(r1, r5)
            java.lang.String r2 = "search"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.app.SearchManager r2 = (android.app.SearchManager) r2
            british.x.t_chat$r r7 = new british.x.t_chat$r
            r7.<init>()
            r2.setOnCancelListener(r7)
            british.x.t_chat$s r7 = new british.x.t_chat$s
            r7.<init>()
            r2.setOnDismissListener(r7)
            british.x.config r2 = r1.f9176o0
            android.os.Bundle r7 = r1.f9136J0
            if (r7 == 0) goto L_0x0156
            java.lang.String r9 = "ad_entrar"
            boolean r7 = r7.containsKey(r9)
            if (r7 == 0) goto L_0x0156
            r7 = 1
            goto L_0x0157
        L_0x0156:
            r7 = 0
        L_0x0157:
            android.os.Bundle r9 = r1.f9136J0
            if (r9 == 0) goto L_0x0165
            java.lang.String r10 = "fb_entrar"
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L_0x0165
            r9 = 1
            goto L_0x0166
        L_0x0165:
            r9 = 0
        L_0x0166:
            r2.mo7503f1(r1, r7, r9)
            r2 = 0
            r1.f9182r0 = r2
            british.x.config r7 = r1.f9176o0
            boolean r9 = r7.f7279W1
            r9 = r9 ^ r4
            british.x.c r7 = r7.mo7476B0(r1, r5, r9)
            r1.f9182r0 = r7
            boolean r7 = r1.f9126E0
            if (r7 != 0) goto L_0x0184
            british.x.config r7 = r1.f9176o0
            int r9 = r7.f7318d
            java.lang.String r10 = r1.f6656b
            r7.mo7488Q0(r1, r9, r10, r0)
        L_0x0184:
            british.x.config r0 = r1.f9176o0
            int r7 = r0.f7318d
            boolean r0 = r1.f9126E0
            if (r0 == 0) goto L_0x01f1
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "idchat"
            int r0 = r0.getInt(r9)
            r1.f9147P = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "idtema"
            int r0 = r0.getInt(r9)
            r1.f9149Q = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "fotos_perfil"
            int r0 = r0.getInt(r9)
            r1.f9153S = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "privados"
            boolean r0 = r0.getBoolean(r9)
            r1.f9120B0 = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "coments"
            boolean r0 = r0.getBoolean(r9)
            r1.f9122C0 = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "galeria"
            boolean r0 = r0.getBoolean(r9)
            r1.f9124D0 = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "fnac"
            int r0 = r0.getInt(r9)
            r1.f9157U = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "sexo"
            int r0 = r0.getInt(r9)
            r1.f9159V = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "dist"
            int r0 = r0.getInt(r9)
            r1.f9163X = r0
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "descr"
            int r0 = r0.getInt(r9)
            r1.f9161W = r0
            goto L_0x0242
        L_0x01f1:
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r9 = "idsecc"
            int r0 = r0.getInt(r9)
            r1.f9145O = r0
            r1.f9147P = r0
            british.x.config r0 = r1.f9176o0     // Catch:{ Exception -> 0x020c }
            british.x.l[] r0 = r0.f7231O1     // Catch:{ Exception -> 0x020c }
            r0 = r0[r7]     // Catch:{ Exception -> 0x020c }
            british.x.o[] r0 = r0.f7867K0     // Catch:{ Exception -> 0x020c }
            r0 = r0[r5]     // Catch:{ Exception -> 0x020c }
            int r0 = r0.f8022a     // Catch:{ Exception -> 0x020c }
            r1.f9149Q = r0     // Catch:{ Exception -> 0x020c }
            goto L_0x020e
        L_0x020c:
            r1.f9149Q = r5
        L_0x020e:
            british.x.config r0 = r1.f9176o0
            british.x.l[] r0 = r0.f7231O1
            r9 = r0[r7]
            int r9 = r9.f7849B0
            r1.f9153S = r9
            r9 = r0[r7]
            boolean r9 = r9.f7884T
            r1.f9120B0 = r9
            r9 = r0[r7]
            boolean r9 = r9.f7886U
            r1.f9122C0 = r9
            r9 = r0[r7]
            boolean r9 = r9.f7888V
            r1.f9124D0 = r9
            r9 = r0[r7]
            int r9 = r9.f7851C0
            r1.f9157U = r9
            r9 = r0[r7]
            int r9 = r9.f7853D0
            r1.f9159V = r9
            r9 = r0[r7]
            int r9 = r9.f7857F0
            r1.f9163X = r9
            r0 = r0[r7]
            int r0 = r0.f7855E0
            r1.f9161W = r0
        L_0x0242:
            boolean r0 = r1.f9120B0
            r9 = 2131361967(0x7f0a00af, float:1.8343701E38)
            r10 = 8
            if (r0 != 0) goto L_0x0252
            android.view.View r0 = r1.findViewById(r9)
            r0.setVisibility(r10)
        L_0x0252:
            java.lang.String r0 = "sh"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r5)
            r1.f9172m0 = r0
            british.x.config r0 = r1.f9176o0
            boolean r0 = r0.f7326e2
            if (r0 == 0) goto L_0x0274
            android.speech.tts.TextToSpeech r0 = new android.speech.tts.TextToSpeech
            british.x.t_chat$t r11 = new british.x.t_chat$t
            r11.<init>()
            r0.<init>(r1, r11)
            r1.f9164X0 = r0
            british.x.t_chat$u r11 = new british.x.t_chat$u
            r11.<init>()
            r0.setOnUtteranceProgressListener(r11)
        L_0x0274:
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.String r11 = "sit"
            java.lang.String r12 = "0"
            java.lang.String r0 = r0.getString(r11, r12)
            r1.f9193x = r0
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = r1.f9193x     // Catch:{ Exception -> 0x02ec }
            java.lang.String r11 = "1"
            boolean r0 = r0.equals(r11)     // Catch:{ Exception -> 0x02ec }
            if (r0 == 0) goto L_0x02b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ec }
            r0.<init>()     // Catch:{ Exception -> 0x02ec }
            java.io.File r11 = r23.getFilesDir()     // Catch:{ Exception -> 0x02ec }
            r0.append(r11)     // Catch:{ Exception -> 0x02ec }
            java.lang.String r11 = "/sound_in"
            r0.append(r11)     // Catch:{ Exception -> 0x02ec }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ec }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x02ec }
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r1, r0)     // Catch:{ Exception -> 0x02ec }
            r1.f9117A = r0     // Catch:{ Exception -> 0x02ec }
            goto L_0x02e6
        L_0x02b0:
            android.content.res.AssetManager r0 = r23.getAssets()     // Catch:{ Exception -> 0x02ec }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ec }
            r11.<init>()     // Catch:{ Exception -> 0x02ec }
            java.lang.String r13 = "sounds/sound"
            r11.append(r13)     // Catch:{ Exception -> 0x02ec }
            java.lang.String r13 = r1.f9193x     // Catch:{ Exception -> 0x02ec }
            r11.append(r13)     // Catch:{ Exception -> 0x02ec }
            java.lang.String r13 = ".wav"
            r11.append(r13)     // Catch:{ Exception -> 0x02ec }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x02ec }
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r11)     // Catch:{ Exception -> 0x02ec }
            android.media.MediaPlayer r13 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x02ec }
            r13.<init>()     // Catch:{ Exception -> 0x02ec }
            r1.f9117A = r13     // Catch:{ Exception -> 0x02ec }
            java.io.FileDescriptor r14 = r0.getFileDescriptor()     // Catch:{ Exception -> 0x02ec }
            long r15 = r0.getStartOffset()     // Catch:{ Exception -> 0x02ec }
            long r17 = r0.getLength()     // Catch:{ Exception -> 0x02ec }
            r13.setDataSource(r14, r15, r17)     // Catch:{ Exception -> 0x02ec }
        L_0x02e6:
            android.media.MediaPlayer r0 = r1.f9117A     // Catch:{ Exception -> 0x02ec }
            r0.prepare()     // Catch:{ Exception -> 0x02ec }
            goto L_0x02f0
        L_0x02ec:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02f0:
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.String r11 = "sot"
            java.lang.String r0 = r0.getString(r11, r12)
            r1.f9195y = r0
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x036a
            java.lang.String r0 = r1.f9195y     // Catch:{ Exception -> 0x0366 }
            java.lang.String r11 = "1"
            boolean r0 = r0.equals(r11)     // Catch:{ Exception -> 0x0366 }
            if (r0 == 0) goto L_0x032a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0366 }
            r0.<init>()     // Catch:{ Exception -> 0x0366 }
            java.io.File r11 = r23.getFilesDir()     // Catch:{ Exception -> 0x0366 }
            r0.append(r11)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r11 = "/sound_out"
            r0.append(r11)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0366 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0366 }
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r1, r0)     // Catch:{ Exception -> 0x0366 }
            r1.f9119B = r0     // Catch:{ Exception -> 0x0366 }
            goto L_0x0360
        L_0x032a:
            android.content.res.AssetManager r0 = r23.getAssets()     // Catch:{ Exception -> 0x0366 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0366 }
            r11.<init>()     // Catch:{ Exception -> 0x0366 }
            java.lang.String r13 = "sounds/sound_out"
            r11.append(r13)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r13 = r1.f9195y     // Catch:{ Exception -> 0x0366 }
            r11.append(r13)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r13 = ".wav"
            r11.append(r13)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0366 }
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r11)     // Catch:{ Exception -> 0x0366 }
            android.media.MediaPlayer r13 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x0366 }
            r13.<init>()     // Catch:{ Exception -> 0x0366 }
            r1.f9119B = r13     // Catch:{ Exception -> 0x0366 }
            java.io.FileDescriptor r14 = r0.getFileDescriptor()     // Catch:{ Exception -> 0x0366 }
            long r15 = r0.getStartOffset()     // Catch:{ Exception -> 0x0366 }
            long r17 = r0.getLength()     // Catch:{ Exception -> 0x0366 }
            r13.setDataSource(r14, r15, r17)     // Catch:{ Exception -> 0x0366 }
        L_0x0360:
            android.media.MediaPlayer r0 = r1.f9119B     // Catch:{ Exception -> 0x0366 }
            r0.prepare()     // Catch:{ Exception -> 0x0366 }
            goto L_0x036a
        L_0x0366:
            r0 = move-exception
            r0.printStackTrace()
        L_0x036a:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r11 = r23.getWindowManager()
            android.view.Display r11 = r11.getDefaultDisplay()
            r11.getMetrics(r0)
            int r11 = r0.widthPixels
            r1.f9125E = r11
            int r0 = r0.heightPixels
            r1.f9127F = r0
            android.content.res.Resources r0 = r23.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r13 = 2
            if (r0 != r13) goto L_0x0391
            int r11 = r1.f9127F
        L_0x0391:
            int r0 = r11 / 2
            double r14 = (double) r0
            r16 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r16
            int r0 = (int) r14
            r1.f9129G = r0
            double r14 = (double) r11
            r16 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r16
            int r0 = (int) r14
            r1.f9131H = r0
            int r0 = r1.f9153S
            if (r0 <= 0) goto L_0x03c3
            r0 = 50
            int r0 = british.p015x.C1692config.m8149E(r1, r0)
            int r11 = r1.f9129G
            int r11 = r11 - r0
            r1.f9129G = r11
            int r11 = r1.f9131H
            int r11 = r11 - r0
            r1.f9131H = r11
        L_0x03c3:
            r0 = 500(0x1f4, float:7.0E-43)
            british.x.config r11 = r1.f9176o0
            boolean r11 = r11.f7326e2
            if (r11 == 0) goto L_0x03d2
            r11 = 35
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            int r0 = r0 + r11
        L_0x03d2:
            british.x.config r11 = r1.f9176o0
            boolean r11 = r11.f7332f2
            if (r11 == 0) goto L_0x03df
            r11 = 25
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            int r0 = r0 + r11
        L_0x03df:
            int r11 = r1.f9129G
            int r0 = java.lang.Math.max(r11, r0)
            r1.f9129G = r0
            int r11 = r1.f9125E
            r14 = 30
            int r14 = british.p015x.C1692config.m8149E(r1, r14)
            int r11 = r11 - r14
            int r0 = java.lang.Math.min(r0, r11)
            r1.f9129G = r0
            r0 = 4
            int r11 = british.p015x.C1692config.m8149E(r1, r0)
            r1.f9133I = r11
            british.x.config r11 = r1.f9176o0
            int r11 = r11.f7338g2
            r14 = 3
            if (r11 != r4) goto L_0x040d
            r11 = 14
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            r1.f9133I = r11
            goto L_0x042a
        L_0x040d:
            if (r11 != r13) goto L_0x0417
            r11 = 5
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            r1.f9133I = r11
            goto L_0x042a
        L_0x0417:
            if (r11 != r14) goto L_0x0422
            r11 = 12
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            r1.f9133I = r11
            goto L_0x042a
        L_0x0422:
            if (r11 != r0) goto L_0x042a
            int r11 = british.p015x.C1692config.m8149E(r1, r0)
            r1.f9133I = r11
        L_0x042a:
            int r11 = british.p015x.C1692config.m8149E(r1, r14)
            r1.f9135J = r11
            r11 = 10
            int r11 = british.p015x.C1692config.m8149E(r1, r11)
            r1.f9137K = r11
            boolean r11 = r1.f9194x0
            if (r11 == 0) goto L_0x0445
            java.lang.String r11 = "#B71C1C"
            int r11 = android.graphics.Color.parseColor(r11)
            r1.f9186t0 = r11
            goto L_0x044d
        L_0x0445:
            java.lang.String r11 = "#FF5252"
            int r11 = android.graphics.Color.parseColor(r11)
            r1.f9186t0 = r11
        L_0x044d:
            r1.f9155T = r4
            boolean r11 = r1.f9126E0
            if (r11 == 0) goto L_0x045d
            android.os.Bundle r11 = r1.f9136J0
            java.lang.String r15 = "fotos_chat"
            int r11 = r11.getInt(r15)
            if (r11 == 0) goto L_0x046b
        L_0x045d:
            boolean r11 = r1.f9126E0
            if (r11 != 0) goto L_0x046d
            british.x.config r11 = r1.f9176o0
            british.x.l[] r11 = r11.f7231O1
            r11 = r11[r7]
            int r11 = r11.f7859G0
            if (r11 != 0) goto L_0x046d
        L_0x046b:
            r1.f9155T = r5
        L_0x046d:
            int r11 = r1.f9155T
            r15 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            if (r11 != 0) goto L_0x047b
            android.view.View r11 = r1.findViewById(r15)
            r11.setVisibility(r10)
        L_0x047b:
            boolean r11 = r1.f9126E0
            r0 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            if (r11 != 0) goto L_0x048a
            british.x.config r11 = r1.f9176o0
            int r11 = r11.f7350i2
            if (r11 == 0) goto L_0x048a
            if (r11 != r4) goto L_0x0491
        L_0x048a:
            android.view.View r11 = r1.findViewById(r0)
            r11.setVisibility(r10)
        L_0x0491:
            british.x.config r11 = r1.f9176o0
            boolean r11 = r11.f7291Y1
            r14 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            if (r11 != 0) goto L_0x04a1
            android.view.View r11 = r1.findViewById(r14)
            r11.setVisibility(r10)
        L_0x04a1:
            r11 = 1120403456(0x42c80000, float:100.0)
            android.content.res.Resources r17 = r23.getResources()
            android.util.DisplayMetrics r2 = r17.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r11
            int r2 = (int) r2
            r1.f9171m = r2
            r2 = 1077936128(0x40400000, float:3.0)
            android.content.res.Resources r11 = r23.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r2
            int r2 = (int) r11
            r1.f9173n = r2
            r2 = 1077936128(0x40400000, float:3.0)
            android.content.res.Resources r11 = r23.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r2
            int r2 = (int) r11
            r1.f9175o = r2
            java.io.File r2 = r23.getFilesDir()
            r1.f9146O0 = r2
            r1.f9165Y = r5
            r1.f9191w = r8
            r1.f9121C = r8
            r1.f9123D = r5
            android.content.SharedPreferences r2 = r1.f9172m0
            r13 = 0
            java.lang.String r11 = "idusu"
            long r13 = r2.getLong(r11, r13)
            r1.f9139L = r13
            android.content.SharedPreferences r2 = r1.f9172m0
            java.lang.String r11 = "cod"
            java.lang.String r2 = r2.getString(r11, r8)
            r1.f9177p = r2
            java.lang.String r2 = "accion"
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r5)
            r1.f9174n0 = r2
            r2 = 2131362546(0x7f0a02f2, float:1.8344876E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f9158U0 = r2
            r1.f9132H0 = r5
            android.os.Bundle r2 = r1.f9136J0
            r13 = 2131362476(0x7f0a02ac, float:1.8344734E38)
            r14 = 2131362475(0x7f0a02ab, float:1.8344732E38)
            r11 = 2131363081(0x7f0a0509, float:1.834596E38)
            if (r2 == 0) goto L_0x058d
            java.lang.String r0 = "tit_cab"
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x058d
            android.view.View r0 = r1.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r15 = "tit_cab"
            java.lang.String r2 = r2.getString(r15)
            r0.setText(r2)
            android.view.View r0 = r1.findViewById(r11)
            british.x.t_chat$v r2 = new british.x.t_chat$v
            r2.<init>()
            r0.setOnClickListener(r2)
            r0 = 2131362333(0x7f0a021d, float:1.8344444E38)
            android.view.View r0 = r1.findViewById(r0)
            british.x.t_chat$w r2 = new british.x.t_chat$w
            r2.<init>()
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.findViewById(r14)
            r0.setVisibility(r5)
            r1.f9132H0 = r4
            boolean r0 = r1.f9126E0
            if (r0 == 0) goto L_0x0628
            android.content.SharedPreferences r0 = r1.f9172m0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r15 = "tit_chat"
            r2.append(r15)
            int r15 = r1.f9147P
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            android.os.Bundle r15 = r1.f9136J0
            java.lang.String r9 = "tit_cab"
            java.lang.String r9 = r15.getString(r9)
            r0.putString(r2, r9)
            r0.commit()
            goto L_0x0628
        L_0x058d:
            boolean r0 = r1.f9126E0
            if (r0 != 0) goto L_0x05c1
            british.x.config r2 = r1.f9176o0
            british.x.l[] r2 = r2.f7231O1
            r2 = r2[r7]
            boolean r2 = r2.f7890W
            if (r2 == 0) goto L_0x05c1
            r0 = 2131363082(0x7f0a050a, float:1.8345963E38)
            android.view.View r0 = r1.findViewById(r0)
            british.x.t_chat$x r2 = new british.x.t_chat$x
            r2.<init>()
            r0.setOnClickListener(r2)
            r0 = 2131362334(0x7f0a021e, float:1.8344446E38)
            android.view.View r0 = r1.findViewById(r0)
            british.x.t_chat$y r2 = new british.x.t_chat$y
            r2.<init>()
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.findViewById(r13)
            r0.setVisibility(r5)
            goto L_0x0628
        L_0x05c1:
            if (r0 == 0) goto L_0x0628
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "tit_chat"
            r2.append(r9)
            int r9 = r1.f9147P
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.getString(r2, r8)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0628
            android.view.View r0 = r1.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "  "
            r2.append(r9)
            android.content.SharedPreferences r9 = r1.f9172m0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "tit_chat"
            r15.append(r11)
            int r11 = r1.f9147P
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.String r9 = r9.getString(r11, r8)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            r0 = 2131362333(0x7f0a021d, float:1.8344444E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r10)
            android.view.View r0 = r1.findViewById(r14)
            r0.setVisibility(r5)
            r1.f9132H0 = r4
        L_0x0628:
            r0 = 0
        L_0x0629:
            british.x.config r2 = r1.f9176o0
            british.x.l[] r2 = r2.f7231O1
            int r9 = r2.length
            if (r0 >= r9) goto L_0x0653
            r9 = r2[r0]
            int r9 = r9.f7954t
            r11 = 10
            if (r9 == r11) goto L_0x0646
            r9 = r2[r0]
            int r9 = r9.f7954t
            r11 = 9
            if (r9 != r11) goto L_0x0650
            r2 = r2[r0]
            boolean r2 = r2.f7890W
            if (r2 == 0) goto L_0x0650
        L_0x0646:
            r2 = 2131362212(0x7f0a01a4, float:1.8344198E38)
            android.view.View r2 = r1.findViewById(r2)
            r2.setVisibility(r5)
        L_0x0650:
            int r0 = r0 + 1
            goto L_0x0629
        L_0x0653:
            android.os.Bundle r0 = r1.f9136J0
            if (r0 == 0) goto L_0x066a
            java.lang.String r2 = "fav"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x066a
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r2 = "fav"
            boolean r0 = r0.getBoolean(r2)
            r1.f9128F0 = r0
            goto L_0x0685
        L_0x066a:
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "fav"
            r2.append(r9)
            int r9 = r1.f9147P
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.getBoolean(r2, r5)
            r1.f9128F0 = r0
        L_0x0685:
            r0 = 2131362212(0x7f0a01a4, float:1.8344198E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            british.x.t_chat$a r2 = new british.x.t_chat$a
            r2.<init>()
            r0.setOnClickListener(r2)
            boolean r2 = r1.f9128F0
            if (r2 == 0) goto L_0x06b0
            android.content.res.Resources r2 = r23.getResources()
            r9 = 2131231095(0x7f080177, float:1.8078261E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            int r9 = r1.f9186t0
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r9, r11)
            r0.setImageDrawable(r2)
            goto L_0x06d1
        L_0x06b0:
            boolean r2 = r1.f9194x0
            if (r2 == 0) goto L_0x06c3
            android.content.res.Resources r2 = r23.getResources()
            r9 = 2131231096(0x7f080178, float:1.8078263E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            r0.setImageDrawable(r2)
            goto L_0x06d1
        L_0x06c3:
            android.content.res.Resources r2 = r23.getResources()
            r9 = 2131231097(0x7f080179, float:1.8078265E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            r0.setImageDrawable(r2)
        L_0x06d1:
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r2 = "notif"
            if (r0 == 0) goto L_0x06e6
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x06e6
            android.os.Bundle r0 = r1.f9136J0
            boolean r0 = r0.getBoolean(r2)
            r1.f9130G0 = r0
            goto L_0x0733
        L_0x06e6:
            boolean r0 = r1.f9126E0
            if (r0 == 0) goto L_0x0719
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r11 = r1.f9147P
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0717
            r0 = 0
        L_0x0704:
            british.x.config r9 = r1.f9176o0
            british.x.l[] r9 = r9.f7231O1
            int r11 = r9.length
            if (r0 >= r11) goto L_0x0717
            r9 = r9[r0]
            int r9 = r9.f7964y
            int r11 = r1.f9147P
            if (r9 != r11) goto L_0x0714
            goto L_0x0719
        L_0x0714:
            int r0 = r0 + 1
            goto L_0x0704
        L_0x0717:
            r0 = 0
            goto L_0x071a
        L_0x0719:
            r0 = 1
        L_0x071a:
            android.content.SharedPreferences r9 = r1.f9172m0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            int r2 = r1.f9147P
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            boolean r0 = r9.getBoolean(r2, r0)
            r1.f9130G0 = r0
        L_0x0733:
            r0 = 2131362694(0x7f0a0386, float:1.8345176E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f9190v0 = r0
            british.x.t_chat$b r0 = new british.x.t_chat$b
            r0.<init>()
            android.widget.ImageView r2 = r1.f9190v0
            r2.setOnClickListener(r0)
            boolean r0 = r1.f9130G0
            if (r0 == 0) goto L_0x0764
            android.content.res.Resources r0 = r23.getResources()
            r2 = 2131231399(0x7f0802a7, float:1.8078878E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            int r2 = r1.f9186t0
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
            r0.setColorFilter(r2, r9)
            android.widget.ImageView r2 = r1.f9190v0
            r2.setImageDrawable(r0)
            goto L_0x0789
        L_0x0764:
            boolean r0 = r1.f9194x0
            if (r0 == 0) goto L_0x0779
            android.widget.ImageView r0 = r1.f9190v0
            android.content.res.Resources r2 = r23.getResources()
            r9 = 2131231401(0x7f0802a9, float:1.8078882E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            r0.setImageDrawable(r2)
            goto L_0x0789
        L_0x0779:
            android.widget.ImageView r0 = r1.f9190v0
            android.content.res.Resources r2 = r23.getResources()
            r9 = 2131231402(0x7f0802aa, float:1.8078884E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            r0.setImageDrawable(r2)
        L_0x0789:
            r0 = 2131362736(0x7f0a03b0, float:1.834526E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r1.f9162W0 = r0
            r0 = 2131362735(0x7f0a03af, float:1.8345259E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r1.f9160V0 = r0
            boolean r0 = r1.f9126E0
            if (r0 == 0) goto L_0x07b4
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r2 = "c1"
            java.lang.String r0 = r0.getString(r2)
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r9 = "c2"
            java.lang.String r2 = r2.getString(r9)
            goto L_0x07c5
        L_0x07b4:
            british.x.config r0 = r1.f9176o0
            british.x.l[] r0 = r0.f7231O1
            r2 = r0[r7]
            java.lang.String r2 = r2.f7916g
            r0 = r0[r7]
            java.lang.String r0 = r0.f7919h
            r22 = r2
            r2 = r0
            r0 = r22
        L_0x07c5:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r15 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            android.view.View r11 = r1.findViewById(r15)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            british.x.config r10 = r1.f9176o0
            int r10 = r10.f7169E
            if (r10 <= 0) goto L_0x07ed
            android.content.SharedPreferences r10 = r1.f9172m0
            java.lang.String r14 = "v_ico_perfil_act"
            int r10 = r10.getInt(r14, r5)
            british.x.config r14 = r1.f9176o0
            int r13 = r14.f7169E
            if (r10 != r13) goto L_0x07ed
            java.lang.String r10 = "ico_perfil"
            r14.mo7493Y(r10, r11)     // Catch:{ Exception -> 0x07ec }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x07ec }
            goto L_0x07ed
        L_0x07ec:
        L_0x07ed:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11 = 2131361967(0x7f0a00af, float:1.8343701E38)
            android.view.View r13 = r1.findViewById(r11)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            british.x.config r11 = r1.f9176o0
            int r11 = r11.f7175F
            if (r11 <= 0) goto L_0x0815
            android.content.SharedPreferences r11 = r1.f9172m0
            java.lang.String r14 = "v_ico_privados_act"
            int r11 = r11.getInt(r14, r5)
            british.x.config r14 = r1.f9176o0
            int r15 = r14.f7175F
            if (r11 != r15) goto L_0x0815
            java.lang.String r11 = "ico_privados"
            r14.mo7493Y(r11, r13)     // Catch:{ Exception -> 0x0814 }
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0814 }
            goto L_0x0815
        L_0x0814:
        L_0x0815:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r13 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            android.view.View r14 = r1.findViewById(r13)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            british.x.config r13 = r1.f9176o0
            int r13 = r13.f7181G
            if (r13 <= 0) goto L_0x0858
            android.content.SharedPreferences r13 = r1.f9172m0
            java.lang.String r15 = "v_ico_foto_act"
            int r13 = r13.getInt(r15, r5)
            british.x.config r15 = r1.f9176o0
            int r4 = r15.f7181G
            if (r13 != r4) goto L_0x0858
            java.lang.String r4 = "ico_foto"
            int[] r4 = r15.mo7493Y(r4, r14)     // Catch:{ Exception -> 0x0858 }
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()     // Catch:{ Exception -> 0x0858 }
            r15 = r4[r5]     // Catch:{ Exception -> 0x0858 }
            int r15 = british.p015x.C1692config.m8149E(r1, r15)     // Catch:{ Exception -> 0x0858 }
            r13.width = r15     // Catch:{ Exception -> 0x0858 }
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()     // Catch:{ Exception -> 0x0858 }
            r15 = 1
            r4 = r4[r15]     // Catch:{ Exception -> 0x0858 }
            int r4 = british.p015x.C1692config.m8149E(r1, r4)     // Catch:{ Exception -> 0x0858 }
            r13.height = r4     // Catch:{ Exception -> 0x0858 }
            r14.requestLayout()     // Catch:{ Exception -> 0x0858 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0858 }
        L_0x0858:
            r4 = r11
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r13 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r14 = r1.findViewById(r13)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            british.x.config r13 = r1.f9176o0
            int r13 = r13.f7187H
            if (r13 <= 0) goto L_0x089f
            android.content.SharedPreferences r13 = r1.f9172m0
            java.lang.String r15 = "v_ico_video_act"
            int r13 = r13.getInt(r15, r5)
            british.x.config r15 = r1.f9176o0
            int r5 = r15.f7187H
            if (r13 != r5) goto L_0x089f
            java.lang.String r5 = "ico_video"
            int[] r5 = r15.mo7493Y(r5, r14)     // Catch:{ Exception -> 0x089f }
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()     // Catch:{ Exception -> 0x089f }
            r19 = r11
            r15 = 0
            r11 = r5[r15]     // Catch:{ Exception -> 0x08a2 }
            int r11 = british.p015x.C1692config.m8149E(r1, r11)     // Catch:{ Exception -> 0x08a2 }
            r13.width = r11     // Catch:{ Exception -> 0x08a2 }
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()     // Catch:{ Exception -> 0x08a2 }
            r13 = 1
            r5 = r5[r13]     // Catch:{ Exception -> 0x08a2 }
            int r5 = british.p015x.C1692config.m8149E(r1, r5)     // Catch:{ Exception -> 0x08a2 }
            r11.height = r5     // Catch:{ Exception -> 0x08a2 }
            r14.requestLayout()     // Catch:{ Exception -> 0x08a2 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x08a2 }
        L_0x089f:
            r19 = r11
            goto L_0x08a3
        L_0x08a2:
        L_0x08a3:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r11 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            android.view.View r13 = r1.findViewById(r11)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            british.x.config r11 = r1.f9176o0
            int r11 = r11.f7193I
            if (r11 <= 0) goto L_0x08eb
            android.content.SharedPreferences r11 = r1.f9172m0
            java.lang.String r14 = "v_ico_emotic_act"
            r15 = 0
            int r11 = r11.getInt(r14, r15)
            british.x.config r14 = r1.f9176o0
            int r15 = r14.f7193I
            if (r11 != r15) goto L_0x08eb
            java.lang.String r11 = "ico_emotic"
            int[] r11 = r14.mo7493Y(r11, r13)     // Catch:{ Exception -> 0x08eb }
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()     // Catch:{ Exception -> 0x08eb }
            r20 = r5
            r15 = 0
            r5 = r11[r15]     // Catch:{ Exception -> 0x08ed }
            int r5 = british.p015x.C1692config.m8149E(r1, r5)     // Catch:{ Exception -> 0x08ed }
            r14.width = r5     // Catch:{ Exception -> 0x08ed }
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()     // Catch:{ Exception -> 0x08ed }
            r14 = 1
            r11 = r11[r14]     // Catch:{ Exception -> 0x08ed }
            int r11 = british.p015x.C1692config.m8149E(r1, r11)     // Catch:{ Exception -> 0x08ed }
            r5.height = r11     // Catch:{ Exception -> 0x08ed }
            r13.requestLayout()     // Catch:{ Exception -> 0x08ed }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x08ed }
            goto L_0x08ef
        L_0x08eb:
            r20 = r5
        L_0x08ed:
            r5 = r20
        L_0x08ef:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r13 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            british.x.config r14 = r1.f9176o0
            int r14 = r14.f7199J
            if (r14 <= 0) goto L_0x094d
            android.content.SharedPreferences r14 = r1.f9172m0
            java.lang.String r15 = "v_ico_enviar_act"
            r20 = r11
            r11 = 0
            int r14 = r14.getInt(r15, r11)
            british.x.config r11 = r1.f9176o0
            int r11 = r11.f7199J
            if (r14 != r11) goto L_0x094a
            r11 = 0
            r13.setRotationY(r11)
            british.x.config r11 = r1.f9176o0     // Catch:{ Exception -> 0x0941 }
            java.lang.String r14 = "ico_enviar"
            int[] r11 = r11.mo7493Y(r14, r13)     // Catch:{ Exception -> 0x0941 }
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()     // Catch:{ Exception -> 0x0941 }
            r21 = r6
            r15 = 0
            r6 = r11[r15]     // Catch:{ Exception -> 0x0943 }
            int r6 = british.p015x.C1692config.m8149E(r1, r6)     // Catch:{ Exception -> 0x0943 }
            r14.width = r6     // Catch:{ Exception -> 0x0943 }
            android.view.ViewGroup$LayoutParams r6 = r13.getLayoutParams()     // Catch:{ Exception -> 0x0943 }
            r14 = 1
            r11 = r11[r14]     // Catch:{ Exception -> 0x0943 }
            int r11 = british.p015x.C1692config.m8149E(r1, r11)     // Catch:{ Exception -> 0x0943 }
            r6.height = r11     // Catch:{ Exception -> 0x0943 }
            r13.requestLayout()     // Catch:{ Exception -> 0x0943 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0943 }
        L_0x093e:
            r20 = r11
            goto L_0x0950
        L_0x0941:
            r21 = r6
        L_0x0943:
            r6 = 1325274624(0x4efe1600, float:2.13142733E9)
            r13.setRotationY(r6)
            goto L_0x0950
        L_0x094a:
            r21 = r6
            goto L_0x0950
        L_0x094d:
            r21 = r6
            goto L_0x093e
        L_0x0950:
            boolean r6 = r0.equals(r8)
            if (r6 != 0) goto L_0x0b7e
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r11 = 2
            int[] r14 = new int[r11]
            r15 = 2131363081(0x7f0a0509, float:1.834596E38)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            r11 = 0
            r14[r11] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            r2 = 1
            r14[r2] = r0
            r6.<init>(r13, r14)
            r0 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setBackgroundDrawable(r6)
            boolean r0 = r1.f9194x0
            if (r0 != 0) goto L_0x0a27
            boolean r0 = r9.booleanValue()
            if (r0 != 0) goto L_0x09ba
            r0 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r0 = r23.getResources()
            r6 = 2131231418(0x7f0802ba, float:1.8078916E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r6)
            r2.setImageDrawable(r0)
        L_0x09ba:
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x09d7
            r2 = 2131361967(0x7f0a00af, float:1.8343701E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.content.res.Resources r2 = r23.getResources()
            r6 = 2131231430(0x7f0802c6, float:1.807894E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
            r0.setImageDrawable(r2)
        L_0x09d7:
            r0 = 2131362733(0x7f0a03ad, float:1.8345255E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r1.f9162W0 = r0
            r0 = 2131362476(0x7f0a02ac, float:1.8344734E38)
            android.view.View r2 = r1.findViewById(r0)
            int r0 = british.p015x.C1692config.f7106F5
            r2.setBackgroundColor(r0)
            r2 = 2131363082(0x7f0a050a, float:1.8345963E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6 = -1
            r2.setTextColor(r6)
            r2 = 2131362475(0x7f0a02ab, float:1.8344732E38)
            android.view.View r6 = r1.findViewById(r2)
            r6.setBackgroundColor(r0)
            android.view.View r2 = r1.findViewById(r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6 = -1
            r2.setTextColor(r6)
            r2 = 2131362477(0x7f0a02ad, float:1.8344736E38)
            android.view.View r2 = r1.findViewById(r2)
            r2.setBackgroundColor(r0)
            r0 = 2131363083(0x7f0a050b, float:1.8345965E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = -1
            r0.setTextColor(r2)
            goto L_0x0a6a
        L_0x0a27:
            r0 = 2131362476(0x7f0a02ac, float:1.8344734E38)
            android.view.View r2 = r1.findViewById(r0)
            int r0 = british.p015x.C1692config.f7105E5
            r2.setBackgroundColor(r0)
            r2 = 2131363082(0x7f0a050a, float:1.8345963E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r6 = british.p015x.C1692config.f7101A5
            r2.setTextColor(r6)
            r2 = 2131362475(0x7f0a02ab, float:1.8344732E38)
            android.view.View r9 = r1.findViewById(r2)
            r9.setBackgroundColor(r0)
            android.view.View r2 = r1.findViewById(r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setTextColor(r6)
            r2 = 2131362477(0x7f0a02ad, float:1.8344736E38)
            android.view.View r2 = r1.findViewById(r2)
            r2.setBackgroundColor(r0)
            r0 = 2131363083(0x7f0a050b, float:1.8345965E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r6)
        L_0x0a6a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 20
            if (r0 <= r2) goto L_0x0a87
            r2 = 2131362001(0x7f0a00d1, float:1.834377E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            boolean r6 = r1.f9194x0
            r9 = 1
            r6 = r6 ^ r9
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r9 = r1.f6656b
            british.p015x.C1692config.m8150F(r2, r6, r9)
            goto L_0x0a95
        L_0x0a87:
            r2 = 2131362001(0x7f0a00d1, float:1.834377E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r6)
        L_0x0a95:
            boolean r2 = r1.f9198z0
            if (r2 != 0) goto L_0x0aff
            boolean r2 = r4.booleanValue()
            if (r2 != 0) goto L_0x0ab6
            r2 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            android.view.View r4 = r1.findViewById(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r2 = r23.getResources()
            r6 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
            r4.setImageDrawable(r2)
        L_0x0ab6:
            boolean r2 = r19.booleanValue()
            if (r2 != 0) goto L_0x0ad3
            r2 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r4 = r1.findViewById(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r2 = r23.getResources()
            r6 = 2131231525(0x7f080325, float:1.8079133E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
            r4.setImageDrawable(r2)
        L_0x0ad3:
            boolean r2 = r5.booleanValue()
            if (r2 != 0) goto L_0x0af0
            r2 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            android.view.View r4 = r1.findViewById(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r2 = r23.getResources()
            r5 = 2131231011(0x7f080123, float:1.807809E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r5)
            r4.setImageDrawable(r2)
        L_0x0af0:
            r2 = 12
            if (r0 <= r2) goto L_0x0aff
            r2 = 2131362734(0x7f0a03ae, float:1.8345257E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1.f9160V0 = r2
        L_0x0aff:
            r2 = 20
            if (r0 <= r2) goto L_0x0b11
            android.widget.ProgressBar r0 = r1.f9162W0
            java.lang.String r2 = r1.f6656b
            british.p015x.C1692config.m8168S0(r0, r2)
            android.widget.ProgressBar r0 = r1.f9160V0
            java.lang.String r2 = r1.f6656b
            british.p015x.C1692config.m8168S0(r0, r2)
        L_0x0b11:
            boolean r0 = r20.booleanValue()
            if (r0 != 0) goto L_0x0b7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r2 = r1.f6656b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = british.p015x.C1692config.m8153I(r0)
            if (r0 == 0) goto L_0x0b3a
            r0 = 2131362331(0x7f0a021b, float:1.834444E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x0b45
        L_0x0b3a:
            r2 = 0
            r0 = 2131362330(0x7f0a021a, float:1.8344438E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
        L_0x0b45:
            android.content.res.Resources r0 = r23.getResources()
            r2 = 2131230871(0x7f080097, float:1.8077807E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            java.lang.String r2 = r1.f6656b
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0b72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = r1.f6656b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r0.setColorFilter(r2, r3)
        L_0x0b72:
            r2 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r0)
        L_0x0b7e:
            boolean r0 = r1.f9126E0
            if (r0 != 0) goto L_0x0c6b
            british.x.config r0 = r1.f9176o0
            british.x.l[] r2 = r0.f7231O1
            r3 = r2[r7]
            int r3 = r3.f7958v
            r4 = r2[r7]
            int r4 = r4.f7960w
            r5 = r2[r7]
            boolean r5 = r5.f7876P
            r6 = r2[r7]
            boolean r6 = r6.f7931l
            r2 = r2[r7]
            int r2 = r2.f7934m
            r9 = 2131362370(0x7f0a0242, float:1.8344519E38)
            if (r3 <= 0) goto L_0x0c36
            if (r5 != 0) goto L_0x0bcf
            android.view.View r4 = r1.findViewById(r9)     // Catch:{ Exception -> 0x0bcc }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ Exception -> 0x0bcc }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0bcc }
            r0.mo7514k1(r4, r5, r2)     // Catch:{ Exception -> 0x0bcc }
            british.x.config r0 = r1.f9176o0     // Catch:{ Exception -> 0x0bcc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bcc }
            r2.<init>()     // Catch:{ Exception -> 0x0bcc }
            java.lang.String r4 = "fondo_"
            r2.append(r4)     // Catch:{ Exception -> 0x0bcc }
            r2.append(r3)     // Catch:{ Exception -> 0x0bcc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0bcc }
            android.view.View r3 = r1.findViewById(r9)     // Catch:{ Exception -> 0x0bcc }
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch:{ Exception -> 0x0bcc }
            r0.mo7493Y(r2, r3)     // Catch:{ Exception -> 0x0bcc }
            goto L_0x0c6b
        L_0x0bcc:
            goto L_0x0c6b
        L_0x0bcf:
            british.x.t_chat$b0 r0 = new british.x.t_chat$b0
            r5 = 0
            r0.<init>()
            r5 = 5
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r8)
            java.lang.String r3 = r9.toString()
            r9 = 0
            r5[r9] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r7 = 1
            r5[r7] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r4 = 2
            r5[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r4 = 3
            r5[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            r3 = 4
            r5[r3] = r2
            r0.execute(r5)
            goto L_0x0c6b
        L_0x0c36:
            int r0 = r0.f7163D
            if (r0 <= 0) goto L_0x0c6b
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.String r2 = "fondo_v_act"
            r3 = 0
            int r0 = r0.getInt(r2, r3)
            british.x.config r2 = r1.f9176o0
            int r3 = r2.f7163D
            if (r0 != r3) goto L_0x0c6b
            android.view.View r0 = r1.findViewById(r9)     // Catch:{ Exception -> 0x0bcc }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0bcc }
            british.x.config r3 = r1.f9176o0     // Catch:{ Exception -> 0x0bcc }
            boolean r3 = r3.f7145A     // Catch:{ Exception -> 0x0bcc }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0bcc }
            british.x.config r4 = r1.f9176o0     // Catch:{ Exception -> 0x0bcc }
            int r4 = r4.f7157C     // Catch:{ Exception -> 0x0bcc }
            r2.mo7514k1(r0, r3, r4)     // Catch:{ Exception -> 0x0bcc }
            british.x.config r0 = r1.f9176o0     // Catch:{ Exception -> 0x0bcc }
            java.lang.String r2 = "fondo"
            android.view.View r3 = r1.findViewById(r9)     // Catch:{ Exception -> 0x0bcc }
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch:{ Exception -> 0x0bcc }
            r0.mo7493Y(r2, r3)     // Catch:{ Exception -> 0x0bcc }
        L_0x0c6b:
            android.view.WindowManager r0 = r23.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 13
            if (r2 < r3) goto L_0x0c86
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getSize(r2)
            int r0 = r2.y
            r1.f9143N = r0
            goto L_0x0c8c
        L_0x0c86:
            int r0 = r0.getHeight()
            r1.f9143N = r0
        L_0x0c8c:
            r2 = 0
            r1.f9167Z = r2
            android.content.SharedPreferences r0 = r1.f9172m0
            java.lang.String r2 = "idprivado"
            java.lang.String r0 = r0.getString(r2, r12)
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0d74
            r2 = 1
            r1.f9167Z = r2
            r2 = 2131361967(0x7f0a00af, float:1.8343701E38)
            android.view.View r0 = r1.findViewById(r2)
            r2 = 8
            r0.setVisibility(r2)
            r0 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            android.view.View r3 = r1.findViewById(r0)
            r3.setVisibility(r2)
            british.x.config r0 = r1.f9176o0
            boolean r0 = r0.f7285X1
            if (r0 == 0) goto L_0x0cc8
            r0 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            android.view.View r3 = r1.findViewById(r0)
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x0cd2
        L_0x0cc8:
            r0 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            android.view.View r3 = r1.findViewById(r0)
            r3.setVisibility(r2)
        L_0x0cd2:
            british.x.config r0 = r1.f9176o0
            int r0 = r0.f7350i2
            r3 = 1
            if (r0 == r3) goto L_0x0ce8
            r3 = 3
            if (r0 != r3) goto L_0x0cdd
            goto L_0x0ce8
        L_0x0cdd:
            r0 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r3 = r1.findViewById(r0)
            r3.setVisibility(r2)
            goto L_0x0cf3
        L_0x0ce8:
            r0 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r2 = r1.findViewById(r0)
            r3 = 0
            r2.setVisibility(r3)
        L_0x0cf3:
            r0 = 2131363083(0x7f0a050b, float:1.8345965E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.res.Resources r3 = r23.getResources()
            r4 = 2131820678(0x7f110086, float:1.9274078E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            android.content.SharedPreferences r3 = r1.f9172m0
            java.lang.String r4 = "nombreprivado"
            java.lang.String r3 = r3.getString(r4, r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            boolean r0 = r1.f9170l0
            if (r0 == 0) goto L_0x0d38
            r0 = 2131362335(0x7f0a021f, float:1.8344448E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            r3 = 0
            goto L_0x0d45
        L_0x0d38:
            r2 = 8
            r0 = 2131362335(0x7f0a021f, float:1.8344448E38)
            android.view.View r0 = r1.findViewById(r0)
            r3 = 0
            r0.setVisibility(r3)
        L_0x0d45:
            r0 = 2131362477(0x7f0a02ad, float:1.8344736E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r3)
            r0 = 2131362497(0x7f0a02c1, float:1.8344776E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            r0 = 2131362475(0x7f0a02ab, float:1.8344732E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            r0 = 2131362476(0x7f0a02ac, float:1.8344734E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            r0 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            r2 = 2131361967(0x7f0a00af, float:1.8343701E38)
            goto L_0x0d89
        L_0x0d74:
            r2 = 2131361967(0x7f0a00af, float:1.8343701E38)
            r3 = 0
            android.view.View r0 = r1.findViewById(r2)
            r0.setVisibility(r3)
            r0 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            android.view.View r4 = r1.findViewById(r0)
            r4.setVisibility(r3)
        L_0x0d89:
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            android.view.View r0 = r1.findViewById(r2)
            r0.setOnClickListener(r1)
            r0 = 2131361968(0x7f0a00b0, float:1.8343703E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131362335(0x7f0a021f, float:1.8344448E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnClickListener(r1)
            r0 = 2131362001(0x7f0a00d1, float:1.834377E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setOnKeyListener(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9140L0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9142M0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9144N0 = r0
            r2 = 0
            r1.f9138K0 = r2
            boolean r0 = r1.f9196y0     // Catch:{ OutOfMemoryError -> 0x0e15 }
            if (r0 == 0) goto L_0x0e07
            android.content.res.Resources r0 = r23.getResources()     // Catch:{ OutOfMemoryError -> 0x0e15 }
            r2 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0e15 }
            r1.f9138K0 = r0     // Catch:{ OutOfMemoryError -> 0x0e15 }
            goto L_0x0e16
        L_0x0e07:
            android.content.res.Resources r0 = r23.getResources()     // Catch:{ OutOfMemoryError -> 0x0e15 }
            r2 = 2131231485(0x7f0802fd, float:1.8079052E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0e15 }
            r1.f9138K0 = r0     // Catch:{ OutOfMemoryError -> 0x0e15 }
            goto L_0x0e16
        L_0x0e15:
        L_0x0e16:
            int r0 = r1.f9153S
            if (r0 <= 0) goto L_0x0e6c
            british.x.config r0 = r1.f9176o0
            r2 = 1
            java.io.File r0 = r0.mo7516l0(r1, r2)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0e6b }
            r3.<init>()     // Catch:{ Exception -> 0x0e6b }
            r3.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0e6b }
            java.lang.String r4 = r0.getPath()     // Catch:{ Exception -> 0x0e6b }
            android.graphics.BitmapFactory.decodeFile(r4, r3)     // Catch:{ Exception -> 0x0e6b }
            int r4 = r3.outWidth     // Catch:{ Exception -> 0x0e6b }
            r5 = 75
            r6 = 100
            int r3 = r3.outHeight     // Catch:{ Exception -> 0x0e6b }
            if (r4 > r5) goto L_0x0e3c
            if (r3 > r6) goto L_0x0e3c
            goto L_0x0e3d
        L_0x0e3c:
            r2 = 0
        L_0x0e3d:
            if (r2 != 0) goto L_0x0e5c
            int r2 = british.p015x.C1692config.m8193n(r4, r3, r5, r6)     // Catch:{ Exception -> 0x0e6b }
            float r3 = (float) r4     // Catch:{ Exception -> 0x0e6b }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0e6b }
            float r3 = r3 / r2
            int r2 = java.lang.Math.round(r3)     // Catch:{ Exception -> 0x0e6b }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0e6b }
            r3.<init>()     // Catch:{ Exception -> 0x0e6b }
            r3.inSampleSize = r2     // Catch:{ Exception -> 0x0e6b }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0e6b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ Exception -> 0x0e6b }
            r1.f9138K0 = r0     // Catch:{ Exception -> 0x0e6b }
            goto L_0x0e6c
        L_0x0e5c:
            android.content.ContentResolver r2 = r23.getContentResolver()     // Catch:{ Exception -> 0x0e6b }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0e6b }
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r2, r0)     // Catch:{ Exception -> 0x0e6b }
            r1.f9138K0 = r0     // Catch:{ Exception -> 0x0e6b }
            goto L_0x0e6c
        L_0x0e6b:
        L_0x0e6c:
            android.os.Bundle r0 = r1.f9136J0
            if (r0 == 0) goto L_0x0e8c
            java.lang.String r2 = "empezar_privado"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0e8c
            android.os.Bundle r0 = r1.f9136J0
            r2 = r21
            java.lang.String r0 = r0.getString(r2)
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r3 = "nombre_remit"
            java.lang.String r2 = r2.getString(r3)
            r1.m8706N(r0, r2)
            goto L_0x0ecf
        L_0x0e8c:
            r2 = r21
            r3 = 0
            r1.f9151R = r3
            boolean r0 = r1.f9126E0
            if (r0 == 0) goto L_0x0e9f
            android.os.Bundle r0 = r1.f9136J0
            if (r0 == 0) goto L_0x0e9f
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x0eb4
        L_0x0e9f:
            british.x.t_chat$a0 r0 = new british.x.t_chat$a0
            android.content.SharedPreferences r3 = r1.f9172m0
            java.lang.String r4 = "idprivado"
            java.lang.String r3 = r3.getString(r4, r12)
            int r4 = r1.f9151R
            r0.<init>(r12, r3, r4)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            r0.execute(r3)
        L_0x0eb4:
            android.os.Bundle r0 = r1.f9136J0
            if (r0 == 0) goto L_0x0ecf
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0ecf
            android.os.Bundle r0 = r1.f9136J0
            java.lang.String r0 = r0.getString(r2)
            android.os.Bundle r2 = r1.f9136J0
            java.lang.String r3 = "nombre_remit"
            java.lang.String r2 = r2.getString(r3)
            r1.mo8482R(r0, r2)
        L_0x0ecf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_chat.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9176o0.f7384n3 == 0 || (cVar3 = this.f9182r0) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9176o0.f7384n3 == 0 || (cVar2 = this.f9182r0) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9176o0.f7384n3 == 0 || (cVar = this.f9182r0) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        m8704I(true);
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9176o0.f7384n3 == 0 || (cVar = this.f9182r0) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        if (isFinishing()) {
            mo8479K();
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2272q());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 107 && i != 109) {
            return;
        }
        if (iArr == null || iArr.length <= 0 || !strArr[0].equals("android.permission.CAMERA") || iArr[0] != 0) {
            C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
        } else if (i == 107) {
            this.f9192w0 = System.currentTimeMillis();
            C1692config config = this.f9176o0;
            config.mo7525s0(this, config.mo7505h0(this, 99));
        } else {
            C1692config config2 = this.f9176o0;
            config2.mo7526t0(this, config2.mo7507i0(this, "dt_foto98_temp.mp4"));
        }
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9174n0 == null) {
            this.f9174n0 = getSharedPreferences("accion", 0);
        }
        SharedPreferences.Editor edit = this.f9174n0.edit();
        edit.putInt("accion", 0);
        edit.commit();
        if (this.f9172m0 == null) {
            this.f9172m0 = getSharedPreferences("sh", 0);
        }
        SharedPreferences.Editor edit2 = this.f9172m0.edit();
        edit2.putBoolean("activa" + this.f9149Q, true);
        edit2.putBoolean("activa", true);
        edit2.commit();
        this.f9172m0.registerOnSharedPreferenceChangeListener(this);
        this.f9174n0.registerOnSharedPreferenceChangeListener(this);
        if (this.f9176o0.f7384n3 != 0 && (cVar = this.f9182r0) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9184s0 = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9184s0) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9184s0 = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Dialog dialog;
        AlertDialog alertDialog;
        if (str.equals("fondo_v_act")) {
            if (!this.f9126E0) {
                C1692config config = this.f9176o0;
                if (config.f7231O1[config.f7318d].f7958v == 0) {
                    try {
                        config.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9176o0.f7145A), this.f9176o0.f7157C);
                        ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                        this.f9176o0.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                        C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
                    } catch (Exception unused) {
                    }
                }
            }
        } else if (!sharedPreferences.contains("accion") || !this.f9120B0) {
            if (sharedPreferences.contains("f2_idfrase")) {
                String string = this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION);
                if (str.equals("f2_ts")) {
                    SharedPreferences sharedPreferences2 = this.f9172m0;
                    if (sharedPreferences2.contains("ban_" + sharedPreferences.getString("f2_id", ""))) {
                        return;
                    }
                    if ((string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && !this.f9167Z) || (!string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && this.f9167Z)) {
                        String string2 = sharedPreferences.getString("f2_idtema", SessionDescription.SUPPORTED_SDP_VERSION);
                        if (string2.equals(this.f9149Q + "") || (!string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && this.f9167Z)) {
                            if (!string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && !string.equals(sharedPreferences.getString("f2_id", ""))) {
                                String string3 = sharedPreferences.getString("f2_id", "");
                                if (!string3.equals(this.f9139L + "")) {
                                    return;
                                }
                            }
                            runOnUiThread(new C2262m(sharedPreferences));
                        }
                    }
                }
            }
        } else if (str.equals("accion")) {
            if (sharedPreferences.getInt("accion", 0) == 1) {
                if (this.f9172m0.getString("idprivado", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION) && this.f9172m0.getInt("privados", 1) == 1 && (((dialog = this.f9180q0) == null || !dialog.isShowing()) && ((alertDialog = this.f9178p0) == null || !alertDialog.isShowing()))) {
                    runOnUiThread(new C2260l());
                }
            } else if (!(sharedPreferences.getInt("accion", 0) == 2 || sharedPreferences.getInt("accion", 0) == 3)) {
                sharedPreferences.getInt("accion", 0);
            }
            if (sharedPreferences.getInt("accion", 0) != 0) {
                SharedPreferences.Editor edit = this.f9174n0.edit();
                edit.putInt("accion", 0);
                edit.commit();
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
        this.f9184s0 = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9184s0 = true;
        C1692config.m8175Y0(this);
    }
}
