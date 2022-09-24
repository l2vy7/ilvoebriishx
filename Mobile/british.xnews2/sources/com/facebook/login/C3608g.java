package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C3448e;
import com.facebook.C3450f;
import com.facebook.C3453h;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C3474d;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3541p;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.g */
/* compiled from: LoginManager */
public class C3608g {

    /* renamed from: e */
    private static final Set<String> f13410e = m12180f();

    /* renamed from: f */
    private static volatile C3608g f13411f;

    /* renamed from: a */
    private C3603d f13412a = C3603d.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private C3600a f13413b = C3600a.FRIENDS;

    /* renamed from: c */
    private final SharedPreferences f13414c;

    /* renamed from: d */
    private String f13415d = "rerequest";

    /* renamed from: com.facebook.login.g$a */
    /* compiled from: LoginManager */
    class C3609a implements C3474d.C3475a {

        /* renamed from: a */
        final /* synthetic */ C3453h f13416a;

        C3609a(C3453h hVar) {
            this.f13416a = hVar;
        }

        /* renamed from: a */
        public boolean mo11930a(int i, Intent intent) {
            return C3608g.this.mo12260p(i, intent, this.f13416a);
        }
    }

    /* renamed from: com.facebook.login.g$b */
    /* compiled from: LoginManager */
    static class C3610b extends HashSet<String> {
        C3610b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: com.facebook.login.g$c */
    /* compiled from: LoginManager */
    class C3611c implements C3474d.C3475a {
        C3611c() {
        }

        /* renamed from: a */
        public boolean mo11930a(int i, Intent intent) {
            return C3608g.this.mo12259o(i, intent);
        }
    }

    /* renamed from: com.facebook.login.g$d */
    /* compiled from: LoginManager */
    private static class C3612d implements C3623p {

        /* renamed from: a */
        private final Activity f13419a;

        C3612d(Activity activity) {
            C3489g0.m11687i(activity, "activity");
            this.f13419a = activity;
        }

        /* renamed from: a */
        public Activity mo12265a() {
            return this.f13419a;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.f13419a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.g$e */
    /* compiled from: LoginManager */
    private static class C3613e implements C3623p {

        /* renamed from: a */
        private final C3541p f13420a;

        C3613e(C3541p pVar) {
            C3489g0.m11687i(pVar, "fragment");
            this.f13420a = pVar;
        }

        /* renamed from: a */
        public Activity mo12265a() {
            return this.f13420a.mo12051a();
        }

        public void startActivityForResult(Intent intent, int i) {
            this.f13420a.mo12054d(intent, i);
        }
    }

    /* renamed from: com.facebook.login.g$f */
    /* compiled from: LoginManager */
    private static class C3614f {

        /* renamed from: a */
        private static C3607f f13421a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C3607f m12206b(Context context) {
            synchronized (C3614f.class) {
                if (context == null) {
                    context = C3642m.m12279e();
                }
                if (context == null) {
                    return null;
                }
                if (f13421a == null) {
                    f13421a = new C3607f(context, C3642m.m12280f());
                }
                C3607f fVar = f13421a;
                return fVar;
            }
        }
    }

    C3608g() {
        C3489g0.m11689k();
        this.f13414c = C3642m.m12279e().getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    static C3615h m12177a(LoginClient.Request request, AccessToken accessToken) {
        Set<String> i = request.mo12187i();
        HashSet hashSet = new HashSet(accessToken.mo11189o());
        if (request.mo12189k()) {
            hashSet.retainAll(i);
        }
        HashSet hashSet2 = new HashSet(i);
        hashSet2.removeAll(hashSet);
        return new C3615h(accessToken, hashSet, hashSet2);
    }

    /* renamed from: c */
    private void m12178c(AccessToken accessToken, LoginClient.Request request, C3572j jVar, boolean z, C3453h<C3615h> hVar) {
        if (accessToken != null) {
            AccessToken.m11208v(accessToken);
            Profile.m11331b();
        }
        if (hVar != null) {
            C3615h a = accessToken != null ? m12177a(request, accessToken) : null;
            if (z || (a != null && a.mo12268b().size() == 0)) {
                hVar.onCancel();
            } else if (jVar != null) {
                hVar.mo7377a(jVar);
            } else if (accessToken != null) {
                m12185u(true);
                hVar.onSuccess(a);
            }
        }
    }

    /* renamed from: e */
    public static C3608g m12179e() {
        if (f13411f == null) {
            synchronized (C3608g.class) {
                if (f13411f == null) {
                    f13411f = new C3608g();
                }
            }
        }
        return f13411f;
    }

    /* renamed from: f */
    private static Set<String> m12180f() {
        return Collections.unmodifiableSet(new C3610b());
    }

    /* renamed from: g */
    static boolean m12181g(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f13410e.contains(str));
    }

    /* renamed from: h */
    private void m12182h(Context context, LoginClient.Result.C3593b bVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        C3607f a = C3614f.m12206b(context);
        if (a != null) {
            if (request == null) {
                a.mo12251g("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("try_login_activity", z ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
            a.mo12249e(request.mo12180b(), hashMap, bVar, map, exc);
        }
    }

    /* renamed from: n */
    private void m12183n(Context context, LoginClient.Request request) {
        C3607f a = C3614f.m12206b(context);
        if (a != null && request != null) {
            a.mo12250f(request);
        }
    }

    /* renamed from: r */
    private boolean m12184r(Intent intent) {
        if (C3642m.m12279e().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m12185u(boolean z) {
        SharedPreferences.Editor edit = this.f13414c.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: w */
    private void m12186w(C3623p pVar, LoginClient.Request request) throws C3572j {
        m12183n(pVar.mo12265a(), request);
        C3474d.m11579c(C3474d.C3476b.Login.mo11931d(), new C3611c());
        if (!m12187x(pVar, request)) {
            C3572j jVar = new C3572j("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m12182h(pVar.mo12265a(), LoginClient.Result.C3593b.ERROR, (Map<String, String>) null, jVar, false, request);
            throw jVar;
        }
    }

    /* renamed from: x */
    private boolean m12187x(C3623p pVar, LoginClient.Request request) {
        Intent d = mo12253d(request);
        if (!m12184r(d)) {
            return false;
        }
        try {
            pVar.startActivityForResult(d, LoginClient.m12045q());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginClient.Request mo12233b(Collection<String> collection) {
        HashSet hashSet;
        C3603d dVar = this.f13412a;
        if (collection == null) {
            hashSet = new HashSet();
        }
        LoginClient.Request request = new LoginClient.Request(dVar, Collections.unmodifiableSet(hashSet), this.f13413b, this.f13415d, C3642m.m12280f(), UUID.randomUUID().toString());
        request.mo12193o(AccessToken.m11207t());
        return request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Intent mo12253d(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(C3642m.m12279e(), FacebookActivity.class);
        intent.setAction(request.mo12186h().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: i */
    public void mo12254i(Activity activity, Collection<String> collection) {
        m12186w(new C3612d(activity), mo12233b(collection));
    }

    /* renamed from: j */
    public void mo12255j(Fragment fragment, Collection<String> collection) {
        mo12257l(new C3541p(fragment), collection);
    }

    /* renamed from: k */
    public void mo12256k(androidx.fragment.app.Fragment fragment, Collection<String> collection) {
        mo12257l(new C3541p(fragment), collection);
    }

    /* renamed from: l */
    public void mo12257l(C3541p pVar, Collection<String> collection) {
        m12186w(new C3613e(pVar), mo12233b(collection));
    }

    /* renamed from: m */
    public void mo12258m() {
        AccessToken.m11208v((AccessToken) null);
        Profile.m11333f((Profile) null);
        m12185u(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo12259o(int i, Intent intent) {
        return mo12260p(i, intent, (C3453h<C3615h>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo12260p(int i, Intent intent, C3453h<C3615h> hVar) {
        boolean z;
        Map<String, String> map;
        LoginClient.Result.C3593b bVar;
        LoginClient.Request request;
        AccessToken accessToken;
        boolean z2;
        LoginClient.Request request2;
        Map<String, String> map2;
        int i2 = i;
        Intent intent2 = intent;
        LoginClient.Result.C3593b bVar2 = LoginClient.Result.C3593b.ERROR;
        C3572j jVar = null;
        boolean z3 = false;
        if (intent2 != null) {
            LoginClient.Result result = (LoginClient.Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request3 = result.f13360f;
                LoginClient.Result.C3593b bVar3 = result.f13356b;
                if (i2 == -1) {
                    if (bVar3 == LoginClient.Result.C3593b.SUCCESS) {
                        accessToken = result.f13357c;
                    } else {
                        jVar = new C3450f(result.f13358d);
                        accessToken = null;
                    }
                } else if (i2 == 0) {
                    accessToken = null;
                    z3 = true;
                } else {
                    accessToken = null;
                }
                map2 = result.f13361g;
                boolean z4 = z3;
                request2 = request3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                accessToken = null;
                map2 = null;
                request2 = null;
                z2 = false;
            }
            map = map2;
            bVar = bVar2;
            request = request2;
            z = z2;
        } else if (i2 == 0) {
            bVar = LoginClient.Result.C3593b.CANCEL;
            accessToken = null;
            request = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            accessToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (jVar == null && accessToken == null && !z) {
            jVar = new C3572j("Unexpected call to LoginManager.onActivityResult");
        }
        m12182h((Context) null, bVar, map, jVar, true, request);
        m12178c(accessToken, request, jVar, z, hVar);
        return true;
    }

    /* renamed from: q */
    public void mo12261q(C3448e eVar, C3453h<C3615h> hVar) {
        if (eVar instanceof C3474d) {
            ((C3474d) eVar).mo11929b(C3474d.C3476b.Login.mo11931d(), new C3609a(hVar));
            return;
        }
        throw new C3572j("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: s */
    public C3608g mo12262s(String str) {
        this.f13415d = str;
        return this;
    }

    /* renamed from: t */
    public C3608g mo12263t(C3600a aVar) {
        this.f13413b = aVar;
        return this;
    }

    /* renamed from: v */
    public C3608g mo12264v(C3603d dVar) {
        this.f13412a = dVar;
        return this;
    }
}
