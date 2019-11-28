function array()
{
    var num=[10,20,40];
    var size=num.length;
    var sum=0;
    //named function
    function arraysum1(n){
        sum=0
        num[size++]=n;
        for(var i=0;i<size;i++)
        sum=sum+num[i];
        console.log('sum of elements is',sum)
    }
    
    sum=0;
    for(i=0;i<=array.length-1;i++)
    {
        sum=sum+array[i];    }
}