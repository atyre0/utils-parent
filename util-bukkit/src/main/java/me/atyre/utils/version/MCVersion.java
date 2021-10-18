package me.atyre.utils.version;

import lombok.Getter;

public enum MCVersion {
    v1_7("1.7"),
    v1_8("1.8"),
    v1_9("1.9"),
    v1_10("1.10"),
    v1_11("1.11"),
    v1_12("1.12"),
    v1_13("1.13"),
    v1_14("1.14"),
    v1_15("1.15"),
    v1_16("1.16"),
    v1_17("1.17");

    @Getter String versionString;

    MCVersion(String versionString) {
        this.versionString = versionString;
    }
}
