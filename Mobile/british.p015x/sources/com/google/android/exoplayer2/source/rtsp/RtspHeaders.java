package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import com.google.common.collect.C4776v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p149s6.C10995b;

final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final String EXPIRES = "Expires";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final C4766t<String> namesAndValues;

    public C4776v<String, String> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < this.namesAndValues.size(); i += 2) {
            linkedHashMap.put(this.namesAndValues.get(i), this.namesAndValues.get(i + 1));
        }
        return C4776v.m22049f(linkedHashMap);
    }

    public String get(String str) {
        for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
            if (C10995b.m49334a(str, this.namesAndValues.get(size))) {
                return this.namesAndValues.get(size + 1);
            }
        }
        return null;
    }

    private RtspHeaders(Builder builder) {
        this.namesAndValues = C4766t.m21988y(builder.namesAndValues);
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public final List<String> namesAndValues = new ArrayList();

        public Builder add(String str, String str2) {
            this.namesAndValues.add(str.trim());
            this.namesAndValues.add(str2.trim());
            return this;
        }

        public Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] splitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (splitAtFirst.length == 2) {
                    add(splitAtFirst[0], splitAtFirst[1]);
                }
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }

        public Builder addAll(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                add((String) next.getKey(), (String) next.getValue());
            }
            return this;
        }
    }
}
