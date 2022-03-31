

import com.ds.constant.FruitName;
import com.ds.constant.MonetaryUnit;
import com.ds.entity.Fruit;
import com.ds.entity.ShoppingCart;
import com.ds.entity.Supermarket;
import com.ds.service.BuyService;
import com.ds.service.impl.BuyServiceImpl;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ds
 * @date 2022/3/31 23:27
 */
public class DemoTest {

    @Test
    public void test1() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Fruit> sellGoods = new ConcurrentHashMap<String, Fruit>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));

        //超市,初始化商品
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);

        Map<String, Integer> goods = new ConcurrentHashMap<String, Integer>();
        goods.put(FruitName.APPLE, 1);
        goods.put(FruitName.STRAWBERRY, 1);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setGoods(goods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

    @Test
    public void test2() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Fruit> sellGoods = new ConcurrentHashMap<String, Fruit>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.MANGO, new Fruit(FruitName.MANGO, 20 * MonetaryUnit.YUAN));

        //超市,初始化商品
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);

        Map<String, Integer> goods = new ConcurrentHashMap<String, Integer>();
        goods.put(FruitName.APPLE, 1);
        goods.put(FruitName.STRAWBERRY, 1);
        goods.put(FruitName.MANGO, 1);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setGoods(goods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

}
