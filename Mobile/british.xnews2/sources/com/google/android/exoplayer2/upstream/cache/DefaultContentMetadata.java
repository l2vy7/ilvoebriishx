package com.google.android.exoplayer2.upstream.cache;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p148s6.C11001d;

public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
    private int hashCode;
    private final Map<String, byte[]> metadata;

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    private static void addValues(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), getBytes(next.getValue()));
        }
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
        HashMap hashMap = new HashMap(map);
        removeValues(hashMap, contentMetadataMutations.getRemovedValues());
        addValues(hashMap, contentMetadataMutations.getEditedValues());
        return hashMap;
    }

    private static byte[] getBytes(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(C11001d.f49947c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean isMetadataEqual(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!Arrays.equals((byte[]) next.getValue(), map2.get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void removeValues(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    public final boolean contains(String str) {
        return this.metadata.containsKey(str);
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
        Map<String, byte[]> applyMutations = applyMutations(this.metadata, contentMetadataMutations);
        if (isMetadataEqual(this.metadata, applyMutations)) {
            return this;
        }
        return new DefaultContentMetadata(applyMutations);
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
        return this.metadata.entrySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        return isMetadataEqual(this.metadata, ((DefaultContentMetadata) obj).metadata);
    }

    public final byte[] get(String str, byte[] bArr) {
        byte[] bArr2 = this.metadata.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = 0;
            for (Map.Entry next : this.metadata.entrySet()) {
                i += Arrays.hashCode((byte[]) next.getValue()) ^ ((String) next.getKey()).hashCode();
            }
            this.hashCode = i;
        }
        return this.hashCode;
    }

    public DefaultContentMetadata(Map<String, byte[]> map) {
        this.metadata = Collections.unmodifiableMap(map);
    }

    public final String get(String str, String str2) {
        byte[] bArr = this.metadata.get(str);
        return bArr != null ? new String(bArr, C11001d.f49947c) : str2;
    }

    public final long get(String str, long j) {
        byte[] bArr = this.metadata.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }
}
