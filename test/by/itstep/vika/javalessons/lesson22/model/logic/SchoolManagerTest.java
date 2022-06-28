package by.itstep.vika.javalessons.lesson22.model.logic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolManagerTest {

    private static int[][] groups;

    @BeforeClass
    public static void init() {
        groups = new int[][]{{7, 8, 9, 2}, {9, 8, 9, 10}, {7, 7, 1}, {8, 8, 10, 10}};
    }

    @AfterClass
    public static void destroy() {

    }

    @Test
    public void testCalculateAvgMarkPositive() {
        System.out.println("testCalculateAvgMarkPositive");

        double expected = 7.4;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);
    }

    @Test
    public void testFindBadStudentGroupsPositive() {
        System.out.println("testFindBadStudentGroupsPositive");

        String expected = "1 3";
        String actual = SchoolManager.findBadStudentGroups(groups);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindGroupsWithoutBadStudentPositive() {
        System.out.println("testFindGroupsWithoutBadStudentPositive");

        String expected = "2 4";
        String actual = SchoolManager.findGroupsWithoutBadStudent(groups);

        assertEquals(expected, actual);
    }
}
