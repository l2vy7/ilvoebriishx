package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9556k5 {
    /* renamed from: a */
    static String m44441a(C9552k1 k1Var) {
        C9547j5 j5Var = new C9547j5(k1Var);
        StringBuilder sb = new StringBuilder(j5Var.size());
        for (int i = 0; i < j5Var.size(); i++) {
            byte a = j5Var.mo38452a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
