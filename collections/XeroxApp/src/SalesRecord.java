import java.util.Date;

public class SalesRecord {
    private Date date;
    private int copies;
    private int pages;
    private double pricePerpage;

    public SalesRecord(Date date, int copies,int pages, double pricePerpage) {
        this.date = date;
        this.copies = copies;
        this.pages = pages;
        this.pricePerpage = pricePerpage;
    }

    public double getTotalSales() {
        return copies * pages * pricePerpage;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "SalesRecord [date=" + date + ", copies=" + copies + ", pages=" + pages + ", pricePerCopy="
                + pricePerpage + "]";
    }

    // @Override
    // public String toString() {
    //     return "SalesRecord{" +
    //         "date=" + date +
    //         ", copiesSold=" + copies +
    //         ", pricePerCopy=" + pricePerCopy +
    //     '}';
    // }


    
}
