package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6492o;

@TargetApi(14)
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.go */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4612go extends Thread {

    /* renamed from: b */
    private boolean f20345b = false;

    /* renamed from: c */
    private boolean f20346c = false;

    /* renamed from: d */
    private final Object f20347d;

    /* renamed from: e */
    private final C4631xn f20348e;

    /* renamed from: f */
    private final int f20349f;

    /* renamed from: g */
    private final int f20350g;

    /* renamed from: h */
    private final int f20351h;

    /* renamed from: i */
    private final int f20352i;

    /* renamed from: j */
    private final int f20353j;

    /* renamed from: k */
    private final int f20354k;

    /* renamed from: l */
    private final int f20355l;

    /* renamed from: m */
    private final int f20356m;

    /* renamed from: n */
    private final String f20357n;

    /* renamed from: o */
    private final boolean f20358o;

    /* renamed from: p */
    private final boolean f20359p;

    /* renamed from: q */
    private final boolean f20360q;

    public C4612go() {
        C4631xn xnVar = new C4631xn();
        this.f20348e = xnVar;
        this.f20347d = new Object();
        this.f20350g = x10.f40985d.mo34648e().intValue();
        this.f20351h = x10.f40982a.mo34648e().intValue();
        this.f20352i = x10.f40986e.mo34648e().intValue();
        this.f20353j = x10.f40984c.mo34648e().intValue();
        this.f20354k = ((Integer) C8311wv.m39277c().mo18570b(p00.f36935N)).intValue();
        this.f20355l = ((Integer) C8311wv.m39277c().mo18570b(p00.f36943O)).intValue();
        this.f20356m = ((Integer) C8311wv.m39277c().mo18570b(p00.f36951P)).intValue();
        this.f20349f = x10.f40987f.mo34648e().intValue();
        this.f20357n = (String) C8311wv.m39277c().mo18570b(p00.f36967R);
        this.f20358o = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36975S)).booleanValue();
        this.f20359p = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36983T)).booleanValue();
        this.f20360q = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36991U)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final C4630wn mo18350a() {
        return this.f20348e.mo18950a(this.f20360q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7690fo mo18351b(View view, C4630wn wnVar) {
        if (view == null) {
            return new C7690fo(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C7690fo(this, 0, 0);
            }
            wnVar.mo18941k(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C7690fo(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof xt0)) {
            WebView webView = (WebView) view;
            if (!C6492o.m28283f()) {
                return new C7690fo(this, 0, 0);
            }
            wnVar.mo18937h();
            webView.post(new C7653eo(this, wnVar, webView, globalVisibleRect));
            return new C7690fo(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new C7690fo(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C7690fo b = mo18351b(viewGroup.getChildAt(i3), wnVar);
                i += b.f31828a;
                i2 += b.f31829b;
            }
            return new C7690fo(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo18352c(View view) {
        try {
            C4630wn wnVar = new C4630wn(this.f20350g, this.f20351h, this.f20352i, this.f20353j, this.f20354k, this.f20355l, this.f20356m, this.f20359p);
            Context b = zzt.zzb().mo18169b();
            if (b != null && !TextUtils.isEmpty(this.f20357n)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) C8311wv.m39277c().mo18570b(p00.f36959Q), TtmlNode.ATTR_ID, b.getPackageName()));
                if (str != null) {
                    if (str.equals(this.f20357n)) {
                        return;
                    }
                }
            }
            C7690fo b2 = mo18351b(view, wnVar);
            wnVar.mo18943m();
            if (b2.f31828a == 0) {
                if (b2.f31829b == 0) {
                    return;
                }
            }
            if (b2.f31829b == 0) {
                if (wnVar.mo18931c() == 0) {
                    return;
                }
            }
            if (b2.f31829b == 0) {
                if (this.f20348e.mo18953d(wnVar)) {
                    return;
                }
            }
            this.f20348e.mo18951b(wnVar);
        } catch (Exception e) {
            co0.zzh("Exception in fetchContentOnUIThread", e);
            zzt.zzo().mo18592s(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo18353d(C4630wn wnVar, WebView webView, String str, boolean z) {
        wnVar.mo18936g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f20358o || TextUtils.isEmpty(webView.getTitle())) {
                    wnVar.mo18942l(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    wnVar.mo18942l(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (wnVar.mo18945o()) {
                this.f20348e.mo18952c(wnVar);
            }
        } catch (JSONException unused) {
            co0.zze("Json string may be malformed.");
        } catch (Throwable th) {
            co0.zzf("Failed to get webview content.", th);
            zzt.zzo().mo18592s(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void mo18354e() {
        synchronized (this.f20347d) {
            if (this.f20345b) {
                co0.zze("Content hash thread already started, quiting...");
                return;
            }
            this.f20345b = true;
            start();
        }
    }

    /* renamed from: f */
    public final void mo18355f() {
        synchronized (this.f20347d) {
            this.f20346c = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            co0.zze(sb.toString());
        }
    }

    /* renamed from: g */
    public final void mo18356g() {
        synchronized (this.f20347d) {
            this.f20346c = false;
            this.f20347d.notifyAll();
            co0.zze("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean mo18357h() {
        return this.f20346c;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[LOOP:2: B:48:0x00dc->B:62:0x00dc, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.bo r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r0.mo18169b()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00a8 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00a8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a8 }
            int r5 = r3.pid     // Catch:{ all -> 0x00a8 }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00a8 }
            r3 = 100
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.bo r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            android.app.Activity r0 = r0.mo18168a()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.co0.zze(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo18355f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x006d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            com.google.android.gms.internal.ads.nn0 r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo18592s(r0, r3)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.co0.zze(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x009d:
            if (r1 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.co r0 = new com.google.android.gms.internal.ads.co     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x00a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.nn0 r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.mo18592s(r0, r2)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00b2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.co0.zze(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo18355f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00ba:
            int r0 = r6.f20349f     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00d9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.co0.zzh(r1, r0)
            com.google.android.gms.internal.ads.nn0 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo18592s(r0, r2)
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.co0.zzh(r1, r0)
        L_0x00d9:
            java.lang.Object r0 = r6.f20347d
            monitor-enter(r0)
        L_0x00dc:
            boolean r1 = r6.f20346c     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.co0.zze(r1)     // Catch:{ InterruptedException -> 0x00dc }
            java.lang.Object r1 = r6.f20347d     // Catch:{ InterruptedException -> 0x00dc }
            r1.wait()     // Catch:{ InterruptedException -> 0x00dc }
            goto L_0x00dc
        L_0x00eb:
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0000
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x00f2
        L_0x00f1:
            throw r1
        L_0x00f2:
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4612go.run():void");
    }
}
