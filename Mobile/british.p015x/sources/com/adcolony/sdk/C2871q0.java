package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Vibrator;
import com.adcolony.sdk.C2978z;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.q0 */
class C2871q0 {

    /* renamed from: com.adcolony.sdk.q0$a */
    class C2872a implements C2750e0 {
        C2872a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9936m(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$b */
    class C2873b implements C2750e0 {
        C2873b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2871q0.this.m9954f(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$c */
    class C2874c implements C2750e0 {
        C2874c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2871q0.this.m9946a(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$d */
    class C2875d implements C2750e0 {
        C2875d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9929c(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$e */
    class C2876e implements C2750e0 {
        C2876e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2871q0.this.m9957o(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$f */
    class C2877f implements C2750e0 {
        C2877f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2871q0.this.m9956k(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$g */
    class C2878g implements C2750e0 {
        C2878g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            boolean unused = C2871q0.this.m9955j(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$h */
    class C2879h implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11649a;

        /* renamed from: b */
        final /* synthetic */ C2714c0 f11650b;

        C2879h(JSONObject jSONObject, C2714c0 c0Var) {
            this.f11649a = jSONObject;
            this.f11650b = c0Var;
        }

        public void onScanCompleted(String str, Uri uri) {
            C2916s0.m10064a("Screenshot saved to Gallery!", 0);
            C2976x.m10325b(this.f11649a, "success", true);
            this.f11650b.mo9607a(this.f11649a).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.q0$i */
    class C2880i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11652a;

        C2880i(String str) {
            this.f11652a = str;
        }

        public void run() {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, SessionDescription.ATTR_TYPE, "open_hook");
            C2976x.m10313a(b, "message", this.f11652a);
            new C2714c0("CustomMessage.controller_send", 0, b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.q0$j */
    class C2881j implements C2750e0 {
        C2881j() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9933h(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$k */
    class C2882k implements C2750e0 {
        C2882k() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9934i(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$l */
    class C2883l implements C2750e0 {
        C2883l() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9937n(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$m */
    class C2884m implements C2750e0 {
        C2884m() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9935l(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$n */
    class C2885n implements C2750e0 {
        C2885n() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9938p(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$o */
    class C2886o implements C2750e0 {
        C2886o() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9932g(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$p */
    class C2887p implements C2750e0 {
        C2887p() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9931e(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$q */
    class C2888q implements C2750e0 {
        C2888q() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9930d(c0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.q0$r */
    class C2889r implements C2750e0 {
        C2889r() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2871q0.this.mo9927b(c0Var);
        }
    }

    C2871q0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m9954f(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        C2715d b2 = C2684a.m9409c().mo9708b();
        String i = C2976x.m10337i(b, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = b2.mo9613a().get(i);
        AdColonyAdView adColonyAdView = b2.mo9621b().get(i);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo9471d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C2714c0("AdUnit.make_in_app_purchase", adColonyInterstitial.mo9471d().mo9591k()).mo9612d();
        }
        mo9926a(i);
        m9949b(i);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m9955j(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(C2976x.m10335g(b, "clickOverride"), "url");
        String i2 = C2976x.m10337i(b, "ad_session_id");
        C2715d b2 = C2684a.m9409c().mo9708b();
        AdColonyInterstitial adColonyInterstitial = b2.mo9613a().get(i2);
        AdColonyAdView adColonyAdView = b2.mo9621b().get(i2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo9466b(i);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m9956k(C2714c0 c0Var) {
        int i;
        JSONObject b = c0Var.mo9608b();
        String i2 = C2976x.m10337i(b, "ad_session_id");
        int e = C2976x.m10332e(b, AdUnitActivity.EXTRA_ORIENTATION);
        C2715d b2 = C2684a.m9409c().mo9708b();
        AdColonyAdView adColonyAdView = b2.mo9621b().get(i2);
        AdColonyInterstitial adColonyInterstitial = b2.mo9613a().get(i2);
        Context b3 = C2684a.m9407b();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(e);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo9458a(e);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C2978z.C2979a().mo10088a("Invalid ad session id sent with set orientation properties message: ").mo10088a(i2).mo10090a(C2978z.f11950j);
            return false;
        } else if (!(b3 instanceof C2688b)) {
            return true;
        } else {
            C2688b bVar = (C2688b) b3;
            if (adColonyAdView == null) {
                i = adColonyInterstitial.mo9475g();
            } else {
                i = adColonyAdView.getOrientation();
            }
            bVar.mo9547a(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m9957o(C2714c0 c0Var) {
        AdColonyAdView adColonyAdView = C2684a.m9409c().mo9708b().mo9621b().get(C2976x.m10337i(c0Var.mo9608b(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C2976x.m10329c(c0Var.mo9608b(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9932g(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        String i = C2976x.m10337i(b2, "url");
        String i2 = C2976x.m10337i(b2, "ad_session_id");
        AdColonyAdView adColonyAdView = C2684a.m9409c().mo9708b().mo9621b().get(i2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.getUserInteraction()) {
            return false;
        }
        if (i.startsWith("browser")) {
            i = i.replaceFirst("browser", "http");
        }
        if (i.startsWith("safari")) {
            i = i.replaceFirst("safari", "http");
        }
        m9951d(i);
        if (C2916s0.m10061a(new Intent("android.intent.action.VIEW", Uri.parse(i)))) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i2);
            mo9926a(i2);
            m9949b(i2);
            return true;
        }
        C2916s0.m10064a("Failed to launch browser.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9933h(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        String i = C2976x.m10337i(b2, "product_id");
        String i2 = C2976x.m10337i(b2, "ad_session_id");
        if (i.equals("")) {
            i = C2976x.m10337i(b2, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(i));
        m9951d(i);
        if (C2916s0.m10061a(intent)) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i2);
            mo9926a(i2);
            m9949b(i2);
            return true;
        }
        C2916s0.m10064a("Unable to open.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.adcolony.sdk.C2916s0.m10064a("Error saving screenshot.", 0);
        com.adcolony.sdk.C2976x.m10325b(r4, "success", false);
        r13.mo9607a(r4).mo9612d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e2, code lost:
        com.adcolony.sdk.C2916s0.m10064a("Error saving screenshot.", 0);
        com.adcolony.sdk.C2976x.m10325b(r4, "success", false);
        r13.mo9607a(r4).mo9612d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ef, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00d4 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9934i(com.adcolony.sdk.C2714c0 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "success"
            java.lang.String r1 = "Error saving screenshot."
            android.content.Context r2 = com.adcolony.sdk.C2684a.m9407b()
            r3 = 0
            if (r2 == 0) goto L_0x0113
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 != 0) goto L_0x0011
            goto L_0x0113
        L_0x0011:
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r4 = androidx.core.content.C0600b.m3289a(r2, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            if (r4 != 0) goto L_0x00f0
            org.json.JSONObject r4 = r13.mo9608b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.String r5 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C2976x.m10337i(r4, r5)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r12.mo9926a((java.lang.String) r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            org.json.JSONObject r4 = com.adcolony.sdk.C2976x.m10319b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r5.<init>()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.String r6 = r6.toString()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r5.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.String r6 = "/Pictures/AdColony_Screenshots/AdColony_Screenshot_"
            r5.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r5.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.String r6 = ".jpg"
            r5.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.lang.String r5 = r5.toString()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r6 = r2
            android.app.Activity r6 = (android.app.Activity) r6     // Catch:{ NoClassDefFoundError -> 0x0102 }
            android.view.Window r6 = r6.getWindow()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            android.view.View r6 = r6.getDecorView()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            android.view.View r6 = r6.getRootView()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r7 = 1
            r6.setDrawingCacheEnabled(r7)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            android.graphics.Bitmap r8 = r6.getDrawingCache()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r6.setDrawingCacheEnabled(r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r9.<init>()     // Catch:{ Exception -> 0x00af }
            java.io.File r10 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00af }
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x00af }
            r9.append(r10)     // Catch:{ Exception -> 0x00af }
            java.lang.String r10 = "/Pictures"
            r9.append(r10)     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00af }
            r6.<init>(r9)     // Catch:{ Exception -> 0x00af }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r10.<init>()     // Catch:{ Exception -> 0x00af }
            java.io.File r11 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00af }
            java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x00af }
            r10.append(r11)     // Catch:{ Exception -> 0x00af }
            java.lang.String r11 = "/Pictures/AdColony_Screenshots"
            r10.append(r11)     // Catch:{ Exception -> 0x00af }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00af }
            r9.<init>(r10)     // Catch:{ Exception -> 0x00af }
            r6.mkdirs()     // Catch:{ Exception -> 0x00af }
            r9.mkdirs()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r9.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r10 = 90
            r8.compress(r6, r10, r9)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r9.flush()     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r9.close()     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r6[r3] = r5     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r5 = 0
            com.adcolony.sdk.q0$h r8 = new com.adcolony.sdk.q0$h     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            r8.<init>(r4, r13)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            android.media.MediaScannerConnection.scanFile(r2, r6, r5, r8)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d4 }
            return r7
        L_0x00d4:
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r1, (int) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r4, (java.lang.String) r0, (boolean) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.c0 r2 = r13.mo9607a((org.json.JSONObject) r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r2.mo9612d()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            return r3
        L_0x00e2:
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r1, (int) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r4, (java.lang.String) r0, (boolean) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.c0 r2 = r13.mo9607a((org.json.JSONObject) r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r2.mo9612d()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            return r3
        L_0x00f0:
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r1, (int) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            org.json.JSONObject r2 = r13.mo9608b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r2, (java.lang.String) r0, (boolean) r3)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            com.adcolony.sdk.c0 r2 = r13.mo9607a((org.json.JSONObject) r2)     // Catch:{ NoClassDefFoundError -> 0x0102 }
            r2.mo9612d()     // Catch:{ NoClassDefFoundError -> 0x0102 }
            return r3
        L_0x0102:
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r1, (int) r3)
            org.json.JSONObject r1 = r13.mo9608b()
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r1, (java.lang.String) r0, (boolean) r3)
            com.adcolony.sdk.c0 r13 = r13.mo9607a((org.json.JSONObject) r1)
            r13.mo9612d()
        L_0x0113:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2871q0.mo9934i(com.adcolony.sdk.c0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo9935l(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        JSONObject b2 = C2976x.m10319b();
        String i = C2976x.m10337i(b, "ad_session_id");
        JSONArray b3 = C2976x.m10318b(b, "recipients");
        String str = "";
        for (int i2 = 0; i2 < b3.length(); i2++) {
            if (i2 != 0) {
                str = str + ";";
            }
            str = str + C2976x.m10331d(b3, i2);
        }
        if (C2916s0.m10061a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C2976x.m10337i(b, TtmlNode.TAG_BODY)))) {
            C2976x.m10325b(b2, "success", true);
            c0Var.mo9607a(b2).mo9612d();
            mo9928c(i);
            mo9926a(i);
            m9949b(i);
            return true;
        }
        C2916s0.m10064a("Failed to create sms.", 0);
        C2976x.m10325b(b2, "success", false);
        c0Var.mo9607a(b2).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9936m(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C2976x.m10337i(b2, "text") + " " + C2976x.m10337i(b2, "url"));
        String i = C2976x.m10337i(b2, "ad_session_id");
        if (C2916s0.m10062a(putExtra, true)) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i);
            mo9926a(i);
            m9949b(i);
            return true;
        }
        C2916s0.m10064a("Unable to create social post.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo9937n(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C2976x.m10337i(b2, "phone_number")));
        String i = C2976x.m10337i(b2, "ad_session_id");
        if (C2916s0.m10061a(data)) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i);
            mo9926a(i);
            m9949b(i);
            return true;
        }
        C2916s0.m10064a("Failed to dial number.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9938p(C2714c0 c0Var) {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        int a = C2976x.m10299a(c0Var.mo9608b(), "length_ms", 500);
        JSONObject b2 = C2976x.m10319b();
        JSONArray d = C2916s0.m10080d(b);
        boolean z = false;
        for (int i = 0; i < d.length(); i++) {
            if (C2976x.m10331d(d, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C2978z.C2979a().mo10088a("No vibrate permission detected.").mo10090a(C2978z.f11947g);
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        }
        try {
            Vibrator vibrator = (Vibrator) b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate((long) a);
                C2976x.m10325b(b2, "success", true);
                c0Var.mo9607a(b2).mo9612d();
                return true;
            }
        } catch (Exception unused) {
            new C2978z.C2979a().mo10088a("Vibrate command failed.").mo10090a(C2978z.f11947g);
        }
        C2976x.m10325b(b2, "success", false);
        c0Var.mo9607a(b2).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9925a() {
        C2684a.m9405a("System.open_store", (C2750e0) new C2881j());
        C2684a.m9405a("System.save_screenshot", (C2750e0) new C2882k());
        C2684a.m9405a("System.telephone", (C2750e0) new C2883l());
        C2684a.m9405a("System.sms", (C2750e0) new C2884m());
        C2684a.m9405a("System.vibrate", (C2750e0) new C2885n());
        C2684a.m9405a("System.open_browser", (C2750e0) new C2886o());
        C2684a.m9405a("System.mail", (C2750e0) new C2887p());
        C2684a.m9405a("System.launch_app", (C2750e0) new C2888q());
        C2684a.m9405a("System.create_calendar_event", (C2750e0) new C2889r());
        C2684a.m9405a("System.social_post", (C2750e0) new C2872a());
        C2684a.m9405a("System.make_in_app_purchase", (C2750e0) new C2873b());
        C2684a.m9405a("System.close", (C2750e0) new C2874c());
        C2684a.m9405a("System.expand", (C2750e0) new C2875d());
        C2684a.m9405a("System.use_custom_close", (C2750e0) new C2876e());
        C2684a.m9405a("System.set_orientation_properties", (C2750e0) new C2877f());
        C2684a.m9405a("System.click_override", (C2750e0) new C2878g());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9927b(com.adcolony.sdk.C2714c0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            org.json.JSONObject r2 = com.adcolony.sdk.C2976x.m10319b()
            org.json.JSONObject r3 = r25.mo9608b()
            java.lang.String r4 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C2976x.m10337i(r3, r4)
            java.lang.String r5 = "params"
            org.json.JSONObject r3 = com.adcolony.sdk.C2976x.m10335g(r3, r5)
            java.lang.String r5 = "recurrence"
            org.json.JSONObject r5 = com.adcolony.sdk.C2976x.m10335g(r3, r5)
            org.json.JSONArray r6 = com.adcolony.sdk.C2976x.m10301a()
            org.json.JSONArray r7 = com.adcolony.sdk.C2976x.m10301a()
            org.json.JSONArray r8 = com.adcolony.sdk.C2976x.m10301a()
            java.lang.String r9 = "description"
            java.lang.String r10 = com.adcolony.sdk.C2976x.m10337i(r3, r9)
            java.lang.String r11 = "location"
            com.adcolony.sdk.C2976x.m10337i(r3, r11)
            java.lang.String r11 = "start"
            java.lang.String r11 = com.adcolony.sdk.C2976x.m10337i(r3, r11)
            java.lang.String r12 = "end"
            java.lang.String r12 = com.adcolony.sdk.C2976x.m10337i(r3, r12)
            java.lang.String r13 = "summary"
            java.lang.String r3 = com.adcolony.sdk.C2976x.m10337i(r3, r13)
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x0078
            int r14 = r5.length()
            if (r14 <= 0) goto L_0x0078
            java.lang.String r6 = "expires"
            java.lang.String r6 = com.adcolony.sdk.C2976x.m10337i(r5, r6)
            java.lang.String r7 = "frequency"
            java.lang.String r7 = com.adcolony.sdk.C2976x.m10337i(r5, r7)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toUpperCase(r8)
            java.lang.String r8 = "daysInWeek"
            org.json.JSONArray r8 = com.adcolony.sdk.C2976x.m10318b((org.json.JSONObject) r5, (java.lang.String) r8)
            java.lang.String r14 = "daysInMonth"
            org.json.JSONArray r14 = com.adcolony.sdk.C2976x.m10318b((org.json.JSONObject) r5, (java.lang.String) r14)
            java.lang.String r15 = "daysInYear"
            org.json.JSONArray r15 = com.adcolony.sdk.C2976x.m10318b((org.json.JSONObject) r5, (java.lang.String) r15)
            goto L_0x007d
        L_0x0078:
            r14 = r7
            r15 = r8
            r7 = r13
            r8 = r6
            r6 = r7
        L_0x007d:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0084
            r3 = r10
        L_0x0084:
            java.util.Date r11 = com.adcolony.sdk.C2916s0.m10086g(r11)
            java.util.Date r12 = com.adcolony.sdk.C2916s0.m10086g(r12)
            java.util.Date r6 = com.adcolony.sdk.C2916s0.m10086g(r6)
            java.lang.String r13 = "success"
            if (r11 == 0) goto L_0x0206
            if (r12 != 0) goto L_0x0098
            goto L_0x0206
        L_0x0098:
            long r0 = r11.getTime()
            r16 = r13
            long r12 = r12.getTime()
            r17 = 0
            if (r6 == 0) goto L_0x00b5
            long r19 = r6.getTime()
            long r21 = r11.getTime()
            long r19 = r19 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            goto L_0x00b7
        L_0x00b5:
            r19 = r17
        L_0x00b7:
            java.lang.String r6 = "DAILY"
            boolean r6 = r7.equals(r6)
            r21 = 1
            if (r6 == 0) goto L_0x00cd
            r17 = 86400(0x15180, double:4.26873E-319)
            long r19 = r19 / r17
        L_0x00c6:
            long r17 = r19 + r21
        L_0x00c8:
            r19 = r12
            r11 = r17
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r6 = "WEEKLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00db
            r17 = 604800(0x93a80, double:2.98811E-318)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00db:
            java.lang.String r6 = "MONTHLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            r17 = 2629800(0x2820a8, double:1.299294E-317)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00e9:
            java.lang.String r6 = "YEARLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c8
            r17 = 31557600(0x1e187e0, double:1.5591526E-316)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00f7:
            java.lang.String r6 = "endTime"
            java.lang.String r13 = "beginTime"
            r17 = r4
            java.lang.String r4 = "title"
            r18 = r2
            java.lang.String r2 = "vnd.android.cursor.item/event"
            r21 = r6
            java.lang.String r6 = "android.intent.action.EDIT"
            if (r5 == 0) goto L_0x01aa
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r22 = r0
            java.lang.String r0 = "FREQ="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ";COUNT="
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            int r1 = r8.length()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = com.adcolony.sdk.C2916s0.m10057a((org.json.JSONArray) r8)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            int r1 = r14.length()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = com.adcolony.sdk.C2916s0.m10073b((org.json.JSONArray) r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYMONTHDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            int r1 = r15.length()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = com.adcolony.sdk.C2916s0.m10073b((org.json.JSONArray) r15)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYYEARDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.Intent r1 = r1.setType(r2)
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r9, r10)
            r7 = r22
            android.content.Intent r1 = r1.putExtra(r13, r7)
            r11 = r19
            r5 = r21
            android.content.Intent r1 = r1.putExtra(r5, r11)
            java.lang.String r2 = "rrule"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x01c8
        L_0x01aa:
            r7 = r0
            r11 = r19
            r5 = r21
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.content.Intent r0 = r0.setType(r2)
            android.content.Intent r0 = r0.putExtra(r4, r3)
            android.content.Intent r0 = r0.putExtra(r9, r10)
            android.content.Intent r0 = r0.putExtra(r13, r7)
            android.content.Intent r0 = r0.putExtra(r5, r11)
        L_0x01c8:
            boolean r0 = com.adcolony.sdk.C2916s0.m10061a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x01ed
            r0 = 1
            r2 = r16
            r1 = r18
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r0)
            r3 = r25
            com.adcolony.sdk.c0 r1 = r3.mo9607a((org.json.JSONObject) r1)
            r1.mo9612d()
            r4 = r24
            r1 = r17
            r4.mo9928c((java.lang.String) r1)
            r4.mo9926a((java.lang.String) r1)
            r4.m9949b((java.lang.String) r1)
            return r0
        L_0x01ed:
            r4 = r24
            r3 = r25
            r2 = r16
            r1 = r18
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event."
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.c0 r1 = r3.mo9607a((org.json.JSONObject) r1)
            r1.mo9612d()
            return r0
        L_0x0206:
            r4 = r24
            r3 = r1
            r1 = r2
            r2 = r13
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event"
            com.adcolony.sdk.C2916s0.m10064a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.c0 r1 = r3.mo9607a((org.json.JSONObject) r1)
            r1.mo9612d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2871q0.mo9927b(com.adcolony.sdk.c0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9929c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        Context b2 = C2684a.m9407b();
        if (b2 != null && C2684a.m9411e()) {
            String i = C2976x.m10337i(b, "ad_session_id");
            C2794i c = C2684a.m9409c();
            AdColonyAdView adColonyAdView = c.mo9708b().mo9621b().get(i);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.getUserInteraction()) && c.mo9720g() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(c0Var);
                adColonyAdView.setExpandedWidth(C2976x.m10332e(b, "width"));
                adColonyAdView.setExpandedHeight(C2976x.m10332e(b, "height"));
                adColonyAdView.setOrientation(C2976x.m10299a(b, AdUnitActivity.EXTRA_ORIENTATION, -1));
                adColonyAdView.setNoCloseButton(C2976x.m10329c(b, "use_custom_close"));
                c.mo9699a(adColonyAdView);
                c.mo9704a(adColonyAdView.getContainer());
                Intent intent = new Intent(b2, AdColonyAdViewActivity.class);
                m9949b(i);
                mo9926a(i);
                C2916s0.m10061a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9930d(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        String i = C2976x.m10337i(b2, "ad_session_id");
        if (C2976x.m10329c(b2, "deep_link")) {
            return mo9933h(c0Var);
        }
        Context b3 = C2684a.m9407b();
        if (b3 == null) {
            return false;
        }
        if (C2916s0.m10061a(b3.getPackageManager().getLaunchIntentForPackage(C2976x.m10337i(b2, "handle")))) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i);
            mo9926a(i);
            m9949b(i);
            return true;
        }
        C2916s0.m10064a("Failed to launch external application.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9931e(C2714c0 c0Var) {
        JSONObject b = C2976x.m10319b();
        JSONObject b2 = c0Var.mo9608b();
        JSONArray b3 = C2976x.m10318b(b2, "recipients");
        boolean c = C2976x.m10329c(b2, "html");
        String i = C2976x.m10337i(b2, "subject");
        String i2 = C2976x.m10337i(b2, TtmlNode.TAG_BODY);
        String i3 = C2976x.m10337i(b2, "ad_session_id");
        String[] strArr = new String[b3.length()];
        for (int i4 = 0; i4 < b3.length(); i4++) {
            strArr[i4] = C2976x.m10331d(b3, i4);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!c) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", i).putExtra("android.intent.extra.TEXT", i2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C2916s0.m10061a(intent)) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            mo9928c(i3);
            mo9926a(i3);
            m9949b(i3);
            return true;
        }
        C2916s0.m10064a("Failed to send email.", 0);
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9946a(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "ad_session_id");
        Activity activity = C2684a.m9407b() instanceof Activity ? (Activity) C2684a.m9407b() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C2688b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo9391b();
            return true;
        }
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, i);
        new C2714c0("AdSession.on_request_close", ((C2688b) activity).f10601d, b).mo9612d();
        return true;
    }

    /* renamed from: d */
    private void m9951d(String str) {
        try {
            C2916s0.f11754b.execute(new C2880i(str));
        } catch (RejectedExecutionException e) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("ADCSystem.sendOpenCustomMessage failed with error: " + e.toString()).mo10090a(C2978z.f11950j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9928c(String str) {
        C2715d b = C2684a.m9409c().mo9708b();
        AdColonyInterstitial adColonyInterstitial = b.mo9613a().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = b.mo9621b().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9926a(String str) {
        C2715d b = C2684a.m9409c().mo9708b();
        AdColonyInterstitial adColonyInterstitial = b.mo9613a().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = b.mo9621b().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* renamed from: b */
    private boolean m9949b(String str) {
        if (C2684a.m9409c().mo9708b().mo9621b().get(str) == null) {
            return false;
        }
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "ad_session_id", str);
        new C2714c0("MRAID.on_event", 1, b).mo9612d();
        return true;
    }
}
