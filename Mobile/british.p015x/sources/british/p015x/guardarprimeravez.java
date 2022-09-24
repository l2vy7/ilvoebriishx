package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

/* renamed from: british.x.guardarprimeravez */
public class guardarprimeravez extends Activity {

    /* renamed from: b */
    ProgressDialog f7793b;

    /* renamed from: c */
    SharedPreferences f7794c;

    /* renamed from: d */
    Bundle f7795d;

    /* renamed from: e */
    String f7796e;

    /* renamed from: f */
    long f7797f;

    /* renamed from: g */
    int f7798g;

    /* renamed from: h */
    boolean f7799h;

    /* renamed from: i */
    boolean f7800i;

    /* renamed from: j */
    boolean f7801j;

    /* renamed from: k */
    C1692config f7802k;

    /* renamed from: l */
    Activity f7803l;

    /* renamed from: british.x.guardarprimeravez$a */
    class C1829a implements DialogInterface.OnShowListener {
        C1829a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            C1692config.m8168S0((ProgressBar) guardarprimeravez.this.f7793b.findViewById(16908301), guardarprimeravez.this.f7802k.f7368l1);
        }
    }

    /* renamed from: british.x.guardarprimeravez$b */
    private class C1830b extends AsyncTask<String, Void, Byte> {

        /* renamed from: british.x.guardarprimeravez$b$a */
        class C1831a implements DialogInterface.OnClickListener {
            C1831a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(guardarprimeravez.this, chat_perfil.class);
                guardarprimeravez guardarprimeravez = guardarprimeravez.this;
                if (guardarprimeravez.f7799h) {
                    intent = C1692config.m8198r(intent, guardarprimeravez.f7795d);
                } else {
                    intent.putExtra("idsecc", guardarprimeravez.f7798g);
                }
                guardarprimeravez guardarprimeravez2 = guardarprimeravez.this;
                if (guardarprimeravez2.f7802k.f7427t4 != 2 || guardarprimeravez2.f7801j) {
                    intent.putExtra("es_root", true);
                }
                intent.putExtra("desde_main", guardarprimeravez.this.f7800i);
                intent.putExtra("desde_main_oblig", guardarprimeravez.this.f7801j);
                Bundle bundle = guardarprimeravez.this.f7795d;
                if (bundle != null) {
                    intent.putExtra("desde_buscusus", bundle.getBoolean("desde_buscusus", false));
                    intent.putExtra("desde_buscvideos", guardarprimeravez.this.f7795d.getBoolean("desde_buscvideos", false));
                    intent.putExtra("desde_foro", guardarprimeravez.this.f7795d.getBoolean("desde_foro", false));
                    intent.putExtra("desde_game", guardarprimeravez.this.f7795d.getBoolean("desde_game", false));
                    intent.putExtra("desde_px", guardarprimeravez.this.f7795d.getBoolean("desde_px", false));
                    intent.putExtra("desde_video", guardarprimeravez.this.f7795d.getBoolean("desde_video", false));
                    intent.putExtra("desde_radio", guardarprimeravez.this.f7795d.getBoolean("desde_radio", false));
                    intent.putExtra("desde_quiz", guardarprimeravez.this.f7795d.getBoolean("desde_quiz", false));
                    intent.putExtra("desde_vistafb", guardarprimeravez.this.f7795d.getBoolean("desde_vistafb", false));
                }
                intent.putExtra("nocompletar", true);
                guardarprimeravez.this.startActivity(intent);
            }
        }

        /* renamed from: british.x.guardarprimeravez$b$b */
        class C1832b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7807a;

            C1832b(AlertDialog alertDialog) {
                this.f7807a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7807a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + guardarprimeravez.this.f7796e));
            }
        }

        /* renamed from: british.x.guardarprimeravez$b$c */
        class C1833c implements DialogInterface.OnClickListener {
            C1833c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(guardarprimeravez.this, chat_perfil.class);
                guardarprimeravez guardarprimeravez = guardarprimeravez.this;
                if (guardarprimeravez.f7799h) {
                    intent = C1692config.m8198r(intent, guardarprimeravez.f7795d);
                } else {
                    intent.putExtra("idsecc", guardarprimeravez.f7798g);
                }
                guardarprimeravez guardarprimeravez2 = guardarprimeravez.this;
                if (guardarprimeravez2.f7802k.f7427t4 != 2 || guardarprimeravez2.f7801j) {
                    intent.putExtra("es_root", true);
                }
                intent.putExtra("desde_main", guardarprimeravez.this.f7800i);
                intent.putExtra("desde_main_oblig", guardarprimeravez.this.f7801j);
                Bundle bundle = guardarprimeravez.this.f7795d;
                if (bundle != null) {
                    intent.putExtra("desde_buscusus", bundle.getBoolean("desde_buscusus", false));
                    intent.putExtra("desde_buscvideos", guardarprimeravez.this.f7795d.getBoolean("desde_buscvideos", false));
                    intent.putExtra("desde_foro", guardarprimeravez.this.f7795d.getBoolean("desde_foro", false));
                    intent.putExtra("desde_game", guardarprimeravez.this.f7795d.getBoolean("desde_game", false));
                    intent.putExtra("desde_px", guardarprimeravez.this.f7795d.getBoolean("desde_px", false));
                    intent.putExtra("desde_video", guardarprimeravez.this.f7795d.getBoolean("desde_video", false));
                    intent.putExtra("desde_radio", guardarprimeravez.this.f7795d.getBoolean("desde_radio", false));
                    intent.putExtra("desde_quiz", guardarprimeravez.this.f7795d.getBoolean("desde_quiz", false));
                    intent.putExtra("desde_vistafb", guardarprimeravez.this.f7795d.getBoolean("desde_vistafb", false));
                }
                guardarprimeravez.this.startActivity(intent);
            }
        }

        /* renamed from: british.x.guardarprimeravez$b$d */
        class C1834d implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7810a;

            C1834d(AlertDialog alertDialog) {
                this.f7810a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7810a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + guardarprimeravez.this.f7796e));
            }
        }

        private C1830b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:29|30|34|35|36|37) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x02e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x02e9 */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x02f4 A[Catch:{ Exception -> 0x0348 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0335 A[Catch:{ Exception -> 0x0348 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r26) {
            /*
                r25 = this;
                r1 = r25
                java.lang.String r0 = " TRANS:"
                java.lang.String r2 = " EMAIL:"
                java.lang.String r3 = "y"
                java.lang.String r4 = "coments"
                java.lang.String r5 = "sexo"
                java.lang.String r6 = "fnac_a"
                java.lang.String r7 = "fnac_m"
                java.lang.String r8 = "fnac_d"
                java.lang.String r9 = "contra"
                java.lang.String r10 = "privados"
                java.lang.String r11 = "descr"
                java.lang.String r12 = "x"
                java.lang.String r13 = "cod_g"
                java.lang.String r14 = "UTF-8"
                java.lang.String r15 = ""
                r16 = 2
                r26 = r0
                i9.b r0 = new i9.b     // Catch:{ Exception -> 0x0348 }
                r0.<init>()     // Catch:{ Exception -> 0x0348 }
                r17 = r2
                r2 = 10000(0x2710, float:1.4013E-41)
                p313i9.C12789c.m54266h(r0, r2)     // Catch:{ Exception -> 0x0348 }
                r2 = 20000(0x4e20, float:2.8026E-41)
                p313i9.C12789c.m54267i(r0, r2)     // Catch:{ Exception -> 0x0348 }
                b9.h r2 = new b9.h     // Catch:{ Exception -> 0x0348 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0348 }
                l8.e r0 = new l8.e     // Catch:{ Exception -> 0x0348 }
                r18 = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r2.<init>()     // Catch:{ Exception -> 0x0348 }
                r19 = r3
                java.lang.String r3 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x0348 }
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = "/srv/guardar_primeravez.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                r20 = r4
                long r3 = r3.f7797f     // Catch:{ Exception -> 0x0348 }
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = "&idapp="
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                r3 = 2261075(0x228053, float:3.168441E-39)
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = "&idl="
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r3.getLanguage()     // Catch:{ Exception -> 0x0348 }
                r2.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0348 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0348 }
                x8.g r2 = new x8.g     // Catch:{ Exception -> 0x0348 }
                x8.d r3 = p338x8.C12957d.BROWSER_COMPATIBLE     // Catch:{ Exception -> 0x0348 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r3.getString(r13, r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r14)     // Catch:{ Exception -> 0x0348 }
                y8.f r4 = new y8.f     // Catch:{ Exception -> 0x0348 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r13, r4)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = "nick"
                java.lang.String r3 = r3.getString(r4, r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r14)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = "nombre"
                r21 = r13
                y8.f r13 = new y8.f     // Catch:{ Exception -> 0x0348 }
                r13.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r4, r13)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                british.x.config r4 = r3.f7802k     // Catch:{ Exception -> 0x0348 }
                int r4 = r4.f7393o5     // Catch:{ Exception -> 0x0348 }
                java.lang.String r13 = "email_confirmado"
                r22 = r0
                r0 = 3
                r23 = r12
                java.lang.String r12 = "email"
                r24 = r5
                r5 = 0
                if (r4 != r0) goto L_0x00f3
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                boolean r3 = r3.getBoolean(r13, r5)     // Catch:{ Exception -> 0x0348 }
                if (r3 != 0) goto L_0x00f3
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r3.getString(r12, r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r14)     // Catch:{ Exception -> 0x0348 }
                y8.f r4 = new y8.f     // Catch:{ Exception -> 0x0348 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r12, r4)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.os.Bundle r3 = r3.f7795d     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r3.getString(r9, r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r14)     // Catch:{ Exception -> 0x0348 }
                y8.f r4 = new y8.f     // Catch:{ Exception -> 0x0348 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r9, r4)     // Catch:{ Exception -> 0x0348 }
            L_0x00f3:
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r3.getString(r11, r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r14)     // Catch:{ Exception -> 0x0348 }
                y8.f r4 = new y8.f     // Catch:{ Exception -> 0x0348 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r11, r4)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r9 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r9 = r9.f7794c     // Catch:{ Exception -> 0x0348 }
                r11 = 1
                int r9 = r9.getInt(r10, r11)     // Catch:{ Exception -> 0x0348 }
                r4.append(r9)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r10, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r9 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r9 = r9.f7794c     // Catch:{ Exception -> 0x0348 }
                int r9 = r9.getInt(r8, r5)     // Catch:{ Exception -> 0x0348 }
                r4.append(r9)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r8, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r8 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r8 = r8.f7794c     // Catch:{ Exception -> 0x0348 }
                int r8 = r8.getInt(r7, r5)     // Catch:{ Exception -> 0x0348 }
                r4.append(r8)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r7, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r7 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r7 = r7.f7794c     // Catch:{ Exception -> 0x0348 }
                int r7 = r7.getInt(r6, r5)     // Catch:{ Exception -> 0x0348 }
                r4.append(r7)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r6, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r6 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r6 = r6.f7794c     // Catch:{ Exception -> 0x0348 }
                r7 = r24
                int r6 = r6.getInt(r7, r5)     // Catch:{ Exception -> 0x0348 }
                r4.append(r6)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r7, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r6 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r6 = r6.f7794c     // Catch:{ Exception -> 0x0348 }
                r7 = r20
                int r6 = r6.getInt(r7, r11)     // Catch:{ Exception -> 0x0348 }
                r4.append(r6)     // Catch:{ Exception -> 0x0348 }
                r4.append(r15)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r7, r3)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r3 = r3.f7794c     // Catch:{ Exception -> 0x0348 }
                r4 = r23
                java.lang.String r3 = r3.getString(r4, r15)     // Catch:{ Exception -> 0x0348 }
                boolean r3 = r3.equals(r15)     // Catch:{ Exception -> 0x0348 }
                if (r3 != 0) goto L_0x01f8
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r6 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r6 = r6.f7794c     // Catch:{ Exception -> 0x0348 }
                java.lang.String r6 = r6.getString(r4, r15)     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r6)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r4, r3)     // Catch:{ Exception -> 0x0348 }
                y8.f r3 = new y8.f     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r4 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r4 = r4.f7794c     // Catch:{ Exception -> 0x0348 }
                r6 = r19
                java.lang.String r4 = r4.getString(r6, r15)     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                r2.mo48144c(r6, r3)     // Catch:{ Exception -> 0x0348 }
            L_0x01f8:
                r3 = r22
                r3.mo47986B(r2)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r2 = "User-Agent"
                java.lang.String r4 = "Android Vinebre Software"
                r3.mo47794K(r2, r4)     // Catch:{ Exception -> 0x0348 }
                r2 = r18
                g8.q r2 = r2.mo43518a(r3)     // Catch:{ Exception -> 0x0348 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0348 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0348 }
                g8.i r2 = r2.mo47805b()     // Catch:{ Exception -> 0x0348 }
                java.io.InputStream r2 = r2.mo43577k()     // Catch:{ Exception -> 0x0348 }
                r4.<init>(r2, r14)     // Catch:{ Exception -> 0x0348 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r2.<init>()     // Catch:{ Exception -> 0x0348 }
            L_0x0221:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x0348 }
                if (r4 == 0) goto L_0x022b
                r2.append(r4)     // Catch:{ Exception -> 0x0348 }
                goto L_0x0221
            L_0x022b:
                r3 = r17
                int r4 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                r6 = -1
                if (r4 == r6) goto L_0x0255
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                int r3 = r3 + 7
                java.lang.String r4 = "@FINEMAIL@"
                int r4 = r2.indexOf(r4, r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r2.substring(r3, r4)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r4 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r4 = r4.f7794c     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x0348 }
                r4.putString(r12, r3)     // Catch:{ Exception -> 0x0348 }
                r4.putBoolean(r13, r11)     // Catch:{ Exception -> 0x0348 }
                r4.commit()     // Catch:{ Exception -> 0x0348 }
            L_0x0255:
                r3 = r26
                int r4 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                if (r4 == r6) goto L_0x02ec
                british.x.guardarprimeravez r4 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                java.lang.String r7 = "sh"
                android.content.SharedPreferences r4 = r4.getSharedPreferences(r7, r5)     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x0348 }
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                int r3 = r3 + 7
                java.lang.String r7 = "-"
                int r7 = r2.indexOf(r7, r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r2.substring(r3, r7)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r7 = "@"
                java.lang.String[] r3 = r3.split(r7)     // Catch:{ Exception -> 0x0348 }
                r5 = r3[r5]     // Catch:{ Exception -> 0x0348 }
                r7 = r3[r11]     // Catch:{ Exception -> 0x0348 }
                r3 = r3[r16]     // Catch:{ Exception -> 0x0348 }
                java.lang.String r8 = "idusu"
                long r9 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0348 }
                r4.putLong(r8, r9)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r8 = "cod"
                r4.putString(r8, r7)     // Catch:{ Exception -> 0x0348 }
                r7 = r21
                r4.putString(r7, r3)     // Catch:{ Exception -> 0x0348 }
                r4.commit()     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r4 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                int r7 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0348 }
                long r7 = (long) r7     // Catch:{ Exception -> 0x0348 }
                r4.f7797f = r7     // Catch:{ Exception -> 0x0348 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
                r4.<init>()     // Catch:{ Exception -> 0x0348 }
                r4.append(r5)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r5 = "@"
                r4.append(r5)     // Catch:{ Exception -> 0x0348 }
                r4.append(r3)     // Catch:{ Exception -> 0x0348 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0348 }
                r4 = 0
                british.x.guardarprimeravez r5 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                java.io.File r5 = r5.getFilesDir()     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                java.lang.String r8 = "vinebre_ac.txt"
                r7.<init>(r5, r8)     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                r5.<init>(r7)     // Catch:{ Exception -> 0x02e9, all -> 0x02e4 }
                java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                r7.<init>(r5)     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                r4.<init>(r7)     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                r4.write(r3)     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                r4.close()     // Catch:{ Exception -> 0x02e2, all -> 0x02df }
                r5.close()     // Catch:{ Exception -> 0x02ec }
                goto L_0x02ec
            L_0x02df:
                r0 = move-exception
                r4 = r5
                goto L_0x02e5
            L_0x02e2:
                r4 = r5
                goto L_0x02e9
            L_0x02e4:
                r0 = move-exception
            L_0x02e5:
                r4.close()     // Catch:{ Exception -> 0x02e8 }
            L_0x02e8:
                throw r0     // Catch:{ Exception -> 0x0348 }
            L_0x02e9:
                r4.close()     // Catch:{ Exception -> 0x02ec }
            L_0x02ec:
                java.lang.String r3 = "ANDROID:OK"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                if (r3 == r6) goto L_0x0335
                java.lang.String r3 = "ANDROID:OK COD:"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                if (r3 == r6) goto L_0x0314
                r3 = 15
                r4 = 21
                java.lang.String r3 = r2.substring(r3, r4)     // Catch:{ Exception -> 0x0348 }
                british.x.guardarprimeravez r4 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences r4 = r4.f7794c     // Catch:{ Exception -> 0x0348 }
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x0348 }
                java.lang.String r5 = "cod"
                r4.putString(r5, r3)     // Catch:{ Exception -> 0x0348 }
                r4.commit()     // Catch:{ Exception -> 0x0348 }
            L_0x0314:
                java.lang.String r3 = " PEND:1"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0348 }
                if (r3 == r6) goto L_0x0321
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0348 }
                return r0
            L_0x0321:
                java.lang.String r0 = " VALID:1"
                int r0 = r2.indexOf(r0)     // Catch:{ Exception -> 0x0348 }
                if (r0 == r6) goto L_0x0330
                r0 = 11
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0348 }
                return r0
            L_0x0330:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r11)     // Catch:{ Exception -> 0x0348 }
                return r0
            L_0x0335:
                java.lang.String r0 = "ANDROID:KO -CONTRA-"
                int r0 = r2.indexOf(r0)     // Catch:{ Exception -> 0x0348 }
                if (r0 == r6) goto L_0x0343
                r0 = 4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0348 }
                return r0
            L_0x0343:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r16)     // Catch:{ Exception -> 0x0348 }
                return r0
            L_0x0348:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.guardarprimeravez.C1830b.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* JADX WARNING: type inference failed for: r3v31, types: [boolean] */
        /* JADX WARNING: type inference failed for: r3v48 */
        /* JADX WARNING: type inference failed for: r3v49 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0246  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Byte r19) {
            /*
                r18 = this;
                r0 = r18
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x000a }
                android.app.ProgressDialog r1 = r1.f7793b     // Catch:{ Exception -> 0x000a }
                r1.dismiss()     // Catch:{ Exception -> 0x000a }
                goto L_0x000b
            L_0x000a:
            L_0x000b:
                byte r1 = r19.byteValue()
                java.lang.String r2 = "email_confirmado"
                java.lang.String r4 = "idsecc"
                java.lang.String r6 = "desde_vistafb"
                java.lang.String r7 = "desde_quiz"
                java.lang.String r8 = "desde_radio"
                java.lang.String r9 = "desde_video"
                java.lang.String r10 = "desde_px"
                java.lang.String r11 = "desde_game"
                java.lang.String r12 = "desde_foro"
                java.lang.String r13 = "desde_buscvideos"
                java.lang.String r14 = "desde_buscusus"
                java.lang.String r15 = "es_root"
                r5 = 1
                if (r1 == r5) goto L_0x02b1
                byte r1 = r19.byteValue()
                r5 = 11
                if (r1 != r5) goto L_0x0034
                goto L_0x02b1
            L_0x0034:
                byte r1 = r19.byteValue()
                java.lang.String r5 = "desde_main_oblig"
                java.lang.String r3 = "desde_main"
                r16 = r6
                r6 = 3
                if (r1 != r6) goto L_0x015b
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                r17 = r7
                british.x.config r7 = r1.f7802k
                int r7 = r7.f7393o5
                if (r7 != r6) goto L_0x0059
                android.content.SharedPreferences r1 = r1.f7794c
                android.content.SharedPreferences$Editor r1 = r1.edit()
                r6 = 0
                r1.putBoolean(r2, r6)
                r1.commit()
                goto L_0x005a
            L_0x0059:
                r6 = 0
            L_0x005a:
                android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x00a9 }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x00a9 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00a9 }
                android.app.AlertDialog$Builder r1 = r1.setCancelable(r6)     // Catch:{ Exception -> 0x00a9 }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x00a9 }
                r6 = 2131820577(0x7f110021, float:1.9273873E38)
                java.lang.String r2 = r2.getString(r6)     // Catch:{ Exception -> 0x00a9 }
                british.x.guardarprimeravez$b$a r6 = new british.x.guardarprimeravez$b$a     // Catch:{ Exception -> 0x00a9 }
                r6.<init>()     // Catch:{ Exception -> 0x00a9 }
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r6)     // Catch:{ Exception -> 0x00a9 }
                r2 = 2131820754(0x7f1100d2, float:1.9274232E38)
                android.app.AlertDialog$Builder r1 = r1.setMessage(r2)     // Catch:{ Exception -> 0x00a9 }
                android.app.AlertDialog r1 = r1.create()     // Catch:{ Exception -> 0x00a9 }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r2 = r2.f7796e     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r6 = ""
                boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x00a9 }
                if (r2 != 0) goto L_0x0096
                british.x.guardarprimeravez$b$b r2 = new british.x.guardarprimeravez$b$b     // Catch:{ Exception -> 0x00a9 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00a9 }
                r1.setOnShowListener(r2)     // Catch:{ Exception -> 0x00a9 }
            L_0x0096:
                r1.show()     // Catch:{ Exception -> 0x00a9 }
                r2 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x052c }
                android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x052c }
                android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x052c }
                r1.setTypeface(r2)     // Catch:{ Exception -> 0x052c }
                goto L_0x052c
            L_0x00a9:
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.chat_perfil> r6 = british.p015x.chat_perfil.class
                r1.<init>(r2, r6)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r6 = r2.f7799h
                if (r6 == 0) goto L_0x00c0
                android.os.Bundle r2 = r2.f7795d
                android.content.Intent r1 = british.p015x.C1692config.m8198r(r1, r2)
                goto L_0x00c5
            L_0x00c0:
                int r2 = r2.f7798g
                r1.putExtra(r4, r2)
            L_0x00c5:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r4 = r2.f7802k
                int r4 = r4.f7427t4
                r6 = 2
                if (r4 != r6) goto L_0x00d2
                boolean r2 = r2.f7801j
                if (r2 == 0) goto L_0x00d6
            L_0x00d2:
                r2 = 1
                r1.putExtra(r15, r2)
            L_0x00d6:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r2 = r2.f7800i
                r1.putExtra(r3, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r2 = r2.f7801j
                r1.putExtra(r5, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                if (r2 == 0) goto L_0x014e
                r3 = 0
                boolean r2 = r2.getBoolean(r14, r3)
                r1.putExtra(r14, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r13, r3)
                r1.putExtra(r13, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r12, r3)
                r1.putExtra(r12, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r11, r3)
                r1.putExtra(r11, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r10, r3)
                r1.putExtra(r10, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r9, r3)
                r1.putExtra(r9, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r8, r3)
                r1.putExtra(r8, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                r6 = r17
                boolean r2 = r2.getBoolean(r6, r3)
                r1.putExtra(r6, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                r7 = r16
                boolean r2 = r2.getBoolean(r7, r3)
                r1.putExtra(r7, r2)
            L_0x014e:
                java.lang.String r2 = "nocompletar"
                r3 = 1
                r1.putExtra(r2, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startActivity(r1)
                goto L_0x052c
            L_0x015b:
                r6 = r7
                r7 = r16
                byte r1 = r19.byteValue()
                r2 = 2
                if (r1 != r2) goto L_0x0175
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.content.SharedPreferences r1 = r1.f7794c
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.String r2 = "nick"
                r1.remove(r2)
                r1.commit()
            L_0x0175:
                android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x0202 }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0202 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0202 }
                r2 = 0
                android.app.AlertDialog$Builder r1 = r1.setCancelable(r2)     // Catch:{ Exception -> 0x0202 }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x0202 }
                r16 = r7
                r7 = 2131820577(0x7f110021, float:1.9273873E38)
                java.lang.String r2 = r2.getString(r7)     // Catch:{ Exception -> 0x01ff }
                british.x.guardarprimeravez$b$c r7 = new british.x.guardarprimeravez$b$c     // Catch:{ Exception -> 0x01ff }
                r7.<init>()     // Catch:{ Exception -> 0x01ff }
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r7)     // Catch:{ Exception -> 0x01ff }
                android.app.AlertDialog r1 = r1.create()     // Catch:{ Exception -> 0x01ff }
                byte r2 = r19.byteValue()     // Catch:{ Exception -> 0x01ff }
                r7 = 4
                if (r2 != r7) goto L_0x01c4
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x01ff }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x01ff }
                r7 = 2131820755(0x7f1100d3, float:1.9274234E38)
                java.lang.String r2 = r2.getString(r7)     // Catch:{ Exception -> 0x01ff }
                r1.setMessage(r2)     // Catch:{ Exception -> 0x01ff }
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x01ff }
                android.content.SharedPreferences r2 = r2.f7794c     // Catch:{ Exception -> 0x01ff }
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x01ff }
                java.lang.String r7 = "mostrar_recordarcontra"
                r17 = r6
                r6 = 1
                r2.putBoolean(r7, r6)     // Catch:{ Exception -> 0x01fd }
                r2.commit()     // Catch:{ Exception -> 0x01fd }
                goto L_0x01d6
            L_0x01c4:
                r17 = r6
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x01fd }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x01fd }
                r6 = 2131820788(0x7f1100f4, float:1.92743E38)
                java.lang.String r2 = r2.getString(r6)     // Catch:{ Exception -> 0x01fd }
                r1.setMessage(r2)     // Catch:{ Exception -> 0x01fd }
            L_0x01d6:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this     // Catch:{ Exception -> 0x01fd }
                java.lang.String r2 = r2.f7796e     // Catch:{ Exception -> 0x01fd }
                java.lang.String r6 = ""
                boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x01fd }
                if (r2 != 0) goto L_0x01ea
                british.x.guardarprimeravez$b$d r2 = new british.x.guardarprimeravez$b$d     // Catch:{ Exception -> 0x01fd }
                r2.<init>(r1)     // Catch:{ Exception -> 0x01fd }
                r1.setOnShowListener(r2)     // Catch:{ Exception -> 0x01fd }
            L_0x01ea:
                r1.show()     // Catch:{ Exception -> 0x01fd }
                r2 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x052c }
                android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x052c }
                android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x052c }
                r1.setTypeface(r2)     // Catch:{ Exception -> 0x052c }
                goto L_0x052c
            L_0x01fd:
                goto L_0x0206
            L_0x01ff:
                r17 = r6
                goto L_0x0206
            L_0x0202:
                r17 = r6
                r16 = r7
            L_0x0206:
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.chat_perfil> r6 = british.p015x.chat_perfil.class
                r1.<init>(r2, r6)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r6 = r2.f7799h
                if (r6 == 0) goto L_0x021c
                android.os.Bundle r2 = r2.f7795d
                android.content.Intent r1 = british.p015x.C1692config.m8198r(r1, r2)
                goto L_0x0221
            L_0x021c:
                int r2 = r2.f7798g
                r1.putExtra(r4, r2)
            L_0x0221:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r4 = r2.f7802k
                int r4 = r4.f7427t4
                r6 = 2
                if (r4 != r6) goto L_0x022e
                boolean r2 = r2.f7801j
                if (r2 == 0) goto L_0x0232
            L_0x022e:
                r2 = 1
                r1.putExtra(r15, r2)
            L_0x0232:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r2 = r2.f7800i
                r1.putExtra(r3, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r2 = r2.f7801j
                r1.putExtra(r5, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                if (r2 == 0) goto L_0x02aa
                r3 = 0
                boolean r2 = r2.getBoolean(r14, r3)
                r1.putExtra(r14, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r13, r3)
                r1.putExtra(r13, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r12, r3)
                r1.putExtra(r12, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r11, r3)
                r1.putExtra(r11, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r10, r3)
                r1.putExtra(r10, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r9, r3)
                r1.putExtra(r9, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                boolean r2 = r2.getBoolean(r8, r3)
                r1.putExtra(r8, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                r5 = r17
                boolean r2 = r2.getBoolean(r5, r3)
                r1.putExtra(r5, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.os.Bundle r2 = r2.f7795d
                r6 = r16
                boolean r2 = r2.getBoolean(r6, r3)
                r1.putExtra(r6, r2)
            L_0x02aa:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startActivity(r1)
                goto L_0x052c
            L_0x02b1:
                r5 = r7
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r1.f7802k
                int r3 = r3.f7393o5
                r7 = 3
                if (r3 != r7) goto L_0x02c8
                android.content.SharedPreferences r1 = r1.f7794c
                android.content.SharedPreferences$Editor r1 = r1.edit()
                r3 = 1
                r1.putBoolean(r2, r3)
                r1.commit()
            L_0x02c8:
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.s_guardarperfil> r3 = british.p015x.s_guardarperfil.class
                r1.<init>(r2, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.content.SharedPreferences r2 = r2.f7794c
                java.lang.String r3 = "foto1_modif"
                java.lang.String r7 = "0"
                java.lang.String r2 = r2.getString(r3, r7)
                r1.putExtra(r3, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startService(r1)
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                boolean r2 = r1.f7800i
                if (r2 == 0) goto L_0x03ab
                byte r1 = r19.byteValue()
                java.lang.String r2 = "glob_acceso_validado"
                r3 = 11
                if (r1 != r3) goto L_0x0306
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.content.SharedPreferences r1 = r1.f7794c
                android.content.SharedPreferences$Editor r1 = r1.edit()
                r3 = 1
                android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)
                r1.commit()
                goto L_0x0307
            L_0x0306:
                r3 = 1
            L_0x0307:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                british.x.config r4 = r1.f7802k
                int r4 = r4.f7439v2
                if (r4 <= r3) goto L_0x032b
                android.content.SharedPreferences r1 = r1.f7794c
                r4 = 0
                boolean r1 = r1.getBoolean(r2, r4)
                if (r1 != 0) goto L_0x032b
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.codigo> r4 = british.p015x.codigo.class
                r1.<init>(r2, r4)
                r1.putExtra(r15, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startActivity(r1)
                goto L_0x052c
            L_0x032b:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                british.x.config r2 = r1.f7802k
                int r2 = r2.f7427t4
                r3 = 2
                if (r2 != r3) goto L_0x033f
                boolean r4 = r1.f7801j
                if (r4 != 0) goto L_0x033f
                android.app.Activity r1 = r1.f7803l
                r1.finish()
                goto L_0x052c
            L_0x033f:
                if (r2 != r3) goto L_0x0371
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_menugrid> r3 = british.p015x.t_menugrid.class
                r1.<init>(r2, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r2.f7802k
                r4 = 900(0x384, float:1.261E-42)
                r3.f7312c = r4
                android.content.SharedPreferences r2 = r2.f7794c
                android.content.SharedPreferences$Editor r2 = r2.edit()
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r3.f7802k
                int r3 = r3.f7312c
                java.lang.String r4 = "ind_secc_sel"
                r2.putInt(r4, r3)
                r2.commit()
                r2 = 1
                r1.putExtra(r15, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startActivity(r1)
                goto L_0x052c
            L_0x0371:
                r1 = 0
                r2 = 0
            L_0x0373:
                if (r1 != 0) goto L_0x0389
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r3.f7802k
                british.x.l[] r3 = r3.f7231O1
                int r4 = r3.length
                if (r2 >= r4) goto L_0x0389
                r3 = r3[r2]
                boolean r3 = r3.f7848B
                if (r3 != 0) goto L_0x0386
                r1 = 1
                goto L_0x0373
            L_0x0386:
                int r2 = r2 + 1
                goto L_0x0373
            L_0x0389:
                if (r1 != 0) goto L_0x038d
                r3 = 0
                goto L_0x038e
            L_0x038d:
                r3 = r2
            L_0x038e:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                british.x.config r1 = r1.f7802k
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                british.x.guardarprimeravez r3 = british.p015x.guardarprimeravez.this
                british.x.j r1 = r1.mo7475B(r2, r3)
                android.content.Intent r2 = r1.f7842a
                r3 = 1
                r2.putExtra(r15, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                android.content.Intent r1 = r1.f7842a
                r2.startActivity(r1)
                goto L_0x052c
            L_0x03ab:
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x03c1
                r2 = 0
                boolean r1 = r1.getBoolean(r14, r2)
                if (r1 == 0) goto L_0x03c1
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_buscusus> r3 = british.p015x.t_buscusus.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x03c1:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x03d9
                r2 = 0
                boolean r1 = r1.getBoolean(r13, r2)
                if (r1 == 0) goto L_0x03d9
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_buscvideos> r3 = british.p015x.t_buscvideos.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x03d9:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x03f1
                r2 = 0
                boolean r1 = r1.getBoolean(r12, r2)
                if (r1 == 0) goto L_0x03f1
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_url> r3 = british.p015x.t_url.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x03f1:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x0409
                r2 = 0
                boolean r1 = r1.getBoolean(r11, r2)
                if (r1 == 0) goto L_0x0409
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_url> r3 = british.p015x.t_url.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x0409:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x0421
                r2 = 0
                boolean r1 = r1.getBoolean(r10, r2)
                if (r1 == 0) goto L_0x0421
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_url> r3 = british.p015x.t_url.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x0421:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x04a5
                r2 = 0
                boolean r1 = r1.getBoolean(r9, r2)
                if (r1 == 0) goto L_0x04a5
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                british.x.config r2 = r1.f7802k
                british.x.l[] r2 = r2.f7231O1
                java.util.ArrayList<java.lang.Integer> r3 = british.p015x.C1692config.f7114N5
                int r1 = r1.f7798g
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r1 = r3.indexOf(r1)
                r1 = r2[r1]
                int r1 = r1.f7868L
                if (r1 != 0) goto L_0x0450
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_video> r3 = british.p015x.t_video.class
                r1.<init>(r2, r3)
                goto L_0x0459
            L_0x0450:
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_video_exoplayer> r3 = british.p015x.t_video_exoplayer.class
                r1.<init>(r2, r3)
            L_0x0459:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r2.f7802k
                british.x.l[] r3 = r3.f7231O1
                java.util.ArrayList<java.lang.Integer> r5 = british.p015x.C1692config.f7114N5
                int r2 = r2.f7798g
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r2 = r5.indexOf(r2)
                r2 = r3[r2]
                java.lang.String r2 = r2.f7910e
                java.lang.String r3 = "url"
                r1.putExtra(r3, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r2.f7802k
                british.x.l[] r3 = r3.f7231O1
                java.util.ArrayList<java.lang.Integer> r5 = british.p015x.C1692config.f7114N5
                int r2 = r2.f7798g
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r2 = r5.indexOf(r2)
                r2 = r3[r2]
                java.lang.String r2 = r2.f7925j
                java.lang.String r3 = "ua"
                r1.putExtra(r3, r2)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r2.f7802k
                java.util.ArrayList<java.lang.Integer> r3 = british.p015x.C1692config.f7114N5
                int r2 = r2.f7798g
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r2 = r3.indexOf(r2)
                java.lang.String r3 = "ind"
                r1.putExtra(r3, r2)
                goto L_0x0508
            L_0x04a5:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x04d1
                r2 = 0
                boolean r1 = r1.getBoolean(r8, r2)
                if (r1 == 0) goto L_0x04d1
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_radio> r3 = british.p015x.t_radio.class
                r1.<init>(r2, r3)
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r3 = r2.f7802k
                java.util.ArrayList<java.lang.Integer> r3 = british.p015x.C1692config.f7114N5
                int r2 = r2.f7798g
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r2 = r3.indexOf(r2)
                java.lang.String r3 = "ind"
                r1.putExtra(r3, r2)
                goto L_0x0508
            L_0x04d1:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x04e8
                r2 = 0
                boolean r1 = r1.getBoolean(r5, r2)
                if (r1 == 0) goto L_0x04e8
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_url> r3 = british.p015x.t_url.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x04e8:
                british.x.guardarprimeravez r1 = british.p015x.guardarprimeravez.this
                android.os.Bundle r1 = r1.f7795d
                if (r1 == 0) goto L_0x04ff
                r2 = 0
                boolean r1 = r1.getBoolean(r6, r2)
                if (r1 == 0) goto L_0x04ff
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_vistafb> r3 = british.p015x.t_vistafb.class
                r1.<init>(r2, r3)
                goto L_0x0508
            L_0x04ff:
                android.content.Intent r1 = new android.content.Intent
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                java.lang.Class<british.x.t_chat> r3 = british.p015x.t_chat.class
                r1.<init>(r2, r3)
            L_0x0508:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                boolean r3 = r2.f7799h
                if (r3 == 0) goto L_0x0515
                android.os.Bundle r2 = r2.f7795d
                android.content.Intent r1 = british.p015x.C1692config.m8198r(r1, r2)
                goto L_0x051a
            L_0x0515:
                int r2 = r2.f7798g
                r1.putExtra(r4, r2)
            L_0x051a:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                british.x.config r2 = r2.f7802k
                int r2 = r2.f7427t4
                r3 = 2
                if (r2 == r3) goto L_0x0527
                r2 = 1
                r1.putExtra(r15, r2)
            L_0x0527:
                british.x.guardarprimeravez r2 = british.p015x.guardarprimeravez.this
                r2.startActivity(r1)
            L_0x052c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.guardarprimeravez.C1830b.onPostExecute(java.lang.Byte):void");
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C1692config config = (C1692config) getApplicationContext();
        this.f7802k = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        this.f7803l = this;
        Bundle extras = getIntent().getExtras();
        this.f7795d = extras;
        this.f7799h = extras != null && extras.containsKey("externo");
        Bundle bundle2 = this.f7795d;
        this.f7800i = bundle2 != null && bundle2.getBoolean("desde_main", false);
        this.f7801j = this.f7795d.getBoolean("desde_main_oblig", false);
        if (this.f7800i) {
            str = this.f7802k.f7313c1;
            this.f7798g = 0;
        } else if (this.f7799h) {
            C1692config config2 = this.f7802k;
            str = config2.f7231O1[config2.f7318d].f7916g;
        } else {
            C1692config config3 = this.f7802k;
            str = config3.f7231O1[config3.f7318d].f7916g;
            this.f7798g = this.f7795d.getInt("idsecc");
        }
        this.f7796e = C1692config.m8189h(str, this.f7802k.f7368l1);
        int i = Build.VERSION.SDK_INT;
        if (i > 12) {
            if (!C1692config.m8153I("#" + str)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f7794c = sharedPreferences;
        this.f7797f = sharedPreferences.getLong("idusu", 0);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f7793b = progressDialog;
        progressDialog.setMessage(getString(R.string.guardando));
        this.f7793b.setIndeterminate(true);
        if (i > 20) {
            this.f7793b.setOnShowListener(new C1829a());
        }
        this.f7793b.show();
        new C1830b().execute(new String[0]);
    }

    public void onStop() {
        super.onStop();
        finish();
    }
}
