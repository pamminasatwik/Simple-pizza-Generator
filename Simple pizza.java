  class Pizza{
      private int price;
      private Boolean veg;
      private int extracheese = 100;
      private int extraToppings = 150;
      private int takeaway =20;
        
        private int basepizzaprice;

        private boolean isextracheeseadded=false;
        private boolean isaddtoopings=false;
        private boolean isoptedfortakeaway=false;


      public Pizza(Boolean veg){
        this.veg=veg;
             if(this.veg){
                   this.price=300;
             }
             else {
                this.price=400;
             }
             basepizzaprice=this.price;
      }
          public void addExtracheese(){
            isextracheeseadded=true;
               this.price+=extracheese;
          }
           public void addToppings(){
            isaddtoopings=true;
           
               this.price+=extraToppings;
          }
           public void Takeaway(){
            isoptedfortakeaway=true;
            
               this.price+=takeaway;
          }
          public void getBill(){
            String bill="";
            System.out.println("Pizza cost :"+basepizzaprice);
            if(isextracheeseadded){
                 bill+="Extra cheeese added  :  "+extracheese+"\n";
            }

            if(isaddtoopings){
                 bill+="Extra Toopings added  :  "+extraToppings+"\n";
            }

             if(isoptedfortakeaway){
                 bill+="Takw away opted :  "+takeaway+"\n";
            }

            bill +="Bill :"+ this.price+"\n";
            System.out.println(bill);


          }
}


  class Deluxe  extends Pizza{
         public Deluxe(boolean veg){
                    super(veg);
                    super.addExtracheese();
                    super.addToppings();
           }

           // overriden methods 
         public void addExtracheese(){

         } 
          public void addToppings(){

         } 

}
public class base{
    public static void main(String[]args){
            // Pizza vd  = new Pizza(false);  // creating a veg deleuxe pizza 
            // vd.addExtracheese();
            // vd.addToppings();
            // // vd.Takeaway();
            // vd.getBill();
                
          Deluxe dp=new Deluxe(false);
        //   dp.addExtracheese();
        //   dp.addToppings();
          dp.Takeaway();
          dp.getBill();

                      
            }
}

