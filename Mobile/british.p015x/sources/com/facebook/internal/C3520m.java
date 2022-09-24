package com.facebook.internal;

import android.net.Uri;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
/* compiled from: FetchedAppSettings */
public final class C3520m {

    /* renamed from: a */
    private boolean f13164a;

    /* renamed from: b */
    private String f13165b;

    /* renamed from: c */
    private boolean f13166c;

    /* renamed from: d */
    private int f13167d;

    /* renamed from: e */
    private EnumSet<C3477d0> f13168e;

    /* renamed from: f */
    private Map<String, Map<String, C3521a>> f13169f;

    /* renamed from: g */
    private boolean f13170g;

    /* renamed from: h */
    private C3490h f13171h;

    /* renamed from: i */
    private String f13172i;

    /* renamed from: j */
    private String f13173j;

    /* renamed from: k */
    private boolean f13174k;

    /* renamed from: l */
    private boolean f13175l;

    /* renamed from: m */
    private String f13176m;

    /* renamed from: n */
    private JSONArray f13177n;

    /* renamed from: o */
    private boolean f13178o;

    /* renamed from: p */
    private String f13179p;

    /* renamed from: q */
    private String f13180q;

    /* renamed from: r */
    private String f13181r;

    /* renamed from: com.facebook.internal.m$a */
    /* compiled from: FetchedAppSettings */
    public static class C3521a {

        /* renamed from: a */
        private String f13182a;

        /* renamed from: b */
        private String f13183b;

        /* renamed from: c */
        private Uri f13184c;

        /* renamed from: d */
        private int[] f13185d;

        private C3521a(String str, String str2, Uri uri, int[] iArr) {
            this.f13182a = str;
            this.f13183b = str2;
            this.f13184c = uri;
            this.f13185d = iArr;
        }

        /* renamed from: c */
        public static C3521a m11791c(JSONObject jSONObject) {
            String optString = jSONObject.optString(MediationMetaData.KEY_NAME);
            Uri uri = null;
            if (C3481f0.m11604O(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C3481f0.m11604O(str) || C3481f0.m11604O(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C3481f0.m11604O(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C3521a(str, str2, uri, m11792d(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: d */
        private static int[] m11792d(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C3481f0.m11604O(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C3481f0.m11608S("FacebookSDK", e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo12010a() {
            return this.f13182a;
        }

        /* renamed from: b */
        public String mo12011b() {
            return this.f13183b;
        }
    }

    public C3520m(boolean z, String str, boolean z2, int i, EnumSet<C3477d0> enumSet, Map<String, Map<String, C3521a>> map, boolean z3, C3490h hVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, String str5, String str6, String str7) {
        this.f13164a = z;
        this.f13165b = str;
        this.f13166c = z2;
        this.f13169f = map;
        this.f13171h = hVar;
        this.f13167d = i;
        this.f13170g = z3;
        this.f13168e = enumSet;
        this.f13172i = str2;
        this.f13173j = str3;
        this.f13174k = z4;
        this.f13175l = z5;
        this.f13177n = jSONArray;
        this.f13176m = str4;
        this.f13178o = z6;
        this.f13179p = str5;
        this.f13180q = str6;
        this.f13181r = str7;
    }

    /* renamed from: a */
    public boolean mo11996a() {
        return this.f13170g;
    }

    /* renamed from: b */
    public boolean mo11997b() {
        return this.f13175l;
    }

    /* renamed from: c */
    public C3490h mo11998c() {
        return this.f13171h;
    }

    /* renamed from: d */
    public JSONArray mo11999d() {
        return this.f13177n;
    }

    /* renamed from: e */
    public boolean mo12000e() {
        return this.f13174k;
    }

    /* renamed from: f */
    public String mo12001f() {
        return this.f13165b;
    }

    /* renamed from: g */
    public boolean mo12002g() {
        return this.f13166c;
    }

    /* renamed from: h */
    public String mo12003h() {
        return this.f13179p;
    }

    /* renamed from: i */
    public String mo12004i() {
        return this.f13181r;
    }

    /* renamed from: j */
    public String mo12005j() {
        return this.f13176m;
    }

    /* renamed from: k */
    public int mo12006k() {
        return this.f13167d;
    }

    /* renamed from: l */
    public EnumSet<C3477d0> mo12007l() {
        return this.f13168e;
    }

    /* renamed from: m */
    public String mo12008m() {
        return this.f13180q;
    }

    /* renamed from: n */
    public boolean mo12009n() {
        return this.f13164a;
    }
}
