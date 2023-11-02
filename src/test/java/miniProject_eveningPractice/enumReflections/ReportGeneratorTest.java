package miniProject_eveningPractice.enumReflections;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static miniProject_eveningPractice.enumReflections.ReportGenerator.generateRep;
import static org.junit.jupiter.api.Assertions.*;

class ReportGeneratorTest {
    @Test
    @DisplayName("Test type of the report")
    void testGenerateDepartmentReport() {
        //Given
        //When
        ReportInterface report = generateRep(Report.DEPARTMENT);
        //Then
        assertNotNull(report);
        assertSame(DepartmentReport.class, report.getClass());
    }
}