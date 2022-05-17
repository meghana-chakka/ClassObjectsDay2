

public class ChocolateFactory {

	public static void main(String[] args) {
		
		Chocolate CadburyDairyMilk= new Chocolate("Silk Bubbly",155.00,150,"Goldenfoil",false);
        Chocolate Kitkat = new Chocolate("Have a break,,Have a KitKat",40.00,99,"Silverfoil",false);
        Chocolate Snikers= new Chocolate("Peanut filled bar",50.00,45,"paperFoil",false);
        
        
        System.out.println(CadburyDairyMilk);
        System.out.println(Kitkat);
        System.out.println(Snikers);

        boolean result=CadburyDairyMilk==Kitkat; 
        System.out.println(result);
        
        result=CadburyDairyMilk==Snikers;
        System.out.println(result);
        
        
        System.out.println(CadburyDairyMilk.hashCode());
        System.out.println(Kitkat.hashCode());
        System.out.println(Snikers.hashCode());
        
        String str = "Hello";
        Double temp =45.9;
       
        
        if(CadburyDairyMilk instanceof Chocolate && Kitkat instanceof Chocolate) {
        	 result=CadburyDairyMilk==Kitkat;
             System.out.println(result);
        }
        Chocolate chock = CadburyDairyMilk;// the reference of cadburydairymilk is assigned to chock
        System.out.println("#check"+CadburyDairyMilk.hashCode());
        System.out.println("#check"+chock.hashCode());
		
      
        
        Chocolate chocolates[]= new Chocolate[3];
    	chocolates[0]=CadburyDairyMilk;
    	chocolates[1]=Kitkat;
    	chocolates[2]=Snikers;
    	
    	for(int i=0;i<chocolates.length;i++) {
    		
    		System.out.println("Chocolate@"+i+"="+chocolates[i]);
    	}
    	
	}

}
