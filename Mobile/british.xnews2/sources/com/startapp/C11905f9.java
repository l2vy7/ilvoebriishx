package com.startapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.startapp.f9 */
/* compiled from: Sta */
public final class C11905f9 {
    /* renamed from: a */
    public static String m52314a(String str, String str2) {
        Pattern pattern = C12187sd.f54151a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        C12000je.m52520a(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        if (C12187sd.m52839b(str2, sb, C12187sd.f54152b, str3, iArr2) || C12187sd.m52838a(str2, sb, C12187sd.f54151a, str3, iArr2) || C12187sd.m52839b(str2, sb, C12187sd.f54154d, str3, iArr2) || C12187sd.m52838a(str2, sb, C12187sd.f54153c, str3, iArr2) || C12187sd.m52839b(str2, sb, C12187sd.f54156f, str3, iArr2) || C12187sd.m52838a(str2, sb, C12187sd.f54155e, str3, iArr2) || C12187sd.m52838a(str2, sb, C12187sd.f54157g, str3, iArr2)) {
            return sb.toString();
        }
        return str3 + str2;
    }
}
