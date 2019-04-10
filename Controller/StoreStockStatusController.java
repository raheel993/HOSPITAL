/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development.Controller;

import Development.BO.StoreStockStatusBO;
import Development.Handler.StoreStockStatusHandler;
import java.util.List;

/**
 *
 * @author Muhammad Talha Khan
 */
public class StoreStockStatusController {
    
     StoreStockStatusHandler strStock = new StoreStockStatusHandler();
    
    public List<StoreStockStatusBO> selectItemsSearch(String itemId ){
        return strStock.selectItemSearch(itemId);
    
}
}
