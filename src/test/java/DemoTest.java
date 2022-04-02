import com.ds.constant.FruitName;
import com.ds.constant.MonetaryUnit;
import com.ds.entity.Fruit;
import com.ds.entity.Goods;
import com.ds.entity.ShoppingCart;
import com.ds.entity.Supermarket;
import com.ds.promotion.PromotionStrategyA;
import com.ds.promotion.PromotionStrategyB;
import com.ds.promotion.PromotionStrategyNone;
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

    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test1() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Goods> sellGoods = new ConcurrentHashMap<>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));

        //超市,初始化商品、优惠策略
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);
        supermarket.setStrategy(new PromotionStrategyNone());

        //构建购物车商品信息
        Map<String, Integer> cartGoods = new ConcurrentHashMap<>();
        cartGoods.put(FruitName.APPLE, 1);
        cartGoods.put(FruitName.STRAWBERRY, 1);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartGoods(cartGoods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

    /**
     * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test2() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Goods> sellGoods = new ConcurrentHashMap<>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.MANGO, new Fruit(FruitName.MANGO, 20 * MonetaryUnit.YUAN));

        //超市,初始化商品、优惠策略
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);
        supermarket.setStrategy(new PromotionStrategyNone());

        //构建购物车商品信息
        Map<String, Integer> cartGoods = new ConcurrentHashMap<>();
        cartGoods.put(FruitName.APPLE, 1);
        cartGoods.put(FruitName.STRAWBERRY, 1);
        cartGoods.put(FruitName.MANGO, 1);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartGoods(cartGoods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

    /**
     * 3、超市做促销活动，草莓限时打 8 折。
     * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test3() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Goods> sellGoods = new ConcurrentHashMap<>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.MANGO, new Fruit(FruitName.MANGO, 20 * MonetaryUnit.YUAN));

        //超市,初始化商品、优惠策略
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);
        supermarket.setStrategy(new PromotionStrategyA());

        //构建购物车商品信息
        Map<String, Integer> cartGoods = new ConcurrentHashMap<>();
        cartGoods.put(FruitName.APPLE, 1);
        cartGoods.put(FruitName.STRAWBERRY, 1);
        cartGoods.put(FruitName.MANGO, 1);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartGoods(cartGoods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

    /**
     * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
     * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test4() {
        BuyService buyService = new BuyServiceImpl();

        //构建销售商品
        Map<String, Goods> sellGoods = new ConcurrentHashMap<>();
        sellGoods.put(FruitName.APPLE, new Fruit(FruitName.APPLE, 8 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.STRAWBERRY, new Fruit(FruitName.STRAWBERRY, 13 * MonetaryUnit.YUAN));
        sellGoods.put(FruitName.MANGO, new Fruit(FruitName.MANGO, 20 * MonetaryUnit.YUAN));

        //超市,初始化商品、优惠策略
        Supermarket supermarket = new Supermarket();
        supermarket.setSellGoods(sellGoods);
        supermarket.setStrategy(new PromotionStrategyB());

        //构建购物车商品信息
        Map<String, Integer> cartGoods = new ConcurrentHashMap<>();
        cartGoods.put(FruitName.APPLE, 1);
        cartGoods.put(FruitName.STRAWBERRY, 1);
        cartGoods.put(FruitName.MANGO, 5);

        //购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartGoods(cartGoods);

        ShoppingCart buy = buyService.buy(shoppingCart, supermarket);
        System.out.println(buy);
    }

}
