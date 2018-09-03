public class methods{

public String getTalk(Object ob){
String tipo=ob.getClass().getSimpleName();
String sms="";
if(tipo=="animal"||tipo=="cachorro"){
sms="vc é um obj do tipo animal";
}
else{
sms="vc é um obj do tipo pessoa";
}return sms;
}
}
