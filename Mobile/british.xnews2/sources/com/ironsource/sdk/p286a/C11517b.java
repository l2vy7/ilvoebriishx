package com.ironsource.sdk.p286a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.ironsource.p053a.C4926c;
import com.ironsource.p055c.C4946a;
import com.ironsource.sdk.utils.C11755a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.b */
public final class C11517b implements C4926c {

    /* renamed from: a */
    private static Map<String, Object> f51794a = new HashMap();

    /* renamed from: com.ironsource.sdk.a.b$a */
    public static class C11518a {

        /* renamed from: a */
        public String f51795a;

        /* renamed from: b */
        public String f51796b;

        /* renamed from: c */
        public Context f51797c;

        /* renamed from: d */
        public String f51798d;
    }

    private C11517b(C11518a aVar) {
        Context context = aVar.f51797c;
        C11755a a = C11755a.m51959a(context);
        f51794a.put("deviceos", SDKUtils.encodeString(a.f52496c));
        f51794a.put("deviceosversion", SDKUtils.encodeString(a.f52497d));
        f51794a.put("deviceapilevel", Integer.valueOf(a.f52498e));
        f51794a.put("deviceoem", SDKUtils.encodeString(a.f52494a));
        f51794a.put("devicemodel", SDKUtils.encodeString(a.f52495b));
        f51794a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f51794a.put("applicationkey", SDKUtils.encodeString(aVar.f51796b));
        f51794a.put("sessionid", SDKUtils.encodeString(aVar.f51795a));
        f51794a.put("sdkversion", SDKUtils.encodeString(C11755a.m51960a()));
        f51794a.put("applicationuserid", SDKUtils.encodeString(aVar.f51798d));
        f51794a.put("env", BuildConfig.FLAVOR);
        f51794a.put(TtmlNode.ATTR_TTS_ORIGIN, "n");
        f51794a.put("connectiontype", C4946a.m22688a(aVar.f51797c));
    }

    public /* synthetic */ C11517b(C11518a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m51354a(String str) {
        f51794a.put("connectiontype", SDKUtils.encodeString(str));
    }

    /* renamed from: a */
    public final Map<String, Object> mo20426a() {
        return f51794a;
    }
}
