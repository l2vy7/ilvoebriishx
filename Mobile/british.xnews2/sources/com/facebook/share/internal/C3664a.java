package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C3445d;
import com.facebook.C3453h;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.C3652q;
import com.facebook.C3655r;
import com.facebook.C3656s;
import com.facebook.C3752u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3456a0;
import com.facebook.internal.C3464c;
import com.facebook.internal.C3474d;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3505i0;
import com.facebook.internal.C3528o;
import com.facebook.internal.C3541p;
import com.facebook.internal.C3561x;
import com.facebook.share.internal.LikeContent;
import com.facebook.share.widget.LikeView;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p176y0.C6396a;

@Deprecated
/* renamed from: com.facebook.share.internal.a */
/* compiled from: LikeActionController */
public class C3664a {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f13603o = "a";
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static C3528o f13604p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final ConcurrentHashMap<String, C3664a> f13605q = new ConcurrentHashMap<>();

    /* renamed from: r */
    private static C3505i0 f13606r = new C3505i0(1);

    /* renamed from: s */
    private static C3505i0 f13607s = new C3505i0(1);

    /* renamed from: t */
    private static Handler f13608t;

    /* renamed from: u */
    private static String f13609u;

    /* renamed from: v */
    private static boolean f13610v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static volatile int f13611w;

    /* renamed from: x */
    private static C3445d f13612x;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f13613a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LikeView.C3748g f13614b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f13615c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f13616d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f13617e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f13618f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f13619g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f13620h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f13621i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13622j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13623k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f13624l;

    /* renamed from: m */
    private Bundle f13625m;

    /* renamed from: n */
    private C3420m f13626n;

    /* renamed from: com.facebook.share.internal.a$a */
    /* compiled from: LikeActionController */
    class C3665a implements C3456a0.C3458b {
        C3665a() {
        }

        /* renamed from: a */
        public void mo11916a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                    str = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                } else {
                    str = C3664a.this.f13616d;
                }
                String str6 = str;
                if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                    str2 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                } else {
                    str2 = C3664a.this.f13617e;
                }
                String str7 = str2;
                if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                    str3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                } else {
                    str3 = C3664a.this.f13618f;
                }
                String str8 = str3;
                if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                    str4 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                } else {
                    str4 = C3664a.this.f13619g;
                }
                String str9 = str4;
                if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                    str5 = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                } else {
                    str5 = C3664a.this.f13620h;
                }
                C3664a.this.m12424t0(z, str6, str7, str8, str9, str5);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$a0 */
    /* compiled from: LikeActionController */
    private static class C3666a0 implements Runnable {

        /* renamed from: b */
        private String f13628b;

        /* renamed from: c */
        private String f13629c;

        C3666a0(String str, String str2) {
            this.f13628b = str;
            this.f13629c = str2;
        }

        public void run() {
            C3664a.m12414n0(this.f13628b, this.f13629c);
        }
    }

    /* renamed from: com.facebook.share.internal.a$b */
    /* compiled from: LikeActionController */
    class C3667b implements C3652q.C3653a {

        /* renamed from: a */
        final /* synthetic */ C3685q f13630a;

        /* renamed from: b */
        final /* synthetic */ C3687s f13631b;

        /* renamed from: c */
        final /* synthetic */ C3693y f13632c;

        C3667b(C3685q qVar, C3687s sVar, C3693y yVar) {
            this.f13630a = qVar;
            this.f13631b = sVar;
            this.f13632c = yVar;
        }

        /* renamed from: a */
        public void mo11869a(C3652q qVar) {
            FacebookRequestError facebookRequestError;
            String unused = C3664a.this.f13621i = this.f13630a.f13669f;
            if (C3481f0.m11604O(C3664a.this.f13621i)) {
                String unused2 = C3664a.this.f13621i = this.f13631b.f13676f;
                boolean unused3 = C3664a.this.f13622j = this.f13631b.f13677g;
            }
            if (C3481f0.m11604O(C3664a.this.f13621i)) {
                C3561x.m11894h(C3752u.DEVELOPER_ERRORS, C3664a.f13603o, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", C3664a.this.f13613a);
                C3664a aVar = C3664a.this;
                if (this.f13631b.getError() != null) {
                    facebookRequestError = this.f13631b.getError();
                } else {
                    facebookRequestError = this.f13630a.getError();
                }
                aVar.m12385Y("get_verified_id", facebookRequestError);
            }
            C3693y yVar = this.f13632c;
            if (yVar != null) {
                yVar.mo12421a();
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$c */
    /* compiled from: LikeActionController */
    static /* synthetic */ class C3668c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13634a;

        static {
            int[] iArr = new int[LikeView.C3748g.values().length];
            f13634a = iArr;
            try {
                iArr[LikeView.C3748g.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$d */
    /* compiled from: LikeActionController */
    static class C3669d implements C3683o {

        /* renamed from: a */
        final /* synthetic */ int f13635a;

        /* renamed from: b */
        final /* synthetic */ int f13636b;

        /* renamed from: c */
        final /* synthetic */ Intent f13637c;

        C3669d(int i, int i2, Intent intent) {
            this.f13635a = i;
            this.f13636b = i2;
            this.f13637c = intent;
        }

        /* renamed from: a */
        public void mo12418a(C3664a aVar, C3572j jVar) {
            if (jVar == null) {
                aVar.m12386Z(this.f13635a, this.f13636b, this.f13637c);
            } else {
                C3481f0.m11608S(C3664a.f13603o, jVar);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$e */
    /* compiled from: LikeActionController */
    static class C3670e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3664a f13638b;

        C3670e(C3664a aVar) {
            this.f13638b = aVar;
        }

        public void run() {
            this.f13638b.m12404i0();
        }
    }

    /* renamed from: com.facebook.share.internal.a$f */
    /* compiled from: LikeActionController */
    static class C3671f implements C3474d.C3475a {
        C3671f() {
        }

        /* renamed from: a */
        public boolean mo11930a(int i, Intent intent) {
            return C3664a.m12382U(C3474d.C3476b.Like.mo11931d(), i, intent);
        }
    }

    /* renamed from: com.facebook.share.internal.a$g */
    /* compiled from: LikeActionController */
    static class C3672g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3683o f13639b;

        /* renamed from: c */
        final /* synthetic */ C3664a f13640c;

        /* renamed from: d */
        final /* synthetic */ C3572j f13641d;

        C3672g(C3683o oVar, C3664a aVar, C3572j jVar) {
            this.f13639b = oVar;
            this.f13640c = aVar;
            this.f13641d = jVar;
        }

        public void run() {
            this.f13639b.mo12418a(this.f13640c, this.f13641d);
        }
    }

    /* renamed from: com.facebook.share.internal.a$h */
    /* compiled from: LikeActionController */
    static class C3673h extends C3445d {
        C3673h() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11874d(AccessToken accessToken, AccessToken accessToken2) {
            Context e = C3642m.m12279e();
            if (accessToken2 == null) {
                int unused = C3664a.f13611w = (C3664a.f13611w + 1) % 1000;
                e.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", C3664a.f13611w).apply();
                C3664a.f13605q.clear();
                C3664a.f13604p.mo12017e();
            }
            C3664a.m12369E((C3664a) null, "com.facebook.sdk.LikeActionController.DID_RESET");
        }
    }

    /* renamed from: com.facebook.share.internal.a$i */
    /* compiled from: LikeActionController */
    class C3674i extends C3703g {

        /* renamed from: b */
        final /* synthetic */ Bundle f13642b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3674i(C3453h hVar, Bundle bundle) {
            super(hVar);
            this.f13642b = bundle;
        }
    }

    /* renamed from: com.facebook.share.internal.a$j */
    /* compiled from: LikeActionController */
    class C3675j implements C3693y {

        /* renamed from: a */
        final /* synthetic */ Bundle f13644a;

        /* renamed from: com.facebook.share.internal.a$j$a */
        /* compiled from: LikeActionController */
        class C3676a implements C3652q.C3653a {

            /* renamed from: a */
            final /* synthetic */ C3691w f13646a;

            C3676a(C3691w wVar) {
                this.f13646a = wVar;
            }

            /* renamed from: a */
            public void mo11869a(C3652q qVar) {
                boolean unused = C3664a.this.f13624l = false;
                if (this.f13646a.getError() != null) {
                    C3664a.this.m12394d0(false);
                    return;
                }
                String unused2 = C3664a.this.f13620h = C3481f0.m11632i(this.f13646a.f13685f, (String) null);
                boolean unused3 = C3664a.this.f13623k = true;
                C3664a.this.m12377M().mo11849j("fb_like_control_did_like", (Double) null, C3675j.this.f13644a);
                C3675j jVar = C3675j.this;
                C3664a.this.m12392c0(jVar.f13644a);
            }
        }

        C3675j(Bundle bundle) {
            this.f13644a = bundle;
        }

        /* renamed from: a */
        public void mo12421a() {
            if (C3481f0.m11604O(C3664a.this.f13621i)) {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                C3664a.m12370F(C3664a.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            }
            C3652q qVar = new C3652q();
            C3664a aVar = C3664a.this;
            C3691w wVar = new C3691w(aVar.f13621i, C3664a.this.f13614b);
            wVar.mo12422a(qVar);
            qVar.mo12361c(new C3676a(wVar));
            qVar.mo12365g();
        }
    }

    /* renamed from: com.facebook.share.internal.a$k */
    /* compiled from: LikeActionController */
    class C3677k implements C3652q.C3653a {

        /* renamed from: a */
        final /* synthetic */ C3692x f13648a;

        /* renamed from: b */
        final /* synthetic */ Bundle f13649b;

        C3677k(C3692x xVar, Bundle bundle) {
            this.f13648a = xVar;
            this.f13649b = bundle;
        }

        /* renamed from: a */
        public void mo11869a(C3652q qVar) {
            boolean unused = C3664a.this.f13624l = false;
            if (this.f13648a.getError() != null) {
                C3664a.this.m12394d0(true);
                return;
            }
            String unused2 = C3664a.this.f13620h = null;
            boolean unused3 = C3664a.this.f13623k = false;
            C3664a.this.m12377M().mo11849j("fb_like_control_did_unlike", (Double) null, this.f13649b);
            C3664a.this.m12392c0(this.f13649b);
        }
    }

    /* renamed from: com.facebook.share.internal.a$l */
    /* compiled from: LikeActionController */
    class C3678l implements C3693y {

        /* renamed from: com.facebook.share.internal.a$l$a */
        /* compiled from: LikeActionController */
        class C3679a implements C3652q.C3653a {

            /* renamed from: a */
            final /* synthetic */ C3689u f13652a;

            /* renamed from: b */
            final /* synthetic */ C3684p f13653b;

            C3679a(C3689u uVar, C3684p pVar) {
                this.f13652a = uVar;
                this.f13653b = pVar;
            }

            /* renamed from: a */
            public void mo11869a(C3652q qVar) {
                if (this.f13652a.getError() == null && this.f13653b.getError() == null) {
                    C3664a aVar = C3664a.this;
                    boolean b = this.f13652a.mo12428b();
                    C3684p pVar = this.f13653b;
                    aVar.m12424t0(b, pVar.f13664f, pVar.f13665g, pVar.f13666h, pVar.f13667i, this.f13652a.mo12429c());
                    return;
                }
                C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Unable to refresh like state for id: '%s'", C3664a.this.f13613a);
            }
        }

        C3678l() {
        }

        /* renamed from: a */
        public void mo12421a() {
            C3689u uVar;
            if (C3668c.f13634a[C3664a.this.f13614b.ordinal()] != 1) {
                C3664a aVar = C3664a.this;
                uVar = new C3686r(aVar.f13621i, C3664a.this.f13614b);
            } else {
                C3664a aVar2 = C3664a.this;
                uVar = new C3688t(aVar2.f13621i);
            }
            C3664a aVar3 = C3664a.this;
            C3684p pVar = new C3684p(aVar3.f13621i, C3664a.this.f13614b);
            C3652q qVar = new C3652q();
            uVar.mo12422a(qVar);
            pVar.mo12422a(qVar);
            qVar.mo12361c(new C3679a(uVar, pVar));
            qVar.mo12365g();
        }
    }

    /* renamed from: com.facebook.share.internal.a$m */
    /* compiled from: LikeActionController */
    private abstract class C3680m implements C3694z {

        /* renamed from: a */
        private GraphRequest f13655a;

        /* renamed from: b */
        protected String f13656b;

        /* renamed from: c */
        protected LikeView.C3748g f13657c;

        /* renamed from: d */
        protected FacebookRequestError f13658d;

        /* renamed from: com.facebook.share.internal.a$m$a */
        /* compiled from: LikeActionController */
        class C3681a implements GraphRequest.C3360f {
            C3681a() {
            }

            /* renamed from: b */
            public void mo7382b(C3655r rVar) {
                C3680m.this.f13658d = rVar.mo12380g();
                C3680m mVar = C3680m.this;
                FacebookRequestError facebookRequestError = mVar.f13658d;
                if (facebookRequestError != null) {
                    mVar.mo12423d(facebookRequestError);
                } else {
                    mVar.mo12424e(rVar);
                }
            }
        }

        protected C3680m(String str, LikeView.C3748g gVar) {
            this.f13656b = str;
            this.f13657c = gVar;
        }

        /* renamed from: a */
        public void mo12422a(C3652q qVar) {
            qVar.add(this.f13655a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo12423d(FacebookRequestError facebookRequestError);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo12424e(C3655r rVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo12425f(GraphRequest graphRequest) {
            this.f13655a = graphRequest;
            graphRequest.mo11249d0(C3642m.m12290p());
            graphRequest.mo11243W(new C3681a());
        }

        public FacebookRequestError getError() {
            return this.f13658d;
        }
    }

    /* renamed from: com.facebook.share.internal.a$n */
    /* compiled from: LikeActionController */
    private static class C3682n implements Runnable {

        /* renamed from: b */
        private String f13661b;

        /* renamed from: c */
        private LikeView.C3748g f13662c;

        /* renamed from: d */
        private C3683o f13663d;

        C3682n(String str, LikeView.C3748g gVar, C3683o oVar) {
            this.f13661b = str;
            this.f13662c = gVar;
            this.f13663d = oVar;
        }

        public void run() {
            C3664a.m12373I(this.f13661b, this.f13662c, this.f13663d);
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.a$o */
    /* compiled from: LikeActionController */
    public interface C3683o {
        /* renamed from: a */
        void mo12418a(C3664a aVar, C3572j jVar);
    }

    /* renamed from: com.facebook.share.internal.a$p */
    /* compiled from: LikeActionController */
    private class C3684p extends C3680m {

        /* renamed from: f */
        String f13664f;

        /* renamed from: g */
        String f13665g;

        /* renamed from: h */
        String f13666h;

        /* renamed from: i */
        String f13667i;

        C3684p(String str, LikeView.C3748g gVar) {
            super(str, gVar);
            this.f13664f = C3664a.this.f13616d;
            this.f13665g = C3664a.this.f13617e;
            this.f13666h = C3664a.this.f13618f;
            this.f13667i = C3664a.this.f13619g;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            mo12425f(new GraphRequest(AccessToken.m11205h(), str, bundle, C3656s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error fetching engagement for object '%s' with type '%s' : %s", this.f13656b, this.f13657c, facebookRequestError);
            C3664a.this.m12385Y("get_engagement", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            JSONObject r0 = C3481f0.m11651r0(rVar.mo12381h(), "engagement");
            if (r0 != null) {
                this.f13664f = r0.optString("count_string_with_like", this.f13664f);
                this.f13665g = r0.optString("count_string_without_like", this.f13665g);
                this.f13666h = r0.optString("social_sentence_with_like", this.f13666h);
                this.f13667i = r0.optString("social_sentence_without_like", this.f13667i);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$q */
    /* compiled from: LikeActionController */
    private class C3685q extends C3680m {

        /* renamed from: f */
        String f13669f;

        C3685q(String str, LikeView.C3748g gVar) {
            super(str, gVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            mo12425f(new GraphRequest(AccessToken.m11205h(), "", bundle, C3656s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.mo11227e().contains("og_object")) {
                this.f13658d = null;
                return;
            }
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error getting the FB id for object '%s' with type '%s' : %s", this.f13656b, this.f13657c, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            JSONObject optJSONObject;
            JSONObject r0 = C3481f0.m11651r0(rVar.mo12381h(), this.f13656b);
            if (r0 != null && (optJSONObject = r0.optJSONObject("og_object")) != null) {
                this.f13669f = optJSONObject.optString(TtmlNode.ATTR_ID);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$r */
    /* compiled from: LikeActionController */
    private class C3686r extends C3680m implements C3689u {

        /* renamed from: f */
        private boolean f13671f;

        /* renamed from: g */
        private String f13672g;

        /* renamed from: h */
        private final String f13673h;

        /* renamed from: i */
        private final LikeView.C3748g f13674i;

        C3686r(String str, LikeView.C3748g gVar) {
            super(str, gVar);
            this.f13671f = C3664a.this.f13615c;
            this.f13673h = str;
            this.f13674i = gVar;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", str);
            mo12425f(new GraphRequest(AccessToken.m11205h(), "me/og.likes", bundle, C3656s.GET));
        }

        /* renamed from: b */
        public boolean mo12428b() {
            return this.f13671f;
        }

        /* renamed from: c */
        public String mo12429c() {
            return this.f13672g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error fetching like status for object '%s' with type '%s' : %s", this.f13673h, this.f13674i, facebookRequestError);
            C3664a.this.m12385Y("get_og_object_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            JSONArray q0 = C3481f0.m11649q0(rVar.mo12381h(), "data");
            if (q0 != null) {
                for (int i = 0; i < q0.length(); i++) {
                    JSONObject optJSONObject = q0.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.f13671f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(MimeTypes.BASE_TYPE_APPLICATION);
                        AccessToken h = AccessToken.m11205h();
                        if (optJSONObject2 != null && AccessToken.m11207t() && C3481f0.m11618b(h.mo11181g(), optJSONObject2.optString(TtmlNode.ATTR_ID))) {
                            this.f13672g = optJSONObject.optString(TtmlNode.ATTR_ID);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$s */
    /* compiled from: LikeActionController */
    private class C3687s extends C3680m {

        /* renamed from: f */
        String f13676f;

        /* renamed from: g */
        boolean f13677g;

        C3687s(String str, LikeView.C3748g gVar) {
            super(str, gVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", TtmlNode.ATTR_ID);
            bundle.putString("ids", str);
            mo12425f(new GraphRequest(AccessToken.m11205h(), "", bundle, C3656s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error getting the FB id for object '%s' with type '%s' : %s", this.f13656b, this.f13657c, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            JSONObject r0 = C3481f0.m11651r0(rVar.mo12381h(), this.f13656b);
            if (r0 != null) {
                String optString = r0.optString(TtmlNode.ATTR_ID);
                this.f13676f = optString;
                this.f13677g = !C3481f0.m11604O(optString);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$t */
    /* compiled from: LikeActionController */
    private class C3688t extends C3680m implements C3689u {

        /* renamed from: f */
        private boolean f13679f;

        /* renamed from: g */
        private String f13680g;

        C3688t(String str) {
            super(str, LikeView.C3748g.PAGE);
            this.f13679f = C3664a.this.f13615c;
            this.f13680g = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", TtmlNode.ATTR_ID);
            AccessToken h = AccessToken.m11205h();
            mo12425f(new GraphRequest(h, "me/likes/" + str, bundle, C3656s.GET));
        }

        /* renamed from: b */
        public boolean mo12428b() {
            return this.f13679f;
        }

        /* renamed from: c */
        public String mo12429c() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error fetching like status for page id '%s': %s", this.f13680g, facebookRequestError);
            C3664a.this.m12385Y("get_page_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            JSONArray q0 = C3481f0.m11649q0(rVar.mo12381h(), "data");
            if (q0 != null && q0.length() > 0) {
                this.f13679f = true;
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$u */
    /* compiled from: LikeActionController */
    private interface C3689u extends C3694z {
        /* renamed from: b */
        boolean mo12428b();

        /* renamed from: c */
        String mo12429c();
    }

    /* renamed from: com.facebook.share.internal.a$v */
    /* compiled from: LikeActionController */
    private static class C3690v implements Runnable {

        /* renamed from: d */
        private static ArrayList<String> f13682d = new ArrayList<>();

        /* renamed from: b */
        private String f13683b;

        /* renamed from: c */
        private boolean f13684c;

        C3690v(String str, boolean z) {
            this.f13683b = str;
            this.f13684c = z;
        }

        public void run() {
            String str = this.f13683b;
            if (str != null) {
                f13682d.remove(str);
                f13682d.add(0, this.f13683b);
            }
            if (this.f13684c && f13682d.size() >= 128) {
                while (64 < f13682d.size()) {
                    ArrayList<String> arrayList = f13682d;
                    C3664a.f13605q.remove(arrayList.remove(arrayList.size() - 1));
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$w */
    /* compiled from: LikeActionController */
    private class C3691w extends C3680m {

        /* renamed from: f */
        String f13685f;

        C3691w(String str, LikeView.C3748g gVar) {
            super(str, gVar);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            mo12425f(new GraphRequest(AccessToken.m11205h(), "me/og.likes", bundle, C3656s.POST));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.mo11225d() == 3501) {
                this.f13658d = null;
                return;
            }
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error liking object '%s' with type '%s' : %s", this.f13656b, this.f13657c, facebookRequestError);
            C3664a.this.m12385Y("publish_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
            this.f13685f = C3481f0.m11639l0(rVar.mo12381h(), TtmlNode.ATTR_ID);
        }
    }

    /* renamed from: com.facebook.share.internal.a$x */
    /* compiled from: LikeActionController */
    private class C3692x extends C3680m {

        /* renamed from: f */
        private String f13687f;

        C3692x(String str) {
            super((String) null, (LikeView.C3748g) null);
            this.f13687f = str;
            mo12425f(new GraphRequest(AccessToken.m11205h(), str, (Bundle) null, C3656s.DELETE));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12423d(FacebookRequestError facebookRequestError) {
            C3561x.m11894h(C3752u.REQUESTS, C3664a.f13603o, "Error unliking object with unlike token '%s' : %s", this.f13687f, facebookRequestError);
            C3664a.this.m12385Y("publish_unlike", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo12424e(C3655r rVar) {
        }
    }

    /* renamed from: com.facebook.share.internal.a$y */
    /* compiled from: LikeActionController */
    private interface C3693y {
        /* renamed from: a */
        void mo12421a();
    }

    /* renamed from: com.facebook.share.internal.a$z */
    /* compiled from: LikeActionController */
    private interface C3694z {
        /* renamed from: a */
        void mo12422a(C3652q qVar);

        FacebookRequestError getError();
    }

    private C3664a(String str, LikeView.C3748g gVar) {
        this.f13613a = str;
        this.f13614b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static void m12369E(C3664a aVar, String str) {
        m12370F(aVar, str, (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static void m12370F(C3664a aVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (aVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", aVar.mo12412R());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C6396a.m28074b(C3642m.m12279e()).mo24228d(intent);
    }

    /* renamed from: G */
    private boolean m12371G() {
        AccessToken h = AccessToken.m11205h();
        return !this.f13622j && this.f13621i != null && AccessToken.m11207t() && h.mo11189o() != null && h.mo11189o().contains("publish_actions");
    }

    /* renamed from: H */
    private void m12372H() {
        this.f13625m = null;
        m12419q0((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static void m12373I(String str, LikeView.C3748g gVar, C3683o oVar) {
        C3664a P = m12380P(str);
        if (P != null) {
            m12426u0(P, gVar, oVar);
            return;
        }
        C3664a J = m12374J(str);
        if (J == null) {
            J = new C3664a(str, gVar);
            m12412m0(J);
        }
        m12402h0(str, J);
        f13608t.post(new C3670e(J));
        m12383V(oVar, J, (C3572j) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        com.facebook.internal.C3481f0.m11630h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.share.internal.C3664a m12374J(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String r5 = m12378N(r5)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            com.facebook.internal.o r1 = f13604p     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            java.io.InputStream r5 = r1.mo12018f(r5)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = com.facebook.internal.C3481f0.m11621c0(r5)     // Catch:{ IOException -> 0x001c }
            boolean r2 = com.facebook.internal.C3481f0.m11604O(r1)     // Catch:{ IOException -> 0x001c }
            if (r2 != 0) goto L_0x001e
            com.facebook.share.internal.a r0 = m12375K(r1)     // Catch:{ IOException -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            goto L_0x002b
        L_0x001e:
            if (r5 == 0) goto L_0x0035
        L_0x0020:
            com.facebook.internal.C3481f0.m11630h(r5)
            goto L_0x0035
        L_0x0024:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0037
        L_0x0029:
            r1 = move-exception
            r5 = r0
        L_0x002b:
            java.lang.String r2 = f13603o     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to deserialize controller from disk"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x0035
            goto L_0x0020
        L_0x0035:
            return r0
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            if (r5 == 0) goto L_0x003c
            com.facebook.internal.C3481f0.m11630h(r5)
        L_0x003c:
            goto L_0x003e
        L_0x003d:
            throw r0
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C3664a.m12374J(java.lang.String):com.facebook.share.internal.a");
    }

    /* renamed from: K */
    private static C3664a m12375K(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            C3664a aVar = new C3664a(jSONObject.getString("object_id"), LikeView.C3748g.m12639a(jSONObject.optInt("object_type", LikeView.C3748g.UNKNOWN.mo12602d())));
            aVar.f13616d = jSONObject.optString("like_count_string_with_like", (String) null);
            aVar.f13617e = jSONObject.optString("like_count_string_without_like", (String) null);
            aVar.f13618f = jSONObject.optString("social_sentence_with_like", (String) null);
            aVar.f13619g = jSONObject.optString("social_sentence_without_like", (String) null);
            aVar.f13615c = jSONObject.optBoolean("is_object_liked");
            aVar.f13620h = jSONObject.optString("unlike_token", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                aVar.f13625m = C3464c.m11556a(optJSONObject);
            }
            return aVar;
        } catch (JSONException e) {
            Log.e(f13603o, "Unable to deserialize controller from JSON", e);
            return null;
        }
    }

    /* renamed from: L */
    private void m12376L(C3693y yVar) {
        if (C3481f0.m11604O(this.f13621i)) {
            C3685q qVar = new C3685q(this.f13613a, this.f13614b);
            C3687s sVar = new C3687s(this.f13613a, this.f13614b);
            C3652q qVar2 = new C3652q();
            qVar.mo12422a(qVar2);
            sVar.mo12422a(qVar2);
            qVar2.mo12361c(new C3667b(qVar, sVar, yVar));
            qVar2.mo12365g();
        } else if (yVar != null) {
            yVar.mo12421a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public C3420m m12377M() {
        if (this.f13626n == null) {
            this.f13626n = new C3420m(C3642m.m12279e());
        }
        return this.f13626n;
    }

    /* renamed from: N */
    private static String m12378N(String str) {
        String r = AccessToken.m11207t() ? AccessToken.m11205h().mo11191r() : null;
        if (r != null) {
            r = C3481f0.m11612W(r);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, C3481f0.m11632i(r, ""), Integer.valueOf(f13611w)});
    }

    @Deprecated
    /* renamed from: O */
    public static void m12379O(String str, LikeView.C3748g gVar, C3683o oVar) {
        if (!f13610v) {
            m12388a0();
        }
        C3664a P = m12380P(str);
        if (P != null) {
            m12426u0(P, gVar, oVar);
        } else {
            f13607s.mo11980e(new C3682n(str, gVar, oVar));
        }
    }

    /* renamed from: P */
    private static C3664a m12380P(String str) {
        String N = m12378N(str);
        C3664a aVar = f13605q.get(N);
        if (aVar != null) {
            f13606r.mo11980e(new C3690v(N, false));
        }
        return aVar;
    }

    /* renamed from: S */
    private C3703g m12381S(Bundle bundle) {
        return new C3674i((C3453h) null, bundle);
    }

    @Deprecated
    /* renamed from: U */
    public static boolean m12382U(int i, int i2, Intent intent) {
        if (C3481f0.m11604O(f13609u)) {
            f13609u = C3642m.m12279e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", (String) null);
        }
        if (C3481f0.m11604O(f13609u)) {
            return false;
        }
        m12379O(f13609u, LikeView.C3748g.UNKNOWN, new C3669d(i, i2, intent));
        return true;
    }

    /* renamed from: V */
    private static void m12383V(C3683o oVar, C3664a aVar, C3572j jVar) {
        if (oVar != null) {
            f13608t.post(new C3672g(oVar, aVar, jVar));
        }
    }

    /* renamed from: X */
    private void m12384X(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f13613a);
        bundle2.putString("object_type", this.f13614b.toString());
        bundle2.putString("current_action", str);
        m12377M().mo11849j("fb_like_control_error", (Double) null, bundle2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m12385Y(String str, FacebookRequestError facebookRequestError) {
        JSONObject h;
        Bundle bundle = new Bundle();
        if (!(facebookRequestError == null || (h = facebookRequestError.mo11230h()) == null)) {
            bundle.putString("error", h.toString());
        }
        m12384X(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m12386Z(int i, int i2, Intent intent) {
        C3704h.m12494d(i, i2, intent, m12381S(this.f13625m));
        m12372H();
    }

    /* renamed from: a0 */
    private static synchronized void m12388a0() {
        synchronized (C3664a.class) {
            if (!f13610v) {
                f13608t = new Handler(Looper.getMainLooper());
                f13611w = C3642m.m12279e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                f13604p = new C3528o(f13603o, new C3528o.C3537g());
                m12408k0();
                C3474d.m11579c(C3474d.C3476b.Like.mo11931d(), new C3671f());
                f13610v = true;
            }
        }
    }

    /* renamed from: b0 */
    private void m12390b0(Activity activity, C3541p pVar, Bundle bundle) {
        String str;
        String str2 = null;
        if (C3699d.m12482a()) {
            str2 = "fb_like_control_did_present_dialog";
        } else if (C3699d.m12483b()) {
            str2 = "fb_like_control_did_present_fallback_dialog";
        } else {
            m12384X("present_dialog", bundle);
            C3481f0.m11609T(f13603o, "Cannot show the Like Dialog on this device.");
            m12369E((C3664a) null, "com.facebook.sdk.LikeActionController.UPDATED");
        }
        if (str2 != null) {
            LikeView.C3748g gVar = this.f13614b;
            if (gVar != null) {
                str = gVar.toString();
            } else {
                str = LikeView.C3748g.UNKNOWN.toString();
            }
            LikeContent c = new LikeContent.C3662b().mo12403d(this.f13613a).mo12404e(str).mo12402c();
            if (pVar != null) {
                new C3699d(pVar).mo12435c(c);
            } else {
                new C3699d(activity).mo12435c(c);
            }
            m12410l0(bundle);
            m12377M().mo11848i("fb_like_control_did_present_dialog", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m12392c0(Bundle bundle) {
        boolean z = this.f13615c;
        if (z != this.f13623k && !m12398f0(z, bundle)) {
            m12394d0(!this.f13615c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m12394d0(boolean z) {
        m12422s0(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m12370F(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: e0 */
    private void m12396e0(Bundle bundle) {
        this.f13624l = true;
        m12376L(new C3675j(bundle));
    }

    /* renamed from: f0 */
    private boolean m12398f0(boolean z, Bundle bundle) {
        if (m12371G()) {
            if (z) {
                m12396e0(bundle);
                return true;
            } else if (!C3481f0.m11604O(this.f13620h)) {
                m12400g0(bundle);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    private void m12400g0(Bundle bundle) {
        this.f13624l = true;
        C3652q qVar = new C3652q();
        C3692x xVar = new C3692x(this.f13620h);
        xVar.mo12422a(qVar);
        qVar.mo12361c(new C3677k(xVar, bundle));
        qVar.mo12365g();
    }

    /* renamed from: h0 */
    private static void m12402h0(String str, C3664a aVar) {
        String N = m12378N(str);
        f13606r.mo11980e(new C3690v(N, true));
        f13605q.put(N, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m12404i0() {
        if (!AccessToken.m11207t()) {
            m12406j0();
        } else {
            m12376L(new C3678l());
        }
    }

    /* renamed from: j0 */
    private void m12406j0() {
        C3700e eVar = new C3700e(C3642m.m12279e(), C3642m.m12280f(), this.f13613a);
        if (eVar.mo11912g()) {
            eVar.mo11911f(new C3665a());
        }
    }

    /* renamed from: k0 */
    private static void m12408k0() {
        f13612x = new C3673h();
    }

    /* renamed from: l0 */
    private void m12410l0(Bundle bundle) {
        m12419q0(this.f13613a);
        this.f13625m = bundle;
        m12412m0(this);
    }

    /* renamed from: m0 */
    private static void m12412m0(C3664a aVar) {
        String o0 = m12416o0(aVar);
        String N = m12378N(aVar.f13613a);
        if (!C3481f0.m11604O(o0) && !C3481f0.m11604O(N)) {
            f13607s.mo11980e(new C3666a0(N, o0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static void m12414n0(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = f13604p.mo12021i(str);
            outputStream.write(str2.getBytes());
        } catch (IOException e) {
            Log.e(f13603o, "Unable to serialize controller to disk", e);
            if (outputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                C3481f0.m11630h(outputStream);
            }
            throw th;
        }
        C3481f0.m11630h(outputStream);
    }

    /* renamed from: o0 */
    private static String m12416o0(C3664a aVar) {
        JSONObject b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", aVar.f13613a);
            jSONObject.put("object_type", aVar.f13614b.mo12602d());
            jSONObject.put("like_count_string_with_like", aVar.f13616d);
            jSONObject.put("like_count_string_without_like", aVar.f13617e);
            jSONObject.put("social_sentence_with_like", aVar.f13618f);
            jSONObject.put("social_sentence_without_like", aVar.f13619g);
            jSONObject.put("is_object_liked", aVar.f13615c);
            jSONObject.put("unlike_token", aVar.f13620h);
            Bundle bundle = aVar.f13625m;
            if (!(bundle == null || (b = C3464c.m11557b(bundle)) == null)) {
                jSONObject.put("facebook_dialog_analytics_bundle", b);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(f13603o, "Unable to serialize controller to JSON", e);
            return null;
        }
    }

    /* renamed from: q0 */
    private static void m12419q0(String str) {
        f13609u = str;
        C3642m.m12279e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", f13609u).apply();
    }

    /* renamed from: s0 */
    private void m12422s0(boolean z) {
        m12424t0(z, this.f13616d, this.f13617e, this.f13618f, this.f13619g, this.f13620h);
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m12424t0(boolean z, String str, String str2, String str3, String str4, String str5) {
        String i = C3481f0.m11632i(str, (String) null);
        String i2 = C3481f0.m11632i(str2, (String) null);
        String i3 = C3481f0.m11632i(str3, (String) null);
        String i4 = C3481f0.m11632i(str4, (String) null);
        String i5 = C3481f0.m11632i(str5, (String) null);
        if (z != this.f13615c || !C3481f0.m11618b(i, this.f13616d) || !C3481f0.m11618b(i2, this.f13617e) || !C3481f0.m11618b(i3, this.f13618f) || !C3481f0.m11618b(i4, this.f13619g) || !C3481f0.m11618b(i5, this.f13620h)) {
            this.f13615c = z;
            this.f13616d = i;
            this.f13617e = i2;
            this.f13618f = i3;
            this.f13619g = i4;
            this.f13620h = i5;
            m12412m0(this);
            m12369E(this, "com.facebook.sdk.LikeActionController.UPDATED");
        }
    }

    /* renamed from: u0 */
    private static void m12426u0(C3664a aVar, LikeView.C3748g gVar, C3683o oVar) {
        LikeView.C3748g c = C3704h.m12493c(gVar, aVar.f13614b);
        C3572j jVar = null;
        if (c == null) {
            Object[] objArr = {aVar.f13613a, aVar.f13614b.toString(), gVar.toString()};
            aVar = null;
            jVar = new C3572j("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", objArr);
        } else {
            aVar.f13614b = c;
        }
        m12383V(oVar, aVar, jVar);
    }

    @Deprecated
    /* renamed from: Q */
    public String mo12411Q() {
        return this.f13615c ? this.f13616d : this.f13617e;
    }

    @Deprecated
    /* renamed from: R */
    public String mo12412R() {
        return this.f13613a;
    }

    @Deprecated
    /* renamed from: T */
    public String mo12413T() {
        return this.f13615c ? this.f13618f : this.f13619g;
    }

    @Deprecated
    /* renamed from: W */
    public boolean mo12414W() {
        return this.f13615c;
    }

    @Deprecated
    /* renamed from: p0 */
    public boolean mo12415p0() {
        return false;
    }

    @Deprecated
    /* renamed from: r0 */
    public void mo12416r0(Activity activity, C3541p pVar, Bundle bundle) {
        boolean z = !this.f13615c;
        if (m12371G()) {
            m12422s0(z);
            if (this.f13624l) {
                m12377M().mo11848i("fb_like_control_did_undo_quickly", bundle);
            } else if (!m12398f0(z, bundle)) {
                m12422s0(!z);
                m12390b0(activity, pVar, bundle);
            }
        } else {
            m12390b0(activity, pVar, bundle);
        }
    }
}
