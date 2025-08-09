
public class BookInfo {
    private String bookName;
    private int bookRec;
    
    
    public BookInfo(String bookName,int bookRec ){
    this.bookName = bookName;
    this.bookRec = bookRec;
    
    }

    public String getBookName(){
    return this.bookName;
    }
    
    public int getBookRec(){
    return this.bookRec;
    }
    
    
    public String toString(){
    return this.bookName + " (recommended for "+this.bookRec+" year-olds or older)";
    }
}
