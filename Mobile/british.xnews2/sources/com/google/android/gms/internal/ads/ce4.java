package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ce4 {

    /* renamed from: a */
    private static final String[] f30347a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f30348b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f30349c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static yd4 m30984a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (a23.m30212c(newPullParser, "x:xmpmeta")) {
                p63<xd4> A = p63.m20814A();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (a23.m30212c(newPullParser, "rdf:Description")) {
                        String[] strArr = f30347a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = a23.m30210a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f30348b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = a23.m30210a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f30349c;
                                while (true) {
                                    if (i >= 2) {
                                        A = p63.m20814A();
                                        break;
                                    }
                                    String a3 = a23.m30210a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        A = p63.m20816E(new xd4(MimeTypes.IMAGE_JPEG, "Primary", 0, 0), new xd4(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (a23.m30212c(newPullParser, "Container:Directory")) {
                        A = m30985b(newPullParser, "Container", "Item");
                    } else if (a23.m30212c(newPullParser, "GContainer:Directory")) {
                        A = m30985b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!a23.m30211b(newPullParser, "x:xmpmeta"));
                if (A.isEmpty()) {
                    return null;
                }
                return new yd4(j2, A);
            }
            throw C7811iy.m33482a("Couldn't find xmp metadata", (Throwable) null);
        } catch (C7811iy | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static p63<xd4> m30985b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        m63 t = p63.m20820t();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a23.m30212c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a = a23.m30210a(xmlPullParser, concat3);
                String a2 = a23.m30210a(xmlPullParser, concat4);
                String a3 = a23.m30210a(xmlPullParser, concat5);
                String a4 = a23.m30210a(xmlPullParser, concat6);
                if (a == null || a2 == null) {
                    return p63.m20814A();
                }
                t.mo33496f(new xd4(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!a23.m30211b(xmlPullParser, concat2));
        return t.mo33497g();
    }
}
