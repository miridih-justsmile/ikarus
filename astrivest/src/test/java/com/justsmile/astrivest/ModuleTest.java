package com.justsmile.astrivest;

import com.justsmile.core.CoreTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModuleTest {

    @Test
    @DisplayName("Load core module")
    void loadCoreModuleTest() {
        Assertions.assertEquals(new CoreTest().test(), "core");
    }
}
