package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class h33 {
    /* renamed from: a */
    public static String m32792a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m32796e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m32796e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m32793b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m32795d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m32795d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m32794c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = "content-length".charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((f = m32797f(charAt)) >= 26 || f != m32797f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m32795d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m32796e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    private static int m32797f(char c) {
        return (char) ((c | ' ') - 'a');
    }
}
