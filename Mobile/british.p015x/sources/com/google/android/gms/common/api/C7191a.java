package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a.C7195d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.api.internal.C7276m;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7395i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7191a<O extends C7195d> {

    /* renamed from: a */
    private final C7192a<?, O> f28894a;

    /* renamed from: b */
    private final C7202g<?> f28895b;

    /* renamed from: c */
    private final String f28896c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C7192a<T extends C7201f, O> extends C7200e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, C4601e eVar, O o, C7206f.C7208b bVar, C7206f.C7209c cVar) {
            return buildClient(context, looper, eVar, o, (C7240f) bVar, (C7276m) cVar);
        }

        public T buildClient(Context context, Looper looper, C4601e eVar, O o, C7240f fVar, C7276m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7193b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7194c<C extends C7193b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7195d {

        /* renamed from: b0 */
        public static final C7199d f28897b0 = new C7199d((C7347q) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C7196a extends C7198c, C7195d {
            /* renamed from: d0 */
            Account mo29746d0();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C7197b extends C7198c {
            /* renamed from: W */
            GoogleSignInAccount mo29747W();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C7198c extends C7195d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class C7199d implements C7195d {
            private C7199d() {
            }

            /* synthetic */ C7199d(C7347q qVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C7200e<T extends C7193b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7201f extends C7193b {
        void connect(C7377d.C7380c cVar);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(C7395i iVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(C7377d.C7382e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C7202g<C extends C7201f> extends C7194c<C> {
    }

    public <C extends C7201f> C7191a(String str, C7192a<C, O> aVar, C7202g<C> gVar) {
        C4604n.m20099l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C4604n.m20099l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f28896c = str;
        this.f28894a = aVar;
        this.f28895b = gVar;
    }

    /* renamed from: a */
    public final C7192a<?, O> mo29741a() {
        return this.f28894a;
    }

    /* renamed from: b */
    public final C7194c<?> mo29742b() {
        return this.f28895b;
    }

    /* renamed from: c */
    public final C7200e<?, O> mo29743c() {
        return this.f28894a;
    }

    /* renamed from: d */
    public final String mo29744d() {
        return this.f28896c;
    }
}
