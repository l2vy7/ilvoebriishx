package com.startapp;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.e5 */
/* compiled from: Sta */
public class C11883e5 {
    /* renamed from: a */
    public static <T> T m52269a(String str, Class<T> cls) {
        try {
            return C11821c5.m52101a(cls, new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m52270b(Object obj) {
        if (obj == null) {
            return null;
        }
        Class cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && !Object.class.equals(cls)) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        String a = C11901f5.m52311a(field);
                        if (C11901f5.m52312b(field)) {
                            jSONObject.put(a, m52270b(field.get(obj)));
                        } else {
                            if (List.class.isAssignableFrom(field.getType())) {
                                JSONArray jSONArray = new JSONArray();
                                for (Object a2 : (List) field.get(obj)) {
                                    jSONArray.put(m52268a(a2));
                                }
                                jSONObject.put(a, jSONArray);
                            } else {
                                if (Set.class.isAssignableFrom(field.getType())) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (Object a3 : (Set) field.get(obj)) {
                                        jSONArray2.put(m52268a(a3));
                                    }
                                    jSONObject.put(a, jSONArray2);
                                } else {
                                    if (Map.class.isAssignableFrom(field.getType())) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        for (Map.Entry entry : ((Map) field.get(obj)).entrySet()) {
                                            jSONObject2.put(entry.getKey().toString(), m52268a(entry.getValue()));
                                        }
                                        jSONObject.put(a, jSONObject2);
                                    } else {
                                        jSONObject.put(a, field.get(obj));
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Object m52268a(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class) || cls.equals(String.class)) {
            return obj;
        }
        return m52270b(obj);
    }
}
