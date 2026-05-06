package programs;

public class Program1 {
    private int pageNum;
    
    public void setData(int x) {
    	if (x > 0) {
    		pageNum = x;
    	} else {
    		System.out.println("Invalid pagenum");
    	}
    }
    
    public int getData() {
    	return pageNum;
    }
}
