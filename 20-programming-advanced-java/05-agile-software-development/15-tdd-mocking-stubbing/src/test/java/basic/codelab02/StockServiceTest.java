package basic.codelab02;

import basic.codelab02.domain.Price;
import basic.codelab02.domain.Stock;
import basic.codelab02.external.ExternalStockPriceService;
import basic.codelab02.external.StockPriceInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {
	private StockMapper stockMapper;
	private ExternalStockPriceService externalStockPriceService;

	private StockService stockService;

	@BeforeEach
	void setup() {
		this.stockMapper = Mockito.mock(StockMapper.class);
		this.externalStockPriceService = Mockito.mock(ExternalStockPriceService.class);
		this.stockService = new StockService(externalStockPriceService, stockMapper);
	}

	@Test
	void displayStockDetails() {
		final String stockId = "123";
		final StockPriceInfoDto stockPriceInfoDto = new StockPriceInfoDto(new BigDecimal(20), stockId, "Euro");
		final Optional<Stock> stock = Optional.of(new Stock(new Price("Euro", new BigDecimal(20)), stockId, "SwitchFully"));
		Mockito.when(externalStockPriceService.fetchCurrentPrice(stockId))
				.thenReturn(stockPriceInfoDto);
		Mockito.when(stockMapper.mapToStock(stockPriceInfoDto))
				.thenReturn(stock);
		Assertions.assertEquals(stock, stockService.displayStockDetails(stockId));
	}
}