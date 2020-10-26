
/*
Allison Arden
8. Rule 07. Exceptional Behavior (ERR)
ERR08-J. Do not catch NullPointerException or any of its ancestors
compliant code
*/

boolean isName(String s) {
  if (s == null){
  return false;
  }
  String names[] = s.split(" ");
  if (names.length != 2){
  return false;
  }
  return (isCapitalized(names[0] && isCapitilized(names[1]));
}
