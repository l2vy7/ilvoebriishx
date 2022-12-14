package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p149s6.C10995b;
import p149s6.C11001d;

public final class IcyDecoder extends SimpleMetadataDecoder {
    private static final Pattern METADATA_ELEMENT = Pattern.compile("(.+?)='(.*?)';", 32);
    private static final String STREAM_KEY_NAME = "streamtitle";
    private static final String STREAM_KEY_URL = "streamurl";
    private final CharsetDecoder iso88591Decoder = C11001d.f49946b.newDecoder();
    private final CharsetDecoder utf8Decoder = C11001d.f49947c.newDecoder();

    private String decodeToString(ByteBuffer byteBuffer) {
        try {
            return this.utf8Decoder.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.iso88591Decoder.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.iso88591Decoder.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.utf8Decoder.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String decodeToString = decodeToString(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (decodeToString == null) {
            return new Metadata(new IcyInfo(bArr, (String) null, (String) null));
        }
        Matcher matcher = METADATA_ELEMENT.matcher(decodeToString);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e = C10995b.m49338e(group);
                e.hashCode();
                if (e.equals(STREAM_KEY_URL)) {
                    str2 = group2;
                } else if (e.equals(STREAM_KEY_NAME)) {
                    str = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
