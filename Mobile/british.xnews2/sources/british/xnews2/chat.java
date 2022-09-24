package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
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
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
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
import java.io.InputStreamReader;
import java.net.URLEncoder;
import p272b9.C11188h;
import p312i9.C12788b;
import p312i9.C12789c;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12982f;

public class chat extends Activity_ext_class implements C1592a, View.OnKeyListener, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f6897m;

    /* renamed from: n */
    private int f6898n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f6899o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public SharedPreferences f6900p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1692config f6901q;

    /* renamed from: r */
    boolean f6902r = false;

    /* renamed from: s */
    Bundle f6903s;

    /* renamed from: t */
    C1603c f6904t;

    /* renamed from: u */
    boolean f6905u = false;

    /* renamed from: v */
    ListView f6906v;

    /* renamed from: british.xnews2.chat$a */
    class C1609a extends AdColonyInterstitialListener {
        C1609a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            chat chat = chat.this;
            if (chat.f6905u) {
                chat.abrir_secc(chat.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            chat.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            chat.this.f6661g.cancel();
            chat chat = chat.this;
            chat.abrir_secc(chat.f6660f);
        }
    }

    /* renamed from: british.xnews2.chat$b */
    class C1610b implements SearchManager.OnCancelListener {
        C1610b() {
        }

        public void onCancel() {
            chat chat = chat.this;
            chat.f6657c = false;
            chat.setResult(0);
        }
    }

    /* renamed from: british.xnews2.chat$c */
    class C1611c implements SearchManager.OnDismissListener {
        C1611c() {
        }

        public void onDismiss() {
            chat.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.chat$d */
    class C1612d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f6910b;

        /* renamed from: british.xnews2.chat$d$a */
        class C1613a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f6912a;

            C1613a(AlertDialog alertDialog) {
                this.f6912a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f6912a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            }
        }

        C1612d(EditText editText) {
            this.f6910b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f6910b.getText().toString();
            if (!obj.equals("")) {
                SharedPreferences.Editor edit = chat.this.f6900p.edit();
                edit.putString("nombre", obj);
                edit.commit();
                ((EditText) chat.this.findViewById(R.id.c_mensaje)).setTextColor(-7829368);
                chat.this.findViewById(R.id.pb_chat_env).setVisibility(0);
                chat chat = chat.this;
                new C1621i(chat.f6899o).execute(new String[0]);
                return;
            }
            AlertDialog create = new AlertDialog.Builder(chat.this).setPositiveButton(chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.falta_nombre).create();
            if (!chat.this.f6656b.equals("")) {
                create.setOnShowListener(new C1613a(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.xnews2.chat$e */
    class C1614e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f6914a;

        C1614e(AlertDialog alertDialog) {
            this.f6914a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f6914a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            Button button2 = this.f6914a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + chat.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.chat$f */
    class C1615f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ SharedPreferences f6916b;

        /* renamed from: british.xnews2.chat$f$a */
        class C1616a implements Runnable {
            C1616a() {
            }

            public void run() {
                ((ScrollView) chat.this.findViewById(R.id.sv_chat)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        }

        C1615f(SharedPreferences sharedPreferences) {
            this.f6916b = sharedPreferences;
        }

        public void run() {
            LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) chat.this.getSystemService("layout_inflater")).inflate(R.layout.frase, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(R.id.message_text);
            textView.setText(this.f6916b.getString("f_frase", "").replace("XYARROBAYX", "@"));
            String string = this.f6916b.getString("f_id", "");
            if (string.equals(chat.this.f6897m + "")) {
                textView.setBackgroundResource(R.drawable.speech_bubble_gray);
            } else {
                textView.setBackgroundResource(R.drawable.speech_bubble_green);
            }
            LinearLayout linearLayout2 = (LinearLayout) chat.this.findViewById(R.id.llchat);
            linearLayout2.addView(linearLayout);
            ScrollView scrollView = (ScrollView) chat.this.findViewById(R.id.sv_chat);
            if (linearLayout2.getMeasuredHeight() <= scrollView.getScrollY() + scrollView.getHeight()) {
                scrollView.post(new C1616a());
            }
        }
    }

    /* renamed from: british.xnews2.chat$g */
    class C1617g extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f6919a;

        /* renamed from: british.xnews2.chat$g$a */
        class C1618a extends FullScreenContentCallback {
            C1618a() {
            }

            public void onAdDismissedFullScreenContent() {
                chat chat = chat.this;
                if (chat.f6905u) {
                    chat.abrir_secc(chat.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                chat chat = chat.this;
                chat.abrir_secc(chat.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.chat$g$b */
        class C1619b implements OnUserEarnedRewardListener {
            C1619b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1617g gVar = C1617g.this;
                chat.this.f6905u = true;
                C1692config.m8175Y0(gVar.f6919a);
            }
        }

        C1617g(Context context) {
            this.f6919a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            chat.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1618a());
            rewardedAd.show((Activity) this.f6919a, new C1619b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (!chat.this.f6901q.mo7502f(this.f6919a, chat.this.f6663i)) {
                chat.this.f6661g.cancel();
                chat chat = chat.this;
                chat.abrir_secc(chat.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.chat$h */
    class C1620h implements AdDisplayListener {
        C1620h() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            chat chat = chat.this;
            if (chat.f6905u) {
                chat.abrir_secc(chat.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.chat$i */
    private class C1621i extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f6924a;

        /* renamed from: british.xnews2.chat$i$a */
        class C1622a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f6926a;

            C1622a(AlertDialog alertDialog) {
                this.f6926a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f6926a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat$i$b */
        class C1623b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f6928a;

            C1623b(AlertDialog alertDialog) {
                this.f6928a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f6928a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat$i$c */
        class C1624c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f6930a;

            C1624c(AlertDialog alertDialog) {
                this.f6930a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f6930a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.chat$i$d */
        class C1625d implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f6932a;

            C1625d(AlertDialog alertDialog) {
                this.f6932a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f6932a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + chat.this.f6656b));
            }
        }

        public C1621i(String str) {
            this.f6924a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviarmensaje.php");
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("idusu", new C12982f(chat.this.f6897m + ""));
                gVar.mo48144c("idapp", new C12982f("2260177"));
                gVar.mo48144c("nombre", new C12982f(URLEncoder.encode(chat.this.f6900p.getString("nombre", ""), C6540C.UTF8_NAME)));
                gVar.mo48144c("m", new C12982f(URLEncoder.encode(this.f6924a, C6540C.UTF8_NAME)));
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
            AlertDialog.Builder builder = new AlertDialog.Builder(chat.this);
            try {
                chat.this.findViewById(R.id.pb_chat_env).setVisibility(8);
                ((EditText) chat.this.findViewById(R.id.c_mensaje)).setTextColor(-16777216);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK") == -1 && str.indexOf("ANDROID:KO") == -1) {
                AlertDialog create = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!chat.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1625d(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else if (str.indexOf("ANDROID:OK") != -1) {
                ((EditText) chat.this.findViewById(R.id.c_mensaje)).setText("");
                SharedPreferences.Editor edit = chat.this.f6900p.edit();
                String string = chat.this.f6900p.getString("conv", "");
                edit.putString("conv", string + "@" + chat.this.f6897m + "@" + this.f6924a);
                StringBuilder sb = new StringBuilder();
                sb.append(chat.this.f6897m);
                sb.append("");
                edit.putString("f_id", sb.toString());
                edit.putString("f_frase", this.f6924a);
                edit.putString("f_idfrase", C1692config.f7110J5 + "");
                C1692config.f7110J5 = C1692config.f7110J5 + 1;
                edit.commit();
                if (chat.this.f6900p.getBoolean("primer_msg_chat", true)) {
                    edit.putBoolean("primer_msg_chat", false);
                    edit.commit();
                    AlertDialog create2 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.primer_msg_chat).create();
                    if (!chat.this.f6656b.equals("")) {
                        create2.setOnShowListener(new C1622a(create2));
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                AlertDialog create3 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.nogcm).create();
                if (!chat.this.f6656b.equals("")) {
                    create3.setOnShowListener(new C1623b(create3));
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                AlertDialog create4 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!chat.this.f6656b.equals("")) {
                    create4.setOnShowListener(new C1624c(create4));
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: e */
    private void m8099e(Context context) {
        this.f6662h = new C1617g(context);
    }

    /* renamed from: f */
    private void m8100f(boolean z) {
        String obj = ((EditText) findViewById(R.id.c_mensaje)).getText().toString();
        this.f6899o = obj;
        String trim = obj.trim();
        this.f6899o = trim;
        if (!trim.equals("")) {
            if (z && this.f6898n < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((EditText) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            if (this.f6900p.getString("nombre", "").equals("")) {
                EditText editText = new EditText(this);
                editText.setSingleLine();
                editText.setInputType(8193);
                if (!this.f6656b.equals("")) {
                    C1692config.m8150F(editText, Boolean.valueOf(!C1692config.m8153I("#" + this.f6901q.f7355j1)), this.f6656b);
                }
                AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(getString(R.string.cancelar), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.aceptar), new C1612d(editText)).setMessage(R.string.pon_nombre).setView(editText).create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1614e(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else {
                ((EditText) findViewById(R.id.c_mensaje)).setTextColor(-7829368);
                findViewById(R.id.pb_chat_env).setVisibility(0);
                new C1621i(this.f6899o).execute(new String[0]);
            }
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f6901q.mo7510j0(view, this);
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
                    if (this.f6901q.f7427t4 != 2) {
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
    /* renamed from: g */
    public void mo7325g() {
        SharedPreferences.Editor edit = this.f6900p.edit();
        edit.putBoolean("activa", false);
        edit.commit();
        this.f6900p.unregisterOnSharedPreferenceChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7326h() {
        int q0 = this.f6901q.mo7522q0(this);
        int i = this.f6901q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f6906v = listView;
            this.f6901q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f6901q.f7231O1;
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
            int[] iArr = this.f6901q.f7249R1;
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
        if (this.f6905u) {
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
        if (!this.f6659e || this.f6902r || !this.f6901q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f6902r = true;
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
        if (view.getId() == R.id.iv_env) {
            m8100f(false);
            return;
        }
        String str9 = this.f6901q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f6901q.f7281W3) == null || str.equals("")) && (((str2 = this.f6901q.f7250R2) == null || str2.equals("")) && (((str3 = this.f6901q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f6901q.f7269U3) == null || str4.equals("")) && (((str5 = this.f6901q.f7275V3) == null || str5.equals("")) && (((str6 = this.f6901q.f7358j4) == null || str6.equals("")) && (((str7 = this.f6901q.f7287X3) == null || str7.equals("")) && ((str8 = this.f6901q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f6901q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f6901q.f7251R3);
        }
        String str11 = this.f6901q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f6901q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f6901q.f7269U3);
        }
        String str13 = this.f6901q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f6901q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int indexOf;
        int i;
        String str;
        Bundle bundle2 = bundle;
        C1692config config = (C1692config) getApplicationContext();
        this.f6901q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8099e(this);
        this.f6666l = new C1609a();
        C1692config config2 = this.f6901q;
        this.f6656b = C1692config.m8189h(config2.f7355j1, config2.f7417s1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 12) {
            if (!C1692config.m8153I("#" + this.f6901q.f7355j1)) {
                setTheme(R.style.holonolight);
            }
        }
        Bundle extras = getIntent().getExtras();
        this.f6903s = extras;
        if (bundle2 == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f6903s.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        super.onCreate(bundle);
        setContentView(R.layout.chat);
        mo7326h();
        this.f6901q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1610b());
        searchManager.setOnDismissListener(new C1611c());
        if (bundle2 == null) {
            C1692config config3 = this.f6901q;
            Bundle bundle3 = this.f6903s;
            boolean z = bundle3 != null && bundle3.containsKey("ad_entrar");
            Bundle bundle4 = this.f6903s;
            config3.mo7503f1(this, z, bundle4 != null && bundle4.containsKey("fb_entrar"));
        }
        this.f6904t = this.f6901q.mo7474A0(this, false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f6900p = sharedPreferences;
        this.f6897m = sharedPreferences.getLong("idusu", 0);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (i2 >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f6898n = point.y;
        } else {
            this.f6898n = defaultDisplay.getHeight();
        }
        if (!this.f6901q.f7355j1.equals("")) {
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#" + this.f6901q.f7355j1), Color.parseColor("#" + this.f6901q.f7361k1)}));
        }
        if (!this.f6901q.f7396p1.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.chat_contactar);
            drawable.setColorFilter(Color.parseColor("#" + this.f6901q.f7396p1), PorterDuff.Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_chat)).setImageDrawable(drawable);
        }
        if (!this.f6901q.f7382n1.equals("")) {
            ((TextView) findViewById(R.id.tv_tit)).setTextColor(Color.parseColor("#" + this.f6901q.f7382n1));
        }
        if (!this.f6901q.f7389o1.equals("")) {
            findViewById(R.id.v_sep).setBackgroundColor(Color.parseColor("#" + this.f6901q.f7389o1));
        }
        if (i2 > 20) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_chat_env), this.f6901q.f7417s1);
        }
        findViewById(R.id.iv_env).setOnClickListener(this);
        if (i2 > 20) {
            C1692config.m8150F((EditText) findViewById(R.id.c_mensaje), Boolean.FALSE, this.f6901q.f7417s1);
        } else {
            ((EditText) findViewById(R.id.c_mensaje)).setTextColor(-16777216);
        }
        findViewById(R.id.c_mensaje).setOnKeyListener(this);
        if (C1692config.m8153I("#" + this.f6901q.f7417s1)) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.btn_enviar);
        drawable2.setColorFilter(Color.parseColor("#" + this.f6901q.f7417s1), PorterDuff.Mode.MULTIPLY);
        ((ImageView) findViewById(R.id.iv_env)).setImageDrawable(drawable2);
        this.f6900p.registerOnSharedPreferenceChangeListener(this);
        String string = this.f6900p.getString("conv", "");
        if (!string.equals("")) {
            SharedPreferences.Editor edit = this.f6900p.edit();
            edit.putString("f_idfrase", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.commit();
            for (int i3 = 0; i3 != -1; i3 = indexOf) {
                int i4 = i3 + 1;
                int indexOf2 = string.indexOf("@0@", i4);
                indexOf = string.indexOf("@" + this.f6897m + "@", i4);
                if (indexOf2 != -1 && indexOf != -1) {
                    indexOf = Math.min(indexOf2, indexOf);
                } else if (indexOf2 != -1) {
                    indexOf = indexOf2;
                } else if (indexOf == -1) {
                    indexOf = -1;
                }
                if (string.substring(i3, i3 + 3).equals("@0@")) {
                    edit.putString("f_id", SessionDescription.SUPPORTED_SDP_VERSION);
                    i = 3;
                } else {
                    edit.putString("f_id", this.f6897m + "");
                    i = (this.f6897m + "").length() + 2;
                }
                edit.putString("f_idfrase", C1692config.f7110J5 + "");
                if (indexOf != -1) {
                    str = string.substring(i3 + i, indexOf);
                } else {
                    str = string.substring(i3 + i);
                }
                edit.putString("f_frase", str);
                edit.commit();
                C1692config.f7110J5++;
            }
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f6901q.f7384n3 == 0 || (cVar3 = this.f6904t) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f6901q.f7384n3 == 0 || (cVar2 = this.f6904t) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f6901q.f7384n3 == 0 || (cVar = this.f6904t) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        m8100f(true);
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f6901q.f7384n3 == 0 || (cVar = this.f6904t) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        mo7325g();
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1620h());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        SharedPreferences.Editor edit = this.f6900p.edit();
        edit.putBoolean("activa", true);
        edit.commit();
        this.f6900p.registerOnSharedPreferenceChangeListener(this);
        if (this.f6901q.f7384n3 != 0 && (cVar = this.f6904t) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f6905u = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f6905u) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f6905u = true;
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
        if (sharedPreferences.contains("f_idfrase") && str.equals("f_idfrase") && !sharedPreferences.getString("f_idfrase", SessionDescription.SUPPORTED_SDP_VERSION).equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            runOnUiThread(new C1615f(sharedPreferences));
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f6905u = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f6905u = true;
        C1692config.m8175Y0(this);
    }
}
