package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C2978z;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.o */
class C2857o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2714c0 f11595a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f11596b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11597c;

    /* renamed from: com.adcolony.sdk.o$a */
    class C2858a implements C2750e0 {
        C2858a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (!C2684a.m9410d() || !(C2684a.m9407b() instanceof Activity)) {
                new C2978z.C2979a().mo10088a("Missing Activity reference, can't build AlertDialog.").mo10090a(C2978z.f11950j);
            } else if (C2976x.m10329c(c0Var.mo9608b(), "on_resume")) {
                C2714c0 unused = C2857o.this.f11595a = c0Var;
            } else {
                C2857o.this.m9915a(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    class C2859b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C2714c0 f11599a;

        C2859b(C2714c0 c0Var) {
            this.f11599a = c0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C2857o.this.f11596b = null;
            dialogInterface.dismiss();
            JSONObject b = C2976x.m10319b();
            C2976x.m10325b(b, "positive", true);
            boolean unused2 = C2857o.this.f11597c = false;
            this.f11599a.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$c */
    class C2860c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C2714c0 f11601a;

        C2860c(C2714c0 c0Var) {
            this.f11601a = c0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C2857o.this.f11596b = null;
            dialogInterface.dismiss();
            JSONObject b = C2976x.m10319b();
            C2976x.m10325b(b, "positive", false);
            boolean unused2 = C2857o.this.f11597c = false;
            this.f11601a.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$d */
    class C2861d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C2714c0 f11603a;

        C2861d(C2714c0 c0Var) {
            this.f11603a = c0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C2857o.this.f11596b = null;
            boolean unused2 = C2857o.this.f11597c = false;
            JSONObject b = C2976x.m10319b();
            C2976x.m10325b(b, "positive", false);
            this.f11603a.mo9607a(b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$e */
    class C2862e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f11605a;

        C2862e(AlertDialog.Builder builder) {
            this.f11605a = builder;
        }

        public void run() {
            boolean unused = C2857o.this.f11597c = true;
            AlertDialog unused2 = C2857o.this.f11596b = this.f11605a.show();
        }
    }

    C2857o() {
        C2684a.m9405a("Alert.show", (C2750e0) new C2858a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9899c() {
        C2714c0 c0Var = this.f11595a;
        if (c0Var != null) {
            m9915a(c0Var);
            this.f11595a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9898b() {
        return this.f11597c;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void m9915a(C2714c0 c0Var) {
        Context b = C2684a.m9407b();
        if (b != null) {
            AlertDialog.Builder builder = Build.VERSION.SDK_INT >= 21 ? new AlertDialog.Builder(b, 16974374) : new AlertDialog.Builder(b, 16974126);
            JSONObject b2 = c0Var.mo9608b();
            String i = C2976x.m10337i(b2, "message");
            String i2 = C2976x.m10337i(b2, "title");
            String i3 = C2976x.m10337i(b2, "positive");
            String i4 = C2976x.m10337i(b2, "negative");
            builder.setMessage(i);
            builder.setTitle(i2);
            builder.setPositiveButton(i3, new C2859b(c0Var));
            if (!i4.equals("")) {
                builder.setNegativeButton(i4, new C2860c(c0Var));
            }
            builder.setOnCancelListener(new C2861d(c0Var));
            C2916s0.m10063a((Runnable) new C2862e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo9896a() {
        return this.f11596b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9897a(AlertDialog alertDialog) {
        this.f11596b = alertDialog;
    }
}
