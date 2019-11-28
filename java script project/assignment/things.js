const items=[{
    name:'ear rings',
    id:1,
    price:1000},
{
    name:'kajol',
    id:2,
    price:500},
{
    name:'trimmer',
    id:3,
    price:2000},
    {
        name:'slipers',
        id:4,
        price:1500
    },
    {
    name:'watches',
    id:5,
    price:5000},
{
    name:'ear phones',
    id:6,
    price:2500},
{
    name:'charger',
    id:7,
    price:500},
    {
        name:'bag',
        id:8,
        price:1500
    },
    {
    name:'key board',
    id:9,
    price:1000},
{
    name:'cot',
    id:10,
    price:10000
}
]
console.log('items = ',items);
const items = item.map(function(value,index){
    let newValue=value + 50
    return newValue
    })
    console.log('after map method',items)
    console.log('=======================')