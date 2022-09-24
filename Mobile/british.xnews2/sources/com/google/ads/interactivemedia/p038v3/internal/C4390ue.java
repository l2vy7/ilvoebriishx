package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ue */
/* compiled from: IMASDK */
final class C4390ue {

    /* renamed from: a */
    static final String[] f19007a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f19008b = 0;

    /* renamed from: a */
    public static C4506ym m19110a(alw alw) {
        String str;
        String str2;
        String str3;
        int h = alw.mo13950h() + alw.mo13965w();
        int w = alw.mo13965w();
        int i = (w >> 24) & 255;
        C4506ym ymVar = null;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & w;
            if (i2 == 6516084) {
                int w2 = alw.mo13965w();
                if (alw.mo13965w() == 1684108385) {
                    alw.mo13954l(8);
                    String H = alw.mo13939H(w2 - 16);
                    ymVar = new C4524zd(C6540C.LANGUAGE_UNDETERMINED, H, H);
                } else {
                    String valueOf = String.valueOf(C4375tq.m19005g(w));
                    if (valueOf.length() != 0) {
                        str2 = "Failed to parse comment attribute: ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to parse comment attribute: ");
                    }
                    Log.w("MetadataUtil", str2);
                }
                alw.mo13951i(h);
                return ymVar;
            } else if (i2 == 7233901 || i2 == 7631467) {
                C4534zn b = m19111b(w, "TIT2", alw);
                alw.mo13951i(h);
                return b;
            } else if (i2 == 6516589 || i2 == 7828084) {
                C4534zn b2 = m19111b(w, "TCOM", alw);
                alw.mo13951i(h);
                return b2;
            } else if (i2 == 6578553) {
                C4534zn b3 = m19111b(w, "TDRC", alw);
                alw.mo13951i(h);
                return b3;
            } else if (i2 == 4280916) {
                C4534zn b4 = m19111b(w, "TPE1", alw);
                alw.mo13951i(h);
                return b4;
            } else if (i2 == 7630703) {
                C4534zn b5 = m19111b(w, "TSSE", alw);
                alw.mo13951i(h);
                return b5;
            } else if (i2 == 6384738) {
                C4534zn b6 = m19111b(w, "TALB", alw);
                alw.mo13951i(h);
                return b6;
            } else if (i2 == 7108978) {
                C4534zn b7 = m19111b(w, "USLT", alw);
                alw.mo13951i(h);
                return b7;
            } else if (i2 == 6776174) {
                C4534zn b8 = m19111b(w, "TCON", alw);
                alw.mo13951i(h);
                return b8;
            } else if (i2 == 6779504) {
                C4534zn b9 = m19111b(w, "TIT1", alw);
                alw.mo13951i(h);
                return b9;
            }
        } else if (w == 1735291493) {
            try {
                int e = m19114e(alw);
                String str4 = (e <= 0 || e > 192) ? null : f19007a[e - 1];
                if (str4 != null) {
                    ymVar = new C4534zn("TCON", (String) null, str4);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return ymVar;
            } finally {
                alw.mo13951i(h);
            }
        } else if (w == 1684632427) {
            C4534zn d = m19113d(1684632427, "TPOS", alw);
            alw.mo13951i(h);
            return d;
        } else if (w == 1953655662) {
            C4534zn d2 = m19113d(1953655662, "TRCK", alw);
            alw.mo13951i(h);
            return d2;
        } else if (w == 1953329263) {
            C4530zj c = m19112c(1953329263, "TBPM", alw, true, false);
            alw.mo13951i(h);
            return c;
        } else if (w == 1668311404) {
            C4530zj c2 = m19112c(1668311404, "TCMP", alw, true, true);
            alw.mo13951i(h);
            return c2;
        } else if (w == 1668249202) {
            int w3 = alw.mo13965w();
            if (alw.mo13965w() == 1684108385) {
                int f = C4375tq.m19004f(alw.mo13965w());
                if (f == 13) {
                    str3 = MimeTypes.IMAGE_JPEG;
                } else if (f == 14) {
                    str3 = "image/png";
                    f = 14;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(f);
                    Log.w("MetadataUtil", sb.toString());
                } else {
                    alw.mo13954l(4);
                    int i3 = w3 - 16;
                    byte[] bArr = new byte[i3];
                    alw.mo13956n(bArr, 0, i3);
                    ymVar = new C4518yy(str3, (String) null, 3, bArr);
                }
            } else {
                Log.w("MetadataUtil", "Failed to parse cover art attribute");
            }
            alw.mo13951i(h);
            return ymVar;
        } else if (w == 1631670868) {
            C4534zn b10 = m19111b(1631670868, "TPE2", alw);
            alw.mo13951i(h);
            return b10;
        } else if (w == 1936682605) {
            C4534zn b11 = m19111b(1936682605, "TSOT", alw);
            alw.mo13951i(h);
            return b11;
        } else if (w == 1936679276) {
            C4534zn b12 = m19111b(1936679276, "TSO2", alw);
            alw.mo13951i(h);
            return b12;
        } else if (w == 1936679282) {
            C4534zn b13 = m19111b(1936679282, "TSOA", alw);
            alw.mo13951i(h);
            return b13;
        } else if (w == 1936679265) {
            C4534zn b14 = m19111b(1936679265, "TSOP", alw);
            alw.mo13951i(h);
            return b14;
        } else if (w == 1936679791) {
            C4534zn b15 = m19111b(1936679791, "TSOC", alw);
            alw.mo13951i(h);
            return b15;
        } else if (w == 1920233063) {
            C4530zj c3 = m19112c(1920233063, "ITUNESADVISORY", alw, false, false);
            alw.mo13951i(h);
            return c3;
        } else if (w == 1885823344) {
            C4530zj c4 = m19112c(1885823344, "ITUNESGAPLESS", alw, false, true);
            alw.mo13951i(h);
            return c4;
        } else if (w == 1936683886) {
            C4534zn b16 = m19111b(1936683886, "TVSHOWSORT", alw);
            alw.mo13951i(h);
            return b16;
        } else if (w == 1953919848) {
            C4534zn b17 = m19111b(1953919848, "TVSHOW", alw);
            alw.mo13951i(h);
            return b17;
        } else if (w == 757935405) {
            String str5 = null;
            String str6 = null;
            int i4 = -1;
            int i5 = -1;
            while (alw.mo13950h() < h) {
                int h2 = alw.mo13950h();
                int w4 = alw.mo13965w();
                int w5 = alw.mo13965w();
                alw.mo13954l(4);
                if (w5 == 1835360622) {
                    str5 = alw.mo13939H(w4 - 12);
                } else if (w5 == 1851878757) {
                    str6 = alw.mo13939H(w4 - 12);
                } else {
                    if (w5 == 1684108385) {
                        i5 = w4;
                    }
                    if (w5 == 1684108385) {
                        i4 = h2;
                    }
                    alw.mo13954l(w4 - 12);
                }
            }
            if (!(str5 == null || str6 == null)) {
                if (i4 != -1) {
                    alw.mo13951i(i4);
                    alw.mo13954l(16);
                    ymVar = new C4531zk(str5, str6, alw.mo13939H(i5 - 16));
                }
            }
            alw.mo13951i(h);
            return ymVar;
        }
        String valueOf2 = String.valueOf(C4375tq.m19005g(w));
        if (valueOf2.length() != 0) {
            str = "Skipped unknown metadata entry: ".concat(valueOf2);
        } else {
            str = new String("Skipped unknown metadata entry: ");
        }
        Log.d("MetadataUtil", str);
        alw.mo13951i(h);
        return null;
    }

    /* renamed from: b */
    private static C4534zn m19111b(int i, String str, alw alw) {
        String str2;
        int w = alw.mo13965w();
        if (alw.mo13965w() == 1684108385) {
            alw.mo13954l(8);
            return new C4534zn(str, (String) null, alw.mo13939H(w - 16));
        }
        String valueOf = String.valueOf(C4375tq.m19005g(i));
        if (valueOf.length() != 0) {
            str2 = "Failed to parse text attribute: ".concat(valueOf);
        } else {
            str2 = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    /* renamed from: c */
    private static C4530zj m19112c(int i, String str, alw alw, boolean z, boolean z2) {
        String str2;
        int e = m19114e(alw);
        if (z2) {
            e = Math.min(1, e);
        }
        if (e < 0) {
            String valueOf = String.valueOf(C4375tq.m19005g(i));
            if (valueOf.length() != 0) {
                str2 = "Failed to parse uint8 attribute: ".concat(valueOf);
            } else {
                str2 = new String("Failed to parse uint8 attribute: ");
            }
            Log.w("MetadataUtil", str2);
            return null;
        } else if (z) {
            return new C4534zn(str, (String) null, Integer.toString(e));
        } else {
            return new C4524zd(C6540C.LANGUAGE_UNDETERMINED, str, Integer.toString(e));
        }
    }

    /* renamed from: d */
    private static C4534zn m19113d(int i, String str, alw alw) {
        String str2;
        int w = alw.mo13965w();
        if (alw.mo13965w() == 1684108385 && w >= 22) {
            alw.mo13954l(10);
            int p = alw.mo13958p();
            if (p > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(p);
                String sb2 = sb.toString();
                int p2 = alw.mo13958p();
                if (p2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(p2);
                    sb2 = sb3.toString();
                }
                return new C4534zn(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(C4375tq.m19005g(i));
        if (valueOf2.length() != 0) {
            str2 = "Failed to parse index/count attribute: ".concat(valueOf2);
        } else {
            str2 = new String("Failed to parse index/count attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    /* renamed from: e */
    private static int m19114e(alw alw) {
        alw.mo13954l(4);
        if (alw.mo13965w() == 1684108385) {
            alw.mo13954l(8);
            return alw.mo13957o();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
