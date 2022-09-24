package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C3572j;
import com.facebook.common.C3442f;
import com.facebook.internal.C3474d;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C3594a();

    /* renamed from: b */
    LoginMethodHandler[] f13337b;

    /* renamed from: c */
    int f13338c = -1;

    /* renamed from: d */
    Fragment f13339d;

    /* renamed from: e */
    C3596c f13340e;

    /* renamed from: f */
    C3595b f13341f;

    /* renamed from: g */
    boolean f13342g;

    /* renamed from: h */
    Request f13343h;

    /* renamed from: i */
    Map<String, String> f13344i;

    /* renamed from: j */
    Map<String, String> f13345j;

    /* renamed from: k */
    private C3607f f13346k;

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C3591a();

        /* renamed from: b */
        private final C3603d f13347b;

        /* renamed from: c */
        private Set<String> f13348c;

        /* renamed from: d */
        private final C3600a f13349d;

        /* renamed from: e */
        private final String f13350e;

        /* renamed from: f */
        private final String f13351f;

        /* renamed from: g */
        private boolean f13352g;

        /* renamed from: h */
        private String f13353h;

        /* renamed from: i */
        private String f13354i;

        /* renamed from: j */
        private String f13355j;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        static class C3591a implements Parcelable.Creator<Request> {
            C3591a() {
            }

            /* renamed from: a */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, (C3594a) null);
            }

            /* renamed from: b */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        /* synthetic */ Request(Parcel parcel, C3594a aVar) {
            this(parcel);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo12179a() {
            return this.f13350e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo12180b() {
            return this.f13351f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo12181d() {
            return this.f13354i;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3600a mo12183e() {
            return this.f13349d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo12184f() {
            return this.f13355j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo12185g() {
            return this.f13353h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3603d mo12186h() {
            return this.f13347b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Set<String> mo12187i() {
            return this.f13348c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo12188j() {
            for (String g : this.f13348c) {
                if (C3608g.m12181g(g)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo12189k() {
            return this.f13352g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo12190l(String str) {
            this.f13355j = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo12191m(String str) {
            this.f13353h = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo12192n(Set<String> set) {
            C3489g0.m11687i(set, "permissions");
            this.f13348c = set;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo12193o(boolean z) {
            this.f13352g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3603d dVar = this.f13347b;
            String str = null;
            parcel.writeString(dVar != null ? dVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f13348c));
            C3600a aVar = this.f13349d;
            if (aVar != null) {
                str = aVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f13350e);
            parcel.writeString(this.f13351f);
            parcel.writeByte(this.f13352g ? (byte) 1 : 0);
            parcel.writeString(this.f13353h);
            parcel.writeString(this.f13354i);
            parcel.writeString(this.f13355j);
        }

        Request(C3603d dVar, Set<String> set, C3600a aVar, String str, String str2, String str3) {
            this.f13352g = false;
            this.f13347b = dVar;
            this.f13348c = set == null ? new HashSet<>() : set;
            this.f13349d = aVar;
            this.f13354i = str;
            this.f13350e = str2;
            this.f13351f = str3;
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.f13352g = false;
            String readString = parcel.readString();
            C3600a aVar = null;
            this.f13347b = readString != null ? C3603d.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f13348c = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f13349d = readString2 != null ? C3600a.valueOf(readString2) : aVar;
            this.f13350e = parcel.readString();
            this.f13351f = parcel.readString();
            this.f13352g = parcel.readByte() != 0 ? true : z;
            this.f13353h = parcel.readString();
            this.f13354i = parcel.readString();
            this.f13355j = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C3592a();

        /* renamed from: b */
        final C3593b f13356b;

        /* renamed from: c */
        final AccessToken f13357c;

        /* renamed from: d */
        final String f13358d;

        /* renamed from: e */
        final String f13359e;

        /* renamed from: f */
        final Request f13360f;

        /* renamed from: g */
        public Map<String, String> f13361g;

        /* renamed from: h */
        public Map<String, String> f13362h;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        static class C3592a implements Parcelable.Creator<Result> {
            C3592a() {
            }

            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, (C3594a) null);
            }

            /* renamed from: b */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$b */
        enum C3593b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: b */
            private final String f13367b;

            private C3593b(String str) {
                this.f13367b = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public String mo12205d() {
                return this.f13367b;
            }
        }

        /* synthetic */ Result(Parcel parcel, C3594a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        static Result m12087a(Request request, String str) {
            return new Result(request, C3593b.CANCEL, (AccessToken) null, str, (String) null);
        }

        /* renamed from: b */
        static Result m12088b(Request request, String str, String str2) {
            return m12089d(request, str, str2, (String) null);
        }

        /* renamed from: d */
        static Result m12089d(Request request, String str, String str2, String str3) {
            return new Result(request, C3593b.ERROR, (AccessToken) null, TextUtils.join(": ", C3481f0.m11620c(str, str2)), str3);
        }

        /* renamed from: e */
        static Result m12090e(Request request, AccessToken accessToken) {
            return new Result(request, C3593b.SUCCESS, accessToken, (String) null, (String) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f13356b.name());
            parcel.writeParcelable(this.f13357c, i);
            parcel.writeString(this.f13358d);
            parcel.writeString(this.f13359e);
            parcel.writeParcelable(this.f13360f, i);
            C3481f0.m11655t0(parcel, this.f13361g);
            C3481f0.m11655t0(parcel, this.f13362h);
        }

        Result(Request request, C3593b bVar, AccessToken accessToken, String str, String str2) {
            C3489g0.m11687i(bVar, "code");
            this.f13360f = request;
            this.f13357c = accessToken;
            this.f13358d = str;
            this.f13356b = bVar;
            this.f13359e = str2;
        }

        private Result(Parcel parcel) {
            this.f13356b = C3593b.valueOf(parcel.readString());
            this.f13357c = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f13358d = parcel.readString();
            this.f13359e = parcel.readString();
            this.f13360f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f13361g = C3481f0.m11623d0(parcel);
            this.f13362h = C3481f0.m11623d0(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    static class C3594a implements Parcelable.Creator<LoginClient> {
        C3594a() {
        }

        /* renamed from: a */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: b */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    interface C3595b {
        /* renamed from: a */
        void mo12210a();

        /* renamed from: b */
        void mo12211b();
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public interface C3596c {
        /* renamed from: a */
        void mo12212a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.f13339d = fragment;
    }

    /* renamed from: a */
    private void m12041a(String str, String str2, boolean z) {
        if (this.f13344i == null) {
            this.f13344i = new HashMap();
        }
        if (this.f13344i.containsKey(str) && z) {
            str2 = this.f13344i.get(str) + "," + str2;
        }
        this.f13344i.put(str, str2);
    }

    /* renamed from: i */
    private void m12042i() {
        mo12165g(Result.m12088b(this.f13343h, "Login attempt failed.", (String) null));
    }

    /* renamed from: l */
    static String m12043l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: p */
    private C3607f m12044p() {
        C3607f fVar = this.f13346k;
        if (fVar == null || !fVar.mo12245a().equals(this.f13343h.mo12179a())) {
            this.f13346k = new C3607f(mo12167j(), this.f13343h.mo12179a());
        }
        return this.f13346k;
    }

    /* renamed from: q */
    public static int m12045q() {
        return C3474d.C3476b.Login.mo11931d();
    }

    /* renamed from: s */
    private void m12046s(String str, Result result, Map<String, String> map) {
        m12047t(str, result.f13356b.mo12205d(), result.f13358d, result.f13359e, map);
    }

    /* renamed from: t */
    private void m12047t(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f13343h == null) {
            m12044p().mo12252h("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m12044p().mo12246b(this.f13343h.mo12180b(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: w */
    private void m12048w(Result result) {
        C3596c cVar = this.f13340e;
        if (cVar != null) {
            cVar.mo12212a(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo12155A(C3596c cVar) {
        this.f13340e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo12156B(Request request) {
        if (!mo12171o()) {
            mo12160b(request);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo12157C() {
        LoginMethodHandler k = mo12168k();
        if (!k.mo12216j() || mo12163e()) {
            boolean n = k.mo12094n(this.f13343h);
            if (n) {
                m12044p().mo12248d(this.f13343h.mo12180b(), k.mo12091g());
            } else {
                m12044p().mo12247c(this.f13343h.mo12180b(), k.mo12091g());
                m12041a("not_tried", k.mo12091g(), true);
            }
            return n;
        }
        m12041a("no_internet_permission", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo12158D() {
        int i;
        if (this.f13338c >= 0) {
            m12047t(mo12168k().mo12091g(), "skipped", (String) null, (String) null, mo12168k().f13368b);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f13337b;
            if (loginMethodHandlerArr != null && (i = this.f13338c) < loginMethodHandlerArr.length - 1) {
                this.f13338c = i + 1;
            } else if (this.f13343h != null) {
                m12042i();
                return;
            } else {
                return;
            }
        } while (!mo12157C());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo12159E(Result result) {
        Result result2;
        if (result.f13357c != null) {
            AccessToken h = AccessToken.m11205h();
            AccessToken accessToken = result.f13357c;
            if (!(h == null || accessToken == null)) {
                try {
                    if (h.mo11192s().equals(accessToken.mo11192s())) {
                        result2 = Result.m12090e(this.f13343h, result.f13357c);
                        mo12165g(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo12165g(Result.m12088b(this.f13343h, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m12088b(this.f13343h, "User logged in as different Facebook user.", (String) null);
            mo12165g(result2);
            return;
        }
        throw new C3572j("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12160b(Request request) {
        if (request != null) {
            if (this.f13343h != null) {
                throw new C3572j("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m11207t() || mo12163e()) {
                this.f13343h = request;
                this.f13337b = mo12170n(request);
                mo12158D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12161d() {
        if (this.f13338c >= 0) {
            mo12168k().mo12141b();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo12163e() {
        if (this.f13342g) {
            return true;
        }
        if (mo12164f("android.permission.INTERNET") != 0) {
            FragmentActivity j = mo12167j();
            mo12165g(Result.m12088b(this.f13343h, j.getString(C3442f.com_facebook_internet_permission_error_title), j.getString(C3442f.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f13342g = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo12164f(String str) {
        return mo12167j().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12165g(Result result) {
        LoginMethodHandler k = mo12168k();
        if (k != null) {
            m12046s(k.mo12091g(), result, k.f13368b);
        }
        Map<String, String> map = this.f13344i;
        if (map != null) {
            result.f13361g = map;
        }
        Map<String, String> map2 = this.f13345j;
        if (map2 != null) {
            result.f13362h = map2;
        }
        this.f13337b = null;
        this.f13338c = -1;
        this.f13343h = null;
        this.f13344i = null;
        m12048w(result);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12166h(Result result) {
        if (result.f13357c == null || !AccessToken.m11207t()) {
            mo12165g(result);
        } else {
            mo12159E(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public FragmentActivity mo12167j() {
        return this.f13339d.mo3443p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public LoginMethodHandler mo12168k() {
        int i = this.f13338c;
        if (i >= 0) {
            return this.f13337b[i];
        }
        return null;
    }

    /* renamed from: m */
    public Fragment mo12169m() {
        return this.f13339d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public LoginMethodHandler[] mo12170n(Request request) {
        ArrayList arrayList = new ArrayList();
        C3603d h = request.mo12186h();
        if (h.mo12239k()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (h.mo12240l()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (h.mo12238j()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (h.mo12236d()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (h.mo12241m()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (h.mo12237i()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo12171o() {
        return this.f13343h != null && this.f13338c >= 0;
    }

    /* renamed from: r */
    public Request mo12172r() {
        return this.f13343h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo12173u() {
        C3595b bVar = this.f13341f;
        if (bVar != null) {
            bVar.mo12210a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo12174v() {
        C3595b bVar = this.f13341f;
        if (bVar != null) {
            bVar.mo12211b();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f13337b, i);
        parcel.writeInt(this.f13338c);
        parcel.writeParcelable(this.f13343h, i);
        C3481f0.m11655t0(parcel, this.f13344i);
        C3481f0.m11655t0(parcel, this.f13345j);
    }

    /* renamed from: x */
    public boolean mo12176x(int i, int i2, Intent intent) {
        if (this.f13343h != null) {
            return mo12168k().mo12092k(i, i2, intent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo12177y(C3595b bVar) {
        this.f13341f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo12178z(Fragment fragment) {
        if (this.f13339d == null) {
            this.f13339d = fragment;
            return;
        }
        throw new C3572j("Can't set fragment once it is already set.");
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f13337b = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f13337b;
            loginMethodHandlerArr[i] = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i].mo12217m(this);
        }
        this.f13338c = parcel.readInt();
        this.f13343h = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f13344i = C3481f0.m11623d0(parcel);
        this.f13345j = C3481f0.m11623d0(parcel);
    }
}
