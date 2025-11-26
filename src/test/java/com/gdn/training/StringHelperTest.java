package com.gdn.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {
    @Test
    @DisplayName("to upper case test")
    public void toUpperCaseTest() {
        List<String> strings = new ArrayList<>();
        strings.add("satu");
        strings.add("dua");
        strings.add("tiga");
        strings.add(null);

        List<String> result = StringHelper.toUpperCase(strings);
        assertEquals(3,result.size());

        assertEquals("SATU",result.get(0));
        assertEquals("DUA",result.get(1));
        assertEquals("TIGA",result.get(2));
    }

}