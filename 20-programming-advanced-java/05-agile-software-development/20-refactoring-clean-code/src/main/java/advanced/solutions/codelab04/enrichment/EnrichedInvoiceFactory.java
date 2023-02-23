package advanced.solutions.codelab04.enrichment;

import advanced.solutions.codelab04.input.Invoice;

public class EnrichedInvoiceFactory {
    private EnrichedPerformanceFactory enrichedPerformanceFactory;

    public EnrichedInvoiceFactory(EnrichedPerformanceFactory enrichedPerformanceFactory) {
        this.enrichedPerformanceFactory = enrichedPerformanceFactory;
    }

    public EnrichedInvoice createEnrichedInvoice(Invoice invoice) {
        return new EnrichedInvoice(invoice.customer(), enrichedPerformanceFactory.createEnrichedPerformances(invoice.performances()));
    }
}
