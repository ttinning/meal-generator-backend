package UnitTests;

import com.codeclan.example.mealservice.models.CuisineType;
import com.codeclan.example.mealservice.models.Meal;
import com.codeclan.example.mealservice.models.SubCuisineType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MealTest {

    Meal meal;
    @Before
    public void before() {
        meal = new Meal("Crab Linguine", CuisineType.ITALIAN, SubCuisineType.PASTA);
    }

    @Test
    public void hasName() {
        assertEquals("Crab Linguine", meal.getName());
    }

    @Test
    public void hasCuisineType() {
        assertEquals(CuisineType.ITALIAN, meal.getCuisineType());
    }

    @Test
    public void hasSubCuisineType() {
        assertEquals(SubCuisineType.PASTA, meal.getSubCuisineType());
    }
}
