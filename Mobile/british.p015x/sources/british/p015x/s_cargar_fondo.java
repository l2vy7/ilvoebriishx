package british.p015x;

import android.app.IntentService;
import android.graphics.Bitmap;

/* renamed from: british.x.s_cargar_fondo */
public class s_cargar_fondo extends IntentService {

    /* renamed from: b */
    C1692config f8472b;

    /* renamed from: c */
    Bitmap f8473c;

    public s_cargar_fondo() {
        super("s_cargar_fondo");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            android.content.Context r6 = r5.getApplicationContext()
            british.x.config r6 = (british.p015x.C1692config) r6
            r5.f8472b = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = british.p015x.C1692config.f7108H5
            r6.append(r0)
            java.lang.String r0 = "/srv/imgs/gen/"
            r6.append(r0)
            r0 = 2261075(0x228053, float:3.168441E-39)
            r6.append(r0)
            java.lang.String r0 = "_fondo.png?v="
            r6.append(r0)
            british.x.config r0 = r5.f8472b
            int r0 = r0.f7163D
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 1
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0036 }
            r2.<init>(r6)     // Catch:{ MalformedURLException -> 0x0036 }
            r6 = 1
            goto L_0x0038
        L_0x0036:
            r2 = 0
            r6 = 0
        L_0x0038:
            if (r6 == 0) goto L_0x008e
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x006d }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x006d }
            r2.setDoInput(r0)     // Catch:{ IOException -> 0x006d }
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)     // Catch:{ IOException -> 0x006d }
            r0 = 7000(0x1b58, float:9.809E-42)
            r2.setReadTimeout(r0)     // Catch:{ IOException -> 0x006d }
            r2.connect()     // Catch:{ IOException -> 0x006d }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x006d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ IOException -> 0x006d }
            r5.f8473c = r0     // Catch:{ IOException -> 0x006d }
            java.lang.String r0 = "fondo"
            java.io.FileOutputStream r0 = r5.openFileOutput(r0, r1)     // Catch:{  }
            android.graphics.Bitmap r2 = r5.f8473c     // Catch:{  }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
            r4 = 100
            r2.compress(r3, r4, r0)     // Catch:{  }
            r0.close()     // Catch:{  }
            goto L_0x006e
        L_0x006d:
            r6 = 0
        L_0x006e:
            british.x.config r0 = r5.f8472b
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = r0.f7313c1
            if (r0 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x008e
            java.lang.String r6 = "sh"
            android.content.SharedPreferences r6 = r5.getSharedPreferences(r6, r1)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            british.x.config r0 = r5.f8472b
            int r0 = r0.f7163D
            java.lang.String r1 = "fondo_v_act"
            r6.putInt(r1, r0)
            r6.commit()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_cargar_fondo.onHandleIntent(android.content.Intent):void");
    }
}
