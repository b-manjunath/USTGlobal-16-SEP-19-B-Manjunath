class Weight1
{
public static void main(String args[])
{
int weight=65;
double height=6;
double BMI=weight/((height)*(height));
if(BMI<18.5)
{
System.out.println("under weight");
}
else if(BMI<=24.9)
{
System.out.println("you are  in heighly weight range");
}
else if(BMI<=29.9)
{
System.out.println("you are in the over weight range");
}
else if(BMI<=39.9)
{
System.out.println("you are in the obese range");
}
}
}