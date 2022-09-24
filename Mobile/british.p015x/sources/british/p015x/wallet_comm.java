package british.p015x;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import british.p015x.C1893p;
import com.google.android.exoplayer2.C6540C;

/* renamed from: british.x.wallet_comm */
public class wallet_comm extends Activity {

    /* renamed from: b */
    C1692config f10340b;

    /* renamed from: c */
    String f10341c;

    /* renamed from: d */
    String f10342d;

    /* renamed from: e */
    C1893p.C1894a f10343e;

    /* renamed from: f */
    byte[] f10344f;

    /* renamed from: british.x.wallet_comm$a */
    class C2598a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ WebView f10345a;

        /* renamed from: b */
        final /* synthetic */ String f10346b;

        /* renamed from: c */
        final /* synthetic */ Handler f10347c;

        /* renamed from: d */
        final /* synthetic */ String f10348d;

        /* renamed from: e */
        final /* synthetic */ String f10349e;

        /* renamed from: british.x.wallet_comm$a$a */
        class C2599a implements Runnable {

            /* renamed from: british.x.wallet_comm$a$a$a */
            class C2600a implements ValueCallback<String> {
                C2600a() {
                }

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    Log.e("phantom", "retorna:" + str);
                    String replace = str.replace("\"", "");
                    Log.e("phantom", "retorna_post:" + replace);
                    String[] split = replace.split(",");
                    byte[] bArr = new byte[split.length];
                    for (int i = 0; i < split.length; i++) {
                        bArr[i] = (byte) Integer.parseInt(split[i]);
                    }
                    String e = C1761d.m8286e(bArr);
                    C2598a aVar = C2598a.this;
                    wallet_comm.this.mo9244a(aVar.f10348d, aVar.f10349e, e);
                }
            }

            C2599a() {
            }

            public void run() {
                C2598a.this.f10345a.evaluateJavascript("return_result();", new C2600a());
            }
        }

        C2598a(WebView webView, String str, Handler handler, String str2, String str3) {
            this.f10345a = webView;
            this.f10346b = str;
            this.f10347c = handler;
            this.f10348d = str2;
            this.f10349e = str3;
        }

        public void onPageFinished(WebView webView, String str) {
            WebView webView2 = this.f10345a;
            webView2.evaluateJavascript("gen_transaction('" + this.f10346b + "','');", (ValueCallback) null);
            this.f10347c.postDelayed(new C2599a(), 4000);
        }
    }

    /* renamed from: british.x.wallet_comm$b */
    class C2601b extends WebChromeClient {
        C2601b() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Log.e("phantom", "consola: " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9244a(String str, String str2, String str3) {
        byte[] bArr;
        Log.e("phantom", "session:" + this.f10342d);
        Log.e("phantom", "transaction_b58:" + str3);
        String str4 = "{\"transaction\": " + str3 + ",\"session\": \"" + this.f10342d + "\",}";
        Log.e("phantom", "payload_pre_b58:" + str4);
        try {
            bArr = str4.getBytes(C6540C.UTF8_NAME);
        } catch (Exception e) {
            Log.e("phantom", "PETADA AL GETBYTES");
            e.printStackTrace();
            bArr = null;
        }
        String e2 = C1761d.m8286e(this.f10343e.mo7796d(bArr, this.f10344f));
        Log.e("phantom", "payload_b58:" + e2);
        Log.e("phantom", "https://phantom.app/ul/v1/signAndSendTransaction?dapp_encryption_public_key=" + str2 + "&nonce=" + str + "&redirect_link=" + this.f10341c + "&payload=" + e2);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://phantom.app/ul/v1/signAndSendTransaction?dapp_encryption_public_key=" + str2 + "&nonce=" + str + "&redirect_link=" + this.f10341c + "&payload=" + e2)));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        Log.e("phantom", "finish");
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x023d A[SYNTHETIC, Splitter:B:70:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0244 A[SYNTHETIC, Splitter:B:76:0x0244] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r8 = r16
            android.content.Context r0 = r16.getApplicationContext()
            british.x.config r0 = (british.p015x.C1692config) r0
            r8.f10340b = r0
            java.lang.String r1 = r0.f7313c1
            if (r1 != 0) goto L_0x0011
            r0.mo7490V0()
        L_0x0011:
            super.onCreate(r17)
            java.lang.String r1 = "phantom"
            java.lang.String r0 = "Torne de Phantom"
            android.util.Log.e(r1, r0)
            r0 = 0
            java.lang.String r2 = "sh"
            android.content.SharedPreferences r2 = r8.getSharedPreferences(r2, r0)
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r0 = r0.getDataString()
            android.util.Log.e(r1, r0)
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r0 = r0.getDataString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r3 = "errorCode"
            java.lang.String r3 = r0.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0047
            java.lang.String r0 = "error!!!"
            android.util.Log.e(r1, r0)
            return
        L_0x0047:
            java.lang.String r3 = "signature"
            java.lang.String r3 = r0.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0055
            java.lang.String r0 = "paso 2"
            android.util.Log.e(r1, r0)
            return
        L_0x0055:
            java.lang.String r3 = "phantom_encryption_public_key"
            java.lang.String r3 = r0.getQueryParameter(r3)
            r9 = 0
            byte[] r4 = british.p015x.C1761d.m8283b(r3)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r4 = r9
        L_0x0062:
            java.lang.String r5 = "data"
            java.lang.String r5 = r0.getQueryParameter(r5)
            byte[] r6 = british.p015x.C1761d.m8283b(r5)     // Catch:{ Exception -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r6 = r9
        L_0x006e:
            java.lang.String r7 = "nonce"
            java.lang.String r7 = r0.getQueryParameter(r7)
            r8.f10344f = r9
            byte[] r0 = british.p015x.C1761d.m8283b(r7)     // Catch:{ Exception -> 0x007c }
            r8.f10344f = r0     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "ph_pk:"
            r0.append(r10)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "ph_pk_b58:"
            r0.append(r10)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "data:"
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "data_b58:"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "nonce:"
            r0.append(r3)
            byte[] r3 = r8.f10344f
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "nonce_b58:"
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "dapp_sk_b58"
            java.lang.String r3 = ""
            java.lang.String r0 = r2.getString(r0, r3)
            byte[] r5 = british.p015x.C1761d.m8283b(r0)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0104
        L_0x0103:
            r5 = r9
        L_0x0104:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "dapp_sk:"
            r10.append(r11)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "dapp_sk_b58:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.e(r1, r0)
            r8.f10341c = r3
            java.lang.String r0 = "ac2261075://wallet_comm/"
            java.lang.String r10 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x0139 }
            r8.f10341c = r0     // Catch:{ UnsupportedEncodingException -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r0.printStackTrace()
        L_0x013d:
            british.x.p$a r0 = new british.x.p$a
            r0.<init>(r4, r5)
            r8.f10343e = r0
            java.lang.String r4 = new java.lang.String
            byte[] r5 = r8.f10344f
            byte[] r0 = r0.mo7797e(r6, r5)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "data desxifrat:"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x016c }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x016c }
            r4 = r0
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            r0.printStackTrace()
            r4 = r9
        L_0x0171:
            java.lang.String r0 = "public_key"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x0179 }
            r5 = r0
            goto L_0x017e
        L_0x0179:
            r0 = move-exception
            r0.printStackTrace()
            r5 = r3
        L_0x017e:
            if (r5 == r3) goto L_0x0182
            r6 = r5
            goto L_0x0183
        L_0x0182:
            r6 = r3
        L_0x0183:
            java.lang.String r0 = "session"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x018c }
            r8.f10342d = r0     // Catch:{ Exception -> 0x018c }
            goto L_0x0190
        L_0x018c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "wallet:"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "session:"
            r0.append(r4)
            java.lang.String r4 = r8.f10342d
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "dapp_pk_b58"
            java.lang.String r0 = r2.getString(r0, r3)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r5.<init>(r1)
            android.webkit.WebView r10 = new android.webkit.WebView
            r10.<init>(r8)
            british.x.wallet_comm$a r11 = new british.x.wallet_comm$a
            r1 = r11
            r2 = r16
            r3 = r10
            r4 = r6
            r6 = r7
            r7 = r0
            r1.<init>(r3, r4, r5, r6, r7)
            r10.setWebViewClient(r11)
            android.webkit.WebSettings r0 = r10.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebSettings r0 = r10.getSettings()
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON
            r0.setPluginState(r2)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setAllowFileAccess(r1)
            british.x.wallet_comm$b r0 = new british.x.wallet_comm$b
            r0.<init>()
            r10.setWebChromeClient(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0241, all -> 0x023a }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0241, all -> 0x023a }
            android.content.res.AssetManager r3 = r16.getAssets()     // Catch:{ IOException -> 0x0241, all -> 0x023a }
            java.lang.String r4 = "altres/crear_transaction.html"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0241, all -> 0x023a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0241, all -> 0x023a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0241, all -> 0x023a }
        L_0x0216:
            java.lang.String r2 = r1.readLine()     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            if (r2 == 0) goto L_0x0231
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            r3.<init>()     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            r3.append(r2)     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            r0.append(r2)     // Catch:{ IOException -> 0x0238, all -> 0x0235 }
            goto L_0x0216
        L_0x0231:
            r1.close()     // Catch:{ IOException -> 0x0247 }
            goto L_0x0247
        L_0x0235:
            r0 = move-exception
            r9 = r1
            goto L_0x023b
        L_0x0238:
            r9 = r1
            goto L_0x0242
        L_0x023a:
            r0 = move-exception
        L_0x023b:
            if (r9 == 0) goto L_0x0240
            r9.close()     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            throw r0
        L_0x0241:
        L_0x0242:
            if (r9 == 0) goto L_0x0247
            r9.close()     // Catch:{ IOException -> 0x0247 }
        L_0x0247:
            java.lang.String r12 = r0.toString()
            r15 = 0
            java.lang.String r11 = "https://www.meloinvento.com"
            java.lang.String r13 = "text/html"
            java.lang.String r14 = "utf-8"
            r10.loadDataWithBaseURL(r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.wallet_comm.onCreate(android.os.Bundle):void");
    }
}
