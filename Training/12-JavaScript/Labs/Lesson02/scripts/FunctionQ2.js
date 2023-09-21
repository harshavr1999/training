function convert(str)
{
  var words = str.split(' ');
  var newString = [];
    
  for(var i = 0; i < words.length; i++){
      newString.push(words[i].charAt(0).toUpperCase()+words[i].slice(1));
  }
  return newString.join(' ');
}
console.log(convert("the quick brown fox"));
