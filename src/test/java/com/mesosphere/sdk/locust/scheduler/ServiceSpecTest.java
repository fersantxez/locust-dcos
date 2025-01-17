package com.mesosphere.sdk.locust.scheduler;

import com.mesosphere.sdk.testing.BaseServiceSpecTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServiceSpecTest extends BaseServiceSpecTest {

    @BeforeClass
    public static void beforeAll() {
        ENV_VARS.set("EXECUTOR_URI", "");
        ENV_VARS.set("LIBMESOS_URI", "");
        ENV_VARS.set("PORT_API", "8080");
        ENV_VARS.set("FRAMEWORK_NAME", "locust");

        ENV_VARS.set("NODE_COUNT", "2");
        ENV_VARS.set("NODE_CPUS", "0.1");
        ENV_VARS.set("NODE_MEM", "512");
        ENV_VARS.set("NODE_DISK", "5000");
        ENV_VARS.set("NODE_DISK_TYPE", "ROOT");

        ENV_VARS.set("SLEEP_DURATION", "1000");

        ENV_VARS.set("LOCUST-LOAD_TEST_URL", "http://workload-simulation-webapp.appspot.com");
        ENV_VARS.set("LOCUST-LOCUST_FILE", "https://raw.githubusercontent.com/fernandosanchezmunoz/locust-dcos/master/src/main/docker/files/locustfile.py");
    }

    @Test
    public void testYmlBase() throws Exception {
        testYaml("svc.yml");
    }
}
