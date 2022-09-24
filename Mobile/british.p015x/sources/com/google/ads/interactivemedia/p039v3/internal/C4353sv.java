package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sv */
/* compiled from: IMASDK */
final class C4353sv {

    /* renamed from: a */
    private static final String[] f18652a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f18653b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f18654c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C4349sr m18896a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (arh.m14600g(newPullParser, "x:xmpmeta")) {
                atz<C4348sq> i = atz.m14807i();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (arh.m14600g(newPullParser, "rdf:Description")) {
                        String[] strArr = f18652a;
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < 4) {
                            String i4 = arh.m14602i(newPullParser, strArr[i3]);
                            if (i4 == null) {
                                i3++;
                            } else if (Integer.parseInt(i4) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f18653b;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 4) {
                                        break;
                                    }
                                    String i6 = arh.m14602i(newPullParser, strArr2[i5]);
                                    if (i6 != null) {
                                        j = Long.parseLong(i6);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f18654c;
                                while (true) {
                                    if (i2 >= 2) {
                                        i = atz.m14807i();
                                        break;
                                    }
                                    String i7 = arh.m14602i(newPullParser, strArr3[i2]);
                                    if (i7 != null) {
                                        i = atz.m14809k(new C4348sq(MimeTypes.IMAGE_JPEG, 0, 0), new C4348sq(MimeTypes.VIDEO_MP4, Long.parseLong(i7), 0));
                                        break;
                                    }
                                    i2++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (arh.m14600g(newPullParser, "Container:Directory")) {
                        i = m18897b(newPullParser, "Container", "Item");
                    } else if (arh.m14600g(newPullParser, "GContainer:Directory")) {
                        i = m18897b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!arh.m14598e(newPullParser, "x:xmpmeta"));
                if (i.isEmpty()) {
                    return null;
                }
                return new C4349sr(j2, i);
            }
            throw new C4144lb("Couldn't find xmp metadata");
        } catch (C4144lb | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static atz<C4348sq> m18897b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        atv s = atz.m14815s();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (arh.m14600g(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String i = arh.m14602i(xmlPullParser, concat3);
                String i2 = arh.m14602i(xmlPullParser, concat4);
                String i3 = arh.m14602i(xmlPullParser, concat5);
                String i4 = arh.m14602i(xmlPullParser, concat6);
                if (i == null || i2 == null) {
                    return atz.m14807i();
                }
                s.mo14514d(new C4348sq(i, i3 != null ? Long.parseLong(i3) : 0, i4 != null ? Long.parseLong(i4) : 0));
            }
        } while (!arh.m14598e(xmlPullParser, concat2));
        return s.mo14513c();
    }
}
