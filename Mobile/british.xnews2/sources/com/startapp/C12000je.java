package com.startapp;

import android.text.TextUtils;

/* renamed from: com.startapp.je */
/* compiled from: Sta */
public class C12000je {
    /* renamed from: a */
    public static void m52518a(C11972id idVar) {
        if (!idVar.f53129f) {
            throw new IllegalStateException("AdSession is not started");
        } else if (idVar.f53130g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m52519a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m52520a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m52521b(C11972id idVar) {
        if (idVar.f53130g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m52522c(C11972id idVar) {
        if (!idVar.mo45461d()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
