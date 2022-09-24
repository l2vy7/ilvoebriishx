package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q3 */
final class C8983q3 {
    /* renamed from: a */
    static String m42286a(C8847a0 a0Var) {
        String str;
        C8990r3 r3Var = new C8990r3(a0Var);
        StringBuilder sb = new StringBuilder(r3Var.size());
        for (int i = 0; i < r3Var.size(); i++) {
            int V = r3Var.mo37135V(i);
            if (V == 34) {
                str = "\\\"";
            } else if (V == 39) {
                str = "\\'";
            } else if (V != 92) {
                switch (V) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (V < 32 || V > 126) {
                            sb.append('\\');
                            sb.append((char) (((V >>> 6) & 3) + 48));
                            sb.append((char) (((V >>> 3) & 7) + 48));
                            V = (V & 7) + 48;
                        }
                        sb.append((char) V);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
