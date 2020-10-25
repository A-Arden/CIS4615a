
//Correct the code as shown in the Compliant Solution below:




if(loginSuccessful){
logger.severe(”User login succeeded for: ” + sanitizeUser(username));
}
else{
logger.severe(”User login failed for: ” + sanitizeUser(username));
}

public String sanitizeUser(Stringusername){
return Pattern.matches(”[A−Za−z0−9]+”,username))
? username : ”unauthorized user”;
}
