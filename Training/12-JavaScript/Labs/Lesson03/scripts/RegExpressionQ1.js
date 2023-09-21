function upparCase(str)
{
   regexp = /^[A-Z]/;
   if (regexp.test(str))
    {
      console.log("First character is uppercase");
    } 
    else
    {
      console.log("First character is not uppercase");
    }
}
upparCase("Harsha");
upparCase("harsha");
