public class TestShirt {
    public static void main(String[] args) {
       	Shirt firstshirt = new Shirt();		//default constructor
       	firstshirt.getCollarsize();	//calling accessor methods for collarsize, material and sleevelength for firstshirt
       	firstshirt.getSleevelength();
       	firstshirt.getShirtmaterial();
       	firstshirt.display();
        
       	System.out.println("--------------------------");
       	Shirt secondshirt= new Shirt(32,44); 	//parameterized constructor
       	secondshirt.getCollarsize();	//calling methods for collarsize, material& sleevelength for secondshirt        	        secondshirt.getSleevelength();
       	secondshirt.getShirtmaterial();
       	secondshirt.display();
        
       	System.out.println("--------------------------");
       	Shirt thirdshirt= new Shirt(34,40); 		//parameterized constructor
       	thirdshirt.getCollarsize();	//calling accessor methods for collarsize, material and sleevelength for thirdshirt
       	thirdshirt.getSleevelength();
       	thirdshirt.getShirtmaterial();
       	thirdshirt.display();
    }
    	    
}
class Shirt {
    //data members
    private int collarsize;
    private int sleevelength;
    private String material;
    
    //member methods
    public void setCollarsize(int collarsize) {		//set method for collarsize
        this.collarsize = collarsize;
    }
    public int getCollarsize() {		//get method for collarsize
        return collarsize;
    }
    public void setSleevelength(int sleevelength) { //set method for sleevelength
        this.sleevelength = sleevelength;
    }
    public int getSleevelength() {		//get method for sleevelength
        return sleevelength;
    }
    public void setShirtmaterial(String material) {	//set method for shirt material
        this.material  = material;		
    }
    public String getShirtmaterial() {		//get method for shirt material
        return material;
    }
    
    // default contructor
    public Shirt() {
        collarsize = sleevelength = 30;
        material = "cotton";
    }   
    //parameterized constructor
    public Shirt(int collarsize, int sleevelength) {
        this.collarsize = collarsize;
        this.sleevelength = sleevelength;
        material = "cotton";
    }
    public void display(){		//display method for the shirt
    	System.out.println("collar size is = " +collarsize+"\nsleevelength is = "+sleevelength+"\nshirt material is = "+material);
    }

}
