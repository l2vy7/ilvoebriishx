package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9439y9 {
    /* renamed from: a */
    static String m43877a(C9409w9 w9Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m43880d(w9Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m43878b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m43878b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m43878b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C9364ta.m43664a(C9329r7.m43545u((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C9329r7) {
                sb.append(": \"");
                sb.append(C9364ta.m43664a((C9329r7) obj));
                sb.append('\"');
            } else if (obj instanceof C9330r8) {
                sb.append(" {");
                m43880d((C9330r8) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m43878b(sb, i4, "key", entry.getKey());
                m43878b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m43879c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m43880d(C9409w9 w9Var, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : w9Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str8 : treeSet) {
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m43878b(sb, i, m43879c(str7), C9330r8.m43556m(method2, w9Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m43878b(sb, i, m43879c(str6), C9330r8.m43556m(method3, w9Var, new Object[0]));
                }
            }
            if (substring.length() != 0) {
                str = "set".concat(substring);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (substring.length() != 0) {
                    str3 = "get".concat(substring);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (substring.length() != 0) {
                    str4 = "has".concat(substring);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object m = C9330r8.m43556m(method4, w9Var, new Object[0]);
                    if (method5 == null) {
                        if (m instanceof Boolean) {
                            if (!((Boolean) m).booleanValue()) {
                            }
                        } else if (m instanceof Integer) {
                            if (((Integer) m).intValue() == 0) {
                            }
                        } else if (m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m).floatValue()) == 0) {
                            }
                        } else if (!(m instanceof Double)) {
                            if (m instanceof String) {
                                z = m.equals("");
                            } else if (m instanceof C9329r7) {
                                z = m.equals(C9329r7.f45419c);
                            } else if (m instanceof C9409w9) {
                                if (m == ((C9409w9) m).mo37835g()) {
                                }
                            } else if ((m instanceof Enum) && ((Enum) m).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C9330r8.m43556m(method5, w9Var, new Object[0])).booleanValue()) {
                    }
                    m43878b(sb, i, m43879c(str2), m);
                }
            }
        }
        if (!(w9Var instanceof C9299p8)) {
            C9425xa xaVar = ((C9330r8) w9Var).zzc;
            if (xaVar != null) {
                xaVar.mo38171g(sb, i);
                return;
            }
            return;
        }
        C9299p8 p8Var = (C9299p8) w9Var;
        throw null;
    }
}
