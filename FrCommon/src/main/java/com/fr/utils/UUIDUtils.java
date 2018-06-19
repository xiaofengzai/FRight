package com.fr.utils;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;

public class UUIDUtils {
    public static String generateOrderedUUID(){
        return Generators.timeBasedGenerator(EthernetAddress.fromInterface()).generate().toString().replace("-", "").toUpperCase();
    }
}
