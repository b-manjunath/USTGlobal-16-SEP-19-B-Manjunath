class Circumference
{
public static void main(String[] args)
{
int r=45;
double a=area(r);
System.out.println(a);
}
static double circumferenceOfCircle(int radius)
{
double circumference = 2 * 3.14 * radius;
return circumference;
}
static boolean oddEven(int number)
{
if(number%2 == 0)
{
return true;
} else {
return false;
}
}