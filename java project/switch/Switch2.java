class Switch2
{
  public static void main(String[] args) 
    {
      char grade='A';
      switch(grade)
       {
         case 'A':System.out.println("FCD");
                   break;
         case 'B':System.out.println("FC");
                   break;
         case 'C':System.out.println("SC");
                   break;
         case 'D':System.out.println("JUST PASS");
                   break;
         case 'E':System.out.println("fail");
                   break;
         default:System.out.println("invalid grade");
        }
    }
}