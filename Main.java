class Main {  


  public static void main(String[] args) {
    // call your methods here
   threeLineCombo();
    System.out.println("");
    threeLineCombo();
    stars();
    thirdLine();
    threeLineCombo();
      System.out.println("");
threeLineCombo();
    firsLine();
    starsCombo();
    firstCombo();
    
   
  }
// Create your methods here

public static void firsLine() {
   System.out.println("    *****" );
    
}
  public static void secondLine(){
    System.out.println("  *********" ); 
     
  }
    public static void thirdLine() {
     System.out.println("************" );
    }

  public static void threeLineCombo(){
    firsLine();
    secondLine();
    thirdLine();
  }
    public static void stars(){
      System.out.println("* | | | | | *");
    }
    public static void starsCombo(){
      stars();
      stars(); }
      public static void firstCombo() {
        firsLine();
        firsLine();
     
    }
}