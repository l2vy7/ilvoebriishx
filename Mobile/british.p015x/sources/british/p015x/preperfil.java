package british.p015x;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: british.x.preperfil */
public class preperfil extends Activity_ext_class implements C1592a, View.OnClickListener {

    /* renamed from: A */
    boolean f8190A = false;

    /* renamed from: B */
    boolean f8191B;

    /* renamed from: C */
    boolean f8192C;

    /* renamed from: D */
    boolean f8193D;

    /* renamed from: E */
    ListView f8194E;

    /* renamed from: F */
    SharedPreferences f8195F;

    /* renamed from: G */
    Bundle f8196G;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressDialog f8197m;

    /* renamed from: n */
    long f8198n;

    /* renamed from: o */
    int f8199o;

    /* renamed from: p */
    int f8200p;

    /* renamed from: q */
    C1692config f8201q;

    /* renamed from: r */
    boolean f8202r = false;

    /* renamed from: s */
    boolean f8203s = false;

    /* renamed from: t */
    boolean f8204t = false;

    /* renamed from: u */
    boolean f8205u = false;

    /* renamed from: v */
    boolean f8206v = false;

    /* renamed from: w */
    boolean f8207w = false;

    /* renamed from: x */
    boolean f8208x = false;

    /* renamed from: y */
    boolean f8209y = false;

    /* renamed from: z */
    boolean f8210z = false;

    /* renamed from: british.x.preperfil$a */
    class C1963a implements SearchManager.OnCancelListener {
        C1963a() {
        }

        public void onCancel() {
            preperfil preperfil = preperfil.this;
            preperfil.f6657c = false;
            preperfil.setResult(0);
        }
    }

    /* renamed from: british.x.preperfil$b */
    class C1964b implements SearchManager.OnDismissListener {
        C1964b() {
        }

        public void onDismiss() {
            preperfil.this.f6658d = false;
        }
    }

    /* renamed from: british.x.preperfil$c */
    class C1965c implements DialogInterface.OnShowListener {
        C1965c() {
        }

        public void onShow(DialogInterface dialogInterface) {
            C1692config.m8168S0((ProgressBar) preperfil.this.f8197m.findViewById(16908301), preperfil.this.f8201q.f7368l1);
        }
    }

    /* renamed from: british.x.preperfil$d */
    class C1966d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8214a;

        C1966d(AlertDialog alertDialog) {
            this.f8214a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8214a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + preperfil.this.f6656b));
        }
    }

    /* renamed from: british.x.preperfil$e */
    private class C1967e extends AsyncTask<String, Void, Byte> {
        private C1967e() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:33|32|35|36|(1:38)|39) */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0176, code lost:
            r15 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0178 */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0184  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r15) {
            /*
                r14 = this;
                java.lang.String r15 = ";"
                r0 = 2
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178 }
                r2.<init>()     // Catch:{ Exception -> 0x0178 }
                java.lang.String r3 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x0178 }
                r2.append(r3)     // Catch:{ Exception -> 0x0178 }
                java.lang.String r3 = "/srv/obtener_perfil.php?v=1&idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x0178 }
                british.x.preperfil r3 = british.p015x.preperfil.this     // Catch:{ Exception -> 0x0178 }
                long r3 = r3.f8198n     // Catch:{ Exception -> 0x0178 }
                r2.append(r3)     // Catch:{ Exception -> 0x0178 }
                java.lang.String r3 = "&c="
                r2.append(r3)     // Catch:{ Exception -> 0x0178 }
                british.x.preperfil r3 = british.p015x.preperfil.this     // Catch:{ Exception -> 0x0178 }
                android.content.SharedPreferences r3 = r3.f8195F     // Catch:{ Exception -> 0x0178 }
                java.lang.String r4 = "cod"
                java.lang.String r5 = ""
                java.lang.String r3 = r3.getString(r4, r5)     // Catch:{ Exception -> 0x0178 }
                r2.append(r3)     // Catch:{ Exception -> 0x0178 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0178 }
                java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0178 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x0178 }
                java.net.URLConnection r2 = r3.openConnection()     // Catch:{ Exception -> 0x0178 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0178 }
                r1 = 1
                r2.setDoInput(r1)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r3 = 10000(0x2710, float:1.4013E-41)
                r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r3 = "User-Agent"
                java.lang.String r4 = "Android Vinebre Software"
                r2.setRequestProperty(r3, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.io.InputStream r3 = r2.getInputStream()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r5.<init>(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r3.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
            L_0x0063:
                java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r5 == 0) goto L_0x007e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r6.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r6.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r5 = "\n"
                r6.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r3.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                goto L_0x0063
            L_0x007e:
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "ANDROID:PERFILKO"
                int r4 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r5 = -1
                if (r4 == r5) goto L_0x0094
                r15 = 3
                java.lang.Byte r15 = java.lang.Byte.valueOf(r15)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r2.disconnect()
                return r15
            L_0x0094:
                java.lang.String r4 = "ANDROID:OK"
                int r4 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r4 != r5) goto L_0x00a4
                java.lang.Byte r15 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r2.disconnect()
                return r15
            L_0x00a4:
                java.lang.String r4 = "DATOSUSU:"
                int r4 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r4 = r4 + 9
                int r5 = r3.indexOf(r15, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = r3.substring(r4, r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r5 = r5 + r1
                int r6 = r3.indexOf(r15, r5)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r5 = r3.substring(r5, r6)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r6 = r6 + r1
                int r7 = r3.indexOf(r15, r6)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r6 = r3.substring(r6, r7)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r7 = r7 + r1
                int r8 = r3.indexOf(r15, r7)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r7 = r3.substring(r7, r8)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r8 = r8 + r1
                int r9 = r3.indexOf(r15, r8)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r8 = r3.substring(r8, r9)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r9 = r9 + r1
                int r10 = r3.indexOf(r15, r9)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r9 = r3.substring(r9, r10)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r10 = r10 + r1
                int r11 = r3.indexOf(r15, r10)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r10 = r3.substring(r10, r11)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r11 = r11 + r1
                int r12 = r3.indexOf(r15, r11)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r11 = r3.substring(r11, r12)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r12 = r12 + r1
                int r13 = r3.indexOf(r15, r12)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r12 = r3.substring(r12, r13)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                int r13 = r13 + r1
                int r15 = r3.indexOf(r15, r13)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r15 = r3.substring(r13, r15)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                british.x.preperfil r3 = british.p015x.preperfil.this     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                android.content.SharedPreferences r3 = r3.f8195F     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r13 = "nick"
                r3.putString(r13, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "privados"
                r3.putInt(r4, r6)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "fnac_d"
                r3.putInt(r4, r7)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "fnac_m"
                r3.putInt(r4, r8)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "fnac_a"
                r3.putInt(r4, r9)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "sexo"
                r3.putInt(r4, r10)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "coments"
                r3.putInt(r4, r11)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r4 = "descr"
                r3.putString(r4, r12)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r3.commit()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.lang.String r3 = "1"
                boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                if (r3 == 0) goto L_0x015e
                british.x.preperfil r3 = british.p015x.preperfil.this     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r3.m8457c(r1, r15)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                goto L_0x0169
            L_0x015e:
                british.x.preperfil r15 = british.p015x.preperfil.this     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                british.x.config r3 = r15.f8201q     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                java.io.File r15 = r3.mo7516l0(r15, r1)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r15.delete()     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
            L_0x0169:
                java.lang.Byte r15 = java.lang.Byte.valueOf(r1)     // Catch:{ Exception -> 0x0174, all -> 0x0171 }
                r2.disconnect()
                return r15
            L_0x0171:
                r15 = move-exception
                r1 = r2
                goto L_0x0182
            L_0x0174:
                r1 = r2
                goto L_0x0178
            L_0x0176:
                r15 = move-exception
                goto L_0x0182
            L_0x0178:
                java.lang.Byte r15 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0176 }
                if (r1 == 0) goto L_0x0181
                r1.disconnect()
            L_0x0181:
                return r15
            L_0x0182:
                if (r1 == 0) goto L_0x0187
                r1.disconnect()
            L_0x0187:
                goto L_0x0189
            L_0x0188:
                throw r15
            L_0x0189:
                goto L_0x0188
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.preperfil.C1967e.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                preperfil.this.f8197m.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                Intent intent = new Intent(preperfil.this, chat_perfil.class);
                preperfil preperfil = preperfil.this;
                if (preperfil.f8191B) {
                    intent = C1692config.m8198r(intent, preperfil.f8196G);
                } else {
                    intent.putExtra("idsecc", preperfil.f8200p);
                }
                intent.putExtra("nocompletar", preperfil.this.f8202r);
                intent.putExtra("desde_buscusus", preperfil.this.f8203s);
                intent.putExtra("desde_buscvideos", preperfil.this.f8204t);
                intent.putExtra("desde_foro", preperfil.this.f8205u);
                intent.putExtra("desde_game", preperfil.this.f8206v);
                intent.putExtra("desde_px", preperfil.this.f8207w);
                intent.putExtra("desde_video", preperfil.this.f8208x);
                intent.putExtra("desde_radio", preperfil.this.f8209y);
                intent.putExtra("desde_quiz", preperfil.this.f8210z);
                intent.putExtra("desde_vistafb", preperfil.this.f8190A);
                intent.putExtra("desde_main", preperfil.this.f8192C);
                intent.putExtra("desde_main_oblig", preperfil.this.f8193D);
                preperfil.this.startActivityForResult(intent, 0);
            } else if (b.byteValue() == 3) {
                preperfil.this.mo7927e(3);
            } else {
                preperfil.this.mo7927e(2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8457c(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x002e }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x002e }
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.String r2 = "/srv/imgs/usus/"
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x002e }
            long r2 = r4.f8198n     // Catch:{ MalformedURLException -> 0x002e }
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x002e }
            r1.append(r5)     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.String r2 = ".jpg?v="
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x002e }
            r1.append(r6)     // Catch:{ MalformedURLException -> 0x002e }
            java.lang.String r6 = r1.toString()     // Catch:{ MalformedURLException -> 0x002e }
            r0.<init>(r6)     // Catch:{ MalformedURLException -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0066 }
            r0 = 1
            r6.setDoInput(r0)     // Catch:{ IOException -> 0x0066 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0066 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r6.setReadTimeout(r0)     // Catch:{ IOException -> 0x0066 }
            r6.connect()     // Catch:{ IOException -> 0x0066 }
            java.io.InputStream r0 = r6.getInputStream()     // Catch:{ IOException -> 0x0066 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ IOException -> 0x0066 }
            r0.close()     // Catch:{ IOException -> 0x0066 }
            r6.disconnect()     // Catch:{ IOException -> 0x0066 }
            british.x.config r6 = r4.f8201q     // Catch:{ IOException -> 0x0066 }
            java.io.File r5 = r6.mo7516l0(r4, r5)     // Catch:{ IOException -> 0x0066 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{  }
            r6.<init>(r5)     // Catch:{  }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
            r0 = 100
            r1.compress(r5, r0, r6)     // Catch:{  }
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.preperfil.m8457c(int, java.lang.String):void");
    }

    public void abrir_secc(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7926d() {
        int q0 = this.f8201q.mo7522q0(this);
        int i = this.f8201q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8194E = listView;
            this.f8201q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8201q.f7231O1;
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
            int[] iArr = this.f8201q.f7249R1;
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
    public void mo7927e(int i) {
        int i2 = i == 3 ? R.string.perfil_desactivado : R.string.error_http;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(i2);
        try {
            AlertDialog create = builder.create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C1966d(create));
            }
            create.show();
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            finish();
        } else if (intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onClick(View view) {
        C1845j j0 = this.f8201q.mo7510j0(view, this);
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
                    if (this.f8201q.f7427t4 != 2) {
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

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7926d();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        Bundle bundle2 = bundle;
        C1692config config = (C1692config) getApplicationContext();
        this.f8201q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        this.f8199o = this.f8201q.f7318d;
        Bundle extras = getIntent().getExtras();
        this.f8196G = extras;
        if (bundle2 == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8196G.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f8191B = this.f8196G.containsKey("externo");
        this.f8192C = this.f8196G.getBoolean("desde_main", false);
        this.f8193D = this.f8196G.getBoolean("desde_main_oblig", false);
        if (this.f8192C) {
            C1692config config2 = this.f8201q;
            str = config2.f7313c1;
            str2 = config2.f7319d1;
            this.f8200p = 0;
        } else {
            if (this.f8191B) {
                C1855l[] lVarArr = this.f8201q.f7231O1;
                int i = this.f8199o;
                str4 = lVarArr[i].f7916g;
                str2 = lVarArr[i].f7919h;
            } else {
                this.f8200p = this.f8196G.getInt("idsecc");
                C1855l[] lVarArr2 = this.f8201q.f7231O1;
                int i2 = this.f8199o;
                str4 = lVarArr2[i2].f7916g;
                str2 = lVarArr2[i2].f7919h;
            }
            str = str4;
        }
        boolean I = C1692config.m8153I("#" + str);
        this.f6656b = C1692config.m8189h(str, this.f8201q.f7368l1);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 12 && !I) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.preperfil);
        mo7926d();
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1963a());
        searchManager.setOnDismissListener(new C1964b());
        this.f8202r = this.f8196G.getBoolean("nocompletar", false);
        this.f8203s = this.f8196G.getBoolean("desde_buscusus", false);
        this.f8204t = this.f8196G.getBoolean("desde_buscvideos", false);
        this.f8205u = this.f8196G.getBoolean("desde_foro", false);
        this.f8206v = this.f8196G.getBoolean("desde_game", false);
        String str5 = "desde_main_oblig";
        this.f8207w = this.f8196G.getBoolean("desde_px", false);
        String str6 = "desde_main";
        this.f8208x = this.f8196G.getBoolean("desde_video", false);
        String str7 = "es_root";
        this.f8209y = this.f8196G.getBoolean("desde_radio", false);
        String str8 = "desde_radio";
        this.f8210z = this.f8196G.getBoolean("desde_quiz", false);
        String str9 = "desde_quiz";
        this.f8190A = this.f8196G.getBoolean("desde_vistafb", false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8195F = sharedPreferences;
        String str10 = "desde_video";
        String str11 = "desde_vistafb";
        this.f8198n = sharedPreferences.getLong("idusu", 0);
        if (!str.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            str3 = "desde_px";
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str2)}));
        } else {
            str3 = "desde_px";
        }
        if (!this.f8195F.getString("nick", "").equals("")) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f8197m = progressDialog;
            progressDialog.setMessage(getString(R.string.recuperando));
            this.f8197m.setIndeterminate(true);
            if (i3 > 20) {
                this.f8197m.setOnShowListener(new C1965c());
            }
            this.f8197m.show();
            new C1967e().execute(new String[0]);
            return;
        }
        Intent intent = new Intent(this, chat_perfil.class);
        if (this.f8191B) {
            intent = C1692config.m8198r(intent, this.f8196G);
        } else {
            intent.putExtra("idsecc", this.f8200p);
        }
        intent.putExtra("nocompletar", this.f8202r);
        intent.putExtra("desde_buscusus", this.f8203s);
        intent.putExtra("desde_buscvideos", this.f8204t);
        intent.putExtra("desde_foro", this.f8205u);
        intent.putExtra("desde_game", this.f8206v);
        intent.putExtra(str3, this.f8207w);
        intent.putExtra(str10, this.f8208x);
        intent.putExtra(str8, this.f8209y);
        intent.putExtra(str9, this.f8210z);
        intent.putExtra(str11, this.f8190A);
        if ((this.f8192C || this.f8201q.f7427t4 == 2) && !this.f8193D) {
            z = true;
        } else {
            z = true;
            intent.putExtra(str7, true);
        }
        this.f6659e = false;
        intent.putExtra(str6, this.f8192C);
        intent.putExtra(str5, this.f8193D);
        this.f6657c = z;
        Intent intent2 = new Intent();
        intent2.putExtra("finalizar", z);
        setResult(-1, intent2);
        startActivityForResult(intent, 0);
        finish();
    }

    public void onDestroy() {
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
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
}
