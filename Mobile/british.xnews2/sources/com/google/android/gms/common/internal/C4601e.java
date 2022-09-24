package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p149t.C6079b;
import p263x5.C11095a;

/* renamed from: com.google.android.gms.common.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4601e {
    @Nullable

    /* renamed from: a */
    private final Account f20031a;

    /* renamed from: b */
    private final Set<Scope> f20032b;

    /* renamed from: c */
    private final Set<Scope> f20033c;

    /* renamed from: d */
    private final Map<C7191a<?>, C7439x> f20034d;

    /* renamed from: e */
    private final int f20035e;
    @Nullable

    /* renamed from: f */
    private final View f20036f;

    /* renamed from: g */
    private final String f20037g;

    /* renamed from: h */
    private final String f20038h;

    /* renamed from: i */
    private final C11095a f20039i;

    /* renamed from: j */
    private Integer f20040j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4602a {
        @Nullable

        /* renamed from: a */
        private Account f20041a;

        /* renamed from: b */
        private C6079b<Scope> f20042b;

        /* renamed from: c */
        private String f20043c;

        /* renamed from: d */
        private String f20044d;

        /* renamed from: e */
        private C11095a f20045e = C11095a.f50055k;

        /* renamed from: a */
        public C4601e mo17989a() {
            return new C4601e(this.f20041a, this.f20042b, (Map<C7191a<?>, C7439x>) null, 0, (View) null, this.f20043c, this.f20044d, this.f20045e, false);
        }

        /* renamed from: b */
        public C4602a mo17990b(String str) {
            this.f20043c = str;
            return this;
        }

        /* renamed from: c */
        public final C4602a mo17991c(Collection<Scope> collection) {
            if (this.f20042b == null) {
                this.f20042b = new C6079b<>();
            }
            this.f20042b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C4602a mo17992d(@Nullable Account account) {
            this.f20041a = account;
            return this;
        }

        /* renamed from: e */
        public final C4602a mo17993e(String str) {
            this.f20044d = str;
            return this;
        }
    }

    public C4601e(@Nullable Account account, Set<Scope> set, Map<C7191a<?>, C7439x> map, int i, @Nullable View view, String str, String str2, @Nullable C11095a aVar, boolean z) {
        this.f20031a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f20032b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f20034d = map;
        this.f20036f = view;
        this.f20035e = i;
        this.f20037g = str;
        this.f20038h = str2;
        this.f20039i = aVar == null ? C11095a.f50055k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C7439x xVar : map.values()) {
            hashSet.addAll(xVar.f29368a);
        }
        this.f20033c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account mo17977a() {
        return this.f20031a;
    }

    @Deprecated
    /* renamed from: b */
    public String mo17978b() {
        Account account = this.f20031a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account mo17979c() {
        Account account = this.f20031a;
        return account != null ? account : new Account(C7377d.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: d */
    public Set<Scope> mo17980d() {
        return this.f20033c;
    }

    /* renamed from: e */
    public Set<Scope> mo17981e(C7191a<?> aVar) {
        C7439x xVar = this.f20034d.get(aVar);
        if (xVar == null || xVar.f29368a.isEmpty()) {
            return this.f20032b;
        }
        HashSet hashSet = new HashSet(this.f20032b);
        hashSet.addAll(xVar.f29368a);
        return hashSet;
    }

    /* renamed from: f */
    public String mo17982f() {
        return this.f20037g;
    }

    /* renamed from: g */
    public Set<Scope> mo17983g() {
        return this.f20032b;
    }

    /* renamed from: h */
    public final C11095a mo17984h() {
        return this.f20039i;
    }

    /* renamed from: i */
    public final Integer mo17985i() {
        return this.f20040j;
    }

    /* renamed from: j */
    public final String mo17986j() {
        return this.f20038h;
    }

    /* renamed from: k */
    public final Map<C7191a<?>, C7439x> mo17987k() {
        return this.f20034d;
    }

    /* renamed from: l */
    public final void mo17988l(Integer num) {
        this.f20040j = num;
    }
}
