import java.util.*;

// Program 8.1 pg-207

class Book{
    protected int page=500;

    public int getPage(){
        return page;
    }
    public void Message(){
        System.out.println("Number of pages : "+page);
    }
}

class Dictionary extends Book{

    private int definitions=52500;

    public void Message(){
        super.Message();
        System.out.println("Number of definitions : "+definitions);
        System.out.println("Definitions per page : "+definitions/getPage());
    }

}

 class Test{

    public static void main(String[] args) {
        Dictionary d1=new Dictionary();
       
        d1.Message();
    }
 }