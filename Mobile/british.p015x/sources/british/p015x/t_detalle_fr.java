package british.p015x;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

/* renamed from: british.x.t_detalle_fr */
public class t_detalle_fr extends Fragment implements View.OnClickListener {

    /* renamed from: A0 */
    C2310h f9354A0;

    /* renamed from: B0 */
    C2309g f9355B0;

    /* renamed from: C0 */
    C2308f f9356C0;

    /* renamed from: D0 */
    private View f9357D0 = null;

    /* renamed from: E0 */
    private WebView f9358E0 = null;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public ProgressBar f9359F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public FrameLayout f9360G0 = null;

    /* renamed from: H0 */
    private RelativeLayout f9361H0;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public long f9362I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public String[] f9363J0 = {"_id", "ref", "titulo", "descr", "idcat", "precio", "precio_descr", "url_compra", "img1_p", "img1_id", "img1_url", "det_cargado", "anyo", "mes", "dia"};

    /* renamed from: K0 */
    private boolean f9364K0;

    /* renamed from: m0 */
    C1692config f9365m0;

    /* renamed from: n0 */
    long f9366n0;

    /* renamed from: o0 */
    int f9367o0;

    /* renamed from: p0 */
    float f9368p0;

    /* renamed from: q0 */
    boolean f9369q0 = false;

    /* renamed from: r0 */
    boolean f9370r0 = true;

    /* renamed from: s0 */
    boolean f9371s0 = true;

    /* renamed from: t0 */
    boolean f9372t0 = false;

    /* renamed from: u0 */
    SharedPreferences f9373u0;

    /* renamed from: v0 */
    String f9374v0;

    /* renamed from: w0 */
    String f9375w0;

    /* renamed from: x0 */
    String f9376x0;

    /* renamed from: y0 */
    String f9377y0;

    /* renamed from: z0 */
    String f9378z0 = SessionDescription.SUPPORTED_SDP_VERSION;

    /* renamed from: british.x.t_detalle_fr$a */
    class C2303a extends WebChromeClient {
        C2303a() {
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: british.x.t_detalle_fr$b */
    class C2304b implements View.OnTouchListener {
        C2304b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: british.x.t_detalle_fr$c */
    class C2305c implements DownloadListener {
        C2305c() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            t_detalle_fr.this.mo3370J1(intent);
        }
    }

    /* renamed from: british.x.t_detalle_fr$d */
    class C2306d extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f9382a;

        C2306d(ProgressBar progressBar) {
            this.f9382a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9382a.setVisibility(8);
            if (t_detalle_fr.this.f9371s0) {
                webView.clearHistory();
                t_detalle_fr.this.f9371s0 = false;
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f9382a.setVisibility(0);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return t_detalle_fr.this.m8793Y1(str, true);
        }
    }

    /* renamed from: british.x.t_detalle_fr$e */
    class C2307e extends ClickableSpan {

        /* renamed from: b */
        String f9384b;

        C2307e() {
            this.f9384b = t_detalle_fr.this.f9377y0;
        }

        public void onClick(View view) {
            boolean unused = t_detalle_fr.this.m8793Y1(this.f9384b, false);
        }
    }

    /* renamed from: british.x.t_detalle_fr$f */
    private class C2308f extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f9386a;

        /* renamed from: b */
        long f9387b;

        private C2308f() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
                r0.<init>()     // Catch:{ Exception -> 0x009e }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x009e }
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                java.lang.String r1 = "/srv/prod_detalle.php?v=1&idapp="
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                r1 = 2261075(0x228053, float:3.168441E-39)
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                java.lang.String r1 = "&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                british.x.t_detalle_fr r1 = british.p015x.t_detalle_fr.this     // Catch:{ Exception -> 0x009e }
                long r1 = r1.f9366n0     // Catch:{ Exception -> 0x009e }
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                java.lang.String r1 = "&idprod="
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                long r1 = r5.f9387b     // Catch:{ Exception -> 0x009e }
                r0.append(r1)     // Catch:{ Exception -> 0x009e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009e }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x009e }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x009e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x009e }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r6.<init>()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
            L_0x0061:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                if (r2 == 0) goto L_0x007c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r3.<init>()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r3.append(r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r6.append(r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                goto L_0x0061
            L_0x007c:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r5.f9386a = r6     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r1 = "@EURO@"
                java.lang.String r2 = "€"
                java.lang.String r6 = r6.replace(r1, r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r5.f9386a = r6     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r0.disconnect()
                r6 = 0
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0095:
                r6 = move-exception
                goto L_0x00a9
            L_0x0097:
                r6 = r0
                goto L_0x009e
            L_0x0099:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a9
            L_0x009e:
                r0 = -1
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0099 }
                if (r6 == 0) goto L_0x00a8
                r6.disconnect()
            L_0x00a8:
                return r0
            L_0x00a9:
                if (r0 == 0) goto L_0x00ae
                r0.disconnect()
            L_0x00ae:
                goto L_0x00b0
            L_0x00af:
                throw r6
            L_0x00b0:
                goto L_0x00af
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_detalle_fr.C2308f.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo3443p() != null) {
                if (b.byteValue() == 0 && !this.f9386a.contains("-KO-")) {
                    String[] split = this.f9386a.split(",");
                    ContentValues contentValues = new ContentValues();
                    if (!split[0].trim().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        contentValues.put("ref", split[0].trim().replace("@x@", ","));
                    }
                    if (!split[1].trim().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        contentValues.put("descr", split[1].trim().replace("@x@", ","));
                    }
                    contentValues.put("idcat", split[2].trim());
                    if (!split[3].trim().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        contentValues.put("precio_descr", split[3].trim().replace("@x@", ","));
                    }
                    if (!split[4].trim().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        contentValues.put("url_compra", split[4].trim().replace("@x@", ","));
                    }
                    contentValues.put("det_cargado", 1);
                    ContentResolver contentResolver = t_detalle_fr.this.mo3443p().getContentResolver();
                    Uri uri = bd_provider.f6882c;
                    contentResolver.update(uri, contentValues, "_id=" + this.f9387b, (String[]) null);
                    if (!split[5].equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        String[] split2 = split[5].split("@z@");
                        for (int i = 0; i < split2.length; i++) {
                            String[] split3 = split2[i].split(";");
                            contentValues.clear();
                            contentValues.put("_id", split3[0]);
                            contentValues.put("idprod", Long.valueOf(this.f9387b));
                            String replace = split3[1].replace("@y@", ";").replace("@x@", ",");
                            if (replace.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                                replace = "";
                            }
                            contentValues.put("url", replace);
                            contentValues.put("orden", Integer.valueOf(i));
                            t_detalle_fr.this.mo3443p().getContentResolver().insert(bd_provider.f6883d, contentValues);
                        }
                    }
                    if (this.f9387b == t_detalle_fr.this.f9362I0) {
                        SQLiteDatabase readableDatabase = new C2037q(t_detalle_fr.this.mo3443p()).getReadableDatabase();
                        if (readableDatabase != null) {
                            String[] N1 = t_detalle_fr.this.f9363J0;
                            Cursor query = readableDatabase.query("productos", N1, "_id=" + this.f9387b, (String[]) null, (String) null, (String) null, "_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                            if (query.moveToFirst()) {
                                t_detalle_fr.this.m8791V1(query);
                            }
                            query.close();
                        }
                        readableDatabase.close();
                    }
                }
                t_detalle_fr.this.f9359F0.setVisibility(8);
                t_detalle_fr.this.f9360G0.findViewById(R.id.sv_det).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_detalle_fr.this.f9360G0.findViewById(R.id.sv_det).setVisibility(8);
            t_detalle_fr.this.f9359F0.setVisibility(0);
            this.f9387b = t_detalle_fr.this.f9362I0;
        }
    }

    /* renamed from: british.x.t_detalle_fr$g */
    private class C2309g extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f9389a;

        /* renamed from: b */
        String f9390b;

        /* renamed from: c */
        int f9391c;

        /* renamed from: d */
        boolean f9392d = false;

        /* renamed from: e */
        public ProgressBar f9393e;

        public C2309g(ImageView imageView) {
            this.f9390b = ((Integer) imageView.getTag(R.id.TAG_IDFOTO)) + "";
            this.f9393e = (ProgressBar) ((RelativeLayout) imageView.getParent()).getChildAt(1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C1692config.f7109I5 + "/srv/imgs/prods/" + this.f9390b + "_" + t_detalle_fr.this.f9362I0 + ".png").openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    if (decodeStream == null) {
                        return (byte) -1;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    this.f9389a = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    this.f9392d = true;
                    return (byte) 0;
                } catch (IOException unused2) {
                    return (byte) -1;
                }
            } catch (MalformedURLException unused3) {
                return (byte) -1;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo3443p() != null && b.byteValue() == 0) {
                boolean z = true;
                if (this.f9392d) {
                    ContentValues contentValues = new ContentValues();
                    int i = this.f9391c;
                    if (i == 1) {
                        contentValues.put("img1", this.f9389a);
                        ContentResolver contentResolver = t_detalle_fr.this.mo3443p().getContentResolver();
                        Uri uri = bd_provider.f6882c;
                        contentResolver.update(uri, contentValues, "img1_id='" + this.f9390b + "'", (String[]) null);
                    } else if (i == 2) {
                        contentValues.put("img", this.f9389a);
                        ContentResolver contentResolver2 = t_detalle_fr.this.mo3443p().getContentResolver();
                        Uri uri2 = bd_provider.f6883d;
                        contentResolver2.update(uri2, contentValues, "_id='" + this.f9390b + "'", (String[]) null);
                    }
                }
                this.f9393e.setVisibility(8);
                File file = new File(t_detalle_fr.this.mo3443p().getFilesDir(), "temp");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                    fileOutputStream.write(this.f9389a);
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                if (z && file.exists()) {
                    Intent intent = new Intent(t_detalle_fr.this.mo3443p(), t_url.class);
                    intent.putExtra("url", "file://" + file);
                    intent.putExtra("bg1", t_detalle_fr.this.f9365m0.f7189H1);
                    intent.putExtra("bg2", t_detalle_fr.this.f9365m0.f7189H1);
                    t_detalle_fr.this.startActivityForResult(intent, 0);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            boolean z;
            this.f9389a = null;
            SQLiteDatabase readableDatabase = new C2037q(t_detalle_fr.this.mo3443p()).getReadableDatabase();
            if (readableDatabase != null) {
                Cursor rawQuery = readableDatabase.rawQuery("SELECT 1 AS tipo,img1_url AS url,img1 AS img,img1_p AS img_p FROM productos WHERE img1_id=" + this.f9390b + " UNION SELECT 2 AS tipo,url,img,img_p FROM fotos WHERE _id=" + this.f9390b, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("img"))) {
                        this.f9389a = rawQuery.getBlob(rawQuery.getColumnIndex("img"));
                    } else if (!rawQuery.getString(rawQuery.getColumnIndex("url")).equals("")) {
                        this.f9389a = rawQuery.getBlob(rawQuery.getColumnIndex("img_p"));
                    } else {
                        this.f9391c = rawQuery.getInt(rawQuery.getColumnIndex("tipo"));
                    }
                }
                rawQuery.close();
            }
            readableDatabase.close();
            if (this.f9389a != null) {
                File file = new File(t_detalle_fr.this.mo3443p().getFilesDir(), "temp");
                try {
                    FileOutputStream openFileOutput = t_detalle_fr.this.mo3443p().openFileOutput("temp", 0);
                    openFileOutput.write(this.f9389a);
                    openFileOutput.close();
                    z = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                if (z && file.exists()) {
                    Intent intent = new Intent(t_detalle_fr.this.mo3443p(), t_url.class);
                    intent.putExtra("url", "file://" + file);
                    intent.putExtra("bg1", t_detalle_fr.this.f9365m0.f7189H1);
                    intent.putExtra("bg2", t_detalle_fr.this.f9365m0.f7189H1);
                    t_detalle_fr.this.startActivityForResult(intent, 0);
                }
                cancel(true);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f9393e.setLayoutParams(layoutParams);
            this.f9393e.setVisibility(0);
        }
    }

    /* renamed from: british.x.t_detalle_fr$h */
    private class C2310h extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f9395a;

        /* renamed from: b */
        String f9396b;

        /* renamed from: c */
        String f9397c;

        /* renamed from: d */
        int f9398d;

        /* renamed from: e */
        int f9399e;

        /* renamed from: f */
        long f9400f;

        public C2310h(int i) {
            this.f9399e = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                british.x.t_detalle_fr r9 = british.p015x.t_detalle_fr.this
                androidx.fragment.app.FragmentActivity r9 = r9.mo3443p()
                r0 = -1
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                if (r9 != 0) goto L_0x000e
                return r0
            L_0x000e:
                java.lang.String r9 = "0"
                r8.f9396b = r9
                british.x.q r1 = new british.x.q
                british.x.t_detalle_fr r2 = british.p015x.t_detalle_fr.this
                androidx.fragment.app.FragmentActivity r2 = r2.mo3443p()
                r1.<init>(r2)
                android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
                java.lang.String r2 = ""
                r3 = 0
                if (r1 == 0) goto L_0x009a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "SELECT 1 AS tipo,img1_id AS id,0 AS orden,img1_url AS url FROM productos WHERE (_id="
                r4.append(r5)
                british.x.t_detalle_fr r5 = british.p015x.t_detalle_fr.this
                long r5 = r5.f9362I0
                r4.append(r5)
                java.lang.String r5 = ") AND (img1_id NOT IN ("
                r4.append(r5)
                british.x.t_detalle_fr r5 = british.p015x.t_detalle_fr.this
                java.lang.String r5 = r5.f9378z0
                r4.append(r5)
                java.lang.String r5 = ")) AND (img1_p IS NULL) UNION SELECT 2 AS tipo,_id AS id,orden,url FROM fotos WHERE (idprod="
                r4.append(r5)
                british.x.t_detalle_fr r5 = british.p015x.t_detalle_fr.this
                long r5 = r5.f9362I0
                r4.append(r5)
                java.lang.String r5 = ") AND (_id NOT IN ("
                r4.append(r5)
                british.x.t_detalle_fr r5 = british.p015x.t_detalle_fr.this
                java.lang.String r5 = r5.f9378z0
                r4.append(r5)
                java.lang.String r5 = ")) AND (img_p IS NULL) ORDER BY orden"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.database.Cursor r4 = r1.rawQuery(r4, r3)
                boolean r5 = r4.moveToFirst()
                if (r5 == 0) goto L_0x0095
                java.lang.String r5 = "id"
                int r5 = r4.getColumnIndex(r5)
                java.lang.String r5 = r4.getString(r5)
                r8.f9396b = r5
                java.lang.String r5 = "tipo"
                int r5 = r4.getColumnIndex(r5)
                int r5 = r4.getInt(r5)
                r8.f9398d = r5
                java.lang.String r5 = "url"
                int r5 = r4.getColumnIndex(r5)
                java.lang.String r5 = r4.getString(r5)
                goto L_0x0096
            L_0x0095:
                r5 = r2
            L_0x0096:
                r4.close()
                goto L_0x009b
            L_0x009a:
                r5 = r2
            L_0x009b:
                r1.close()
                java.lang.String r1 = r8.f9396b
                boolean r9 = r1.equals(r9)
                r1 = 1
                if (r9 == 0) goto L_0x00ac
                java.lang.Byte r9 = java.lang.Byte.valueOf(r1)
                return r9
            L_0x00ac:
                r8.f9397c = r5
                boolean r9 = r5.equals(r2)
                if (r9 == 0) goto L_0x0107
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7109I5
                r9.append(r2)
                java.lang.String r4 = "/srv/imgs/prods/"
                r9.append(r4)
                java.lang.String r5 = r8.f9396b
                r9.append(r5)
                java.lang.String r5 = "_"
                r9.append(r5)
                british.x.t_detalle_fr r6 = british.p015x.t_detalle_fr.this
                long r6 = r6.f9362I0
                r9.append(r6)
                java.lang.String r6 = "_p.png"
                r9.append(r6)
                java.lang.String r9 = r9.toString()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r8.f9396b
                r6.append(r2)
                r6.append(r5)
                british.x.t_detalle_fr r2 = british.p015x.t_detalle_fr.this
                long r4 = r2.f9362I0
                r6.append(r4)
                java.lang.String r2 = ".png"
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r8.f9397c = r2
                r5 = r9
            L_0x0107:
                java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x017f }
                r9.<init>(r5)     // Catch:{ MalformedURLException -> 0x017f }
                java.net.URLConnection r2 = r9.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{  }
                r2.setDoInput(r1)     // Catch:{  }
                r4 = 5000(0x1388, float:7.006E-42)
                r2.setConnectTimeout(r4)     // Catch:{  }
                r5 = 7000(0x1b58, float:9.809E-42)
                r2.setReadTimeout(r5)     // Catch:{  }
                r2.connect()     // Catch:{  }
                java.io.InputStream r6 = r2.getInputStream()     // Catch:{  }
                android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{  }
                r7.<init>()     // Catch:{  }
                r7.inJustDecodeBounds = r1     // Catch:{  }
                android.graphics.BitmapFactory.decodeStream(r6, r3, r7)     // Catch:{  }
                r6.close()     // Catch:{  }
                r2.disconnect()     // Catch:{  }
                british.x.t_detalle_fr r2 = british.p015x.t_detalle_fr.this     // Catch:{  }
                british.x.config r2 = r2.f9365m0     // Catch:{  }
                r2 = 300(0x12c, float:4.2E-43)
                int r2 = british.p015x.C1692config.m8192m(r7, r2, r2)     // Catch:{  }
                r7.inSampleSize = r2     // Catch:{  }
                java.net.URLConnection r9 = r9.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{  }
                r9.setDoInput(r1)     // Catch:{  }
                r9.setConnectTimeout(r4)     // Catch:{  }
                r9.setReadTimeout(r5)     // Catch:{  }
                r9.connect()     // Catch:{  }
                java.io.InputStream r9 = r9.getInputStream()     // Catch:{  }
                r1 = 0
                r7.inJustDecodeBounds = r1     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r9, r3, r7)     // Catch:{  }
                r9.close()     // Catch:{  }
                if (r2 != 0) goto L_0x0165
                return r0
            L_0x0165:
                java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
                r9.<init>()
                android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
                r3 = 100
                r2.compress(r0, r3, r9)
                byte[] r0 = r9.toByteArray()
                r8.f9395a = r0
                r9.close()     // Catch:{ IOException -> 0x017a }
            L_0x017a:
                java.lang.Byte r9 = java.lang.Byte.valueOf(r1)
                return r9
            L_0x017f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_detalle_fr.C2310h.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo3443p() != null) {
                if (b.byteValue() == 0) {
                    ContentValues contentValues = new ContentValues();
                    int i = this.f9398d;
                    if (i == 1) {
                        contentValues.put("img1_p", this.f9395a);
                        t_detalle_fr.this.mo3443p().getContentResolver().update(bd_provider.f6882c, contentValues, "img1_id='" + this.f9396b + "'", (String[]) null);
                    } else if (i == 2) {
                        contentValues.put("img_p", this.f9395a);
                        t_detalle_fr.this.mo3443p().getContentResolver().update(bd_provider.f6883d, contentValues, "_id='" + this.f9396b + "'", (String[]) null);
                    }
                    if (this.f9400f == t_detalle_fr.this.f9362I0) {
                        StringBuilder sb = new StringBuilder();
                        t_detalle_fr t_detalle_fr = t_detalle_fr.this;
                        sb.append(t_detalle_fr.f9378z0);
                        sb.append(",");
                        sb.append(this.f9396b);
                        t_detalle_fr.f9378z0 = sb.toString();
                        t_detalle_fr.this.mo8634U1(this.f9395a, Integer.parseInt(this.f9396b), this.f9397c);
                    }
                }
                if (b.byteValue() != 1 && this.f9400f == t_detalle_fr.this.f9362I0) {
                    if (b.byteValue() == -1) {
                        this.f9399e++;
                    } else {
                        this.f9399e = 0;
                    }
                    int i2 = this.f9399e;
                    if (i2 < 3) {
                        t_detalle_fr t_detalle_fr2 = t_detalle_fr.this;
                        t_detalle_fr2.f9354A0 = new C2310h(i2);
                        t_detalle_fr.this.f9354A0.execute(new String[0]);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f9400f = t_detalle_fr.this.f9362I0;
        }
    }

    public t_detalle_fr() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0613 A[LOOP:1: B:138:0x0613->B:140:0x0619, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0424  */
    /* renamed from: V1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8791V1(android.database.Cursor r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "/"
            java.lang.String r3 = "utf-8"
            java.lang.String r4 = "ref"
            int r4 = r1.getColumnIndex(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.f9375w0 = r4
            android.widget.FrameLayout r4 = r0.f9360G0
            r5 = 2131363104(0x7f0a0520, float:1.8346007E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 8
            r4.setVisibility(r5)
            java.lang.String r6 = r0.f9375w0
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            java.lang.String r8 = "#"
            r9 = 0
            if (r6 != 0) goto L_0x005d
            java.lang.String r6 = r0.f9375w0
            r4.setText(r6)
            british.x.config r6 = r0.f9365m0
            java.lang.String r6 = r6.f7445w1
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x005a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            british.x.config r10 = r0.f9365m0
            java.lang.String r10 = r10.f7445w1
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            r4.setTextColor(r6)
        L_0x005a:
            r4.setVisibility(r9)
        L_0x005d:
            java.lang.String r4 = "titulo"
            int r4 = r1.getColumnIndex(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.f9374v0 = r4
            android.widget.FrameLayout r4 = r0.f9360G0
            r6 = 2131363105(0x7f0a0521, float:1.834601E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = r0.f9374v0
            r4.setText(r6)
            british.x.config r6 = r0.f9365m0
            java.lang.String r6 = r6.f7171E1
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            british.x.config r10 = r0.f9365m0
            java.lang.String r10 = r10.f7171E1
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            r4.setTextColor(r6)
        L_0x009d:
            android.widget.FrameLayout r4 = r0.f9360G0
            r6 = 2131363100(0x7f0a051c, float:1.8346E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r5)
            java.lang.String r6 = "anyo"
            int r6 = r1.getColumnIndex(r6)
            int r6 = r1.getInt(r6)
            java.lang.String r10 = "0"
            if (r6 == 0) goto L_0x01bc
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "mes"
            int r14 = r1.getColumnIndex(r14)
            int r14 = r1.getInt(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r7)
            java.lang.String r15 = r15.toString()
            boolean r16 = r15.equals(r10)
            java.lang.String r17 = "1"
            if (r16 == 0) goto L_0x00eb
            r15 = r17
        L_0x00eb:
            java.lang.String r11 = "dia"
            int r11 = r1.getColumnIndex(r11)
            int r11 = r1.getInt(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            boolean r18 = r5.equals(r10)
            if (r18 == 0) goto L_0x010c
            r5 = r17
        L_0x010c:
            r9 = 3
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ Exception -> 0x0131 }
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r9, r12)     // Catch:{ Exception -> 0x0131 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0131 }
            r12.<init>()     // Catch:{ Exception -> 0x0131 }
            r12.append(r15)     // Catch:{ Exception -> 0x0131 }
            r12.append(r2)     // Catch:{ Exception -> 0x0131 }
            r12.append(r5)     // Catch:{ Exception -> 0x0131 }
            r12.append(r2)     // Catch:{ Exception -> 0x0131 }
            r12.append(r13)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r2 = r12.toString()     // Catch:{ Exception -> 0x0131 }
            java.util.Date r2 = r9.parse(r2)     // Catch:{ Exception -> 0x0131 }
            r5 = 1
            goto L_0x0133
        L_0x0131:
            r2 = 0
            r5 = 0
        L_0x0133:
            if (r5 == 0) goto L_0x01bc
            if (r14 != 0) goto L_0x0147
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            goto L_0x0191
        L_0x0147:
            if (r11 != 0) goto L_0x0189
            java.util.Locale r5 = java.util.Locale.getDefault()
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r12 = 0
            r11[r12] = r2
            java.lang.String r2 = "%tB"
            java.lang.String r2 = java.lang.String.format(r5, r2, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = r2.substring(r12, r9)
            java.lang.String r11 = r11.toUpperCase()
            r5.append(r11)
            java.lang.String r2 = r2.substring(r9)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ", "
            r5.append(r2)
            r5.append(r6)
            java.lang.String r2 = r5.toString()
            goto L_0x0191
        L_0x0189:
            java.text.DateFormat r5 = java.text.DateFormat.getDateInstance()
            java.lang.String r2 = r5.format(r2)
        L_0x0191:
            r4.setText(r2)
            british.x.config r2 = r0.f9365m0
            java.lang.String r2 = r2.f7183G1
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x01b8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7183G1
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r4.setTextColor(r2)
        L_0x01b8:
            r2 = 0
            r4.setVisibility(r2)
        L_0x01bc:
            android.widget.FrameLayout r2 = r0.f9360G0
            r4 = 2131363102(0x7f0a051e, float:1.8346003E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            british.x.config r4 = r0.f9365m0
            java.lang.String r4 = r4.f7445w1
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x01eb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7445w1
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r2.setTextColor(r4)
        L_0x01eb:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x0202
            android.content.res.Resources r4 = r19.mo3380N()
            r5 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r4 = r4.getBoolean(r5)
            if (r4 == 0) goto L_0x0202
            r4 = 4
            r2.setTextDirection(r4)
        L_0x0202:
            java.lang.String r4 = "descr"
            int r4 = r1.getColumnIndex(r4)
            java.lang.String r4 = r1.getString(r4)
            r5 = 1
            r0.m8792X1(r2, r4, r5)
            android.widget.FrameLayout r2 = r0.f9360G0
            r4 = 2131363103(0x7f0a051f, float:1.8346005E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4 = 8
            r2.setVisibility(r4)
            java.lang.String r4 = "precio"
            int r5 = r1.getColumnIndex(r4)
            boolean r5 = r1.isNull(r5)
            if (r5 != 0) goto L_0x0366
            r5 = 0
            int r4 = r1.getColumnIndex(r4)     // Catch:{ Exception -> 0x0238 }
            double r11 = r1.getDouble(r4)     // Catch:{ Exception -> 0x0238 }
            r4 = 1
            goto L_0x023a
        L_0x0238:
            r11 = r5
            r4 = 0
        L_0x023a:
            if (r4 == 0) goto L_0x0366
            r4 = 2
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0262
            java.text.DecimalFormatSymbols r5 = new java.text.DecimalFormatSymbols
            r5.<init>()
            r6 = 46
            r5.setDecimalSeparator(r6)
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            r6.<init>()
            r9 = 0
            r6.setGroupingUsed(r9)
            r6.setMinimumFractionDigits(r4)
            r6.setMaximumFractionDigits(r4)
            r6.setDecimalFormatSymbols(r5)
            java.lang.String r5 = r6.format(r11)
            goto L_0x0263
        L_0x0262:
            r5 = r7
        L_0x0263:
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            r6.<init>()
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.util.Currency r9 = java.util.Currency.getInstance(r9)
            r6.setCurrency(r9)
            java.lang.String r6 = r6.format(r11)
            int r9 = r6.length()
            java.lang.String r11 = "."
            r12 = 1
            if (r9 <= r12) goto L_0x02ab
            int r9 = r6.length()
            int r9 = r9 - r4
            int r4 = r6.length()
            int r4 = r4 - r12
            java.lang.String r4 = r6.substring(r9, r4)
            java.lang.String r9 = ","
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x029c
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x02ab
        L_0x029c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r10)
            java.lang.String r6 = r4.toString()
        L_0x02ab:
            british.x.config r4 = r0.f9365m0
            java.lang.String r4 = r4.f7224N0
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x02c5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            goto L_0x02ed
        L_0x02c5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "&nbsp;"
            r6.append(r9)
            british.x.config r9 = r0.f9365m0
            java.lang.String r9 = r9.f7224N0
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
        L_0x02ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            java.lang.String r4 = "precio_descr"
            int r4 = r1.getColumnIndex(r4)
            java.lang.String r4 = r1.getString(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.trim()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r2.setText(r4)
            british.x.config r4 = r0.f9365m0
            java.lang.String r4 = r4.f7177F1
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0361
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            british.x.config r6 = r0.f9365m0
            java.lang.String r6 = r6.f7177F1
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r2.setTextColor(r4)
            android.content.res.Resources r4 = r19.mo3380N()
            r6 = 2131231427(0x7f0802c3, float:1.8078935E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            british.x.config r9 = r0.f9365m0
            java.lang.String r9 = r9.f7177F1
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r6, r9)
        L_0x0361:
            r4 = 0
            r2.setVisibility(r4)
            goto L_0x0367
        L_0x0366:
            r5 = r7
        L_0x0367:
            r0.f9376x0 = r7
            british.x.config r2 = r0.f9365m0
            java.lang.String r2 = r2.f7248R0
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0424
            british.x.config r2 = r0.f9365m0
            java.lang.String r2 = r2.f7254S0
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0424
            boolean r2 = r5.equals(r7)
            if (r2 != 0) goto L_0x0430
            r2 = 1
            r0.f9372t0 = r2
            british.x.config r2 = r0.f9365m0
            java.lang.String r2 = r2.f7248R0
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Exception -> 0x038e }
        L_0x038e:
            java.lang.String r4 = r0.f9374v0
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r3)     // Catch:{ Exception -> 0x0394 }
        L_0x0394:
            java.lang.String r6 = r0.f9375w0
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r3)     // Catch:{ Exception -> 0x039b }
            goto L_0x039c
        L_0x039b:
        L_0x039c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "https://www.paypal.com/cgi-bin/webscr/?rm=2&cmd=_xclick&business="
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = "&item_name="
            r9.append(r2)
            int r2 = r4.length()
            r10 = 127(0x7f, float:1.78E-43)
            int r2 = java.lang.Math.min(r2, r10)
            r11 = 0
            java.lang.String r2 = r4.substring(r11, r2)
            r9.append(r2)
            java.lang.String r2 = "&item_number="
            r9.append(r2)
            int r2 = r6.length()
            int r2 = java.lang.Math.min(r2, r10)
            java.lang.String r2 = r6.substring(r11, r2)
            r9.append(r2)
            java.lang.String r2 = "&amount="
            r9.append(r2)
            r9.append(r5)
            java.lang.String r2 = "&no_shipping=0&no_note=1&currency_code="
            r9.append(r2)
            british.x.config r2 = r0.f9365m0
            java.lang.String r2 = r2.f7254S0
            r9.append(r2)
            java.lang.String r2 = "&bn=PP-BuyNowBF"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            r0.f9376x0 = r2
            boolean r2 = r0.f9369q0
            if (r2 != 0) goto L_0x0430
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 15
            if (r2 < r4) goto L_0x0430
            java.lang.String r2 = "https://CLOSETHIS"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Exception -> 0x0403 }
        L_0x0403:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.f9376x0
            r3.append(r4)
            java.lang.String r4 = "&return="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "&cancel_return="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.f9376x0 = r2
            goto L_0x0430
        L_0x0424:
            java.lang.String r2 = "url_compra"
            int r2 = r1.getColumnIndex(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.f9376x0 = r2
        L_0x0430:
            android.widget.FrameLayout r2 = r0.f9360G0
            r3 = 2131361955(0x7f0a00a3, float:1.8343677E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r2.setVisibility(r3)
            java.lang.String r3 = r0.f9376x0
            boolean r3 = r3.equals(r7)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r3 != 0) goto L_0x04a2
            british.x.config r3 = r0.f9365m0
            java.lang.String r3 = r3.f7459y1
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x048a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7459y1
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7459y1
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            boolean r3 = british.p015x.C1692config.m8153I(r3)
            if (r3 == 0) goto L_0x048a
            r2.setTextColor(r4)
        L_0x048a:
            british.x.config r3 = r0.f9365m0
            java.lang.String r3 = r3.f7242Q0
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x049b
            british.x.config r3 = r0.f9365m0
            java.lang.String r3 = r3.f7242Q0
            r2.setText(r3)
        L_0x049b:
            r2.setOnClickListener(r0)
            r3 = 0
            r2.setVisibility(r3)
        L_0x04a2:
            android.widget.FrameLayout r2 = r0.f9360G0
            r3 = 2131361956(0x7f0a00a4, float:1.8343679E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r2.setVisibility(r3)
            british.x.config r3 = r0.f9365m0
            british.x.i[] r5 = r3.f7237P1
            int r5 = r5.length
            if (r5 <= 0) goto L_0x0513
            boolean r5 = r3.f7200J0
            if (r5 == 0) goto L_0x0513
            java.lang.String r3 = r3.f7459y1
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x04fb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7459y1
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            british.x.config r5 = r0.f9365m0
            java.lang.String r5 = r5.f7459y1
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            boolean r3 = british.p015x.C1692config.m8153I(r3)
            if (r3 == 0) goto L_0x04fb
            r2.setTextColor(r4)
        L_0x04fb:
            british.x.config r3 = r0.f9365m0
            java.lang.String r3 = r3.f7236P0
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x050c
            british.x.config r3 = r0.f9365m0
            java.lang.String r3 = r3.f7236P0
            r2.setText(r3)
        L_0x050c:
            r2.setOnClickListener(r0)
            r3 = 0
            r2.setVisibility(r3)
        L_0x0513:
            android.widget.FrameLayout r2 = r0.f9360G0
            r3 = 2131362490(0x7f0a02ba, float:1.8344762E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.removeAllViews()
            british.x.q r2 = new british.x.q
            androidx.fragment.app.FragmentActivity r4 = r19.mo3443p()
            r2.<init>(r4)
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "SELECT img1_id AS id FROM productos WHERE (_id="
            r4.append(r5)
            long r5 = r0.f9362I0
            r4.append(r5)
            java.lang.String r5 = ") AND img1_id>0 UNION SELECT _id AS id FROM fotos WHERE (idprod="
            r4.append(r5)
            long r5 = r0.f9362I0
            r4.append(r5)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            android.database.Cursor r4 = r2.rawQuery(r4, r5)
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r6 = -2
            r5.<init>(r6, r6)
            android.widget.FrameLayout r6 = r0.f9360G0
            android.view.View r3 = r6.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r12 = 0
        L_0x0564:
            int r6 = r4.getCount()
            if (r12 >= r6) goto L_0x05cf
            android.widget.ImageSwitcher r6 = new android.widget.ImageSwitcher
            androidx.fragment.app.FragmentActivity r8 = r19.mo3443p()
            r6.<init>(r8)
            r6.setLayoutParams(r5)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            int r9 = r0.f9367o0
            r8.width = r9
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            int r9 = r0.f9367o0
            r8.height = r9
            boolean r8 = r0.f9364K0
            if (r8 == 0) goto L_0x0598
            android.widget.ProgressBar r8 = new android.widget.ProgressBar
            androidx.fragment.app.FragmentActivity r9 = r19.mo3443p()
            r10 = 16843399(0x1010287, float:2.369537E-38)
            r11 = 0
            r8.<init>(r9, r11, r10)
            goto L_0x05a5
        L_0x0598:
            r11 = 0
            android.widget.ProgressBar r8 = new android.widget.ProgressBar
            androidx.fragment.app.FragmentActivity r9 = r19.mo3443p()
            r10 = 16842871(0x1010077, float:2.3693892E-38)
            r8.<init>(r9, r11, r10)
        L_0x05a5:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 20
            if (r9 <= r10) goto L_0x05b2
            british.x.config r9 = r0.f9365m0
            java.lang.String r9 = r9.f7368l1
            british.p015x.C1692config.m8168S0(r8, r9)
        L_0x05b2:
            r8.setLayoutParams(r5)
            r9 = 1101004800(0x41a00000, float:20.0)
            float r10 = r0.f9368p0
            float r10 = r10 * r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r9
            int r9 = (int) r10
            r8.setPadding(r9, r9, r9, r9)
            r6.addView(r8)
            r3.addView(r6)
            r6 = 0
            r3.setVisibility(r6)
            int r12 = r12 + 1
            goto L_0x0564
        L_0x05cf:
            java.lang.String r3 = "img1_p"
            int r4 = r1.getColumnIndex(r3)
            boolean r4 = r1.isNull(r4)
            if (r4 != 0) goto L_0x05f0
            int r3 = r1.getColumnIndex(r3)
            byte[] r3 = r1.getBlob(r3)
            java.lang.String r4 = "img1_id"
            int r4 = r1.getColumnIndex(r4)
            int r1 = r1.getInt(r4)
            r0.mo8634U1(r3, r1, r7)
        L_0x05f0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "SELECT _id,img_p FROM fotos WHERE (idprod="
            r1.append(r3)
            long r3 = r0.f9362I0
            r1.append(r3)
            java.lang.String r3 = ") AND (img_p IS NOT NULL) ORDER BY orden"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 0
            android.database.Cursor r1 = r2.rawQuery(r1, r3)
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L_0x0634
        L_0x0613:
            boolean r3 = r1.isAfterLast()
            if (r3 != 0) goto L_0x0634
            java.lang.String r3 = "img_p"
            int r3 = r1.getColumnIndex(r3)
            byte[] r3 = r1.getBlob(r3)
            java.lang.String r4 = "_id"
            int r4 = r1.getColumnIndex(r4)
            int r4 = r1.getInt(r4)
            r0.mo8634U1(r3, r4, r7)
            r1.moveToNext()
            goto L_0x0613
        L_0x0634:
            r1.close()
            r2.close()
            british.x.t_detalle_fr$h r1 = r0.f9354A0
            if (r1 == 0) goto L_0x064c
            android.os.AsyncTask$Status r1 = r1.getStatus()
            android.os.AsyncTask$Status r2 = android.os.AsyncTask.Status.FINISHED
            if (r1 == r2) goto L_0x064c
            british.x.t_detalle_fr$h r1 = r0.f9354A0
            r2 = 1
            r1.cancel(r2)
        L_0x064c:
            british.x.t_detalle_fr$h r1 = new british.x.t_detalle_fr$h
            r2 = 0
            r1.<init>(r2)
            r0.f9354A0 = r1
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_detalle_fr.m8791V1(android.database.Cursor):void");
    }

    /* renamed from: X1 */
    private void m8792X1(TextView textView, String str, boolean z) {
        int i;
        int i2;
        if (z) {
            if (str.toUpperCase().indexOf("<BR") == -1) {
                str = str.replace("\n", "<br>");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str.replace("<a href", "@AHREF_INI@").replace("<A HREF", "@AHREF_INI@").replace("</a>", "@AHREF_FIN@").replace("</A>", "@AHREF_FIN@").replace("</ a>", "@AHREF_FIN@").replace("</ A>", "@AHREF_FIN@")));
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
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            String upperCase = spannableStringBuilder3.toUpperCase();
            for (int indexOf3 = upperCase.indexOf("<A HREF="); indexOf3 != -1; indexOf3 = upperCase.indexOf("<A HREF=", i)) {
                i = indexOf3 + 8;
                int i3 = i + 1;
                String substring = spannableStringBuilder3.substring(i, i3);
                if (substring.equals("\"") || substring.equals("'")) {
                    i = i3;
                }
                if (substring.equals("\"")) {
                    i2 = spannableStringBuilder3.indexOf("\"", i);
                } else if (substring.equals("'")) {
                    i2 = spannableStringBuilder3.indexOf("'", i);
                } else {
                    i2 = spannableStringBuilder3.indexOf(">", i);
                }
                if (i2 != -1) {
                    this.f9377y0 = spannableStringBuilder3.substring(i, i2).trim();
                    i2 = spannableStringBuilder3.indexOf(">", i2);
                    if (i2 != -1) {
                        int indexOf4 = upperCase.indexOf("</A>", i2);
                        int i4 = Integer.MAX_VALUE;
                        if (indexOf4 == -1) {
                            indexOf4 = Integer.MAX_VALUE;
                        }
                        int indexOf5 = upperCase.indexOf("</ A>", i2);
                        if (indexOf5 != -1) {
                            i4 = indexOf5;
                        }
                        if (indexOf4 == -1 && i4 == -1) {
                            i = i2;
                        } else {
                            int min = Math.min(indexOf4, i4);
                            int indexOf6 = spannableStringBuilder3.indexOf(">", min);
                            spannableStringBuilder.setSpan(new C2307e(), i2, min, 33);
                            int i5 = indexOf6 + 1;
                            spannableStringBuilder.delete(min, i5);
                            int i6 = min - (i5 - min);
                            int i7 = i2 + 1;
                            spannableStringBuilder.delete(indexOf3, i7);
                            int i8 = i6 - (i7 - indexOf3);
                            String spannableStringBuilder4 = spannableStringBuilder.toString();
                            i = i2;
                            i2 = i8;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            upperCase = spannableStringBuilder4.toUpperCase();
                        }
                    }
                }
                if (i2 != -1) {
                    i = i2;
                }
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public boolean m8793Y1(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = str;
        String lowerCase = str.toLowerCase();
        String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
        int lastIndexOf = str12.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str2 = lowerCase.substring(lastIndexOf);
        } else {
            str2 = "";
        }
        String replace = str2.replace(".", "");
        boolean z2 = true;
        if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
            if (lowerCase.startsWith("tel:")) {
                str3 = str12.substring(4);
            } else {
                str3 = str12.substring(11);
            }
            if (str3.endsWith("/")) {
                str3 = str3.substring(0, str3.length() - 1);
            }
            mo3370J1(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str3)));
        } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
            if (lowerCase.startsWith("mailto:")) {
                str4 = str12.substring(7).trim();
            } else {
                str4 = str12.substring(14).trim();
            }
            if (!str4.equals("")) {
                int indexOf = str4.indexOf("?");
                if (indexOf > 0) {
                    int indexOf2 = str4.indexOf("?subject=");
                    if (indexOf2 != -1) {
                        str6 = str4.substring(indexOf2 + 9).trim();
                        int indexOf3 = str6.indexOf("&body=");
                        if (indexOf3 != -1) {
                            str5 = str6.substring(indexOf3 + 6).trim();
                            str6 = str6.substring(0, indexOf3).trim();
                        } else {
                            str5 = "";
                        }
                    } else {
                        str6 = "";
                        str5 = str6;
                    }
                    str4 = str4.substring(0, indexOf).trim();
                } else {
                    str6 = "";
                    str5 = str6;
                }
                if (str4.endsWith("/")) {
                    str4 = str4.substring(0, str4.length() - 1);
                }
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str4, (String) null));
                if (!str6.equals("")) {
                    try {
                        str6 = URLDecoder.decode(str6, C6540C.UTF8_NAME);
                    } catch (Exception unused) {
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str6);
                }
                if (!str5.equals("")) {
                    try {
                        str5 = URLDecoder.decode(str5, C6540C.UTF8_NAME);
                    } catch (Exception unused2) {
                    }
                    intent.putExtra("android.intent.extra.TEXT", str5);
                }
                mo3370J1(Intent.createChooser(intent, mo3380N().getString(R.string.enviar_email)));
            }
        } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
            if (lowerCase.startsWith("smsto:")) {
                str7 = str12.substring(6).trim();
            } else {
                str7 = str12.substring(13).trim();
            }
            if (!str7.equals("")) {
                int indexOf4 = str7.indexOf("?");
                if (indexOf4 > 0) {
                    int indexOf5 = str7.indexOf("?body=");
                    if (indexOf5 != -1) {
                        str8 = str7.substring(indexOf5 + 6).trim();
                    } else {
                        str8 = "";
                    }
                    str7 = str7.substring(0, indexOf4).trim();
                } else {
                    str8 = "";
                }
                if (str7.endsWith("/")) {
                    str7 = str7.substring(0, str7.length() - 1);
                }
                Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str7));
                if (!str8.equals("")) {
                    try {
                        str8 = URLDecoder.decode(str8, C6540C.UTF8_NAME);
                    } catch (Exception unused3) {
                    }
                    intent2.putExtra("sms_body", str8);
                }
                try {
                    mo3370J1(intent2);
                } catch (Exception unused4) {
                }
            }
        } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
            if (lowerCase.startsWith("go:")) {
                str9 = str12.substring(3);
            } else {
                str9 = str12.substring(10);
            }
            if (str9.endsWith("/")) {
                str9 = str9.substring(0, str9.length() - 1);
            }
            try {
                str9 = URLDecoder.decode(str9, C6540C.UTF8_NAME);
            } catch (Exception unused5) {
            }
            int i = 0;
            boolean z3 = false;
            while (true) {
                C1855l[] lVarArr = this.f9365m0.f7231O1;
                if (i >= lVarArr.length) {
                    break;
                }
                if (lVarArr[i].f7922i.equalsIgnoreCase(str9)) {
                    startActivityForResult(this.f9365m0.mo7475B(Integer.valueOf(i), this.f9358E0.getContext()).f7842a, 0);
                    z3 = true;
                }
                i++;
            }
            if (!z3) {
                this.f9370r0 = false;
            }
            z2 = z3;
        } else if (lowerCase.startsWith("vnd.youtube:")) {
            int indexOf6 = str12.indexOf("?");
            if (indexOf6 > 0) {
                str11 = str12.substring(12, indexOf6);
            } else {
                str11 = str12.substring(12);
            }
            String str13 = "https://www.youtube.com/watch?v=" + str11;
            if (this.f9369q0) {
                this.f9365m0.mo7497c(this.f9358E0.getContext(), str13);
            } else {
                this.f9370r0 = false;
                Intent intent3 = new Intent(this.f9358E0.getContext(), t_url.class);
                intent3.putExtra("url", str13);
                startActivityForResult(intent3, 0);
            }
        } else if (lowerCase.endsWith(".mp3")) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "audio/*");
            mo3370J1(intent4);
        } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
            Intent intent5 = new Intent("android.intent.action.VIEW");
            intent5.setDataAndType(Uri.parse(str), "video/*");
            mo3370J1(intent5);
        } else if (lowerCase.startsWith("upi://")) {
            mo3370J1(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(str)), mo3380N().getString(R.string.selecciona)));
        } else if (this.f9369q0 || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.endsWith(".apk") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8")) {
            return this.f9365m0.mo7497c(this.f9358E0.getContext(), str12);
        } else {
            if (!Arrays.asList(strArr).contains(replace) || lowerCase.contains("docs.google.com")) {
                this.f9370r0 = false;
                z2 = false;
            } else if (!z || !this.f9358E0.getUrl().contains("docs.google.com")) {
                try {
                    str10 = URLEncoder.encode(str12, "utf-8");
                } catch (Exception unused6) {
                    str10 = str12;
                }
                String str14 = "https://docs.google.com/viewer?embedded=true&url=" + str10;
                if (z) {
                    this.f9358E0.loadUrl(str14);
                } else {
                    Intent intent6 = new Intent(this.f9358E0.getContext(), t_url.class);
                    intent6.putExtra("url", str14);
                    startActivityForResult(intent6, 0);
                }
                this.f9370r0 = false;
            } else {
                this.f9365m0.mo7497c(this.f9358E0.getContext(), str12);
            }
        }
        if (!z && !z2) {
            Intent intent7 = new Intent(this.f9358E0.getContext(), t_url.class);
            intent7.putExtra("url", str12);
            startActivityForResult(intent7, 0);
        }
        return z2;
    }

    @TargetApi(21)
    /* renamed from: Z1 */
    private void m8794Z1() {
        if (Build.VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9358E0, true);
        }
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        WebView webView = this.f9358E0;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }

    /* renamed from: T1 */
    public void mo8633T1(String str, long j) {
        String str2 = str;
        long j2 = j;
        this.f9362I0 = j2;
        if (this.f9357D0 != null) {
            this.f9370r0 = true;
            this.f9371s0 = true;
            if (!str2.equals("")) {
                this.f9360G0.setVisibility(8);
                this.f9358E0.loadUrl(str2);
                this.f9361H0.setVisibility(0);
                return;
            }
            this.f9361H0.setVisibility(8);
            SQLiteDatabase readableDatabase = new C2037q(mo3443p()).getReadableDatabase();
            if (readableDatabase != null) {
                String[] strArr = this.f9363J0;
                Cursor query = readableDatabase.query("productos", strArr, "_id=" + j2, (String[]) null, (String) null, (String) null, "_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                if (!query.moveToFirst()) {
                    query.close();
                } else if (query.getInt(query.getColumnIndex("det_cargado")) == 1) {
                    m8791V1(query);
                    query.close();
                } else {
                    query.close();
                    C2308f fVar = this.f9356C0;
                    if (!(fVar == null || fVar.getStatus() == AsyncTask.Status.FINISHED)) {
                        this.f9356C0.cancel(true);
                    }
                    C2308f fVar2 = new C2308f();
                    this.f9356C0 = fVar2;
                    fVar2.execute(new String[0]);
                }
            }
            readableDatabase.close();
            this.f9360G0.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public void mo8634U1(byte[] bArr, int i, String str) {
        ProgressBar progressBar;
        RelativeLayout relativeLayout = new RelativeLayout(mo3443p());
        ImageView imageView = new ImageView(mo3443p());
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        imageView.setImageDrawable(new BitmapDrawable(mo3380N(), decodeByteArray));
        imageView.setTag(R.id.TAG_IDFOTO, Integer.valueOf(i));
        imageView.setOnClickListener(this);
        imageView.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.getLayoutParams().width = this.f9367o0;
        int height = (decodeByteArray.getHeight() * this.f9367o0) / decodeByteArray.getWidth();
        imageView.getLayoutParams().height = height;
        float f = this.f9368p0;
        imageView.setPadding(0, (int) ((f * 4.0f) + 0.5f), 0, (int) ((f * 4.0f) + 0.5f));
        relativeLayout.addView(imageView);
        if (this.f9364K0) {
            progressBar = new ProgressBar(mo3443p(), (AttributeSet) null, 16843399);
        } else {
            progressBar = new ProgressBar(mo3443p(), (AttributeSet) null, 16842871);
        }
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(progressBar, this.f9365m0.f7368l1);
        }
        progressBar.setVisibility(8);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        LinearLayout linearLayout = (LinearLayout) this.f9360G0.findViewById(R.id.ll_det_imgs);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            ImageSwitcher imageSwitcher = (ImageSwitcher) linearLayout.getChildAt(i2);
            if (imageSwitcher.getChildCount() == 1) {
                imageSwitcher.getLayoutParams().height = height;
                imageSwitcher.addView(relativeLayout);
                imageSwitcher.showNext();
                return;
            }
        }
    }

    /* renamed from: W1 */
    public boolean mo8635W1(int i, KeyEvent keyEvent) {
        if (this.f9361H0.getVisibility() != 0 || this.f9370r0 || i != 4 || !this.f9358E0.canGoBack()) {
            return false;
        }
        this.f9358E0.goBack();
        return true;
    }

    /* renamed from: n0 */
    public void mo3435n0(Bundle bundle) {
        super.mo3435n0(bundle);
        if (!this.f9365m0.f7189H1.equals("")) {
            View W = mo3398W();
            W.setBackgroundColor(Color.parseColor("#" + this.f9365m0.f7189H1));
        }
        if (bundle != null) {
            this.f9358E0.restoreState(bundle);
        }
    }

    /* renamed from: o0 */
    public void mo3438o0(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            mo3443p().setResult(-1, intent);
            mo3443p().finish();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_det_comprar) {
            if (this.f9369q0) {
                this.f9365m0.mo7497c(mo3443p(), this.f9376x0);
                return;
            }
            Intent intent = new Intent(mo3443p(), t_url.class);
            intent.putExtra("url", this.f9376x0);
            if (this.f9372t0) {
                intent.putExtra("linksexternos", false);
                intent.putExtra("adaptar_ancho", false);
            } else {
                intent.putExtra("linksexternos", this.f9365m0.f7212L0);
                intent.putExtra("adaptar_ancho", this.f9365m0.f7206K0);
            }
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.btn_det_masinfo) {
            Intent intent2 = this.f9365m0.mo7527u0(mo3443p()).f7842a;
            String str = this.f9374v0;
            if (!this.f9375w0.equals("")) {
                str = str + "(Ref." + this.f9375w0 + ")";
            }
            intent2.putExtra("msg_predefinido", str);
            startActivityForResult(intent2, 0);
        } else if (view.getTag(R.id.TAG_IDFOTO) != null) {
            C2309g gVar = this.f9355B0;
            if (!(gVar == null || gVar.getStatus() == AsyncTask.Status.FINISHED)) {
                try {
                    this.f9355B0.f9393e.setVisibility(8);
                } catch (Exception unused) {
                }
                this.f9355B0.cancel(true);
            }
            C2309g gVar2 = new C2309g((ImageView) view);
            this.f9355B0 = gVar2;
            gVar2.execute(new String[0]);
        }
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1692config config = (C1692config) mo3443p().getApplicationContext();
        this.f9365m0 = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        SharedPreferences sharedPreferences = mo3443p().getSharedPreferences("sh", 0);
        this.f9373u0 = sharedPreferences;
        this.f9366n0 = sharedPreferences.getLong("idusu", 0);
        this.f9364K0 = false;
        if (!this.f9365m0.f7189H1.equals("")) {
            if (C1692config.m8153I("#" + this.f9365m0.f7189H1)) {
                this.f9364K0 = true;
            }
        }
        this.f9369q0 = this.f9365m0.f7212L0;
        float f = mo3380N().getDisplayMetrics().density;
        this.f9368p0 = f;
        this.f9367o0 = (int) ((f * 100.0f) + 0.5f);
        View inflate = layoutInflater.inflate(R.layout.detalle, viewGroup, false);
        this.f9357D0 = inflate;
        this.f9361H0 = (RelativeLayout) inflate.findViewById(R.id.rl_web);
        WebView webView = (WebView) this.f9357D0.findViewById(R.id.ll_det_web);
        this.f9358E0 = webView;
        webView.setWebChromeClient(new C2303a());
        m8794Z1();
        this.f9358E0.getSettings().setBuiltInZoomControls(true);
        this.f9358E0.getSettings().setSupportZoom(true);
        this.f9358E0.getSettings().setDomStorageEnabled(true);
        this.f9358E0.setOnTouchListener(new C2304b());
        this.f9358E0.setDownloadListener(new C2305c());
        if (this.f9365m0.f7206K0) {
            this.f9358E0.getSettings().setUseWideViewPort(true);
            this.f9358E0.getSettings().setLoadWithOverviewMode(true);
        }
        ProgressBar progressBar = (ProgressBar) this.f9357D0.findViewById(R.id.pb_url);
        if (this.f9364K0) {
            this.f9359F0 = (ProgressBar) this.f9357D0.findViewById(R.id.pb_det_inverse);
        } else {
            this.f9359F0 = (ProgressBar) this.f9357D0.findViewById(R.id.pb_det);
        }
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(progressBar, this.f9365m0.f7368l1);
            C1692config.m8168S0(this.f9359F0, this.f9365m0.f7368l1);
        }
        this.f9358E0.setWebViewClient(new C2306d(progressBar));
        this.f9358E0.getSettings().setJavaScriptEnabled(true);
        this.f9358E0.getSettings().setPluginState(WebSettings.PluginState.ON);
        WebSettings settings = this.f9358E0.getSettings();
        settings.setUserAgentString(this.f9358E0.getSettings().getUserAgentString() + " Vinebre");
        this.f9360G0 = (FrameLayout) this.f9357D0.findViewById(R.id.ll_det_cont);
        return this.f9357D0;
    }
}
