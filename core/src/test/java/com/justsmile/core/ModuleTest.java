package com.justsmile.core;

import com.justsmile.core.utils.UtilsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModuleTest {

    @Test
    @DisplayName("Load core utils module")
    void loadCoreUtilsModuleTest() {
        Assertions.assertEquals(new UtilsTest().test(), "utils");
    }

}
