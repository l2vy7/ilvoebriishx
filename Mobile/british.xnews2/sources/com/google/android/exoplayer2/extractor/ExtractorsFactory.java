package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = C6692b.f27411a;

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);
}
