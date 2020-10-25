/*
  Allison Arden
  3. Rule 03. Numeric Types and Operations (NUM)
NUM03-J. Use integer types that can fully represent the possible range of unsigned data
non-compliant code
*/

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}
