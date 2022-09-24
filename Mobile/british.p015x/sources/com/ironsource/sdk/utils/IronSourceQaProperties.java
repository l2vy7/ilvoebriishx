package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f52480a;

    /* renamed from: b */
    private static Map<String, String> f52481b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f52480a == null) {
            f52480a = new IronSourceQaProperties();
        }
        return f52480a;
    }

    public static boolean isInitialized() {
        return f52480a != null;
    }

    public Map<String, String> getParameters() {
        return f52481b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f52481b.put(str, str2);
        }
    }
}
