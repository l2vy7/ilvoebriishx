package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.appevents.p */
/* compiled from: UserDataStore */
public class C3425p {

    /* renamed from: a */
    private static final String f12888a = "p";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static SharedPreferences f12889b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f12890c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentHashMap<String, String> f12891d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f12892e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.appevents.p$a */
    /* compiled from: UserDataStore */
    static class C3426a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f12893b;

        /* renamed from: c */
        final /* synthetic */ String f12894c;

        C3426a(String str, String str2) {
            this.f12893b = str;
            this.f12894c = str2;
        }

        public void run() {
            if (!C3425p.f12890c.get()) {
                C3425p.m11458f();
            }
            C3425p.f12889b.edit().putString(this.f12893b, this.f12894c).apply();
        }
    }

    /* renamed from: d */
    public static String m11456d() {
        if (!f12890c.get()) {
            m11458f();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(f12891d);
        hashMap.putAll(f12892e);
        return C3481f0.m11611V(hashMap);
    }

    /* renamed from: e */
    public static Map<String, String> m11457e() {
        if (!f12890c.get()) {
            m11458f();
        }
        return new HashMap(f12892e);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static synchronized void m11458f() {
        synchronized (C3425p.class) {
            if (!f12890c.get()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e());
                f12889b = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                String string2 = f12889b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                f12891d.putAll(C3481f0.m11616a(string));
                f12892e.putAll(C3481f0.m11616a(string2));
                f12890c.set(true);
            }
        }
    }

    /* renamed from: g */
    static void m11459g() {
        if (!f12890c.get()) {
            m11458f();
        }
    }

    /* renamed from: h */
    private static String m11460h(String str, String str2) {
        String str3;
        String lowerCase = str2.trim().toLowerCase();
        if ("em".equals(str)) {
            if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                return lowerCase;
            }
            Log.e(f12888a, "Setting email failure: this is not a valid email address");
            return "";
        } else if ("ph".equals(str)) {
            return lowerCase.replaceAll("[^0-9]", "");
        } else {
            if (!"ge".equals(str)) {
                return lowerCase;
            }
            if (lowerCase.length() > 0) {
                str3 = lowerCase.substring(0, 1);
            } else {
                str3 = "";
            }
            if ("f".equals(str3) || "m".equals(str3)) {
                return str3;
            }
            Log.e(f12888a, "Setting gender failure: the supported value for gender is f or m");
            return "";
        }
    }

    /* renamed from: i */
    public static void m11461i(List<String> list) {
        if (!f12890c.get()) {
            m11458f();
        }
        for (String next : list) {
            ConcurrentHashMap<String, String> concurrentHashMap = f12892e;
            if (concurrentHashMap.containsKey(next)) {
                concurrentHashMap.remove(next);
            }
        }
        m11463k("com.facebook.appevents.UserDataStore.internalUserData", C3481f0.m11611V(f12892e));
    }

    /* renamed from: j */
    static void m11462j(Map<String, String> map) {
        if (!f12890c.get()) {
            m11458f();
        }
        for (Map.Entry<String, String> key : map.entrySet()) {
            String str = (String) key.getKey();
            String p0 = C3481f0.m11647p0(m11460h(str, map.get(str).trim()));
            ConcurrentHashMap<String, String> concurrentHashMap = f12892e;
            if (concurrentHashMap.containsKey(str)) {
                String str2 = concurrentHashMap.get(str);
                String[] split = str2 != null ? str2.split(",") : new String[0];
                HashSet hashSet = new HashSet(Arrays.asList(split));
                if (!hashSet.contains(p0)) {
                    StringBuilder sb = new StringBuilder();
                    if (split.length == 0) {
                        sb.append(p0);
                    } else if (split.length < 5) {
                        sb.append(str2);
                        sb.append(",");
                        sb.append(p0);
                    } else {
                        for (int i = 1; i < 5; i++) {
                            sb.append(split[i]);
                            sb.append(",");
                        }
                        sb.append(p0);
                        hashSet.remove(split[0]);
                    }
                    f12892e.put(str, sb.toString());
                } else {
                    return;
                }
            } else {
                concurrentHashMap.put(str, p0);
            }
        }
        m11463k("com.facebook.appevents.UserDataStore.internalUserData", C3481f0.m11611V(f12892e));
    }

    /* renamed from: k */
    private static void m11463k(String str, String str2) {
        C3642m.m12288n().execute(new C3426a(str, str2));
    }
}
