package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.cast.yd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8829yd {
    /* renamed from: a */
    static String m41443a(C8782vd vdVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m41445c(vdVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m41444b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m41444b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m41444b(sb, i, str, b2);
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
                sb.append(C8753te.m41320a(C8796wb.m41383r((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C8796wb) {
                sb.append(": \"");
                sb.append(C8753te.m41320a((C8796wb) obj));
                sb.append('\"');
            } else if (obj instanceof C8705qc) {
                sb.append(" {");
                m41445c((C8705qc) obj, sb, i + 2);
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
                m41444b(sb, i4, "key", entry.getKey());
                m41444b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static void m41445c(C8782vd vdVar, StringBuilder sb, int i) {
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
        for (Method method : vdVar.getClass().getDeclaredMethods()) {
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
                    m41444b(sb, i, m41446d(str7), C8705qc.m41248i(method2, vdVar, new Object[0]));
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
                    m41444b(sb, i, m41446d(str6), C8705qc.m41248i(method3, vdVar, new Object[0]));
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
                    Object i2 = C8705qc.m41248i(method4, vdVar, new Object[0]);
                    if (method5 == null) {
                        if (i2 instanceof Boolean) {
                            if (!((Boolean) i2).booleanValue()) {
                            }
                        } else if (i2 instanceof Integer) {
                            if (((Integer) i2).intValue() == 0) {
                            }
                        } else if (i2 instanceof Float) {
                            if (((Float) i2).floatValue() == 0.0f) {
                            }
                        } else if (!(i2 instanceof Double)) {
                            if (i2 instanceof String) {
                                z = i2.equals("");
                            } else if (i2 instanceof C8796wb) {
                                z = i2.equals(C8796wb.f44177c);
                            } else if (i2 instanceof C8782vd) {
                                if (i2 == ((C8782vd) i2).zzs()) {
                                }
                            } else if ((i2 instanceof Enum) && ((Enum) i2).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) i2).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C8705qc.m41248i(method5, vdVar, new Object[0])).booleanValue()) {
                    }
                    m41444b(sb, i, m41446d(str2), i2);
                }
            }
        }
        if (!(vdVar instanceof C8689pc)) {
            C8799we weVar = ((C8705qc) vdVar).zzc;
            if (weVar != null) {
                weVar.mo36765e(sb, i);
                return;
            }
            return;
        }
        C8689pc pcVar = (C8689pc) vdVar;
        throw null;
    }

    /* renamed from: d */
    private static final String m41446d(String str) {
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
}
