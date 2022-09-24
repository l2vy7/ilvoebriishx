package com.startapp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* renamed from: com.startapp.f5 */
/* compiled from: Sta */
public class C11901f5 {
    /* renamed from: a */
    public static String m52311a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(C5010hb.class)) {
                C5010hb hbVar = (C5010hb) annotation;
                if (!"".equals(hbVar.name())) {
                    return hbVar.name();
                }
            }
        }
        return field.getName();
    }

    /* renamed from: b */
    public static boolean m52312b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (!annotation.annotationType().equals(C5010hb.class)) {
            return false;
        }
        return ((C5010hb) annotation).complex();
    }
}
