package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.z0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8389z0 {

    /* renamed from: a */
    static final String[] f42248a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f42249b = 0;

    /* renamed from: a */
    public static zzdc m40108a(uq2 uq2) {
        String str;
        String str2;
        String str3;
        int k = uq2.mo35241k() + uq2.mo35243m();
        int m = uq2.mo35243m();
        int i = (m >> 24) & 255;
        zzdc zzdc = null;
        if (i == 169 || i == 253) {
            int i2 = m & 16777215;
            if (i2 == 6516084) {
                int m2 = uq2.mo35243m();
                if (uq2.mo35243m() == 1684108385) {
                    uq2.mo35237g(8);
                    String E = uq2.mo35227E(m2 - 16);
                    zzdc = new zzzn(C6540C.LANGUAGE_UNDETERMINED, E, E);
                } else {
                    String b = C7850k0.m33805b(m);
                    if (b.length() != 0) {
                        str2 = "Failed to parse comment attribute: ".concat(b);
                    } else {
                        str2 = new String("Failed to parse comment attribute: ");
                    }
                    Log.w("MetadataUtil", str2);
                }
                uq2.mo35236f(k);
                return zzdc;
            } else if (i2 == 7233901 || i2 == 7631467) {
                zzaac e = m40112e(m, "TIT2", uq2);
                uq2.mo35236f(k);
                return e;
            } else if (i2 == 6516589 || i2 == 7828084) {
                zzaac e2 = m40112e(m, "TCOM", uq2);
                uq2.mo35236f(k);
                return e2;
            } else if (i2 == 6578553) {
                zzaac e3 = m40112e(m, "TDRC", uq2);
                uq2.mo35236f(k);
                return e3;
            } else if (i2 == 4280916) {
                zzaac e4 = m40112e(m, "TPE1", uq2);
                uq2.mo35236f(k);
                return e4;
            } else if (i2 == 7630703) {
                zzaac e5 = m40112e(m, "TSSE", uq2);
                uq2.mo35236f(k);
                return e5;
            } else if (i2 == 6384738) {
                zzaac e6 = m40112e(m, "TALB", uq2);
                uq2.mo35236f(k);
                return e6;
            } else if (i2 == 7108978) {
                zzaac e7 = m40112e(m, "USLT", uq2);
                uq2.mo35236f(k);
                return e7;
            } else if (i2 == 6776174) {
                zzaac e8 = m40112e(m, "TCON", uq2);
                uq2.mo35236f(k);
                return e8;
            } else if (i2 == 6779504) {
                zzaac e9 = m40112e(m, "TIT1", uq2);
                uq2.mo35236f(k);
                return e9;
            }
        } else if (m == 1735291493) {
            try {
                int b2 = m40109b(uq2);
                String str4 = (b2 <= 0 || b2 > 192) ? null : f42248a[b2 - 1];
                if (str4 != null) {
                    zzdc = new zzaac("TCON", (String) null, str4);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzdc;
            } finally {
                uq2.mo35236f(k);
            }
        } else if (m == 1684632427) {
            zzaac d = m40111d(1684632427, "TPOS", uq2);
            uq2.mo35236f(k);
            return d;
        } else if (m == 1953655662) {
            zzaac d2 = m40111d(1953655662, "TRCK", uq2);
            uq2.mo35236f(k);
            return d2;
        } else if (m == 1953329263) {
            zzzu c = m40110c(1953329263, "TBPM", uq2, true, false);
            uq2.mo35236f(k);
            return c;
        } else if (m == 1668311404) {
            zzzu c2 = m40110c(1668311404, "TCMP", uq2, true, true);
            uq2.mo35236f(k);
            return c2;
        } else if (m == 1668249202) {
            int m3 = uq2.mo35243m();
            if (uq2.mo35243m() == 1684108385) {
                int m4 = uq2.mo35243m() & 16777215;
                if (m4 == 13) {
                    str3 = MimeTypes.IMAGE_JPEG;
                } else if (m4 == 14) {
                    str3 = "image/png";
                    m4 = 14;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(m4);
                    Log.w("MetadataUtil", sb.toString());
                } else {
                    uq2.mo35237g(4);
                    int i3 = m3 - 16;
                    byte[] bArr = new byte[i3];
                    uq2.mo35232b(bArr, 0, i3);
                    zzdc = new zzzf(str3, (String) null, 3, bArr);
                }
            } else {
                Log.w("MetadataUtil", "Failed to parse cover art attribute");
            }
            uq2.mo35236f(k);
            return zzdc;
        } else if (m == 1631670868) {
            zzaac e10 = m40112e(1631670868, "TPE2", uq2);
            uq2.mo35236f(k);
            return e10;
        } else if (m == 1936682605) {
            zzaac e11 = m40112e(1936682605, "TSOT", uq2);
            uq2.mo35236f(k);
            return e11;
        } else if (m == 1936679276) {
            zzaac e12 = m40112e(1936679276, "TSO2", uq2);
            uq2.mo35236f(k);
            return e12;
        } else if (m == 1936679282) {
            zzaac e13 = m40112e(1936679282, "TSOA", uq2);
            uq2.mo35236f(k);
            return e13;
        } else if (m == 1936679265) {
            zzaac e14 = m40112e(1936679265, "TSOP", uq2);
            uq2.mo35236f(k);
            return e14;
        } else if (m == 1936679791) {
            zzaac e15 = m40112e(1936679791, "TSOC", uq2);
            uq2.mo35236f(k);
            return e15;
        } else if (m == 1920233063) {
            zzzu c3 = m40110c(1920233063, "ITUNESADVISORY", uq2, false, false);
            uq2.mo35236f(k);
            return c3;
        } else if (m == 1885823344) {
            zzzu c4 = m40110c(1885823344, "ITUNESGAPLESS", uq2, false, true);
            uq2.mo35236f(k);
            return c4;
        } else if (m == 1936683886) {
            zzaac e16 = m40112e(1936683886, "TVSHOWSORT", uq2);
            uq2.mo35236f(k);
            return e16;
        } else if (m == 1953919848) {
            zzaac e17 = m40112e(1953919848, "TVSHOW", uq2);
            uq2.mo35236f(k);
            return e17;
        } else if (m == 757935405) {
            String str5 = null;
            String str6 = null;
            int i4 = -1;
            int i5 = -1;
            while (uq2.mo35241k() < k) {
                int k2 = uq2.mo35241k();
                int m5 = uq2.mo35243m();
                int m6 = uq2.mo35243m();
                uq2.mo35237g(4);
                if (m6 == 1835360622) {
                    str5 = uq2.mo35227E(m5 - 12);
                } else if (m6 == 1851878757) {
                    str6 = uq2.mo35227E(m5 - 12);
                } else {
                    if (m6 == 1684108385) {
                        i5 = m5;
                    }
                    if (m6 == 1684108385) {
                        i4 = k2;
                    }
                    uq2.mo35237g(m5 - 12);
                }
            }
            if (!(str5 == null || str6 == null)) {
                if (i4 != -1) {
                    uq2.mo35236f(i4);
                    uq2.mo35237g(16);
                    zzdc = new zzzw(str5, str6, uq2.mo35227E(i5 - 16));
                }
            }
            uq2.mo35236f(k);
            return zzdc;
        }
        String b3 = C7850k0.m33805b(m);
        if (b3.length() != 0) {
            str = "Skipped unknown metadata entry: ".concat(b3);
        } else {
            str = new String("Skipped unknown metadata entry: ");
        }
        Log.d("MetadataUtil", str);
        uq2.mo35236f(k);
        return null;
    }

    /* renamed from: b */
    private static int m40109b(uq2 uq2) {
        uq2.mo35237g(4);
        if (uq2.mo35243m() == 1684108385) {
            uq2.mo35237g(8);
            return uq2.mo35249s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static zzzu m40110c(int i, String str, uq2 uq2, boolean z, boolean z2) {
        String str2;
        int b = m40109b(uq2);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String b2 = C7850k0.m33805b(i);
            if (b2.length() != 0) {
                str2 = "Failed to parse uint8 attribute: ".concat(b2);
            } else {
                str2 = new String("Failed to parse uint8 attribute: ");
            }
            Log.w("MetadataUtil", str2);
            return null;
        } else if (z) {
            return new zzaac(str, (String) null, Integer.toString(b));
        } else {
            return new zzzn(C6540C.LANGUAGE_UNDETERMINED, str, Integer.toString(b));
        }
    }

    /* renamed from: d */
    private static zzaac m40111d(int i, String str, uq2 uq2) {
        String str2;
        int m = uq2.mo35243m();
        if (uq2.mo35243m() == 1684108385 && m >= 22) {
            uq2.mo35237g(10);
            int w = uq2.mo35253w();
            if (w > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(w);
                String sb2 = sb.toString();
                int w2 = uq2.mo35253w();
                if (w2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(w2);
                    sb2 = sb3.toString();
                }
                return new zzaac(str, (String) null, sb2);
            }
        }
        String b = C7850k0.m33805b(i);
        if (b.length() != 0) {
            str2 = "Failed to parse index/count attribute: ".concat(b);
        } else {
            str2 = new String("Failed to parse index/count attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    /* renamed from: e */
    private static zzaac m40112e(int i, String str, uq2 uq2) {
        String str2;
        int m = uq2.mo35243m();
        if (uq2.mo35243m() == 1684108385) {
            uq2.mo35237g(8);
            return new zzaac(str, (String) null, uq2.mo35227E(m - 16));
        }
        String b = C7850k0.m33805b(i);
        if (b.length() != 0) {
            str2 = "Failed to parse text attribute: ".concat(b);
        } else {
            str2 = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }
}
