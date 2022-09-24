package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class rg0 implements sg0 {

    /* renamed from: b */
    private static final Object f38663b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    static boolean f38664c = false;
    @GuardedBy("lock")

    /* renamed from: d */
    static boolean f38665d = false;

    /* renamed from: a */
    wx2 f38666a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34540a(Context context) {
        synchronized (f38663b) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() && !f38665d) {
                try {
                    f38665d = true;
                    this.f38666a = (wx2) ho0.m32903b(context, "com.google.android.gms.ads.omid.DynamiteOmid", qg0.f38037a);
                } catch (go0 e) {
                    co0.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo34045b(Context context) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
            return null;
        }
        try {
            mo34540a(context);
            String valueOf = String.valueOf(this.f38666a.zzg());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo34046c(C10487a aVar, View view) {
        synchronized (f38663b) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                if (f38664c) {
                    try {
                        this.f38666a.mo35329F3(aVar, C10489b.m48195m6(view));
                    } catch (RemoteException | NullPointerException e) {
                        co0.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        com.google.android.gms.internal.ads.co0.zzl("#007 Could not call remote method.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0023, B:15:0x0045] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p199d5.C10487a mo34047d(java.lang.String r14, android.webkit.WebView r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.ads.ug0 r19, com.google.android.gms.internal.ads.tg0 r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r4 = ""
            java.lang.String r5 = "javascript"
            java.lang.String r7 = "Google"
            java.lang.Object r1 = f38663b
            monitor-enter(r1)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36843B3     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r2.mo18570b(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            r11 = 0
            if (r0 == 0) goto L_0x0044
            boolean r0 = f38664c     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0021
            goto L_0x0044
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            r12 = r13
            com.google.android.gms.internal.ads.wx2 r1 = r12.f38666a     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            d5.a r3 = p199d5.C10489b.m48195m6(r15)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r8 = r19.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r9 = r20.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            r2 = r14
            r6 = r18
            r10 = r21
            d5.a r11 = r1.mo35331p1(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r0 = move-exception
            goto L_0x003e
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.co0.zzl(r1, r0)
            goto L_0x0046
        L_0x0044:
            r12 = r13
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
        L_0x0046:
            return r11
        L_0x0047:
            r0 = move-exception
            r12 = r13
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rg0.mo34047d(java.lang.String, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.ug0, com.google.android.gms.internal.ads.tg0, java.lang.String):d5.a");
    }

    /* renamed from: e */
    public final C10487a mo34048e(String str, WebView webView, String str2, String str3, String str4, String str5, ug0 ug0, tg0 tg0, String str6) {
        synchronized (f38663b) {
            try {
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                    if (f38664c) {
                        try {
                            return this.f38666a.mo35328C1(str, C10489b.m48195m6(webView), "", "javascript", str4, str5, ug0.toString(), tg0.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            co0.zzl("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo34049f(Context context) {
        synchronized (f38663b) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                return false;
            }
            if (f38664c) {
                return true;
            }
            try {
                mo34540a(context);
                boolean zzl = this.f38666a.zzl(C10489b.m48195m6(context));
                f38664c = zzl;
                return zzl;
            } catch (RemoteException e) {
                e = e;
                co0.zzl("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                co0.zzl("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: g */
    public final void mo34050g(C10487a aVar, View view) {
        synchronized (f38663b) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                if (f38664c) {
                    try {
                        this.f38666a.zzh(aVar, C10489b.m48195m6(view));
                    } catch (RemoteException | NullPointerException e) {
                        co0.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void zze(C10487a aVar) {
        synchronized (f38663b) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                if (f38664c) {
                    try {
                        this.f38666a.mo35332v(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        co0.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void zzh(C10487a aVar) {
        synchronized (f38663b) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
                if (f38664c) {
                    try {
                        this.f38666a.mo35330G(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        co0.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
