package british.xnews2;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.widget.Toast;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import p272b9.C11188h;
import p312i9.C12788b;
import p312i9.C12789c;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12978b;
import p339y8.C12982f;

public class s_guardarperfil extends IntentService {

    /* renamed from: b */
    C1692config f8480b;

    /* renamed from: c */
    Handler f8481c = new Handler();

    /* renamed from: d */
    Bundle f8482d;

    /* renamed from: e */
    SharedPreferences f8483e;

    /* renamed from: f */
    long f8484f;

    /* renamed from: british.xnews2.s_guardarperfil$a */
    private class C2051a implements Runnable {

        /* renamed from: b */
        String f8485b;

        /* renamed from: c */
        Integer f8486c;

        public C2051a(Integer num, Integer num2) {
            this.f8485b = s_guardarperfil.this.getString(num.intValue());
            this.f8486c = num2;
        }

        public void run() {
            C1692config.m8157K0(Toast.makeText(s_guardarperfil.this.getApplicationContext(), this.f8485b, this.f8486c.intValue()));
        }
    }

    /* renamed from: british.xnews2.s_guardarperfil$b */
    private class C2052b extends AsyncTask<String, Void, Byte> {
        private C2052b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            byte b;
            Bitmap bitmap;
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 60000);
                C11188h hVar = new C11188h(bVar);
                StringBuilder sb = new StringBuilder();
                C11188h hVar2 = hVar;
                sb.append(C1692config.f7109I5);
                sb.append("/srv/guardar_perfil.php?idusu=");
                String str = "coments";
                String str2 = "sexo";
                sb.append(s_guardarperfil.this.f8484f);
                sb.append("&idapp=");
                sb.append(2260177);
                sb.append("&c=");
                sb.append(s_guardarperfil.this.f8483e.getString("cod", ""));
                C12831e eVar = new C12831e(sb.toString());
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                Bundle bundle = s_guardarperfil.this.f8482d;
                if (bundle.getString("foto" + 1 + "_modif").equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    s_guardarperfil s_guardarperfil = s_guardarperfil.this;
                    if (s_guardarperfil.f8480b.mo7516l0(s_guardarperfil, 1).exists()) {
                        s_guardarperfil s_guardarperfil2 = s_guardarperfil.this;
                        File l0 = s_guardarperfil2.f8480b.mo7516l0(s_guardarperfil2, 1);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(l0.getPath(), options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        if (!(i <= 600 && i2 <= 600)) {
                            C1692config config = s_guardarperfil.this.f8480b;
                            int round = Math.round(((float) i) / ((float) C1692config.m8193n(i, i2, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED)));
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inSampleSize = round;
                            bitmap = BitmapFactory.decodeFile(l0.getPath(), options2);
                        } else {
                            bitmap = MediaStore.Images.Media.getBitmap(s_guardarperfil.this.getContentResolver(), Uri.fromFile(l0));
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        C12978b bVar2 = new C12978b(byteArrayOutputStream.toByteArray(), "temporal.jpg");
                        gVar.mo48144c("foto" + 1, bVar2);
                    } else {
                        gVar.mo48144c("foto" + 1 + "_elim", new C12982f(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                    }
                }
                gVar.mo48144c("nombre", new C12982f(URLEncoder.encode(s_guardarperfil.this.f8483e.getString("nick", ""), C6540C.UTF8_NAME)));
                gVar.mo48144c("descr", new C12982f(URLEncoder.encode(s_guardarperfil.this.f8483e.getString("descr", ""), C6540C.UTF8_NAME)));
                gVar.mo48144c("privados", new C12982f(s_guardarperfil.this.f8483e.getInt("privados", 1) + ""));
                gVar.mo48144c("foto1_modif", new C12982f(s_guardarperfil.this.f8482d.getString("foto1_modif")));
                gVar.mo48144c("fnac_d", new C12982f(s_guardarperfil.this.f8483e.getInt("fnac_d", 0) + ""));
                gVar.mo48144c("fnac_m", new C12982f(s_guardarperfil.this.f8483e.getInt("fnac_m", 0) + ""));
                gVar.mo48144c("fnac_a", new C12982f(s_guardarperfil.this.f8483e.getInt("fnac_a", 0) + ""));
                StringBuilder sb2 = new StringBuilder();
                String str3 = str2;
                sb2.append(s_guardarperfil.this.f8483e.getInt(str3, 0));
                sb2.append("");
                gVar.mo48144c(str3, new C12982f(sb2.toString()));
                StringBuilder sb3 = new StringBuilder();
                String str4 = str;
                sb3.append(s_guardarperfil.this.f8483e.getInt(str4, 1));
                sb3.append("");
                gVar.mo48144c(str4, new C12982f(sb3.toString()));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar2.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb4.append(readLine);
                }
                if (sb4.indexOf("ANDROID:OK") != -1) {
                    return (byte) 1;
                }
                b = 0;
                try {
                    return (byte) 0;
                } catch (Exception unused) {
                    return Byte.valueOf(b);
                }
            } catch (Exception unused2) {
                b = 0;
                return Byte.valueOf(b);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 1) {
                s_guardarperfil s_guardarperfil = s_guardarperfil.this;
                s_guardarperfil.f8481c.post(new C2051a(Integer.valueOf(R.string.guardado), 0));
                return;
            }
            s_guardarperfil s_guardarperfil2 = s_guardarperfil.this;
            s_guardarperfil2.f8481c.post(new C2051a(Integer.valueOf(R.string.error_http), 1));
        }
    }

    public s_guardarperfil() {
        super("s_guardarperfil");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.f8480b = (C1692config) getApplicationContext();
        this.f8481c.post(new C2051a(Integer.valueOf(R.string.guardando), 0));
        this.f8482d = intent.getExtras();
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8483e = sharedPreferences;
        this.f8484f = sharedPreferences.getLong("idusu", 0);
        try {
            new C2052b().execute(new String[0]);
        } catch (Exception unused) {
        }
    }
}
