package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class es3 {
    /* renamed from: a */
    static String m31931a(eo3 eo3) {
        StringBuilder sb = new StringBuilder(eo3.mo30457q());
        for (int i = 0; i < eo3.mo30457q(); i++) {
            byte h = eo3.mo30455h(i);
            if (h == 34) {
                sb.append("\\\"");
            } else if (h == 39) {
                sb.append("\\'");
            } else if (h != 92) {
                switch (h) {
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
                        if (h >= 32 && h <= 126) {
                            sb.append((char) h);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((h >>> 6) & 3) + 48));
                            sb.append((char) (((h >>> 3) & 7) + 48));
                            sb.append((char) ((h & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
