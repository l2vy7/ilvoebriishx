package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.C3187f;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.appnext.core.q */
public class C3213q {
    private String banner = "";
    private C3187f click;
    /* access modifiers changed from: private */
    public Context context;

    /* renamed from: da */
    private String f12385da = "";
    /* access modifiers changed from: private */

    /* renamed from: el */
    public C3217a f12386el;
    /* access modifiers changed from: private */

    /* renamed from: em */
    public C3187f.C3196a f12387em = new C3187f.C3196a() {
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void error(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "UserAction$error"
                com.appnext.core.q r1 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x003d }
                java.lang.String r2 = "admin.appnext.com"
                java.lang.String r3 = "applink"
                java.lang.String r2 = com.appnext.core.C3198g.m10794f(r2, r3)     // Catch:{ all -> 0x003d }
                com.appnext.core.q r3 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x003d }
                com.appnext.core.q$a r3 = r3.f12386el     // Catch:{ all -> 0x003d }
                com.appnext.core.AppnextAd r3 = r3.mo10142d()     // Catch:{ all -> 0x003d }
                java.lang.String r3 = r3.getBannerID()     // Catch:{ all -> 0x003d }
                com.appnext.core.q r4 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x003d }
                com.appnext.core.q$a r4 = r4.f12386el     // Catch:{ all -> 0x003d }
                com.appnext.core.Ad r4 = r4.mo10141c()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = r4.getPlacementID()     // Catch:{ all -> 0x003d }
                com.appnext.core.q r5 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x003d }
                com.appnext.core.q$a r5 = r5.f12386el     // Catch:{ all -> 0x003d }
                com.appnext.core.Ad r5 = r5.mo10141c()     // Catch:{ all -> 0x003d }
                java.lang.String r5 = r5.getTID()     // Catch:{ all -> 0x003d }
                java.lang.String r7 = "SetDOpenV1"
                r6 = r9
                r1.mo10824a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003d }
                goto L_0x0041
            L_0x003d:
                r1 = move-exception
                com.appnext.base.C3117a.m10553a(r0, r1)
            L_0x0041:
                com.appnext.core.q r1 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x0098 }
                com.appnext.core.q$a r1 = r1.f12386el     // Catch:{ all -> 0x0098 }
                com.appnext.core.SettingsManager r1 = r1.mo10143e()     // Catch:{ all -> 0x0098 }
                java.lang.String r2 = "urlApp_protection"
                java.lang.String r1 = r1.mo10732y(r2)     // Catch:{ all -> 0x0098 }
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x0098 }
                java.lang.String r2 = "error_no_market"
                if (r1 == 0) goto L_0x0085
                com.appnext.core.q r9 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x007b }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
                java.lang.String r3 = "market://details?id="
                r1.<init>(r3)     // Catch:{ all -> 0x007b }
                com.appnext.core.q r3 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x007b }
                com.appnext.core.q$a r3 = r3.f12386el     // Catch:{ all -> 0x007b }
                com.appnext.core.AppnextAd r3 = r3.mo10142d()     // Catch:{ all -> 0x007b }
                java.lang.String r3 = r3.getAdPackage()     // Catch:{ all -> 0x007b }
                r1.append(r3)     // Catch:{ all -> 0x007b }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007b }
                com.appnext.core.C3213q.m10830a(r9, r1)     // Catch:{ all -> 0x007b }
                goto L_0x009c
            L_0x007b:
                com.appnext.core.q r9 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x0098 }
                com.appnext.core.q$a r9 = r9.f12386el     // Catch:{ all -> 0x0098 }
                r9.report(r2)     // Catch:{ all -> 0x0098 }
                goto L_0x009c
            L_0x0085:
                if (r9 != 0) goto L_0x0088
                return
            L_0x0088:
                com.appnext.core.q r1 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x008e }
                com.appnext.core.C3213q.m10830a(r1, r9)     // Catch:{ all -> 0x008e }
                goto L_0x009c
            L_0x008e:
                com.appnext.core.q r9 = com.appnext.core.C3213q.this     // Catch:{ all -> 0x0098 }
                com.appnext.core.q$a r9 = r9.f12386el     // Catch:{ all -> 0x0098 }
                r9.report(r2)     // Catch:{ all -> 0x0098 }
                return
            L_0x0098:
                r9 = move-exception
                com.appnext.base.C3117a.m10553a(r0, r9)
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3213q.C32163.error(java.lang.String):void");
        }

        public final void onMarket(String str) {
            AppnextAd d = C3213q.this.f12386el.mo10142d();
            C3148Ad c = C3213q.this.f12386el.mo10141c();
            if (c != null && d != null && C3213q.this.context != null) {
                if (!C3198g.m10789b(C3213q.this.context, d.getAdPackage())) {
                    try {
                        if (!str.startsWith("market://details?id=" + d.getAdPackage()) && !str.startsWith("http")) {
                            C3213q.this.mo10824a(C3198g.m10794f("admin.appnext.com", "applink"), d.getBannerID(), c.getPlacementID(), c.getTID(), str, "SetROpenV1");
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("UserAction$onMarket", th);
                    }
                } else if (str.startsWith("market://")) {
                    try {
                        Intent launchIntentForPackage = C3213q.this.context.getPackageManager().getLaunchIntentForPackage(d.getAdPackage());
                        launchIntentForPackage.addFlags(268435456);
                        C3213q.this.context.startActivity(launchIntentForPackage);
                    } catch (Throwable unused) {
                        C3213q.this.f12386el.report("error_no_market");
                    }
                } else {
                    try {
                        C3213q.m10830a(C3213q.this, str);
                    } catch (Throwable unused2) {
                        C3213q.this.f12386el.report("error_no_market");
                    }
                }
            }
        }
    };
    private String guid = "";

    /* renamed from: com.appnext.core.q$a */
    public interface C3217a {
        /* renamed from: c */
        C3148Ad mo10141c();

        /* renamed from: d */
        AppnextAd mo10142d();

        /* renamed from: e */
        SettingsManager mo10143e();

        void report(String str);
    }

    public C3213q(Context context2, C3217a aVar) {
        this.context = context2;
        this.click = C3187f.m10764f(context2);
        this.f12386el = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public final boolean mo10825aB() {
        try {
            if (this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                C3198g.m10776a(this.context, "http://www.appnext.com/myid.html", (HashMap<String, String>) null);
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            throw new IOException();
        } catch (Throwable th) {
            C3117a.m10553a("UserAction$checkConnection", th);
            return false;
        }
    }

    /* renamed from: d */
    public final void mo10827d(AppnextAd appnextAd) {
        try {
            C3187f fVar = this.click;
            if (fVar != null) {
                fVar.mo10789d(appnextAd);
            }
        } catch (Throwable th) {
            C3117a.m10553a("UserAction$adImpression", th);
        }
    }

    public final void destroy() {
        this.context = null;
        if (this.click != null) {
            this.click = null;
        }
    }

    /* renamed from: a */
    public final void mo10824a(String str, String str2, String str3, String str4, String str5, String str6) {
        C3187f fVar = this.click;
        if (fVar != null) {
            C3211o.m10825az().mo10821a(new Runnable(str, str2, str3, str4, str5, str6) {

                /* renamed from: cU */
                final /* synthetic */ String f12336cU;

                /* renamed from: dq */
                final /* synthetic */ String f12338dq;

                /* renamed from: dr */
                final /* synthetic */ String f12339dr;

                /* renamed from: ds */
                final /* synthetic */ String f12340ds;

                /* renamed from: dt */
                final /* synthetic */ String f12341dt;
                final /* synthetic */ String val$placementID;

                public final void run(
/*
Method generation error in method: com.appnext.core.f.7.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appnext.core.f.7.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: c */
    public final void mo10826c(AppnextAd appnextAd, C3187f.C3196a aVar) {
        this.click.mo10786a(appnextAd.getMarketUrl(), aVar);
    }

    /* renamed from: a */
    public final void mo10822a(AppnextAd appnextAd, String str, C3187f.C3196a aVar) {
        C3187f fVar = this.click;
        if (fVar != null) {
            C3211o.m10825az().mo10821a(new Runnable(appnextAd) {

                /* renamed from: B */
                final /* synthetic */ AppnextAd f12334B;

                public final void run(
/*
Method generation error in method: com.appnext.core.f.6.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appnext.core.f.6.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: a */
    public final void mo10823a(AppnextAd appnextAd, final String str, String str2, final C3187f.C3196a aVar) {
        try {
            if (!mo10825aB()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C3187f.C3196a a = C3213q.this.f12387em;
                            a.error(str + "&device=" + C3198g.m10785au());
                            C3187f.C3196a aVar = aVar;
                            if (aVar != null) {
                                aVar.error(str + "&device=" + C3198g.m10785au());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } else if (appnextAd != null) {
                try {
                    if (TextUtils.isEmpty(this.f12385da) || !this.f12385da.contains(appnextAd.getAdPackage())) {
                        String str3 = str + "&device=" + C3198g.m10785au();
                        String webview = appnextAd.getWebview();
                        char c = 65535;
                        switch (webview.hashCode()) {
                            case 48:
                                if (webview.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 49:
                                if (webview.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 50:
                                if (webview.equals("2")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            try {
                                this.f12387em.onMarket(str3);
                                if (aVar != null) {
                                    aVar.onMarket(str3);
                                }
                            } catch (Throwable th) {
                                C3117a.m10553a("UserAction$doClick", th);
                            }
                        } else if (c != 1) {
                            C3187f fVar = this.click;
                            if (fVar != null) {
                                fVar.mo10788a(appnextAd.getAppURL(), appnextAd.getMarketUrl(), str3, appnextAd.getBannerID(), new C3187f.C3196a() {
                                    public final void error(String str) {
                                        C3213q.this.f12387em.error(str);
                                        C3187f.C3196a aVar = aVar;
                                        if (aVar != null) {
                                            aVar.error(str);
                                        }
                                    }

                                    public final void onMarket(String str) {
                                        C3213q.this.f12387em.onMarket(str);
                                        C3187f.C3196a aVar = aVar;
                                        if (aVar != null) {
                                            aVar.onMarket(str);
                                        }
                                    }
                                }, Long.parseLong(this.f12386el.mo10143e().mo10732y("resolve_timeout")) * 1000);
                            }
                        } else {
                            Intent intent = new Intent(this.context, ResultActivity.class);
                            intent.putExtra("url", str3);
                            intent.putExtra("title", appnextAd.getAdTitle());
                            intent.addFlags(268435456);
                            this.context.startActivity(intent);
                            if (aVar != null) {
                                aVar.onMarket(str3);
                            }
                        }
                    } else {
                        C3198g.m10776a(this.context, "https://admin.appnext.com/AdminService.asmx/SetRL?guid=" + this.guid + "&bid=" + this.banner + "&pid=" + str2, (HashMap<String, String>) null);
                        this.f12387em.onMarket(this.f12385da);
                        if (aVar != null) {
                            aVar.onMarket(this.f12385da);
                        }
                        this.f12385da = "";
                    }
                } catch (Throwable th2) {
                    C3117a.m10553a("UserAction$doClick", th2);
                }
            }
        } catch (Throwable th3) {
            C3117a.m10553a("UserAction$doClick", th3);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10830a(C3213q qVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        qVar.context.startActivity(intent);
    }
}
