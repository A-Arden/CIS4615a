/*
  Allison Arden
  10. Rule 13. Input Output (FIO)
  FIO10-J. Ensure the array is filled when using read() to fill an array
  compliant code
*/

public static String readBytes(InputStream in) throws IOException {
  int offset = 0;
  int bytesRead = 0;
  byte[] data = new byte[1024];
  while((bytesRead = in.read(data, offset, data.length - offset)) != -1){
  offset += bytesRead;
  if (offset >= data.length) {
  break;
  }
  }
  String str = new String(data, 0, offset, "UTF-8");
  return str;
}
