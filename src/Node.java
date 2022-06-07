public class Node {
    
    int hits = 0; //The number of hits or views is zero for every node by default.
    
    int ID;
    
    String title;
    
    String category;
    
    String user;
    
    int sizeMega;
    
    String URL;
    
    Node next;
    
	Node prev;
    
    Node(){
        
        
        
    }
    
    Node(int ID, String title, String user, String category, String URL, int sizeMega, int hits){
        
        this.hits = hits;
        
        this.ID = ID;
        
        this.URL = URL;
        
        this.sizeMega = sizeMega;
        
        this.user = user;
        
        this.category = category;
        
        this.title = title; 
        
    }
    
}
