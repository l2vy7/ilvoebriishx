package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C3454i;
import com.facebook.C3572j;
import com.facebook.C3574k;
import com.facebook.C3575l;
import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C3439c;
import com.facebook.common.C3442f;
import com.facebook.common.C3443g;
import com.facebook.share.internal.C3704h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h0 */
/* compiled from: WebDialog */
public class C3494h0 extends Dialog {

    /* renamed from: n */
    private static final int f13084n = C3443g.com_facebook_activity_theme;

    /* renamed from: o */
    private static volatile int f13085o;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13086b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f13087c;

    /* renamed from: d */
    private C3501g f13088d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WebView f13089e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProgressDialog f13090f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f13091g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public FrameLayout f13092h;

    /* renamed from: i */
    private C3502h f13093i;

    /* renamed from: j */
    private boolean f13094j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13095k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f13096l;

    /* renamed from: m */
    private WindowManager.LayoutParams f13097m;

    /* renamed from: com.facebook.internal.h0$a */
    /* compiled from: WebDialog */
    class C3495a implements DialogInterface.OnCancelListener {
        C3495a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C3494h0.this.cancel();
        }
    }

    /* renamed from: com.facebook.internal.h0$b */
    /* compiled from: WebDialog */
    class C3496b implements View.OnClickListener {
        C3496b() {
        }

        public void onClick(View view) {
            C3494h0.this.cancel();
        }
    }

    /* renamed from: com.facebook.internal.h0$c */
    /* compiled from: WebDialog */
    class C3497c extends WebView {
        C3497c(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: com.facebook.internal.h0$d */
    /* compiled from: WebDialog */
    class C3498d implements View.OnTouchListener {
        C3498d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: com.facebook.internal.h0$f */
    /* compiled from: WebDialog */
    private class C3500f extends WebViewClient {
        private C3500f() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C3494h0.this.f13095k) {
                C3494h0.this.f13090f.dismiss();
            }
            C3494h0.this.f13092h.setBackgroundColor(0);
            C3494h0.this.f13089e.setVisibility(0);
            C3494h0.this.f13091g.setVisibility(0);
            boolean unused = C3494h0.this.f13096l = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C3481f0.m11609T("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!C3494h0.this.f13095k) {
                C3494h0.this.f13090f.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C3494h0.this.mo11956t(new C3454i(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C3494h0.this.mo11956t(new C3454i((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.C3481f0.m11609T(r0, r6)
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this
                java.lang.String r6 = r6.f13087c
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a6
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this
                android.os.Bundle r6 = r6.mo11954r(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0037
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0037:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0045
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0045:
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C3481f0.m11604O(r2)
                r4 = -1
                if (r3 != 0) goto L_0x005f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r2 = -1
            L_0x0060:
                boolean r3 = com.facebook.internal.C3481f0.m11604O(r7)
                if (r3 == 0) goto L_0x0074
                boolean r3 = com.facebook.internal.C3481f0.m11604O(r1)
                if (r3 == 0) goto L_0x0074
                if (r2 != r4) goto L_0x0074
                com.facebook.internal.h0 r7 = com.facebook.internal.C3494h0.this
                r7.mo11957u(r6)
                goto L_0x00a5
            L_0x0074:
                if (r7 == 0) goto L_0x008c
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0086
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x008c
            L_0x0086:
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this
                r6.cancel()
                goto L_0x00a5
            L_0x008c:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0096
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this
                r6.cancel()
                goto L_0x00a5
            L_0x0096:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.h0 r7 = com.facebook.internal.C3494h0.this
                com.facebook.o r2 = new com.facebook.o
                r2.<init>(r6, r1)
                r7.mo11956t(r2)
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00b4
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this
                r6.cancel()
                return r0
            L_0x00b4:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00be
                return r1
            L_0x00be:
                com.facebook.internal.h0 r6 = com.facebook.internal.C3494h0.this     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                return r0
            L_0x00d3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3494h0.C3500f.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* synthetic */ C3500f(C3494h0 h0Var, C3495a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.h0$g */
    /* compiled from: WebDialog */
    public interface C3501g {
        /* renamed from: a */
        void mo11939a(Bundle bundle, C3572j jVar);
    }

    /* renamed from: com.facebook.internal.h0$h */
    /* compiled from: WebDialog */
    private class C3502h extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private String f13110a;

        /* renamed from: b */
        private Bundle f13111b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f13112c;

        /* renamed from: com.facebook.internal.h0$h$a */
        /* compiled from: WebDialog */
        class C3503a implements GraphRequest.C3360f {

            /* renamed from: a */
            final /* synthetic */ String[] f13114a;

            /* renamed from: b */
            final /* synthetic */ int f13115b;

            /* renamed from: c */
            final /* synthetic */ CountDownLatch f13116c;

            C3503a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f13114a = strArr;
                this.f13115b = i;
                this.f13116c = countDownLatch;
            }

            /* renamed from: b */
            public void mo7382b(C3655r rVar) {
                try {
                    FacebookRequestError g = rVar.mo12380g();
                    String str = "Error staging photo.";
                    if (g != null) {
                        String e = g.mo11227e();
                        if (e != null) {
                            str = e;
                        }
                        throw new C3574k(rVar, str);
                    }
                    JSONObject h = rVar.mo12381h();
                    if (h != null) {
                        String optString = h.optString("uri");
                        if (optString != null) {
                            this.f13114a[this.f13115b] = optString;
                            this.f13116c.countDown();
                            return;
                        }
                        throw new C3572j(str);
                    }
                    throw new C3572j(str);
                } catch (Exception e2) {
                    C3502h.this.f13112c[this.f13115b] = e2;
                }
            }
        }

        C3502h(String str, Bundle bundle) {
            this.f13110a = str;
            this.f13111b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f13111b.getStringArray("media");
            String[] strArr = new String[stringArray.length];
            this.f13112c = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken h = AccessToken.m11205h();
            int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C3481f0.m11606Q(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C3704h.m12495e(h, parse, new C3503a(strArr, i, countDownLatch)).mo11251i());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String[] strArr) {
            C3494h0.this.f13090f.dismiss();
            for (Exception exc : this.f13112c) {
                if (exc != null) {
                    C3494h0.this.mo11956t(exc);
                    return;
                }
            }
            if (strArr == null) {
                C3494h0.this.mo11956t(new C3572j("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains((Object) null)) {
                C3494h0.this.mo11956t(new C3572j("Failed to stage photos for web dialog"));
                return;
            }
            C3481f0.m11615Z(this.f13111b, "media", new JSONArray(asList));
            String unused = C3494h0.this.f13086b = C3481f0.m11624e(C3473c0.m11575b(), C3642m.m12290p() + "/" + "dialog/" + this.f13110a, this.f13111b).toString();
            C3494h0.this.m11710x((C3494h0.this.f13091g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    protected C3494h0(Context context, String str) {
        this(context, str, m11707l());
    }

    /* renamed from: j */
    private void m11705j() {
        ImageView imageView = new ImageView(getContext());
        this.f13091g = imageView;
        imageView.setOnClickListener(new C3496b());
        this.f13091g.setImageDrawable(getContext().getResources().getDrawable(C3439c.com_facebook_close));
        this.f13091g.setVisibility(4);
    }

    /* renamed from: k */
    private int m11706k(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* renamed from: l */
    public static int m11707l() {
        C3489g0.m11689k();
        return f13085o;
    }

    /* renamed from: n */
    protected static void m11708n(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && f13085o == 0) {
                    m11711y(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: q */
    public static C3494h0 m11709q(Context context, String str, Bundle bundle, int i, C3501g gVar) {
        m11708n(context);
        return new C3494h0(context, str, bundle, i, gVar);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: x */
    public void m11710x(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C3497c cVar = new C3497c(getContext());
        this.f13089e = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f13089e.setHorizontalScrollBarEnabled(false);
        this.f13089e.setWebViewClient(new C3500f(this, (C3495a) null));
        this.f13089e.getSettings().setJavaScriptEnabled(true);
        this.f13089e.loadUrl(this.f13086b);
        this.f13089e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f13089e.setVisibility(4);
        this.f13089e.getSettings().setSavePassword(false);
        this.f13089e.getSettings().setSaveFormData(false);
        this.f13089e.setFocusable(true);
        this.f13089e.setFocusableInTouchMode(true);
        this.f13089e.setOnTouchListener(new C3498d());
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f13089e);
        linearLayout.setBackgroundColor(-872415232);
        this.f13092h.addView(linearLayout);
    }

    /* renamed from: y */
    public static void m11711y(int i) {
        if (i == 0) {
            i = f13084n;
        }
        f13085o = i;
    }

    public void cancel() {
        if (this.f13088d != null && !this.f13094j) {
            mo11956t(new C3575l());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f13089e;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f13095k && (progressDialog = this.f13090f) != null && progressDialog.isShowing()) {
            this.f13090f.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public WebView mo11944m() {
        return this.f13089e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo11945o() {
        return this.f13094j;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.f13095k = false;
        if (C3481f0.m11613X(getContext()) && (layoutParams = this.f13097m) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            C3481f0.m11609T("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.f13097m.token);
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f13090f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f13090f.setMessage(getContext().getString(C3442f.com_facebook_loading));
        this.f13090f.setCanceledOnTouchOutside(false);
        this.f13090f.setOnCancelListener(new C3495a());
        requestWindowFeature(1);
        this.f13092h = new FrameLayout(getContext());
        mo11955s();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m11705j();
        if (this.f13086b != null) {
            m11710x((this.f13091g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f13092h.addView(this.f13091g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f13092h);
    }

    public void onDetachedFromWindow() {
        this.f13095k = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3502h hVar = this.f13093i;
        if (hVar == null || hVar.getStatus() != AsyncTask.Status.PENDING) {
            mo11955s();
            return;
        }
        this.f13093i.execute(new Void[0]);
        this.f13090f.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C3502h hVar = this.f13093i;
        if (hVar != null) {
            hVar.cancel(true);
            this.f13090f.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f13097m = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo11953p() {
        return this.f13096l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle mo11954r(String str) {
        Uri parse = Uri.parse(str);
        Bundle Y = C3481f0.m11614Y(parse.getQuery());
        Y.putAll(C3481f0.m11614Y(parse.getFragment()));
        return Y;
    }

    /* renamed from: s */
    public void mo11955s() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        getWindow().setLayout(Math.min(m11706k(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m11706k(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo11956t(Throwable th) {
        C3572j jVar;
        if (this.f13088d != null && !this.f13094j) {
            this.f13094j = true;
            if (th instanceof C3572j) {
                jVar = (C3572j) th;
            } else {
                jVar = new C3572j(th);
            }
            this.f13088d.mo11939a((Bundle) null, jVar);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo11957u(Bundle bundle) {
        C3501g gVar = this.f13088d;
        if (gVar != null && !this.f13094j) {
            this.f13094j = true;
            gVar.mo11939a(bundle, (C3572j) null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo11958v(String str) {
        this.f13087c = str;
    }

    /* renamed from: w */
    public void mo11959w(C3501g gVar) {
        this.f13088d = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3494h0(Context context, String str, int i) {
        super(context, i == 0 ? m11707l() : i);
        this.f13087c = "fbconnect://success";
        this.f13094j = false;
        this.f13095k = false;
        this.f13096l = false;
        this.f13086b = str;
    }

    /* renamed from: com.facebook.internal.h0$e */
    /* compiled from: WebDialog */
    public static class C3499e {

        /* renamed from: a */
        private Context f13102a;

        /* renamed from: b */
        private String f13103b;

        /* renamed from: c */
        private String f13104c;

        /* renamed from: d */
        private int f13105d;

        /* renamed from: e */
        private C3501g f13106e;

        /* renamed from: f */
        private Bundle f13107f;

        /* renamed from: g */
        private AccessToken f13108g;

        public C3499e(Context context, String str, Bundle bundle) {
            this.f13108g = AccessToken.m11205h();
            if (!AccessToken.m11207t()) {
                String y = C3481f0.m11660y(context);
                if (y != null) {
                    this.f13103b = y;
                } else {
                    throw new C3572j("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m11721b(context, str, bundle);
        }

        /* renamed from: b */
        private void m11721b(Context context, String str, Bundle bundle) {
            this.f13102a = context;
            this.f13104c = str;
            if (bundle != null) {
                this.f13107f = bundle;
            } else {
                this.f13107f = new Bundle();
            }
        }

        /* renamed from: a */
        public C3494h0 mo11964a() {
            AccessToken accessToken = this.f13108g;
            if (accessToken != null) {
                this.f13107f.putString("app_id", accessToken.mo11181g());
                this.f13107f.putString("access_token", this.f13108g.mo11191r());
            } else {
                this.f13107f.putString("app_id", this.f13103b);
            }
            return C3494h0.m11709q(this.f13102a, this.f13104c, this.f13107f, this.f13105d, this.f13106e);
        }

        /* renamed from: c */
        public String mo11965c() {
            return this.f13103b;
        }

        /* renamed from: d */
        public Context mo11966d() {
            return this.f13102a;
        }

        /* renamed from: e */
        public C3501g mo11967e() {
            return this.f13106e;
        }

        /* renamed from: f */
        public Bundle mo11968f() {
            return this.f13107f;
        }

        /* renamed from: g */
        public int mo11969g() {
            return this.f13105d;
        }

        /* renamed from: h */
        public C3499e mo11970h(C3501g gVar) {
            this.f13106e = gVar;
            return this;
        }

        public C3499e(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C3481f0.m11660y(context) : str;
            C3489g0.m11688j(str, "applicationId");
            this.f13103b = str;
            m11721b(context, str2, bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3494h0(Context context, String str, Bundle bundle, int i, C3501g gVar) {
        super(context, i == 0 ? m11707l() : i);
        String str2 = "fbconnect://success";
        this.f13087c = str2;
        this.f13094j = false;
        this.f13095k = false;
        this.f13096l = false;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = C3481f0.m11600K(context) ? "fbconnect://chrome_os_success" : str2;
        this.f13087c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C3642m.m12280f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C3642m.m12293s()}));
        this.f13088d = gVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String b = C3473c0.m11575b();
            this.f13086b = C3481f0.m11624e(b, C3642m.m12290p() + "/" + "dialog/" + str, bundle).toString();
            return;
        }
        this.f13093i = new C3502h(str, bundle);
    }
}
