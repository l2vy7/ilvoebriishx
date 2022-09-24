package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.C5069e;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.startapp.x7 */
/* compiled from: Sta */
public class C12430x7 implements CookieStore {

    /* renamed from: a */
    public final CookieStore f55130a = new CookieManager().getCookieStore();

    /* renamed from: b */
    public final SharedPreferences f55131b;

    public C12430x7(Context context) {
        HttpCookie httpCookie;
        C5069e eVar = new C5069e(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f55131b = eVar;
        String string = eVar.getString("names", (String) null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                SharedPreferences sharedPreferences = this.f55131b;
                String string2 = sharedPreferences.getString("cookie_" + str, (String) null);
                if (!(string2 == null || (httpCookie = (HttpCookie) C11883e5.m52269a(string2, HttpCookie.class)) == null)) {
                    if (httpCookie.hasExpired()) {
                        mo46822b(httpCookie);
                        mo46820a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f55130a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46820a() {
        SharedPreferences.Editor edit = this.f55131b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie a : this.f55130a.getCookies()) {
            hashSet.add(mo46819a(a));
        }
        edit.putString("names", TextUtils.join(";", hashSet));
        edit.apply();
    }

    public void add(URI uri, HttpCookie httpCookie) {
        String a = mo46819a(httpCookie);
        this.f55130a.add(uri, httpCookie);
        SharedPreferences.Editor edit = this.f55131b.edit();
        edit.putString("cookie_" + a, String.valueOf(C11883e5.m52270b(httpCookie)));
        edit.apply();
        mo46820a();
    }

    /* renamed from: b */
    public final void mo46822b(HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f55131b.edit();
        StringBuilder a = C12458z0.m53804a("cookie_");
        a.append(mo46819a(httpCookie));
        edit.remove(a.toString());
        edit.apply();
    }

    public List<HttpCookie> get(URI uri) {
        return this.f55130a.get(uri);
    }

    public List<HttpCookie> getCookies() {
        return this.f55130a.getCookies();
    }

    public List<URI> getURIs() {
        return this.f55130a.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f55130a.remove(uri, httpCookie)) {
            return false;
        }
        mo46822b(httpCookie);
        mo46820a();
        return true;
    }

    public boolean removeAll() {
        if (!this.f55130a.removeAll()) {
            return false;
        }
        SharedPreferences.Editor edit = this.f55131b.edit();
        edit.clear();
        edit.apply();
        mo46820a();
        return true;
    }

    /* renamed from: a */
    public final String mo46819a(HttpCookie httpCookie) {
        return httpCookie.getDomain() + "_" + httpCookie.getName();
    }
}
