package com.appnext.core;

import android.text.TextUtils;
import com.appnext.base.C3117a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.k */
public final class C3207k {

    /* renamed from: dU */
    private static int f12371dU = 2;

    /* renamed from: a */
    public static Object m10814a(Class<?> cls, JSONObject jSONObject) {
        Field[] fieldArr;
        try {
            Object newInstance = cls.newInstance();
            if (f12371dU == 0) {
                fieldArr = cls.getFields();
            } else {
                fieldArr = cls.getDeclaredFields();
            }
            for (Field field : fieldArr) {
                if (f12371dU == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(true);
                }
                try {
                    if (jSONObject.has(field.getName())) {
                        String simpleName = field.getType().getSimpleName();
                        if (TextUtils.isEmpty(simpleName)) {
                        } else if (simpleName.equalsIgnoreCase("boolean")) {
                            field.setBoolean(newInstance, jSONObject.getBoolean(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("int")) {
                            field.setInt(newInstance, jSONObject.getInt(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("double")) {
                            field.setDouble(newInstance, jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("float")) {
                            field.setFloat(newInstance, (float) jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("string")) {
                            field.set(newInstance, jSONObject.getString(field.getName()));
                        } else if (field.getType().isArray()) {
                            field.set(newInstance, Array.newInstance(field.getType().getComponentType(), jSONObject.getJSONArray(field.getName()).length()));
                            m10815a(field.get(newInstance), jSONObject.getJSONArray(field.getName()));
                        } else {
                            field.set(newInstance, m10814a(field.getType(), jSONObject.getJSONObject(field.getName())));
                        }
                    }
                } catch (IllegalArgumentException e) {
                    C3117a.m10553a("JSONParser$populateObjectFromJSON", e);
                } catch (IllegalAccessException e2) {
                    C3117a.m10553a("JSONParser$populateObjectFromJSON", e2);
                } catch (Throwable th) {
                    C3117a.m10553a("JSONParser$populateObjectFromJSON", th);
                }
                if (f12371dU == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(false);
                }
            }
            return newInstance;
        } catch (InstantiationException e3) {
            C3117a.m10553a("JSONParser$populateObjectFromJSON", e3);
            return null;
        } catch (IllegalAccessException e4) {
            C3117a.m10553a("JSONParser$populateObjectFromJSON", e4);
            return null;
        }
    }

    /* renamed from: a */
    public static void m10815a(Object obj, JSONArray jSONArray) throws IllegalArgumentException, NegativeArraySizeException, IllegalAccessException, JSONException {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getComponentType().getSimpleName();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (cls.getComponentType().isArray()) {
                Array.set(obj, i, Array.newInstance(cls.getComponentType().getComponentType(), jSONArray.getJSONArray(i).length()));
                m10815a(Array.get(obj, i), jSONArray.getJSONArray(i));
            } else if (cls.getComponentType().isPrimitive() || simpleName.equalsIgnoreCase("string")) {
                Array.set(obj, i, jSONArray.get(i));
            } else {
                Array.set(obj, i, m10814a(cls.getComponentType(), jSONArray.getJSONObject(i)));
            }
        }
    }
}
