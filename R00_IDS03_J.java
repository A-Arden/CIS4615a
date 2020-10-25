/*
  Allison Arden
  1. Rule 00. Input Validation and Data Sanitization (IDS)
  IDS03-J. Do not log unsanitized user input 
  non-compliant code
*/
if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}
