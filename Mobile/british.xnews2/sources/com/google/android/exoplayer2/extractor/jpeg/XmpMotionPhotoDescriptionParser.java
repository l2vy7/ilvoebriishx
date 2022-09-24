package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.C4766t;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class XmpMotionPhotoDescriptionParser {
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String TAG = "MotionPhotoXmpParser";

    private XmpMotionPhotoDescriptionParser() {
    }

    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.m19797w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (XmlPullParserUtil.isStartTag(newPullParser, "x:xmpmeta")) {
            long j = C6540C.TIME_UNSET;
            C4766t<MotionPhotoDescription.ContainerItem> E = C4766t.m21978E();
            do {
                newPullParser.next();
                if (XmlPullParserUtil.isStartTag(newPullParser, "rdf:Description")) {
                    if (!parseMotionPhotoFlagFromDescription(newPullParser)) {
                        return null;
                    }
                    j = parseMotionPhotoPresentationTimestampUsFromDescription(newPullParser);
                    E = parseMicroVideoOffsetFromDescription(newPullParser);
                } else if (XmlPullParserUtil.isStartTag(newPullParser, "Container:Directory")) {
                    E = parseMotionPhotoV1Directory(newPullParser, "Container", "Item");
                } else if (XmlPullParserUtil.isStartTag(newPullParser, "GContainer:Directory")) {
                    E = parseMotionPhotoV1Directory(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!XmlPullParserUtil.isEndTag(newPullParser, "x:xmpmeta"));
            if (E.isEmpty()) {
                return null;
            }
            return new MotionPhotoDescription(j, E);
        }
        throw new ParserException("Couldn't find xmp metadata");
    }

    private static C4766t<MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String attributeValue : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, attributeValue);
            if (attributeValue2 != null) {
                return C4766t.m21980G(new MotionPhotoDescription.ContainerItem(MimeTypes.IMAGE_JPEG, "Primary", 0, 0), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue2), 0));
            }
        }
        return C4766t.m21978E();
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        String[] strArr = MOTION_PHOTO_ATTRIBUTE_NAMES;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, strArr[i]);
            if (attributeValue == null) {
                i++;
            } else if (Integer.parseInt(attributeValue) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String attributeValue : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, attributeValue);
            if (attributeValue2 != null) {
                long parseLong = Long.parseLong(attributeValue2);
                if (parseLong == -1) {
                    return C6540C.TIME_UNSET;
                }
                return parseLong;
            }
        }
        return C6540C.TIME_UNSET;
    }

    private static C4766t<MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C4766t.C4768a v = C4766t.m21986v();
        String concat = String.valueOf(str).concat(":Item");
        String concat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, concat)) {
                String concat3 = String.valueOf(str2).concat(":Mime");
                String concat4 = String.valueOf(str2).concat(":Semantic");
                String concat5 = String.valueOf(str2).concat(":Length");
                String concat6 = String.valueOf(str2).concat(":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, concat3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, concat4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, concat5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, concat6);
                if (attributeValue == null || attributeValue2 == null) {
                    return C4766t.m21978E();
                }
                v.mo19883e(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, concat2));
        return v.mo19884f();
    }
}
