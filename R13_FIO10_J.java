/*
  Allison Arden
  10. Rule 13. Input Output (FIO)
  FIO10-J. Ensure the array is filled when using read() to fill an array
  non-compliant code
*/

public static String readBytes(InputStream in) throws IOException {
  byte[] data = new byte[1024];
  if (in.read(data) == -1) {
    throw new EOFException();
  }
  return new String(data, "UTF-8");
}
