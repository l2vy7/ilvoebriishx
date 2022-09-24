package british.xnews2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import p272b9.C11188h;
import p307g8.C12725i;
import p316k9.C12823d;
import p317l8.C12831e;
import p337x8.C12960g;
import p339y8.C12982f;

public class codigo extends Activity_ext_class implements C1592a, View.OnClickListener {

    /* renamed from: m */
    C1692config f7080m;

    /* renamed from: n */
    String f7081n;

    /* renamed from: o */
    String f7082o;

    /* renamed from: p */
    SharedPreferences f7083p;

    /* renamed from: q */
    long f7084q;

    /* renamed from: r */
    String f7085r;

    /* renamed from: s */
    String f7086s;

    /* renamed from: t */
    ProgressBar f7087t;

    /* renamed from: u */
    boolean f7088u = false;

    /* renamed from: british.xnews2.codigo$a */
    private class C1684a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f7089a;

        /* renamed from: british.xnews2.codigo$a$a */
        class C1685a implements DialogInterface.OnClickListener {
            C1685a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                codigo.this.findViewById(R.id.ll_contenido).setVisibility(0);
            }
        }

        /* renamed from: british.xnews2.codigo$a$b */
        class C1686b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7092a;

            C1686b(AlertDialog alertDialog) {
                this.f7092a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7092a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + codigo.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.codigo$a$c */
        class C1687c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7094a;

            C1687c(AlertDialog alertDialog) {
                this.f7094a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7094a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + codigo.this.f6656b));
            }
        }

        public C1684a(String str) {
            this.f7089a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/codigo_verif.php?idusu=" + codigo.this.f7084q + "&c=" + codigo.this.f7085r);
            C12960g gVar = new C12960g();
            try {
                gVar.mo48144c("c_acceso", new C12982f(this.f7089a));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            String str = "";
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
            codigo.this.f7087t.setVisibility(8);
            AlertDialog.Builder builder = new AlertDialog.Builder(codigo.this);
            int i = 0;
            builder.setCancelable(false).setPositiveButton(codigo.this.getString(R.string.aceptar), new C1685a());
            if (str.indexOf("ANDROID:OK") != -1) {
                SharedPreferences.Editor edit = codigo.this.f7083p.edit();
                edit.putBoolean("glob_acceso_validado", true);
                edit.commit();
                if (codigo.this.f7080m.f7427t4 == 2) {
                    Intent intent = new Intent(codigo.this, t_menugrid.class);
                    codigo codigo = codigo.this;
                    codigo.f7080m.f7312c = 900;
                    SharedPreferences.Editor edit2 = codigo.f7083p.edit();
                    edit2.putInt("ind_secc_sel", codigo.this.f7080m.f7312c);
                    edit2.commit();
                    intent.putExtra("es_root", true);
                    codigo.this.startActivity(intent);
                    codigo.this.finish();
                    return;
                }
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    C1855l[] lVarArr = codigo.this.f7080m.f7231O1;
                    if (i2 >= lVarArr.length) {
                        break;
                    } else if (!lVarArr[i2].f7848B) {
                        z = true;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    i = i2;
                }
                C1845j B = codigo.this.f7080m.mo7475B(Integer.valueOf(i), codigo.this);
                B.f7842a.putExtra("es_root", true);
                codigo.this.startActivity(B.f7842a);
                codigo.this.finish();
            } else if (str.indexOf("ANDROID:KO") != -1) {
                builder.setMessage(R.string.codigo_ko);
                AlertDialog create = builder.create();
                if (!codigo.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1686b(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else {
                builder.setMessage(R.string.error_http);
                AlertDialog create2 = builder.create();
                if (!codigo.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C1687c(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            codigo.this.findViewById(R.id.ll_contenido).setVisibility(8);
            codigo.this.f7087t.setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.codigo$b */
    private class C1688b extends AsyncTask<String, Void, String> {

        /* renamed from: british.xnews2.codigo$b$a */
        class C1689a implements DialogInterface.OnClickListener {
            C1689a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                codigo.this.finish();
            }
        }

        /* renamed from: british.xnews2.codigo$b$b */
        class C1690b implements DialogInterface.OnClickListener {
            C1690b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                codigo.this.findViewById(R.id.ll_contenido).setVisibility(0);
            }
        }

        /* renamed from: british.xnews2.codigo$b$c */
        class C1691c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7099a;

            C1691c(AlertDialog alertDialog) {
                this.f7099a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7099a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + codigo.this.f6656b));
            }
        }

        private C1688b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/solicitar_acceso.php?idusu=" + codigo.this.f7084q + "&c=" + codigo.this.f7085r);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            String str = "";
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            int i;
            codigo.this.f7087t.setVisibility(8);
            AlertDialog.Builder builder = new AlertDialog.Builder(codigo.this);
            int i2 = 0;
            builder.setCancelable(false);
            if (codigo.this.f7080m.f7439v2 == 3) {
                builder.setPositiveButton(R.string.cerrar, new C1689a());
            } else {
                builder.setPositiveButton(R.string.aceptar, new C1690b());
            }
            if (str.indexOf("ANDROID:1-") != -1) {
                SharedPreferences.Editor edit = codigo.this.f7083p.edit();
                edit.putBoolean("glob_acceso_validado", true);
                edit.commit();
                if (codigo.this.f7080m.f7427t4 == 2) {
                    Intent intent = new Intent(codigo.this, t_menugrid.class);
                    codigo codigo = codigo.this;
                    codigo.f7080m.f7312c = 900;
                    SharedPreferences.Editor edit2 = codigo.f7083p.edit();
                    edit2.putInt("ind_secc_sel", codigo.this.f7080m.f7312c);
                    edit2.commit();
                    intent.putExtra("es_root", true);
                    codigo.this.startActivity(intent);
                    codigo.this.finish();
                    return;
                }
                boolean z = false;
                int i3 = 0;
                while (!z) {
                    C1855l[] lVarArr = codigo.this.f7080m.f7231O1;
                    if (i3 >= lVarArr.length) {
                        break;
                    } else if (!lVarArr[i3].f7848B) {
                        z = true;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    i2 = i3;
                }
                C1845j B = codigo.this.f7080m.mo7475B(Integer.valueOf(i2), codigo.this);
                B.f7842a.putExtra("es_root", true);
                codigo.this.startActivity(B.f7842a);
                codigo.this.finish();
                return;
            }
            if (str.indexOf("ANDROID:00-") != -1) {
                i = R.string.acceso_pendiente;
            } else if (str.indexOf("ANDROID:0-") != -1) {
                i = R.string.acceso_solicitado;
            } else {
                i = str.indexOf("ANDROID:2-") != -1 ? R.string.acceso_denegado : R.string.error_http;
            }
            builder.setMessage(i);
            AlertDialog create = builder.create();
            if (!codigo.this.f6656b.equals("")) {
                create.setOnShowListener(new C1691c(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            codigo.this.findViewById(R.id.ll_contenido).setVisibility(8);
            codigo.this.f7087t.setVisibility(0);
        }
    }

    public void abrir_secc(View view) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        if (!this.f6659e || this.f7088u || !this.f7080m.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f7088u = true;
        C1692config.m8199t(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_enviar) {
            String trim = ((EditText) findViewById(R.id.et_cod)).getText().toString().trim();
            if (!trim.equals("")) {
                new C1684a(trim).execute(new String[0]);
            }
        } else if (view.getId() == R.id.tv_solicita) {
            new C1688b().execute(new String[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f7080m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        this.f6659e = true;
        C1692config config2 = this.f7080m;
        String str = config2.f7313c1;
        this.f7081n = str;
        this.f7082o = config2.f7319d1;
        this.f6656b = C1692config.m8189h(str, config2.f7368l1);
        int i = Build.VERSION.SDK_INT;
        if (i > 12) {
            if (!C1692config.m8153I("#" + this.f7081n)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.codigo);
        this.f7080m.mo7523r0(this, Boolean.FALSE);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f7083p = sharedPreferences;
        this.f7084q = sharedPreferences.getLong("idusu", 0);
        this.f7085r = this.f7083p.getString("cod", "");
        this.f7086s = this.f7083p.getString("cod_g", "");
        this.f7087t = (ProgressBar) findViewById(R.id.pb);
        if (!this.f7081n.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f7081n), Color.parseColor("#" + this.f7082o)}));
            int i2 = -1;
            int i3 = C1692config.f7104D5;
            if (C1692config.m8153I("#" + this.f7081n)) {
                int i4 = C1692config.f7102B5;
                i2 = -16777216;
            }
            ((TextView) findViewById(R.id.tv_solicita)).setTextColor(i2);
            ((TextView) findViewById(R.id.tv_codigo)).setTextColor(i2);
            if (i > 20) {
                C1692config.m8150F((EditText) findViewById(R.id.et_cod), Boolean.valueOf(true ^ C1692config.m8153I("#" + this.f7081n)), this.f7080m.f7417s1);
                C1692config.m8168S0(this.f7087t, this.f7080m.f7368l1);
            }
        }
        int i5 = this.f7080m.f7439v2;
        if (i5 == 2 || i5 == 4) {
            TextView textView = (TextView) findViewById(R.id.btn_enviar);
            if (!this.f7080m.f7368l1.equals("")) {
                textView.setBackgroundColor(Color.parseColor("#" + this.f7080m.f7368l1));
                if (C1692config.m8153I("#" + this.f7080m.f7368l1)) {
                    textView.setTextColor(-16777216);
                }
            }
            textView.setOnClickListener(this);
            if (this.f7080m.f7439v2 == 4) {
                findViewById(R.id.tv_solicita).setOnClickListener(this);
                findViewById(R.id.tv_solicita).setVisibility(0);
            }
            if (this.f7080m.f7148A2 != null) {
                new C1684a(this.f7080m.f7148A2).execute(new String[0]);
                return;
            }
            findViewById(R.id.ll_contenido).setVisibility(0);
            findViewById(R.id.et_cod).requestFocus();
        } else if (i5 == 3) {
            new C1688b().execute(new String[0]);
        }
    }
}
