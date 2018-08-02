
function validate() 
{
    var x = document.forms["Form"]["t1"].value;
    if (x == "") 
    {
        alert("Roll-Number must be filled ");
        return false;
    }
    var y = document.forms["Form"]["t2"].value;
    if (y == "") 
    {
        alert("Password must be filled ");
        return false;
    }
    var p1 = document.forms["Form"]["pwd"].value;
    var p2=document.forms["Form"]["pwd1"].value;
    if (p1!= p2) 
    {
        alert("Password must be Same");
        return false;
    }
    
}
