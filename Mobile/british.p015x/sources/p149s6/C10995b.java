package p149s6;

/* renamed from: s6.b */
/* compiled from: Ascii */
public final class C10995b {
    /* renamed from: a */
    public static boolean m49334a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = m49335b(charAt)) >= 26 || b != m49335b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m49335b(char c) {
        return (char) ((c | ' ') - 'a');
    }

    /* renamed from: c */
    public static boolean m49336c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: d */
    public static boolean m49337d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: e */
    public static String m49338e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m49337d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m49337d(c)) {
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

    /* renamed from: f */
    public static String m49339f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m49336c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m49336c(c)) {
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
}
