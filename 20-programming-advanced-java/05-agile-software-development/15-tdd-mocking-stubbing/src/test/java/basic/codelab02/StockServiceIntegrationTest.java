package basic.codelab02;

import basic.codelab02.domain.Price;
import basic.codelab02.domain.Stock;
import basic.codelab02.external.ExternalStockPriceService;
import basic.codelab02.external.NasdaqStockPriceService;
import basic.codelab02.external.StockPriceInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

public class StockServiceIntegrationTest {

	private StockService stockService;
	private ExternalStockPriceService nasdaqStockService;

	@BeforeEach
	void setup() {
		this.nasdaqStockService = new NasdaqStockPriceService();
		this.stockService = new StockService(nasdaqStockService, new StockMapper());
	}

	@Test
	void displayStockDetails() {
		final String stockId = "123";
		final Optional<Stock> stock = Optional.of(new Stock(new Price("Euro", new BigDecimal(20)), stockId, "SwitchFully"));

		Assertions.assertEquals(stock.get().getStockId(), stockService.displayStockDetails(stockId).get().getStockId());

	}
}
