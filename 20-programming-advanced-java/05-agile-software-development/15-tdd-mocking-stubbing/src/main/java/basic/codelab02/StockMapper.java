package basic.codelab02;

import basic.codelab02.domain.Price;
import basic.codelab02.domain.Stock;
import basic.codelab02.external.StockPriceInfoDto;

import java.util.Optional;

/**
 * Read the README.md.
 * These is 1 public method (API) you should test (both branches (if/else) should be unit tested)
 */
public class StockMapper {

    public Optional<Stock> mapToStock(StockPriceInfoDto stockPriceInfo) {
        if (stockPriceInfo == null) {
            return Optional.empty();
        }
        return Optional.of(
                new Stock(
                        new Price(stockPriceInfo.currency, stockPriceInfo.price),
                        stockPriceInfo.stockId,
                        stockPriceInfo.stockId.toLowerCase()
                ));
    }

}
