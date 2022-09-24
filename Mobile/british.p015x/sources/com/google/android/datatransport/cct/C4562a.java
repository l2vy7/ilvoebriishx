package com.google.android.datatransport.cct;

import com.google.android.exoplayer2.C6540C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p143r3.C5996b;
import p154t3.C6139f;

/* renamed from: com.google.android.datatransport.cct.a */
/* compiled from: CCTDestination */
public final class C4562a implements C6139f {

    /* renamed from: c */
    static final String f19816c;

    /* renamed from: d */
    static final String f19817d;

    /* renamed from: e */
    private static final String f19818e;

    /* renamed from: f */
    private static final Set<C5996b> f19819f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C5996b[]{C5996b.m26427b("proto"), C5996b.m26427b("json")})));

    /* renamed from: g */
    public static final C4562a f19820g;

    /* renamed from: h */
    public static final C4562a f19821h;

    /* renamed from: a */
    private final String f19822a;

    /* renamed from: b */
    private final String f19823b;

    static {
        String a = C4568e.m19696a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f19816c = a;
        String a2 = C4568e.m19696a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f19817d = a2;
        String a3 = C4568e.m19696a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f19818e = a3;
        f19820g = new C4562a(a, (String) null);
        f19821h = new C4562a(a2, a3);
    }

    public C4562a(String str, String str2) {
        this.f19822a = str;
        this.f19823b = str2;
    }

    /* renamed from: c */
    public static C4562a m19673c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C6540C.UTF8_NAME));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C4562a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: Z */
    public byte[] mo16990Z() {
        return mo16992b();
    }

    /* renamed from: a */
    public Set<C5996b> mo16991a() {
        return f19819f;
    }

    /* renamed from: b */
    public byte[] mo16992b() {
        String str = this.f19823b;
        if (str == null && this.f19822a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f19822a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(C6540C.UTF8_NAME));
    }

    /* renamed from: d */
    public String mo16993d() {
        return this.f19823b;
    }

    /* renamed from: e */
    public String mo16994e() {
        return this.f19822a;
    }

    public String getName() {
        return "cct";
    }
}
