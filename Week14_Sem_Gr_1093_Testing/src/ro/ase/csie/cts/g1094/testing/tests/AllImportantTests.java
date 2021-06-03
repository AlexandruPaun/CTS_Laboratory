package ro.ase.csie.cts.g1094.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.g1094.tests.category.ImportantTest;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class})
@ExcludeCategory
@SuiteClasses({ TestStudentNewTests.class })
public class AllImportantTests {

}
