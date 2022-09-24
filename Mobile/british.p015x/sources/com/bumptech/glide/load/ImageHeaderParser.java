package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p087h2.C5382b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: b */
        private final boolean f12698b;

        private ImageType(boolean z) {
            this.f12698b = z;
        }

        public boolean hasAlpha() {
            return this.f12698b;
        }
    }

    /* renamed from: a */
    ImageType mo11173a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    ImageType mo11174b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo11175c(InputStream inputStream, C5382b bVar) throws IOException;
}
