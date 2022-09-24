package com.startapp;

import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.results.BaseResult;

/* renamed from: com.startapp.l5 */
/* compiled from: Sta */
public class C12028l5 {
    /* renamed from: a */
    public static String m52559a(Object obj) {
        return m52560a(obj, obj.getClass());
    }

    /* renamed from: a */
    public static String m52560a(Object obj, Class<?> cls) {
        return String.valueOf(C11883e5.m52270b(obj));
    }

    /* renamed from: a */
    public static String m52558a(FileTypes fileTypes, BaseResult baseResult) {
        return m52559a(baseResult);
    }

    /* renamed from: a */
    public static <T> T m52556a(String str, Class<T> cls) {
        return m52557a(str, cls, false);
    }

    /* renamed from: a */
    public static <T> T m52557a(String str, Class<T> cls, boolean z) {
        return C11883e5.m52269a(str, cls);
    }
}
