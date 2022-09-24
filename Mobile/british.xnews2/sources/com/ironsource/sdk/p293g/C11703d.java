package com.ironsource.sdk.p293g;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.sdk.g.d */
public class C11703d {

    /* renamed from: a */
    private boolean f52393a = false;

    /* renamed from: b */
    private HashSet<String> f52394b = new HashSet<>();

    /* renamed from: c */
    private String f52395c;

    /* renamed from: d */
    private String f52396d;

    /* renamed from: e */
    private boolean f52397e = false;

    /* renamed from: f */
    private int f52398f;

    /* renamed from: g */
    private boolean f52399g = true;

    /* renamed from: com.ironsource.sdk.g.d$a */
    public enum C11704a {
        ;
        

        /* renamed from: a */
        public static final int f52400a = 1;

        /* renamed from: b */
        public static final int f52401b = 2;

        /* renamed from: c */
        public static final int f52402c = 3;

        static {
            f52403d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m51825a() {
            return (int[]) f52403d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$b */
    public enum C11705b {
        None,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.sdk.g.d$c */
    public enum C11706c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d */
    public enum C11707d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d */
        public int f52417d;

        private C11707d(int i) {
            this.f52417d = i;
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$e */
    public enum C11708e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    /* renamed from: a */
    public HashSet<String> mo45001a() {
        return this.f52394b;
    }

    /* renamed from: a */
    public void mo45002a(int i) {
        this.f52398f = i;
    }

    /* renamed from: a */
    public void mo45003a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f52394b.add(str);
        }
    }

    /* renamed from: a */
    public void mo45004a(boolean z) {
        this.f52393a = z;
    }

    /* renamed from: b */
    public void mo45005b(String str) {
        this.f52395c = str;
    }

    /* renamed from: b */
    public void mo45006b(boolean z) {
        this.f52397e = z;
    }

    /* renamed from: b */
    public boolean mo45007b() {
        return this.f52393a;
    }

    /* renamed from: c */
    public String mo45008c() {
        return this.f52395c;
    }

    /* renamed from: c */
    public void mo45009c(String str) {
        this.f52396d = str;
    }

    /* renamed from: c */
    public void mo45010c(boolean z) {
        this.f52399g = z;
    }

    /* renamed from: d */
    public String mo45011d() {
        return this.f52396d;
    }

    /* renamed from: e */
    public boolean mo45012e() {
        return this.f52397e;
    }

    /* renamed from: f */
    public int mo45013f() {
        return this.f52398f;
    }

    /* renamed from: g */
    public boolean mo45014g() {
        return this.f52399g;
    }
}
