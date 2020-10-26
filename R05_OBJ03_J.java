/*
  Allison Arden
  7. Object Orientation (OBJ)
  OBJ03-J Prevent heap pollution
  compliant code
*/

class ListUtility {
  private static void addToList(List<String> list, String str) {
    list.add(str); // no warning generated
  }
 
  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, 42);
    System.out.println(list.get(0)); 
  }
}
