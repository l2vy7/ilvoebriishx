package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blr */
/* compiled from: IMASDK */
final class blr {
    blr() {
    }

    /* renamed from: a */
    public static final Object m16496a(Object obj) {
        return ((bkl) obj).mo15393av(4);
    }

    /* renamed from: b */
    static String m16497b(bln bln, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m16499d(bln, sb, 0);
        return sb.toString();
    }

    /* renamed from: c */
    static void m16498c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m16498c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m16498c(sb, i, str, c2);
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
                sb.append(bmm.m16664t(bjq.m16053p((String) obj)));
                sb.append('\"');
            } else if (obj instanceof bjq) {
                sb.append(": \"");
                sb.append(bmm.m16664t((bjq) obj));
                sb.append('\"');
            } else if (obj instanceof bkl) {
                sb.append(" {");
                m16499d((bkl) obj, sb, i + 2);
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
                m16498c(sb, i4, "key", entry.getKey());
                m16498c(sb, i4, "value", entry.getValue());
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

    /* renamed from: d */
    private static void m16499d(bln bln, StringBuilder sb, int i) {
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
        for (Method method : bln.getClass().getDeclaredMethods()) {
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
                    m16498c(sb, i, m16500e(str7), bkl.m16309ap(method2, bln, new Object[0]));
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
                    m16498c(sb, i, m16500e(str6), bkl.m16309ap(method3, bln, new Object[0]));
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
                    Object ap = bkl.m16309ap(method4, bln, new Object[0]);
                    if (method5 == null) {
                        if (ap instanceof Boolean) {
                            if (!((Boolean) ap).booleanValue()) {
                            }
                        } else if (ap instanceof Integer) {
                            if (((Integer) ap).intValue() == 0) {
                            }
                        } else if (ap instanceof Float) {
                            if (((Float) ap).floatValue() == 0.0f) {
                            }
                        } else if (!(ap instanceof Double)) {
                            if (ap instanceof String) {
                                z = ap.equals("");
                            } else if (ap instanceof bjq) {
                                z = ap.equals(bjq.f16482b);
                            } else if (ap instanceof bln) {
                                if (ap == ((bln) ap).mo15387ag()) {
                                }
                            } else if ((ap instanceof Enum) && ((Enum) ap).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) ap).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) bkl.m16309ap(method5, bln, new Object[0])).booleanValue()) {
                    }
                    m16498c(sb, i, m16500e(str2), ap);
                }
            }
        }
        if (!(bln instanceof bkk)) {
            bmn bmn = ((bkl) bln).f16594c;
            if (bmn != null) {
                bmn.mo15512h(sb, i);
                return;
            }
            return;
        }
        bkk bkk = (bkk) bln;
        throw null;
    }

    /* renamed from: e */
    private static String m16500e(String str) {
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
