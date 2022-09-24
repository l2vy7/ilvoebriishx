package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p273b9.C11188h;
import p311h9.C12773l;
import p314j8.C12796d;
import p316k8.C12819a;
import p318l8.C12831e;

/* renamed from: british.x.t_chat_contra */
public class t_chat_contra extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    int f9305A;

    /* renamed from: B */
    int f9306B;

    /* renamed from: C */
    CheckBox f9307C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ProgressDialog f9308D;

    /* renamed from: E */
    AlertDialog.Builder f9309E;

    /* renamed from: F */
    String f9310F;

    /* renamed from: G */
    EditText f9311G;

    /* renamed from: m */
    C1692config f9312m;

    /* renamed from: n */
    Bundle f9313n;

    /* renamed from: o */
    boolean f9314o = false;

    /* renamed from: p */
    boolean f9315p = false;

    /* renamed from: q */
    boolean f9316q;

    /* renamed from: r */
    boolean f9317r = false;

    /* renamed from: s */
    String f9318s;

    /* renamed from: t */
    String f9319t;

    /* renamed from: u */
    boolean f9320u;

    /* renamed from: v */
    C1603c f9321v;

    /* renamed from: w */
    boolean f9322w = false;

    /* renamed from: x */
    ListView f9323x;

    /* renamed from: y */
    SharedPreferences f9324y;

    /* renamed from: z */
    long f9325z;

    /* renamed from: british.x.t_chat_contra$a */
    class C2283a extends AdColonyInterstitialListener {
        C2283a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_chat_contra t_chat_contra = t_chat_contra.this;
            if (t_chat_contra.f9322w) {
                t_chat_contra.abrir_secc(t_chat_contra.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_chat_contra.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_chat_contra.this.f6661g.cancel();
            t_chat_contra t_chat_contra = t_chat_contra.this;
            t_chat_contra.abrir_secc(t_chat_contra.f6660f);
        }
    }

    /* renamed from: british.x.t_chat_contra$b */
    class C2284b implements SearchManager.OnCancelListener {
        C2284b() {
        }

        public void onCancel() {
            t_chat_contra t_chat_contra = t_chat_contra.this;
            t_chat_contra.f6657c = false;
            t_chat_contra.setResult(0);
        }
    }

    /* renamed from: british.x.t_chat_contra$c */
    class C2285c implements SearchManager.OnDismissListener {
        C2285c() {
        }

        public void onDismiss() {
            t_chat_contra.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_chat_contra$d */
    class C2286d implements DialogInterface.OnClickListener {

        /* renamed from: british.x.t_chat_contra$d$a */
        class C2287a implements DialogInterface.OnShowListener {
            C2287a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) t_chat_contra.this.f9308D.findViewById(16908301), t_chat_contra.this.f6656b);
            }
        }

        C2286d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = t_chat_contra.this.f9324y.edit();
            if (t_chat_contra.this.f9307C.isChecked()) {
                edit.putBoolean("chat" + t_chat_contra.this.f9306B + "_nomostrarmas_def", true);
            } else {
                edit.putBoolean("chat" + t_chat_contra.this.f9306B + "_nomostrarmas_def", false);
            }
            edit.commit();
            t_chat_contra.this.f9308D = new ProgressDialog(t_chat_contra.this);
            t_chat_contra.this.f9308D.setMessage(t_chat_contra.this.getString(R.string.comprobando));
            t_chat_contra.this.f9308D.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20) {
                t_chat_contra.this.f9308D.setOnShowListener(new C2287a());
            }
            t_chat_contra.this.f9308D.show();
            t_chat_contra t_chat_contra = t_chat_contra.this;
            t_chat_contra.f9310F = t_chat_contra.f9311G.getText().toString();
            new C2295j().execute(new String[0]);
        }
    }

    /* renamed from: british.x.t_chat_contra$e */
    class C2288e implements DialogInterface.OnClickListener {
        C2288e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_chat_contra.this.mo8602f(0);
        }
    }

    /* renamed from: british.x.t_chat_contra$f */
    class C2289f implements DialogInterface.OnCancelListener {
        C2289f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            t_chat_contra.this.mo8602f(0);
        }
    }

    /* renamed from: british.x.t_chat_contra$g */
    class C2290g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9333a;

        C2290g(AlertDialog alertDialog) {
            this.f9333a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f9333a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_chat_contra.this.f6656b));
            Button button2 = this.f9333a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_chat_contra.this.f6656b));
        }
    }

    /* renamed from: british.x.t_chat_contra$h */
    class C2291h extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9335a;

        /* renamed from: british.x.t_chat_contra$h$a */
        class C2292a extends FullScreenContentCallback {
            C2292a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_chat_contra t_chat_contra = t_chat_contra.this;
                if (t_chat_contra.f9322w) {
                    t_chat_contra.abrir_secc(t_chat_contra.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_chat_contra t_chat_contra = t_chat_contra.this;
                t_chat_contra.abrir_secc(t_chat_contra.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_chat_contra$h$b */
        class C2293b implements OnUserEarnedRewardListener {
            C2293b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2291h hVar = C2291h.this;
                t_chat_contra.this.f9322w = true;
                C1692config.m8175Y0(hVar.f9335a);
            }
        }

        C2291h(Context context) {
            this.f9335a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_chat_contra.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2292a());
            rewardedAd.show((Activity) this.f9335a, new C2293b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_chat_contra t_chat_contra = t_chat_contra.this;
            if (!t_chat_contra.f9312m.mo7502f(this.f9335a, t_chat_contra.f6663i)) {
                t_chat_contra.this.f6661g.cancel();
                t_chat_contra t_chat_contra2 = t_chat_contra.this;
                t_chat_contra2.abrir_secc(t_chat_contra2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_chat_contra$i */
    class C2294i implements AdDisplayListener {
        C2294i() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_chat_contra t_chat_contra = t_chat_contra.this;
            if (t_chat_contra.f9322w) {
                t_chat_contra.abrir_secc(t_chat_contra.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_chat_contra$j */
    private class C2295j extends AsyncTask<String, Void, Byte> {
        private C2295j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/comprobar_contra.php?v=1&idapp=" + 2261075 + "&idusu=" + t_chat_contra.this.f9325z + "&idchat=" + t_chat_contra.this.f9306B);
            StringBuilder sb = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C12773l("contra", t_chat_contra.this.f9310F));
                eVar.mo47986B(new C12819a(arrayList));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.indexOf("ANDROID:KO") != -1) {
                    return (byte) 2;
                }
                if (sb.indexOf("ANDROID:OK") != -1) {
                    return (byte) 1;
                }
                return (byte) 0;
            } catch (C12796d unused) {
                return (byte) 0;
            } catch (IOException unused2) {
                return (byte) 0;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                t_chat_contra.this.f9308D.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                SharedPreferences sharedPreferences = t_chat_contra.this.f9324y;
                if (sharedPreferences.getBoolean("chat" + t_chat_contra.this.f9306B + "_nomostrarmas_def", true)) {
                    SharedPreferences.Editor edit = t_chat_contra.this.f9324y.edit();
                    edit.putBoolean("chat" + t_chat_contra.this.f9306B + "_validado", true);
                    edit.commit();
                }
                t_chat_contra.this.mo8601e();
            } else if (b.byteValue() == 2) {
                t_chat_contra t_chat_contra = t_chat_contra.this;
                t_chat_contra.f9315p = true;
                t_chat_contra.mo8603g();
            } else {
                t_chat_contra.this.mo8602f(1);
            }
        }
    }

    /* renamed from: c */
    private void m8774c(Context context) {
        this.f6662h = new C2291h(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9312m.mo7510j0(view, this);
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
                    if (this.f9312m.f7427t4 != 2) {
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
    public void mo8600d() {
        int q0 = this.f9312m.mo7522q0(this);
        int i = this.f9312m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9323x = listView;
            this.f9312m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9312m.f7231O1;
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
            int[] iArr = this.f9312m.f7249R1;
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
    /* renamed from: e */
    public void mo8601e() {
        Intent intent;
        Bundle bundle = this.f9313n;
        if (bundle != null && bundle.containsKey("clase")) {
            Class cls = null;
            int i = this.f9313n.getInt("clase");
            if (i == 1) {
                cls = t_url.class;
            } else if (i == 2) {
                cls = t_html.class;
            } else if (i == 3) {
                cls = t_and.class;
            } else if (i == 4) {
                cls = t_oficinas.class;
            } else if (i == 5) {
                cls = t_buscador.class;
            } else if (i == 6) {
                if (this.f9312m.f7231O1[this.f9305A].f7868L == 0) {
                    cls = t_video.class;
                } else {
                    cls = t_video_exoplayer.class;
                }
            } else if (i == 7) {
                cls = t_radio.class;
            } else if (i == 8) {
                cls = t_rss.class;
            } else if (i == 10) {
                if (this.f9312m.f7231O1[this.f9305A].f7863I0 > 0) {
                    cls = t_buscchats_lista.class;
                } else {
                    cls = t_buscchats.class;
                }
            } else if (i == 11) {
                cls = t_buscusus.class;
            } else if (i == 12) {
                cls = t_submenu.class;
            } else if (i == 22) {
                cls = t_submenu_ultimas.class;
            } else if (i == 13) {
                cls = t_gal.class;
            } else if (i == 14) {
                cls = t_card.class;
            } else if (i == 16) {
                cls = t_buscvideos.class;
            } else if (i == 19) {
                cls = t_vistafb.class;
            } else if (i == 20) {
                cls = t_qr.class;
            }
            if (cls != null) {
                if (i == 4) {
                    intent = this.f9312m.mo7527u0(this).f7842a;
                } else if (i == 5) {
                    intent = this.f9312m.mo7528v0(this).f7842a;
                } else {
                    Intent intent2 = new Intent(this, cls);
                    intent2.putExtras(this.f9313n);
                    intent = intent2;
                }
                this.f6659e = false;
                this.f9314o = true;
                startActivityForResult(intent, 0);
            }
        } else if (this.f9324y.getString("nick", "").equals("") || (this.f9312m.f7393o5 == 3 && !this.f9324y.getBoolean("email_confirmado", false))) {
            Intent intent3 = new Intent(this, chat_perfil.class);
            if (this.f9316q) {
                intent3 = C1692config.m8198r(intent3, this.f9313n);
            } else {
                intent3.putExtra("idsecc", this.f9306B);
            }
            boolean z = this.f6659e;
            if (z) {
                intent3.putExtra("es_root", z);
            }
            this.f6659e = false;
            this.f9314o = true;
            startActivityForResult(intent3, 0);
        } else if ((((!this.f9316q || this.f9313n.getInt("fotos_perfil") != 2) && (this.f9316q || this.f9312m.f7231O1[this.f9305A].f7849B0 != 2)) || this.f9312m.mo7516l0(this, 1).exists()) && ((((!this.f9316q || this.f9313n.getInt("fnac") != 2) && (this.f9316q || this.f9312m.f7231O1[this.f9305A].f7851C0 != 2)) || !(this.f9324y.getInt("fnac_d", 0) == 0 || this.f9324y.getInt("fnac_m", 0) == 0 || this.f9324y.getInt("fnac_a", 0) == 0)) && ((((!this.f9316q || this.f9313n.getInt("sexo") != 2) && (this.f9316q || this.f9312m.f7231O1[this.f9305A].f7853D0 != 2)) || this.f9324y.getInt("sexo", 0) != 0) && (((!this.f9316q || this.f9313n.getInt("descr") != 2) && (this.f9316q || this.f9312m.f7231O1[this.f9305A].f7855E0 != 2)) || !this.f9324y.getString("descr", "").equals(""))))) {
            Intent intent4 = new Intent(this, t_chat.class);
            if (this.f9316q) {
                intent4 = C1692config.m8198r(intent4, this.f9313n);
                if (this.f9313n.containsKey("tit_cab")) {
                    intent4.putExtra("tit_cab", this.f9313n.getString("tit_cab"));
                }
            } else {
                intent4.putExtra("idsecc", this.f9306B);
            }
            boolean z2 = this.f6659e;
            if (z2) {
                intent4.putExtra("es_root", z2);
            }
            this.f6659e = false;
            Bundle bundle2 = this.f9313n;
            if (!(bundle2 == null || bundle2.getString("id_remit") == null)) {
                intent4.putExtra("id_remit", this.f9313n.getString("id_remit"));
                intent4.putExtra("nombre_remit", this.f9313n.getString("nombre_remit"));
                if (this.f9313n.containsKey("empezar_privado")) {
                    intent4.putExtra("empezar_privado", true);
                }
            }
            this.f9314o = true;
            startActivityForResult(intent4, 0);
        } else {
            Intent intent5 = new Intent(this, preperfil.class);
            if (this.f9316q) {
                intent5 = C1692config.m8198r(intent5, this.f9313n);
            } else {
                intent5.putExtra("idsecc", this.f9306B);
            }
            boolean z3 = this.f6659e;
            if (z3) {
                intent5.putExtra("es_root", z3);
            }
            this.f6659e = false;
            this.f9314o = true;
            startActivityForResult(intent5, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8602f(int i) {
        TextView textView = (TextView) findViewById(R.id.message_text);
        if (i == 0) {
            textView.setText(R.string.chat_contra_necesaria);
        } else if (i == 1) {
            textView.setText(R.string.error_http);
        }
        textView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8603g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        this.f9309E = builder;
        builder.setTitle(getResources().getString(R.string.chat_acceso));
        View inflate = getLayoutInflater().inflate(R.layout.contra, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(getResources().getString(R.string.chat_introduce_contra));
        this.f9311G = (EditText) inflate.findViewById(R.id.et_contra);
        if (this.f9315p) {
            inflate.findViewById(R.id.message_error).setVisibility(0);
        }
        this.f9307C = (CheckBox) inflate.findViewById(R.id.skip);
        if (!this.f6656b.equals("")) {
            EditText editText = this.f9311G;
            C1692config.m8150F(editText, Boolean.valueOf(!C1692config.m8153I("#" + this.f9318s)), this.f6656b);
            C1692config.m8197q(this.f9307C, this.f6656b);
        }
        CheckBox checkBox = this.f9307C;
        SharedPreferences sharedPreferences = this.f9324y;
        checkBox.setChecked(sharedPreferences.getBoolean("chat" + this.f9306B + "_nomostrarmas_def", true));
        this.f9309E.setView(inflate);
        this.f9309E.setCancelable(true);
        this.f9309E.setPositiveButton(getString(R.string.aceptar), new C2286d());
        this.f9309E.setNegativeButton(getString(R.string.cancelar), new C2288e());
        this.f9309E.setOnCancelListener(new C2289f());
        AlertDialog create = this.f9309E.create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C2290g(create));
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
            z = true;
        }
        if (!z && this.f9314o) {
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9322w) {
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
        if (!this.f6659e || this.f9317r || !this.f9312m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9317r = true;
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
        String str9 = this.f9312m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9312m.f7281W3) == null || str.equals("")) && (((str2 = this.f9312m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9312m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9312m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9312m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9312m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9312m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9312m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9312m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9312m.f7251R3);
        }
        String str11 = this.f9312m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9312m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9312m.f7269U3);
        }
        String str13 = this.f9312m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9312m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f9314o = bundle.getBoolean("finalizar_2", false);
        }
        C1692config config = (C1692config) getApplicationContext();
        this.f9312m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8774c(this);
        this.f6666l = new C2283a();
        Bundle extras = getIntent().getExtras();
        this.f9313n = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9313n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        Bundle bundle2 = this.f9313n;
        boolean z = bundle2 != null && bundle2.containsKey("externo");
        this.f9316q = z;
        if (z) {
            this.f9318s = this.f9313n.getString("c1");
            this.f9319t = this.f9313n.getString("c2");
        } else {
            int i = this.f9313n.getInt("ind");
            this.f9305A = i;
            C1855l[] lVarArr = this.f9312m.f7231O1;
            this.f9318s = lVarArr[i].f7916g;
            this.f9319t = lVarArr[i].f7919h;
            this.f9306B = lVarArr[i].f7964y;
        }
        this.f9320u = C1692config.m8153I("#" + this.f9318s);
        this.f6656b = C1692config.m8189h(this.f9318s, this.f9312m.f7368l1);
        if (Build.VERSION.SDK_INT > 12 && !this.f9320u) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_chat_contra);
        mo8600d();
        this.f9312m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2284b());
        searchManager.setOnDismissListener(new C2285c());
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9324y = sharedPreferences;
        this.f9325z = sharedPreferences.getLong("idusu", 0);
        if (!this.f9318s.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f9318s), Color.parseColor("#" + this.f9319t)}));
            if (C1692config.m8153I("#" + this.f9318s)) {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-16777216);
            } else {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-1);
            }
        }
        if (!this.f9316q) {
            SharedPreferences sharedPreferences2 = this.f9324y;
            if (!sharedPreferences2.getBoolean("chat" + this.f9306B + "_validado", true)) {
                mo8603g();
                return;
            }
        }
        if (bundle == null) {
            mo8601e();
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9312m.f7384n3 == 0 || (cVar3 = this.f9321v) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9312m.f7384n3 == 0 || (cVar2 = this.f9321v) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9312m.f7384n3 == 0 || (cVar = this.f9321v) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f9312m.f7384n3 == 0 || (cVar = this.f9321v) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2294i());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9312m.f7384n3 != 0 && (cVar = this.f9321v) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9322w = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9322w) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9322w = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("finalizar_2", this.f9314o);
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
        this.f9322w = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9322w = true;
        C1692config.m8175Y0(this);
    }
}
