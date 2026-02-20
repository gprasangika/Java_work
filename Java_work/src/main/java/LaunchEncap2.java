class Books {
    private int pageNum;

    void setPageNum(int pgN) {
        pageNum = pgN;
    }

    int getPageNum() {
        return pageNum;
    }
}

public class LaunchEncap2 {
    public static void main(String[] args) {
        Books b = new Books();
        b.setPageNum(100);
        System.out.println(b.getPageNum());
    }
}
