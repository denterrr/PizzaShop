package den.ter.pizzashop.repository

import androidx.compose.runtime.mutableStateListOf
import den.ter.pizzashop.R
import den.ter.pizzashop.model.BannerModel
import den.ter.pizzashop.model.CategoryModel
import den.ter.pizzashop.model.PizzaModel
import java.util.*

class MyRepository (
    val listPizza: List<PizzaModel> = mutableStateListOf(
        PizzaModel("Пепперони", "Колбаса салями, сыр,\nогурец, помидор,\nтоматный соус",
            "https://w7.pngwing.com/pngs/448/578/png-transparent-pizza-margherita-italian-cuisine-chicago-style-pizza-pepperoni-pizza-thumbnail.png",
            345),
        PizzaModel("Острая", "Колбаса, сыр,\nогурец, помидор,\nострый соус",
            "https://w7.pngwing.com/pngs/56/985/png-transparent-pizza-margherita-sushi-pizza-pizza-delivery-pizza-thumbnail.png",
            365),
        PizzaModel("Сырная", "Сыр чеддер, сыр другой,\nогурец, помидор,\nсырный соус",
            "https://w7.pngwing.com/pngs/979/723/png-transparent-pizza-sausage-pizza-margherita-hamburger-calzone-sausage-pizza-food-baking-recipe-thumbnail.png",
            445),
        PizzaModel("Маргарита", "Ветчина, сыр,\nогурец, помидор,\nмаргаритный соус",
            "https://w7.pngwing.com/pngs/645/543/png-transparent-new-york-style-pizza-italian-cuisine-take-out-st-louis-style-pizza-pizza-food-recipe-cheese-thumbnail.png",
            300)
    ),

    val listBanner: List<BannerModel> = mutableStateListOf(
        BannerModel(R.drawable.banner1),
        BannerModel(R.drawable.banner2)
    ),

    val listCategory: List<CategoryModel> = mutableStateListOf(
        CategoryModel("Пицца"),
        CategoryModel("Комбо"),
        CategoryModel("Закуски"),
        CategoryModel("Напитки"),
        CategoryModel("Десерты")
    ),









)

