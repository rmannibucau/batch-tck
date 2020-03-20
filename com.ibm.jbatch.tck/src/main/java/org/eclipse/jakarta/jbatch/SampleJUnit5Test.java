package org.eclipse.jakarta.jbatch;

import org.junit.jupiter.api.Test;
import org.testng.Reporter;

class SampleJUnit5Test {
    @Test
    void testChunkNullCheckpointInfo() throws Exception { // copy of the original test "content"
        Reporter.log("Locate job XML file: nullChkPtInfo.xml<p>");
        Reporter.log("Invoke startJobAndWaitForResult for execution #1<p>");
        /* no jbatch impl in cp for the demo
        JobExecution execution1 = new JobOperatorBridge().startJobAndWaitForResult("nullChkPtInfo", null);
        Reporter.log("execution #1 JobExecution getBatchStatus()=" + execution1.getBatchStatus() + "<p>");
        Reporter.log("execution #1 JobExecution getExitStatus()=" + execution1.getExitStatus() + "<p>");
        assertWithMessage("Testing execution #1", BatchStatus.COMPLETED, execution1.getBatchStatus());
        assertWithMessage("Testing execution #1", "checkpointInfo is null in reader.open...checkpointInfo is null in writer.open", execution1.getExitStatus());
         */
    }
}
