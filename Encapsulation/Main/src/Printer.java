public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagePrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int total = this.tonerLevel + tonerAmount;
            if (total > 100) {
                return -1;
            }
            this.tonerLevel = total;
            return total;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode...");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
