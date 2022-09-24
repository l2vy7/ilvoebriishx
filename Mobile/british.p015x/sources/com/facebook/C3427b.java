package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C3652q;
import com.facebook.GraphRequest;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p177y0.C6396a;

/* renamed from: com.facebook.b */
/* compiled from: AccessTokenManager */
public final class C3427b {

    /* renamed from: f */
    private static volatile C3427b f12895f;

    /* renamed from: a */
    private final C6396a f12896a;

    /* renamed from: b */
    private final C3367a f12897b;

    /* renamed from: c */
    private AccessToken f12898c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AtomicBoolean f12899d = new AtomicBoolean(false);

    /* renamed from: e */
    private Date f12900e = new Date(0);

    /* renamed from: com.facebook.b$a */
    /* compiled from: AccessTokenManager */
    class C3428a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AccessToken.C3348b f12901b;

        C3428a(AccessToken.C3348b bVar) {
            this.f12901b = bVar;
        }

        public void run() {
            C3427b.this.m11469k(this.f12901b);
        }
    }

    /* renamed from: com.facebook.b$b */
    /* compiled from: AccessTokenManager */
    class C3429b implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f12903a;

        /* renamed from: b */
        final /* synthetic */ Set f12904b;

        /* renamed from: c */
        final /* synthetic */ Set f12905c;

        /* renamed from: d */
        final /* synthetic */ Set f12906d;

        C3429b(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f12903a = atomicBoolean;
            this.f12904b = set;
            this.f12905c = set2;
            this.f12906d = set3;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            JSONArray optJSONArray;
            JSONObject h = rVar.mo12381h();
            if (h != null && (optJSONArray = h.optJSONArray("data")) != null) {
                this.f12903a.set(true);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString(IronSourceConstants.EVENTS_STATUS);
                        if (!C3481f0.m11604O(optString) && !C3481f0.m11604O(optString2)) {
                            String lowerCase = optString2.toLowerCase(Locale.US);
                            if (lowerCase.equals("granted")) {
                                this.f12904b.add(optString);
                            } else if (lowerCase.equals("declined")) {
                                this.f12905c.add(optString);
                            } else if (lowerCase.equals("expired")) {
                                this.f12906d.add(optString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.b$c */
    /* compiled from: AccessTokenManager */
    class C3430c implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ C3432e f12908a;

        C3430c(C3432e eVar) {
            this.f12908a = eVar;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            JSONObject h = rVar.mo12381h();
            if (h != null) {
                this.f12908a.f12918a = h.optString("access_token");
                this.f12908a.f12919b = h.optInt("expires_at");
                this.f12908a.f12920c = Long.valueOf(h.optLong("data_access_expiration_time"));
                this.f12908a.f12921d = h.optString("graph_domain", (String) null);
            }
        }
    }

    /* renamed from: com.facebook.b$d */
    /* compiled from: AccessTokenManager */
    class C3431d implements C3652q.C3653a {

        /* renamed from: a */
        final /* synthetic */ AccessToken f12910a;

        /* renamed from: b */
        final /* synthetic */ AccessToken.C3348b f12911b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f12912c;

        /* renamed from: d */
        final /* synthetic */ C3432e f12913d;

        /* renamed from: e */
        final /* synthetic */ Set f12914e;

        /* renamed from: f */
        final /* synthetic */ Set f12915f;

        /* renamed from: g */
        final /* synthetic */ Set f12916g;

        C3431d(AccessToken accessToken, AccessToken.C3348b bVar, AtomicBoolean atomicBoolean, C3432e eVar, Set set, Set set2, Set set3) {
            this.f12910a = accessToken;
            this.f12911b = bVar;
            this.f12912c = atomicBoolean;
            this.f12913d = eVar;
            this.f12914e = set;
            this.f12915f = set2;
            this.f12916g = set3;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0109=Splitter:B:50:0x0109, B:18:0x004d=Splitter:B:18:0x004d} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11869a(com.facebook.C3652q r19) {
            /*
                r18 = this;
                r1 = r18
                r2 = 0
                com.facebook.b r0 = com.facebook.C3427b.m11468h()     // Catch:{ all -> 0x0121 }
                com.facebook.AccessToken r0 = r0.mo11864g()     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0109
                com.facebook.b r0 = com.facebook.C3427b.m11468h()     // Catch:{ all -> 0x0121 }
                com.facebook.AccessToken r0 = r0.mo11864g()     // Catch:{ all -> 0x0121 }
                java.lang.String r0 = r0.mo11192s()     // Catch:{ all -> 0x0121 }
                com.facebook.AccessToken r4 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.lang.String r4 = r4.mo11192s()     // Catch:{ all -> 0x0121 }
                if (r0 == r4) goto L_0x0023
                goto L_0x0109
            L_0x0023:
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f12912c     // Catch:{ all -> 0x0121 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0121 }
                if (r0 != 0) goto L_0x004d
                com.facebook.b$e r0 = r1.f12913d     // Catch:{ all -> 0x0121 }
                java.lang.String r4 = r0.f12918a     // Catch:{ all -> 0x0121 }
                if (r4 != 0) goto L_0x004d
                int r0 = r0.f12919b     // Catch:{ all -> 0x0121 }
                if (r0 != 0) goto L_0x004d
                com.facebook.AccessToken$b r0 = r1.f12911b     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0043
                com.facebook.j r4 = new com.facebook.j     // Catch:{ all -> 0x0121 }
                java.lang.String r5 = "Failed to refresh access token"
                r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x0121 }
                r0.mo11201a(r4)     // Catch:{ all -> 0x0121 }
            L_0x0043:
                com.facebook.b r0 = com.facebook.C3427b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12899d
                r0.set(r2)
                return
            L_0x004d:
                com.facebook.AccessToken r15 = new com.facebook.AccessToken     // Catch:{ all -> 0x0121 }
                com.facebook.b$e r0 = r1.f12913d     // Catch:{ all -> 0x0121 }
                java.lang.String r0 = r0.f12918a     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0056
                goto L_0x005c
            L_0x0056:
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.lang.String r0 = r0.mo11191r()     // Catch:{ all -> 0x0121 }
            L_0x005c:
                r5 = r0
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.lang.String r6 = r0.mo11181g()     // Catch:{ all -> 0x0121 }
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.lang.String r7 = r0.mo11192s()     // Catch:{ all -> 0x0121 }
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f12912c     // Catch:{ all -> 0x0121 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0074
                java.util.Set r0 = r1.f12914e     // Catch:{ all -> 0x0121 }
                goto L_0x007a
            L_0x0074:
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.util.Set r0 = r0.mo11189o()     // Catch:{ all -> 0x0121 }
            L_0x007a:
                r8 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f12912c     // Catch:{ all -> 0x0121 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0086
                java.util.Set r0 = r1.f12915f     // Catch:{ all -> 0x0121 }
                goto L_0x008c
            L_0x0086:
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.util.Set r0 = r0.mo11184j()     // Catch:{ all -> 0x0121 }
            L_0x008c:
                r9 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f12912c     // Catch:{ all -> 0x0121 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0098
                java.util.Set r0 = r1.f12916g     // Catch:{ all -> 0x0121 }
                goto L_0x009e
            L_0x0098:
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.util.Set r0 = r0.mo11185k()     // Catch:{ all -> 0x0121 }
            L_0x009e:
                r10 = r0
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                com.facebook.c r11 = r0.mo11190q()     // Catch:{ all -> 0x0121 }
                com.facebook.b$e r0 = r1.f12913d     // Catch:{ all -> 0x0121 }
                int r0 = r0.f12919b     // Catch:{ all -> 0x0121 }
                r12 = 1000(0x3e8, double:4.94E-321)
                if (r0 == 0) goto L_0x00ba
                java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x0121 }
                com.facebook.b$e r4 = r1.f12913d     // Catch:{ all -> 0x0121 }
                int r4 = r4.f12919b     // Catch:{ all -> 0x0121 }
                long r3 = (long) r4     // Catch:{ all -> 0x0121 }
                long r3 = r3 * r12
                r0.<init>(r3)     // Catch:{ all -> 0x0121 }
                goto L_0x00c0
            L_0x00ba:
                com.facebook.AccessToken r0 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.util.Date r0 = r0.mo11186l()     // Catch:{ all -> 0x0121 }
            L_0x00c0:
                java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0121 }
                r3.<init>()     // Catch:{ all -> 0x0121 }
                com.facebook.b$e r4 = r1.f12913d     // Catch:{ all -> 0x0121 }
                java.lang.Long r4 = r4.f12920c     // Catch:{ all -> 0x0121 }
                if (r4 == 0) goto L_0x00db
                java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0121 }
                com.facebook.b$e r14 = r1.f12913d     // Catch:{ all -> 0x0121 }
                java.lang.Long r14 = r14.f12920c     // Catch:{ all -> 0x0121 }
                long r16 = r14.longValue()     // Catch:{ all -> 0x0121 }
                long r12 = r12 * r16
                r4.<init>(r12)     // Catch:{ all -> 0x0121 }
                goto L_0x00e1
            L_0x00db:
                com.facebook.AccessToken r4 = r1.f12910a     // Catch:{ all -> 0x0121 }
                java.util.Date r4 = r4.mo11183i()     // Catch:{ all -> 0x0121 }
            L_0x00e1:
                r14 = r4
                com.facebook.b$e r4 = r1.f12913d     // Catch:{ all -> 0x0121 }
                java.lang.String r13 = r4.f12921d     // Catch:{ all -> 0x0121 }
                r4 = r15
                r12 = r0
                r0 = r13
                r13 = r3
                r3 = r15
                r15 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0121 }
                com.facebook.b r0 = com.facebook.C3427b.m11468h()     // Catch:{ all -> 0x0107 }
                r0.mo11867m(r3)     // Catch:{ all -> 0x0107 }
                com.facebook.b r0 = com.facebook.C3427b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12899d
                r0.set(r2)
                com.facebook.AccessToken$b r0 = r1.f12911b
                if (r0 == 0) goto L_0x0106
                r0.mo11202b(r3)
            L_0x0106:
                return
            L_0x0107:
                r0 = move-exception
                goto L_0x0123
            L_0x0109:
                com.facebook.AccessToken$b r0 = r1.f12911b     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0117
                com.facebook.j r3 = new com.facebook.j     // Catch:{ all -> 0x0121 }
                java.lang.String r4 = "No current access token to refresh"
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0121 }
                r0.mo11201a(r3)     // Catch:{ all -> 0x0121 }
            L_0x0117:
                com.facebook.b r0 = com.facebook.C3427b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12899d
                r0.set(r2)
                return
            L_0x0121:
                r0 = move-exception
                r3 = 0
            L_0x0123:
                com.facebook.b r4 = com.facebook.C3427b.this
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f12899d
                r4.set(r2)
                com.facebook.AccessToken$b r2 = r1.f12911b
                if (r2 == 0) goto L_0x0135
                if (r3 == 0) goto L_0x0135
                r2.mo11202b(r3)
            L_0x0135:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3427b.C3431d.mo11869a(com.facebook.q):void");
        }
    }

    /* renamed from: com.facebook.b$e */
    /* compiled from: AccessTokenManager */
    private static class C3432e {

        /* renamed from: a */
        public String f12918a;

        /* renamed from: b */
        public int f12919b;

        /* renamed from: c */
        public Long f12920c;

        /* renamed from: d */
        public String f12921d;

        private C3432e() {
        }

        /* synthetic */ C3432e(C3428a aVar) {
            this();
        }
    }

    C3427b(C6396a aVar, C3367a aVar2) {
        C3489g0.m11687i(aVar, "localBroadcastManager");
        C3489g0.m11687i(aVar2, "accessTokenCache");
        this.f12896a = aVar;
        this.f12897b = aVar2;
    }

    /* renamed from: c */
    private static GraphRequest m11466c(AccessToken accessToken, GraphRequest.C3360f fVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.mo11181g());
        return new GraphRequest(accessToken, "oauth/access_token", bundle, C3656s.GET, fVar);
    }

    /* renamed from: d */
    private static GraphRequest m11467d(AccessToken accessToken, GraphRequest.C3360f fVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), C3656s.GET, fVar);
    }

    /* renamed from: h */
    static C3427b m11468h() {
        if (f12895f == null) {
            synchronized (C3427b.class) {
                if (f12895f == null) {
                    f12895f = new C3427b(C6396a.m28074b(C3642m.m12279e()), new C3367a());
                }
            }
        }
        return f12895f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m11469k(AccessToken.C3348b bVar) {
        AccessToken.C3348b bVar2 = bVar;
        AccessToken accessToken = this.f12898c;
        if (accessToken == null) {
            if (bVar2 != null) {
                bVar2.mo11201a(new C3572j("No current access token to refresh"));
            }
        } else if (this.f12899d.compareAndSet(false, true)) {
            this.f12900e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C3432e eVar = new C3432e((C3428a) null);
            C3429b bVar3 = r0;
            HashSet hashSet4 = hashSet2;
            C3429b bVar4 = new C3429b(atomicBoolean, hashSet, hashSet2, hashSet3);
            C3652q qVar = new C3652q(m11467d(accessToken, bVar3), m11466c(accessToken, new C3430c(eVar)));
            qVar.mo12361c(new C3431d(accessToken, bVar, atomicBoolean, eVar, hashSet, hashSet4, hashSet3));
            qVar.mo12365g();
        } else if (bVar2 != null) {
            bVar2.mo11201a(new C3572j("Refresh already in progress"));
        }
    }

    /* renamed from: l */
    private void m11470l(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C3642m.m12279e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f12896a.mo24228d(intent);
    }

    /* renamed from: n */
    private void m11471n(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f12898c;
        this.f12898c = accessToken;
        this.f12899d.set(false);
        this.f12900e = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f12897b.mo11297g(accessToken);
            } else {
                this.f12897b.mo11295a();
                C3481f0.m11628g(C3642m.m12279e());
            }
        }
        if (!C3481f0.m11618b(accessToken2, accessToken)) {
            m11470l(accessToken2, accessToken);
            m11472o();
        }
    }

    /* renamed from: o */
    private void m11472o() {
        Context e = C3642m.m12279e();
        AccessToken h = AccessToken.m11205h();
        AlarmManager alarmManager = (AlarmManager) e.getSystemService("alarm");
        if (AccessToken.m11207t() && h.mo11186l() != null && alarmManager != null) {
            Intent intent = new Intent(e, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, h.mo11186l().getTime(), PendingIntent.getBroadcast(e, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: p */
    private boolean m11473p() {
        if (this.f12898c == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (!this.f12898c.mo11190q().mo11872d() || valueOf.longValue() - this.f12900e.getTime() <= 3600000 || valueOf.longValue() - this.f12898c.mo11188n().getTime() <= 86400000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11862e() {
        AccessToken accessToken = this.f12898c;
        m11470l(accessToken, accessToken);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11863f() {
        if (m11473p()) {
            mo11866j((AccessToken.C3348b) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AccessToken mo11864g() {
        return this.f12898c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo11865i() {
        AccessToken f = this.f12897b.mo11296f();
        if (f == null) {
            return false;
        }
        m11471n(f, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11866j(AccessToken.C3348b bVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m11469k(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C3428a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo11867m(AccessToken accessToken) {
        m11471n(accessToken, true);
    }
}
